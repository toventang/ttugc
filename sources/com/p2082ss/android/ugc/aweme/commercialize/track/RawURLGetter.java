package com.p2082ss.android.ugc.aweme.commercialize.track;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.common.p900c.C13501b;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.p1610b.AbstractC21990ad;
import com.bytedance.retrofit2.p1610b.AbstractC21993ag;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22004l;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.http.p2146a.AbstractC29926a;
import com.p2082ss.android.http.p2146a.p2147a.C29929b;
import com.p2082ss.android.http.p2146a.p2149b.C29931a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.track.RawURLGetter */
public final class RawURLGetter {

    /* renamed from: a */
    static final AbstractC89244h f91025a = C89250i.m154773a((AbstractC89171a) C38520b.f91031a);

    /* renamed from: b */
    public static final RawURLGetter f91026b = new RawURLGetter();

    /* renamed from: c */
    private static final AbstractC89244h f91027c = C89250i.m154773a((AbstractC89171a) C38521c.f91032a);

    /* renamed from: d */
    private static final AbstractC89244h f91028d = C89250i.m154773a((AbstractC89171a) C38522d.f91033a);

    /* renamed from: e */
    private static String f91029e;

    /* renamed from: f */
    private static boolean f91030f;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.track.RawURLGetter$RawUrlApi */
    public interface RawUrlApi {
        static {
            Covode.recordClassIndex(46047);
        }

        @AbstractC22000h
        @AbstractC21990ad(mo35784a = "vas_ad_track")
        AbstractFutureC27655q<String> doGet(@AbstractC21993ag String str, @AbstractC22004l List<C22027b> list);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.track.RawURLGetter$a */
    public interface AbstractC38519a {
        static {
            Covode.recordClassIndex(46048);
        }

        /* renamed from: a */
        void mo67055a(int i, boolean z, Exception exc);
    }

    /* renamed from: a */
    public static String m78118a() {
        return (String) f91027c.getValue();
    }

    /* renamed from: b */
    public static SharedPreferences m78122b() {
        return (SharedPreferences) f91028d.getValue();
    }

