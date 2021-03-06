package com.example.journal.service;

import com.example.journal.model.PageCell;
import com.example.journal.model.Reason;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@Qualifier("fiveMarkService")
public class FiveMarkService implements IMarkService {
    @Override
    public void setMark(Integer mark, Long pupilId, Date date, Long pageId) {

    }

    @Override
    public void setMark(Reason reason, Long pupilId, Date date, Long pageId) {

    }

    @Override
    public PageCell getMark(Long pupilId, Date date, Long pageId) {
        return null;
    }

    @Override
    public void updateMark(Integer mark, Reason reason, Long pageCellId) {

    }

    @Override
    public void deleteMark(Long pageCell) {

    }
}
