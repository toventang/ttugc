package com.lynx.tasm.behavior.p2052ui.utils;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableArray;

/* renamed from: com.lynx.tasm.behavior.ui.utils.g */
public class C28692g {

    /* renamed from: c */
    public static final C28692g f67668c = new C28692g();

    /* renamed from: a */
    public final float f67669a;

    /* renamed from: b */
    public final float f67670b;

    /* renamed from: d */
    private final int f67671d;

    /* renamed from: e */
    private final int f67672e;

    /* renamed from: c */
    public final boolean mo49785c() {
        if (this.f67671d == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo49786d() {
        if (this.f67672e == 1) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(34768);
    }

    private C28692g() {
        this.f67669a = 0.5f;
        this.f67671d = 1;
        this.f67670b = 0.5f;
        this.f67672e = 1;
    }

    /* renamed from: a */
    public final boolean mo49783a() {
        if (this.f67669a == 0.5f && this.f67671d == 1) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo49784b() {
        if (this.f67670b == 0.5f && this.f67672e == 1) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final boolean mo49787e() {
        if (mo49785c() || mo49786d()) {
            return true;
        }
        return false;
    }

    public C28692g(ReadableArray readableArray) {
        this.f67669a = (float) readableArray.getDouble(0);
        this.f67671d = readableArray.getInt(1);
        if (readableArray.size() >= 4) {
            this.f67670b = (float) readableArray.getDouble(2);
            this.f67672e = readableArray.getInt(3);
            return;
        }
        this.f67670b = 0.5f;
        this.f67672e = 1;
    }

    public C28692g(float f, float f2) {
        this.f67669a = f;
        this.f67670b = f2;
    }
}
