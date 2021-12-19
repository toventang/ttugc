package com.p2082ss.android.ugc.aweme.notification.followrequest.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.base.api.AbstractC34479a;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.notification.followrequest.api.FollowRequestApiManager;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.followrequest.model.a */
public final class C62020a extends AbstractC39085b<FollowRequestResponse> {

    /* renamed from: e */
    public static final C62021a f140753e = new C62021a((byte) 0);

    /* renamed from: a */
    public long f140754a;

    /* renamed from: b */
    public long f140755b;

    /* renamed from: c */
    public boolean f140756c;

    /* renamed from: d */
    public boolean f140757d;

    static {
        Covode.recordClassIndex(72774);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean checkParams(Object... objArr) {
        C89219l.m154721d(objArr, "");
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.followrequest.model.a$a */
    public static final class C62021a {
        static {
            Covode.recordClassIndex(72775);
        }

        private C62021a() {
        }

        public /* synthetic */ C62021a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.followrequest.model.a$b */
    public static final class CallableC62022b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ long f140758a;

        /* renamed from: b */
        final /* synthetic */ long f140759b;

        /* renamed from: c */
        final /* synthetic */ int f140760c;

        static {
            Covode.recordClassIndex(72776);
        }

        CallableC62022b(long j, long j2, int i) {
            this.f140758a = j;
            this.f140759b = j2;
            this.f140760c = i;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public FollowRequestResponse call() {
            try {
                return FollowRequestApiManager.m112152a(this.f140758a, this.f140759b, this.f140760c);
            } catch (ExecutionException e) {
                RuntimeException compatibleException = AbstractC34479a.getCompatibleException(e);
                C89219l.m154716b(compatibleException, "");
                throw compatibleException;
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final /* synthetic */ void handleData(FollowRequestResponse followRequestResponse) {
        FollowRequestResponse followRequestResponse2 = followRequestResponse;
        if (followRequestResponse2 == null) {
            this.mData = null;
            return;
        }
        List<User> list = followRequestResponse2.userRequestList;
        if (list == null || list.isEmpty()) {
            followRequestResponse2.hasMore = false;
        }
        if (!this.f140756c || this.mData == null) {
            this.mData = followRequestResponse2;
            return;
        }
        ((FollowRequestResponse) this.mData).maxTime = followRequestResponse2.maxTime;
        ((FollowRequestResponse) this.mData).minTime = followRequestResponse2.minTime;
        ((FollowRequestResponse) this.mData).hasMore = followRequestResponse2.hasMore;
        List<User> list2 = ((FollowRequestResponse) this.mData).userRequestList;
        List<User> list3 = followRequestResponse2.userRequestList;
        C89219l.m154716b(list3, "");
        list2.addAll(list3);
    }

    /* renamed from: a */
    public final void mo100073a(long j, long j2, int i) {
        C34608n.m70658a().mo61083a(this.mHandler, new CallableC62022b(j, j2, i), 0);
    }
}
