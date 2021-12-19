package com.bytedance.ies.abmock.datacenter.p1118c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.datacenter.C16065e;
import com.bytedance.keva.Keva;
import com.bytedance.keva.ext.KevaMultiProcessCache;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.google.gson.C27910f;

/* renamed from: com.bytedance.ies.abmock.datacenter.c.a */
public final class C16057a {

    /* renamed from: a */
    public static final C16057a f38676a = new C16057a();

    /* renamed from: b */
    public Keva f38677b;

    /* renamed from: c */
    private C27910f f38678c;

    /* renamed from: a */
    public final String[] mo25454a(String str) {
        return this.f38677b.getStringArray(str, null);
    }

    static {
        Covode.recordClassIndex(18328);
    }

    private C16057a() {
        System.nanoTime();
        if (C16065e.m29769a().f38697d == 2) {
            this.f38677b = KevaMultiProcessCache.getRepoSync("config_center_repo");
        } else {
            this.f38677b = Keva.getRepoSync("config_center_repo", 1);
        }
    }

    /* renamed from: a */
    public final C27910f mo25449a() {
        if (this.f38678c == null) {
            this.f38678c = new C27910f();
        }
        return this.f38678c;
    }

    /* renamed from: c */
    public final void mo25462c(String str) {
        if (!C16065e.m29769a().f38695b.mo25502f() || this.f38677b.contains(str)) {
            this.f38677b.erase(str);
        }
    }

    /* renamed from: b */
    public final boolean mo25461b(String str) {
        return this.f38677b.contains(str);
    }

    /* renamed from: a */
    public final double mo25445a(String str, double d) {
        return this.f38677b.getDouble(str, d);
    }

    /* renamed from: b */
    public final void mo25455b(String str, double d) {
        this.f38677b.storeDouble(str, d);
    }

    /* renamed from: a */
    public final float mo25446a(String str, float f) {
        return this.f38677b.getFloat(str, f);
    }

    /* renamed from: b */
    public final void mo25456b(String str, float f) {
        this.f38677b.storeFloat(str, f);
    }

    /* renamed from: a */
    public final int mo25447a(String str, int i) {
        return this.f38677b.getInt(str, i);
    }

    /* renamed from: b */
    public final void mo25457b(String str, int i) {
        this.f38677b.storeInt(str, i);
    }

    /* renamed from: a */
    public final long mo25448a(String str, long j) {
        return this.f38677b.getLong(str, j);
    }

    /* renamed from: b */
    public final void mo25458b(String str, long j) {
        this.f38677b.storeLong(str, j);
    }

    /* renamed from: b */
    public final void mo25459b(String str, String str2) {
        this.f38677b.storeString(str, str2);
    }

    /* renamed from: a */
    public final Object mo25450a(String str, Class cls) {
        try {
            return mo25449a().mo46670a(this.f38677b.getString(str, null), cls);
        } catch (Throwable th) {
            C13468b.m24209a("throwable" + th + "  , key = " + str);
            return null;
        }
    }

    /* renamed from: b */
    public final void mo25460b(String str, boolean z) {
        this.f38677b.storeBoolean(str, z);
    }

    /* renamed from: a */
    public final String mo25451a(String str, String str2) {
        return this.f38677b.getString(str, str2);
    }

    /* renamed from: a */
    public final void mo25452a(String str, String[] strArr) {
        this.f38677b.storeStringArray(str, strArr);
    }

    /* renamed from: a */
    public final boolean mo25453a(String str, boolean z) {
        return this.f38677b.getBoolean(str, z);
    }
}
