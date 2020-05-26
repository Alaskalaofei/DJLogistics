package com.csdj.djlogisticsserviceimpl;

import com.csdj.mapper.BlogMapper;
import com.csdj.pojo.blog;
import com.csdj.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogMapper mapper;

    @Override
    public List<blog> blogList() {
        return mapper.blogList();
    }
}
