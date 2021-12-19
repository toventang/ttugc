package com.p2082ss.android.ugc.aweme.sticker.widget;

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

/* renamed from: com.ss.android.ugc.aweme.sticker.widget.AVRtlViewPager */
public class AVRtlViewPager extends ViewPager {

    /* renamed from: a */
    public boolean f171634a;

    /* renamed from: b */
    private int f171635b;

    /* renamed from: c */
    private HashMap<ViewPager.AbstractC1579e, C76406b> f171636c = new HashMap<>();

    static {
        Covode.recordClassIndex(89364);
    }

    /* renamed from: a */
    public final boolean mo120117a() {
        if (this.f171635b == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public PagerAdapter getAdapter() {
        C76410a aVar = (C76410a) super.getAdapter();
        if (aVar == null) {
            return null;
        }
        return aVar.f171646a;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f171635b, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.widget.AVRtlViewPager$SavedState */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = C0651e.m2387a(new AbstractC0653f<SavedState>() {
            /* class com.p2082ss.android.ugc.aweme.sticker.widget.AVRtlViewPager.SavedState.C764041 */

            static {
                Covode.recordClassIndex(89366);
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
        public final Parcelable f171637a;

        /* renamed from: b */
        public final int f171638b;

        public int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(89365);
        }

        private SavedState(Parcelable parcelable, int i) {
            this.f171637a = parcelable;
            this.f171638b = i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f171637a, i);
            parcel.writeInt(this.f171638b);
        }

        private SavedState(Parcel parcel, ClassLoader classLoader) {
            this.f171637a = parcel.readParcelable(classLoader == null ? getClass().getClassLoader() : classLoader);
            this.f171638b = parcel.readInt();
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
        if (adapter == null || !mo120117a()) {
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
        this.f171634a = z;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void addOnPageChangeListener(ViewPager.AbstractC1579e eVar) {
        C76406b bVar = new C76406b(eVar);
        this.f171636c.put(eVar, bVar);
        super.addOnPageChangeListener(bVar);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void removeOnPageChangeListener(ViewPager.AbstractC1579e eVar) {
        super.removeOnPageChangeListener(this.f171636c.get(eVar));
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setAdapter(PagerAdapter pagerAdapter) {
        if (pagerAdapter != null) {
            pagerAdapter = new C76405a(pagerAdapter);
        }
        super.setAdapter(pagerAdapter);
        setCurrentItem(0);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setOnPageChangeListener(ViewPager.AbstractC1579e eVar) {
        super.setOnPageChangeListener(new C76406b(eVar));
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.widget.AVRtlViewPager$a */
    class C76405a extends C76410a {
        static {
            Covode.recordClassIndex(89367);
        }

        @Override // androidx.fragment.app.AbstractC0974l, com.p2082ss.android.ugc.aweme.sticker.widget.C76410a
        /* renamed from: a */
        public final Fragment mo3639a(int i) {
            if (AVRtlViewPager.this.mo120117a()) {
                i = (getCount() - i) - 1;
            }
            return super.mo3639a(i);
        }

        @Override // androidx.fragment.app.AbstractC0974l
        /* renamed from: b */
        public final long mo3640b(int i) {
            if (AVRtlViewPager.this.mo120117a()) {
                i = (getCount() - i) - 1;
            }
            return super.mo3640b(i);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, com.p2082ss.android.ugc.aweme.sticker.widget.C76410a
        public final int getItemPosition(Object obj) {
            int itemPosition = super.getItemPosition(obj);
            if (!AVRtlViewPager.this.mo120117a()) {
                return itemPosition;
            }
            if (itemPosition == -1 || itemPosition == -2) {
                return -2;
            }
            return (getCount() - itemPosition) - 1;
        }

        @Override // androidx.viewpager.widget.PagerAdapter, com.p2082ss.android.ugc.aweme.sticker.widget.C76410a
        public final CharSequence getPageTitle(int i) {
            if (AVRtlViewPager.this.mo120117a()) {
                i = (getCount() - i) - 1;
            }
            return super.getPageTitle(i);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, com.p2082ss.android.ugc.aweme.sticker.widget.C76410a
        public final float getPageWidth(int i) {
            if (AVRtlViewPager.this.mo120117a()) {
                i = (getCount() - i) - 1;
            }
            return super.getPageWidth(i);
        }

        C76405a(PagerAdapter pagerAdapter) {
            super(pagerAdapter);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, com.p2082ss.android.ugc.aweme.sticker.widget.C76410a
        public final Object instantiateItem(View view, int i) {
            if (AVRtlViewPager.this.mo120117a()) {
                i = (getCount() - i) - 1;
            }
            return super.instantiateItem(view, i);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.AbstractC0974l, com.p2082ss.android.ugc.aweme.sticker.widget.C76410a
        public final Object instantiateItem(ViewGroup viewGroup, int i) {
            if (AVRtlViewPager.this.mo120117a()) {
                i = (getCount() - i) - 1;
            }
            return super.instantiateItem(viewGroup, i);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, com.p2082ss.android.ugc.aweme.sticker.widget.C76410a
        public final void destroyItem(View view, int i, Object obj) {
            if (AVRtlViewPager.this.mo120117a()) {
                i = (getCount() - i) - 1;
            }
            super.destroyItem(view, i, obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, com.p2082ss.android.ugc.aweme.sticker.widget.C76410a
        public final void setPrimaryItem(View view, int i, Object obj) {
            if (AVRtlViewPager.this.mo120117a()) {
                i = (getCount() - i) - 1;
            }
            super.setPrimaryItem(view, i, obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.AbstractC0974l, com.p2082ss.android.ugc.aweme.sticker.widget.C76410a
        public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            if (AVRtlViewPager.this.mo120117a()) {
                i = (getCount() - i) - 1;
            }
            if (i < 0) {
                i = 0;
            }
            super.destroyItem(viewGroup, i, obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.AbstractC0974l, com.p2082ss.android.ugc.aweme.sticker.widget.C76410a
        public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
            if (AVRtlViewPager.this.mo120117a()) {
                i = (getCount() - i) - 1;
            }
            super.setPrimaryItem(viewGroup, i, obj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.widget.AVRtlViewPager$b */
    class C76406b implements ViewPager.AbstractC1579e {

        /* renamed from: b */
        private final ViewPager.AbstractC1579e f171641b;

        static {
            Covode.recordClassIndex(89368);
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageSelected(int i) {
            PagerAdapter adapter = AVRtlViewPager.super.getAdapter();
            if (AVRtlViewPager.this.mo120117a() && adapter != null) {
                i = (adapter.getCount() - i) - 1;
            }
            this.f171641b.onPageSelected(i);
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrollStateChanged(int i) {
            this.f171641b.onPageScrollStateChanged(i);
            if (AVRtlViewPager.this.f171634a && i == 0 && !AVRtlViewPager.this.mo120117a() && AVRtlViewPager.this.getCurrentItem() == 0 && AVRtlViewPager.this.getScrollX() > 0) {
                AVRtlViewPager.this.setScrollX(0);
            }
        }

        C76406b(ViewPager.AbstractC1579e eVar) {
            this.f171641b = eVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrolled(int i, float f, int i2) {
            PagerAdapter adapter = AVRtlViewPager.super.getAdapter();
            if (!AVRtlViewPager.this.mo120117a() || adapter == null) {
                this.f171641b.onPageScrolled(i, f, i2);
                return;
            }
            int count = adapter.getCount();
            if (i == count - 1 && f == 0.0f) {
                i--;
                i2 = AVRtlViewPager.this.getWidth();
                f = 1.0f;
            }
            this.f171641b.onPageScrolled((count - (i + 1)) - 1, 1.0f - f, AVRtlViewPager.this.getWidth() - i2);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f171635b = savedState.f171638b;
        super.onRestoreInstanceState(savedState.f171637a);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception unused) {
            if (motionEvent.getAction() != 1) {
                return false;
            }
            motionEvent.setAction(3);
            return super.onTouchEvent(motionEvent);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && mo120117a()) {
            i = (adapter.getCount() - i) - 1;
        }
        super.setCurrentItem(i);
    }

    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        int i2 = 0;
        int i3 = 1;
        if (i != 1) {
            i3 = 0;
        }
        if (i3 != this.f171635b) {
            PagerAdapter adapter = super.getAdapter();
            if (adapter != null) {
                i2 = getCurrentItem();
            }
            this.f171635b = i3;
            if (adapter != null) {
                adapter.notifyDataSetChanged();
                setCurrentItem(i2);
            }
        }
    }

    public AVRtlViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
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

    @Override // androidx.viewpager.widget.ViewPager
    public void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i2) == 0) {
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

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i, boolean z) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && mo120117a()) {
            i = (adapter.getCount() - i) - 1;
        }
        super.setCurrentItem(i, z);
    }
}
