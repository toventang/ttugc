package com.p2082ss.android.ugc.playerkit.simapicommon.p4325a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.playerkit.simapicommon.a.e */
public final class C84237e implements AbstractC81964c, Serializable {
    private static final long serialVersionUID = 4166900069421013042L;
    @AbstractC27891c(mo46611a = "bit_rate")

    /* renamed from: a */
    int f188344a;
    @AbstractC27891c(mo46611a = "gear_name")

    /* renamed from: b */
    String f188345b;
    @AbstractC27891c(mo46611a = "quality_type")

    /* renamed from: c */
    int f188346c;
    @AbstractC27891c(mo46611a = "play_addr")

    /* renamed from: d */
    C84239g f188347d;

    /* renamed from: e */
    int f188348e;
    public Object origin;
    @AbstractC27891c(mo46611a = "play_addr_bytevc1")
    public C84239g playAddrBytevc1;

    static {
        Covode.recordClassIndex(98146);
    }

    @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c
    public final int getBitRate() {
        return this.f188344a;
    }

    @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c
    public final String getGearName() {
        return this.f188345b;
    }

    public final int getIsBytevc1() {
        return this.f188348e;
    }

    public final C84239g getPlayAddr() {
        return this.f188347d;
    }

    @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c
    public final int getQualityType() {
        return this.f188346c;
    }

    @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c
    public final int isBytevc1() {
        return this.f188348e;
    }

    @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c
    public final int getSize() {
        C84239g gVar = this.f188347d;
        if (gVar != null) {
            return (int) gVar.getSize();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c
    public final String getChecksum() {
        C84239g gVar = this.f188347d;
        if (gVar == null || TextUtils.isEmpty(gVar.getFileCheckSum())) {
            return null;
        }
        return this.f188347d.getFileCheckSum();
    }

    @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c
    public final String getUrlKey() {
        C84239g gVar = this.f188347d;
        if (gVar == null || TextUtils.isEmpty(gVar.getUrlKey())) {
            return null;
        }
        return this.f188347d.getUrlKey();
    }

    @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c
    public final List<String> urlList() {
        if (getPlayAddr() != null) {
            return getPlayAddr().getUrlList();
        }
        return Collections.emptyList();
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = this.f188344a * 31;
        String str = this.f188345b;
        int i4 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i5 = (((i3 + i) * 31) + this.f188346c) * 31;
        C84239g gVar = this.f188347d;
        if (gVar != null) {
            i2 = gVar.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (((i5 + i2) * 31) + this.f188348e) * 31;
        C84239g gVar2 = this.playAddrBytevc1;
        if (gVar2 != null) {
            i4 = gVar2.hashCode();
        }
        return i6 + i4;
    }

    public final String toString() {
        return "SimBitRate{bitRate=" + this.f188344a + ", gearName='" + this.f188345b + '\'' + ", qualityType=" + this.f188346c + ", isBytevc1=" + this.f188348e + '}';
    }

    public final void setBitRate(int i) {
        this.f188344a = i;
    }

    public final void setBytevc1(int i) {
        this.f188348e = i;
    }

    public final void setGearName(String str) {
        this.f188345b = str;
    }

    public final void setPlayAddr(C84239g gVar) {
        this.f188347d = gVar;
    }

    public final void setQualityType(int i) {
        this.f188346c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C84237e eVar = (C84237e) obj;
            if (this.f188344a != eVar.f188344a || this.f188346c != eVar.f188346c || this.f188348e != eVar.f188348e) {
                return false;
            }
            String str = this.f188345b;
            if (str == null ? eVar.f188345b != null : !str.equals(eVar.f188345b)) {
                return false;
            }
            C84239g gVar = this.f188347d;
            if (gVar == null ? eVar.f188347d != null : !gVar.equals(eVar.f188347d)) {
                return false;
            }
            C84239g gVar2 = this.playAddrBytevc1;
            C84239g gVar3 = eVar.playAddrBytevc1;
            if (gVar2 != null) {
                return gVar2.equals(gVar3);
            }
            if (gVar3 == null) {
                return true;
            }
        }
        return false;
    }
}
