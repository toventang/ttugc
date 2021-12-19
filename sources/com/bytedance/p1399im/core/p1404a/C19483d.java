package com.bytedance.p1399im.core.p1404a;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1399im.core.internal.C19738a;
import com.bytedance.p1399im.core.internal.p1419a.C19749c;
import com.bytedance.p1399im.core.internal.p1419a.C19777i;
import com.bytedance.p1399im.core.internal.p1419a.p1420a.C19741a;
import com.bytedance.p1399im.core.internal.p1419a.p1420a.C19742b;
import com.bytedance.p1399im.core.internal.p1419a.p1421b.C19745a;
import com.bytedance.p1399im.core.internal.p1427b.C19786a;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.C19844am;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.C19845an;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.C19868f;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.C19930x;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.C19935y;
import com.bytedance.p1399im.core.internal.p1430c.C19946a;
import com.bytedance.p1399im.core.internal.p1431d.C19967c;
import com.bytedance.p1399im.core.internal.p1431d.C19978k;
import com.bytedance.p1399im.core.internal.p1431d.p1432a.AbstractC19950a;
import com.bytedance.p1399im.core.internal.p1431d.p1432a.C19951b;
import com.bytedance.p1399im.core.internal.p1431d.p1433b.AbstractC19965d;
import com.bytedance.p1399im.core.internal.p1431d.p1433b.EnumC19964c;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c;
import com.bytedance.p1399im.core.internal.p1434e.C19983a;
import com.bytedance.p1399im.core.internal.p1434e.RunnableC19987d;
import com.bytedance.p1399im.core.internal.utils.AbstractC20003k;
import com.bytedance.p1399im.core.internal.utils.C19996e;
import com.bytedance.p1399im.core.internal.utils.C20002j;
import com.bytedance.p1399im.core.internal.utils.C20004l;
import com.bytedance.p1399im.core.internal.utils.C20014q;
import com.bytedance.p1399im.core.internal.utils.C20041s;
import com.bytedance.p1399im.core.internal.utils.C20043t;
import com.bytedance.p1399im.core.internal.utils.C20045u;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1406b.C19505b;
import com.bytedance.p1399im.core.p1407c.AbstractC19506a;
import com.bytedance.p1399im.core.p1407c.AbstractC19508c;
import com.bytedance.p1399im.core.p1407c.C19509d;
import com.bytedance.p1399im.core.p1407c.C19510e;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1407c.C19517i;
import com.bytedance.p1399im.core.p1407c.C19518j;
import com.bytedance.p1399im.core.p1408d.C19532ad;
import com.bytedance.p1399im.core.p1408d.C19607bc;
import com.bytedance.p1399im.core.p1408d.C19609be;
import com.bytedance.p1399im.core.p1408d.C19610bf;
import com.bytedance.p1399im.core.p1408d.C19618bg;
import com.bytedance.p1399im.core.p1408d.C19631f;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19640j;
import com.bytedance.p1399im.core.p1408d.C19672u;
import com.bytedance.p1399im.core.p1408d.p1409a.C19521a;
import com.bytedance.p1399im.core.p1412e.C19679a;
import com.bytedance.p1399im.core.p1413f.C19682a;
import com.bytedance.p1399im.core.p1415g.C19696b;
import com.bytedance.p1399im.core.p1415g.C19699c;
import com.bytedance.p1399im.core.p1416h.AbstractC19704c;
import com.bytedance.p1399im.core.p1416h.C19705d;
import com.bytedance.p1399im.core.p1417i.C19730f;
import com.bytedance.p1399im.core.proto.CheckMessagePerUserRequestBody;
import com.bytedance.p1399im.core.proto.InboxMessagesPerUser;
import com.bytedance.p1399im.core.proto.RequestBody;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.im.core.a.d */
public final class C19483d {

    /* renamed from: k */
    private static C19483d f46155k;

    /* renamed from: a */
    public Context f46156a;

    /* renamed from: b */
    public AbstractC19481b f46157b = new C19488a((byte) 0);

    /* renamed from: c */
    public AbstractC19506a f46158c;

    /* renamed from: d */
    public volatile boolean f46159d;

    /* renamed from: e */
    public volatile boolean f46160e;

    /* renamed from: f */
    public Comparator<C19638h> f46161f;

    /* renamed from: g */
    public AbstractC19501o f46162g;

    /* renamed from: h */
    public AbstractC19495i f46163h;

