package com.p2082ss.android.ugc.aweme.poi;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.poi.PoiData */
public final class PoiData implements Serializable {
    @AbstractC27891c(mo46611a = "log_id")
    private String logId;
    @AbstractC27891c(mo46611a = "address")
    private String mAddress;
    @AbstractC27891c(mo46611a = "city")
    private String mCity;
    @AbstractC27891c(mo46611a = "country")
    private String mCountry;
    @AbstractC27891c(mo46611a = "details")
    private String mDetails;
    @AbstractC27891c(mo46611a = "distance")
    private String mDistance;
    @AbstractC27891c(mo46611a = "district")
    private String mDistrict;
    @AbstractC27891c(mo46611a = "formatted_address")
    private String mFormattedAddress;
    @AbstractC27891c(mo46611a = "id")
    private String mId;
    @AbstractC27891c(mo46611a = "latitude")
    private double mLatitude;
    @AbstractC27891c(mo46611a = "location")
    private String mLocation;
    @AbstractC27891c(mo46611a = "longitude")
    private double mLongitude;
    @AbstractC27891c(mo46611a = StringSet.name)
    private String mName;
    @AbstractC27891c(mo46611a = "province")
    private String mProvince;
    @AbstractC27891c(mo46611a = "service")
    private String mServiceId;
    @AbstractC27891c(mo46611a = "telephone")
    private String mTelephone;
    @AbstractC27891c(mo46611a = "mob_param")
    private PoiMobParam mobParam;

    static {
        Covode.recordClassIndex(73974);
    }

