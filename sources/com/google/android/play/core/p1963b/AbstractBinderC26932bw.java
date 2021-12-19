package com.google.android.play.core.p1963b;

import android.os.Bundle;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.play.core.b.bw */
public abstract class AbstractBinderC26932bw extends BinderC26928bs implements AbstractC26933bx {
    static {
        Covode.recordClassIndex(32407);
    }

    public AbstractBinderC26932bw() {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.play.core.p1963b.BinderC26928bs
    /* renamed from: a */
    public final boolean mo44576a(int i, Parcel parcel) {
        if (i == 2) {
            mo44416a((Bundle) C26929bt.m53497a(parcel, Bundle.CREATOR));
            return true;
        } else if (i != 3) {
            return false;
        } else {
            mo44417b((Bundle) C26929bt.m53497a(parcel, Bundle.CREATOR));
            return true;
        }
    }
}
