package com.bytedance.common.wschannel.channel.p916a.p917a;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.wschannel.C13758l;
import com.bytedance.common.wschannel.channel.p916a.p917a.p918a.AbstractC13675b;
import com.bytedance.common.wschannel.channel.p916a.p917a.p919b.AbstractC13703b;
import com.bytedance.common.wschannel.channel.p916a.p917a.p919b.AbstractC13704c;
import com.bytedance.common.wschannel.channel.p916a.p917a.p919b.C13696a;
import com.bytedance.common.wschannel.p913c.AbstractC13658a;
import com.bytedance.common.wschannel.p913c.AbstractC13669c;
import com.bytedance.common.wschannel.p913c.C13661b;
import com.bytedance.common.wschannel.p913c.p914a.EnumC13659a;
import com.bytedance.common.wschannel.p913c.p915b.C13664a;
import com.bytedance.common.wschannel.p913c.p915b.C13666b;
import com.bytedance.common.wschannel.p921e.C13747d;
import com.bytedance.common.wschannel.server.C13790h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.AbstractC90036ag;
import okhttp3.AbstractC90049e;
import okhttp3.AbstractC90051f;
import okhttp3.C90029ac;
import okhttp3.C90200t;
import okhttp3.C90208y;
import okhttp3.EnumC90211z;
import okhttp3.Request;
import okhttp3.internal.AbstractC90058a;
import okhttp3.internal.C90084c;
import okhttp3.internal.p4654b.C90082g;
import okhttp3.internal.p4662j.C90167a;
import p4632k.C89427i;

/* renamed from: com.bytedance.common.wschannel.channel.a.a.b */
final class C13677b implements WeakHandler.IHandler {

    /* renamed from: a */
    public C13710c f33209a;

    /* renamed from: b */
    public boolean f33210b;

    /* renamed from: c */
    public Handler f33211c;

    /* renamed from: d */
    public AbstractC13695d f33212d;

    /* renamed from: e */
    public C13696a f33213e;

    /* renamed from: f */
    public boolean f33214f;

    /* renamed from: g */
    public AbstractC13658a f33215g;

    /* renamed from: h */
    public C13661b f33216h;

    /* renamed from: i */
    private final Context f33217i;

    /* renamed from: j */
    private final C13686b f33218j;

    /* renamed from: k */
    private C90208y f33219k;

    /* renamed from: l */
    private int f33220l;

    /* renamed from: m */
    private Request f33221m;

    /* renamed from: n */
    private Map<String, Object> f33222n;

    /* renamed from: o */
    private AbstractC13704c f33223o;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.common.wschannel.channel.a.a.b$d */
    public interface AbstractC13695d {
        static {
            Covode.recordClassIndex(15729);
        }

        /* renamed from: a */
        void mo22026a(String str);

        /* renamed from: a */
        void mo22027a(String str, int i, String str2);

        /* renamed from: a */
        void mo22028a(C89427i iVar);

        /* renamed from: a */
        void mo22029a(C90029ac acVar);

        /* renamed from: b */
        void mo22030b(String str);

        /* renamed from: c */
        void mo22031c(String str);
    }

    static {
        Covode.recordClassIndex(15711);
    }

    /* renamed from: d */
    public final void mo22002d() {
        C13710c cVar = this.f33209a;
        if (cVar != null) {
            cVar.mo22065a();
        }
    }

    /* renamed from: i */
    private void m24631i() {
        C13696a aVar = this.f33213e;
        if (aVar != null) {
            aVar.mo22043c("normal close");
        }
    }

