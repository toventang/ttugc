package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.cl */
public final class C26832cl {

    /* renamed from: a */
    public final int f63652a;

    /* renamed from: b */
    public final String f63653b;

    /* renamed from: c */
    public final long f63654c;

    /* renamed from: d */
    public final long f63655d;

    /* renamed from: e */
    public final int f63656e;

    static {
        Covode.recordClassIndex(32307);
    }

    C26832cl() {
    }

    C26832cl(int i, String str, long j, long j2, int i2) {
        this();
        this.f63652a = i;
        this.f63653b = str;
        this.f63654c = j;
        this.f63655d = j2;
        this.f63656e = i2;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C26832cl) {
            C26832cl clVar = (C26832cl) obj;
            return this.f63652a == clVar.f63652a && ((str = this.f63653b) != null ? str.equals(clVar.f63653b) : clVar.f63653b == null) && this.f63654c == clVar.f63654c && this.f63655d == clVar.f63655d && this.f63656e == clVar.f63656e;
        }
    }

    public final int hashCode() {
        int i = (this.f63652a ^ 1000003) * 1000003;
        String str = this.f63653b;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f63654c;
        long j2 = this.f63655d;
        return ((((((i ^ hashCode) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f63656e;
    }

    public final String toString() {
        int i = this.f63652a;
        String str = this.f63653b;
        long j = this.f63654c;
        long j2 = this.f63655d;
        int i2 = this.f63656e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 157);
        sb.append("SliceCheckpoint{fileExtractionStatus=");
        sb.append(i);
        sb.append(", filePath=");
        sb.append(str);
        sb.append(", fileOffset=");
        sb.append(j);
        sb.append(", remainingBytes=");
        sb.append(j2);
        sb.append(", previousChunk=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
