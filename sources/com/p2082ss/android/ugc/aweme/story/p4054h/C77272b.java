package com.p2082ss.android.ugc.aweme.story.p4054h;

import androidx.p025c.C0490e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeHybridLabelModel;
import com.p2082ss.android.ugc.aweme.feed.model.story.UserStory;
import com.p2082ss.android.ugc.aweme.feed.model.story.UserStoryCurrentInfo;
import com.p2082ss.android.ugc.aweme.feed.model.story.UserStoryKt;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.story.avatar.C76494a;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.story.p4043f.C77161c;
import com.p2082ss.android.ugc.aweme.story.p4055i.C77283a;
import com.p2082ss.android.ugc.aweme.story.userstory.C77694c;
import com.p2082ss.android.ugc.aweme.story.userstory.mine.C77697a;
import com.p2082ss.android.ugc.aweme.story.userstory.mine.MineUserStoryFetcher;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.h.b */
public final class C77272b {

    /* renamed from: b */
    public static final String f173357b = "UserStoryCache";

    /* renamed from: c */
    public static final C77274b f173358c = new C77274b((byte) 0);

    /* renamed from: a */
    public final MineUserStoryFetcher f173359a = new MineUserStoryFetcher();

    /* renamed from: d */
    private final AbstractC89244h f173360d = C89250i.m154773a((AbstractC89171a) C77276d.f173365a);

    /* renamed from: e */
    private final AbstractC89244h f173361e = C89250i.m154773a((AbstractC89171a) C77275c.f173364a);

