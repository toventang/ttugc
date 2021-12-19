package com.p2082ss.avframework.engine;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;
import com.p2082ss.avframework.effect.VideoEffectUtilsWrapper;
import com.p2082ss.avframework.utils.AVLog;
import com.p2082ss.avframework.utils.EarlyAVLog;
import com.p2082ss.avframework.utils.JniCommon;
import com.p2082ss.avframework.utils.LibraryLoader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.avframework.engine.MediaEngineFactory */
public class MediaEngineFactory {
    private static List<String> librarylist;
    private long mNativeObj;

    private static native int nativeCheckLicense(String str);

    private native long nativeCreateAudioTrack(long j, AudioSource audioSource, String str);

    private native long nativeCreateMediaEncodeStream(long j, VideoEncoderFactory videoEncoderFactory, AudioEncoderFactory audioEncoderFactory, Transport transport);

    private native long nativeCreateVideoTrack(long j, VideoSource videoSource, String str);

    private static native long nativeGetMediaEngineFactory();

    private static native String nativeGetVersion();

    private static native void nativeSetupClassLoader();

    public static List<String> getLibrarylist() {
        return librarylist;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        super.finalize();
    }

    public static String getVersion() {
        MethodCollector.m26663i(2233);
        String nativeGetVersion = nativeGetVersion();
        MethodCollector.m26664o(2233);
        return nativeGetVersion;
    }

    public static void loadLibrary() {
        MethodCollector.m26663i(2237);
        nativeSetupClassLoader();
        MethodCollector.m26664o(2237);
    }

    public static MediaEngineFactory create() {
        MediaEngineFactory mediaEngineFactory;
        MethodCollector.m26663i(2241);
        long nativeGetMediaEngineFactory = nativeGetMediaEngineFactory();
        if (nativeGetMediaEngineFactory != 0) {
            mediaEngineFactory = new MediaEngineFactory(nativeGetMediaEngineFactory);
        } else {
            mediaEngineFactory = null;
        }
        MethodCollector.m26664o(2241);
        return mediaEngineFactory;
    }

    public synchronized void release() {
        MethodCollector.m26663i(4047);
        long j = this.mNativeObj;
        if (j != 0) {
            JniCommon.nativeReleaseRef(j);
            this.mNativeObj = 0;
        }
        MethodCollector.m26664o(4047);
    }

    static {
        Covode.recordClassIndex(99971);
        List asList = Arrays.asList("c++_shared", "aaudio", "ttcrypto", "bytenn", "yuv", "fdk-aac", "bytevc0", "bytevc1enc", "iesapplogger", "ttboringssl", "lens", "ttffmpeg", "ttquic", "IESSaliency");
        ArrayList arrayList = new ArrayList();
        librarylist = arrayList;
        arrayList.addAll(asList);
        librarylist.add("audioeffect");
        librarylist.add("byteaudio");
        List<String> effectLibs = VideoEffectUtilsWrapper.getEffectLibs();
        if (effectLibs != null && !effectLibs.isEmpty()) {
            int size = effectLibs.size();
            for (int i = 0; i < size; i++) {
                if (!librarylist.contains(effectLibs.get(i))) {
                    librarylist.add(effectLibs.get(i));
                }
            }
        }
        librarylist.add("avframework");
        for (String str : librarylist) {
            if (str.equals("byteaudio")) {
                try {
                    m147773x4ade7935("byteaudio");
                } catch (Throwable unused) {
                }
            }
            if (!loadLibrary(str)) {
                try {
                    m147773x4ade7935(str);
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public static void setLogLevel(int i) {
        AVLog.setLevel(i);
    }

    protected MediaEngineFactory(long j) {
        this.mNativeObj = j;
    }

    public AudioTrack createAudioTrack(AudioSource audioSource) {
        return createAudioTrack(audioSource, null);
    }

    public VideoTrack createVideoTrack(VideoSource videoSource) {
        return createVideoTrack(videoSource, null);
    }

    public static int checkLicense(String str) {
        MethodCollector.m26663i(2182);
        int nativeCheckLicense = nativeCheckLicense(str);
        MethodCollector.m26664o(2182);
        return nativeCheckLicense;
    }

    /* renamed from: com_ss_avframework_engine_MediaEngineFactory_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary */
    public static void m147773x4ade7935(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.m38964a(str, false, (Context) null);
        C58032m.m104852a(uptimeMillis, str);
    }

    private static boolean loadLibrary(String str) {
        try {
            boolean loadLibrary = LibraryLoader.loadLibrary(str);
            EarlyAVLog.println(5, "MediaEngineFactory", "Loading library lib" + str + ".so done (" + loadLibrary + ")", null);
            return loadLibrary;
        } catch (Throwable th) {
            EarlyAVLog.println(5, "MediaEngineFactory", "Loading library lib" + str + ".so error (" + th.getMessage() + ")", th);
            return false;
        }
    }

    public AudioTrack createAudioTrack(AudioSource audioSource, String str) {
        AudioTrack audioTrack;
        MethodCollector.m26663i(3870);
        long nativeCreateAudioTrack = nativeCreateAudioTrack(this.mNativeObj, audioSource, str);
        if (nativeCreateAudioTrack != 0) {
            audioTrack = new AudioTrack(nativeCreateAudioTrack, audioSource);
        } else {
            audioTrack = null;
        }
        MethodCollector.m26664o(3870);
        return audioTrack;
    }

    public VideoTrack createVideoTrack(VideoSource videoSource, String str) {
        VideoTrack videoTrack;
        MethodCollector.m26663i(3866);
        long nativeCreateVideoTrack = nativeCreateVideoTrack(this.mNativeObj, videoSource, str);
        if (nativeCreateVideoTrack != 0) {
            videoTrack = new VideoTrack(nativeCreateVideoTrack, videoSource);
        } else {
            videoTrack = null;
        }
        MethodCollector.m26664o(3866);
        return videoTrack;
    }

    public MediaEncodeStream createMediaEncodeStream(VideoEncoderFactory videoEncoderFactory, AudioEncoderFactory audioEncoderFactory, Transport transport) {
        MediaEncodeStream mediaEncodeStream;
        MethodCollector.m26663i(3998);
        long nativeCreateMediaEncodeStream = nativeCreateMediaEncodeStream(this.mNativeObj, videoEncoderFactory, audioEncoderFactory, transport);
        if (nativeCreateMediaEncodeStream != 0) {
            mediaEncodeStream = new MediaEncodeStream(nativeCreateMediaEncodeStream, transport);
        } else {
            mediaEncodeStream = null;
        }
        if (!(transport == null || mediaEncodeStream == null)) {
            transport.setVysncModule(new VsyncModule(mediaEncodeStream.nativeGetVsyncModule(nativeCreateMediaEncodeStream)));
        }
        MethodCollector.m26664o(3998);
        return mediaEncodeStream;
    }
}
