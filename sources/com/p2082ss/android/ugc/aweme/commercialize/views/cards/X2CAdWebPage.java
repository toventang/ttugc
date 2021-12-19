package com.p2082ss.android.ugc.aweme.commercialize.views.cards;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p084a.p088b.C1862a;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.legoImp.inflate.X2CBaseInflate;
import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.X2CAdWebPage */
public class X2CAdWebPage extends X2CBaseInflate {

    /* renamed from: a */
    public Context f91788a;

    /* renamed from: b */
    public Activity f91789b;

    /* renamed from: c */
    public boolean f91790c;

    /* renamed from: d */
    public LinkedBlockingDeque<View> f91791d = new LinkedBlockingDeque<>();

    static {
        Covode.recordClassIndex(46447);
    }

    @Override // com.p2082ss.android.ugc.aweme.legoImp.inflate.X2CBaseInflate, com.p2082ss.android.ugc.aweme.lego.AbstractC58258q
    /* renamed from: a */
    public final void mo28741a(Context context, Activity activity) {
    }

    @Override // com.p2082ss.android.ugc.aweme.legoImp.inflate.X2CBaseInflate
    /* renamed from: c */
    public final int mo67524c() {
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.legoImp.inflate.X2CBaseInflate
    /* renamed from: d */
    public final int[] mo67525d() {
        return new int[0];
    }

    @Override // com.p2082ss.android.ugc.aweme.legoImp.inflate.X2CBaseInflate, com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return "X2CAdWebPage";
    }

    /* renamed from: b */
    private static Context m78881b(Activity activity) {
        Context applicationContext = activity.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: a */
    public final void mo67523a(Activity activity) {
        this.f91788a = m78881b(activity);
        this.f91789b = activity;
        this.f91791d.clear();
    }

    @Override // com.p2082ss.android.ugc.aweme.legoImp.inflate.X2CBaseInflate
    /* renamed from: a */
    public final View mo67522a(Context context, int i) {
        MethodCollector.m26663i(6717);
        if (mo95720n()) {
            View poll = this.f91791d.poll();
            if (poll != null) {
                MethodCollector.m26664o(6717);
                return poll;
            }
            View a = C1862a.m6032a(context, i, new FrameLayout(context), false);
            MethodCollector.m26664o(6717);
            return a;
        } else if (mo95719m()) {
            View a2 = C1764a.m5927a(LayoutInflater.from(context), i, new FrameLayout(context), false);
            MethodCollector.m26664o(6717);
            return a2;
        } else {
            View a3 = C1862a.m6032a(context, i, new FrameLayout(context), false);
            MethodCollector.m26664o(6717);
            return a3;
        }
    }
}
