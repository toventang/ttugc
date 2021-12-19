package com.p2082ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.model.UserWithAweme */
public final class UserWithAweme implements Serializable, Cloneable {
    @AbstractC27891c(mo46611a = "aweme")
    private final Aweme aweme;
    @AbstractC27891c(mo46611a = "user")
    private final User user;

    static {
        Covode.recordClassIndex(60939);
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final User getUser() {
        return this.user;
    }

    @Override // java.lang.Object
    public final UserWithAweme clone() {
        try {
            Object clone = super.clone();
            if (clone != null) {
                return (UserWithAweme) clone;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.friends.model.UserWithAweme");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return new UserWithAweme(new User(), new Aweme());
        }
    }

    public UserWithAweme(User user2, Aweme aweme2) {
        C89219l.m154721d(user2, "");
        C89219l.m154721d(aweme2, "");
        this.user = user2;
        this.aweme = aweme2;
    }
}
