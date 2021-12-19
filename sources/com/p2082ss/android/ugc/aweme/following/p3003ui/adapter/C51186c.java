package com.p2082ss.android.ugc.aweme.following.p3003ui.adapter;

import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0974l;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.friends.p3011a.AbstractC51472p;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.c */
public final class C51186c extends AbstractC0974l {

    /* renamed from: a */
    public final AbstractC0952i f118067a;

    /* renamed from: b */
    public final List<Fragment> f118068b;

    /* renamed from: c */
    public final List<String> f118069c;

    static {
        Covode.recordClassIndex(60389);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f118068b.size();
    }

    @Override // androidx.fragment.app.AbstractC0974l
    /* renamed from: a */
    public final Fragment mo3639a(int i) {
        return this.f118068b.get(i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i) {
        return this.f118069c.get(i);
    }

    /* renamed from: c */
    public final void mo86609c(int i) {
        boolean z;
        int i2 = 0;
        for (T t : this.f118068b) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C89070n.m154520a();
            }
            T t2 = t;
            if (t2 instanceof AbstractC51472p) {
                T t3 = t2;
                if (i2 != i) {
                    z = true;
                } else {
                    z = false;
                }
                t3.mo86587a(z);
            }
            i2 = i3;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C51186c(AbstractC0952i iVar, List<Fragment> list, List<String> list2) {
        super(iVar);
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        this.f118067a = iVar;
        this.f118068b = list;
        this.f118069c = list2;
    }
}
