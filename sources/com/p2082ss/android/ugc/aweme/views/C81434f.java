package com.p2082ss.android.ugc.aweme.views;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0974l;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.views.f */
public class C81434f extends AbstractC0974l {

    /* renamed from: a */
    public final PagerAdapter f182011a;

    static {
        Covode.recordClassIndex(94803);
    }

    /* renamed from: com.ss.android.ugc.aweme.views.f$a */
    static class C81435a extends DataSetObserver {

        /* renamed from: a */
        private final C81434f f182012a;

        static {
            Covode.recordClassIndex(94804);
        }

        public final void onInvalidated() {
            onChanged();
        }

        public final void onChanged() {
            C81434f fVar = this.f182012a;
            if (fVar != null) {
                fVar.mo125087a();
            }
        }

        private C81435a(C81434f fVar) {
            this.f182012a = fVar;
        }

        /* synthetic */ C81435a(C81434f fVar, byte b) {
            this(fVar);
        }
    }

    /* renamed from: a */
    public final void mo125087a() {
        super.notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f182011a.getCount();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void notifyDataSetChanged() {
        this.f182011a.notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.AbstractC0974l
    public Parcelable saveState() {
        return this.f182011a.saveState();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(View view) {
        this.f182011a.finishUpdate(view);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        return this.f182011a.getItemPosition(obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i) {
        return this.f182011a.getPageTitle(i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public float getPageWidth(int i) {
        return this.f182011a.getPageWidth(i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.f182011a.registerDataSetObserver(dataSetObserver);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void startUpdate(View view) {
        this.f182011a.startUpdate(view);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.f182011a.unregisterDataSetObserver(dataSetObserver);
    }

    public C81434f(PagerAdapter pagerAdapter) {
        super(null);
        this.f182011a = pagerAdapter;
        pagerAdapter.registerDataSetObserver(new C81435a(this, (byte) 0));
    }

    @Override // androidx.fragment.app.AbstractC0974l
    /* renamed from: a */
    public Fragment mo3639a(int i) {
        return ((AbstractC0974l) this.f182011a).mo3639a(i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.AbstractC0974l
    public void finishUpdate(ViewGroup viewGroup) {
        this.f182011a.finishUpdate(viewGroup);
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.AbstractC0974l
    public void startUpdate(ViewGroup viewGroup) {
        this.f182011a.startUpdate(viewGroup);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(View view, int i) {
        return this.f182011a.instantiateItem(view, i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.AbstractC0974l
    public boolean isViewFromObject(View view, Object obj) {
        return this.f182011a.isViewFromObject(view, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.AbstractC0974l
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        this.f182011a.restoreState(parcelable, classLoader);
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.AbstractC0974l
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        return this.f182011a.instantiateItem(viewGroup, i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(View view, int i, Object obj) {
        this.f182011a.destroyItem(view, i, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(View view, int i, Object obj) {
        this.f182011a.setPrimaryItem(view, i, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.AbstractC0974l
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        this.f182011a.destroyItem(viewGroup, i, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.AbstractC0974l
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        this.f182011a.setPrimaryItem(viewGroup, i, obj);
    }
}
