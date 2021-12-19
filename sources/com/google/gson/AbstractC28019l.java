package com.google.gson;

import com.bytedance.covode.number.Covode;
import com.google.gson.internal.C28009k;
import com.google.gson.p2020c.C27900c;
import java.io.IOException;
import java.io.StringWriter;

/* renamed from: com.google.gson.l */
public abstract class AbstractC28019l {
    static {
        Covode.recordClassIndex(33632);
    }

    /* renamed from: i */
    public abstract AbstractC28019l mo46697i();

    /* renamed from: b */
    public Number mo46688b() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: c */
    public String mo46689c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: d */
    public double mo46690d() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: e */
    public float mo46691e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: f */
    public long mo46693f() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: g */
    public int mo46694g() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: h */
    public boolean mo46695h() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: j */
    public final C28022o mo46789j() {
        if (this instanceof C28022o) {
            return (C28022o) this;
        }
        throw new IllegalStateException("Not a JSON Object: ".concat(String.valueOf(this)));
    }

    /* renamed from: k */
    public final C27919i mo46790k() {
        if (this instanceof C27919i) {
            return (C27919i) this;
        }
        throw new IllegalStateException("Not a JSON Array: ".concat(String.valueOf(this)));
    }

    /* renamed from: l */
    public final C28025r mo46791l() {
        if (this instanceof C28025r) {
            return (C28025r) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: ".concat(String.valueOf(this)));
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C27900c cVar = new C27900c(stringWriter);
            cVar.f65525b = true;
            C28009k.m56101a(this, cVar);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
