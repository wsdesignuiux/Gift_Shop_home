package adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import fragment.ViewPagerFragment_Shop_Home;

/**
 * Created by wolfsoft4 on 14/8/18.
 */

public class ViewPagerAdapter_Shop_Home extends FragmentStatePagerAdapter {
    public ViewPagerAdapter_Shop_Home(FragmentManager fm) {
        super(fm);

    }
        @Override
        public Fragment getItem ( int position){
            switch (position) {
                case 0:
                    ViewPagerFragment_Shop_Home tab1 = new ViewPagerFragment_Shop_Home();
                    return tab1;
                case 1:
                    ViewPagerFragment_Shop_Home tab2 = new ViewPagerFragment_Shop_Home();
                    return tab2;
                case 2:
                    ViewPagerFragment_Shop_Home tab3 = new ViewPagerFragment_Shop_Home();
                    return tab3;


                default:
                    return null;
            }

        }

        @Override
        public int getCount () {
            return 3;
        }
    }
