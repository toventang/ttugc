package com.p2082ss.android.ugc.aweme.shortvideo.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.Mission */
public final class Mission implements Parcelable, Serializable {
    public static final Parcelable.Creator<Mission> CREATOR = new Creator();
    @AbstractC27891c(mo46611a = "challenges")
    private final List<String> challengeNames;
    @AbstractC27891c(mo46611a = "enter_from")
    private String enterFrom;
    @AbstractC27891c(mo46611a = "is_challenge_toasted")
    private boolean isChallengeToasted;
    @AbstractC27891c(mo46611a = "is_music_toasted")
    private boolean isMusicToasted;
    @AbstractC27891c(mo46611a = "is_sticker_toasted")
    private boolean isStickerToasted;
    @AbstractC27891c(mo46611a = "is_user_toasted")
    private boolean isUserToasted;
    @AbstractC27891c(mo46611a = "mentioned_user")
    private List<MissionUser> mentionedUsers;
    @AbstractC27891c(mo46611a = "mission_id")
    private final String missionId;
    @AbstractC27891c(mo46611a = "music_id")
    private final String musicId;
    @AbstractC27891c(mo46611a = "sticker_id")
    private final String stickerId;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.model.Mission$Creator */
    public static class Creator implements Parcelable.Creator<Mission> {
        static {
            Covode.recordClassIndex(84595);
        }

