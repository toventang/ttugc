package com.p2082ss.android.ugc.aweme.sticker.widget;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0974l;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.sticker.widget.a */
public class C76410a extends AbstractC0974l {

    /* renamed from: a */
    public final PagerAdapter f171646a;

    static {
        Covode.recordClassIndex(89373);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.widget.a$a */
    static class C76411a extends DataSetObserver {

        /* renamed from: a */
        final C76410a f171647a;

        static {
            Covode.recordClassIndex(89374);
        }

        public final void onInvalidated() {
            onChanged();
        }

        public final void onChanged() {
            C76410a aVar = this.f171647a;
            if (aVar != null) {
                aVar.mo120129a();
            }
        }

        private C76411a(C76410a aVar) {
            this.f171647a = aVar;
        }

        /* synthetic */ C76411a(C76410a aVar, byte b) {
            this(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo120129a() {
        super.notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f171646a.getCount();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void notifyDataSetChanged() {
        this.f171646a.notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.AbstractC0974l
    public Parcelable saveState() {
        return this.f171646a.saveState();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(View view) {
        this.f171646a.finishUpdate(view);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        return this.f171646a.getItemPosition(obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i) {
        return this.f171646a.getPageTitle(i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public float getPageWidth(int i) {
        return this.f171646a.getPageWidth(i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.f171646a.registerDataSetObserver(dataSetObserver);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void startUpdate(View view) {
        this.f171646a.startUpdate(view);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.f171646a.unregisterDataSetObserver(dataSetObserver);
    }

    public C76410a(PagerAdapter pagerAdapter) {
        super(null);
        this.f171646a = pagerAdapter;
        pagerAdapter.registerDataSetObserver(new C76411a(this, (byte) 0));
    }

    @Override // androidx.fragment.app.AbstractC0974l
    /* renamed from: a */
    public Fragment mo3639a(int i) {
        return ((AbstractC0974l) this.f171646a).mo3639a(i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.AbstractC0974l
    public void finishUpdate(ViewGroup viewGroup) {
        this.f171646a.finishUpdate(viewGroup);
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.AbstractC0974l
    public void startUpdate(ViewGroup viewGroup) {
        this.f171646a.startUpdate(viewGroup);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(View view, int i) {
        return this.f171646a.instantiateItem(view, i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.AbstractC0974l
    public boolean isViewFromObject(View view, Object obj) {
        return this.f171646a.isViewFromObject(view, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.AbstractC0974l
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        this.f171646a.restoreState(parcelable, classLoader);
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.AbstractC0974l
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        return this.f171646a.instantiateItem(viewGroup, i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(View view, int i, Object obj) {
        this.f171646a.destroyItem(view, i, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(View view, int i, Object obj) {
        this.f171646a.setPrimaryItem(view, i, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.AbstractC0974l
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        this.f171646a.destroyItem(viewGroup, i, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.AbstractC0974l
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        this.f171646a.setPrimaryItem(viewGroup, i, obj);
    }
}
