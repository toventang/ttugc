package com.bytedance.p1399im.core.internal.utils;

import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1408d.C19538ai;

/* renamed from: com.bytedance.im.core.internal.utils.t */
public class C20043t {

    /* renamed from: b */
    private static volatile C20043t f47632b;

    /* renamed from: a */
    public LruCache<String, C19538ai> f47633a;

    static {
        Covode.recordClassIndex(22888);
    }

    /* renamed from: b */
    public static boolean m37922b() {
        return C19483d.m36365a().mo31141b().f46257av;
    }

    private C20043t() {
        int i = C19483d.m36365a().mo31141b().f46253ar;
        this.f47633a = new LruCache<>(i <= 0 ? 20 : i);
    }

    /* renamed from: a */
    public static C20043t m37921a() {
        MethodCollector.m26663i(9854);
        if (f47632b == null) {
            synchronized (C20043t.class) {
                try {
                    if (f47632b == null) {
                        f47632b = new C20043t();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9854);
                    throw th;
                }
            }
        }
        C20043t tVar = f47632b;
        MethodCollector.m26664o(9854);
        return tVar;
    }

    /* renamed from: a */
    public final C19538ai mo31916a(String str) {
        boolean z;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C19538ai aiVar = this.f47633a.get(str);
        StringBuilder append = new StringBuilder("SendMsgCache getMsg, uuid:").append(str).append(", result:");
        if (aiVar != null) {
            z = true;
        } else {
            z = false;
        }
        C19512f.m36457b("imsdk", append.append(z).toString(), (Throwable) null);
        return aiVar;
    }

    /* renamed from: a */
    public final void mo31917a(C19538ai aiVar) {
        if (!TextUtils.isEmpty(aiVar.getUuid()) && this.f47633a.get(aiVar.getUuid()) != null) {
            C19512f.m36457b("imsdk", "SendMsgCache checkUpdate, uuid:" + aiVar.getUuid(), (Throwable) null);
            this.f47633a.put(aiVar.getUuid(), aiVar);
        }
    }
}