        @Override // android.os.Parcelable.Creator
        public final Mission createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            C89219l.m154721d(parcel, "");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            String readString3 = parcel.readString();
            boolean z2 = parcel.readInt() != 0;
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            boolean z3 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add(parcel.readSerializable());
                    readInt--;
                }
            } else {
                arrayList = null;
            }
            return new Mission(readString, readString2, z, readString3, z2, createStringArrayList, z3, arrayList, parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Mission[] newArray(int i) {
            return new Mission[i];
        }
    }

    static {
        Covode.recordClassIndex(84594);
    }

    public Mission() {
        this(null, null, false, null, false, null, false, null, false, null, 1023, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.shortvideo.model.Mission */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Mission copy$default(Mission mission, String str, String str2, boolean z, String str3, boolean z2, List list, boolean z3, List list2, boolean z4, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mission.missionId;
        }
        if ((i & 2) != 0) {
            str2 = mission.stickerId;
        }
        if ((i & 4) != 0) {
            z = mission.isStickerToasted;
        }
        if ((i & 8) != 0) {
            str3 = mission.musicId;
        }
        if ((i & 16) != 0) {
            z2 = mission.isMusicToasted;
        }
        if ((i & 32) != 0) {
            list = mission.challengeNames;
        }
        if ((i & 64) != 0) {
            z3 = mission.isChallengeToasted;
        }
        if ((i & 128) != 0) {
            list2 = mission.mentionedUsers;
        }
        if ((i & 256) != 0) {
            z4 = mission.isUserToasted;
        }
        if ((i & 512) != 0) {
            str4 = mission.enterFrom;
        }
        return mission.copy(str, str2, z, str3, z2, list, z3, list2, z4, str4);
    }

    public final String component1() {
        return this.missionId;
    }

    public final String component10() {
        return this.enterFrom;
    }

    public final String component2() {
        return this.stickerId;
    }

    public final boolean component3() {
        return this.isStickerToasted;
    }

    public final String component4() {
        return this.musicId;
    }

    public final boolean component5() {
        return this.isMusicToasted;
    }

    public final List<String> component6() {
        return this.challengeNames;
    }

    public final boolean component7() {
        return this.isChallengeToasted;
    }

    public final List<MissionUser> component8() {
        return this.mentionedUsers;
    }

    public final boolean component9() {
        return this.isUserToasted;
    }

    public final Mission copy(String str, String str2, boolean z, String str3, boolean z2, List<String> list, boolean z3, List<MissionUser> list2, boolean z4, String str4) {
        return new Mission(str, str2, z, str3, z2, list, z3, list2, z4, str4);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mission)) {
            return false;
        }
        Mission mission = (Mission) obj;
        return C89219l.m154714a(this.missionId, mission.missionId) && C89219l.m154714a(this.stickerId, mission.stickerId) && this.isStickerToasted == mission.isStickerToasted && C89219l.m154714a(this.musicId, mission.musicId) && this.isMusicToasted == mission.isMusicToasted && C89219l.m154714a(this.challengeNames, mission.challengeNames) && this.isChallengeToasted == mission.isChallengeToasted && C89219l.m154714a(this.mentionedUsers, mission.mentionedUsers) && this.isUserToasted == mission.isUserToasted && C89219l.m154714a(this.enterFrom, mission.enterFrom);
    }

    public final int hashCode() {
        String str = this.missionId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.stickerId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.isStickerToasted;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode2 + i3) * 31;
        String str3 = this.musicId;
        int hashCode3 = (i6 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z2 = this.isMusicToasted;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (hashCode3 + i7) * 31;
        List<String> list = this.challengeNames;
        int hashCode4 = (i10 + (list != null ? list.hashCode() : 0)) * 31;
        boolean z3 = this.isChallengeToasted;
        if (z3) {
            z3 = true;
        }
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = (hashCode4 + i11) * 31;
        List<MissionUser> list2 = this.mentionedUsers;
        int hashCode5 = (i14 + (list2 != null ? list2.hashCode() : 0)) * 31;
        if (!this.isUserToasted) {
            i2 = 0;
        }
        int i15 = (hashCode5 + i2) * 31;
        String str4 = this.enterFrom;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i15 + i;
    }

    public final String toString() {
        return "Mission(missionId=" + this.missionId + ", stickerId=" + this.stickerId + ", isStickerToasted=" + this.isStickerToasted + ", musicId=" + this.musicId + ", isMusicToasted=" + this.isMusicToasted + ", challengeNames=" + this.challengeNames + ", isChallengeToasted=" + this.isChallengeToasted + ", mentionedUsers=" + this.mentionedUsers + ", isUserToasted=" + this.isUserToasted + ", enterFrom=" + this.enterFrom + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.missionId);
        parcel.writeString(this.stickerId);
        parcel.writeInt(this.isStickerToasted ? 1 : 0);
        parcel.writeString(this.musicId);
        parcel.writeInt(this.isMusicToasted ? 1 : 0);
        parcel.writeStringList(this.challengeNames);
        parcel.writeInt(this.isChallengeToasted ? 1 : 0);
        List<MissionUser> list = this.mentionedUsers;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (MissionUser missionUser : list) {
                parcel.writeSerializable(missionUser);
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.isUserToasted ? 1 : 0);
        parcel.writeString(this.enterFrom);
    }

    public final List<String> getChallengeNames() {
        return this.challengeNames;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final List<MissionUser> getMentionedUsers() {
        return this.mentionedUsers;
    }

    public final String getMissionId() {
        return this.missionId;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final String getStickerId() {
        return this.stickerId;
    }

    public final boolean isChallengeToasted() {
        return this.isChallengeToasted;
    }

    public final boolean isMusicToasted() {
        return this.isMusicToasted;
    }

    public final boolean isStickerToasted() {
        return this.isStickerToasted;
    }

    public final boolean isUserToasted() {
        return this.isUserToasted;
    }

    public final void setChallengeToasted(boolean z) {
        this.isChallengeToasted = z;
    }

    public final void setEnterFrom(String str) {
        this.enterFrom = str;
    }

    public final void setMentionedUsers(List<MissionUser> list) {
        this.mentionedUsers = list;
    }

    public final void setMusicToasted(boolean z) {
        this.isMusicToasted = z;
    }

    public final void setStickerToasted(boolean z) {
        this.isStickerToasted = z;
    }

    public final void setUserToasted(boolean z) {
        this.isUserToasted = z;
    }

    public Mission(String str, String str2, boolean z, String str3, boolean z2, List<String> list, boolean z3, List<MissionUser> list2, boolean z4, String str4) {
        this.missionId = str;
        this.stickerId = str2;
        this.isStickerToasted = z;
        this.musicId = str3;
        this.isMusicToasted = z2;
        this.challengeNames = list;
        this.isChallengeToasted = z3;
        this.mentionedUsers = list2;
        this.isUserToasted = z4;
        this.enterFrom = str4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Mission(String str, String str2, boolean z, String str3, boolean z2, List list, boolean z3, List list2, boolean z4, String str4, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? true : z, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? null : list, (i & 64) != 0 ? true : z3, (i & 128) != 0 ? null : list2, (i & 256) == 0 ? z4 : true, (i & 512) == 0 ? str4 : null);
    }
}
