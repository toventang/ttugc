package com.p2082ss.android.ugc.aweme.effect;

import androidx.recyclerview.widget.C1445j;
import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.effect.o */
public final class C46366o extends C1445j.AbstractC1447a {

    /* renamed from: a */
    private final List<EffectModel> f108063a;

    /* renamed from: b */
    private final List<EffectModel> f108064b;

    static {
        Covode.recordClassIndex(54943);
    }

    @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
    /* renamed from: a */
    public final int mo3768a() {
        return this.f108063a.size();
    }

    @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
    /* renamed from: b */
    public final int mo3770b() {
        return this.f108064b.size();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.effect.EffectModel> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.effect.EffectModel> */
    /* JADX WARN: Multi-variable type inference failed */
    public C46366o(List<? extends EffectModel> list, List<? extends EffectModel> list2) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        this.f108063a = list;
        this.f108064b = list2;
    }

    @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
    /* renamed from: b */
    public final boolean mo3771b(int i, int i2) {
        return C89219l.m154714a((Object) this.f108063a.get(i).name, (Object) this.f108064b.get(i2).name);
    }

    @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
    /* renamed from: c */
    public final boolean mo3772c(int i, int i2) {
        return C89219l.m154714a(this.f108063a.get(i), this.f108064b.get(i2));
    }
}
