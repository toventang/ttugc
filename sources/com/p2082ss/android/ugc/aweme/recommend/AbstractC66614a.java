package com.p2082ss.android.ugc.aweme.recommend;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.following.p3003ui.view.AbstractC51346a;
import com.p2082ss.android.ugc.aweme.inbox.widget.C56520b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.aweme.recommend.a */
public interface AbstractC66614a {

    /* renamed from: c */
    public static final C66615a f149747c = C66615a.f149749b;

    /* renamed from: com.ss.android.ugc.aweme.recommend.a$b */
    public static final class C66616b {
        static {
            Covode.recordClassIndex(78173);
        }
    }

    static {
        Covode.recordClassIndex(78171);
    }

    /* renamed from: a */
    void mo61442a(int i, int i2, String str);

    /* renamed from: a */
    void mo61443a(C56520b bVar);

    /* renamed from: a */
    void mo61444a(User user);

    /* renamed from: a */
    void mo61445a(boolean z);

    AbstractC51346a getFollowBtn();

    View getView();

    void setEventListener(AbstractC89172b<? super Integer, C89391z> bVar);

    /* renamed from: com.ss.android.ugc.aweme.recommend.a$a */
    public static final class C66615a {

        /* renamed from: a */
        public static final List<Integer> f149748a = C89070n.m154522b(9, 10);

        /* renamed from: b */
        static final /* synthetic */ C66615a f149749b = new C66615a();

        private C66615a() {
        }

        static {
            Covode.recordClassIndex(78172);
        }
    }
}
