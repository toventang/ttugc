package com.p2082ss.android.ugc.playerkit.simapicommon.p4325a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28019l;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.playerkit.simapicommon.a.h */
public class C84240h implements Serializable {

    /* renamed from: a */
    C84241i f188363a;

    /* renamed from: b */
    C84241i f188364b;
    @AbstractC27891c(mo46611a = "cla_info")

    /* renamed from: c */
    C84233b f188365c;
    @AbstractC27891c(mo46611a = "cdn_url_expired")
    public long cdnUrlExpired;
    @AbstractC27891c(mo46611a = "play_addr_h264")

    /* renamed from: d */
    C84241i f188366d;
    @AbstractC27891c(mo46611a = "video_model")

    /* renamed from: e */
    String f188367e;
    @AbstractC27891c(mo46611a = "big_thumbs")

    /* renamed from: f */
    List<AbstractC28019l> f188368f;
    @AbstractC27891c(mo46611a = "token_auth")

    /* renamed from: g */
    C84238f f188369g;
    @AbstractC27891c(mo46611a = "height")

    /* renamed from: h */
    int f188370h;
    @AbstractC27891c(mo46611a = "width")

    /* renamed from: i */
    int f188371i;
    @AbstractC27891c(mo46611a = "is_bytevc1")
    public Integer isBytevc1;
    @AbstractC27891c(mo46611a = "is_long_video")
    public Integer isLongVideo;
    @AbstractC27891c(mo46611a = "ratio")

    /* renamed from: j */
    String f188372j;
    @AbstractC27891c(mo46611a = "duration")

    /* renamed from: k */
    int f188373k;
    @AbstractC27891c(mo46611a = "bit_rate")

    /* renamed from: l */
    List<C84237e> f188374l;

    /* renamed from: m */
    boolean f188375m;
    @AbstractC27891c(mo46611a = "need_set_token")

    /* renamed from: n */
    boolean f188376n;
    @AbstractC27891c(mo46611a = "meta")

    /* renamed from: o */
    String f188377o;
    public Object origin;
    @AbstractC27891c(mo46611a = "is_drm_source")

    /* renamed from: p */
    boolean f188378p;
    @AbstractC27891c(mo46611a = "play_addr_lowbr")
    public C84239g playAddrLowbr;

    /* renamed from: q */
    private String f188379q;

    static {
        Covode.recordClassIndex(98149);
    }

    public boolean isLowBr() {
        return false;
    }

    public boolean enableIntertrustDrm() {
        return this.f188378p;
    }

    public List<C84237e> getBitRate() {
        return this.f188374l;
    }

    public C84233b getClaInfo() {
        return this.f188365c;
    }

    public C84238f getDrmTokenAuth() {
        return this.f188369g;
    }

    public int getDuration() {
        return this.f188373k;
    }

    public C84241i getH264PlayAddr() {
        return this.f188366d;
    }

    public int getHeight() {
        return this.f188370h;
    }

    public Integer getIsBytevc1() {
        return this.isBytevc1;
    }

    public String getMeta() {
        return this.f188377o;
    }

    public String getRatio() {
        return this.f188372j;
    }

    public String getSourceId() {
        return this.f188379q;
    }

    public int getVideoLength() {
        return this.f188373k;
    }

    public String getVideoModelStr() {
        return this.f188367e;
    }

    public List<AbstractC28019l> getVideoThumbs() {
        return this.f188368f;
    }

    public int getWidth() {
        return this.f188371i;
    }

    public boolean isColdBoot() {
        return this.f188375m;
    }

    public boolean isNeedSetCookie() {
        return this.f188376n;
    }

    public C84241i getProperPlayAddr() {
        return getPlayAddr();
    }

    public int getVidPlayVersion() {
        C84238f fVar = this.f188369g;
        if (fVar != null) {
            return fVar.getVersion();
        }
        return 1;
    }

    public String getVideoId() {
        C84238f fVar = this.f188369g;
        if (fVar != null) {
            return fVar.getVid();
        }
        return null;
    }

    public String getVideoIdApiHost() {
        C84238f fVar = this.f188369g;
        if (fVar != null) {
            return fVar.tryGetHost();
        }
        return null;
    }

    public String getVideoIdAuth() {
        C84238f fVar = this.f188369g;
        if (fVar != null) {
            return fVar.getAuth();
        }
        return null;
    }

    public String getVideoIdPToken() {
        C84238f fVar = this.f188369g;
        if (fVar != null) {
            return fVar.getToken();
        }
        return null;
    }

    public C84241i getPlayAddrBytevc1() {
        m144844a();
        C84241i iVar = this.f188364b;
        if (iVar != null) {
            iVar.setBytevc1(true);
            this.f188364b.setRatio(this.f188372j);
        }
        return this.f188364b;
    }

