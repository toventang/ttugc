package com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.p4358b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.AbstractC84581c;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84451j;
import com.p2082ss.android.ugc.tools.p4346h.p4349b.p4351b.C84524p;
import com.p2082ss.android.ugc.tools.p4346h.p4349b.p4351b.C84525q;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.a.b.b.g */
public final class C84579g implements AbstractC84581c {

    /* renamed from: a */
    private final AbstractC89171a<AbstractC84398d> f189027a;

    /* renamed from: b */
    private final AbstractC89171a<String> f189028b;

    /* renamed from: c */
    private final AbstractC89171a<String> f189029c;

    /* renamed from: d */
    private final int f189030d;

    /* renamed from: e */
    private final int f189031e;

    static {
        Covode.recordClassIndex(98544);
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.AbstractC84581c
    /* renamed from: a */
    public final /* synthetic */ AbstractC84451j mo129518a() {
        return new C84524p(this.f189027a, this.f189028b.invoke(), this.f189029c.invoke(), this.f189030d);
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.AbstractC84581c
    /* renamed from: a */
    public final /* synthetic */ AbstractC84451j mo129519a(String str) {
        C89219l.m154721d(str, "");
        return new C84525q(this.f189027a, this.f189028b.invoke(), this.f189029c.invoke(), str, this.f189031e);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.tools.b.a.d> */
    /* JADX WARN: Multi-variable type inference failed */
    public C84579g(AbstractC89171a<? extends AbstractC84398d> aVar, AbstractC89171a<String> aVar2, AbstractC89171a<String> aVar3, int i, int i2) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(aVar3, "");
        this.f189027a = aVar;
        this.f189028b = aVar2;
        this.f189029c = aVar3;
        this.f189030d = i;
        this.f189031e = i2;
    }
}
