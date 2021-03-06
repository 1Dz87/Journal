package com.example.journal.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "page")
public class Page {

    private Long id;

    private Set<Pupil> pupils;

    private Set <PageColumn> pageColumns;

    private String discipline;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @OneToMany
    public Set<Pupil> getPupils() {
        return pupils;
    }

    public void setPupils(Set<Pupil> pupils) {
        this.pupils = pupils;
    }

    @OneToMany
    public Set<PageColumn> getPageColumns() {
        return pageColumns;
    }

    public void setPageColumns(Set<PageColumn> pageColumns) {
        this.pageColumns = pageColumns;
    }

    @Column(name = "discipline")
    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }
}
