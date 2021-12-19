package com.lynx.react.bridge;

import com.bytedance.covode.number.Covode;

public interface WritableArray extends ReadableArray {
    static {
        Covode.recordClassIndex(34349);
    }

    void pushArray(WritableArray writableArray);

    void pushBoolean(boolean z);

    void pushByteArray(byte[] bArr);

    void pushDouble(double d);

    void pushInt(int i);

    void pushLong(long j);

    void pushMap(WritableMap writableMap);

    void pushNull();

    void pushString(String str);
}
