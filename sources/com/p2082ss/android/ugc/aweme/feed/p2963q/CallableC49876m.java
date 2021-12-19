package com.p2082ss.android.ugc.aweme.feed.p2963q;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.C39163s;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.feed.q.m */
public final /* synthetic */ class CallableC49876m implements Callable {

    /* renamed from: a */
    private final AbstractC49815a f114963a;

    static {
        Covode.recordClassIndex(58983);
    }

    CallableC49876m(AbstractC49815a aVar) {
        this.f114963a = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C39162r.onEvent(MobClick.obtain().setEventName("video_request_leave").setLabelName("perf_monitor").setJsonObject(new C39163s().mo67941a("duration", String.valueOf(SystemClock.elapsedRealtime() - this.f114963a.f114756K)).mo67942a()));
        return null;
    }
}
