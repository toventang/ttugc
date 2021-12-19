package com.bytedance.frameworks.baselib.network.http.p982a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.p995g.C14759i;
import com.bytedance.retrofit2.client.Request;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.frameworks.baselib.network.http.a.b */
public class C14616b {

    /* renamed from: c */
    private static volatile C14616b f35395c;

    /* renamed from: a */
    public C14615a f35396a;

    /* renamed from: b */
    public volatile boolean f35397b;

    static {
        Covode.recordClassIndex(16707);
    }

    private C14616b() {
    }

    /* renamed from: a */
    public static C14616b m26722a() {
        MethodCollector.m26663i(10701);
        if (f35395c == null) {
            synchronized (C14616b.class) {
                try {
                    if (f35395c == null) {
                        f35395c = new C14616b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10701);
                    throw th;
                }
            }
        }
        C14616b bVar = f35395c;
        MethodCollector.m26664o(10701);
        return bVar;
    }

    /* renamed from: a */
    private static boolean m26723a(Set<?> set) {
        if (set == null || set.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final String mo23500a(Request request, String str) {
        CopyOnWriteArraySet<String> copyOnWriteArraySet = this.f35396a.f35386c;
        if (m26723a(copyOnWriteArraySet)) {
            return str;
        }
        for (String str2 : copyOnWriteArraySet) {
            if (C14759i.m27069a(request.getHost(), str2)) {
                if (TextUtils.isEmpty(request.getPath()) || this.f35397b || m26724a(this.f35396a.f35387d, this.f35396a.f35388e, this.f35396a.f35389f, request.getPath()) || m26724a(this.f35396a.f35390g, this.f35396a.f35391h, this.f35396a.f35392i, request.getPath())) {
                    return str;
                }
                boolean z = this.f35396a.f35385b;
                return str;
            }
        }
        return str;
    }

    /* renamed from: a */
    private static boolean m26724a(Set<String> set, Set<String> set2, Set<Pattern> set3, String str) {
        if (!m26723a(set)) {
            for (String str2 : set) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        if (!m26723a(set2)) {
            for (String str3 : set2) {
                if (str.startsWith(str3)) {
                    return true;
                }
            }
        }
        if (m26723a(set3)) {
            return false;
        }
        for (Pattern pattern : set3) {
            if (pattern != null && pattern.matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }
}
