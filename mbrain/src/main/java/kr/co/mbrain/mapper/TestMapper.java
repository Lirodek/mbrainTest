package kr.co.mbrain.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.co.mbrain.vo.DataVo;

@Mapper
public interface TestMapper {
    List<DataVo> selectUserList();
}
