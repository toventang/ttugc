package com.bytedance.android.livesdk.model.utils.p593a;

import com.bytedance.android.livesdk.model.utils.C9906a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.utils.a.a */
public final class C9907a implements AbstractC9909c, Cloneable {

    /* renamed from: a */
    private final String f24024a;

    /* renamed from: b */
    private final String f24025b;

    static {
        Covode.recordClassIndex(11453);
    }

    @Override // com.bytedance.android.livesdk.model.utils.p593a.AbstractC9909c
    /* renamed from: a */
    public final String mo16602a() {
        return this.f24024a;
    }

    @Override // com.bytedance.android.livesdk.model.utils.p593a.AbstractC9909c
    /* renamed from: b */
    public final String mo16603b() {
        return this.f24025b;
    }

    @Override // java.lang.Object
    public final Object clone() {
        return super.clone();
    }

    public final int hashCode() {
        return C9906a.m18207a(C9906a.m18207a(17, this.f24024a), this.f24025b);
    }

    public final String toString() {
        int length = this.f24024a.length();
        String str = this.f24025b;
        if (str != null) {
            length += str.length() + 1;
        }
        C9908b bVar = new C9908b(length);
        bVar.mo16608a(this.f24024a);
        if (this.f24025b != null) {
            bVar.mo16608a("=");
            bVar.mo16608a(this.f24025b);
        }
        return bVar.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbstractC9909c) {
            C9907a aVar = (C9907a) obj;
            if (!this.f24024a.equals(aVar.f24024a) || !C9906a.m18208a(this.f24025b, aVar.f24025b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C9907a(String str, String str2) {
        if (str != null) {
            this.f24024a = str;
            this.f24025b = str2;
            return;
        }
        throw new IllegalArgumentException("Name may not be null");
    }
}
