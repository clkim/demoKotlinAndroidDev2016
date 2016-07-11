package net.gouline.dagger2demo.activity;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.support.v7.widget.RecyclerView;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import net.gouline.dagger2demo.R;
import net.gouline.dagger2demo.rest.ITunesService;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Mostly following:
 *  https://developer.android.com/training/testing/start/index.html
 *  https://developer.android.com/topic/libraries/testing-support-library/index.html#AndroidJUnitRunner
 *  https://developer.android.com/training/testing/unit-testing/instrumented-unit-tests.html#build
 *
 * Created by clkim on 10/19/15, updated 06/11/16
 */
@RunWith(AndroidJUnit4.class)
public class AlbumSearchActivityTest extends ActivityInstrumentationTestCase2<AlbumSearchActivity> {
    private AlbumSearchActivity albumSearchActivity;
    private RecyclerView recyclerView;
    private TextView emptyView;
    private ITunesService mITunesService;

    public AlbumSearchActivityTest() {
        super(AlbumSearchActivity.class);
    }

    @Before
    public void setUp() throws Exception {
        super.setUp();
        // Injecting the Instrumentation instance is required
        // for your test to run with AndroidJUnitRunner.
        injectInstrumentation(InstrumentationRegistry.getInstrumentation());

        albumSearchActivity = getActivity();
        recyclerView = (RecyclerView) albumSearchActivity.findViewById(R.id.recycler_view);
        emptyView = (TextView) albumSearchActivity.findViewById(R.id.empty_view);

        // accessing a Kotlin property in Activity class
        //  exposed because it is a late-initialized property
        mITunesService = albumSearchActivity.getMITunesService();
    }

    @Test
    public void testPreConditions() {
        assertNotNull(albumSearchActivity);
        assertNotNull(recyclerView);
        assertNotNull(emptyView);
    }

    @Test
    public void testITuneServiceIsInjected() {
        // test for successful Dagger 2 injection in the Activity class
        assertNotNull(mITunesService);
    }

    @Test
    public void testEmptyTextView_labelText() {
        String expected = albumSearchActivity.getString(R.string.search_empty);
        String actual = emptyView.getText().toString();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        super.tearDown();
    }
}
