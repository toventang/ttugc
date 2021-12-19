package com.bytedance.bae.webrtc;

import android.content.ClipboardManager;
import android.content.Context;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.bae.base.BaeLogging;
import com.bytedance.bae.base.ContextUtils;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Field;

public class WebRtcAudioManager {
    private static boolean blacklistDeviceForOpenSLESUsage;
    private static boolean blacklistDeviceForOpenSLESUsageIsOverridden;
    private static boolean useStereoInput;
    private static boolean useStereoOutput;
    private boolean aAudio;
    private final AudioManager audioManager = ((AudioManager) m23647xf95a7a83(ContextUtils.getApplicationContext(), DataType.AUDIO));
    private boolean hardwareAEC;
    private boolean hardwareAGC;
    private boolean hardwareNS;
    private boolean initialized;
    private int inputBufferSize;
    private int inputChannels;
    private boolean lowLatencyInput;
    private boolean lowLatencyOutput;
    private long nativeAudioManager;
    private int nativeChannels;
    private int nativeSampleRate;
    private int outputBufferSize;
    private int outputChannels;
    private int preferAudioLayer;
    private boolean proAudio;
    private int sampleRate;

    static {
        Covode.recordClassIndex(15076);
    }

    private int getPreferAudioLayer() {
        return 0;
    }

    private native void nativeCacheAudioParameters(int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i4, int i5, int i6, long j);

    private native void nativeOnHardwareEarbackSupported(boolean z, long j);

    static final class NativeAudioLayer {
        static {
            Covode.recordClassIndex(15077);
        }

        private NativeAudioLayer() {
        }
    }

    private static boolean isAcousticEchoCancelerSupported() {
        return WebRtcAudioEffects.canUseAcousticEchoCanceler();
    }

    private static boolean isNoiseSuppressorSupported() {
        return WebRtcAudioEffects.canUseNoiseSuppressor();
    }

    private boolean isPermissionGranted() {
        return WebRtcAudioUtils.isPermissionGranted();
    }

    private boolean isWiredHeadsetOn() {
        return this.audioManager.isWiredHeadsetOn();
    }

    private int getLowLatencyInputFramesPerBuffer() {
        assertTrue(isLowLatencyInputSupported());
        return getLowLatencyOutputFramesPerBuffer();
    }

    private boolean hasEarpiece() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    private boolean isAAudioSupported() {
        BaeLogging.m23630w("WebRtcAudioManager", "AAudio support is currently disabled on all devices!");
        return false;
    }

    private boolean isCommunicationModeEnabled() {
        if (this.audioManager.getMode() == 3) {
            return true;
        }
        return false;
    }

