package com.p2082ss.android.ugc.aweme.story.interaction.p4057b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.interaction.b.f */
public final class C77301f extends C77299e {

    /* renamed from: a */
    public final User f173416a;

    /* renamed from: b */
    public final long f173417b;

    /* renamed from: c */
    public final C77302g f173418c;

    static {
        Covode.recordClassIndex(90320);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C77301f)) {
            return false;
        }
        C77301f fVar = (C77301f) obj;
        return C89219l.m154714a(this.f173416a, fVar.f173416a) && this.f173417b == fVar.f173417b && C89219l.m154714a(this.f173418c, fVar.f173418c);
    }

    public final String toString() {
        return "ReactionBubblePublishItem(user=" + this.f173416a + ", publishTimeInMs=" + this.f173417b + ", mobEventParam=" + this.f173418c + ")";
    }

    public final int hashCode() {
        int i;
        User user = this.f173416a;
        int i2 = 0;
        if (user != null) {
            i = user.hashCode();
        } else {
            i = 0;
        }
        long j = this.f173417b;
        int i3 = ((i * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        C77302g gVar = this.f173418c;
        if (gVar != null) {
            i2 = gVar.hashCode();
        }
        return i3 + i2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77301f(User user, long j, C77302g gVar) {
        super(2);
        C89219l.m154721d(user, "");
        this.f173416a = user;
        this.f173417b = j;
        this.f173418c = gVar;
    }
}
