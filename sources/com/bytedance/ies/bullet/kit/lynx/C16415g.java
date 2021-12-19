package com.bytedance.ies.bullet.kit.lynx;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.ies.bullet.kit.lynx.g */
public final class C16415g {

    /* renamed from: a */
    public final int f39418a;

    static {
        Covode.recordClassIndex(18718);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C16415g) && this.f39418a == ((C16415g) obj).f39418a;
        }
        return true;
    }

    public final int hashCode() {
        return this.f39418a;
    }

    public final String toString() {
        return "LynxGlobalSettings(maxScriptCacheSizeInBytes=" + this.f39418a + ")";
    }

    private C16415g() {
        this.f39418a = 10485760;
    }

    public /* synthetic */ C16415g(byte b) {
        this();
    }
}
