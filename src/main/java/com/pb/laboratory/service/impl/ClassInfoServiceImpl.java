package com.pb.laboratory.service.impl;

import com.pb.laboratory.domain.dto.request.ClassInfoReqDTO;
import com.pb.laboratory.domain.dto.response.ClassInfoRespDTO;
import com.pb.laboratory.dao.mapper.ClassInfoMapper;
import com.pb.laboratory.domain.po.ClassInfo;
import com.pb.laboratory.service.ClassInfoService;

import com.pb.laboratory.uitls.BeanCopyUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;


/**
 * TODO description
 *
 * @author fukua
 * @date 2021/05/01
 * @since 1.0
 */
@Service
public class ClassInfoServiceImpl implements ClassInfoService {
    @Resource
    private ClassInfoMapper classInfoMapper;


    @Override
    public ClassInfoRespDTO save(ClassInfoReqDTO reqDTO) {
//TODO 请实现具体的业务逻辑
        return null;
    }


    @Override
    public void deleteById(Integer id) {
//TODO 请实现具体的业务逻辑
    }

    @Override
    public ClassInfoRespDTO update(ClassInfoReqDTO updateDTO) {
//TODO 请实现具体的业务逻辑
        return null;
    }

    @Override
    public ClassInfoRespDTO findById(Integer id) {
        ClassInfo classInfo = new ClassInfo();
        classInfo.setId(id);
        classInfo = classInfoMapper.selectOne(classInfo);
        return BeanCopyUtils.convert(classInfo, ClassInfoRespDTO.class);
    }

}
