package com.p2082ss.android.ugc.aweme.status;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.status.StatusCreateVideoData */
public final class StatusCreateVideoData implements Parcelable, Serializable {
    public static final C75240a CREATOR = new C75240a((byte) 0);
    @AbstractC27891c(mo46611a = "key_status_type")

    /* renamed from: a */
    private int f169151a;
    @AbstractC27891c(mo46611a = "bg_path")

    /* renamed from: b */
    private String f169152b;
    @AbstractC27891c(mo46611a = "bg_id")

    /* renamed from: c */
    private String f169153c;
    @AbstractC27891c(mo46611a = "status_background_selected_from")

    /* renamed from: d */
    private String f169154d;
    @AbstractC27891c(mo46611a = "status_background_size")

    /* renamed from: e */
    private int f169155e;
    @AbstractC27891c(mo46611a = "status_background_width")

    /* renamed from: f */
    private int f169156f;
    @AbstractC27891c(mo46611a = "status_background_height")

    /* renamed from: g */
    private int f169157g;
    @AbstractC27891c(mo46611a = "status_background_src_image")

    /* renamed from: h */
    private String f169158h;
    @AbstractC27891c(mo46611a = "music_path")

    /* renamed from: i */
    private String f169159i;
    @AbstractC27891c(mo46611a = "effect_path")

    /* renamed from: j */
    private String f169160j;
    @AbstractC27891c(mo46611a = "effect_id")

    /* renamed from: k */
    private String f169161k;
    @AbstractC27891c(mo46611a = "status_music_ids")

    /* renamed from: l */
    private List<String> f169162l;
    @AbstractC27891c(mo46611a = "status_video_cover")

    /* renamed from: m */
    private String f169163m;
    @AbstractC27891c(mo46611a = "status_video_cover_starttime")

    /* renamed from: n */
    private int f169164n;
    @AbstractC27891c(mo46611a = "status_template_text")

    /* renamed from: o */
    private String f169165o;
    @AbstractC27891c(mo46611a = "status_user_text")

    /* renamed from: p */
    private String f169166p;

