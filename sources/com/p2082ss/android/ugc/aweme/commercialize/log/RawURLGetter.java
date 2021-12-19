package com.p2082ss.android.ugc.aweme.commercialize.log;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.common.p900c.C13501b;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.cronet.p986b.C14652c;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.p1610b.AbstractC21990ad;
import com.bytedance.retrofit2.p1610b.AbstractC21993ag;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22004l;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.http.p2146a.AbstractC29926a;
import com.p2082ss.android.http.p2146a.p2147a.C29929b;
import com.p2082ss.android.http.p2146a.p2149b.C29931a;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
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

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.RawURLGetter */
public final class RawURLGetter {

    /* renamed from: a */
    public static final RawURLGetter f90108a = new RawURLGetter();

    /* renamed from: b */
    private static final AbstractC89244h f90109b = C89250i.m154773a((AbstractC89171a) C38145b.f90114a);

    /* renamed from: c */
    private static final AbstractC89244h f90110c = C89250i.m154773a((AbstractC89171a) C38146c.f90115a);

    /* renamed from: d */
    private static final AbstractC89244h f90111d = C89250i.m154773a((AbstractC89171a) C38147d.f90116a);

    /* renamed from: e */
    private static String f90112e;

    /* renamed from: f */
    private static boolean f90113f;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.RawURLGetter$RawUrlApi */
    public interface RawUrlApi {
        static {
            Covode.recordClassIndex(45621);
        }

        @AbstractC22000h
        @AbstractC21990ad(mo35784a = "vas_ad_track")
        AbstractFutureC27655q<String> doGet(@AbstractC21993ag String str, @AbstractC22004l List<C22027b> list);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.RawURLGetter$a */
    public interface AbstractC38144a {
        static {
            Covode.recordClassIndex(45622);
        }

        /* renamed from: a */
        void mo66440a(int i, boolean z, Exception exc);
    }

    /* renamed from: a */
    public static RawUrlApi m77314a() {
        return (RawUrlApi) f90109b.getValue();
    }

    /* renamed from: b */
    public static String m77319b() {
        return (String) f90110c.getValue();
    }

    /* renamed from: c */
    public static SharedPreferences m77320c() {
        return (SharedPreferences) f90111d.getValue();
    }

    private RawURLGetter() {
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.RawURLGetter$d */
    static final class C38147d extends AbstractC89220m implements AbstractC89171a<SharedPreferences> {

        /* renamed from: a */
        public static final C38147d f90116a = new C38147d();

        static {
            Covode.recordClassIndex(45625);
        }

        C38147d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SharedPreferences invoke() {
            SharePrefCache inst = SharePrefCache.inst();
            C89219l.m154716b(inst, "");
            return inst.getSharePref();
        }
    }

    /* renamed from: d */
    private static final void m77321d() {
        C17873f.m33099g().mo143289d(C38149f.f90119a);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.RawURLGetter$b */
    static final class C38145b extends AbstractC89220m implements AbstractC89171a<RawUrlApi> {

        /* renamed from: a */
        public static final C38145b f90114a = new C38145b();

        static {
            Covode.recordClassIndex(45623);
        }

        C38145b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RawUrlApi invoke() {
            return RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28829a(false).mo28832d().mo28858a(RawUrlApi.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.RawURLGetter$c */
    static final class C38146c extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C38146c f90115a = new C38146c();

        static {
            Covode.recordClassIndex(45624);
        }

        C38146c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String a = RawURLGetter.m77315a(C17867d.m33078a());
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
        Covode.recordClassIndex(45620);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.RawURLGetter$e */
    public static final class CallableC38148e<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ String f90117a;

        /* renamed from: b */
        final /* synthetic */ AbstractC38144a f90118b;

        static {
            Covode.recordClassIndex(45626);
        }

        CallableC38148e(String str, AbstractC38144a aVar) {
            this.f90117a = str;
            this.f90118b = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            boolean z;
            String a = RawURLGetter.m77316a("other");
            if (a.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            List<AbstractC29926a> c = z ? null : C89070n.m154524c(new C29931a("User-Agent", a));
            ArrayList arrayList = new ArrayList();
            if (c != null) {
                for (AbstractC29926a aVar : c) {
                    arrayList.add(new C22027b(aVar.mo52240a(), aVar.mo52241b()));
                }
            }
            try {
                RawURLGetter.m77314a().doGet(this.f90117a, arrayList).get();
                RawURLGetter.m77317a(this.f90118b, 200, true, null);
            } catch (C29929b e) {
                RawURLGetter.m77317a(this.f90118b, e.getStatusCode(), false, e);
            } catch (C14652c e2) {
                RawURLGetter.m77317a(this.f90118b, e2.getStatusCode(), false, e2);
            } catch (Exception e3) {
                RawURLGetter.m77317a(this.f90118b, 0, false, e3);
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.RawURLGetter$f */
    public static final class C38149f<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C38149f f90119a = new C38149f();

        static {
            Covode.recordClassIndex(45627);
        }

        C38149f() {
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
    public static String m77315a(Context context) {
        MethodCollector.m26663i(6552);
        if (!C13627m.m24498a(f90112e)) {
            String str = f90112e;
            MethodCollector.m26664o(6552);
            return str;
        }
        String a = C13501b.f32887a.mo21775a(context);
        f90112e = a;
        if (!C13627m.m24498a(a)) {
            String str2 = f90112e;
            MethodCollector.m26664o(6552);
            return str2;
        }
        if (!f90113f && context != null && (context instanceof Activity)) {
            f90113f = true;
            try {
                WebView webView = new WebView(context);
                WebSettings settings = webView.getSettings();
                C89219l.m154716b(settings, "");
                f90112e = settings.getUserAgentString();
                webView.destroy();
            } catch (Throwable unused) {
            }
        }
        String str3 = f90112e;
        MethodCollector.m26664o(6552);
        return str3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004f, code lost:
        if (r1 == false) goto L_0x0051;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m77316a(java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 140
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commercialize.log.RawURLGetter.m77316a(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static final void m77318a(String str, AbstractC38144a aVar) {
        C89219l.m154721d(str, "");
        C1731i.m5640b(new CallableC38148e(str, aVar), C40780g.m82241a());
    }

    /* renamed from: a */
    public static void m77317a(AbstractC38144a aVar, int i, boolean z, Exception exc) {
        if (aVar != null) {
            try {
                aVar.mo66440a(i, z, exc);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
