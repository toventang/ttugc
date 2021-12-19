package com.p2082ss.android.ugc.aweme.story.userstory.mine;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.story.UserStory;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.story.userstory.C77693b;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.userstory.mine.a */
public final class C77697a {

    /* renamed from: a */
    public static Aweme f174263a;

    /* renamed from: b */
    public static final C77697a f174264b = new C77697a();

    private C77697a() {
    }

    static {
        Covode.recordClassIndex(90745);
    }

    /* renamed from: a */
    public static Aweme m135717a() {
        if (f174263a == null) {
            f174263a = m135720b();
        }
        Aweme aweme = f174263a;
        if (aweme == null) {
            C89219l.m154715b();
        }
        Aweme clone = aweme.clone();
        C89219l.m154716b(clone, "");
        return clone;
    }

    /* renamed from: b */
    private static Aweme m135720b() {
        Aweme aweme = new Aweme();
        User b = C80580in.m139683b();
        String str = "";
        C89219l.m154716b(b, str);
        String uid = b.getUid();
        if (uid != null) {
            str = uid;
        }
        aweme.setAid(str);
        aweme.setAuthor(b);
        aweme.setAwemeType(40);
        aweme.setUserStory(new UserStory(new ArrayList(), 0, 0, false, 0, 0, false, false, 0, 0, null, false, true, false, 12284, null));
        return aweme;
    }

    /* renamed from: a */
    public static void m135719a(UserStory userStory) {
        UserStory userStory2;
        C89219l.m154721d(userStory, "");
        if (!userStory.getFakeAwemeShell()) {
            Aweme aweme = f174263a;
            if (aweme != null) {
                userStory2 = aweme.getUserStory();
            } else {
                userStory2 = null;
            }
            Aweme aweme2 = f174263a;
            if (aweme2 != null) {
                aweme2.setUserStory(userStory);
            }
            C77693b bVar = C77693b.f174258c;
            Aweme aweme3 = f174263a;
            if (aweme3 == null) {
                aweme3 = m135720b();
                aweme3.setUserStory(userStory);
            }
            bVar.mo120329a(userStory2, userStory, aweme3);
        }
    }

    /* renamed from: a */
    public static void m135718a(Aweme aweme) {
        String uid;
        UserStory userStory;
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(aweme, "");
        User author = aweme.getAuthor();
        UserStory userStory2 = null;
        if (author != null && (uid = author.getUid()) != null && C80538hl.m139614a(uid) && (userStory = aweme.getUserStory()) != null && !userStory.getFakeAwemeShell()) {
            Aweme aweme2 = f174263a;
            if (aweme2 != null) {
                userStory2 = aweme2.getUserStory();
            }
            f174263a = aweme;
            C77693b bVar = C77693b.f174258c;
            UserStory userStory3 = aweme.getUserStory();
            if (userStory3 == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(userStory3, "");
            Aweme aweme3 = f174263a;
            if (aweme3 == null) {
                aweme3 = m135720b();
                aweme3.setUserStory(aweme3.getUserStory());
            }
            bVar.mo120329a(userStory2, userStory3, aweme3);
        }
    }
}
