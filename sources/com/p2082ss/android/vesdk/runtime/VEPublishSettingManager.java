package com.p2082ss.android.vesdk.runtime;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ttve.nativePort.C30731d;
import com.p2082ss.android.vesdk.VEVideoEncodeSettings;

/* renamed from: com.ss.android.vesdk.runtime.VEPublishSettingManager */
public class VEPublishSettingManager {

    /* renamed from: a */
    public VEVideoEncodeSettings f191638a;

    private native int nativeSetVideoEncodeSettings(VEVideoEncodeSettings vEVideoEncodeSettings, long j);

    public native int nativeGetEnableRemuxErrorCode();

    public native boolean nativeIsCanRemuxVideo();

    public native boolean nativeIsUseFilterProcess();

    public native int nativeSetEditorStatus(long j);

    public native void nativeUpdateVideoEncodeSettings();

    private VEPublishSettingManager() {
    }

    static {
        Covode.recordClassIndex(99716);
        C30731d.m63114a();
    }

    /* renamed from: com.ss.android.vesdk.runtime.VEPublishSettingManager$a */
    public enum EnumC85544a {
        INSTANCE;
        

        /* renamed from: b */
        public VEPublishSettingManager f191641b = new VEPublishSettingManager((byte) 0);

        static {
            Covode.recordClassIndex(99717);
        }

        private EnumC85544a(String str) {
        }
    }

    /* synthetic */ VEPublishSettingManager(byte b) {
        this();
    }

    /* renamed from: a */
    public final int mo131502a(VEVideoEncodeSettings vEVideoEncodeSettings, long j) {
        MethodCollector.m26663i(13720);
        int nativeSetVideoEncodeSettings = nativeSetVideoEncodeSettings(vEVideoEncodeSettings, j);
        if (nativeSetVideoEncodeSettings != 0) {
            MethodCollector.m26664o(13720);
            return nativeSetVideoEncodeSettings;
        }
        this.f191638a = vEVideoEncodeSettings;
        MethodCollector.m26664o(13720);
        return 0;
    }
}
