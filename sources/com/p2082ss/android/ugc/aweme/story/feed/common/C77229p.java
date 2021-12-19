package com.p2082ss.android.ugc.aweme.story.feed.common;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.story.UserStory;
import com.p2082ss.android.ugc.aweme.feed.model.story.UserStoryCurrentInfo;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.story.p4054h.C77278d;
import com.p2082ss.android.ugc.aweme.story.userstory.mine.C77698b;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.feed.common.p */
public final class C77229p {
    static {
        Covode.recordClassIndex(90241);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.feed.common.p$a */
    static final class C77230a extends AbstractC89220m implements AbstractC89172b<UserStory, UserStory> {

        /* renamed from: a */
        final /* synthetic */ boolean f173251a = true;

        static {
            Covode.recordClassIndex(90242);
        }

        C77230a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ UserStory invoke(UserStory userStory) {
            UserStory userStory2 = userStory;
            C89219l.m154721d(userStory2, "");
            return UserStory.copy$default(userStory2, null, 0, 0, this.f173251a, 0, 0, false, false, 0, 0, null, false, false, false, 16375, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.feed.common.p$b */
    static final class C77231b extends AbstractC89220m implements AbstractC89172b<UserStory, UserStory> {

        /* renamed from: a */
        final /* synthetic */ UserStoryCurrentInfo f173252a;

        static {
            Covode.recordClassIndex(90243);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77231b(UserStoryCurrentInfo userStoryCurrentInfo) {
            super(1);
            this.f173252a = userStoryCurrentInfo;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ UserStory invoke(UserStory userStory) {
            UserStory userStory2 = userStory;
            C89219l.m154721d(userStory2, "");
            return UserStory.copy$default(userStory2, null, 0, 0, false, 0, 0, false, false, 0, 0, this.f173252a, false, false, false, 15359, null);
        }
    }

    /* renamed from: a */
    public static void m135001a(String str, UserStory userStory) {
        if (str != null && userStory != null) {
            boolean allViewed = userStory.getAllViewed();
            userStory.setAllViewed(true);
            if (!C76706a.m134275a(str) || allViewed) {
                C77278d.m135098b(str);
            } else {
                C77698b.m135721a(new C77230a());
            }
        }
    }

    /* renamed from: a */
    public static void m135002a(String str, UserStory userStory, Integer num, Aweme aweme) {
        if (str != null && userStory != null) {
            UserStoryCurrentInfo userStoryCurrentInfo = new UserStoryCurrentInfo(num, aweme);
            if (!C89219l.m154714a(userStory.getCurrentInfo(), userStoryCurrentInfo)) {
                userStory.setCurrentInfo(userStoryCurrentInfo);
                if (C76706a.m134275a(str)) {
                    C77698b.m135721a(new C77231b(userStoryCurrentInfo));
                }
            }
        }
    }
}
