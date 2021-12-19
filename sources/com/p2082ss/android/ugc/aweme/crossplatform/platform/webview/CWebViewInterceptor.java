package com.p2082ss.android.ugc.aweme.crossplatform.platform.webview;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.AbstractC18099f;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.p1610b.AbstractC21993ag;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22005m;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.C40628b;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.CWebViewInterceptor */
public final class CWebViewInterceptor {

    /* renamed from: a */
    public static String f95240a;

    /* renamed from: b */
    static String f95241b;

    /* renamed from: c */
    public static final CWebViewInterceptor f95242c = new CWebViewInterceptor();

    /* renamed from: d */
    private static final AbstractC89244h f95243d = C89250i.m154773a((AbstractC89171a) C40662b.f95247a);

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.CWebViewInterceptor$Api */
    interface Api {
        static {
            Covode.recordClassIndex(48503);
        }

        @AbstractC22000h
        AbstractC21983b<String> getResponse(@AbstractC21993ag String str, @AbstractC22005m Map<String, String> map);
    }

    private CWebViewInterceptor() {
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.CWebViewInterceptor$a */
    static final class C40661a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89238e f95244a;

        /* renamed from: b */
        final /* synthetic */ Map f95245b;

        /* renamed from: c */
        final /* synthetic */ C40628b f95246c;

        static {
            Covode.recordClassIndex(48504);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40661a(C89233z.C89238e eVar, Map map, C40628b bVar) {
            super(0);
            this.f95244a = eVar;
            this.f95245b = map;
            this.f95246c = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            mo69798a();
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo69798a() {
            CWebViewInterceptor.f95241b = CWebViewInterceptor.f95240a;
            C18129a.m33747a("landing_ad", "adx_ad_load_success", String.valueOf(this.f95246c.f95106a), this.f95246c.f95114i, null).mo28897a("web_url", CWebViewInterceptor.f95240a).mo28901b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.CWebViewInterceptor$b */
    static final class C40662b extends AbstractC89220m implements AbstractC89171a<Api> {

        /* renamed from: a */
        public static final C40662b f95247a = new C40662b();

        static {
            Covode.recordClassIndex(48505);
        }

        C40662b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Api invoke() {
            AbstractC18099f d = C18097a.m33699b("https://securepubads.g.doubleclick.net/").mo28823a().mo28832d();
            C89219l.m154716b(d, "");
            return d.mo28858a(Api.class);
        }
    }

    static {
        Covode.recordClassIndex(48502);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e1 A[Catch:{ Exception -> 0x021c }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e3 A[Catch:{ Exception -> 0x021c }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0148  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.webkit.WebResourceResponse m82034a(java.lang.String r11, android.webkit.WebResourceRequest r12, com.p2082ss.android.ugc.aweme.crossplatform.p2710d.C40628b r13) {
        /*
        // Method dump skipped, instructions count: 541
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.CWebViewInterceptor.m82034a(java.lang.String, android.webkit.WebResourceRequest, com.ss.android.ugc.aweme.crossplatform.d.b):android.webkit.WebResourceResponse");
    }
}
