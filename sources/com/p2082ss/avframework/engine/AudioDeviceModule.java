package com.p2082ss.avframework.engine;

import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.avframework.capture.audio.AudioCapturer;
import com.p2082ss.avframework.mixer.AudioMixer;
import com.p2082ss.avframework.utils.AVLog;
import com.p2082ss.avframework.utils.TEBundle;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.avframework.engine.AudioDeviceModule */
public class AudioDeviceModule extends NativeObject {
    private static String ADM_HARDWARE_AUDIOEFFECT_TABLE = "";
    private static AudioManager sAudioManager;
    private boolean aecAutoSwitch;
    private int mAdmType;
    private AudioMixer mAudioMixer;
    private int mBGMMode;
    public WeakReference<AudioCapturer.AudioCaptureObserver> mCaptureObserver;
    private Context mContext;
    private boolean mEnableAecOnHeadset;
    private WeakReference<AudioCapturer> mExtAudioCapture;
    public Handler mHandler;
    private boolean mHeadSetStat;
    public boolean mHeadSetStatWithVoip;
    public float mMicVolume;
    public NativeADMObserver mObserver;
    private final TEBundle mParam;
    private HeadsetPlugReceiver mReceiver;
    public boolean mRelease;
    public boolean mStatusBluetoothIsConnected;
    public boolean mStatusHeadSetIsConnected;
    public boolean mStatusIsVoIPMode;

    /* renamed from: com.ss.avframework.engine.AudioDeviceModule$Observer */
    public interface Observer {
        static {
            Covode.recordClassIndex(99958);
        }

        void onADMInfo(int i, int i2, long j);
    }

    private native void nativeAddAudioSink(int i, AudioSink audioSink);

    private native void nativeClearLogState();

    private native long nativeCreate(AudioPlayer audioPlayer, AudioCapturer audioCapturer, Context context, IntBuffer intBuffer);

    private native long nativeCreateRenderSink();

    private native void nativeDisableLocalAudioStream(boolean z);

    private native void nativeEnableBuiltInAEC(boolean z);

    private native void nativeEnableBuiltInAGC(boolean z);

    private native void nativeEnableBuiltInNS(boolean z);

    private native void nativeEnableEchoMode(boolean z);

    private native float nativeGetMicVolumedB();

    private native double nativeGetOption(int i);

    private native TEBundle nativeGetParameter();

    private native long nativeGetRenderMixer();

    private native String nativeGetReportStats();

    private native boolean nativeIsDisableLocalAudioStream();

    private native boolean nativeIsEchoMode();

    private native boolean nativeIsEnableBuiltInAEC();

    private native boolean nativeIsEnableBuiltInAGC();

    private native boolean nativeIsEnableBuiltInNS();

    private native boolean nativeIsExternalRecording();

    private native boolean nativeIsPlayer();

    private native boolean nativeIsRecoding();

    private native boolean nativeIsResumeStatus();

    private native boolean nativeIsSeperateRecordingCallback();

    private native boolean nativeIsVoIPMode();

    private native void nativeRegisterObserver(Observer observer);

    private native void nativeRemoveAudioSink(int i, AudioSink audioSink);

    public static native long nativeRenderDelayMs(long j);

    public static native void nativeRenderSinkData(long j, Buffer buffer, int i, int i2, int i3, long j2);

    public static native void nativeRenderSinkEnableAgc(long j, boolean z, boolean z2);

    public static native double nativeRenderSinkGetOption(long j, int i);

    public static native long nativeRenderSinkGetQuirks(long j);

    public static native boolean nativeRenderSinkIsMute(long j);

    public static native void nativeRenderSinkRelease(long j);

    public static native void nativeRenderSinkSetMute(long j, boolean z);

    public static native void nativeRenderSinkSetQuirks(long j, long j2);

    public static native void nativeRenderSinkSetVolume(long j, float f);

    public static native int nativeRenderSinkTrackId(long j);

    public static native boolean nativeRenderSinkisEnableAgc(long j);

    public static native void nativeSetAudioLoudNormParam(long j, float f);

    private native void nativeSetAudioProcessor(AudioProcessor audioProcessor);

    private native void nativeSetAudioScenario(int i);

    public static native int nativeSetAudioTrack(long j, AudioTrack audioTrack);

    private native void nativeSetExternalRecording(boolean z);

    private native void nativeSetParameter(TEBundle tEBundle);

    private native void nativeSetRecordingCallback(AudioSink audioSink);

    private native void nativeSetTuningName(Object obj);

    private native void nativeSetTuningType(int i, Object obj);

    private native void nativeUpdateOriginTrackIndex(int i);

    private native void nativesetHeadSetStat(boolean z);

    public native void nativeInitEarMonitor();

    public native boolean nativeIsMicMute();

    public native boolean nativeIsSupportHardwareEarMonitor();

    public native int nativeMicVolume(float f, boolean z);

    public native void nativeRelease();

    public native void nativeResetRecordingPlayer(int i);

    public native void nativeResumeStatus(boolean z);

    public native int nativeStartPlayer();

    public native int nativeStartRecording();

    public native int nativeStopPlayer();

    public native int nativeStopRecording();

    public native void nativeSwitchToVoIP(boolean z);

    public void setTuningName(String str) {
    }

    public int getAdmType() {
        return this.mAdmType;
    }

    public boolean isBluetoothConnected() {
        return this.mStatusBluetoothIsConnected;
    }

    public boolean isHeadSet() {
        return this.mHeadSetStat;
    }

    /* renamed from: com.ss.avframework.engine.AudioDeviceModule$InteralAudioMixer */
    class InteralAudioMixer extends AudioMixer {
        static {
            Covode.recordClassIndex(99955);
        }

