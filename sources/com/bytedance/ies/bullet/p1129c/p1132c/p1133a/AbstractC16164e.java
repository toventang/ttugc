package com.bytedance.ies.bullet.p1129c.p1132c.p1133a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.c.c.a.e */
public abstract class AbstractC16164e implements AbstractC16183k {

    /* renamed from: a */
    public final C16248b f38923a;

    /* renamed from: b */
    private AbstractC16183k.EnumC16184a f38924b = AbstractC16183k.EnumC16184a.PRIVATE;

    /* renamed from: c */
    private boolean f38925c;

    static {
        Covode.recordClassIndex(18457);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1136e.AbstractC16246a
    /* renamed from: a */
    public void mo25721a() {
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: b */
    public AbstractC16183k.EnumC16184a mo25723b() {
        return this.f38924b;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    public boolean bh_() {
        return this.f38925c;
    }

    /* renamed from: a */
    public void mo25722a(AbstractC16183k.EnumC16184a aVar) {
        C89219l.m154719c(aVar, "");
        this.f38924b = aVar;
    }

    public AbstractC16164e(C16248b bVar) {
        C89219l.m154719c(bVar, "");
        this.f38923a = bVar;
    }
}
