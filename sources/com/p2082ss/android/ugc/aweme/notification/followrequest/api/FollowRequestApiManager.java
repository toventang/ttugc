package com.p2082ss.android.ugc.aweme.notification.followrequest.api;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.base.api.AbstractC34479a;
import com.p2082ss.android.ugc.aweme.notification.api.C61860a;
import com.p2082ss.android.ugc.aweme.notification.followrequest.model.ApproveResponse;
import com.p2082ss.android.ugc.aweme.notification.followrequest.model.FollowRequestResponse;
import com.p2082ss.android.ugc.aweme.notification.followrequest.model.RejectResponse;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89731o;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.notification.followrequest.api.FollowRequestApiManager */
public final class FollowRequestApiManager {

    /* renamed from: a */
    static final String f140715a;

    /* renamed from: b */
    public static FollowRequestApi f140716b;

    /* renamed from: com.ss.android.ugc.aweme.notification.followrequest.api.FollowRequestApiManager$FollowRequestApi */
    public interface FollowRequestApi {
        static {
            Covode.recordClassIndex(72759);
        }

        @AbstractC89731o(mo144285a = "/aweme/v1/commit/follow/request/approve/")
        @AbstractC89721e
        AbstractFutureC27655q<ApproveResponse> approveRequest(@AbstractC89719c(mo144273a = "from_user_id") String str, @AbstractC89719c(mo144273a = "approve_from") int i);

        @AbstractC89722f(mo144276a = "/aweme/v1/user/following/request/list/")
        AbstractFutureC27655q<FollowRequestResponse> fetchFollowRequestList(@AbstractC89736t(mo144292a = "max_time") long j, @AbstractC89736t(mo144292a = "min_time") long j2, @AbstractC89736t(mo144292a = "count") int i);

        @AbstractC89731o(mo144285a = "/aweme/v1/commit/follow/request/reject/")
        @AbstractC89721e
        AbstractFutureC27655q<RejectResponse> rejectRequest(@AbstractC89719c(mo144273a = "from_user_id") String str);
    }

    static {
        Covode.recordClassIndex(72756);
        String str = C61860a.f140443e;
        f140715a = str;
        f140716b = (FollowRequestApi) C18097a.m33698a(str, FollowRequestApi.class);
    }

    /* renamed from: a */
    public static void m112153a(Handler handler, final String str) {
        C34608n.m70658a().mo61083a(handler, new Callable() {
            /* class com.p2082ss.android.ugc.aweme.notification.followrequest.api.FollowRequestApiManager.CallableC620082 */

            static {
                Covode.recordClassIndex(72758);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                try {
                    return FollowRequestApiManager.f140716b.rejectRequest(str).get();
                } catch (ExecutionException e) {
                    throw AbstractC34479a.getCompatibleException(e);
                }
            }
        }, 2);
    }

    /* renamed from: a */
    public static FollowRequestResponse m112152a(long j, long j2, int i) {
        try {
            return f140716b.fetchFollowRequestList(j, j2, i).get();
        } catch (ExecutionException e) {
            throw AbstractC34479a.getCompatibleException(e);
        }
    }

    /* renamed from: a */
    public static void m112154a(Handler handler, final String str, final int i) {
        C34608n.m70658a().mo61083a(handler, new Callable() {
            /* class com.p2082ss.android.ugc.aweme.notification.followrequest.api.FollowRequestApiManager.CallableC620071 */

            static {
                Covode.recordClassIndex(72757);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                try {
                    return FollowRequestApiManager.f140716b.approveRequest(str, i).get();
                } catch (ExecutionException e) {
                    throw AbstractC34479a.getCompatibleException(e);
                }
            }
        }, 1);
    }
}
