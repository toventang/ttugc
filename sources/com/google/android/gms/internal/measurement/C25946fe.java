package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.measurement.fe */
final class C25946fe extends C25954fm {

    /* renamed from: b */
    private final int f61115b;

    /* renamed from: c */
    private final int f61116c;

    static {
        Covode.recordClassIndex(31361);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.C25954fm
    /* renamed from: a */
    public final int mo42422a() {
        return this.f61115b;
    }

    @Override // com.google.android.gms.internal.measurement.C25954fm, com.google.android.gms.internal.measurement.AbstractC25943fb
    public final int zza() {
        return this.f61116c;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.C25954fm, com.google.android.gms.internal.measurement.AbstractC25943fb
    /* renamed from: a */
    public final byte mo42406a(int i) {
        return this.f61122a[this.f61115b + i];
    }

    @Override // com.google.android.gms.internal.measurement.C25954fm, com.google.android.gms.internal.measurement.AbstractC25943fb
    public final byte zza(int i) {
        int zza = zza();
        if (((zza - (i + 1)) | i) >= 0) {
            return this.f61122a[this.f61115b + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(new StringBuilder(22).append("Index < 0: ").append(i).toString());
        }
        throw new ArrayIndexOutOfBoundsException(new StringBuilder(40).append("Index > length: ").append(i).append(", ").append(zza).toString());
    }

    C25946fe(byte[] bArr, int i, int i2) {
        super(bArr);
        m50228a(i, i + i2, bArr.length);
        this.f61115b = i;
        this.f61116c = i2;
    }
}
