package com.example.schedule.repository;

import com.example.schedule.dto.ScheduleResponseDto;
import com.example.schedule.entity.Schedule;

import java.time.LocalDateTime;
import java.util.List;

public interface ScheduleRepository {
    ScheduleResponseDto saveSchedule(Schedule schedule);
    List<ScheduleResponseDto> findAllSchedules(String name, String modificationdate);
    Schedule findScheduleByIdOrElseThrow(Long id);
    int updateSchedule(Long id,String password, String name,String todo);
    int deleteSchedule(Long id, String password);
}
