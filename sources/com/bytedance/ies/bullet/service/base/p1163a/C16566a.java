package com.bytedance.ies.bullet.service.base.p1163a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.p1164b.C16619b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.base.a.a */
public final class C16566a implements AbstractC16582m {

    /* renamed from: a */
    public final C16619b f39698a = new C16619b();

    /* renamed from: b */
    private final Context f39699b;

    /* renamed from: c */
    private final boolean f39700c;

    static {
        Covode.recordClassIndex(19003);
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16582m
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC16574h mo26324a() {
        return this.f39698a;
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16582m
    /* renamed from: b */
    public final Context mo26327b() {
        return this.f39699b;
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16582m
    /* renamed from: c */
    public final boolean mo26328c() {
        return this.f39700c;
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16582m
    /* renamed from: a */
    public final <T> T mo26325a(Class<T> cls) {
        C89219l.m154719c(cls, "");
        C89219l.m154719c(cls, "");
        return (T) mo26324a().mo26343a(cls);
    }

    public C16566a(Context context, boolean z) {
        this.f39699b = context;
        this.f39700c = z;
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16582m
    /* renamed from: a */
    public final <T> void mo26326a(Class<T> cls, T t) {
        C89219l.m154719c(cls, "");
        C89219l.m154719c(cls, "");
        mo26324a().mo26344a(cls, t);
    }
}
