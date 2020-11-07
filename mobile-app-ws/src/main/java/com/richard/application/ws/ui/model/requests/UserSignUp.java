/**
 * Nickname: Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 */
package com.richard.application.ws.ui.model.requests;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

/**
 * @author richard
 */
@Getter
@Setter
public class UserSignUp implements Serializable {
  
  /** serialVersionUID */
  private static final long serialVersionUID = 1L;
  
  /** firstName */
  @NotNull(message="First name cannot be missing or empty")
  @Size(min=2, message="Last name must not be less than 2 characters")
  private String firstName;
  
  /** lastName */
  @NotNull(message="Last name cannot be missing or empty")
  @Size(min=2, message="Last name must not be less than 2 characters")
  private String lastName;
  
  /** Password */
  @NotNull(message="Password is a required field")
  @Size(min=8, max=16, message="Password must be equal to or greater than 8 characters and less than 16 characters")
  private String password;
  
  /** Age */
  private int age;
  
  /** Email */
  @Email
  private String email;
  
}
