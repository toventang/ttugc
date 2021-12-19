package com.p2082ss.avframework.livestreamv2.core;

import android.content.Intent;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.capture.audio.AudioRecordThread;
import com.p2082ss.avframework.engine.AudioDeviceModule;
import com.p2082ss.avframework.engine.MediaSource;
import com.p2082ss.avframework.engine.MediaTrack;
import com.p2082ss.avframework.engine.VideoSink;
import com.p2082ss.avframework.engine.VsyncModule;
import com.p2082ss.avframework.livestreamv2.IDualGameEngine;
import com.p2082ss.avframework.livestreamv2.IInputAudioStream;
import com.p2082ss.avframework.livestreamv2.IInputVideoStream;
import com.p2082ss.avframework.livestreamv2.ILiveStream;
import com.p2082ss.avframework.livestreamv2.LiveStreamBuilder;
import com.p2082ss.avframework.livestreamv2.LiveStreamOption;
import com.p2082ss.avframework.livestreamv2.LiveStreamReport;
import com.p2082ss.avframework.livestreamv2.audioeffect.DummyAudioFilterManager;
import com.p2082ss.avframework.livestreamv2.control.IVideoCapturerControl;
import com.p2082ss.avframework.livestreamv2.core.LiveCore;
import com.p2082ss.avframework.livestreamv2.core.audiorecord.IAudioRecordManager;
import com.p2082ss.avframework.livestreamv2.filter.FilterManager;
import com.p2082ss.avframework.livestreamv2.filter.IAudioFilterManager;
import com.p2082ss.avframework.livestreamv2.filter.IFilterManager;
import com.p2082ss.avframework.livestreamv2.recorder.IRecorderManager;
import com.p2082ss.avframework.player.IAVPlayer;
import com.p2082ss.avframework.utils.TEBundle;
import com.p2082ss.optimizer.live.sdk.dns.AbstractC86157e;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.Executor;
import javax.microedition.khronos.egl.EGLContext;

/* renamed from: com.ss.avframework.livestreamv2.core.DummyLiveCoreImpl */
public class DummyLiveCoreImpl extends LiveCore implements AudioDeviceModule.Observer, ILiveStream.IAudioFrameAvailableListener, ILiveStream.ITextureFrameAvailableListener {
    private IAudioFilterManager mDummyAudioFilterManager = new DummyAudioFilterManager();
    private IFilterManager mDummyFilterMgr = FilterManager.createDummy();

