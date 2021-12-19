package com.p2082ss.android.ugc.aweme.challenge.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.annotation.IRouteArg;
import com.p2082ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import java.io.Serializable;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam */
public final class ChallengeDetailParam implements IRouteArg, Serializable {
    public static final Parcelable.Creator<ChallengeDetailParam> CREATOR = new Creator();
    private String awemeId;
    private String bannerId;
    private String challengeFrom;
    private int challengeType;
    private int clickReason;
    private final AbstractC89244h enterFrom$delegate;
    private String enterpriseUid;
    private String extra_challenge_id;
    private String extra_cid;
    private String from;
    private String fromToken;
    private Integer isBundled;
    private String isCommerce;
    private boolean isHashTag;
    private String parentTagId;
    private String previewToken;
    private String processId;
    private String shootEnterFrom;
    private int showTabIndex;

    /* renamed from: com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam$Creator */
    public static class Creator implements Parcelable.Creator<ChallengeDetailParam> {
        static {
            Covode.recordClassIndex(42736);
        }

        @Override // android.os.Parcelable.Creator
        public final ChallengeDetailParam createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new ChallengeDetailParam(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChallengeDetailParam[] newArray(int i) {
            return new ChallengeDetailParam[i];
        }
    }

    static {
        Covode.recordClassIndex(42735);
    }

    public ChallengeDetailParam() {
        this(null, null, 0, null, null, null, null, null, null, null, null, false, 0, null, 0, null, null, null, 262143, null);
    }

    public ChallengeDetailParam(String str) {
        this(str, null, 0, null, null, null, null, null, null, null, null, false, 0, null, 0, null, null, null, 262142, null);
    }

    public ChallengeDetailParam(String str, String str2) {
        this(str, str2, 0, null, null, null, null, null, null, null, null, false, 0, null, 0, null, null, null, 262140, null);
    }

    public ChallengeDetailParam(String str, String str2, int i) {
        this(str, str2, i, null, null, null, null, null, null, null, null, false, 0, null, 0, null, null, null, 262136, null);
    }

    public ChallengeDetailParam(String str, String str2, int i, String str3) {
        this(str, str2, i, str3, null, null, null, null, null, null, null, false, 0, null, 0, null, null, null, 262128, null);
    }

    public ChallengeDetailParam(String str, String str2, int i, String str3, String str4) {
        this(str, str2, i, str3, str4, null, null, null, null, null, null, false, 0, null, 0, null, null, null, 262112, null);
    }

    public ChallengeDetailParam(String str, String str2, int i, String str3, String str4, String str5) {
        this(str, str2, i, str3, str4, str5, null, null, null, null, null, false, 0, null, 0, null, null, null, 262080, null);
    }

    public ChallengeDetailParam(String str, String str2, int i, String str3, String str4, String str5, String str6) {
        this(str, str2, i, str3, str4, str5, str6, null, null, null, null, false, 0, null, 0, null, null, null, 262016, null);
    }

    public ChallengeDetailParam(String str, String str2, int i, String str3, String str4, String str5, String str6, Integer num) {
        this(str, str2, i, str3, str4, str5, str6, num, null, null, null, false, 0, null, 0, null, null, null, 261888, null);
    }

    public ChallengeDetailParam(String str, String str2, int i, String str3, String str4, String str5, String str6, Integer num, String str7) {
        this(str, str2, i, str3, str4, str5, str6, num, str7, null, null, false, 0, null, 0, null, null, null, 261632, null);
    }

    public ChallengeDetailParam(String str, String str2, int i, String str3, String str4, String str5, String str6, Integer num, String str7, String str8) {
        this(str, str2, i, str3, str4, str5, str6, num, str7, str8, null, false, 0, null, 0, null, null, null, 261120, null);
    }

    public ChallengeDetailParam(String str, String str2, int i, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9) {
        this(str, str2, i, str3, str4, str5, str6, num, str7, str8, str9, false, 0, null, 0, null, null, null, 260096, null);
    }

    public ChallengeDetailParam(String str, String str2, int i, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, boolean z) {
        this(str, str2, i, str3, str4, str5, str6, num, str7, str8, str9, z, 0, null, 0, null, null, null, 258048, null);
    }

    public ChallengeDetailParam(String str, String str2, int i, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, boolean z, int i2) {
        this(str, str2, i, str3, str4, str5, str6, num, str7, str8, str9, z, i2, null, 0, null, null, null, 253952, null);
    }

    public ChallengeDetailParam(String str, String str2, int i, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, boolean z, int i2, String str10) {
        this(str, str2, i, str3, str4, str5, str6, num, str7, str8, str9, z, i2, str10, 0, null, null, null, 245760, null);
    }

    public ChallengeDetailParam(String str, String str2, int i, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, boolean z, int i2, String str10, int i3) {
        this(str, str2, i, str3, str4, str5, str6, num, str7, str8, str9, z, i2, str10, i3, null, null, null, 229376, null);
    }

