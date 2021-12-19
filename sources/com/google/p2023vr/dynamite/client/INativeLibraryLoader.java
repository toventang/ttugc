package com.google.p2023vr.dynamite.client;

import android.os.IInterface;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.vr.dynamite.client.INativeLibraryLoader */
public interface INativeLibraryLoader extends IInterface {
    static {
        Covode.recordClassIndex(33700);
    }

    int checkVersion(String str);

    long initializeAndLoadNativeLibrary(String str);
}
