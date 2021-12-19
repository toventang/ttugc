package com.p2082ss.android.ugc.aweme.report;

import android.app.Activity;
import android.content.Context;
import android.text.Layout;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.p1198d.C17191a;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38258v;
import com.p2082ss.android.ugc.aweme.commercialize.views.AdLightWebPageOpenUtils;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.helper.C49625h;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRiskModel;
import com.p2082ss.android.ugc.aweme.feed.model.MixFlowParam;
import com.p2082ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.p2082ss.android.ugc.aweme.mix.api.AbstractC59391e;
import com.p2082ss.android.ugc.aweme.mix.p3450e.C59538b;
import com.p2082ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.p2082ss.android.ugc.aweme.mix.services.MixFeedService;
import com.p2082ss.android.ugc.aweme.search.p3683a.C67338a;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.video.AbstractC80747i;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81002f;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.report.f */
public final class C67110f {

    /* renamed from: a */
    public static final C67110f f150508a = new C67110f();

    /* renamed from: com.ss.android.ugc.aweme.report.f$e */
    public static final class View$OnClickListenerC67115e implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC67115e f150524a = new View$OnClickListenerC67115e();

        static {
            Covode.recordClassIndex(78697);
        }

        View$OnClickListenerC67115e() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    private C67110f() {
    }

    static {
        Covode.recordClassIndex(78692);
    }

    /* renamed from: com.ss.android.ugc.aweme.report.f$a */
    public static final class View$OnClickListenerC67111a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C38258v f150509a;

        /* renamed from: b */
        final /* synthetic */ Aweme f150510b;

        /* renamed from: c */
        final /* synthetic */ Activity f150511c;

        /* renamed from: d */
        final /* synthetic */ ViewGroup f150512d;

        /* renamed from: e */
        final /* synthetic */ TuxTextView f150513e;

        static {
            Covode.recordClassIndex(78693);
        }

