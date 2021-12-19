package com.p2082ss.android.ugc.aweme.feed.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC27894b;
import com.google.gson.C27896c;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.model.BitRate */
public class BitRate implements AbstractC81964c, Serializable {
    private static final long serialVersionUID = 4166900069421013042L;
    @AbstractC27891c(mo46611a = "bit_rate")
    public int bitRate;
    @AbstractC27891c(mo46611a = "gear_name")
    public String gearName;
    @AbstractC27891c(mo46611a = "is_bytevc1")
    public int isBytevc1;
    @AbstractC27891c(mo46611a = "play_addr")
    public UrlModel playAddr;
    @AbstractC27891c(mo46611a = "quality_type")
    public int qualityType;

    static {
        Covode.recordClassIndex(58654);
    }

    @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c
    public int getBitRate() {
        return this.bitRate;
    }

    @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c
    public String getGearName() {
        return this.gearName;
    }

    public UrlModel getPlayAddr() {
        return this.playAddr;
    }

    @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c
    public int getQualityType() {
        return this.qualityType;
    }

    @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c
    public int isBytevc1() {
        return this.isBytevc1;
    }

    @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c
    public int getSize() {
        UrlModel urlModel = this.playAddr;
        if (urlModel != null) {
            return (int) urlModel.getSize();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c
    public String getChecksum() {
        UrlModel urlModel = this.playAddr;
        if (urlModel == null || !(urlModel instanceof VideoUrlModel) || TextUtils.isEmpty(((VideoUrlModel) urlModel).getFileCheckSum())) {
            return null;
        }
        return ((VideoUrlModel) this.playAddr).getFileCheckSum();
    }

    @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c
    public String getUrlKey() {
        UrlModel urlModel = this.playAddr;
        if (urlModel == null || TextUtils.isEmpty(urlModel.getUrlKey())) {
            return null;
        }
        return this.playAddr.getUrlKey();
    }

    @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c
    public List<String> urlList() {
        if (getPlayAddr() != null) {
            return getPlayAddr().getUrlList();
        }
        return Collections.emptyList();
    }

    public String toString() {
        return "BitRate{bitRate=" + this.bitRate + ", gearName='" + this.gearName + '\'' + ", qualityType=" + this.qualityType + ", isBytevc1=" + this.isBytevc1 + '}';
    }

    public void setBitRate(int i) {
        this.bitRate = i;
    }

    public void setBytevc1(int i) {
        this.isBytevc1 = i;
    }

    public void setGearName(String str) {
        this.gearName = str;
    }

    public void setPlayAddr(UrlModel urlModel) {
        this.playAddr = urlModel;
    }

    public void setQualityType(int i) {
        this.qualityType = i;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.model.BitRate$ExcludeStrategy */
    public static class ExcludeStrategy implements AbstractC27894b {
        static {
            Covode.recordClassIndex(58655);
        }

        @Override // com.google.gson.AbstractC27894b
        public boolean shouldSkipClass(Class<?> cls) {
            return false;
        }

        @Override // com.google.gson.AbstractC27894b
        public boolean shouldSkipField(C27896c cVar) {
            if (cVar.f65504a.getDeclaringClass() != BitRate.class) {
                return false;
            }
            if (cVar.f65504a.getName().equals("playAddr") || cVar.f65504a.getName().equals("playAddrBytevc1") || cVar.f65504a.getName().equals("gear_name")) {
                return true;
            }
            return false;
        }
    }
}
