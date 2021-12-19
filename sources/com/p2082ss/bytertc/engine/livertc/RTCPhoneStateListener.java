package com.p2082ss.bytertc.engine.livertc;

import android.content.ClipboardManager;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.bytertc.engine.data.AudioPlaybackDevice;
import com.p2082ss.bytertc.engine.data.MuteState;
import com.p2082ss.bytertc.engine.utils.LogUtil;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.bytertc.engine.livertc.RTCPhoneStateListener */
public class RTCPhoneStateListener extends PhoneStateListener {
    private Context applicationContext;
    private Boolean defaultRouter2Speaker;
    private Boolean forceEnableSpeaker;
    private boolean isSpeakerphoneOn;
    private LiveRTCEngine mEngine;
    private volatile MuteState mMuteAllRemoteAudio;
    private volatile MuteState mMuteLocalAudio;
    private AtomicInteger mOnPhoneCallCount = new AtomicInteger(0);

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.bytertc.engine.livertc.RTCPhoneStateListener$1 */
    public static /* synthetic */ class C860981 {
        static {
            Covode.recordClassIndex(101103);
        }
    }

    static {
        Covode.recordClassIndex(101101);
    }

    private void disableAudio() {
        this.mEngine.muteLocalAudio(MuteState.MUTE_STATE_ON);
        this.mEngine.muteAllRemoteAudio(MuteState.MUTE_STATE_ON);
    }

    private AudioManager getAudioManager() {
        return (AudioManager) m147875x8b203450(this.applicationContext, DataType.AUDIO);
    }

    private boolean isHeadsetOn() {
        AudioManager audioManager = getAudioManager();
        if (audioManager == null) {
            return false;
        }
        if (audioManager.isBluetoothScoOn() || audioManager.isWiredHeadsetOn()) {
            return true;
        }
        return false;
    }

    private void onCallStart() {
        if (this.mOnPhoneCallCount.getAndIncrement() == 0 && this.mEngine != null) {
            LogUtil.m147885d("RtcPhoneStateListener", "CustomPhoneStateListener onCallStateChanged StartCall");
            saveAudioState();
            disableAudio();
        }
    }

    private void onCallRinging() {
        LogUtil.m147885d("RtcPhoneStateListener", "CustomPhoneStateListener onCallStateChanged RING");
        if (this.mEngine != null && this.mOnPhoneCallCount.compareAndSet(0, 0) && !isHeadsetOn()) {
            this.isSpeakerphoneOn = this.mEngine.isSpeakerphoneEnabled();
        }
    }

    private void restoreAudioState() {
        this.mEngine.muteLocalAudio(this.mMuteLocalAudio);
        this.mEngine.muteAllRemoteAudio(this.mMuteAllRemoteAudio);
        LogUtil.m147888i("RtcPhoneStateListener", "restoreAudioState mMuteLocalAudio:" + this.mMuteLocalAudio + ", mMuteAllRemoteAudio:" + this.mMuteAllRemoteAudio);
    }

    private void saveAudioState() {
        this.mMuteLocalAudio = this.mEngine.getMuteLocalAudioStream();
        this.mMuteAllRemoteAudio = this.mEngine.getMuteRemoteAllAudioStreams();
        LogUtil.m147888i("RtcPhoneStateListener", "saveAudioState mMuteLocalAudio:" + this.mMuteLocalAudio + ", mMuteAllRemoteAudio:" + this.mMuteAllRemoteAudio);
    }

    private void onCallEnd() {
        boolean z;
        if (!this.mOnPhoneCallCount.compareAndSet(0, 0) && this.mOnPhoneCallCount.decrementAndGet() == 0 && this.mEngine != null) {
            LogUtil.m147885d("RtcPhoneStateListener", "CustomPhoneStateListener onCallStateChanged END");
            restoreAudioState();
            if (!isHeadsetOn()) {
                Boolean bool = this.forceEnableSpeaker;
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    Boolean bool2 = this.defaultRouter2Speaker;
                    if (bool2 != null) {
                        z = bool2.booleanValue();
                    } else {
                        z = this.isSpeakerphoneOn;
                    }
                }
                postDelay(new RTCPhoneStateListener$$Lambda$0(this, z), 1500);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.bytertc.engine.livertc.RTCPhoneStateListener$PhoneCallHandler */
    public static class PhoneCallHandler extends Handler {
        static {
            Covode.recordClassIndex(101104);
        }

        private PhoneCallHandler(Looper looper) {
            super(looper);
        }

        public void doExec(Runnable runnable) {
            post(runnable);
        }

        /* synthetic */ PhoneCallHandler(Looper looper, C860981 r2) {
            this(looper);
        }
    }

    public void setDefaultRouter2Speaker(boolean z) {
        this.defaultRouter2Speaker = Boolean.valueOf(z);
    }

    public void setSpeakerphoneOn(boolean z) {
        this.forceEnableSpeaker = Boolean.valueOf(z);
    }

    /* renamed from: com_ss_bytertc_engine_livertc_RTCPhoneStateListener_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext */
    public static Context m147876x12690e44(Context context) {
        Context applicationContext2 = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext2 == null) {
            return C58003a.f132199a;
        }
        return applicationContext2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$onCallEnd$0$RTCPhoneStateListener(boolean z) {
        AudioPlaybackDevice audioPlaybackDevice;
        LiveRTCEngine liveRTCEngine = this.mEngine;
        if (z) {
            audioPlaybackDevice = AudioPlaybackDevice.AUDIO_PLAYBACK_DEVICE_SPEAKERPHONE;
        } else {
            audioPlaybackDevice = AudioPlaybackDevice.AUDIO_PLAYBACK_DEVICE_EARPIECE;
        }
        liveRTCEngine.setAudioPlaybackDevice(audioPlaybackDevice);
    }

    public void onServiceStateChanged(ServiceState serviceState) {
        super.onServiceStateChanged(serviceState);
        LogUtil.m147885d("RtcPhoneStateListener", "CustomPhoneStateListener onServiceStateChanged: ".concat(String.valueOf(serviceState)));
    }

    public static Looper register(Runnable runnable) {
        Looper looper;
        if (Looper.myLooper() != null) {
            looper = Looper.myLooper();
        } else {
            looper = null;
        }
        if (Looper.getMainLooper() != null) {
            looper = Looper.getMainLooper();
        }
        if (looper == null) {
            return null;
        }
        new PhoneCallHandler(looper, null).doExec(runnable);
        return looper;
    }

    public RTCPhoneStateListener(Context context, LiveRTCEngine liveRTCEngine) {
        this.applicationContext = m147876x12690e44(context);
        this.mEngine = liveRTCEngine;
    }

    private static void postDelay(Runnable runnable, int i) {
        Looper looper;
        if (Looper.myLooper() != null) {
            looper = Looper.myLooper();
        } else {
            looper = null;
        }
        if (Looper.getMainLooper() != null) {
            looper = Looper.getMainLooper();
        }
        if (looper != null) {
            new PhoneCallHandler(looper, null).postDelayed(runnable, (long) i);
        }
    }

    public void onCallStateChanged(int i, String str) {
        LogUtil.m147886e("RtcPhoneStateListener", "CustomPhoneStateListener state: " + i + " incomingNumber: " + str);
        if (i == 0) {
            onCallEnd();
        } else if (i == 1) {
            onCallRinging();
        } else if (i == 2) {
            onCallStart();
        }
    }

    /* renamed from: com_ss_bytertc_engine_livertc_RTCPhoneStateListener_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService */
    public static Object m147875x8b203450(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(316);
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
                    MethodCollector.m26664o(316);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
