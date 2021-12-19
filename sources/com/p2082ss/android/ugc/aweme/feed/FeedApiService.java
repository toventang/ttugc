package com.p2082ss.android.ugc.aweme.feed;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.feed.api.FeedApi;
import com.p2082ss.android.ugc.aweme.feed.cache.AbstractC49331j;
import com.p2082ss.android.ugc.aweme.feed.cache.IFeedApi;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49514f;
import com.p2082ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p2082ss.android.ugc.aweme.feed.p2959p.C49772a;
import com.p2082ss.android.ugc.aweme.feed.p2959p.C49783b;
import com.p2082ss.android.ugc.aweme.feed.p2959p.p2960a.C49780c;
import com.p2082ss.android.ugc.aweme.feed.p2959p.p2960a.C49781d;
import com.p2082ss.android.ugc.aweme.feed.p2959p.p2961b.C49803e;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.FeedApiService */
public class FeedApiService implements IFeedApi {
    static {
        Covode.recordClassIndex(56738);
    }

    /* renamed from: a */
    public static IFeedApi m91022a() {
        Object a = C81908b.m141854a(IFeedApi.class, false);
        if (a != null) {
            return (IFeedApi) a;
        }
        return new FeedApiService();
    }

    /* renamed from: a */
    static final /* synthetic */ FeedItemList m91023a(int i, long j, long j2, int i2, Integer num, String str, int i3, int i4, String str2, String str3, String str4, AbstractC49331j jVar, Boolean bool) {
        try {
            return FeedApi.m91770a(i, j, j2, i2, num, str, i3, i4, str2, str3, str4, jVar, bool);
        } catch (Throwable th) {
            throw new C49781d(th);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.cache.IFeedApi
    public FeedItemList fetchFeedList(int i, long j, long j2, int i2, Integer num, String str, int i3, int i4, String str2, String str3, String str4, long j3, AbstractC49331j jVar, Bundle bundle, Boolean bool) {
        C49803e eVar;
        boolean z = C49514f.f113882a;
        C17867d.m33078a();
        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132256h = C49783b.m93236b();
        }
        if ((z & C58029j.f132256h) && C49783b.m93235a(i, i3)) {
            eVar = new C49803e(C49772a.m93221a());
            C89219l.m154721d(eVar, "");
            if (C49514f.f113882a) {
                C49772a.m93221a().mo84329a(eVar);
            }
        } else {
            eVar = null;
        }
        return (FeedItemList) C49780c.m93232a(eVar, new C49954u(i, j, j2, i2, num, str, i3, i4, str2, str3, str4, j3, jVar, bundle, bool));
    }
}
