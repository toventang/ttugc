package com.bytedance.ies.bullet.service.base.p1163a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.AbstractC16652m;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16584o;
import com.bytedance.ies.bullet.service.base.p1164b.C16622e;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.base.a.b */
public final class C16567b implements AbstractC16584o {

    /* renamed from: a */
    private final C16587q f39701a;

    /* renamed from: b */
    private final String f39702b;

    /* renamed from: c */
    private final AbstractC16582m f39703c;

    static {
        Covode.recordClassIndex(19004);
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16584o
    /* renamed from: f */
    public final String mo25791f() {
        return this.f39702b;
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16584o
    /* renamed from: g */
    public final AbstractC16582m mo25792g() {
        return this.f39703c;
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j
    public final C16587q getLoggerWrapper() {
        return this.f39701a;
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16584o
    /* renamed from: a_ */
    public final <T> T mo25789a_(Class<T> cls) {
        C89219l.m154719c(cls, "");
        return (T) AbstractC16584o.C16585a.m30801b(this, cls);
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16584o
    /* renamed from: b_ */
    public final <T extends AbstractC16568c> T mo25790b_(Class<T> cls) {
        C89219l.m154719c(cls, "");
        return (T) AbstractC16584o.C16585a.m30798a(this, cls);
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j
    public final void printReject(Throwable th, String str) {
        C89219l.m154719c(th, "");
        C89219l.m154719c(str, "");
        AbstractC16584o.C16585a.m30800a(this, th, str);
    }

    public C16567b(String str, AbstractC16582m mVar) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(mVar, "");
        this.f39702b = str;
        this.f39703c = mVar;
        this.f39701a = new C16587q((AbstractC16652m) C16622e.C16623a.m30858a().mo26347a(str, AbstractC16652m.class), "Token");
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j
    public final void printLog(String str, EnumC16586p pVar, String str2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(pVar, "");
        C89219l.m154719c(str2, "");
        AbstractC16584o.C16585a.m30799a(this, str, pVar, str2);
    }
}
