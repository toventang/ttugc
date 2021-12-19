package com.p2082ss.android.ugc.aweme.story.edit.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.edit.model.StoryEditMusicModel */
public final class StoryEditMusicModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<StoryEditMusicModel> CREATOR = new C77147a();

    /* renamed from: a */
    private final String f173060a;

    /* renamed from: b */
    private final String f173061b;

    /* renamed from: c */
    private final String f173062c;

    /* renamed from: d */
    private final int f173063d;

    /* renamed from: e */
    private final int f173064e;

    /* renamed from: f */
    private final int f173065f;

    /* renamed from: g */
    private final int f173066g;

    /* renamed from: h */
    private final int f173067h;

    /* renamed from: i */
    private final boolean f173068i;

    /* renamed from: j */
    private final C69905c f173069j;

    static {
        Covode.recordClassIndex(90154);
    }

    public StoryEditMusicModel() {
        this(null, null, null, 0, 0, 0, 0, 0, false, null, 1023, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_story_edit_model_StoryEditMusicModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m134748xb0c52471(int i) {
        return i;
    }

    public static /* synthetic */ StoryEditMusicModel copy$default(StoryEditMusicModel storyEditMusicModel, String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, boolean z, C69905c cVar, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = storyEditMusicModel.f173060a;
        }
        if ((i6 & 2) != 0) {
            str2 = storyEditMusicModel.f173061b;
        }
        if ((i6 & 4) != 0) {
            str3 = storyEditMusicModel.f173062c;
        }
        if ((i6 & 8) != 0) {
            i = storyEditMusicModel.f173063d;
        }
        if ((i6 & 16) != 0) {
            i2 = storyEditMusicModel.f173064e;
        }
        if ((i6 & 32) != 0) {
            i3 = storyEditMusicModel.f173065f;
        }
        if ((i6 & 64) != 0) {
            i4 = storyEditMusicModel.f173066g;
        }
        if ((i6 & 128) != 0) {
            i5 = storyEditMusicModel.f173067h;
        }
        if ((i6 & 256) != 0) {
            z = storyEditMusicModel.f173068i;
        }
        if ((i6 & 512) != 0) {
            cVar = storyEditMusicModel.f173069j;
        }
        return storyEditMusicModel.copy(str, str2, str3, i, i2, i3, i4, i5, z, cVar);
    }

    public final String component1() {
        return this.f173060a;
    }

    public final C69905c component10() {
        return this.f173069j;
    }

    public final String component2() {
        return this.f173061b;
    }

    public final String component3() {
        return this.f173062c;
    }

    public final int component4() {
        return this.f173063d;
    }

    public final int component5() {
        return this.f173064e;
    }

    public final int component6() {
        return this.f173065f;
    }

    public final int component7() {
        return this.f173066g;
    }

    public final int component8() {
        return this.f173067h;
    }

    public final boolean component9() {
        return this.f173068i;
    }

    public final StoryEditMusicModel copy(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, boolean z, C69905c cVar) {
        return new StoryEditMusicModel(str, str2, str3, i, i2, i3, i4, i5, z, cVar);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryEditMusicModel)) {
            return false;
        }
        StoryEditMusicModel storyEditMusicModel = (StoryEditMusicModel) obj;
        return C89219l.m154714a(this.f173060a, storyEditMusicModel.f173060a) && C89219l.m154714a(this.f173061b, storyEditMusicModel.f173061b) && C89219l.m154714a(this.f173062c, storyEditMusicModel.f173062c) && this.f173063d == storyEditMusicModel.f173063d && this.f173064e == storyEditMusicModel.f173064e && this.f173065f == storyEditMusicModel.f173065f && this.f173066g == storyEditMusicModel.f173066g && this.f173067h == storyEditMusicModel.f173067h && this.f173068i == storyEditMusicModel.f173068i && C89219l.m154714a(this.f173069j, storyEditMusicModel.f173069j);
    }

    public final int hashCode() {
        String str = this.f173060a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f173061b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f173062c;
        int hashCode3 = (((((((((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + m134748xb0c52471(this.f173063d)) * 31) + m134748xb0c52471(this.f173064e)) * 31) + m134748xb0c52471(this.f173065f)) * 31) + m134748xb0c52471(this.f173066g)) * 31) + m134748xb0c52471(this.f173067h)) * 31;
        boolean z = this.f173068i;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode3 + i2) * 31;
        C69905c cVar = this.f173069j;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        return "StoryEditMusicModel(musicPath=" + this.f173060a + ", musicId=" + this.f173061b + ", musicOrigin=" + this.f173062c + ", musicStart=" + this.f173063d + ", musicEnd=" + this.f173064e + ", musicLength=" + this.f173065f + ", musicShowRank=" + this.f173066g + ", musicRecType=" + this.f173067h + ", isMusicLoop=" + this.f173068i + ", currentMusic=" + this.f173069j + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f173060a);
        parcel.writeString(this.f173061b);
        parcel.writeString(this.f173062c);
        parcel.writeInt(this.f173063d);
        parcel.writeInt(this.f173064e);
        parcel.writeInt(this.f173065f);
        parcel.writeInt(this.f173066g);
        parcel.writeInt(this.f173067h);
        parcel.writeInt(this.f173068i ? 1 : 0);
        parcel.writeSerializable(this.f173069j);
    }

    public final C69905c getCurrentMusic() {
        return this.f173069j;
    }

    public final int getMusicEnd() {
        return this.f173064e;
    }

    public final String getMusicId() {
        return this.f173061b;
    }

    public final int getMusicLength() {
        return this.f173065f;
    }

    public final String getMusicOrigin() {
        return this.f173062c;
    }

    public final String getMusicPath() {
        return this.f173060a;
    }

    public final int getMusicRecType() {
        return this.f173067h;
    }

    public final int getMusicShowRank() {
        return this.f173066g;
    }

    public final int getMusicStart() {
        return this.f173063d;
    }

    public final boolean isMusicLoop() {
        return this.f173068i;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.model.StoryEditMusicModel$a */
    public static class C77147a implements Parcelable.Creator<StoryEditMusicModel> {
        static {
            Covode.recordClassIndex(90155);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ StoryEditMusicModel[] newArray(int i) {
            return new StoryEditMusicModel[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ StoryEditMusicModel createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new StoryEditMusicModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, (C69905c) parcel.readSerializable());
        }
    }

    public StoryEditMusicModel(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, boolean z, C69905c cVar) {
        this.f173060a = str;
        this.f173061b = str2;
        this.f173062c = str3;
        this.f173063d = i;
        this.f173064e = i2;
        this.f173065f = i3;
        this.f173066g = i4;
        this.f173067h = i5;
        this.f173068i = z;
        this.f173069j = cVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StoryEditMusicModel(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, boolean z, C69905c cVar, int i6, C89214g gVar) {
        this((i6 & 1) != 0 ? null : str, (i6 & 2) != 0 ? null : str2, (i6 & 4) != 0 ? null : str3, (i6 & 8) != 0 ? 0 : i, (i6 & 16) != 0 ? -1 : i2, (i6 & 32) != 0 ? 0 : i3, (i6 & 64) != 0 ? 0 : i4, (i6 & 128) != 0 ? 0 : i5, (i6 & 256) == 0 ? z : false, (i6 & 512) == 0 ? cVar : null);
    }
}