    private boolean isLowLatencyOutputSupported() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
    }

    public boolean isLowLatencyInputSupported() {
        if (Build.VERSION.SDK_INT < 21 || !isLowLatencyOutputSupported()) {
            return false;
        }
        return true;
    }

    private int getLowLatencyOutputFramesPerBuffer() {
        assertTrue(isLowLatencyOutputSupported());
        int i = Build.VERSION.SDK_INT;
        String property = this.audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
        if (property == null) {
            return 256;
        }
        return Integer.parseInt(property);
    }

    private int getMode() {
        try {
            return this.audioManager.getMode();
        } catch (Exception e) {
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            BaeLogging.m23626e("WebRtcAudioManager", stringWriter.toString());
            return -1;
        }
    }

    private int getSampleRateForApiLevel() {
        int i = Build.VERSION.SDK_INT;
        String property = this.audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        if (property == null) {
            return WebRtcAudioUtils.getDefaultSampleRateHz();
        }
        return Integer.parseInt(property);
    }

    public static synchronized boolean getStereoInput() {
        boolean z;
        synchronized (WebRtcAudioManager.class) {
            MethodCollector.m26663i(203);
            z = useStereoInput;
            MethodCollector.m26664o(203);
        }
        return z;
    }

    public static synchronized boolean getStereoOutput() {
        boolean z;
        synchronized (WebRtcAudioManager.class) {
            MethodCollector.m26663i(182);
            z = useStereoOutput;
            MethodCollector.m26664o(182);
        }
        return z;
    }

    private void invalidNativeAudioManager() {
        MethodCollector.m26663i(232);
        synchronized (this) {
            try {
                this.nativeAudioManager = 0;
            } finally {
                MethodCollector.m26664o(232);
            }
        }
    }

    private boolean isOpenSLESRecordShouldUseVoiceRecognition() {
        if (!Build.BRAND.equals("samsung") || Build.VERSION.SDK_INT < 21) {
            return false;
        }
        return true;
    }

    private boolean isProAudioSupported() {
        if (Build.VERSION.SDK_INT < 23 || !ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.audio.pro")) {
            return false;
        }
        return true;
    }

    private int getFixedDeviceRecordVolume() {
        try {
            if (this.audioManager.isMicrophoneMute()) {
                return 0;
            }
            return 100;
        } catch (Exception e) {
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            BaeLogging.m23626e("WebRtcAudioManager", stringWriter.toString());
            return -1;
        }
    }

    private boolean init() {
        BaeLogging.m23628i("WebRtcAudioManager", "init" + WebRtcAudioUtils.getThreadInfo());
        if (this.initialized) {
            return true;
        }
        BaeLogging.m23628i("WebRtcAudioManager", "audio mode is: " + WebRtcAudioUtils.modeToString(this.audioManager.getMode()));
        this.initialized = true;
        return true;
    }

    private boolean isDeviceBlacklistedForOpenSLESUsage() {
        boolean deviceIsBlacklistedForOpenSLESUsage;
        if (blacklistDeviceForOpenSLESUsageIsOverridden) {
            deviceIsBlacklistedForOpenSLESUsage = blacklistDeviceForOpenSLESUsage;
        } else {
            deviceIsBlacklistedForOpenSLESUsage = WebRtcAudioUtils.deviceIsBlacklistedForOpenSLESUsage();
        }
        if (deviceIsBlacklistedForOpenSLESUsage) {
            BaeLogging.m23628i("WebRtcAudioManager", Build.MODEL + " is blacklisted for OpenSL ES usage!");
        }
        return deviceIsBlacklistedForOpenSLESUsage;
    }

    private int getFixedDevicePlayVolume() {
        try {
            int mode = this.audioManager.getMode();
            int i = 2;
            if (mode != 0) {
                if (mode != 1) {
                    if (mode == 2 || mode == 3) {
                        i = 0;
                    }
                }
                double streamVolume = (double) this.audioManager.getStreamVolume(i);
                Double.isNaN(streamVolume);
                double streamMaxVolume = (double) this.audioManager.getStreamMaxVolume(i);
                Double.isNaN(streamMaxVolume);
                return (int) ((streamVolume * 100.0d) / streamMaxVolume);
            }
            i = 3;
            double streamVolume2 = (double) this.audioManager.getStreamVolume(i);
            Double.isNaN(streamVolume2);
            double streamMaxVolume2 = (double) this.audioManager.getStreamMaxVolume(i);
            Double.isNaN(streamMaxVolume2);
            return (int) ((streamVolume2 * 100.0d) / streamMaxVolume2);
        } catch (Exception e) {
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            BaeLogging.m23626e("WebRtcAudioManager", stringWriter.toString());
            return -1;
        }
    }

    private int getNativeOutputSampleRate() {
        if (WebRtcAudioUtils.runningOnEmulator()) {
            BaeLogging.m23628i("WebRtcAudioManager", "Running emulator, overriding sample rate to 8 kHz.");
            return 8000;
        } else if (WebRtcAudioUtils.isDefaultSampleRateOverridden()) {
            BaeLogging.m23628i("WebRtcAudioManager", "Default sample rate is overriden to " + WebRtcAudioUtils.getDefaultSampleRateHz() + " Hz");
            return WebRtcAudioUtils.getDefaultSampleRateHz();
        } else {
            int defaultSampleRateHz = WebRtcAudioUtils.getDefaultSampleRateHz();
            BaeLogging.m23628i("WebRtcAudioManager", "Sample rate is set to " + defaultSampleRateHz + " Hz");
            return defaultSampleRateHz;
        }
    }

    private void storeAudioParameters() {
        int i;
        int minOutputFrameSize;
        int minInputFrameSize;
        int i2 = 2;
        if (getStereoOutput()) {
            i = 2;
        } else {
            i = 1;
        }
        this.outputChannels = i;
        if (!getStereoInput()) {
            i2 = 1;
        }
        this.inputChannels = i2;
        this.sampleRate = getNativeOutputSampleRate();
        this.hardwareAEC = isAcousticEchoCancelerSupported();
        this.hardwareAGC = false;
        this.hardwareNS = isNoiseSuppressorSupported();
        this.lowLatencyOutput = isLowLatencyOutputSupported();
        this.lowLatencyInput = isLowLatencyInputSupported();
        this.proAudio = isProAudioSupported();
        this.aAudio = isAAudioSupported();
        if (this.lowLatencyOutput) {
            minOutputFrameSize = getLowLatencyOutputFramesPerBuffer();
        } else {
            minOutputFrameSize = getMinOutputFrameSize(this.sampleRate, this.outputChannels);
        }
        this.outputBufferSize = minOutputFrameSize;
        if (this.lowLatencyInput) {
            minInputFrameSize = getLowLatencyInputFramesPerBuffer();
        } else {
            minInputFrameSize = getMinInputFrameSize(this.sampleRate, this.inputChannels);
        }
        this.inputBufferSize = minInputFrameSize;
        this.preferAudioLayer = getPreferAudioLayer();
    }

    private String getAudioDeviceInfo() {
        try {
            return "{ Audio State: audio mode: " + WebRtcAudioUtils.modeToString(this.audioManager.getMode()) + ", has mic: " + WebRtcAudioUtils.hasMicrophone() + ", mic muted: " + this.audioManager.isMicrophoneMute() + ", music active: " + this.audioManager.isMusicActive() + ", speakerphone: " + this.audioManager.isSpeakerphoneOn() + ", headset: " + this.audioManager.isWiredHeadsetOn() + "BT SCO: " + this.audioManager.isBluetoothScoOn() + "music actived: " + this.audioManager.isMusicActive() + "permission: " + WebRtcAudioUtils.isPermissionGranted() + " bt_sco_available_off_call: " + this.audioManager.isBluetoothScoAvailableOffCall() + " }";
        } catch (Exception e) {
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            BaeLogging.m23626e("WebRtcAudioManager", stringWriter.toString());
            return stringWriter.toString();
        }
    }

    private int SetAudioMode(int i) {
        try {
            this.audioManager.setMode(i);
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    private static void assertTrue(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    public static synchronized void setBlacklistDeviceForOpenSLESUsage(boolean z) {
        synchronized (WebRtcAudioManager.class) {
            MethodCollector.m26663i(154);
            blacklistDeviceForOpenSLESUsageIsOverridden = true;
            blacklistDeviceForOpenSLESUsage = z;
            MethodCollector.m26664o(154);
        }
    }

    public static synchronized void setStereoInput(boolean z) {
        synchronized (WebRtcAudioManager.class) {
            MethodCollector.m26663i(166);
            BaeLogging.m23630w("WebRtcAudioManager", "Overriding default input behavior: setStereoInput(" + z + ')');
            useStereoInput = z;
            MethodCollector.m26664o(166);
        }
    }

    public static synchronized void setStereoOutput(boolean z) {
        synchronized (WebRtcAudioManager.class) {
            MethodCollector.m26663i(162);
            BaeLogging.m23630w("WebRtcAudioManager", "Overriding default output behavior: setStereoOutput(" + z + ')');
            useStereoOutput = z;
            MethodCollector.m26664o(162);
        }
    }

    WebRtcAudioManager(long j) {
        MethodCollector.m26663i(216);
        BaeLogging.m23628i("WebRtcAudioManager", "ctor" + WebRtcAudioUtils.getThreadInfo());
        this.nativeAudioManager = j;
        storeAudioParameters();
        nativeCacheAudioParameters(this.sampleRate, this.outputChannels, this.inputChannels, this.hardwareAEC, this.hardwareAGC, this.hardwareNS, this.lowLatencyOutput, this.lowLatencyInput, this.proAudio, this.aAudio, this.outputBufferSize, this.inputBufferSize, this.preferAudioLayer, j);
        WebRtcAudioUtils.logAudioState("WebRtcAudioManager");
        MethodCollector.m26664o(216);
    }

    private static int getMinOutputFrameSize(int i, int i2) {
        int i3;
        int i4 = i2 * 2;
        if (i2 == 1) {
            i3 = 4;
        } else {
            i3 = 12;
        }
        return AudioTrack.getMinBufferSize(i, i3, 2) / i4;
    }

    private static int getMinInputFrameSize(int i, int i2) {
        int i3;
        int i4 = i2 * 2;
        if (i2 == 1) {
            i3 = 16;
        } else {
            i3 = 12;
        }
        return AudioRecord.getMinBufferSize(i, i3, 2) / i4;
    }

    /* renamed from: com_bytedance_bae_webrtc_WebRtcAudioManager_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService */
    public static Object m23647xf95a7a83(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(228);
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
                    MethodCollector.m26664o(228);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