        @Override // com.p2082ss.avframework.mixer.Mixer
        public void setOriginTrackIndex(int i) {
        }

        @Override // com.p2082ss.avframework.mixer.Mixer
        public boolean enable() {
            return super.enable();
        }

        @Override // com.p2082ss.avframework.mixer.Mixer
        public void setEnable(boolean z) {
            super.setEnable(z);
            AudioDeviceModule.this.mObserver.onADMInfo(4, enable() ? 1 : 0, 0);
        }

        public InteralAudioMixer(long j) {
            super(j);
        }
    }

    public long getCaptureDelayMs() {
        return (long) getOption(5);
    }

    public float getMicVolumedB() {
        return (float) getOption(3);
    }

    public long getPlayerDelayMs() {
        return (long) getOption(4);
    }

    /* renamed from: com.ss.avframework.engine.AudioDeviceModule$AudioRenderSink */
    public static class AudioRenderSink extends AudioSink {
        private final Handler mWorkHandler;

        static {
            Covode.recordClassIndex(99951);
        }

        @Override // com.p2082ss.avframework.engine.AudioSink
        public void onNoData() {
        }

        public long getQuirks() {
            MethodCollector.m26663i(2364);
            long nativeRenderSinkGetQuirks = AudioDeviceModule.nativeRenderSinkGetQuirks(this.mNativeObj);
            MethodCollector.m26664o(2364);
            return nativeRenderSinkGetQuirks;
        }

        public long getRenderDelayMs() {
            MethodCollector.m26663i(2343);
            long nativeRenderDelayMs = AudioDeviceModule.nativeRenderDelayMs(this.mNativeObj);
            MethodCollector.m26664o(2343);
            return nativeRenderDelayMs;
        }

        public int getRenderTrackId() {
            MethodCollector.m26663i(2337);
            int nativeRenderSinkTrackId = AudioDeviceModule.nativeRenderSinkTrackId(this.mNativeObj);
            MethodCollector.m26664o(2337);
            return nativeRenderSinkTrackId;
        }

        public boolean isEnableAGC() {
            MethodCollector.m26663i(2349);
            boolean nativeRenderSinkisEnableAgc = AudioDeviceModule.nativeRenderSinkisEnableAgc(this.mNativeObj);
            MethodCollector.m26664o(2349);
            return nativeRenderSinkisEnableAgc;
        }

        public boolean isMute() {
            MethodCollector.m26663i(2329);
            boolean nativeRenderSinkIsMute = AudioDeviceModule.nativeRenderSinkIsMute(this.mNativeObj);
            MethodCollector.m26664o(2329);
            return nativeRenderSinkIsMute;
        }

        @Override // com.p2082ss.avframework.engine.NativeObject
        public synchronized void release() {
            MethodCollector.m26663i(3851);
            Handler handler = this.mWorkHandler;
            if (handler != null) {
                handler.post(new Runnable() {
                    /* class com.p2082ss.avframework.engine.AudioDeviceModule.AudioRenderSink.RunnableC856912 */

                    static {
                        Covode.recordClassIndex(99953);
                    }

                    public void run() {
                        MethodCollector.m26663i(2098);
                        AudioDeviceModule.nativeRenderSinkRelease(AudioRenderSink.this.mNativeObj);
                        AudioRenderSink.this.setNativeObj(0);
                        MethodCollector.m26664o(2098);
                    }
                });
                MethodCollector.m26664o(3851);
                return;
            }
            AudioDeviceModule.nativeRenderSinkRelease(this.mNativeObj);
            setNativeObj(0);
            MethodCollector.m26664o(3851);
        }

        public AudioRenderSink(long j) {
            this(j, null);
        }

        public double getOption(int i) {
            MethodCollector.m26663i(2333);
            double nativeRenderSinkGetOption = AudioDeviceModule.nativeRenderSinkGetOption(this.mNativeObj, i);
            MethodCollector.m26664o(2333);
            return nativeRenderSinkGetOption;
        }

        public void setAudioLoudNormParam(float f) {
            MethodCollector.m26663i(3806);
            AudioDeviceModule.nativeSetAudioLoudNormParam(this.mNativeObj, f);
            MethodCollector.m26664o(3806);
        }

        public void setAudioTrack(AudioTrack audioTrack) {
            MethodCollector.m26663i(2366);
            AudioDeviceModule.nativeSetAudioTrack(this.mNativeObj, audioTrack);
            MethodCollector.m26664o(2366);
        }

        public void setMute(boolean z) {
            MethodCollector.m26663i(2331);
            AudioDeviceModule.nativeRenderSinkSetMute(this.mNativeObj, z);
            MethodCollector.m26664o(2331);
        }

        public void setQuirks(long j) {
            MethodCollector.m26663i(2361);
            AudioDeviceModule.nativeRenderSinkSetQuirks(this.mNativeObj, j);
            MethodCollector.m26664o(2361);
        }

        public void setVolume(final float f) {
            MethodCollector.m26663i(2327);
            Handler handler = this.mWorkHandler;
            if (handler != null) {
                handler.post(new Runnable() {
                    /* class com.p2082ss.avframework.engine.AudioDeviceModule.AudioRenderSink.RunnableC856901 */

                    static {
                        Covode.recordClassIndex(99952);
                    }

                    public void run() {
                        MethodCollector.m26663i(2159);
                        AudioDeviceModule.nativeRenderSinkSetVolume(AudioRenderSink.this.mNativeObj, f);
                        MethodCollector.m26664o(2159);
                    }
                });
                MethodCollector.m26664o(2327);
                return;
            }
            AudioDeviceModule.nativeRenderSinkSetVolume(this.mNativeObj, f);
            MethodCollector.m26664o(2327);
        }

