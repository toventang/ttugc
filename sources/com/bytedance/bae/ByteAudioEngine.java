package com.bytedance.bae;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;
import java.util.ArrayList;
import java.util.List;

public class ByteAudioEngine extends IByteAudioEngine {
    private static Boolean sIsLibraryLoaded = false;
    private List<ByteAudioEventHandlerProxy> eventHandlerList = new ArrayList();
    private long nativeEnginePtr;

    public void release() {
    }

    static {
        Covode.recordClassIndex(14976);
    }

    public ByteAudioEngine() {
        MethodCollector.m26663i(2806);
        if (!sIsLibraryLoaded.booleanValue()) {
            try {
                m23624x6c0245a("byteaudio");
                sIsLibraryLoaded = true;
            } catch (UnsatisfiedLinkError unused) {
            }
        }
        this.nativeEnginePtr = ByteAudioNativeFunctions.nativeGetInstance();
        MethodCollector.m26664o(2806);
    }

    public static void setLibraryLoaded(boolean z) {
        sIsLibraryLoaded = Boolean.valueOf(z);
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public int releaseAuxStream(ByteAudioAuxStream byteAudioAuxStream) {
        byteAudioAuxStream.releaseStream();
        return -1;
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public int releaseInputStream(ByteAudioInputStream byteAudioInputStream) {
        byteAudioInputStream.releaseStream();
        return -1;
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public int releaseOutputStream(ByteAudioOutputStream byteAudioOutputStream) {
        byteAudioOutputStream.releaseStream();
        return -1;
    }

    /* renamed from: com_bytedance_bae_ByteAudioEngine_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary */
    public static void m23624x6c0245a(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.m38964a(str, false, (Context) null);
        C58032m.m104852a(uptimeMillis, str);
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public int adjustHeadsetMonitorVolume(int i) {
        MethodCollector.m26663i(2910);
        long j = this.nativeEnginePtr;
        if (j != 0) {
            int nativeAdjustHeadsetMonitorVolume = ByteAudioNativeFunctions.nativeAdjustHeadsetMonitorVolume(j, i);
            MethodCollector.m26664o(2910);
            return nativeAdjustHeadsetMonitorVolume;
        }
        MethodCollector.m26664o(2910);
        return -1;
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public int adjustPlaybackVolume(int i) {
        MethodCollector.m26663i(2916);
        long j = this.nativeEnginePtr;
        if (j != 0) {
            int nativeAdjustPlaybackVolume = ByteAudioNativeFunctions.nativeAdjustPlaybackVolume(j, i);
            MethodCollector.m26664o(2916);
            return nativeAdjustPlaybackVolume;
        }
        MethodCollector.m26664o(2916);
        return -1;
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public int adjustRecordVolume(int i) {
        MethodCollector.m26663i(2915);
        long j = this.nativeEnginePtr;
        if (j != 0) {
            int nativeAdjustRecordVolume = ByteAudioNativeFunctions.nativeAdjustRecordVolume(j, i);
            MethodCollector.m26664o(2915);
            return nativeAdjustRecordVolume;
        }
        MethodCollector.m26664o(2915);
        return -1;
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public ByteAudioAuxStream createAuxStream(String str) {
        if (this.nativeEnginePtr != 0) {
            return new ByteAudioAuxStream(this.nativeEnginePtr, str);
        }
        return null;
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public ByteAudioInputStream createInputStream(String str) {
        if (this.nativeEnginePtr != 0) {
            return new ByteAudioInputStream(this.nativeEnginePtr, str);
        }
        return null;
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public ByteAudioOutputStream createOutputStream(String str) {
        if (this.nativeEnginePtr != 0) {
            return new ByteAudioOutputStream(this.nativeEnginePtr, str);
        }
        return null;
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public void enableAudioRoute(boolean z) {
        MethodCollector.m26663i(2825);
        long j = this.nativeEnginePtr;
        if (j != 0) {
            ByteAudioNativeFunctions.nativeEnableAudioRoute(j, z);
        }
        MethodCollector.m26664o(2825);
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public int enableEarMonitor(boolean z) {
        MethodCollector.m26663i(2826);
        long j = this.nativeEnginePtr;
        if (j != 0) {
            ByteAudioNativeFunctions.nativeEnableEarMonitor(j, z);
        }
        MethodCollector.m26664o(2826);
        return 0;
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public void enableLocalAudio(boolean z) {
        MethodCollector.m26663i(2905);
        long j = this.nativeEnginePtr;
        if (j != 0) {
            ByteAudioNativeFunctions.nativeEnableLocalAudio(j, z);
        }
        MethodCollector.m26664o(2905);
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public ByteAudioStreamOption getValue(int i) {
        MethodCollector.m26663i(2981);
        long j = this.nativeEnginePtr;
        if (j != 0) {
            ByteAudioStreamOption nativeGetValue = ByteAudioNativeFunctions.nativeGetValue(j, i);
            MethodCollector.m26664o(2981);
            return nativeGetValue;
        }
        MethodCollector.m26664o(2981);
        return null;
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public int setAudioScenario(int i) {
        MethodCollector.m26663i(2913);
        long j = this.nativeEnginePtr;
        if (j != 0) {
            int nativeSetAudioScenario = ByteAudioNativeFunctions.nativeSetAudioScenario(j, i);
            MethodCollector.m26664o(2913);
            return nativeSetAudioScenario;
        }
        MethodCollector.m26664o(2913);
        return -1;
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public void setEnableSpeakerphone(boolean z) {
        MethodCollector.m26663i(2824);
        long j = this.nativeEnginePtr;
        if (j != 0) {
            ByteAudioNativeFunctions.nativeSetEnableSpeakerphone(j, z);
        }
        MethodCollector.m26664o(2824);
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public int setServerConfigure(String str) {
        int i;
        MethodCollector.m26663i(2811);
        long j = this.nativeEnginePtr;
        if (j != 0) {
            i = ByteAudioNativeFunctions.nativeSetServerConfigure(j, str);
        } else {
            i = -1;
        }
        MethodCollector.m26664o(2811);
        return i;
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public void addEventHandler(ByteAudioEventHandler byteAudioEventHandler) {
        MethodCollector.m26663i(2815);
        for (ByteAudioEventHandlerProxy byteAudioEventHandlerProxy : this.eventHandlerList) {
            if (byteAudioEventHandler.equals(byteAudioEventHandlerProxy)) {
                MethodCollector.m26664o(2815);
                return;
            }
        }
        ByteAudioEventHandlerProxy byteAudioEventHandlerProxy2 = new ByteAudioEventHandlerProxy(byteAudioEventHandler);
        long j = this.nativeEnginePtr;
        if (j != 0) {
            long nativeAddEventHandler = ByteAudioNativeFunctions.nativeAddEventHandler(j, byteAudioEventHandlerProxy2);
            if (nativeAddEventHandler != 0) {
                byteAudioEventHandlerProxy2.setNativeHandler(nativeAddEventHandler);
                this.eventHandlerList.add(byteAudioEventHandlerProxy2);
            }
        }
        MethodCollector.m26664o(2815);
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public void removeEventHandler(ByteAudioEventHandler byteAudioEventHandler) {
        MethodCollector.m26663i(2818);
        if (this.nativeEnginePtr != 0) {
            for (int i = 0; i < this.eventHandlerList.size(); i++) {
                ByteAudioEventHandlerProxy byteAudioEventHandlerProxy = this.eventHandlerList.get(i);
                if (byteAudioEventHandlerProxy.handler == byteAudioEventHandler) {
                    ByteAudioNativeFunctions.nativeRemoveEventHandler(this.nativeEnginePtr, byteAudioEventHandlerProxy.nativeHandlerPtr);
                    this.eventHandlerList.remove(byteAudioEventHandlerProxy);
                    byteAudioEventHandlerProxy.handler = null;
                    byteAudioEventHandlerProxy.nativeHandlerPtr = 0;
                    MethodCollector.m26664o(2818);
                    return;
                }
            }
        }
        MethodCollector.m26664o(2818);
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public int setValue(int i, ByteAudioStreamOption byteAudioStreamOption) {
        MethodCollector.m26663i(2976);
        long j = this.nativeEnginePtr;
        if (j != 0) {
            int nativeSetValue = ByteAudioNativeFunctions.nativeSetValue(j, i, byteAudioStreamOption);
            MethodCollector.m26664o(2976);
            return nativeSetValue;
        }
        MethodCollector.m26664o(2976);
        return -1;
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public void setFrontInputFilter(ByteAudioFilterProxy byteAudioFilterProxy, int i, int i2) {
        MethodCollector.m26663i(2897);
        long j = this.nativeEnginePtr;
        if (j != 0) {
            ByteAudioNativeFunctions.nativeSetFrontInputFilter(j, byteAudioFilterProxy, i, i2);
        }
        MethodCollector.m26664o(2897);
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public void setInputFilter(ByteAudioFilterProxy byteAudioFilterProxy, int i, int i2) {
        MethodCollector.m26663i(2891);
        long j = this.nativeEnginePtr;
        if (j != 0) {
            ByteAudioNativeFunctions.nativeSetInputFilter(j, byteAudioFilterProxy, i, i2);
        }
        MethodCollector.m26664o(2891);
    }

    @Override // com.bytedance.bae.IByteAudioEngine
    public void setOutputFilter(ByteAudioFilterProxy byteAudioFilterProxy, int i, int i2) {
        MethodCollector.m26663i(2903);
        long j = this.nativeEnginePtr;
        if (j != 0) {
            ByteAudioNativeFunctions.nativeSetOutputFilter(j, byteAudioFilterProxy, i, i2);
        }
        MethodCollector.m26664o(2903);
    }
}
