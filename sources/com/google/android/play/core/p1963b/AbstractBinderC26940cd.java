package com.google.android.play.core.p1963b;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.play.core.b.cd */
public abstract class AbstractBinderC26940cd extends BinderC26928bs implements AbstractC26941ce {
    static {
        Covode.recordClassIndex(32415);
    }

    public AbstractBinderC26940cd() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionService");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.play.core.p1963b.BinderC26928bs
    /* renamed from: a */
    public final boolean mo44576a(int i, Parcel parcel) {
        AbstractC26943cg cgVar = null;
        if (i == 2) {
            Bundle bundle = (Bundle) C26929bt.m53497a(parcel, Bundle.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                cgVar = queryLocalInterface instanceof AbstractC26943cg ? (AbstractC26943cg) queryLocalInterface : new C26942cf(readStrongBinder);
            }
            mo44438a(bundle, cgVar);
            return true;
        } else if (i != 3) {
            return false;
        } else {
            C26929bt.m53497a(parcel, Bundle.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                cgVar = queryLocalInterface2 instanceof AbstractC26943cg ? (AbstractC26943cg) queryLocalInterface2 : new C26942cf(readStrongBinder2);
            }
            mo44439a(cgVar);
            return true;
        }
    }
}
