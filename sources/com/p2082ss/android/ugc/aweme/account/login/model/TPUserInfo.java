package com.p2082ss.android.ugc.aweme.account.login.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.util.C33052u;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.model.TPUserInfo */
public final class TPUserInfo {
    public static final C31965a Companion = new C31965a((byte) 0);
    private final String avatarUrl;
    private final String userName;

    static {
        Covode.recordClassIndex(38718);
    }

    public static /* synthetic */ TPUserInfo copy$default(TPUserInfo tPUserInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tPUserInfo.userName;
        }
        if ((i & 2) != 0) {
            str2 = tPUserInfo.avatarUrl;
        }
        return tPUserInfo.copy(str, str2);
    }

    public static final TPUserInfo from(User user) {
        return C31965a.m66333a(user);
    }

    public final String component1() {
        return this.userName;
    }

    public final String component2() {
        return this.avatarUrl;
    }

    public final TPUserInfo copy(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return new TPUserInfo(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TPUserInfo)) {
            return false;
        }
        TPUserInfo tPUserInfo = (TPUserInfo) obj;
        return C89219l.m154714a(this.userName, tPUserInfo.userName) && C89219l.m154714a(this.avatarUrl, tPUserInfo.avatarUrl);
    }

    public final int hashCode() {
        String str = this.userName;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.avatarUrl;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "TPUserInfo(userName=" + this.userName + ", avatarUrl=" + this.avatarUrl + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.model.TPUserInfo$a */
    public static final class C31965a {
        static {
            Covode.recordClassIndex(38719);
        }

        private C31965a() {
        }

        public /* synthetic */ C31965a(byte b) {
            this();
        }

        /* renamed from: a */
        public static TPUserInfo m66333a(User user) {
            String str;
            C89219l.m154721d(user, "");
            String a = C33052u.m67704a(user);
            C89219l.m154716b(a, "");
            if (user.getAvatarThumb() != null) {
                UrlModel avatarThumb = user.getAvatarThumb();
                C89219l.m154716b(avatarThumb, "");
                if (avatarThumb.getUrlList() != null) {
                    UrlModel avatarThumb2 = user.getAvatarThumb();
                    C89219l.m154716b(avatarThumb2, "");
                    if (!avatarThumb2.getUrlList().isEmpty()) {
                        UrlModel avatarThumb3 = user.getAvatarThumb();
                        C89219l.m154716b(avatarThumb3, "");
                        str = avatarThumb3.getUrlList().get(0);
                        C89219l.m154716b(str, "");
                        return new TPUserInfo(a, str);
                    }
                }
            }
            str = "";
            C89219l.m154716b(str, "");
            return new TPUserInfo(a, str);
        }
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getUserName() {
        return this.userName;
    }

    public TPUserInfo(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.userName = str;
        this.avatarUrl = str2;
    }
}
