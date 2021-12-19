package com.p2082ss.android.ugc.aweme.sticker.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo */
public final class CreateAnchorInfo implements Parcelable {
    public static final Parcelable.Creator<CreateAnchorInfo> CREATOR = new C75303b();
    public static final C75302a Companion = new C75302a((byte) 0);
    private Long addTime;
    private final Boolean canDelete;
    private final String content;
    private final String extra;
    private String iconUrl;
    private final String keyword;
    private final String language;
    private final String subtype;
    @AbstractC27891c(mo46611a = "third_id")
    private String thirdId;
    @AbstractC27891c(mo46611a = "time")
    private String time;
    private final int type;
    private final String url;

    static {
        Covode.recordClassIndex(88207);
    }

    /* renamed from: com_ss_android_ugc_aweme_sticker_data_CreateAnchorInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m132110x92b49033(int i) {
        return i;
    }

    public static /* synthetic */ CreateAnchorInfo copy$default(CreateAnchorInfo createAnchorInfo, int i, String str, String str2, String str3, String str4, String str5, Long l, String str6, String str7, String str8, String str9, Boolean bool, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = createAnchorInfo.type;
        }
        if ((i2 & 2) != 0) {
            str = createAnchorInfo.keyword;
        }
        if ((i2 & 4) != 0) {
            str2 = createAnchorInfo.url;
        }
        if ((i2 & 8) != 0) {
            str3 = createAnchorInfo.language;
        }
        if ((i2 & 16) != 0) {
            str4 = createAnchorInfo.content;
        }
        if ((i2 & 32) != 0) {
            str5 = createAnchorInfo.iconUrl;
        }
        if ((i2 & 64) != 0) {
            l = createAnchorInfo.addTime;
        }
        if ((i2 & 128) != 0) {
            str6 = createAnchorInfo.extra;
        }
        if ((i2 & 256) != 0) {
            str7 = createAnchorInfo.thirdId;
        }
        if ((i2 & 512) != 0) {
            str8 = createAnchorInfo.time;
        }
        if ((i2 & 1024) != 0) {
            str9 = createAnchorInfo.subtype;
        }
        if ((i2 & 2048) != 0) {
            bool = createAnchorInfo.canDelete;
        }
        return createAnchorInfo.copy(i, str, str2, str3, str4, str5, l, str6, str7, str8, str9, bool);
    }

    public final int component1() {
        return this.type;
    }

    public final String component10() {
        return this.time;
    }

    public final String component11() {
        return this.subtype;
    }

    public final Boolean component12() {
        return this.canDelete;
    }

    public final String component2() {
        return this.keyword;
    }

    public final String component3() {
        return this.url;
    }

    public final String component4() {
        return this.language;
    }

    public final String component5() {
        return this.content;
    }

    public final String component6() {
        return this.iconUrl;
    }

    public final Long component7() {
        return this.addTime;
    }

    public final String component8() {
        return this.extra;
    }

    public final String component9() {
        return this.thirdId;
    }

    public final CreateAnchorInfo copy(int i, String str, String str2, String str3, String str4, String str5, Long l, String str6, String str7, String str8, String str9, Boolean bool) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str7, "");
        C89219l.m154721d(str8, "");
        return new CreateAnchorInfo(i, str, str2, str3, str4, str5, l, str6, str7, str8, str9, bool);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateAnchorInfo)) {
            return false;
        }
        CreateAnchorInfo createAnchorInfo = (CreateAnchorInfo) obj;
        return this.type == createAnchorInfo.type && C89219l.m154714a(this.keyword, createAnchorInfo.keyword) && C89219l.m154714a(this.url, createAnchorInfo.url) && C89219l.m154714a(this.language, createAnchorInfo.language) && C89219l.m154714a(this.content, createAnchorInfo.content) && C89219l.m154714a(this.iconUrl, createAnchorInfo.iconUrl) && C89219l.m154714a(this.addTime, createAnchorInfo.addTime) && C89219l.m154714a(this.extra, createAnchorInfo.extra) && C89219l.m154714a(this.thirdId, createAnchorInfo.thirdId) && C89219l.m154714a(this.time, createAnchorInfo.time) && C89219l.m154714a(this.subtype, createAnchorInfo.subtype) && C89219l.m154714a(this.canDelete, createAnchorInfo.canDelete);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_sticker_data_CreateAnchorInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m132110x92b49033(this.type) * 31;
        String str = this.keyword;
        int i = 0;
        int hashCode = (com_ss_android_ugc_aweme_sticker_data_CreateAnchorInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.url;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.language;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.content;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.iconUrl;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Long l = this.addTime;
        int hashCode6 = (hashCode5 + (l != null ? l.hashCode() : 0)) * 31;
        String str6 = this.extra;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.thirdId;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.time;
        int hashCode9 = (hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.subtype;
        int hashCode10 = (hashCode9 + (str9 != null ? str9.hashCode() : 0)) * 31;
        Boolean bool = this.canDelete;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode10 + i;
    }

    public final String toString() {
        return "CreateAnchorInfo(type=" + this.type + ", keyword=" + this.keyword + ", url=" + this.url + ", language=" + this.language + ", content=" + this.content + ", iconUrl=" + this.iconUrl + ", addTime=" + this.addTime + ", extra=" + this.extra + ", thirdId=" + this.thirdId + ", time=" + this.time + ", subtype=" + this.subtype + ", canDelete=" + this.canDelete + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeInt(this.type);
        parcel.writeString(this.keyword);
        parcel.writeString(this.url);
        parcel.writeString(this.language);
        parcel.writeString(this.content);
        parcel.writeString(this.iconUrl);
        Long l = this.addTime;
        if (l != null) {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.extra);
        parcel.writeString(this.thirdId);
        parcel.writeString(this.time);
        parcel.writeString(this.subtype);
        Boolean bool = this.canDelete;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
            return;
        }
        parcel.writeInt(0);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo$a */
    public static final class C75302a {
        static {
            Covode.recordClassIndex(88208);
        }

        private C75302a() {
        }

        public /* synthetic */ C75302a(byte b) {
            this();
        }
    }

    public final Long getAddTime() {
        return this.addTime;
    }

    public final Boolean getCanDelete() {
        return this.canDelete;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getKeyword() {
        return this.keyword;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getSubtype() {
        return this.subtype;
    }

    public final String getThirdId() {
        return this.thirdId;
    }

    public final String getTime() {
        return this.time;
    }

    public final int getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo$b */
    public static class C75303b implements Parcelable.Creator<CreateAnchorInfo> {
        static {
            Covode.recordClassIndex(88209);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CreateAnchorInfo[] newArray(int i) {
            return new CreateAnchorInfo[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CreateAnchorInfo createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            Boolean bool = null;
            Long valueOf = parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null;
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CreateAnchorInfo(readInt, readString, readString2, readString3, readString4, readString5, valueOf, readString6, readString7, readString8, readString9, bool);
        }
    }

    public final void setAddTime(Long l) {
        this.addTime = l;
    }

    public final void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public final void setThirdId(String str) {
        C89219l.m154721d(str, "");
        this.thirdId = str;
    }

    public final void setTime(String str) {
        C89219l.m154721d(str, "");
        this.time = str;
    }

    public CreateAnchorInfo(int i, String str, String str2, String str3, String str4, String str5, Long l, String str6, String str7, String str8, String str9, Boolean bool) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str7, "");
        C89219l.m154721d(str8, "");
        this.type = i;
        this.keyword = str;
        this.url = str2;
        this.language = str3;
        this.content = str4;
        this.iconUrl = str5;
        this.addTime = l;
        this.extra = str6;
        this.thirdId = str7;
        this.time = str8;
        this.subtype = str9;
        this.canDelete = bool;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CreateAnchorInfo(int r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.Long r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.Boolean r25, int r26, p4600h.p4611f.p4613b.C89214g r27) {
        /*
            r13 = this;
            r9 = r22
            r8 = r21
            r7 = r20
            r6 = r19
            r10 = r23
            r12 = r25
            r2 = r26
            r0 = r2 & 32
            java.lang.String r11 = ""
            if (r0 == 0) goto L_0x0015
            r6 = r11
        L_0x0015:
            r0 = r2 & 64
            if (r0 == 0) goto L_0x0021
            long r0 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
        L_0x0021:
            r0 = r2 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0026
            r8 = r11
        L_0x0026:
            r0 = r2 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x002b
            r9 = r11
        L_0x002b:
            r0 = r2 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0030
            r10 = r11
        L_0x0030:
            r0 = r2 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x004a
        L_0x0034:
            r0 = r2 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x003d
            r0 = 1
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r0)
        L_0x003d:
            r0 = r13
            r5 = r18
            r1 = r14
            r2 = r15
            r4 = r17
            r3 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x004a:
            r11 = r24
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.sticker.data.CreateAnchorInfo.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, int, h.f.b.g):void");
    }
}