        public AudioRenderSink(long j, Handler handler) {
            setNativeObj(j);
            this.mWorkHandler = handler;
        }

        public void setEnableAGC(boolean z, boolean z2) {
            MethodCollector.m26663i(2345);
            AudioDeviceModule.nativeRenderSinkEnableAgc(this.mNativeObj, z, z2);
            MethodCollector.m26664o(2345);
        }

        @Override // com.p2082ss.avframework.engine.AudioSink
        public void onData(Buffer buffer, int i, int i2, int i3, long j) {
            MethodCollector.m26663i(2357);
            AudioDeviceModule.nativeRenderSinkData(this.mNativeObj, buffer, i, i2, i3, j);
            MethodCollector.m26664o(2357);
        }
    }

    static {
        Covode.recordClassIndex(99937);
    }

    public static int getMode() {
        AudioManager audioManager = sAudioManager;
        if (audioManager != null) {
            return audioManager.getMode();
        }
        return 0;
    }

    public static boolean isMicMute() {
        AudioManager audioManager = sAudioManager;
        if (audioManager != null) {
            return audioManager.isMicrophoneMute();
        }
        return true;
    }

    public static boolean isSpeakerphoneOn() {
        AudioManager audioManager = sAudioManager;
        if (audioManager != null) {
            return audioManager.isSpeakerphoneOn();
        }
        return false;
    }

    public void clearLogState() {
        MethodCollector.m26663i(4794);
        nativeClearLogState();
        MethodCollector.m26664o(4794);
    }

    public boolean isDisableLocalAudioStream() {
        MethodCollector.m26663i(4485);
        boolean nativeIsDisableLocalAudioStream = nativeIsDisableLocalAudioStream();
        MethodCollector.m26664o(4485);
        return nativeIsDisableLocalAudioStream;
    }

    public boolean isEchoMode() {
        MethodCollector.m26663i(4450);
        boolean nativeIsEchoMode = nativeIsEchoMode();
        MethodCollector.m26664o(4450);
        return nativeIsEchoMode;
    }

    public boolean isEnableBuiltInAEC() {
        MethodCollector.m26663i(3025);
        boolean nativeIsEnableBuiltInAEC = nativeIsEnableBuiltInAEC();
        MethodCollector.m26664o(3025);
        return nativeIsEnableBuiltInAEC;
    }

    public boolean isEnableBuiltInAGC() {
        MethodCollector.m26663i(4289);
        boolean nativeIsEnableBuiltInAGC = nativeIsEnableBuiltInAGC();
        MethodCollector.m26664o(4289);
        return nativeIsEnableBuiltInAGC;
    }

    public boolean isEnableBuiltInNS() {
        MethodCollector.m26663i(4288);
        boolean nativeIsEnableBuiltInNS = nativeIsEnableBuiltInNS();
        MethodCollector.m26664o(4288);
        return nativeIsEnableBuiltInNS;
    }

    public boolean isExternalRecording() {
        MethodCollector.m26663i(4683);
        boolean nativeIsExternalRecording = nativeIsExternalRecording();
        MethodCollector.m26664o(4683);
        return nativeIsExternalRecording;
    }

    public boolean isMute() {
        MethodCollector.m26663i(2965);
        boolean nativeIsMicMute = nativeIsMicMute();
        MethodCollector.m26664o(2965);
        return nativeIsMicMute;
    }

    public boolean isPlayer() {
        MethodCollector.m26663i(4496);
        boolean nativeIsPlayer = nativeIsPlayer();
        MethodCollector.m26664o(4496);
        return nativeIsPlayer;
    }

    public boolean isRecording() {
        MethodCollector.m26663i(4497);
        boolean nativeIsRecoding = nativeIsRecoding();
        MethodCollector.m26664o(4497);
        return nativeIsRecoding;
    }

    public boolean isSeperateRecordingCallback() {
        MethodCollector.m26663i(4708);
        boolean nativeIsSeperateRecordingCallback = nativeIsSeperateRecordingCallback();
        MethodCollector.m26664o(4708);
        return nativeIsSeperateRecordingCallback;
    }

    public boolean isVoIPMode() {
        MethodCollector.m26663i(3156);
        boolean nativeIsVoIPMode = nativeIsVoIPMode();
        MethodCollector.m26664o(3156);
        return nativeIsVoIPMode;
    }

