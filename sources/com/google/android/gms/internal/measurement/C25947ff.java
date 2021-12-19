package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.ff */
final class C25947ff implements AbstractC25949fh {
    static {
        Covode.recordClassIndex(31362);
    }

    private C25947ff() {
    }

    /* synthetic */ C25947ff(byte b) {
        this();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25949fh
    /* renamed from: a */
    public final byte[] mo42423a(byte[] bArr, int i, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }
}
