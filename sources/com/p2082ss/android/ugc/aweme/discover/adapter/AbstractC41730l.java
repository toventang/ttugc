package com.p2082ss.android.ugc.aweme.discover.adapter;

import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.l */
public abstract class AbstractC41730l<T extends Fragment> extends AbstractC41593a {

    /* renamed from: a */
    public HashMap<Integer, T> f97351a = new LinkedHashMap();

    /* renamed from: b */
    private int f97352b;

    static {
        Covode.recordClassIndex(49643);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract Fragment mo70846d(int i);

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f97352b;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void notifyDataSetChanged() {
        HashMap<Integer, T> hashMap = this.f97351a;
        if (hashMap != null) {
            hashMap.clear();
        }
        super.notifyDataSetChanged();
    }

    /* renamed from: c */
    public final Fragment mo70916c(int i) {
        HashMap<Integer, T> hashMap = this.f97351a;
        if (hashMap == null || hashMap.size() == 0) {
            return null;
        }
        return this.f97351a.get(Integer.valueOf(i));
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.lego.p3393c.AbstractC58188b
    /* renamed from: a */
    public final /* synthetic */ Fragment mo62762a(int i) {
        Fragment d = mo70846d(i);
        if (d != null) {
            return d;
        }
        throw new UnsupportedOperationException("createFragment(position=" + i + " No Fragment instance returned),Check the code to ensure that the createFragment method covers all positions");
    }

    public AbstractC41730l(AbstractC0952i iVar, int i) {
        super(iVar);
        this.f97352b = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.HashMap<java.lang.Integer, T extends androidx.fragment.app.Fragment> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p2082ss.android.ugc.aweme.discover.adapter.AbstractC41593a, androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        Object instantiateItem = super.instantiateItem(viewGroup, i);
        this.f97351a.put(Integer.valueOf(i), instantiateItem);
        return instantiateItem;
    }
}
