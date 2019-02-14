package com.eteam.web03.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.eteam.web03.vo.Sample;

@Mapper
public interface SampleMapper {
	//insert 메서드
	void insertSample(Sample sample);
	//리스트 처리하는 select 메서드
	List<Sample> selectSampleList();
	//delete 메서드
	void deleteSample(Sample sample);
	//update 화면처리 메서드
	Sample selectSampleOne(Sample sample);
	//update 메서드
	void updateSample(Sample sample);
	
}
