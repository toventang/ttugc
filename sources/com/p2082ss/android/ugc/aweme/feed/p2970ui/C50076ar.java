package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49674b;
import com.p2082ss.android.ugc.aweme.p4173ug.guide.C79639a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80635y;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ar */
public final class C50076ar extends AbstractC50032a {

    /* renamed from: f */
    private TextView f115610f;

    static {
        Covode.recordClassIndex(59202);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50032a
    /* renamed from: b */
    public final int mo85138b() {
        return R.layout.s8;
    }

    /* renamed from: d */
    public final void mo85213d() {
        View view = ((AbstractC50032a) this).f115489a;
        if (view != null) {
            view.setVisibility(8);
        }
        mo85139c();
        AbstractC81915c.m141874a(new C49674b(true));
    }

    public C50076ar(View view) {
        super(view);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.ar$a */
    static final class View$OnClickListenerC50077a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C50076ar f115611a;

        /* renamed from: b */
        final /* synthetic */ Aweme f115612b;

        static {
            Covode.recordClassIndex(59203);
        }

        View$OnClickListenerC50077a(C50076ar arVar, Aweme aweme) {
            this.f115611a = arVar;
            this.f115612b = aweme;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f115611a.mo85213d();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50032a, com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo80929a(View view) {
        TextView textView;
        super.mo80929a(view);
        View view2 = ((AbstractC50032a) this).f115489a;
        if (view2 != null) {
            textView = (TextView) view2.findViewById(R.id.zz);
        } else {
            textView = null;
        }
        this.f115610f = textView;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.ar$b */
    static final class View$OnClickListenerC50078b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TextView f115613a;

        static {
            Covode.recordClassIndex(59204);
        }

        View$OnClickListenerC50078b(TextView textView) {
            this.f115613a = textView;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            new C79459a(this.f115613a.getContext()).mo123050a(R.string.dp3).mo123053a();
            AbstractC81915c.m141874a(new C79639a());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50032a
    /* renamed from: a */
    public final void mo85137a(Aweme aweme) {
        String str;
        C89219l.m154721d(aweme, "");
        if (C80635y.m139813h(aweme)) {
            View view = ((AbstractC50032a) this).f115489a;
            if (view == null || view.getVisibility() != 0) {
                View view2 = ((AbstractC50032a) this).f115489a;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                TextView textView = this.f115490b;
                String str2 = null;
                if (textView != null) {
                    VideoMaskInfo generalMaskInfo = aweme.getGeneralMaskInfo();
                    if (generalMaskInfo != null) {
                        str = generalMaskInfo.getTitle();
                    } else {
                        str = null;
                    }
                    textView.setText(str);
                }
                TextView textView2 = this.f115492d;
                if (textView2 != null) {
                    VideoMaskInfo generalMaskInfo2 = aweme.getGeneralMaskInfo();
                    if (generalMaskInfo2 != null) {
                        str2 = generalMaskInfo2.getContent();
                    }
                    textView2.setText(str2);
                }
                TextView textView3 = this.f115491c;
                if (textView3 != null) {
                    C39162r.m79460a("tns_mask_layer_click_skip", new C33744d().mo59983a("scenario", "general").mo59983a("group_id", aweme.getAid()).f79943a);
                    textView3.setText(R.string.d0u);
                    textView3.setOnClickListener(new View$OnClickListenerC50078b(textView3));
                }
                TextView textView4 = this.f115610f;
                if (textView4 != null) {
                    C39162r.m79460a("tns_mask_layer_click_watch", new C33744d().mo59983a("scenario", "general").mo59983a("group_id", aweme.getAid()).f79943a);
                    textView4.setText(R.string.d0v);
                    textView4.setOnClickListener(new View$OnClickListenerC50077a(this, aweme));
                }
                C39162r.m79460a("tns_show_mask_layer", new C33744d().mo59983a("scenario", "general").mo59983a("group_id", aweme.getAid()).f79943a);
                return;
            }
            return;
        }
        View view3 = ((AbstractC50032a) this).f115489a;
        if (view3 != null) {
            view3.setVisibility(8);
        }
    }
}
