package com.p2082ss.android.ugc.aweme.base.p2379ui;

import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.p1284f.AbstractC18273b;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* renamed from: com.ss.android.ugc.aweme.base.ui.f */
public abstract class AbstractC34686f<T extends Fragment> extends AbstractC18273b {

    /* renamed from: c */
    protected final int f81943c;

    /* renamed from: d */
    private HashMap<Integer, T> f81944d;

    static {
        Covode.recordClassIndex(41673);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo61345a(T t);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo61346a(HashMap<Integer, T> hashMap) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract T mo61347c(int i);

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f81943c;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void notifyDataSetChanged() {
        HashMap<Integer, T> hashMap = this.f81944d;
        if (hashMap != null) {
            hashMap.clear();
            mo61346a(this.f81944d);
        }
        super.notifyDataSetChanged();
    }

    @Override // com.bytedance.ies.uikit.p1284f.AbstractC18273b
    /* renamed from: a */
    public final Fragment mo29162a(int i) {
        T c = mo61347c(i);
        if (c != null) {
            return c;
        }
        throw new UnsupportedOperationException("createFragment(position=" + i + " does not return a Fragment),check the code to be sure that method createFragment has override all position");
    }

    public AbstractC34686f(AbstractC0952i iVar, int i) {
        super(iVar);
        this.f81943c = i;
        LinkedHashMap linkedHashMap = new LinkedHashMap(i);
        this.f81944d = linkedHashMap;
        mo61346a(linkedHashMap);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.ss.android.ugc.aweme.base.ui.f<T extends androidx.fragment.app.Fragment> */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.HashMap<java.lang.Integer, T extends androidx.fragment.app.Fragment> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.uikit.p1284f.AbstractC18273b, androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        Object instantiateItem = super.instantiateItem(viewGroup, i);
        Fragment fragment = (Fragment) instantiateItem;
        mo61345a(fragment);
        this.f81944d.put(Integer.valueOf(i), fragment);
        mo61346a(this.f81944d);
        return instantiateItem;
    }
}
