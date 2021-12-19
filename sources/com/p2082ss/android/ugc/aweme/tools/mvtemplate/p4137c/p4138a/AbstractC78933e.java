package com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4137c.p4138a;

import android.view.TextureView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Video;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.c.a.e */
public interface AbstractC78933e {
    static {
        Covode.recordClassIndex(92082);
    }

    void addPlayerListener(AbstractC78931c cVar);

    boolean isPlaying();

    void pause();

    void stop();

    void tryResume(Video video);

    void wrap(TextureView textureView);
}
