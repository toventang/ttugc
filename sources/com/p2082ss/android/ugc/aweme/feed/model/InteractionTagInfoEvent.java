package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.InteractionTagInfoEvent */
public final class InteractionTagInfoEvent implements AbstractC81914b {
    public final Aweme aweme;

    static {
        Covode.recordClassIndex(58712);
    }

    public static /* synthetic */ InteractionTagInfoEvent copy$default(InteractionTagInfoEvent interactionTagInfoEvent, Aweme aweme2, int i, Object obj) {
        if ((i & 1) != 0) {
            aweme2 = interactionTagInfoEvent.aweme;
        }
        return interactionTagInfoEvent.copy(aweme2);
    }

    public final InteractionTagInfoEvent copy(Aweme aweme2) {
        C89219l.m154721d(aweme2, "");
        return new InteractionTagInfoEvent(aweme2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof InteractionTagInfoEvent) && C89219l.m154714a(this.aweme, ((InteractionTagInfoEvent) obj).aweme);
        }
        return true;
    }

    public final int hashCode() {
        Aweme aweme2 = this.aweme;
        if (aweme2 != null) {
            return aweme2.hashCode();
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
        return "InteractionTagInfoEvent(aweme=" + this.aweme + ")";
    }

    public InteractionTagInfoEvent(Aweme aweme2) {
        C89219l.m154721d(aweme2, "");
        this.aweme = aweme2;
    }
}
