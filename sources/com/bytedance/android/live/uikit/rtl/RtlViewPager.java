package com.bytedance.android.live.uikit.rtl;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p033d.AbstractC0653f;
import androidx.core.p033d.C0651e;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

public class RtlViewPager extends ViewPager {

    /* renamed from: a */
    private int f15609a;

    /* renamed from: b */
    private HashMap<ViewPager.AbstractC1579e, C6242b> f15610b = new HashMap<>();

    static {
        Covode.recordClassIndex(6949);
    }

    /* renamed from: a */
    public final boolean mo12222a() {
        if (this.f15609a == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void clearOnPageChangeListeners() {
        super.clearOnPageChangeListeners();
        this.f15610b.clear();
    }

    @Override // androidx.viewpager.widget.ViewPager
    public PagerAdapter getAdapter() {
        C6243a aVar = (C6243a) super.getAdapter();
        if (aVar == null) {
            return null;
        }
        return aVar.f15616a;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f15609a, (byte) 0);
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = C0651e.m2387a(new AbstractC0653f<SavedState>() {
            /* class com.bytedance.android.live.uikit.rtl.RtlViewPager.SavedState.C62401 */

            static {
                Covode.recordClassIndex(6951);
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
        public final Parcelable f15611a;

        /* renamed from: b */
        public final int f15612b;

        public int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(6950);
        }

        private SavedState(Parcelable parcelable, int i) {
            this.f15611a = parcelable;
            this.f15612b = i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f15611a, i);
            parcel.writeInt(this.f15612b);
        }

        private SavedState(Parcel parcel, ClassLoader classLoader) {
            this.f15611a = parcel.readParcelable(classLoader == null ? getClass().getClassLoader() : classLoader);
            this.f15612b = parcel.readInt();
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
        if (adapter == null || !mo12222a()) {
            return currentItem;
        }
        return (adapter.getCount() - currentItem) - 1;
    }

    /* renamed from: com.bytedance.android.live.uikit.rtl.RtlViewPager$b */
    class C6242b implements ViewPager.AbstractC1579e {

        /* renamed from: b */
        private final ViewPager.AbstractC1579e f15615b;

        static {
            Covode.recordClassIndex(6953);
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrollStateChanged(int i) {
            this.f15615b.onPageScrollStateChanged(i);
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageSelected(int i) {
            PagerAdapter adapter = RtlViewPager.super.getAdapter();
            if (RtlViewPager.this.mo12222a() && adapter != null) {
                i = (adapter.getCount() - i) - 1;
            }
            this.f15615b.onPageSelected(i);
        }

        public C6242b(ViewPager.AbstractC1579e eVar) {
            this.f15615b = eVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrolled(int i, float f, int i2) {
            int width = RtlViewPager.this.getWidth();
            PagerAdapter adapter = RtlViewPager.super.getAdapter();
            if (RtlViewPager.this.mo12222a() && adapter != null) {
                int count = adapter.getCount();
                float f2 = (float) width;
                int pageWidth = ((int) ((1.0f - adapter.getPageWidth(i)) * f2)) + i2;
                while (i < count && pageWidth > 0) {
                    i++;
                    pageWidth -= (int) (adapter.getPageWidth(i) * f2);
                }
                i = (count - i) - 1;
                i2 = -pageWidth;
                f = ((float) i2) / (f2 * adapter.getPageWidth(i));
            }
            this.f15615b.onPageScrolled(i, f, i2);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void addOnPageChangeListener(ViewPager.AbstractC1579e eVar) {
        C6242b bVar = new C6242b(eVar);
        this.f15610b.put(eVar, bVar);
        super.addOnPageChangeListener(bVar);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void removeOnPageChangeListener(ViewPager.AbstractC1579e eVar) {
        C6242b remove = this.f15610b.remove(eVar);
        if (remove != null) {
            super.removeOnPageChangeListener(remove);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setAdapter(PagerAdapter pagerAdapter) {
        if (pagerAdapter != null) {
            pagerAdapter = new C6241a(pagerAdapter);
        }
        super.setAdapter(pagerAdapter);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setOnPageChangeListener(ViewPager.AbstractC1579e eVar) {
        super.setOnPageChangeListener(new C6242b(eVar));
    }

    /* renamed from: com.bytedance.android.live.uikit.rtl.RtlViewPager$a */
    class C6241a extends C6243a {
        static {
            Covode.recordClassIndex(6952);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, com.bytedance.android.live.uikit.rtl.C6243a
        public final int getItemPosition(Object obj) {
            int itemPosition = super.getItemPosition(obj);
            if (!RtlViewPager.this.mo12222a()) {
                return itemPosition;
            }
            if (itemPosition == -1 || itemPosition == -2) {
                return -2;
            }
            return (getCount() - itemPosition) - 1;
        }

        @Override // androidx.viewpager.widget.PagerAdapter, com.bytedance.android.live.uikit.rtl.C6243a
        public final CharSequence getPageTitle(int i) {
            if (RtlViewPager.this.mo12222a()) {
                i = (getCount() - i) - 1;
            }
            return super.getPageTitle(i);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, com.bytedance.android.live.uikit.rtl.C6243a
        public final float getPageWidth(int i) {
            if (RtlViewPager.this.mo12222a()) {
                i = (getCount() - i) - 1;
            }
            return super.getPageWidth(i);
        }

        public C6241a(PagerAdapter pagerAdapter) {
            super(pagerAdapter);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, com.bytedance.android.live.uikit.rtl.C6243a
        public final Object instantiateItem(View view, int i) {
            if (RtlViewPager.this.mo12222a()) {
                i = (getCount() - i) - 1;
            }
            return super.instantiateItem(view, i);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, com.bytedance.android.live.uikit.rtl.C6243a
        public final Object instantiateItem(ViewGroup viewGroup, int i) {
            if (RtlViewPager.this.mo12222a()) {
                i = (getCount() - i) - 1;
            }
            return super.instantiateItem(viewGroup, i);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, com.bytedance.android.live.uikit.rtl.C6243a
        public final void destroyItem(View view, int i, Object obj) {
            if (RtlViewPager.this.mo12222a()) {
                i = (getCount() - i) - 1;
            }
            super.destroyItem(view, i, obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, com.bytedance.android.live.uikit.rtl.C6243a
        public final void setPrimaryItem(View view, int i, Object obj) {
            if (RtlViewPager.this.mo12222a()) {
                i = (getCount() - i) - 1;
            }
            super.setPrimaryItem(view, i, obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, com.bytedance.android.live.uikit.rtl.C6243a
        public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            if (RtlViewPager.this.mo12222a()) {
                i = (getCount() - i) - 1;
            }
            super.destroyItem(viewGroup, i, obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, com.bytedance.android.live.uikit.rtl.C6243a
        public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
            if (RtlViewPager.this.mo12222a()) {
                i = (getCount() - i) - 1;
            }
            super.setPrimaryItem(viewGroup, i, obj);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f15609a = savedState.f15612b;
        super.onRestoreInstanceState(savedState.f15611a);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && mo12222a()) {
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
        if (i3 != this.f15609a) {
            PagerAdapter adapter = super.getAdapter();
            if (adapter != null) {
                i2 = getCurrentItem();
            }
            this.f15609a = i3;
            if (adapter != null) {
                adapter.notifyDataSetChanged();
                setCurrentItem(i2);
            }
        }
    }

    public RtlViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
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
        if (adapter != null && mo12222a()) {
            i = (adapter.getCount() - i) - 1;
        }
        super.setCurrentItem(i, z);
    }
}
