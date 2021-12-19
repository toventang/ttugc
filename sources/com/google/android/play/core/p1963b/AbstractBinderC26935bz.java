package com.google.android.play.core.p1963b;

import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.play.core.b.bz */
public abstract class AbstractBinderC26935bz extends BinderC26928bs implements AbstractC26937ca {
    static {
        Covode.recordClassIndex(32410);
    }

    /* renamed from: a */
    public static AbstractC26937ca m53513a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
        return queryLocalInterface instanceof AbstractC26937ca ? (AbstractC26937ca) queryLocalInterface : new C26934by(iBinder);
    }
}
