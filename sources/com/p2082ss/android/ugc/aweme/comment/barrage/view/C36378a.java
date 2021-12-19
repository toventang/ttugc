package com.p2082ss.android.ugc.aweme.comment.barrage.view;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.p2082ss.android.ugc.aweme.comment.barrage.C36296a;
import com.p2082ss.android.ugc.aweme.comment.barrage.p2487b.C36306a;
import com.p2082ss.android.ugc.aweme.comment.barrage.p2487b.C36308c;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.barrage.view.a */
public final class C36378a {
    static {
        Covode.recordClassIndex(43673);
    }

    /* renamed from: a */
    public static final AbstractC17641a m74089a(Comment comment, C36296a aVar) {
        C89219l.m154721d(comment, "");
        return new C36306a(comment, false, aVar);
    }

    /* renamed from: a */
    public static final C36308c m74090a(User user, C36296a aVar) {
        C89219l.m154721d(user, "");
        return new C36308c(user, C89070n.m154516a((Object) 1001), aVar);
    }
}
