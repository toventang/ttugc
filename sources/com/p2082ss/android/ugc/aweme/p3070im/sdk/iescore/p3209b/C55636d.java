package com.p2082ss.android.ugc.aweme.p3070im.sdk.iescore.p3209b;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17451d;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.statisticlogger.C18205a;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55197c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.iescore.b.d */
public final class C55636d implements AbstractC17451d {

    /* renamed from: a */
    public static final C55636d f126897a = new C55636d();

    private C55636d() {
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17451d
    /* renamed from: b */
    public final int mo27846b() {
        return C17867d.f42590n;
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17451d
    /* renamed from: f */
    public final String mo27850f() {
        return C17867d.f42595s;
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17451d
    /* renamed from: a */
    public final Context mo27845a() {
        return C17867d.m33078a();
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17451d
    /* renamed from: c */
    public final int mo27847c() {
        return (int) C17867d.m33084e();
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17451d
    /* renamed from: h */
    public final String mo27852h() {
        C89219l.m154716b("https://imapi-16.tiktokv.com/", "");
        return "https://imapi-16.tiktokv.com/";
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17451d
    /* renamed from: i */
    public final String mo27853i() {
        C89219l.m154716b("okhttp/3.12.13.1", "");
        return "okhttp/3.12.13.1";
    }

    static {
        Covode.recordClassIndex(65418);
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17451d
    /* renamed from: e */
    public final String mo27849e() {
        String installId = AppLog.getInstallId();
        if (installId == null) {
            return "";
        }
        return installId;
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17451d
    /* renamed from: g */
    public final boolean mo27851g() {
        return C89219l.m154714a((Object) C17867d.f42595s, (Object) "local_test");
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17451d
    /* renamed from: j */
    public final String mo27854j() {
        String g = C55197c.m100925g();
        C89219l.m154716b(g, "");
        return g;
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17451d
    /* renamed from: k */
    public final String mo27855k() {
        String f = C55197c.m100924f();
        C89219l.m154716b(f, "");
        return f;
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17451d
    /* renamed from: l */
    public final boolean mo27856l() {
        return C29843f.m60129a(C17867d.m33078a());
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17451d
    /* renamed from: d */
    public final String mo27848d() {
        String a = C18205a.m33878a();
        if (TextUtils.isEmpty(a)) {
            a = "-1";
        }
        return a.toString();
    }
}
