package com.p2082ss.android.ttve.nativePort;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ttve.nativePort.TESpeechTest */
public class TESpeechTest {
    private long handle;

    static {
        Covode.recordClassIndex(37306);
    }

    private static native long createSpeechUtils();

    private static native void init(long j);

    private static native int process(long j, short[] sArr, int i);

    private static native int stop(long j);

    public void init() {
        MethodCollector.m26663i(12751);
        init(this.handle);
        MethodCollector.m26664o(12751);
    }

    public int stop() {
        MethodCollector.m26663i(12841);
        int stop = stop(this.handle);
        MethodCollector.m26664o(12841);
        return stop;
    }

    public static TESpeechTest create() {
        MethodCollector.m26663i(12629);
        TESpeechTest tESpeechTest = new TESpeechTest();
        tESpeechTest.handle = createSpeechUtils();
        MethodCollector.m26664o(12629);
        return tESpeechTest;
    }

    public int process(short[] sArr, int i) {
        MethodCollector.m26663i(12752);
        int process = process(this.handle, sArr, i);
        MethodCollector.m26664o(12752);
        return process;
    }
}
