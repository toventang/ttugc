package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.p036g.C0692e;
import androidx.lifecycle.AbstractC1214u;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.KtfInfo;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50539g;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ew */
public final class C50297ew extends AbstractC50304g implements AbstractC1214u<C33942b> {

    /* renamed from: m */
    public static final C50298a f116131m = new C50298a((byte) 0);

    /* renamed from: l */
    public View f116132l;

    /* renamed from: n */
    private View f116133n;

    static {
        Covode.recordClassIndex(59423);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50304g
    /* renamed from: a */
    public final void mo85143a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.ew$a */
    public static final class C50298a {
        static {
            Covode.recordClassIndex(59424);
        }

        private C50298a() {
        }

        public /* synthetic */ C50298a(byte b) {
            this();
        }
    }

    public C50297ew(View view) {
        super(view);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50304g
    /* renamed from: a */
    public final void mo85145a(DataCenter dataCenter) {
        if (dataCenter != null) {
            dataCenter.mo60189a("on_page_selected", (AbstractC1214u<C33942b>) this);
            dataCenter.mo60189a("on_page_unselected", (AbstractC1214u<C33942b>) this);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.ew$b */
    static final class View$OnClickListenerC50299b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C50297ew f116134a;

        static {
            Covode.recordClassIndex(59425);
        }

        View$OnClickListenerC50299b(C50297ew ewVar) {
            this.f116134a = ewVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            View view2 = this.f116134a.f116132l;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            if (this.f116134a.f116150a != null) {
                C33744d dVar = new C33744d();
                Aweme aweme = this.f116134a.f116150a;
                C89219l.m154716b(aweme, "");
                C39162r.m79460a("tns_banner_dismiss_ktf", dVar.mo59983a("object_id", aweme.getAid()).f79943a);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50304g
    /* renamed from: a */
    public final void mo85144a(View view) {
        ViewGroup.LayoutParams layoutParams;
        TuxIconView tuxIconView;
        MethodCollector.m26663i(3896);
        if (view instanceof FrameLayout) {
            this.f116133n = view;
            Context context = this.f116156g;
            if (context != null) {
                View a = C1870c.m6045a((Activity) context, (int) R.layout.tn);
                this.f116132l = a;
                FrameLayout.LayoutParams layoutParams2 = null;
                if (a != null) {
                    layoutParams = a.getLayoutParams();
                } else {
                    layoutParams = null;
                }
                if (layoutParams instanceof FrameLayout.LayoutParams) {
                    layoutParams2 = layoutParams;
                }
                FrameLayout.LayoutParams layoutParams3 = layoutParams2;
                if (layoutParams3 != null) {
                    layoutParams3.setMargins(layoutParams3.leftMargin, layoutParams3.topMargin - C34723i.m70927b(), layoutParams3.rightMargin, layoutParams3.bottomMargin);
                }
                View view2 = this.f116132l;
                if (!(view2 == null || (tuxIconView = (TuxIconView) view2.findViewById(R.id.a24)) == null)) {
                    tuxIconView.setOnClickListener(new View$OnClickListenerC50299b(this));
                }
                View view3 = this.f116132l;
                if (view3 != null) {
                    view3.setVisibility(8);
                }
                ((FrameLayout) view).addView(this.f116132l);
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.app.Activity");
                MethodCollector.m26664o(3896);
                throw nullPointerException;
            }
        }
        MethodCollector.m26664o(3896);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(C33942b bVar) {
        C0692e eVar;
        TuxTextView tuxTextView;
        View view;
        C33942b bVar2 = bVar;
        if (bVar2 != null && this.f116150a != null) {
            String str = bVar2.f80277a;
            C89219l.m154716b(str, "");
            int hashCode = str.hashCode();
            if (hashCode != -330388150) {
                if (hashCode != 350216171) {
                    if (hashCode == 1628582276 && str.equals("on_page_unselected") && (view = this.f116132l) != null) {
                        view.setVisibility(8);
                    }
                } else if (str.equals("on_page_selected")) {
                    if (C50539g.m94746b(this.f116150a)) {
                        this.f116155f.mo60189a("action_video_on_play_progress_change", (AbstractC1214u<C33942b>) this);
                    }
                    Aweme aweme = this.f116150a;
                    C89219l.m154716b(aweme, "");
                    KtfInfo ktfInfo = aweme.getUploadMiscInfoStruct().ktfInfo;
                    if (ktfInfo != null) {
                        C89219l.m154716b(ktfInfo, "");
                        ktfInfo.resetState();
                    }
                }
            } else if (str.equals("action_video_on_play_progress_change") && (eVar = (C0692e) bVar2.mo60212a()) != null) {
                S s = eVar.f2751b;
                if (s == null) {
                    this.f116155f.mo60193b("action_video_on_play_progress_change", (AbstractC1214u<C33942b>) this);
                } else if (s.doubleValue() > 2.0d) {
                    View view2 = this.f116132l;
                    if ((view2 == null || view2.getVisibility() != 0) && this.f116150a != null) {
                        Aweme aweme2 = this.f116150a;
                        C89219l.m154716b(aweme2, "");
                        KtfInfo ktfInfo2 = aweme2.getUploadMiscInfoStruct().ktfInfo;
                        if (ktfInfo2 != null) {
                            C89219l.m154716b(ktfInfo2, "");
                            String cautionLabel = ktfInfo2.getCautionLabel();
                            String a = C1764a.m5928a(ktfInfo2.getWarningText(), Arrays.copyOf(new Object[]{cautionLabel}, 1));
                            C89219l.m154716b(a, "");
                            int a2 = C89361p.m154888a((CharSequence) a, cautionLabel, 0, false, 6);
                            SpannableString spannableString = new SpannableString(a);
                            if (a2 >= 0) {
                                spannableString.setSpan(new StyleSpan(1), a2, cautionLabel.length(), 18);
                            }
                            View view3 = this.f116132l;
                            if (!(view3 == null || (tuxTextView = (TuxTextView) view3.findViewById(R.id.a25)) == null)) {
                                tuxTextView.setText(spannableString);
                            }
                            View view4 = this.f116132l;
                            if (view4 != null) {
                                view4.setVisibility(0);
                            }
                            C33744d dVar = new C33744d();
                            Aweme aweme3 = this.f116150a;
                            C89219l.m154716b(aweme3, "");
                            C39162r.m79460a("tns_banner_popout_ktf", dVar.mo59983a("object_id", aweme3.getAid()).mo59983a("enter_from", this.f116151b).f79943a);
                        }
                    }
                    this.f116155f.mo60193b("action_video_on_play_progress_change", (AbstractC1214u<C33942b>) this);
                }
            }
        }
    }
}
