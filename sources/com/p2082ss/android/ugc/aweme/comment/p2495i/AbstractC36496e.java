package com.p2082ss.android.ugc.aweme.comment.p2495i;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;

/* renamed from: com.ss.android.ugc.aweme.comment.i.e */
public abstract /* synthetic */ class AbstractC36496e {
    static {
        Covode.recordClassIndex(43799);
    }

    /* renamed from: a */
    public static String m74292a(int i) {
        return (i == 1 || i == 2) ? "like" : i != 3 ? UGCMonitor.EVENT_COMMENT : "view";
    }
}
