package com.example.journal.model;

import javax.persistence.*;

@Table(name = "page_cell")
@Entity
public class PageCell {

    private Long id;

    private Integer mark;

    private Reason reason;

    private Pupil pupil;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "mark")
    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    @Enumerated(value = EnumType.STRING)
    @Column(name = "reason")
    public Reason getReason() {
        return reason;
    }

    public void setReason(Reason reason) {
        this.reason = reason;
    }

    @ManyToOne
    public Pupil getPupil() {
        return pupil;
    }

    public void setPupil(Pupil pupil) {
        this.pupil = pupil;
    }
}
