package com.p2082ss.android.ugc.aweme.comment.barrage.p2487b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.p2082ss.android.ugc.aweme.comment.barrage.C36296a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.barrage.b.c */
public final class C36308c extends C36309d {

    /* renamed from: a */
    public final User f85830a;

    /* renamed from: b */
    public final List<Integer> f85831b;

    /* renamed from: c */
    public final C36296a f85832c;

    static {
        Covode.recordClassIndex(43585);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36308c)) {
            return false;
        }
        C36308c cVar = (C36308c) obj;
        return C89219l.m154714a(this.f85830a, cVar.f85830a) && C89219l.m154714a(this.f85831b, cVar.f85831b) && C89219l.m154714a(this.f85832c, cVar.f85832c);
    }

    public final int hashCode() {
        User user = this.f85830a;
        int i = 0;
        int hashCode = (user != null ? user.hashCode() : 0) * 31;
        List<Integer> list = this.f85831b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        C36296a aVar = this.f85832c;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "ReactionBubbleEmojiItem(user=" + this.f85830a + ", emojiId=" + this.f85831b + ", mobEventParam=" + this.f85832c + ")";
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a, com.p2082ss.android.ugc.aweme.comment.barrage.p2487b.C36309d
    /* renamed from: b */
    public final boolean mo28110b(AbstractC17641a aVar) {
        C89219l.m154721d(aVar, "");
        return super.mo28110b(aVar);
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a, com.p2082ss.android.ugc.aweme.comment.barrage.p2487b.C36309d
    /* renamed from: a */
    public final boolean mo28109a(AbstractC17641a aVar) {
        C89219l.m154721d(aVar, "");
        if (!(aVar instanceof C36308c)) {
            return super.mo28109a(aVar);
        }
        if (!C89219l.m154714a((Object) ((C36308c) aVar).f85830a.getUid(), (Object) this.f85830a.getUid()) || !super.mo28109a(aVar)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36308c(User user, List<Integer> list, C36296a aVar) {
        super(2);
        C89219l.m154721d(user, "");
        C89219l.m154721d(list, "");
        this.f85830a = user;
        this.f85831b = list;
        this.f85832c = aVar;
    }
}
