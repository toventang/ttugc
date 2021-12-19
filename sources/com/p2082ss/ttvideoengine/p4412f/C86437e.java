package com.p2082ss.ttvideoengine.p4412f;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.ttvideoengine.C86346ao;
import com.p2082ss.ttvideoengine.EnumC86649v;
import com.p2082ss.ttvideoengine.p4410d.C86409d;
import com.p2082ss.ttvideoengine.p4417j.C86535p;
import com.p2082ss.ttvideoengine.p4418k.AbstractC86561j;
import com.p2082ss.ttvideoengine.p4418k.C86555h;
import com.p2082ss.ttvideoengine.p4418k.C86557i;
import com.p2082ss.ttvideoengine.p4430s.C86631b;
import com.p2082ss.ttvideoengine.p4430s.C86633c;
import com.p2082ss.ttvideoengine.p4430s.C86640h;
import com.p2082ss.ttvideoengine.p4430s.C86641i;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.Future;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.f.e */
public final class C86437e {

    /* renamed from: a */
    public C86535p f193799a;

    /* renamed from: b */
    public boolean f193800b;

    /* renamed from: c */
    public int f193801c;

    /* renamed from: d */
    public String f193802d = "";

    /* renamed from: e */
    public AbstractC86441a f193803e;

    /* renamed from: f */
    public HashMap<String, EnumC86649v> f193804f;

    /* renamed from: g */
    public String f193805g;

    /* renamed from: h */
    public int f193806h = -1;

    /* renamed from: i */
    private Handler f193807i;

    /* renamed from: j */
    private int f193808j;

    /* renamed from: k */
    private String f193809k;

    /* renamed from: l */
    private String f193810l;

    /* renamed from: m */
    private boolean f193811m;

    /* renamed from: n */
    private AbstractC86561j f193812n;

    /* renamed from: o */
    private int f193813o;

    /* renamed from: p */
    private boolean f193814p;

    /* renamed from: q */
    private String f193815q;

    /* renamed from: r */
    private Future f193816r;

    /* renamed from: s */
    private String f193817s;

    /* renamed from: t */
    private long f193818t;

    /* renamed from: u */
    private Context f193819u;

    /* renamed from: v */
    private boolean f193820v;

    /* renamed from: w */
    private boolean f193821w = true;

    /* renamed from: x */
    private String[] f193822x = {"device_type", "device_id", "ac", "aid", "device_platform", "ab_version", "app_name", "version_code", "os_version", "menifest_version_code", "update_version_code", "user_id", "web_id", "player_version", "barragemask"};

    /* renamed from: y */
    private String[] f193823y = {"Action", "Version", "video_id", "codec_type", "base64", "url_type", "format_type", "ptoken", "preload", "cdn_type"};

    /* renamed from: com.ss.ttvideoengine.f.e$a */
    public interface AbstractC86441a {
        static {
            Covode.recordClassIndex(101669);
        }

        /* renamed from: a */
        void mo137283a(int i, String str);

        /* renamed from: a */
        void mo137284a(C86535p pVar, C86633c cVar);

        /* renamed from: a */
        void mo137285a(C86633c cVar);

        /* renamed from: a */
        void mo137286a(String str);
    }

    static {
        Covode.recordClassIndex(101665);
    }

    /* renamed from: b */
    private void m149156b() {
        if (this.f193820v && (TextUtils.isEmpty(this.f193802d) || !C86555h.m149815b(this.f193819u))) {
            C86641i.m150110a("VideoInfoFetcher", "get videomodel from DB");
            C86631b.m150044a(new Runnable() {
                /* class com.p2082ss.ttvideoengine.p4412f.C86437e.RunnableC864381 */

                static {
                    Covode.recordClassIndex(101666);
                }

                public final void run() {
                    C86409d.C86410a a = C86409d.m149061a(C86437e.this.f193805g);
                    if (a != null && !TextUtils.isEmpty(a.f193697b)) {
                        try {
                            JSONObject jSONObject = new JSONObject(a.f193697b);
                            C86641i.m150110a("VideoInfoFetcher", "using videomodel from DB");
                            C86437e.this.mo137475a(jSONObject, a);
                            return;
                        } catch (Exception e) {
                            C86641i.m150117e("VideoInfoFetcher", e.toString());
                        }
                    }
                    if (TextUtils.isEmpty(C86437e.this.f193802d)) {
                        C86437e.this.mo137477b(new C86633c("kTTVideoErrorDomainFetchingInfo", -9999, "apistring empty and no cache"));
                        return;
                    }
                    C86437e eVar = C86437e.this;
                    eVar.mo137472a(eVar.f193802d);
                }
            });
        } else if (TextUtils.isEmpty(this.f193802d)) {
            mo137477b(new C86633c("kTTVideoErrorDomainFetchingInfo", -9999, "apistring empty"));
        } else {
            mo137472a(this.f193802d);
        }
    }

