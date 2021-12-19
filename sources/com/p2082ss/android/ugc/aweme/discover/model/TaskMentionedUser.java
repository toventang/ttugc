package com.p2082ss.android.ugc.aweme.discover.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.model.TaskMentionedUser */
public class TaskMentionedUser implements Parcelable, Serializable {
    public static final Parcelable.Creator<TaskMentionedUser> CREATOR = new Parcelable.Creator<TaskMentionedUser>() {
        /* class com.p2082ss.android.ugc.aweme.discover.model.TaskMentionedUser.C424731 */

        static {
            Covode.recordClassIndex(50531);
        }

        @Override // android.os.Parcelable.Creator
        public final TaskMentionedUser[] newArray(int i) {
            return new TaskMentionedUser[i];
        }

        @Override // android.os.Parcelable.Creator
        public final TaskMentionedUser createFromParcel(Parcel parcel) {
            return new TaskMentionedUser(parcel);
        }
    };
    @AbstractC27891c(mo46611a = "nickname")
    private String nickname;
    @AbstractC27891c(mo46611a = "sec_uid")
    private String secUid = "";
    @AbstractC27891c(mo46611a = "uid")
    private String userId = "";

    public int describeContents() {
        return 0;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getSecUid() {
        return this.secUid;
    }

    public String getUserId() {
        return this.userId;
    }

    static {
        Covode.recordClassIndex(50530);
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setSecUid(String str) {
        this.secUid = str;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    protected TaskMentionedUser(Parcel parcel) {
        this.userId = parcel.readString();
        this.secUid = parcel.readString();
        this.nickname = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.userId);
        parcel.writeString(this.secUid);
        parcel.writeString(this.nickname);
    }
}
