package com.bytedance.android.live_settings.p423a;

import com.bytedance.android.live_settings.C6414f;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.google.gson.C27910f;

/* renamed from: com.bytedance.android.live_settings.a.a */
public abstract class AbstractC6406a {

    /* renamed from: a */
    public Keva f15973a = mo12547b();

    /* renamed from: b */
    private C27910f f15974b;

    static {
        Covode.recordClassIndex(7138);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract Keva mo12547b();

    /* renamed from: a */
    public final void mo12542a(String str, String[] strArr) {
        this.f15973a.storeStringArray(str, strArr);
    }

    /* renamed from: c */
    public final void mo12552c() {
        this.f15973a.name();
    }

    protected AbstractC6406a() {
    }

    /* renamed from: a */
    public final C27910f mo12533a() {
        if (this.f15974b == null) {
            this.f15974b = C6414f.m13807a();
        }
        return this.f15974b;
    }

    /* renamed from: a */
    public final void mo12535a(String str) {
        this.f15973a.erase(str);
    }

    /* renamed from: b */
    public final boolean mo12549b(String str) {
        return this.f15973a.contains(str);
    }

    /* renamed from: b */
    public final double mo12543b(String str, double d) {
        return this.f15973a.getDouble(str, d);
    }

    /* renamed from: b */
    public final float mo12544b(String str, float f) {
        return this.f15973a.getFloat(str, f);
    }

    /* renamed from: a */
    public final void mo12536a(String str, double d) {
        this.f15973a.storeDouble(str, d);
    }

    /* renamed from: b */
    public final int mo12545b(String str, int i) {
        return this.f15973a.getInt(str, i);
    }

    /* renamed from: a */
    public final Object mo12534a(String str, Class cls) {
        try {
            return mo12533a().mo46670a(this.f15973a.getString(str, null), cls);
        } catch (Throwable th) {
            SettingsManager.INSTANCE.getMonitor().mo12560a("BaseRepo#getValue", "exception: " + th.getMessage() + "  , key = " + str);
            return null;
        }
    }

    /* renamed from: b */
    public final long mo12546b(String str, long j) {
        return this.f15973a.getLong(str, j);
    }

    /* renamed from: a */
    public final void mo12537a(String str, float f) {
        this.f15973a.storeFloat(str, f);
    }

    /* renamed from: b */
    public final String mo12548b(String str, String str2) {
        return this.f15973a.getString(str, str2);
    }

    /* renamed from: a */
    public final void mo12538a(String str, int i) {
        this.f15973a.storeInt(str, i);
    }

    /* renamed from: a */
    public final void mo12539a(String str, long j) {
        this.f15973a.storeLong(str, j);
    }

    /* renamed from: b */
    public final boolean mo12550b(String str, boolean z) {
        return this.f15973a.getBoolean(str, z);
    }

    /* renamed from: a */
    public final void mo12540a(String str, String str2) {
        this.f15973a.storeString(str, str2);
    }

    /* renamed from: b */
    public final String[] mo12551b(String str, String[] strArr) {
        return this.f15973a.getStringArray(str, strArr);
    }

    /* renamed from: a */
    public final void mo12541a(String str, boolean z) {
        this.f15973a.storeBoolean(str, z);
    }
}