        public View$OnClickListenerC67111a(C38258v vVar, Aweme aweme, Activity activity, ViewGroup viewGroup, TuxTextView tuxTextView) {
            this.f150509a = vVar;
            this.f150510b = aweme;
            this.f150511c = activity;
            this.f150512d = viewGroup;
            this.f150513e = tuxTextView;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C18129a.m33746a("draw_ad", "otherclick", this.f150510b.getAwemeRawAd()).mo28900b("refer", "disclaimer").mo28897a("disclaimer_id", this.f150509a.getId()).mo28901b();
            AdLightWebPageOpenUtils.m78719a().mo59123a(this.f150511c, this.f150509a.getUrl());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.report.f$d */
    public static final class View$OnClickListenerC67114d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Aweme f150522a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f150523b;

        static {
            Covode.recordClassIndex(78696);
        }

        public View$OnClickListenerC67114d(Aweme aweme, ViewGroup viewGroup) {
            this.f150522a = aweme;
            this.f150523b = viewGroup;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C33744d a = new C33744d().mo59983a("group_id", this.f150522a.getAid());
            AwemeRiskModel awemeRiskModel = this.f150522a.getAwemeRiskModel();
            C89219l.m154716b(awemeRiskModel, "");
            C39162r.m79460a("info_bar_click", a.mo59983a("content", awemeRiskModel.getContent()).f79943a);
            Context context = this.f150523b.getContext();
            AwemeRiskModel awemeRiskModel2 = this.f150522a.getAwemeRiskModel();
            C89219l.m154716b(awemeRiskModel2, "");
            SmartRouter.buildRoute(context, awemeRiskModel2.getUrl()).open();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.report.f$c */
    static final class View$OnClickListenerC67113c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Aweme f150519a;

        /* renamed from: b */
        final /* synthetic */ String f150520b;

        /* renamed from: c */
        final /* synthetic */ ConstraintLayout f150521c;

        static {
            Covode.recordClassIndex(78695);
        }

        View$OnClickListenerC67113c(Aweme aweme, String str, ConstraintLayout constraintLayout) {
            this.f150519a = aweme;
            this.f150520b = str;
            this.f150521c = constraintLayout;
        }

        public final void onClick(View view) {
            String str;
            float f;
            float f2;
            String str2;
            String mixId;
            AbstractC81002f.AbstractC81006d h;
            AbstractC81002f.AbstractC81006d h2;
            String str3;
            MixFlowParam mixFlowParam;
            ClickAgent.onClick(view);
            if (view != null) {
                if (view.getContext() instanceof AbstractC59391e) {
                    Aweme aweme = this.f150519a;
                    if (aweme == null || (mixFlowParam = aweme.mixFlowParam) == null) {
                        str3 = null;
                    } else {
                        str3 = mixFlowParam.getFrom();
                    }
                    if (!C89219l.m154714a((Object) str3, (Object) "from_search_mix")) {
                        Context context = view.getContext();
                        Objects.requireNonNull(context, "null cannot be cast to non-null type com.ss.android.ugc.aweme.mix.api.IMixDetailHandleBottomDialog");
                        ((AbstractC59391e) context).mo97057a(this.f150519a);
                        return;
                    }
                }
                Context context2 = view.getContext();
                String str4 = "";
                C89219l.m154716b(context2, str4);
                C49812b a = FeedParamProvider.C49809a.m93270a(context2);
                C59538b bVar = new C59538b(a.getPlaylistSearchId(), Integer.valueOf(a.getIsFromVideo()), a.getSearchType(), 0, 8, null);
                IMixFeedService k = MixFeedService.m109435k();
                String str5 = this.f150520b;
                PlayListInfo playListInfo = this.f150519a.playlist_info;
                if (playListInfo == null || (str = playListInfo.getMixId()) == null) {
                    str = str4;
                }
                k.mo97321a(str5, str, this.f150519a.getGroupId(), this.f150519a.getAuthorUid(), "click_feed", bVar);
                AbstractC80747i O = C81079v.m140776O();
                C89219l.m154716b(O, str4);
                AbstractC81002f L = O.mo123918L();
                if (L == null || (h2 = L.mo124460h()) == null) {
                    f = 0.0f;
                } else {
                    f = (float) h2.mo124417d();
                }
                AbstractC80747i O2 = C81079v.m140776O();
                C89219l.m154716b(O2, str4);
                AbstractC81002f L2 = O2.mo123918L();
                if (L2 == null || (h = L2.mo124460h()) == null) {
                    f2 = 0.0f;
                } else {
                    f2 = (float) h.mo124418e();
                }
                float f3 = (f2 / f) * 100.0f;
                if (MixFeedService.m109435k().mo97333i() || MixFeedService.m109435k().mo97334j()) {
                    C49625h a2 = C49625h.m93072a();
                    C89219l.m154716b(a2, str4);
                    a2.f114189a = C81079v.m140776O();
                    C49625h a3 = C49625h.m93072a();
                    C89219l.m154716b(a3, str4);
                    AbstractC80747i O3 = C81079v.m140776O();
                    C89219l.m154716b(O3, str4);
                    AbstractC81002f L3 = O3.mo123918L();
                    C89219l.m154716b(L3, str4);
                    AbstractC81002f.AbstractC81006d h3 = L3.mo124460h();
                    C89219l.m154716b(h3, str4);
                    a3.f114191c = h3.mo124418e();
                    C49625h a4 = C49625h.m93072a();
                    C89219l.m154716b(a4, str4);
                    a4.f114190b = this.f150519a.getAid();
                }
                IMixFeedService k2 = MixFeedService.m109435k();
                Context context3 = this.f150521c.getContext();
                String aid = this.f150519a.getAid();
                Aweme aweme2 = this.f150519a;
                PlayListInfo playListInfo2 = aweme2.playlist_info;
                if (playListInfo2 == null || (str2 = playListInfo2.getMixId()) == null) {
                    str2 = str4;
                }
                k2.mo97314a(context3, aid, aweme2, "from_mix_detail_item", str2, "", "", bVar, Float.valueOf(f3), this.f150520b);
                IMixFeedService k3 = MixFeedService.m109435k();
                String str6 = this.f150520b;
                PlayListInfo playListInfo3 = this.f150519a.playlist_info;
                if (!(playListInfo3 == null || (mixId = playListInfo3.getMixId()) == null)) {
                    str4 = mixId;
                }
                IMixFeedService.C59922a.m109402a(k3, str6, str4, this.f150519a.getGroupId(), this.f150519a.getAuthorUid(), f2, (C59538b) null, 32);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.report.f$b */
    public static final class View$OnTouchListenerC67112b implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ SpannableStringBuilder f150514a;

        /* renamed from: b */
        final /* synthetic */ Aweme f150515b;

        /* renamed from: c */
        final /* synthetic */ Activity f150516c;

        /* renamed from: d */
        final /* synthetic */ ViewGroup f150517d;

        /* renamed from: e */
        final /* synthetic */ TuxTextView f150518e;

        static {
            Covode.recordClassIndex(78694);
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            Integer num;
            if (motionEvent != null) {
                num = Integer.valueOf(motionEvent.getAction());
            } else {
                num = null;
            }
            if ((view instanceof TextView) && num != null && (num.intValue() == 1 || num.intValue() == 0)) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                TextView textView = (TextView) view;
                float totalPaddingLeft = x - ((float) textView.getTotalPaddingLeft());
                float totalPaddingTop = y - ((float) textView.getTotalPaddingTop());
                float scrollX = totalPaddingLeft + ((float) textView.getScrollX());
                Layout layout = textView.getLayout();
                int lineForVertical = layout.getLineForVertical((int) (totalPaddingTop + ((float) textView.getScrollY())));
                int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, scrollX);
                Object[] spans = this.f150514a.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                C89219l.m154716b(spans, "");
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spans;
                if (scrollX > textView.getPaint().measureText(textView.getText().subSequence(layout.getLineStart(lineForVertical), layout.getLineEnd(lineForVertical)).toString()) || clickableSpanArr.length == 0) {
                    Selection.removeSelection(this.f150514a);
                } else {
                    if (num.intValue() == 1) {
                        clickableSpanArr[0].onClick(this.f150518e);
                    } else if (num.intValue() == 0) {
                        SpannableStringBuilder spannableStringBuilder = this.f150514a;
                        Selection.setSelection(spannableStringBuilder, spannableStringBuilder.getSpanStart(clickableSpanArr[0]), this.f150514a.getSpanEnd(clickableSpanArr[0]));
                    }
                    return true;
                }
            }
            return false;
        }

        public View$OnTouchListenerC67112b(SpannableStringBuilder spannableStringBuilder, Aweme aweme, Activity activity, ViewGroup viewGroup, TuxTextView tuxTextView) {
            this.f150514a = spannableStringBuilder;
            this.f150515b = aweme;
            this.f150516c = activity;
            this.f150517d = viewGroup;
            this.f150518e = tuxTextView;
        }
    }

    /* renamed from: a */
    public static final void m118769a(Aweme aweme, FrameLayout frameLayout, ConstraintLayout constraintLayout, String str) {
        String str2;
        String str3;
        C89219l.m154721d(frameLayout, "");
        C89219l.m154721d(constraintLayout, "");
        C89219l.m154721d(str, "");
        if (aweme != null && aweme.playlist_info != null) {
            StringBuilder append = new StringBuilder().append(frameLayout.getContext().getString(R.string.dpk)).append(" • ");
            PlayListInfo playListInfo = aweme.playlist_info;
            if (playListInfo == null || (str2 = playListInfo.getMixName()) == null) {
                str2 = "";
            }
            String sb = append.append(str2).toString();
            TextView textView = (TextView) constraintLayout.findViewById(R.id.f2w);
            SmartImageView smartImageView = (SmartImageView) constraintLayout.findViewById(R.id.bh1);
            ImageView imageView = (ImageView) constraintLayout.findViewById(R.id.ks);
            C17191a aVar = new C17191a.C17192a().mo27177a(sb).f40973a;
            C89219l.m154716b(textView, "");
            textView.setText(aVar);
            C89219l.m154716b(smartImageView, "");
            ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.C0547a aVar2 = (ConstraintLayout.C0547a) layoutParams;
            aVar2.height = C34728n.m70946a(16.0d);
            aVar2.width = C34728n.m70946a(16.0d);
            aVar2.topMargin = 0;
            smartImageView.setLayoutParams(aVar2);
            C20766v a = C20761r.m39056a(2131231770);
            a.f49092E = smartImageView;
            a.mo34186c();
            C89219l.m154716b(imageView, "");
            imageView.setVisibility(0);
            String str4 = null;
            if (constraintLayout.getContext() instanceof AbstractC59391e) {
                MixFlowParam mixFlowParam = aweme.mixFlowParam;
                if (mixFlowParam != null) {
                    str3 = mixFlowParam.getFrom();
                } else {
                    str3 = null;
                }
                if (!C89219l.m154714a((Object) str3, (Object) "from_search_mix")) {
                    if (C80471gb.m139482a()) {
                        imageView.setRotation(90.0f);
                    } else {
                        imageView.setRotation(270.0f);
                    }
                }
            }
            if (constraintLayout.getContext() instanceof AbstractC59391e) {
                MixFlowParam mixFlowParam2 = aweme.mixFlowParam;
                if (mixFlowParam2 != null) {
                    str4 = mixFlowParam2.getFrom();
                }
                if (C89219l.m154714a((Object) str4, (Object) "from_search_mix") && !C67338a.m119381a()) {
                    if (C80471gb.m139482a()) {
                        imageView.setRotation(180.0f);
                    } else {
                        imageView.setRotation(0.0f);
                    }
                }
            }
            constraintLayout.setOnClickListener(new View$OnClickListenerC67113c(aweme, str, constraintLayout));
        }
    }
}
