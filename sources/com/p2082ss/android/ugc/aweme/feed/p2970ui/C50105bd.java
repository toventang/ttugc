package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49674b;
import com.p2082ss.android.ugc.aweme.p4173ug.guide.C79639a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80635y;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.bd */
public final class C50105bd extends AbstractC50032a {

    /* renamed from: f */
    private TextView f115662f;

    static {
        Covode.recordClassIndex(59231);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50032a
    /* renamed from: b */
    public final int mo85138b() {
        return R.layout.s8;
    }

    public C50105bd(View view) {
        super(view);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50032a, com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo80931a(DataCenter dataCenter) {
        super.mo80931a(dataCenter);
        if (dataCenter != null) {
            dataCenter.mo60189a("on_page_unselected", (AbstractC1214u<C33942b>) this.f113951J);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50032a, com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo80929a(View view) {
        TextView textView;
        super.mo80929a(view);
        ImageView imageView = this.f115493e;
        if (imageView != null) {
            imageView.setImageResource(2131231745);
        }
        View view2 = ((AbstractC50032a) this).f115489a;
        if (view2 != null) {
            textView = (TextView) view2.findViewById(R.id.zz);
        } else {
            textView = null;
        }
        this.f115662f = textView;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50032a, com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: c */
    public final void mo80938c(C33942b bVar) {
        String str;
        if (bVar != null) {
            str = bVar.f80277a;
        } else {
            str = null;
        }
        if (C89219l.m154714a((Object) "on_page_unselected", (Object) str) && C80635y.m139814i(this.f113953L) && C39223a.m79590d().mo68623h() == 0 && C39223a.m79590d().mo68624i() == 2) {
            C39223a.m79590d().mo68615a((IComplianceBusinessService) 2, (int) ((AbstractC89171a<C89391z>) null));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.bd$a */
    static final class View$OnClickListenerC50106a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C50105bd f115663a;

        /* renamed from: b */
        final /* synthetic */ Aweme f115664b;

        static {
            Covode.recordClassIndex(59232);
        }

        View$OnClickListenerC50106a(C50105bd bdVar, Aweme aweme) {
            this.f115663a = bdVar;
            this.f115664b = aweme;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C39162r.m79460a("tns_mask_layer_click_watch", new C33744d().mo59983a("scenario", "photosensitive").mo59983a("group_id", this.f115664b.getAid()).f79943a);
            C39223a.m79590d().mo68615a((IComplianceBusinessService) 2, (int) ((AbstractC89171a<C89391z>) null));
            View view2 = ((AbstractC50032a) this.f115663a).f115489a;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            C39223a.m79590d().mo68615a((IComplianceBusinessService) 2, (int) ((AbstractC89171a<C89391z>) null));
            AbstractC81915c.m141874a(new C49674b());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.bd$b */
    static final class View$OnClickListenerC50107b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TextView f115665a;

        /* renamed from: b */
        final /* synthetic */ C50105bd f115666b;

        /* renamed from: c */
        final /* synthetic */ Aweme f115667c;

        static {
            Covode.recordClassIndex(59233);
        }

        View$OnClickListenerC50107b(TextView textView, C50105bd bdVar, Aweme aweme) {
            this.f115665a = textView;
            this.f115666b = bdVar;
            this.f115667c = aweme;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C39162r.m79460a("tns_mask_layer_click_skip", new C33744d().mo59983a("scenario", "photosensitive").mo59983a("group_id", this.f115667c.getAid()).f79943a);
            C39223a.m79590d().mo68615a((IComplianceBusinessService) 1, (int) ((AbstractC89171a<C89391z>) null));
            new C79459a(this.f115665a.getContext()).mo123050a(R.string.dp3).mo123053a();
            AbstractC81915c.m141874a(new C79639a());
            this.f115666b.mo85137a(this.f115667c);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50032a
    /* renamed from: a */
    public final void mo85137a(Aweme aweme) {
        TextView textView;
        TextView textView2;
        C89219l.m154721d(aweme, "");
        if (!C80635y.m139814i(aweme)) {
            View view = ((AbstractC50032a) this).f115489a;
            if (view != null) {
                view.setVisibility(8);
            }
        } else if (C39223a.m79590d().mo68623h() == 1) {
            View view2 = ((AbstractC50032a) this).f115489a;
            if (view2 == null || view2.getVisibility() != 0 || (textView = this.f115662f) == null || textView.getVisibility() != 8 || (textView2 = this.f115491c) == null || textView2.getVisibility() != 8) {
                View view3 = ((AbstractC50032a) this).f115489a;
                if (view3 != null) {
                    view3.setVisibility(0);
                }
                C39162r.m79460a("tns_show_photosensitive_removed", new C33744d().mo59983a("group_id", aweme.getAid()).f79943a);
                TextView textView3 = this.f115662f;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
                TextView textView4 = this.f115491c;
                if (textView4 != null) {
                    textView4.setVisibility(8);
                }
                TextView textView5 = this.f115492d;
                if (textView5 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f113959R.getString(R.string.dou) + "\n\n" + this.f113959R.getString(R.string.dov));
                    int a = C89361p.m154888a((CharSequence) spannableStringBuilder, "\n\n", 0, false, 6);
                    spannableStringBuilder.setSpan(new AbsoluteSizeSpan(7, true), a + 1, a + 2, 33);
                    textView5.setText(spannableStringBuilder);
                }
                TextView textView6 = this.f115490b;
                if (textView6 != null) {
                    textView6.setText(R.string.dot);
                }
            }
        } else {
            View view4 = ((AbstractC50032a) this).f115489a;
            if (view4 == null || view4.getVisibility() != 0) {
                View view5 = ((AbstractC50032a) this).f115489a;
                if (view5 != null) {
                    view5.setVisibility(0);
                }
                C39162r.m79460a("tns_show_mask_layer", new C33744d().mo59983a("scenario", "photosensitive").mo59983a("group_id", aweme.getAid()).f79943a);
                TextView textView7 = this.f115492d;
                if (textView7 != null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(this.f113959R.getString(R.string.dor) + "\n\n" + this.f113959R.getString(R.string.dos));
                    int a2 = C89361p.m154888a((CharSequence) spannableStringBuilder2, "\n\n", 0, false, 6);
                    spannableStringBuilder2.setSpan(new AbsoluteSizeSpan(7, true), a2 + 1, a2 + 2, 33);
                    textView7.setText(spannableStringBuilder2);
                }
                TextView textView8 = this.f115490b;
                if (textView8 != null) {
                    textView8.setText(R.string.dox);
                }
                TextView textView9 = this.f115491c;
                if (textView9 != null) {
                    textView9.setVisibility(0);
                    textView9.setText(R.string.doy);
                    textView9.setOnClickListener(new View$OnClickListenerC50106a(this, aweme));
                }
                TextView textView10 = this.f115662f;
                if (textView10 != null) {
                    textView10.setVisibility(0);
                    textView10.setText(R.string.dow);
                    textView10.setOnClickListener(new View$OnClickListenerC50107b(textView10, this, aweme));
                }
            }
        }
    }
}
