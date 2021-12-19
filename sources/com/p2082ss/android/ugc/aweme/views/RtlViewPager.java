package com.p2082ss.android.ugc.aweme.views;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p033d.AbstractC0653f;
import androidx.core.p033d.C0651e;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.views.RtlViewPager */
public class RtlViewPager extends ViewPager {

    /* renamed from: a */
    public boolean f181920a = true;

    /* renamed from: b */
    public boolean f181921b = true;

    /* renamed from: c */
    public boolean f181922c = false;

    /* renamed from: d */
    public View f181923d = null;

    /* renamed from: e */
    public boolean f181924e;

    /* renamed from: f */
    private int f181925f;

    /* renamed from: g */
    private HashMap<ViewPager.AbstractC1579e, C81415b> f181926g = new HashMap<>();

    static {
        Covode.recordClassIndex(94770);
    }

    /* renamed from: a */
    public final boolean mo125047a() {
        if (this.f181925f == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public PagerAdapter getAdapter() {
        C81434f fVar = (C81434f) super.getAdapter();
        if (fVar == null) {
            return null;
        }
        return fVar.f182011a;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f181925f, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.views.RtlViewPager$SavedState */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = C0651e.m2387a(new AbstractC0653f<SavedState>() {
            /* class com.p2082ss.android.ugc.aweme.views.RtlViewPager.SavedState.C814131 */

            static {
                Covode.recordClassIndex(94772);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // androidx.core.p033d.AbstractC0653f
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ SavedState[] mo2683a(int i) {
                return new SavedState[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // androidx.core.p033d.AbstractC0653f
            /* renamed from: a */
            public final /* synthetic */ SavedState mo2682a(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader, (byte) 0);
            }
        });

        /* renamed from: a */
        public final Parcelable f181927a;

        /* renamed from: b */
        public final int f181928b;

        public int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(94771);
        }

        private SavedState(Parcelable parcelable, int i) {
            this.f181927a = parcelable;
            this.f181928b = i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f181927a, i);
            parcel.writeInt(this.f181928b);
        }

        private SavedState(Parcel parcel, ClassLoader classLoader) {
            this.f181927a = parcel.readParcelable(classLoader == null ? getClass().getClassLoader() : classLoader);
            this.f181928b = parcel.readInt();
        }

        /* synthetic */ SavedState(Parcel parcel, ClassLoader classLoader, byte b) {
            this(parcel, classLoader);
        }

        /* synthetic */ SavedState(Parcelable parcelable, int i, byte b) {
            this(parcelable, i);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public int getCurrentItem() {
        int currentItem = super.getCurrentItem();
        PagerAdapter adapter = super.getAdapter();
        if (adapter == null || !mo125047a()) {
            return currentItem;
        }
        return (adapter.getCount() - currentItem) - 1;
    }

    public int getItemCount() {
        if (getAdapter() == null) {
            return 0;
        }
        return getAdapter().getCount();
    }

    public void setCheckScrollXWhenIdle(boolean z) {
        this.f181924e = z;
    }

    public void setDynamicContentHeightEnabled(boolean z) {
        this.f181922c = z;
    }

    public void setSmoothScrollEnabled(boolean z) {
        this.f181921b = z;
    }

    public void setSwipeable(boolean z) {
        this.f181920a = z;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void addOnPageChangeListener(ViewPager.AbstractC1579e eVar) {
        C81415b bVar = new C81415b(eVar);
        this.f181926g.put(eVar, bVar);
        super.addOnPageChangeListener(bVar);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            if (!this.f181920a || !super.onInterceptTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        } catch (Exception unused) {
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void removeOnPageChangeListener(ViewPager.AbstractC1579e eVar) {
        super.removeOnPageChangeListener(this.f181926g.get(eVar));
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setAdapter(PagerAdapter pagerAdapter) {
        if (pagerAdapter != null) {
            pagerAdapter = new C81414a(pagerAdapter);
        }
        super.setAdapter(pagerAdapter);
        setCurrentItem(0);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setOnPageChangeListener(ViewPager.AbstractC1579e eVar) {
        super.setOnPageChangeListener(new C81415b(eVar));
    }

    /* renamed from: com.ss.android.ugc.aweme.views.RtlViewPager$a */
    class C81414a extends C81434f {
        static {
            Covode.recordClassIndex(94773);
        }

        @Override // androidx.fragment.app.AbstractC0974l, com.p2082ss.android.ugc.aweme.views.C81434f
        /* renamed from: a */
        public final Fragment mo3639a(int i) {
            if (RtlViewPager.this.mo125047a()) {
                i = (getCount() - i) - 1;
            }
            return super.mo3639a(i);
        }

        @Override // androidx.fragment.app.AbstractC0974l
        /* renamed from: b */
        public final long mo3640b(int i) {
            if (RtlViewPager.this.mo125047a()) {
                i = (getCount() - i) - 1;
            }
            return super.mo3640b(i);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, com.p2082ss.android.ugc.aweme.views.C81434f
        public final int getItemPosition(Object obj) {
            int itemPosition = super.getItemPosition(obj);
            if (!RtlViewPager.this.mo125047a()) {
                return itemPosition;
            }
            if (itemPosition == -1 || itemPosition == -2) {
                return -2;
            }
            return (getCount() - itemPosition) - 1;
        }

        @Override // androidx.viewpager.widget.PagerAdapter, com.p2082ss.android.ugc.aweme.views.C81434f
        public final CharSequence getPageTitle(int i) {
            if (RtlViewPager.this.mo125047a()) {
                i = (getCount() - i) - 1;
            }
            return super.getPageTitle(i);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, com.p2082ss.android.ugc.aweme.views.C81434f
        public final float getPageWidth(int i) {
            if (RtlViewPager.this.mo125047a()) {
                i = (getCount() - i) - 1;
            }
            return super.getPageWidth(i);
        }

        C81414a(PagerAdapter pagerAdapter) {
            super(pagerAdapter);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, com.p2082ss.android.ugc.aweme.views.C81434f
        public final Object instantiateItem(View view, int i) {
            if (RtlViewPager.this.mo125047a()) {
                i = (getCount() - i) - 1;
            }
            return super.instantiateItem(view, i);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.AbstractC0974l, com.p2082ss.android.ugc.aweme.views.C81434f
        public final Object instantiateItem(ViewGroup viewGroup, int i) {
            if (RtlViewPager.this.mo125047a()) {
                i = (getCount() - i) - 1;
            }
            return super.instantiateItem(viewGroup, i);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, com.p2082ss.android.ugc.aweme.views.C81434f
        public final void destroyItem(View view, int i, Object obj) {
            if (RtlViewPager.this.mo125047a()) {
                i = (getCount() - i) - 1;
            }
            super.destroyItem(view, i, obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, com.p2082ss.android.ugc.aweme.views.C81434f
        public final void setPrimaryItem(View view, int i, Object obj) {
            if (RtlViewPager.this.mo125047a()) {
                i = (getCount() - i) - 1;
            }
            super.setPrimaryItem(view, i, obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.AbstractC0974l, com.p2082ss.android.ugc.aweme.views.C81434f
        public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            if (RtlViewPager.this.mo125047a()) {
                i = (getCount() - i) - 1;
            }
            if (i < 0) {
                i = 0;
            }
            super.destroyItem(viewGroup, i, obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.AbstractC0974l, com.p2082ss.android.ugc.aweme.views.C81434f
        public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
            if (RtlViewPager.this.mo125047a()) {
                i = (getCount() - i) - 1;
            }
            super.setPrimaryItem(viewGroup, i, obj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.RtlViewPager$b */
    class C81415b implements ViewPager.AbstractC1579e {

        /* renamed from: b */
        private final ViewPager.AbstractC1579e f181931b;

        static {
            Covode.recordClassIndex(94774);
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageSelected(int i) {
            PagerAdapter adapter = RtlViewPager.super.getAdapter();
            if (RtlViewPager.this.mo125047a() && adapter != null) {
                i = (adapter.getCount() - i) - 1;
            }
            this.f181931b.onPageSelected(i);
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrollStateChanged(int i) {
            this.f181931b.onPageScrollStateChanged(i);
            if (RtlViewPager.this.f181924e && i == 0 && !RtlViewPager.this.mo125047a() && RtlViewPager.this.getCurrentItem() == 0 && RtlViewPager.this.getScrollX() > 0) {
                RtlViewPager.this.setScrollX(0);
            }
        }

        C81415b(ViewPager.AbstractC1579e eVar) {
            this.f181931b = eVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrolled(int i, float f, int i2) {
            PagerAdapter adapter = RtlViewPager.super.getAdapter();
            if (!RtlViewPager.this.mo125047a() || adapter == null) {
                this.f181931b.onPageScrolled(i, f, i2);
                return;
            }
            int count = adapter.getCount();
            if (i == count - 1 && f == 0.0f) {
                i--;
                i2 = RtlViewPager.this.getWidth();
                f = 1.0f;
            }
            this.f181931b.onPageScrolled((count - (i + 1)) - 1, 1.0f - f, RtlViewPager.this.getWidth() - i2);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f181925f = savedState.f181928b;
        super.onRestoreInstanceState(savedState.f181927a);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && mo125047a()) {
            i = (adapter.getCount() - i) - 1;
        }
        if (this.f181921b) {
            super.setCurrentItem(i);
        } else {
            super.setCurrentItem(i, false);
        }
    }

    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        int i2 = 0;
        int i3 = 1;
        if (i != 1) {
            i3 = 0;
        }
        if (i3 != this.f181925f) {
            PagerAdapter adapter = super.getAdapter();
            if (adapter != null) {
                i2 = getCurrentItem();
            }
            this.f181925f = i3;
            if (adapter != null) {
                adapter.notifyDataSetChanged();
                setCurrentItem(i2);
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            if (!this.f181920a || !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            if (motionEvent.getAction() == 1) {
                motionEvent.setAction(3);
                if (!this.f181920a || !super.onTouchEvent(motionEvent)) {
                    return false;
                }
                return true;
            }
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public int getChildDrawingOrder(int i, int i2) {
        try {
            return super.getChildDrawingOrder(i, i2);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public RtlViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i, boolean z) {
        PagerAdapter adapter = super.getAdapter();
        boolean z2 = true;
        if (adapter != null && mo125047a()) {
            i = (adapter.getCount() - i) - 1;
        }
        if (!this.f181921b || !z) {
            z2 = false;
        }
        super.setCurrentItem(i, z2);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        if (this.f181922c && this.f181923d != null && mode != 1073741824) {
            this.f181923d.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
            i2 = View.MeasureSpec.makeMeasureSpec(this.f181923d.getMeasuredHeight(), 1073741824);
        } else if (View.MeasureSpec.getMode(i2) == 0) {
            int i3 = 0;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                childAt.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredHeight > i3) {
                    i3 = measuredHeight;
                }
            }
            i2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
