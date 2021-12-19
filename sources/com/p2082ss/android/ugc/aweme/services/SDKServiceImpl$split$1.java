package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.ISDKService;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.VEListener;

/* renamed from: com.ss.android.ugc.aweme.services.SDKServiceImpl$split$1 */
public final class SDKServiceImpl$split$1 implements VEListener.AbstractC85248q {
    final /* synthetic */ ISDKService.SplitCallback $callback;
    final /* synthetic */ C85581w $editor;
    final /* synthetic */ int $height;
    final /* synthetic */ int $width;

    static {
        Covode.recordClassIndex(79726);
    }

    @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85248q
    public final void onCompileDone() {
        this.$callback.onSuccess(this.$width, this.$height);
        this.$editor.mo131703j();
    }

    @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85248q
    public final void onCompileProgress(float f) {
        if (this.$callback.checkIsCanceled()) {
            this.$editor.mo131703j();
        }
    }

    SDKServiceImpl$split$1(ISDKService.SplitCallback splitCallback, int i, int i2, C85581w wVar) {
        this.$callback = splitCallback;
        this.$width = i;
        this.$height = i2;
        this.$editor = wVar;
    }

    @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85248q
    public final void onCompileError(int i, int i2, float f, String str) {
        this.$callback.onFail();
        this.$editor.mo131703j();
    }
}
