package com.p2082ss.android.ugc.tiktok.security.p4334b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.android.monitor.p706d.C11919c;
import com.bytedance.android.monitor.webview.C12043h;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.C16168h;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.p1184ui.common.p1187c.AbstractC17026c;
import com.bytedance.ies.bullet.p1184ui.common.p1187c.C17029d;
import com.bytedance.ies.web.jsbridge2.AbstractC18329b;
import com.bytedance.ies.web.jsbridge2.C18362v;
import com.kakao.usermgmt.StringSet;
import com.lynx.tasm.LynxView;
import com.p2082ss.android.ugc.tiktok.security.C84348a;
import com.p2082ss.android.ugc.tiktok.security.p4335c.C84366a;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.C89378p;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.tiktok.security.b.h */
public final class C84357h extends AbstractC84350a {

    /* renamed from: a */
    public static final C84357h f188595a = new C84357h();

    /* renamed from: b */
    private static final AbstractC84355f f188596b = new C84351b();

    private C84357h() {
    }

    @Override // com.p2082ss.android.ugc.tiktok.security.p4334b.AbstractC84355f
    /* renamed from: a */
    public final AbstractC84355f mo129373a() {
        return f188596b;
    }

    static {
        Covode.recordClassIndex(98309);
    }

    /* renamed from: com.ss.android.ugc.tiktok.security.b.h$f */
    static final class CallableC84363f<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ boolean f188610a;

        /* renamed from: b */
        final /* synthetic */ String f188611b;

        static {
            Covode.recordClassIndex(98315);
        }

