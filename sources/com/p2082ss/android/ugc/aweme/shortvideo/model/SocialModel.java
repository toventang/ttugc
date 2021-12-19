package com.p2082ss.android.ugc.aweme.shortvideo.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.SocialModel */
public class SocialModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<SocialModel> CREATOR = new Parcelable.Creator<SocialModel>() {
        /* class com.p2082ss.android.ugc.aweme.shortvideo.model.SocialModel.C719881 */

        static {
            Covode.recordClassIndex(84623);
        }

        @Override // android.os.Parcelable.Creator
        public final SocialModel[] newArray(int i) {
            return new SocialModel[i];
        }

        @Override // android.os.Parcelable.Creator
        public final SocialModel createFromParcel(Parcel parcel) {
            return new SocialModel(parcel);
        }
    };
    @AbstractC27891c(mo46611a = "friends")
    public List<String> friends;
    @AbstractC27891c(mo46611a = "rec_users")
    public List<String> recUsers;
    @AbstractC27891c(mo46611a = "recommend")
    public int recommend;

    public int describeContents() {
        return 0;
    }

    public SocialModel() {
    }

    static {
        Covode.recordClassIndex(84622);
    }

    public String getFriends() {
        List<String> list = this.friends;
        if (list == null || list.size() == 0) {
            return null;
        }
        return TextUtils.join(",", this.friends);
    }

    public String getRecUsers() {
        List<String> list = this.recUsers;
        if (list == null || list.size() == 0) {
            return null;
        }
        return TextUtils.join(",", this.recUsers);
    }

    protected SocialModel(Parcel parcel) {
        this.recommend = parcel.readInt();
        this.friends = parcel.createStringArrayList();
        this.recUsers = parcel.createStringArrayList();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.recommend);
        parcel.writeStringList(this.friends);
        parcel.writeStringList(this.recUsers);
    }
}
