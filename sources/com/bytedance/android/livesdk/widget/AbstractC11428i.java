package com.bytedance.android.livesdk.widget;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.widget.i */
public abstract class AbstractC11428i extends PagerAdapter {

    /* renamed from: a */
    private final AbstractC0952i f27396a;

    /* renamed from: b */
    private AbstractC0976n f27397b;

    /* renamed from: c */
    private Fragment f27398c;

    static {
        Covode.recordClassIndex(13084);
    }

    /* renamed from: a */
    public abstract Fragment mo15383a(int i);

    @Override // androidx.viewpager.widget.PagerAdapter
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Parcelable saveState() {
        return null;
    }

    public AbstractC11428i(AbstractC0952i iVar) {
        this.f27396a = iVar;
    }

    /* renamed from: c */
    public String mo15386c(int i) {
        return String.valueOf(i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(ViewGroup viewGroup) {
        AbstractC0976n nVar = this.f27397b;
        if (nVar != null) {
            try {
                nVar.mo3478e();
                this.f27396a.mo3560b();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (NullPointerException e2) {
                e2.printStackTrace();
            } finally {
                this.f27397b = null;
            }
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void startUpdate(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        if (((Fragment) obj).getView() == view) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static String m20243a(int i, String str) {
        return "android:switcher:" + i + ":" + str;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (this.f27397b == null) {
            this.f27397b = this.f27396a.mo3552a();
        }
        String c = mo15386c(i);
        Fragment a = this.f27396a.mo3551a(m20243a(viewGroup.getId(), c));
        if (a != null) {
            this.f27397b.mo3477e(a);
        } else {
            a = mo15383a(i);
            this.f27397b.mo3454a(viewGroup.getId(), a, m20243a(viewGroup.getId(), c));
        }
        if (a != this.f27398c) {
            a.setMenuVisibility(false);
            a.setUserVisibleHint(false);
        }
        return a;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (this.f27397b == null) {
            this.f27397b = this.f27396a.mo3552a();
        }
        this.f27397b.mo3455a((Fragment) obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f27398c;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                this.f27398c.setUserVisibleHint(false);
            }
            if (fragment != null) {
                fragment.setMenuVisibility(true);
                fragment.setUserVisibleHint(true);
            }
            this.f27398c = fragment;
        }
    }
}
