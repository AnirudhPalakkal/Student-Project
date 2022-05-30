package com.mycompany.studentproject;

/**
 *
 * @author aniru
 */
public class Student {
    String name;
    private String id;
    
    Student(String name) {
        this.name = name;
    }
    
    String getName() {
        return this.name;
    }
    
    void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