    public ChallengeDetailParam(String str, String str2, int i, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, boolean z, int i2, String str10, int i3, String str11) {
        this(str, str2, i, str3, str4, str5, str6, num, str7, str8, str9, z, i2, str10, i3, str11, null, null, 196608, null);
    }

    public ChallengeDetailParam(String str, String str2, int i, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, boolean z, int i2, String str10, int i3, String str11, String str12) {
        this(str, str2, i, str3, str4, str5, str6, num, str7, str8, str9, z, i2, str10, i3, str11, str12, null, 131072, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0070, code lost:
        if (r13 == null) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0134, code lost:
        if (r12 == null) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x014c, code lost:
        if (r11 == null) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0181, code lost:
        if (r10 == null) goto L_0x0183;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p2082ss.android.ugc.aweme.challenge.model.ChallengeDetailParam __fromBundle(android.os.Bundle r41) {
        /*
        // Method dump skipped, instructions count: 623
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.challenge.model.ChallengeDetailParam.__fromBundle(android.os.Bundle):com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam");
    }

    /* renamed from: com_ss_android_ugc_aweme_challenge_model_ChallengeDetailParam_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m72629x9ac52e3a(int i) {
        return i;
    }

    public static /* synthetic */ ChallengeDetailParam copy$default(ChallengeDetailParam challengeDetailParam, String str, String str2, int i, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, boolean z, int i2, String str10, int i3, String str11, String str12, String str13, int i4, Object obj) {
        String str14 = str;
        String str15 = str2;
        int i5 = i;
        String str16 = str3;
        String str17 = str7;
        String str18 = str4;
        String str19 = str5;
        String str20 = str6;
        Integer num2 = num;
        String str21 = str10;
        String str22 = str8;
        String str23 = str9;
        boolean z2 = z;
        int i6 = i2;
        String str24 = str13;
        int i7 = i3;
        String str25 = str11;
        String str26 = str12;
        if ((i4 & 1) != 0) {
            str14 = challengeDetailParam.extra_challenge_id;
        }
        if ((i4 & 2) != 0) {
            str15 = challengeDetailParam.challengeFrom;
        }
        if ((i4 & 4) != 0) {
            i5 = challengeDetailParam.challengeType;
        }
        if ((i4 & 8) != 0) {
            str16 = challengeDetailParam.parentTagId;
        }
        if ((i4 & 16) != 0) {
            str18 = challengeDetailParam.awemeId;
        }
        if ((i4 & 32) != 0) {
            str19 = challengeDetailParam.shootEnterFrom;
        }
        if ((i4 & 64) != 0) {
            str20 = challengeDetailParam.bannerId;
        }
        if ((i4 & 128) != 0) {
            num2 = challengeDetailParam.isBundled;
        }
        if ((i4 & 256) != 0) {
            str17 = challengeDetailParam.from;
        }
        if ((i4 & 512) != 0) {
            str22 = challengeDetailParam.extra_cid;
        }
        if ((i4 & 1024) != 0) {
            str23 = challengeDetailParam.fromToken;
        }
        if ((i4 & 2048) != 0) {
            z2 = challengeDetailParam.isHashTag;
        }
        if ((i4 & 4096) != 0) {
            i6 = challengeDetailParam.clickReason;
        }
        if ((i4 & 8192) != 0) {
            str21 = challengeDetailParam.enterpriseUid;
        }
        if ((i4 & 16384) != 0) {
            i7 = challengeDetailParam.showTabIndex;
        }
        if ((32768 & i4) != 0) {
            str25 = challengeDetailParam.isCommerce;
        }
        if ((65536 & i4) != 0) {
            str26 = challengeDetailParam.previewToken;
        }
        if ((i4 & 131072) != 0) {
            str24 = challengeDetailParam.processId;
        }
        return challengeDetailParam.copy(str14, str15, i5, str16, str18, str19, str20, num2, str17, str22, str23, z2, i6, str21, i7, str25, str26, str24);
    }

    public final String component1() {
        return this.extra_challenge_id;
    }

    public final String component10() {
        return this.extra_cid;
    }

    public final String component11() {
        return this.fromToken;
    }

    public final boolean component12() {
        return this.isHashTag;
    }

    public final int component13() {
        return this.clickReason;
    }

    public final String component14() {
        return this.enterpriseUid;
    }

    public final int component15() {
        return this.showTabIndex;
    }

    public final String component16() {
        return this.isCommerce;
    }

    public final String component17() {
        return this.previewToken;
    }

    public final String component18() {
        return this.processId;
    }

    public final String component2() {
        return this.challengeFrom;
    }

    public final int component3() {
        return this.challengeType;
    }

    public final String component4() {
        return this.parentTagId;
    }

    public final String component5() {
        return this.awemeId;
    }

    public final String component6() {
        return this.shootEnterFrom;
    }

    public final String component7() {
        return this.bannerId;
    }

    public final Integer component8() {
        return this.isBundled;
    }

    public final String component9() {
        return this.from;
    }

    public final ChallengeDetailParam copy(String str, String str2, int i, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, boolean z, int i2, String str10, int i3, String str11, String str12, String str13) {
        return new ChallengeDetailParam(str, str2, i, str3, str4, str5, str6, num, str7, str8, str9, z, i2, str10, i3, str11, str12, str13);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChallengeDetailParam)) {
            return false;
        }
        ChallengeDetailParam challengeDetailParam = (ChallengeDetailParam) obj;
        return C89219l.m154714a(this.extra_challenge_id, challengeDetailParam.extra_challenge_id) && C89219l.m154714a(this.challengeFrom, challengeDetailParam.challengeFrom) && this.challengeType == challengeDetailParam.challengeType && C89219l.m154714a(this.parentTagId, challengeDetailParam.parentTagId) && C89219l.m154714a(this.awemeId, challengeDetailParam.awemeId) && C89219l.m154714a(this.shootEnterFrom, challengeDetailParam.shootEnterFrom) && C89219l.m154714a(this.bannerId, challengeDetailParam.bannerId) && C89219l.m154714a(this.isBundled, challengeDetailParam.isBundled) && C89219l.m154714a(this.from, challengeDetailParam.from) && C89219l.m154714a(this.extra_cid, challengeDetailParam.extra_cid) && C89219l.m154714a(this.fromToken, challengeDetailParam.fromToken) && this.isHashTag == challengeDetailParam.isHashTag && this.clickReason == challengeDetailParam.clickReason && C89219l.m154714a(this.enterpriseUid, challengeDetailParam.enterpriseUid) && this.showTabIndex == challengeDetailParam.showTabIndex && C89219l.m154714a(this.isCommerce, challengeDetailParam.isCommerce) && C89219l.m154714a(this.previewToken, challengeDetailParam.previewToken) && C89219l.m154714a(this.processId, challengeDetailParam.processId);
    }

    public final String getEnterFrom() {
        return (String) this.enterFrom$delegate.getValue();
    }

    public final int hashCode() {
        String str = this.extra_challenge_id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.challengeFrom;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + m72629x9ac52e3a(this.challengeType)) * 31;
        String str3 = this.parentTagId;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.awemeId;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.shootEnterFrom;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.bannerId;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Integer num = this.isBundled;
        int hashCode7 = (hashCode6 + (num != null ? num.hashCode() : 0)) * 31;
        String str7 = this.from;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.extra_cid;
        int hashCode9 = (hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.fromToken;
        int hashCode10 = (hashCode9 + (str9 != null ? str9.hashCode() : 0)) * 31;
        boolean z = this.isHashTag;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int com_ss_android_ugc_aweme_challenge_model_ChallengeDetailParam_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = (((hashCode10 + i2) * 31) + m72629x9ac52e3a(this.clickReason)) * 31;
        String str10 = this.enterpriseUid;
        int hashCode11 = (((com_ss_android_ugc_aweme_challenge_model_ChallengeDetailParam_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str10 != null ? str10.hashCode() : 0)) * 31) + m72629x9ac52e3a(this.showTabIndex)) * 31;
        String str11 = this.isCommerce;
        int hashCode12 = (hashCode11 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.previewToken;
        int hashCode13 = (hashCode12 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.processId;
        if (str13 != null) {
            i = str13.hashCode();
        }
        return hashCode13 + i;
    }

    public final String toString() {
        return "ChallengeDetailParam(extra_challenge_id=" + this.extra_challenge_id + ", challengeFrom=" + this.challengeFrom + ", challengeType=" + this.challengeType + ", parentTagId=" + this.parentTagId + ", awemeId=" + this.awemeId + ", shootEnterFrom=" + this.shootEnterFrom + ", bannerId=" + this.bannerId + ", isBundled=" + this.isBundled + ", from=" + this.from + ", extra_cid=" + this.extra_cid + ", fromToken=" + this.fromToken + ", isHashTag=" + this.isHashTag + ", clickReason=" + this.clickReason + ", enterpriseUid=" + this.enterpriseUid + ", showTabIndex=" + this.showTabIndex + ", isCommerce=" + this.isCommerce + ", previewToken=" + this.previewToken + ", processId=" + this.processId + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.extra_challenge_id);
        parcel.writeString(this.challengeFrom);
        parcel.writeInt(this.challengeType);
        parcel.writeString(this.parentTagId);
        parcel.writeString(this.awemeId);
        parcel.writeString(this.shootEnterFrom);
        parcel.writeString(this.bannerId);
        Integer num = this.isBundled;
        if (num != null) {
            parcel.writeInt(1);
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        parcel.writeString(this.from);
        parcel.writeString(this.extra_cid);
        parcel.writeString(this.fromToken);
        parcel.writeInt(this.isHashTag ? 1 : 0);
        parcel.writeInt(this.clickReason);
        parcel.writeString(this.enterpriseUid);
        parcel.writeInt(this.showTabIndex);
        parcel.writeString(this.isCommerce);
        parcel.writeString(this.previewToken);
        parcel.writeString(this.processId);
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final String getBannerId() {
        return this.bannerId;
    }

    public final String getChallengeFrom() {
        return this.challengeFrom;
    }

    public final int getChallengeType() {
        return this.challengeType;
    }

    public final int getClickReason() {
        return this.clickReason;
    }

    public final String getEnterpriseUid() {
        return this.enterpriseUid;
    }

    public final String getExtra_challenge_id() {
        return this.extra_challenge_id;
    }

    public final String getExtra_cid() {
        return this.extra_cid;
    }

    public final String getFrom() {
        return this.from;
    }

    public final String getFromToken() {
        return this.fromToken;
    }

    public final String getParentTagId() {
        return this.parentTagId;
    }

    public final String getPreviewToken() {
        return this.previewToken;
    }

    public final String getProcessId() {
        return this.processId;
    }

    public final String getShootEnterFrom() {
        return this.shootEnterFrom;
    }

    public final int getShowTabIndex() {
        return this.showTabIndex;
    }

    public final Integer isBundled() {
        return this.isBundled;
    }

    public final String isCommerce() {
        return this.isCommerce;
    }

    public final boolean isHashTag() {
        return this.isHashTag;
    }

    public ChallengeDetailParam(String str, String str2, int i, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, boolean z, int i2, String str10, int i3, String str11, String str12, String str13) {
        this.extra_challenge_id = str;
        this.challengeFrom = str2;
        this.challengeType = i;
        this.parentTagId = str3;
        this.awemeId = str4;
        this.shootEnterFrom = str5;
        this.bannerId = str6;
        this.isBundled = num;
        this.from = str7;
        this.extra_cid = str8;
        this.fromToken = str9;
        this.isHashTag = z;
        this.clickReason = i2;
        this.enterpriseUid = str10;
        this.showTabIndex = i3;
        this.isCommerce = str11;
        this.previewToken = str12;
        this.processId = str13;
        this.enterFrom$delegate = C89250i.m154773a((AbstractC89171a) new ChallengeDetailParam$enterFrom$2(this));
        if (TextUtils.equals(this.isCommerce, "1") || C89361p.m154872a("true", this.isCommerce, true)) {
            CommerceChallengeServiceImpl.m75741e().mo65386a(getCid());
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ChallengeDetailParam(java.lang.String r21, java.lang.String r22, int r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.Integer r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, boolean r32, int r33, java.lang.String r34, int r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, int r39, p4600h.p4611f.p4613b.C89214g r40) {
        /*
        // Method dump skipped, instructions count: 158
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.challenge.model.ChallengeDetailParam.<init>(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, boolean, int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, int, h.f.b.g):void");
    }

    public final String getCid() {
        String str = this.extra_challenge_id;
        if (str == null || str.length() == 0) {
            return this.extra_cid;
        }
        return this.extra_challenge_id;
    }

    public final void setAwemeId(String str) {
        this.awemeId = str;
    }

    public final void setBannerId(String str) {
        this.bannerId = str;
    }

    public final void setBundled(Integer num) {
        this.isBundled = num;
    }

    public final void setChallengeFrom(String str) {
        this.challengeFrom = str;
    }

    public final void setChallengeType(int i) {
        this.challengeType = i;
    }

    public final void setCid(String str) {
        this.extra_challenge_id = str;
    }

    public final void setClickReason(int i) {
        this.clickReason = i;
    }

    public final void setCommerce(String str) {
        this.isCommerce = str;
    }

    public final void setEnterpriseUid(String str) {
        this.enterpriseUid = str;
    }

    public final void setExtra_challenge_id(String str) {
        this.extra_challenge_id = str;
    }

    public final void setExtra_cid(String str) {
        this.extra_cid = str;
    }

    public final void setFrom(String str) {
        this.from = str;
    }

    public final void setFromToken(String str) {
        this.fromToken = str;
    }

    public final void setHashTag(boolean z) {
        this.isHashTag = z;
    }

    public final void setParentTagId(String str) {
        this.parentTagId = str;
    }

    public final void setPreviewToken(String str) {
        this.previewToken = str;
    }

    public final void setProcessId(String str) {
        this.processId = str;
    }

    public final void setShootEnterFrom(String str) {
        this.shootEnterFrom = str;
    }

    public final void setShowTabIndex(int i) {
        this.showTabIndex = i;
    }
}
