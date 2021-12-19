package com.google.p2023vr.dynamite.client;

import com.bytedance.covode.number.Covode;
import java.util.Objects;

/* access modifiers changed from: package-private */
/* renamed from: com.google.vr.dynamite.client.f */
public final class C28050f {

    /* renamed from: a */
    public final String f65818a;

    /* renamed from: b */
    private final String f65819b;

    static {
        Covode.recordClassIndex(33710);
    }

    public C28050f(String str, String str2) {
        this.f65818a = str;
        this.f65819b = str2;
    }

    public final int hashCode() {
        return (Objects.hashCode(this.f65818a) * 37) + Objects.hashCode(this.f65819b);
    }

    public final String toString() {
        return "[packageName=" + this.f65818a + ",libraryName=" + this.f65819b + "]";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C28050f) {
            C28050f fVar = (C28050f) obj;
            if (!Objects.equals(this.f65818a, fVar.f65818a) || !Objects.equals(this.f65819b, fVar.f65819b)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
