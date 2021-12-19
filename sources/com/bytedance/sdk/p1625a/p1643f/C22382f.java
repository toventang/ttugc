package com.bytedance.sdk.p1625a.p1643f;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.AbstractC22330f;
import com.bytedance.sdk.p1625a.p1626a.C22306c;
import com.bytedance.sdk.p1625a.p1626a.p1627a.AbstractC22288a;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22292e;
import com.bytedance.sdk.p1625a.p1641d.C22355a;
import com.bytedance.sdk.p1625a.p1657l.C22480a;
import com.bytedance.sdk.p1625a.p1662m.C22498c;
import com.bytedance.sdk.p1625a.p1662m.C22500d;
import com.bytedance.sdk.p1625a.p1662m.C22502e;
import com.bytedance.sdk.p1625a.p1662m.C22505g;
import com.p2082ss.android.account.AbstractC29355g;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.sdk.a.f.f */
public final class C22382f implements AbstractC22330f {

    /* renamed from: a */
    Context f52925a;

    static {
        Covode.recordClassIndex(26198);
    }

    public C22382f(Context context) {
        this.f52925a = context;
    }

    @Override // com.bytedance.sdk.p1625a.p1626a.AbstractC22330f
    /* renamed from: a */
    public final void mo36665a(String str, AbstractC29355g gVar) {
        Context context = this.f52925a;
        C22355a.C22356a a = C22371b.m42127a(str, null, null, null, null, null);
        a.f52826a = C22306c.C22308b.m41974a("/2/user/info/");
        new C22505g(context, a.mo36709b(), gVar).mo36736d();
    }

    @Override // com.bytedance.sdk.p1625a.p1626a.AbstractC22330f
    /* renamed from: b */
    public final void mo36668b(String str, String str2, String str3, long j, Map map, AbstractC22288a<C22292e> aVar) {
        C22480a.m42424a(6, str2);
        Context context = this.f52925a;
        C22355a.C22356a a = C22371b.m42127a(str2, str3, String.valueOf(j), null, str, map);
        a.f52826a = C22306c.C22308b.m41974a("/passport/auth/login/");
        new C22500d(context, a.mo36705a().mo36710c(), aVar).mo36736d();
    }

    @Override // com.bytedance.sdk.p1625a.p1626a.AbstractC22330f
    /* renamed from: c */
    public final void mo36669c(String str, String str2, String str3, long j, Map map, AbstractC22288a<C22292e> aVar) {
        C22480a.m42424a(6, str2);
        Context context = this.f52925a;
        C22355a.C22356a a = C22371b.m42127a(str2, null, String.valueOf(j), str3, str, map);
        a.f52826a = C22306c.C22308b.m41974a("/passport/auth/login_only/");
        new C22502e(context, a.mo36710c(), aVar).mo36736d();
    }

    @Override // com.bytedance.sdk.p1625a.p1626a.AbstractC22330f
    /* renamed from: d */
    public final void mo36670d(String str, String str2, String str3, long j, Map map, AbstractC22288a<C22292e> aVar) {
        C22480a.m42424a(6, str2);
        Context context = this.f52925a;
        C22355a.C22356a a = C22371b.m42127a(str2, str3, String.valueOf(j), null, str, map);
        a.f52826a = C22306c.C22308b.m41974a("/passport/auth/login_only/");
        new C22502e(context, a.mo36710c(), aVar).mo36736d();
    }

    @Override // com.bytedance.sdk.p1625a.p1626a.AbstractC22330f
    /* renamed from: a */
    public final void mo36666a(String str, String str2, String str3, long j, Map map, AbstractC22288a<C22292e> aVar) {
        C22480a.m42424a(6, str2);
        Context context = this.f52925a;
        C22355a.C22356a a = C22371b.m42127a(str2, null, String.valueOf(j), str3, str, map);
        a.f52826a = C22306c.C22308b.m41974a("/passport/auth/login/");
        new C22500d(context, a.mo36705a().mo36710c(), aVar).mo36736d();
    }

    @Override // com.bytedance.sdk.p1625a.p1626a.AbstractC22330f
    /* renamed from: a */
    public final void mo36667a(String str, String str2, String str3, long j, Map map, AbstractC29355g gVar) {
        Context context = this.f52925a;
        C22355a.C22356a a = C22371b.m42127a(str2, str3, String.valueOf(j), null, str, map);
        a.f52826a = C22306c.C22308b.m41974a("/passport/auth/bind/");
        new C22498c(context, a.mo36710c(), gVar).mo36736d();
    }
}
