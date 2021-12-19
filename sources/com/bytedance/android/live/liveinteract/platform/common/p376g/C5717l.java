package com.bytedance.android.live.liveinteract.platform.common.p376g;

import com.bytedance.android.live.liveinteract.platform.common.api.LogReportApi;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88434g;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.liveinteract.platform.common.g.l */
public final /* synthetic */ class C5717l implements AbstractC88434g {

    /* renamed from: a */
    static final AbstractC88434g f14508a = new C5717l();

    static {
        Covode.recordClassIndex(6315);
    }

    private C5717l() {
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88434g
    public final Object apply(Object obj) {
        return ((LogReportApi) C5805e.m12718a().mo11572a(LogReportApi.class)).logReport("a", obj);
    }
}
