package com.p2082ss.avframework.livestreamv2;

import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.engine.VideoTrack;
import com.p2082ss.avframework.livestreamv2.filter.IFilterManager;
import com.p2082ss.avframework.mixer.VideoMixer;

/* renamed from: com.ss.avframework.livestreamv2.IDualGameEngine */
public interface IDualGameEngine {

    /* renamed from: com.ss.avframework.livestreamv2.IDualGameEngine$IDualGameNotifierToLiveCore */
    public interface IDualGameNotifierToLiveCore {
        static {
            Covode.recordClassIndex(100008);
        }

        void onDualGameStatusChange(boolean z);
    }

    static {
        Covode.recordClassIndex(100007);
    }

    void connectVideoTrack(VideoTrack videoTrack, boolean z);

    void enable(boolean z);

    IFilterManager getDualGameFilterManager();

    VideoMixer getDualGameMixer();

    VideoTrack getEncodeVideoTrack();

    void init(float f);

    boolean isEnable();

    void release();
}
