package com.google.android.gms.internal.measurement;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.measurement.fb */
public abstract class AbstractC25943fb implements Serializable, Iterable<Byte> {

    /* renamed from: a */
    private static final AbstractC25949fh f61113a;

    /* renamed from: b */
    private static final Comparator<AbstractC25943fb> f61114b = new C25945fd();
    public static final AbstractC25943fb zza = new C25954fm(C25989gm.f61261b);
    public int zzc;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract byte mo42406a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo42407a(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo42408a(Charset charset);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo42409a(AbstractC25937ey eyVar);

    public abstract boolean equals(Object obj);

    public abstract byte zza(int i);

    public abstract int zza();

    public abstract AbstractC25943fb zza(int i, int i2);

    public abstract boolean zzc();

    AbstractC25943fb() {
    }

    /* Return type fixed from 'java.util.Iterator' to match base method */
    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new C25942fa(this);
    }

    public final String zzb() {
        Charset charset = C25989gm.f61260a;
        if (zza() == 0) {
            return "";
        }
        return mo42408a(charset);
    }

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int zza2 = zza();
            i = mo42407a(zza2, zza2);
            if (i == 0) {
                i = 1;
            }
            this.zzc = i;
        }
        return i;
    }

    static {
        AbstractC25949fh ffVar;
        Covode.recordClassIndex(31358);
        if (C25933eu.m50185a()) {
            ffVar = new C25953fl((byte) 0);
        } else {
            ffVar = new C25947ff((byte) 0);
        }
        f61113a = ffVar;
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zza());
        if (zza() <= 50) {
            concat = C26054ix.m50895a(this);
        } else {
            concat = String.valueOf(C26054ix.m50895a(zza(0, 47))).concat("...");
        }
        objArr[2] = concat;
        return C1764a.m5929a(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* renamed from: b */
    static C25952fk m50229b(int i) {
        return new C25952fk(i, (byte) 0);
    }

    public static AbstractC25943fb zza(String str) {
        return new C25954fm(str.getBytes(C25989gm.f61260a));
    }

    public static AbstractC25943fb zza(byte[] bArr, int i, int i2) {
        m50228a(i, i + i2, bArr.length);
        return new C25954fm(f61113a.mo42423a(bArr, i, i2));
    }

    /* renamed from: a */
    static int m50228a(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(new StringBuilder(32).append("Beginning index: ").append(i).append(" < 0").toString());
        } else if (i2 < i) {
            throw new IndexOutOfBoundsException(new StringBuilder(66).append("Beginning index larger than ending index: ").append(i).append(", ").append(i2).toString());
        } else {
            throw new IndexOutOfBoundsException(new StringBuilder(37).append("End index: ").append(i2).append(" >= ").append(i3).toString());
        }
    }
}
