package net.suryc.valid8me.demo.model;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Builder
@Entity(name = "CUSTOMER")
@AllArgsConstructor
public class Customer{

    @Id
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, unique = true, updatable = false, length = 100)
    private long ID;
    @Column(name = "FIRST_NAME", nullable = false, unique = false, length = 20)
    private String firstName;
    @Column(name = "LAST_NAME", nullable = false, unique = false, length = 30)
    private String lastName;
    @Column(name = "ADDRESS", nullable = false, unique = false, length = 100)
    private String address;
    @Column(name = "PHONE", nullable = false, unique = false, length = 20)
    private String phone;
    @Column(name = "BIRTHDATE", nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-mm-yyyy")
    private Date birthdate;
    @Column(name = "GOVT_ID", nullable = false)
    private String govtId;

    public Customer(){}
}