    public C84241i getPlayAddrH264() {
        m144844a();
        C84241i iVar = this.f188363a;
        if (iVar != null) {
            iVar.setBytevc1(false);
            this.f188363a.setRatio(this.f188372j);
        }
        return this.f188363a;
    }

    /* renamed from: a */
    private void m144844a() {
        List<C84237e> list;
        List<C84237e> list2;
        C84241i iVar = this.f188364b;
        if (!(iVar == null || iVar.getBitRate() == (list2 = this.f188374l))) {
            this.f188364b.setBitRate(list2);
            this.f188364b.setDuration((double) this.f188373k);
            this.f188364b.setBytevc1(true);
        }
        C84241i iVar2 = this.f188363a;
        if (iVar2 != null && iVar2.getBitRate() != (list = this.f188374l)) {
            this.f188363a.setBitRate(list);
            this.f188363a.setDuration((double) this.f188373k);
            this.f188363a.setBytevc1(false);
        }
    }

    public C84241i getPlayAddr() {
        m144844a();
        C84241i iVar = this.f188364b;
        if (iVar != null) {
            iVar.setBytevc1(true);
            this.f188364b.setRatio(this.f188372j);
        }
        C84241i iVar2 = this.f188363a;
        if (iVar2 != null) {
            iVar2.setBytevc1(false);
            this.f188363a.setRatio(this.f188372j);
        }
        if (checkVideo(this.f188364b)) {
            return this.f188364b;
        }
        return this.f188363a;
    }

    public String toString() {
        return "SimVideo{playAddr=" + this.f188363a + ", playAddrBytevc1=" + this.f188364b + ", height=" + this.f188370h + ", width=" + this.f188371i + ", ratio='" + this.f188372j + '\'' + ", downloadAddr=, hasWaterMark=, videoLength=" + this.f188373k + ", bitRate=" + this.f188374l + ", newDownloadAddr=, suffixLogoAddr=, hasSuffixWaterMark=, needSetCookie=" + this.f188376n + ", misc_download_addrs=, isCallback=}";
    }

    public void setBitRate(List<C84237e> list) {
        this.f188374l = list;
    }

    public void setClaInfo(C84233b bVar) {
        this.f188365c = bVar;
    }

    public void setColdBoot(boolean z) {
        this.f188375m = z;
    }

    public void setDrmTokenAuth(C84238f fVar) {
        this.f188369g = fVar;
    }

    public void setDuration(double d) {
        this.f188373k = (int) d;
    }

    public void setEnableIntertrustDrm(boolean z) {
        this.f188378p = z;
    }

    public void setHeight(int i) {
        this.f188370h = i;
    }

    public void setIsBytevc1(Integer num) {
        this.isBytevc1 = num;
    }

    public void setMeta(String str) {
        this.f188377o = str;
    }

    public void setNeedSetCookie(boolean z) {
        this.f188376n = z;
    }

    public void setPlayAddr(C84241i iVar) {
        this.f188363a = iVar;
    }

    public void setPlayAddrBytevc1(C84241i iVar) {
        this.f188364b = iVar;
    }

    public void setPlayAddrH264(C84241i iVar) {
        this.f188366d = iVar;
    }

    public void setRatio(String str) {
        this.f188372j = str;
    }

    public void setSourceId(String str) {
        setRationAndSourceId(str);
    }

    public void setVideoLength(int i) {
        this.f188373k = i;
    }

    public void setVideoModelStr(String str) {
        this.f188367e = str;
    }

    public void setVideoThumbs(List<AbstractC28019l> list) {
        this.f188368f = list;
    }

    public void setWidth(int i) {
        this.f188371i = i;
    }

    public void setRationAndSourceId(String str) {
        C84241i iVar = this.f188364b;
        if (iVar != null) {
            iVar.setRatio(this.f188372j).setSourceId(str);
            this.f188364b.setBytevc1(true);
        }
        C84241i iVar2 = this.f188363a;
        if (iVar2 != null) {
            iVar2.setRatio(this.f188372j).setSourceId(str);
            this.f188363a.setBytevc1(false);
        }
        this.f188379q = str;
    }

    public boolean checkVideo(C84239g gVar) {
        List<String> urlList;
        if (!(gVar == null || (urlList = gVar.getUrlList()) == null || urlList.isEmpty())) {
            ArrayList arrayList = new ArrayList();
            for (String str : urlList) {
                if (!TextUtils.isEmpty(str)) {
                    arrayList.add(str);
                }
            }
            gVar.setUrlList(arrayList);
            if (urlList.isEmpty() || TextUtils.isEmpty(gVar.getUri())) {
                return false;
            }
            return true;
        }
        return false;
    }
}
