package com.p2082ss.android.ugc.aweme.comment.barrage.p2487b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.comment.barrage.C36296a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.barrage.b.b */
public final class C36307b extends C36309d {

    /* renamed from: a */
    public final User f85826a;

    /* renamed from: b */
    public final Aweme f85827b;

    /* renamed from: c */
    public final long f85828c;

    /* renamed from: d */
    public final C36296a f85829d;

    static {
        Covode.recordClassIndex(43584);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36307b)) {
            return false;
        }
        C36307b bVar = (C36307b) obj;
        return C89219l.m154714a(this.f85826a, bVar.f85826a) && C89219l.m154714a(this.f85827b, bVar.f85827b) && this.f85828c == bVar.f85828c && C89219l.m154714a(this.f85829d, bVar.f85829d);
    }

    public final String toString() {
        return "ReactionBubbleDescriptionItem(user=" + this.f85826a + ", aweme=" + this.f85827b + ", publishTimeInMs=" + this.f85828c + ", mobEventParam=" + this.f85829d + ")";
    }

    public final int hashCode() {
        int i;
        int i2;
        User user = this.f85826a;
        int i3 = 0;
        if (user != null) {
            i = user.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        Aweme aweme = this.f85827b;
        if (aweme != null) {
            i2 = aweme.hashCode();
        } else {
            i2 = 0;
        }
        long j = this.f85828c;
        int i5 = (((i4 + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        C36296a aVar = this.f85829d;
        if (aVar != null) {
            i3 = aVar.hashCode();
        }
        return i5 + i3;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36307b(User user, Aweme aweme, long j, C36296a aVar) {
        super(3);
        C89219l.m154721d(user, "");
        C89219l.m154721d(aweme, "");
        this.f85826a = user;
        this.f85827b = aweme;
        this.f85828c = j;
        this.f85829d = aVar;
    }
}
