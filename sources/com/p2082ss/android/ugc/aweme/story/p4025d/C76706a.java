package com.p2082ss.android.ugc.aweme.story.p4025d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.story.Story;
import com.p2082ss.android.ugc.aweme.feed.model.story.StoryKt;
import com.p2082ss.android.ugc.aweme.feed.model.story.UserStory;
import com.p2082ss.android.ugc.aweme.feed.model.story.UserStoryKt;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50545m;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.story.C77260g;
import com.p2082ss.android.ugc.aweme.story.api.AbstractC76444b;
import com.p2082ss.android.ugc.aweme.story.p4055i.C77283a;
import com.p2082ss.android.ugc.aweme.utils.C80537hk;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.utils.C80635y;
import java.util.List;
import java.util.TimeZone;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.d.a */
public final class C76706a {
    static {
        Covode.recordClassIndex(89701);
    }

    /* renamed from: a */
    private static boolean m134274a(User user) {
        if (user == null || user.isBlock || user.isBlocked()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static final boolean m134279e(Aweme aweme) {
        if (aweme == null || aweme.getAwemeType() != 5457744) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m134275a(String str) {
        String str2;
        User b = C80580in.m139683b();
        if (b != null) {
            str2 = b.getUid();
        } else {
            str2 = null;
        }
        return TextUtils.equals(str, str2);
    }

    /* renamed from: c */
    public static final boolean m134277c(Aweme aweme) {
        if (aweme == null || aweme.getAwemeType() != 40 || aweme.getUserStory() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static final boolean m134278d(Aweme aweme) {
        if (aweme == null || aweme.getAwemeType() != 40 || aweme.getStory() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static final boolean m134280f(Aweme aweme) {
        Story story;
        if (!m134278d(aweme) || aweme == null || (story = aweme.getStory()) == null || !story.isOfficial()) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static final boolean m134282h(Aweme aweme) {
        Story story;
        if (!m134278d(aweme) || aweme == null || (story = aweme.getStory()) == null || !story.isPublishing()) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public static final boolean m134285k(Aweme aweme) {
        if (aweme == null) {
            return true;
        }
        Boolean.valueOf(aweme.isStoryFakeAweme());
        if (aweme.isStoryFakeAweme()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final String m134270a(Aweme aweme) {
        String authorUid;
        C89219l.m154721d(aweme, "");
        if (!C80537hk.m139613a(aweme.getAuthorUid())) {
            String authorUid2 = aweme.getAuthorUid();
            C89219l.m154716b(authorUid2, "");
            return authorUid2;
        }
        UserStory userStory = aweme.getUserStory();
        if (userStory == null) {
            return "";
        }
        C89219l.m154716b(userStory, "");
        if (userStory.getStories().size() <= 0 || (authorUid = userStory.getStories().get(0).getAuthorUid()) == null) {
            return "";
        }
        return authorUid;
    }

    /* renamed from: g */
    public static final boolean m134281g(Aweme aweme) {
        Integer valueOf;
        if (aweme == null || (valueOf = Integer.valueOf(aweme.getAwemeType())) == null) {
            return false;
        }
        if (valueOf.intValue() == 5457744 || valueOf.intValue() == 40) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static final Aweme m134283i(Aweme aweme) {
        UserStory userStory;
        if (m134277c(aweme)) {
            if (!(aweme == null || (userStory = aweme.getUserStory()) == null)) {
                C89219l.m154716b(userStory, "");
                if (UserStoryKt.currentStory(userStory) != null) {
                    return UserStoryKt.currentStory(userStory);
                }
                if (userStory.getStories().size() > 0) {
                    return userStory.getStories().get(0);
                }
            }
            return null;
        } else if (m134278d(aweme)) {
            return aweme;
        } else {
            return null;
        }
    }

    /* renamed from: j */
    public static final boolean m134284j(Aweme aweme) {
        Aweme i;
        Story story;
        Story story2;
        if (m134278d(aweme)) {
            if (aweme == null || (story2 = aweme.getStory()) == null) {
                return false;
            }
            return StoryKt.isExpired(story2);
        } else if (!m134277c(aweme) || (i = m134283i(aweme)) == null || (story = i.getStory()) == null) {
            return false;
        } else {
            return StoryKt.isExpired(story);
        }
    }

    /* renamed from: m */
    public static final boolean m134287m(Aweme aweme) {
        if (!m134281g(aweme)) {
            return true;
        }
        if (!C50545m.m94762a(aweme) && !m134282h(aweme) && !m134280f(aweme) && !m134279e(aweme) && !C80635y.m139811f(aweme)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final String m134271a(Throwable th) {
        String concat = "error: ".concat(String.valueOf(th));
        if (th instanceof C34485a) {
            return concat + ", detail: " + ((C34485a) th).getResponse();
        }
        return concat;
    }

    /* renamed from: b */
    public static final String m134276b(Aweme aweme) {
        C89219l.m154721d(aweme, "");
        if (!m134281g(aweme)) {
            return "";
        }
        String a = m134270a(aweme);
        TimeZone timeZone = TimeZone.getDefault();
        C89219l.m154716b(timeZone, "");
        long currentTimeMillis = ((System.currentTimeMillis() / 86400000) * 86400000) - ((long) timeZone.getRawOffset());
        String valueOf = String.valueOf(currentTimeMillis - 86400000);
        return a + valueOf + String.valueOf(currentTimeMillis + 86400000);
    }

    /* renamed from: n */
    public static final boolean m134288n(Aweme aweme) {
        String str;
        List<Aweme> stories;
        C89219l.m154721d(aweme, "");
        UserStory userStory = aweme.getUserStory();
        if (userStory != null) {
            User author = aweme.getAuthor();
            if (author != null) {
                str = author.getUid();
            } else {
                str = null;
            }
            if ((!m134275a(str) || !(!C77260g.f173332a.mo120158f().mo120165a().isEmpty())) && (userStory.getTotalCount() < 1 || ((((stories = userStory.getStories()) == null || stories.isEmpty()) && !userStory.getHasMoreBefore() && !userStory.getHasMoreAfter()) || m134274a(aweme.getAuthor())))) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public static final Aweme m134286l(Aweme aweme) {
        boolean z;
        C89219l.m154721d(aweme, "");
        if (aweme.getAwemeType() != 40 || aweme.getUserStory() != null) {
            return aweme;
        }
        Aweme aweme2 = new Aweme();
        aweme2.setAid(aweme.getAuthorUid());
        Aweme a = AwemeService.m70060b().mo60677a(aweme);
        C89219l.m154716b(a, "");
        List c = C89070n.m154524c(a);
        Story story = aweme.getStory();
        if (story != null) {
            z = story.getViewed();
        } else {
            z = false;
        }
        UserStory userStory = new UserStory(c, 1, 0, z, 0, 0, false, false, 0, 1, null, false, false, true, 7668, null);
        C77283a.m135111b("huangxin.2020", "origin total count: " + userStory.getOriginTotalCount() + ", user story instance: " + System.identityHashCode(userStory));
        aweme2.setUserStory(userStory);
        aweme2.setAwemeType(40);
        aweme2.setAuthor(aweme.getAuthor());
        aweme2.setRequestId(aweme.getRequestId());
        return aweme2;
    }

    /* renamed from: a */
    public static final boolean m134273a(UserStory userStory) {
        C89219l.m154721d(userStory, "");
        if (userStory.getTotalCount() != 0 || userStory.getStories().size() != 0 || userStory.getHasMoreAfter() || userStory.getHasMoreBefore() || !C77260g.f173332a.mo120158f().mo120165a().isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final void m134272a(List<? extends Aweme> list, String str) {
        C89219l.m154721d(list, "");
        for (T t : list) {
            if (m134277c(t)) {
                AbstractC76444b e = C77260g.f173332a.mo120157e();
                if (t == null) {
                    C89219l.m154715b();
                }
                e.mo120174a(t, true, str);
                UserStory userStory = t.getUserStory();
                if (userStory != null) {
                    userStory.setShouldShowGuide(C77260g.f173332a.mo120147a((Aweme) t));
                }
            }
        }
    }
}
