package com.bytedance.p1559o;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Type;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.o.q */
public final class C21604q {

    /* renamed from: a */
    public final Type f51239a;

    /* renamed from: b */
    public final String f51240b;

    /* renamed from: c */
    private int f51241c = Integer.MIN_VALUE;

    static {
        Covode.recordClassIndex(25245);
    }

    public final int hashCode() {
        int hashCode;
        if (this.f51241c == Integer.MIN_VALUE) {
            int hashCode2 = this.f51239a.hashCode();
            String str = this.f51240b;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f51241c = hashCode2 ^ hashCode;
        }
        return this.f51241c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo35265a() {
        if (!TextUtils.isEmpty(this.f51240b)) {
            return this.f51239a.toString() + "(" + this.f51240b + ")";
        }
        return this.f51239a.toString();
    }

    public final String toString() {
        return "ServiceKey{" + String.valueOf(this.f51239a) + " " + this.f51240b + "}";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C21604q)) {
            return false;
        }
        C21604q qVar = (C21604q) obj;
        if (!C21607t.m40542a(qVar.f51239a, this.f51239a) || !C21607t.m40542a(qVar.f51240b, this.f51240b)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static C21604q m40540a(Type type, String str) {
        return new C21604q(type, str);
    }

    private C21604q(Type type, String str) {
        this.f51239a = type;
        this.f51240b = str;
    }
}
