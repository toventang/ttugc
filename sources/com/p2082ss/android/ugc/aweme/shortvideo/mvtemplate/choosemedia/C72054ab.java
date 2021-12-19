package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import androidx.recyclerview.widget.C1445j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ab */
public final class C72054ab extends C1445j.AbstractC1447a {

    /* renamed from: a */
    private final List<MvImageChooseAdapter.MyMediaModel> f161508a;

    /* renamed from: b */
    private final List<MvImageChooseAdapter.MyMediaModel> f161509b;

    static {
        Covode.recordClassIndex(84719);
    }

    @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
    /* renamed from: a */
    public final int mo3768a() {
        return this.f161508a.size();
    }

    @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
    /* renamed from: b */
    public final int mo3770b() {
        return this.f161509b.size();
    }

    @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
    /* renamed from: a */
    public final Object mo3769a(int i, int i2) {
        return C72180bn.f161799a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$MyMediaModel> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$MyMediaModel> */
    /* JADX WARN: Multi-variable type inference failed */
    public C72054ab(List<? extends MvImageChooseAdapter.MyMediaModel> list, List<? extends MvImageChooseAdapter.MyMediaModel> list2) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        this.f161508a = list;
        this.f161509b = list2;
    }

    @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
    /* renamed from: b */
    public final boolean mo3771b(int i, int i2) {
        return C89219l.m154714a((Object) this.f161508a.get(i).f134661a, (Object) this.f161509b.get(i2).f134661a);
    }

    @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
    /* renamed from: c */
    public final boolean mo3772c(int i, int i2) {
        if (this.f161508a.get(i) == this.f161509b.get(i2)) {
            return true;
        }
        return false;
    }
}