    static {
        Covode.recordClassIndex(88133);
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.status.StatusCreateVideoData$a */
    public static final class C75240a implements Parcelable.Creator<StatusCreateVideoData> {
        static {
            Covode.recordClassIndex(88134);
        }

        private C75240a() {
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ StatusCreateVideoData[] newArray(int i) {
            return new StatusCreateVideoData[i];
        }

        public /* synthetic */ C75240a(byte b) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ StatusCreateVideoData createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new StatusCreateVideoData(parcel);
        }
    }

    public final String getBgFrom() {
        return this.f169154d;
    }

    public final int getBgHeight() {
        return this.f169157g;
    }

    public final String getBgId() {
        return this.f169153c;
    }

    public final String getBgPath() {
        return this.f169152b;
    }

    public final int getBgSize() {
        return this.f169155e;
    }

    public final String getBgSrcImage() {
        return this.f169158h;
    }

    public final int getBgWidth() {
        return this.f169156f;
    }

    public final String getEffectId() {
        return this.f169161k;
    }

    public final String getEffectPath() {
        return this.f169160j;
    }

    public final List<String> getMusicIds() {
        return this.f169162l;
    }

    public final String getMusicPath() {
        return this.f169159i;
    }

    public final int getStatusType() {
        return this.f169151a;
    }

    public final String getTemplateText() {
        return this.f169165o;
    }

    public final String getUserText() {
        return this.f169166p;
    }

    public final String getVideoCoverImgPath() {
        return this.f169163m;
    }

    public final int getVideoCoverStartTime() {
        return this.f169164n;
    }

    public StatusCreateVideoData() {
        this.f169151a = -1;
        this.f169152b = "";
        this.f169153c = "";
        this.f169154d = "template";
        this.f169158h = "";
        this.f169159i = "";
        this.f169160j = "";
        this.f169161k = "";
        this.f169162l = new ArrayList();
        this.f169165o = "";
        this.f169166p = "";
    }

    public final void setBgHeight(int i) {
        this.f169157g = i;
    }

    public final void setBgSize(int i) {
        this.f169155e = i;
    }

    public final void setBgWidth(int i) {
        this.f169156f = i;
    }

    public final void setStatusType(int i) {
        this.f169151a = i;
    }

    public final void setVideoCoverImgPath(String str) {
        this.f169163m = str;
    }

    public final void setVideoCoverStartTime(int i) {
        this.f169164n = i;
    }

    public final void setBgFrom(String str) {
        C89219l.m154721d(str, "");
        this.f169154d = str;
    }

    public final void setBgId(String str) {
        C89219l.m154721d(str, "");
        this.f169153c = str;
    }

    public final void setBgPath(String str) {
        C89219l.m154721d(str, "");
        this.f169152b = str;
    }

    public final void setBgSrcImage(String str) {
        C89219l.m154721d(str, "");
        this.f169158h = str;
    }

    public final void setEffectId(String str) {
        C89219l.m154721d(str, "");
        this.f169161k = str;
    }

    public final void setEffectPath(String str) {
        C89219l.m154721d(str, "");
        this.f169160j = str;
    }

    public final void setMusicIds(List<String> list) {
        C89219l.m154721d(list, "");
        this.f169162l = list;
    }

    public final void setMusicPath(String str) {
        C89219l.m154721d(str, "");
        this.f169159i = str;
    }

    public final void setTemplateText(String str) {
        C89219l.m154721d(str, "");
        this.f169165o = str;
    }

    public final void setUserText(String str) {
        C89219l.m154721d(str, "");
        this.f169166p = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StatusCreateVideoData(Parcel parcel) {
        this();
        String str = "";
        C89219l.m154721d(parcel, str);
        this.f169151a = parcel.readInt();
        String readString = parcel.readString();
        this.f169152b = readString == null ? str : readString;
        String readString2 = parcel.readString();
        this.f169153c = readString2 == null ? str : readString2;
        String readString3 = parcel.readString();
        this.f169154d = readString3 == null ? str : readString3;
        this.f169155e = parcel.readInt();
        this.f169156f = parcel.readInt();
        this.f169157g = parcel.readInt();
        String readString4 = parcel.readString();
        if (readString4 == null) {
            C89219l.m154715b();
        }
        this.f169158h = readString4;
        String readString5 = parcel.readString();
        this.f169159i = readString5 == null ? str : readString5;
        String readString6 = parcel.readString();
        this.f169160j = readString6 == null ? str : readString6;
        String readString7 = parcel.readString();
        this.f169161k = readString7 == null ? str : readString7;
        List<String> list = this.f169162l;
        Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
        parcel.readList(list, String.class.getClassLoader());
        String readString8 = parcel.readString();
        this.f169163m = readString8 == null ? str : readString8;
        this.f169164n = parcel.readInt();
        String readString9 = parcel.readString();
        this.f169165o = readString9 == null ? str : readString9;
        String readString10 = parcel.readString();
        this.f169166p = readString10 != null ? readString10 : str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (parcel != null) {
            parcel.writeInt(this.f169151a);
            parcel.writeString(this.f169152b);
            parcel.writeString(this.f169153c);
            parcel.writeString(this.f169154d);
            parcel.writeInt(this.f169155e);
            parcel.writeInt(this.f169156f);
            parcel.writeInt(this.f169157g);
            parcel.writeString(this.f169158h);
            parcel.writeString(this.f169159i);
            parcel.writeString(this.f169160j);
            parcel.writeString(this.f169161k);
            List<String> list = this.f169162l;
            Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            parcel.writeList(list);
            parcel.writeString(this.f169163m);
            parcel.writeInt(this.f169164n);
            parcel.writeString(this.f169165o);
            parcel.writeString(this.f169166p);
        }
    }
}
