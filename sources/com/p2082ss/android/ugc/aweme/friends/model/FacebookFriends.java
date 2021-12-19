package com.p2082ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.friends.model.FacebookFriends */
public final class FacebookFriends extends Friend {
    private final int type;

    static {
        Covode.recordClassIndex(60886);
    }

    /* renamed from: com_ss_android_ugc_aweme_friends_model_FacebookFriends_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m96093x888b2b10(int i) {
        return i;
    }

    public static /* synthetic */ FacebookFriends copy$default(FacebookFriends facebookFriends, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = facebookFriends.type;
        }
        return facebookFriends.copy(i);
    }

    public final int component1() {
        return this.type;
    }

    public final FacebookFriends copy(int i) {
        return new FacebookFriends(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.model.Friend, com.p2082ss.android.ugc.aweme.profile.model.User
    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof FacebookFriends) && this.type == ((FacebookFriends) obj).type;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.model.Friend, com.p2082ss.android.ugc.aweme.profile.model.User
    public final int hashCode() {
        return m96093x888b2b10(this.type);
    }

    public final String toString() {
        return "FacebookFriends(type=" + this.type + ")";
    }

    public final int getType() {
        return this.type;
    }

    public FacebookFriends(int i) {
        super(null);
        this.type = i;
    }
}
