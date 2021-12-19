package com.bytedance.crash.runtime;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.crash.C13933m;
import com.bytedance.crash.entity.C13868e;
import com.bytedance.crash.runtime.C13994b;
import com.bytedance.crash.util.C14056j;
import com.bytedance.crash.util.C14062n;
import com.bytedance.crash.util.C14069r;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.runtime.g */
public final class C14007g {

    /* renamed from: h */
    private static C14007g f34143h;

    /* renamed from: i */
    private static boolean f34144i;

    /* renamed from: j */
    private static C14009a f34145j = new C14009a();

    /* renamed from: a */
    private final Context f34146a;

    /* renamed from: b */
    private HashMap<String, Long> f34147b;

    /* renamed from: c */
    private int f34148c = 50;

    /* renamed from: d */
    private int f34149d = 100;

    /* renamed from: e */
    private int f34150e = 100;

    /* renamed from: f */
    private int f34151f = 2;

    /* renamed from: g */
    private int f34152g = 5;

    /* renamed from: com.bytedance.crash.runtime.g$a */
    public static class C14009a {
        static {
            Covode.recordClassIndex(16074);
        }
    }

    static {
        Covode.recordClassIndex(16072);
    }

    /* renamed from: a */
    public static C14007g m25388a() {
        if (f34143h == null) {
            f34143h = new C14007g(C13933m.f33936a);
        }
        return f34143h;
    }

