package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.dmt.p1194ui.widget.View$OnTouchListenerC17271b;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.p2380a.C34668a;
import com.p2082ss.android.ugc.aweme.base.p2379ui.p2380a.C34669b;
import com.p2082ss.android.ugc.aweme.base.p2379ui.p2380a.C34670c;
import com.p2082ss.android.ugc.aweme.experiment.C46796cm;
import com.p2082ss.android.ugc.aweme.experiment.C46965gb;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.C49559p;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.RunnableC49561r;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.feed.widget.PeriscopeLayout;
import com.p2082ss.android.ugc.aweme.p2483co.C36151e;
import com.p2082ss.android.ugc.aweme.performance.C62845i;
import com.p2082ss.android.ugc.aweme.power.C63303c;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.dt */
public final class C50236dt extends AbstractC50305h {

    /* renamed from: b */
    SmartCircleImageView f115995b;

    /* renamed from: c */
    SmartCircleImageView f115996c;

    /* renamed from: d */
    PeriscopeLayout f115997d;

    /* renamed from: e */
    FrameLayout f115998e;

    /* renamed from: f */
    public ValueAnimator f115999f;

    /* renamed from: g */
    public long f116000g;

    /* renamed from: h */
    private boolean f116001h;

    /* renamed from: i */
    private C36151e f116002i;

