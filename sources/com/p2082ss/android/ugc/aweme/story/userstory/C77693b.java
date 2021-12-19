package com.p2082ss.android.ugc.aweme.story.userstory;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.story.UserStory;
import com.p2082ss.android.ugc.aweme.story.base.distribution.dispatcher.AbstractC76621c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.story.userstory.b */
public final class C77693b extends AbstractC76621c<UserStory, Aweme> {

    /* renamed from: c */
    public static final C77693b f174258c = new C77693b();

    private C77693b() {
    }

    static {
        Covode.recordClassIndex(90740);
    }

    /* Return type fixed from 'java.util.List' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // com.p2082ss.android.ugc.aweme.story.base.distribution.dispatcher.AbstractC76621c
    /* renamed from: b */
    public final /* synthetic */ List<AbstractC89290k<UserStory, ?>> mo120330b(UserStory userStory, UserStory userStory2) {
        UserStory userStory3 = userStory2;
        C89219l.m154721d(userStory3, "");
        return userStory3.diffProperties(userStory);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // com.p2082ss.android.ugc.aweme.story.base.distribution.dispatcher.AbstractC76621c
    /* renamed from: a */
    public final /* synthetic */ Object mo120327a(UserStory userStory, Aweme aweme) {
        Aweme aweme2 = aweme;
        C89219l.m154721d(userStory, "");
        C89219l.m154721d(aweme2, "");
        String authorUid = aweme2.getAuthorUid();
        C89219l.m154716b(authorUid, "");
        return authorUid;
    }
}
