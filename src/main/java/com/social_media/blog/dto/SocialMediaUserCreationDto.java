package com.social_media.blog.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Getter
@Setter
public class SocialMediaUserCreationDto {

    @NotNull
    public String username;

    @NotNull
    public String email;

    @NotNull
    public String password;

    @JsonIgnore
    private LocalDateTime createdAt;

}
