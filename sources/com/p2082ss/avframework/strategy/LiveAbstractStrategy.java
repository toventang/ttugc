package com.p2082ss.avframework.strategy;

import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.engine.NativeObject;

/* renamed from: com.ss.avframework.strategy.LiveAbstractStrategy */
public class LiveAbstractStrategy extends NativeObject {
    static {
        Covode.recordClassIndex(100700);
    }

    public void onInfo(int i, int i2, int i3) {
        throw new AndroidRuntimeException("BUG, impl it!!!");
    }
}
