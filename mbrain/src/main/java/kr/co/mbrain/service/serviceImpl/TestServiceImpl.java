package kr.co.mbrain.service.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.annotation.Resource;
import kr.co.mbrain.mapper.TestMapper;
import kr.co.mbrain.service.TestService;
import kr.co.mbrain.vo.DataVo;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service("testService")
public class TestServiceImpl implements TestService{

    @Resource(name = "testMapper")
    private TestMapper testMapper;

    @Override
    public List<DataVo> findAll() {
        List<DataVo> result = testMapper.selectUserList();
        result.forEach(System.out::println);

        return result;
    }
    
}
