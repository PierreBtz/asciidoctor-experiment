import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Sample {

	public abstract String string();
	public abstract int int();

  // tag::construction[]
	public static Sample create(String string, int i) {
		return new AutoValue_Sample(string, i);
	}
  // end::construction[]
}
