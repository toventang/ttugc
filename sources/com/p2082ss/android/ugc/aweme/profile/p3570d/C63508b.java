package com.p2082ss.android.ugc.aweme.profile.p3570d;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.http.p2146a.p2149b.C29935e;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p2082ss.android.ugc.aweme.profile.api.AwemeApi;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.presenter.C63833b;
import java.util.concurrent.Callable;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.d.b */
public final class C63508b {
    static {
        Covode.recordClassIndex(74816);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.d.b$a */
    public static final class CallableC63509a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ Aweme f144136a;

        static {
            Covode.recordClassIndex(74817);
        }

        public CallableC63509a(Aweme aweme) {
            this.f144136a = aweme;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            int i;
            String authorUid = this.f144136a.getAuthorUid();
            User author = this.f144136a.getAuthor();
            C89219l.m154716b(author, "");
            FeedItemList a = AwemeApi.m115007a(true, authorUid, author.getSecUid(), 0, 0, 20, "profile_preload", 0, 0, null, new C29935e());
            if (this.f144136a.getAuthorUid() != null) {
                String authorUid2 = this.f144136a.getAuthorUid();
                C31575b.m65859a();
                IAccountUserService e = C31575b.f75524a.mo57069e();
                C89219l.m154716b(e, "");
                if (TextUtils.equals(authorUid2, e.getCurUserId())) {
                    i = 1000;
                    C63833b.m115502a(a, true, 0, i);
                    return C89391z.f203057a;
                }
            }
            i = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
            C63833b.m115502a(a, true, 0, i);
            return C89391z.f203057a;
        }
    }
}
