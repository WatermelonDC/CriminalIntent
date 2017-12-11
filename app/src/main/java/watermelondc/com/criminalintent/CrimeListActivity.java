package watermelondc.com.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Дмитрий on 09.12.2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    protected Fragment createFragment(){
        return new CrimeListFragment();
    }
}
