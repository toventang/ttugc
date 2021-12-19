package com.p2082ss.android.ugc.aweme.shortvideo.reaction;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.reaction.ReactionParams */
public class ReactionParams implements Parcelable, Serializable {
    public static final Parcelable.Creator<ReactionParams> CREATOR = new Parcelable.Creator<ReactionParams>() {
        /* class com.p2082ss.android.ugc.aweme.shortvideo.reaction.ReactionParams.C727281 */

        static {
            Covode.recordClassIndex(85413);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ReactionParams[] newArray(int i) {
            return new ReactionParams[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ReactionParams createFromParcel(Parcel parcel) {
            return new ReactionParams(parcel);
        }
    };
    @AbstractC27891c(mo46611a = "non_reacted_video")
    public boolean nonReacted;
    @AbstractC27891c(mo46611a = "reaction_from_id")
    public String reactionFromId;
    @AbstractC27891c(mo46611a = "reaction_origin_id")
    public String reactionOriginId;
    @AbstractC27891c(mo46611a = "reaction_view_id")
    public String reactionViewId;
    @AbstractC27891c(mo46611a = "video_height")
    public int videoHeight;
    @AbstractC27891c(mo46611a = "video_path")
    public String videoPath;
    @AbstractC27891c(mo46611a = "video_width")
    public int videoWidth;
    @AbstractC27891c(mo46611a = "wav_path")
    public String wavPath;
    @AbstractC27891c(mo46611a = "react_shape_list")
    public List<CopiedReactionWindowInfo> windowInfoList = new ArrayList();

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(85412);
    }

    public ReactionParams() {
    }

    public boolean removeReactionWindowInfo() {
        if (this.windowInfoList.size() <= 0) {
            return false;
        }
        List<CopiedReactionWindowInfo> list = this.windowInfoList;
        list.remove(list.size() - 1);
        return true;
    }

    public void addReactionWindowInfo(CopiedReactionWindowInfo copiedReactionWindowInfo) {
        this.windowInfoList.add(copiedReactionWindowInfo);
    }

    protected ReactionParams(Parcel parcel) {
        boolean z;
        this.videoPath = parcel.readString();
        this.wavPath = parcel.readString();
        this.videoWidth = parcel.readInt();
        this.videoHeight = parcel.readInt();
        this.reactionViewId = parcel.readString();
        this.reactionOriginId = parcel.readString();
        this.reactionFromId = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.nonReacted = z;
        this.windowInfoList = parcel.createTypedArrayList(CopiedReactionWindowInfo.CREATOR);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.videoPath);
        parcel.writeString(this.wavPath);
        parcel.writeInt(this.videoWidth);
        parcel.writeInt(this.videoHeight);
        parcel.writeString(this.reactionViewId);
        parcel.writeString(this.reactionOriginId);
        parcel.writeString(this.reactionFromId);
        parcel.writeByte(this.nonReacted ? (byte) 1 : 0);
        parcel.writeTypedList(this.windowInfoList);
    }
}
