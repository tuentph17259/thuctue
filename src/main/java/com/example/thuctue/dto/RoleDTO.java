package com.example.thuctue.dto;

import java.util.ArrayList;
import java.util.List;

public class RoleDTO extends AbstractDTO<RoleDTO> {
    private String code;
    private String name;
    private List<UserDTO> users = new ArrayList<>();
}
