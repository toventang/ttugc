package com.p2082ss.avframework.codec;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.buffer.VideoFrame;
import com.p2082ss.avframework.utils.AVLog;
import com.p2082ss.avframework.utils.TEBundle;
import com.p2082ss.avframework.utils.ThreadUtils;

/* renamed from: com.ss.avframework.codec.H264HWVideoEncoder */
class H264HWVideoEncoder extends HardwareVideoEncoder {
    private Handler mHandler;

    static {
        Covode.recordClassIndex(99901);
    }

    public void superRelease() {
        super.release();
    }

    @Override // com.p2082ss.avframework.codec.HardwareVideoEncoder
    public boolean setupCodecName() {
        this.info = MediaCodecUtils.findCodecForType("video/avc");
        if (this.info != null) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.avframework.engine.NativeObject, com.p2082ss.avframework.codec.HardwareVideoEncoder, com.p2082ss.avframework.engine.VideoEncoder
    public synchronized void release() {
        MethodCollector.m26663i(3853);
        Handler handler = this.mHandler;
        if (handler == null) {
            MethodCollector.m26664o(3853);
            return;
        }
        ThreadUtils.invokeAtFrontUninterruptibly(handler, new Runnable() {
            /* class com.p2082ss.avframework.codec.H264HWVideoEncoder.RunnableC856723 */

            static {
                Covode.recordClassIndex(99904);
            }

            public void run() {
                H264HWVideoEncoder.this.superRelease();
            }
        });
        this.mHandler = null;
        MethodCollector.m26664o(3853);
    }

    public H264HWVideoEncoder(Handler handler) {
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
            /* class com.p2082ss.avframework.codec.H264HWVideoEncoder.RunnableC856701 */

            static {
                Covode.recordClassIndex(99902);
            }

            public void run() {
                H264HWVideoEncoder.this.superEncode(videoFrame);
                videoFrame.release();
            }
        })) {
            return 0;
        }
        videoFrame.release();
        if (!this.noDropFrame) {
            return 0;
        }
        AVLog.iow("H264HWVideoEncoder", "drop frame!");
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
                /* class com.p2082ss.avframework.codec.H264HWVideoEncoder.RunnableC856712 */

                static {
                    Covode.recordClassIndex(99903);
                }

                public void run() {
                    String name = H264HWVideoEncoder.this.info.getName();
                    H264HWVideoEncoder.this.setupCodecName(name, "video/avc", MediaCodecUtils.selectColorFormat(MediaCodecUtils.TEXTURE_COLOR_FORMATS, H264HWVideoEncoder.this.info.getCapabilitiesForType("video/avc"), name), MediaCodecUtils.selectColorFormat(MediaCodecUtils.ENCODER_COLOR_FORMATS, H264HWVideoEncoder.this.info.getCapabilitiesForType("video/avc"), name));
                    zArr[0] = H264HWVideoEncoder.this.superInitEncoder(tEBundle);
                }
            });
        } catch (Throwable unused) {
        }
        return zArr[0];
    }
}
