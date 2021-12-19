package com.p2082ss.avframework.livestreamv2.core.interact;

import android.os.Handler;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.Log;
import android.util.SparseArray;
import android.view.SurfaceView;
import android.view.TextureView;
import com.C1764a;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.avframework.livestreamv2.IDualGameEngine;
import com.p2082ss.avframework.livestreamv2.core.Client;
import com.p2082ss.avframework.livestreamv2.core.ILayerControl;
import com.p2082ss.avframework.livestreamv2.core.InteractEngine;
import com.p2082ss.avframework.livestreamv2.core.InteractEngineBuilder;
import com.p2082ss.avframework.livestreamv2.core.LiveCore;
import com.p2082ss.avframework.livestreamv2.core.interact.audio.AudioCallback;
import com.p2082ss.avframework.livestreamv2.core.interact.audio.AudioClient;
import com.p2082ss.avframework.livestreamv2.core.interact.audio.AudioClientFactory;
import com.p2082ss.avframework.livestreamv2.core.interact.audio.AudioSink;
import com.p2082ss.avframework.livestreamv2.core.interact.audio.AudioSinkFactory;
import com.p2082ss.avframework.livestreamv2.core.interact.dualgame.DualGameEngineExt;
import com.p2082ss.avframework.livestreamv2.core.interact.model.Config;
import com.p2082ss.avframework.livestreamv2.core.interact.model.Region;
import com.p2082ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics;
import com.p2082ss.avframework.livestreamv2.core.interact.statistic.InteractLogService;
import com.p2082ss.avframework.livestreamv2.core.interact.statistic.InteractStaticsImpl;
import com.p2082ss.avframework.livestreamv2.core.interact.statistic.LocalUserStatistics;
import com.p2082ss.avframework.livestreamv2.core.interact.statistic.Statistics;
import com.p2082ss.avframework.livestreamv2.core.interact.video.VideoCallback;
import com.p2082ss.avframework.livestreamv2.core.interact.video.VideoClient;
import com.p2082ss.avframework.livestreamv2.core.interact.video.VideoClientFactory;
import com.p2082ss.avframework.livestreamv2.core.interact.video.VideoSink;
import com.p2082ss.avframework.livestreamv2.core.interact.video.VideoSinkFactory;
import com.p2082ss.avframework.mixer.VideoMixer;
import com.p2082ss.avframework.opengl.VideoColorRange;
import com.p2082ss.avframework.utils.AVLog;
import com.p2082ss.avframework.utils.TimeUtils;
import com.p2082ss.bytertc.engine.IAudioFrameObserver;
import com.p2082ss.bytertc.engine.IRTCRoom;
import com.p2082ss.bytertc.engine.RTCEngine;
import com.p2082ss.bytertc.engine.UserInfo;
import com.p2082ss.bytertc.engine.VideoCanvas;
import com.p2082ss.bytertc.engine.VideoStreamDescription;
import com.p2082ss.bytertc.engine.data.AudioChannel;
import com.p2082ss.bytertc.engine.data.AudioFormat;
import com.p2082ss.bytertc.engine.data.AudioPlaybackDevice;
import com.p2082ss.bytertc.engine.data.AudioSampleRate;
import com.p2082ss.bytertc.engine.data.MediaInputType;
import com.p2082ss.bytertc.engine.data.MuteState;
import com.p2082ss.bytertc.engine.data.RemoteStreamKey;
import com.p2082ss.bytertc.engine.data.StreamIndex;
import com.p2082ss.bytertc.engine.data.VideoFrameInfo;
import com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler;
import com.p2082ss.bytertc.engine.live.ILiveTranscodingObserver;
import com.p2082ss.bytertc.engine.live.LiveTranscoding;
import com.p2082ss.bytertc.engine.livertc.LiveInfo;
import com.p2082ss.bytertc.engine.livertc.LiveRTCEngine;
import com.p2082ss.bytertc.engine.livertc.LiveRTCExtInfo;
import com.p2082ss.bytertc.engine.mediaio.IVideoSink;
import com.p2082ss.bytertc.engine.mediaio.RTCVideoFrame;
import com.p2082ss.bytertc.engine.utils.AudioFrame;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.microedition.khronos.egl.EGLContext;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.VideoFrame;

