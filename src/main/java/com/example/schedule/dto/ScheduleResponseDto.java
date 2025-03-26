package com.example.schedule.dto;

import com.example.schedule.entity.Schedule;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class ScheduleResponseDto {
    private Long id;
    private String name;
    private String todo;
    private LocalDateTime creationdate;
    private LocalDateTime modificationdate;

    public ScheduleResponseDto(Schedule schedule) {
        this.id=schedule.getId();
        this.name=schedule.getName();
        this.todo=schedule.getTodo();
        this.creationdate=schedule.getCreationdate();
        this.modificationdate=schedule.getModificationdate();
    }
}
