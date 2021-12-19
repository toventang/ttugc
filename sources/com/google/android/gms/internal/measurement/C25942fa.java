package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.NoSuchElementException;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.fa */
public final class C25942fa extends AbstractC25944fc {

    /* renamed from: a */
    private int f61110a;

    /* renamed from: b */
    private final int f61111b;

    /* renamed from: c */
    private final /* synthetic */ AbstractC25943fb f61112c;

    static {
        Covode.recordClassIndex(31357);
    }

    public final boolean hasNext() {
        if (this.f61110a < this.f61111b) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25948fg
    /* renamed from: a */
    public final byte mo42404a() {
        int i = this.f61110a;
        if (i < this.f61111b) {
            this.f61110a = i + 1;
            return this.f61112c.mo42406a(i);
        }
        throw new NoSuchElementException();
    }

    C25942fa(AbstractC25943fb fbVar) {
        this.f61112c = fbVar;
        this.f61111b = fbVar.zza();
    }
}