    public void pause() {
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.engine.AudioDeviceModule.RunnableC8568012 */

            static {
                Covode.recordClassIndex(99941);
            }

            public void run() {
                MethodCollector.m26663i(2234);
                AudioDeviceModule.this.nativeResumeStatus(false);
                MethodCollector.m26664o(2234);
            }
        });
    }

    public void resume() {
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.engine.AudioDeviceModule.RunnableC8568113 */

            static {
                Covode.recordClassIndex(99942);
            }

            public void run() {
                MethodCollector.m26663i(2160);
                AudioDeviceModule.this.nativeResumeStatus(true);
                MethodCollector.m26664o(2160);
            }
        });
    }

    public int startPlayer() {
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.engine.AudioDeviceModule.RunnableC856888 */

            static {
                Covode.recordClassIndex(99949);
            }

            public void run() {
                MethodCollector.m26663i(1836);
                AudioDeviceModule.this.nativeStartPlayer();
                MethodCollector.m26664o(1836);
            }
        });
        return 0;
    }

    public int startRecording() {
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.engine.AudioDeviceModule.RunnableC856877 */

            static {
                Covode.recordClassIndex(99948);
            }

            public void run() {
                AudioCapturer.AudioCaptureObserver audioCaptureObserver;
                MethodCollector.m26663i(2072);
                int nativeStartRecording = AudioDeviceModule.this.nativeStartRecording();
                if (!(nativeStartRecording == 0 || (audioCaptureObserver = AudioDeviceModule.this.mCaptureObserver.get()) == null)) {
                    audioCaptureObserver.onAudioCaptureError(nativeStartRecording, new Exception("ADM start recording failed: ".concat(String.valueOf(nativeStartRecording))));
                }
                MethodCollector.m26664o(2072);
            }
        });
        return 0;
    }

    public int stopPlayer() {
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.engine.AudioDeviceModule.RunnableC8567810 */

            static {
                Covode.recordClassIndex(99939);
            }

            public void run() {
                MethodCollector.m26663i(2756);
                if (!AudioDeviceModule.this.mRelease) {
                    AudioDeviceModule.this.nativeStopPlayer();
                }
                MethodCollector.m26664o(2756);
            }
        });
        return 0;
    }

    public int stopRecording() {
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.engine.AudioDeviceModule.RunnableC856899 */

            static {
                Covode.recordClassIndex(99950);
            }

            public void run() {
                MethodCollector.m26663i(2194);
                if (!AudioDeviceModule.this.mRelease) {
                    AudioDeviceModule.this.nativeStopRecording();
                }
                MethodCollector.m26664o(2194);
            }
        });
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.avframework.engine.AudioDeviceModule$NativeADMObserver */
    public class NativeADMObserver extends NativeObject implements Observer {
        private Observer mObserver;

        static {
            Covode.recordClassIndex(99956);
        }

        @Override // com.p2082ss.avframework.engine.NativeObject
        public synchronized void release() {
            MethodCollector.m26663i(2892);
            this.mObserver = null;
            super.release();
            MethodCollector.m26664o(2892);
        }

        public void registerObserver(Observer observer) {
            this.mObserver = observer;
        }

        public NativeADMObserver(Observer observer) {
            this.mObserver = observer;
        }

        @Override // com.p2082ss.avframework.engine.AudioDeviceModule.Observer
        public void onADMInfo(int i, final int i2, long j) {
            AVLog.m147805d("AudioDeviceModule", "AudioDeviceModule.java onADMInfo " + i + " " + i2 + " " + j);
            Observer observer = this.mObserver;
            if (observer != null) {
                observer.onADMInfo(i, i2, j);
            }
            if (i == 8) {
                int mode = AudioDeviceModule.getMode();
                if (mode == 3 || mode == 2) {
                    AudioDeviceModule.this.mStatusIsVoIPMode = true;
                } else {
                    AudioDeviceModule.this.mStatusIsVoIPMode = false;
                }
                AudioDeviceModule.this.audioRouteChanged();
            } else if (i == 9 && AudioDeviceModule.this.mHandler != null) {
                AudioDeviceModule.this.mHandler.postDelayed(new Runnable() {
                    /* class com.p2082ss.avframework.engine.AudioDeviceModule.NativeADMObserver.RunnableC856921 */

                    static {
                        Covode.recordClassIndex(99957);
                    }

                    public void run() {
                        MethodCollector.m26663i(2027);
                        AudioDeviceModule.this.nativeResetRecordingPlayer(i2);
                        MethodCollector.m26664o(2027);
                    }
                }, 200);
            }
        }
    }

    public void audioRouteChanged() {
        Handler handler = this.mHandler;
        if (handler == null || !handler.post(new Runnable() {
            /* class com.p2082ss.avframework.engine.AudioDeviceModule.RunnableC856771 */

            static {
                Covode.recordClassIndex(99938);
            }

            public void run() {
                AudioDeviceModule.this.onAudioRouteChanged();
            }
        })) {
            onAudioRouteChanged();
        }
    }

    public AudioRenderSink createRenderSink() {
        MethodCollector.m26663i(3147);
        AudioRenderSink audioRenderSink = new AudioRenderSink(nativeCreateRenderSink(), this.mHandler);
        MethodCollector.m26664o(3147);
        return audioRenderSink;
    }

    public TEBundle getParameter() {
        MethodCollector.m26663i(4474);
        TEBundle nativeGetParameter = nativeGetParameter();
        synchronized (this.mParam) {
            try {
                this.mParam.updateFrom(nativeGetParameter);
            } finally {
                MethodCollector.m26664o(4474);
            }
        }
        return nativeGetParameter;
    }

    public synchronized AudioMixer getRenderMixer() {
        AudioMixer audioMixer;
        MethodCollector.m26663i(3150);
        if (this.mAudioMixer == null) {
            this.mAudioMixer = new InteralAudioMixer(nativeGetRenderMixer());
        }
        audioMixer = this.mAudioMixer;
        MethodCollector.m26664o(3150);
        return audioMixer;
    }

    public void setupHeadsetListener() {
        if (this.mContext != null && this.mReceiver == null) {
            this.mReceiver = new HeadsetPlugReceiver();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.HEADSET_PLUG");
            intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
            intentFilter.addAction("android.media.AUDIO_BECOMING_NOISY");
            m147772xda74a832(this.mContext, this.mReceiver, intentFilter);
        }
    }

    public void onAudioRouteChanged() {
        AudioManager audioManager = sAudioManager;
        if (audioManager != null) {
            boolean z = this.mStatusIsVoIPMode;
            boolean z2 = this.mStatusBluetoothIsConnected;
            boolean z3 = this.mStatusHeadSetIsConnected;
            AVLog.iod("AudioDeviceModule", "onAudioRouteChanged voip " + z + " bluetooth " + z2 + " headset " + z3);
            if (!z) {
                changeToSpeaker(audioManager);
            } else if (z3) {
                changeToHeadset(audioManager);
            } else if (z2) {
                changeToBluetooth(audioManager);
            } else {
                changeToSpeaker(audioManager);
            }
        }
    }

    public JSONObject getReportJsonStats() {
        boolean z;
        String str;
        String str2;
        MethodCollector.m26663i(4596);
        String nativeGetReportStats = nativeGetReportStats();
        int admType = getAdmType();
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(nativeGetReportStats)) {
                try {
                    jSONObject = new JSONObject(nativeGetReportStats);
                } catch (JSONException unused) {
                    jSONObject.put("adm_native_exp_error", nativeGetReportStats);
                }
            }
            jSONObject.put("adm_type", admType);
            jSONObject.put("bluetooth", this.mStatusBluetoothIsConnected);
            jSONObject.put("headset", this.mStatusHeadSetIsConnected);
            jSONObject.put("is_mute", nativeIsMicMute());
            jSONObject.put("aec_enable", isEnableBuiltInAEC());
            if (!nativeIsResumeStatus()) {
                z = true;
            } else {
                z = false;
            }
            jSONObject.put("is_paused", z);
            jSONObject.put("mic_volume", (double) this.mMicVolume);
            if (admType == 0) {
                try {
                    jSONObject.put("voip", this.mStatusIsVoIPMode);
                    synchronized (this.mParam) {
                        try {
                            if (this.mParam.contains("adm_recording_type")) {
                                str = this.mParam.getString("adm_recording_type");
                            } else {
                                str = "opensles";
                            }
                            if (this.mParam.contains("adm_player_type")) {
                                str2 = this.mParam.getString("adm_player_type");
                            } else {
                                str2 = "opensles";
                            }
                            jSONObject.put("adm_recording_type", str);
                            jSONObject.put("adm_player_type", str2);
                        } finally {
                            MethodCollector.m26664o(4596);
                        }
                    }
                } catch (JSONException unused2) {
                    MethodCollector.m26664o(4596);
                    return jSONObject;
                }
            }
            return jSONObject;
        } catch (JSONException unused3) {
            MethodCollector.m26664o(4596);
            return jSONObject;
        }
    }

    @Override // com.p2082ss.avframework.engine.NativeObject
    public synchronized void release() {
        HeadsetPlugReceiver headsetPlugReceiver;
        MethodCollector.m26663i(4626);
        Handler handler = this.mHandler;
        if (handler == null || handler.getLooper().getThread() == Thread.currentThread()) {
            AVLog.ioi("AudioDeviceModule", "release ADM ".concat(String.valueOf(this)));
        } else {
            AVLog.logToIODevice(4, "AudioDeviceModule", "release ADM " + this + " on thread \"" + Thread.currentThread().getName() + "\", handler's thread is \"" + this.mHandler.getLooper().getThread().getName() + "\", stack: ", new Throwable());
        }
        AudioMixer audioMixer = this.mAudioMixer;
        if (audioMixer != null) {
            audioMixer.release();
            this.mAudioMixer = null;
        }
        nativeRegisterObserver(null);
        boolean post = this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.engine.AudioDeviceModule.RunnableC8567911 */

            static {
                Covode.recordClassIndex(99940);
            }

            public void run() {
                MethodCollector.m26663i(2359);
                AudioDeviceModule.this.nativeRelease();
                AudioDeviceModule.this.setNativeObj(0);
                MethodCollector.m26664o(2359);
            }
        });
        Context context = this.mContext;
        if (!(context == null || (headsetPlugReceiver = this.mReceiver) == null)) {
            context.unregisterReceiver(headsetPlugReceiver);
            this.mContext = null;
            this.mReceiver = null;
        }
        NativeADMObserver nativeADMObserver = this.mObserver;
        if (nativeADMObserver != null) {
            nativeADMObserver.release();
            this.mObserver = null;
        }
        if (!post) {
            nativeRelease();
            setNativeObj(0);
        }
        this.mParam.release();
        this.mRelease = true;
        MethodCollector.m26664o(4626);
    }

    public void enableAecOnHeadSetMode(boolean z) {
        this.mEnableAecOnHeadset = z;
    }

    public void enableEchoMode(boolean z) {
        enableEchoModeInternal(z);
    }

    /* renamed from: com.ss.avframework.engine.AudioDeviceModule$HeadsetPlugReceiver */
    class HeadsetPlugReceiver extends BroadcastReceiver {
        static {
            Covode.recordClassIndex(99954);
        }

        private HeadsetPlugReceiver() {
        }

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            AVLog.iod("AudioDeviceModule", "action:".concat(String.valueOf(action)));
            if (action.equals("android.intent.action.HEADSET_PLUG")) {
                int intExtra = intent.getIntExtra("state", 0);
                if (intExtra == 0) {
                    AudioDeviceModule.this.mStatusHeadSetIsConnected = false;
                    AudioDeviceModule.this.setHeadSetStat(false);
                } else if (intExtra == 1) {
                    AudioDeviceModule.this.mStatusHeadSetIsConnected = true;
                    AudioDeviceModule.this.setHeadSetStat(true);
                }
            } else if (action.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) {
                AudioDeviceModule.this.updateBluetoothIndication(intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0));
                AudioDeviceModule audioDeviceModule = AudioDeviceModule.this;
                audioDeviceModule.setBluetoothStat(audioDeviceModule.mStatusBluetoothIsConnected);
            } else {
                "android.media.AUDIO_BECOMING_NOISY".equals(action);
            }
            AudioDeviceModule.this.audioRouteChanged();
        }
    }

    public static void setSpeakerphoneOn(boolean z) {
        AudioManager audioManager = sAudioManager;
        if (audioManager != null) {
            try {
                audioManager.setSpeakerphoneOn(z);
            } catch (Throwable unused) {
            }
        }
    }

    public void setAudioCaptureObserver(AudioCapturer.AudioCaptureObserver audioCaptureObserver) {
        this.mCaptureObserver = new WeakReference<>(audioCaptureObserver);
    }

    private void changeToBluetooth(AudioManager audioManager) {
        try {
            audioManager.startBluetoothSco();
        } catch (Throwable unused) {
        }
        try {
            audioManager.setBluetoothScoOn(true);
        } catch (Throwable unused2) {
        }
        setSpeakerphoneOn(false);
    }

    private void changeToHeadset(AudioManager audioManager) {
        try {
            audioManager.stopBluetoothSco();
        } catch (Throwable unused) {
        }
        try {
            audioManager.setBluetoothScoOn(false);
        } catch (Throwable unused2) {
        }
        setSpeakerphoneOn(false);
    }

    private void changeToSpeaker(AudioManager audioManager) {
        try {
            audioManager.stopBluetoothSco();
        } catch (Throwable unused) {
        }
        try {
            audioManager.setBluetoothScoOn(false);
        } catch (Throwable unused2) {
        }
        setSpeakerphoneOn(true);
    }

    private void updateOriginTrackIndex(int i) {
        MethodCollector.m26663i(3158);
        nativeUpdateOriginTrackIndex(i);
        MethodCollector.m26664o(3158);
    }

    public void disableLocalAudioStream(boolean z) {
        MethodCollector.m26663i(4484);
        nativeDisableLocalAudioStream(z);
        MethodCollector.m26664o(4484);
    }

    public void enableAecAutoSwitch(boolean z) {
        this.aecAutoSwitch = z;
        if (z) {
            enableAEC(false);
        }
    }

    public void enableBuiltInAEC(boolean z) {
        if (!this.aecAutoSwitch) {
            enableAEC(z);
        }
    }

    public double getOption(int i) {
        MethodCollector.m26663i(4690);
        double nativeGetOption = nativeGetOption(i);
        MethodCollector.m26664o(4690);
        return nativeGetOption;
    }

    public void setAudioProcessor(AudioProcessor audioProcessor) {
        MethodCollector.m26663i(4699);
        nativeSetAudioProcessor(audioProcessor);
        MethodCollector.m26664o(4699);
    }

    public void setExternalRecording(boolean z) {
        MethodCollector.m26663i(4678);
        nativeSetExternalRecording(z);
        MethodCollector.m26664o(4678);
    }

    public void setRecordingCallack(AudioSink audioSink) {
        MethodCollector.m26663i(4585);
        nativeSetRecordingCallback(audioSink);
        MethodCollector.m26664o(4585);
    }

    public void switchToVoIP(final boolean z) {
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.engine.AudioDeviceModule.RunnableC856866 */

            static {
                Covode.recordClassIndex(99947);
            }

            public void run() {
                MethodCollector.m26663i(2302);
                AudioDeviceModule.this.mHeadSetStatWithVoip = z;
                if ((AudioDeviceModule.this.isHeadSet() || AudioDeviceModule.this.isBluetoothConnected()) && z) {
                    AVLog.iod("AudioDeviceModule", "Head set stat " + AudioDeviceModule.this.isHeadSet() + " bluetooth " + AudioDeviceModule.this.isBluetoothConnected() + " and ignore switch to voip mode.");
                    MethodCollector.m26664o(2302);
                    return;
                }
                AudioDeviceModule.this.nativeSwitchToVoIP(z);
                MethodCollector.m26664o(2302);
            }
        });
    }

    private void enableAEC(boolean z) {
        MethodCollector.m26663i(3009);
        nativeEnableBuiltInAEC(z);
        NativeADMObserver nativeADMObserver = this.mObserver;
        if (nativeADMObserver != null) {
            nativeADMObserver.onADMInfo(2, isEnableBuiltInAEC() ? 1 : 0, 0);
        }
        MethodCollector.m26664o(3009);
    }

    public static boolean isValidAdmApiType(String str) {
        if (str == null || str.equalsIgnoreCase("opensles") || str.equalsIgnoreCase("aaudio") || str.equalsIgnoreCase("audiorecord")) {
            return true;
        }
        return false;
    }

    public static void setMode(int i) {
        AVLog.iod("AudioDeviceModule", "Setup mode ".concat(String.valueOf(i)));
        AudioManager audioManager = sAudioManager;
        if (audioManager != null) {
            audioManager.setMode(i);
        }
    }

    public void enableBuiltInAGC(boolean z) {
        MethodCollector.m26663i(4287);
        nativeEnableBuiltInAGC(z);
        this.mObserver.onADMInfo(6, isEnableBuiltInAGC() ? 1 : 0, 0);
        MethodCollector.m26664o(4287);
    }

    public void enableBuiltInNS(boolean z) {
        MethodCollector.m26663i(4282);
        nativeEnableBuiltInNS(z);
        this.mObserver.onADMInfo(7, isEnableBuiltInNS() ? 1 : 0, 0);
        MethodCollector.m26664o(4282);
    }

    public void setAecInHeadSetStatState(boolean z) {
        MethodCollector.m26663i(2125);
        isEnableBuiltInAEC();
        if (this.aecAutoSwitch && z) {
            enableAEC(false);
        }
        nativesetHeadSetStat(z);
        MethodCollector.m26664o(2125);
    }

    public void setAudioScenario(int i) {
        MethodCollector.m26663i(2971);
        if (i == 0 || i == 1 || i == 2 || i == 3) {
            nativeSetAudioScenario(i);
        }
        MethodCollector.m26664o(2971);
    }

    public void updateBluetoothIndication(int i) {
        AVLog.iod("AudioDeviceModule", "updateBluetoothIndication:".concat(String.valueOf(i)));
        if (i == 2) {
            this.mStatusBluetoothIsConnected = true;
        } else {
            this.mStatusBluetoothIsConnected = false;
        }
    }

    private void enableEchoModeInternal(boolean z) {
        MethodCollector.m26663i(3797);
        if (this.aecAutoSwitch && z && isEnableBuiltInAEC()) {
            enableAEC(false);
        }
        nativeEnableEchoMode(z);
        this.mObserver.onADMInfo(3, isEchoMode() ? 1 : 0, 0);
        MethodCollector.m26664o(3797);
    }

    private void initAudioRouteStatus(AudioManager audioManager) {
        boolean z;
        boolean z2 = false;
        if (audioManager.isBluetoothScoOn() || audioManager.isBluetoothA2dpOn()) {
            z = true;
        } else {
            z = false;
        }
        this.mStatusBluetoothIsConnected = z;
        if (audioManager.getMode() == 2 || audioManager.getMode() == 3) {
            z2 = true;
        }
        this.mStatusIsVoIPMode = z2;
        try {
            this.mStatusHeadSetIsConnected = audioManager.isWiredHeadsetOn();
        } catch (Throwable unused) {
        }
    }

    public void setBluetoothStat(final boolean z) {
        if (!this.mEnableAecOnHeadset) {
            enableAEC(!z);
        }
        AVLog.iod("AudioDeviceModule", "Bluetooth status " + z + " enable aec on bluetooth mode " + this.mEnableAecOnHeadset);
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.engine.AudioDeviceModule.RunnableC856833 */

            static {
                Covode.recordClassIndex(99944);
            }

            public void run() {
                MethodCollector.m26663i(2627);
                AudioDeviceModule.this.setAecInHeadSetStatState(z);
                if (z) {
                    if (AudioDeviceModule.this.mHeadSetStatWithVoip) {
                        AudioDeviceModule.this.nativeSwitchToVoIP(false);
                        MethodCollector.m26664o(2627);
                        return;
                    }
                } else if (AudioDeviceModule.this.mHeadSetStatWithVoip && !AudioDeviceModule.this.isHeadSet()) {
                    AudioDeviceModule.this.nativeSwitchToVoIP(true);
                }
                MethodCollector.m26664o(2627);
            }
        });
    }

    public void setHeadSetStat(final boolean z) {
        this.mHeadSetStat = z;
        if (!this.mEnableAecOnHeadset) {
            enableAEC(!z);
        }
        AVLog.iod("AudioDeviceModule", "Heat set status " + this.mHeadSetStat + " enable aec on headset mode " + this.mEnableAecOnHeadset);
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.engine.AudioDeviceModule.RunnableC856822 */

            static {
                Covode.recordClassIndex(99943);
            }

            public void run() {
                MethodCollector.m26663i(2424);
                AudioDeviceModule.this.setAecInHeadSetStatState(z);
                if (z) {
                    if (AudioDeviceModule.this.mHeadSetStatWithVoip) {
                        AudioDeviceModule.this.nativeSwitchToVoIP(false);
                        MethodCollector.m26664o(2424);
                        return;
                    }
                } else if (AudioDeviceModule.this.mHeadSetStatWithVoip && !AudioDeviceModule.this.isBluetoothConnected()) {
                    AudioDeviceModule.this.nativeSwitchToVoIP(true);
                }
                MethodCollector.m26664o(2424);
            }
        });
    }

    public void setParameter(TEBundle tEBundle) {
        MethodCollector.m26663i(4468);
        if (tEBundle == null) {
            MethodCollector.m26664o(4468);
            return;
        }
        nativeSetParameter(tEBundle);
        synchronized (this.mParam) {
            try {
                this.mParam.updateFrom(tEBundle);
            } finally {
                MethodCollector.m26664o(4468);
            }
        }
    }

    public void setMicMute(final boolean z) {
        MethodCollector.m26663i(2864);
        AVLog.iod("AudioDeviceModule", "setMicMute(" + z + ")");
        Handler handler = this.mHandler;
        if (handler == null || handler.getLooper().getThread() == Thread.currentThread()) {
            nativeMicVolume(this.mMicVolume, z);
            MethodCollector.m26664o(2864);
            return;
        }
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.engine.AudioDeviceModule.RunnableC856855 */

            static {
                Covode.recordClassIndex(99946);
            }

            public void run() {
                MethodCollector.m26663i(4984);
                AudioDeviceModule audioDeviceModule = AudioDeviceModule.this;
                audioDeviceModule.nativeMicVolume(audioDeviceModule.mMicVolume, z);
                MethodCollector.m26664o(4984);
            }
        });
        MethodCollector.m26664o(2864);
    }

    public void setMicVolume(final float f) {
        MethodCollector.m26663i(2147);
        AudioCapturer audioCapturer = this.mExtAudioCapture.get();
        if (audioCapturer == null || audioCapturer.isMute()) {
            this.mMicVolume = f;
            Handler handler = this.mHandler;
            if (handler == null || handler.getLooper().getThread() == Thread.currentThread()) {
                nativeMicVolume(f, nativeIsMicMute());
                MethodCollector.m26664o(2147);
                return;
            }
            this.mHandler.post(new Runnable() {
                /* class com.p2082ss.avframework.engine.AudioDeviceModule.RunnableC856844 */

                static {
                    Covode.recordClassIndex(99945);
                }

                public void run() {
                    MethodCollector.m26663i(1985);
                    AudioDeviceModule audioDeviceModule = AudioDeviceModule.this;
                    audioDeviceModule.nativeMicVolume(f, audioDeviceModule.nativeIsMicMute());
                    MethodCollector.m26664o(1985);
                }
            });
            MethodCollector.m26664o(2147);
            return;
        }
        audioCapturer.setVolume((double) f);
        MethodCollector.m26664o(2147);
    }

    public void addAudioSink(int i, AudioSink audioSink) {
        MethodCollector.m26663i(4723);
        nativeAddAudioSink(i, audioSink);
        MethodCollector.m26664o(4723);
    }

    public void removeAudioSink(int i, AudioSink audioSink) {
        MethodCollector.m26663i(4729);
        nativeRemoveAudioSink(i, audioSink);
        MethodCollector.m26664o(4729);
    }

    public void setTuningType(int i, String str) {
        MethodCollector.m26663i(2112);
        nativeSetTuningType(i, str);
        MethodCollector.m26664o(2112);
    }

    public void setExternalRecording(boolean z, AudioCapturer audioCapturer) {
        setExternalRecording(z);
        if (audioCapturer != null) {
            this.mExtAudioCapture = new WeakReference<>(audioCapturer);
        }
    }

    /* renamed from: com_ss_avframework_engine_AudioDeviceModule_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService */
    public static Object m147771x3c59fa0a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(2527);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(2527);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public AudioDeviceModule(Observer observer, Context context, Handler handler) {
        this(observer, context, handler, 0);
    }

    /* renamed from: com_ss_avframework_engine_AudioDeviceModule_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver */
    public static Intent m147770x22a4424e(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r0 != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        r2 = move-exception;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        com.bytedance.p890c.p891a.p892a.p893a.C13468b.m24211a(r2, "Register Receiver Exception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        return com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r0 = r2.getMessage();
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r0 != null) goto L_0x0018;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
    /* renamed from: com_ss_avframework_engine_AudioDeviceModule_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent m147772xda74a832(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
            com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
            android.content.Intent r0 = m147770x22a4424e(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
            return r0
        L_0x000c:
            android.content.Intent r0 = com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
            return r0
        L_0x0011:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L_0x0027
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "regist too many Broadcast Receivers"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            throw r2
        L_0x0026:
            r2 = move-exception
        L_0x0027:
            java.lang.String r0 = "Register Receiver Exception"
            com.bytedance.p890c.p891a.p892a.p893a.C13468b.m24211a(r2, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.avframework.engine.AudioDeviceModule.m147772xda74a832(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }

    public AudioDeviceModule(AudioCapturer audioCapturer, Observer observer, Context context, Handler handler) {
        this(null, audioCapturer, observer, context, handler, 0);
    }

    public AudioDeviceModule(Observer observer, Context context, Handler handler, int i) {
        this(null, null, observer, context, handler, i);
    }

    public AudioDeviceModule(AudioPlayer audioPlayer, AudioCapturer audioCapturer, Observer observer, Context context, Handler handler) {
        this(audioPlayer, audioCapturer, observer, context, handler, 0);
    }

    public AudioDeviceModule(AudioPlayer audioPlayer, AudioCapturer audioCapturer, Observer observer, Context context, Handler handler, int i) {
        MethodCollector.m26663i(2476);
        this.mParam = new TEBundle();
        this.mEnableAecOnHeadset = false;
        AudioManager audioManager = null;
        this.mCaptureObserver = new WeakReference<>(null);
        this.mMicVolume = 1.0f;
        this.mBGMMode = -2;
        this.mAdmType = 0;
        this.mStatusBluetoothIsConnected = false;
        this.mStatusHeadSetIsConnected = false;
        this.mStatusIsVoIPMode = false;
        this.aecAutoSwitch = false;
        IntBuffer asIntBuffer = ByteBuffer.allocateDirect(4).order(ByteOrder.nativeOrder()).asIntBuffer();
        asIntBuffer.put(i);
        asIntBuffer.position(0);
        setNativeObj(nativeCreate(audioPlayer, audioCapturer, context, asIntBuffer));
        this.mHandler = handler;
        this.mContext = context;
        this.mAdmType = asIntBuffer.get();
        AVLog.m147809w("AudioDeviceModule", "AdmType: " + this.mAdmType);
        AVLog.iow("AudioDeviceModule", "AdmType: " + this.mAdmType);
        if (this.mHandler == null) {
            this.mHandler = new Handler(Looper.getMainLooper());
        }
        this.mExtAudioCapture = new WeakReference<>(null);
        if (audioPlayer == null) {
            if (!(this.mAdmType == 1 || context == null)) {
                audioManager = (AudioManager) m147771x3c59fa0a(context, DataType.AUDIO);
            }
            sAudioManager = audioManager;
            if (audioManager != null) {
                initAudioRouteStatus(audioManager);
            }
            NativeADMObserver nativeADMObserver = new NativeADMObserver(observer);
            this.mObserver = nativeADMObserver;
            nativeRegisterObserver(nativeADMObserver);
            updateOriginTrackIndex(-10);
            MethodCollector.m26664o(2476);
            return;
        }
        AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("to support at later version");
        MethodCollector.m26664o(2476);
        throw androidRuntimeException;
    }
}
