package com.p2082ss.android.ugc.aweme.web.jsbridge;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.C18147f;
import com.bytedance.ies.web.p1285a.AbstractC18293d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38182f;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38189j;
import com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38757n;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.CardStruct;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.a */
public final class C81570a implements AbstractC18293d {

    /* renamed from: c */
    public static CardStruct f182403c;

    /* renamed from: d */
    public static CardStruct f182404d;

    /* renamed from: e */
    public static CardStruct f182405e;

    /* renamed from: f */
    public static int f182406f;

    /* renamed from: g */
    public static Aweme f182407g;

    /* renamed from: h */
    public static Map<String, String> f182408h = new LinkedHashMap();

    /* renamed from: i */
    public static final C81571a f182409i = new C81571a((byte) 0);

    /* renamed from: a */
    public int f182410a;

    /* renamed from: b */
    public final WeakReference<Context> f182411b;

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.a$a */
    public static final class C81571a {
        static {
            Covode.recordClassIndex(94968);
        }

        private C81571a() {
        }

        public /* synthetic */ C81571a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(94967);
    }

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.a$b */
    static final class CallableC81572b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ String f182412a;

        /* renamed from: b */
        final /* synthetic */ String f182413b;

        /* renamed from: c */
        final /* synthetic */ JSONObject f182414c;

        /* renamed from: d */
        final /* synthetic */ C18147f f182415d;

        static {
            Covode.recordClassIndex(94969);
        }

        CallableC81572b(String str, String str2, JSONObject jSONObject, C18147f fVar) {
            this.f182412a = str;
            this.f182413b = str2;
            this.f182414c = jSONObject;
            this.f182415d = fVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            Integer num;
            int i = 1;
            C33744d a = new C33744d().mo59980a("enableRichTask", 1).mo59983a("openUrl", this.f182412a).mo59983a("webUrl", this.f182413b).mo59980a("webStatus", this.f182414c.optInt("web_status")).mo59980a("openStatus", this.f182414c.optInt("open_status"));
            C18147f fVar = this.f182415d;
            if (fVar == null || !fVar.f43208a) {
                i = 0;
            }
            C33744d a2 = a.mo59980a("isComplete", i);
            C18147f fVar2 = this.f182415d;
            String str = null;
            if (fVar2 != null) {
                num = Integer.valueOf(fVar2.f43209b);
            } else {
                num = null;
            }
            C33744d a3 = a2.mo59982a("processTaskType", num);
            C18147f fVar3 = this.f182415d;
            if (fVar3 != null) {
                str = fVar3.f43210c;
            }
            C39162r.m79460a("ad_card_click_method", a3.mo59983a("errorMsg", str).f79943a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.a$d */
    static final class CallableC81574d<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ String f182417a;

        /* renamed from: b */
        final /* synthetic */ String f182418b;

        /* renamed from: c */
        final /* synthetic */ JSONObject f182419c;

        static {
            Covode.recordClassIndex(94971);
        }

        CallableC81574d(String str, String str2, JSONObject jSONObject) {
            this.f182417a = str;
            this.f182418b = str2;
            this.f182419c = jSONObject;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            C39162r.m79460a("ad_card_click_method", new C33744d().mo59980a("enableRichTask", 0).mo59983a("openUrl", this.f182417a).mo59983a("webUrl", this.f182418b).mo59980a("webStatus", this.f182419c.optInt("web_status")).mo59980a("openStatus", this.f182419c.optInt("open_status")).f79943a);
            return C89391z.f203057a;
        }
    }

    public C81570a(WeakReference<Context> weakReference) {
        C89219l.m154721d(weakReference, "");
        this.f182411b = weakReference;
    }

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.a$c */
    static final class C81573c implements AbstractC38757n.AbstractC38758a {

        /* renamed from: a */
        final /* synthetic */ C81570a f182416a;

        static {
            Covode.recordClassIndex(94970);
        }

        C81573c(C81570a aVar) {
            this.f182416a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38757n.AbstractC38758a
        public final void sendLog(boolean z) {
            AwemeRawAd awemeRawAd;
            if (z) {
                Context context = this.f182416a.f182411b.get();
                if (context == null) {
                    context = C17867d.m33078a();
                }
                C38189j.m77521d(context, C81570a.f182407g);
                return;
            }
            Context context2 = this.f182416a.f182411b.get();
            if (context2 == null) {
                context2 = C17867d.m33078a();
            }
            C38189j.m77525e(context2, C81570a.f182407g);
            Aweme aweme = C81570a.f182407g;
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            C18129a.m33746a("draw_ad", "deeplink_failed", awemeRawAd).mo28902c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.a$e */
    static final class C81575e extends AbstractC89220m implements AbstractC89183m<C38182f.C38184b, Boolean, C38182f.C38184b> {

        /* renamed from: a */
        public static final C81575e f182420a = new C81575e();

        static {
            Covode.recordClassIndex(94972);
        }

        C81575e() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C38182f.C38184b invoke(C38182f.C38184b bVar, Boolean bool) {
            C38182f.C38184b a;
            C38182f.C38184b bVar2 = bVar;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar2, "");
            if (booleanValue) {
                a = bVar2.mo66497b(C81570a.f182407g);
            } else {
                a = bVar2.mo66488a(C81570a.f182407g);
            }
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.a$f */
    static final class C81576f extends AbstractC89220m implements AbstractC89183m<C38182f.C38184b, Boolean, C38182f.C38184b> {

        /* renamed from: a */
        public static final C81576f f182421a = new C81576f();

        static {
            Covode.recordClassIndex(94973);
        }

        C81576f() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C38182f.C38184b invoke(C38182f.C38184b bVar, Boolean bool) {
            C38182f.C38184b a;
            C38182f.C38184b bVar2 = bVar;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar2, "");
            if (booleanValue) {
                a = bVar2.mo66497b(C81570a.f182407g);
            } else {
                a = bVar2.mo66488a(C81570a.f182407g);
            }
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: a */
    private static Object m141438a(Activity activity, String str) {
        Object obj;
        MethodCollector.m26663i(8342);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = activity.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = activity.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = activity.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(8342);
                }
            }
        } else {
            obj = activity.getSystemService(str);
        }
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:95:0x028a, code lost:
        if (r2 != null) goto L_0x028c;
     */
    @Override // com.bytedance.ies.web.p1285a.AbstractC18293d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void call(com.bytedance.ies.web.p1285a.C18297h r22, org.json.JSONObject r23) {
        /*
        // Method dump skipped, instructions count: 1874
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.web.jsbridge.C81570a.call(com.bytedance.ies.web.a.h, org.json.JSONObject):void");
    }
}
