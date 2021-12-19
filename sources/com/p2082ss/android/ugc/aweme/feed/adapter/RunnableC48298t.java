package com.p2082ss.android.ugc.aweme.feed.adapter;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.follow.presenter.RoomStruct;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.t */
final /* synthetic */ class RunnableC48298t implements Runnable {

    /* renamed from: a */
    private final FollowLiveVideoViewHolder f111942a;

    static {
        Covode.recordClassIndex(57040);
    }

    RunnableC48298t(FollowLiveVideoViewHolder followLiveVideoViewHolder) {
        this.f111942a = followLiveVideoViewHolder;
    }

    public final void run() {
        int i;
        FollowLiveVideoViewHolder followLiveVideoViewHolder = this.f111942a;
        if (!followLiveVideoViewHolder.f111286f) {
            followLiveVideoViewHolder.f111286f = true;
            if (followLiveVideoViewHolder.f111273a != null) {
                C33744d a = new C33744d().mo59983a("enter_from_merge", "homepage_follow").mo59983a("action_type", "click").mo59981a("anchor_id", followLiveVideoViewHolder.f111273a.ownerUserId).mo59981a("room_id", followLiveVideoViewHolder.f111273a.f114485id);
                RoomStruct roomStruct = followLiveVideoViewHolder.f111273a;
                if (roomStruct.owner != null) {
                    i = roomStruct.owner.getFollowStatus();
                    if (!(i == 0 || i == 1 || i == 2)) {
                        i = roomStruct.owner.getFollowerStatus() == 0 ? 0 : 3;
                    }
                } else {
                    i = -1;
                }
                C33744d a2 = a.mo59980a("follow_status", i).mo59983a("enter_method", "live_window");
                if (followLiveVideoViewHolder.f111308j != null) {
                    a2.mo59983a("request_id", followLiveVideoViewHolder.f111308j.getRequestId()).mo59980a("order", followLiveVideoViewHolder.f111308j.getAwemePosition());
                }
                C39162r.m79460a("livesdk_live_show", a2.f79943a);
            }
            followLiveVideoViewHolder.mo80078a(followLiveVideoViewHolder.f111284d, followLiveVideoViewHolder.f111285e);
        }
    }
}
