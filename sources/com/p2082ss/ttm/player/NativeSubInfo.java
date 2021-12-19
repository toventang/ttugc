package com.p2082ss.ttm.player;

import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.ttm.player.NativeSubInfo */
public class NativeSubInfo extends SubInfo {
    static {
        Covode.recordClassIndex(101400);
    }

    private static boolean isNativeSubInfo(SubInfo subInfo) {
        return subInfo instanceof NativeSubInfo;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ttm.player.SubInfo
    public void onSubLoadFinished(int i) {
        throw new AndroidRuntimeException("Should not be here");
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ttm.player.SubInfo
    public void onSubInfoCallback2(int i, String str) {
        throw new AndroidRuntimeException("Should not be here");
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ttm.player.SubInfo
    public void onSubLoadFinished2(int i, String str) {
        throw new AndroidRuntimeException("Should not be here");
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ttm.player.SubInfo
    public void onSubSwitchCompleted(int i, int i2) {
        throw new AndroidRuntimeException("Should not be here");
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ttm.player.SubInfo
    public void onSubInfoCallback(int i, int i2, String str) {
        throw new AndroidRuntimeException("Should not be here");
    }
}
