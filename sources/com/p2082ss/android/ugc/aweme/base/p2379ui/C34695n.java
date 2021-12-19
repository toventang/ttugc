package com.p2082ss.android.ugc.aweme.base.p2379ui;

import android.content.Context;
import android.database.DataSetObserver;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.p025c.C0484a;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import dmt.viewpager.DmtViewPager;

/* renamed from: com.ss.android.ugc.aweme.base.ui.n */
public class C34695n extends DmtViewPager {

    /* renamed from: a */
    private final boolean f81964a;

    /* renamed from: b */
    private int f81965b;

    /* renamed from: c */
    private C34697b f81966c;

    /* renamed from: d */
    private C0484a<ViewPager.AbstractC1579e, C34696a> f81967d = new C0484a<>();

    static {
        Covode.recordClassIndex(41682);
    }

    @Override // dmt.viewpager.DmtViewPager
    public void setOnPageChangeListener(ViewPager.AbstractC1579e eVar) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.base.ui.n$b */
    public static class C34697b extends PagerAdapter {

        /* renamed from: a */
        PagerAdapter f81970a;

        /* renamed from: b */
        DataSetObserver f81971b;

        static {
            Covode.recordClassIndex(41684);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            return this.f81970a.getCount();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final void notifyDataSetChanged() {
            this.f81970a.notifyDataSetChanged();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final Parcelable saveState() {
            return this.f81970a.saveState();
        }

        /* renamed from: a */
        private int m70865a(int i) {
            return (getCount() - i) - 1;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final void finishUpdate(ViewGroup viewGroup) {
            this.f81970a.finishUpdate(viewGroup);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            try {
                this.f81970a.registerDataSetObserver(dataSetObserver);
            } catch (Throwable unused) {
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final void startUpdate(ViewGroup viewGroup) {
            this.f81970a.startUpdate(viewGroup);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            try {
                this.f81970a.unregisterDataSetObserver(dataSetObserver);
            } catch (Throwable unused) {
            }
        }

        C34697b(PagerAdapter pagerAdapter) {
            C346981 r0 = new DataSetObserver() {
                /* class com.p2082ss.android.ugc.aweme.base.p2379ui.C34695n.C34697b.C346981 */

                static {
                    Covode.recordClassIndex(41685);
                }

                public final void onInvalidated() {
                    onChanged();
                }

                public final void onChanged() {
                    C34697b.super.notifyDataSetChanged();
                }
            };
            this.f81971b = r0;
            this.f81970a = pagerAdapter;
            pagerAdapter.registerDataSetObserver(r0);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final CharSequence getPageTitle(int i) {
            return this.f81970a.getPageTitle(m70865a(i));
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final float getPageWidth(int i) {
            return this.f81970a.getPageWidth(m70865a(i));
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getItemPosition(Object obj) {
            int itemPosition = this.f81970a.getItemPosition(obj);
            if (itemPosition == -1 || itemPosition == -2) {
                return itemPosition;
            }
            return m70865a(itemPosition);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final boolean isViewFromObject(View view, Object obj) {
            return this.f81970a.isViewFromObject(view, obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final void restoreState(Parcelable parcelable, ClassLoader classLoader) {
            this.f81970a.restoreState(parcelable, classLoader);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final Object instantiateItem(ViewGroup viewGroup, int i) {
            return this.f81970a.instantiateItem(viewGroup, m70865a(i));
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            this.f81970a.destroyItem(viewGroup, m70865a(i), obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
            this.f81970a.setPrimaryItem(viewGroup, m70865a(i), obj);
        }
    }

    @Override // dmt.viewpager.DmtViewPager
    public int getCurrentItem() {
        return super.getCurrentItem();
    }

    @Override // dmt.viewpager.DmtViewPager
    public PagerAdapter getAdapter() {
        PagerAdapter adapter = super.getAdapter();
        if (adapter instanceof C34697b) {
            return ((C34697b) adapter).f81970a;
        }
        return adapter;
    }

    public int getCurrentItemCompat() {
        return mo61354a(getCurrentItem());
    }

    /* renamed from: a */
    public final boolean mo61357a() {
        int i = this.f81965b;
        if (i == 1) {
            return false;
        }
        if (this.f81964a || i == 2) {
            return true;
        }
        return false;
    }

    @Override // dmt.viewpager.DmtViewPager
    public void setCurrentItem(int i) {
        super.setCurrentItem(mo61354a(i));
    }

    /* renamed from: com.ss.android.ugc.aweme.base.ui.n$a */
    class C34696a implements ViewPager.AbstractC1579e {

        /* renamed from: a */
        ViewPager.AbstractC1579e f81968a;

        static {
            Covode.recordClassIndex(41683);
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrollStateChanged(int i) {
            ViewPager.AbstractC1579e eVar = this.f81968a;
            if (eVar != null) {
                eVar.onPageScrollStateChanged(i);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageSelected(int i) {
            ViewPager.AbstractC1579e eVar = this.f81968a;
            if (eVar != null) {
                eVar.onPageSelected(C34695n.this.mo61354a(i));
            }
        }

        C34696a(ViewPager.AbstractC1579e eVar) {
            this.f81968a = eVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrolled(int i, float f, int i2) {
            if (this.f81968a != null) {
                int a = C34695n.this.mo61354a(i);
                if (C34695n.this.mo61357a()) {
                    float f2 = ((float) a) - f;
                    a = (int) f2;
                    f = f2 - ((float) a);
                }
                this.f81968a.onPageScrolled(a, f, i2);
            }
        }
    }

    @Override // dmt.viewpager.DmtViewPager
    /* renamed from: a */
    public final void mo61356a(ViewPager.AbstractC1579e eVar) {
        C34696a aVar = new C34696a(eVar);
        this.f81967d.put(eVar, aVar);
        super.mo61356a(aVar);
    }

    @Override // dmt.viewpager.DmtViewPager
    /* renamed from: b */
    public final void mo61358b(ViewPager.AbstractC1579e eVar) {
        C34696a remove = this.f81967d.remove(eVar);
        if (remove != null) {
            super.mo61358b(remove);
        }
    }

    @Override // dmt.viewpager.DmtViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // dmt.viewpager.DmtViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public C34695n(Context context) {
        super(context);
        this.f81964a = m70859a(context);
    }

    /* renamed from: a */
    private static boolean m70859a(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final int mo61354a(int i) {
        int count;
        if (!mo61357a()) {
            return i;
        }
        PagerAdapter adapter = getAdapter();
        if (adapter == null) {
            count = 0;
        } else {
            count = adapter.getCount();
        }
        if (i < 0 || i >= count) {
            return i;
        }
        return (count - i) - 1;
    }

    @Override // dmt.viewpager.DmtViewPager
    public void setAdapter(PagerAdapter pagerAdapter) {
        C34697b bVar = this.f81966c;
        if (bVar != null) {
            try {
                bVar.f81970a.unregisterDataSetObserver(bVar.f81971b);
            } catch (Throwable unused) {
            }
            this.f81966c = null;
        }
        if (mo61357a() && pagerAdapter != null) {
            C34697b bVar2 = new C34697b(pagerAdapter);
            this.f81966c = bVar2;
            pagerAdapter = bVar2;
        }
        super.setAdapter(pagerAdapter);
        if (mo61357a()) {
            mo61355a(0, false);
        }
    }

    @Override // dmt.viewpager.DmtViewPager
    /* renamed from: a */
    public final void mo61355a(int i, boolean z) {
        super.mo61355a(mo61354a(i), z);
    }

    public C34695n(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f81964a = m70859a(context);
    }
}
