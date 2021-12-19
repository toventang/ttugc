package com.bytedance.android.livesdk.feed.viewmodel;

import com.bytedance.android.livesdk.livesetting.feed.BackRefreshTimeoutSetting;
import com.bytedance.android.livesdk.util.rxutils.C11195i;
import com.bytedance.android.livesdk.util.rxutils.RxViewModel;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4591l.C88960c;

public class TimeOutRefreshViewModel extends RxViewModel {

    /* renamed from: a */
    public boolean f21518a;

    /* renamed from: b */
    public C88960c<Object> f21519b = new C88960c<>();

    /* renamed from: c */
    public long f21520c = Long.MAX_VALUE;

    static {
        Covode.recordClassIndex(9585);
    }

    /* renamed from: a */
    public final void mo14999a() {
        if (!this.f21518a && this.f21520c != Long.MAX_VALUE && System.currentTimeMillis() - this.f21520c > ((long) BackRefreshTimeoutSetting.INSTANCE.getValue())) {
            this.f21519b.onNext(C11195i.f26825c);
        }
        this.f21520c = Long.MAX_VALUE;
        this.f21518a = false;
    }
}
