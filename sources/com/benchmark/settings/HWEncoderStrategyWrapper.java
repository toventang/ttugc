package com.benchmark.settings;

import com.benchmark.ByteBenchBundle;
import com.benchmark.mediacodec.C2492i;
import com.benchmark.mediacodec.TEMediaCodecEncodeSettings;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class HWEncoderStrategyWrapper {
    private long mStrategyHandle;

    static {
        Covode.recordClassIndex(2872);
    }

    private native TEMediaCodecEncodeSettings native_getSetting(long j, TEMediaCodecEncodeSettings tEMediaCodecEncodeSettings);

    private native String native_getVideoOutputPath(long j);

    private native String native_getYUVPath(long j);

    private native void native_update(long j, long j2);

    public String getVideoOutputPath() {
        MethodCollector.m26663i(5776);
        String native_getVideoOutputPath = native_getVideoOutputPath(this.mStrategyHandle);
        MethodCollector.m26664o(5776);
        return native_getVideoOutputPath;
    }

    public String getYUVPath() {
        MethodCollector.m26663i(5650);
        String native_getYUVPath = native_getYUVPath(this.mStrategyHandle);
        MethodCollector.m26664o(5650);
        return native_getYUVPath;
    }

    public TEMediaCodecEncodeSettings getSettings() {
        MethodCollector.m26663i(5778);
        TEMediaCodecEncodeSettings native_getSetting = native_getSetting(this.mStrategyHandle, new TEMediaCodecEncodeSettings());
        MethodCollector.m26664o(5778);
        return native_getSetting;
    }

    public HWEncoderStrategyWrapper(long j) {
        this.mStrategyHandle = j;
    }

    public void update(C2492i iVar, C2492i iVar2, int i) {
        MethodCollector.m26663i(5921);
        ByteBenchBundle obtain = ByteBenchBundle.obtain();
        if (iVar.f7533b != null) {
            obtain.setInt("encode_frame_size", iVar.f7533b.length);
        } else {
            obtain.setInt("encode_frame_size", 0);
        }
        obtain.setLong("pts", iVar.f7535d);
        obtain.setBool("key_frame", iVar.f7537f);
        obtain.setBool("end_frame", iVar.f7538g);
        native_update(this.mStrategyHandle, obtain.getHandle());
        obtain.recycle();
        MethodCollector.m26664o(5921);
    }
}