    static {
        Covode.recordClassIndex(100193);
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public void adaptedVideoResolution(int i, int i2) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public void adaptedVideoResolution(int i, int i2, int i3) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.LiveCore
    public void addAudioFrameAvailableListener(ILiveStream.IAudioFrameAvailableListener iAudioFrameAvailableListener) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public int addSeiField(String str, Object obj, int i) {
        return 0;
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public int addSeiField(String str, Object obj, int i, boolean z, boolean z2) {
        return 0;
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public int addSeiField(String str, Object obj, int i, boolean z, boolean z2, int i2) {
        return 0;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.LiveCore
    public void addTextureFrameAvailableListener(ILiveStream.ITextureFrameAvailableListener iTextureFrameAvailableListener) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public void addUserMetaData(String str, String str2, int i) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public boolean audioMute() {
        return false;
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public void catchMediaData(Bundle bundle, ILiveStream.CatchMediaDataCallback catchMediaDataCallback) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public void catchMediaData(Bundle bundle, ILiveStream.CatchPicCallback catchPicCallback) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public void catchVideo(Bundle bundle, ILiveStream.CatchVideoCallback catchVideoCallback) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public void changeVideoBitrate(int i, int i2, int i3) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public void changeVideoFps(int i) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public void changeVideoResolution(int i, int i2) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.LiveCore
    public Client create(LiveCore.InteractConfig interactConfig) {
        return null;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.LiveCore
    public LiveCore.IPushFrameAfterCapture createControlPushFrameAfterCapture(int i, int i2) {
        return null;
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public IInputAudioStream createInputAudioStream() {
        return null;
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public IInputVideoStream createInputVideoStream() {
        return null;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.LiveCore
    public IAVPlayer createPlayer() {
        return null;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.LiveCore
    public MediaTrack createTrack(MediaSource mediaSource, String str) {
        return null;
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public void enableMirror(boolean z, boolean z2) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public void enableMixer(boolean z, boolean z2) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.LiveCore
    public AudioDeviceModule getADM() {
        return null;
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public boolean getAdaptedVideoResolution(int[] iArr) {
        return false;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.LiveCore
    public IAudioDeviceControl getAudioDeviceControl() {
        return null;
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public IAudioRecordManager getAudioRecorMgr() {
        return null;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.LiveCore
    public View getCurrentDisplay() {
        return null;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.LiveCore
    public IDualGameEngine getDualGameEngine() {
        return null;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.LiveCore
    public IGameEngine getGameEngine() {
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.avframework.livestreamv2.core.LiveCore
    public LiveCore.Builder getInternalBuilder() {
        return null;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.LiveCore
    public ILayerControl getLayerControl() {
        return null;
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public boolean getLiveStreamInfo(LiveStreamReport liveStreamReport) {
        return false;
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public LiveStreamOption getOption() {
        return null;
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public IInputAudioStream getOriginInputAudioStream() {
        return null;
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public IInputVideoStream getOriginInputVideoStream() {
        return null;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.LiveCore
    public boolean getPreviewFitMode() {
        return false;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.LiveCore
    public boolean getPreviewMirror(boolean z) {
        return false;
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public IRecorderManager getRecorderMgr() {
        return null;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.LiveCore
    public List<String> getUrls() {
        return null;
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public String getVersion() {
        return "";
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public IVideoCapturerControl getVideoCapturerControl() {
        return null;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.LiveCore
    public VsyncModule getVsyncModule() {
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.avframework.livestreamv2.core.LiveCore
    public Handler getWorkThreadHandler() {
        return null;
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public boolean isEnableMixer(boolean z) {
        return false;
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public boolean isMirror(boolean z) {
        return false;
    }

    @Override // com.p2082ss.avframework.engine.AudioDeviceModule.Observer
    public void onADMInfo(int i, int i2, long j) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream.IAudioFrameAvailableListener
    public void onAudioFrameAvailable(Buffer buffer, int i, int i2, int i3, long j) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream.ITextureFrameAvailableListener
    public void onTextureFrameAvailable(EGLContext eGLContext, int i, boolean z, int i2, int i3, long j, float[] fArr, Object... objArr) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public void pause() {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public int pushAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j) {
        return 0;
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public int pushVideoFrame(int i, boolean z, int i2, int i3, int i4, float[] fArr, long j) {
        return 0;
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public int pushVideoFrame(int i, boolean z, int i2, int i3, int i4, float[] fArr, long j, Bundle bundle) {
        return 0;
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public int pushVideoFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        return 0;
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public void registerAudioRecordingCallback(Executor executor, AudioManager.AudioRecordingCallback audioRecordingCallback) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public void registerScreenAudioPlayBack(AudioRecordThread.IAudioRecordThreadObserver iAudioRecordThreadObserver, int i) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.LiveCore
    public void removeAudioFrameAvailableListener(ILiveStream.IAudioFrameAvailableListener iAudioFrameAvailableListener) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.LiveCore
    public void removeTextureFrameAvailableListener(ILiveStream.ITextureFrameAvailableListener iTextureFrameAvailableListener) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public void requestKeyFrame() {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public void resume() {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public void sendSdkControlMsg(String str) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public int sendSeiMsg(String str) {
        return 0;
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public void setAudioMute(boolean z) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public void setAudioRecordPath(String str) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public void setAudioScenario(int i) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public void setBackGroundPhotoPath(Bitmap bitmap) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public void setBackGroundPhotoPath(String str) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public void setDataListener(ILiveStream.ILiveStreamDataListener iLiveStreamDataListener) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.LiveCore
    public void setDisplay(View view) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.LiveCore
    public void setDisplay(View view, long j) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.LiveCore
    public void setDisplayPlanarRender(boolean z) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public void setDns(AbstractC86157e eVar) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public void setErrorListener(ILiveStream.ILiveStreamErrorListener iLiveStreamErrorListener) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public void setInfoListener(ILiveStream.ILiveStreamInfoListener iLiveStreamInfoListener) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public void setLowPowerLevel(int i) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public void setOption(LiveStreamOption liveStreamOption) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public void setOriginVideoTrack(String str) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.LiveCore
    public void setPreviewFitMode(boolean z) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.LiveCore
    public void setPreviewMirror(boolean z, boolean z2) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public void setPublishPlanarRender(boolean z) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public void setRadioModeBgBitmap(Bitmap bitmap) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream, com.p2082ss.avframework.livestreamv2.core.LiveCore
    public void setRenderSink(VideoSink videoSink) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.LiveCore
    public void setRtcExtraDataListener(LiveCore.RtcExtraDataListener rtcExtraDataListener) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public void setScreenIntent(Intent intent) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public void setSeiCurrentShiftDiffTime(long j) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public void setTimeInterval(int i) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public void start(String str) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public void start(List<String> list) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public void startAudioCapture() {
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.LiveCore
    public int startAudioPlayer() {
        return 0;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.LiveCore
    public void startInternal(List<String> list) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.LiveCore
    public void startInternalAudioCapture() {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public void startTransportInDebug() {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public void startVideoCapture() {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public void stop() {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public void stopAudioCapture() {
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.LiveCore
    public int stopAudioPlayer() {
        return 0;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.LiveCore
    public void stopInternal() {
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.LiveCore
    public void stopInternalAudioCapture() {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public void stopTransportInDebug() {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public void stopVideoCapture() {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public void switchAudioCapture(int i) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public void switchAudioMode(int i) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public void switchVideoCapture(int i) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public void unRegisterAudioRecordingCallback(AudioManager.AudioRecordingCallback audioRecordingCallback) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public void unregisterScreenAudioPlayBack() {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public void updateSdkParams(TEBundle tEBundle) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public void updateSdkParams(String str) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public IAudioFilterManager getAudioFilterMgr() {
        return this.mDummyAudioFilterManager;
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public IFilterManager getVideoFilterMgr() {
        return this.mDummyFilterMgr;
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream
    public synchronized void release() {
        MethodCollector.m26663i(336);
        MethodCollector.m26664o(336);
    }

    public DummyLiveCoreImpl(LiveStreamBuilder liveStreamBuilder) {
    }
}
