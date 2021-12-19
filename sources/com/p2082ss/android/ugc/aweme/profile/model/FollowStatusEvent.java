package com.p2082ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.model.FollowStatusEvent */
public final class FollowStatusEvent implements AbstractC81914b {
    public final FollowStatus status;

    static {
        Covode.recordClassIndex(75171);
    }

    public static /* synthetic */ FollowStatusEvent copy$default(FollowStatusEvent followStatusEvent, FollowStatus followStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            followStatus = followStatusEvent.status;
        }
        return followStatusEvent.copy(followStatus);
    }

    public final FollowStatusEvent copy(FollowStatus followStatus) {
        C89219l.m154721d(followStatus, "");
        return new FollowStatusEvent(followStatus);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof FollowStatusEvent) && C89219l.m154714a(this.status, ((FollowStatusEvent) obj).status);
        }
        return true;
    }

    public final int hashCode() {
        FollowStatus followStatus = this.status;
        if (followStatus != null) {
            return followStatus.hashCode();
        }
        return 0;
    }

    public final AbstractC81914b post() {
        return AbstractC81915c.m141874a(this);
    }

    public final AbstractC81914b postSticky() {
        return AbstractC81915c.m141875b(this);
    }

    public final String toString() {
        return "FollowStatusEvent(status=" + this.status + ")";
    }

    public FollowStatusEvent(FollowStatus followStatus) {
        C89219l.m154721d(followStatus, "");
        this.status = followStatus;
    }
}
