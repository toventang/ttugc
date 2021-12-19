package com.p2082ss.android.ugc.aweme.deeplink;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.deeplink.m */
public final class C41050m implements IDeepLinkService {

    /* renamed from: a */
    public static final C41050m f95959a = new C41050m();

    /* renamed from: b */
    private final /* synthetic */ IDeepLinkService f95960b;

    @Override // com.p2082ss.android.ugc.aweme.deeplink.IDeepLinkService
    /* renamed from: a */
    public final void mo70169a() {
        this.f95960b.mo70169a();
    }

    @Override // com.p2082ss.android.ugc.aweme.deeplink.IDeepLinkService
    /* renamed from: a */
    public final void mo70170a(C41035d dVar, C41022c cVar) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(cVar, "");
        this.f95960b.mo70170a(dVar, cVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.deeplink.IDeepLinkService
    /* renamed from: a */
    public final void mo70171a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f95960b.mo70171a(str, str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.deeplink.IDeepLinkService
    /* renamed from: a */
    public final void mo70172a(String str, boolean z, String str2) {
        this.f95960b.mo70172a(str, z, str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.deeplink.IDeepLinkService
    /* renamed from: a */
    public final boolean mo70173a(Activity activity, String str, boolean z) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str, "");
        return this.f95960b.mo70173a(activity, str, z);
    }

    @Override // com.p2082ss.android.ugc.aweme.deeplink.IDeepLinkService
    /* renamed from: a */
    public final boolean mo70174a(String str) {
        C89219l.m154721d(str, "");
        return this.f95960b.mo70174a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.deeplink.IDeepLinkService
    /* renamed from: b */
    public final String mo70175b() {
        return this.f95960b.mo70175b();
    }

    @Override // com.p2082ss.android.ugc.aweme.deeplink.IDeepLinkService
    /* renamed from: b */
    public final String mo70176b(String str) {
        C89219l.m154721d(str, "");
        return this.f95960b.mo70176b(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.deeplink.IDeepLinkService
    /* renamed from: b */
    public final void mo70177b(Activity activity, String str, boolean z) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str, "");
        this.f95960b.mo70177b(activity, str, z);
    }

    @Override // com.p2082ss.android.ugc.aweme.deeplink.IDeepLinkService
    /* renamed from: c */
    public final String mo70178c() {
        return this.f95960b.mo70178c();
    }

    @Override // com.p2082ss.android.ugc.aweme.deeplink.IDeepLinkService
    /* renamed from: c */
    public final boolean mo70179c(String str) {
        return this.f95960b.mo70179c(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.deeplink.IDeepLinkService
    /* renamed from: d */
    public final String mo70180d() {
        return this.f95960b.mo70180d();
    }

    @Override // com.p2082ss.android.ugc.aweme.deeplink.IDeepLinkService
    /* renamed from: e */
    public final String mo70181e() {
        return this.f95960b.mo70181e();
    }

    @Override // com.p2082ss.android.ugc.aweme.deeplink.IDeepLinkService
    /* renamed from: f */
    public final String mo70182f() {
        return this.f95960b.mo70182f();
    }

    static {
        Covode.recordClassIndex(48920);
    }

    private C41050m() {
        IDeepLinkService g = DeepLinkServiceImpl.m82568g();
        C89219l.m154716b(g, "");
        this.f95960b = g;
    }
}
