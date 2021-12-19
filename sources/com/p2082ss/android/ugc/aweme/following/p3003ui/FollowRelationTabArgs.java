package com.p2082ss.android.ugc.aweme.following.p3003ui;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.router.arg.RouteParser;
import com.kakao.usermgmt.StringSet;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.following.ui.FollowRelationTabArgs */
public final class FollowRelationTabArgs implements IRouteArg {
    public static final Parcelable.Creator<FollowRelationTabArgs> CREATOR = new C51142a();
    private String enterFrom;
    private Integer extraType;
    private String followRelationType;
    private Integer mutualRelationCount;
    private Integer mutualRelationType;
    private String previousPage;
    private String requestId;
    private String secUid;
    private String uid;

    static {
        Covode.recordClassIndex(60341);
    }

    public FollowRelationTabArgs() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public static FollowRelationTabArgs __fromBundle(Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        Integer num;
        String str5;
        String str6;
        Integer num2;
        Integer num3 = null;
        if (bundle == null) {
            return null;
        }
        int i = 0;
        if (bundle.containsKey("uid")) {
            str = (String) RouteParser.INSTANCE.parse(bundle.get("uid"), String.class);
        } else {
            i = 1;
            str = null;
        }
        if (bundle.containsKey("sec_uid")) {
            str2 = (String) RouteParser.INSTANCE.parse(bundle.get("sec_uid"), String.class);
        } else {
            i += 2;
            str2 = null;
        }
        if (bundle.containsKey("follow_relation_type")) {
            str3 = (String) RouteParser.INSTANCE.parse(bundle.get("follow_relation_type"), String.class);
        } else {
            i += 4;
            str3 = null;
        }
        if (bundle.containsKey("request_id")) {
            str4 = (String) RouteParser.INSTANCE.parse(bundle.get("request_id"), String.class);
        } else {
            i += 8;
            str4 = null;
        }
        if (bundle.containsKey(StringSet.type)) {
            num = (Integer) RouteParser.INSTANCE.parse(bundle.get(StringSet.type), Integer.class);
        } else {
            i += 16;
            num = null;
        }
        if (bundle.containsKey("enter_from")) {
            str5 = (String) RouteParser.INSTANCE.parse(bundle.get("enter_from"), String.class);
        } else {
            i += 32;
            str5 = null;
        }
        if (bundle.containsKey("extra_previous_page")) {
            str6 = (String) RouteParser.INSTANCE.parse(bundle.get("extra_previous_page"), String.class);
        } else {
            i += 64;
            str6 = null;
        }
        if (bundle.containsKey("mutual_relation_type")) {
            num2 = (Integer) RouteParser.INSTANCE.parse(bundle.get("mutual_relation_type"), Integer.class);
        } else {
            i += 128;
            num2 = null;
        }
        if (bundle.containsKey("mutual_relation_count")) {
            num3 = (Integer) RouteParser.INSTANCE.parse(bundle.get("mutual_relation_count"), Integer.class);
        } else {
            i += 256;
        }
        return new FollowRelationTabArgs(str, str2, str3, str4, num, str5, str6, num2, num3, i, null);
    }

