package com.lynx.tasm.behavior.p2052ui.canvas;

import com.bytedance.covode.number.Covode;

/* renamed from: com.lynx.tasm.behavior.ui.canvas.LynxHeliumEffectInfoInterface */
public interface LynxHeliumEffectInfoInterface {
    static {
        Covode.recordClassIndex(34658);
    }

    void backendPreloadLibrary();

    String getEffectAppId();

    String getEffectResourceDownloadUrl();

    boolean getUseLocalEffectPlatformAndRender();

    void setEffectLibraryUrlFallback(String str, boolean z);

    void setEffectResourceDownloadInfo(String str, String str2, boolean z);

    void setSmashUrlFallback(String str, boolean z);

    void setUseExternalEffectLibrary(String str, boolean z);

    void setUseLocalEffectPlatformAndRender(boolean z);

    void updateEffectPathToHelium();

    boolean validateLibrary(boolean z);
}
