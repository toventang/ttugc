package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import java.util.Objects;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.ah */
public final class C26774ah extends AssetPackState {

    /* renamed from: a */
    private final String f63441a;

    /* renamed from: b */
    private final int f63442b;

    /* renamed from: c */
    private final int f63443c;

    /* renamed from: d */
    private final long f63444d;

    /* renamed from: e */
    private final long f63445e;

    /* renamed from: f */
    private final int f63446f;

    /* renamed from: g */
    private final int f63447g;

    static {
        Covode.recordClassIndex(32249);
    }

    C26774ah(String str, int i, int i2, long j, long j2, int i3, int i4) {
        Objects.requireNonNull(str, "Null name");
        this.f63441a = str;
        this.f63442b = i;
        this.f63443c = i2;
        this.f63444d = j;
        this.f63445e = j2;
        this.f63446f = i3;
        this.f63447g = i4;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    /* renamed from: a */
    public final String mo44429a() {
        return this.f63441a;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    /* renamed from: b */
    public final int mo44430b() {
        return this.f63442b;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    /* renamed from: c */
    public final int mo44431c() {
        return this.f63443c;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    /* renamed from: d */
    public final long mo44432d() {
        return this.f63444d;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    /* renamed from: e */
    public final long mo44433e() {
        return this.f63445e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetPackState) {
            AssetPackState assetPackState = (AssetPackState) obj;
            return this.f63441a.equals(assetPackState.mo44429a()) && this.f63442b == assetPackState.mo44430b() && this.f63443c == assetPackState.mo44431c() && this.f63444d == assetPackState.mo44432d() && this.f63445e == assetPackState.mo44433e() && this.f63446f == assetPackState.mo44434f() && this.f63447g == assetPackState.mo44435g();
        }
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    /* renamed from: f */
    public final int mo44434f() {
        return this.f63446f;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    /* renamed from: g */
    public final int mo44435g() {
        return this.f63447g;
    }

    public final int hashCode() {
        int hashCode = this.f63441a.hashCode();
        int i = this.f63442b;
        int i2 = this.f63443c;
        long j = this.f63444d;
        long j2 = this.f63445e;
        return ((((((((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f63446f) * 1000003) ^ this.f63447g;
    }

    public final String toString() {
        String str = this.f63441a;
        int i = this.f63442b;
        int i2 = this.f63443c;
        long j = this.f63444d;
        long j2 = this.f63445e;
        int i3 = this.f63446f;
        int i4 = this.f63447g;
        StringBuilder sb = new StringBuilder(str.length() + 217);
        sb.append("AssetPackState{name=");
        sb.append(str);
        sb.append(", status=");
        sb.append(i);
        sb.append(", errorCode=");
        sb.append(i2);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", transferProgressPercentage=");
        sb.append(i3);
        sb.append(", updateAvailability=");
        sb.append(i4);
        sb.append("}");
        return sb.toString();
    }
}
