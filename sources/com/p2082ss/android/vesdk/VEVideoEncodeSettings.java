package com.p2082ss.android.vesdk;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.settings.VEVideoCompileEncodeSettings;
import com.p2082ss.android.vesdk.settings.VEVideoEncodeProfile;
import com.p2082ss.android.vesdk.settings.VEVideoSWEncodeSettings;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vesdk.VEVideoEncodeSettings */
public class VEVideoEncodeSettings implements Parcelable {
    public static final Parcelable.Creator<VEVideoEncodeSettings> CREATOR = new Parcelable.Creator<VEVideoEncodeSettings>() {
        /* class com.p2082ss.android.vesdk.VEVideoEncodeSettings.C852851 */

        static {
            Covode.recordClassIndex(99387);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEVideoEncodeSettings[] newArray(int i) {
            return new VEVideoEncodeSettings[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEVideoEncodeSettings createFromParcel(Parcel parcel) {
            return new VEVideoEncodeSettings(parcel);
        }
    };
    boolean banExtraDataLoop;
    public ENCODE_BITRATE_MODE bitrateMode;
    public int bps;
    public COMPILE_TYPE compileType;
    public boolean enableByteVCRemuxVideo;
    public boolean enableHwBufferEncode;
    private boolean enableInterLeave;
    public boolean enableRemuxVideo;
    public boolean enableRemuxVideoForRotation;
    public boolean enableRemuxVideoForShoot;
    private int enableRemuxVideoRes;
    public int encodeProfile;
    public int encodeStandard;
    public String externalSettingsJsonStr;
    public int fps;
    public int gopSize;
    public boolean hasBFrame;
    public boolean isSupportHWEncoder;
    public String mComment;
    public boolean mCompileSoftInfo;
    public String mDescription;
    public int[] mKeyFramePoints;
    public boolean mOptRemuxWithCopy;
    public boolean mReEncodeOpt;
    public boolean mRecordingMp4;
    public int mResolutionAlign;
    public boolean mTransitionKeyframeEnable;
    public VEVideoCompileEncodeSettings mVideoCompileEncodeSetting;
    public VEVideoCompileEncodeSettings mVideoWatermarkCompileEncodeSetting;
    public VEWatermarkParam mWatermarkParam;
    public VESize outputSize;
    public int resizeMode;
    public float resizeX;
    public float resizeY;
    public int rotate;
    public float speed;
    public int swCRF;
    public long swMaxrate;
    public int swPreset;
    public int swQP;
    public double swQPOffset;
    public VESize watermarkSize;

    public int describeContents() {
        return 0;
    }

    public ENCODE_BITRATE_MODE getBitrateMode() {
        return this.bitrateMode;
    }

    public int getBps() {
        return this.bps;
    }

    public String getComment() {
        return this.mComment;
    }

    public COMPILE_TYPE getCompileType() {
        return this.compileType;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public int getEncodeProfile() {
        return this.encodeProfile;
    }

    public int getEncodeStandard() {
        return this.encodeStandard;
    }

    public String getExternalSettingsJsonStr() {
        return this.externalSettingsJsonStr;
    }

    public int getFps() {
        return this.fps;
    }

    public int getGopSize() {
        return this.gopSize;
    }

    public int[] getKeyFramePoints() {
        return this.mKeyFramePoints;
    }

    public int getResizeMode() {
        return this.resizeMode;
    }

    public float getResizeX() {
        return this.resizeX;
    }

    public float getResizeY() {
        return this.resizeY;
    }

    public int getResolutionAlignment() {
        return this.mResolutionAlign;
    }

    public int getRotate() {
        return this.rotate;
    }

    public float getSpeed() {
        return this.speed;
    }

    public int getSwCRF() {
        return this.swCRF;
    }

    public long getSwMaxRate() {
        return this.swMaxrate;
    }

    public int getSwPreset() {
        return this.swPreset;
    }

    public int getSwQP() {
        return this.swQP;
    }

    public VEVideoCompileEncodeSettings getVideoCompileEncodeSetting() {
        return this.mVideoCompileEncodeSetting;
    }

    public VESize getVideoRes() {
        return this.outputSize;
    }

    public VEVideoCompileEncodeSettings getWatermarkCompileEncodeSetting() {
        return this.mVideoWatermarkCompileEncodeSetting;
    }

    public VEWatermarkParam getWatermarkParam() {
        return this.mWatermarkParam;
    }

    public VESize getWatermarkVideoRes() {
        return this.watermarkSize;
    }

    public boolean isBanExtraDataLoop() {
        return this.banExtraDataLoop;
    }

    public boolean isCompileSoftInfo() {
        return this.mCompileSoftInfo;
    }

    public boolean isEnableByteVCRemuxVideo() {
        return this.enableByteVCRemuxVideo;
    }

    public boolean isEnableHwBufferEncode() {
        return this.enableHwBufferEncode;
    }

    public boolean isEnableInterLeave() {
        return this.enableInterLeave;
    }

    public boolean isEnableRemuxVideo() {
        return this.enableRemuxVideo;
    }

    public boolean isEnableRemuxVideoForRotation() {
        return this.enableRemuxVideoForRotation;
    }

    public boolean isEnableRemuxVideoForShoot() {
        return this.enableRemuxVideoForShoot;
    }

    public int isEnableRemuxVideoRes() {
        return this.enableRemuxVideoRes;
    }

    public boolean isHasBFrame() {
        return this.hasBFrame;
    }

    public boolean isOptRemuxWithCopy() {
        return this.mOptRemuxWithCopy;
    }

    public boolean isReEncodeOpt() {
        return this.mReEncodeOpt;
    }

    public boolean isRecordingMp4() {
        return this.mRecordingMp4;
    }

    public boolean isSupportHwEnc() {
        return this.isSupportHWEncoder;
    }

    /* renamed from: com.ss.android.vesdk.VEVideoEncodeSettings$a */
    public static class C85292a {

        /* renamed from: a */
        public VEVideoEncodeSettings f190871a;

        /* renamed from: b */
        private int f190872b;

        /* renamed from: c */
        private Map<ENCODE_STANDARD, Integer> f190873c = new HashMap();

        static {
            Covode.recordClassIndex(99399);
        }

        /* renamed from: a */
        public final C85292a mo130583a(boolean z, boolean z2) {
            this.f190871a.enableRemuxVideo = z;
            this.f190871a.enableRemuxVideoForRotation = z2;
            return this;
        }

        /* renamed from: a */
        public final C85292a mo130582a(boolean z) {
            this.f190871a.enableRemuxVideoForShoot = z;
            return this;
        }

        /* renamed from: a */
        public final C85292a mo130579a(ENCODE_PROFILE encode_profile) {
            this.f190871a.encodeProfile = encode_profile.ordinal();
            return this;
        }

        /* renamed from: a */
        public final C85292a mo130580a(ENCODE_STANDARD encode_standard) {
            this.f190871a.encodeStandard = encode_standard.ordinal();
            return this;
        }

        /* renamed from: a */
        public final C85292a mo130581a(String str) {
            this.f190871a.externalSettingsJsonStr = str;
            return this;
        }

        /* renamed from: a */
        public final C85292a mo130571a() {
            this.f190871a.resizeX = 0.0f;
            return this;
        }

        /* renamed from: b */
        public final C85292a mo130584b() {
            this.f190871a.resizeY = 0.0f;
            return this;
        }

        /* renamed from: c */
        public final C85292a mo130589c() {
            this.f190871a.mWatermarkParam = null;
            return this;
        }

        /* renamed from: d */
        public final VEVideoEncodeSettings mo130594d() {
            m146585a(this.f190871a);
            if (!TextUtils.isEmpty(this.f190871a.externalSettingsJsonStr)) {
                m146587c(this.f190871a.externalSettingsJsonStr);
            } else {
                m146588e();
            }
            C85315al.m146637a("VEVideoEncodeSettings", "exportVideoEncodeSettings = " + this.f190871a);
            C85315al.m146637a("VEVideoEncodeSettings", "exportVideoEncodeSettings.compile = " + this.f190871a.mVideoCompileEncodeSetting);
            return this.f190871a;
        }

        /* renamed from: e */
        private void m146588e() {
            VEVideoCompileEncodeSettings vEVideoCompileEncodeSettings = new VEVideoCompileEncodeSettings();
            vEVideoCompileEncodeSettings.isSupportHWEncoder = this.f190871a.isSupportHWEncoder;
            vEVideoCompileEncodeSettings.useHWEncoder = this.f190871a.isSupportHWEncoder;
            vEVideoCompileEncodeSettings.enableHwBufferEncode = this.f190871a.enableHwBufferEncode;
            if (vEVideoCompileEncodeSettings.useHWEncoder) {
                vEVideoCompileEncodeSettings.mHWEncodeSetting.mBitrate = (long) this.f190871a.bps;
                vEVideoCompileEncodeSettings.mHWEncodeSetting.mProfile = this.f190871a.encodeProfile;
                vEVideoCompileEncodeSettings.mHWEncodeSetting.mGop = this.f190871a.gopSize;
                vEVideoCompileEncodeSettings.mHWEncodeSetting.mCodecType = this.f190871a.encodeStandard;
            } else {
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mBitrateMode = this.f190871a.bitrateMode.ordinal();
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mBps = this.f190871a.bps;
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mCrf = this.f190871a.swCRF;
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mQPOffset = this.f190871a.swQPOffset;
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mMaxRate = this.f190871a.swMaxrate;
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mPreset = this.f190871a.swPreset;
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mProfile = this.f190871a.encodeProfile;
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mGop = this.f190871a.gopSize;
            }
            this.f190871a.mVideoCompileEncodeSetting = vEVideoCompileEncodeSettings;
            this.f190871a.mVideoWatermarkCompileEncodeSetting = vEVideoCompileEncodeSettings;
        }

        /* renamed from: d */
        public final C85292a mo130593d(boolean z) {
            this.f190871a.mOptRemuxWithCopy = z;
            return this;
        }

        /* renamed from: e */
        public final C85292a mo130595e(int i) {
            this.f190871a.rotate = i;
            return this;
        }

        /* renamed from: f */
        public final C85292a mo130597f(int i) {
            this.f190871a.resizeMode = i;
            return this;
        }

        /* renamed from: g */
        public final C85292a mo130598g(int i) {
            this.f190871a.gopSize = i;
            return this;
        }

        /* renamed from: a */
        public final C85292a mo130572a(int i) {
            this.f190871a.fps = i;
            return this;
        }

        /* renamed from: b */
        public final C85292a mo130585b(int i) {
            this.f190871a.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR;
            this.f190871a.bps = i;
            return this;
        }

        /* renamed from: c */
        public final C85292a mo130590c(int i) {
            this.f190871a.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF;
            this.f190871a.swCRF = i;
            return this;
        }

        /* renamed from: d */
        public final C85292a mo130592d(int i) {
            this.f190871a.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_QP;
            this.f190871a.swQP = i;
            return this;
        }

        /* renamed from: e */
        public final C85292a mo130596e(boolean z) {
            this.f190871a.mRecordingMp4 = z;
            return this;
        }

        /* renamed from: c */
        public final C85292a mo130591c(boolean z) {
            return mo130588b(z);
        }

        /* renamed from: a */
        public final C85292a mo130574a(long j) {
            this.f190871a.swMaxrate = j;
            return this;
        }

        /* renamed from: b */
        public final C85292a mo130587b(String str) {
            this.f190871a.mDescription = str;
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.Map<com.ss.android.vesdk.VEVideoEncodeSettings$ENCODE_STANDARD, java.lang.Integer> */
        /* JADX WARN: Multi-variable type inference failed */
        public C85292a(int i) {
            this.f190872b = i;
            VEVideoEncodeSettings vEVideoEncodeSettings = new VEVideoEncodeSettings();
            this.f190871a = vEVideoEncodeSettings;
            vEVideoEncodeSettings.encodeStandard = ((Integer) C85568t.m147473a().mo131557a("ve_compile_codec_type", (Object) 0)).intValue();
            this.f190873c.put(ENCODE_STANDARD.ENCODE_STANDARD_ByteVC1, C85568t.m147473a().mo131557a("ve_compile_hw_bytevc1_max_pixel_count", (Object) 8294400));
            this.f190871a.enableByteVCRemuxVideo = ((Boolean) C85568t.m147473a().mo131557a("vesdk_use_bytevcremux_in_publish", (Object) false)).booleanValue();
        }

        /* renamed from: a */
        private void m146585a(VEVideoEncodeSettings vEVideoEncodeSettings) {
            Integer num = this.f190873c.get(ENCODE_STANDARD.ENCODE_STANDARD_ByteVC1);
            C85315al.m146637a("VEVideoEncodeSettings", "hw_bytevc1 objMaxPixelCount= " + num + " settings.encodeStandard= " + vEVideoEncodeSettings.encodeStandard);
            if (vEVideoEncodeSettings.encodeStandard == ENCODE_STANDARD.ENCODE_STANDARD_ByteVC1.ordinal() && num != null && this.f190871a.outputSize.width * this.f190871a.outputSize.height > num.intValue()) {
                C85315al.m146637a("VEVideoEncodeSettings", "hw_bytevc1 change encode standard outputsize= " + this.f190871a.outputSize.width + " x " + this.f190871a.outputSize.height);
                vEVideoEncodeSettings.encodeStandard = ENCODE_STANDARD.ENCODE_STANDARD_H264.ordinal();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x003d A[Catch:{ JSONException -> 0x005b }] */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m146587c(java.lang.String r7) {
            /*
            // Method dump skipped, instructions count: 120
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.vesdk.VEVideoEncodeSettings.C85292a.m146587c(java.lang.String):void");
        }

        /* renamed from: b */
        public final C85292a mo130588b(boolean z) {
            this.f190871a.isSupportHWEncoder = z;
            return this;
        }

        /* renamed from: a */
        public final C85292a mo130575a(COMPILE_TYPE compile_type) {
            this.f190871a.compileType = compile_type;
            return this;
        }

        /* renamed from: a */
        private VEVideoCompileEncodeSettings m146584a(JSONObject jSONObject) {
            int i;
            long j;
            int i2;
            int i3;
            int i4;
            double d;
            VEVideoCompileEncodeSettings vEVideoCompileEncodeSettings = new VEVideoCompileEncodeSettings();
            try {
                vEVideoCompileEncodeSettings.isSupportHWEncoder = this.f190871a.isSupportHWEncoder;
                vEVideoCompileEncodeSettings.enableHwBufferEncode = this.f190871a.enableHwBufferEncode;
                String string = jSONObject.getString("encode_mode");
                if (!"unknown".equals(string) || this.f190872b != 2) {
                    vEVideoCompileEncodeSettings.useHWEncoder = "hw".equals(string);
                } else {
                    vEVideoCompileEncodeSettings.useHWEncoder = this.f190871a.isSupportHWEncoder;
                }
                vEVideoCompileEncodeSettings.mHWEncodeSetting = m146586b(jSONObject);
                vEVideoCompileEncodeSettings.mHWEncodeSetting.mCodecType = this.f190871a.encodeStandard;
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mBitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF.ordinal();
                VEVideoSWEncodeSettings vEVideoSWEncodeSettings = vEVideoCompileEncodeSettings.mSWEncodeSetting;
                if (this.f190872b != 2 || jSONObject.getJSONObject("sw").getInt("crf") != -1) {
                    i = jSONObject.getJSONObject("sw").getInt("crf");
                } else if (this.f190871a.isSupportHWEncoder) {
                    i = vEVideoCompileEncodeSettings.mSWEncodeSetting.mCrf;
                } else {
                    i = this.f190871a.swCRF;
                }
                vEVideoSWEncodeSettings.mCrf = i;
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mQPOffset = 0.0d;
                if (!jSONObject.getJSONObject("sw").isNull("qpoffset")) {
                    VEVideoSWEncodeSettings vEVideoSWEncodeSettings2 = vEVideoCompileEncodeSettings.mSWEncodeSetting;
                    if (this.f190872b != 2 || jSONObject.getJSONObject("sw").getDouble("qpoffset") != -1.0d) {
                        d = jSONObject.getJSONObject("sw").getDouble("qpoffset");
                    } else if (this.f190871a.isSupportHWEncoder) {
                        d = vEVideoCompileEncodeSettings.mSWEncodeSetting.mQPOffset;
                    } else {
                        d = this.f190871a.swQPOffset;
                    }
                    vEVideoSWEncodeSettings2.mQPOffset = d;
                }
                VEVideoSWEncodeSettings vEVideoSWEncodeSettings3 = vEVideoCompileEncodeSettings.mSWEncodeSetting;
                if (this.f190872b != 2 || jSONObject.getJSONObject("sw").getInt("maxrate") != -1) {
                    j = (long) jSONObject.getJSONObject("sw").getInt("maxrate");
                } else if (this.f190871a.isSupportHWEncoder) {
                    j = vEVideoCompileEncodeSettings.mSWEncodeSetting.mMaxRate;
                } else {
                    j = this.f190871a.swMaxrate;
                }
                vEVideoSWEncodeSettings3.mMaxRate = j;
                VEVideoSWEncodeSettings vEVideoSWEncodeSettings4 = vEVideoCompileEncodeSettings.mSWEncodeSetting;
                if (this.f190872b != 2 || jSONObject.getJSONObject("sw").getInt("preset") != -1) {
                    i2 = jSONObject.getJSONObject("sw").getInt("preset");
                } else if (this.f190871a.isSupportHWEncoder) {
                    i2 = vEVideoCompileEncodeSettings.mSWEncodeSetting.mPreset;
                } else {
                    i2 = this.f190871a.swPreset;
                }
                vEVideoSWEncodeSettings4.mPreset = i2;
                VEVideoSWEncodeSettings vEVideoSWEncodeSettings5 = vEVideoCompileEncodeSettings.mSWEncodeSetting;
                if (this.f190872b != 2 || !"unknown".equals(jSONObject.getJSONObject("sw").getString("profile"))) {
                    i3 = VEVideoEncodeProfile.valueOfString(jSONObject.getJSONObject("sw").getString("profile")).ordinal();
                } else if (this.f190871a.isSupportHWEncoder) {
                    i3 = vEVideoCompileEncodeSettings.mSWEncodeSetting.mProfile;
                } else {
                    i3 = this.f190871a.encodeProfile;
                }
                vEVideoSWEncodeSettings5.mProfile = i3;
                VEVideoSWEncodeSettings vEVideoSWEncodeSettings6 = vEVideoCompileEncodeSettings.mSWEncodeSetting;
                if (this.f190872b != 2 || jSONObject.getJSONObject("sw").getInt("gop") != -1) {
                    i4 = jSONObject.getJSONObject("sw").getInt("gop");
                } else if (this.f190871a.isSupportHWEncoder) {
                    i4 = vEVideoCompileEncodeSettings.mSWEncodeSetting.mGop;
                } else {
                    i4 = this.f190871a.gopSize;
                }
                vEVideoSWEncodeSettings6.mGop = i4;
            } catch (JSONException e) {
                e.printStackTrace();
                C85315al.m146642d("VEVideoEncodeSettings", "parseJsonToSetting : external json str parse error : " + e.getLocalizedMessage());
            }
            return vEVideoCompileEncodeSettings;
        }

        /* JADX WARNING: Removed duplicated region for block: B:103:0x0250  */
        /* JADX WARNING: Removed duplicated region for block: B:111:0x0271  */
        /* JADX WARNING: Removed duplicated region for block: B:119:0x0294  */
        /* JADX WARNING: Removed duplicated region for block: B:127:0x02b7  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0058  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x01f3  */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x0212  */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x0231  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private com.p2082ss.android.vesdk.settings.VEVideoHWEncodeSettings m146586b(org.json.JSONObject r20) {
            /*
            // Method dump skipped, instructions count: 864
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.vesdk.VEVideoEncodeSettings.C85292a.m146586b(org.json.JSONObject):com.ss.android.vesdk.settings.VEVideoHWEncodeSettings");
        }

        /* renamed from: a */
        public final C85292a mo130576a(ENCODE_BITRATE_MODE encode_bitrate_mode) {
            this.f190871a.bitrateMode = encode_bitrate_mode;
            return this;
        }

        /* renamed from: a */
        public final C85292a mo130578a(ENCODE_PRESET encode_preset) {
            this.f190871a.swPreset = encode_preset.ordinal();
            return this;
        }

        /* renamed from: a */
        public final C85292a mo130573a(int i, int i2) {
            this.f190871a.outputSize.width = i;
            this.f190871a.outputSize.height = i2;
            return this;
        }

        /* renamed from: b */
        public final C85292a mo130586b(int i, int i2) {
            this.f190871a.watermarkSize.width = i;
            this.f190871a.watermarkSize.height = i2;
            return this;
        }

        /* renamed from: a */
        public final C85292a mo130577a(ENCODE_BITRATE_MODE encode_bitrate_mode, int i) {
            this.f190871a.bitrateMode = encode_bitrate_mode;
            int i2 = C852862.f190863a[encode_bitrate_mode.ordinal()];
            if (i2 == 1) {
                this.f190871a.bps = i;
            } else if (i2 == 2) {
                this.f190871a.swCRF = i;
            } else if (i2 == 3) {
                this.f190871a.swQP = i;
            } else if (i2 == 4) {
                this.f190871a.bps = i;
            } else {
                throw new IllegalStateException("CompileTime BUG. Unhandled enum value " + encode_bitrate_mode.toString());
            }
            return this;
        }
    }

    static {
        Covode.recordClassIndex(99386);
    }

    /* renamed from: com.ss.android.vesdk.VEVideoEncodeSettings$ENCODE_STANDARD */
    public enum ENCODE_STANDARD implements Parcelable {
        ENCODE_STANDARD_H264,
        ENCODE_STANDARD_ByteVC1,
        ENCODE_STANDARD_MPEG4;
        
        public static final Parcelable.Creator<ENCODE_STANDARD> CREATOR = new Parcelable.Creator<ENCODE_STANDARD>() {
            /* class com.p2082ss.android.vesdk.VEVideoEncodeSettings.ENCODE_STANDARD.C852911 */

            static {
                Covode.recordClassIndex(99398);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ ENCODE_STANDARD[] newArray(int i) {
                return new ENCODE_STANDARD[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ ENCODE_STANDARD createFromParcel(Parcel parcel) {
                return ENCODE_STANDARD.values()[parcel.readInt()];
            }
        };

        public final int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(99397);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    public int getBitrateValue() {
        int i = C852862.f190863a[this.bitrateMode.ordinal()];
        if (i == 1) {
            return getBps();
        }
        if (i == 2) {
            return getSwCRF();
        }
        if (i == 3) {
            return getSwQP();
        }
        if (i == 4) {
            return getBps();
        }
        throw new IllegalStateException("CompileTime BUG by SDK. Unhandled ENCODE_BITRATE_MODE enum value.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vesdk.VEVideoEncodeSettings$2 */
    public static /* synthetic */ class C852862 {

        /* renamed from: a */
        static final /* synthetic */ int[] f190863a;

        /* renamed from: b */
        static final /* synthetic */ int[] f190864b;

        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|(2:1|2)|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005e */
        static {
            /*
            // Method dump skipped, instructions count: 105
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.vesdk.VEVideoEncodeSettings.C852862.<clinit>():void");
        }
    }

    /* renamed from: com.ss.android.vesdk.VEVideoEncodeSettings$COMPILE_TYPE */
    public enum COMPILE_TYPE implements Parcelable {
        COMPILE_TYPE_MP4,
        COMPILE_TYPE_GIF,
        COMPILE_TYPE_HIGH_GIF,
        COMPILE_TYPE_TRANSPARENT_GIF;
        
        public static final Parcelable.Creator<COMPILE_TYPE> CREATOR = new Parcelable.Creator<COMPILE_TYPE>() {
            /* class com.p2082ss.android.vesdk.VEVideoEncodeSettings.COMPILE_TYPE.C852871 */

            static {
                Covode.recordClassIndex(99390);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ COMPILE_TYPE[] newArray(int i) {
                return new COMPILE_TYPE[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ COMPILE_TYPE createFromParcel(Parcel parcel) {
                return COMPILE_TYPE.values()[parcel.readInt()];
            }
        };

        public final int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(99389);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    /* renamed from: com.ss.android.vesdk.VEVideoEncodeSettings$ENCODE_BITRATE_MODE */
    public enum ENCODE_BITRATE_MODE implements Parcelable {
        ENCODE_BITRATE_ABR,
        ENCODE_BITRATE_CRF,
        ENCODE_BITRATE_QP,
        ENCODE_BITRATE_VBR;
        
        public static final Parcelable.Creator<ENCODE_BITRATE_MODE> CREATOR = new Parcelable.Creator<ENCODE_BITRATE_MODE>() {
            /* class com.p2082ss.android.vesdk.VEVideoEncodeSettings.ENCODE_BITRATE_MODE.C852881 */

            static {
                Covode.recordClassIndex(99392);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ ENCODE_BITRATE_MODE[] newArray(int i) {
                return new ENCODE_BITRATE_MODE[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ ENCODE_BITRATE_MODE createFromParcel(Parcel parcel) {
                return ENCODE_BITRATE_MODE.values()[parcel.readInt()];
            }
        };

        /* renamed from: a */
        private static final ENCODE_BITRATE_MODE[] f190866a = values();

        public final int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(99391);
        }

        public static ENCODE_BITRATE_MODE fromInteger(int i) {
            return f190866a[i];
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    /* renamed from: com.ss.android.vesdk.VEVideoEncodeSettings$ENCODE_PROFILE */
    public enum ENCODE_PROFILE implements Parcelable {
        ENCODE_PROFILE_UNKNOWN,
        ENCODE_PROFILE_BASELINE,
        ENCODE_PROFILE_MAIN,
        ENCODE_PROFILE_HIGH;
        
        public static final Parcelable.Creator<ENCODE_PROFILE> CREATOR = new Parcelable.Creator<ENCODE_PROFILE>() {
            /* class com.p2082ss.android.vesdk.VEVideoEncodeSettings.ENCODE_PROFILE.C852901 */

            static {
                Covode.recordClassIndex(99396);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ ENCODE_PROFILE[] newArray(int i) {
                return new ENCODE_PROFILE[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ ENCODE_PROFILE createFromParcel(Parcel parcel) {
                return ENCODE_PROFILE.values()[parcel.readInt()];
            }
        };

        public final int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(99395);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    private void initFromVEConfigCenter() {
        boolean z = false;
        if (this.enableHwBufferEncode || ((Boolean) C85568t.m147473a().mo131557a("ve_enable_compile_buffer_hw_encode", (Object) false)).booleanValue()) {
            z = true;
        }
        this.enableHwBufferEncode = z;
        C85315al.m146637a("VEVideoEncodeSettings", "KEY_ENABLE_BUFFER_HW_COMPILE: " + this.enableHwBufferEncode);
        this.banExtraDataLoop = ((Boolean) C85568t.m147473a().mo131557a("ve_ban_hw_extra_data_loop", (Object) false)).booleanValue();
        C85315al.m146637a("VEVideoEncodeSettings", "AB isBanExtraDataLoop: " + this.banExtraDataLoop);
    }

    /* renamed from: com.ss.android.vesdk.VEVideoEncodeSettings$ENCODE_PRESET */
    public enum ENCODE_PRESET implements Parcelable {
        ENCODE_LEVEL_ULTRAFAST,
        ENCODE_LEVEL_SUPERFAST,
        ENCODE_LEVEL_VERYFAST,
        ENCODE_LEVEL_FASTER,
        ENCODE_LEVEL_FAST,
        ENCODE_LEVEL_MEDIUM,
        ENCODE_LEVEL_SLOW,
        ENCODE_LEVEL_SLOWER,
        ENCODE_LEVEL_VERYSLOW,
        ENCODE_LEVEL_PLACEBO;
        
        public static final Parcelable.Creator<ENCODE_PRESET> CREATOR = new Parcelable.Creator<ENCODE_PRESET>() {
            /* class com.p2082ss.android.vesdk.VEVideoEncodeSettings.ENCODE_PRESET.C852891 */

            static {
                Covode.recordClassIndex(99394);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ ENCODE_PRESET[] newArray(int i) {
                return new ENCODE_PRESET[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ ENCODE_PRESET createFromParcel(Parcel parcel) {
                return ENCODE_PRESET.values()[parcel.readInt()];
            }
        };

        public final int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(99393);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    private VEVideoEncodeSettings() {
        this.resizeMode = 2;
        this.speed = 1.0f;
        this.outputSize = new VESize(576, 1024);
        this.watermarkSize = new VESize(-1, -1);
        this.externalSettingsJsonStr = null;
        this.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR;
        this.bps = 4194304;
        this.swCRF = 15;
        this.swQPOffset = 0.0d;
        this.swQP = 15;
        this.fps = -1;
        this.gopSize = 60;
        this.swPreset = ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST.ordinal();
        this.encodeStandard = ENCODE_STANDARD.ENCODE_STANDARD_H264.ordinal();
        this.encodeProfile = ENCODE_PROFILE.ENCODE_PROFILE_UNKNOWN.ordinal();
        this.swMaxrate = 15000000;
        this.enableRemuxVideoRes = -1;
        this.hasBFrame = false;
        this.mRecordingMp4 = false;
        this.mTransitionKeyframeEnable = false;
        this.mReEncodeOpt = false;
        this.mResolutionAlign = 16;
        this.mKeyFramePoints = null;
        this.banExtraDataLoop = false;
        this.outputSize.width = 576;
        this.outputSize.height = 1024;
        this.watermarkSize.width = -1;
        this.watermarkSize.height = -1;
        this.fps = -1;
        this.bps = 4194304;
        this.isSupportHWEncoder = true;
        this.compileType = COMPILE_TYPE.COMPILE_TYPE_MP4;
        initFromVEConfigCenter();
    }

    public String toString() {
        return "VEVideoEncodeSettings{compileType=" + this.compileType + ", rotate=" + this.rotate + ", resizeMode=" + this.resizeMode + ", resizeX=" + this.resizeX + ", resizeY=" + this.resizeY + ", speed=" + this.speed + ", outputSize=" + this.outputSize + ", watermarkSize=" + this.watermarkSize + ", bitrateMode=" + this.bitrateMode + ", bps=" + this.bps + ", swCRF=" + this.swCRF + ", swQPOffset=" + this.swQPOffset + ", swQP=" + this.swQP + ", fps=" + this.fps + ", gopSize=" + this.gopSize + ", swPreset=" + this.swPreset + ", encodeStandard=" + this.encodeStandard + ", encodeProfile=" + this.encodeProfile + ", swMaxrate=" + this.swMaxrate + ", isSupportHWEncoder=" + this.isSupportHWEncoder + ", enableHwBufferEncode=" + this.enableHwBufferEncode + ", enableRemuxVideo=" + this.enableRemuxVideo + ", enableRemuxVideoForRotation=" + this.enableRemuxVideoForRotation + ", enableRemuxVideoForShoot=" + this.enableRemuxVideoForShoot + ", enableByteVCRemuxVideo=" + this.enableByteVCRemuxVideo + ", enableInterLeave=" + this.enableInterLeave + ", hasBFrame=" + this.hasBFrame + ", mWatermarkParam=" + this.mWatermarkParam + ", mVideoWatermarkCompileEncodeSetting=" + this.mVideoWatermarkCompileEncodeSetting + ", mVideoCompileEncodeSetting=" + this.mVideoCompileEncodeSetting + ", mOptRemuxWithCopy=" + this.mOptRemuxWithCopy + ", mReEncodeOpt=" + this.mReEncodeOpt + ", mDescripiton=" + this.mDescription + ", mComment=" + this.mComment + '}';
    }

    public void setCompileType(COMPILE_TYPE compile_type) {
        this.compileType = compile_type;
    }

    public void setEnableInterLeave(boolean z) {
        this.enableInterLeave = z;
    }

    public void setEnableRemuxVideo(boolean z) {
        this.enableRemuxVideo = z;
    }

    public void setEnableRemuxVideoForRotation(boolean z) {
        this.enableRemuxVideoForRotation = z;
    }

    public void setEnableRemuxVideoForShoot(boolean z) {
        this.enableRemuxVideoForShoot = z;
    }

    public void setEnableRemuxVideoRes(int i) {
        this.enableRemuxVideoRes = i;
    }

    public void setFps(int i) {
        this.fps = i;
    }

    public void setGopSize(int i) {
        this.gopSize = i;
    }

    public void setResizeMode(int i) {
        this.resizeMode = i;
    }

    public void setResizeX(float f) {
        this.resizeX = f;
    }

    public void setResizeY(float f) {
        this.resizeY = f;
    }

    public void setRotate(int i) {
        this.rotate = i;
    }

    public void setSpeed(float f) {
        this.speed = f;
    }

    public void setSupportHwEnc(boolean z) {
        this.isSupportHWEncoder = z;
    }

    public void setBps(int i) {
        this.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_VBR;
        this.bps = i;
    }

    public void setEncodeProfile(ENCODE_PROFILE encode_profile) {
        this.encodeProfile = encode_profile.ordinal();
    }

    public void setQP(int i) {
        this.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_QP;
        this.swQP = i;
    }

    public void setSWCRF(int i) {
        this.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF;
        this.swCRF = i;
    }

    public void setSwPreset(ENCODE_PRESET encode_preset) {
        this.swPreset = encode_preset.ordinal();
    }

    public void setVideoSWOptCrf(int i) {
        this.mVideoCompileEncodeSetting.mSWEncodeSetting.mCrf = i;
    }

    public boolean setVideoHwEnc(boolean z) {
        if (this.mVideoCompileEncodeSetting.isSupportHWEncoder) {
            this.mVideoCompileEncodeSetting.useHWEncoder = z;
        } else {
            this.mVideoCompileEncodeSetting.useHWEncoder = false;
        }
        return this.mVideoCompileEncodeSetting.useHWEncoder;
    }

    public boolean setWatermark(VEWatermarkParam vEWatermarkParam) {
        if (vEWatermarkParam == null) {
            this.mWatermarkParam = null;
            return true;
        } else if (vEWatermarkParam.getEntities() == null) {
            return false;
        } else {
            this.mWatermarkParam = vEWatermarkParam;
            return true;
        }
    }

    public void adjustVideoCompileEncodeSetting(int i) {
        if (i == 1) {
            VEVideoCompileEncodeSettings vEVideoCompileEncodeSettings = this.mVideoWatermarkCompileEncodeSetting;
            if (vEVideoCompileEncodeSettings != null) {
                this.mVideoCompileEncodeSetting = vEVideoCompileEncodeSettings;
            }
            if (this.watermarkSize.isValid()) {
                this.outputSize.width = this.watermarkSize.width;
                this.outputSize.height = this.watermarkSize.height;
            }
        } else if (i == 2) {
            VEVideoCompileEncodeSettings vEVideoCompileEncodeSettings2 = this.mVideoCompileEncodeSetting;
            if (vEVideoCompileEncodeSettings2 != null) {
                this.mVideoWatermarkCompileEncodeSetting = vEVideoCompileEncodeSettings2;
            }
            if (this.outputSize.isValid()) {
                this.watermarkSize.width = this.outputSize.width;
                this.watermarkSize.height = this.outputSize.height;
            }
        }
    }

    protected VEVideoEncodeSettings(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        this.resizeMode = 2;
        this.speed = 1.0f;
        this.outputSize = new VESize(576, 1024);
        this.watermarkSize = new VESize(-1, -1);
        this.externalSettingsJsonStr = null;
        this.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR;
        this.bps = 4194304;
        this.swCRF = 15;
        this.swQPOffset = 0.0d;
        this.swQP = 15;
        this.fps = -1;
        this.gopSize = 60;
        this.swPreset = ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST.ordinal();
        this.encodeStandard = ENCODE_STANDARD.ENCODE_STANDARD_H264.ordinal();
        this.encodeProfile = ENCODE_PROFILE.ENCODE_PROFILE_UNKNOWN.ordinal();
        this.swMaxrate = 15000000;
        this.enableRemuxVideoRes = -1;
        boolean z12 = false;
        this.hasBFrame = false;
        this.mRecordingMp4 = false;
        this.mTransitionKeyframeEnable = false;
        this.mReEncodeOpt = false;
        this.mResolutionAlign = 16;
        this.mKeyFramePoints = null;
        this.banExtraDataLoop = false;
        this.compileType = (COMPILE_TYPE) parcel.readParcelable(COMPILE_TYPE.class.getClassLoader());
        this.rotate = parcel.readInt();
        this.resizeMode = parcel.readInt();
        this.resizeX = parcel.readFloat();
        this.resizeY = parcel.readFloat();
        this.speed = parcel.readFloat();
        this.outputSize = (VESize) parcel.readParcelable(VESize.class.getClassLoader());
        this.watermarkSize = (VESize) parcel.readParcelable(VESize.class.getClassLoader());
        this.bitrateMode = (ENCODE_BITRATE_MODE) parcel.readParcelable(ENCODE_BITRATE_MODE.class.getClassLoader());
        this.bps = parcel.readInt();
        this.fps = parcel.readInt();
        this.swCRF = parcel.readInt();
        this.swQPOffset = parcel.readDouble();
        this.swQP = parcel.readInt();
        this.gopSize = parcel.readInt();
        this.swPreset = parcel.readInt();
        this.encodeStandard = parcel.readInt();
        this.encodeProfile = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isSupportHWEncoder = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.enableRemuxVideo = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.enableRemuxVideoForRotation = z3;
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.enableRemuxVideoForShoot = z4;
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.enableInterLeave = z5;
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.hasBFrame = z6;
        this.swMaxrate = parcel.readLong();
        this.mWatermarkParam = (VEWatermarkParam) parcel.readParcelable(VEWatermarkParam.class.getClassLoader());
        this.mVideoWatermarkCompileEncodeSetting = (VEVideoCompileEncodeSettings) parcel.readParcelable(VEVideoCompileEncodeSettings.class.getClassLoader());
        this.mVideoCompileEncodeSetting = (VEVideoCompileEncodeSettings) parcel.readParcelable(VEVideoCompileEncodeSettings.class.getClassLoader());
        this.externalSettingsJsonStr = parcel.readString();
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.mOptRemuxWithCopy = z7;
        this.mDescription = parcel.readString();
        this.mComment = parcel.readString();
        if (parcel.readByte() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.mCompileSoftInfo = z8;
        if (parcel.readByte() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.mRecordingMp4 = z9;
        if (parcel.readByte() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.enableHwBufferEncode = z10;
        if (parcel.readByte() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.mReEncodeOpt = z11;
        this.mResolutionAlign = parcel.readInt();
        this.banExtraDataLoop = parcel.readByte() != 0 ? true : z12;
    }

    public void setEnableRemuxVideo(boolean z, boolean z2) {
        this.enableRemuxVideo = z;
        this.enableRemuxVideoForRotation = z2;
    }

    public void setVideoRes(int i, int i2) {
        this.outputSize.width = i;
        this.outputSize.height = i2;
    }

    public void setWatermarkVideoRes(int i, int i2) {
        this.watermarkSize.width = i;
        this.watermarkSize.height = i2;
    }

    public void setVideoBitrate(ENCODE_BITRATE_MODE encode_bitrate_mode, int i) {
        this.bitrateMode = encode_bitrate_mode;
        int i2 = C852862.f190863a[this.bitrateMode.ordinal()];
        if (i2 == 1) {
            this.bps = i;
        } else if (i2 == 2) {
            this.swCRF = i;
        } else if (i2 == 3) {
            this.swQP = i;
        } else if (i2 == 4) {
            this.bps = i;
        } else {
            throw new IllegalStateException("CompileTime BUG by sdk. Unhandled bitrateMode");
        }
    }

    public VEVideoEncodeSettings(VESize vESize, boolean z) {
        this.resizeMode = 2;
        this.speed = 1.0f;
        this.outputSize = new VESize(576, 1024);
        this.watermarkSize = new VESize(-1, -1);
        this.externalSettingsJsonStr = null;
        this.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR;
        this.bps = 4194304;
        this.swCRF = 15;
        this.swQPOffset = 0.0d;
        this.swQP = 15;
        this.fps = -1;
        this.gopSize = 60;
        this.swPreset = ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST.ordinal();
        this.encodeStandard = ENCODE_STANDARD.ENCODE_STANDARD_H264.ordinal();
        this.encodeProfile = ENCODE_PROFILE.ENCODE_PROFILE_UNKNOWN.ordinal();
        this.swMaxrate = 15000000;
        this.enableRemuxVideoRes = -1;
        this.hasBFrame = false;
        this.mRecordingMp4 = false;
        this.mTransitionKeyframeEnable = false;
        this.mReEncodeOpt = false;
        this.mResolutionAlign = 16;
        this.mKeyFramePoints = null;
        this.banExtraDataLoop = false;
        this.outputSize = vESize;
        this.isSupportHWEncoder = z;
        this.compileType = COMPILE_TYPE.COMPILE_TYPE_MP4;
        initFromVEConfigCenter();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.compileType, i);
        parcel.writeInt(this.rotate);
        parcel.writeInt(this.resizeMode);
        parcel.writeFloat(this.resizeX);
        parcel.writeFloat(this.resizeY);
        parcel.writeFloat(this.speed);
        parcel.writeParcelable(this.outputSize, i);
        parcel.writeParcelable(this.watermarkSize, i);
        parcel.writeParcelable(this.bitrateMode, i);
        parcel.writeInt(this.bps);
        parcel.writeInt(this.fps);
        parcel.writeInt(this.swCRF);
        parcel.writeDouble(this.swQPOffset);
        parcel.writeInt(this.swQP);
        parcel.writeInt(this.gopSize);
        parcel.writeInt(this.swPreset);
        parcel.writeInt(this.encodeStandard);
        parcel.writeInt(this.encodeProfile);
        parcel.writeByte(this.isSupportHWEncoder ? (byte) 1 : 0);
        parcel.writeByte(this.enableRemuxVideo ? (byte) 1 : 0);
        parcel.writeByte(this.enableRemuxVideoForRotation ? (byte) 1 : 0);
        parcel.writeByte(this.enableRemuxVideoForShoot ? (byte) 1 : 0);
        parcel.writeByte(this.enableInterLeave ? (byte) 1 : 0);
        parcel.writeByte(this.hasBFrame ? (byte) 1 : 0);
        parcel.writeLong(this.swMaxrate);
        parcel.writeParcelable(this.mWatermarkParam, i);
        parcel.writeParcelable(this.mVideoWatermarkCompileEncodeSetting, i);
        parcel.writeParcelable(this.mVideoCompileEncodeSetting, i);
        parcel.writeString(this.externalSettingsJsonStr);
        parcel.writeByte(this.mOptRemuxWithCopy ? (byte) 1 : 0);
        parcel.writeString(this.mDescription);
        parcel.writeString(this.mComment);
        parcel.writeByte(this.mCompileSoftInfo ? (byte) 1 : 0);
        parcel.writeByte(this.mRecordingMp4 ? (byte) 1 : 0);
        parcel.writeByte(this.enableHwBufferEncode ? (byte) 1 : 0);
        parcel.writeByte(this.mReEncodeOpt ? (byte) 1 : 0);
        parcel.writeInt(this.mResolutionAlign);
        parcel.writeByte(this.banExtraDataLoop ? (byte) 1 : 0);
    }

    public float setVideoHWoptBitrate(int i, float f, boolean z) {
        long j;
        float f2;
        float f3 = f;
        C85315al.m146637a("VEVideoEncodeSettings", "compileProbe setVideoHWoptBitrate start! optBitrate= ".concat(String.valueOf(f3)));
        float f4 = 0.0f;
        if (f3 < 0.0f) {
            C85315al.m146642d("VEVideoEncodeSettings", "compileProbe HW setVideoHWoptBitrate optBitrate error");
            return -1.0f;
        }
        int min = Math.min(this.outputSize.width, this.outputSize.height);
        int abs = Math.abs(i - min);
        if (((i <= 572 || i >= 580) && (i <= 716 || i >= 724)) || abs <= 8) {
            if (i > 1076 && i < 1089) {
                if (z) {
                    if (abs > 8) {
                        C85315al.m146642d("VEVideoEncodeSettings", "compileProbe 1080P_HD: output resolution is not as expected");
                        return -1.0f;
                    }
                } else if (abs < 8) {
                    C85315al.m146642d("VEVideoEncodeSettings", "compileProbe 1080P: output resolution is not as expected");
                    return -1.0f;
                }
            }
            if (min <= 716 || min >= 724) {
                if (min <= 572 || min >= 580) {
                    if (min <= 1076 || min >= 1089) {
                        C85315al.m146642d("VEVideoEncodeSettings", "compileProbe output resolution error");
                        return -1.0f;
                    }
                    double d = (double) f3;
                    double d2 = this.mVideoCompileEncodeSetting.mHWEncodeSetting.mFullHd_bitrate_ratio;
                    Double.isNaN(d);
                    f3 = (float) (d / d2);
                    j = this.mVideoCompileEncodeSetting.mHWEncodeSetting.mBitrate;
                } else if (!z) {
                    double d3 = (double) f3;
                    double d4 = this.mVideoCompileEncodeSetting.mHWEncodeSetting.mSd_bitrate_ratio;
                    Double.isNaN(d3);
                    f3 = (float) (d3 / d4);
                    j = this.mVideoCompileEncodeSetting.mHWEncodeSetting.mBitrate;
                } else {
                    f3 = ((float) this.mVideoCompileEncodeSetting.mHWEncodeSetting.mBitrate) / 1000.0f;
                    float f5 = f3 * 1000.0f;
                    this.mVideoCompileEncodeSetting.mHWEncodeSetting.mBitrate = (long) f5;
                    C85315al.m146637a("VEVideoEncodeSettings", "compileProbe HW setVideoHWoptBitrate end! optBitrate= " + f5 + " diff_bitrate =" + f4);
                    return f4;
                }
                f2 = ((float) j) / 1000.0f;
            } else {
                f2 = (float) (this.mVideoCompileEncodeSetting.mHWEncodeSetting.mBitrate / 1000);
            }
            f4 = f3 - f2;
            float f52 = f3 * 1000.0f;
            this.mVideoCompileEncodeSetting.mHWEncodeSetting.mBitrate = (long) f52;
            C85315al.m146637a("VEVideoEncodeSettings", "compileProbe HW setVideoHWoptBitrate end! optBitrate= " + f52 + " diff_bitrate =" + f4);
            return f4;
        }
        C85315al.m146642d("VEVideoEncodeSettings", "compileProbe 576P || 720P: output resolution is not as expected");
        return -1.0f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0191  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public float setVideoHWoptBitrate(com.p2082ss.android.vesdk.VESize r27, com.p2082ss.android.vesdk.C85542r r28, java.lang.String r29) {
        /*
        // Method dump skipped, instructions count: 455
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.vesdk.VEVideoEncodeSettings.setVideoHWoptBitrate(com.ss.android.vesdk.VESize, com.ss.android.vesdk.r, java.lang.String):float");
    }

    private float[] bitrateRangeSettingsJsonStr(String str, boolean z, float f, int i) {
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = new JSONArray();
            if (716 < i && i < 724) {
                jSONArray = z ? jSONObject.optJSONArray("720P_HD") : f == 7000.0f ? jSONObject.optJSONArray("720P_Base_7Mb") : jSONObject.optJSONArray("720P");
            } else if (1076 < i && i < 1089) {
                jSONArray = jSONObject.optJSONArray("1080P");
            } else if (572 < i && i < 580) {
                jSONArray = f == 7000.0f ? jSONObject.optJSONArray("576P_Base_7Mb") : jSONObject.optJSONArray("576P");
            }
            if (jSONArray == null) {
                C85315al.m146642d("VEVideoEncodeSettings", "bitrateRange json parse failed");
                return null;
            }
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                fArr[i2] = (float) jSONArray.getDouble(i2);
            }
            return fArr;
        } catch (JSONException e) {
            e.printStackTrace();
            C85315al.m146642d("VEVideoEncodeSettings", "bitrateRange json str parse error : " + e.getLocalizedMessage());
        }
    }

    public VEVideoEncodeSettings(VESize vESize, boolean z, int i, int i2) {
        this.resizeMode = 2;
        this.speed = 1.0f;
        this.outputSize = new VESize(576, 1024);
        this.watermarkSize = new VESize(-1, -1);
        this.externalSettingsJsonStr = null;
        this.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR;
        this.bps = 4194304;
        this.swCRF = 15;
        this.swQPOffset = 0.0d;
        this.swQP = 15;
        this.fps = -1;
        this.gopSize = 60;
        this.swPreset = ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST.ordinal();
        this.encodeStandard = ENCODE_STANDARD.ENCODE_STANDARD_H264.ordinal();
        this.encodeProfile = ENCODE_PROFILE.ENCODE_PROFILE_UNKNOWN.ordinal();
        this.swMaxrate = 15000000;
        this.enableRemuxVideoRes = -1;
        this.hasBFrame = false;
        this.mRecordingMp4 = false;
        this.mTransitionKeyframeEnable = false;
        this.mReEncodeOpt = false;
        this.mResolutionAlign = 16;
        this.mKeyFramePoints = null;
        this.banExtraDataLoop = false;
        this.outputSize = vESize;
        this.isSupportHWEncoder = z;
        this.fps = i;
        this.gopSize = i2;
        this.compileType = COMPILE_TYPE.COMPILE_TYPE_MP4;
        initFromVEConfigCenter();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0208, code lost:
        if (r4 > r2) goto L_0x020a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x026d, code lost:
        if (r4 < r2) goto L_0x020a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x025a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.p2082ss.android.vesdk.C85320ap getHwAdaptiveBitrate(int r27, com.p2082ss.android.vesdk.C85542r r28, float r29, java.lang.String r30, java.lang.String r31) {
        /*
        // Method dump skipped, instructions count: 624
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.vesdk.VEVideoEncodeSettings.getHwAdaptiveBitrate(int, com.ss.android.vesdk.r, float, java.lang.String, java.lang.String):com.ss.android.vesdk.ap");
    }

    public VEVideoEncodeSettings(VESize vESize, boolean z, int i, int i2, int i3, int i4, boolean z2) {
        this.resizeMode = 2;
        this.speed = 1.0f;
        this.outputSize = new VESize(576, 1024);
        this.watermarkSize = new VESize(-1, -1);
        this.externalSettingsJsonStr = null;
        this.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR;
        this.bps = 4194304;
        this.swCRF = 15;
        this.swQPOffset = 0.0d;
        this.swQP = 15;
        this.fps = -1;
        this.gopSize = 60;
        this.swPreset = ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST.ordinal();
        this.encodeStandard = ENCODE_STANDARD.ENCODE_STANDARD_H264.ordinal();
        this.encodeProfile = ENCODE_PROFILE.ENCODE_PROFILE_UNKNOWN.ordinal();
        this.swMaxrate = 15000000;
        this.enableRemuxVideoRes = -1;
        this.hasBFrame = false;
        this.mRecordingMp4 = false;
        this.mTransitionKeyframeEnable = false;
        this.mReEncodeOpt = false;
        this.mResolutionAlign = 16;
        this.mKeyFramePoints = null;
        this.banExtraDataLoop = false;
        this.outputSize = vESize;
        this.isSupportHWEncoder = z;
        this.fps = i;
        this.gopSize = i2;
        this.bps = i3;
        this.swPreset = i4;
        this.hasBFrame = z2;
        this.compileType = COMPILE_TYPE.COMPILE_TYPE_MP4;
        initFromVEConfigCenter();
    }

    private float get_adaptive_encode_bitrate(int i, int i2, int i3, int i4, int i5, float f, float f2, float[] fArr, float f3) {
        float[] fArr2;
        float[] fArr3;
        float[] fArr4;
        float[] fArr5;
        float[] fArr6;
        float[] fArr7;
        float f4;
        float f5;
        float f6;
        float f7;
        if (i4 == 17 || i4 == 18) {
            double d = (double) (i5 / 1000);
            Double.isNaN(d);
            int i6 = (int) (d * 0.8d);
            C85315al.m146637a("VEVideoEncodeSettings", "compileProbe parameters encode_type =" + i3 + " pre_crf =" + i4 + " pre_maxrate =" + i6 + " pre_bitrate =" + f + " pre_psnr =" + f2 + " bitrate_base =" + f3 + " inlength =" + i + " outlength =" + i2);
            if (572 < i && i < 580) {
                fArr2 = new float[]{0.22f, 0.2f, 0.18f, 0.1f, 0.02f, -0.1f};
                fArr3 = new float[]{0.88f, 1.0f, 1.13f, 1.3f};
                fArr4 = new float[]{-0.61f, 0.0f, 0.63f, 1.25f};
                fArr5 = new float[]{1.02f, 1.03f, 1.02f};
                fArr6 = new float[]{0.16f, 0.18f, 0.21f};
                fArr7 = new float[]{2500.0f, 3500.0f, 4500.0f, 5500.0f};
                f4 = 0.0f;
            } else if (716 < i && i < 724) {
                fArr2 = new float[]{0.2f, 0.18f, 0.15f, 0.013f, 0.02f, -0.1f};
                fArr3 = new float[]{0.89f, 1.0f, 1.13f, 1.28f};
                fArr4 = new float[]{-0.6f, 0.0f, 0.61f, 1.24f};
                fArr5 = new float[]{1.01f, 1.0f, 0.99f};
                fArr6 = new float[]{0.18f, 0.15f, 0.18f};
                fArr7 = new float[]{4000.0f, 5000.0f, 6000.0f, 7000.0f};
                f4 = 6000.0f;
            } else if (1076 >= i || i >= 1089) {
                C85315al.m146642d("VEVideoEncodeSettings", "compileProbe input resolution error");
                return -1.0f;
            } else {
                fArr2 = new float[]{0.02f, 0.01f, 0.0f, 0.0f, -0.03f, -0.08f};
                fArr3 = new float[]{0.86f, 1.0f, 1.1f, 1.24f};
                fArr4 = new float[]{-0.58f, 0.0f, 0.48f, 1.0f};
                fArr5 = new float[]{1.02f, 1.03f, 1.02f};
                fArr6 = new float[]{0.24f, 0.25f, 0.28f};
                fArr7 = new float[]{8500.0f, 9500.0f, 10500.0f, 11500.0f};
                f4 = 10500.0f;
            }
            float[] fArr8 = {0.0f, 42.0f, 45.0f, 46.0f, 48.0f, 50.0f, 101.0f};
            int i7 = (i4 - 18) + 1;
            float f8 = f * fArr3[i7];
            float f9 = f2 + fArr4[i7];
            if (i3 == 1) {
                f8 *= fArr5[i7];
                f9 = Math.min(f9 + fArr6[i7], fArr8[6]);
            }
            C85315al.m146637a("VEVideoEncodeSettings", "compileProbe according to encoder_type the calculation pre_bitrate= " + f8 + " pre_psnr =" + f9);
            int i8 = 0;
            if (Math.abs(i - i2) < 8) {
                f5 = fArr[fArr.length - 1];
                f6 = fArr[0];
                f4 = f3;
                fArr7 = fArr;
            } else {
                f5 = fArr7[fArr.length - 1];
                f6 = fArr7[0];
                f8 = Math.min(f8, (float) i6);
            }
            float f10 = (float) i6;
            float f11 = f5 - (((f5 - f6) * (f10 - f8)) / f10);
            int i9 = 0;
            while (true) {
                if (f9 > fArr8[i9] && f9 <= fArr8[i9 + 1]) {
                    f7 = f4 * fArr2[i9];
                    break;
                }
                i9++;
                if (i9 >= 6) {
                    f7 = 0.0f;
                    break;
                }
            }
            C85315al.m146637a("VEVideoEncodeSettings", "compileProbe bitrate_offset= ".concat(String.valueOf(f7)));
            float f12 = f11 + f7;
            C85315al.m146637a("VEVideoEncodeSettings", "compileProbe before trans_bitrate= ".concat(String.valueOf(f12)));
            if (f12 >= fArr7[0]) {
                if (f12 > fArr7[fArr7.length - 1]) {
                    i8 = fArr7.length - 1;
                } else {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= fArr7.length - 1) {
                            break;
                        }
                        if (f12 >= fArr7[i10]) {
                            int i11 = i10 + 1;
                            if (f12 < fArr7[i11]) {
                                i8 = f12 - fArr7[i10] < fArr7[i11] - f12 ? i10 : i11;
                            }
                        }
                        i10++;
                    }
                }
            }
            float f13 = fArr[i8];
            C85315al.m146637a("VEVideoEncodeSettings", "compileProbe  trans_bitrate= ".concat(String.valueOf(f13)));
            return f13;
        }
        C85315al.m146642d("VEVideoEncodeSettings", "compileProbe pre_crf illegal");
        return -1.0f;
    }
}
