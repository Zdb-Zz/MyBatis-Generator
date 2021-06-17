package org.zdb.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zdb.entity.ElectricAuto;
import org.zdb.entity.ElectricAutoExample;

public interface ElectricAutoMapper {
    /**
     *  根据指定的条件获取数据库记录数,electric_auto
     *
     * @param example
     */
    int countByExample(ElectricAutoExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,electric_auto
     *
     * @param example
     */
    int deleteByExample(ElectricAutoExample example);

    /**
     *  根据主键删除数据库的记录,electric_auto
     *
     * @param eaId
     */
    int deleteByPrimaryKey(Long eaId);

    /**
     *  新写入数据库记录,electric_auto
     *
     * @param record
     */
    int insert(ElectricAuto record);

    /**
     *  动态字段,写入数据库记录,electric_auto
     *
     * @param record
     */
    int insertSelective(ElectricAuto record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,electric_auto
     *
     * @param example
     */
    List<ElectricAuto> selectByExample(ElectricAutoExample example);

    /**
     *  根据指定主键获取一条数据库记录,electric_auto
     *
     * @param eaId
     */
    ElectricAuto selectByPrimaryKey(Long eaId);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,electric_auto
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") ElectricAuto record, @Param("example") ElectricAutoExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,electric_auto
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") ElectricAuto record, @Param("example") ElectricAutoExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,electric_auto
     *
     * @param record
     */
    int updateByPrimaryKeySelective(ElectricAuto record);

    /**
     *  根据主键来更新符合条件的数据库记录,electric_auto
     *
     * @param record
     */
    int updateByPrimaryKey(ElectricAuto record);
}