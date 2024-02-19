package kr.co.mbrain.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * StudyDao
 */
@Mapper
public interface StudyDao {

    public List<Map<String, String>> doStudyList();
}