package com.google.p2023vr.dynamite.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.p1914a.p1915a.C25054a;
import com.google.p1914a.p1915a.C25056c;

/* renamed from: com.google.vr.dynamite.client.a */
public final class C28045a extends C25054a implements ILoadedInstanceCreator {
    static {
        Covode.recordClassIndex(33705);
    }

    C28045a(IBinder iBinder) {
        super(iBinder, "com.google.vr.dynamite.client.ILoadedInstanceCreator");
        MethodCollector.m26663i(9133);
        MethodCollector.m26664o(9133);
    }

    @Override // com.google.p2023vr.dynamite.client.ILoadedInstanceCreator
    public final INativeLibraryLoader newNativeLibraryLoader(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        INativeLibraryLoader bVar;
        MethodCollector.m26663i(9134);
        Parcel a = mo40965a();
        C25056c.m48026a(a, iObjectWrapper);
        C25056c.m48026a(a, iObjectWrapper2);
        Parcel a2 = mo40966a(1, a);
        IBinder readStrongBinder = a2.readStrongBinder();
        if (readStrongBinder == null) {
            bVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.vr.dynamite.client.INativeLibraryLoader");
            if (queryLocalInterface instanceof INativeLibraryLoader) {
                bVar = (INativeLibraryLoader) queryLocalInterface;
            } else {
                bVar = new C28046b(readStrongBinder);
            }
        }
        a2.recycle();
        MethodCollector.m26664o(9134);
        return bVar;
    }
}
