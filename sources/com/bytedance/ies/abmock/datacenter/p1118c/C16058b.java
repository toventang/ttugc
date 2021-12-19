package com.bytedance.ies.abmock.datacenter.p1118c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.datacenter.C16065e;
import com.bytedance.keva.Keva;
import com.bytedance.keva.ext.KevaMultiProcessCache;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.google.gson.C27910f;

/* renamed from: com.bytedance.ies.abmock.datacenter.c.b */
public final class C16058b {

    /* renamed from: a */
    public static final C16058b f38679a = new C16058b();

    /* renamed from: b */
    private final Keva f38680b;

    /* renamed from: c */
    private C27910f f38681c;

    /* renamed from: a */
    public final String[] mo25472a(String str) {
        return this.f38680b.getStringArray(str, null);
    }

    static {
        Covode.recordClassIndex(18329);
    }

    private C16058b() {
        System.nanoTime();
        if (C16065e.m29769a().f38697d == 2) {
            this.f38680b = KevaMultiProcessCache.getRepoSync("libra_config_center_repo");
        } else {
            this.f38680b = Keva.getRepoSync("libra_config_center_repo", 1);
        }
    }

    /* renamed from: a */
    public final C27910f mo25467a() {
        if (this.f38681c == null) {
            this.f38681c = new C27910f();
        }
        return this.f38681c;
    }

    /* renamed from: c */
    public final void mo25480c(String str) {
        if (!C16065e.m29769a().f38695b.mo25502f() || this.f38680b.contains(str)) {
            this.f38680b.erase(str);
        }
    }

    /* renamed from: b */
    public final boolean mo25479b(String str) {
        return this.f38680b.contains(str);
    }

    /* renamed from: a */
    public final double mo25463a(String str, double d) {
        return this.f38680b.getDouble(str, d);
    }

    /* renamed from: b */
    public final void mo25473b(String str, double d) {
        this.f38680b.storeDouble(str, d);
    }

    /* renamed from: a */
    public final float mo25464a(String str, float f) {
        return this.f38680b.getFloat(str, f);
    }

    /* renamed from: b */
    public final void mo25474b(String str, float f) {
        this.f38680b.storeFloat(str, f);
    }

    /* renamed from: a */
    public final int mo25465a(String str, int i) {
        return this.f38680b.getInt(str, i);
    }

    /* renamed from: b */
    public final void mo25475b(String str, int i) {
        this.f38680b.storeInt(str, i);
    }

    /* renamed from: a */
    public final long mo25466a(String str, long j) {
        return this.f38680b.getLong(str, j);
    }

    /* renamed from: b */
    public final void mo25476b(String str, long j) {
        this.f38680b.storeLong(str, j);
    }

    /* renamed from: b */
    public final void mo25477b(String str, String str2) {
        this.f38680b.storeString(str, str2);
    }

    /* renamed from: a */
    public final Object mo25468a(String str, Class cls) {
        try {
            return mo25467a().mo46670a(this.f38680b.getString(str, null), cls);
        } catch (Throwable th) {
            C13468b.m24209a("throwable" + th + "  , key = " + str);
            return null;
        }
    }

    /* renamed from: b */
    public final void mo25478b(String str, boolean z) {
        this.f38680b.storeBoolean(str, z);
    }

    /* renamed from: a */
    public final String mo25469a(String str, String str2) {
        return this.f38680b.getString(str, str2);
    }

    /* renamed from: a */
    public final void mo25470a(String str, String[] strArr) {
        this.f38680b.storeStringArray(str, strArr);
    }

    /* renamed from: a */
    public final boolean mo25471a(String str, boolean z) {
        return this.f38680b.getBoolean(str, z);
    }
}
