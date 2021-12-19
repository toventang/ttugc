package com.p2082ss.ttm.player;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.ttm.player.LoadControl */
public abstract class LoadControl extends NativeObject {
    static {
        Covode.recordClassIndex(101391);
    }

    /* access modifiers changed from: protected */
    public abstract int onCodecStackSelected(int i);

    /* access modifiers changed from: protected */
    public abstract int onFilterStackSelected(int i);

    /* access modifiers changed from: protected */
    public abstract int onTrackSelected(int i);

    /* access modifiers changed from: protected */
    public abstract boolean shouldStartPlayback(long j, float f, boolean z);
}
