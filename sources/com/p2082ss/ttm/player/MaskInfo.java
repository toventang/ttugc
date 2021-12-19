package com.p2082ss.ttm.player;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.ttm.player.MaskInfo */
public abstract class MaskInfo extends NativeObject {
    static {
        Covode.recordClassIndex(101392);
    }

    /* access modifiers changed from: protected */
    public abstract void onMaskInfoCallback(int i, int i2, String str);
}
