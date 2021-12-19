package dmt.viewpager;

import android.content.Context;
import android.database.DataSetObserver;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p033d.AbstractC0653f;
import androidx.core.p033d.C0651e;
import androidx.fragment.app.AbstractC0974l;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

public class DmtRtlViewPager extends DmtViewPager {

    /* renamed from: a */
    private int f200440a;

    /* renamed from: b */
    private HashMap<ViewPager.AbstractC1579e, C88318c> f200441b = new HashMap<>();

    static {
        Covode.recordClassIndex(104350);
    }

    /* renamed from: dmt.viewpager.DmtRtlViewPager$a */
    static class C88316a extends DataSetObserver {

        /* renamed from: a */
        final C88317b f200444a;

        static {
            Covode.recordClassIndex(104353);
        }

        public final void onInvalidated() {
            onChanged();
        }

        public final void onChanged() {
            C88317b bVar = this.f200444a;
            if (bVar != null) {
                bVar.mo142811a();
            }
        }

        private C88316a(C88317b bVar) {
            this.f200444a = bVar;
        }

        /* synthetic */ C88316a(C88317b bVar, byte b) {
            this(bVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: dmt.viewpager.DmtRtlViewPager$b */
    public class C88317b extends AbstractC0974l {

        /* renamed from: a */
        public final PagerAdapter f200445a;

        static {
            Covode.recordClassIndex(104354);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo142811a() {
            super.notifyDataSetChanged();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            return this.f200445a.getCount();
        }

        @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.AbstractC0974l
        public final Parcelable saveState() {
            return this.f200445a.saveState();
        }

        @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.AbstractC0974l
        public final void finishUpdate(ViewGroup viewGroup) {
            this.f200445a.finishUpdate(viewGroup);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.AbstractC0974l
        public final void startUpdate(ViewGroup viewGroup) {
            this.f200445a.startUpdate(viewGroup);
        }

        @Override // androidx.fragment.app.AbstractC0974l
        /* renamed from: a */
        public final Fragment mo3639a(int i) {
            if (DmtRtlViewPager.this.mo142801b()) {
                i = (getCount() - i) - 1;
            }
            return ((AbstractC0974l) this.f200445a).mo3639a(i);
        }

        @Override // androidx.fragment.app.AbstractC0974l
        /* renamed from: b */
        public final long mo3640b(int i) {
            if (DmtRtlViewPager.this.mo142801b()) {
                i = (getCount() - i) - 1;
            }
            return super.mo3640b(i);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getItemPosition(Object obj) {
            int itemPosition = this.f200445a.getItemPosition(obj);
            if (!DmtRtlViewPager.this.mo142801b()) {
                return itemPosition;
            }
            if (itemPosition == -1 || itemPosition == -2) {
                return -2;
            }
            return (getCount() - itemPosition) - 1;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final CharSequence getPageTitle(int i) {
            if (DmtRtlViewPager.this.mo142801b()) {
                i = (getCount() - i) - 1;
            }
            return this.f200445a.getPageTitle(i);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final float getPageWidth(int i) {
            if (DmtRtlViewPager.this.mo142801b()) {
                i = (getCount() - i) - 1;
            }
            return this.f200445a.getPageWidth(i);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.AbstractC0974l
        public final boolean isViewFromObject(View view, Object obj) {
            return this.f200445a.isViewFromObject(view, obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.AbstractC0974l
        public final void restoreState(Parcelable parcelable, ClassLoader classLoader) {
            this.f200445a.restoreState(parcelable, classLoader);
        }

        C88317b(PagerAdapter pagerAdapter) {
            super(null);
            this.f200445a = pagerAdapter;
            pagerAdapter.registerDataSetObserver(new C88316a(this, (byte) 0));
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final Object instantiateItem(View view, int i) {
            if (DmtRtlViewPager.this.mo142801b()) {
                i = (getCount() - i) - 1;
            }
            return this.f200445a.instantiateItem(view, i);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.AbstractC0974l
        public final Object instantiateItem(ViewGroup viewGroup, int i) {
            if (DmtRtlViewPager.this.mo142801b()) {
                i = (getCount() - i) - 1;
            }
            return this.f200445a.instantiateItem(viewGroup, i);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final void destroyItem(View view, int i, Object obj) {
            if (DmtRtlViewPager.this.mo142801b()) {
                i = (getCount() - i) - 1;
            }
            this.f200445a.destroyItem(view, i, obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final void setPrimaryItem(View view, int i, Object obj) {
            if (DmtRtlViewPager.this.mo142801b()) {
                i = (getCount() - i) - 1;
            }
            this.f200445a.setPrimaryItem(view, i, obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.AbstractC0974l
        public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            if (DmtRtlViewPager.this.mo142801b()) {
                i = (getCount() - i) - 1;
            }
            if (i < 0) {
                i = 0;
            }
            this.f200445a.destroyItem(viewGroup, i, obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.AbstractC0974l
        public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
            if (DmtRtlViewPager.this.mo142801b()) {
                i = (getCount() - i) - 1;
            }
            this.f200445a.setPrimaryItem(viewGroup, i, obj);
        }
    }

    @Override // dmt.viewpager.DmtViewPager
    public PagerAdapter getAdapter() {
        C88317b bVar = (C88317b) super.getAdapter();
        if (bVar == null) {
            return null;
        }
        return bVar.f200445a;
    }

    @Override // dmt.viewpager.DmtViewPager
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f200440a, (byte) 0);
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = C0651e.m2387a(new AbstractC0653f<SavedState>() {
            /* class dmt.viewpager.DmtRtlViewPager.SavedState.C883151 */

            static {
                Covode.recordClassIndex(104352);
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
        public final Parcelable f200442a;

        /* renamed from: b */
        public final int f200443b;

        public int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(104351);
        }

        private SavedState(Parcelable parcelable, int i) {
            this.f200442a = parcelable;
            this.f200443b = i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f200442a, i);
            parcel.writeInt(this.f200443b);
        }

        private SavedState(Parcel parcel, ClassLoader classLoader) {
            this.f200442a = parcel.readParcelable(classLoader == null ? getClass().getClassLoader() : classLoader);
            this.f200443b = parcel.readInt();
        }

        /* synthetic */ SavedState(Parcel parcel, ClassLoader classLoader, byte b) {
            this(parcel, classLoader);
        }

        /* synthetic */ SavedState(Parcelable parcelable, int i, byte b) {
            this(parcelable, i);
        }
    }

    /* renamed from: b */
    public final boolean mo142801b() {
        if (this.f200440a == 1) {
            return true;
        }
        return false;
    }

    @Override // dmt.viewpager.DmtViewPager
    public int getCurrentItem() {
        int currentItem = super.getCurrentItem();
        PagerAdapter adapter = super.getAdapter();
        if (adapter == null || !mo142801b()) {
            return currentItem;
        }
        return (adapter.getCount() - currentItem) - 1;
    }

    /* renamed from: dmt.viewpager.DmtRtlViewPager$c */
    class C88318c implements ViewPager.AbstractC1579e {

        /* renamed from: b */
        private final ViewPager.AbstractC1579e f200448b;

        static {
            Covode.recordClassIndex(104355);
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrollStateChanged(int i) {
            this.f200448b.onPageScrollStateChanged(i);
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageSelected(int i) {
            PagerAdapter adapter = DmtRtlViewPager.super.getAdapter();
            if (DmtRtlViewPager.this.mo142801b() && adapter != null) {
                i = (adapter.getCount() - i) - 1;
            }
            this.f200448b.onPageSelected(i);
        }

        C88318c(ViewPager.AbstractC1579e eVar) {
            this.f200448b = eVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrolled(int i, float f, int i2) {
            PagerAdapter adapter = DmtRtlViewPager.super.getAdapter();
            if (!DmtRtlViewPager.this.mo142801b() || adapter == null) {
                this.f200448b.onPageScrolled(i, f, i2);
                return;
            }
            int count = adapter.getCount();
            if (i == count - 1 && f == 0.0f) {
                i--;
                i2 = DmtRtlViewPager.this.getWidth();
                f = 1.0f;
            }
            this.f200448b.onPageScrolled((count - (i + 1)) - 1, 1.0f - f, DmtRtlViewPager.this.getWidth() - i2);
        }
    }

    @Override // dmt.viewpager.DmtViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    public DmtRtlViewPager(Context context) {
        super(context);
    }

    @Override // dmt.viewpager.DmtViewPager
    /* renamed from: a */
    public final void mo61356a(ViewPager.AbstractC1579e eVar) {
        C88318c cVar = new C88318c(eVar);
        this.f200441b.put(eVar, cVar);
        super.mo61356a(cVar);
    }

    @Override // dmt.viewpager.DmtViewPager
    /* renamed from: b */
    public final void mo61358b(ViewPager.AbstractC1579e eVar) {
        super.mo61358b(this.f200441b.get(eVar));
    }

    @Override // dmt.viewpager.DmtViewPager
    public void setAdapter(PagerAdapter pagerAdapter) {
        if (pagerAdapter != null) {
            pagerAdapter = new C88317b(pagerAdapter);
        }
        super.setAdapter(pagerAdapter);
        setCurrentItem(0);
    }

    @Override // dmt.viewpager.DmtViewPager
    public void setOnPageChangeListener(ViewPager.AbstractC1579e eVar) {
        super.setOnPageChangeListener(new C88318c(eVar));
    }

    @Override // dmt.viewpager.DmtViewPager
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f200440a = savedState.f200443b;
        super.onRestoreInstanceState(savedState.f200442a);
    }

    @Override // dmt.viewpager.DmtViewPager
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

    @Override // dmt.viewpager.DmtViewPager
    public void setCurrentItem(int i) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && mo142801b()) {
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
        if (i3 != this.f200440a) {
            PagerAdapter adapter = super.getAdapter();
            if (adapter != null) {
                i2 = getCurrentItem();
            }
            this.f200440a = i3;
            if (adapter != null) {
                adapter.notifyDataSetChanged();
                setCurrentItem(i2);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // dmt.viewpager.DmtViewPager
    public int getChildDrawingOrder(int i, int i2) {
        try {
            return super.getChildDrawingOrder(i, i2);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public DmtRtlViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // dmt.viewpager.DmtViewPager
    /* renamed from: a */
    public final void mo61355a(int i, boolean z) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && mo142801b()) {
            i = (adapter.getCount() - i) - 1;
        }
        super.mo61355a(i, z);
    }

    /* access modifiers changed from: protected */
    @Override // dmt.viewpager.DmtViewPager
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
}
