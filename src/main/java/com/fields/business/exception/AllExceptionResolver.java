/**
 * 
 */
package com.fields.business.exception;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import com.fields.business.constant.ExceptionConst;

/**
 * @author bbx高
 * @Description: 全局异常处理器
 * @ClassName: 全局异常处理器
 * @CreateDate: 2018/11/08 11:00
 * @UpdateDate: 2018/11/08 11:00
 */
public class AllExceptionResolver implements HandlerExceptionResolver {

	private static Logger logger = LogManager.getLogger(AllExceptionResolver.class.getName());

	// 前端控制器DispatcherServlet在进行HandlerMapping、调用HandlerAdapter执行Handler过程中，如果遇到异常就会执行此方法
	// handler最终要执行的Handler，它的真实身份是HandlerMethod
	// Exception ex就是接收到异常信息
	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		PracticeException meetingRoomOrderException = null;
		// 输出错误Json
		ModelAndView mav = new ModelAndView();
		MappingJackson2JsonView view = new MappingJackson2JsonView();
		Map<String, Object> result = new HashMap<String, Object>();
		// 如果ex是系统 自定义的异常，直接取出异常信息
		if (ex instanceof PracticeException) {
			meetingRoomOrderException = (PracticeException) ex;
		} else {
			// 针对非MeetingRoomOrderException异常，对这类重新构造成一个MeetingRoomOrderException，异常信息为“系统错误”
			meetingRoomOrderException = new PracticeException(ExceptionConst.SYSTEM_ERROR);
			logger.error("错误信息:" + ex);
			result.put("Code", 1002);
			result.put("Message", "系统错误，请重新尝试！");
			view.setAttributesMap(result);
			response.setStatus(999);
			mav.setView(view);
			return mav;
		}
		String errCodeMsg = meetingRoomOrderException.getMessage();
		int index = errCodeMsg.indexOf(",");
		int index2 = errCodeMsg.indexOf(";");
		// 错误编码
		String errCode = errCodeMsg.substring(0, index);
		// 错误信息
		String errMsg = errCodeMsg.substring(index + 1, index2);
		// 错误类型
		String errType = errCodeMsg.substring(index2 + 1);
		if (errType.equals("warn")) {
			logger.warn("warnPosition:" + meetingRoomOrderException.getStackTrace()[0].getFileName() + ","
					+ meetingRoomOrderException.getStackTrace()[0].getLineNumber());
		} else if (errType.equals("error")) {
			logger.error("errorPosition:" + meetingRoomOrderException.getStackTrace()[0].getFileName() + ","
					+ meetingRoomOrderException.getStackTrace()[0].getLineNumber());
		}
		result.put("Code", errCode);
		result.put("Message", errMsg);
//		result.put("Data", "6666");
		view.setAttributesMap(result);
		response.setStatus(999);
		mav.setView(view);
		return mav;
	}
}
//    @Override
//    public ModelAndView resolveException(HttpServletRequest request,
//            HttpServletResponse response, Object handler, Exception ex) {
//        //输出异常
//        ex.printStackTrace();
//        
//        //统一异常处理代码
//        //针对系统自定义的CustomException异常，就可以直接从异常类中获取异常信息，将异常处理在错误页面展示
//        //异常信息
//        String message = null;
//        CustomException customException = null;
//        //如果ex是系统 自定义的异常，直接取出异常信息
//        if(ex instanceof CustomException){
//            customException = (CustomException)ex;
//        }else{
//            //针对非CustomException异常，对这类重新构造成一个CustomException，异常信息为“未知错误”
//            customException = new CustomException("未知错误");
//        }
//
//        //错误 信息
//        message = customException.getMessage();
//        
//        request.setAttribute("message", message);
//
//        
////        try {
////            //转向到错误 页面
////            request.getRequestDispatcher("/WEB-INF/jsp/error.jsp").forward(request, response);
////        } catch (ServletException e) {
////            // TODO Auto-generated catch block
////            e.printStackTrace();
////        } catch (IOException e) {
////            // TODO Auto-generated catch block
////            e.printStackTrace();
////        }
//        
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("error");
//        return modelAndView;
//    }
//}