/* renamed from: com.ss.avframework.livestreamv2.core.interact.ClientExt */
public class ClientExt implements Client {
    public static final String TAG = ClientExt.class.getName();
    private JSONObject authInfoCache;
    protected boolean clientStarted;
    protected boolean disposed = false;
    private boolean liveTranscodingState = false;
    protected AudioClient mAudioClient;
    protected AudioClientFactory mAudioClientFactory;
    public String mAudioClientLastError = "";
    protected AudioSinkWrapper mAudioSink;
    protected AudioSinkFactory mAudioSinkFactory;
    protected InteractEngineBuilder mBuilder;
    public int mColorRange = -1;
    protected LiveCore.InteractConfig mConfig;
    protected boolean mEnableRemoteAllRender = true;
    public Client.InteractEventListener mEventListener;
    protected Client.IAudioFrameObserver mExternalAudioFrameObserver;
    protected Map<String, Long> mFirstRemoteVideoFrameTimestamp = new ConcurrentHashMap();
    protected List<String> mGuestList = new ArrayList();
    public final InteractEngine mInteractEngine;
    IInteractStatics mInteractStatics;
    private IAudioFrameObserver mInternalAudioFrameObserver = new IAudioFrameObserver() {
        /* class com.p2082ss.avframework.livestreamv2.core.interact.ClientExt.C8582011 */
        private long lastPrintTime;

        static {
            Covode.recordClassIndex(100287);
        }

        @Override // com.p2082ss.bytertc.engine.IAudioFrameObserver
        public void onPlaybackAudioFrameBeforeMixing(String str, AudioFrame audioFrame) {
        }

        @Override // com.p2082ss.bytertc.engine.IAudioFrameObserver
        public void onMixedAudioFrame(AudioFrame audioFrame) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.lastPrintTime > 20000) {
                AVLog.m147809w(ClientExt.TAG, "onMixedAudioFrame");
                this.lastPrintTime = currentTimeMillis;
            }
            Client.IAudioFrameObserver iAudioFrameObserver = ClientExt.this.mExternalAudioFrameObserver;
            if (iAudioFrameObserver != null && iAudioFrameObserver.wantMixedAudioFrame()) {
                iAudioFrameObserver.onMixedAudioFrame(ByteBuffer.wrap(audioFrame.buffer), audioFrame.samples, audioFrame.sampleRate.value(), audioFrame.channel.value(), System.currentTimeMillis());
            }
        }

        @Override // com.p2082ss.bytertc.engine.IAudioFrameObserver
        public void onPlaybackAudioFrame(AudioFrame audioFrame) {
            Client.IAudioFrameObserver iAudioFrameObserver = ClientExt.this.mExternalAudioFrameObserver;
            if (iAudioFrameObserver != null && iAudioFrameObserver.wantPlaybackAudioFrame()) {
                iAudioFrameObserver.onPlaybackAudioFrame(ByteBuffer.wrap(audioFrame.buffer), audioFrame.samples, audioFrame.sampleRate.value(), audioFrame.channel.value(), System.currentTimeMillis());
            }
        }

        @Override // com.p2082ss.bytertc.engine.IAudioFrameObserver
        public void onRecordAudioFrame(AudioFrame audioFrame) {
            Client.IAudioFrameObserver iAudioFrameObserver = ClientExt.this.mExternalAudioFrameObserver;
            if (iAudioFrameObserver != null && iAudioFrameObserver.wantRecordAudioFrame()) {
                iAudioFrameObserver.onRecordAudioFrame(ByteBuffer.wrap(audioFrame.buffer), audioFrame.samples, audioFrame.sampleRate.value(), audioFrame.channel.value(), System.currentTimeMillis());
            }
        }
    };
    public Client.Listener mInternalListener = new Client.Listener() {
        /* class com.p2082ss.avframework.livestreamv2.core.interact.ClientExt.C8582112 */

        static {
            Covode.recordClassIndex(100288);
        }

        @Override // com.p2082ss.avframework.livestreamv2.core.Client.Listener
        public void onInfo(final Client client, final int i, final long j, final Object... objArr) {
            Handler handler = ClientExt.this.mConfig.getHandler();
            if (handler == null || handler.getLooper().getThread() == Thread.currentThread()) {
                Client.Listener listener = ClientExt.this.mListener;
                if (listener != null) {
                    listener.onInfo(client, i, j, objArr);
                    return;
                }
                return;
            }
            handler.post(new Runnable() {
                /* class com.p2082ss.avframework.livestreamv2.core.interact.ClientExt.C8582112.RunnableC858221 */

                static {
                    Covode.recordClassIndex(100289);
                }

                public void run() {
                    C8582112.this.onInfo(client, i, j, objArr);
                }
            });
        }

        @Override // com.p2082ss.avframework.livestreamv2.core.Client.Listener
        public void onError(final Client client, final int i, final long j, final Exception exc) {
            Handler handler = ClientExt.this.mConfig.getHandler();
            if (handler == null || handler.getLooper().getThread() == Thread.currentThread()) {
                AVLog.debugTrace(Integer.valueOf(i), Long.valueOf(j), exc.toString());
                String str = "code2: " + j + ". Message: " + exc.getMessage() + ". Stack: " + Log.getStackTraceString(exc);
                InteractLogService interactLogService = ClientExt.this.mLogService;
                if (interactLogService != null) {
                    interactLogService.onErrorOccurs(i, str);
                }
                Client.Listener listener = ClientExt.this.mListener;
                if (listener != null) {
                    listener.onError(client, i, j, exc);
                    return;
                }
                return;
            }
            handler.post(new Runnable() {
                /* class com.p2082ss.avframework.livestreamv2.core.interact.ClientExt.C8582112.RunnableC858232 */

                static {
                    Covode.recordClassIndex(100290);
                }

                public void run() {
                    C8582112.this.onError(client, i, j, exc);
                }
            });
        }
    };
    private IRTCEngineEventHandler mInternalRtcCallback = new IRTCEngineEventHandler() {
        /* class com.p2082ss.avframework.livestreamv2.core.interact.ClientExt.C8582615 */
        private SparseArray<String> mTranscodeingErrors;

        static {
            Covode.recordClassIndex(100293);
        }

        @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onAudioMixingFinished() {
            AVLog.debugTrace(new Object[0]);
            ClientExt.this.mRtcCallback.onAudioMixingFinished();
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ void lambda$onJoinRoomResult$0$ClientExt$15() {
            ClientExt.this.clearAllSinkWrappers();
            if (ClientExt.this.mAudioSink != null) {
                ClientExt.this.mAudioSink.start();
            }
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ void lambda$onLiveTranscodingResult$4$ClientExt$15() {
            if (ClientExt.this.clientStarted && ClientExt.this.mInteractEngine.getBuilder().getPushStreamSwitchAfterServerMixStream() && !ClientExt.this.mServerMixStreamPublishedReceived) {
                AVLog.iod(ClientExt.TAG, "Received onStreamPublished callback, let livecore to stop push stream");
                ClientExt.this.mServerMixStreamPublishedReceived = true;
                Runnable runnable = ClientExt.this.mTaskOnStreamPublished;
                if (runnable != null) {
                    runnable.run();
                }
                ClientExt.this.mTaskOnStreamPublished = null;
            }
        }

        @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onSimulcastSubscribeFallback(IRTCEngineEventHandler.RemoteStreamSwitch remoteStreamSwitch) {
            AVLog.debugTrace(new Object[0]);
            ClientExt.this.mRtcCallback.onSimulcastSubscribeFallback(remoteStreamSwitch);
        }

        @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onAudioEffectFinished(int i) {
            AVLog.debugTrace(new Object[0]);
            ClientExt.this.mRtcCallback.onAudioEffectFinished(i);
            ClientExt.this.mInternalListener.onInfo(ClientExt.this, 20, (long) i, new Object[0]);
        }

        @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onAudioPlaybackDeviceChanged(AudioPlaybackDevice audioPlaybackDevice) {
            AVLog.debugTrace(audioPlaybackDevice.toString());
            ClientExt.this.mRtcCallback.onAudioPlaybackDeviceChanged(audioPlaybackDevice);
        }

        @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onFirstLocalAudioFrame(StreamIndex streamIndex) {
            AVLog.debugTrace(0);
            ClientExt.this.mRtcCallback.onFirstLocalAudioFrame(streamIndex);
        }

        @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onNetworkTypeChanged(int i) {
            AVLog.debugTrace(Integer.valueOf(i));
            ClientExt.this.mRtcCallback.onNetworkTypeChanged(i);
            ClientExt.this.mLogService.onNetworkChanged(String.valueOf(i));
        }

        @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onError(int i) {
            AVLog.debugTrace(Integer.valueOf(i));
            ClientExt.this.mRtcCallback.onError(i);
            ClientExt.this.mInternalListener.onError(ClientExt.this, -3, (long) i, new Exception("onError, code: ".concat(String.valueOf(i))));
        }

        @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onLeaveRoom(IRTCEngineEventHandler.RTCRoomStats rTCRoomStats) {
            AVLog.debugTrace(new Object[0]);
            ClientExt.this.mRtcCallback.onLeaveRoom(rTCRoomStats);
            ClientExt.this.mLogService.onLeaveChannelReturn();
            ClientExt.this.mInteractStatics.calcDurationFromInteractToLive();
            long[] jArr = new long[2];
            ClientExt.this.mInteractStatics.getInteractConnectDurationInfo(jArr);
            ClientExt.this.mLogService.onInteractConnectionTimeCount(jArr);
        }

        @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onRoomStats(IRTCEngineEventHandler.RTCRoomStats rTCRoomStats) {
            AVLog.debugTrace(new Object[0]);
            ClientExt.this.mRtcCallback.onRoomStats(rTCRoomStats);
            ClientExt.this.mInteractStatics.onLocalRtcStats(rTCRoomStats);
            ClientExt.this.mInternalListener.onInfo(ClientExt.this, 2, (long) rTCRoomStats.txVideoKBitRate, Integer.valueOf(rTCRoomStats.txAudioKBitRate));
        }

        @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onUserStartAudioCapture(String str) {
            AVLog.debugTrace(str, true);
            ClientExt.this.mRtcCallback.onUserStartAudioCapture(str);
            ClientExt.this.mLogService.onMediaStateChanged("onUserEnableLocalAudio", 1, str);
        }

        @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onUserStartVideoCapture(String str) {
            AVLog.debugTrace(str, true);
            ClientExt.this.mRtcCallback.onUserStartVideoCapture(str);
            ClientExt.this.mLogService.onMediaStateChanged("onUserEnableLocalVideo", 1, str);
        }

        @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onUserStopAudioCapture(String str) {
            AVLog.debugTrace(str, false);
            ClientExt.this.mRtcCallback.onUserStopAudioCapture(str);
            ClientExt.this.mLogService.onMediaStateChanged("onUserEnableLocalAudio", 0, str);
        }

        @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onUserStopVideoCapture(String str) {
            AVLog.debugTrace(str, false);
            ClientExt.this.mRtcCallback.onUserStopVideoCapture(str);
            ClientExt.this.mLogService.onMediaStateChanged("onUserEnableLocalVideo", 0, str);
        }

        @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onWarning(int i) {
            AVLog.debugTrace(Integer.valueOf(i));
            ClientExt.this.mRtcCallback.onWarning(i);
            ClientExt.this.mLogService.onWarningOccurs(i, "");
            ClientExt.this.mInternalListener.onInfo(ClientExt.this, 6, (long) i, "onWarning, code: ".concat(String.valueOf(i)));
        }

        @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onFirstRemoteAudioFrame(RemoteStreamKey remoteStreamKey) {
            AVLog.debugTrace(remoteStreamKey.getUserId(), remoteStreamKey.getRoomId());
            ClientExt.this.mRtcCallback.onFirstRemoteAudioFrame(remoteStreamKey);
            if (remoteStreamKey.getUserId().equals(ClientExt.this.mSelfInteractId)) {
                AVLog.iow(ClientExt.TAG, "Received my onFirstRemoteAudioFrame");
                return;
            }
            ClientExt.this.mLogService.onFirstRemoteFrame(true, remoteStreamKey.getUserId());
            String str = InteractEngine.AUDIO_LAYER_NAME;
            ClientExt.this.mInternalListener.onInfo(ClientExt.this, 10, 0, remoteStreamKey.getUserId(), str);
        }

        @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onLocalStreamStats(IRTCEngineEventHandler.LocalStreamStats localStreamStats) {
            ClientExt.this.mRtcCallback.onLocalStreamStats(localStreamStats);
            ClientExt.this.mInteractStatics.onLocalNetworkQuality(localStreamStats.txQuality);
            ClientExt.this.mInteractStatics.onLocalVideoStats(localStreamStats.videoStats);
            ClientExt.this.mInteractStatics.onLocalAudioStats(localStreamStats.audioStats);
            Client.InteractEventListener interactEventListener = ClientExt.this.mEventListener;
            if (interactEventListener != null) {
                ClientExt clientExt = ClientExt.this;
                interactEventListener.onInteractInfoReport(clientExt, clientExt.mSelfInteractId, 12, 0, Integer.valueOf(localStreamStats.txQuality), Integer.valueOf(localStreamStats.rxQuality));
            }
            Client.Listener listener = ClientExt.this.mInternalListener;
            ClientExt clientExt2 = ClientExt.this;
            listener.onInfo(clientExt2, 12, 0, clientExt2.mSelfInteractId, Integer.valueOf(localStreamStats.txQuality), Integer.valueOf(localStreamStats.rxQuality));
        }

        @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onRemoteStreamStats(IRTCEngineEventHandler.RemoteStreamStats remoteStreamStats) {
            ClientExt.this.mRtcCallback.onRemoteStreamStats(remoteStreamStats);
            ClientExt.this.mInteractStatics.onRemoteVideoStats(remoteStreamStats);
            ClientExt.this.mInteractStatics.onRemoteAudioStats(remoteStreamStats);
            Client.InteractEventListener interactEventListener = ClientExt.this.mEventListener;
            if (interactEventListener != null) {
                ClientExt clientExt = ClientExt.this;
                interactEventListener.onInteractInfoReport(clientExt, clientExt.mSelfInteractId, 12, 0, remoteStreamStats.uid, Integer.valueOf(remoteStreamStats.txQuality), Integer.valueOf(remoteStreamStats.rxQuality));
            }
            ClientExt.this.mInternalListener.onInfo(ClientExt.this, 12, 0, remoteStreamStats.uid, Integer.valueOf(remoteStreamStats.txQuality), Integer.valueOf(remoteStreamStats.rxQuality));
            ClientExt.this.mInternalListener.onInfo(ClientExt.this, 1, (long) remoteStreamStats.audioStats.jitterBufferDelay, new Object[0]);
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ void lambda$onUserJoined$1$ClientExt$15(UserInfo userInfo) {
            MethodCollector.m26663i(1090);
            if (ClientExt.this.stopped) {
                AVLog.ioi(ClientExt.TAG, "already stop, not deal with userjoin message[" + this + "]");
                MethodCollector.m26664o(1090);
                return;
            }
            if (ClientExt.this.mVideoSinkFactory != null) {
                VideoSinkWrapper videoSinkWrapper = new VideoSinkWrapper(userInfo.getUid());
                AVLog.ioi(ClientExt.TAG, "setupRemoteVideoRender after receive onUserJoined");
                videoSinkWrapper.setOnlyNeedRemoteSei(ClientExt.this.mOnlyConsumeAllRemoteSei);
                ClientExt.this.mRtcEngine.setupRemoteVideoRender(videoSinkWrapper, userInfo.getUid());
                if (ClientExt.this.mSingleViewMode || videoSinkWrapper.isValid()) {
                    synchronized (ClientExt.this.mVideoSinkMap) {
                        try {
                            if (!ClientExt.this.mVideoSinkMap.containsKey(userInfo.getUid())) {
                                ClientExt.this.mVideoSinkMap.put(userInfo.getUid(), videoSinkWrapper);
                                videoSinkWrapper.setRenderAble(ClientExt.this.mEnableRemoteAllRender);
                            } else {
                                videoSinkWrapper.release();
                                AVLog.ioe(ClientExt.TAG, "Already received onUserJoined of " + userInfo.getUid());
                                return;
                            }
                        } finally {
                            MethodCollector.m26664o(1090);
                        }
                    }
                } else {
                    videoSinkWrapper.release();
                    AVLog.ioe(ClientExt.TAG, "View is null. Maybe received user join when releasing livecore.");
                    MethodCollector.m26664o(1090);
                    return;
                }
            }
            if (!ClientExt.this.mInteractEngine.getBuilder().getPkAudienceSetUpConnectionOptimize() || (ClientExt.this.mInteractEngine.getBuilder().getPkAudienceSetUpConnectionOptimize() && ClientExt.this.getConfig().getInteractMode() != Config.InteractMode.PK)) {
                ClientExt.this.invokeMixStream(true);
            }
            ClientExt.this.onUserJoined(userInfo.getUid());
            ClientExt.this.mInternalListener.onInfo(ClientExt.this, 7, 0, userInfo.getUid());
            MethodCollector.m26664o(1090);
        }

        @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onLogReport(String str, JSONObject jSONObject) {
            ClientExt.this.mRtcCallback.onLogReport(str, jSONObject);
            ClientExt.this.onLogMonitor(str, jSONObject);
        }

        @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onFirstLocalVideoFrameCaptured(StreamIndex streamIndex, VideoFrameInfo videoFrameInfo) {
            AVLog.debugTrace(Integer.valueOf(videoFrameInfo.getWidth()), Integer.valueOf(videoFrameInfo.getHeight()));
            ClientExt.this.mRtcCallback.onFirstLocalVideoFrameCaptured(streamIndex, videoFrameInfo);
        }

        @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onRoomMessageReceived(String str, String str2) {
            AVLog.debugTrace(new Object[0]);
            ClientExt.this.mRtcCallback.onUserMessageReceived(str, str2);
            if (ClientExt.this.mInternalListener != null) {
                ClientExt.this.mInternalListener.onInfo(ClientExt.this, 204, 0, str, str2, 0);
            }
        }

        @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onRoomMessageSendResult(long j, int i) {
            AVLog.debugTrace(new Object[0]);
            ClientExt.this.mRtcCallback.onUserMessageSendResult(j, i);
            if (ClientExt.this.mInternalListener != null) {
                ClientExt.this.mInternalListener.onInfo(ClientExt.this, 203, 0, Long.valueOf(j), Integer.valueOf(i), 0);
            }
        }

        @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onStreamPublishSuccess(String str, boolean z) {
            AVLog.debugTrace(new Object[0]);
            ClientExt.this.mRtcCallback.onStreamPublishSuccess(str, z);
            if (ClientExt.this.mInternalListener != null) {
                ClientExt.this.mInternalListener.onInfo(ClientExt.this, 105, 0, str, 0, 0);
            }
        }

        @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onUserEnableLocalAudio(String str, boolean z) {
            AVLog.debugTrace(str, Boolean.valueOf(z));
            ClientExt.this.mRtcCallback.onUserEnableLocalAudio(str, z);
            ClientExt.this.mLogService.onMediaStateChanged("onUserEnableLocalAudio", z ? 1 : 0, str);
        }

        @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onUserMessageReceived(String str, String str2) {
            AVLog.debugTrace(new Object[0]);
            ClientExt.this.mRtcCallback.onUserMessageReceived(str, str2);
            if (ClientExt.this.mInternalListener != null) {
                ClientExt.this.mInternalListener.onInfo(ClientExt.this, 202, 0, str, str2, 0);
            }
        }

        @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onUserMessageSendResult(long j, int i) {
            AVLog.debugTrace(new Object[0]);
            ClientExt.this.mRtcCallback.onUserMessageSendResult(j, i);
            if (ClientExt.this.mInternalListener != null) {
                ClientExt.this.mInternalListener.onInfo(ClientExt.this, 201, 0, Long.valueOf(j), Integer.valueOf(i), 0);
            }
        }

        @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onUserMuteAudio(String str, MuteState muteState) {
            boolean z;
            int i = 0;
            AVLog.debugTrace(str, muteState);
            ClientExt.this.mRtcCallback.onUserMuteAudio(str, muteState);
            Client.Listener listener = ClientExt.this.mInternalListener;
            ClientExt clientExt = ClientExt.this;
            Object[] objArr = new Object[2];
            objArr[0] = str;
            if (muteState == MuteState.MUTE_STATE_ON) {
                z = true;
            } else {
                z = false;
            }
            objArr[1] = Boolean.valueOf(z);
            listener.onInfo(clientExt, 16, 0, objArr);
            InteractLogService interactLogService = ClientExt.this.mLogService;
            if (muteState == MuteState.MUTE_STATE_ON) {
                i = 1;
            }
            interactLogService.onMediaStateChanged("onUserMuteAudio", i, str);
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ void lambda$onUserLeave$2$ClientExt$15(String str, int i) {
            MethodCollector.m26663i(1056);
            if (ClientExt.this.mVideoSinkFactory != null) {
                synchronized (ClientExt.this.mVideoSinkMap) {
                    try {
                        VideoSinkWrapper remove = ClientExt.this.mVideoSinkMap.remove(str);
                        AVLog.ioi(ClientExt.TAG, "remove sink uid:" + str + ",[" + this + "]");
                        if (remove != null) {
                            remove.release();
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(1056);
                        throw th;
                    }
                }
            }
            ClientExt.this.invokeMixStream(true);
            ClientExt.this.onUserLeaved(str);
            ClientExt.this.mInternalListener.onInfo(ClientExt.this, 8, (long) i, str);
            MethodCollector.m26664o(1056);
        }

        @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onConnectionStateChanged(int i, int i2) {
            AVLog.debugTrace(Integer.valueOf(i), Integer.valueOf(i2));
            ClientExt.this.mRtcCallback.onConnectionStateChanged(i, i2);
            ClientExt.this.mInternalListener.onInfo(ClientExt.this, 6, (long) i, "onConnectionStateChanged: state " + i + ", reason " + i2);
        }

        @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onRemoteVideoSizeChanged(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
            AVLog.debugTrace(remoteStreamKey.getUserId(), Integer.valueOf(videoFrameInfo.getWidth()), Integer.valueOf(videoFrameInfo.getHeight()));
            ClientExt.this.mRtcCallback.onRemoteVideoSizeChanged(remoteStreamKey, videoFrameInfo);
            ClientExt.this.mInternalListener.onInfo(ClientExt.this, 19, 0, remoteStreamKey.getUserId(), Integer.valueOf(videoFrameInfo.getWidth()), Integer.valueOf(videoFrameInfo.getHeight()));
        }

        @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onUserJoined(UserInfo userInfo, int i) {
            AVLog.debugTrace(userInfo.getUid(), Integer.valueOf(i));
            ClientExt.this.mRtcCallback.onUserJoined(userInfo, i);
            if (userInfo.getUid().equals(ClientExt.this.mSelfInteractId)) {
                AVLog.iow(ClientExt.TAG, "Received my onUserJoined");
                return;
            }
            if (ClientExt.this.disposed) {
                AVLog.logKibana(6, ClientExt.TAG, "client has been disposed,should not handle callback", null);
            }
            ClientExt.this.mLogService.onRemoteUserOnlineOffline(true, userInfo.getUid());
            ClientExt.this.mInteractStatics.addRemoteUser(userInfo.getUid());
            ClientExt.this.recordGuestJoinAndLeave(userInfo.getUid(), true);
            ClientExt.this.mConfig.getHandler().post(new ClientExt$15$$Lambda$1(this, userInfo));
        }

        @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onUserMuteVideo(String str, MuteState muteState) {
            boolean z;
            boolean z2;
            int i = 0;
            AVLog.debugTrace(str, muteState);
            ClientExt.this.mRtcCallback.onUserMuteVideo(str, muteState);
            ClientExt clientExt = ClientExt.this;
            if (muteState == MuteState.MUTE_STATE_OFF) {
                z = true;
            } else {
                z = false;
            }
            clientExt.toggleVideoSinkRenderable(str, z);
            Client.Listener listener = ClientExt.this.mInternalListener;
            ClientExt clientExt2 = ClientExt.this;
            Object[] objArr = new Object[2];
            objArr[0] = str;
            if (muteState == MuteState.MUTE_STATE_ON) {
                z2 = true;
            } else {
                z2 = false;
            }
            objArr[1] = Boolean.valueOf(z2);
            listener.onInfo(clientExt2, 15, 0, objArr);
            InteractLogService interactLogService = ClientExt.this.mLogService;
            if (muteState == MuteState.MUTE_STATE_ON) {
                i = 1;
            }
            interactLogService.onMediaStateChanged("onUserMuteVideo", i, str);
            ClientExt.this.invokeMixStream(true);
        }

        @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onAudioVolumeIndication(IRTCEngineEventHandler.AudioVolumeInfo[] audioVolumeInfoArr, int i) {
            boolean z;
            String str;
            ClientExt.this.mRtcCallback.onAudioVolumeIndication(audioVolumeInfoArr, i);
            ClientExt.this.mInteractStatics.onRemoteAudioVolumeIndication(audioVolumeInfoArr, i);
            int length = audioVolumeInfoArr.length;
            String[] strArr = new String[length];
            boolean[] zArr = new boolean[length];
            int[] iArr = new int[length];
            int volumeThreshold = ClientExt.this.mConfig.getVolumeThreshold();
            boolean z2 = false;
            for (int i2 = 0; i2 < length; i2++) {
                IRTCEngineEventHandler.AudioVolumeInfo audioVolumeInfo = audioVolumeInfoArr[i2];
                String str2 = audioVolumeInfo.uid;
                if (audioVolumeInfo.volume >= volumeThreshold) {
                    z = true;
                } else {
                    z = false;
                }
                strArr[i2] = str2;
                zArr[i2] = z;
                iArr[i2] = audioVolumeInfo.volume;
                if (ClientExt.this.getTalkingState(str2) != z) {
                    z2 = true;
                }
                ClientExt.this.mTalkingStates.put(str2, Boolean.valueOf(z));
                if (z2) {
                    Object[] objArr = new Object[1];
                    StringBuilder append = new StringBuilder().append(str2).append(" is ");
                    if (z) {
                        str = "talking";
                    } else {
                        str = "not talking";
                    }
                    objArr[0] = append.append(str).toString();
                    AVLog.debugTrace(objArr);
                }
            }
            if (ClientExt.this.mConfig.getUpdateTalkSeiAB()) {
                if (z2) {
                    ClientExt.this.mNeedUpdateTalkingStateSei = true;
                    if (ClientExt.this.mConfig.getMixStreamType() == Config.MixStreamType.SERVER_MIX) {
                        ClientExt.this.invokeMixStream(false);
                    }
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (ClientExt.this.mNeedUpdateTalkingStateSei && currentTimeMillis - ClientExt.this.mLastUpdateTalkingStateSeiTs >= ((long) ClientExt.this.mConfig.getUpdateTalkSeiInterval()) && ClientExt.this.mConfig.getMixStreamType() == Config.MixStreamType.CLIENT_MIX) {
                    ClientExt.this.invokeMixStream(false);
                    ClientExt.this.mLastUpdateTalkingStateSeiTs = currentTimeMillis;
                    ClientExt.this.mNeedUpdateTalkingStateSei = false;
                }
            } else if (z2) {
                ClientExt.this.invokeMixStream(false);
            }
            ClientExt.this.mInternalListener.onInfo(ClientExt.this, 9, 0, strArr, zArr, iArr);
        }

        @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onLiveTranscodingResult(String str, int i) {
            AVLog.iod(ClientExt.TAG, "Received onStreamPublished callback + has been received before? : " + ClientExt.this.mServerMixStreamPublishedReceived + " error: " + i);
            AVLog.debugTrace(str, Integer.valueOf(i));
            ClientExt.this.mRtcCallback.onLiveTranscodingResult(str, i);
            ClientExt.this.mInteractStatics.calcDurationFromLiveToInteract();
            if (this.mTranscodeingErrors == null) {
                SparseArray<String> sparseArray = new SparseArray<>();
                this.mTranscodeingErrors = sparseArray;
                sparseArray.put(0, "ok");
                this.mTranscodeingErrors.put(1, "invalid agument");
                this.mTranscodeingErrors.put(2, "subscribe failed");
                this.mTranscodeingErrors.put(3, "error when processing");
                this.mTranscodeingErrors.put(4, "cdn error");
            }
            ClientExt.this.mLogService.onStreamStateChange(i, this.mTranscodeingErrors.get(i, "unknown error code ".concat(String.valueOf(i))), 0);
            if (ClientExt.this.clientStarted && ClientExt.this.mInteractEngine.getBuilder().getPushStreamSwitchAfterServerMixStream() && ClientExt.this.mTaskOnStreamPublished != null && !ClientExt.this.mServerMixStreamPublishedReceived) {
                ClientExt.this.mConfig.getHandler().post(new ClientExt$15$$Lambda$4(this));
            }
        }

        @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onUserLeave(String str, int i) {
            AVLog.debugTrace(str, Integer.valueOf(i));
            if (ClientExt.this.getConfig().getCharacter() == Config.Character.ANCHOR && ClientExt.this.getConfig().getInteractMode() == Config.InteractMode.PK && ClientExt.this.getConfig().getMixStreamType() == Config.MixStreamType.CLIENT_MIX && ClientExt.this.mBuilder.getAdjustStreamResolutionOnInteract() && ClientExt.this.mEventListener != null) {
                VideoStreamDescription rtcVideoResolution = ClientExt.this.getRtcVideoResolution();
                Client.InteractEventListener interactEventListener = ClientExt.this.mEventListener;
                if (interactEventListener != null) {
                    interactEventListener.notifyLiveStreamAdjustResolution(ClientExt.this, true, ((Integer) rtcVideoResolution.videoSize.first).intValue(), ((Integer) rtcVideoResolution.videoSize.second).intValue());
                }
            }
            ClientExt.this.mRtcCallback.onUserLeave(str, i);
            if (str.equals(ClientExt.this.mSelfInteractId)) {
                AVLog.iow(ClientExt.TAG, "Received my onUserOffline");
                return;
            }
            ClientExt.this.mLogService.onRemoteUserOnlineOffline(false, str);
            ClientExt.this.mInteractStatics.removeRemoteUser(str);
            ClientExt.this.recordGuestJoinAndLeave(str, false);
            ClientExt.this.mTalkingStates.remove(str);
            if (ClientExt.this.mFirstRemoteVideoFrameTimestamp.containsKey(str)) {
                Long l = ClientExt.this.mFirstRemoteVideoFrameTimestamp.get(str);
                if (l != null) {
                    long currentTimeMillis = System.currentTimeMillis() - l.longValue();
                    if (currentTimeMillis > 0) {
                        ClientExt.this.mPullStreamsDuration.addAndGet(currentTimeMillis);
                    }
                }
                ClientExt.this.mFirstRemoteVideoFrameTimestamp.remove(str);
            }
            ClientExt.this.mConfig.getHandler().post(new ClientExt$15$$Lambda$2(this, str, i));
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ void lambda$onFirstRemoteVideoFrameRendered$3$ClientExt$15(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
            VideoSinkWrapper videoSinkWrapper;
            Object obj;
            MethodCollector.m26663i(1036);
            synchronized (ClientExt.this.mVideoSinkMap) {
                try {
                    videoSinkWrapper = ClientExt.this.mVideoSinkMap.get(remoteStreamKey.getUserId());
                } catch (Throwable th) {
                    MethodCollector.m26664o(1036);
                    throw th;
                }
            }
            if (videoSinkWrapper == null) {
                AVLog.ioe(ClientExt.TAG, "Received user " + remoteStreamKey.getUserId() + "'s first video frame before his joining room.");
                MethodCollector.m26664o(1036);
                return;
            }
            if (ClientExt.this.mConfig.getViewType() == Config.ViewType.SURFACE_VIEW) {
                obj = videoSinkWrapper.getSurfaceView();
            } else if (ClientExt.this.mConfig.getViewType() == Config.ViewType.TEXTURE_VIEW) {
                obj = videoSinkWrapper.getTextureView();
            } else {
                obj = null;
            }
            if (!ClientExt.this.mSingleViewMode) {
                ClientExt.this.mInternalListener.onInfo(ClientExt.this, 11, 0, remoteStreamKey.getUserId(), obj, Integer.valueOf(ClientExt.this.mInteractEngine.queryRtcId(remoteStreamKey.getUserId())), Integer.valueOf(videoFrameInfo.getWidth()), Integer.valueOf(videoFrameInfo.getHeight()));
            } else {
                ILayerControl.ILayer renderLayer = videoSinkWrapper.getRenderLayer();
                ClientExt.this.mInternalListener.onInfo(ClientExt.this, 11, 1, remoteStreamKey.getUserId(), renderLayer, Integer.valueOf(ClientExt.this.mInteractEngine.queryRtcId(remoteStreamKey.getUserId())), Integer.valueOf(videoFrameInfo.getWidth()), Integer.valueOf(videoFrameInfo.getHeight()));
            }
            final JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("key", "rtc_first_remote_video_msg_sent");
                jSONObject.put("rtc_channel_id", ClientExt.this.mRtcExtInfo.channelId);
                jSONObject.put("timestamp", System.currentTimeMillis());
            } catch (Exception unused) {
            }
            ClientExt.this.mBuilder.getLogUploadThreadHandler().post(new Runnable() {
                /* class com.p2082ss.avframework.livestreamv2.core.interact.ClientExt.C8582615.RunnableC858271 */

                static {
                    Covode.recordClassIndex(100299);
                }

                public void run() {
                    AVLog.logKibana(4, ClientExt.TAG, jSONObject.toString(), null);
                }
            });
            AVLog.ioi(ClientExt.TAG, "MSG_INFO_FIRST_REMOTE_VIDEO with rtc render video internal: uid " + remoteStreamKey.getUserId() + ", view " + obj + ", width " + videoFrameInfo.getWidth() + ", height " + videoFrameInfo.getHeight());
            MethodCollector.m26664o(1036);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: android.view.SurfaceView */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onFirstRemoteVideoFrameRendered(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
            TextureView textureView;
            MethodCollector.m26663i(470);
            AVLog.debugTrace(remoteStreamKey.getUserId(), Integer.valueOf(videoFrameInfo.getWidth()), Integer.valueOf(videoFrameInfo.getHeight()), 0);
            AVLog.ioi(ClientExt.TAG, "onFirstRemoteVideoFrame");
            ClientExt.this.mRtcCallback.onFirstRemoteVideoFrameRendered(remoteStreamKey, videoFrameInfo);
            if (remoteStreamKey.getUserId().equals(ClientExt.this.mSelfInteractId)) {
                AVLog.iow(ClientExt.TAG, "Received my onFirstRemoteVideoFrame");
                MethodCollector.m26664o(470);
                return;
            }
            ClientExt.this.mLogService.onFirstRemoteFrame(false, remoteStreamKey.getUserId());
            if (ClientExt.this.getConfig().getInteractMode() == Config.InteractMode.PK && ClientExt.this.mInteractEngine.getBuilder().getPkAudienceSetUpConnectionOptimize()) {
                ClientExt.this.recordGuestJoinAndLeave(remoteStreamKey.getUserId(), true);
                ClientExt.this.invokeMixStream(true);
            }
            if (!ClientExt.this.mFirstRemoteVideoFrameTimestamp.containsKey(remoteStreamKey.getUserId())) {
                ClientExt.this.mFirstRemoteVideoFrameTimestamp.put(remoteStreamKey.getUserId(), Long.valueOf(System.currentTimeMillis()));
            }
            if (ClientExt.this.mVideoSinkFactory != null) {
                ClientExt.this.mConfig.getHandler().post(new ClientExt$15$$Lambda$3(this, remoteStreamKey, videoFrameInfo));
                MethodCollector.m26664o(470);
                return;
            }
            AVLog.ioi(ClientExt.TAG, "mVideoSinkFactory is null [" + this + "]");
            if (ClientExt.this.mConfig.getViewType() == Config.ViewType.SURFACE_VIEW) {
                SurfaceView surfaceView = new SurfaceView(ClientExt.this.mConfig.getContext());
                surfaceView.setZOrderMediaOverlay(false);
                ClientExt.this.mRtcEngine.setRemoteVideoCanvas(remoteStreamKey.getUserId(), StreamIndex.STREAM_INDEX_MAIN, new VideoCanvas(surfaceView, 1, remoteStreamKey.getUserId(), false));
                textureView = surfaceView;
            } else {
                TextureView textureView2 = new TextureView(ClientExt.this.mConfig.getContext());
                ClientExt.this.mRtcEngine.setRemoteVideoCanvas(remoteStreamKey.getUserId(), StreamIndex.STREAM_INDEX_MAIN, new VideoCanvas(textureView2, 1, remoteStreamKey.getUserId(), false));
                textureView = textureView2;
            }
            ClientExt.this.mInternalListener.onInfo(ClientExt.this, 11, 0, remoteStreamKey.getUserId(), textureView, Integer.valueOf(ClientExt.this.mInteractEngine.queryRtcId(remoteStreamKey.getUserId())), Integer.valueOf(videoFrameInfo.getWidth()), Integer.valueOf(videoFrameInfo.getHeight()));
            final JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("key", "rtc_first_remote_video_msg_sent");
                jSONObject.put("rtc_channel_id", ClientExt.this.mRtcExtInfo.channelId);
                jSONObject.put("timestamp", System.currentTimeMillis());
            } catch (Exception unused) {
            }
            ClientExt.this.mBuilder.getLogUploadThreadHandler().post(new Runnable() {
                /* class com.p2082ss.avframework.livestreamv2.core.interact.ClientExt.C8582615.RunnableC858282 */

                static {
                    Covode.recordClassIndex(100300);
                }

                public void run() {
                    AVLog.logKibana(4, ClientExt.TAG, jSONObject.toString(), null);
                }
            });
            AVLog.ioi(ClientExt.TAG, "MSG_INFO_FIRST_REMOTE_VIDEO with rtc render video internal: uid " + remoteStreamKey.getUserId() + ", view " + textureView + ", width " + videoFrameInfo.getWidth() + ", height " + videoFrameInfo.getHeight());
            MethodCollector.m26664o(470);
        }

        @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onLocalVideoStateChanged(StreamIndex streamIndex, IRTCEngineEventHandler.LocalVideoStreamState localVideoStreamState, IRTCEngineEventHandler.LocalVideoStreamError localVideoStreamError) {
            AVLog.debugTrace(localVideoStreamState, localVideoStreamError);
            ClientExt.this.mRtcCallback.onLocalVideoStateChanged(streamIndex, localVideoStreamState, localVideoStreamError);
        }

        @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onRemoteVideoStateChanged(RemoteStreamKey remoteStreamKey, IRTCEngineEventHandler.RemoteVideoState remoteVideoState, IRTCEngineEventHandler.RemoteVideoStateChangeReason remoteVideoStateChangeReason) {
            AVLog.debugTrace(remoteStreamKey.getUserId(), remoteVideoState);
            ClientExt.this.mRtcCallback.onRemoteVideoStateChanged(remoteStreamKey, remoteVideoState, remoteVideoStateChangeReason);
        }

        @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onLoggerMessage(IRTCEngineEventHandler.LogLevel logLevel, String str, Throwable th) {
            ClientExt.this.mRtcCallback.onLoggerMessage(logLevel, str, th);
            int i = C8582916.f191982x19c1d46a[logLevel.ordinal()];
            int i2 = 4;
            if (i == 1) {
                i2 = 2;
            } else if (i == 2) {
                i2 = 3;
            } else if (i != 3) {
                if (i == 4) {
                    i2 = 5;
                } else if (i == 5) {
                    i2 = 6;
                } else {
                    return;
                }
            }
            AVLog.ILogFilter logIODevice = AVLog.getLogIODevice();
            if (logIODevice == null) {
                return;
            }
            if (ClientExt.this.mBuilder == null || i2 >= ClientExt.this.mBuilder.getRtcOnLoggerMessageLevel()) {
                logIODevice.print(5, "BYTE_RTC", "[" + i2 + "] " + str, th);
            }
        }

        @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onPerformanceAlarms(IRTCEngineEventHandler.PerformanceAlarmMode performanceAlarmMode, String str, IRTCEngineEventHandler.PerformanceAlarmReason performanceAlarmReason, IRTCEngineEventHandler.SourceWantedData sourceWantedData) {
            AVLog.debugTrace(new Object[0]);
            ClientExt.this.mRtcCallback.onPerformanceAlarms(performanceAlarmMode, str, performanceAlarmReason, sourceWantedData);
            if (ClientExt.this.mEventListener != null) {
                Client.InteractEventListener interactEventListener = ClientExt.this.mEventListener;
                ClientExt clientExt = ClientExt.this;
                interactEventListener.onInteractInfoReport(clientExt, clientExt.mSelfInteractId, 12, 0, Integer.valueOf(sourceWantedData.width), Integer.valueOf(sourceWantedData.height), Integer.valueOf(sourceWantedData.frameRate));
            }
            if (ClientExt.this.mInternalListener != null) {
                ClientExt.this.mInternalListener.onInfo(ClientExt.this, 13, 0, Integer.valueOf(sourceWantedData.width), Integer.valueOf(sourceWantedData.height), Integer.valueOf(sourceWantedData.frameRate));
            }
        }

        @Override // com.p2082ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onJoinRoomResult(String str, String str2, int i, int i2, int i3) {
            VideoClient videoClient;
            MethodCollector.m26663i(226);
            AVLog.debugTrace(str, str2, Integer.valueOf(i3));
            AVLog.ioi(ClientExt.TAG, "onJoinChannelSuccess[channel:" + str + ",id:" + str2 + ",errorCode" + i + ",joinType" + i2 + ", elapsed:" + i3 + "]");
            ClientExt.this.mRtcCallback.onJoinRoomResult(str, str2, i, i2, i3);
            if (i != 0) {
                ClientExt.this.mInternalListener.onError(ClientExt.this, -3, (long) i, new Exception("onJoinRoomResult error, code: ".concat(String.valueOf(i))));
                MethodCollector.m26664o(226);
                return;
            }
            if (i2 == 0) {
                ClientExt.this.mLogService.onJoinChannelSuccess();
            } else if (i2 == 1) {
                ClientExt.this.mLogService.onReconnected();
                MethodCollector.m26664o(226);
                return;
            }
            ClientExt.this.mInternalListener.onInfo(ClientExt.this, 4, 0, new Object[0]);
            ClientExt.this.invokeMixStream(true);
            if (ClientExt.this.mConfig.getType() == Config.Type.VIDEO && (videoClient = ClientExt.this.mVideoClient) != null) {
                synchronized (videoClient) {
                    try {
                        if (videoClient == ClientExt.this.mVideoClient) {
                            videoClient.stop();
                            videoClient.start();
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(226);
                        throw th;
                    }
                }
            }
            AudioClient audioClient = ClientExt.this.mAudioClient;
            if (audioClient != null) {
                synchronized (audioClient) {
                    try {
                        if (audioClient == ClientExt.this.mAudioClient) {
                            audioClient.start();
                        }
                    } catch (Throwable th2) {
                        MethodCollector.m26664o(226);
                        throw th2;
                    }
                }
            }
            ClientExt.this.mConfig.getHandler().post(new ClientExt$15$$Lambda$0(this));
            if (ClientExt.this.mLogReportRunnable == null) {
                ClientExt.this.mLogReportRunnable = new LogReportRunnable();
            }
            ClientExt.this.mLogReportRunnable.start();
            MethodCollector.m26664o(226);
        }
    };
    public ByteBuffer mInternalSeiBuffer;
    private boolean mIsResume = true;
    public long mLastUpdateTalkingStateSeiTs = 0;
    public Client.Listener mListener;
    public LogReportRunnable mLogReportRunnable;
    protected InteractLogService mLogService;
    protected boolean mMuteLocalVideoStreamStat = false;
    public volatile boolean mNeedUpdateTalkingStateSei = false;
    protected boolean mOnlyConsumeAllRemoteSei = false;
    protected int mOutChannelCount;
    protected int mOutSampleRate;
    public AtomicLong mPullStreamsDuration = new AtomicLong();
    public RemoteYuvColorRangeReporter mRemoteColorRange;
    public IRTCEngineEventHandler mRtcCallback = new IRTCEngineEventHandler() {
        /* class com.p2082ss.avframework.livestreamv2.core.interact.ClientExt.C8582514 */

        static {
            Covode.recordClassIndex(100292);
        }
    };
    protected LiveRTCEngine mRtcEngine;
    protected LiveRTCExtInfo mRtcExtInfo;
    protected String mSelfInteractId;
    protected VideoMixer.VideoMixerDescription mSelfVideoMixerDescription = null;
    public boolean mServerMixStreamPublishedReceived;
    public final boolean mSingleViewMode;
    public Map<String, Boolean> mTalkingStates = new ConcurrentHashMap();
    protected Runnable mTaskOnStreamPublished;
    public int mUpdateTalkingStateSeiDelayCount = 0;
    protected VideoClient mVideoClient;
    protected VideoClientFactory mVideoClientFactory;
    public String mVideoClientLastError = "";
    public Client.ICatchedVideoFrameCallback mVideoFrameCallback = null;
    protected VideoSinkFactory mVideoSinkFactory;
    protected Map<String, VideoSinkWrapper> mVideoSinkMap = new ConcurrentHashMap();
    protected boolean needPublishFrame;
    private AudioCallback rtcAudioCallback = new AudioCallback() {
        /* class com.p2082ss.avframework.livestreamv2.core.interact.ClientExt.C858302 */
        long lastTime;
        private byte[] mByteArray;
        int repeatTimes;

        static {
            Covode.recordClassIndex(100302);
        }

        @Override // com.p2082ss.avframework.livestreamv2.core.interact.audio.AudioCallback
        public void onAudioWarning(String str) {
            ClientExt.this.mAudioClientLastError = str;
            AVLog.logToIODevice2(4, ClientExt.TAG, "audio last msg:" + ClientExt.this.mAudioClientLastError, null, "Interact.onAudioWarning", LiveNetAdaptiveHurryTimeSetting.DEFAULT);
        }

        @Override // com.p2082ss.avframework.livestreamv2.core.interact.audio.AudioCallback
        public boolean updateAudioFrame(Buffer buffer, int i, long j) {
            Object obj;
            boolean z;
            if (!ClientExt.this.needPublishFrame || ClientExt.this.mAudioClientFactory == null) {
                StringBuilder append = new StringBuilder("AudioClient ignore needPublishFrame=").append(ClientExt.this.needPublishFrame).append(" mAudioClientFactory=");
                if (ClientExt.this.mAudioClientFactory != null) {
                    obj = ClientExt.this.mAudioClientFactory;
                } else {
                    obj = "null";
                }
                onAudioWarning(append.append(obj).toString());
                return false;
            } else if (!(buffer instanceof ByteBuffer)) {
                onAudioWarning("AudioClient non ByteBuffer");
                return false;
            } else {
                int sampleRate = ClientExt.this.mAudioClientFactory.getSampleRate();
                int channelCount = ClientExt.this.mAudioClientFactory.getChannelCount();
                if (i * 100 != sampleRate) {
                    onAudioWarning("AudioClient invalid frame length " + i + " VS " + (sampleRate / 100));
                    return false;
                }
                this.repeatTimes++;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - this.lastTime >= 10000) {
                    this.lastTime = currentTimeMillis;
                    AVLog.debugTrace(buffer, Integer.valueOf(i), Long.valueOf(j), " (repeat " + this.repeatTimes + " times)");
                    this.repeatTimes = 0;
                }
                ClientExt.this.mLogService.onFirstLocalExternalAudioFrame();
                ByteBuffer byteBuffer = (ByteBuffer) buffer;
                int i2 = channelCount * i * 2;
                try {
                    byte[] bArr = this.mByteArray;
                    if (bArr == null || bArr.length != i2) {
                        this.mByteArray = new byte[i2];
                    }
                    byteBuffer.get(this.mByteArray, 0, i2);
                    AudioFrame audioFrame = new AudioFrame();
                    audioFrame.buffer = this.mByteArray;
                    audioFrame.samples = i;
                    int pushExternalAudioFrame = ClientExt.this.mRtcEngine.pushExternalAudioFrame(audioFrame);
                    if (ClientExt.this.mLogService != null) {
                        InteractLogService interactLogService = ClientExt.this.mLogService;
                        if (pushExternalAudioFrame == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        interactLogService.addVideoFramesReport(true, z);
                    }
                    if (pushExternalAudioFrame < 0) {
                        AVLog.logToIODevice2(6, ClientExt.TAG, "pushExternalAudioFrame error: ".concat(String.valueOf(pushExternalAudioFrame)), null, "Client.updateAudioFrame", 10000);
                        onAudioWarning("RTC push audioFrame failed(" + pushExternalAudioFrame + ")");
                        return false;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    onAudioWarning("RTC push audioFrame exception(" + e.getMessage() + ")");
                }
                return true;
            }
        }
    };
    private VideoCallback rtcVideoCallback = new VideoCallback() {
        /* class com.p2082ss.avframework.livestreamv2.core.interact.ClientExt.C858181 */
        long lastTime;
        int repeatTimes;

        static {
            Covode.recordClassIndex(100285);
        }

        @Override // com.p2082ss.avframework.livestreamv2.core.interact.video.VideoCallback
        public void onVideoWarning(String str) {
            ClientExt.this.mVideoClientLastError = str;
            AVLog.logToIODevice2(4, ClientExt.TAG, "video last msg:".concat(String.valueOf(str)), null, "Interact.onVideoWarning", LiveNetAdaptiveHurryTimeSetting.DEFAULT);
        }

        @Override // com.p2082ss.avframework.livestreamv2.core.interact.video.VideoCallback
        public boolean updateVideoFrame(EGLContext eGLContext, android.opengl.EGLContext eGLContext2, int i, boolean z, float[] fArr, int i2, int i3, long j, Object... objArr) {
            ByteBuffer byteBuffer;
            int i4;
            String str;
            if (!ClientExt.this.needPublishFrame) {
                onVideoWarning("VideoClient needPublishFrame.");
                return false;
            }
            this.repeatTimes++;
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.lastTime >= 10000) {
                this.lastTime = currentTimeMillis;
                AVLog.debugTrace(eGLContext, eGLContext2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Long.valueOf(j), " (repeat " + this.repeatTimes + " times)");
                this.repeatTimes = 0;
            }
            ClientExt.this.mLogService.onFirstLocalExternalVideoFrame();
            ByteBuffer byteBuffer2 = null;
            if (objArr.length <= 0 || !(objArr[0] instanceof ByteBuffer)) {
                byteBuffer = null;
            } else {
                byteBuffer = (ByteBuffer) objArr[0];
            }
            if (ClientExt.this.mConfig.getRoiOn() && objArr.length >= 2 && (objArr[1] instanceof ByteBuffer)) {
                byteBuffer2 = (ByteBuffer) objArr[1];
            }
            if (ClientExt.this.mConfig.getUpdateTalkSeiAB() && ClientExt.this.mConfig.getMixStreamType() == Config.MixStreamType.SERVER_MIX && ClientExt.this.mNeedUpdateTalkingStateSei) {
                if (byteBuffer != null) {
                    ClientExt.this.mUpdateTalkingStateSeiDelayCount++;
                } else {
                    if (ClientExt.this.mUpdateTalkingStateSeiDelayCount >= 3) {
                        AVLog.iow(ClientExt.TAG, "Updating talking state has been delayed " + ClientExt.this.mUpdateTalkingStateSeiDelayCount + " frames.");
                    }
                    ClientExt.this.mUpdateTalkingStateSeiDelayCount = 0;
                    ClientExt.this.mLastUpdateTalkingStateSeiTs = currentTimeMillis;
                    ClientExt.this.mNeedUpdateTalkingStateSei = false;
                    try {
                        String mixStream = ClientExt.this.mConfig.getStreamMixer().mixStream(ClientExt.this.mConfig.getMixStreamConfig().getVideoWidth(), ClientExt.this.mConfig.getMixStreamConfig().getVideoHeight(), ClientExt.this.formRegionList());
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("app_data", mixStream);
                        jSONObject.put("ts", currentTimeMillis);
                        str = jSONObject.toString();
                    } catch (Exception e) {
                        e.printStackTrace();
                        str = "";
                    }
                    if (ClientExt.this.mInternalSeiBuffer == null || ClientExt.this.mInternalSeiBuffer.capacity() < str.length() + 16) {
                        ClientExt.this.mInternalSeiBuffer = ByteBuffer.allocateDirect(str.length() + 16);
                    }
                    ClientExt.this.mInternalSeiBuffer.clear();
                    ClientExt.this.mInternalSeiBuffer.put(str.getBytes());
                    ClientExt.this.mInternalSeiBuffer.flip();
                    byteBuffer = ClientExt.this.mInternalSeiBuffer.slice();
                    AVLog.logToIODevice2(4, ClientExt.TAG, "Send talking state in rtc video SEI.", null, "Client.start.VideoCallback.updateVideoFrame", 30000);
                }
            }
            RTCVideoFrame rTCVideoFrame = new RTCVideoFrame();
            if (z) {
                i4 = 11;
            } else {
                i4 = 10;
            }
            rTCVideoFrame.format = i4;
            rTCVideoFrame.timestamp = System.currentTimeMillis() * TimeUnit.MILLISECONDS.toNanos(1);
            rTCVideoFrame.stride = i2;
            rTCVideoFrame.height = i3;
            rTCVideoFrame.eglContext11 = eGLContext;
            rTCVideoFrame.eglContext14 = eGLContext2;
            rTCVideoFrame.textureId = i;
            rTCVideoFrame.transform = fArr;
            rTCVideoFrame.extend_data = byteBuffer;
            rTCVideoFrame.supplementary_info = byteBuffer2;
            boolean pushExternalVideoFrame = ClientExt.this.mRtcEngine.pushExternalVideoFrame(rTCVideoFrame);
            if (ClientExt.this.mLogService != null) {
                ClientExt.this.mLogService.addVideoFramesReport(false, pushExternalVideoFrame);
            }
            if (!pushExternalVideoFrame) {
                onVideoWarning("RTC push videoFrame exception.");
            }
            ClientExt.this.mInteractStatics.onLocalVideoSourceFrame(i2, i3);
            return pushExternalVideoFrame;
        }
    };
    protected boolean stopped = false;

    @Override // com.p2082ss.avframework.livestreamv2.core.Client
    public IRTCRoom createRtcRoom() {
        return null;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client
    public boolean isMultiRoomClient() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void onLogMonitor(String str, JSONObject jSONObject) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client
    public void setSingleViewMode(boolean z) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client
    public void switchInteractMode(Config.InteractMode interactMode) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client
    public Config getConfig() {
        return this.mConfig;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client
    public LiveRTCEngine getRtcEngine() {
        return this.mRtcEngine;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.avframework.livestreamv2.core.interact.ClientExt$RemoteYuvColorRangeReporter */
    public class RemoteYuvColorRangeReporter {
        private int mCheckedFrameCount;
        private long mCostTimeSum;
        private long mLastFrameTimestamp;
        private int mRemoteVideoColorRange;

        static {
            Covode.recordClassIndex(100314);
        }

        private String colorRangeToString(int i) {
            return i != 0 ? i != 1 ? "Unknown" : "VideoRange" : "FullRange";
        }

        /* access modifiers changed from: package-private */
        public String getRemoteYuvFrameColorRange() {
            return colorRangeToString(this.mRemoteVideoColorRange);
        }

        /* access modifiers changed from: package-private */
        public long getAverageCheckCost() {
            int i = this.mCheckedFrameCount;
            if (i > 0) {
                return this.mCostTimeSum / ((long) i);
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        public String getYuv2RgbFrameColorRange() {
            return colorRangeToString(VideoColorRange.checkYuv2RgbFormulaColorRange(ClientExt.this.mColorRange));
        }

        private RemoteYuvColorRangeReporter() {
            this.mRemoteVideoColorRange = -1;
        }

        /* access modifiers changed from: package-private */
        public synchronized void onRemoteYuvFrame(ByteBuffer byteBuffer, int i, int i2) {
            MethodCollector.m26663i(3446);
            if (this.mRemoteVideoColorRange == 0 || this.mCheckedFrameCount >= 10) {
                if (ClientExt.this.mColorRange != this.mRemoteVideoColorRange) {
                    AVLog.logKibana(5, ClientExt.TAG, "remote yuv color range " + ClientExt.this.mColorRange + " maybe error, change to " + this.mRemoteVideoColorRange, null);
                    ClientExt.this.mColorRange = this.mRemoteVideoColorRange;
                }
                MethodCollector.m26664o(3446);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.mLastFrameTimestamp < 10000) {
                MethodCollector.m26664o(3446);
                return;
            }
            this.mLastFrameTimestamp = currentTimeMillis;
            int checkYuvFrameColorRange = VideoColorRange.checkYuvFrameColorRange(byteBuffer, i, i2);
            if (checkYuvFrameColorRange == 0 || checkYuvFrameColorRange == 1) {
                this.mRemoteVideoColorRange = checkYuvFrameColorRange;
            }
            this.mCheckedFrameCount++;
            this.mCostTimeSum += System.currentTimeMillis() - currentTimeMillis;
            MethodCollector.m26664o(3446);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.avframework.livestreamv2.core.interact.ClientExt$VideoSinkWrapper */
    public class VideoSinkWrapper implements IVideoSink {
        private volatile boolean isFirstRenderFrame = true;
        private boolean isRelease;
        long lastTime;
        private DualGameEngineExt.IDualGameFrameCallback mIDualGameFrameCallback;
        public final String mInteractId;
        private boolean mIsStart;
        private boolean mNeedVideoFrameCallback;
        private volatile boolean mOnlyDealSeiInfo;
        private volatile boolean mRemoteCanRender = true;
        private RenderVideoStallStatistics mRenderVideoStallStatistics;
        private final int mRtcId;
        public VideoSink mVideoSink;
        public ByteBuffer mYuvBuffer;
        int repeatTimes;

        static {
            Covode.recordClassIndex(100317);
        }

        @Override // com.p2082ss.bytertc.engine.mediaio.IVideoSink
        public int getBufferType() {
            return 0;
        }

        @Override // com.p2082ss.bytertc.engine.mediaio.IVideoSink
        public android.opengl.EGLContext getEGLContextHandle() {
            return null;
        }

        @Override // com.p2082ss.bytertc.engine.mediaio.IVideoSink
        public int getPixelFormat() {
            return 1;
        }

        /* access modifiers changed from: package-private */
        public void setFirstRenderFrame() {
            this.isFirstRenderFrame = true;
        }

        public void setNeedVideoFrameCallback() {
            this.mNeedVideoFrameCallback = true;
        }

        public boolean hasRenderFirstFrame() {
            if (!this.isFirstRenderFrame) {
                return true;
            }
            return false;
        }

        @Override // com.p2082ss.bytertc.engine.mediaio.IVideoSink
        public void onDispose() {
            AVLog.debugTrace(new Object[0]);
        }

        @Override // com.p2082ss.bytertc.engine.mediaio.IVideoSink
        public boolean onInitialize() {
            AVLog.debugTrace(new Object[0]);
            return true;
        }

        public boolean isValid() {
            VideoSink videoSink = this.mVideoSink;
            if (videoSink != null) {
                return videoSink.isValid();
            }
            return false;
        }

        @Override // com.p2082ss.bytertc.engine.mediaio.IVideoSink
        public void onStop() {
            AVLog.debugTrace(new Object[0]);
            this.mIsStart = false;
        }

        private void destroyVideoSink() {
            AVLog.debugTrace(new Object[0]);
            VideoSink videoSink = this.mVideoSink;
            this.mVideoSink = null;
            if (videoSink != null) {
                ClientExt.this.mVideoSinkFactory.destroy(videoSink);
            }
        }

        public ILayerControl.ILayer getRenderLayer() {
            AVLog.debugTrace(new Object[0]);
            VideoSink videoSink = this.mVideoSink;
            if (videoSink != null) {
                return videoSink.getRenderLayer();
            }
            return null;
        }

        public SurfaceView getSurfaceView() {
            AVLog.debugTrace(new Object[0]);
            VideoSink videoSink = this.mVideoSink;
            if (videoSink != null) {
                return videoSink.getSurfaceView();
            }
            return null;
        }

        public TextureView getTextureView() {
            AVLog.debugTrace(new Object[0]);
            VideoSink videoSink = this.mVideoSink;
            if (videoSink != null) {
                return videoSink.getTextureView();
            }
            return null;
        }

        @Override // com.p2082ss.bytertc.engine.mediaio.IVideoSink
        public boolean onStart() {
            AVLog.debugTrace(new Object[0]);
            if (!this.isRelease) {
                this.mIsStart = true;
                setFirstRenderFrame();
            }
            return true;
        }

        public synchronized void release() {
            MethodCollector.m26663i(3861);
            AVLog.debugTrace(new Object[0]);
            if (!this.isRelease) {
                this.mIDualGameFrameCallback = null;
                this.isRelease = true;
                this.mIsStart = false;
                destroyVideoSink();
                this.mRenderVideoStallStatistics.stopStatistics();
                AVLog.iow(ClientExt.TAG, this + " released done");
            }
            MethodCollector.m26664o(3861);
        }

        public void setDualGameFrameCallback(DualGameEngineExt.IDualGameFrameCallback iDualGameFrameCallback) {
            this.mIDualGameFrameCallback = iDualGameFrameCallback;
        }

        public void setOnlyNeedRemoteSei(boolean z) {
            this.mOnlyDealSeiInfo = z;
        }

        public void setFitMode(boolean z) {
            VideoSink videoSink = this.mVideoSink;
            if (videoSink != null) {
                videoSink.setFitMode(z);
            }
        }

        public void setRenderAble(boolean z) {
            this.mRemoteCanRender = z;
            VideoSink videoSink = this.mVideoSink;
            if (videoSink != null) {
                videoSink.setRenderAble(z);
            }
        }

        @Override // com.p2082ss.bytertc.engine.mediaio.IVideoFrameConsumer
        public void consumeVideoFrame(RTCVideoFrame rTCVideoFrame) {
            int i;
            if (!this.mOnlyDealSeiInfo) {
                consumeVideoFrameInternal(rTCVideoFrame);
            }
            VideoSink videoSink = this.mVideoSink;
            if (videoSink != null) {
                i = videoSink.getTextureID();
            } else {
                i = -1;
            }
            ClientExt.this.mInteractEngine.dealSeiInfo(this.mRtcId, this.mInteractId, i, rTCVideoFrame.stride, rTCVideoFrame.height, rTCVideoFrame.timestamp, rTCVideoFrame.extend_data);
        }

        private synchronized void checkCallbackVideoFrame(final RTCVideoFrame rTCVideoFrame) {
            MethodCollector.m26663i(1667);
            ByteBuffer byteBuffer = this.mYuvBuffer;
            if (byteBuffer == null || byteBuffer.capacity() < rTCVideoFrame.buffer.capacity()) {
                this.mYuvBuffer = ByteBuffer.allocateDirect(rTCVideoFrame.buffer.capacity());
            }
            rTCVideoFrame.buffer.rewind();
            this.mYuvBuffer.position(0);
            ByteBuffer byteBuffer2 = this.mYuvBuffer;
            byteBuffer2.limit(byteBuffer2.capacity());
            this.mYuvBuffer.put(rTCVideoFrame.buffer);
            this.mYuvBuffer.flip();
            rTCVideoFrame.buffer.rewind();
            ClientExt.this.mBuilder.getWorkThreadHandler().post(new Runnable() {
                /* class com.p2082ss.avframework.livestreamv2.core.interact.ClientExt.VideoSinkWrapper.RunnableC858401 */

                static {
                    Covode.recordClassIndex(100319);
                }

                public void run() {
                    ClientExt.this.mVideoFrameCallback.onCatchedVideoFrameCallback(VideoSinkWrapper.this.mInteractId, VideoSinkWrapper.this.mYuvBuffer, rTCVideoFrame.stride, rTCVideoFrame.height);
                }
            });
            MethodCollector.m26664o(1667);
        }

        private void consumeVideoFrameInternal(RTCVideoFrame rTCVideoFrame) {
            int consumeDualGameVideoFrame;
            VideoSink videoSink = this.mVideoSink;
            if (videoSink != null) {
                if (this.mNeedVideoFrameCallback) {
                    checkCallbackVideoFrame(rTCVideoFrame);
                    this.mNeedVideoFrameCallback = false;
                }
                this.repeatTimes++;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - this.lastTime >= 10000) {
                    this.lastTime = currentTimeMillis;
                    AVLog.debugTrace(rTCVideoFrame.buffer, rTCVideoFrame.extend_data, Integer.valueOf(rTCVideoFrame.format), Integer.valueOf(rTCVideoFrame.stride), Integer.valueOf(rTCVideoFrame.height), Integer.valueOf(rTCVideoFrame.rotation), Long.valueOf(rTCVideoFrame.timestamp), " (repeat " + this.repeatTimes + " times)");
                    this.repeatTimes = 0;
                }
                if (this.mIsStart && !this.isRelease) {
                    if (rTCVideoFrame.stride <= 0 || rTCVideoFrame.height <= 0 || rTCVideoFrame.stride % 2 != 0 || rTCVideoFrame.height % 2 != 0) {
                        throw new AndroidRuntimeException("Illegal yuv width " + rTCVideoFrame.stride + " height " + rTCVideoFrame.height);
                    }
                    DualGameEngineExt.IDualGameFrameCallback iDualGameFrameCallback = this.mIDualGameFrameCallback;
                    if (iDualGameFrameCallback == null || (consumeDualGameVideoFrame = videoSink.consumeDualGameVideoFrame(rTCVideoFrame.buffer, Config.VideoOutputFormat.PIXEL_FORMAT_I420, ClientExt.this.mColorRange, rTCVideoFrame.stride, rTCVideoFrame.height, rTCVideoFrame.rotation, rTCVideoFrame.timestamp / 1000000)) <= 0 || !iDualGameFrameCallback.onDualGameFrameCallback(consumeDualGameVideoFrame, rTCVideoFrame.stride, rTCVideoFrame.height, rTCVideoFrame.rotation)) {
                        ClientExt.this.mRemoteColorRange.onRemoteYuvFrame(rTCVideoFrame.buffer, rTCVideoFrame.stride, rTCVideoFrame.height);
                        videoSink.onByteBufferVideoFrame(rTCVideoFrame.buffer, Config.VideoOutputFormat.PIXEL_FORMAT_I420, ClientExt.this.mColorRange, rTCVideoFrame.stride, rTCVideoFrame.height, 0, rTCVideoFrame.timestamp / 1000000);
                    }
                    ClientExt.this.mInteractStatics.calcDurationFromLiveToInteract();
                    checkRemoteFrameRenderAndStatics(rTCVideoFrame.stride, rTCVideoFrame.height);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$checkRemoteFrameRenderAndStatics$0$ClientExt$VideoSinkWrapper */
        public final /* synthetic */ void mo133776x33397ccb(int i, int i2) {
            ClientExt.this.sendFirstRemoteVideoRenderMessage(this.mInteractId, i, i2);
            ClientExt.this.invokeMixStream(true);
        }

        public VideoSinkWrapper(String str) {
            boolean z;
            boolean z2 = true;
            AVLog.debugTrace(new Object[0]);
            this.mInteractId = str;
            this.mRtcId = ClientExt.this.mInteractEngine.queryRtcId(str);
            if (ClientExt.this.mConfig.getViewType() == Config.ViewType.TEXTURE_VIEW) {
                z = true;
            } else {
                z = false;
            }
            VideoSink create = ClientExt.this.mVideoSinkFactory.create(str, z, ClientExt.this.mConfig.getInteractMode() == Config.InteractMode.FM ? false : z2, ClientExt.this.mSingleViewMode);
            this.mVideoSink = create;
            create.setRenderAble(this.mRemoteCanRender);
            RenderVideoStallStatistics renderVideoStallStatistics = new RenderVideoStallStatistics(str);
            this.mRenderVideoStallStatistics = renderVideoStallStatistics;
            renderVideoStallStatistics.startStatistics();
            this.isRelease = false;
        }

        private void checkRemoteFrameRenderAndStatics(int i, int i2) {
            if (this.mRemoteCanRender) {
                if (this.isFirstRenderFrame) {
                    this.isFirstRenderFrame = false;
                    ClientExt.this.mLogService.onFirstRemoteVideoRender(this.mInteractId);
                    Handler handler = ClientExt.this.mConfig.getHandler();
                    if (handler != null) {
                        handler.post(new ClientExt$VideoSinkWrapper$$Lambda$0(this, i, i2));
                    } else {
                        ClientExt.this.sendFirstRemoteVideoRenderMessage(this.mInteractId, i, i2);
                        ClientExt.this.invokeMixStream(true);
                    }
                }
                RenderVideoStallStatistics renderVideoStallStatistics = this.mRenderVideoStallStatistics;
                IInteractStatics iInteractStatics = ClientExt.this.mInteractStatics;
                if (this.mIsStart && !this.isRelease && renderVideoStallStatistics != null && iInteractStatics != null) {
                    renderVideoStallStatistics.rendVideoFrame();
                    iInteractStatics.onRemoteVideoRendered(this.mInteractId);
                }
            }
        }
    }

    private void throwNotBeHereException() {
        AVLog.ioe(TAG, "should not be here");
    }

    static {
        Covode.recordClassIndex(100283);
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client
    public String getBusinessId() {
        LiveRTCEngine liveRTCEngine = this.mRtcEngine;
        if (liveRTCEngine != null) {
            return liveRTCEngine.getBusinessId();
        }
        return null;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client
    public boolean getLocalAudioStreamMuteState() {
        LiveRTCEngine liveRTCEngine = this.mRtcEngine;
        if (liveRTCEngine == null || liveRTCEngine.getMuteLocalAudioStream() != MuteState.MUTE_STATE_ON) {
            return false;
        }
        return true;
    }

    public VideoStreamDescription getRtcVideoResolution() {
        LiveRTCEngine liveRTCEngine = this.mRtcEngine;
        if (liveRTCEngine != null) {
            return liveRTCEngine.getRtcVideoResolution();
        }
        return null;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client
    public boolean isDualStream() {
        LiveRTCEngine liveRTCEngine = this.mRtcEngine;
        if (liveRTCEngine != null) {
            return liveRTCEngine.isDualStream();
        }
        return false;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client
    public boolean isGuest() {
        if (this.mConfig.getCharacter() == Config.Character.GUEST) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.avframework.livestreamv2.core.interact.ClientExt$RenderVideoStallStatistics */
    public class RenderVideoStallStatistics {
        private long mCurrentTimeStamp;
        private boolean mHasReceivedFrame;
        private String mInteractId;
        private boolean mIsStart;
        private long mLastTimeStamp;
        private Runnable mRepeatCheckRenderVideoStall;

        static {
            Covode.recordClassIndex(100315);
        }

        public void rendVideoFrame() {
            if (!this.mHasReceivedFrame) {
                this.mHasReceivedFrame = true;
                long currentTimeMillis = System.currentTimeMillis();
                this.mCurrentTimeStamp = currentTimeMillis;
                this.mLastTimeStamp = currentTimeMillis;
            }
            rendVideoFrameInternal();
        }

        private synchronized void rendVideoFrameInternal() {
            MethodCollector.m26663i(1878);
            if (!this.mHasReceivedFrame) {
                MethodCollector.m26664o(1878);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.mCurrentTimeStamp = currentTimeMillis;
            long j = currentTimeMillis - this.mLastTimeStamp;
            if (j > 500) {
                ClientExt.this.mLogService.onRemoteVideoFrozen(this.mInteractId, (int) j);
            }
            this.mLastTimeStamp = this.mCurrentTimeStamp;
            MethodCollector.m26664o(1878);
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ void lambda$startStatistics$0$ClientExt$RenderVideoStallStatistics() {
            rendVideoFrameInternal();
            if (this.mIsStart && ClientExt.this.mConfig.getHandler() != null) {
                ClientExt.this.mConfig.getHandler().postDelayed(this.mRepeatCheckRenderVideoStall, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
            }
        }

        public synchronized void startStatistics() {
            MethodCollector.m26663i(1973);
            this.mIsStart = true;
            this.mRepeatCheckRenderVideoStall = new ClientExt$RenderVideoStallStatistics$$Lambda$0(this);
            if (ClientExt.this.mConfig.getHandler() != null) {
                ClientExt.this.mConfig.getHandler().post(this.mRepeatCheckRenderVideoStall);
            }
            MethodCollector.m26664o(1973);
        }

        public synchronized void stopStatistics() {
            MethodCollector.m26663i(1979);
            this.mIsStart = false;
            if (ClientExt.this.mConfig.getHandler() != null) {
                ClientExt.this.mConfig.getHandler().removeCallbacks(this.mRepeatCheckRenderVideoStall);
            }
            MethodCollector.m26664o(1979);
        }

        public RenderVideoStallStatistics(String str) {
            this.mInteractId = str;
        }
    }

    private void setAudioFrameObserverInternal() {
        if (this.mExternalAudioFrameObserver != null) {
            this.mRtcEngine.setMixedAudioFrameParameters(this.mOutSampleRate, this.mOutChannelCount);
            this.mRtcEngine.registerAudioFrameObserver(this.mInternalAudioFrameObserver);
            return;
        }
        this.mRtcEngine.registerAudioFrameObserver(null);
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client
    public void disableRtcPhoneListener() {
        this.mLogService.onEngineAPICall("disableRtcPhoneListener", String.valueOf(this));
        this.mRtcEngine.disableRtcPhoneListener();
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client
    public void enableRtcPhoneListener() {
        this.mLogService.onEngineAPICall("enableRtcPhoneListener", String.valueOf(this));
        this.mRtcEngine.enableRtcPhoneListener();
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client
    public void pause() {
        this.mIsResume = false;
        AVLog.debugTrace(new Object[0]);
        if (!this.mConfig.isEnableAudioOnBackground()) {
            enableLocalAudio(false);
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client
    public void resume() {
        this.mIsResume = true;
        AVLog.debugTrace(new Object[0]);
        if (!this.mConfig.isEnableAudioOnBackground()) {
            enableLocalAudio(true);
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client
    public void startInteract() {
        configMixTranscoding();
        this.mLogService.onPublishStream(0);
        Client.InteractEventListener interactEventListener = this.mEventListener;
        if (interactEventListener != null) {
            interactEventListener.onInteractStart(this);
        }
        invalidateSei();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.avframework.livestreamv2.core.interact.ClientExt$AudioSinkWrapper */
    public class AudioSinkWrapper {
        private boolean bBufferCleared;
        public boolean inited;
        private AudioSink mAudioSinkInternal;
        private byte[] mBuffer;
        private int mChannelCount = 1;
        public long mFetchCount;
        public int mIntervalMs = 10;
        private int mSampleRate = 16000;
        public long mStartTimeMs;
        public boolean started;
        private Thread thread;

        static {
            Covode.recordClassIndex(100311);
        }

        public void release() {
            MethodCollector.m26663i(2644);
            AVLog.debugTrace(new Object[0]);
            this.inited = false;
            this.started = false;
            Thread thread2 = this.thread;
            if (thread2 != null) {
                try {
                    thread2.join(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.thread = null;
            }
            if (!(ClientExt.this.mAudioSinkFactory == null || ClientExt.this.mAudioSink == null)) {
                ClientExt.this.mAudioSinkFactory.destroy(this.mAudioSinkInternal);
                ClientExt.this.mAudioSink = null;
            }
            MethodCollector.m26664o(2644);
        }

        public void start() {
            AVLog.debugTrace(new Object[0]);
            if (this.inited && !this.started) {
                this.started = true;
                Thread thread2 = new Thread(new Runnable() {
                    /* class com.p2082ss.avframework.livestreamv2.core.interact.ClientExt.AudioSinkWrapper.RunnableC858391 */

                    static {
                        Covode.recordClassIndex(100312);
                    }

                    public void run() {
                        MethodCollector.m26663i(3672);
                        while (AudioSinkWrapper.this.inited && AudioSinkWrapper.this.started) {
                            long currentTimeMs = TimeUtils.currentTimeMs();
                            long j = AudioSinkWrapper.this.mStartTimeMs + (AudioSinkWrapper.this.mFetchCount * ((long) AudioSinkWrapper.this.mIntervalMs));
                            if (Math.abs(currentTimeMs - j) > 500) {
                                AudioSinkWrapper.this.mStartTimeMs = currentTimeMs;
                                AudioSinkWrapper.this.mFetchCount = 0;
                                AVLog.logToIODevice2(5, ClientExt.TAG, "Reset the fetch audio timer at ".concat(String.valueOf(currentTimeMs)), null, "Client.AudioSinkWrapper$?run", 10000);
                            } else {
                                currentTimeMs = j;
                            }
                            AudioSinkWrapper.this.FetchAudioFrame(currentTimeMs);
                            AudioSinkWrapper.this.mFetchCount++;
                            long currentTimeMs2 = (AudioSinkWrapper.this.mStartTimeMs + (AudioSinkWrapper.this.mFetchCount * ((long) AudioSinkWrapper.this.mIntervalMs))) - TimeUtils.currentTimeMs();
                            if (currentTimeMs2 > 0) {
                                try {
                                    Thread.sleep(currentTimeMs2);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                        MethodCollector.m26664o(3672);
                    }
                });
                this.thread = thread2;
                thread2.setName("ByteRtcAudioSinkThread");
                this.thread.start();
            }
        }

        public void stop() {
            MethodCollector.m26663i(2637);
            AVLog.debugTrace(new Object[0]);
            if (this.inited && this.started) {
                this.started = false;
                try {
                    this.thread.join(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.thread = null;
            }
            MethodCollector.m26664o(2637);
        }

        public void setRenderAble(boolean z) {
            AudioSink audioSink = this.mAudioSinkInternal;
            if (audioSink != null) {
                audioSink.setRenderAble(z);
            }
        }

        public AudioSinkWrapper() {
            AVLog.debugTrace(new Object[0]);
            this.mSampleRate = ClientExt.this.mAudioSinkFactory.getSampleRate();
            this.mChannelCount = ClientExt.this.mAudioSinkFactory.getChannelCount();
            this.mIntervalMs = ClientExt.this.mAudioSinkFactory.getIntervalMs();
            this.mAudioSinkInternal = ClientExt.this.mAudioSinkFactory.create(null);
            this.inited = true;
        }

        public void FetchAudioFrame(long j) {
            int i = (this.mSampleRate * this.mIntervalMs) / 1000;
            int i2 = this.mChannelCount * i * 2;
            byte[] bArr = this.mBuffer;
            if (bArr == null || bArr.length < i2) {
                this.mBuffer = new byte[i2];
                this.bBufferCleared = true;
            }
            AudioFrame audioFrame = new AudioFrame();
            audioFrame.buffer = this.mBuffer;
            audioFrame.samples = i;
            ClientExt.this.mRtcEngine.pullExternalAudioFrame(audioFrame);
            this.bBufferCleared = false;
            AudioSink audioSink = this.mAudioSinkInternal;
            if (audioSink != null) {
                audioSink.onPlaybackAudioFrame(ByteBuffer.wrap(audioFrame.buffer), audioFrame.samples, this.mSampleRate, this.mChannelCount, j);
            }
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.interact.ClientExt$LogReportRunnable */
    class LogReportRunnable implements Runnable {
        private boolean started;

        static {
            Covode.recordClassIndex(100313);
        }

        public void start() {
            AVLog.debugTrace(this, Boolean.valueOf(this.started));
            if (!this.started) {
                this.started = true;
                if (ClientExt.this.mConfig.getHandler() != null) {
                    ClientExt.this.mBuilder.getLogUploadThreadHandler().post(this);
                }
            }
        }

        public void stop() {
            AVLog.debugTrace(this, Boolean.valueOf(this.started));
            if (this.started) {
                this.started = false;
                if (ClientExt.this.mConfig.getHandler() != null) {
                    ClientExt.this.mBuilder.getLogUploadThreadHandler().removeCallbacks(this);
                }
            }
        }

        public void run() {
            if (this.started) {
                AVLog.debugTrace(this);
                LocalUserStatistics.LocalUserStatisticInfo localStatisticResult = ClientExt.this.mInteractStatics.getLocalStatisticResult(ClientExt.this.mInteractEngine.getBuilder().getLiveCore());
                reportLastMessage(localStatisticResult);
                if (ClientExt.this.needPublishFrame) {
                    InteractEngineBuilder interactEngineBuilder = ClientExt.this.mBuilder;
                    if (interactEngineBuilder != null && interactEngineBuilder.isEnableRtcPushStatics()) {
                        setupRtcPushElapseInfo(localStatisticResult);
                    }
                    ClientExt.this.mLogService.onInteractStatus(localStatisticResult, ClientExt.this.mInteractStatics.getRemoteStatisticResult(), ClientExt.this.mInteractStatics.getProcInfo());
                } else {
                    AVLog.logToIODevice2(5, ClientExt.TAG, "Did not report status,needPublishFrame = " + ClientExt.this.needPublishFrame, null, "InteractLogService.onInteractStatus", 10000);
                }
                if (this.started && ClientExt.this.mConfig.getHandler() != null) {
                    ClientExt.this.mBuilder.getLogUploadThreadHandler().postDelayed(this, (long) (ClientExt.this.mConfig.getLogReportInterval() * 1000));
                }
            }
        }

        private LogReportRunnable() {
        }

        private void reportLastMessage(LocalUserStatistics.LocalUserStatisticInfo localUserStatisticInfo) {
            localUserStatisticInfo.mLastMessage = ClientExt.this.mVideoClientLastError + "|" + ClientExt.this.mAudioClientLastError;
            ClientExt.this.mVideoClientLastError = "";
            ClientExt.this.mAudioClientLastError = "";
        }

        private void setupRtcPushElapseInfo(LocalUserStatistics.LocalUserStatisticInfo localUserStatisticInfo) {
            int i;
            Statistics statistics;
            Statistics statistics2;
            VideoClient videoClient = ClientExt.this.mVideoClient;
            int i2 = 0;
            if (videoClient == null || (statistics2 = videoClient.getStatistics()) == null) {
                i = 0;
            } else {
                i = (int) (statistics2.getAverageSize() + 0.5d);
                localUserStatisticInfo.mVideoSourceFrameRate = statistics2.getSize();
                if (i > 9999) {
                    i = 9999;
                }
            }
            AudioClient audioClient = ClientExt.this.mAudioClient;
            if (!(audioClient == null || (statistics = audioClient.getStatistics()) == null)) {
                i2 = (int) (statistics.getAverageSize() + 0.5d);
                localUserStatisticInfo.mAudioSourceFrameRate = statistics.getSize();
                if (i2 > 9999) {
                    i2 = 9999;
                }
            }
            localUserStatisticInfo.mRtcPushElapseMs = (i * 10000) + i2;
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client
    public synchronized void dispose() {
        MethodCollector.m26663i(3956);
        this.disposed = true;
        this.stopped = true;
        this.needPublishFrame = false;
        AVLog.debugTrace(new Object[0]);
        this.mEventListener = null;
        this.mLogService = new InteractLogService(new LiveRTCExtInfo(), new Config(), null, this.mBuilder.getLogUploadThreadHandler());
        this.mExternalAudioFrameObserver = null;
        this.rtcAudioCallback = null;
        this.rtcVideoCallback = null;
        MethodCollector.m26664o(3956);
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client
    public void invalidateSei() {
        AVLog.debugTrace(new Object[0]);
        this.mLogService.onEngineAPICall("invalidateSei", this + " mixStreamDone: " + invokeMixStream(true));
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client
    public void startPushData() {
        boolean z;
        if (!this.mConfig.isEnableAudioOnStart() || !this.mIsResume) {
            z = false;
        } else {
            z = true;
        }
        AVLog.iow(TAG, "LiveRtcEngine.enableLocalAudio(" + z + ")");
        enableLocalAudio(z);
        this.needPublishFrame = true;
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.interact.ClientExt$16 */
    static /* synthetic */ class C8582916 {

        /* renamed from: $SwitchMap$com$ss$avframework$livestreamv2$core$interact$model$Config$ChannelProfile */
        static final /* synthetic */ int[] f191981x1b6205e4;

        /* renamed from: $SwitchMap$com$ss$bytertc$engine$handler$IRTCEngineEventHandler$LogLevel */
        static final /* synthetic */ int[] f191982x19c1d46a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|(2:15|16)|17|19|20|21|22|23|24|(3:25|26|28)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|(2:1|2)|3|5|6|7|(2:9|10)|11|13|14|15|16|17|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0055 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0069 */
        static {
            /*
            // Method dump skipped, instructions count: 116
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.avframework.livestreamv2.core.interact.ClientExt.C8582916.<clinit>():void");
        }
    }

    private void configAudioSourceAndAudioSink() {
        AudioClientFactory audioClientFactory = this.mAudioClientFactory;
        if (audioClientFactory == null || this.mAudioSinkFactory == null) {
            AVLog.iow(TAG, "LiveRtcEngine.setExternalAudioSource(false) and LiveRtcEngine.setExternalAudioSink(false)");
            this.mRtcEngine.disableExternalAudioDevice();
            return;
        }
        int sampleRate = audioClientFactory.getSampleRate();
        int channelCount = this.mAudioClientFactory.getChannelCount();
        int sampleRate2 = this.mAudioSinkFactory.getSampleRate();
        int channelCount2 = this.mAudioSinkFactory.getChannelCount();
        if (sampleRate != sampleRate2) {
            this.mInternalListener.onError(this, -1, 0, new Exception("External AudioClient and AudioSink should have same sample rate."));
            return;
        }
        AVLog.iow(TAG, "LiveRtcEngine.setExternalAudioSource(true) and LiveRtcEngine.setExternalAudioSink(true)");
        this.mRtcEngine.enableExternalAudioDevice(generateAudioForamt(channelCount, sampleRate), generateAudioForamt(channelCount2, sampleRate2));
        AudioClient create = this.mAudioClientFactory.create();
        this.mAudioClient = create;
        create.prepare(this.rtcAudioCallback);
        this.mAudioSink = new AudioSinkWrapper();
    }

    public synchronized void clearAllSinkWrappers() {
        MethodCollector.m26663i(3941);
        AVLog.ioi(TAG, "current video sink wrappers count:" + this.mVideoSinkMap.size() + ",[" + this + "]");
        for (VideoSinkWrapper videoSinkWrapper : this.mVideoSinkMap.values()) {
            AVLog.iow(TAG, "release ".concat(String.valueOf(videoSinkWrapper)));
            videoSinkWrapper.release();
        }
        this.mVideoSinkMap.clear();
        MethodCollector.m26664o(3941);
    }

    public List<Region> formRegionList() {
        ArrayList arrayList;
        MethodCollector.m26663i(5088);
        synchronized (this.mGuestList) {
            try {
                ArrayList<String> arrayList2 = new ArrayList();
                arrayList2.add(this.mSelfInteractId);
                arrayList2.addAll(this.mGuestList);
                arrayList = new ArrayList();
                for (String str : arrayList2) {
                    Region talking = new Region().interactId(str).talking(getTalkingState(str));
                    if (getRenderedStat(str) || str.equalsIgnoreCase(this.mSelfInteractId)) {
                        arrayList.add(talking);
                    }
                }
            } finally {
                MethodCollector.m26664o(5088);
            }
        }
        return arrayList;
    }

    private void configMixTranscoding() {
        LiveTranscoding createLiveTranscoding = createLiveTranscoding(true);
        if (createLiveTranscoding != null) {
            Client.StreamMixer streamMixer = this.mConfig.getStreamMixer();
            if (streamMixer == null) {
                String str = "InteractConfig.getStreamMixer is null: interact mode " + this.mConfig.getInteractMode() + ", character " + this.mConfig.getCharacter() + ", mix type " + this.mConfig.getMixStreamType() + ". Create client stack: " + this.mConfig.getCreateClientStack();
                String str2 = TAG;
                AVLog.ioe(str2, str);
                AVLog.logKibana(6, str2, str, null);
                return;
            }
            int videoWidth = this.mConfig.getMixStreamConfig().getVideoWidth();
            int videoHeight = this.mConfig.getMixStreamConfig().getVideoHeight();
            List<Region> formRegionList = formRegionList();
            String mixStream = streamMixer.mixStream(videoWidth, videoHeight, formRegionList);
            convertRegionsToLiveTranscoding(formRegionList, createLiveTranscoding);
            createLiveTranscoding.getLayout().setAppData(mixStream);
            if (this.authInfoCache != null && !TextUtils.isEmpty(this.mConfig.getMixStreamConfig().getStreamUrl())) {
                Matcher matcher = Pattern.compile("stream-[0-9]+([0-9]{5})").matcher(this.mConfig.getMixStreamConfig().getStreamUrl());
                if (matcher.find()) {
                    try {
                        this.authInfoCache.put("streamName", matcher.group());
                        createLiveTranscoding.setAuthInfo(this.authInfoCache);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                this.authInfoCache = null;
            }
            this.liveTranscodingState = true;
            this.mRtcEngine.startLiveTranscoding(createLiveTranscoding, new ILiveTranscodingObserver() {
                /* class com.p2082ss.avframework.livestreamv2.core.interact.ClientExt.C858313 */

                static {
                    Covode.recordClassIndex(100303);
                }

                @Override // com.p2082ss.bytertc.engine.live.ILiveTranscodingObserver
                public boolean isSupportClientPushStream() {
                    return false;
                }

                @Override // com.p2082ss.bytertc.engine.live.ILiveTranscodingObserver
                public void onDataFrame(byte[] bArr, long j) {
                }

                @Override // com.p2082ss.bytertc.engine.live.ILiveTranscodingObserver
                public void onMixingAudioFrame(byte[] bArr, int i) {
                }

                @Override // com.p2082ss.bytertc.engine.live.ILiveTranscodingObserver
                public void onMixingVideoFrame(VideoFrame videoFrame) {
                }

                @Override // com.p2082ss.bytertc.engine.live.ILiveTranscodingObserver
                public void onStreamMixingEvent(int i, String str, int i2, int i3) {
                    AVLog.iod(ClientExt.TAG, "Received onStreamMixingEvent, eventType: " + i + " eventData: " + str + " error: " + i2 + " mixType: " + i3);
                    AVLog.debugTrace(Integer.valueOf(i), str, Integer.valueOf(i2), Integer.valueOf(i3));
                    ClientExt.this.mLogService.onStreamStateChange(i2, InteractStreamMixingEventMessage.buildStreamMixingEventMessage(i, str, i2, i3), 1);
                }
            });
            createLiveTranscoding.setAuthInfo(null);
            this.mRtcEngine.updateLiveTranscoding(createLiveTranscoding);
            this.mLogService.onEngineAPICall("enableLiveTranscoding", this + createLiveTranscoding.toString());
        } else if (this.mConfig.getCharacter() != Config.Character.ANCHOR || this.mConfig.getMixStreamType() != Config.MixStreamType.SERVER_MIX) {
        } else {
            if (this.mConfig.getMixStreamConfig() == null) {
                AVLog.ioe(TAG, "Fail to init LiveTranscoding: MixStreamConfig is null");
            } else if (TextUtils.isEmpty(this.mConfig.getMixStreamConfig().getStreamUrl())) {
                AVLog.ioe(TAG, "Fail to init LiveTranscoding: stream url is " + this.mConfig.getMixStreamConfig().getStreamUrl());
            } else {
                AVLog.ioe(TAG, "Fail to init LiveTranscoding: unknown reason");
            }
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client
    public void joinChannel() {
        MuteState muteState;
        int i;
        int fps;
        int bitrate;
        this.mLogService.setRtcSdkVersions(LiveRTCEngine.getSdkVersion(), LiveRTCEngine.getSdkVersion());
        if (this.mConfig.getDefaultAudioRoutetoSpeakerphone()) {
            this.mRtcEngine.setAudioPlaybackDevice(AudioPlaybackDevice.AUDIO_PLAYBACK_DEVICE_SPEAKERPHONE);
        }
        int userRole = this.mRtcEngine.setUserRole(RTCEngine.ClientRole.CLIENT_ROLE_BROADCASTER);
        if (userRole < 0) {
            this.mInternalListener.onError(this, -1, (long) userRole, new Exception("setClientRole failed"));
            return;
        }
        if (this.mConfig.getVolumeCallbackInterval() > 0) {
            this.mRtcEngine.setAudioVolumeIndicationInterval(this.mConfig.getVolumeCallbackInterval());
        }
        this.mRtcEngine.muteLocalAudio(MuteState.MUTE_STATE_OFF);
        this.mRtcEngine.muteAllRemoteAudio(MuteState.MUTE_STATE_OFF);
        configAudioSourceAndAudioSink();
        setAudioFrameObserverInternal();
        enableLocalAudio(false);
        this.mRtcEngine.muteLocalAudio(MuteState.MUTE_STATE_OFF);
        LiveRTCEngine liveRTCEngine = this.mRtcEngine;
        if (this.mEnableRemoteAllRender) {
            muteState = MuteState.MUTE_STATE_OFF;
        } else {
            muteState = MuteState.MUTE_STATE_ON;
        }
        liveRTCEngine.muteAllRemoteAudio(muteState);
        if (this.mConfig.getType() == Config.Type.VIDEO) {
            if (this.mVideoClientFactory != null) {
                this.mRtcEngine.muteLocalVideo(MuteState.MUTE_STATE_OFF);
                this.mRtcEngine.muteAllRemoteVideo(MuteState.MUTE_STATE_OFF);
                this.mRtcEngine.setVideoInputType(MediaInputType.MEDIA_INPUT_TYPE_EXTERNAL);
                VideoClient create = this.mVideoClientFactory.create();
                this.mVideoClient = create;
                create.prepare(this.rtcVideoCallback);
            } else {
                throw new AndroidRuntimeException("External video capturer should be set.");
            }
        }
        boolean z = true;
        if (getConfig() == null || getConfig().getMixStreamType() != Config.MixStreamType.CLIENT_MIX) {
            i = 0;
        } else {
            i = 1;
        }
        this.mRtcEngine.configureEngine(new LiveInfo(i), this.mInternalRtcCallback);
        Config.VideoQuality videoQuality = this.mConfig.getVideoQuality();
        VideoStreamDescription videoStreamDescription = new VideoStreamDescription(videoQuality.getWidth(), videoQuality.getHeight(), videoQuality.getFps(), videoQuality.getBitrate(), VideoStreamDescription.EncoderPreference.MaintainQuality.getValue());
        int videoEncoderConfig = this.mRtcEngine.setVideoEncoderConfig(Arrays.asList(videoStreamDescription));
        if (videoEncoderConfig < 0) {
            this.mInternalListener.onError(this, -1, (long) videoEncoderConfig, new Exception("setVideoResolution failed"));
            return;
        }
        VideoStreamDescription rtcVideoResolution = this.mRtcEngine.getRtcVideoResolution();
        if (rtcVideoResolution != null && ((Integer) rtcVideoResolution.videoSize.first).intValue() > 0 && ((Integer) rtcVideoResolution.videoSize.second).intValue() > 0) {
            if (rtcVideoResolution.frameRate > 0) {
                fps = rtcVideoResolution.frameRate;
            } else {
                fps = videoQuality.getFps();
            }
            if (rtcVideoResolution.maxKbps > 0) {
                bitrate = rtcVideoResolution.maxKbps;
            } else {
                bitrate = videoQuality.getBitrate();
            }
            this.mConfig.setVideoQuality(new Config.VideoQuality(((Integer) rtcVideoResolution.videoSize.first).intValue(), ((Integer) rtcVideoResolution.videoSize.second).intValue(), fps, bitrate));
        }
        if (this.mRtcExtInfo.channelId == null || this.mRtcExtInfo.channelId.equals("0")) {
            this.mInternalListener.onError(this, -1, 0, new Exception("channel name illegal"));
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.mAudioClientFactory == null) {
                z = false;
            }
            jSONObject.put("external_audio", z);
            if (!this.mConfig.isEnableAudioOnStart()) {
                jSONObject.put("enable_local_audio", false);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        int joinRoom = this.mRtcEngine.joinRoom(null);
        this.mLogService.onJoiningChannel(joinRoom, this.mRtcExtInfo.token, this.mRtcEngine.getAppId(), jSONObject.toString());
        if (joinRoom < 0) {
            AVLog.ioi(TAG, "joinChannel() failed= code:".concat(String.valueOf(joinRoom)));
            this.mInternalListener.onError(this, -1, (long) joinRoom, new Exception("joinChannel failed"));
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client
    public synchronized void stop() {
        VideoClient videoClient;
        MethodCollector.m26663i(3915);
        this.stopped = true;
        this.needPublishFrame = false;
        AVLog.debugTrace(new Object[0]);
        if (this.mConfig.getCharacter() == Config.Character.ANCHOR && this.mConfig.getInteractMode() == Config.InteractMode.PK && this.mConfig.getMixStreamType() == Config.MixStreamType.CLIENT_MIX && this.mBuilder.getAdjustStreamResolutionOnInteract() && this.mEventListener != null) {
            VideoStreamDescription rtcVideoResolution = getRtcVideoResolution();
            Client.InteractEventListener interactEventListener = this.mEventListener;
            if (interactEventListener != null) {
                interactEventListener.notifyLiveStreamAdjustResolution(this, true, ((Integer) rtcVideoResolution.videoSize.first).intValue(), ((Integer) rtcVideoResolution.videoSize.second).intValue());
            }
        }
        if (!(this.mConfig.getType() != Config.Type.VIDEO || this.mVideoClientFactory == null || (videoClient = this.mVideoClient) == null)) {
            synchronized (videoClient) {
                try {
                    this.mVideoClient.stop();
                    this.mVideoClient.release();
                    this.mVideoClientFactory.destroy(this.mVideoClient);
                    this.mVideoClient = null;
                } catch (Throwable th) {
                    MethodCollector.m26664o(3915);
                    throw th;
                }
            }
        }
        clearAllSinkWrappers();
        for (String str : this.mFirstRemoteVideoFrameTimestamp.keySet()) {
            Long l = this.mFirstRemoteVideoFrameTimestamp.get(str);
            if (l != null) {
                long currentTimeMillis = System.currentTimeMillis() - l.longValue();
                if (currentTimeMillis > 0) {
                    this.mPullStreamsDuration.addAndGet(currentTimeMillis);
                }
            }
        }
        this.mFirstRemoteVideoFrameTimestamp.clear();
        AudioClient audioClient = this.mAudioClient;
        if (audioClient != null) {
            synchronized (audioClient) {
                try {
                    this.mAudioClient.stop();
                    this.mAudioClient.release();
                    this.mAudioClientFactory.destroy(this.mAudioClient);
                    this.mAudioClient = null;
                } catch (Throwable th2) {
                    MethodCollector.m26664o(3915);
                    throw th2;
                }
            }
        }
        AudioSinkWrapper audioSinkWrapper = this.mAudioSink;
        if (audioSinkWrapper != null) {
            synchronized (audioSinkWrapper) {
                try {
                    this.mAudioSink.stop();
                    this.mAudioSink.release();
                    this.mAudioSink = null;
                } catch (Throwable th3) {
                    MethodCollector.m26664o(3915);
                    throw th3;
                }
            }
        }
        this.mExternalAudioFrameObserver = null;
        setAudioFrameObserverInternal();
        this.mRtcEngine.muteLocalAudio(MuteState.MUTE_STATE_ON);
        this.mRtcEngine.muteAllRemoteAudio(MuteState.MUTE_STATE_ON);
        enableLocalAudio(false);
        if (this.mConfig.getCharacter() == Config.Character.ANCHOR && this.mConfig.getMixStreamType() == Config.MixStreamType.SERVER_MIX) {
            this.mRtcEngine.stopLiveTranscoding();
            this.liveTranscodingState = false;
            this.mLogService.onEngineAPICall("disableLiveTranscoding", String.valueOf(this));
        }
        String str2 = TAG;
        AVLog.iow(str2, "Check remote yuv color range average cost " + this.mRemoteColorRange.getAverageCheckCost() + "ms per frame");
        this.mLogService.onLeavingChannel(this.mPullStreamsDuration.get(), this.mRemoteColorRange.getRemoteYuvFrameColorRange(), this.mRemoteColorRange.getYuv2RgbFrameColorRange());
        this.mRtcEngine.leaveRoom();
        LogReportRunnable logReportRunnable = this.mLogReportRunnable;
        if (logReportRunnable != null) {
            logReportRunnable.stop();
            this.mLogReportRunnable = null;
        }
        this.mGuestList.clear();
        AVLog.iow(str2, "LeaveChannel cost " + (System.currentTimeMillis() - System.currentTimeMillis()) + "ms");
        this.mInternalListener.onInfo(this, 5, 0, new Object[0]);
        Client.InteractEventListener interactEventListener2 = this.mEventListener;
        if (interactEventListener2 != null) {
            interactEventListener2.onInteractStop(this);
        }
        AVLog.ioi(str2, "end release [" + this + "]");
        MethodCollector.m26664o(3915);
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client
    public void start() {
        boolean z;
        int i;
        boolean z2;
        int fps;
        int bitrate;
        MuteState muteState;
        this.mServerMixStreamPublishedReceived = false;
        String str = TAG;
        AVLog.ioi(str, "start() ".concat(String.valueOf(this)));
        this.mLogService.setRtcSdkVersions(LiveRTCEngine.getSdkVersion(), LiveRTCEngine.getSdkVersion());
        int userRole = this.mRtcEngine.setUserRole(RTCEngine.ClientRole.CLIENT_ROLE_BROADCASTER);
        if (userRole < 0) {
            this.mInternalListener.onError(this, -1, (long) userRole, new Exception("setClientRole failed"));
            return;
        }
        if (this.mConfig.getVolumeCallbackInterval() > 0) {
            this.mRtcEngine.setAudioVolumeIndicationInterval(this.mConfig.getVolumeCallbackInterval());
        }
        this.mRtcEngine.muteLocalAudio(MuteState.MUTE_STATE_OFF);
        this.mRtcEngine.muteAllRemoteAudio(MuteState.MUTE_STATE_OFF);
        configAudioSourceAndAudioSink();
        setAudioFrameObserverInternal();
        if (!this.mConfig.isEnableAudioOnStart() || !this.mIsResume) {
            z = false;
        } else {
            z = true;
        }
        AVLog.iow(str, "LiveRtcEngine.enableLocalAudio(" + z + ")");
        enableLocalAudio(z);
        this.mRtcEngine.muteLocalAudio(MuteState.MUTE_STATE_OFF);
        this.mRtcEngine.muteAllRemoteAudio(MuteState.MUTE_STATE_OFF);
        if (this.mConfig.getType() != Config.Type.VIDEO) {
            AVLog.iow(str, "LiveRtcEngine.enableLocalVideo(false)");
        } else if (this.mVideoClientFactory != null) {
            LiveRTCEngine liveRTCEngine = this.mRtcEngine;
            if (this.mMuteLocalVideoStreamStat) {
                muteState = MuteState.MUTE_STATE_ON;
            } else {
                muteState = MuteState.MUTE_STATE_OFF;
            }
            liveRTCEngine.muteLocalVideo(muteState);
            this.mRtcEngine.muteAllRemoteVideo(MuteState.MUTE_STATE_OFF);
            this.mRtcEngine.setVideoInputType(MediaInputType.MEDIA_INPUT_TYPE_EXTERNAL);
            VideoClient create = this.mVideoClientFactory.create();
            this.mVideoClient = create;
            create.prepare(this.rtcVideoCallback);
        } else {
            throw new AndroidRuntimeException("External video capturer should be set.");
        }
        if (getConfig() == null || getConfig().getMixStreamType() != Config.MixStreamType.CLIENT_MIX) {
            i = 0;
        } else {
            i = 1;
        }
        this.mRtcEngine.configureEngine(new LiveInfo(i), this.mInternalRtcCallback);
        Config.VideoQuality videoQuality = this.mConfig.getVideoQuality();
        VideoStreamDescription videoStreamDescription = new VideoStreamDescription(videoQuality.getWidth(), videoQuality.getHeight(), videoQuality.getFps(), videoQuality.getBitrate(), VideoStreamDescription.ScaleMode.SCALE_MODE_FIT_WITH_FILLING.getValue());
        int videoEncoderConfig = this.mRtcEngine.setVideoEncoderConfig(Arrays.asList(videoStreamDescription));
        if (videoEncoderConfig < 0) {
            this.mInternalListener.onError(this, -1, (long) videoEncoderConfig, new Exception("setVideoResolution failed"));
            return;
        }
        VideoStreamDescription rtcVideoResolution = this.mRtcEngine.getRtcVideoResolution();
        if (rtcVideoResolution != null && ((Integer) rtcVideoResolution.videoSize.first).intValue() > 0 && ((Integer) rtcVideoResolution.videoSize.second).intValue() > 0) {
            if (rtcVideoResolution.frameRate > 0) {
                fps = rtcVideoResolution.frameRate;
            } else {
                fps = videoQuality.getFps();
            }
            if (rtcVideoResolution.maxKbps > 0) {
                bitrate = rtcVideoResolution.maxKbps;
            } else {
                bitrate = videoQuality.getBitrate();
            }
            this.mConfig.setVideoQuality(new Config.VideoQuality(((Integer) rtcVideoResolution.videoSize.first).intValue(), ((Integer) rtcVideoResolution.videoSize.second).intValue(), fps, bitrate));
        }
        configMixTranscoding();
        this.mLogService.onPublishStream(0);
        if (this.mRtcExtInfo.channelId == null || this.mRtcExtInfo.channelId.equals("0")) {
            this.mInternalListener.onError(this, -1, 0, new Exception("channel name illegal"));
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.mAudioClientFactory != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            jSONObject.put("external_audio", z2);
            if (!z) {
                jSONObject.put("enable_local_audio", false);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        int joinRoom = this.mRtcEngine.joinRoom(null);
        this.mLogService.onJoiningChannel(joinRoom, this.mRtcExtInfo.token, this.mRtcEngine.getAppId(), jSONObject.toString());
        if (joinRoom < 0) {
            this.mInternalListener.onError(this, -1, (long) joinRoom, new Exception("joinChannel failed"));
        }
        Client.InteractEventListener interactEventListener = this.mEventListener;
        if (interactEventListener != null) {
            interactEventListener.onInteractStart(this);
        }
        this.needPublishFrame = true;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client
    public void setInteractEventListener(Client.InteractEventListener interactEventListener) {
        this.mEventListener = interactEventListener;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client
    public void start(Object obj) {
        throwNotBeHereException();
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client
    public void startInteract(Object obj) {
        throwNotBeHereException();
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client
    public void stop(Object obj) {
        throwNotBeHereException();
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client
    public void enableAllRemoteRender(boolean z) {
        enableAllRemoteRender(z, true);
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client
    public void initDualGameEngine(final IDualGameEngine iDualGameEngine) {
        this.mConfig.getHandler().post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.ClientExt.RunnableC858324 */

            static {
                Covode.recordClassIndex(100304);
            }

            public void run() {
                if (ClientExt.this.mVideoSinkMap.size() != 1) {
                    AVLog.ioe(ClientExt.TAG, "Can not start DualGame because guest list isn't 1.");
                    return;
                }
                IDualGameEngine iDualGameEngine = iDualGameEngine;
                if (iDualGameEngine instanceof DualGameEngineExt) {
                    final DualGameEngineExt dualGameEngineExt = (DualGameEngineExt) iDualGameEngine;
                    Iterator<VideoSinkWrapper> it = ClientExt.this.mVideoSinkMap.values().iterator();
                    if (it.hasNext()) {
                        VideoSinkWrapper next = it.next();
                        AVLog.ioi(ClientExt.TAG, "initDualGameEngine:" + iDualGameEngine);
                        dualGameEngineExt.setInteractVideoSink(next.mVideoSink);
                        next.setDualGameFrameCallback(new DualGameEngineExt.IDualGameFrameCallback() {
                            /* class com.p2082ss.avframework.livestreamv2.core.interact.ClientExt.RunnableC858324.C858331 */

                            static {
                                Covode.recordClassIndex(100305);
                            }

                            @Override // com.p2082ss.avframework.livestreamv2.core.interact.dualgame.DualGameEngineExt.IDualGameFrameCallback
                            public boolean onDualGameFrameCallback(int i, int i2, int i3, int i4) {
                                DualGameEngineExt dualGameEngineExt = dualGameEngineExt;
                                if (dualGameEngineExt == null || !dualGameEngineExt.isEnable() || !dualGameEngineExt.mixInteractVideoFrame(i, i2, i3, i4, null)) {
                                    return false;
                                }
                                return true;
                            }
                        });
                    }
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onUserLeaved(String str) {
        VideoMixer.VideoMixerDescription videoMixerDescription;
        InteractEngine interactEngine = this.mInteractEngine;
        if (interactEngine != null && (videoMixerDescription = this.mSelfVideoMixerDescription) != null) {
            interactEngine.updateClientMixStreamDescription(videoMixerDescription);
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client
    public void setDirectRtcEventCallback(IRTCEngineEventHandler iRTCEngineEventHandler) {
        if (iRTCEngineEventHandler == null) {
            iRTCEngineEventHandler = new IRTCEngineEventHandler() {
                /* class com.p2082ss.avframework.livestreamv2.core.interact.ClientExt.C8582413 */

                static {
                    Covode.recordClassIndex(100291);
                }
            };
        }
        this.mRtcCallback = iRTCEngineEventHandler;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client
    public void setListener(Client.Listener listener) {
        AVLog.debugTrace(listener);
        this.mListener = listener;
    }

    public boolean getTalkingState(String str) {
        if (this.mTalkingStates.containsKey(str)) {
            return this.mTalkingStates.get(str).booleanValue();
        }
        return false;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client
    public void muteLocalAudio(boolean z) {
        MuteState muteState;
        this.mLogService.onEngineAPICall("muteLocalAudioStream", "mute ".concat(String.valueOf(z)));
        LiveRTCEngine liveRTCEngine = this.mRtcEngine;
        if (z) {
            muteState = MuteState.MUTE_STATE_ON;
        } else {
            muteState = MuteState.MUTE_STATE_OFF;
        }
        liveRTCEngine.muteLocalAudio(muteState);
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client
    public void muteLocalVideo(boolean z) {
        MuteState muteState;
        this.mLogService.onEngineAPICall("muteLocalVideoStream", "mute ".concat(String.valueOf(z)));
        LiveRTCEngine liveRTCEngine = this.mRtcEngine;
        if (z) {
            muteState = MuteState.MUTE_STATE_ON;
        } else {
            muteState = MuteState.MUTE_STATE_OFF;
        }
        liveRTCEngine.muteLocalVideo(muteState);
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client
    public void setAudioScenario(int i) {
        RTCEngine.AudioScenarioType audioScenarioType;
        if (i == 0) {
            audioScenarioType = RTCEngine.AudioScenarioType.AUDIO_SCENARIO_MUSIC;
        } else if (i == 1) {
            audioScenarioType = RTCEngine.AudioScenarioType.AUDIO_SCENARIO_HIGHQUALITY_COMMUNICATION;
        } else if (i == 2) {
            audioScenarioType = RTCEngine.AudioScenarioType.AUDIO_SCENARIO_COMMUNICATION;
        } else if (i == 3) {
            audioScenarioType = RTCEngine.AudioScenarioType.AUDIO_SCENARIO_MEDIA;
        } else {
            return;
        }
        LiveRTCEngine liveRTCEngine = this.mRtcEngine;
        if (liveRTCEngine != null) {
            liveRTCEngine.setAudioScenario(audioScenarioType);
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client
    public void setBusinessId(String str) {
        LiveRTCEngine liveRTCEngine = this.mRtcEngine;
        if (liveRTCEngine != null) {
            liveRTCEngine.setBusinessId(str);
            InteractLogService interactLogService = this.mLogService;
            if (interactLogService != null) {
                if (str == null) {
                    str = "";
                }
                interactLogService.onEngineAPICall("setBusinessId", str);
            }
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client
    public void setOnlyConsumeAllRemoteSei(boolean z) {
        this.mOnlyConsumeAllRemoteSei = z;
        for (VideoSinkWrapper videoSinkWrapper : this.mVideoSinkMap.values()) {
            if (videoSinkWrapper != null) {
                videoSinkWrapper.setOnlyNeedRemoteSei(z);
            }
        }
    }

    private void enableLocalAudio(boolean z) {
        if (this.mInteractEngine.getBuilder().isByteAudioEnabled() && (this.mAudioClientFactory != null || this.mAudioSinkFactory != null)) {
            return;
        }
        if (z) {
            this.mRtcEngine.startAudioCapture();
        } else {
            this.mRtcEngine.stopAudioCapture();
        }
    }

    private boolean getRenderedStat(String str) {
        if (!this.mVideoSinkMap.containsKey(str) || this.mConfig.getInteractMode() != Config.InteractMode.PK) {
            return true;
        }
        VideoSinkWrapper videoSinkWrapper = this.mVideoSinkMap.get(str);
        if (videoSinkWrapper == null || !videoSinkWrapper.hasRenderFirstFrame()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client
    public void muteAllRemoteAudioStreams(boolean z) {
        MuteState muteState;
        AVLog.debugTrace(Boolean.valueOf(z));
        this.mLogService.onEngineAPICall("muteAllRemoteAudioStreams", this + ", mute " + z);
        LiveRTCEngine liveRTCEngine = this.mRtcEngine;
        if (z) {
            muteState = MuteState.MUTE_STATE_ON;
        } else {
            muteState = MuteState.MUTE_STATE_OFF;
        }
        liveRTCEngine.muteAllRemoteAudio(muteState);
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client
    public void muteAllRemoteVideoStreams(boolean z) {
        MuteState muteState;
        AVLog.debugTrace(Boolean.valueOf(z));
        this.mLogService.onEngineAPICall("muteAllRemoteVideoStreams", this + ", mute " + z);
        LiveRTCEngine liveRTCEngine = this.mRtcEngine;
        if (z) {
            muteState = MuteState.MUTE_STATE_ON;
        } else {
            muteState = MuteState.MUTE_STATE_OFF;
        }
        liveRTCEngine.muteAllRemoteVideo(muteState);
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client
    public long sendRoomMessage(String str) {
        AVLog.debugTrace(str);
        this.mLogService.onEngineAPICall("sendRoomMessage", this + ", message " + str);
        return this.mRtcEngine.sendRoomMessage(str);
    }

    public RTCEngine.ChannelProfile transformChannelProfile(Config.ChannelProfile channelProfile) {
        String str = TAG;
        AVLog.ioi(str, "transformChannelProfile() before channelProfile=".concat(String.valueOf(channelProfile)));
        RTCEngine.ChannelProfile channelProfile2 = RTCEngine.ChannelProfile.CHANNEL_PROFILE_LIVE_BROADCASTING;
        int i = C8582916.f191981x1b6205e4[channelProfile.ordinal()];
        if (i == 1) {
            channelProfile2 = RTCEngine.ChannelProfile.CHANNEL_PROFILE_COMMUNICATION;
        } else if (i == 2) {
            channelProfile2 = RTCEngine.ChannelProfile.CHANNEL_PROFILE_LIVE_BROADCASTING;
        } else if (i == 3) {
            channelProfile2 = RTCEngine.ChannelProfile.CHANNEL_PROFILE_GAME;
        } else if (i == 4) {
            channelProfile2 = RTCEngine.ChannelProfile.CHANNEL_PROFILE_CLOUD_GAME;
        }
        AVLog.ioi(str, "transformChannelProfile() end rtcProfile=".concat(String.valueOf(channelProfile2)));
        return channelProfile2;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client
    public void updateRtcExtInfo(String str) {
        AVLog.debugTrace(str);
        this.mLogService.onEngineAPICall("updateRtcExtInfo", this + ", config " + str);
        this.mConfig.setRtcExtInfo(str);
        this.mRtcEngine.updateRtcExtInfo(str);
        this.mRtcExtInfo = this.mRtcEngine.getRtcExtInfo();
    }

    /* access modifiers changed from: protected */
    public String convertMixStreamLayout(List<Region> list) {
        JSONArray jSONArray = new JSONArray();
        if (list != null) {
            try {
                for (Region region : list) {
                    if (region != null) {
                        jSONArray.put(new JSONObject().put("uid", region.getInteractId()).put("left", region.getX()).put("top", region.getY()).put("width", region.getWidth()).put("height", region.getHeight()).put("zOrder", region.getZorder()).put("mute", region.isMuteAudio()));
                    }
                }
            } catch (JSONException e) {
                AVLog.ioe(TAG, "create layout json message happen exception: ".concat(String.valueOf(e)));
                return null;
            }
        }
        return jSONArray.toString();
    }

    public boolean invokeMixStream(boolean z) {
        AVLog.debugTrace(new Object[0]);
        if (!(this.mConfig.getCharacter() != Config.Character.ANCHOR || this.mConfig.getMixStreamType() == Config.MixStreamType.NONE || this.mConfig.getStreamMixer() == null)) {
            int videoWidth = this.mConfig.getMixStreamConfig().getVideoWidth();
            int videoHeight = this.mConfig.getMixStreamConfig().getVideoHeight();
            List<Region> formRegionList = formRegionList();
            String mixStream = this.mConfig.getStreamMixer().mixStream(videoWidth, videoHeight, formRegionList);
            if (formRegionList != null && !formRegionList.isEmpty()) {
                mixStream(formRegionList, mixStream, z);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onUserJoined(String str) {
        VideoMixer.VideoMixerDescription videoMixerDescription;
        if (getConfig().getCharacter() == Config.Character.ANCHOR && getConfig().getInteractMode() == Config.InteractMode.PK && getConfig().getMixStreamType() == Config.MixStreamType.CLIENT_MIX && this.mBuilder.getAdjustStreamResolutionOnInteract() && this.mEventListener != null) {
            VideoStreamDescription rtcVideoResolution = getRtcVideoResolution();
            Client.InteractEventListener interactEventListener = this.mEventListener;
            if (interactEventListener != null) {
                interactEventListener.notifyLiveStreamAdjustResolution(this, false, ((Integer) rtcVideoResolution.videoSize.first).intValue(), ((Integer) rtcVideoResolution.videoSize.second).intValue());
            }
        }
        InteractEngine interactEngine = this.mInteractEngine;
        if (interactEngine != null && (videoMixerDescription = this.mSelfVideoMixerDescription) != null) {
            interactEngine.updateClientMixStreamDescription(videoMixerDescription);
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client
    public void sendSdkControlMsg(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                if (!jSONObject.isNull(StringSet.type) && "push".equals(jSONObject.getString(StringSet.type))) {
                    sendSdkControlMsgInternal(jSONObject.getString("command"), new JSONObject(jSONObject.getString("params")));
                }
            }
        } catch (Exception e) {
            AVLog.ioe(TAG, "sendSdkControlMsg error:".concat(String.valueOf(e)));
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client
    public void switchAudio(boolean z) {
        MuteState muteState;
        AVLog.debugTrace(Boolean.valueOf(z));
        this.mLogService.onEngineAPICall("switchAudio", this + ", enable " + z);
        InteractEngineBuilder builder = this.mInteractEngine.getBuilder();
        if (this.mRtcEngine == null) {
            return;
        }
        if (isGuest() || (builder != null && !builder.isByteAudioEnabled() && !builder.mUseInteractAudioClient)) {
            LiveRTCEngine liveRTCEngine = this.mRtcEngine;
            if (z) {
                muteState = MuteState.MUTE_STATE_OFF;
            } else {
                muteState = MuteState.MUTE_STATE_ON;
            }
            liveRTCEngine.muteLocalAudio(muteState);
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client
    public void switchMixType(boolean z) {
        if (z) {
            if (this.mConfig.getMixStreamType() == Config.MixStreamType.CLIENT_MIX) {
                this.mConfig.setMixStreamType(Config.MixStreamType.SERVER_MIX);
                this.mInteractEngine.switchMixType(z);
                configMixTranscoding();
                this.mLogService.onPublishStream(0);
                invokeMixStream(true);
            }
        } else if (this.mConfig.getMixStreamType() == Config.MixStreamType.SERVER_MIX) {
            this.mConfig.setMixStreamType(Config.MixStreamType.CLIENT_MIX);
            this.mRtcEngine.stopLiveTranscoding();
            this.liveTranscodingState = false;
            this.mLogService.onEngineAPICall("disableLiveTranscoding", String.valueOf(this));
            invokeMixStream(true);
            this.mInteractEngine.switchMixType(z);
        }
    }

    private LiveTranscoding createLiveTranscoding(boolean z) {
        String str;
        LiveTranscoding.AACProfile aACProfile;
        if (this.mConfig.getCharacter() != Config.Character.ANCHOR || this.mConfig.getMixStreamType() != Config.MixStreamType.SERVER_MIX || this.mConfig.getMixStreamConfig() == null || TextUtils.isEmpty(this.mConfig.getMixStreamConfig().getStreamUrl())) {
            return null;
        }
        Config.MixStreamConfig mixStreamConfig = this.mConfig.getMixStreamConfig();
        LiveTranscoding defualtLiveTranscode = LiveTranscoding.getDefualtLiveTranscode();
        LiveTranscoding.VideoConfig height = defualtLiveTranscode.getVideo().setKBitRate(mixStreamConfig.getVideoBitrate()).setFps(mixStreamConfig.getVideoFrameRate()).setWidth(mixStreamConfig.getVideoWidth()).setHeight(mixStreamConfig.getVideoHeight());
        if (mixStreamConfig.getVideoCodec() == Config.VideoCodec.BYTEVC1) {
            str = "ByteVC1";
        } else {
            str = "H264";
        }
        height.setCodec(str).setGop((int) (mixStreamConfig.getVideoGop() * ((float) mixStreamConfig.getVideoFrameRate())));
        LiveTranscoding.AudioConfig sampleRate = defualtLiveTranscode.getAudio().setChannels(mixStreamConfig.getAudioChannels()).setSampleRate(mixStreamConfig.getAudioSampleRateValue());
        if (mixStreamConfig.getAudioProfile() == Config.AudioProfile.HE) {
            aACProfile = LiveTranscoding.AACProfile.AAC_PROFILE_HEV1;
        } else {
            aACProfile = LiveTranscoding.AACProfile.AAC_PROFILE_LC;
        }
        sampleRate.setAacProfile(aACProfile).setKBitRate(mixStreamConfig.getAudioBitrate());
        if (z) {
            mixStreamConfig.updateStreamUrlPriority();
        }
        defualtLiveTranscode.setUrl(mixStreamConfig.getStreamUrl());
        LiveTranscoding.Layout builder = new LiveTranscoding.Layout.Builder().builder();
        builder.setBackgroundColor(C1764a.m5928a("#%06x", new Object[]{Integer.valueOf(mixStreamConfig.getBackgroundColor())}));
        defualtLiveTranscode.setLayout(builder);
        return defualtLiveTranscode;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client
    public void updateSdkParams(String str) {
        boolean z;
        int i;
        String str2 = TAG;
        AVLog.logKibana(4, str2, "update Sdk Params:".concat(String.valueOf(str)), null);
        AVLog.ioi(str2, "update Sdk Params:".concat(String.valueOf(str)));
        Config.MixStreamConfig mixStreamConfig = this.mConfig.getMixStreamConfig();
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("PushBase");
            if (!jSONObject.isNull("width") && !jSONObject.isNull("height")) {
                int i2 = jSONObject.getInt("width");
                int i3 = jSONObject.getInt("height");
                if (!(mixStreamConfig.getVideoWidth() == i2 && mixStreamConfig.getVideoHeight() == i3)) {
                    mixStreamConfig.setVideoSize(i2, i3);
                    z = true;
                    if (!jSONObject.isNull("defaultBitrate") && (i = jSONObject.getInt("defaultBitrate")) > 10000) {
                        mixStreamConfig.setVideoBitrate(i);
                    }
                    if (z && this.mConfig.getMixStreamType() == Config.MixStreamType.SERVER_MIX) {
                        this.mRtcEngine.stopLiveTranscoding();
                        this.liveTranscodingState = false;
                        this.mLogService.onEngineAPICall("disableLiveTranscoding", String.valueOf(this));
                        configMixTranscoding();
                        this.mLogService.onPublishStream(0);
                    }
                    invokeMixStream(true);
                }
            }
            z = false;
            try {
                mixStreamConfig.setVideoBitrate(i);
            } catch (Exception unused) {
            }
            this.mRtcEngine.stopLiveTranscoding();
            this.liveTranscodingState = false;
            this.mLogService.onEngineAPICall("disableLiveTranscoding", String.valueOf(this));
            configMixTranscoding();
            this.mLogService.onPublishStream(0);
        } catch (Exception unused2) {
        }
        invokeMixStream(true);
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client
    public void setCatchedVideoFrameCallback(final String str, final Client.ICatchedVideoFrameCallback iCatchedVideoFrameCallback) {
        this.mConfig.getHandler().post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.ClientExt.RunnableC858356 */

            static {
                Covode.recordClassIndex(100307);
            }

            public void run() {
                ClientExt.this.mVideoFrameCallback = iCatchedVideoFrameCallback;
                VideoSinkWrapper videoSinkWrapper = ClientExt.this.mVideoSinkMap.get(str);
                if (videoSinkWrapper != null) {
                    videoSinkWrapper.setNeedVideoFrameCallback();
                }
            }
        });
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client
    public void setFitMode(final String str, final boolean z) {
        this.mConfig.getHandler().post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.ClientExt.RunnableC858345 */

            static {
                Covode.recordClassIndex(100306);
            }

            public void run() {
                VideoSinkWrapper videoSinkWrapper = ClientExt.this.mVideoSinkMap.get(str);
                if (videoSinkWrapper != null) {
                    videoSinkWrapper.setFitMode(z);
                }
            }
        });
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client
    public void setOnlyConsumeRemoteSei(String str, boolean z) {
        VideoSinkWrapper videoSinkWrapper = this.mVideoSinkMap.get(str);
        if (videoSinkWrapper != null) {
            videoSinkWrapper.setOnlyNeedRemoteSei(z);
        }
    }

    private void sendSdkControlMsgInternal(String str, JSONObject jSONObject) {
        if (str.equalsIgnoreCase("switch_mix_type") && !jSONObject.isNull("mix_type")) {
            String string = jSONObject.getString("mix_type");
            if (string.equalsIgnoreCase("server")) {
                switchMixType(true);
            } else if (string.equalsIgnoreCase("client")) {
                switchMixType(false);
            }
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client
    public long sendUserMessage(String str, String str2) {
        AVLog.debugTrace(str, str2);
        this.mLogService.onEngineAPICall("sendUserMessage", this + ", interactId " + str + ", message " + str2);
        return this.mRtcEngine.sendUserMessage(str, str2);
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client
    public void setRemoteAudioPlaybackVolume(String str, float f) {
        this.mLogService.onEngineAPICall("setRemoteAudioPlaybackVolume", "interactId:" + str + ",volume:" + f);
        this.mRtcEngine.setRemoteAudioPlaybackVolume(str, (int) (f * 100.0f));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        r2 = r3.mVideoSinkMap.get(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void toggleVideoSinkRenderable(final java.lang.String r4, final boolean r5) {
        /*
            r3 = this;
            com.ss.avframework.livestreamv2.core.LiveCore$InteractConfig r0 = r3.mConfig
            boolean r0 = r0.isNeedToggleVideoSinkRenderable()
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            java.util.Map<java.lang.String, com.ss.avframework.livestreamv2.core.interact.ClientExt$VideoSinkWrapper> r0 = r3.mVideoSinkMap
            boolean r0 = r0.containsKey(r4)
            if (r0 == 0) goto L_0x0029
            java.util.Map<java.lang.String, com.ss.avframework.livestreamv2.core.interact.ClientExt$VideoSinkWrapper> r0 = r3.mVideoSinkMap
            java.lang.Object r2 = r0.get(r4)
            com.ss.avframework.livestreamv2.core.interact.ClientExt$VideoSinkWrapper r2 = (com.p2082ss.avframework.livestreamv2.core.interact.ClientExt.VideoSinkWrapper) r2
            if (r2 == 0) goto L_0x0029
            com.ss.avframework.livestreamv2.core.LiveCore$InteractConfig r0 = r3.mConfig
            android.os.Handler r1 = r0.getHandler()
            com.ss.avframework.livestreamv2.core.interact.ClientExt$7 r0 = new com.ss.avframework.livestreamv2.core.interact.ClientExt$7
            r0.<init>(r4, r5, r2)
            r1.post(r0)
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.avframework.livestreamv2.core.interact.ClientExt.toggleVideoSinkRenderable(java.lang.String, boolean):void");
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client
    public void updateAuthInfo(JSONObject jSONObject, Client.FrameType frameType) {
        if (jSONObject != null && frameType.ordinal() != 0 && this.mConfig.getMixStreamType() == Config.MixStreamType.SERVER_MIX) {
            try {
                if (this.authInfoCache == null) {
                    this.authInfoCache = jSONObject;
                }
                this.authInfoCache.put("dynamicLabel", "TTLive");
                this.authInfoCache.put("frameType", frameType.ordinal());
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (this.liveTranscodingState) {
                invalidateSei();
            }
        }
    }

    private void convertRegionsToLiveTranscoding(List<Region> list, LiveTranscoding liveTranscoding) {
        double d;
        int i;
        LiveTranscoding.Layout layout = liveTranscoding.getLayout();
        LiveTranscoding.Layout.Builder builder = new LiveTranscoding.Layout.Builder();
        builder.backgroundColor(layout.getBackgroundColor()).appData(layout.getAppData());
        for (Region region : list) {
            if (!TextUtils.isEmpty(region.getInteractId())) {
                String interactId = region.getInteractId();
                double x = region.getX();
                double y = region.getY();
                double width = region.getWidth();
                double height = region.getHeight();
                int zorder = region.getZorder();
                if (region.isMuteVideo()) {
                    d = 0.0d;
                } else {
                    d = 1.0d;
                }
                LiveTranscoding.Layout.Region initTranscodingUser = initTranscodingUser(interactId, x, y, width, height, zorder, d);
                if (region.isMuteAudio()) {
                    i = 2;
                } else {
                    i = 0;
                }
                initTranscodingUser.contentControl(i).renderMode(1);
                builder.addRegoin(initTranscodingUser);
            }
        }
        liveTranscoding.setLayout(builder.builder());
    }

    private AudioFormat generateAudioForamt(int i, int i2) {
        AudioSampleRate audioSampleRate;
        AudioChannel audioChannel = AudioChannel.AUDIO_CHANNEL_MONO;
        if (i == 1) {
            audioChannel = AudioChannel.AUDIO_CHANNEL_MONO;
        } else if (i == 2) {
            audioChannel = AudioChannel.AUDIO_CHANNEL_STEREO;
        }
        if (i2 == 8000) {
            audioSampleRate = AudioSampleRate.AUDIO_SAMPLE_RATE_8000;
        } else if (i2 == 16000) {
            audioSampleRate = AudioSampleRate.AUDIO_SAMPLE_RATE_16000;
        } else if (i2 == 32000) {
            audioSampleRate = AudioSampleRate.AUDIO_SAMPLE_RATE_32000;
        } else if (i2 == 44100) {
            audioSampleRate = AudioSampleRate.AUDIO_SAMPLE_RATE_44100;
        } else if (i2 != 48000) {
            audioSampleRate = AudioSampleRate.AUDIO_SAMPLE_RATE_44100;
            AVLog.ioe(TAG, "generateAudioForamt audio sample rate error samples:".concat(String.valueOf(i2)));
        } else {
            audioSampleRate = AudioSampleRate.AUDIO_SAMPLE_RATE_48000;
        }
        return new AudioFormat(audioSampleRate, audioChannel);
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client
    public void enableAllRemoteRender(boolean z, boolean z2) {
        MuteState muteState;
        MuteState muteState2;
        MuteState muteState3;
        if (z2) {
            this.mEnableRemoteAllRender = z;
            for (VideoSinkWrapper videoSinkWrapper : this.mVideoSinkMap.values()) {
                videoSinkWrapper.setRenderAble(z);
                videoSinkWrapper.setFirstRenderFrame();
            }
            LiveRTCEngine liveRTCEngine = this.mRtcEngine;
            if (z) {
                muteState3 = MuteState.MUTE_STATE_OFF;
            } else {
                muteState3 = MuteState.MUTE_STATE_ON;
            }
            liveRTCEngine.muteAllRemoteAudio(muteState3);
            muteAllRemoteAudioStreams(!z);
            return;
        }
        this.mEnableRemoteAllRender = z;
        for (VideoSinkWrapper videoSinkWrapper2 : this.mVideoSinkMap.values()) {
            videoSinkWrapper2.setRenderAble(z);
            videoSinkWrapper2.setFirstRenderFrame();
        }
        LiveRTCEngine liveRTCEngine2 = this.mRtcEngine;
        if (z) {
            muteState = MuteState.MUTE_STATE_OFF;
        } else {
            muteState = MuteState.MUTE_STATE_ON;
        }
        liveRTCEngine2.muteAllRemoteVideo(muteState);
        muteAllRemoteVideoStreams(!z);
        LiveRTCEngine liveRTCEngine3 = this.mRtcEngine;
        if (z) {
            muteState2 = MuteState.MUTE_STATE_OFF;
        } else {
            muteState2 = MuteState.MUTE_STATE_ON;
        }
        liveRTCEngine3.muteAllRemoteAudio(muteState2);
        muteAllRemoteAudioStreams(!z);
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client
    public void muteRemoteAudioStream(String str, boolean z) {
        MuteState muteState;
        AVLog.debugTrace(str, Boolean.valueOf(z));
        this.mLogService.onEngineAPICall("muteRemoteAudioStream", this + ", interactId " + str + ", mute " + z);
        LiveRTCEngine liveRTCEngine = this.mRtcEngine;
        if (z) {
            muteState = MuteState.MUTE_STATE_ON;
        } else {
            muteState = MuteState.MUTE_STATE_OFF;
        }
        liveRTCEngine.muteRemoteAudio(str, muteState);
        invokeMixStream(false);
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client
    public void muteRemoteVideoStream(String str, boolean z) {
        MuteState muteState;
        AVLog.debugTrace(str, Boolean.valueOf(z));
        toggleVideoSinkRenderable(str, !z);
        this.mLogService.onEngineAPICall("muteRemoteVideoStream", this + ", interactId " + str + ", mute " + z);
        LiveRTCEngine liveRTCEngine = this.mRtcEngine;
        if (z) {
            muteState = MuteState.MUTE_STATE_ON;
        } else {
            muteState = MuteState.MUTE_STATE_OFF;
        }
        liveRTCEngine.muteRemoteVideo(str, muteState);
        invokeMixStream(true);
    }

    public void recordGuestJoinAndLeave(String str, boolean z) {
        MethodCollector.m26663i(7210);
        AVLog.debugTrace(str, Boolean.valueOf(z));
        synchronized (this.mGuestList) {
            try {
                Iterator<String> it = this.mGuestList.iterator();
                while (it.hasNext()) {
                    if (it.next().equals(str)) {
                        it.remove();
                    }
                }
                if (z) {
                    this.mGuestList.add(str);
                }
            } finally {
                MethodCollector.m26664o(7210);
            }
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client
    public void setAudioFrameObserver(int i, int i2, Client.IAudioFrameObserver iAudioFrameObserver) {
        this.mLogService.onEngineAPICall("setAudioFrameObserver", this + ", samle rate " + i + ", channel count " + i2 + ", observer " + iAudioFrameObserver);
        this.mExternalAudioFrameObserver = iAudioFrameObserver;
        this.mOutSampleRate = i;
        this.mOutChannelCount = i2;
        setAudioFrameObserverInternal();
    }

    /* access modifiers changed from: protected */
    public void mixStream(final List<Region> list, final String str, final boolean z) {
        String str2;
        if (this.mConfig.getCharacter() != Config.Character.ANCHOR || this.mConfig.getMixStreamType() != Config.MixStreamType.SERVER_MIX || TextUtils.isEmpty(this.mConfig.getMixStreamConfig().getStreamUrl())) {
            return;
        }
        if (this.mConfig.getHandler() == null || Thread.currentThread() == this.mConfig.getHandler().getLooper().getThread()) {
            LiveTranscoding createLiveTranscoding = createLiveTranscoding(false);
            if (createLiveTranscoding != null) {
                AVLog.debugTrace(list, str);
                convertRegionsToLiveTranscoding(list, createLiveTranscoding);
                String str3 = TAG;
                if (str != null) {
                    str2 = str;
                } else {
                    str2 = "";
                }
                AVLog.m147807i(str3, str2);
                createLiveTranscoding.getLayout().setAppData(str);
                if (this.authInfoCache != null && !TextUtils.isEmpty(this.mConfig.getMixStreamConfig().getStreamUrl())) {
                    Matcher matcher = Pattern.compile("stream-[0-9]+([0-9]{5})").matcher(this.mConfig.getMixStreamConfig().getStreamUrl());
                    if (matcher.find()) {
                        try {
                            this.authInfoCache.put("streamName", matcher.group());
                            createLiveTranscoding.setAuthInfo(this.authInfoCache);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    this.authInfoCache = null;
                }
                this.mRtcEngine.updateLiveTranscoding(createLiveTranscoding);
                if (z) {
                    this.mLogService.onRtcUpdateLayout(convertMixStreamLayout(list));
                    return;
                }
                return;
            }
            return;
        }
        this.mConfig.getHandler().post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.ClientExt.RunnableC8581910 */

            static {
                Covode.recordClassIndex(100286);
            }

            public void run() {
                ClientExt.this.mixStream(list, str, z);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v5, resolved type: android.view.SurfaceView */
    /* JADX WARN: Multi-variable type inference failed */
    public void sendFirstRemoteVideoRenderMessage(String str, int i, int i2) {
        char c;
        TextureView textureView;
        Object obj;
        MethodCollector.m26663i(4842);
        if (this.mVideoSinkFactory != null) {
            VideoSinkWrapper videoSinkWrapper = this.mVideoSinkMap.get(str);
            if (videoSinkWrapper == null) {
                AVLog.ioe(TAG, "Consume user " + str + "'s buffer frame before he joins room.");
                MethodCollector.m26664o(4842);
                return;
            }
            if (this.mConfig.getViewType() == Config.ViewType.SURFACE_VIEW) {
                obj = videoSinkWrapper.getSurfaceView();
            } else if (this.mConfig.getViewType() == Config.ViewType.TEXTURE_VIEW) {
                obj = videoSinkWrapper.getTextureView();
            } else {
                obj = null;
            }
            if (!this.mSingleViewMode) {
                this.mInternalListener.onInfo(this, 14, 0, str, obj, Integer.valueOf(this.mInteractEngine.queryRtcId(str)), Integer.valueOf(i), Integer.valueOf(i2));
            } else {
                ILayerControl.ILayer renderLayer = videoSinkWrapper.getRenderLayer();
                this.mInternalListener.onInfo(this, 14, 1, str, renderLayer, Integer.valueOf(this.mInteractEngine.queryRtcId(str)), Integer.valueOf(i), Integer.valueOf(i2));
            }
            final JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("key", "rtc_first_remote_video_render_msg_sent");
                jSONObject.put("rtc_channel_id", this.mRtcExtInfo.channelId);
                jSONObject.put("timestamp", System.currentTimeMillis());
            } catch (Exception unused) {
            }
            this.mBuilder.getLogUploadThreadHandler().post(new Runnable() {
                /* class com.p2082ss.avframework.livestreamv2.core.interact.ClientExt.RunnableC858378 */

                static {
                    Covode.recordClassIndex(100309);
                }

                public void run() {
                    AVLog.logKibana(4, ClientExt.TAG, jSONObject.toString(), null);
                }
            });
            AVLog.ioi(TAG, "MSG_INFO_FIRST_REMOTE_VIDEO_RENDER: uid " + str + ", view " + obj + ", width " + i + ", height " + i2);
            MethodCollector.m26664o(4842);
            return;
        }
        if (this.mConfig.getViewType() == Config.ViewType.SURFACE_VIEW) {
            SurfaceView surfaceView = new SurfaceView(this.mConfig.getContext());
            c = 1;
            this.mRtcEngine.setRemoteVideoCanvas(str, StreamIndex.STREAM_INDEX_MAIN, new VideoCanvas(surfaceView, 1, str, false));
            textureView = surfaceView;
        } else {
            c = 1;
            TextureView textureView2 = new TextureView(this.mConfig.getContext());
            this.mRtcEngine.setRemoteVideoCanvas(str, StreamIndex.STREAM_INDEX_MAIN, new VideoCanvas(textureView2, 1, str, false));
            textureView = textureView2;
        }
        Client.Listener listener = this.mInternalListener;
        Object[] objArr = new Object[5];
        objArr[0] = str;
        objArr[c] = textureView;
        objArr[2] = Integer.valueOf(this.mInteractEngine.queryRtcId(str));
        objArr[3] = Integer.valueOf(i);
        objArr[4] = Integer.valueOf(i2);
        listener.onInfo(this, 14, 0, objArr);
        final JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("key", "rtc_first_remote_video_render_msg_sent");
            jSONObject2.put("rtc_channel_id", this.mRtcExtInfo.channelId);
            jSONObject2.put("timestamp", System.currentTimeMillis());
        } catch (Exception unused2) {
        }
        this.mBuilder.getLogUploadThreadHandler().post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.core.interact.ClientExt.RunnableC858389 */

            static {
                Covode.recordClassIndex(100310);
            }

            public void run() {
                AVLog.logKibana(4, ClientExt.TAG, jSONObject2.toString(), null);
            }
        });
        AVLog.ioi(TAG, "MSG_INFO_FIRST_REMOTE_VIDEO_RENDER with rtc render video internal: uid " + str + ", view " + textureView + ", width " + i + ", height " + i2);
        MethodCollector.m26664o(4842);
    }

    private LiveTranscoding.Layout.Region initTranscodingUser(String str, double d, double d2, double d3, double d4, int i, double d5) {
        LiveTranscoding.Layout.Region region = new LiveTranscoding.Layout.Region();
        region.uid(str).position(d, d2).size(d3, d4).zorder(i).alpha(d5);
        return region;
    }

    ClientExt(LiveRTCEngine liveRTCEngine, LiveCore.InteractConfig interactConfig, VideoClientFactory videoClientFactory, VideoSinkFactory videoSinkFactory, AudioClientFactory audioClientFactory, AudioSinkFactory audioSinkFactory, InteractEngine interactEngine) {
        AVLog.debugTrace(new Object[0]);
        AVLog.ioi(TAG, "<init> ".concat(String.valueOf(this)));
        this.mBuilder = interactEngine.getBuilder();
        this.disposed = false;
        this.stopped = false;
        this.mInteractEngine = interactEngine;
        this.mConfig = interactConfig;
        this.mRtcEngine = liveRTCEngine;
        liveRTCEngine.setRtcExtInfo(interactConfig.getRtcExtInfo());
        this.mRtcEngine.setRtcEngineEventHandler(this.mInternalRtcCallback);
        LiveRTCExtInfo rtcExtInfo = this.mRtcEngine.getRtcExtInfo();
        this.mRtcExtInfo = rtcExtInfo;
        this.mSelfInteractId = rtcExtInfo.interactId;
        this.mLogService = new InteractLogService(this.mRtcExtInfo, this.mConfig, new ClientExt$$Lambda$0(this), this.mBuilder.getLogUploadThreadHandler());
        this.mInteractStatics = new InteractStaticsImpl(this.mConfig.getContext(), this.mConfig);
        this.mVideoClientFactory = videoClientFactory;
        this.mAudioClientFactory = audioClientFactory;
        this.mVideoSinkFactory = videoSinkFactory;
        this.mAudioSinkFactory = audioSinkFactory;
        this.mSingleViewMode = this.mConfig.isSingleViewMode();
        if (this.mColorRange == -1) {
            if (interactEngine.getBuilder().getLiveCore() == null || interactEngine.getBuilder().getLiveCore().getBuilder() == null) {
                this.mColorRange = 0;
            } else if (interactEngine.getBuilder().getLiveCore().getBuilder().isVideoRangeInRTC()) {
                this.mColorRange = 1;
            } else {
                this.mColorRange = 0;
            }
        }
        this.mRemoteColorRange = new RemoteYuvColorRangeReporter();
    }
}
