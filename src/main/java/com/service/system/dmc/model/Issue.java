package com.service.system.dmc.model;

import java.io.Serializable;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Issue implements Serializable {

  private int number;

  // 利用してない変数として指摘される
  private String type;

  // 利用してない変数として指摘される
  private String category;

  // 利用してない変数として指摘される
  private String comment;
}
