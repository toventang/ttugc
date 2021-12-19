package com.p2082ss.android.ugc.aweme.story.userstory.mine;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.story.UserStory;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.story.C77260g;
import com.p2082ss.android.ugc.aweme.story.publish.AbstractC77389a;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.userstory.mine.b */
public final class C77698b {
    static {
        Covode.recordClassIndex(90746);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.userstory.mine.b$a */
    static final class C77699a extends AbstractC89220m implements AbstractC89172b<UserStory, UserStory> {

        /* renamed from: a */
        final /* synthetic */ UserStory f174265a;

        static {
            Covode.recordClassIndex(90747);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77699a(UserStory userStory) {
            super(1);
            this.f174265a = userStory;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ UserStory invoke(UserStory userStory) {
            C89219l.m154721d(userStory, "");
            UserStory userStory2 = this.f174265a;
            C89219l.m154716b(userStory2, "");
            return userStory2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.userstory.mine.b$b */
    static final class C77700b extends AbstractC89220m implements AbstractC89172b<UserStory, UserStory> {

        /* renamed from: a */
        final /* synthetic */ UserStory f174266a;

        static {
            Covode.recordClassIndex(90748);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77700b(UserStory userStory) {
            super(1);
            this.f174266a = userStory;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ UserStory invoke(UserStory userStory) {
            C89219l.m154721d(userStory, "");
            UserStory userStory2 = this.f174266a;
            C89219l.m154716b(userStory2, "");
            return userStory2;
        }
    }

    /* renamed from: a */
    public static final void m135721a(AbstractC89172b<? super UserStory, UserStory> bVar) {
        C89219l.m154721d(bVar, "");
        Aweme a = C77697a.m135717a();
        UserStory userStory = a.getUserStory();
        if (userStory == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(userStory, "");
        UserStory invoke = bVar.invoke(userStory);
        if (invoke == a.getUserStory()) {
            C51423a.m95786a((Exception) new IllegalArgumentException("Must copy"));
        }
        C77697a.m135719a(invoke);
    }

    /* renamed from: a */
    public static final boolean m135722a(String str) {
        T t;
        List<Aweme> stories;
        List<Aweme> stories2;
        C89219l.m154721d(str, "");
        new MineUserStoryFetcher();
        Aweme a = MineUserStoryFetcher.m135716a();
        UserStory userStory = a.getUserStory();
        T t2 = null;
        if (userStory != null && (stories2 = userStory.getStories()) != null) {
            Iterator<T> it = stories2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (C89219l.m154714a((Object) t.getAid(), (Object) str)) {
                    break;
                }
            }
        } else {
            t = null;
        }
        if (t != null) {
            UserStory userStory2 = a.getUserStory();
            if (!(userStory2 == null || (stories = userStory2.getStories()) == null)) {
                stories.remove(t);
            }
            UserStory userStory3 = a.getUserStory();
            if (userStory3 != null) {
                userStory3.getStories().remove(t);
                userStory3.setTotalCount(userStory3.getTotalCount() - 1);
                m135721a(new C77699a(userStory3));
            }
            return true;
        }
        Iterator<T> it2 = C77260g.f173332a.mo120158f().mo120165a().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            T next = it2.next();
            if (C89219l.m154714a((Object) next.getAid(), (Object) str)) {
                t2 = next;
                break;
            }
        }
        T t3 = t2;
        if (t3 == null) {
            return false;
        }
        AbstractC77389a f = C77260g.f173332a.mo120158f();
        String scheduleId = t3.getScheduleId();
        C89219l.m154716b(scheduleId, "");
        f.mo120168a(scheduleId);
        UserStory userStory4 = a.getUserStory();
        if (userStory4 != null) {
            userStory4.setTotalCount(userStory4.getTotalCount() - 1);
            m135721a(new C77700b(userStory4));
        }
        return true;
    }
}
