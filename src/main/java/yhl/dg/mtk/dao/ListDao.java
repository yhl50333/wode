package yhl.dg.mtk.dao;

import org.apache.ibatis.annotations.*;
import yhl.dg.mtk.pojo.Activity;

import java.util.List;

@Mapper
public interface ListDao {
    @Select("select * from tb_activity order by createdTime desc")
    List<Activity> findAll();

    @Delete("delete from tb_activity where id = #{id} ")
    int deleteById(int id);


    Activity findById(int id);
  //
  //@Update("update tb_activity set title=#{title},category=#{category},startTime=#{startTime},endTime=#{endTime},remark=#{remark}where id=#{id}")
    int updateActivity(Activity activity);

//    @Insert("insert into tb_activity values (#{title},#{category},#{startTime},#{endTime},#{state},#{remark},now(),#{createdUser})")
    int insertActivity(Activity activity);
}