    public PoiData() {
        this(null, null, 0.0d, 0.0d, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    public static /* synthetic */ PoiData copy$default(PoiData poiData, String str, String str2, double d, double d2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, PoiMobParam poiMobParam, String str14, int i, Object obj) {
        String str15 = str2;
        String str16 = str;
        String str17 = str3;
        String str18 = str4;
        double d3 = d2;
        double d4 = d;
        String str19 = str10;
        String str20 = str9;
        String str21 = str5;
        String str22 = str6;
        String str23 = str7;
        String str24 = str8;
        String str25 = str14;
        String str26 = str11;
        PoiMobParam poiMobParam2 = poiMobParam;
        String str27 = str12;
        String str28 = str13;
        if ((i & 1) != 0) {
            str16 = poiData.mId;
        }
        if ((i & 2) != 0) {
            str15 = poiData.mName;
        }
        if ((i & 4) != 0) {
            d4 = poiData.mLatitude;
        }
        if ((i & 8) != 0) {
            d3 = poiData.mLongitude;
        }
        if ((i & 16) != 0) {
            str17 = poiData.mLocation;
        }
        if ((i & 32) != 0) {
            str18 = poiData.mAddress;
        }
        if ((i & 64) != 0) {
            str21 = poiData.mDistrict;
        }
        if ((i & 128) != 0) {
            str22 = poiData.mCity;
        }
        if ((i & 256) != 0) {
            str23 = poiData.mProvince;
        }
        if ((i & 512) != 0) {
            str24 = poiData.mCountry;
        }
        if ((i & 1024) != 0) {
            str20 = poiData.mFormattedAddress;
        }
        if ((i & 2048) != 0) {
            str19 = poiData.mTelephone;
        }
        if ((i & 4096) != 0) {
            str26 = poiData.mDistance;
        }
        if ((i & 8192) != 0) {
            str27 = poiData.mServiceId;
        }
        if ((i & 16384) != 0) {
            str28 = poiData.mDetails;
        }
        if ((32768 & i) != 0) {
            poiMobParam2 = poiData.mobParam;
        }
        if ((i & 65536) != 0) {
            str25 = poiData.logId;
        }
        return poiData.copy(str16, str15, d4, d3, str17, str18, str21, str22, str23, str24, str20, str19, str26, str27, str28, poiMobParam2, str25);
    }

    public final String component1() {
        return this.mId;
    }

    public final String component10() {
        return this.mCountry;
    }

    public final String component11() {
        return this.mFormattedAddress;
    }

    public final String component12() {
        return this.mTelephone;
    }

    public final String component13() {
        return this.mDistance;
    }

    public final String component14() {
        return this.mServiceId;
    }

    public final String component15() {
        return this.mDetails;
    }

    public final PoiMobParam component16() {
        return this.mobParam;
    }

    public final String component17() {
        return this.logId;
    }

    public final String component2() {
        return this.mName;
    }

    public final double component3() {
        return this.mLatitude;
    }

    public final double component4() {
        return this.mLongitude;
    }

    public final String component5() {
        return this.mLocation;
    }

    public final String component6() {
        return this.mAddress;
    }

    public final String component7() {
        return this.mDistrict;
    }

    public final String component8() {
        return this.mCity;
    }

    public final String component9() {
        return this.mProvince;
    }

    public final PoiData copy(String str, String str2, double d, double d2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, PoiMobParam poiMobParam, String str14) {
        return new PoiData(str, str2, d, d2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, poiMobParam, str14);
    }

    public final String toString() {
        return "PoiData(mId=" + this.mId + ", mName=" + this.mName + ", mLatitude=" + this.mLatitude + ", mLongitude=" + this.mLongitude + ", mLocation=" + this.mLocation + ", mAddress=" + this.mAddress + ", mDistrict=" + this.mDistrict + ", mCity=" + this.mCity + ", mProvince=" + this.mProvince + ", mCountry=" + this.mCountry + ", mFormattedAddress=" + this.mFormattedAddress + ", mTelephone=" + this.mTelephone + ", mDistance=" + this.mDistance + ", mServiceId=" + this.mServiceId + ", mDetails=" + this.mDetails + ", mobParam=" + this.mobParam + ", logId=" + this.logId + ")";
    }

    public final String getLogId() {
        return this.logId;
    }

    public final String getMAddress() {
        return this.mAddress;
    }

    public final String getMCity() {
        return this.mCity;
    }

    public final String getMCountry() {
        return this.mCountry;
    }

    public final String getMDetails() {
        return this.mDetails;
    }

    public final String getMDistance() {
        return this.mDistance;
    }

    public final String getMDistrict() {
        return this.mDistrict;
    }

    public final String getMFormattedAddress() {
        return this.mFormattedAddress;
    }

    public final String getMId() {
        return this.mId;
    }

    public final double getMLatitude() {
        return this.mLatitude;
    }

    public final String getMLocation() {
        return this.mLocation;
    }

    public final double getMLongitude() {
        return this.mLongitude;
    }

    public final String getMName() {
        return this.mName;
    }

    public final String getMProvince() {
        return this.mProvince;
    }

    public final String getMServiceId() {
        return this.mServiceId;
    }

    public final String getMTelephone() {
        return this.mTelephone;
    }

    public final PoiMobParam getMobParam() {
        return this.mobParam;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        String str = this.mId;
        int i13 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i14 = i * 31;
        String str2 = this.mName;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int com_ss_android_ugc_aweme_poi_PoiData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = (((((i14 + i2) * 31) + m114086x3de59bc0(this.mLatitude)) * 31) + m114086x3de59bc0(this.mLongitude)) * 31;
        String str3 = this.mLocation;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i15 = (com_ss_android_ugc_aweme_poi_PoiData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + i3) * 31;
        String str4 = this.mAddress;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        int i16 = (i15 + i4) * 31;
        String str5 = this.mDistrict;
        if (str5 != null) {
            i5 = str5.hashCode();
        } else {
            i5 = 0;
        }
        int i17 = (i16 + i5) * 31;
        String str6 = this.mCity;
        if (str6 != null) {
            i6 = str6.hashCode();
        } else {
            i6 = 0;
        }
        int i18 = (i17 + i6) * 31;
        String str7 = this.mProvince;
        if (str7 != null) {
            i7 = str7.hashCode();
        } else {
            i7 = 0;
        }
        int i19 = (i18 + i7) * 31;
        String str8 = this.mCountry;
        if (str8 != null) {
            i8 = str8.hashCode();
        } else {
            i8 = 0;
        }
        int i20 = (i19 + i8) * 31;
        String str9 = this.mFormattedAddress;
        if (str9 != null) {
            i9 = str9.hashCode();
        } else {
            i9 = 0;
        }
        int i21 = (i20 + i9) * 31;
        String str10 = this.mTelephone;
        if (str10 != null) {
            i10 = str10.hashCode();
        } else {
            i10 = 0;
        }
        int i22 = (i21 + i10) * 31;
        String str11 = this.mDistance;
        if (str11 != null) {
            i11 = str11.hashCode();
        } else {
            i11 = 0;
        }
        int i23 = (i22 + i11) * 31;
        String str12 = this.mServiceId;
        if (str12 != null) {
            i12 = str12.hashCode();
        } else {
            i12 = 0;
        }
        int i24 = (i23 + i12) * 31;
        String str13 = this.mDetails;
        if (str13 != null) {
            i13 = str13.hashCode();
        }
        return i24 + i13;
    }

    public final void setLogId(String str) {
        this.logId = str;
    }

    public final void setMAddress(String str) {
        this.mAddress = str;
    }

    public final void setMCity(String str) {
        this.mCity = str;
    }

    public final void setMCountry(String str) {
        this.mCountry = str;
    }

    public final void setMDetails(String str) {
        this.mDetails = str;
    }

    public final void setMDistance(String str) {
        this.mDistance = str;
    }

    public final void setMDistrict(String str) {
        this.mDistrict = str;
    }

    public final void setMFormattedAddress(String str) {
        this.mFormattedAddress = str;
    }

    public final void setMId(String str) {
        this.mId = str;
    }

    public final void setMLatitude(double d) {
        this.mLatitude = d;
    }

    public final void setMLocation(String str) {
        this.mLocation = str;
    }

    public final void setMLongitude(double d) {
        this.mLongitude = d;
    }

    public final void setMName(String str) {
        this.mName = str;
    }

    public final void setMProvince(String str) {
        this.mProvince = str;
    }

    public final void setMServiceId(String str) {
        this.mServiceId = str;
    }

    public final void setMTelephone(String str) {
        this.mTelephone = str;
    }

    public final void setMobParam(PoiMobParam poiMobParam) {
        this.mobParam = poiMobParam;
    }

    /* renamed from: com_ss_android_ugc_aweme_poi_PoiData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m114086x3de59bc0(double d) {
        long doubleToLongBits = Double.doubleToLongBits(d);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C89219l.m154714a(cls2, cls)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.PoiData");
        PoiData poiData = (PoiData) obj;
        if (!(!C89219l.m154714a((Object) this.mId, (Object) poiData.mId)) && !(!C89219l.m154714a((Object) this.mName, (Object) poiData.mName)) && this.mLatitude == poiData.mLatitude && this.mLongitude == poiData.mLongitude && !(!C89219l.m154714a((Object) this.mLocation, (Object) poiData.mLocation)) && !(!C89219l.m154714a((Object) this.mAddress, (Object) poiData.mAddress)) && !(!C89219l.m154714a((Object) this.mDistrict, (Object) poiData.mDistrict)) && !(!C89219l.m154714a((Object) this.mCity, (Object) poiData.mCity)) && !(!C89219l.m154714a((Object) this.mProvince, (Object) poiData.mProvince)) && !(!C89219l.m154714a((Object) this.mCountry, (Object) poiData.mCountry)) && !(!C89219l.m154714a((Object) this.mFormattedAddress, (Object) poiData.mFormattedAddress)) && !(!C89219l.m154714a((Object) this.mTelephone, (Object) poiData.mTelephone)) && !(!C89219l.m154714a((Object) this.mDistance, (Object) poiData.mDistance)) && !(!C89219l.m154714a((Object) this.mServiceId, (Object) poiData.mServiceId)) && !(!C89219l.m154714a((Object) this.mDetails, (Object) poiData.mDetails))) {
            return true;
        }
        return false;
    }

    public PoiData(String str, String str2, double d, double d2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, PoiMobParam poiMobParam, String str14) {
        this.mId = str;
        this.mName = str2;
        this.mLatitude = d;
        this.mLongitude = d2;
        this.mLocation = str3;
        this.mAddress = str4;
        this.mDistrict = str5;
        this.mCity = str6;
        this.mProvince = str7;
        this.mCountry = str8;
        this.mFormattedAddress = str9;
        this.mTelephone = str10;
        this.mDistance = str11;
        this.mServiceId = str12;
        this.mDetails = str13;
        this.mobParam = poiMobParam;
        this.logId = str14;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PoiData(String str, String str2, double d, double d2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, PoiMobParam poiMobParam, String str14, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? 0.0d : d, (i & 8) == 0 ? d2 : 0.0d, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : str9, (i & 2048) != 0 ? null : str10, (i & 4096) != 0 ? null : str11, (i & 8192) != 0 ? null : str12, (i & 16384) != 0 ? null : str13, (32768 & i) != 0 ? null : poiMobParam, (i & 65536) != 0 ? null : str14);
    }
}
