package com.p2082ss.android.ugc.aweme.mediaplayer;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.ss.android.ugc.aweme.mediaplayer.c */
final /* synthetic */ class C59195c implements AbstractC1214u {

    /* renamed from: a */
    private final MediaPlayerModule f134723a;

    static {
        Covode.recordClassIndex(69555);
    }

    C59195c(MediaPlayerModule mediaPlayerModule) {
        this.f134723a = mediaPlayerModule;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        MediaPlayerModule mediaPlayerModule = this.f134723a;
        C59201i iVar = (C59201i) obj;
        if (iVar != null) {
            switch (iVar.f134735b) {
                case 1:
                    if (iVar.f134734a) {
                        mediaPlayerModule.f134717e = true;
                        return;
                    }
                    return;
                case 2:
                case 4:
                    mediaPlayerModule.f134716d = true;
                    return;
                case 3:
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    mediaPlayerModule.f134716d = false;
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    mediaPlayerModule.f134717e = false;
                    mediaPlayerModule.f134716d = false;
                    return;
                default:
                    return;
            }
        }
    }
}
