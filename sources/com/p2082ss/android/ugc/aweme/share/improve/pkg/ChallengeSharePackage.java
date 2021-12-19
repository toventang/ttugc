package com.p2082ss.android.ugc.aweme.share.improve.pkg;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39088c;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.aweme.feed.p2969u.C49955a;
import com.p2082ss.android.ugc.aweme.feed.p2969u.C49966c;
import com.p2082ss.android.ugc.aweme.share.C68863ah;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69128d;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69690f;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.ChallengeSharePackage */
public final class ChallengeSharePackage extends LinkDefaultSharePackage {

    /* renamed from: a */
    public static final C69211a f154711a = new C69211a((byte) 0);

    static {
        Covode.recordClassIndex(81526);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage
    public final int describeContents() {
        return 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.ChallengeSharePackage$a */
    public static final class C69211a {
        static {
            Covode.recordClassIndex(81527);
        }

        private C69211a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.ChallengeSharePackage$a$a */
        public static final class C69212a implements AbstractC69690f {

            /* renamed from: a */
            final /* synthetic */ Challenge f154712a;

            static {
                Covode.recordClassIndex(81528);
            }

            public C69212a(Challenge challenge) {
                this.f154712a = challenge;
            }

            @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69690f
            /* renamed from: a */
            public final void mo60845a(SharePackage sharePackage, Context context) {
                C89219l.m154721d(sharePackage, "");
                C89219l.m154721d(context, "");
                AbstractC69690f.C69691a.m123095b(sharePackage, context);
            }

            @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69690f
            /* renamed from: b */
            public final void mo60847b(SharePackage sharePackage, Context context) {
                C89219l.m154721d(sharePackage, "");
                C89219l.m154721d(context, "");
                AbstractC69690f.C69691a.m123093a(sharePackage, context);
            }

            /* renamed from: a */
            private static void m122316a(String str, boolean z, Challenge challenge) {
                if (z && challenge != null) {
                    C39088c cVar = new C39088c();
                    cVar.mo67838a(new C49955a());
                    C49966c.C49967a aVar = new C49966c.C49967a();
                    aVar.f115215a = challenge.getCid();
                    aVar.f115216b = 1;
                    aVar.f115221g = 3;
                    aVar.f115222h = str;
                    cVar.mo57616a(aVar.mo85008a());
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69690f
            /* renamed from: a */
            public final void mo60846a(AbstractC69693h hVar, SharePackage sharePackage, Context context) {
                C89219l.m154721d(hVar, "");
                C89219l.m154721d(sharePackage, "");
                C89219l.m154721d(context, "");
                if (C69128d.m122236a(hVar)) {
                    m122316a(hVar.mo61919c(), true, this.f154712a);
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69660b
            /* renamed from: a */
            public final void mo60844a(AbstractC69581b bVar, boolean z, SharePackage sharePackage, Context context) {
                C89219l.m154721d(bVar, "");
                C89219l.m154721d(context, "");
                C68863ah.f154028b.mo109361a(bVar.mo109548a(), 0);
                m122316a(bVar.mo109548a(), z, this.f154712a);
            }
        }

        public /* synthetic */ C69211a(byte b) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChallengeSharePackage(SharePackage.C69654a aVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
    }
}
