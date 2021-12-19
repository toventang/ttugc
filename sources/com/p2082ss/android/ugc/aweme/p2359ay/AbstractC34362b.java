package com.p2082ss.android.ugc.aweme.p2359ay;

import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.retrofit.ExecutorC14760a;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20736m;
import com.facebook.net.AbstractC24901d;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.ay.b */
public abstract class AbstractC34362b implements AbstractC20736m {

    /* renamed from: a */
    protected Executor f81232a;

    /* renamed from: b */
    public AbstractC34379k f81233b;

    /* renamed from: c */
    public AbstractC24901d f81234c;

    /* renamed from: d */
    protected C34380l f81235d;

    static {
        Covode.recordClassIndex(41306);
    }

    public AbstractC34362b() {
        this(new ExecutorC14760a());
        this.f81235d = new C34380l();
    }

    private AbstractC34362b(Executor executor) {
        this.f81232a = executor;
    }

    /* renamed from: a */
    protected static String m70312a(Throwable th) {
        if (th == null) {
            return "";
        }
        try {
            String[] split = th.getMessage().split("\\|");
            if (split != null && split.length >= 2) {
                Logger.debug();
                return split[0];
            }
        } catch (Throwable unused) {
        }
        return "";
    }
}
