package com.bytedance.frameworks.baselib.network.http.cronet.p986b;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.b.e */
public class C14655e {

    /* renamed from: e */
    private static volatile C14655e f35556e;

    /* renamed from: f */
    private static final String f35557f = C14655e.class.getSimpleName();

    /* renamed from: a */
    volatile int f35558a;

    /* renamed from: b */
    volatile int f35559b;

    /* renamed from: c */
    public volatile int f35560c = 4;

    /* renamed from: d */
    List<C14656a> f35561d = new CopyOnWriteArrayList();

    static {
        Covode.recordClassIndex(16750);
    }

    private C14655e() {
    }

    /* renamed from: a */
    public static C14655e m26792a() {
        MethodCollector.m26663i(3273);
        if (f35556e == null) {
            synchronized (C14655e.class) {
                try {
                    if (f35556e == null) {
                        f35556e = new C14655e();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3273);
                    throw th;
                }
            }
        }
        C14655e eVar = f35556e;
        MethodCollector.m26664o(3273);
        return eVar;
    }

    /* renamed from: a */
    static boolean m26795a(List<?> list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private C14656a m26797b(String str) {
        for (C14656a aVar : this.f35561d) {
            if (aVar.f35570i.equals(str)) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m26794a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        m26796a(jSONObject, "host_group", arrayList);
        ArrayList arrayList2 = new ArrayList();
        m26796a(jSONObject, "concurrent_hosts", arrayList2);
        if (!arrayList.isEmpty() && arrayList2.size() >= 2) {
            C14656a aVar = new C14656a(arrayList, arrayList2);
            ArrayList arrayList3 = new ArrayList();
            if (m26796a(jSONObject, "equal_group", arrayList3)) {
                aVar.f35564c = arrayList3;
            }
            ArrayList arrayList4 = new ArrayList();
            if (m26796a(jSONObject, "prefix_group", arrayList4)) {
                aVar.f35565d = arrayList4;
            }
            ArrayList arrayList5 = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("pattern_group");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    String optString = optJSONArray.optString(i);
                    if (!TextUtils.isEmpty(optString)) {
                        try {
                            arrayList5.add(Pattern.compile(optString, 2));
                        } catch (Throwable unused) {
                        }
                    }
                }
                aVar.f35566e = arrayList5;
            }
            aVar.f35569h = jSONObject.optInt("fail_count", Integer.MAX_VALUE);
            aVar.f35568g = jSONObject.optInt("forbid_seconds", 0);
            HashSet hashSet = new HashSet();
            JSONArray optJSONArray2 = jSONObject.optJSONArray("block_code_list");
            if (optJSONArray2 != null) {
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    hashSet.add(Integer.valueOf(optJSONArray2.optInt(i2)));
                }
                aVar.f35567f = hashSet;
            }
            this.f35561d.add(aVar);
        }
    }

    /* renamed from: a */
    public final void mo23624a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.f35558a = jSONObject.optInt("enabled", 0);
                this.f35560c = jSONObject.optInt("connect_interval", 4);
                this.f35559b = jSONObject.optInt("retry_for_not_2xx_code", 0);
                this.f35561d.clear();
                JSONArray jSONArray = jSONObject.getJSONArray("match_rules");
                for (int i = 0; i < jSONArray.length(); i++) {
                    m26794a((JSONObject) jSONArray.get(i));
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo23625a(String str, boolean z) {
        C14656a b;
        if (!TextUtils.isEmpty(str) && (b = m26797b(str)) != null) {
            m26793a(b, z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.b.e$a */
    public static class C14656a {

        /* renamed from: a */
        final List<String> f35562a;

        /* renamed from: b */
        public final List<String> f35563b;

        /* renamed from: c */
        List<String> f35564c;

        /* renamed from: d */
        List<String> f35565d;

        /* renamed from: e */
        List<Pattern> f35566e;

        /* renamed from: f */
        Set<Integer> f35567f;

        /* renamed from: g */
        int f35568g = 0;

        /* renamed from: h */
        int f35569h = Integer.MAX_VALUE;

        /* renamed from: i */
        public String f35570i = UUID.randomUUID().toString();

        /* renamed from: j */
        volatile int f35571j = 0;

        /* renamed from: k */
        volatile long f35572k = SystemClock.uptimeMillis();

        /* renamed from: l */
        volatile boolean f35573l = false;

        static {
            Covode.recordClassIndex(16751);
        }

        public C14656a(List<String> list, List<String> list2) {
            this.f35562a = list;
            this.f35563b = list2;
        }
    }

    /* renamed from: a */
    private static void m26793a(C14656a aVar, boolean z) {
        Logger.debug();
        if (!z) {
            int i = aVar.f35571j + 1;
            aVar.f35571j = i;
            if (i >= aVar.f35569h) {
                if (!aVar.f35573l) {
                    aVar.f35573l = true;
                    aVar.f35572k = SystemClock.uptimeMillis();
                }
                Logger.debug();
            }
        } else if (aVar.f35571j != 0 || aVar.f35573l) {
            aVar.f35571j = 0;
            aVar.f35573l = false;
        }
    }

    /* renamed from: a */
    public final boolean mo23626a(int i, String str) {
        C14656a b;
        if (i == 0 || TextUtils.isEmpty(str) || (b = m26797b(str)) == null || b.f35567f == null) {
            return false;
        }
        return b.f35567f.contains(Integer.valueOf(i));
    }

    /* renamed from: a */
    private static boolean m26796a(JSONObject jSONObject, String str, List<String> list) {
        JSONArray optJSONArray;
        if (jSONObject == null || TextUtils.isEmpty(str) || (optJSONArray = jSONObject.optJSONArray(str)) == null) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            String optString = optJSONArray.optString(i);
            if (!TextUtils.isEmpty(optString)) {
                list.add(optString);
            }
        }
        return true;
    }
}
