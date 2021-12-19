package com.p2082ss.avframework.livestreamv2.core.interact;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.livestreamv2.IInputAudioStream;
import com.p2082ss.avframework.livestreamv2.core.IAudioDeviceControl;
import com.p2082ss.avframework.livestreamv2.core.InteractEngineBuilder;
import com.p2082ss.avframework.livestreamv2.core.interact.audio.AudioSink;
import com.p2082ss.avframework.livestreamv2.recorder.IRecorderManager;
import com.p2082ss.avframework.utils.AVLog;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.livestreamv2.core.interact.InteractAudioSink */
class InteractAudioSink implements AudioSink {
    private boolean isRenderAble = true;
    private IAudioDeviceControl.IAudioTrack mAudioRender;
    private InteractEngineBuilder mBuilder;
    private String mName;
    private IInputAudioStream mOutAudioStream;
    private IRecorderManager mRecorderMgr;

    static {
        Covode.recordClassIndex(100356);
    }

    /* access modifiers changed from: package-private */
    public IInputAudioStream getOutAudioStream() {
        return this.mOutAudioStream;
    }

    /* access modifiers changed from: package-private */
    public void release() {
        MethodCollector.m26663i(1847);
        synchronized (this) {
            try {
                IInputAudioStream iInputAudioStream = this.mOutAudioStream;
                if (iInputAudioStream != null) {
                    IRecorderManager iRecorderManager = this.mRecorderMgr;
                    if (iRecorderManager != null) {
                        iRecorderManager.removeAudioTrack(iInputAudioStream.getAudioTrack());
                        this.mRecorderMgr = null;
                    }
                    IAudioDeviceControl.IAudioTrack iAudioTrack = this.mAudioRender;
                    if (iAudioTrack != null) {
                        iAudioTrack.setQuirks(0);
                        this.mAudioRender.setAudioTrack(null);
                    }
                    this.mOutAudioStream.stop();
                    this.mOutAudioStream.release();
                    this.mOutAudioStream = null;
                }
                IAudioDeviceControl.IAudioTrack iAudioTrack2 = this.mAudioRender;
                if (iAudioTrack2 != null) {
                    iAudioTrack2.dispose();
                    this.mAudioRender = null;
                }
            } finally {
                MethodCollector.m26664o(1847);
            }
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.audio.AudioSink
    public void setRenderAble(boolean z) {
        AVLog.ioi("InteractAudioSink", "render old state:" + this.isRenderAble + ", new state:" + z);
        this.isRenderAble = z;
    }

    InteractAudioSink(InteractEngineBuilder interactEngineBuilder, String str, int i, int i2) {
        this.mBuilder = interactEngineBuilder;
        this.mName = str;
        if (interactEngineBuilder.mUseInteractAudioSink) {
            AVLog.iow("InteractAudioSink", "Using livecore audio capture, should use livecore audio play too.");
            IInputAudioStream createInputAudioStream = interactEngineBuilder.getLiveCore().createInputAudioStream();
            this.mOutAudioStream = createInputAudioStream;
            if (createInputAudioStream == null) {
                AVLog.iow("InteractAudioSink", "mOutAudioStream is null, maybe LiveStream is being released.");
                return;
            }
            createInputAudioStream.start();
            IRecorderManager recorderMgr = interactEngineBuilder.getLiveCore().getRecorderMgr();
            this.mRecorderMgr = recorderMgr;
            recorderMgr.addAudioTrack(this.mOutAudioStream.getAudioTrack());
            IAudioDeviceControl audioDeviceControl = this.mBuilder.getLiveCore().getAudioDeviceControl();
            if (audioDeviceControl != null) {
                IAudioDeviceControl.IAudioTrack createTrack = audioDeviceControl.createTrack(this.mName, i, i2, 16);
                this.mAudioRender = createTrack;
                if (createTrack != null) {
                    createTrack.setVolume(1.0f);
                    this.mAudioRender.setAudioTrack(this.mOutAudioStream.getAudioTrack());
                    this.mAudioRender.setQuirks(2);
                }
                this.mBuilder.getLiveCore().startAudioPlayer();
            }
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.audio.AudioSink
    public void onPlaybackAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        ByteBuffer byteBuffer2;
        if (this.isRenderAble) {
            byteBuffer.position(0);
            if (!byteBuffer.isDirect()) {
                byteBuffer2 = ByteBuffer.allocateDirect(byteBuffer.capacity());
                byteBuffer.position(0);
                byteBuffer2.position(0);
                byteBuffer2.put(byteBuffer);
            } else {
                byteBuffer2 = byteBuffer;
            }
            long j2 = j * 1000;
            IAudioDeviceControl.IAudioTrack iAudioTrack = this.mAudioRender;
            if (iAudioTrack != null) {
                AVLog.logToIODevice2(4, "InteractAudioSink", "onPlaybackAudioFrame", null, "Client.java:onPlaybackAudioFrame", 10000);
                iAudioTrack.onData(byteBuffer2, i2, i3, i, j2 * 1000);
            }
        }
    }
}
