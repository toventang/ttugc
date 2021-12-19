package com.airbnb.epoxy;

import android.os.Handler;
import com.bytedance.covode.number.Covode;

public abstract class AsyncEpoxyController extends AbstractC1944n {
    static {
        Covode.recordClassIndex(2061);
    }

    public AsyncEpoxyController() {
        this(true);
    }

    public AsyncEpoxyController(boolean z) {
        this(z, z);
    }

    private static Handler getHandler(boolean z) {
        if (z) {
            return C1943m.m6166a();
        }
        return C1943m.f5815a;
    }

    public AsyncEpoxyController(boolean z, boolean z2) {
        super(getHandler(z), getHandler(z2));
    }
}
