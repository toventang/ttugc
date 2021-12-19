package com.p2082ss.android.ugc.aweme.shortvideo;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo */
public final class ImportVideoInfo implements Parcelable, Serializable {
    public static final C69732a CREATOR = new C69732a((byte) 0);
    @AbstractC27891c(mo46611a = "video_width", mo46612b = {"a"})

    /* renamed from: a */
    private int f155711a;
    @AbstractC27891c(mo46611a = "video_height", mo46612b = {"b"})

    /* renamed from: b */
    private int f155712b;
    @AbstractC27891c(mo46611a = "bit_rate", mo46612b = {"c"})

    /* renamed from: c */
    private int f155713c;
    @AbstractC27891c(mo46611a = "encode_id", mo46612b = {"d"})

    /* renamed from: d */
    private int f155714d;
    @AbstractC27891c(mo46611a = "importPath", mo46612b = {"e"})

    /* renamed from: e */
    private String f155715e;
    @AbstractC27891c(mo46611a = "import_file_duration", mo46612b = {"f"})

    /* renamed from: f */
    private long f155716f;
    @AbstractC27891c(mo46611a = "duration", mo46612b = {"g"})

    /* renamed from: g */
    private long f155717g;
    @AbstractC27891c(mo46611a = "description", mo46612b = {"h"})

    /* renamed from: h */
    private String f155718h;
    @AbstractC27891c(mo46611a = "music_id", mo46612b = {"i"})

    /* renamed from: i */
    private String f155719i;
    @AbstractC27891c(mo46611a = "origin_fps", mo46612b = {"j"})

    /* renamed from: j */
    private int f155720j;
    @AbstractC27891c(mo46611a = "cutSpeed", mo46612b = {"k"})

    /* renamed from: k */
    private float f155721k;
    @AbstractC27891c(mo46611a = "real_import_path", mo46612b = {"l"})

    /* renamed from: l */
    private String f155722l;

    static {
        Covode.recordClassIndex(82121);
    }

    public ImportVideoInfo() {
        this(0, 0, 0, 0, null, 0, 0, null, null, 0, 0.0f, null, 4095, null);
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo$a */
    public static final class C69732a implements Parcelable.Creator<ImportVideoInfo> {
        static {
            Covode.recordClassIndex(82122);
        }

        private C69732a() {
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ImportVideoInfo[] newArray(int i) {
            return new ImportVideoInfo[i];
        }

        public /* synthetic */ C69732a(byte b) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ImportVideoInfo createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new ImportVideoInfo(parcel);
        }
    }

    public final int getBitRate() {
        return this.f155713c;
    }

    public final float getCutSpeed() {
        return this.f155721k;
    }

    public final String getDescription() {
        return this.f155718h;
    }

    public final long getDuration() {
        return this.f155717g;
    }

    public final int getEncodeId() {
        return this.f155714d;
    }

    public final String getImportPath() {
        return this.f155715e;
    }

    public final long getImportfileDuration() {
        return this.f155716f;
    }

    public final String getMusicId() {
        return this.f155719i;
    }

    public final int getOriginFps() {
        return this.f155720j;
    }

    public final String getRealImportPath() {
        return this.f155722l;
    }

    public final int getVideoHeight() {
        return this.f155712b;
    }

    public final int getVideoWidth() {
        return this.f155711a;
    }

    public final void setBitRate(int i) {
        this.f155713c = i;
    }

    public final void setCutSpeed(float f) {
        this.f155721k = f;
    }

    public final void setDescription(String str) {
        this.f155718h = str;
    }

    public final void setDuration(long j) {
        this.f155717g = j;
    }

    public final void setEncodeId(int i) {
        this.f155714d = i;
    }

    public final void setImportPath(String str) {
        this.f155715e = str;
    }

    public final void setImportfileDuration(long j) {
        this.f155716f = j;
    }

    public final void setMusicId(String str) {
        this.f155719i = str;
    }

    public final void setOriginFps(int i) {
        this.f155720j = i;
    }

    public final void setRealImportPath(String str) {
        this.f155722l = str;
    }

    public final void setVideoHeight(int i) {
        this.f155712b = i;
    }

    public final void setVideoWidth(int i) {
        this.f155711a = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ImportVideoInfo(Parcel parcel) {
        this(0, 0, 0, 0, null, 0, 0, null, null, 0, 0.0f, null, 4095, null);
        C89219l.m154721d(parcel, "");
        this.f155711a = parcel.readInt();
        this.f155712b = parcel.readInt();
        this.f155713c = parcel.readInt();
        this.f155714d = parcel.readInt();
        this.f155715e = parcel.readString();
        this.f155716f = parcel.readLong();
        this.f155717g = parcel.readLong();
        this.f155718h = parcel.readString();
        this.f155719i = parcel.readString();
        this.f155720j = parcel.readInt();
        this.f155721k = parcel.readFloat();
        this.f155722l = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeInt(this.f155711a);
        parcel.writeInt(this.f155712b);
        parcel.writeInt(this.f155713c);
        parcel.writeInt(this.f155714d);
        parcel.writeString(this.f155715e);
        parcel.writeLong(this.f155716f);
        parcel.writeLong(this.f155717g);
        parcel.writeString(this.f155718h);
        parcel.writeString(this.f155719i);
        parcel.writeInt(this.f155720j);
        parcel.writeFloat(this.f155721k);
        parcel.writeString(this.f155722l);
    }

    public ImportVideoInfo(int i, int i2, int i3, int i4, String str, long j, long j2, String str2, String str3, int i5, float f, String str4) {
        this.f155711a = i;
        this.f155712b = i2;
        this.f155713c = i3;
        this.f155714d = i4;
        this.f155715e = str;
        this.f155716f = j;
        this.f155717g = j2;
        this.f155718h = str2;
        this.f155719i = str3;
        this.f155720j = i5;
        this.f155721k = f;
        this.f155722l = str4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ImportVideoInfo(int i, int i2, int i3, int i4, String str, long j, long j2, String str2, String str3, int i5, float f, String str4, int i6, C89214g gVar) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) != 0 ? 0 : i4, (i6 & 16) != 0 ? null : str, (i6 & 32) != 0 ? 0 : j, (i6 & 64) == 0 ? j2 : 0, (i6 & 128) != 0 ? null : str2, (i6 & 256) != 0 ? null : str3, (i6 & 512) == 0 ? i5 : 0, (i6 & 1024) != 0 ? 1.0f : f, (i6 & 2048) == 0 ? str4 : null);
    }
}
