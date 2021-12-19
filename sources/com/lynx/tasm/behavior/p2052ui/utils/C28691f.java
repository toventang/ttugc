package com.lynx.tasm.behavior.p2052ui.utils;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.shadow.C28542g;
import com.lynx.tasm.utils.C28916c;

/* renamed from: com.lynx.tasm.behavior.ui.utils.f */
public class C28691f {

    /* renamed from: b */
    private static final int[] f67663b = {1, 2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: a */
    public final float[] f67664a;

    /* renamed from: c */
    private int f67665c;

    /* renamed from: d */
    private float f67666d;

    /* renamed from: e */
    private boolean f67667e;

    public C28691f() {
        this(0.0f);
    }

    static {
        Covode.recordClassIndex(34767);
    }

    public C28691f(float f) {
        this.f67664a = new float[]{1.0E21f, 1.0E21f, 1.0E21f, 1.0E21f, 1.0E21f, 1.0E21f, 1.0E21f, 1.0E21f, 1.0E21f};
        this.f67665c = 0;
        this.f67666d = f;
    }

    /* renamed from: a */
    public final float mo49781a(int i) {
        float f;
        char c;
        if (i == 4 || i == 5) {
            f = 1.0E21f;
        } else {
            f = this.f67666d;
        }
        int i2 = this.f67665c;
        if (i2 == 0) {
            return f;
        }
        int[] iArr = f67663b;
        if ((iArr[i] & i2) != 0) {
            return this.f67664a[i];
        }
        if (this.f67667e) {
            if (i == 1 || i == 3) {
                c = 7;
            } else {
                c = 6;
            }
            if ((iArr[c] & i2) != 0) {
                return this.f67664a[c];
            }
            if ((i2 & iArr[8]) != 0) {
                return this.f67664a[8];
            }
        }
        return f;
    }

    /* renamed from: a */
    public final boolean mo49782a(int i, float f) {
        boolean z = false;
        if (C28916c.m57920a(this.f67664a[i], f)) {
            return false;
        }
        this.f67664a[i] = f;
        if (C28542g.m57093a(f)) {
            this.f67665c = (f67663b[i] ^ -1) & this.f67665c;
        } else {
            this.f67665c = f67663b[i] | this.f67665c;
        }
        int i2 = this.f67665c;
        int[] iArr = f67663b;
        if (!((iArr[8] & i2) == 0 && (iArr[7] & i2) == 0 && (i2 & iArr[6]) == 0)) {
            z = true;
        }
        this.f67667e = z;
        return true;
    }
}
