package com.xyp.community.dao;
import com.xyp.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface DiscussPostMapper {
    List<DiscussPost> selectDiscussPosts(int userId,int offset,int limit);
    //Param注解用于给参数起别名
    //如果只有一个参数，并且在<if>里使用，则必须加Param注解
    int selectDiscussPostRows(@Param("userId") int userId);
}
