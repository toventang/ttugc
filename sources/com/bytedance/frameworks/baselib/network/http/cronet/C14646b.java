package com.bytedance.frameworks.baselib.network.http.cronet;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.b */
public class C14646b {

    /* renamed from: H */
    public static volatile C14646b f35468H;

    /* renamed from: I */
    public static final /* synthetic */ boolean f35469I = true;

    /* renamed from: a */
    public static final String f35470a = C14646b.class.getSimpleName();

    /* renamed from: A */
    public long f35471A = -1;

    /* renamed from: B */
    public long f35472B = -1;

    /* renamed from: C */
    public long f35473C = -1;

    /* renamed from: D */
    public long f35474D = -1;

    /* renamed from: E */
    public long f35475E = -1;

    /* renamed from: F */
    public long f35476F = -1;

    /* renamed from: G */
    public long f35477G = -1;

    /* renamed from: b */
    public EnumC14647a f35478b = EnumC14647a.NONE;

    /* renamed from: c */
    public boolean f35479c = true;

    /* renamed from: d */
    public int f35480d;

    /* renamed from: e */
    public long f35481e;

    /* renamed from: f */
    public long f35482f;

    /* renamed from: g */
    public long f35483g;

    /* renamed from: h */
    public long f35484h;

    /* renamed from: i */
    public long f35485i;

    /* renamed from: j */
    public long f35486j;

    /* renamed from: k */
    public long f35487k;

    /* renamed from: l */
    public long f35488l;

    /* renamed from: m */
    public long f35489m;

    /* renamed from: n */
    public long f35490n;

    /* renamed from: o */
    public long f35491o;

    /* renamed from: p */
    public long f35492p;

    /* renamed from: q */
    public long f35493q;

    /* renamed from: r */
    public long f35494r;

    /* renamed from: s */
    public long f35495s;

    /* renamed from: t */
    public long f35496t = -1;

    /* renamed from: u */
    public long f35497u = -1;

    /* renamed from: v */
    public long f35498v = -1;

    /* renamed from: w */
    public long f35499w = -1;

    /* renamed from: x */
    public long f35500x = -1;

    /* renamed from: y */
    public long f35501y = -1;

    /* renamed from: z */
    public long f35502z = -1;

    static {
        Covode.recordClassIndex(16741);
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.b$a */
    public enum EnumC14647a {
        NONE(0),
        LAZY_INIT(1),
        PRE_INIT(2),
        FORCE_INIT(3);
        

        /* renamed from: a */
        final int f35504a;

        static {
            Covode.recordClassIndex(16742);
        }

        private EnumC14647a(int i) {
            this.f35504a = i;
        }
    }

    /* renamed from: a */
    public static C14646b m26772a() {
        MethodCollector.m26663i(1644);
        if (f35468H == null) {
            synchronized (C14646b.class) {
                try {
                    if (f35468H == null) {
                        f35468H = new C14646b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(1644);
                    throw th;
                }
            }
        }
        C14646b bVar = f35468H;
        MethodCollector.m26664o(1644);
        return bVar;
    }

    /* renamed from: b */
    public final JSONObject mo23614b() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject.put("mode", this.f35478b.f35504a);
            jSONObject.put("is_main_process", this.f35479c);
            jSONObject.put("net_thread_priority", this.f35480d);
            jSONObject2.put("ttnet_start", this.f35481e);
            jSONObject2.put("ttnet_end", this.f35482f);
            jSONObject2.put("engine_start", this.f35486j);
            jSONObject2.put("engine_end", this.f35487k);
            jSONObject2.put("init_start", this.f35488l);
            jSONObject2.put("init_end", this.f35489m);
            jSONObject2.put("network_start", this.f35492p);
            jSONObject2.put("network_end", this.f35493q);
            jSONObject2.put("exec_wait_end", this.f35494r);
            jSONObject2.put("preconnect_start", this.f35495s);
            jSONObject3.put("builder_build", this.f35496t);
            jSONObject3.put("load_cronet", this.f35497u);
            jSONObject3.put("init_mssdk", this.f35485i);
            m26773a(jSONObject3, "init_ttnet", this.f35481e, this.f35482f);
            m26773a(jSONObject3, "init_metasec", this.f35483g, this.f35484h);
            m26773a(jSONObject3, "create_engine", this.f35486j, this.f35487k);
            m26773a(jSONObject3, "init_thread", this.f35488l, this.f35489m);
            m26773a(jSONObject3, "native_init_thread", this.f35490n, this.f35491o);
            m26773a(jSONObject3, "network_thread", this.f35492p, this.f35493q);
            m26773a(jSONObject3, "exec_tasks", this.f35493q, this.f35494r);
            m26773a(jSONObject3, "init_total", this.f35481e, this.f35493q);
            m26773a(jSONObject3, "init_preconnect", this.f35481e, this.f35495s);
            jSONObject3.put("nqe_init", this.f35498v);
            jSONObject3.put("prefs_init", this.f35499w);
            jSONObject3.put("channel_init", this.f35500x);
            jSONObject3.put("context_build", this.f35501y);
            jSONObject3.put("tnc_config", this.f35502z);
            jSONObject3.put("update_appinfo", this.f35471A);
            jSONObject3.put("netlog_init", this.f35472B);
            jSONObject3.put("nqe_detect", this.f35473C);
            jSONObject3.put("preconnect", this.f35474D);
            jSONObject3.put("ssl_session", this.f35475E);
            jSONObject3.put("ttnet_config", this.f35476F);
            jSONObject3.put("install_cert", this.f35477G);
            jSONObject.put("ttnet_timestamp", jSONObject2);
            jSONObject.put("ttnet_duration", jSONObject3);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static boolean m26774a(Context context, List<Long> list) {
        Class<?> cls;
        HashMap hashMap = null;
        try {
            cls = Class.forName("com.bytedance.mobsec.metasec.ml.MSB");
            if (cls == null) {
                try {
                    cls = Class.forName("com.bytedance.mobsec.metasec.ov.MSB");
                } catch (ClassNotFoundException unused) {
                }
            }
        } catch (ClassNotFoundException unused2) {
            cls = null;
        }
        if (cls == null) {
            return false;
        }
        if (list != null) {
            try {
                if (list.size() == 2) {
                    hashMap = new HashMap();
                    hashMap.put("http_callback", String.valueOf(list.get(0)));
                    hashMap.put("ws_callback", String.valueOf(list.get(1)));
                }
            } catch (Throwable unused3) {
                return false;
            }
        }
        cls.getMethod("a", Context.class, Integer.TYPE, Map.class).invoke(cls, context, 1, hashMap);
        return true;
    }

    /* renamed from: a */
    private static void m26773a(JSONObject jSONObject, String str, long j, long j2) {
        if (j > j2) {
            try {
                jSONObject.put(str, -1);
            } catch (JSONException unused) {
            }
        } else {
            jSONObject.put(str, j2 - j);
        }
    }
}
