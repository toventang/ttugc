package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50553s;
import com.p2082ss.android.ugc.aweme.p2335aq.p2336a.C33918a;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.dc */
final /* synthetic */ class RunnableC50204dc implements Runnable {

    /* renamed from: a */
    private final C50188cv f115934a;

    /* renamed from: b */
    private final Aweme f115935b;

    /* renamed from: c */
    private final Map f115936c;

    static {
        Covode.recordClassIndex(59330);
    }

    RunnableC50204dc(C50188cv cvVar, Aweme aweme, Map map) {
        this.f115934a = cvVar;
        this.f115935b = aweme;
        this.f115936c = map;
    }

    public final void run() {
        C50188cv cvVar = this.f115934a;
        Aweme aweme = this.f115935b;
        Map<String, Object> map = this.f115936c;
        cvVar.f113958Q.mo60191a("video_digg", (Object) 5);
        cvVar.mo85348a(true, aweme, map);
        Boolean bool = (Boolean) cvVar.f115869a.getTag(C33918a.f80227a);
        if (bool != null && bool.booleanValue()) {
            C50553s.m94778a(cvVar.f115869a);
        } else {
            cvVar.f115869a.mo85726g();
        }
    }
}
