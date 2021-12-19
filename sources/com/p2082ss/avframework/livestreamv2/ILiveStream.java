package com.p2082ss.avframework.livestreamv2;

import android.content.Intent;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.capture.audio.AudioRecordThread;
import com.p2082ss.avframework.engine.VideoSink;
import com.p2082ss.avframework.livestreamv2.control.IVideoCapturerControl;
import com.p2082ss.avframework.livestreamv2.core.audiorecord.IAudioRecordManager;
import com.p2082ss.avframework.livestreamv2.filter.IAudioFilterManager;
import com.p2082ss.avframework.livestreamv2.filter.IFilterManager;
import com.p2082ss.avframework.livestreamv2.filter.VideoCatcher;
import com.p2082ss.avframework.livestreamv2.recorder.IRecorderManager;
import com.p2082ss.avframework.utils.TEBundle;
import com.p2082ss.optimizer.live.sdk.dns.AbstractC86157e;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.Executor;
import javax.microedition.khronos.egl.EGLContext;

/* renamed from: com.ss.avframework.livestreamv2.ILiveStream */
public interface ILiveStream {

    /* renamed from: com.ss.avframework.livestreamv2.ILiveStream$CatchMediaDataCallback */
    public interface CatchMediaDataCallback {
        static {
            Covode.recordClassIndex(100013);
        }

        void onComplete();

        void onError(int i, String str);
    }

    /* renamed from: com.ss.avframework.livestreamv2.ILiveStream$CatchPicCallback */
    public interface CatchPicCallback extends CatchMediaDataCallback {
        static {
            Covode.recordClassIndex(100014);
        }

        void onCatchedPic(boolean z, VideoCatcher videoCatcher);
    }

    /* renamed from: com.ss.avframework.livestreamv2.ILiveStream$CatchVideoCallback */
    public interface CatchVideoCallback extends CatchMediaDataCallback {
        static {
            Covode.recordClassIndex(100015);
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.ILiveStream$IAudioFrameAvailableListener */
    public interface IAudioFrameAvailableListener {
        static {
            Covode.recordClassIndex(100016);
        }

        void onAudioFrameAvailable(Buffer buffer, int i, int i2, int i3, long j);
    }

    /* renamed from: com.ss.avframework.livestreamv2.ILiveStream$ILiveStreamDataListener */
    public interface ILiveStreamDataListener {
        static {
            Covode.recordClassIndex(100017);
        }

        void onData(int i, int i2, int i3);
    }

    /* renamed from: com.ss.avframework.livestreamv2.ILiveStream$ILiveStreamErrorListener */
    public interface ILiveStreamErrorListener {
        static {
            Covode.recordClassIndex(100018);
        }

        void onError(int i, int i2, Exception exc);
    }

    /* renamed from: com.ss.avframework.livestreamv2.ILiveStream$ILiveStreamInfoListener */
    public interface ILiveStreamInfoListener {
        static {
            Covode.recordClassIndex(100019);
        }

        void onInfo(int i, int i2, int i3);
    }

    /* renamed from: com.ss.avframework.livestreamv2.ILiveStream$ITextureFrameAvailableListener */
    public interface ITextureFrameAvailableListener {
        static {
            Covode.recordClassIndex(100020);
        }

        void onTextureFrameAvailable(EGLContext eGLContext, int i, boolean z, int i2, int i3, long j, float[] fArr, Object... objArr);
    }

    static {
        Covode.recordClassIndex(100012);
    }

    void adaptedVideoResolution(int i, int i2);

    void adaptedVideoResolution(int i, int i2, int i3);

    int addSeiField(String str, Object obj, int i);

    int addSeiField(String str, Object obj, int i, boolean z, boolean z2);

    int addSeiField(String str, Object obj, int i, boolean z, boolean z2, int i2);

    void addUserMetaData(String str, String str2, int i);

    boolean audioMute();

    void catchMediaData(Bundle bundle, CatchMediaDataCallback catchMediaDataCallback);

    void catchMediaData(Bundle bundle, CatchPicCallback catchPicCallback);

    void catchVideo(Bundle bundle, CatchVideoCallback catchVideoCallback);

    void changeVideoBitrate(int i, int i2, int i3);

    void changeVideoFps(int i);

    void changeVideoResolution(int i, int i2);

    IInputAudioStream createInputAudioStream();

    IInputVideoStream createInputVideoStream();

    void enableMirror(boolean z, boolean z2);

    void enableMixer(boolean z, boolean z2);

    boolean getAdaptedVideoResolution(int[] iArr);

    IAudioFilterManager getAudioFilterMgr();

    IAudioRecordManager getAudioRecorMgr();

    boolean getLiveStreamInfo(LiveStreamReport liveStreamReport);

    LiveStreamOption getOption();

    IInputAudioStream getOriginInputAudioStream();

    IInputVideoStream getOriginInputVideoStream();

    IRecorderManager getRecorderMgr();

    String getVersion();

    IVideoCapturerControl getVideoCapturerControl();

    IFilterManager getVideoFilterMgr();

    boolean isEnableMixer(boolean z);

    boolean isMirror(boolean z);

    void pause();

    int pushAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j);

    int pushVideoFrame(int i, boolean z, int i2, int i3, int i4, float[] fArr, long j);

    int pushVideoFrame(int i, boolean z, int i2, int i3, int i4, float[] fArr, long j, Bundle bundle);

    int pushVideoFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j);

    void registerAudioRecordingCallback(Executor executor, AudioManager.AudioRecordingCallback audioRecordingCallback);

    void registerScreenAudioPlayBack(AudioRecordThread.IAudioRecordThreadObserver iAudioRecordThreadObserver, int i);

    void release();

    void requestKeyFrame();

    void resume();

    void sendSdkControlMsg(String str);

    int sendSeiMsg(String str);

    void setAudioFrameAvailableListener(IAudioFrameAvailableListener iAudioFrameAvailableListener);

    void setAudioMute(boolean z);

    void setAudioRecordPath(String str);

    void setAudioScenario(int i);

    void setBackGroundPhotoPath(Bitmap bitmap);

    void setBackGroundPhotoPath(String str);

    void setDataListener(ILiveStreamDataListener iLiveStreamDataListener);

    void setDns(AbstractC86157e eVar);

    void setErrorListener(ILiveStreamErrorListener iLiveStreamErrorListener);

    void setInfoListener(ILiveStreamInfoListener iLiveStreamInfoListener);

    void setLowPowerLevel(int i);

    void setOption(LiveStreamOption liveStreamOption);

    void setOriginVideoTrack(String str);

    void setPublishPlanarRender(boolean z);

    void setRadioModeBgBitmap(Bitmap bitmap);

    void setRenderSink(VideoSink videoSink);

    void setScreenIntent(Intent intent);

    void setSeiCurrentShiftDiffTime(long j);

    void setTextureFrameAvailableListener(ITextureFrameAvailableListener iTextureFrameAvailableListener);

    void setTimeInterval(int i);

    void start(String str);

    void start(List<String> list);

    void startAudioCapture();

    void startTransportInDebug();

    void startVideoCapture();

    void stop();

    void stopAudioCapture();

    void stopTransportInDebug();

    void stopVideoCapture();

    void switchAudioCapture(int i);

    void switchAudioMode(int i);

    void switchVideoCapture(int i);

    void unRegisterAudioRecordingCallback(AudioManager.AudioRecordingCallback audioRecordingCallback);

    void unregisterScreenAudioPlayBack();

    void updateSdkParams(TEBundle tEBundle);

    void updateSdkParams(String str);
}
