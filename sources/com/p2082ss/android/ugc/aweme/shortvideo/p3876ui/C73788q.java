package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.util.Objects;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.q */
public final class C73788q extends PagerAdapter {

    /* renamed from: a */
    static Field f165655a;

    /* renamed from: b */
    PagerAdapter f165656b;

    /* renamed from: c */
    public boolean f165657c = true;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getItemPosition(Object obj) {
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void notifyDataSetChanged() {
        this.f165656b.notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Parcelable saveState() {
        return this.f165656b.saveState();
    }

    static {
        Covode.recordClassIndex(86527);
        try {
            Field declaredField = PagerAdapter.class.getDeclaredField("mViewPagerObserver");
            f165655a = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private void m129847a() {
        try {
            Object obj = f165655a.get(this);
            Object obj2 = f165655a.get(this.f165656b);
            if (obj == null && obj2 != null) {
                f165655a.set(this.f165656b, null);
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        try {
            f165655a.set(this.f165656b, f165655a.get(this));
            if (!this.f165657c || this.f165656b.getCount() == 1) {
                return this.f165656b.getCount();
            }
            return Integer.MAX_VALUE;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void finishUpdate(View view) {
        this.f165656b.finishUpdate(view);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i) {
        return this.f165656b.getPageTitle(i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final float getPageWidth(int i) {
        return this.f165656b.getPageWidth(i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.f165656b.registerDataSetObserver(dataSetObserver);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.f165656b.unregisterDataSetObserver(dataSetObserver);
    }

    public C73788q(PagerAdapter pagerAdapter) {
        Objects.requireNonNull(pagerAdapter);
        this.f165656b = pagerAdapter;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void finishUpdate(ViewGroup viewGroup) {
        this.f165656b.finishUpdate(viewGroup);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void startUpdate(View view) {
        m129847a();
        this.f165656b.startUpdate(view);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void startUpdate(ViewGroup viewGroup) {
        m129847a();
        this.f165656b.startUpdate(viewGroup);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        return this.f165656b.isViewFromObject(view, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        this.f165656b.restoreState(parcelable, classLoader);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object instantiateItem(View view, int i) {
        int count = this.f165656b.getCount();
        if (count == 0) {
            return null;
        }
        return this.f165656b.instantiateItem(view, i % count);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        int count = this.f165656b.getCount();
        if (count == 0) {
            return null;
        }
        return this.f165656b.instantiateItem(viewGroup, i % count);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void setPrimaryItem(View view, int i, Object obj) {
        this.f165656b.setPrimaryItem(view, i, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(View view, int i, Object obj) {
        int count = this.f165656b.getCount();
        if (count != 0) {
            this.f165656b.destroyItem(view, i / count, obj);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        this.f165656b.setPrimaryItem(viewGroup, i, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        int count = this.f165656b.getCount();
        if (count != 0) {
            this.f165656b.destroyItem(viewGroup, i / count, obj);
        }
    }
}
