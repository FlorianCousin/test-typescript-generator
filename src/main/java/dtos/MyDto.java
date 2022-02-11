package dtos;

import annotation.MyNullable;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Set;

@Getter
@RequiredArgsConstructor
public class MyDto {

  private final boolean myBoolean;
  private final @MyNullable Integer myInt;
  private final Set<@MyNullable String> myStrings;
}
