package com.bytedance.crash.runtime;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13933m;
import com.bytedance.crash.C13934n;
import com.bytedance.crash.entity.C13865c;
import com.bytedance.crash.entity.C13868e;
import com.bytedance.crash.p932j.C13924m;
import com.bytedance.crash.runtime.p934b.C13996a;
import com.bytedance.crash.runtime.p934b.C13999c;
import com.bytedance.crash.util.C14056j;
import com.bytedance.crash.util.C14062n;
import com.bytedance.crash.util.C14069r;
import com.bytedance.crash.util.C14075v;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.runtime.b */
public final class C13994b {

    /* renamed from: a */
    private static final ConcurrentLinkedQueue<AbstractC13995a> f34116a = new ConcurrentLinkedQueue<>();

    /* renamed from: b */
    private static boolean f34117b;

    /* renamed from: com.bytedance.crash.runtime.b$a */
    public interface AbstractC13995a {
        static {
            Covode.recordClassIndex(16060);
        }

        /* renamed from: a */
        void mo22295a();

        /* renamed from: b */
        void mo22296b();
    }

    static {
        Covode.recordClassIndex(16059);
    }

    /* renamed from: b */
    public static boolean m25335b() {
        if (!C13934n.f33955a || m25330a() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static int m25338d() {
        return m25328a(1, "custom_event_settings", "npth_simple_setting", "gwp_asan_hook_type");
    }

    /* renamed from: f */
    public static int m25340f() {
        return m25328a(0, "custom_event_settings", "npth_simple_setting", "gwp_asan_alloc_size");
    }

    /* renamed from: h */
    public static int m25342h() {
        return m25328a(0, "custom_event_settings", "npth_simple_setting", "gwp_asan_debug");
    }

    /* renamed from: c */
    public static boolean m25337c() {
        if (m25329a("custom_event_settings", "npth_simple_setting", "disable_looper_monitor") == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static int m25339e() {
        return m25328a(128, "custom_event_settings", "npth_simple_setting", "gwp_asan_max_simultaneous_alloc");
    }

    /* renamed from: g */
    public static int m25341g() {
        return m25328a(2500, "custom_event_settings", "npth_simple_setting", "gwp_asan_sample_rate");
    }

    /* renamed from: i */
    public static boolean m25343i() {
        if (m25329a("custom_event_settings", "npth_simple_setting", "enable_native_heap_track") == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static boolean m25344j() {
        if (m25329a("custom_event_settings", "npth_simple_setting", "disable_kill_history") == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public static boolean m25345k() {
        if (m25329a("custom_event_settings", "npth_simple_setting", "enable_kill_history_err") == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static JSONObject m25330a() {
        return C13996a.m25354b(C14004d.m25375a(C13933m.m25221a()));
    }

    /* renamed from: l */
    private static void m25346l() {
        String b = C14062n.m25599b(m25330a(), "custom_event_settings", "npth_simple_setting", "crash_upload_domain");
        JSONArray a = C14062n.m25592a(m25330a(), "custom_event_settings", "npth_simple_setting", "crash_upload_domain_list");
        if (!TextUtils.isEmpty(b) && a != null && a.length() != 0) {
            if (!b.equals(C13977a.f34061a)) {
                int i = 0;
                while (true) {
                    if (i >= a.length()) {
                        C14075v.m25650a("setDomainName: check valid fail");
                        break;
                    } else if (b.equals(a.optString(0))) {
                        C14075v.m25650a("setDomainName:".concat(String.valueOf(b)));
                        C13977a.f34061a = b;
                        break;
                    } else {
                        i++;
                    }
                }
            } else {
                C14075v.m25650a("setDomainName: same domain");
            }
        } else {
            C14075v.m25650a("setDomainName: invalid param");
        }
        Iterator<AbstractC13995a> it = f34116a.iterator();
        while (it.hasNext()) {
            AbstractC13995a next = it.next();
            if (!f34117b) {
                next.mo22295a();
            }
            next.mo22296b();
        }
        f34117b = true;
    }

    /* renamed from: a */
    public static int m25327a(int i) {
        return m25328a(i, "custom_event_settings", "npth_simple_setting", "gwp_asan_init_wait_seconds");
    }

    /* renamed from: a */
    public static int m25329a(String... strArr) {
        return C14062n.m25590a(m25330a(), -1, strArr);
    }

    /* renamed from: a */
    public static void m25332a(AbstractC13995a aVar) {
        f34116a.add(aVar);
        if (f34117b) {
            aVar.mo22295a();
            aVar.mo22296b();
        }
    }

    /* renamed from: a */
    public static int m25328a(int i, String... strArr) {
        return C14062n.m25590a(m25330a(), i, strArr);
    }

    /* renamed from: b */
    public static boolean m25336b(Object obj, String str) {
        C13996a a = C13996a.m25349a(obj);
        if (!(a == null || a.f34119b == null)) {
            if (a.f34121d == null) {
                a.f34121d = C14062n.m25601c(a.f34119b, "custom_event_settings", "allow_service_name", "test");
                if (a.f34121d == null) {
                    a.f34121d = new JSONObject();
                }
            }
            if (a.f34121d.optInt(str) == 1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static JSONObject m25331a(JSONArray jSONArray, String str) {
        if (!(jSONArray == null || jSONArray.length() == 0)) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i).optJSONObject(str);
                if (optJSONObject != null) {
                    return optJSONObject;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m25333a(JSONArray jSONArray, boolean z) {
        if (jSONArray != null) {
            C13933m.f33942g.isDebugMode();
            String a = C14004d.m25375a(C13933m.m25221a());
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    String next = optJSONObject.keys().next();
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject(next);
                    C14075v.m25650a("update config " + next + " : " + optJSONObject2);
                    C13996a.m25350a(next, optJSONObject2);
                    if (TextUtils.equals(a, next)) {
                        m25346l();
                    }
                    if (C13924m.f33923b == null) {
                        C13924m.f33923b = new HashMap();
                    }
                    if (z || !C13924m.f33923b.containsKey(next)) {
                        C13924m.f33923b.put(next, String.valueOf(System.currentTimeMillis()));
                        C14075v.m25650a("udpate config time for aid ".concat(String.valueOf(next)));
                    }
                } catch (Throwable unused) {
                }
            }
            C13999c.m25363a(m25331a(jSONArray, String.valueOf(C14004d.m25375a(C13933m.m25221a()))));
            if (z || C13924m.f33923b == null || C13924m.f33923b.isEmpty() || C13924m.f33923b.size() < C13865c.f33759a.size()) {
                try {
                    C14056j.m25568a(new File(C14069r.m25642j(C13933m.f33936a), "npth/configCrash/configFile"), C13996a.m25353b());
                    C14056j.m25567a(C13924m.m25209b(), C13924m.f33923b);
                } catch (Throwable unused2) {
                }
                C14075v.m25650a("success saveApmConfig");
            }
        }
    }

    /* renamed from: a */
    public static boolean m25334a(Object obj, String str) {
        C13996a a = C13996a.m25349a(obj);
        if (a == null) {
            return false;
        }
        if (C13868e.f33762a) {
            return true;
        }
        if (a.f34119b != null) {
            if (TextUtils.equals(str, "block_monitor")) {
                str = "caton_monitor";
            }
            if (TextUtils.equals(str, "core_exception_monitor")) {
                return a.f34122e;
            }
            if (a.f34120c == null) {
                a.f34120c = C14062n.m25601c(a.f34119b, "custom_event_settings", "allow_log_type", "test");
                if (a.f34120c == null) {
                    a.f34120c = new JSONObject();
                }
            }
            if (a.f34120c.optInt(str) == 1) {
                return true;
            }
        }
        return false;
    }
}
