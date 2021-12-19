package com.bytedance.android.live.effect.p244e;

import androidx.recyclerview.widget.C1445j;
import com.bytedance.android.livesdkapi.depend.model.C11672a;
import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.effect.e.a */
public final class C4243a extends C1445j.AbstractC1447a {

    /* renamed from: a */
    private final List<C11672a> f11750a;

    /* renamed from: b */
    private final List<C11672a> f11751b;

    static {
        Covode.recordClassIndex(4813);
    }

    @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
    /* renamed from: a */
    public final int mo3768a() {
        return this.f11750a.size();
    }

    @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
    /* renamed from: b */
    public final int mo3770b() {
        return this.f11751b.size();
    }

    public C4243a(List<C11672a> list, List<C11672a> list2) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        this.f11750a = list;
        this.f11751b = list2;
    }

    @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
    /* renamed from: b */
    public final boolean mo3771b(int i, int i2) {
        return C89219l.m154714a((Object) this.f11750a.get(i).f27895c, (Object) this.f11751b.get(i2).f27895c);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x003c  */
    @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo3772c(int r9, int r10) {
        /*
        // Method dump skipped, instructions count: 169
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.p244e.C4243a.mo3772c(int, int):boolean");
    }
}
