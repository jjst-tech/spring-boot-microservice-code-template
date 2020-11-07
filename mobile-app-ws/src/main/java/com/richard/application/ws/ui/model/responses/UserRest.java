/**
 * Nickname: Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 */
package com.richard.application.ws.ui.model.responses;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/**
 * @author richard
 */
@Getter
@Setter
public class UserRest implements Serializable {
  
  /** serialVersionUID */
  private static final long serialVersionUID = 1L;
  
  /** First Name */
  private String firstName;
  
  /** Last Name */
  private String lastName;
  
  /** Email */
  private String email;
  
  /** User Id */
  private String UserId;
  
}