    public static /* synthetic */ FollowRelationTabArgs copy$default(FollowRelationTabArgs followRelationTabArgs, String str, String str2, String str3, String str4, Integer num, String str5, String str6, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = followRelationTabArgs.uid;
        }
        if ((i & 2) != 0) {
            str2 = followRelationTabArgs.secUid;
        }
        if ((i & 4) != 0) {
            str3 = followRelationTabArgs.followRelationType;
        }
        if ((i & 8) != 0) {
            str4 = followRelationTabArgs.requestId;
        }
        if ((i & 16) != 0) {
            num = followRelationTabArgs.extraType;
        }
        if ((i & 32) != 0) {
            str5 = followRelationTabArgs.enterFrom;
        }
        if ((i & 64) != 0) {
            str6 = followRelationTabArgs.previousPage;
        }
        if ((i & 128) != 0) {
            num2 = followRelationTabArgs.mutualRelationType;
        }
        if ((i & 256) != 0) {
            num3 = followRelationTabArgs.mutualRelationCount;
        }
        return followRelationTabArgs.copy(str, str2, str3, str4, num, str5, str6, num2, num3);
    }

    public final String component1() {
        return this.uid;
    }

    public final String component2() {
        return this.secUid;
    }

    public final String component3() {
        return this.followRelationType;
    }

    public final String component4() {
        return this.requestId;
    }

    public final Integer component5() {
        return this.extraType;
    }

    public final String component6() {
        return this.enterFrom;
    }

    public final String component7() {
        return this.previousPage;
    }

    public final Integer component8() {
        return this.mutualRelationType;
    }

    public final Integer component9() {
        return this.mutualRelationCount;
    }

    public final FollowRelationTabArgs copy(String str, String str2, String str3, String str4, Integer num, String str5, String str6, Integer num2, Integer num3) {
        return new FollowRelationTabArgs(str, str2, str3, str4, num, str5, str6, num2, num3);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FollowRelationTabArgs)) {
            return false;
        }
        FollowRelationTabArgs followRelationTabArgs = (FollowRelationTabArgs) obj;
        return C89219l.m154714a(this.uid, followRelationTabArgs.uid) && C89219l.m154714a(this.secUid, followRelationTabArgs.secUid) && C89219l.m154714a(this.followRelationType, followRelationTabArgs.followRelationType) && C89219l.m154714a(this.requestId, followRelationTabArgs.requestId) && C89219l.m154714a(this.extraType, followRelationTabArgs.extraType) && C89219l.m154714a(this.enterFrom, followRelationTabArgs.enterFrom) && C89219l.m154714a(this.previousPage, followRelationTabArgs.previousPage) && C89219l.m154714a(this.mutualRelationType, followRelationTabArgs.mutualRelationType) && C89219l.m154714a(this.mutualRelationCount, followRelationTabArgs.mutualRelationCount);
    }

    public final int hashCode() {
        String str = this.uid;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.secUid;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.followRelationType;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.requestId;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Integer num = this.extraType;
        int hashCode5 = (hashCode4 + (num != null ? num.hashCode() : 0)) * 31;
        String str5 = this.enterFrom;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.previousPage;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Integer num2 = this.mutualRelationType;
        int hashCode8 = (hashCode7 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.mutualRelationCount;
        if (num3 != null) {
            i = num3.hashCode();
        }
        return hashCode8 + i;
    }

    public final String toString() {
        return "FollowRelationTabArgs(uid=" + this.uid + ", secUid=" + this.secUid + ", followRelationType=" + this.followRelationType + ", requestId=" + this.requestId + ", extraType=" + this.extraType + ", enterFrom=" + this.enterFrom + ", previousPage=" + this.previousPage + ", mutualRelationType=" + this.mutualRelationType + ", mutualRelationCount=" + this.mutualRelationCount + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.uid);
        parcel.writeString(this.secUid);
        parcel.writeString(this.followRelationType);
        parcel.writeString(this.requestId);
        Integer num = this.extraType;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.enterFrom);
        parcel.writeString(this.previousPage);
        Integer num2 = this.mutualRelationType;
        if (num2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        } else {
            parcel.writeInt(0);
        }
        Integer num3 = this.mutualRelationCount;
        if (num3 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
            return;
        }
        parcel.writeInt(0);
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final Integer getExtraType() {
        return this.extraType;
    }

    public final String getFollowRelationType() {
        return this.followRelationType;
    }

    public final Integer getMutualRelationCount() {
        return this.mutualRelationCount;
    }

    public final Integer getMutualRelationType() {
        return this.mutualRelationType;
    }

    public final String getPreviousPage() {
        return this.previousPage;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final String getUid() {
        return this.uid;
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowRelationTabArgs$a */
    public static class C51142a implements Parcelable.Creator<FollowRelationTabArgs> {
        static {
            Covode.recordClassIndex(60342);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ FollowRelationTabArgs[] newArray(int i) {
            return new FollowRelationTabArgs[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ FollowRelationTabArgs createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            Integer num = null;
            Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            Integer valueOf2 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new FollowRelationTabArgs(readString, readString2, readString3, readString4, valueOf, readString5, readString6, valueOf2, num);
        }
    }

    public final void setEnterFrom(String str) {
        this.enterFrom = str;
    }

    public final void setExtraType(Integer num) {
        this.extraType = num;
    }

    public final void setFollowRelationType(String str) {
        this.followRelationType = str;
    }

    public final void setMutualRelationCount(Integer num) {
        this.mutualRelationCount = num;
    }

    public final void setMutualRelationType(Integer num) {
        this.mutualRelationType = num;
    }

    public final void setPreviousPage(String str) {
        this.previousPage = str;
    }

    public final void setRequestId(String str) {
        this.requestId = str;
    }

    public final void setSecUid(String str) {
        this.secUid = str;
    }

    public final void setUid(String str) {
        this.uid = str;
    }

    public FollowRelationTabArgs(String str, String str2, String str3, String str4, Integer num, String str5, String str6, Integer num2, Integer num3) {
        this.uid = str;
        this.secUid = str2;
        this.followRelationType = str3;
        this.requestId = str4;
        this.extraType = num;
        this.enterFrom = str5;
        this.previousPage = str6;
        this.mutualRelationType = num2;
        this.mutualRelationCount = num3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FollowRelationTabArgs(String str, String str2, String str3, String str4, Integer num, String str5, String str6, Integer num2, Integer num3, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : num2, (i & 256) == 0 ? num3 : null);
    }
}
