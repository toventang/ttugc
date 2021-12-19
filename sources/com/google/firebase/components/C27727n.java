package com.google.firebase.components;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.firebase.components.n */
public final class C27727n {

    /* renamed from: a */
    public final Class<?> f65157a;

    /* renamed from: b */
    final int f65158b;

    /* renamed from: c */
    private final int f65159c = 0;

    static {
        Covode.recordClassIndex(33310);
    }

    /* renamed from: b */
    public final boolean mo46366b() {
        if (this.f65159c == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo46365a() {
        if (this.f65158b == 2) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f65157a.hashCode() ^ 1000003) * 1000003) ^ this.f65158b) * 1000003) ^ this.f65159c;
    }

    public final String toString() {
        String str;
        StringBuilder append = new StringBuilder("Dependency{anInterface=").append(this.f65157a).append(", type=");
        int i = this.f65158b;
        boolean z = true;
        if (i == 1) {
            str = "required";
        } else if (i == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        StringBuilder append2 = append.append(str).append(", direct=");
        if (this.f65159c != 0) {
            z = false;
        }
        return append2.append(z).append("}").toString();
    }

    /* renamed from: a */
    public static C27727n m55442a(Class<?> cls) {
        return new C27727n(cls, 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C27727n) {
            C27727n nVar = (C27727n) obj;
            if (this.f65157a == nVar.f65157a && this.f65158b == nVar.f65158b && this.f65159c == nVar.f65159c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C27727n(Class<?> cls, int i) {
        this.f65157a = (Class) C27734u.m55452a(cls, "Null dependency anInterface.");
        this.f65158b = i;
    }
}
