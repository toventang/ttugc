package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class NativeAssetPackStateUpdateListener implements AbstractC26820c {
    static {
        Covode.recordClassIndex(32239);
    }

    @Override // com.google.android.play.core.p1964c.AbstractC26967a
    /* renamed from: a */
    public final /* synthetic */ void mo35005a(Object obj) {
        MethodCollector.m26663i(10868);
        onStateUpdate((AssetPackState) obj);
        MethodCollector.m26664o(10868);
    }

    public native void onStateUpdate(AssetPackState assetPackState);
}
