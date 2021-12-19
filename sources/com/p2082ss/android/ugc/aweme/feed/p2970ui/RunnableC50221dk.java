package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import androidx.core.p036g.C0692e;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.dk */
final /* synthetic */ class RunnableC50221dk implements Runnable {

    /* renamed from: a */
    private final C50211dg f115975a;

    /* renamed from: b */
    private final String f115976b;

    /* renamed from: c */
    private final C33942b f115977c;

    static {
        Covode.recordClassIndex(59347);
    }

    RunnableC50221dk(C50211dg dgVar, String str, C33942b bVar) {
        this.f115975a = dgVar;
        this.f115976b = str;
        this.f115977c = bVar;
    }

    public final void run() {
        C50211dg dgVar = this.f115975a;
        String str = this.f115976b;
        C33942b bVar = this.f115977c;
        str.hashCode();
        if (str.equals("action_video_on_play_progress_change")) {
            C0692e eVar = (C0692e) bVar.mo60212a();
            if (eVar != null && eVar.f2751b.doubleValue() >= 1.0d) {
                dgVar.mo85376a(3);
                if (dgVar.f113958Q != null) {
                    dgVar.f113958Q.mo60193b("action_video_on_play_progress_change", (AbstractC1214u<C33942b>) dgVar);
                }
            }
        } else if (str.equals("show_expose_sharer_info_view")) {
            dgVar.mo85376a(2);
        }
    }
}
