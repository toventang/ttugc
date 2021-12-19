package com.p2082ss.android.ugc.aweme.shortvideo.edit.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.model.SimpleTextStickerData */
public final class SimpleTextStickerData implements Parcelable, Cloneable {
    public static final Parcelable.Creator<SimpleTextStickerData> CREATOR = new C71408a();
    @AbstractC27891c(mo46611a = "old_text")
    private String audioText;
    @AbstractC27891c(mo46611a = "audio_track_duration")
    private int audioTrackDuration;
    @AbstractC27891c(mo46611a = "audio_track_file_path")
    private String audioTrackFilePath;
    @AbstractC27891c(mo46611a = "audio_track_index")
    private int audioTrackIndex;
    @AbstractC27891c(mo46611a = "has_read_text_audio")
    private boolean hasReadTextAudio;
    @AbstractC27891c(mo46611a = "speaker_id")
    private String speakerID;

    static {
        Covode.recordClassIndex(83939);
    }

    public SimpleTextStickerData() {
        this(false, null, 0, null, 0, null, 63, null);
    }

    public SimpleTextStickerData(boolean z) {
        this(z, null, 0, null, 0, null, 62, null);
    }

    public SimpleTextStickerData(boolean z, String str) {
        this(z, str, 0, null, 0, null, 60, null);
    }

    public SimpleTextStickerData(boolean z, String str, int i) {
        this(z, str, i, null, 0, null, 56, null);
    }

    public SimpleTextStickerData(boolean z, String str, int i, String str2) {
        this(z, str, i, str2, 0, null, 48, null);
    }

    public SimpleTextStickerData(boolean z, String str, int i, String str2, int i2) {
        this(z, str, i, str2, i2, null, 32, null);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeInt(this.hasReadTextAudio ? 1 : 0);
        parcel.writeString(this.speakerID);
        parcel.writeInt(this.audioTrackIndex);
        parcel.writeString(this.audioTrackFilePath);
        parcel.writeInt(this.audioTrackDuration);
        parcel.writeString(this.audioText);
    }

    public final String getAudioText() {
        return this.audioText;
    }

    public final int getAudioTrackDuration() {
        return this.audioTrackDuration;
    }

    public final String getAudioTrackFilePath() {
        return this.audioTrackFilePath;
    }

    public final int getAudioTrackIndex() {
        return this.audioTrackIndex;
    }

    public final boolean getHasReadTextAudio() {
        return this.hasReadTextAudio;
    }

    public final String getSpeakerID() {
        return this.speakerID;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.model.SimpleTextStickerData$a */
    public static class C71408a implements Parcelable.Creator<SimpleTextStickerData> {
        static {
            Covode.recordClassIndex(83940);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SimpleTextStickerData[] newArray(int i) {
            return new SimpleTextStickerData[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SimpleTextStickerData createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new SimpleTextStickerData(parcel.readInt() != 0, parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString());
        }
    }

    @Override // java.lang.Object
    public final Object clone() {
        return super.clone();
    }

    public final void setAudioText(String str) {
        this.audioText = str;
    }

    public final void setAudioTrackDuration(int i) {
        this.audioTrackDuration = i;
    }

    public final void setAudioTrackFilePath(String str) {
        this.audioTrackFilePath = str;
    }

    public final void setAudioTrackIndex(int i) {
        this.audioTrackIndex = i;
    }

    public final void setHasReadTextAudio(boolean z) {
        this.hasReadTextAudio = z;
    }

    public final void setSpeakerID(String str) {
        this.speakerID = str;
    }

    public SimpleTextStickerData(boolean z, String str, int i, String str2, int i2, String str3) {
        this.hasReadTextAudio = z;
        this.speakerID = str;
        this.audioTrackIndex = i;
        this.audioTrackFilePath = str2;
        this.audioTrackDuration = i2;
        this.audioText = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SimpleTextStickerData(boolean z, String str, int i, String str2, int i2, String str3, int i3, C89214g gVar) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? -1 : i, (i3 & 8) != 0 ? null : str2, (i3 & 16) == 0 ? i2 : 0, (i3 & 32) == 0 ? str3 : null);
    }
}