    /* renamed from: a */
    public final void mo137469a() {
        MethodCollector.m26663i(3028);
        synchronized (this) {
            try {
                this.f193807i.removeCallbacksAndMessages(null);
                AbstractC86441a aVar = this.f193803e;
                if (aVar != null) {
                    aVar.mo137286a("fetcher cancelled");
                    if (this.f193800b) {
                        MethodCollector.m26664o(3028);
                        return;
                    }
                    this.f193800b = true;
                    Future future = this.f193816r;
                    if (future != null) {
                        future.cancel(true);
                    }
                    this.f193812n.mo101097a();
                    MethodCollector.m26664o(3028);
                }
            } finally {
                MethodCollector.m26664o(3028);
            }
        }
    }

    /* renamed from: a */
    public final void mo137471a(Boolean bool) {
        this.f193811m = bool.booleanValue();
    }

    /* renamed from: c */
    private void m149157c(C86633c cVar) {
        this.f193807i.sendMessage(this.f193807i.obtainMessage(0, cVar));
    }

    /* renamed from: a */
    public final void mo137476a(boolean z) {
        this.f193820v = z;
        if (z) {
            C86409d.m149062a(this.f193819u);
        }
    }

    /* renamed from: b */
    public final void mo137477b(C86633c cVar) {
        C86641i.m150110a("VideoInfoFetcher", "_notifyError ".concat(String.valueOf(cVar)));
        this.f193807i.sendMessage(this.f193807i.obtainMessage(1, cVar));
    }

    /* renamed from: com.ss.ttvideoengine.f.e$b */
    static class HandlerC86442b extends Handler {

        /* renamed from: a */
        private final WeakReference<C86437e> f193827a;

        static {
            Covode.recordClassIndex(101670);
        }

        public final void handleMessage(Message message) {
            AbstractC86441a aVar;
            C86437e eVar = this.f193827a.get();
            if (eVar != null && (aVar = eVar.f193803e) != null) {
                if (eVar.f193800b) {
                    aVar.mo137286a("fetcher is cancelled");
                    return;
                }
                int i = message.what;
                if (i == 0) {
                    aVar.mo137285a((C86633c) message.obj);
                } else if (i == 1) {
                    aVar.mo137284a((C86535p) null, (C86633c) message.obj);
                } else if (i == 2) {
                    C86535p pVar = (C86535p) message.obj;
                    eVar.f193799a = pVar;
                    aVar.mo137284a(pVar, (C86633c) null);
                } else if (i == 3) {
                    aVar.mo137283a(message.arg1, (String) message.obj);
                }
            }
        }

        public HandlerC86442b(C86437e eVar, Looper looper) {
            super(looper);
            this.f193827a = new WeakReference<>(eVar);
        }
    }

    /* renamed from: a */
    public final void mo137470a(C86633c cVar) {
        MethodCollector.m26663i(3103);
        C86641i.m150110a("VideoInfoFetcher", "_retryIfNeeded error ".concat(String.valueOf(cVar)));
        synchronized (this) {
            try {
                if (!this.f193800b) {
                    if (cVar == null) {
                        cVar = new C86633c("kTTVideoErrorDomainFetchingInfo", -9994);
                    } else if (TextUtils.isEmpty(cVar.f195253c) && cVar.f195251a == -9979) {
                        cVar = new C86633c("kTTVideoErrorDomainFetchingInfo", -9979, cVar.f195252b, cVar.f195254d);
                    } else if (TextUtils.isEmpty(cVar.f195253c)) {
                        cVar = new C86633c("kTTVideoErrorDomainFetchingInfo", -9994, cVar.f195252b, cVar.f195254d);
                    }
                    if (cVar.f195251a == -9969) {
                        if (!(cVar.f195252b / 10000 == 10 || cVar.f195252b == -9970)) {
                            cVar.f195251a = -9990;
                        }
                        cVar.f195254d += ("<apiStr:" + this.f193802d + ">");
                        mo137477b(cVar);
                        MethodCollector.m26664o(3103);
                        return;
                    }
                    if (this.f193808j <= 0) {
                        m149157c(cVar);
                        this.f193808j++;
                        m149156b();
                    } else {
                        cVar.f195254d += ("<apiStr:" + this.f193802d + ">");
                        mo137477b(cVar);
                    }
                    MethodCollector.m26664o(3103);
                }
            } finally {
                MethodCollector.m26664o(3103);
            }
        }
    }

