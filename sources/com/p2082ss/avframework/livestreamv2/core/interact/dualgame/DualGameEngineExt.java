package com.p2082ss.avframework.livestreamv2.core.interact.dualgame;

import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.engine.VideoSink;
import com.p2082ss.avframework.engine.VideoTrack;
import com.p2082ss.avframework.livestreamv2.IDualGameEngine;
import com.p2082ss.avframework.livestreamv2.filter.IFilterManager;
import com.p2082ss.avframework.mixer.VideoMixer;

/* renamed from: com.ss.avframework.livestreamv2.core.interact.dualgame.DualGameEngineExt */
public abstract class DualGameEngineExt extends VideoSink implements IDualGameEngine {

    /* renamed from: com.ss.avframework.livestreamv2.core.interact.dualgame.DualGameEngineExt$IDualGameFrameCallback */
    public interface IDualGameFrameCallback {
        static {
            Covode.recordClassIndex(100390);
        }

        boolean onDualGameFrameCallback(int i, int i2, int i3, int i4);
    }

    static {
        Covode.recordClassIndex(100389);
    }

    @Override // com.p2082ss.avframework.livestreamv2.IDualGameEngine
    public abstract void connectVideoTrack(VideoTrack videoTrack, boolean z);

    @Override // com.p2082ss.avframework.livestreamv2.IDualGameEngine
    public abstract void enable(boolean z);

    @Override // com.p2082ss.avframework.livestreamv2.IDualGameEngine
    public abstract IFilterManager getDualGameFilterManager();

    @Override // com.p2082ss.avframework.livestreamv2.IDualGameEngine
    public abstract VideoMixer getDualGameMixer();

    @Override // com.p2082ss.avframework.livestreamv2.IDualGameEngine
    public abstract VideoTrack getEncodeVideoTrack();

    @Override // com.p2082ss.avframework.livestreamv2.IDualGameEngine
    public abstract void init(float f);

    @Override // com.p2082ss.avframework.livestreamv2.IDualGameEngine
    public abstract boolean isEnable();

    public abstract boolean mixInteractVideoFrame(int i, int i2, int i3, int i4, float[] fArr);

    @Override // com.p2082ss.avframework.engine.NativeObject, com.p2082ss.avframework.livestreamv2.IDualGameEngine
    public abstract void release();

    public abstract void setDualGameNotifierToLiveCore(IDualGameEngine.IDualGameNotifierToLiveCore iDualGameNotifierToLiveCore);

    public abstract void setInteractVideoSink(com.p2082ss.avframework.livestreamv2.core.interact.video.VideoSink videoSink);
}
