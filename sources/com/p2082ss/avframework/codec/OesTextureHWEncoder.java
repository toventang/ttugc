package com.p2082ss.avframework.codec;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.buffer.VideoFrame;
import com.p2082ss.avframework.opengl.GlUtil;
import com.p2082ss.avframework.utils.AVLog;
import com.p2082ss.avframework.utils.TEBundle;

/* renamed from: com.ss.avframework.codec.OesTextureHWEncoder */
public class OesTextureHWEncoder extends HardwareVideoEncoder {
    private final String mime;

    static {
        Covode.recordClassIndex(99919);
    }

    @Override // com.p2082ss.avframework.codec.HardwareVideoEncoder, com.p2082ss.avframework.engine.VideoEncoder
    public /* bridge */ /* synthetic */ void RequestIDRFrame() {
        super.RequestIDRFrame();
    }

    @Override // com.p2082ss.avframework.codec.HardwareVideoEncoder
    public /* bridge */ /* synthetic */ byte[] getExtraData() {
        return super.getExtraData();
    }

    @Override // com.p2082ss.avframework.engine.NativeObject, com.p2082ss.avframework.codec.HardwareVideoEncoder, com.p2082ss.avframework.engine.VideoEncoder
    public synchronized void release() {
        MethodCollector.m26663i(399);
        super.release();
        MethodCollector.m26664o(399);
    }

    @Override // com.p2082ss.avframework.codec.HardwareVideoEncoder
    public boolean setupCodecName() {
        this.info = MediaCodecUtils.findCodecForType(this.mime);
        AVLog.iod("OesTextureHWEncoder", "using OesTextureHWEncoder!");
        if (this.info != null) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.avframework.codec.HardwareVideoEncoder, com.p2082ss.avframework.engine.VideoEncoder
    public /* bridge */ /* synthetic */ void SetBitrate(int i) {
        super.SetBitrate(i);
    }

    private boolean superInitEncoder(TEBundle tEBundle) {
        return super.InitEncoder(tEBundle);
    }

    @Override // com.p2082ss.avframework.codec.HardwareVideoEncoder, com.p2082ss.avframework.engine.VideoEncoder
    public int Encode(VideoFrame videoFrame) {
        return super.Encode(videoFrame);
    }

    OesTextureHWEncoder(boolean z) {
        String str;
        if (z) {
            str = MediaCodecUtils.ByteVC1Mime;
        } else {
            str = "video/avc";
        }
        this.mime = str;
    }

    @Override // com.p2082ss.avframework.engine.NativeObject
    public void setNativeObj(long j) {
        if (j == 0) {
            try {
                release();
            } catch (Exception unused) {
            }
        }
        super.setNativeObj(j);
    }

    @Override // com.p2082ss.avframework.codec.HardwareVideoEncoder, com.p2082ss.avframework.engine.VideoEncoder
    public boolean InitEncoder(TEBundle tEBundle) {
        if (this.info == null) {
            return false;
        }
        try {
            String name = this.info.getName();
            setupCodecName(name, this.mime, MediaCodecUtils.selectColorFormat(MediaCodecUtils.TEXTURE_COLOR_FORMATS, this.info.getCapabilitiesForType(this.mime), name), MediaCodecUtils.selectColorFormat(MediaCodecUtils.ENCODER_COLOR_FORMATS, this.info.getCapabilitiesForType(this.mime), name));
            GlUtil.nativeAttachThreadToOpenGl();
            return superInitEncoder(tEBundle);
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.p2082ss.avframework.codec.HardwareVideoEncoder
    public /* bridge */ /* synthetic */ void setupCodecName(String str, String str2, Integer num, Integer num2) {
        super.setupCodecName(str, str2, num, num2);
    }
}
