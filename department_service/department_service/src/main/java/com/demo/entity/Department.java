package com.demo.entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "departments")

public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String name;

    private String location;

    public Department() {

    }

    public Department(Long id, String name, String location) {

        this.id = id;
        this.name = name;
        this.location = location;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getLocation() {

        return location;
    }

    public void setLocation(String location) {

        this.location = location;
    }

    @Override
    public String toString() {

        return "Department [id=" + id
                + ", name=" + name
                + ", location=" + location + "]";
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, location);
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        Department other = (Department) obj;

        return Objects.equals(id, other.id)
                && Objects.equals(name, other.name)
                && Objects.equals(location, other.location);
    }
}

