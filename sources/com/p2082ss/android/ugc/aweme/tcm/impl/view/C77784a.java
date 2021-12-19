package com.p2082ss.android.ugc.aweme.tcm.impl.view;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRouter;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.ugc.aweme.commercialize.util.C38584d;
import com.p2082ss.android.ugc.aweme.discover.model.BrandedContentToolSchema;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.tcm.api.service.AbstractC77734a;
import com.p2082ss.android.ugc.aweme.tcm.impl.p4079d.C77759b;
import com.p2082ss.android.ugc.aweme.tcm.impl.p4080e.C77763a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tcm.impl.view.a */
public final class C77784a implements AbstractC77734a {

    /* renamed from: a */
    public View f174420a;

    /* renamed from: b */
    public final ViewGroup f174421b;

    /* renamed from: c */
    public final Context f174422c;

    static {
        Covode.recordClassIndex(90847);
    }

    @Override // com.p2082ss.android.ugc.aweme.tcm.api.service.AbstractC77734a
    /* renamed from: b */
    public final void mo121269b() {
        View view = this.f174420a;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tcm.api.service.AbstractC77734a
    /* renamed from: a */
    public final View mo121267a() {
        MethodCollector.m26663i(10578);
        ViewGroup viewGroup = this.f174421b;
        if (viewGroup instanceof FrameLayout) {
            this.f174420a = C1870c.m6046a((Activity) this.f174422c, R.layout.wd, viewGroup, false);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            layoutParams.bottomMargin = (int) C13628n.m24520b(this.f174422c, 6.0f);
            this.f174421b.addView(this.f174420a, layoutParams);
            View view = this.f174420a;
            if (view != null) {
                view.setVisibility(8);
            }
        } else if (viewGroup instanceof RelativeLayout) {
            this.f174420a = C1870c.m6046a((Activity) this.f174422c, R.layout.wd, viewGroup, false);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams2.addRule(14);
            layoutParams2.addRule(12);
            layoutParams2.bottomMargin = (int) C13628n.m24520b(this.f174422c, 6.0f);
            this.f174421b.addView(this.f174420a, layoutParams2);
            View view2 = this.f174420a;
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
        View view3 = this.f174420a;
        MethodCollector.m26664o(10578);
        return view3;
    }

    /* renamed from: com.ss.android.ugc.aweme.tcm.impl.view.a$a */
    static final class View$OnClickListenerC77785a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C77784a f174423a;

        /* renamed from: b */
        final /* synthetic */ Aweme f174424b;

        static {
            Covode.recordClassIndex(90848);
        }

        View$OnClickListenerC77785a(C77784a aVar, Aweme aweme) {
            this.f174423a = aVar;
            this.f174424b = aweme;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            if (!C58001a.m104815a(view, 1200)) {
                Bundle bundle = new Bundle();
                bundle.putString("itemID", this.f174424b.getAid());
                bundle.putString("enter_from", "video_play");
                Context context = this.f174423a.f174422c;
                BrandedContentToolSchema a = C77759b.m135850a();
                if (a == null || (str = a.baViewInsightsSchema) == null) {
                    str = "";
                }
                SmartRouter.buildRoute(context, C38584d.m78289a(str, bundle)).open();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tcm.api.service.AbstractC77734a
    /* renamed from: a */
    public final void mo121268a(Aweme aweme) {
        BrandedContentToolSchema a;
        View view;
        long j;
        if (aweme != null && (a = C77759b.m135850a()) != null && a.baViewInsightsSchema != null && (view = this.f174420a) != null) {
            TextView textView = (TextView) view.findViewById(R.id.est);
            AwemeStatistics statistics = aweme.getStatistics();
            long j2 = 0;
            if (statistics != null) {
                j = statistics.getPlayCount();
            } else {
                j = 0;
            }
            String quantityString = this.f174422c.getResources().getQuantityString(R.plurals.s, (int) j, C77763a.m135853a(j));
            C89219l.m154716b(quantityString, "");
            if (statistics != null) {
                j2 = statistics.getShareCount();
            }
            String quantityString2 = this.f174422c.getResources().getQuantityString(R.plurals.r, (int) j2, C77763a.m135853a(j2));
            C89219l.m154716b(quantityString2, "");
            String string = this.f174422c.getResources().getString(R.string.b94);
            C89219l.m154716b(string, "");
            if (textView != null) {
                textView.setText(quantityString + string + ' ' + quantityString2);
            }
            View view2 = this.f174420a;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            View view3 = this.f174420a;
            if (view3 != null) {
                view3.setOnClickListener(new View$OnClickListenerC77785a(this, aweme));
            }
        }
    }

    public C77784a(ViewGroup viewGroup, Context context) {
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(context, "");
        this.f174421b = viewGroup;
        this.f174422c = context;
    }
}
