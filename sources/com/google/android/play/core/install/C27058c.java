package com.google.android.play.core.install;

import com.bytedance.covode.number.Covode;
import java.util.Objects;

/* renamed from: com.google.android.play.core.install.c */
public final class C27058c extends InstallState {

    /* renamed from: a */
    private final int f64035a;

    /* renamed from: b */
    private final long f64036b;

    /* renamed from: c */
    private final long f64037c;

    /* renamed from: d */
    private final int f64038d;

    /* renamed from: e */
    private final String f64039e;

    static {
        Covode.recordClassIndex(32536);
    }

    public C27058c(int i, long j, long j2, int i2, String str) {
        this.f64035a = i;
        this.f64036b = j;
        this.f64037c = j2;
        this.f64038d = i2;
        Objects.requireNonNull(str, "Null packageName");
        this.f64039e = str;
    }

    @Override // com.google.android.play.core.install.InstallState
    /* renamed from: a */
    public final int mo44752a() {
        return this.f64035a;
    }

    @Override // com.google.android.play.core.install.InstallState
    /* renamed from: b */
    public final long mo44753b() {
        return this.f64036b;
    }

    @Override // com.google.android.play.core.install.InstallState
    /* renamed from: c */
    public final long mo44754c() {
        return this.f64037c;
    }

    @Override // com.google.android.play.core.install.InstallState
    /* renamed from: d */
    public final int mo44755d() {
        return this.f64038d;
    }

    @Override // com.google.android.play.core.install.InstallState
    /* renamed from: e */
    public final String mo44756e() {
        return this.f64039e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallState) {
            InstallState installState = (InstallState) obj;
            return this.f64035a == installState.mo44752a() && this.f64036b == installState.mo44753b() && this.f64037c == installState.mo44754c() && this.f64038d == installState.mo44755d() && this.f64039e.equals(installState.mo44756e());
        }
    }

    public final int hashCode() {
        int i = this.f64035a;
        long j = this.f64036b;
        long j2 = this.f64037c;
        return ((((((((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f64038d) * 1000003) ^ this.f64039e.hashCode();
    }

    public final String toString() {
        int i = this.f64035a;
        long j = this.f64036b;
        long j2 = this.f64037c;
        int i2 = this.f64038d;
        String str = this.f64039e;
        StringBuilder sb = new StringBuilder(str.length() + 164);
        sb.append("InstallState{installStatus=");
        sb.append(i);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", installErrorCode=");
        sb.append(i2);
        sb.append(", packageName=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
