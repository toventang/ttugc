package com.p2082ss.android.ugc.aweme.authorize;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.p1610b.AbstractC21993ag;
import com.bytedance.retrofit2.p1610b.AbstractC21998f;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.sdk.p1625a.p1631b.p1632a.AbstractC22333a;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.openauthorize.AbstractC62716h;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.authorize.AwemeAuthorizePlatformDepend */
public final class AwemeAuthorizePlatformDepend implements AbstractC22333a {

    /* renamed from: a */
    private WeakReference<AbstractC62716h> f80363a;

    /* renamed from: b */
    private AuthorizeApi f80364b = ((AuthorizeApi) RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28832d().mo28858a(AuthorizeApi.class));

    /* renamed from: c */
    private ExecutorService f80365c = C40780g.m82241a();

    /* renamed from: com.ss.android.ugc.aweme.authorize.AwemeAuthorizePlatformDepend$AuthorizeApi */
    public interface AuthorizeApi {
        static {
            Covode.recordClassIndex(40907);
        }

        @AbstractC22000h
        AbstractFutureC27655q<String> doGet(@AbstractC21993ag String str);

        @AbstractC22012t
        @AbstractC21999g
        AbstractFutureC27655q<String> doPost(@AbstractC21993ag String str, @AbstractC21998f Map<String, String> map);
    }

    static {
        Covode.recordClassIndex(40906);
    }

    @Override // com.bytedance.sdk.p1625a.p1631b.p1632a.AbstractC22333a
    /* renamed from: b */
    public final String mo36678b() {
        C89219l.m154716b("open-api.tiktok.com", "");
        return "open-api.tiktok.com";
    }

    /* renamed from: c */
    private static boolean m69569c() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.bytedance.sdk.p1625a.p1631b.p1632a.AbstractC22333a
    /* renamed from: a */
    public final boolean mo36677a() {
        C17867d.m33078a();
        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132256h = m69569c();
        }
        return C58029j.f132256h;
    }

    /* renamed from: a */
    public final void mo60271a(Runnable runnable) {
        this.f80365c.execute(runnable);
    }

    @Override // com.bytedance.sdk.p1625a.p1631b.p1632a.AbstractC22333a
    /* renamed from: a */
    public final String mo36674a(String str) {
        String str2 = this.f80364b.doGet(str).get();
        C89219l.m154716b(str2, "");
        return str2;
    }

    public AwemeAuthorizePlatformDepend(AbstractC62716h hVar) {
        this.f80363a = new WeakReference<>(hVar);
    }

    @Override // com.bytedance.sdk.p1625a.p1631b.p1632a.AbstractC22333a
    /* renamed from: a */
    public final void mo36676a(String str, JSONObject jSONObject) {
        C39162r.m79461a(str, jSONObject);
    }

    @Override // com.bytedance.sdk.p1625a.p1631b.p1632a.AbstractC22333a
    /* renamed from: a */
    public final String mo36675a(String str, Map<String, String> map) {
        String str2 = this.f80364b.doPost(str, map).get();
        C89219l.m154716b(str2, "");
        return str2;
    }
}
