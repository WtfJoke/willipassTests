package ch.willipass.gradecalculator.test;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import ch.willipass.gradecalculator.R;
import ch.willipass.gradecalculator.WillIPassMainActivity;

public class WillIPassMainActivityTest extends
		ActivityInstrumentationTestCase2<WillIPassMainActivity> {

	private WillIPassMainActivity activity;
	private Button addSubjectsButton;

	public WillIPassMainActivityTest() {
		super(WillIPassMainActivity.class);
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		activity = getActivity();
		addSubjectsButton = (Button) activity
				.findViewById(R.id.openAddSubjectsButtonId);
	}

	public void testPreconditions() {
		assertNotNull(activity);
		assertNotNull(addSubjectsButton);
	}

	public void testButtonAddSubjectsCaption_ShouldBeAddSubjects() {
		final String expected = activity.getString(R.string.add_subjects);
		final String actual = addSubjectsButton.getText().toString();
		assertEquals(expected, actual);
	}
}
