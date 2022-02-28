package com.devsuperior.dspesquisa.dtos;

import java.io.Serializable;

public class RecordInsertDto implements Serializable {

    private String Name;
    private Integer age;
    private Long gameId;

    public RecordInsertDto() {

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }
}