        CallableC84363f(boolean z, String str) {
            this.f188610a = z;
            this.f188611b = str;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String str;
            if (this.f188610a) {
                str = "bullet_new";
            } else {
                str = "others";
            }
            C11919c.C11920a aVar = new C11919c.C11920a("bdx_monitor_container_coverage_lynx_pv");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("template_url", this.f188611b);
            jSONObject.put("container_type", str);
            aVar.f28482c = jSONObject;
            aVar.f28487h = true;
            aVar.f28480a = this.f188611b;
            aVar.f28488i = new C12043h();
            HybridMonitor.getInstance().customReport(aVar.mo19133a());
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.tiktok.security.b.h$c */
    static final class CallableC84360c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ String f188603a;

        /* renamed from: b */
        final /* synthetic */ LynxView f188604b;

        /* renamed from: c */
        final /* synthetic */ boolean f188605c;

        static {
            Covode.recordClassIndex(98312);
        }

        CallableC84360c(String str, LynxView lynxView, boolean z) {
            this.f188603a = str;
            this.f188604b = lynxView;
            this.f188605c = z;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C89379q<? extends C89391z> call() {
            Object obj;
            String str;
            Context context;
            Class<?> cls;
            try {
                Uri parse = Uri.parse(this.f188603a);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action", "load_url");
                LynxView lynxView = this.f188604b;
                if (lynxView == null || (cls = lynxView.getClass()) == null) {
                    str = null;
                } else {
                    str = cls.getCanonicalName();
                }
                jSONObject.put("container", str);
                if (this.f188605c) {
                    jSONObject.put(StringSet.type, "bullet");
                } else {
                    jSONObject.put(StringSet.type, "others");
                }
                LynxView lynxView2 = this.f188604b;
                if (lynxView2 != null) {
                    context = lynxView2.getContext();
                } else {
                    context = null;
                }
                C84357h.m145109a(jSONObject, context);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", this.f188603a);
                C89219l.m154716b(parse, "");
                jSONObject2.put("host", parse.getHost());
                C12290b.m22066a("hybrid_security_monitor", jSONObject, (JSONObject) null, jSONObject2);
                obj = C89379q.m157068constructorimpl(C89391z.f203057a);
            } catch (Throwable th) {
                obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
            return C89379q.m157067boximpl(obj);
        }
    }

    /* renamed from: com.ss.android.ugc.tiktok.security.b.h$d */
    static final class CallableC84361d<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ WebView f188606a;

        /* renamed from: b */
        final /* synthetic */ String f188607b;

        static {
            Covode.recordClassIndex(98313);
        }

        CallableC84361d(WebView webView, String str) {
            this.f188606a = webView;
            this.f188607b = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C89379q<? extends Integer> call() {
            Object obj;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action", "load_url");
                jSONObject.put("container", this.f188606a.getClass().getCanonicalName());
                C84357h.m145109a(jSONObject, this.f188606a.getContext());
                JSONObject jSONObject2 = new JSONObject();
                Uri parse = Uri.parse(this.f188607b);
                jSONObject2.put("url", this.f188607b);
                C89219l.m154716b(parse, "");
                jSONObject2.put("host", parse.getHost());
                C12290b.m22066a("hybrid_security_monitor", jSONObject, (JSONObject) null, jSONObject2);
                obj = C89379q.m157068constructorimpl(0);
            } catch (Throwable th) {
                obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
            return C89379q.m157067boximpl(obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tiktok.security.b.h$e */
    public static final class CallableC84362e<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ String f188608a;

        /* renamed from: b */
        final /* synthetic */ String f188609b;

        static {
            Covode.recordClassIndex(98314);
        }

        CallableC84362e(String str, String str2) {
            this.f188608a = str;
            this.f188609b = str2;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C89379q<? extends C89391z> call() {
            Object obj;
            try {
                String builder = Uri.parse(this.f188608a).buildUpon().clearQuery().toString();
                C89219l.m154716b(builder, "");
                C11919c.C11920a aVar = new C11919c.C11920a("bdx_monitor_bridge_pv");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("method_name", this.f188609b);
                jSONObject.put("_full_url", this.f188608a);
                aVar.f28482c = jSONObject;
                aVar.f28487h = true;
                aVar.f28480a = builder;
                aVar.f28488i = new C12043h();
                HybridMonitor.getInstance().customReport(aVar.mo19133a());
                obj = C89379q.m157068constructorimpl(C89391z.f203057a);
            } catch (Throwable th) {
                obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
            return C89379q.m157067boximpl(obj);
        }
    }

    /* renamed from: com.ss.android.ugc.tiktok.security.b.h$g */
    static final class CallableC84364g<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ String f188612a;

        /* renamed from: b */
        final /* synthetic */ String f188613b;

        static {
            Covode.recordClassIndex(98316);
        }

        CallableC84364g(String str, String str2) {
            this.f188612a = str;
            this.f188613b = str2;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String str;
            Throwable th;
            if (C89361p.m154874b(this.f188612a, "http", false)) {
                try {
                    str = Uri.parse(this.f188612a).buildUpon().clearQuery().toString();
                    C89219l.m154716b(str, "");
                    try {
                        C89379q.m157068constructorimpl(C89391z.f203057a);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    str = "";
                    C89379q.m157068constructorimpl(C89382r.m154941a(th));
                    C11919c.C11920a aVar = new C11919c.C11920a("bdx_monitor_container_coverage_web_pv");
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("web_url", this.f188612a);
                    jSONObject.put("webview_class", this.f188613b);
                    aVar.f28482c = jSONObject;
                    aVar.f28480a = str;
                    aVar.f28487h = true;
                    aVar.f28488i = new C12043h();
                    HybridMonitor.getInstance().customReport(aVar.mo19133a());
                    return C89391z.f203057a;
                }
                C11919c.C11920a aVar2 = new C11919c.C11920a("bdx_monitor_container_coverage_web_pv");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("web_url", this.f188612a);
                jSONObject2.put("webview_class", this.f188613b);
                aVar2.f28482c = jSONObject2;
                aVar2.f28480a = str;
                aVar2.f28487h = true;
                aVar2.f28488i = new C12043h();
                HybridMonitor.getInstance().customReport(aVar2.mo19133a());
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.tiktok.security.b.h$a */
    static final class CallableC84358a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C16168h f188597a;

        /* renamed from: b */
        final /* synthetic */ List f188598b;

        /* renamed from: c */
        final /* synthetic */ JSONObject f188599c;

        static {
            Covode.recordClassIndex(98310);
        }

        CallableC84358a(C16168h hVar, List list, JSONObject jSONObject) {
            this.f188597a = hVar;
            this.f188598b = list;
            this.f188599c = jSONObject;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C89379q<? extends C89391z> call() {
            Object obj;
            AbstractC16208i iVar;
            String str;
            Uri p_;
            String str2;
            Context context;
            T t;
            T t2;
            Class<?> cls;
            C16248b bVar;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action", "jsb_invoke");
                jSONObject.put(StringSet.type, "bullet");
                C16168h hVar = this.f188597a;
                if (hVar == null || (bVar = hVar.f38940d) == null) {
                    iVar = null;
                } else {
                    iVar = (AbstractC16208i) bVar.mo25832c(AbstractC16208i.class);
                }
                if (iVar instanceof AbstractC17026c) {
                    C17029d q_ = ((AbstractC17026c) iVar).mo26900q_();
                    if (q_ == null || (t2 = q_.f40551a) == null || (cls = t2.getClass()) == null) {
                        str2 = null;
                    } else {
                        str2 = cls.getCanonicalName();
                    }
                    jSONObject.put("container", str2);
                    C17029d q_2 = ((AbstractC17026c) iVar).mo26900q_();
                    if (q_2 == null || (t = q_2.f40551a) == null) {
                        context = null;
                    } else {
                        context = t.getContext();
                    }
                    C84357h.m145109a(jSONObject, context);
                }
                JSONObject jSONObject2 = new JSONObject();
                List list = this.f188598b;
                if (list != null && (!list.isEmpty())) {
                    jSONObject2.put(StringSet.name, this.f188598b.get(0));
                }
                jSONObject2.put("params", this.f188599c);
                if (iVar == null || (p_ = iVar.mo25780p_()) == null) {
                    str = null;
                } else {
                    str = p_.toString();
                }
                jSONObject2.put("url", str);
                C12290b.m22066a("hybrid_security_monitor", jSONObject, (JSONObject) null, jSONObject2);
                obj = C89379q.m157068constructorimpl(C89391z.f203057a);
            } catch (Throwable th) {
                obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
            return C89379q.m157067boximpl(obj);
        }
    }

    /* renamed from: com.ss.android.ugc.tiktok.security.b.h$b */
    static final class CallableC84359b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ AbstractC18329b f188600a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f188601b;

        /* renamed from: c */
        final /* synthetic */ C18362v f188602c;

        static {
            Covode.recordClassIndex(98311);
        }

        CallableC84359b(AbstractC18329b bVar, C89233z.C89238e eVar, C18362v vVar) {
            this.f188600a = bVar;
            this.f188601b = eVar;
            this.f188602c = vVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C89379q<? extends C89391z> call() {
            Object obj;
            Context context;
            View b;
            View b2;
            Class<?> cls;
            String canonicalName;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action", "jsb_invoke");
                AbstractC18329b bVar = this.f188600a;
                if (!(bVar == null || (b2 = bVar.mo16240b()) == null || (cls = b2.getClass()) == null || (canonicalName = cls.getCanonicalName()) == null)) {
                    jSONObject.put("container", canonicalName);
                    if (C89361p.m154929e((CharSequence) canonicalName, (CharSequence) "bullet")) {
                        jSONObject.put(StringSet.type, "bullet");
                    } else {
                        jSONObject.put(StringSet.type, "others");
                    }
                }
                AbstractC18329b bVar2 = this.f188600a;
                if (bVar2 == null || (b = bVar2.mo16240b()) == null) {
                    context = null;
                } else {
                    context = b.getContext();
                }
                C84357h.m145109a(jSONObject, context);
                JSONObject jSONObject2 = new JSONObject();
                if (!TextUtils.isEmpty(this.f188601b.element)) {
                    jSONObject2.put("url", this.f188601b.element);
                }
                C18362v vVar = this.f188602c;
                if (vVar != null) {
                    jSONObject2.put(StringSet.name, vVar.f43915d);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("namespace", this.f188602c.f43918g);
                    jSONObject3.put("JSSDK", this.f188602c.f43913b);
                    jSONObject3.put("params", this.f188602c.f43916e);
                    jSONObject3.put("__msg_type", this.f188602c.f43914c);
                    jSONObject3.put("__callback_id", this.f188602c.f43917f);
                    jSONObject3.put("__iframe_url", this.f188602c.f43919h);
                    jSONObject2.put("params", jSONObject3);
                }
                C12290b.m22066a("hybrid_security_monitor", jSONObject, (JSONObject) null, jSONObject2);
                obj = C89379q.m157068constructorimpl(C89391z.f203057a);
            } catch (Throwable th) {
                obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
            return C89379q.m157067boximpl(obj);
        }
    }

    /* renamed from: a */
    private static String m145107a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static void m145108a(String str, String str2) {
        C1731i.m5640b(new CallableC84362e(str2, str), C1731i.f5562a);
    }

    @Override // com.p2082ss.android.ugc.tiktok.security.p4334b.AbstractC84354e, com.p2082ss.android.ugc.tiktok.security.p4334b.AbstractC84350a
    /* renamed from: a */
    public final C89378p<String, Boolean> mo129369a(String str, LynxView lynxView) {
        Object obj;
        String str2;
        if (lynxView != null) {
            obj = lynxView.getTag(R.id.zr);
        } else {
            obj = null;
        }
        boolean a = C89219l.m154714a((Object) "bullet", obj);
        if (str == null) {
            str2 = "AndroidNotSet";
        } else {
            str2 = str;
        }
        C1731i.m5640b(new CallableC84363f(a, str2), C1731i.f5562a);
        if (!C84366a.m145125a()) {
            return super.mo129369a(str, lynxView);
        }
        C1731i.m5640b(new CallableC84360c(str, lynxView, a), C1731i.f5562a);
        return super.mo129369a(str, lynxView);
    }

    /* renamed from: a */
    public static void m145109a(JSONObject jSONObject, Context context) {
        String str;
        Object data;
        String str2 = null;
        if (context == null) {
            context = null;
        } else if (context instanceof MutableContextWrapper) {
            context = ((MutableContextWrapper) context).getBaseContext();
        }
        if ((context instanceof Activity) && context != null) {
            Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
            Activity activity = (Activity) context;
            Intent intent = activity.getIntent();
            if (intent != null) {
                str = m145107a(intent, "key_calling_context");
            } else {
                str = null;
            }
            Intent intent2 = activity.getIntent();
            if (intent2 != null) {
                str2 = m145107a(intent2, "enter_from");
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("scene", str2);
            } else if (str != null && C89361p.m154929e((CharSequence) str, (CharSequence) "DeepLink")) {
                jSONObject.put("scene", "deeplink");
            }
            jSONObject.put("lastPage", str);
            jSONObject.put("landing", activity.getClass().getCanonicalName());
            Intent intent3 = activity.getIntent();
            if (intent3 != null && (data = intent3.getData()) != null) {
                jSONObject.put("uri", data);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.tiktok.security.p4334b.AbstractC84353d, com.p2082ss.android.ugc.tiktok.security.p4334b.AbstractC84350a
    /* renamed from: a */
    public final String mo129370a(WebView webView, String str) {
        C89219l.m154721d(webView, "");
        if (str != null) {
            String name = webView.getClass().getName();
            C89219l.m154716b(name, "");
            C1731i.m5640b(new CallableC84364g(str, name), C1731i.f5562a);
        }
        if (!C84366a.m145125a()) {
            return super.mo129370a(webView, str);
        }
        if (str != null && !C89361p.m154874b(str, "http", false)) {
            return super.mo129370a(webView, str);
        }
        C1731i.m5640b(new CallableC84361d(webView, str), C1731i.f5562a);
        return super.mo129370a(webView, str);
    }

    @Override // com.p2082ss.android.ugc.tiktok.security.p4334b.AbstractC84352c, com.p2082ss.android.ugc.tiktok.security.p4334b.AbstractC84350a
    /* renamed from: a */
    public final void mo129372a(AbstractC18329b bVar, C18362v vVar) {
        C89391z zVar;
        String str;
        View b;
        C89233z.C89238e eVar = new C89233z.C89238e();
        T t = (T) "";
        eVar.element = t;
        try {
            C84348a.m145092a(bVar, vVar);
            if (!(bVar == null || (b = bVar.mo16240b()) == null)) {
                if (b instanceof WebView) {
                    String url = ((WebView) b).getUrl();
                    if (url != null) {
                        t = url;
                    }
                    eVar.element = t;
                } else if (b instanceof LynxView) {
                    T t2 = (T) ((LynxView) b).getTemplateUrl();
                    if (t2 == null) {
                        t2 = (T) "LiveLynx";
                    }
                    eVar.element = t2;
                }
            }
            if (vVar == null || (str = vVar.f43915d) == null) {
                zVar = null;
            } else {
                m145108a(str, (String) eVar.element);
                zVar = C89391z.f203057a;
            }
            C89379q.m157068constructorimpl(zVar);
        } catch (Throwable th) {
            C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        if (C84366a.m145125a()) {
            C1731i.m5640b(new CallableC84359b(bVar, eVar, vVar), C1731i.f5562a);
        }
    }

    @Override // com.p2082ss.android.ugc.tiktok.security.p4334b.AbstractC84352c, com.p2082ss.android.ugc.tiktok.security.p4334b.AbstractC84350a
    /* renamed from: a */
    public final void mo129371a(C16168h hVar, List<String> list, JSONObject jSONObject) {
        try {
            new StringBuilder("handle: ").append(hVar).append(' ').append(list).append(' ').append(jSONObject);
            C89379q.m157068constructorimpl(C89391z.f203057a);
        } catch (Throwable th) {
            C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        if (C84366a.m145125a()) {
            C1731i.m5640b(new CallableC84358a(hVar, list, jSONObject), C1731i.f5562a);
        }
    }
}
