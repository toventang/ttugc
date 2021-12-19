package com.p2082ss.android.ugc.aweme.bitrateselector.p2391a.p2393b;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.bitrateselector.a.b.a */
public final class C34850a {

    /* renamed from: a */
    private Map<String, Object> f82301a = new HashMap();

    static {
        Covode.recordClassIndex(41858);
    }

    /* renamed from: a */
    public final Map<String, Object> mo61716a() {
        try {
            int indexOf = Build.VERSION.RELEASE.indexOf(".");
            if (indexOf < 0) {
                indexOf = Build.VERSION.RELEASE.length();
            }
            m71208a(Integer.valueOf(Build.VERSION.RELEASE.substring(0, indexOf)).intValue());
        } catch (NumberFormatException unused) {
            m71208a(0);
        }
        return this.f82301a;
    }

    /* renamed from: a */
    private C34850a m71208a(int i) {
        this.f82301a.put("os_ver", Integer.valueOf(i));
        return this;
    }
}
