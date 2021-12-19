package com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.AbstractC18018b;
import com.p2082ss.android.agilelogger.ALog;
import com.p2082ss.android.ugc.aweme.utils.C80534hh;

/* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.a */
public final class C18076a implements AbstractC18018b {

    /* renamed from: a */
    private ViewGroup f43027a;

    /* renamed from: b */
    private View f43028b;

    /* renamed from: c */
    private final Activity f43029c;

    /* renamed from: d */
    private int f43030d = -1;

    static {
        Covode.recordClassIndex(20706);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.topview.AbstractC18018b
    /* renamed from: b */
    public final void mo28745b() {
        View view;
        MethodCollector.m26663i(1824);
        ViewGroup viewGroup = this.f43027a;
        if (!(viewGroup == null || (view = this.f43028b) == null)) {
            viewGroup.removeView(view);
            int i = this.f43030d;
            if (i != -1) {
                C80534hh.m139606a(this.f43029c, i);
                this.f43030d = -1;
            }
        }
        ALog.m59865d("awesome_splash", "removeSplashLoadMask");
        MethodCollector.m26664o(1824);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0069, code lost:
        if (r0 == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x009f, code lost:
        if (r5.equals("honor") != false) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c8, code lost:
        if (r5.equals("huawei") != false) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ca, code lost:
        r0 = com.bytedance.ies.ugc.aweme.commercialize.splash.p1262f.C17974h.m33454b(r4);
     */
    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.topview.AbstractC18018b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28744a() {
        /*
        // Method dump skipped, instructions count: 264
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.C18076a.mo28744a():void");
    }

    public C18076a(Activity activity) {
        this.f43029c = activity;
    }
}
