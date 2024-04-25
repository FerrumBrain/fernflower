package records;

public record TestRecordCompactConstructor<T>(T first, T... other) {
  @SafeVarargs
  public TestRecordCompactConstructor {
    java.util.Objects.requireNonNull(first);
  }
}