package com.p2082ss.android.ugc.aweme.account.login.model;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.model.CommonUserInfo */
public final class CommonUserInfo {
    public static final C31964a Companion = new C31964a((byte) 0);
    private final String avatarUrl;
    private String screenName;
    private final String secUid;
    private final String userName;

    static {
        Covode.recordClassIndex(38711);
    }

    public static /* synthetic */ CommonUserInfo copy$default(CommonUserInfo commonUserInfo, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = commonUserInfo.userName;
        }
        if ((i & 2) != 0) {
            str2 = commonUserInfo.avatarUrl;
        }
        if ((i & 4) != 0) {
            str3 = commonUserInfo.secUid;
        }
        if ((i & 8) != 0) {
            str4 = commonUserInfo.screenName;
        }
        return commonUserInfo.copy(str, str2, str3, str4);
    }

    public static final CommonUserInfo defaultCommonUserInfo() {
        return C31964a.m66331a();
    }

    public final String component1() {
        return this.userName;
    }

    public final String component2() {
        return this.avatarUrl;
    }

    public final String component3() {
        return this.secUid;
    }

    public final String component4() {
        return this.screenName;
    }

    public final CommonUserInfo copy(String str, String str2, String str3, String str4) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return new CommonUserInfo(str, str2, str3, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonUserInfo)) {
            return false;
        }
        CommonUserInfo commonUserInfo = (CommonUserInfo) obj;
        return C89219l.m154714a(this.userName, commonUserInfo.userName) && C89219l.m154714a(this.avatarUrl, commonUserInfo.avatarUrl) && C89219l.m154714a(this.secUid, commonUserInfo.secUid) && C89219l.m154714a(this.screenName, commonUserInfo.screenName);
    }

    public final int hashCode() {
        String str = this.userName;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.avatarUrl;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.secUid;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.screenName;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "CommonUserInfo(userName=" + this.userName + ", avatarUrl=" + this.avatarUrl + ", secUid=" + this.secUid + ", screenName=" + this.screenName + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.model.CommonUserInfo$a */
    public static final class C31964a {
        static {
            Covode.recordClassIndex(38712);
        }

        private C31964a() {
        }

        /* renamed from: a */
        public static CommonUserInfo m66331a() {
            return new CommonUserInfo("", "", "", null, 8, null);
        }

        public /* synthetic */ C31964a(byte b) {
            this();
        }
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getScreenName() {
        return this.screenName;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final String getUserName() {
        return this.userName;
    }

    public final boolean isCommonInfoAvailable() {
        if (this.userName.length() <= 0 || this.avatarUrl.length() <= 0) {
            return false;
        }
        return true;
    }

    public final void setScreenName(String str) {
        this.screenName = str;
    }

    public CommonUserInfo(String str, String str2, String str3, String str4) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.userName = str;
        this.avatarUrl = str2;
        this.secUid = str3;
        this.screenName = str4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CommonUserInfo(String str, String str2, String str3, String str4, int i, C89214g gVar) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4);
    }
}
