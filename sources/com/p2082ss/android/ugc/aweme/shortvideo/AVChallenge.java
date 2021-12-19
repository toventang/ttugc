package com.p2082ss.android.ugc.aweme.shortvideo;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27890b;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.shortvideo.mapping.AVChallengeExtrasAdapterFactory;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.AVChallenge */
public class AVChallenge implements Parcelable, Serializable {
    public static final Parcelable.Creator<AVChallenge> CREATOR = new Parcelable.Creator<AVChallenge>() {
        /* class com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge.C697201 */

        static {
            Covode.recordClassIndex(82100);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ AVChallenge[] newArray(int i) {
            return new AVChallenge[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AVChallenge createFromParcel(Parcel parcel) {
            return new AVChallenge(parcel);
        }
    };
    @AbstractC27891c(mo46611a = "with_sticker_on_edit_page")

    /* renamed from: a */
    private int f155634a;
    @AbstractC27891c(mo46611a = "align")
    public int align;
    @AbstractC27890b(mo46609a = AVChallengeExtrasAdapterFactory.class)

    /* renamed from: b */
    private HashMap<String, Serializable> f155635b;
    @AbstractC27891c(mo46611a = "can_use_under_line")
    public boolean canUseUnderLine;
    @AbstractC27891c(mo46611a = "cha_name")
    public String challengeName;
    @AbstractC27891c(mo46611a = "cid")
    public String cid;
    @AbstractC27891c(mo46611a = "game_tpl_id")
    public String dynamicRecordLynxChannel;
    @AbstractC27891c(mo46611a = "group_id")
    public String groupId;
    @AbstractC27891c(mo46611a = "init_offset_isLeftAxis")
    public boolean initOffsetIsLeftAxis;
    @AbstractC27891c(mo46611a = "init_offset_x")
    public float initOffsetX;
    @AbstractC27891c(mo46611a = "init_offset_y")
    public float initOffsetY;
    @AbstractC27891c(mo46611a = "is_commerce")
    public boolean isCommerce;
    @AbstractC27891c(mo46611a = "is_status")
    public Boolean mStatus;
    @AbstractC27891c(mo46611a = "music_id")
    public String musicId;
    @AbstractC27891c(mo46611a = "mv_id")
    public String mvId;
    @AbstractC27891c(mo46611a = "sticker_id")
    public String stickerId;
    @AbstractC27891c(mo46611a = "text_color")
    public int textColor;
    @AbstractC27891c(mo46611a = "text_size")
    public float textSize;
    @AbstractC27891c(mo46611a = StringSet.type)
    public int type;
    @AbstractC27891c(mo46611a = "user_count")
    public int userCount;
    @AbstractC27891c(mo46611a = "view_count")
    public long viewCount;

    public int describeContents() {
        return 0;
    }

    public String getChallengeName() {
        return this.challengeName;
    }

    public String getCid() {
        return this.cid;
    }

    public Map<String, Serializable> getExtras() {
        return this.f155635b;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public float getInitOffsetX() {
        return this.initOffsetX;
    }

    public float getInitOffsetY() {
        return this.initOffsetY;
    }

    public String getMusicId() {
        return this.musicId;
    }

    public String getMvId() {
        return this.mvId;
    }

    public Boolean getStatus() {
        return this.mStatus;
    }

    public String getStickerId() {
        return this.stickerId;
    }

    public int getUserCount() {
        return this.userCount;
    }

    public long getViewCount() {
        return this.viewCount;
    }

    public int getWithStickerOnEditPage() {
        return this.f155634a;
    }

    public boolean isCommerce() {
        return this.isCommerce;
    }

    static {
        Covode.recordClassIndex(82099);
    }

    public long getDisplayCount() {
        long viewCount2 = getViewCount();
        if (viewCount2 >= 0) {
            return viewCount2;
        }
        return (long) getUserCount();
    }

    public int hashCode() {
        String str = this.cid;
        if (str != null) {
            return str.hashCode();
        }
        String str2 = this.challengeName;
        if (str2 != null) {
            return str2.hashCode();
        }
        return super.hashCode();
    }

    public AVChallenge() {
        this.viewCount = -1;
        this.textSize = 24.0f;
        this.textColor = -1;
        this.align = 2;
        this.canUseUnderLine = true;
        this.mStatus = false;
        this.f155635b = new HashMap<>();
    }

    public void setWithStickerOnEditPage(int i) {
        this.f155634a = i;
    }

    public <T extends Serializable> T getFromExtra(String str) {
        Serializable serializable = this.f155635b.get(str);
        if (serializable == null) {
            return null;
        }
        return (T) serializable;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AVChallenge)) {
            return false;
        }
        AVChallenge aVChallenge = (AVChallenge) obj;
        if (!TextUtils.equals(aVChallenge.cid, this.cid) || !TextUtils.equals(aVChallenge.challengeName, this.challengeName)) {
            return false;
        }
        return true;
    }

    public boolean isNew(String str) {
        if (!TextUtils.isEmpty(this.cid) || TextUtils.isEmpty(str) || !str.equals(this.challengeName)) {
            return false;
        }
        return true;
    }

    protected AVChallenge(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        this.viewCount = -1;
        this.textSize = 24.0f;
        this.textColor = -1;
        this.align = 2;
        boolean z4 = true;
        this.canUseUnderLine = true;
        this.mStatus = false;
        this.f155635b = new HashMap<>();
        this.cid = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isCommerce = z;
        this.challengeName = parcel.readString();
        this.type = parcel.readInt();
        this.stickerId = parcel.readString();
        this.viewCount = parcel.readLong();
        this.userCount = parcel.readInt();
        this.musicId = parcel.readString();
        this.mvId = parcel.readString();
        this.f155634a = parcel.readInt();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.mStatus = Boolean.valueOf(z2);
        this.f155635b = (HashMap) parcel.readSerializable();
        this.initOffsetX = parcel.readFloat();
        this.initOffsetY = parcel.readFloat();
        this.textSize = parcel.readFloat();
        this.textColor = parcel.readInt();
        this.align = parcel.readInt();
        if (parcel.readInt() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.initOffsetIsLeftAxis = z3;
        this.canUseUnderLine = parcel.readInt() != 1 ? false : z4;
        this.dynamicRecordLynxChannel = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.cid);
        parcel.writeByte(this.isCommerce ? (byte) 1 : 0);
        parcel.writeString(this.challengeName);
        parcel.writeInt(this.type);
        parcel.writeString(this.stickerId);
        parcel.writeLong(this.viewCount);
        parcel.writeInt(this.userCount);
        parcel.writeString(this.musicId);
        parcel.writeString(this.mvId);
        parcel.writeInt(this.f155634a);
        parcel.writeByte(this.mStatus.booleanValue() ? (byte) 1 : 0);
        parcel.writeSerializable(this.f155635b);
        parcel.writeFloat(this.initOffsetX);
        parcel.writeFloat(this.initOffsetY);
        parcel.writeFloat(this.textSize);
        parcel.writeInt(this.textColor);
        parcel.writeInt(this.align);
        parcel.writeInt(this.initOffsetIsLeftAxis ? 1 : 0);
        parcel.writeInt(this.canUseUnderLine ? 1 : 0);
        parcel.writeString(this.dynamicRecordLynxChannel);
    }
}
