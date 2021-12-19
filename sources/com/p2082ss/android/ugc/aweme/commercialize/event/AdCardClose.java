package com.p2082ss.android.ugc.aweme.commercialize.event;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;

/* renamed from: com.ss.android.ugc.aweme.commercialize.event.AdCardClose */
public final class AdCardClose implements AbstractC81914b {
    public int cardStatus;

    static {
        Covode.recordClassIndex(45281);
    }

    public final AbstractC81914b post() {
        return AbstractC81915c.m141874a(this);
    }

    public final AbstractC81914b postSticky() {
        return AbstractC81915c.m141875b(this);
    }

    public AdCardClose(int i) {
        this.cardStatus = i;
    }
}
