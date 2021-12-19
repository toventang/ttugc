package com.p2082ss.android.sdk.webview;

import android.net.Uri;
import android.os.Build;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18337f;
import com.bytedance.ies.web.jsbridge2.AbstractC18347m;
import com.bytedance.ies.web.jsbridge2.AbstractC18354n;
import com.bytedance.ies.web.jsbridge2.AbstractC18356p;
import com.bytedance.ies.web.jsbridge2.AbstractC18357q;
import com.bytedance.ies.web.jsbridge2.AbstractC18358r;
import com.bytedance.ies.web.jsbridge2.C18326ak;
import com.bytedance.ies.web.jsbridge2.C18345k;
import com.bytedance.ies.web.jsbridge2.C18364w;
import com.bytedance.ies.web.jsbridge2.C18368x;
import com.bytedance.ies.web.jsbridge2.TimeLineEvent;
import com.bytedance.ies.web.p1285a.AbstractC18293d;
import com.bytedance.ies.web.p1285a.C18288a;
import com.google.gson.C27910f;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.sdk.webview.p2175a.C30240f;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34340m;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34346s;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.C34337k;
import com.p2082ss.android.ugc.aweme.utils.C80567ic;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.sdk.webview.e */
public final class C30248e {

    /* renamed from: j */
    public static final C30250b f72164j = new C30250b((byte) 0);

    /* renamed from: a */
    public AbstractC30232a f72165a;

    /* renamed from: b */
    public C18288a f72166b;

    /* renamed from: c */
    public boolean f72167c;

    /* renamed from: d */
    public C18364w f72168d;

    /* renamed from: e */
    public boolean f72169e;

    /* renamed from: f */
    public AbstractC30268l f72170f;

    /* renamed from: g */
    public C30275p f72171g;

    /* renamed from: h */
    public C30245c f72172h;

    /* renamed from: i */
    public final WebView f72173i;

    /* renamed from: k */
    private WebViewClient f72174k;

    /* renamed from: l */
    private WebChromeClient f72175l;

    /* renamed from: m */
    private C18368x f72176m;

    /* renamed from: n */
    private C18364w f72177n;

    /* renamed from: o */
    private final AbstractC89244h f72178o;

    /* renamed from: com.ss.android.sdk.webview.e$a */
    public enum EnumC30249a {
        PUBLIC,
        PRIVATE;

        static {
            Covode.recordClassIndex(36761);
        }
    }

    static {
        Covode.recordClassIndex(36760);
    }

    /* renamed from: a */
    public final C27910f mo53707a() {
        return (C27910f) this.f72178o.getValue();
    }

    /* renamed from: com.ss.android.sdk.webview.e$b */
    public static final class C30250b {
        static {
            Covode.recordClassIndex(36762);
        }

        private C30250b() {
        }

        public /* synthetic */ C30250b(byte b) {
            this();
        }

