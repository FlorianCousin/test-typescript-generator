package annotation;

import org.jetbrains.annotations.NonNls;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.CLASS)
@Target({
  ElementType.METHOD,
  ElementType.FIELD,
  ElementType.PARAMETER,
  ElementType.LOCAL_VARIABLE,
  ElementType.TYPE_USE
})
public @interface MyNullable {

  @NonNls
  String value() default "";
}
