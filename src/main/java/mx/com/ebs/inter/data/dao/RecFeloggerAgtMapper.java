package mx.com.ebs.inter.data.dao;

import java.util.List;
import mx.com.ebs.inter.data.model.RecFeloggerAgt;
import mx.com.ebs.inter.data.model.RecFeloggerAgtExample;
import org.apache.ibatis.annotations.Param;

public interface RecFeloggerAgtMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FACTURADOR.REC_FELOGGER_AGT
     *
     * @mbggenerated Thu Apr 23 01:38:48 CDT 2015
     */
    int countByExample(RecFeloggerAgtExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FACTURADOR.REC_FELOGGER_AGT
     *
     * @mbggenerated Thu Apr 23 01:38:48 CDT 2015
     */
    int deleteByExample(RecFeloggerAgtExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FACTURADOR.REC_FELOGGER_AGT
     *
     * @mbggenerated Thu Apr 23 01:38:48 CDT 2015
     */
    int insert(RecFeloggerAgt record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FACTURADOR.REC_FELOGGER_AGT
     *
     * @mbggenerated Thu Apr 23 01:38:48 CDT 2015
     */
    int insertSelective(RecFeloggerAgt record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FACTURADOR.REC_FELOGGER_AGT
     *
     * @mbggenerated Thu Apr 23 01:38:48 CDT 2015
     */
    List<RecFeloggerAgt> selectByExample(RecFeloggerAgtExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FACTURADOR.REC_FELOGGER_AGT
     *
     * @mbggenerated Thu Apr 23 01:38:48 CDT 2015
     */
    int updateByExampleSelective(@Param("record") RecFeloggerAgt record, @Param("example") RecFeloggerAgtExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FACTURADOR.REC_FELOGGER_AGT
     *
     * @mbggenerated Thu Apr 23 01:38:48 CDT 2015
     */
    int updateByExample(@Param("record") RecFeloggerAgt record, @Param("example") RecFeloggerAgtExample example);
}