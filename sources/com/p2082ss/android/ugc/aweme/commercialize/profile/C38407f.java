package com.p2082ss.android.ugc.aweme.commercialize.profile;

import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0974l;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.p1279a.AbstractC18234b;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.profile.f */
public final class C38407f<T extends AbstractC18234b> extends AbstractC0974l {

    /* renamed from: a */
    public List<? extends T> f90752a;

    static {
        Covode.recordClassIndex(45914);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f90752a.size();
    }

    @Override // androidx.fragment.app.AbstractC0974l
    /* renamed from: a */
    public final Fragment mo3639a(int i) {
        return (Fragment) this.f90752a.get(i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getItemPosition(Object obj) {
        C89219l.m154721d(obj, "");
        if (C89070n.m154556a((Iterable) this.f90752a, obj)) {
            return C89070n.m154546a((List) this.f90752a, obj);
        }
        return -2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38407f(AbstractC0952i iVar, List<? extends T> list) {
        super(iVar);
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(list, "");
        this.f90752a = list;
    }
}
