package com.p2082ss.ttm.player;

import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.ttm.player.NativeMaskInfo */
public class NativeMaskInfo extends MaskInfo {
    static {
        Covode.recordClassIndex(101397);
    }

    private static boolean isNativeMaskInfo(MaskInfo maskInfo) {
        return maskInfo instanceof NativeMaskInfo;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ttm.player.MaskInfo
    public void onMaskInfoCallback(int i, int i2, String str) {
        throw new AndroidRuntimeException("Should not be here");
    }
}