    /* renamed from: a */
    public final void mo137472a(String str) {
        HashMap hashMap;
        C86641i.m150110a("VideoInfoFetcher", "_beginToFetch url ".concat(String.valueOf(str)));
        this.f193818t = SystemClock.elapsedRealtime();
        if (!TextUtils.isEmpty(this.f193810l)) {
            hashMap = new HashMap();
            hashMap.put("Authorization", this.f193810l);
        } else {
            hashMap = null;
        }
        Method[] declaredMethods = this.f193812n.getClass().getDeclaredMethods();
        if (declaredMethods != null && declaredMethods.length > 0) {
            for (Method method : declaredMethods) {
                if (method != null && method.getName() != null && method.getName().equals("startTask") && method.getParameterTypes().length == 5) {
                    this.f193812n.mo101099a(str, hashMap, new AbstractC86561j.AbstractC86562a() {
                        /* class com.p2082ss.ttvideoengine.p4412f.C86437e.C864392 */

                        static {
                            Covode.recordClassIndex(101667);
                        }

                        @Override // com.p2082ss.ttvideoengine.p4418k.AbstractC86561j.AbstractC86562a
                        /* renamed from: a */
                        public final void mo137467a(JSONObject jSONObject, C86633c cVar) {
                            if (jSONObject == null) {
                                if (cVar != null) {
                                    C86437e.this.mo137470a(cVar);
                                    return;
                                }
                            } else if (cVar != null) {
                                C86437e.this.f193806h = cVar.f195252b;
                            }
                            C86437e.this.mo137475a(jSONObject, (C86409d.C86410a) null);
                        }
                    });
                    return;
                }
            }
        }
        this.f193812n.mo101100b(str, hashMap, new AbstractC86561j.AbstractC86562a() {
            /* class com.p2082ss.ttvideoengine.p4412f.C86437e.C864403 */

            static {
                Covode.recordClassIndex(101668);
            }

            @Override // com.p2082ss.ttvideoengine.p4418k.AbstractC86561j.AbstractC86562a
            /* renamed from: a */
            public final void mo137467a(JSONObject jSONObject, C86633c cVar) {
                if (jSONObject != null || cVar == null) {
                    C86437e.this.mo137475a(jSONObject, (C86409d.C86410a) null);
                } else {
                    C86437e.this.mo137470a(cVar);
                }
            }
        });
    }

    /* renamed from: a */
    private void m149155a(int i, String str) {
        C86641i.m150110a("VideoInfoFetcher", "_notifyException " + i + ", excMessage " + str);
        this.f193807i.sendMessage(this.f193807i.obtainMessage(3, i, 0, str));
    }

    public C86437e(Context context, AbstractC86561j jVar) {
        AbstractC86561j jVar2 = jVar;
        this.f193819u = context;
        this.f193807i = new HandlerC86442b(this, C86640h.m150077a());
        if (jVar2 == null) {
            jVar2 = C86346ao.f193425b != null ? C86346ao.f193425b : jVar2;
            this.f193814p = false;
            this.f193812n = new C86557i();
            this.f193817s = "";
        }
        if (jVar2 != null) {
            this.f193814p = true;
            this.f193812n = jVar2;
            this.f193817s = "";
        }
        this.f193814p = false;
        this.f193812n = new C86557i();
        this.f193817s = "";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:119:0x024d, code lost:
        if (1 == 0) goto L_0x01c0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo137475a(org.json.JSONObject r12, com.p2082ss.ttvideoengine.p4410d.C86409d.C86410a r13) {
        /*
        // Method dump skipped, instructions count: 697
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttvideoengine.p4412f.C86437e.mo137475a(org.json.JSONObject, com.ss.ttvideoengine.d.d$a):void");
    }

    /* renamed from: a */
    public final void mo137473a(String str, String str2, int i) {
        mo137474a(str, str2, i, null);
    }

    public C86437e(Context context, AbstractC86561j jVar, String str) {
        AbstractC86561j jVar2 = jVar;
        this.f193819u = context;
        this.f193807i = new HandlerC86442b(this, C86640h.m150077a());
        if (jVar2 == null) {
            jVar2 = C86346ao.f193425b != null ? C86346ao.f193425b : jVar2;
            this.f193814p = false;
            this.f193812n = new C86557i();
            this.f193817s = str;
        }
        if (jVar2 != null) {
            this.f193814p = true;
            this.f193812n = jVar2;
            this.f193817s = str;
        }
        this.f193814p = false;
        this.f193812n = new C86557i();
        this.f193817s = str;
    }

    /* renamed from: a */
    public final void mo137474a(String str, String str2, int i, String str3) {
        C86641i.m150110a("VideoInfoFetcher", "fetchInfo apiString " + str + ", auth " + str2 + ", playversion " + i + ", keyseed " + str3);
        this.f193802d = str;
        this.f193810l = str2;
        this.f193808j = 0;
        this.f193813o = i;
        this.f193809k = str3;
        try {
            this.f193815q = new URL(str).getHost();
        } catch (Throwable unused) {
        }
        m149156b();
    }
}