    /* renamed from: i */
    public AbstractC19494h f46164i;

    /* renamed from: j */
    public boolean f46165j = false;

    /* renamed from: l */
    private C19492f f46166l;

    /* renamed from: m */
    private volatile boolean f46167m = false;

    /* renamed from: n */
    private final Map<Integer, Runnable> f46168n = new HashMap();

    /* renamed from: o */
    private long f46169o;

    /* renamed from: p */
    private String f46170p;

    /* renamed from: q */
    private Handler f46171q = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(22327);
    }

    /* renamed from: com.bytedance.im.core.a.d$a */
    static class C19488a extends AbstractC19477a {
        static {
            Covode.recordClassIndex(22332);
        }

        @Override // com.bytedance.p1399im.core.p1404a.AbstractC19481b
        /* renamed from: a */
        public final long mo27953a() {
            return -1;
        }

        @Override // com.bytedance.p1399im.core.p1404a.AbstractC19477a, com.bytedance.p1399im.core.p1404a.AbstractC19481b
        /* renamed from: a */
        public final AbstractC20003k mo27954a(String str) {
            return null;
        }

        @Override // com.bytedance.p1399im.core.p1404a.AbstractC19481b
        /* renamed from: a */
        public final void mo27955a(int i) {
        }

        @Override // com.bytedance.p1399im.core.p1404a.AbstractC19481b
        /* renamed from: a */
        public final void mo27956a(int i, int i2) {
        }

        @Override // com.bytedance.p1399im.core.p1404a.AbstractC19481b
        /* renamed from: a */
        public final void mo27957a(int i, long j, String str, byte[] bArr) {
        }

        @Override // com.bytedance.p1399im.core.p1404a.AbstractC19481b
        /* renamed from: a */
        public final void mo27958a(C19951b bVar, AbstractC19950a aVar) {
        }

        @Override // com.bytedance.p1399im.core.p1404a.AbstractC19477a, com.bytedance.p1399im.core.p1404a.AbstractC19481b
        /* renamed from: a */
        public final void mo27959a(C19978k kVar) {
        }

        @Override // com.bytedance.p1399im.core.p1404a.AbstractC19477a, com.bytedance.p1399im.core.p1404a.AbstractC19481b
        /* renamed from: b */
        public final AbstractC19704c mo27960b() {
            return null;
        }

        @Override // com.bytedance.p1399im.core.p1404a.AbstractC19481b
        /* renamed from: b */
        public final void mo27961b(int i, int i2) {
        }

        @Override // com.bytedance.p1399im.core.p1404a.AbstractC19481b
        /* renamed from: c */
        public final String mo27962c() {
            return "";
        }

        @Override // com.bytedance.p1399im.core.p1404a.AbstractC19481b
        /* renamed from: d */
        public final String mo27963d() {
            return "";
        }

        @Override // com.bytedance.p1399im.core.p1404a.AbstractC19481b
        /* renamed from: e */
        public final boolean mo27964e() {
            return false;
        }

        @Override // com.bytedance.p1399im.core.p1404a.AbstractC19481b
        /* renamed from: f */
        public final String mo27965f() {
            return "";
        }

        @Override // com.bytedance.p1399im.core.p1404a.AbstractC19481b
        /* renamed from: g */
        public final boolean mo27966g() {
            return true;
        }

        @Override // com.bytedance.p1399im.core.p1404a.AbstractC19481b
        /* renamed from: h */
        public final int mo27967h() {
            return -1;
        }

        @Override // com.bytedance.p1399im.core.p1404a.AbstractC19481b
        /* renamed from: i */
        public final boolean mo27968i() {
            return false;
        }

        @Override // com.bytedance.p1399im.core.p1404a.AbstractC19477a, com.bytedance.p1399im.core.p1404a.AbstractC19481b
        /* renamed from: j */
        public final AbstractC19482c mo27969j() {
            return null;
        }

        @Override // com.bytedance.p1399im.core.p1404a.AbstractC19477a, com.bytedance.p1399im.core.p1404a.AbstractC19481b
        /* renamed from: k */
        public final Map<String, String> mo27970k() {
            return null;
        }

        @Override // com.bytedance.p1399im.core.p1404a.AbstractC19477a, com.bytedance.p1399im.core.p1404a.AbstractC19481b
        /* renamed from: l */
        public final void mo27971l() {
        }

        @Override // com.bytedance.p1399im.core.p1404a.AbstractC19477a, com.bytedance.p1399im.core.p1404a.AbstractC19481b
        /* renamed from: m */
        public final boolean mo27972m() {
            return false;
        }

        @Override // com.bytedance.p1399im.core.p1404a.AbstractC19477a, com.bytedance.p1399im.core.p1404a.AbstractC19481b
        /* renamed from: n */
        public final boolean mo27973n() {
            return false;
        }

        @Override // com.bytedance.p1399im.core.p1404a.AbstractC19477a, com.bytedance.p1399im.core.p1404a.AbstractC19481b
        /* renamed from: o */
        public final boolean mo27974o() {
            return false;
        }

        private C19488a() {
        }

        /* synthetic */ C19488a(byte b) {
            this();
        }
    }

    /* renamed from: b */
    public final C19492f mo31141b() {
        C19492f fVar = this.f46166l;
        if (fVar != null) {
            return fVar;
        }
        return new C19492f();
    }

    /* renamed from: e */
    public final synchronized void mo31144e() {
        MethodCollector.m26663i(5366);
        mo31137a(6);
        MethodCollector.m26664o(5366);
    }

    private C19483d() {
        C19679a.f46791a = new C19679a() {
            /* class com.bytedance.p1399im.core.p1412e.C19680b.C196811 */

            static {
                Covode.recordClassIndex(22525);
            }

            @Override // com.bytedance.p1399im.core.p1412e.C19679a
            /* renamed from: b */
            public final long mo31632b() {
                return C19483d.m36365a().f46157b.mo27953a();
            }

            @Override // com.bytedance.p1399im.core.p1412e.C19679a
            /* renamed from: c */
            public final String mo31633c() {
                return C19483d.m36365a().f46157b.mo27962c();
            }

            @Override // com.bytedance.p1399im.core.p1412e.C19679a
            /* renamed from: d */
            public final boolean mo31634d() {
                return C19483d.m36365a().mo31141b().f46264d;
            }
        };
    }

    /* renamed from: a */
    public static C19483d m36365a() {
        MethodCollector.m26663i(5089);
        if (f46155k == null) {
            synchronized (C19483d.class) {
                try {
                    if (f46155k == null) {
                        f46155k = new C19483d();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5089);
                    throw th;
                }
            }
        }
        C19483d dVar = f46155k;
        MethodCollector.m26664o(5089);
        return dVar;
    }

    /* renamed from: d */
    public final synchronized void mo31143d() {
        MethodCollector.m26663i(5261);
        C19512f.m36457b("imsdk", "IMClient logout", (Throwable) null);
        try {
            this.f46159d = false;
            this.f46167m = false;
            C19610bf.f46606b = null;
            C19930x.m37536a();
            new C19844am();
            C19930x a = C19930x.m37536a();
            a.f47384b = false;
            a.f47383a.removeCallbacksAndMessages(null);
            m36367h();
            C20004l.m37794a().f47547d = -1;
            C19946a.m37584a();
            C19946a.f47436b = false;
            C19946a.f47437c = true;
            C19610bf.f46606b = null;
            C19618bg.f46617b = null;
            C19518j.f46330a.removeCallbacks(C19518j.f46331b);
            C19631f.f46654b.clear();
            C19631f.f46655c = false;
            MethodCollector.m26664o(5261);
        } catch (Throwable th) {
            C19512f.m36457b("imsdk", "IMClient logout error", th);
            C19696b.m36826a(false, th, this.f46169o, this.f46170p, this.f46156a);
            C19510e.m36439a(th);
            MethodCollector.m26664o(5261);
        }
    }

    /* renamed from: g */
    public final void mo31146g() {
        if (this.f46157b != null && this.f46156a != null) {
            C19512f.m36457b("imsdk", "onWsConnFailed", new Exception());
            if (m36365a().f46159d && (C19738a.m36936b() || C19738a.m36946l())) {
                if (C19738a.m36946l()) {
                    C19682a.f46793e = 10;
                } else {
                    C19682a.f46793e = 8;
                }
                C19682a.m36780a().mo31636c();
            }
            this.f46165j = false;
        }
    }

    /* renamed from: f */
    public final void mo31145f() {
        if (!this.f46167m) {
            this.f46167m = true;
            final int i = mo31141b().f46249an;
            if (i <= 0) {
                C19512f.m36457b("imsdk", "IMClient checkRecover version invalid:".concat(String.valueOf(i)), (Throwable) null);
                return;
            }
            C20041s.m37876a();
            int a = C20041s.f47627a.mo27987a(C20041s.m37878a("recover_version"));
            if (i <= a) {
                C19512f.m36457b("imsdk", "IMClient checkRecover already recover, version:" + i + ", lastVersion:" + a, (Throwable) null);
                return;
            }
            C19512f.m36457b("imsdk", "IMClient checkRecover start, version:" + i + ", lastVersion:" + a, (Throwable) null);
            C20041s.m37876a();
            C20041s.m37897f(i);
            new C19517i().mo31179a("im_sdk_recover").mo31180a("version", String.valueOf(i)).mo31180a("last_version", String.valueOf(a)).mo31182c();
            C19930x.m37536a().mo31808a(new Runnable() {
                /* class com.bytedance.p1399im.core.p1404a.C19483d.RunnableC194863 */

                static {
                    Covode.recordClassIndex(22330);
                }

                public final void run() {
                    C19512f.m36457b("imsdk", "IMClient checkRecover onRun", (Throwable) null);
                    C19483d.this.mo31143d();
                    C19741a.m36958a().mo31685d();
                    C20041s.m37876a();
                    C20041s.m37907n();
                    C20041s.m37876a();
                    C20041s.m37897f(i);
                    C19483d.this.mo31142c();
                }
            });
        }
    }

    /* renamed from: h */
    private synchronized void m36367h() {
        MethodCollector.m26663i(5363);
        if (C19983a.f47500a != null) {
            C19983a.f47500a.shutdown();
            C19983a.f47500a = null;
        }
        if (C19983a.f47501b != null) {
            C19983a.f47501b.shutdown();
            C19983a.f47501b = null;
        }
        if (!C19983a.f47504e && C19983a.f47502c != null) {
            C19983a.f47502c.shutdown();
            C19983a.f47502c = null;
        }
        if (C19983a.f47503d != null) {
            C19983a.f47503d.shutdown();
            C19983a.f47503d = null;
        }
        C19786a.f46965a.clear();
        C19786a.f46966b.clear();
        C19786a.f46967c.clear();
        C19786a.f46970f.clear();
        C19786a.f46972h.clear();
        C19786a.f46971g.clear();
        C19786a.f46973i.clear();
        C19786a.f46974j.clear();
        C19786a.f46975k.clear();
        C19786a.f46976l.clear();
        C19786a.f46978n.clear();
        C19640j a = C19640j.m36671a();
        C19512f.m36457b("imsdk", "ConversationListModel clear", (Throwable) null);
        a.f46664a.clear();
        a.f46665b.clear();
        a.f46666c = false;
        a.f46669f = false;
        C19609be a2 = C19609be.m36623a();
        a2.f46599b.clear();
        a2.f46601d.clear();
        a2.f46600c.clear();
        C19745a a3 = C19745a.m36988a();
        if (a3.f46928a != null) {
            a3.f46928a.removeMessages(101);
            a3.f46928a.removeMessages(102);
            a3.f46928a.removeMessages(103);
            a3.f46928a.removeMessages(104);
            a3.f46928a.removeMessages(105);
        }
        C19607bc a4 = C19607bc.m36619a();
        a4.f46590a = 0;
        a4.f46591b = 0;
        a4.f46592c = true;
        a4.f46594e = null;
        for (AbstractC19965d dVar : C19967c.m37645a().f47471a) {
            dVar.mo31842a().mo31829e();
        }
        if (C19682a.f46792a) {
            C19682a a5 = C19682a.m36780a();
            a5.mo31637d();
            a5.f46795b.removeCallbacksAndMessages(null);
        }
        C20014q.f47553i = false;
        if (C19699c.f46840a) {
            C19699c a6 = C19699c.m36829a();
            C19512f.m36457b("imsdk", "ReportManager innerRelease", (Throwable) null);
            a6.f46843b.removeCallbacksAndMessages(null);
            a6.f46844c.clear();
        }
        C19730f a7 = C19730f.m36907a();
        C19512f.m36457b("imsdk", "StrangerManager reset", (Throwable) null);
        a7.f46890d = 0;
        a7.f46892f.clear();
        a7.f46891e.evictAll();
        C20043t a8 = C20043t.m37921a();
        C19512f.m36457b("imsdk", "SendMsgCache reset, lru:" + a8.f47633a.size(), (Throwable) null);
        a8.f47633a.evictAll();
        RunnableC19987d.m37726a();
        C19532ad.f46371a.evictAll();
        C19505b a9 = C19505b.m36409a();
        if (C19505b.m36410b()) {
            C19512f.m36457b("imsdk", "ConversationBoxManager reset", (Throwable) null);
            a9.f46302e = null;
            a9.f46300c = new ConcurrentHashMap();
        }
        MethodCollector.m26664o(5363);
    }

    /* renamed from: c */
    public final synchronized void mo31142c() {
        int i;
        MethodCollector.m26663i(5257);
        C19512f.m36457b("imsdk", "IMClient login", (Throwable) null);
        try {
            this.f46159d = true;
            C20041s.m37876a();
            this.f46160e = C20041s.m37902i();
            m36367h();
            C19610bf.m36632a();
            C19640j a = C19640j.m36671a();
            if (!m36365a().mo31141b().f46240ae || !m36365a().f46160e) {
                if (m36365a().mo31141b().f46200I) {
                    RunnableC19987d.m37728a(new AbstractC19986c<Boolean>() {
                        /* class com.bytedance.p1399im.core.p1408d.C19640j.C1964614 */

                        static {
                            Covode.recordClassIndex(22490);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
                        /* renamed from: a */
                        public final /* synthetic */ Boolean mo31187a() {
                            C20045u.m37926a();
                            List<C19638h> b = C20045u.m37927b();
                            if (b == null || b.size() <= 0) {
                                return false;
                            }
                            C19640j.this.mo31595a((C19638h[]) b.toArray(new C19638h[0]));
                            return true;
                        }
                    }, new AbstractC19985b<Boolean>() {
                        /* class com.bytedance.p1399im.core.p1408d.C19640j.C1964715 */

                        static {
                            Covode.recordClassIndex(22491);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
                        /* renamed from: a */
                        public final /* synthetic */ void mo31188a(Boolean bool) {
                            Boolean bool2 = bool;
                            if (!C19640j.this.f46668e.isEmpty() && bool2.booleanValue()) {
                                C19512f.m36457b("imsdk", "snapshot onCallback", (Throwable) null);
                                for (AbstractC19667p pVar : C19640j.this.f46668e) {
                                    pVar.mo28007a(C19640j.this.f46664a);
                                }
                            }
                        }
                    });
                } else if (m36365a().mo31141b().f46198G) {
                    RunnableC19987d.m37728a(new AbstractC19986c<Boolean>() {
                        /* class com.bytedance.p1399im.core.p1408d.C19640j.C196482 */

                        static {
                            Covode.recordClassIndex(22492);
                        }

                        /* access modifiers changed from: private */
                        /* renamed from: b */
                        public Boolean mo31187a() {
                            long uptimeMillis = SystemClock.uptimeMillis();
                            List<C19638h> a = C19749c.m37001a(C19483d.m36365a().mo31141b().f46199H);
                            try {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("duration", SystemClock.uptimeMillis() - uptimeMillis);
                                C19510e.m36438a("im_init_conversation_msg_duration", jSONObject);
                            } catch (Exception unused) {
                            }
                            if (a.size() <= 0) {
                                return false;
                            }
                            C19640j.this.mo31595a((C19638h[]) a.toArray(new C19638h[0]));
                            return true;
                        }
                    }, new AbstractC19985b<Boolean>() {
                        /* class com.bytedance.p1399im.core.p1408d.C19640j.C196493 */

                        static {
                            Covode.recordClassIndex(22493);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
                        /* renamed from: a */
                        public final /* synthetic */ void mo31188a(Boolean bool) {
                            Boolean bool2 = bool;
                            if (!C19640j.this.f46668e.isEmpty() && bool2.booleanValue()) {
                                C19512f.m36457b("imsdk", "fastLoad onCallback", (Throwable) null);
                                for (AbstractC19667p pVar : C19640j.this.f46668e) {
                                    pVar.mo28007a(C19640j.this.f46664a);
                                }
                            }
                        }
                    });
                }
            }
            C19930x.m37536a();
            new C19845an();
            int[] a2 = C19996e.m37756a();
            for (int i2 : a2) {
                C19930x.m37536a();
                C19935y yVar = new C19935y(i2);
                yVar.f47396b = false;
                C19512f.m36457b("imsdk", "IMInitHandler init, isRetry:false, inbox:" + yVar.f47395a, (Throwable) null);
                if (C19786a.m37249i(yVar.f47395a)) {
                    C19512f.m36457b("imsdk", "IMInitHandler init, already doing, return", (Throwable) null);
                } else {
                    C20041s.m37876a();
                    if (C20041s.m37899g(yVar.f47395a)) {
                        C19512f.m36457b("imsdk", "IMInitHandler init, already inited", (Throwable) null);
                        RunnableC19987d.m37728a(new AbstractC19986c<Object>() {
                            /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19935y.C199416 */

                            static {
                                Covode.recordClassIndex(22785);
                            }

                            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
                            /* renamed from: a */
                            public final Object mo31187a() {
                                long a = C19483d.m36365a().f46157b.mo27953a();
                                C20002j.m37782c("IMMsgDao markUnSendFail, user_id:".concat(String.valueOf(a)));
                                return Boolean.valueOf(C19742b.m36979b("update msg set " + C19777i.EnumC19780a.COLUMN_STATUS.key + "=3 where " + C19777i.EnumC19780a.COLUMN_SENDER.key + "='" + a + "' AND " + C19777i.EnumC19780a.COLUMN_STATUS.key + "<'2'"));
                            }
                        }, new AbstractC19985b<Object>() {
                            /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19935y.C199427 */

                            static {
                                Covode.recordClassIndex(22786);
                            }

                            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
                            /* renamed from: a */
                            public final void mo31188a(Object obj) {
                                C19483d.m36365a().f46157b.mo27956a(C19935y.this.f47395a, 3);
                                C19935y.this.mo31814a(C19483d.m36365a().mo31141b().f46205N, false);
                            }
                        });
                        C19946a.m37584a().f47439a = true;
                    } else {
                        C20041s.m37876a();
                        C20041s.m37906m();
                        int i3 = yVar.f47395a;
                        if (m36365a().mo31141b().f46284x == 2) {
                            C19786a.f46965a.add(Integer.valueOf(i3));
                            m36365a();
                        }
                        C19786a.f46970f.add(Integer.valueOf(yVar.f47395a));
                        m36365a().f46157b.mo27956a(yVar.f47395a, 0);
                        yVar.f47401g = SystemClock.uptimeMillis();
                        C20041s.m37876a();
                        yVar.mo31812a(C20041s.f47627a.mo27994b(C20041s.m37877a(yVar.f47395a, "im_init_page_cursor"), (Long) 0L));
                        C19510e.m36436a("im_total_pull", "get_session");
                    }
                }
            }
            C19930x.m37536a().f47384b = true;
            if (C20004l.m37794a().mo31880b() == 1) {
                C20041s.m37876a();
                C20041s.m37881a(m36365a().mo31141b().f46244ai.baseIndexV2);
            }
            C20041s.m37876a();
            long b = C20041s.f47627a.mo27994b(C20041s.m37878a("saved_msg_fts_index_ts"), (Long) Long.MAX_VALUE);
            if (b > 0) {
                Handler handler = new Handler(Looper.getMainLooper());
                C19777i.RunnableC197781 r5 = new Runnable(b) {
                    /* class com.bytedance.p1399im.core.internal.p1419a.C19777i.RunnableC197781 */

                    /* renamed from: a */
                    final /* synthetic */ long f46956a;

                    static {
                        Covode.recordClassIndex(22622);
                    }

                    public final void run() {
                        RunnableC19987d.m37728a(new AbstractC19986c<Boolean>() {
                            /* class com.bytedance.p1399im.core.internal.p1419a.C19777i.RunnableC197781.C197791 */

                            static {
                                Covode.recordClassIndex(22623);
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
                            /* renamed from: a */
                            public final /* synthetic */ Boolean mo31187a() {
                                C19705d.m36851a();
                                return true;
                            }
                        }, (AbstractC19985b) null);
                    }

                    {
                        this.f46956a = r1;
                    }
                };
                if (m36365a().f46157b.mo27960b() != null) {
                    m36365a().f46157b.mo27960b();
                    i = -1;
                } else {
                    i = 10000;
                }
                handler.postDelayed(r5, (long) i);
            }
            C19946a.m37584a();
            C19946a.f47436b = true;
            C19610bf.m36632a();
            C19512f.m36457b("imsdk", "WaitDelCon onLogin, mode:" + C19618bg.f46616a, (Throwable) null);
            if (C19618bg.f46616a == 0) {
                C19618bg.f46617b = new C19618bg.C19619a();
            } else {
                C19618bg.f46617b = new C19618bg.C19620b();
            }
            C19618bg.f46617b.mo31406a();
            C19512f fVar = C19512f.f46313d;
            Context context = C19512f.f46311b;
            if (context == null) {
                C89219l.m154710a("appContext");
                C89388w wVar = new C89388w("null cannot be cast to non-null type");
                MethodCollector.m26664o(5257);
                throw wVar;
            }
            ((Application) context).registerActivityLifecycleCallbacks(fVar);
            if (C19738a.m36949o() > 0) {
                C19518j.f46330a.postDelayed(C19518j.f46331b, (long) (C19738a.m36949o() * 1000));
            }
            try {
                Context context2 = C19512f.f46311b;
                if (context2 == null) {
                    C89219l.m154710a("appContext");
                }
                Object a3 = C19512f.m36448a(context2, "connectivity");
                if (a3 != null) {
                    ConnectivityManager connectivityManager = (ConnectivityManager) a3;
                    if (connectivityManager != null) {
                        Context context3 = C19512f.f46311b;
                        if (context3 == null) {
                            C89219l.m154710a("appContext");
                        }
                        C19512f.f46312c = C19512f.m36453a(context3);
                        if (Build.VERSION.SDK_INT >= 21) {
                            connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).addTransportType(1).addTransportType(0).build(), new C19512f.C19513a());
                        } else {
                            IntentFilter intentFilter = new IntentFilter();
                            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                            Context context4 = C19512f.f46311b;
                            if (context4 == null) {
                                C89219l.m154710a("appContext");
                            }
                            C19512f.m36446a(context4, new C19512f.C19514b(), intentFilter);
                        }
                    }
                    this.f46171q.postDelayed(new Runnable() {
                        /* class com.bytedance.p1399im.core.p1404a.C19483d.RunnableC194874 */

                        static {
                            Covode.recordClassIndex(22331);
                        }

                        public final void run() {
                            if (!C19483d.this.f46157b.mo27968i()) {
                                C19483d.this.mo31146g();
                            }
                        }
                    }, 5000);
                    MethodCollector.m26664o(5257);
                } else {
                    C89388w wVar2 = new C89388w("null cannot be cast to non-null type");
                    MethodCollector.m26664o(5257);
                    throw wVar2;
                }
            } catch (Exception e) {
                e.printStackTrace();
                C19510e.m36439a(e);
            }
        } catch (Throwable th) {
            C19512f.m36457b("imsdk", "IMClient login error", th);
            C19696b.m36826a(true, th, this.f46169o, this.f46170p, this.f46156a);
            C19510e.m36439a(th);
            MethodCollector.m26664o(5257);
        }
    }

    /* renamed from: a */
    private static Context m36364a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: a */
    public final synchronized void mo31137a(final int i) {
        int[] a;
        MethodCollector.m26663i(5369);
        if (this.f46159d) {
            final int[] a2 = C19996e.m37756a();
            if (a2 == null) {
                MethodCollector.m26664o(5369);
                return;
            } else if (!m36365a().mo31141b().f46281u || (a = C19996e.m37756a()) == null || a.length <= 1) {
                m36366a(a2, i);
                MethodCollector.m26664o(5369);
                return;
            } else {
                C19930x.m37536a();
                C19868f fVar = new C19868f(new AbstractC19479b<int[]>() {
                    /* class com.bytedance.p1399im.core.p1404a.C19483d.C194841 */

                    static {
                        Covode.recordClassIndex(22328);
                    }

                    @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
                    /* renamed from: a */
                    public final void mo27860a(C19672u uVar) {
                        C19483d.m36366a(a2, i);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
                    /* renamed from: a */
                    public final /* bridge */ /* synthetic */ void mo27861a(int[] iArr) {
                        int[] iArr2 = iArr;
                        if (iArr2 == null || iArr2.length == 0) {
                            iArr2 = a2;
                        }
                        C19483d.m36366a(iArr2, i);
                    }
                });
                if (a2.length == 0) {
                    MethodCollector.m26664o(5369);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (int i2 : a2) {
                    InboxMessagesPerUser.Builder inbox_type = new InboxMessagesPerUser.Builder().inbox_type(Integer.valueOf(i2));
                    C20041s.m37876a();
                    arrayList.add(inbox_type.cursor(Long.valueOf(C20041s.m37875a(i2))).build());
                }
                RequestBody build = new RequestBody.Builder().check_messages_per_user_body(new CheckMessagePerUserRequestBody.Builder().checks(arrayList).build()).build();
                int[] iArr = new int[a2.length];
                System.arraycopy(a2, 0, iArr, 0, a2.length);
                fVar.mo31798a(0, build, null, iArr);
            }
        }
        MethodCollector.m26664o(5369);
    }

    /* renamed from: a */
    public final void mo31139a(AbstractC19481b bVar) {
        C19512f.m36457b("imsdk", "IMClient setBridge", (Throwable) null);
        if (bVar == null) {
            bVar = this.f46157b;
        }
        this.f46157b = bVar;
    }

    /* renamed from: a */
    public final void mo31140a(final boolean z) {
        C19512f.m36457b("imsdk", "IMClient recover, deleteDB:".concat(String.valueOf(z)), (Throwable) null);
        C19509d dVar = new C19509d();
        dVar.f46304a = "core";
        dVar.f46305b = "db_crash";
        C20041s.m37876a();
        C19509d a = dVar.mo31164a("last_reset_time", Long.valueOf(C20041s.m37893e()));
        C20041s.m37876a();
        a.mo31164a("reset_count", Integer.valueOf(C20041s.m37896f())).mo31165a();
        C19930x.m37536a().mo31808a(new Runnable() {
            /* class com.bytedance.p1399im.core.p1404a.C19483d.RunnableC194852 */

            static {
                Covode.recordClassIndex(22329);
            }

            public final void run() {
                C19483d.this.mo31143d();
                if (z) {
                    C19741a.m36958a().mo31685d();
                }
                C20041s.m37876a();
                C19512f.m36457b("imsdk", "SPUtils reset", (Throwable) null);
                int f = C20041s.m37896f();
                if (SystemClock.uptimeMillis() - C20041s.m37893e() > 3600000) {
                    C20041s.m37907n();
                    C20041s.f47627a.mo27991a(C20041s.m37878a("im_reset_time"), Long.valueOf(SystemClock.uptimeMillis()));
                }
                C20041s.f47627a.mo27989a(C20041s.m37878a("im_reset_count"), f + 1);
                C19483d.this.mo31142c();
            }
        });
    }

    /* renamed from: a */
    public static void m36366a(int[] iArr, int i) {
        if (iArr != null) {
            for (int i2 : iArr) {
                if (i2 != -1) {
                    C19930x.m37536a().mo31807a(i2, i);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo31138a(Context context, C19492f fVar, AbstractC19508c cVar) {
        String name;
        Context a;
        this.f46169o = System.currentTimeMillis();
        if (context == null) {
            name = "null";
        } else {
            name = context.getClass().getName();
        }
        this.f46170p = name;
        if (context == null) {
            a = null;
        } else {
            a = m36364a(context);
        }
        this.f46156a = a;
        if (fVar == null) {
            fVar = new C19492f();
        }
        this.f46166l = fVar;
        this.f46168n.put(Integer.valueOf(C19521a.f46333a), new Runnable() {
            /* class com.bytedance.p1399im.core.internal.p1431d.C19974h.RunnableC199751 */

            static {
                Covode.recordClassIndex(22819);
            }

            public final void run() {
                C19967c a = C19967c.m37645a();
                C19512f.m36457b("RequestManagerFactory", "loadCoreParallelRequestManager", (Throwable) null);
                for (AbstractC19965d dVar : a.f47471a) {
                    if (dVar.mo31843b() == EnumC19964c.CORE_PARALLEL) {
                        AbstractC19969e a2 = dVar.mo31842a();
                        if (a2 instanceof C19970f) {
                            C19512f.m36457b("RequestManagerFactory", "instRightNow", (Throwable) null);
                            ((C19970f) a2).mo31860b();
                        }
                    }
                }
            }
        });
        C20002j.f47542a = this.f46166l.f46218a;
        C19512f.m36457b("imsdk", "IMClient init, context:" + this.f46170p, (Throwable) null);
        if (cVar != null) {
            C19512f.m36449a(context, cVar);
            return;
        }
        throw new RuntimeException("sdkMonitor should not be null");
    }
}
