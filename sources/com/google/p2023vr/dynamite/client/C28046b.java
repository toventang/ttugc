package com.google.p2023vr.dynamite.client;

import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.p1914a.p1915a.C25054a;

/* renamed from: com.google.vr.dynamite.client.b */
public final class C28046b extends C25054a implements INativeLibraryLoader {
    static {
        Covode.recordClassIndex(33706);
    }

    C28046b(IBinder iBinder) {
        super(iBinder, "com.google.vr.dynamite.client.INativeLibraryLoader");
        MethodCollector.m26663i(7215);
        MethodCollector.m26664o(7215);
    }

    @Override // com.google.p2023vr.dynamite.client.INativeLibraryLoader
    public final int checkVersion(String str) {
        MethodCollector.m26663i(7356);
        Parcel a = mo40965a();
        a.writeString(str);
        Parcel a2 = mo40966a(2, a);
        int readInt = a2.readInt();
        a2.recycle();
        MethodCollector.m26664o(7356);
        return readInt;
    }

    @Override // com.google.p2023vr.dynamite.client.INativeLibraryLoader
    public final long initializeAndLoadNativeLibrary(String str) {
        MethodCollector.m26663i(7354);
        Parcel a = mo40965a();
        a.writeString(str);
        Parcel a2 = mo40966a(1, a);
        long readLong = a2.readLong();
        a2.recycle();
        MethodCollector.m26664o(7354);
        return readLong;
    }
}
