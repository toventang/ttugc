package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.cs */
public final class C26839cs {

    /* renamed from: a */
    public final String f63674a;

    /* renamed from: b */
    public final long f63675b;

    /* renamed from: c */
    public final int f63676c;

    /* renamed from: d */
    public final boolean f63677d;

    /* renamed from: e */
    public final boolean f63678e;

    /* renamed from: f */
    public final byte[] f63679f;

    static {
        Covode.recordClassIndex(32314);
    }

    C26839cs() {
    }

    C26839cs(String str, long j, int i, boolean z, boolean z2, byte[] bArr) {
        this();
        this.f63674a = str;
        this.f63675b = j;
        this.f63676c = i;
        this.f63677d = z;
        this.f63678e = z2;
        this.f63679f = bArr;
    }

    /* renamed from: a */
    static C26839cs m53304a(String str, long j, int i, boolean z, byte[] bArr, boolean z2) {
        return new C26839cs(str, j, i, z, z2, bArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo44535a() {
        String str = this.f63674a;
        if (str == null) {
            return false;
        }
        return str.endsWith("/");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo44536b() {
        return this.f63676c == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C26839cs) {
            C26839cs csVar = (C26839cs) obj;
            String str = this.f63674a;
            if (str != null ? str.equals(csVar.f63674a) : csVar.f63674a == null) {
                if (this.f63675b == csVar.f63675b && this.f63676c == csVar.f63676c && this.f63677d == csVar.f63677d && this.f63678e == csVar.f63678e) {
                    boolean z = csVar instanceof C26839cs;
                    if (Arrays.equals(this.f63679f, csVar.f63679f)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f63674a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f63675b;
        int i = (((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f63676c) * 1000003;
        int i2 = 1237;
        int i3 = (i ^ (true != this.f63677d ? 1237 : 1231)) * 1000003;
        if (true == this.f63678e) {
            i2 = 1231;
        }
        return ((i3 ^ i2) * 1000003) ^ Arrays.hashCode(this.f63679f);
    }

    public final String toString() {
        String str = this.f63674a;
        long j = this.f63675b;
        int i = this.f63676c;
        boolean z = this.f63677d;
        boolean z2 = this.f63678e;
        String arrays = Arrays.toString(this.f63679f);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 126 + String.valueOf(arrays).length());
        sb.append("ZipEntry{name=");
        sb.append(str);
        sb.append(", size=");
        sb.append(j);
        sb.append(", compressionMethod=");
        sb.append(i);
        sb.append(", isPartial=");
        sb.append(z);
        sb.append(", isEndOfArchive=");
        sb.append(z2);
        sb.append(", headerBytes=");
        sb.append(arrays);
        sb.append("}");
        return sb.toString();
    }
}