    /* renamed from: a */
    public final C0490e<String, C77273a> mo120873a() {
        return (C0490e) this.f173360d.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.story.h.b$b */
    public static final class C77274b {
        static {
            Covode.recordClassIndex(90291);
        }

        private C77274b() {
        }

        public /* synthetic */ C77274b(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.h.b$d */
    static final class C77276d extends AbstractC89220m implements AbstractC89171a<C0490e<String, C77273a>> {

        /* renamed from: a */
        public static final C77276d f173365a = new C77276d();

        static {
            Covode.recordClassIndex(90293);
        }

        C77276d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C0490e<String, C77273a> invoke() {
            return new C0490e(255);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.h.b$c */
    static final class C77275c extends AbstractC89220m implements AbstractC89171a<Long> {

        /* renamed from: a */
        public static final C77275c f173364a = new C77275c();

        static {
            Covode.recordClassIndex(90292);
        }

        C77275c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Long invoke() {
            return Long.valueOf(C77161c.m134769a().f173096e * 1000);
        }
    }

    static {
        Covode.recordClassIndex(90289);
    }

    /* renamed from: a */
    public final Aweme mo120874a(String str) {
        C89219l.m154721d(str, "");
        if (C76706a.m134275a(str)) {
            return MineUserStoryFetcher.m135716a();
        }
        C77273a a = mo120873a().mo2091a(str);
        if (a == null) {
            C77283a.m135107a(f173357b, "missing cache for uid: ".concat(String.valueOf(str)));
            return null;
        } else if (System.currentTimeMillis() - a.f173363b < ((Number) this.f173361e.getValue()).longValue()) {
            C77283a.m135107a(f173357b, "cache hit for uid: " + str + ", user story instance: " + System.identityHashCode(a.f173362a));
            return a.f173362a;
        } else {
            C77283a.m135107a(f173357b, "cache expired for uid: ".concat(String.valueOf(str)));
            return null;
        }
    }

    /* renamed from: b */
    public final void mo120876b(String str) {
        C89219l.m154721d(str, "");
        if (mo120873a().mo2097b(str) != null) {
            C77283a.m135111b(f173357b, "removed " + str + " from cache");
        } else {
            C77283a.m135111b(f173357b, "removed " + str + " but not found in cache");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.h.b$a */
    public static final class C77273a {

        /* renamed from: a */
        public final Aweme f173362a;

        /* renamed from: b */
        public long f173363b;

        static {
            Covode.recordClassIndex(90290);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C77273a)) {
                return false;
            }
            C77273a aVar = (C77273a) obj;
            return C89219l.m154714a(this.f173362a, aVar.f173362a) && this.f173363b == aVar.f173363b;
        }

        public final int hashCode() {
            Aweme aweme = this.f173362a;
            int hashCode = aweme != null ? aweme.hashCode() : 0;
            long j = this.f173363b;
            return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        }

        public final String toString() {
            return "CacheNode(userStory=" + this.f173362a + ", updateTime=" + this.f173363b + ")";
        }

        public C77273a(Aweme aweme, long j) {
            C89219l.m154721d(aweme, "");
            this.f173362a = aweme;
            this.f173363b = j;
        }
    }

    /* renamed from: a */
    public final void mo120875a(Aweme aweme, boolean z, String str) {
        boolean z2;
        String uid;
        long j;
        long j2;
        int currentPosition;
        List<AwemeHybridLabelModel> list;
        List<Aweme> stories;
        Aweme aweme2;
        User user;
        List<Aweme> stories2;
        Aweme aweme3;
        UserStory userStory;
        UserStory userStory2;
        C89219l.m154721d(aweme, "");
        if (!C76706a.m134275a(aweme.getAid())) {
            C89219l.m154721d(aweme, "");
            if (!z || (userStory = aweme.getUserStory()) == null || userStory.getFakeAwemeShell() || (userStory2 = aweme.getUserStory()) == null || userStory2.getFakeSelfStoryCollection()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (aweme.getAid() == null) {
                aweme.setAid("");
            }
            Aweme aweme4 = null;
            if (aweme.getAuthor() == null) {
                UserStory userStory3 = aweme.getUserStory();
                if (userStory3 == null || (stories2 = userStory3.getStories()) == null || (aweme3 = (Aweme) C89070n.m154583g((List) stories2)) == null) {
                    user = null;
                } else {
                    user = aweme3.getAuthor();
                }
                aweme.setAuthor(user);
            }
            if (aweme.getHybridLabels() == null) {
                UserStory userStory4 = aweme.getUserStory();
                if (userStory4 == null || (stories = userStory4.getStories()) == null || (aweme2 = (Aweme) C89070n.m154583g((List) stories)) == null) {
                    list = null;
                } else {
                    list = aweme2.getHybridLabels();
                }
                aweme.setHybridLabels(list);
            }
            UserStory userStory5 = aweme.getUserStory();
            if (userStory5 != null) {
                C77277c.m135094a(userStory5.getStories(), str, aweme.getAuthor(), aweme.getHybridLabels());
                Integer currentIndex = UserStoryKt.currentIndex(userStory5);
                if (currentIndex != null) {
                    currentPosition = currentIndex.intValue();
                } else {
                    currentPosition = (int) userStory5.getCurrentPosition();
                }
                Integer valueOf = Integer.valueOf(currentPosition);
                if (userStory5.getStories().size() > 0 && (aweme4 = UserStoryKt.currentStory(userStory5)) == null) {
                    aweme4 = userStory5.getStories().get(0);
                }
                userStory5.setCurrentInfo(new UserStoryCurrentInfo(valueOf, aweme4));
                if (z2) {
                    userStory5.setOriginTotalCount(userStory5.getTotalCount());
                }
            }
            if (str != null) {
                aweme.setRequestId(str);
            }
            User author = aweme.getAuthor();
            if (author == null || (uid = author.getUid()) == null || !C80538hl.m139614a(uid)) {
                C77283a.m135111b(f173357b, "abort updating because uid empty, aid: " + aweme.getAid() + "; author: " + aweme.getAuthor());
                return;
            }
            UserStory userStory6 = aweme.getUserStory();
            if (userStory6 == null) {
                C77283a.m135111b(f173357b, "abort updating because this Aweme is not story collection");
            } else if (userStory6.getFakeAwemeShell()) {
                C77283a.m135111b(f173357b, "abort updating because this Aweme is fake story collection");
            } else {
                User author2 = aweme.getAuthor();
                C89219l.m154716b(author2, "");
                String uid2 = author2.getUid();
                C77273a b = mo120873a().mo2097b(uid2);
                if (b != null) {
                    C77283a.m135107a(f173357b, uid2 + " already in cache, updated. old aweme instance: " + System.identityHashCode(b.f173362a) + ", new: " + System.identityHashCode(aweme));
                } else {
                    C77283a.m135107a(f173357b, "add node " + uid2 + " to cache, aweme instance: " + System.identityHashCode(aweme));
                }
                if (z || b == null) {
                    j = System.currentTimeMillis();
                } else {
                    j = b.f173363b;
                }
                UserStory userStory7 = aweme.getUserStory();
                if (userStory7 != null) {
                    userStory7.setAddToCacheTime(j);
                }
                C77273a aVar = new C77273a(aweme, j);
                mo120873a().mo2092a(uid2, aVar);
                UserStory userStory8 = aweme.getUserStory();
                long j3 = 0;
                if (userStory8 != null) {
                    j2 = userStory8.getAddToCacheTime();
                } else {
                    j2 = 0;
                }
                UserStory userStory9 = aVar.f173362a.getUserStory();
                if (userStory9 != null) {
                    j3 = userStory9.getAddToCacheTime();
                }
                if (j2 >= j3) {
                    C89219l.m154716b(uid2, "");
                    C76494a.m134077a(uid2, aweme);
                }
            }
        } else if (z) {
            C89219l.m154721d(aweme, "");
            if (aweme.getUserStory() == null) {
                C51423a.m95786a((Exception) new IllegalArgumentException("UserStory Aweme is not valid"));
            }
            C77694c.m135715a(aweme, str);
            Aweme clone = aweme.clone();
            C89219l.m154716b(clone, "");
            C77697a.m135718a(clone);
        }
    }
}
