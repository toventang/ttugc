package com.google.p2023vr.dynamite.client;

import android.os.IInterface;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.vr.dynamite.client.ILoadedInstanceCreator */
public interface ILoadedInstanceCreator extends IInterface {
    static {
        Covode.recordClassIndex(33699);
    }

    INativeLibraryLoader newNativeLibraryLoader(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2);
}
