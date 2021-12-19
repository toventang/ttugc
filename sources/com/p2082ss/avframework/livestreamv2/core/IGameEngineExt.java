package com.p2082ss.avframework.livestreamv2.core;

import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.buffer.VideoFrame;
import com.p2082ss.avframework.engine.AudioSink;
import com.p2082ss.avframework.engine.VideoSink;
import com.p2082ss.avframework.livestreamv2.log.LiveStreamLogService;
import com.p2082ss.avframework.mixer.VideoMixer;
import java.nio.Buffer;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.livestreamv2.core.IGameEngineExt */
public abstract class IGameEngineExt implements IGameEngine {

    /* renamed from: com.ss.avframework.livestreamv2.core.IGameEngineExt$GameAudioConsumer */
    public static class GameAudioConsumer extends AudioSink {
        static {
            Covode.recordClassIndex(100211);
        }

        @Override // com.p2082ss.avframework.engine.AudioSink
        public void onData(Buffer buffer, int i, int i2, int i3, long j) {
        }

        @Override // com.p2082ss.avframework.engine.AudioSink
        public void onNoData() {
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.IGameEngineExt$GameVideoConsumer */
    public static class GameVideoConsumer extends VideoSink {
        static {
            Covode.recordClassIndex(100212);
        }

        @Override // com.p2082ss.avframework.engine.VideoSink
        public void OnDiscardedFrame() {
        }

        @Override // com.p2082ss.avframework.engine.VideoSink
        public void onFrame(VideoFrame videoFrame) {
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.IGameEngineExt$IGamePipelineEventObserver */
    public interface IGamePipelineEventObserver {
        static {
            Covode.recordClassIndex(100214);
        }

        void notifyLiveCoreToChangeCameraAdaptedParams(int i, int i2, int i3);

        void notifyLiveCoreToToggleCamera(boolean z, boolean z2);
    }

    static {
        Covode.recordClassIndex(100210);
    }

    /* access modifiers changed from: protected */
    public abstract String getVersion();

    public abstract GameVideoSink getVideoSink();

    public abstract void release();

    public abstract void setGameCallback(GameVideoConsumer gameVideoConsumer, GameAudioConsumer gameAudioConsumer);

    public abstract void setGamePipelineObserver(IGamePipelineEventObserver iGamePipelineEventObserver);

    public abstract void setInteractEngine(InteractEngine interactEngine);

    public abstract void setupLogServer(LiveStreamLogService liveStreamLogService);

    /* renamed from: com.ss.avframework.livestreamv2.core.IGameEngineExt$GameVideoSink */
    public abstract class GameVideoSink extends VideoSink {
        static {
            Covode.recordClassIndex(100213);
        }

        public abstract void onVideoFrame(int i, VideoFrame videoFrame, int i2);

        public abstract void onVideoFrame(int i, VideoMixer.VideoMixerTexture videoMixerTexture, ByteBuffer byteBuffer);

        public GameVideoSink() {
        }
    }
}