    static {
        Covode.recordClassIndex(59362);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: g */
    public final void mo81283g() {
        super.mo81283g();
        m94277e();
    }

    /* renamed from: c */
    private C36151e m94275c() {
        if (this.f116002i == null) {
            this.f116002i = new C36151e();
        }
        return this.f116002i;
    }

    /* renamed from: d */
    private static boolean m94276d() {
        if (C46796cm.f109016a) {
            return false;
        }
        C62845i.m113259b();
        return C16048b.m29633a().mo25421a(true, "anim_opt", false);
    }

    /* renamed from: e */
    private void m94277e() {
        long j;
        if (this.f116001h && !m94276d()) {
            this.f116001h = false;
            C49559p pVar = C49559p.f113984a;
            RunnableC49561r rVar = new RunnableC49561r(false, new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.C50236dt.RunnableC502393 */

                static {
                    Covode.recordClassIndex(59365);
                }

                public final void run() {
                    C50236dt dtVar = C50236dt.this;
                    if (dtVar.f115997d != null) {
                        dtVar.f115997d.mo85801b();
                    }
                    if (C50236dt.this.f115998e != null && C50236dt.this.f115999f != null) {
                        C50236dt.this.f115999f.end();
                    }
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

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50305h
    /* renamed from: b */
    public final void mo85402b() {
        long j;
        if (this.f116001h && !m94276d()) {
            this.f116001h = false;
            C49559p pVar = C49559p.f113984a;
            RunnableC49561r rVar = new RunnableC49561r(false, new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.C50236dt.RunnableC502404 */

                static {
                    Covode.recordClassIndex(59366);
                }

                public final void run() {
                    if (!(C50236dt.this.f115998e == null || C50236dt.this.f115999f == null)) {
                        C50236dt.this.f115999f.end();
                    }
                    C50236dt dtVar = C50236dt.this;
                    if (dtVar.f115997d != null) {
                        dtVar.f115997d.mo85802c();
                    }
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

    public C50236dt(View view) {
        super(view);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo81273a(VideoItemParams videoItemParams) {
        super.mo81273a(videoItemParams);
    }

    /* renamed from: a */
    private static void m94273a(SmartImageView smartImageView) {
        C20766v a = C20761r.m39056a(2131233154);
        a.f49092E = smartImageView;
        a.mo34186c();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a, com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50305h
    /* renamed from: a */
    public final void mo80931a(DataCenter dataCenter) {
        dataCenter.mo60189a("stopPlayAnimation", (AbstractC1214u<C33942b>) this.f113951J).mo60189a("startPlayAnimation", (AbstractC1214u<C33942b>) this.f113951J).mo60189a("pausePlayAnimation", (AbstractC1214u<C33942b>) this.f113951J);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a, com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50305h
    /* renamed from: a */
    public final void mo80929a(View view) {
        super.mo80929a(view);
        this.f113961T = C1870c.m6045a((Activity) this.f113959R, (int) R.layout.sz);
        this.f115998e = (FrameLayout) this.f113961T.findViewById(R.id.cnm);
        this.f115996c = (SmartCircleImageView) this.f113961T.findViewById(R.id.cnl);
        this.f115995b = (SmartCircleImageView) this.f113961T.findViewById(R.id.cxm);
        this.f115997d = (PeriscopeLayout) this.f113961T.findViewById(R.id.ctt);
        this.f115996c.setOnTouchListener(new View$OnTouchListenerC17271b());
        C36151e c = m94275c();
        c.f85402a = this.f113961T.findViewById(R.id.co8);
        c.f85404c = this.f115998e;
        c.f85405d = this.f115996c;
        c.f85403b = this.f115997d;
        c.f85406e = this.f115995b;
        c.f85407f = this.f113960S;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: c */
    public final void mo80938c(C33942b bVar) {
        long j;
        if (bVar != null) {
            String str = bVar.f80277a;
            str.hashCode();
            switch (str.hashCode()) {
                case -2058685350:
                    if (str.equals("pausePlayAnimation")) {
                        m94277e();
                        return;
                    }
                    return;
                case -1661876786:
                    if (str.equals("stopPlayAnimation")) {
                        mo85402b();
                        return;
                    }
                    return;
                case 307897710:
                    if (str.equals("startPlayAnimation") && !this.f116001h && !m94276d() && !C63303c.m114800a().mo101877b()) {
                        this.f116001h = true;
                        C49559p pVar = C49559p.f113984a;
                        RunnableC49561r rVar = new RunnableC49561r(false, new Runnable() {
                            /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.C50236dt.RunnableC502382 */

                            static {
                                Covode.recordClassIndex(59364);
                            }

                            public final void run() {
                                C50236dt dtVar = C50236dt.this;
                                if (dtVar.f115998e != null) {
                                    if (dtVar.f115999f != null) {
                                        dtVar.f115999f.end();
                                    } else {
                                        dtVar.f115999f = ValueAnimator.ofFloat(0.0f, 360.0f);
                                        dtVar.f115999f.setDuration(8000L);
                                        dtVar.f115999f.setRepeatMode(1);
                                        dtVar.f115999f.setInterpolator(new LinearInterpolator());
                                        dtVar.f115999f.setRepeatCount(-1);
                                        dtVar.f115999f.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                            /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.C50236dt.C502371 */

                                            static {
                                                Covode.recordClassIndex(59363);
                                            }

                                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                                if (System.currentTimeMillis() - C50236dt.this.f116000g > 64) {
                                                    C50236dt.this.f116000g = System.currentTimeMillis();
                                                    C50236dt.this.f115998e.setRotation(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                                }
                                            }
                                        });
                                    }
                                    C34668a.m70812a(dtVar.f115999f, C34670c.f81923a);
                                } else {
                                    dtVar.f115998e.clearAnimation();
                                    RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
                                    rotateAnimation.setDuration(8000);
                                    rotateAnimation.setInterpolator(new LinearInterpolator());
                                    rotateAnimation.setRepeatMode(1);
                                    rotateAnimation.setRepeatCount(-1);
                                    rotateAnimation.setFillAfter(true);
                                    FrameLayout frameLayout = dtVar.f115998e;
                                    int i = C34670c.f81923a;
                                    C89219l.m154721d(rotateAnimation, "");
                                    C89219l.m154721d(frameLayout, "");
                                    if (!C34669b.m70814b(i)) {
                                        frameLayout.setVisibility(8);
                                    } else if (C34669b.m70813a(i)) {
                                        frameLayout.startAnimation(rotateAnimation);
                                    }
                                }
                                C50236dt dtVar2 = C50236dt.this;
                                if (dtVar2.f115997d != null) {
                                    dtVar2.f115997d.mo85799a();
                                }
                            }
                        });
                        if (C46965gb.f109453a) {
                            j = 300;
                        } else {
                            j = 0;
                        }
                        pVar.mo81306a(rVar, j);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
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

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0115  */
    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80935b(com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b r10) {
        /*
        // Method dump skipped, instructions count: 327
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2970ui.C50236dt.mo80935b(com.ss.android.ugc.aweme.arch.widgets.base.b):void");
    }

    /* renamed from: a */
    private static void m94274a(SmartImageView smartImageView, UrlModel urlModel, int i, int i2) {
        C20766v a = C20761r.m39060a(C34735v.m70965a(urlModel)).mo34176a(i, i2);
        a.f49098K = true;
        C20766v a2 = a.mo34179a("VideoMusicCoverView");
        a2.f49092E = smartImageView;
        a2.mo34186c();
    }
}
