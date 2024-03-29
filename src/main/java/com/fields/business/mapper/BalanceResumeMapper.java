package com.fields.business.mapper;

import com.fields.business.object.BalanceResume;
import com.fields.business.object.BalanceResumeExample;
import com.fields.business.object.BalanceResumeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BalanceResumeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table balance_resume
     *
     * @mbg.generated
     */
    long countByExample(BalanceResumeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table balance_resume
     *
     * @mbg.generated
     */
    int deleteByExample(BalanceResumeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table balance_resume
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(BalanceResumeKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table balance_resume
     *
     * @mbg.generated
     */
    int insert(BalanceResume record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table balance_resume
     *
     * @mbg.generated
     */
    int insertSelective(BalanceResume record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table balance_resume
     *
     * @mbg.generated
     */
    List<BalanceResume> selectByExample(BalanceResumeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table balance_resume
     *
     * @mbg.generated
     */
    BalanceResume selectByPrimaryKey(BalanceResumeKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table balance_resume
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") BalanceResume record, @Param("example") BalanceResumeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table balance_resume
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") BalanceResume record, @Param("example") BalanceResumeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table balance_resume
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(BalanceResume record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table balance_resume
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(BalanceResume record);
}