    /* renamed from: c */
    public final void mo22001c() {
        mo22002d();
        this.f33211c.removeMessages(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final synchronized int mo22003e() {
        int i;
        MethodCollector.m26663i(13353);
        i = this.f33220l;
        MethodCollector.m26664o(13353);
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo22004f() {
        if (mo22003e() == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo22000b() {
        this.f33211c.removeMessages(2);
        this.f33211c.removeMessages(1);
        this.f33211c.removeMessages(3);
        this.f33211c.removeMessages(5);
        mo22001c();
        m24630h();
    }

    /* renamed from: g */
    public final void mo22005g() {
        AbstractC13695d dVar;
        Request request = this.f33221m;
        if (!(request == null || (dVar = this.f33212d) == null)) {
            dVar.mo22027a(request.url().toString(), 3, "heatbeat timeout");
        }
        Pair<String, Long> a = this.f33209a.mo22064a(null);
        mo22000b();
        m24631i();
        mo21996a(0, (String) a.first, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.common.wschannel.channel.a.a.b$b */
    public static final class C13686b {

        /* renamed from: a */
        public Context f33240a;

        /* renamed from: b */
        public List<String> f33241b;

        /* renamed from: c */
        public C90208y f33242c;

        /* renamed from: d */
        public AbstractC13675b f33243d;

        /* renamed from: e */
        public AbstractC13658a f33244e;

        static {
            Covode.recordClassIndex(15720);
        }

        public final String toString() {
            return "Config{mHeartBeatPolicy=" + this.f33244e + ", mContext=" + this.f33240a + ", wsUrls=" + this.f33241b + ", mOkHttpClient=" + this.f33242c + ", mRetryPolicy=" + this.f33243d + '}';
        }

        C13686b(Context context, List<String> list, C90208y yVar, AbstractC13675b bVar, AbstractC13658a aVar) {
            this.f33240a = context;
            this.f33241b = list;
            this.f33242c = yVar;
            this.f33243d = bVar;
            this.f33244e = aVar;
        }
    }

    /* renamed from: h */
    private boolean m24630h() {
        int e = mo22003e();
        if (!(e == 3 || e == 2 || e == 5)) {
            this.f33215g.mo21958c();
            C13696a aVar = this.f33213e;
            if (aVar != null) {
                this.f33211c.sendMessageDelayed(this.f33211c.obtainMessage(6, aVar), 1000);
                if (e == 4) {
                    this.f33213e.mo22044c(1000, "normal close");
                    mo21995a(6);
                    return false;
                }
                this.f33213e.mo22038b();
                mo21995a(3);
                if (e != 1) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo21994a() {
        mo21997a(new Runnable() {
            /* class com.bytedance.common.wschannel.channel.p916a.p917a.C13677b.RunnableC136803 */

            static {
                Covode.recordClassIndex(15714);
            }

            public final void run() {
                C13677b.this.f33210b = true;
                C13677b.this.mo22000b();
            }
        });
    }

    /* renamed from: com.bytedance.common.wschannel.channel.a.a.b$a */
    public static final class C13685a {

        /* renamed from: a */
        Context f33235a;

        /* renamed from: b */
        List<String> f33236b;

        /* renamed from: c */
        C90208y f33237c;

        /* renamed from: d */
        AbstractC13675b f33238d;

        /* renamed from: e */
        AbstractC13658a f33239e;

        static {
            Covode.recordClassIndex(15719);
        }

        C13685a(Context context) {
            this.f33235a = context;
        }
    }

    /* renamed from: com.bytedance.common.wschannel.channel.a.a.b$c */
    class C13687c extends AbstractC13704c {
        static {
            Covode.recordClassIndex(15721);
        }

        private C13687c() {
        }

        @Override // com.bytedance.common.wschannel.channel.p916a.p917a.p919b.AbstractC13704c
        /* renamed from: a */
        public final void mo22012a(final AbstractC13703b bVar) {
            C13677b.this.mo21997a(new Runnable() {
                /* class com.bytedance.common.wschannel.channel.p916a.p917a.C13677b.C13687c.RunnableC136947 */

                static {
                    Covode.recordClassIndex(15728);
                }

                public final void run() {
                    if (bVar == C13677b.this.f33213e) {
                        if (C13677b.this.f33216h.f33181b.get()) {
                            C13661b bVar = C13677b.this.f33216h;
                            bVar.f33181b.set(false);
                            bVar.f33184e.removeCallbacks(bVar.f33185f);
                            return;
                        }
                        C13677b.this.f33215g.mo21955a();
                    }
                }
            });
        }

        @Override // com.bytedance.common.wschannel.channel.p916a.p917a.p919b.AbstractC13704c
        /* renamed from: a */
        public final void mo22016a(final String str) {
            C13677b.this.mo21997a(new Runnable() {
                /* class com.bytedance.common.wschannel.channel.p916a.p917a.C13677b.C13687c.RunnableC136903 */

                static {
                    Covode.recordClassIndex(15724);
                }

                public final void run() {
                    if (C13677b.this.f33212d != null) {
                        C13677b.this.f33212d.mo22031c(str);
                    }
                }
            });
        }

        @Override // com.bytedance.common.wschannel.channel.p916a.p917a.p919b.AbstractC13704c
        /* renamed from: a */
        public final void mo22017a(final C89427i iVar) {
            C13677b.this.mo21997a(new Runnable() {
                /* class com.bytedance.common.wschannel.channel.p916a.p917a.C13677b.C13687c.RunnableC136892 */

                static {
                    Covode.recordClassIndex(15723);
                }

                public final void run() {
                    if (C13677b.this.f33212d != null) {
                        C13677b.this.f33212d.mo22028a(iVar);
                    }
                }
            });
        }

        /* synthetic */ C13687c(C13677b bVar, byte b) {
            this();
        }

        @Override // com.bytedance.common.wschannel.channel.p916a.p917a.p919b.AbstractC13704c
        /* renamed from: a */
        public final void mo22015a(final AbstractC13703b bVar, final C90029ac acVar) {
            C13677b.this.mo21997a(new Runnable() {
                /* class com.bytedance.common.wschannel.channel.p916a.p917a.C13677b.C13687c.RunnableC136881 */

                static {
                    Covode.recordClassIndex(15722);
                }

                public final void run() {
                    if (C13677b.this.f33213e == bVar) {
                        C13677b.this.mo21995a(4);
                        C13677b.this.mo22001c();
                        C13677b.this.f33215g.mo21956a(acVar);
                        if (C13677b.this.f33212d != null) {
                            C13677b.this.f33212d.mo22029a(acVar);
                        }
                    }
                }
            });
        }

        @Override // com.bytedance.common.wschannel.channel.p916a.p917a.p919b.AbstractC13704c
        /* renamed from: a */
        public final void mo22013a(AbstractC13703b bVar, int i, String str) {
            super.mo22013a(bVar, i, str);
            C13677b.this.mo21997a(new Runnable() {
                /* class com.bytedance.common.wschannel.channel.p916a.p917a.C13677b.C13687c.RunnableC136914 */

                static {
                    Covode.recordClassIndex(15725);
                }

                public final void run() {
                    C13677b.this.mo21995a(6);
                }
            });
        }

        @Override // com.bytedance.common.wschannel.channel.p916a.p917a.p919b.AbstractC13704c
        /* renamed from: b */
        public final void mo22018b(final AbstractC13703b bVar, final int i, final String str) {
            final String a = C13677b.m24628a(bVar);
            C13677b.this.mo21997a(new Runnable() {
                /* class com.bytedance.common.wschannel.channel.p916a.p917a.C13677b.C13687c.RunnableC136925 */

                static {
                    Covode.recordClassIndex(15726);
                }

                public final void run() {
                    if (C13677b.this.f33213e == bVar) {
                        C13677b.this.mo21995a(3);
                        C13677b.this.f33213e = null;
                        C13677b.this.f33215g.mo21958c();
                        if (C13677b.this.f33212d != null) {
                            C13677b.this.f33212d.mo22030b(a);
                        }
                        if (C13677b.this.f33214f) {
                            C13677b.this.f33214f = false;
                            C13677b.this.mo21998a(C13677b.this.f33209a.mo22066b());
                        } else if (!C13677b.this.f33210b) {
                            Pair<String, Long> a = C13677b.this.f33209a.mo22064a(null);
                            C13677b.this.mo21996a(((Long) a.second).longValue(), (String) a.first, true);
                        }
                    }
                }
            });
        }

        @Override // com.bytedance.common.wschannel.channel.p916a.p917a.p919b.AbstractC13704c
        /* renamed from: a */
        public final void mo22014a(final AbstractC13703b bVar, Throwable th, C90029ac acVar) {
            final String str;
            final String a = C13677b.m24628a(bVar);
            final int a2 = C13677b.m24627a(acVar);
            if (a2 == 0) {
                str = "success";
            } else if (a2 == 404) {
                str = "uri not found";
            } else if (a2 == 409) {
                str = "fpid not registered";
            } else if (a2 == 410) {
                str = "invalid device id";
            } else if (a2 == 411) {
                str = "appid not registered";
            } else if (a2 == 412) {
                str = "websocket protocol not support";
            } else if (a2 == 413) {
                str = "the device already connected";
            } else if (a2 == 414) {
                str = "server can't accept more connection,try again later";
            } else if (a2 == 415) {
                str = "device was blocked";
            } else if (a2 == 416) {
                str = "parameter error";
            } else if (a2 == 417) {
                str = "authentication failed";
            } else if (a2 == 510) {
                str = "server internal error";
            } else if (a2 == 511) {
                str = "server is busy，try again later";
            } else if (a2 == 512) {
                str = "server is shutting down";
            } else if (a2 == 513) {
                str = "auth server is error";
            } else if (a2 == 514) {
                str = "auth return error";
            } else {
                str = "";
            }
            if (C13627m.m24498a(str)) {
                if (C13627m.m24498a(th.getMessage())) {
                    str = Log.getStackTraceString(th);
                } else {
                    str = th.getMessage();
                }
            }
            final Pair<String, Long> a3 = C13677b.this.f33209a.mo22064a(acVar);
            if (acVar != null) {
                try {
                    acVar.close();
                } catch (Throwable unused) {
                }
            }
            C13677b.this.mo21997a(new Runnable() {
                /* class com.bytedance.common.wschannel.channel.p916a.p917a.C13677b.C13687c.RunnableC136936 */

                static {
                    Covode.recordClassIndex(15727);
                }

                public final void run() {
                    if (C13677b.this.f33212d != null) {
                        C13677b.this.f33212d.mo22027a(a, a2, str);
                    }
                    if (C13677b.this.f33214f) {
                        C13677b.this.f33214f = false;
                        C13677b.this.mo21998a(C13677b.this.f33209a.mo22066b());
                    } else if (C13677b.this.f33213e == bVar) {
                        int i = a2;
                        if (i <= 0 || i == 414 || i == 511 || i == 512 || i == 513) {
                            C13677b.this.f33215g.mo21958c();
                            C13677b.this.mo21996a(((Long) a3.second).longValue(), (String) a3.first, false);
                            return;
                        }
                        C13677b.this.mo21995a(2);
                        C13677b.this.mo22002d();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo21997a(Runnable runnable) {
        this.f33211c.post(runnable);
    }

    /* renamed from: a */
    public static int m24627a(C90029ac acVar) {
        if (acVar == null) {
            return -1;
        }
        try {
            return Integer.parseInt(acVar.mo144718a("Handshake-Status", null));
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public static String m24628a(AbstractC90036ag agVar) {
        Request a;
        C90200t url;
        if (agVar == null || (a = agVar.mo22032a()) == null || (url = a.url()) == null) {
            return "";
        }
        return url.toString();
    }

    private C13677b(C13686b bVar) {
        this.f33220l = 3;
        this.f33222n = new ConcurrentHashMap();
        this.f33211c = new WeakHandler(Looper.myLooper(), this);
        this.f33223o = new C13687c(this, (byte) 0);
        this.f33218j = bVar;
        this.f33217i = bVar.f33240a;
        this.f33219k = bVar.f33242c;
        AbstractC13658a aVar = bVar.f33244e;
        this.f33215g = aVar;
        if (aVar == null) {
            this.f33215g = new C13666b(new C13664a.C13665a((byte) 0));
        }
        this.f33215g.mo21952a(new AbstractC13669c() {
            /* class com.bytedance.common.wschannel.channel.p916a.p917a.C13677b.C136781 */

            static {
                Covode.recordClassIndex(15712);
            }

            @Override // com.bytedance.common.wschannel.p913c.AbstractC13669c
            /* renamed from: a */
            public final void mo21963a() {
                C13677b.this.mo22005g();
            }

            @Override // com.bytedance.common.wschannel.p913c.AbstractC13669c
            /* renamed from: b */
            public final void mo21964b() {
                C13677b bVar = C13677b.this;
                bVar.f33211c.post(new Runnable() {
                    /* class com.bytedance.common.wschannel.channel.p916a.p917a.C13677b.RunnableC136836 */

                    static {
                        Covode.recordClassIndex(15717);
                    }

                    public final void run() {
                        try {
                            if (C13677b.this.f33213e != null) {
                                C13677b.this.f33213e.mo22048f();
                            }
                        } catch (Throwable unused) {
                        }
                        C13677b.this.f33215g.mo21957b();
                    }
                });
            }
        }, this.f33211c);
        this.f33216h = new C13661b(new C13661b.AbstractC13663a() {
            /* class com.bytedance.common.wschannel.channel.p916a.p917a.C13677b.C136792 */

            static {
                Covode.recordClassIndex(15713);
            }

            @Override // com.bytedance.common.wschannel.p913c.C13661b.AbstractC13663a
            /* renamed from: a */
            public final void mo21954a() {
                C13677b.this.mo22005g();
            }
        }, this.f33211c);
    }

    /* renamed from: a */
    public final synchronized void mo21995a(int i) {
        MethodCollector.m26663i(13440);
        this.f33220l = i;
        MethodCollector.m26664o(13440);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        EnumC13659a aVar;
        if (message != null) {
            int i = message.what;
            if (i == 1) {
                if (!mo22004f()) {
                    this.f33211c.removeMessages(1);
                    this.f33211c.removeMessages(2);
                    mo21998a((String) message.obj);
                }
            } else if (i == 2) {
                try {
                    this.f33211c.removeMessages(2);
                    this.f33211c.removeMessages(1);
                    this.f33218j.f33241b = (List) message.obj;
                    this.f33210b = false;
                    this.f33209a = new C13710c(this.f33218j.f33241b, this.f33218j.f33243d);
                    mo22001c();
                    mo21998a(this.f33209a.mo22066b());
                } catch (Throwable unused) {
                }
            } else if (i == 3) {
                this.f33211c.removeMessages(2);
                this.f33211c.removeMessages(1);
                if (!mo22004f()) {
                    mo22001c();
                    if (!C13790h.m24889a(this.f33217i)) {
                        return;
                    }
                    if (m24630h()) {
                        C13710c cVar = this.f33209a;
                        if (cVar != null) {
                            mo21998a(cVar.mo22066b());
                            return;
                        }
                        return;
                    }
                    this.f33214f = true;
                }
            } else if (i == 5) {
                if (((Boolean) message.obj).booleanValue()) {
                    aVar = EnumC13659a.STATE_FOREGROUND;
                } else {
                    aVar = EnumC13659a.STATE_BACKGROUND;
                }
                C13661b bVar = this.f33216h;
                if (!bVar.f33181b.get() && bVar.f33180a == EnumC13659a.STATE_BACKGROUND && aVar == EnumC13659a.STATE_FOREGROUND) {
                    try {
                        if (bVar.f33182c != null) {
                            bVar.f33182c.mo22048f();
                            bVar.f33181b.set(true);
                            bVar.f33184e.removeCallbacks(bVar.f33185f);
                            bVar.f33184e.postDelayed(bVar.f33185f, 5000);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                bVar.f33180a = aVar;
            } else if (i == 7) {
                try {
                    this.f33211c.removeMessages(2);
                    this.f33211c.removeMessages(1);
                    this.f33218j.f33241b = (List) message.obj;
                    this.f33210b = false;
                    this.f33209a = new C13710c(this.f33218j.f33241b, this.f33218j.f33243d);
                    mo22001c();
                    if (m24630h()) {
                        mo21998a(this.f33209a.mo22066b());
                    } else {
                        this.f33214f = true;
                    }
                } catch (Throwable unused2) {
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo21998a(String str) {
        String str2;
        if (!C13790h.m24889a(this.f33217i)) {
            m24629a(str, 1, "network error", true);
            return;
        }
        int e = mo22003e();
        if (e != 4 && e != 1) {
            try {
                if (this.f33219k == null) {
                    this.f33219k = new C90208y.C90210a().mo145089a(Collections.singletonList(EnumC90211z.HTTP_1_1)).mo145103d();
                }
                Map<String, Object> map = this.f33222n;
                String str3 = "";
                if (!TextUtils.isEmpty(str) && map != null) {
                    String lowerCase = C13747d.m24780a(String.valueOf(map.get("fpid")) + String.valueOf(map.get("app_key")) + String.valueOf(map.get("device_id")) + "f8a69f1719916z").toLowerCase();
                    Uri.Builder buildUpon = Uri.parse(str).buildUpon();
                    for (Map.Entry<String, Object> entry : map.entrySet()) {
                        if (entry != null && !TextUtils.isEmpty(entry.getKey())) {
                            if (entry.getValue() == null) {
                                str2 = str3;
                            } else {
                                str2 = entry.getValue().toString();
                            }
                            String key = entry.getKey();
                            if (!C13627m.m24499a("app_key", key) && !C13627m.m24499a(key, "extra")) {
                                if (C13627m.m24499a("app_version", key)) {
                                    buildUpon.appendQueryParameter("version_code", str2);
                                } else {
                                    buildUpon.appendQueryParameter(key, str2);
                                }
                            }
                        }
                    }
                    String str4 = (String) map.get("extra");
                    int i = 2;
                    if (!C13627m.m24498a(str4)) {
                        String[] split = str4.split("&");
                        for (String str5 : split) {
                            if (!TextUtils.isEmpty(str5)) {
                                String[] split2 = str5.split("=");
                                if (split2.length == 2) {
                                    buildUpon.appendQueryParameter(split2[0], split2[1]);
                                }
                            }
                        }
                    }
                    buildUpon.appendQueryParameter("access_key", lowerCase);
                    C13790h.EnumC13791a b = C13790h.m24890b(this.f33217i);
                    if (b == null || b == C13790h.EnumC13791a.NONE) {
                        i = 0;
                    } else if (b == C13790h.EnumC13791a.WIFI) {
                        i = 1;
                    } else if (b != C13790h.EnumC13791a.MOBILE_2G) {
                        if (b == C13790h.EnumC13791a.MOBILE_3G) {
                            i = 3;
                        } else {
                            i = 4;
                        }
                    }
                    buildUpon.appendQueryParameter("ne", String.valueOf(i));
                    str3 = buildUpon.build().toString();
                }
                if (!C13627m.m24498a(str3)) {
                    m24631i();
                    Request request = this.f33221m;
                    if (request == null || !str3.equals(request.url().toString())) {
                        this.f33221m = new Request.C90016a().mo144700b("Sec-Websocket-Protocol", "pbbp").mo144691a(str3).mo144698a();
                    }
                    mo21995a(1);
                    C13696a aVar = new C13696a(this.f33221m, C13758l.m24811a(this.f33217i).f33414a.mo21916a("key_io_limit_size", 102400), this.f33223o, new Random());
                    this.f33213e = aVar;
                    C90208y yVar = this.f33219k;
                    Request a = aVar.f33270b.newBuilder().mo144692a("Upgrade", "websocket").mo144692a("Connection", "Upgrade").mo144692a("Sec-WebSocket-Key", aVar.f33271c).mo144692a("Sec-WebSocket-Version", "13").mo144698a();
                    aVar.f33272d = AbstractC90058a.f204330a.mo144784a(yVar, a);
                    aVar.f33272d.mo144708a(new AbstractC90051f(a) {
                        /* class com.bytedance.common.wschannel.channel.p916a.p917a.p919b.C13696a.C136982 */

                        /* renamed from: a */
                        final /* synthetic */ Request f33293a;

                        static {
                            Covode.recordClassIndex(15732);
                        }

                        {
                            this.f33293a = r2;
                        }

                        @Override // okhttp3.AbstractC90051f
                        public final void onFailure(AbstractC90049e eVar, IOException iOException) {
                            C13696a.this.mo22034a(iOException, (C90029ac) null);
                        }

                        @Override // okhttp3.AbstractC90051f
                        public final void onResponse(AbstractC90049e eVar, C90029ac acVar) {
                            try {
                                C13696a aVar = C13696a.this;
                                if (acVar.f204107c == 101) {
                                    String a = acVar.mo144718a("Connection", null);
                                    if ("Upgrade".equalsIgnoreCase(a)) {
                                        String a2 = acVar.mo144718a("Upgrade", null);
                                        if ("websocket".equalsIgnoreCase(a2)) {
                                            String a3 = acVar.mo144718a("Sec-WebSocket-Accept", null);
                                            String base64 = C89427i.encodeUtf8(aVar.f33271c + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").sha1().base64();
                                            if (base64.equals(a3)) {
                                                C90082g a4 = AbstractC90058a.f204330a.mo144787a(eVar);
                                                a4.mo144843d();
                                                C90167a.AbstractC90174e a5 = a4.mo144841b().mo144816a(a4);
                                                try {
                                                    if (C13696a.this.f33269a != null) {
                                                        C13696a.this.f33269a.mo22015a(C13696a.this, acVar);
                                                    }
                                                    C13696a.this.mo22036a("OkHttp WebSocket " + this.f33293a.url().mo145059i(), a5);
                                                    a4.mo144841b().f204403c.setSoTimeout(0);
                                                    C13696a.this.mo22042c();
                                                } catch (Exception e) {
                                                    C13696a.this.mo22034a(e, (C90029ac) null);
                                                }
                                            } else {
                                                throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + base64 + "' but was '" + a3 + "'");
                                            }
                                        } else {
                                            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + a2 + "'");
                                        }
                                    } else {
                                        throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + a + "'");
                                    }
                                } else {
                                    throw new ProtocolException("Expected HTTP 101 response but was '" + acVar.f204107c + " " + acVar.f204108d + "'");
                                }
                            } catch (ProtocolException e2) {
                                C13696a.this.mo22034a(e2, acVar);
                                C90084c.m156415a(acVar);
                            }
                        }
                    });
                    this.f33216h.f33182c = this.f33213e;
                    AbstractC13695d dVar = this.f33212d;
                    if (dVar != null) {
                        dVar.mo22026a(str3);
                    }
                }
            } catch (Throwable th) {
                AbstractC13695d dVar2 = this.f33212d;
                if (dVar2 != null) {
                    dVar2.mo22027a(str, 4, Log.getStackTraceString(th));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo21999a(Map<String, Object> map) {
        if (map != null) {
            map.remove("channel_id");
            this.f33222n.putAll(map);
        }
    }

    /* synthetic */ C13677b(C13686b bVar, byte b) {
        this(bVar);
    }

    /* renamed from: a */
    public final void mo21996a(long j, String str, boolean z) {
        this.f33211c.removeMessages(1);
        if (!C13790h.m24889a(this.f33217i)) {
            m24629a(str, 1, "network error", z);
        } else if (!this.f33210b) {
            if (j == -1 || C13627m.m24498a(str)) {
                Bundle bundle = new Bundle();
                bundle.putString("method", "tryReconnect");
                bundle.putLong("interval", j);
                m24629a(str, 2, "retry failed", z);
                str = this.f33209a.mo22066b();
            } else {
                mo21995a(5);
            }
            Message message = new Message();
            message.what = 1;
            message.obj = str;
            this.f33211c.sendMessageDelayed(message, j);
        }
    }

    /* renamed from: a */
    private void m24629a(String str, int i, String str2, boolean z) {
        mo21995a(2);
        mo22002d();
        AbstractC13695d dVar = this.f33212d;
        if (dVar != null && z) {
            dVar.mo22027a(str, i, str2);
        }
    }
}
