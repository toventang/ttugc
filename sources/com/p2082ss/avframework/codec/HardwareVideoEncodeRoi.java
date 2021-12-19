package com.p2082ss.avframework.codec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.buffer.RoiInfo;
import com.p2082ss.avframework.buffer.VideoFrame;
import com.p2082ss.avframework.utils.AVLog;
import com.p2082ss.avframework.utils.TEBundle;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.avframework.codec.HardwareVideoEncodeRoi */
public class HardwareVideoEncodeRoi {
    protected String TAG = "HardwareVideoEncodeRoi";
    private float mRoiBitrateRatio = 1.0f;
    protected boolean mRoiEnabled;
    protected int mRoiQP = -6;
    protected boolean mStretchRoi;

    static {
        Covode.recordClassIndex(99905);
    }

    /* access modifiers changed from: package-private */
    public void configureRoi(MediaFormat mediaFormat) {
    }

    /* access modifiers changed from: package-private */
    public void encodeWithRoi(MediaCodec mediaCodec, VideoFrame videoFrame, int i) {
    }

    /* access modifiers changed from: package-private */
    public float getRoiSettingBitrateRatio() {
        if (this.mRoiEnabled) {
            return this.mRoiBitrateRatio;
        }
        return 1.0f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.avframework.codec.HardwareVideoEncodeRoi$HisiRoi */
    public static class HisiRoi extends HardwareVideoEncodeRoi {
        private Bundle mBundle;

        static {
            Covode.recordClassIndex(99906);
        }

        HisiRoi(TEBundle tEBundle) {
            super(tEBundle);
        }

        @Override // com.p2082ss.avframework.codec.HardwareVideoEncodeRoi
        public void configureRoi(MediaFormat mediaFormat) {
            HardwareVideoEncodeRoi.super.configureRoi(mediaFormat);
            if (this.mRoiEnabled) {
                mediaFormat.setInteger("vendor.hisi.hisi-ext-codec-vendor-configure", 1);
            }
        }

        /* access modifiers changed from: package-private */
        @Override // com.p2082ss.avframework.codec.HardwareVideoEncodeRoi
        public boolean checkSupportRoi(MediaCodec mediaCodec, TEBundle tEBundle) {
            if (!HardwareVideoEncodeRoi.super.checkSupportRoi(mediaCodec, tEBundle)) {
                return false;
            }
            MediaFormat outputFormat = mediaCodec.getOutputFormat();
            if (!outputFormat.containsKey("vendor.hisi.hisi-ext-codec-roi-supported") || outputFormat.getInteger("vendor.hisi.hisi-ext-codec-roi-supported") != 1) {
                this.mRoiEnabled = false;
                TEBundle bundle = tEBundle.getBundle("roi_settings");
                if (bundle != null) {
                    bundle.setInt("roi_on", -101);
                    tEBundle.setBundle("roi_settings", bundle);
                }
            }
            return this.mRoiEnabled;
        }

        @Override // com.p2082ss.avframework.codec.HardwareVideoEncodeRoi
        public void encodeWithRoi(MediaCodec mediaCodec, VideoFrame videoFrame, int i) {
            int[] stretchedRoi;
            if (this.mRoiEnabled && mediaCodec != null && videoFrame != null && videoFrame.getBuffer() != null) {
                if (this.mBundle == null) {
                    Bundle bundle = new Bundle();
                    this.mBundle = bundle;
                    bundle.putInt("vendor.hisi.hisi-ext-codec-roi-0-qp-mode", 0);
                    this.mBundle.putInt("vendor.hisi.hisi-ext-codec-roi-0-qp", this.mRoiQP);
                }
                VideoFrame.Buffer buffer = videoFrame.getBuffer();
                RoiInfo rOIInfo = buffer.getROIInfo();
                int width = buffer.getWidth();
                int height = buffer.getHeight();
                if (rOIInfo == null) {
                    this.mBundle.putLong("vendor.hisi.hisi-ext-codec-roi-0-params", 0);
                    mediaCodec.setParameters(this.mBundle);
                    return;
                }
                int centerPosX = rOIInfo.getCenterPosX() - (rOIInfo.getRoiWidth() / 2);
                int centerPosY = rOIInfo.getCenterPosY() - (rOIInfo.getRoiHeight() / 2);
                int roiWidth = rOIInfo.getRoiWidth() + centerPosX;
                int roiHeight = rOIInfo.getRoiHeight() + centerPosY;
                if (this.mStretchRoi && (stretchedRoi = rOIInfo.getStretchedRoi()) != null && stretchedRoi.length >= 4) {
                    centerPosX = stretchedRoi[0];
                    centerPosY = stretchedRoi[1];
                    roiWidth = stretchedRoi[2];
                    roiHeight = stretchedRoi[3];
                }
                int min = Math.min(Math.max(0, centerPosX), width - 1);
                int min2 = Math.min(Math.max(0, centerPosY), height - 1);
                int min3 = Math.min(roiWidth - min, width - min);
                int min4 = Math.min(roiHeight - min2, height - min2);
                int i2 = width * height;
                if (min3 * min4 > i2 / 5) {
                    double d = (double) i2;
                    double d2 = (double) min3;
                    Double.isNaN(d2);
                    double d3 = (double) min4;
                    Double.isNaN(d3);
                    Double.isNaN(d);
                    double d4 = d / ((5.0d * d2) * d3);
                    double sqrt = Math.sqrt(d4);
                    Double.isNaN(d2);
                    int i3 = (int) (sqrt * d2);
                    double sqrt2 = Math.sqrt(d4);
                    Double.isNaN(d3);
                    int i4 = (int) (sqrt2 * d3);
                    min += (min3 - i3) / 2;
                    min2 += (min4 - i4) / 2;
                    min3 = i3;
                    min4 = i4;
                }
                this.mBundle.putLong("vendor.hisi.hisi-ext-codec-roi-0-params", (((long) min2) << 16) | ((long) min) | (((long) min3) << 32) | (((long) min4) << 48));
                mediaCodec.setParameters(this.mBundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.avframework.codec.HardwareVideoEncodeRoi$QcomRoi */
    public static class QcomRoi extends HardwareVideoEncodeRoi {
        private Bundle mBundle;

        static {
            Covode.recordClassIndex(99907);
        }

        /* renamed from: com_ss_avframework_codec_HardwareVideoEncodeRoi$QcomRoi_com_ss_android_ugc_aweme_lancet_LogLancet_i */
        public static int m147766x587db4f4(String str, String str2) {
            return 0;
        }

        QcomRoi(TEBundle tEBundle) {
            super(tEBundle);
        }

        /* access modifiers changed from: package-private */
        @Override // com.p2082ss.avframework.codec.HardwareVideoEncodeRoi
        public void configureRoi(MediaFormat mediaFormat) {
            HardwareVideoEncodeRoi.super.configureRoi(mediaFormat);
            if (this.mRoiEnabled) {
                mediaFormat.setInteger("bitrate-mode", 1);
                m147766x587db4f4(this.TAG, "Set bitrate mode: VBR");
                mediaFormat.setString("vendor.qti-ext-extradata-enable.types", "roiinfo");
            }
        }

        /* access modifiers changed from: package-private */
        @Override // com.p2082ss.avframework.codec.HardwareVideoEncodeRoi
        public boolean checkSupportRoi(MediaCodec mediaCodec, TEBundle tEBundle) {
            boolean z;
            boolean z2;
            if (!HardwareVideoEncodeRoi.super.checkSupportRoi(mediaCodec, tEBundle)) {
                return false;
            }
            MediaFormat outputFormat = mediaCodec.getOutputFormat();
            if ((!outputFormat.containsKey("vendor.qti-ext-enc-roiinfo-rect-mode.enable") || outputFormat.getInteger("vendor.qti-ext-enc-roiinfo-rect-mode.enable") != 0) && (!outputFormat.containsKey("roi-on") || outputFormat.getInteger("roi-on") != 0)) {
                z = false;
            } else {
                z = true;
            }
            if (outputFormat.getString("vendor.qti-ext-extradata-enable.types") == null || !outputFormat.getString("vendor.qti-ext-extradata-enable.types").equals("roiinfo")) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z || !z2) {
                AVLog.logKibana(5, this.TAG, "Roi unsupported: ".concat(String.valueOf(outputFormat)), null);
                this.mRoiEnabled = false;
                TEBundle bundle = tEBundle.getBundle("roi_settings");
                if (bundle != null) {
                    bundle.setInt("roi_on", -101);
                    tEBundle.setBundle("roi_settings", bundle);
                }
            }
            return this.mRoiEnabled;
        }

        /* access modifiers changed from: package-private */
        @Override // com.p2082ss.avframework.codec.HardwareVideoEncodeRoi
        public void encodeWithRoi(MediaCodec mediaCodec, VideoFrame videoFrame, int i) {
            int[] stretchedRoi;
            if (this.mRoiEnabled && mediaCodec != null && videoFrame != null && videoFrame.getBuffer() != null) {
                if (this.mBundle == null) {
                    Bundle bundle = new Bundle();
                    this.mBundle = bundle;
                    bundle.putString("vendor.qti-ext-enc-roiinfo.type", "rect");
                }
                this.mBundle.putLong("vendor.qti-ext-enc-roiinfo.timestamp", videoFrame.getTimestampNs() / 1000);
                String str = "0,0-0,0=-6;";
                VideoFrame.Buffer buffer = videoFrame.getBuffer();
                RoiInfo rOIInfo = buffer.getROIInfo();
                int width = buffer.getWidth();
                int height = buffer.getHeight();
                if (rOIInfo == null) {
                    this.mBundle.putString("vendor.qti-ext-enc-roiinfo.rect-payload", str);
                    mediaCodec.setParameters(this.mBundle);
                    return;
                }
                int centerPosX = rOIInfo.getCenterPosX() - (rOIInfo.getRoiWidth() / 2);
                int roiWidth = rOIInfo.getRoiWidth() + centerPosX;
                int centerPosY = rOIInfo.getCenterPosY() - (rOIInfo.getRoiHeight() / 2);
                int roiHeight = rOIInfo.getRoiHeight() + centerPosY;
                if (this.mStretchRoi && (stretchedRoi = rOIInfo.getStretchedRoi()) != null && stretchedRoi.length >= 4) {
                    centerPosX = stretchedRoi[0];
                    centerPosY = stretchedRoi[1];
                    roiWidth = stretchedRoi[2];
                    roiHeight = stretchedRoi[3];
                }
                if (centerPosX + roiWidth + centerPosY + roiHeight > 0) {
                    str = Math.max(0, centerPosY) + "," + Math.max(0, centerPosX) + "-" + Math.min(height - 1, roiHeight) + "," + Math.min(width - 1, roiWidth) + "=" + this.mRoiQP + ";";
                }
                this.mBundle.putString("vendor.qti-ext-enc-roiinfo.rect-payload", str);
                mediaCodec.setParameters(this.mBundle);
            }
        }
    }

    HardwareVideoEncodeRoi(TEBundle tEBundle) {
        this.mRoiEnabled = tEBundle.getInt("roi_on") != 1 ? false : true;
        boolean bool = tEBundle.getBool("video_lossless_encode");
        if (this.mRoiEnabled && bool) {
            this.mRoiEnabled = false;
            tEBundle.setInt("roi_on", -103);
        }
        if (tEBundle.contains("roi_qp") && tEBundle.getInt("roi_qp") != -100) {
            this.mRoiQP = tEBundle.getInt("roi_qp");
        }
        if (tEBundle.contains("roi_bitrate_ratio")) {
            this.mRoiBitrateRatio = (float) tEBundle.getDouble("roi_bitrate_ratio");
        }
        if (tEBundle.contains("roi_stretch")) {
            this.mStretchRoi = tEBundle.getBool("roi_stretch");
        }
        AVLog.ioi(this.TAG, "roi enabled: " + this.mRoiEnabled + ", roi qp: " + this.mRoiQP + ", bitrate ratio: " + this.mRoiBitrateRatio + ", stretch roi: " + this.mStretchRoi);
    }

    /* access modifiers changed from: package-private */
    public boolean checkSupportRoi(MediaCodec mediaCodec, TEBundle tEBundle) {
        return this.mRoiEnabled;
    }

    static HardwareVideoEncodeRoi createRoiProcessor(String str, TEBundle tEBundle) {
        HardwareVideoEncodeRoi hardwareVideoEncodeRoi;
        TEBundle bundle = tEBundle.getBundle("roi_settings");
        if (bundle == null || bundle.getInt("roi_on") != 1) {
            return null;
        }
        if (str.startsWith("OMX.qcom.")) {
            hardwareVideoEncodeRoi = new QcomRoi(bundle);
        } else if (str.startsWith("OMX.hisi.")) {
            hardwareVideoEncodeRoi = new HisiRoi(bundle);
        } else {
            bundle.setInt("roi_on", -102);
            hardwareVideoEncodeRoi = null;
        }
        if (bundle.getInt("roi_on") == 1) {
            return hardwareVideoEncodeRoi;
        }
        tEBundle.setBundle("roi_settings", bundle);
        return null;
    }
}
