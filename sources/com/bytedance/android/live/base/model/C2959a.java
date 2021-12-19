package com.bytedance.android.live.base.model;

import com.bytedance.android.livesdk.model.utils.C9906a;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* renamed from: com.bytedance.android.live.base.model.a */
public final class C2959a implements Serializable, Cloneable {
    private static final long serialVersionUID = -6437800749411518984L;

    /* renamed from: a */
    private final String f8707a;

    /* renamed from: b */
    private final String f8708b;

    static {
        Covode.recordClassIndex(3404);
    }

    public final String getName() {
        return this.f8707a;
    }

    public final String getValue() {
        return this.f8708b;
    }

    @Override // java.lang.Object
    public final Object clone() {
        return super.clone();
    }

    public final int hashCode() {
        return C9906a.m18207a(C9906a.m18207a(17, this.f8707a), this.f8708b);
    }

    public final String toString() {
        if (this.f8708b == null) {
            return this.f8707a;
        }
        StringBuilder sb = new StringBuilder(this.f8707a.length() + 1 + this.f8708b.length());
        sb.append(this.f8707a);
        sb.append("=");
        sb.append(this.f8708b);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2959a) {
            C2959a aVar = (C2959a) obj;
            if (!this.f8707a.equals(aVar.f8707a) || !C9906a.m18208a(this.f8708b, aVar.f8708b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C2959a(String str, String str2) {
        if (str != null) {
            this.f8707a = str;
            this.f8708b = str2;
            return;
        }
        throw new IllegalArgumentException("Name may not be null");
    }
}
