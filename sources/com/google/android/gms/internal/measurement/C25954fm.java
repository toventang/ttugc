package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.nio.charset.Charset;
import java.util.Objects;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.fm */
public class C25954fm extends AbstractC25951fj {

    /* renamed from: a */
    protected final byte[] f61122a;

    static {
        Covode.recordClassIndex(31369);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo42422a() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25943fb
    public int zza() {
        return this.f61122a.length;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25943fb
    public final boolean zzc() {
        int a = mo42422a();
        return C26071jj.m51024a(this.f61122a, a, zza() + a);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC25943fb
    /* renamed from: a */
    public byte mo42406a(int i) {
        return this.f61122a[i];
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25943fb
    public byte zza(int i) {
        return this.f61122a[i];
    }

    C25954fm(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f61122a = bArr;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC25943fb
    /* renamed from: a */
    public final String mo42408a(Charset charset) {
        return new String(this.f61122a, mo42422a(), zza(), charset);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC25943fb
    /* renamed from: a */
    public final void mo42409a(AbstractC25937ey eyVar) {
        eyVar.mo42381a(this.f61122a, mo42422a(), zza());
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25943fb
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC25943fb) || zza() != ((AbstractC25943fb) obj).zza()) {
            return false;
        }
        if (zza() == 0) {
            return true;
        }
        if (!(obj instanceof C25954fm)) {
            return obj.equals(this);
        }
        AbstractC25943fb fbVar = (AbstractC25943fb) obj;
        int i = this.zzc;
        int i2 = fbVar.zzc;
        if (i == 0 || i2 == 0 || i == i2) {
            return mo42425a(fbVar, zza());
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC25943fb
    /* renamed from: a */
    public final int mo42407a(int i, int i2) {
        return C25989gm.m50597a(i, this.f61122a, mo42422a(), i2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25943fb
    public final AbstractC25943fb zza(int i, int i2) {
        int a = m50228a(0, i2, zza());
        if (a == 0) {
            return AbstractC25943fb.zza;
        }
        return new C25946fe(this.f61122a, mo42422a(), a);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC25951fj
    /* renamed from: a */
    public final boolean mo42425a(AbstractC25943fb fbVar, int i) {
        if (i > fbVar.zza()) {
            throw new IllegalArgumentException(new StringBuilder(40).append("Length too large: ").append(i).append(zza()).toString());
        } else if (i > fbVar.zza()) {
            throw new IllegalArgumentException(new StringBuilder(59).append("Ran off end of other: 0, ").append(i).append(", ").append(fbVar.zza()).toString());
        } else if (!(fbVar instanceof C25954fm)) {
            return fbVar.zza(0, i).equals(zza(0, i));
        } else {
            C25954fm fmVar = (C25954fm) fbVar;
            byte[] bArr = this.f61122a;
            byte[] bArr2 = fmVar.f61122a;
            int a = mo42422a() + i;
            int a2 = mo42422a();
            int a3 = fmVar.mo42422a();
            while (a2 < a) {
                if (bArr[a2] != bArr2[a3]) {
                    return false;
                }
                a2++;
                a3++;
            }
            return true;
        }
    }
}
