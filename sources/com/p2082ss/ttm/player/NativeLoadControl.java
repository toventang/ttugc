package com.p2082ss.ttm.player;

import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.ttm.player.NativeLoadControl */
public class NativeLoadControl extends LoadControl {
    static {
        Covode.recordClassIndex(101396);
    }

    private static boolean isNativeLoadControl(LoadControl loadControl) {
        return loadControl instanceof NativeLoadControl;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ttm.player.LoadControl
    public int onCodecStackSelected(int i) {
        throw new AndroidRuntimeException("Should not be here");
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ttm.player.LoadControl
    public int onFilterStackSelected(int i) {
        throw new AndroidRuntimeException("Should not be here");
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ttm.player.LoadControl
    public int onTrackSelected(int i) {
        throw new AndroidRuntimeException("Should not be here");
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ttm.player.LoadControl
    public boolean shouldStartPlayback(long j, float f, boolean z) {
        throw new AndroidRuntimeException("Should not be here");
    }
}
