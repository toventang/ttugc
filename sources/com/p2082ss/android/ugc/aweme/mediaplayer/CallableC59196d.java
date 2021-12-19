package com.p2082ss.android.ugc.aweme.mediaplayer;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.mediaplayer.d */
final /* synthetic */ class CallableC59196d implements Callable {

    /* renamed from: a */
    private final MediaPlayerModule f134724a;

    static {
        Covode.recordClassIndex(69556);
    }

    CallableC59196d(MediaPlayerModule mediaPlayerModule) {
        this.f134724a = mediaPlayerModule;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i;
        MediaPlayerModule mediaPlayerModule = this.f134724a;
        String str = mediaPlayerModule.f134713a;
        if (mediaPlayerModule.f134717e) {
            i = 0;
        } else if (!TextUtils.isEmpty(str)) {
            i = mediaPlayerModule.f134714b.mo96706a(str);
            if (i >= 0) {
                if (mediaPlayerModule.f134718f.f134732d >= 0 && mediaPlayerModule.f134718f.f134733e - mediaPlayerModule.f134718f.f134732d > 0) {
                    mediaPlayerModule.f134714b.mo96709a(mediaPlayerModule.f134718f.f134732d, mediaPlayerModule.f134718f.f134733e);
                }
                mediaPlayerModule.f134714b.mo96710a(mediaPlayerModule.f134718f.f134731c);
                mediaPlayerModule.f134714b.mo96714b((double) mediaPlayerModule.f134718f.f134729a);
                mediaPlayerModule.f134714b.mo96708a((double) mediaPlayerModule.f134718f.f134730b);
            }
        } else {
            i = -1;
        }
        return Integer.valueOf(i);
    }
}
