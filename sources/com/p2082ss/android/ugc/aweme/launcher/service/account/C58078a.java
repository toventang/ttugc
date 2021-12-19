package com.p2082ss.android.ugc.aweme.launcher.service.account;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.component.AbstractC34542e;
import com.p2082ss.android.ugc.aweme.launcher.serviceimpl.account.AccountImpl;
import java.util.Collection;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.launcher.service.account.a */
public final class C58078a implements IAccountApi {

    /* renamed from: a */
    public static final C58078a f132318a = new C58078a();

    /* renamed from: b */
    private final /* synthetic */ IAccountApi f132319b;

    @Override // com.p2082ss.android.ugc.aweme.launcher.service.account.IAccountApi
    /* renamed from: a */
    public final void mo95573a(String str, String str2, String str3) {
        this.f132319b.mo95573a(str, str2, str3);
    }

    @Override // com.p2082ss.android.ugc.aweme.launcher.service.account.IAccountApi
    /* renamed from: a */
    public final void mo95574a(Collection<String> collection) {
        C89219l.m154721d(collection, "");
        this.f132319b.mo95574a(collection);
    }

    @Override // com.p2082ss.android.ugc.aweme.launcher.service.account.IAccountApi
    /* renamed from: a */
    public final void mo95575a(boolean z, String str) {
        C89219l.m154721d(str, "");
        this.f132319b.mo95575a(z, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.launcher.service.account.IAccountApi
    /* renamed from: a */
    public final boolean mo95576a() {
        return this.f132319b.mo95576a();
    }

    @Override // com.p2082ss.android.ugc.aweme.launcher.service.account.IAccountApi
    /* renamed from: a */
    public final boolean mo95577a(String str) {
        return this.f132319b.mo95577a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.launcher.service.account.IAccountApi
    /* renamed from: b */
    public final AbstractC34542e mo95578b() {
        return this.f132319b.mo95578b();
    }

    @Override // com.p2082ss.android.ugc.aweme.launcher.service.account.IAccountApi
    /* renamed from: b */
    public final void mo95579b(String str) {
        this.f132319b.mo95579b(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.launcher.service.account.IAccountApi
    /* renamed from: c */
    public final String mo95580c() {
        return this.f132319b.mo95580c();
    }

    @Override // com.p2082ss.android.ugc.aweme.launcher.service.account.IAccountApi
    /* renamed from: d */
    public final String mo95581d() {
        return this.f132319b.mo95581d();
    }

    static {
        Covode.recordClassIndex(68124);
    }

    private C58078a() {
        IAccountApi e = AccountImpl.m104964e();
        C89219l.m154716b(e, "");
        this.f132319b = e;
    }
}
