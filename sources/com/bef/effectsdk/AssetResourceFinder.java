package com.bef.effectsdk;

import android.content.res.AssetManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class AssetResourceFinder implements ResourceFinder {
    private final AssetManager mAssetManager;
    private final String mDir;

    static {
        Covode.recordClassIndex(2657);
    }

    private static native long nativeCreateAssetResourceFinder(long j, AssetManager assetManager, String str);

    private static native void nativeReleaseAssetResourceFinder(long j);

    @Override // com.bef.effectsdk.ResourceFinder
    public final synchronized long createNativeResourceFinder(long j) {
        long nativeCreateAssetResourceFinder;
        MethodCollector.m26663i(6132);
        nativeCreateAssetResourceFinder = nativeCreateAssetResourceFinder(j, this.mAssetManager, this.mDir);
        MethodCollector.m26664o(6132);
        return nativeCreateAssetResourceFinder;
    }

    @Override // com.bef.effectsdk.ResourceFinder
    public final synchronized void release(long j) {
        MethodCollector.m26663i(6133);
        nativeReleaseAssetResourceFinder(j);
        MethodCollector.m26664o(6133);
    }

    public AssetResourceFinder(AssetManager assetManager, String str) {
        this.mAssetManager = assetManager;
        this.mDir = str;
    }
}
