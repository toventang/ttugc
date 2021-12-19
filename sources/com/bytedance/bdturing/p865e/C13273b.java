package com.bytedance.bdturing.p865e;

import android.os.Looper;
import com.bytedance.bdturing.C13285g;
import com.bytedance.bdturing.p864d.AbstractC13269a;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.bdturing.e.b */
public final class C13273b implements AbstractC13272a {

    /* renamed from: a */
    public final AbstractC13272a f32456a;

    static {
        Covode.recordClassIndex(15235);
    }

    @Override // com.bytedance.bdturing.p865e.AbstractC13272a
    /* renamed from: a */
    public final AbstractC13269a mo21400a() {
        return this.f32456a.mo21400a();
    }

    @Override // com.bytedance.bdturing.p865e.AbstractC13272a
    /* renamed from: b */
    public final String mo21401b() {
        return this.f32456a.mo21401b();
    }

    @Override // com.bytedance.bdturing.p865e.AbstractC13272a
    /* renamed from: c */
    public final String mo21402c() {
        return this.f32456a.mo21402c();
    }

    @Override // com.bytedance.bdturing.p865e.AbstractC13272a
    /* renamed from: d */
    public final String mo21403d() {
        return this.f32456a.mo21403d();
    }

    @Override // com.bytedance.bdturing.p865e.AbstractC13272a
    /* renamed from: e */
    public final String mo21404e() {
        return this.f32456a.mo21404e();
    }

    @Override // com.bytedance.bdturing.p865e.AbstractC13272a
    /* renamed from: f */
    public final String mo21405f() {
        return this.f32456a.mo21405f();
    }

    @Override // com.bytedance.bdturing.p865e.AbstractC13272a
    /* renamed from: g */
    public final String mo21406g() {
        return this.f32456a.mo21406g();
    }

    @Override // com.bytedance.bdturing.p865e.AbstractC13272a
    /* renamed from: h */
    public final String mo21407h() {
        return this.f32456a.mo21407h();
    }

    @Override // com.bytedance.bdturing.p865e.AbstractC13272a
    /* renamed from: i */
    public final String mo21408i() {
        return this.f32456a.mo21408i();
    }

    @Override // com.bytedance.bdturing.p865e.AbstractC13272a
    /* renamed from: k */
    public final Looper mo21410k() {
        return this.f32456a.mo21410k();
    }

    @Override // com.bytedance.bdturing.p865e.AbstractC13272a
    /* renamed from: j */
    public final String mo21409j() {
        String j = this.f32456a.mo21409j();
        if (C89219l.m154714a((Object) j, (Object) EnumC13277e.CN.getValue()) || C89219l.m154714a((Object) j, (Object) EnumC13277e.SINGAPOER.getValue()) || C89219l.m154714a((Object) j, (Object) EnumC13277e.USA_EAST.getValue()) || C89219l.m154714a((Object) j, (Object) EnumC13277e.INDIA.getValue()) || C89219l.m154714a((Object) j, (Object) EnumC13277e.BOE.getValue()) || !C13285g.m23902a()) {
            return j;
        }
        throw new RuntimeException("not support this region");
    }

    public C13273b(AbstractC13272a aVar) {
        C89219l.m154719c(aVar, "");
        this.f32456a = aVar;
    }
}