        /* renamed from: a */
        public static C30248e m61225a(WebView webView) {
            C89219l.m154719c(webView, "");
            return new C30248e(webView);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.sdk.webview.e$c */
    public static final class C30251c extends AbstractC89220m implements AbstractC89171a<C27910f> {

        /* renamed from: a */
        public static final C30251c f72180a = new C30251c();

        static {
            Covode.recordClassIndex(36763);
        }

        C30251c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C27910f invoke() {
            return new C27910f();
        }
    }

    /* renamed from: com.ss.android.sdk.webview.e$i */
    public static final class C30258i implements AbstractC18358r {

        /* renamed from: a */
        final /* synthetic */ C30248e f72191a;

        static {
            Covode.recordClassIndex(36770);
        }

        C30258i(C30248e eVar) {
            this.f72191a = eVar;
        }

        @Override // com.bytedance.ies.web.jsbridge2.AbstractC18358r
        /* renamed from: a */
        public final void mo29393a() {
            AbstractC30232a aVar = this.f72191a.f72165a;
            if (aVar != null) {
                aVar.mo53692e();
            }
        }
    }

    /* renamed from: com.ss.android.sdk.webview.e$g */
    public static final class C30255g implements AbstractC18356p {

        /* renamed from: a */
        final /* synthetic */ C30248e f72184a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89183m f72185b;

        /* renamed from: c */
        final /* synthetic */ List f72186c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89187q f72187d;

        static {
            Covode.recordClassIndex(36767);
        }

        @Override // com.bytedance.ies.web.jsbridge2.AbstractC18356p
        /* renamed from: a */
        public final void mo13318a(String str, C18326ak akVar) {
            AbstractC18357q.m34168a(this, str);
        }

        @Override // com.bytedance.ies.web.jsbridge2.AbstractC18356p
        /* renamed from: a */
        public final void mo13319a(String str, String str2, int i) {
            AbstractC18357q.m34169a(this, str, str2, i);
        }

        @Override // com.bytedance.ies.web.jsbridge2.AbstractC18356p
        /* renamed from: a */
        public final void mo13320a(String str, String str2, int i, String str3, C18326ak akVar) {
            AbstractC18357q.m34170b(this, str, str2, i);
        }

        /* renamed from: com.ss.android.sdk.webview.e$g$a */
        static final class CallableC30256a<V> implements Callable<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C30255g f72188a;

            /* renamed from: b */
            final /* synthetic */ String f72189b;

            static {
                Covode.recordClassIndex(36768);
            }

            CallableC30256a(C30255g gVar, String str) {
                this.f72188a = gVar;
                this.f72189b = str;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ C89391z call() {
                Toast makeText = Toast.makeText(this.f72188a.f72184a.f72173i.getContext(), this.f72189b, 1);
                if (Build.VERSION.SDK_INT == 25) {
                    C80567ic.m139657a(makeText);
                }
                makeText.show();
                return C89391z.f203057a;
            }
        }

        @Override // com.bytedance.ies.web.jsbridge2.AbstractC18356p
        /* renamed from: a */
        public final void mo13317a(String str) {
            EnumC30249a aVar;
            if (str != null) {
                AbstractC89183m mVar = this.f72185b;
                if (this.f72186c.contains(str)) {
                    aVar = EnumC30249a.PUBLIC;
                } else {
                    aVar = EnumC30249a.PRIVATE;
                }
                mVar.invoke(str, aVar);
            }
        }

        @Override // com.bytedance.ies.web.jsbridge2.AbstractC18356p
        /* renamed from: b */
        public final void mo13321b(String str, String str2, int i) {
            String a;
            EnumC30249a aVar;
            if (str2 != null) {
                AbstractC89187q qVar = this.f72187d;
                if (this.f72186c.contains(str2)) {
                    aVar = EnumC30249a.PUBLIC;
                } else {
                    aVar = EnumC30249a.PRIVATE;
                }
                qVar.invoke(str2, aVar, Integer.valueOf(i));
            }
            if (this.f72184a.f72169e) {
                if (i == 1) {
                    a = C89361p.m154852a(str + " failed to visit func: " + str2 + ", reason: " + i + ";\n                                                Permission Denied;\n                                                Enter DebugSettings->JSB and try to add secure domain for debugging\n                                            ");
                } else if (i == 2) {
                    a = C89361p.m154852a(str + " failed to visit func: " + str2 + ", reason: " + i + ";\n                                                Method not registered;\n                                            ");
                } else if (i == 3) {
                    a = C89361p.m154852a(str + " failed to visit func: " + str2 + ", reason: " + i + ";\n                                                Malformed data;\n                                            ");
                } else if (i != 4) {
                    a = C89361p.m154852a(str + " failed to visit func: " + str2 + ", reason: " + i + ";\n                                                Enter DebugSettings->JSB and try to add secure domain for debugging\n                                            ");
                } else {
                    a = C89361p.m154852a(str + " failed to visit func: " + str2 + ", reason: " + i + ";\n                                                BridgeMethod Released;\n                                            ");
                }
                C1731i.m5636a(new CallableC30256a(this, a), C1731i.f5564c);
            }
        }

        C30255g(C30248e eVar, AbstractC89183m mVar, List list, AbstractC89187q qVar) {
            this.f72184a = eVar;
            this.f72185b = mVar;
            this.f72186c = list;
            this.f72187d = qVar;
        }
    }

    /* renamed from: com.ss.android.sdk.webview.e$f */
    public static final class C30254f implements AbstractC18354n {

        /* renamed from: a */
        final /* synthetic */ C30248e f72183a;

        static {
            Covode.recordClassIndex(36766);
        }

        C30254f(C30248e eVar) {
            this.f72183a = eVar;
        }

        @Override // com.bytedance.ies.web.jsbridge2.AbstractC18354n
        /* renamed from: a */
        public final <T> String mo13334a(T t) {
            String b = this.f72183a.mo53707a().mo46674b(t);
            C89219l.m154709a((Object) b, "");
            return b;
        }

        @Override // com.bytedance.ies.web.jsbridge2.AbstractC18354n
        /* renamed from: a */
        public final <T> T mo13333a(String str, Type type) {
            C89219l.m154719c(str, "");
            C89219l.m154719c(type, "");
            return (T) this.f72183a.mo53707a().mo46671a(str, type);
        }
    }

    /* renamed from: com.ss.android.sdk.webview.e$h */
    public static final class C30257h implements AbstractC18356p {

        /* renamed from: a */
        final /* synthetic */ C30248e f72190a;

        static {
            Covode.recordClassIndex(36769);
        }

        @Override // com.bytedance.ies.web.jsbridge2.AbstractC18356p
        /* renamed from: a */
        public final void mo13317a(String str) {
        }

        @Override // com.bytedance.ies.web.jsbridge2.AbstractC18356p
        /* renamed from: a */
        public final void mo13319a(String str, String str2, int i) {
            AbstractC18357q.m34169a(this, str, str2, i);
        }

        @Override // com.bytedance.ies.web.jsbridge2.AbstractC18356p
        /* renamed from: b */
        public final void mo13321b(String str, String str2, int i) {
        }

        C30257h(C30248e eVar) {
            this.f72190a = eVar;
        }

        @Override // com.bytedance.ies.web.jsbridge2.AbstractC18356p
        /* renamed from: a */
        public final void mo13318a(String str, C18326ak akVar) {
            if (this.f72190a.f72169e) {
                C27910f fVar = new C27910f();
                List<TimeLineEvent> list = akVar.f43832a;
                if (list != null && !list.isEmpty()) {
                    fVar.mo46674b(akVar.f43832a);
                }
                List<TimeLineEvent> list2 = akVar.f43833b;
                if (list2 != null && !list2.isEmpty()) {
                    fVar.mo46674b(akVar.f43833b);
                }
                List<TimeLineEvent> list3 = akVar.f43834c;
                if (list3 != null && !list3.isEmpty()) {
                    fVar.mo46674b(akVar.f43834c);
                }
            }
        }

        @Override // com.bytedance.ies.web.jsbridge2.AbstractC18356p
        /* renamed from: a */
        public final void mo13320a(String str, String str2, int i, String str3, C18326ak akVar) {
            C34337k kVar;
            List<TimeLineEvent> list;
            boolean z;
            List<TimeLineEvent> list2;
            String b;
            String str4;
            String str5;
            List<TimeLineEvent> list3;
            List<TimeLineEvent> list4;
            List<TimeLineEvent> list5;
            C30245c cVar = this.f72190a.f72172h;
            if (cVar != null && (kVar = (C34337k) cVar.mo53698a(C34337k.class)) != null) {
                C27910f fVar = new C27910f();
                List<TimeLineEvent> list6 = null;
                if (akVar != null) {
                    list = akVar.f43832a;
                } else {
                    list = null;
                }
                if (list == null || list.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    b = "";
                } else {
                    if (akVar != null) {
                        list2 = akVar.f43832a;
                    } else {
                        list2 = null;
                    }
                    b = fVar.mo46674b(list2);
                }
                if (akVar == null || (list4 = akVar.f43833b) == null || list4.isEmpty()) {
                    str4 = "";
                } else {
                    if (akVar != null) {
                        list5 = akVar.f43833b;
                    } else {
                        list5 = null;
                    }
                    str4 = fVar.mo46674b(list5);
                }
                if (akVar == null || (list3 = akVar.f43834c) == null || list3.isEmpty()) {
                    str5 = "";
                } else {
                    if (akVar != null) {
                        list6 = akVar.f43834c;
                    }
                    str5 = fVar.mo46674b(list6);
                }
                AbstractC34346s a = kVar.mo60793a(AbstractC34340m.class);
                if (a != null) {
                    JSONObject jSONObject = new JSONObject();
                    if (str2 == null) {
                        str2 = "";
                    }
                    jSONObject.put("bridge_name", str2);
                    jSONObject.put("bridge_access", "false");
                    jSONObject.put("reason", i);
                    if (str == null) {
                        str = "";
                    }
                    jSONObject.put("url", str);
                    if (str3 == null) {
                        str3 = "";
                    }
                    jSONObject.put("log", str3);
                    jSONObject.put("jsb_sdk_init_time_line", b);
                    jSONObject.put("jsb_instance_time_line", str4);
                    jSONObject.put("jsb_call_time_line", str5);
                    a.mo60779a("jsb_call_monitor", "jsb_call_rejected", jSONObject, null, null);
                }
                if (!this.f72190a.f72169e) {
                }
            }
        }
    }

    /* renamed from: com.ss.android.sdk.webview.e$j */
    public static final class C30259j implements AbstractC18347m.AbstractC18351c {

        /* renamed from: a */
        final /* synthetic */ C30248e f72192a;

        static {
            Covode.recordClassIndex(36771);
        }

        C30259j(C30248e eVar) {
            this.f72192a = eVar;
        }

        @Override // com.bytedance.ies.web.jsbridge2.AbstractC18347m.AbstractC18351c
        /* renamed from: a */
        public final boolean mo26206a(String str) {
            if (str == null || this.f72192a.f72171g == null) {
                return false;
            }
            Uri parse = Uri.parse(str);
            HashMap<String, HashMap<String, String>> hashMap = C30275p.f72221d;
            C89219l.m154709a((Object) parse, "");
            String host = parse.getHost();
            if (hashMap != null) {
                return hashMap.containsKey(host);
            }
            throw new C89388w("null cannot be cast to non-null type");
        }

        @Override // com.bytedance.ies.web.jsbridge2.AbstractC18347m.AbstractC18351c
        /* renamed from: a */
        public final boolean mo26207a(String str, String str2) {
            C34337k kVar;
            AbstractC34346s a;
            C89219l.m154719c(str2, "");
            boolean z = false;
            if (str == null) {
                return false;
            }
            C30275p pVar = this.f72192a.f72171g;
            if (pVar != null) {
                if (str2 == null) {
                    Boolean.valueOf(false);
                }
                Uri parse = Uri.parse(str);
                HashMap<String, HashMap<String, String>> hashMap = C30275p.f72221d;
                C89219l.m154709a((Object) parse, "");
                HashMap<String, String> hashMap2 = hashMap.get(parse.getHost());
                if (hashMap2 != null) {
                    z = !hashMap2.containsKey(String.valueOf(str2));
                }
                C30245c cVar = pVar.f72225c;
                if (!(cVar == null || (kVar = (C34337k) cVar.mo53698a(C34337k.class)) == null || (a = kVar.mo60793a(AbstractC34340m.class)) == null)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(StringSet.type, "jsb");
                    jSONObject.put("bridge_name", str2);
                    jSONObject.put("bridge_access", String.valueOf(!z));
                    jSONObject.put("bridge_list", String.valueOf(C30275p.f72221d.get(parse.getHost())));
                    jSONObject.put("stage", "open_jsb_auth");
                    a.mo60779a("open_jsb_monitor", "open_jsb_auth", jSONObject, null, null);
                }
            }
            return z;
        }
    }

    /* renamed from: a */
    public final C30248e mo53708a(WebChromeClient webChromeClient) {
        C89219l.m154719c(webChromeClient, "");
        this.f72175l = webChromeClient;
        return this;
    }

    public C30248e(WebView webView) {
        C89219l.m154719c(webView, "");
        this.f72173i = webView;
        this.f72167c = true;
        this.f72178o = C89250i.m154773a((AbstractC89171a) C30251c.f72180a);
    }

    /* renamed from: a */
    public final C30248e mo53709a(WebViewClient webViewClient) {
        C89219l.m154719c(webViewClient, "");
        this.f72174k = webViewClient;
        return this;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C30248e(com.bytedance.ies.web.jsbridge2.C18364w r3) {
        /*
            r2 = this;
            java.lang.String r1 = ""
            p4600h.p4611f.p4613b.C89219l.m154719c(r3, r1)
            android.webkit.WebView r0 = r3.f43933c
            if (r0 != 0) goto L_0x000c
            p4600h.p4611f.p4613b.C89219l.m154707a()
        L_0x000c:
            p4600h.p4611f.p4613b.C89219l.m154709a(r0, r1)
            r2.<init>(r0)
            r2.f72177n = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.sdk.webview.C30248e.<init>(com.bytedance.ies.web.jsbridge2.w):void");
    }

    /* renamed from: a */
    public final C30248e mo53710a(AbstractC30232a aVar) {
        C89219l.m154719c(aVar, "");
        this.f72165a = aVar;
        return this;
    }

    /* renamed from: com.ss.android.sdk.webview.e$d */
    public static final class C30252d extends AbstractC89220m implements AbstractC89183m<String, EnumC30249a, C89391z> {

        /* renamed from: a */
        public static final C30252d f72181a = new C30252d();

        static {
            Covode.recordClassIndex(36764);
        }

        C30252d() {
            super(2);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(String str, EnumC30249a aVar) {
            C89219l.m154719c(str, "");
            C89219l.m154719c(aVar, "");
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final C30248e mo53711a(String str, AbstractC18293d dVar) {
        C18368x xVar = this.f72176m;
        if (xVar != null) {
            xVar.mo29410a(str, dVar);
        } else {
            C18288a aVar = this.f72166b;
            if (aVar != null) {
                aVar.mo29245a(str, dVar);
            }
        }
        return this;
    }

    /* renamed from: a */
    public final void mo53712a(String str, JSONObject jSONObject) {
        C18288a aVar = this.f72166b;
        if (aVar != null) {
            aVar.mo29252b(str, jSONObject);
        }
    }

    /* renamed from: com.ss.android.sdk.webview.e$e */
    public static final class C30253e extends AbstractC89220m implements AbstractC89187q<String, EnumC30249a, Integer, C89391z> {

        /* renamed from: a */
        public static final C30253e f72182a = new C30253e();

        static {
            Covode.recordClassIndex(36765);
        }

        C30253e() {
            super(3);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(String str, EnumC30249a aVar, Integer num) {
            num.intValue();
            C89219l.m154719c(str, "");
            C89219l.m154719c(aVar, "");
            return C89391z.f203057a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: com.ss.android.sdk.webview.a */
    /* JADX DEBUG: Multi-variable search result rejected for r0v20, resolved type: com.ss.android.sdk.webview.a */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ C30248e m61218a(C30248e eVar, List list, boolean z, AbstractC89183m mVar, AbstractC89187q qVar, int i) {
        C18288a aVar;
        C18288a aVar2;
        C18345k a;
        if ((i & 1) != 0) {
            list = C89070n.m154516a("host");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            mVar = C30252d.f72181a;
        }
        if ((i & 8) != 0) {
            qVar = C30253e.f72182a;
        }
        C89219l.m154719c(list, "");
        C89219l.m154719c(mVar, "");
        C89219l.m154719c(qVar, "");
        AbstractC30232a aVar3 = eVar.f72165a;
        if (aVar3 == null) {
            C89219l.m154707a();
        }
        List<String> b = aVar3.mo53686b();
        C89219l.m154709a((Object) b, "");
        if (eVar.f72167c) {
            C18364w wVar = eVar.f72177n;
            if (wVar == null) {
                a = C18364w.m34179a(eVar.f72173i);
            } else {
                a = C18364w.m34180a(wVar);
            }
            C18345k a2 = a.mo29365a().mo29370a("ToutiaoJSBridge").mo29375b(b).mo29367a(new C30254f(eVar));
            AbstractC30232a aVar4 = eVar.f72165a;
            if (aVar4 == 0) {
                C89219l.m154707a();
            }
            a2.mo29371a(aVar4.mo53678a(list, z)).mo29372a(false).mo29373b().mo29368a(new C30255g(eVar, mVar, b, qVar)).mo29374b(new C30257h(eVar)).mo29369a(new C30258i(eVar)).mo29366a(new C30259j(eVar));
            AbstractC30232a aVar5 = eVar.f72165a;
            if (aVar5 == null) {
                C89219l.m154707a();
            }
            if (aVar5.mo53690c()) {
                a.mo29376c();
            }
            eVar.f72168d = a.mo29377d();
            C30275p pVar = new C30275p(eVar.f72168d, eVar.f72172h);
            eVar.f72171g = pVar;
            pVar.f72223a = eVar.f72170f;
            C18364w wVar2 = eVar.f72168d;
            if (wVar2 != null) {
                wVar2.mo29401a("openConfig", (AbstractC18337f<?, ?>) new C30240f(eVar.f72171g, eVar.f72172h));
            }
            C18368x a3 = C18368x.m34194a(eVar.f72173i, eVar.f72168d);
            eVar.f72176m = a3;
            if (a3 == null) {
                C89219l.m154707a();
            }
            eVar.f72166b = a3.f43940a;
        } else {
            eVar.f72166b = C18288a.m34008a(eVar.f72173i);
        }
        C18288a aVar6 = eVar.f72166b;
        if (aVar6 == null) {
            C89219l.m154707a();
        }
        if (eVar.f72165a == null) {
            C89219l.m154707a();
        }
        C18288a a4 = aVar6.mo29244a(AbstractC30232a.m61185a());
        AbstractC30232a aVar7 = eVar.f72165a;
        if (aVar7 == null) {
            C89219l.m154707a();
        }
        C18288a a5 = a4.mo29243a(aVar7);
        AbstractC30232a aVar8 = eVar.f72165a;
        if (aVar8 == 0) {
            C89219l.m154707a();
        }
        C18288a a6 = a5.mo29246a(aVar8.mo53678a((List<String>) list, false));
        C89219l.m154709a((Object) a6, "");
        a6.mo29251b(b);
        WebChromeClient webChromeClient = eVar.f72175l;
        if (!(webChromeClient == null || (aVar2 = eVar.f72166b) == null)) {
            aVar2.mo29241a(webChromeClient);
        }
        WebViewClient webViewClient = eVar.f72174k;
        if (!(webViewClient == null || (aVar = eVar.f72166b) == null)) {
            aVar.mo29242a(webViewClient);
        }
        return eVar;
    }
}
