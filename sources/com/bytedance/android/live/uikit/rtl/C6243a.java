package com.bytedance.android.live.uikit.rtl;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.uikit.rtl.a */
public class C6243a extends PagerAdapter {

    /* renamed from: a */
    public final PagerAdapter f15616a;

    static {
        Covode.recordClassIndex(6954);
    }

    /* renamed from: com.bytedance.android.live.uikit.rtl.a$a */
    static class C6244a extends DataSetObserver {

        /* renamed from: a */
        final C6243a f15617a;

        static {
            Covode.recordClassIndex(6955);
        }

        public final void onInvalidated() {
            onChanged();
        }

        public final void onChanged() {
            C6243a aVar = this.f15617a;
            if (aVar != null) {
                aVar.mo12226a();
            }
        }

        private C6244a(C6243a aVar) {
            this.f15617a = aVar;
        }

        /* synthetic */ C6244a(C6243a aVar, byte b) {
            this(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12226a() {
        super.notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f15616a.getCount();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void notifyDataSetChanged() {
        this.f15616a.notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Parcelable saveState() {
        return this.f15616a.saveState();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(View view) {
        this.f15616a.finishUpdate(view);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        return this.f15616a.getItemPosition(obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i) {
        return this.f15616a.getPageTitle(i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public float getPageWidth(int i) {
        return this.f15616a.getPageWidth(i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.f15616a.registerDataSetObserver(dataSetObserver);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void startUpdate(View view) {
        this.f15616a.startUpdate(view);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.f15616a.unregisterDataSetObserver(dataSetObserver);
    }

    public C6243a(PagerAdapter pagerAdapter) {
        this.f15616a = pagerAdapter;
        pagerAdapter.registerDataSetObserver(new C6244a(this, (byte) 0));
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(ViewGroup viewGroup) {
        this.f15616a.finishUpdate(viewGroup);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void startUpdate(ViewGroup viewGroup) {
        this.f15616a.startUpdate(viewGroup);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(View view, int i) {
        return this.f15616a.instantiateItem(view, i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return this.f15616a.isViewFromObject(view, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        this.f15616a.restoreState(parcelable, classLoader);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        return this.f15616a.instantiateItem(viewGroup, i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(View view, int i, Object obj) {
        this.f15616a.destroyItem(view, i, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(View view, int i, Object obj) {
        this.f15616a.setPrimaryItem(view, i, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        this.f15616a.destroyItem(viewGroup, i, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        this.f15616a.setPrimaryItem(viewGroup, i, obj);
    }
}
