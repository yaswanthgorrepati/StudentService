package com.yaswanth.StudentService.entity;


import com.yaswanth.StudentService.enums.ClassName;
import com.yaswanth.StudentService.enums.Section;

import javax.persistence.*;

@Entity
@Table(name = "STUDENT")
@NamedQueries({@NamedQuery(name = "fetchStudentById", query = "SELECT s FROM Student s WHERE s.id =:studentId")})
public class Student {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "class_name")
    @Enumerated(EnumType.STRING)
    private ClassName className;

    @Column(name = "section")
    @Enumerated(EnumType.STRING)
    private Section section;

    public Student() {
    }

    public Student(String name, ClassName className, Section section) {
        this.name = name;
        this.className = className;
        this.section = section;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClassName getClassName() {
        return className;
    }

    public void setClassName(ClassName className) {
        this.className = className;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }
}
