package com.gestorfinaceiro.models.dto;

import com.sun.istack.NotNull;
import lombok.Data;
import org.springframework.lang.Nullable;

@Data
public class EmailDTO {

    @NotNull
    private byte id_Email;

    @NotNull
    private String email;

    @Nullable
    private String email2;

}
