package com.bytedance.android.live.base.model.user;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.base.model.user.e */
public final class C2999e implements AbstractC2724b<FollowInfo> {
    static {
        Covode.recordClassIndex(3461);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ FollowInfo mo7304a(C2730f fVar) {
        return m8306b(fVar);
    }

    /* renamed from: b */
    public static FollowInfo m8306b(C2730f fVar) {
        FollowInfo followInfo = new FollowInfo();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return followInfo;
            } else if (b == 1) {
                followInfo.followingCount = fVar.mo7314f();
            } else if (b == 2) {
                followInfo.followerCount = fVar.mo7314f();
            } else if (b == 3) {
                followInfo.followStatus = fVar.mo7314f();
            } else if (b != 4) {
                C2731g.m7903c(fVar);
            } else {
                followInfo.pushStatus = fVar.mo7314f();
            }
        }
    }
}
