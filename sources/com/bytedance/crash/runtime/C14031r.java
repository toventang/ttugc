package com.bytedance.crash.runtime;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13933m;
import com.bytedance.crash.util.C14056j;

/* renamed from: com.bytedance.crash.runtime.r */
public final class C14031r {

    /* renamed from: a */
    public String f34192a;

    /* renamed from: b */
    private final int f34193b = -1;

    static {
        Covode.recordClassIndex(16096);
    }

    /* renamed from: a */
    public final String mo22549a() {
        if (!TextUtils.isEmpty(this.f34192a) && !"0".equals(this.f34192a)) {
            return this.f34192a;
        }
        String c = C13933m.m25221a().mo22520c();
        this.f34192a = c;
        if (TextUtils.isEmpty(c) || "0".equals(this.f34192a)) {
            String b = C14026q.m25432a().mo22542b();
            this.f34192a = b;
            return b;
        }
        mo22550a(this.f34192a);
        return this.f34192a;
    }

    /* renamed from: a */
    public final void mo22550a(String str) {
        this.f34192a = str;
        try {
            C14056j.m25566a(C14026q.m25432a().f34177b, str, false);
        } catch (Throwable unused) {
        }
    }
}
