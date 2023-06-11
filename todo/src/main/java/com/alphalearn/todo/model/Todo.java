package com.alphalearn.todo.model;

import jakarta.persistence.*;

/**
 * Author: Karthik
 * Date: 6/11/2023
 * Time: 11:17 AM
 */

@Entity
@Table(name = "todo")
@NamedQuery(name = "fetch_all_todos", query = "select t from Todo t")
public class Todo {

    @Id
    @Column(name = "todo_id")
    private Integer id;

    @Column(name = "todo_subject")
    private String subject;


    public Todo() { }

    public Todo(String subject) {
        this.subject = subject;
    }

    public Todo(Integer id, String subject) {
        this.id = id;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", subject='" + subject + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
