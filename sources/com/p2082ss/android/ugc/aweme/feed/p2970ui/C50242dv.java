package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.experiment.C46965gb;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49537z;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.C49559p;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.RunnableC49561r;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.feed.widget.MarqueeView;
import com.p2082ss.android.ugc.aweme.p2483co.C36152f;
import com.p2082ss.android.ugc.aweme.power.C63303c;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.dv */
public final class C50242dv extends AbstractC50305h {

    /* renamed from: b */
    ImageView f116008b;

    /* renamed from: c */
    TextView f116009c;

    /* renamed from: d */
    MarqueeView f116010d;

    /* renamed from: e */
    LinearLayout f116011e;

    /* renamed from: f */
    TextView f116012f;

    /* renamed from: g */
    private boolean f116013g;

    /* renamed from: h */
    private boolean f116014h = C16048b.m29633a().mo25421a(true, "marquee_title_opt", false);

    /* renamed from: i */
    private C36152f f116015i;

    static {
        Covode.recordClassIndex(59368);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50305h
    /* renamed from: b */
    public final void mo85402b() {
        long j;
        if (this.f116013g) {
            this.f116013g = false;
            if (this.f116010d != null) {
                C49559p pVar = C49559p.f113984a;
                RunnableC49561r rVar = new RunnableC49561r(false, new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.C50242dv.RunnableC502453 */

                    static {
                        Covode.recordClassIndex(59371);
                    }

                    public final void run() {
                        C50242dv.this.f116010d.mo85790c();
                    }
                });
                if (C46965gb.f109453a) {
                    j = 300;
                } else {
                    j = 0;
                }
                pVar.mo81306a(rVar, j);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo81273a(VideoItemParams videoItemParams) {
        super.mo81273a(videoItemParams);
    }

    /* renamed from: a */
    private void m94286a(String str) {
        this.f116012f.setText(str);
        this.f116010d.setText(str);
    }

    public C50242dv(View view) {
        super(view);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a, com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50305h
    /* renamed from: a */
    public final void mo80931a(DataCenter dataCenter) {
        dataCenter.mo60189a("stopPlayAnimation", (AbstractC1214u<C33942b>) this.f113951J).mo60189a("startPlayAnimation", (AbstractC1214u<C33942b>) this.f113951J).mo60189a("pausePlayAnimation", (AbstractC1214u<C33942b>) this.f113951J);
    }

    /* renamed from: b */
    private void m94287b(int i) {
        if (this.f116014h || C63303c.m114800a().f143683a == 2) {
            this.f116012f.setVisibility(i);
            this.f116010d.setVisibility(8);
            return;
        }
        this.f116010d.setVisibility(i);
        this.f116012f.setVisibility(8);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: e */
    public final C33942b mo81280e(C33942b bVar) {
        if (bVar == null) {
            return null;
        }
        super.mo81280e(bVar);
        if (!TextUtils.equals(bVar.f80277a, "video_params")) {
            return null;
        }
        HashMap hashMap = new HashMap();
        C33942b bVar2 = new C33942b("ui_state", hashMap);
        hashMap.put("aweme_state", this.f113953L);
        hashMap.put("event_type_state", this.f113954M);
        hashMap.put("enter_method_state", this.f113962U);
        return bVar2;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a, com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50305h
    /* renamed from: a */
    public final void mo80929a(View view) {
        super.mo80929a(view);
        this.f113961T = C1870c.m6045a((Activity) this.f113959R, (int) R.layout.t7);
        this.f116010d = (MarqueeView) this.f113961T.findViewById(R.id.coj);
        this.f116012f = (TextView) this.f113961T.findViewById(R.id.col);
        this.f116009c = (TextView) this.f113961T.findViewById(R.id.cny);
        this.f116008b = (ImageView) this.f113961T.findViewById(R.id.cnr);
        this.f116011e = (LinearLayout) this.f113961T.findViewById(R.id.coh);
        if (!C49537z.m92776b()) {
            this.f116014h = true;
            this.f116012f.setVisibility(0);
            this.f116010d.setVisibility(8);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80938c(com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b r8) {
        /*
        // Method dump skipped, instructions count: 158
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2970ui.C50242dv.mo80938c(com.ss.android.ugc.aweme.arch.widgets.base.b):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0189, code lost:
        if (android.text.TextUtils.equals(r1.getOwnerId(), r2.getUid()) != false) goto L_0x015c;
     */
    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80935b(com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b r16) {
        /*
        // Method dump skipped, instructions count: 625
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2970ui.C50242dv.mo80935b(com.ss.android.ugc.aweme.arch.widgets.base.b):void");
    }
}