    /* renamed from: d */
    public final boolean mo22528d() {
        if (C13868e.f33762a || m25391a(m25390a("exception", false, (long) this.f34150e))) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private HashMap<String, Long> m25394e() {
        MethodCollector.m26663i(1030);
        File i = C14069r.m25641i(this.f34146a);
        HashMap<String, Long> hashMap = new HashMap<>();
        hashMap.put("time", Long.valueOf(System.currentTimeMillis()));
        try {
            JSONArray a = C14056j.m25563a(i.getAbsolutePath());
            if (C14062n.m25595a(a)) {
                MethodCollector.m26664o(1030);
                return hashMap;
            }
            Long decode = Long.decode(a.optString(0, null));
            if (System.currentTimeMillis() - decode.longValue() > 86400000) {
                File file = new File(C14069r.m25642j(this.f34146a), "issueCrashTimes");
                i.renameTo(new File(file, String.valueOf(System.currentTimeMillis())));
                String[] list = file.list();
                if (list != null && list.length > 5) {
                    Arrays.sort(list);
                    m25393c(new File(file, list[0]));
                }
                MethodCollector.m26664o(1030);
                return hashMap;
            }
            hashMap.put("time", decode);
            for (int i2 = 1; i2 < a.length(); i2++) {
                String[] split = a.optString(i2, "").split(" ");
                if (split.length == 2) {
                    hashMap.put(split[0], Long.decode(split[1]));
                }
            }
            MethodCollector.m26664o(1030);
            return hashMap;
        } catch (IOException unused) {
        } catch (Throwable unused2) {
            C14056j.m25574a(i);
        }
    }

    /* renamed from: b */
    public final void mo22525b() {
        this.f34148c = C13994b.m25328a(this.f34148c, "custom_event_settings", "npth_simple_setting", "crash_limit_issue");
        this.f34149d = C13994b.m25328a(this.f34149d, "custom_event_settings", "npth_simple_setting", "crash_limit_all");
        this.f34150e = C13994b.m25328a(this.f34150e, "custom_event_settings", "npth_simple_setting", "crash_limit_exception");
        this.f34152g = C13994b.m25328a(this.f34152g, "custom_event_settings", "npth_simple_setting", "crash_limit_exception_md5");
        this.f34151f = C13994b.m25328a(this.f34151f, "custom_event_settings", "npth_simple_setting", "crash_limit_exception_stack");
    }

    /* renamed from: c */
    public final void mo22527c() {
        HashMap<String, Long> hashMap = this.f34147b;
        Long remove = hashMap.remove("time");
        if (remove == null) {
            C13849d.m25014a("NPTH_CATCH", new RuntimeException("err times, no time"));
            return;
        }
        StringBuilder append = new StringBuilder().append(remove).append('\n');
        for (Map.Entry<String, Long> entry : hashMap.entrySet()) {
            append.append(entry.getKey()).append(' ').append(entry.getValue()).append('\n');
        }
        try {
            C14056j.m25566a(C14069r.m25641i(this.f34146a), append.toString(), false);
        } catch (IOException unused) {
        }
        hashMap.put("time", remove);
    }

    /* renamed from: a */
    public static boolean m25389a(File file) {
        if (file.getName().contains("deleted") || new File(file, "deleted").exists()) {
            return true;
        }
        return false;
    }

    private C14007g(Context context) {
        this.f34146a = context;
        this.f34147b = m25394e();
        mo22525b();
        C13994b.m25332a(new C13994b.AbstractC13995a() {
            /* class com.bytedance.crash.runtime.C14007g.C140081 */

            static {
                Covode.recordClassIndex(16073);
            }

            @Override // com.bytedance.crash.runtime.C13994b.AbstractC13995a
            /* renamed from: a */
            public final void mo22295a() {
                C14007g.this.mo22525b();
            }

            @Override // com.bytedance.crash.runtime.C13994b.AbstractC13995a
            /* renamed from: b */
            public final void mo22296b() {
                C14007g.this.mo22525b();
            }
        });
    }

    /* renamed from: a */
    private static boolean m25391a(boolean z) {
        if (!z && !f34144i) {
            f34144i = true;
            C14018m.m25417a("crash_limit_exceed", C14062n.m25593a(new JSONObject(), "crash_type", "exception"), null);
        }
        return z;
    }

    /* renamed from: b */
    public static void m25392b(File file) {
        MethodCollector.m26663i(1326);
        try {
            if (!file.getName().contains("deleted")) {
                file.renameTo(new File(file.getParent(), file.getName() + "deleted"));
            }
            if (!new File(file, "deleted").exists()) {
                new File(file, "deleted").createNewFile();
            }
            MethodCollector.m26664o(1326);
        } catch (Throwable unused) {
            MethodCollector.m26664o(1326);
        }
    }

    /* renamed from: c */
    private static boolean m25393c(File file) {
        MethodCollector.m26663i(1308);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(1308);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(1308);
        return delete;
    }

    /* renamed from: a */
    public final boolean mo22523a(String str) {
        if (!m25390a(str, true, (long) this.f34148c) || !m25390a("all", true, (long) this.f34148c)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo22524a(String str, String str2) {
        if (C13868e.f33762a) {
            return true;
        }
        if (!m25391a(m25390a(str, false, (long) this.f34151f)) || (str2 != null && !m25391a(m25390a(str2, false, (long) this.f34152g)))) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo22526b(String str, String str2) {
        if (!C13868e.f33762a && (!m25391a(m25390a(str, false, (long) this.f34151f)) || ((str2 != null && !m25391a(m25390a(str2, false, (long) this.f34152g))) || !m25391a(m25390a("exception", false, (long) this.f34150e))))) {
            return false;
        }
        m25391a(m25390a(str, true, (long) this.f34151f));
        if (str2 != null) {
            m25391a(m25390a(str2, true, (long) this.f34152g));
        }
        m25391a(m25390a("exception", true, (long) this.f34150e));
        return true;
    }

    /* renamed from: a */
    private synchronized boolean m25390a(String str, boolean z, long j) {
        long j2;
        MethodCollector.m26663i(1143);
        if (str == null) {
            str = "default";
        }
        HashMap<String, Long> hashMap = this.f34147b;
        if (z) {
            j2 = 1;
        } else {
            j2 = 0;
        }
        Long valueOf = Long.valueOf(j2);
        if (hashMap == null) {
            valueOf = -1L;
        } else {
            Long l = hashMap.get(str);
            if (l != null) {
                valueOf = Long.valueOf(l.longValue() + valueOf.longValue());
            }
            hashMap.put(str, valueOf);
        }
        if (valueOf.longValue() < j) {
            MethodCollector.m26664o(1143);
            return true;
        }
        MethodCollector.m26664o(1143);
        return false;
    }
}
