package kr.co.tlstjd.board.bean;

import java.util.Date;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

import lombok.ToString;

@Getter
@Setter
@ToString
@Entity

public class Board {
    @Id
    @GeneratedValue
    private Long seq;

    private String title;

    @Column(updatable = false)
    private String writer;

    private String content;

    @Column(insertable = false, updatable = false, columnDefinition = "date default sysdate")
    private Date createDate;

    @Column(insertable = false, updatable = false, columnDefinition = "number default 0")
    private Long cnt;
}
