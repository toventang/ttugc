package com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.invite.p3203a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.a */
public final class C55371a implements Serializable {
    @AbstractC27891c(mo46611a = "conversation_id")

    /* renamed from: a */
    private String f126598a;
    @AbstractC27891c(mo46611a = "conversation_short_id")

    /* renamed from: b */
    private String f126599b;
    @AbstractC27891c(mo46611a = StringSet.name)

    /* renamed from: c */
    private String f126600c;
    @AbstractC27891c(mo46611a = "avatar_url")

    /* renamed from: d */
    private String f126601d;
    @AbstractC27891c(mo46611a = "group_size")

    /* renamed from: e */
    private Integer f126602e;

    static {
        Covode.recordClassIndex(65136);
    }

    public C55371a() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ C55371a copy$default(C55371a aVar, String str, String str2, String str3, String str4, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aVar.f126598a;
        }
        if ((i & 2) != 0) {
            str2 = aVar.f126599b;
        }
        if ((i & 4) != 0) {
            str3 = aVar.f126600c;
        }
        if ((i & 8) != 0) {
            str4 = aVar.f126601d;
        }
        if ((i & 16) != 0) {
            num = aVar.f126602e;
        }
        return aVar.copy(str, str2, str3, str4, num);
    }

    public final String component1() {
        return this.f126598a;
    }

    public final String component2() {
        return this.f126599b;
    }

    public final String component3() {
        return this.f126600c;
    }

    public final String component4() {
        return this.f126601d;
    }

    public final Integer component5() {
        return this.f126602e;
    }

    public final C55371a copy(String str, String str2, String str3, String str4, Integer num) {
        return new C55371a(str, str2, str3, str4, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C55371a)) {
            return false;
        }
        C55371a aVar = (C55371a) obj;
        return C89219l.m154714a(this.f126598a, aVar.f126598a) && C89219l.m154714a(this.f126599b, aVar.f126599b) && C89219l.m154714a(this.f126600c, aVar.f126600c) && C89219l.m154714a(this.f126601d, aVar.f126601d) && C89219l.m154714a(this.f126602e, aVar.f126602e);
    }

    public final int hashCode() {
        String str = this.f126598a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f126599b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f126600c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f126601d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Integer num = this.f126602e;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "GroupInfo(conversationId=" + this.f126598a + ", conversationShortId=" + this.f126599b + ", name=" + this.f126600c + ", avatarUrl=" + this.f126601d + ", groupSize=" + this.f126602e + ")";
    }

    public final String getAvatarUrl() {
        return this.f126601d;
    }

    public final String getConversationId() {
        return this.f126598a;
    }

    public final String getConversationShortId() {
        return this.f126599b;
    }

    public final Integer getGroupSize() {
        return this.f126602e;
    }

    public final String getName() {
        return this.f126600c;
    }

    public final void setAvatarUrl(String str) {
        this.f126601d = str;
    }

    public final void setConversationId(String str) {
        this.f126598a = str;
    }

    public final void setConversationShortId(String str) {
        this.f126599b = str;
    }

    public final void setGroupSize(Integer num) {
        this.f126602e = num;
    }

    public final void setName(String str) {
        this.f126600c = str;
    }

    public C55371a(String str, String str2, String str3, String str4, Integer num) {
        this.f126598a = str;
        this.f126599b = str2;
        this.f126600c = str3;
        this.f126601d = str4;
        this.f126602e = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C55371a(String str, String str2, String str3, String str4, Integer num, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) == 0 ? num : null);
    }
}
