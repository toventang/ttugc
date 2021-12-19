package com.p2082ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.model.BackFromSettingEvent */
public final class BackFromSettingEvent implements AbstractC81914b {
    public final String enterFrom;

    static {
        Covode.recordClassIndex(60882);
    }

    public final AbstractC81914b post() {
        return AbstractC81915c.m141874a(this);
    }

    public final AbstractC81914b postSticky() {
        return AbstractC81915c.m141875b(this);
    }

    public BackFromSettingEvent(String str) {
        C89219l.m154721d(str, "");
        this.enterFrom = str;
    }
}
