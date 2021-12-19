package com.bytedance.ies.uikit.p1284f;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.ies.uikit.f.b */
public abstract class AbstractC18273b extends PagerAdapter {

    /* renamed from: a */
    protected final AbstractC0952i f43618a;

    /* renamed from: b */
    protected AbstractC0976n f43619b;

    /* renamed from: c */
    private Fragment f43620c;

    static {
        Covode.recordClassIndex(20933);
    }

    /* renamed from: a */
    public abstract Fragment mo29162a(int i);

    /* renamed from: b */
    public long mo29163b(int i) {
        return (long) i;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Parcelable saveState() {
        return null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void startUpdate(ViewGroup viewGroup) {
    }

    public AbstractC18273b(AbstractC0952i iVar) {
        this.f43618a = iVar;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(ViewGroup viewGroup) {
        AbstractC0976n nVar = this.f43619b;
        if (nVar != null) {
            try {
                nVar.mo3473c();
                this.f43619b = null;
                this.f43618a.mo3560b();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        if (((Fragment) obj).getView() == view) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (this.f43619b == null) {
            this.f43619b = this.f43618a.mo3552a();
        }
        mo29163b(i);
        String str = "android:switcher:" + viewGroup.getId() + ":" + String.valueOf(mo29163b(i));
        Fragment a = this.f43618a.mo3551a(str);
        if (a != null) {
            this.f43619b.mo3477e(a);
        } else {
            a = mo29162a(i);
            this.f43619b.mo3454a(viewGroup.getId(), a, str);
        }
        if (a != this.f43620c) {
            a.setMenuVisibility(false);
            a.setUserVisibleHint(false);
        }
        return a;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (this.f43619b == null) {
            this.f43619b = this.f43618a.mo3552a();
        }
        this.f43619b.mo3475d((Fragment) obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f43620c;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                this.f43620c.setUserVisibleHint(false);
            }
            if (fragment != null) {
                fragment.setMenuVisibility(true);
                fragment.setUserVisibleHint(true);
            }
            this.f43620c = fragment;
        }
    }
}
