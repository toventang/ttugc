package com.p2082ss.android.ugc.aweme.live.p3408e;

import android.view.TextureView;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.live.e.b */
public interface AbstractC58607b {
    static {
        Covode.recordClassIndex(68904);
    }

    void firstFrame();

    void onPlayerMessage(AbstractC11643g.EnumC11645b bVar, Object obj);

    void onVideoSizeChange(TextureView textureView, int i, int i2);

    void playComplete(String str);

    void playPrepared(String str);

    void playerMediaError(String str);

    void playing();

    void seiUpdate(String str);
}
