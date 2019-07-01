package com.example.savename.service;

import com.example.savename.bean.SaveName;
import com.example.savename.mapper.SaveNameMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 作者：王怀朋
 * 日期：2019/6/27
 */
@Service
public class SaveNameService {
    @Autowired
    private SaveNameMapper saveNameMapper;

    public int insetSaveName(SaveName saveName){
        return saveNameMapper.insetSaveName(saveName);
    }
    public List<SaveName> getAllSaveName(){
        return saveNameMapper.getAllSaveName();
    }
    public SaveName getSaveNameById(Integer id){
        return saveNameMapper.getSaveNameById(id);
    }
    public int delSaveNameById(Integer id){
        return saveNameMapper.delSaveNameById(id);
    }
}
