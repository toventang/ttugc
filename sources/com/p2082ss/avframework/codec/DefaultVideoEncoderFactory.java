package com.p2082ss.avframework.codec;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.engine.VideoEncoder;
import com.p2082ss.avframework.engine.VideoEncoderFactory;

/* renamed from: com.ss.avframework.codec.DefaultVideoEncoderFactory */
public class DefaultVideoEncoderFactory extends VideoEncoderFactory {
    private VideoEncoderFactory mHWFacotry = new HardwareVideoEncoderFactory();

    static {
        Covode.recordClassIndex(99900);
    }

    private native VideoEncoder nativeDefaultCreateVideoEncoder(String str, boolean z);

    private native String nativeDefaultGetSupportedFormats();

    @Override // com.p2082ss.avframework.engine.VideoEncoderFactory, com.p2082ss.avframework.engine.NativeObject
    public synchronized void release() {
        MethodCollector.m26663i(4033);
        super.release();
        this.mHWFacotry.release();
        MethodCollector.m26664o(4033);
    }

    @Override // com.p2082ss.avframework.engine.VideoEncoderFactory
    public String GetSupportedFormats() {
        MethodCollector.m26663i(4031);
        String str = this.mHWFacotry.GetSupportedFormats() + ":" + nativeDefaultGetSupportedFormats();
        MethodCollector.m26664o(4031);
        return str;
    }

    @Override // com.p2082ss.avframework.engine.VideoEncoderFactory
    public VideoEncoder CreateVideoEncoder(String str, boolean z) {
        MethodCollector.m26663i(3877);
        VideoEncoder CreateVideoEncoder = this.mHWFacotry.CreateVideoEncoder(str, z);
        if (CreateVideoEncoder == null) {
            CreateVideoEncoder = nativeDefaultCreateVideoEncoder(str, z);
        }
        MethodCollector.m26664o(3877);
        return CreateVideoEncoder;
    }
}
