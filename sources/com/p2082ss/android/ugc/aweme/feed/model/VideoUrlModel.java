package com.p2082ss.android.ugc.aweme.feed.model;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.model.VideoUrlModel */
public class VideoUrlModel extends UrlModel {
    private static final long serialVersionUID = 4566748102483196885L;
    @AbstractC27891c(mo46611a = "bit_rate")
    public List<BitRate> bitRate;
    public long createTime = SystemClock.elapsedRealtime();
    @AbstractC27891c(mo46611a = "duration")
    public double duration;
    @AbstractC27891c(mo46611a = "file_cs")
    public String fileCheckSum;
    public transient AbstractC81964c hitBitrate;
    public boolean isBytevc1;
    public String mDashVideoId;
    public String mDashVideoModelString;
    public boolean mVr;
    public String ratio;
    public String ratioUri;
    public String sourceId;
    public String videoAdTag;

    static {
        Covode.recordClassIndex(58777);
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public String getDashVideoId() {
        return this.mDashVideoId;
    }

    public String getDashVideoModelStr() {
        return this.mDashVideoModelString;
    }

    public double getDuration() {
        return this.duration;
    }

    public String getFileCheckSum() {
        return this.fileCheckSum;
    }

    public AbstractC81964c getHitBitrate() {
        return this.hitBitrate;
    }

    public String getOriginUri() {
        return this.uri;
    }

    public String getRatio() {
        return this.ratio;
    }

    public String getSourceId() {
        return this.sourceId;
    }

    public String getVideoAdTag() {
        return this.videoAdTag;
    }

    public boolean isBytevc1() {
        return this.isBytevc1;
    }

    public boolean isVr() {
        return this.mVr;
    }

    public List<BitRate> getBitRate() {
        List<BitRate> list = this.bitRate;
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.model.UrlModel
    public String getUri() {
        if (!TextUtils.isEmpty(getUrlKey())) {
            return getUrlKey();
        }
        return getRatioUri();
    }

    public String getRatioUri() {
        String str;
        if (this.ratioUri == null) {
            String str2 = "";
            if (isBytevc1()) {
                str = "bytevc1";
            } else {
                str = str2;
            }
            if (this.uri != null) {
                StringBuilder append = new StringBuilder().append(this.uri);
                String str3 = this.ratio;
                if (str3 != null) {
                    str2 = str3;
                }
                str2 = append.append(str2).append(str).toString();
            }
            this.ratioUri = str2;
        }
        return this.ratioUri;
    }

    public String getBitRatedRatioUri() {
        String str;
        AbstractC81964c cVar = this.hitBitrate;
        if (cVar == null) {
            return getUri();
        }
        String urlKey = cVar.getUrlKey();
        if (!TextUtils.isEmpty(urlKey)) {
            return urlKey;
        }
        if (cVar.isBytevc1() == 1) {
            str = "bytevc1";
        } else {
            str = "";
        }
        return getUri() + str + "T" + cVar.getBitRate();
    }

    public String toString() {
        List list = this.urlList;
        if (list != null && !list.isEmpty()) {
            list = new ArrayList(this.urlList);
        }
        List list2 = this.bitRate;
        if (list2 != null && !list2.isEmpty()) {
            list2 = new ArrayList(this.bitRate);
        }
        return "VideoUrlModel{uri='" + this.uri + '\'' + ", urlList=" + list + "sourceId='" + this.sourceId + '\'' + ", ratio='" + this.ratio + '\'' + ", mVr=" + this.mVr + ", duration=" + this.duration + ", bitRate=" + list2 + ", createTime=" + this.createTime + ", isBytevc1=" + this.isBytevc1 + '}';
    }

    public void setBitRate(List<BitRate> list) {
        this.bitRate = list;
    }

    public void setBytevc1(boolean z) {
        this.isBytevc1 = z;
    }

    public void setDashVideoId(String str) {
        this.mDashVideoId = str;
    }

    public void setDashVideoModelStr(String str) {
        this.mDashVideoModelString = str;
    }

    public void setDuration(double d) {
        this.duration = d;
    }

    public void setFileCheckSum(String str) {
        this.fileCheckSum = str;
    }

    public void setHitBitrate(AbstractC81964c cVar) {
        this.hitBitrate = cVar;
    }

    public VideoUrlModel setRatio(String str) {
        this.ratio = str;
        return this;
    }

    public VideoUrlModel setSourceId(String str) {
        this.sourceId = str;
        return this;
    }

    public void setVideoAdTag(String str) {
        this.videoAdTag = str;
    }

    public void setVr(boolean z) {
        this.mVr = z;
    }
}
