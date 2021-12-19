package com.p2082ss.android.ugc.aweme.comment.adapter;

import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0974l;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.p1279a.AbstractC18234b;
import com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36420f;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.e */
public final class C36224e<T extends AbstractC18234b> extends AbstractC0974l {

    /* renamed from: a */
    public List<T> f85547a;

    /* renamed from: b */
    public List<Integer> f85548b;

    /* renamed from: c */
    private AbstractC0952i f85549c;

    static {
        Covode.recordClassIndex(43490);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f85547a.size();
    }

    @Override // androidx.fragment.app.AbstractC0974l
    /* renamed from: a */
    public final Fragment mo3639a(int i) {
        return this.f85547a.get(i);
    }

    @Override // androidx.fragment.app.AbstractC0974l
    /* renamed from: b */
    public final long mo3640b(int i) {
        return (long) this.f85548b.get(i).intValue();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getItemPosition(Object obj) {
        if (this.f85547a.contains(obj)) {
            return this.f85547a.indexOf(obj);
        }
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i) {
        T t = this.f85547a.get(i);
        if (t instanceof AbstractC36420f) {
            return ((AbstractC36420f) t).mo63724d();
        }
        return "";
    }

    public C36224e(AbstractC0952i iVar, List<T> list, List<Integer> list2) {
        super(iVar);
        this.f85549c = iVar;
        this.f85547a = list;
        this.f85548b = list2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.AbstractC0974l
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        AbstractC0976n a = this.f85549c.mo3552a();
        a.mo3455a((Fragment) obj);
        a.mo3473c();
    }
}
