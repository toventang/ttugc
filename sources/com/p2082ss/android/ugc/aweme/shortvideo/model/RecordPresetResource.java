package com.p2082ss.android.ugc.aweme.shortvideo.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.RecordPresetResource */
public final class RecordPresetResource implements Parcelable, Serializable {
    public static final Parcelable.Creator<RecordPresetResource> CREATOR = new Creator();
    private Effect effect;
    private String effectId;
    private String musicId;
    private MusicModel musicModel;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.model.RecordPresetResource$Creator */
    public static class Creator implements Parcelable.Creator<RecordPresetResource> {
        static {
            Covode.recordClassIndex(84611);
        }

        @Override // android.os.Parcelable.Creator
        public final RecordPresetResource createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new RecordPresetResource(parcel.readString(), (Effect) parcel.readParcelable(RecordPresetResource.class.getClassLoader()), parcel.readString(), (MusicModel) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final RecordPresetResource[] newArray(int i) {
            return new RecordPresetResource[i];
        }
    }

    static {
        Covode.recordClassIndex(84610);
    }

    public RecordPresetResource() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ RecordPresetResource copy$default(RecordPresetResource recordPresetResource, String str, Effect effect2, String str2, MusicModel musicModel2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recordPresetResource.effectId;
        }
        if ((i & 2) != 0) {
            effect2 = recordPresetResource.effect;
        }
        if ((i & 4) != 0) {
            str2 = recordPresetResource.musicId;
        }
        if ((i & 8) != 0) {
            musicModel2 = recordPresetResource.musicModel;
        }
        return recordPresetResource.copy(str, effect2, str2, musicModel2);
    }

    public final String component1() {
        return this.effectId;
    }

    public final Effect component2() {
        return this.effect;
    }

    public final String component3() {
        return this.musicId;
    }

    public final MusicModel component4() {
        return this.musicModel;
    }

    public final RecordPresetResource copy(String str, Effect effect2, String str2, MusicModel musicModel2) {
        return new RecordPresetResource(str, effect2, str2, musicModel2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecordPresetResource)) {
            return false;
        }
        RecordPresetResource recordPresetResource = (RecordPresetResource) obj;
        return C89219l.m154714a(this.effectId, recordPresetResource.effectId) && C89219l.m154714a(this.effect, recordPresetResource.effect) && C89219l.m154714a(this.musicId, recordPresetResource.musicId) && C89219l.m154714a(this.musicModel, recordPresetResource.musicModel);
    }

    public final int hashCode() {
        String str = this.effectId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Effect effect2 = this.effect;
        int hashCode2 = (hashCode + (effect2 != null ? effect2.hashCode() : 0)) * 31;
        String str2 = this.musicId;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        MusicModel musicModel2 = this.musicModel;
        if (musicModel2 != null) {
            i = musicModel2.hashCode();
        }
        return hashCode3 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.effectId);
        parcel.writeParcelable(this.effect, i);
        parcel.writeString(this.musicId);
        parcel.writeSerializable(this.musicModel);
    }

    public final Effect getEffect() {
        return this.effect;
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final MusicModel getMusicModel() {
        return this.musicModel;
    }

    public final String toString() {
        return "effectId: " + this.effectId + ", musicId: " + this.musicId + ", effect: " + String.valueOf(this.effect) + ", musicModel: " + String.valueOf(this.musicModel);
    }

    public final void setEffect(Effect effect2) {
        this.effect = effect2;
    }

    public final void setEffectId(String str) {
        this.effectId = str;
    }

    public final void setMusicId(String str) {
        this.musicId = str;
    }

    public final void setMusicModel(MusicModel musicModel2) {
        this.musicModel = musicModel2;
    }

    public RecordPresetResource(String str, Effect effect2, String str2, MusicModel musicModel2) {
        this.effectId = str;
        this.effect = effect2;
        this.musicId = str2;
        this.musicModel = musicModel2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RecordPresetResource(String str, Effect effect2, String str2, MusicModel musicModel2, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : effect2, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : musicModel2);
    }
}
