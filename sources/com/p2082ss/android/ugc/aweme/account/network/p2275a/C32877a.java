package com.p2082ss.android.ugc.aweme.account.network.p2275a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.AbstractC22354d;
import com.bytedance.sdk.p1625a.p1664o.AbstractC22510c;
import com.p2082ss.android.AbstractC29903e;
import com.p2082ss.android.account.p2088a.AbstractC29341a;
import com.p2082ss.android.account.p2088a.AbstractC29342b;
import com.p2082ss.android.account.p2090c.AbstractC29348a;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.ugc.aweme.C31291a;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.services.LoginService;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.network.a.a */
public final class C32877a implements AbstractC29903e {

    /* renamed from: a */
    private final AbstractC89244h f78267a = C89250i.m154773a((AbstractC89171a) C32881d.f78269a);

    /* renamed from: com.ss.android.ugc.aweme.account.network.a.a$b */
    static final class C32879b implements AbstractC29348a {

        /* renamed from: a */
        public static final C32879b f78268a = new C32879b();

        static {
            Covode.recordClassIndex(39667);
        }

        C32879b() {
        }
    }

    static {
        Covode.recordClassIndex(39665);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.network.a.a$a */
    public static final class C32878a extends AbstractC29341a {
        static {
            Covode.recordClassIndex(39666);
        }

        @Override // com.p2082ss.android.account.p2088a.AbstractC29342b, com.p2082ss.android.account.p2088a.AbstractC29341a
        /* renamed from: a */
        public final boolean mo51304a() {
            return true;
        }

        C32878a() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.network.a.a$c */
    public static final class C32880c implements AbstractC22510c {
        static {
            Covode.recordClassIndex(39668);
        }

        C32880c() {
        }

        @Override // com.bytedance.sdk.p1625a.p1664o.AbstractC22510c
        /* renamed from: a */
        public final void mo36783a(long j, String str) {
            AppLog.setSessionKey(str);
        }

        @Override // com.bytedance.sdk.p1625a.p1664o.AbstractC22510c
        /* renamed from: a */
        public final void mo36784a(String str, JSONObject jSONObject) {
            C39162r.m79461a(str, jSONObject);
        }
    }

    @Override // com.p2082ss.android.AbstractC29903e
    /* renamed from: g */
    public final AbstractC29348a mo52215g() {
        return C32879b.f78268a;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.network.a.a$d */
    static final class C32881d extends AbstractC89220m implements AbstractC89171a<C32882b> {

        /* renamed from: a */
        public static final C32881d f78269a = new C32881d();

        static {
            Covode.recordClassIndex(39669);
        }

        C32881d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C32882b invoke() {
            return new C32882b();
        }
    }

    @Override // com.p2082ss.android.AbstractC29903e
    /* renamed from: a */
    public final String mo52209a() {
        C89219l.m154716b("api.tiktokv.com", "");
        return "api.tiktokv.com";
    }

    @Override // com.p2082ss.android.AbstractC29903e
    /* renamed from: b */
    public final Context mo52210b() {
        return C31291a.m65462a();
    }

    @Override // com.p2082ss.android.AbstractC29903e
    /* renamed from: e */
    public final AbstractC22510c mo52213e() {
        return new C32880c();
    }

    @Override // com.p2082ss.android.AbstractC29903e
    /* renamed from: f */
    public final AbstractC29342b mo52214f() {
        return new C32878a();
    }

    @Override // com.p2082ss.android.AbstractC29903e
    /* renamed from: c */
    public final AbstractC22354d mo52211c() {
        return (C32882b) this.f78267a.getValue();
    }

    @Override // com.p2082ss.android.AbstractC29903e
    /* renamed from: d */
    public final boolean mo52212d() {
        LoginService g = C36085cj.m73553g();
        C89219l.m154716b(g, "");
        return g.isEnableMultiAccountLogin();
    }
}
