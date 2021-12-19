package com.p2082ss.android.ugc.aweme.follow.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.base.api.AbstractC34479a;
import com.p2082ss.android.ugc.aweme.follow.presenter.FollowFeedList;
import com.p2082ss.android.ugc.aweme.legacy.FollowTabBubbleGuideHelperImpl;
import com.p2082ss.android.ugc.aweme.newfollow.p3506c.C61504e;
import java.util.concurrent.ExecutionException;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.follow.api.b */
public final class C51069b {

    /* renamed from: a */
    public static FollowFeedApiV2 f117797a;

    /* renamed from: b */
    public static final C51070a f117798b = new C51070a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.follow.api.b$a */
    public static final class C51070a {
        static {
            Covode.recordClassIndex(60258);
        }

        private C51070a() {
        }

        public /* synthetic */ C51070a(byte b) {
            this();
        }

        /* renamed from: a */
        public static FollowFeedList m95483a(int i, long j, int i2, int i3, int i4, long j2, String str, String str2, String str3, int i5, int i6, int i7, String str4) {
            C89219l.m154721d(str4, "");
            try {
                FollowFeedApiV2 followFeedApiV2 = C51069b.f117797a;
                C61504e eVar = C61504e.C61505a.f139616a;
                C89219l.m154716b(eVar, "");
                FollowFeedList followFeedList = followFeedApiV2.getFollowFeedListNew(i, j, i2, 20, i3, i4, j2, eVar.mo99159a(), str, str2, str3, FollowTabBubbleGuideHelperImpl.m104989b().mo95595a(), i5, i6, null, null, null, null, null, null, Integer.valueOf(i7), str4).get();
                C89219l.m154716b(followFeedList, "");
                return followFeedList;
            } catch (ExecutionException e) {
                RuntimeException compatibleException = AbstractC34479a.getCompatibleException(e);
                C89219l.m154716b(compatibleException, "");
                throw compatibleException;
            }
        }
    }

    static {
        Covode.recordClassIndex(60257);
        String str = C29736b.f70924e;
        C89219l.m154716b(str, "");
        f117797a = (FollowFeedApiV2) C18097a.m33696a().mo28816a(str).mo28858a(FollowFeedApiV2.class);
    }
}
