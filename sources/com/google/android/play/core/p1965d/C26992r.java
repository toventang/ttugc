package com.google.android.play.core.p1965d;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.util.Objects;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.d.r */
public final class C26992r {

    /* renamed from: a */
    public final File f63889a;

    /* renamed from: b */
    public final String f63890b;

    static {
        Covode.recordClassIndex(32468);
    }

    C26992r() {
    }

    C26992r(File file, String str) {
        this();
        Objects.requireNonNull(file, "Null splitFile");
        this.f63889a = file;
        Objects.requireNonNull(str, "Null splitId");
        this.f63890b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C26992r) {
            C26992r rVar = (C26992r) obj;
            return this.f63889a.equals(rVar.f63889a) && this.f63890b.equals(rVar.f63890b);
        }
    }

    public final int hashCode() {
        return ((this.f63889a.hashCode() ^ 1000003) * 1000003) ^ this.f63890b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f63889a);
        String str = this.f63890b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35 + str.length());
        sb.append("SplitFileInfo{splitFile=");
        sb.append(valueOf);
        sb.append(", splitId=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
