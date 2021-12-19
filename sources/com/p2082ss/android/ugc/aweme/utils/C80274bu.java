package com.p2082ss.android.ugc.aweme.utils;

import androidx.recyclerview.widget.C1445j;
import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.bu */
public final class C80274bu extends C1445j.AbstractC1447a {

    /* renamed from: a */
    public final List<?> f179771a;

    /* renamed from: b */
    private final List<?> f179772b;

    static {
        Covode.recordClassIndex(93542);
    }

    @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
    /* renamed from: a */
    public final int mo3768a() {
        return this.f179772b.size();
    }

    @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
    /* renamed from: b */
    public final int mo3770b() {
        return this.f179771a.size();
    }

    public C80274bu(List<?> list, List<?> list2) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        this.f179772b = list;
        this.f179771a = list2;
    }

    @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
    /* renamed from: b */
    public final boolean mo3771b(int i, int i2) {
        return C89219l.m154714a(this.f179772b.get(i), this.f179771a.get(i2));
    }

    @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
    /* renamed from: c */
    public final boolean mo3772c(int i, int i2) {
        return C89219l.m154714a(this.f179772b.get(i), this.f179771a.get(i2));
    }
}
