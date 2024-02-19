package kr.co.mbrain.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.mbrain.mapper.TestMapper;
import kr.co.mbrain.vo.DataVo;

@Service
public interface TestService {


    public List<DataVo> findAll();
}
