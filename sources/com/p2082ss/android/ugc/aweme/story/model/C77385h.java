package com.p2082ss.android.ugc.aweme.story.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.model.h */
public final class C77385h extends BaseResponse implements Serializable {
    @AbstractC27891c(mo46611a = "user_info")

    /* renamed from: a */
    private final User f173629a;
    @AbstractC27891c(mo46611a = "emoji_list")

    /* renamed from: b */
    private final List<C77378a> f173630b;

    static {
        Covode.recordClassIndex(90415);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.story.model.h */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C77385h copy$default(C77385h hVar, User user, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            user = hVar.f173629a;
        }
        if ((i & 2) != 0) {
            list = hVar.f173630b;
        }
        return hVar.copy(user, list);
    }

    public final User component1() {
        return this.f173629a;
    }

    public final List<C77378a> component2() {
        return this.f173630b;
    }

    public final C77385h copy(User user, List<C77378a> list) {
        C89219l.m154721d(user, "");
        return new C77385h(user, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C77385h)) {
            return false;
        }
        C77385h hVar = (C77385h) obj;
        return C89219l.m154714a(this.f173629a, hVar.f173629a) && C89219l.m154714a(this.f173630b, hVar.f173630b);
    }

    public final int hashCode() {
        User user = this.f173629a;
        int i = 0;
        int hashCode = (user != null ? user.hashCode() : 0) * 31;
        List<C77378a> list = this.f173630b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "StoryViewer(user=" + this.f173629a + ", emojiList=" + this.f173630b + ")";
    }

    public final List<C77378a> getEmojiList() {
        return this.f173630b;
    }

    public final User getUser() {
        return this.f173629a;
    }

    public C77385h(User user, List<C77378a> list) {
        C89219l.m154721d(user, "");
        this.f173629a = user;
        this.f173630b = list;
    }
}
