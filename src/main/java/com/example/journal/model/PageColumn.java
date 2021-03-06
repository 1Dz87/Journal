package com.example.journal.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "page_column")
public class PageColumn {

    private Long id;

    private Date columnDate;

    private List<PageCell> pageCells;

    private Page page;

    private Teacher teacher;

    public PageColumn(Page page, Date date, Teacher teacher) {
        this.columnDate = date;
        this.page = page;
        this.teacher = teacher;
        this.pageCells = new ArrayList<>();
        page.getPupils().forEach(p -> {
            PageCell cell = new PageCell();
            cell.setReason(Reason.VISITED);
            this.pageCells.add(cell);
        });
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Temporal(value = TemporalType.DATE)
    @Column(name = "date")
    public Date getColumnDate() {
        return columnDate;
    }

    public void setColumnDate(Date columnDate) {
        this.columnDate = columnDate;
    }

    @OneToMany
    public List<PageCell> getPageCells() {
        return pageCells;
    }

    public void setPageCells(List<PageCell> pageCells) {
        this.pageCells = pageCells;
    }

    @ManyToOne
    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    @ManyToOne
    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
