package com.p2082ss.android.ugc.aweme.base.p2379ui;

import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;

/* renamed from: com.ss.android.ugc.aweme.base.ui.b */
public abstract class AbstractC34681b extends PagerAdapter {

    /* renamed from: a */
    protected final AbstractC0952i f81936a;

    /* renamed from: b */
    protected AbstractC0976n f81937b;

    /* renamed from: c */
    private Fragment f81938c;

    /* renamed from: d */
    private SparseArray<String> f81939d = new SparseArray<>();

    static {
        Covode.recordClassIndex(41668);
    }

    /* renamed from: a */
    public abstract Fragment mo61341a(int i);

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

    public AbstractC34681b(AbstractC0952i iVar) {
        this.f81936a = iVar;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(ViewGroup viewGroup) {
        AbstractC0976n nVar = this.f81937b;
        if (nVar != null) {
            try {
                nVar.mo3473c();
                this.f81937b = null;
                this.f81936a.mo3560b();
            } catch (IllegalStateException e) {
                C51423a.m95784a(6, "FragmentPagerAdapter", "finishUpdate ->".concat(String.valueOf(e)));
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

    /* renamed from: a */
    private static String m70845a(int i, int i2) {
        return "android:switcher:" + i + ":" + String.valueOf((long) i2);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (this.f81937b == null) {
            this.f81937b = this.f81936a.mo3552a();
        }
        String a = m70845a(viewGroup.getId(), i);
        Fragment a2 = this.f81936a.mo3551a(a);
        if (a2 != null) {
            this.f81937b.mo3477e(a2);
        } else {
            a2 = mo61341a(i);
            if (a2 == this.f81938c) {
                this.f81937b.mo3454a(viewGroup.getId(), a2, a);
                this.f81939d.put(i, a);
            }
        }
        if (a2 != this.f81938c) {
            a2.setMenuVisibility(false);
            a2.setUserVisibleHint(false);
        }
        return a2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (this.f81937b == null) {
            this.f81937b = this.f81936a.mo3552a();
        }
        this.f81937b.mo3475d((Fragment) obj);
        this.f81939d.remove(i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (fragment != this.f81938c) {
            boolean isEmpty = TextUtils.isEmpty(fragment.getTag());
            boolean z = !TextUtils.equals(fragment.getTag(), this.f81939d.get(i, ""));
            if (isEmpty || z) {
                String a = m70845a(viewGroup.getId(), i);
                if (this.f81937b == null) {
                    this.f81937b = this.f81936a.mo3552a();
                }
                Fragment a2 = this.f81936a.mo3551a(a);
                if (a2 != null) {
                    this.f81937b.mo3474c(a2);
                } else {
                    this.f81937b.mo3454a(viewGroup.getId(), fragment, a);
                }
                this.f81939d.put(i, a);
            }
            Fragment fragment2 = this.f81938c;
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                this.f81938c.setUserVisibleHint(false);
            }
            fragment.setMenuVisibility(true);
            fragment.setUserVisibleHint(true);
            this.f81938c = fragment;
        }
    }
}
