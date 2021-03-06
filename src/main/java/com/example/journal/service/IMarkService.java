package com.example.journal.service;

import com.example.journal.model.PageCell;
import com.example.journal.model.Reason;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public interface IMarkService {

    void setMark(Integer mark, Long pupilId, Date date, Long pageId);

    void setMark(Reason reason, Long pupilId, Date date, Long pageId);

    PageCell getMark(Long pupilId, Date date, Long pageId);

    void updateMark(Integer mark, Reason reason, Long pageCellId);

    void deleteMark(Long pageCell);
}
