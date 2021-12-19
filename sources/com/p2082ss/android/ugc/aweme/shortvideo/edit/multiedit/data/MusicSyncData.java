package com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MusicSyncData */
public final class MusicSyncData implements Parcelable, Serializable {
    public static final Parcelable.Creator<MusicSyncData> CREATOR = new C71492a();
    @AbstractC27891c(mo46611a = "music_sync_start")

    /* renamed from: a */
    private final long f160196a;
    @AbstractC27891c(mo46611a = "music_sync_end")

    /* renamed from: b */
    private final long f160197b;
    @AbstractC27891c(mo46611a = "music_sync_video_duration")

    /* renamed from: c */
    private final long f160198c;

    static {
        Covode.recordClassIndex(84031);
    }

    public MusicSyncData() {
        this(0, 0, 0, 7, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_shortvideo_edit_multiedit_data_MusicSyncData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m126269xc5c8f395(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ MusicSyncData copy$default(MusicSyncData musicSyncData, long j, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = musicSyncData.f160196a;
        }
        if ((i & 2) != 0) {
            j2 = musicSyncData.f160197b;
        }
        if ((i & 4) != 0) {
            j3 = musicSyncData.f160198c;
        }
        return musicSyncData.copy(j, j2, j3);
    }

    public final long component1() {
        return this.f160196a;
    }

    public final long component2() {
        return this.f160197b;
    }

    public final long component3() {
        return this.f160198c;
    }

    public final MusicSyncData copy(long j, long j2, long j3) {
        return new MusicSyncData(j, j2, j3);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicSyncData)) {
            return false;
        }
        MusicSyncData musicSyncData = (MusicSyncData) obj;
        return this.f160196a == musicSyncData.f160196a && this.f160197b == musicSyncData.f160197b && this.f160198c == musicSyncData.f160198c;
    }

    public final int hashCode() {
        return (((m126269xc5c8f395(this.f160196a) * 31) + m126269xc5c8f395(this.f160197b)) * 31) + m126269xc5c8f395(this.f160198c);
    }

    public final String toString() {
        return "MusicSyncData(videoStart=" + this.f160196a + ", videoEnd=" + this.f160197b + ", videoDuration=" + this.f160198c + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeLong(this.f160196a);
        parcel.writeLong(this.f160197b);
        parcel.writeLong(this.f160198c);
    }

    public final long getVideoDuration() {
        return this.f160198c;
    }

    public final long getVideoEnd() {
        return this.f160197b;
    }

    public final long getVideoStart() {
        return this.f160196a;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MusicSyncData$a */
    public static class C71492a implements Parcelable.Creator<MusicSyncData> {
        static {
            Covode.recordClassIndex(84032);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ MusicSyncData[] newArray(int i) {
            return new MusicSyncData[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MusicSyncData createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new MusicSyncData(parcel.readLong(), parcel.readLong(), parcel.readLong());
        }
    }

    public MusicSyncData(long j, long j2, long j3) {
        this.f160196a = j;
        this.f160197b = j2;
        this.f160198c = j3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MusicSyncData(long j, long j2, long j3, int i, C89214g gVar) {
        this((i & 1) != 0 ? 0 : j, (i & 2) != 0 ? 0 : j2, (i & 4) != 0 ? 0 : j3);
    }
}
