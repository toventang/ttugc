package com.bytedance.android.livesdk.config;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.HashMap;
import java.util.Map;

public class LiveStreamTestConfig {
    @AbstractC27891c(mo46611a = "defaultbBitRate")
    public int mDefaultBitrate = -1;
    @AbstractC27891c(mo46611a = "enable")
    public boolean mEnable;
    @AbstractC27891c(mo46611a = "fps")
    public int mFps = -1;
    @AbstractC27891c(mo46611a = "height")
    public int mHeight = -1;
    @AbstractC27891c(mo46611a = "maxBitRate")
    public int mMaxBitrate = -1;
    @AbstractC27891c(mo46611a = "minBitRate")
    public int mMinBitrate = -1;
    @AbstractC27891c(mo46611a = "mixDefaultBitRate")
    public int mMixDefaultBitrate = -1;
    @AbstractC27891c(mo46611a = "mixMaxBitRate")
    public int mMixMaxBitrate = -1;
    @AbstractC27891c(mo46611a = "minMinBitRate")
    public int mMixMinBitrate = -1;
    @AbstractC27891c(mo46611a = "useHardware")
    public boolean mUseHardware = true;
    @AbstractC27891c(mo46611a = "vCode")
    public String mVCodec = "";
    @AbstractC27891c(mo46611a = "with")
    public int mWidth = -1;

    static {
        Covode.recordClassIndex(9033);
    }

    public Map<String, String> getStringMap() {
        HashMap hashMap = new HashMap();
        if (!this.mEnable) {
            return hashMap;
        }
        try {
            int i = this.mWidth;
            if (i > 0) {
                hashMap.put("width", String.valueOf(i));
            }
            int i2 = this.mHeight;
            if (i2 > 0) {
                hashMap.put("height", String.valueOf(i2));
            }
            int i3 = this.mDefaultBitrate;
            if (i3 > 0) {
                hashMap.put("defaultBitrate", String.valueOf(i3));
            }
            int i4 = this.mMinBitrate;
            if (i4 > 0) {
                hashMap.put("minBitrate", String.valueOf(i4));
            }
            int i5 = this.mMaxBitrate;
            if (i5 > 0) {
                hashMap.put("maxBitrate", String.valueOf(i5));
            }
            int i6 = this.mFps;
            if (i6 > 0) {
                hashMap.put("fps", String.valueOf(i6));
            }
            if (!TextUtils.isEmpty(this.mVCodec)) {
                hashMap.put("vCodec", this.mVCodec);
            }
            hashMap.put("useHardware", String.valueOf(this.mUseHardware));
            int i7 = this.mMixMaxBitrate;
            if (i7 > 0) {
                hashMap.put("mixMaxBitrate", String.valueOf(i7));
            }
            int i8 = this.mMixDefaultBitrate;
            if (i8 > 0) {
                hashMap.put("mixDefaultBitrate", String.valueOf(i8));
            }
            int i9 = this.mMixMinBitrate;
            if (i9 > 0) {
                hashMap.put("mixMinBitrate", String.valueOf(i9));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hashMap;
    }
}
