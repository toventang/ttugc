package com.p2082ss.android.ugc.aweme.favorites.p2925g;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.favorites.g.a */
public final class C47433a {

    /* renamed from: a */
    public static final C47433a f110163a = new C47433a();

    private C47433a() {
    }

    static {
        Covode.recordClassIndex(56046);
    }

    /* renamed from: a */
    public static final void m90443a(Comment comment) {
        String str;
        String str2;
        User author;
        String str3 = "";
        C89219l.m154721d(comment, str3);
        IAccountUserService g = C31575b.m65865g();
        String str4 = null;
        if (g != null) {
            str = g.getCurUserId();
        } else {
            str = null;
        }
        C33744d a = new C33744d().mo59983a("enter_from", "collection_comment");
        String cid = comment.getCid();
        if (cid == null) {
            cid = str3;
        }
        C33744d a2 = a.mo59983a("comment_id", cid);
        Aweme aliasAweme = comment.getAliasAweme();
        if (aliasAweme == null || (author = aliasAweme.getAuthor()) == null || (str2 = author.getUid()) == null) {
            str2 = str3;
        }
        C33744d a3 = a2.mo59983a("author_id", str2);
        String awemeId = comment.getAwemeId();
        if (awemeId == null) {
            awemeId = str3;
        }
        C33744d a4 = a3.mo59983a("group_id", awemeId);
        User user = comment.getUser();
        if (user != null) {
            str4 = user.getUid();
        }
        C33744d a5 = a4.mo59982a("is_author", Boolean.valueOf(C89219l.m154714a((Object) str4, (Object) str)));
        if (str != null) {
            str3 = str;
        }
        C39162r.m79460a("tap_comment", a5.mo59983a("user_id", str3).f79943a);
    }
}
