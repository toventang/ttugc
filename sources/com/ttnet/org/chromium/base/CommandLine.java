package com.ttnet.org.chromium.base;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;

public abstract class CommandLine {

    /* renamed from: a */
    static final AtomicReference<CommandLine> f198246a = new AtomicReference<>();

    /* renamed from: b */
    static final /* synthetic */ boolean f198247b = true;

    public static native void nativeAppendSwitch(String str);

    public static native void nativeAppendSwitchWithValue(String str, String str2);

    public static native void nativeAppendSwitchesAndArguments(String[] strArr);

    public static native String nativeGetSwitchValue(String str);

    public static native boolean nativeHasSwitch(String str);

    public static native void nativeInit(String[] strArr);

    /* renamed from: a */
    public abstract boolean mo141481a();

    private CommandLine() {
    }

    static {
        Covode.recordClassIndex(103337);
    }

    /* renamed from: b */
    public static CommandLine m151722b() {
        CommandLine commandLine = f198246a.get();
        if (f198247b || commandLine != null) {
            return commandLine;
        }
        throw new AssertionError();
    }
}
