package mm.meetmeat.meetmeat;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by KS on 2015-05-26.
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    Fragment[] fragments = new Fragment[2];

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
        fragments[0] = new PigFragment();
        fragments[1] = new CowFragment();
    }

    @Override
    public Fragment getItem(int i) {
        return fragments[i];
    }

    @Override
    public int getCount() {
        return fragments.length;
    }
}
