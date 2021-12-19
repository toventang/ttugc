package com.p2082ss.android.ugc.aweme;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.services.NewUserMainModuleService;
import com.p2082ss.android.ugc.aweme.journey.INewUserMainModuleService;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58259r;
import com.p2082ss.android.ugc.aweme.lego.EnumC58147aa;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.cq */
public final class C40313cq implements INewUserMainModuleService {

    /* renamed from: a */
    public static final C40313cq f94478a = new C40313cq();

    /* renamed from: b */
    private final /* synthetic */ INewUserMainModuleService f94479b;

    @Override // com.p2082ss.android.ugc.aweme.journey.INewUserMainModuleService
    /* renamed from: a */
    public final AbstractC58259r mo60089a(EnumC58147aa aaVar) {
        C89219l.m154721d(aaVar, "");
        return this.f94479b.mo60089a(aaVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.INewUserMainModuleService
    /* renamed from: a */
    public final Class<? extends Activity> mo60090a() {
        return this.f94479b.mo60090a();
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.INewUserMainModuleService
    /* renamed from: a */
    public final void mo60091a(Context context, boolean z) {
        C89219l.m154721d(context, "");
        this.f94479b.mo60091a(context, z);
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.INewUserMainModuleService
    /* renamed from: a */
    public final void mo60092a(String str) {
        C89219l.m154721d(str, "");
        this.f94479b.mo60092a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.INewUserMainModuleService
    /* renamed from: b */
    public final Class<? extends Activity> mo60093b() {
        return this.f94479b.mo60093b();
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.INewUserMainModuleService
    /* renamed from: c */
    public final boolean mo60094c() {
        return this.f94479b.mo60094c();
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.INewUserMainModuleService
    /* renamed from: d */
    public final AbstractC58259r mo60095d() {
        return this.f94479b.mo60095d();
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.INewUserMainModuleService
    /* renamed from: e */
    public final AbstractC58259r mo60096e() {
        return this.f94479b.mo60096e();
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.INewUserMainModuleService
    /* renamed from: f */
    public final Class<? extends Activity> mo60097f() {
        return this.f94479b.mo60097f();
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.INewUserMainModuleService
    /* renamed from: g */
    public final void mo60098g() {
        this.f94479b.mo60098g();
    }

    static {
        Covode.recordClassIndex(48114);
    }

    private C40313cq() {
        INewUserMainModuleService h = NewUserMainModuleService.m69256h();
        C89219l.m154716b(h, "");
        this.f94479b = h;
    }
}
