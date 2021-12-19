package com.p2082ss.android.ugc.playerkit.simapicommon.p4325a;

import android.os.SystemClock;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.playerkit.simapicommon.a.i */
public class C84241i extends C84239g {
    private static final long serialVersionUID = 4566748102483196885L;

    /* renamed from: i */
    private String f188380i;

    /* renamed from: j */
    private String f188381j;

    /* renamed from: k */
    private boolean f188382k;

    /* renamed from: l */
    private boolean f188383l;
    @AbstractC27891c(mo46611a = "duration")

    /* renamed from: m */
    private double f188384m;
    @AbstractC27891c(mo46611a = "bit_rate")

    /* renamed from: n */
    private List<C84237e> f188385n;

    /* renamed from: o */
    private transient AbstractC81964c f188386o;

    /* renamed from: p */
    private String f188387p;

    /* renamed from: q */
    private long f188388q = SystemClock.elapsedRealtime();

    /* renamed from: r */
    private long f188389r;

    /* renamed from: s */
    private float f188390s;

    /* renamed from: t */
    private String f188391t;

    /* renamed from: u */
    private String f188392u;

    /* renamed from: v */
    private long f188393v;

    /* renamed from: w */
    private boolean f188394w;

    /* renamed from: x */
    private int f188395x;

    /* renamed from: y */
    private String f188396y;

    static {
        Covode.recordClassIndex(98150);
    }

    /* renamed from: com_ss_android_ugc_playerkit_simapicommon_model_SimVideoUrlModel_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m144845xb4547450(String str, String str2) {
        return 0;
    }

    public float getAspectRatio() {
        return this.f188390s;
    }

    public long getCdnUrlExpired() {
        return this.f188389r;
    }

    public long getCreateTime() {
        return this.f188388q;
    }

    public String getDashVideoId() {
        return this.f188392u;
    }

    public String getDashVideoModelStr() {
        return this.f188391t;
    }

    public double getDuration() {
        return this.f188384m;
    }

    @Override // com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84239g
    public String getFileCheckSum() {
        return this.f188362h;
    }

    public String getFileKey() {
        return this.f188396y;
    }

    public AbstractC81964c getHitBitrate() {
        return this.f188386o;
    }

    public int getInfoId() {
        return this.f188395x;
    }

    public String getOriginUri() {
        return this.uri;
    }

    public long getPreloadMillSec() {
        return this.f188393v;
    }

    public String getRatio() {
        return this.f188381j;
    }

    public String getSourceId() {
        return this.f188380i;
    }

    @Override // com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84239g
    public String getaK() {
        return this.f188361g;
    }

    public boolean isBytevc1() {
        return this.f188383l;
    }

    public boolean isColdBoot() {
        return this.f188394w;
    }

    public boolean isVr() {
        return this.f188382k;
    }

    public List<C84237e> getBitRate() {
        List<C84237e> list = this.f188385n;
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    @Override // com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84239g
    public String getUri() {
        if (!TextUtils.isEmpty(getUrlKey())) {
            return getUrlKey();
        }
        return getRatioUri();
    }

    public String getRatioUri() {
        String str;
        if (this.f188387p == null) {
            String str2 = "";
            if (isBytevc1()) {
                str = "bytevc1";
            } else {
                str = str2;
            }
            if (this.uri != null) {
                StringBuilder append = new StringBuilder().append(this.uri);
                String str3 = this.f188381j;
                if (str3 != null) {
                    str2 = str3;
                }
                str2 = append.append(str2).append(str).toString();
            }
            this.f188387p = str2;
        }
        return this.f188387p;
    }

    public String getBitRatedRatioUri() {
        String str;
        AbstractC81964c cVar = this.f188386o;
        if (cVar == null) {
            return getUri();
        }
        String urlKey = cVar.getUrlKey();
        m144845xb4547450("wbp_preload_all_path", C1764a.m5928a("getBitRatedRatioUri hitBitrate: result:%s, bytevc1:%s", new Object[]{urlKey, Integer.valueOf(cVar.isBytevc1())}));
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

    @Override // com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84239g
    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int hashCode = super.hashCode() * 31;
        String str = this.f188380i;
        int i5 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i6 = (((hashCode + i) * 31) + (this.f188383l ? 1 : 0)) * 31;
        List<C84237e> list = this.f188385n;
        if (list != null) {
            i2 = list.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        String str2 = this.f188387p;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        String str3 = this.f188391t;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        String str4 = this.f188392u;
        if (str4 != null) {
            i5 = str4.hashCode();
        }
        return i9 + i5;
    }

    public String toString() {
        return "SimVideoUrlModel{uri='" + this.uri + '\'' + ", urlList=" + this.f188355a + "sourceId='" + this.f188380i + '\'' + ", ratio='" + this.f188381j + '\'' + ", mVr=" + this.f188382k + ", duration=" + this.f188384m + ", bitRate=" + this.f188385n + ", createTime=" + this.f188388q + ", isBytevc1=" + this.f188383l + '}';
    }

    public void setAspectRatio(float f) {
        this.f188390s = f;
    }

    public void setBitRate(List<C84237e> list) {
        this.f188385n = list;
    }

    public void setBytevc1(boolean z) {
        this.f188383l = z;
    }

    public void setCdnUrlExpired(long j) {
        this.f188389r = j;
    }

    public void setColdBoot(boolean z) {
        this.f188394w = z;
    }

    public void setDashVideoId(String str) {
        this.f188392u = str;
    }

    public void setDashVideoModelStr(String str) {
        this.f188391t = str;
    }

    public void setDuration(double d) {
        this.f188384m = d;
    }

    @Override // com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84239g
    public void setFileCheckSum(String str) {
        this.f188362h = str;
    }

    public void setFileKey(String str) {
        this.f188396y = str;
    }

    public void setHitBitrate(AbstractC81964c cVar) {
        this.f188386o = cVar;
    }

    public void setInfoId(int i) {
        this.f188395x = i;
    }

    public void setPreloadMillSec(long j) {
        this.f188393v = j;
    }

    public C84241i setRatio(String str) {
        this.f188381j = str;
        return this;
    }

    public C84241i setSourceId(String str) {
        this.f188380i = str;
        return this;
    }

    public void setVr(boolean z) {
        this.f188382k = z;
    }

    @Override // com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84239g
    public void setaK(String str) {
        this.f188361g = str;
    }

    @Override // com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84239g
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C84241i iVar = (C84241i) obj;
        if (this.f188383l != iVar.f188383l) {
            return false;
        }
        String str = this.f188380i;
        if (str == null ? iVar.f188380i != null : !str.equals(iVar.f188380i)) {
            return false;
        }
        List<C84237e> list = this.f188385n;
        if (list == null ? iVar.f188385n != null : !list.equals(iVar.f188385n)) {
            return false;
        }
        String str2 = this.f188387p;
        if (str2 == null ? iVar.f188387p != null : !str2.equals(iVar.f188387p)) {
            return false;
        }
        String str3 = this.f188391t;
        if (str3 == null ? iVar.f188391t != null : !str3.equals(iVar.f188391t)) {
            return false;
        }
        String str4 = this.f188392u;
        String str5 = iVar.f188392u;
        if (str4 != null) {
            return str4.equals(str5);
        }
        if (str5 == null) {
            return true;
        }
        return false;
    }
}
