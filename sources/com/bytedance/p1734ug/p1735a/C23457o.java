package com.bytedance.p1734ug.p1735a;

import android.content.Context;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.ug.a.o */
public final class C23457o {

    /* renamed from: a */
    public Context f55614a;

    /* renamed from: b */
    public String f55615b;

    /* renamed from: c */
    public String f55616c;

    /* renamed from: d */
    public boolean f55617d;

    /* renamed from: e */
    public int f55618e = 1;

    static {
        Covode.recordClassIndex(27417);
    }

    /* renamed from: a */
    public final C23445f mo38218a() {
        if (this.f55618e == 1 && this.f55614a == null) {
            throw new IllegalArgumentException("context is null");
        } else if (this.f55615b != null && this.f55616c != null) {
            return new C23445f(this.f55614a, this.f55615b, this.f55616c, this.f55617d, this.f55618e);
        } else {
            throw new IllegalArgumentException("sdkName or sdkVersion is invalid. sdkName = " + this.f55615b + ", sdkVersion = " + this.f55616c);
        }
    }
}
