package com.google.firebase.p2014f;

import com.bytedance.covode.number.Covode;
import java.util.Objects;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.f.a */
public final class C27742a extends AbstractC27747f {

    /* renamed from: a */
    private final String f65189a;

    /* renamed from: b */
    private final String f65190b;

    static {
        Covode.recordClassIndex(33326);
    }

    @Override // com.google.firebase.p2014f.AbstractC27747f
    /* renamed from: a */
    public final String mo46376a() {
        return this.f65189a;
    }

    @Override // com.google.firebase.p2014f.AbstractC27747f
    /* renamed from: b */
    public final String mo46377b() {
        return this.f65190b;
    }

    public final int hashCode() {
        return ((this.f65189a.hashCode() ^ 1000003) * 1000003) ^ this.f65190b.hashCode();
    }

    public final String toString() {
        return "LibraryVersion{libraryName=" + this.f65189a + ", version=" + this.f65190b + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC27747f) {
            AbstractC27747f fVar = (AbstractC27747f) obj;
            if (!this.f65189a.equals(fVar.mo46376a()) || !this.f65190b.equals(fVar.mo46377b())) {
                return false;
            }
            return true;
        }
        return false;
    }

    C27742a(String str, String str2) {
        Objects.requireNonNull(str, "Null libraryName");
        this.f65189a = str;
        Objects.requireNonNull(str2, "Null version");
        this.f65190b = str2;
    }
}
