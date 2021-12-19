package com.lynx.tasm.behavior;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.AbstractC28367a;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;

/* renamed from: com.lynx.tasm.behavior.v */
public class C28716v {

    /* renamed from: a */
    public final ReadableMap f67715a;

    static {
        Covode.recordClassIndex(34810);
    }

    public String toString() {
        return "{ " + getClass().getSimpleName() + ": " + this.f67715a.toString() + " }";
    }

    public C28716v(ReadableMap readableMap) {
        this.f67715a = readableMap;
    }

    /* renamed from: a */
    public final boolean mo49821a(String str) {
        return this.f67715a.hasKey(str);
    }

    /* renamed from: b */
    public final boolean mo49823b(String str) {
        return this.f67715a.isNull(str);
    }

    /* renamed from: c */
    public final String mo49824c(String str) {
        return this.f67715a.getString(str);
    }

    /* renamed from: d */
    public final ReadableArray mo49825d(String str) {
        return this.f67715a.getArray(str);
    }

    /* renamed from: e */
    public final ReadableMap mo49826e(String str) {
        return this.f67715a.getMap(str);
    }

    /* renamed from: f */
    public final AbstractC28367a mo49827f(String str) {
        return this.f67715a.getDynamic(str);
    }

    /* renamed from: a */
    public final double mo49818a(String str, double d) {
        if (this.f67715a.isNull(str)) {
            return d;
        }
        return this.f67715a.getDouble(str);
    }

    /* renamed from: a */
    public final float mo49819a(String str, float f) {
        if (this.f67715a.isNull(str)) {
            return f;
        }
        return (float) this.f67715a.getDouble(str);
    }

    /* renamed from: a */
    public final int mo49820a(String str, int i) {
        if (this.f67715a.isNull(str)) {
            return i;
        }
        return this.f67715a.getInt(str);
    }

    /* renamed from: a */
    public final boolean mo49822a(String str, boolean z) {
        if (this.f67715a.isNull(str)) {
            return z;
        }
        return this.f67715a.getBoolean(str);
    }
}