    private RawURLGetter() {
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.track.RawURLGetter$d */
    static final class C38522d extends AbstractC89220m implements AbstractC89171a<SharedPreferences> {

        /* renamed from: a */
        public static final C38522d f91033a = new C38522d();

        static {
            Covode.recordClassIndex(46051);
        }

        C38522d() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SharedPreferences invoke() {
            return C38525a.f91037a.mo65635b();
        }
    }

    /* renamed from: d */
    private static final void m78124d() {
        C17873f.m33099g().mo143289d(C38524f.f91036a);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.track.RawURLGetter$b */
    static final class C38520b extends AbstractC89220m implements AbstractC89171a<RawUrlApi> {

        /* renamed from: a */
        public static final C38520b f91031a = new C38520b();

        static {
            Covode.recordClassIndex(46049);
        }

        C38520b() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, com.ss.android.ugc.aweme.commercialize.track.RawURLGetter$RawUrlApi] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ com.p2082ss.android.ugc.aweme.commercialize.track.RawURLGetter.RawUrlApi invoke() {
            /*
                r2 = this;
                com.bytedance.ies.ugc.aweme.network.IRetrofitFactory r1 = com.bytedance.ies.ugc.aweme.network.RetrofitFactory.m33635a()
                com.ss.android.ugc.aweme.commercialize.track.a r0 = com.p2082ss.android.ugc.aweme.commercialize.track.C38525a.f91037a
                java.lang.String r0 = r0.mo65632a()
                com.bytedance.ies.ugc.aweme.network.e r1 = r1.mo28817b(r0)
                r0 = 0
                com.bytedance.ies.ugc.aweme.network.e r0 = r1.mo28829a(r0)
                com.bytedance.ies.ugc.aweme.network.f r1 = r0.mo28832d()
                java.lang.Class<com.ss.android.ugc.aweme.commercialize.track.RawURLGetter$RawUrlApi> r0 = com.p2082ss.android.ugc.aweme.commercialize.track.RawURLGetter.RawUrlApi.class
                java.lang.Object r0 = r1.mo28858a(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commercialize.track.RawURLGetter.C38520b.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.track.RawURLGetter$c */
    static final class C38521c extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C38521c f91032a = new C38521c();

        static {
            Covode.recordClassIndex(46050);
        }

        C38521c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String a = RawURLGetter.m78119a(C17867d.m33078a());
            if (a != null && a.length() != 0) {
                return a;
            }
            String property = System.getProperty("http.agent");
            if (property == null) {
                return "";
            }
            return property;
        }
    }

    static {
        Covode.recordClassIndex(46046);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.track.RawURLGetter$e */
    public static final class CallableC38523e<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ String f91034a;

        /* renamed from: b */
        final /* synthetic */ AbstractC38519a f91035b;

        static {
            Covode.recordClassIndex(46052);
        }

        CallableC38523e(String str, AbstractC38519a aVar) {
            this.f91034a = str;
            this.f91035b = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            boolean z;
            String c = RawURLGetter.m78123c();
            if (c.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            List<AbstractC29926a> c2 = z ? null : C89070n.m154524c(new C29931a("User-Agent", c));
            ArrayList arrayList = new ArrayList();
            if (c2 != null) {
                for (AbstractC29926a aVar : c2) {
                    arrayList.add(new C22027b(aVar.mo52240a(), aVar.mo52241b()));
                }
            }
            try {
                ((RawUrlApi) RawURLGetter.f91025a.getValue()).doGet(this.f91034a, arrayList).get();
                RawURLGetter.m78120a(this.f91035b, 200, true, null);
            } catch (C29929b e) {
                RawURLGetter.m78120a(this.f91035b, e.getStatusCode(), false, e);
            } catch (Exception e2) {
                RawURLGetter.m78120a(this.f91035b, C38525a.f91037a.mo65631a(e2), false, e2);
            }
            return C89391z.f203057a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004e, code lost:
        if (r1 == false) goto L_0x0050;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.String m78123c() {
        /*
        // Method dump skipped, instructions count: 128
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commercialize.track.RawURLGetter.m78123c():java.lang.String");
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.track.RawURLGetter$f */
    public static final class C38524f<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C38524f f91036a = new C38524f();

        static {
            Covode.recordClassIndex(46053);
        }

        C38524f() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                new C58221f.C58224c().mo95703b((AbstractC58264w) new RawURLGetter$updateUa$1$1()).mo95706a();
            }
        }
    }

    /* renamed from: a */
    public static String m78119a(Context context) {
        MethodCollector.m26663i(7619);
        if (!C13627m.m24498a(f91029e)) {
            String str = f91029e;
            MethodCollector.m26664o(7619);
            return str;
        }
        String a = C13501b.f32887a.mo21775a(context);
        f91029e = a;
        if (!C13627m.m24498a(a)) {
            String str2 = f91029e;
            MethodCollector.m26664o(7619);
            return str2;
        }
        if (!f91030f && context != null && (context instanceof Activity)) {
            f91030f = true;
            try {
                WebView webView = new WebView(context);
                WebSettings settings = webView.getSettings();
                C89219l.m154716b(settings, "");
                f91029e = settings.getUserAgentString();
                webView.destroy();
            } catch (Throwable unused) {
            }
        }
        String str3 = f91029e;
        MethodCollector.m26664o(7619);
        return str3;
    }

    /* renamed from: a */
    public static final void m78121a(String str, AbstractC38519a aVar) {
        C89219l.m154721d(str, "");
        C1731i.m5640b(new CallableC38523e(str, aVar), C40780g.m82241a());
    }

    /* renamed from: a */
    public static void m78120a(AbstractC38519a aVar, int i, boolean z, Exception exc) {
        if (aVar != null) {
            try {
                aVar.mo67055a(i, z, exc);
            } catch (Throwable unused) {
            }
        }
    }
}
