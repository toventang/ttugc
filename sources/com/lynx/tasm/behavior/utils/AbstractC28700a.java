package com.lynx.tasm.behavior.utils;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;

/* renamed from: com.lynx.tasm.behavior.utils.a */
public interface AbstractC28700a<T extends LynxBaseUI> {
    static {
        Covode.recordClassIndex(34794);
    }

    void invoke(T t, String str, ReadableMap readableMap, Callback callback);
}
