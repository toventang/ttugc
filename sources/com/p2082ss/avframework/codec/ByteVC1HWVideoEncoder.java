package com.p2082ss.avframework.codec;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.buffer.VideoFrame;
import com.p2082ss.avframework.opengl.GlUtil;
import com.p2082ss.avframework.utils.AVLog;
import com.p2082ss.avframework.utils.TEBundle;
import com.p2082ss.avframework.utils.ThreadUtils;

/* renamed from: com.ss.avframework.codec.ByteVC1HWVideoEncoder */
public class ByteVC1HWVideoEncoder extends HardwareVideoEncoder {
    private Handler mHandler;

    static {
        Covode.recordClassIndex(99895);
    }

    @Override // com.p2082ss.avframework.codec.HardwareVideoEncoder, com.p2082ss.avframework.engine.VideoEncoder
    public /* bridge */ /* synthetic */ void RequestIDRFrame() {
        super.RequestIDRFrame();
    }

    public void superRelease() {
        super.release();
    }

    @Override // com.p2082ss.avframework.codec.HardwareVideoEncoder
    public /* bridge */ /* synthetic */ byte[] getExtraData() {
        return super.getExtraData();
    }

    @Override // com.p2082ss.avframework.codec.HardwareVideoEncoder
    public boolean setupCodecName() {
        this.info = MediaCodecUtils.findCodecForType(MediaCodecUtils.ByteVC1Mime);
        if (this.info != null) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.avframework.engine.NativeObject, com.p2082ss.avframework.codec.HardwareVideoEncoder, com.p2082ss.avframework.engine.VideoEncoder
    public synchronized void release() {
        MethodCollector.m26663i(1324);
        Handler handler = this.mHandler;
        if (handler == null) {
            MethodCollector.m26664o(1324);
            return;
        }
        ThreadUtils.invokeAtFrontUninterruptibly(handler, new Runnable() {
            /* class com.p2082ss.avframework.codec.ByteVC1HWVideoEncoder.RunnableC856693 */

            static {
                Covode.recordClassIndex(99898);
            }

            public void run() {
                ByteVC1HWVideoEncoder.this.superRelease();
            }
        });
        this.mHandler = null;
        MethodCollector.m26664o(1324);
    }

    @Override // com.p2082ss.avframework.codec.HardwareVideoEncoder, com.p2082ss.avframework.engine.VideoEncoder
    public /* bridge */ /* synthetic */ void SetBitrate(int i) {
        super.SetBitrate(i);
    }

    public ByteVC1HWVideoEncoder(Handler handler) {
        this.mHandler = handler;
    }

    public int superEncode(VideoFrame videoFrame) {
        return super.Encode(videoFrame);
    }

    public boolean superInitEncoder(TEBundle tEBundle) {
        return super.InitEncoder(tEBundle);
    }

    @Override // com.p2082ss.avframework.engine.NativeObject
    public void setNativeObj(long j) {
        if (j == 0) {
            release();
        }
        super.setNativeObj(j);
    }

    @Override // com.p2082ss.avframework.codec.HardwareVideoEncoder, com.p2082ss.avframework.engine.VideoEncoder
    public int Encode(final VideoFrame videoFrame) {
        videoFrame.retain();
        if (this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.codec.ByteVC1HWVideoEncoder.RunnableC856682 */

            static {
                Covode.recordClassIndex(99897);
            }

            public void run() {
                ByteVC1HWVideoEncoder.this.superEncode(videoFrame);
                videoFrame.release();
            }
        })) {
            return 0;
        }
        videoFrame.release();
        if (!this.noDropFrame) {
            return 0;
        }
        AVLog.iow("ByteVC1HWVideoEncoder", "drop frame!");
        return 0;
    }

    @Override // com.p2082ss.avframework.codec.HardwareVideoEncoder, com.p2082ss.avframework.engine.VideoEncoder
    public boolean InitEncoder(final TEBundle tEBundle) {
        Handler handler;
        if (this.info == null || (handler = this.mHandler) == null) {
            return false;
        }
        final boolean[] zArr = {false};
        try {
            ThreadUtils.invokeAtFrontUninterruptibly(handler, new Runnable() {
                /* class com.p2082ss.avframework.codec.ByteVC1HWVideoEncoder.RunnableC856671 */

                static {
                    Covode.recordClassIndex(99896);
                }

                public void run() {
                    String name = ByteVC1HWVideoEncoder.this.info.getName();
                    String str = MediaCodecUtils.ByteVC1Mime;
                    ByteVC1HWVideoEncoder.this.setupCodecName(name, str, MediaCodecUtils.selectColorFormat(MediaCodecUtils.TEXTURE_COLOR_FORMATS, ByteVC1HWVideoEncoder.this.info.getCapabilitiesForType(str), name), MediaCodecUtils.selectColorFormat(MediaCodecUtils.ENCODER_COLOR_FORMATS, ByteVC1HWVideoEncoder.this.info.getCapabilitiesForType(str), name));
                    GlUtil.nativeAttachThreadToOpenGl();
                    zArr[0] = ByteVC1HWVideoEncoder.this.superInitEncoder(tEBundle);
                }
            });
        } catch (Throwable unused) {
        }
        return zArr[0];
    }

    @Override // com.p2082ss.avframework.codec.HardwareVideoEncoder
    public /* bridge */ /* synthetic */ void setupCodecName(String str, String str2, Integer num, Integer num2) {
        super.setupCodecName(str, str2, num, num2);
    }
}
