package dtos;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.Nullable;

import java.util.Set;

@Getter
@RequiredArgsConstructor
public class MyDto {

  private final boolean myBoolean;
  private final @Nullable Integer myInt;
  private final Set<@Nullable String> myStrings;
}
