package com.company.librarymgmt.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "BOOK_ISSUE", indexes = {
        @Index(name = "IDX_BOOKISSUE_MANAGER_ID", columnList = "")
})
@Entity
public class BookIssue {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "ISSUE_DATE", nullable = false)
    private LocalDate issueDate;

    @Column(name = "DURATION")
    private Long duration;


    @InstanceName
    @JoinColumn(name = "MANAGER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Member manager;

    @Composition
    @OneToMany(mappedBy = "bookIssue")
    private List<Book> book;

    @DependsOnProperties({"issueDate", "duration"})
    @Transient
    @JmixProperty
    public LocalDate getEndDate() {
        return(issueDate != null && duration != null) ? issueDate.plusMonths(duration) : null;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public List<Book> getBook() {
        return book;
    }


    public Member getManager() {
        return manager;
    }

    public void setManager(Member manager) {
        this.manager = manager;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public UUID getId() {
        return id;
    }


    public void setId(UUID id) {
        this.id = id;
    }



//    @Transient
//    public LocalDate getEndDate() {
//        return(issueDate != null && duration != null) ? issueDate.plusMonths(duration) : null;
//    }
}