package com.p2082ss.android.ugc.aweme.story.interaction.p4057b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.interaction.b.c */
public final class C77297c extends C77299e {

    /* renamed from: a */
    public final User f173411a;

    /* renamed from: b */
    public final List<Integer> f173412b;

    /* renamed from: c */
    public final C77302g f173413c;

    static {
        Covode.recordClassIndex(90316);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C77297c)) {
            return false;
        }
        C77297c cVar = (C77297c) obj;
        return C89219l.m154714a(this.f173411a, cVar.f173411a) && C89219l.m154714a(this.f173412b, cVar.f173412b) && C89219l.m154714a(this.f173413c, cVar.f173413c);
    }

    public final int hashCode() {
        User user = this.f173411a;
        int i = 0;
        int hashCode = (user != null ? user.hashCode() : 0) * 31;
        List<Integer> list = this.f173412b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        C77302g gVar = this.f173413c;
        if (gVar != null) {
            i = gVar.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "ReactionBubbleEmojiItem(user=" + this.f173411a + ", emojiId=" + this.f173412b + ", mobEventParam=" + this.f173413c + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77297c(User user, List<Integer> list, C77302g gVar) {
        super(2);
        C89219l.m154721d(user, "");
        C89219l.m154721d(list, "");
        this.f173411a = user;
        this.f173412b = list;
        this.f173413c = gVar;
    }
}
