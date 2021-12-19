package com.p2082ss.android.ugc.gamora.recorder.p4304k;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import com.C1764a;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.C2560h;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.creativex.recorder.p940b.p941a.C14207x;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.ktx.C22228c;
import com.bytedance.tux.tooltip.EnumC23352h;
import com.bytedance.tux.tooltip.p1727a.p1729b.C23329a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p2306ah.C33449c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.scene.C67279a;
import com.p2082ss.android.ugc.aweme.setting.p3721i.C68109p;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C70623cz;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.C71812ep;
import com.p2082ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.duet.C70733x;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3827b.C71427b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.TimeSpeedModelExtension;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73964ar;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.ProgressSegmentView;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.RecordLayout;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d;
import com.p2082ss.android.ugc.aweme.widgetcompat.AnimationImageView;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import p4600h.C89378p;
import p4600h.C89386u;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.recorder.k.h */
public final class C83833h extends AbstractC22219j implements AbstractC83748b {

    /* renamed from: l */
    public static final C83834a f187101l = new C83834a((byte) 0);

    /* renamed from: A */
    private final AbstractC14177d f187102A;

    /* renamed from: B */
    private final C2560h<Long> f187103B;

    /* renamed from: C */
    private final C2560h<Boolean> f187104C;

    /* renamed from: D */
    private final C2560h<C89378p<List<TimeSpeedModelExtension>, Long>> f187105D;

    /* renamed from: E */
    private final C2560h<C89386u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> f187106E;

    /* renamed from: F */
    private final C2560h<Integer> f187107F;

    /* renamed from: G */
    private final C2560h<RetakeVideoContext> f187108G;

    /* renamed from: H */
    private final C2560h<C89378p<List<TimeSpeedModelExtension>, Long>> f187109H;

    /* renamed from: I */
    private final C2560h<C89386u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> f187110I;

    /* renamed from: J */
    private final C2560h<Boolean> f187111J;

    /* renamed from: K */
    private final C2560h<Boolean> f187112K;

    /* renamed from: L */
    private final C2560h<Boolean> f187113L;

    /* renamed from: M */
    private final C2560h<ScaleGestureDetector> f187114M;

    /* renamed from: N */
    private final C2560h<VideoRecordGestureLayout.AbstractC14312a> f187115N;

    /* renamed from: a */
    public ProgressSegmentView f187116a;

    /* renamed from: b */
    public TextView f187117b;

    /* renamed from: c */
    public View f187118c;

    /* renamed from: d */
    public RecordLayout f187119d;

    /* renamed from: e */
    public int f187120e = C71812ep.m126783a(40.0d, C63247i.f143610a);

    /* renamed from: f */
    Dialog f187121f;

    /* renamed from: g */
    public FrameLayout f187122g;

    /* renamed from: h */
    public final boolean f187123h;

    /* renamed from: i */
    final C21582f f187124i;

    /* renamed from: j */
    public final AbstractC14193m f187125j;

    /* renamed from: k */
    public final ShortVideoContext f187126k;

    /* renamed from: t */
    private C70623cz f187127t;

    /* renamed from: u */
    private View f187128u;

    /* renamed from: v */
    private ImageView f187129v;

    /* renamed from: w */
    private AnimationImageView f187130w;

    /* renamed from: x */
    private FrameLayout f187131x;

    /* renamed from: y */
    private ImageView f187132y;

    /* renamed from: z */
    private long f187133z;

    static {
        Covode.recordClassIndex(97723);
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83748b
    /* renamed from: a */
    public final String mo122984a() {
        return "RecordControlProgressScene";
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.h$a */
    public static final class C83834a {
        static {
            Covode.recordClassIndex(97724);
        }

        private C83834a() {
        }

        public /* synthetic */ C83834a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83748b
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ AbstractC22219j mo122989b() {
        return this;
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.h$u */
    static final class RunnableC83854u implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C83833h f187153a;

        static {
            Covode.recordClassIndex(97744);
        }

        RunnableC83854u(C83833h hVar) {
            this.f187153a = hVar;
        }

        public final void run() {
            C83833h.m144184c(this.f187153a).setVisibility(0);
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83748b
    /* renamed from: C */
    public final void mo122979C() {
        RecordLayout recordLayout = this.f187119d;
        if (recordLayout == null) {
            C89219l.m154710a("recordLayout");
        }
        recordLayout.mo116797a(1);
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83748b
    /* renamed from: D */
    public final void mo122980D() {
        RecordLayout recordLayout = this.f187119d;
        if (recordLayout == null) {
            C89219l.m154710a("recordLayout");
        }
        recordLayout.mo116801c();
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83748b
    /* renamed from: F */
    public final void mo122982F() {
        RecordLayout recordLayout = this.f187119d;
        if (recordLayout == null) {
            C89219l.m154710a("recordLayout");
        }
        recordLayout.mo116799b();
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83748b
    /* renamed from: G */
    public final void mo122983G() {
        RecordLayout recordLayout = this.f187119d;
        if (recordLayout == null) {
            C89219l.m154710a("recordLayout");
        }
        recordLayout.f166943y = true;
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: w */
    public final void mo36490w() {
        super.mo36490w();
        RecordLayout recordLayout = this.f187119d;
        if (recordLayout == null) {
            C89219l.m154710a("recordLayout");
        }
        recordLayout.mo116802d();
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83748b
    /* renamed from: E */
    public final void mo122981E() {
        if (this.f187122g != null) {
            FrameLayout frameLayout = this.f187122g;
            if (frameLayout == null) {
                C89219l.m154710a("colorSchemeLayout");
            }
            frameLayout.post(new RunnableC83854u(this));
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: y */
    public final void mo36492y() {
        super.mo36492y();
        Dialog dialog = this.f187121f;
        if (dialog != null && dialog.isShowing()) {
            Dialog dialog2 = this.f187121f;
            if (dialog2 == null) {
                C89219l.m154715b();
            }
            dialog2.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.h$s */
    public static final class C83852s extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ C83833h f187151a;

        static {
            Covode.recordClassIndex(97742);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C83852s(C83833h hVar) {
            this.f187151a = hVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            C89219l.m154721d(view, "");
            C83833h hVar = this.f187151a;
            C70005cr a = C70005cr.m123611a();
            C89219l.m154716b(a, "");
            a.f156490i = false;
            C70005cr a2 = C70005cr.m123611a();
            C89219l.m154716b(a2, "");
            a2.f156491j = true;
            if (!hVar.f187126k.f155817b.f155653i || hVar.f187126k.f155817b.mo109896h() >= hVar.f187126k.f155817b.mo109899k()) {
                if (hVar.f187126k.f155817b.f155653i) {
                    C71427b.m126146b(hVar.f187126k.f155817b.mo109891d().size());
                }
                if (hVar.f187126k.mo110018b()) {
                    ((AbstractC84089j) hVar.f187124i.mo35249a((Type) AbstractC84089j.class, (String) null)).mo128898F().mo109783a();
                }
                hVar.f187125j.mo22871a().mo116640a();
                hVar.f187125j.mo22885a("click go next");
                C84425b a3 = new C84425b().mo129406a("scene", "go_edit").mo129406a("shoot_way", hVar.f187126k.f155831p).mo129406a("creation_id", hVar.f187126k.f155830o).mo129406a("enter_from", hVar.f187126k.f155837v);
                C73964ar arVar = C73964ar.f166038a;
                C89219l.m154716b(arVar, "");
                C84425b a4 = a3.mo129404a("dalvikPss", arVar.f166040c);
                C73964ar arVar2 = C73964ar.f166038a;
                C89219l.m154716b(arVar2, "");
                C84425b a5 = a4.mo129404a("nativePss", arVar2.f166041d);
                C73964ar arVar3 = C73964ar.f166038a;
                C89219l.m154716b(arVar3, "");
                C84425b a6 = a5.mo129404a("otherPss", arVar3.f166043f);
                C73964ar arVar4 = C73964ar.f166038a;
                C89219l.m154716b(arVar4, "");
                C39162r.m79460a("av_memory_log", a6.mo129404a("totalPss", arVar4.f166042e).f188764a);
                C33449c.m68557a();
                return;
            }
            new C79459a(hVar.f52549m).mo123050a(R.string.bjf).mo123053a();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.h$n */
    static final class View$OnClickListenerC83847n implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C83833h f187146a;

        static {
            Covode.recordClassIndex(97737);
        }

        View$OnClickListenerC83847n(C83833h hVar) {
            this.f187146a = hVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f187146a.f187125j.mo22915v();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.h$p */
    static final class C83849p<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83833h f187148a;

        static {
            Covode.recordClassIndex(97739);
        }

        C83849p(C83833h hVar) {
            this.f187148a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            ScaleGestureDetector scaleGestureDetector = (ScaleGestureDetector) obj;
            if (scaleGestureDetector != null) {
                C83833h.m144182a(this.f187148a).setScaleGestureDetector(scaleGestureDetector);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.h$q */
    static final class C83850q<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83833h f187149a;

        static {
            Covode.recordClassIndex(97740);
        }

        C83850q(C83833h hVar) {
            this.f187149a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            VideoRecordGestureLayout.AbstractC14312a aVar = (VideoRecordGestureLayout.AbstractC14312a) obj;
            if (aVar != null) {
                C83833h.m144182a(this.f187149a).setOnGestureListener(aVar);
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ RecordLayout m144182a(C83833h hVar) {
        RecordLayout recordLayout = hVar.f187119d;
        if (recordLayout == null) {
            C89219l.m154710a("recordLayout");
        }
        return recordLayout;
    }

    /* renamed from: b */
    public static final /* synthetic */ View m144183b(C83833h hVar) {
        View view = hVar.f187118c;
        if (view == null) {
            C89219l.m154710a("nextGroupContainer");
        }
        return view;
    }

    /* renamed from: c */
    public static final /* synthetic */ FrameLayout m144184c(C83833h hVar) {
        FrameLayout frameLayout = hVar.f187122g;
        if (frameLayout == null) {
            C89219l.m154710a("colorSchemeLayout");
        }
        return frameLayout;
    }

    /* renamed from: d */
    public static final /* synthetic */ TextView m144185d(C83833h hVar) {
        TextView textView = hVar.f187117b;
        if (textView == null) {
            C89219l.m154710a("progressTextView");
        }
        return textView;
    }

    /* renamed from: e */
    public static final /* synthetic */ ProgressSegmentView m144186e(C83833h hVar) {
        ProgressSegmentView progressSegmentView = hVar.f187116a;
        if (progressSegmentView == null) {
            C89219l.m154710a("progressSegmentView");
        }
        return progressSegmentView;
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83748b
    /* renamed from: f */
    public final void mo122994f(int i) {
        TextView textView = this.f187117b;
        if (textView == null) {
            C89219l.m154710a("progressTextView");
        }
        textView.setVisibility(i);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.h$e */
    static final class C83838e<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83833h f187137a;

        static {
            Covode.recordClassIndex(97728);
        }

        C83838e(C83833h hVar) {
            this.f187137a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Boolean bool = (Boolean) obj;
            ProgressSegmentView e = C83833h.m144186e(this.f187137a);
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                i = 0;
            } else {
                i = 8;
            }
            e.setVisibility(i);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.h$h */
    static final class C83841h<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83833h f187140a;

        static {
            Covode.recordClassIndex(97731);
        }

        C83841h(C83833h hVar) {
            this.f187140a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Long l = (Long) obj;
            ProgressSegmentView e = C83833h.m144186e(this.f187140a);
            C89219l.m154716b(l, "");
            e.setMaxDuration(l.longValue());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.h$i */
    static final class C83842i<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83833h f187141a;

        static {
            Covode.recordClassIndex(97732);
        }

        C83842i(C83833h hVar) {
            this.f187141a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            ProgressSegmentView e = C83833h.m144186e(this.f187141a);
            C89219l.m154716b(bool, "");
            e.setNeedDrawAnchor(bool.booleanValue());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.h$j */
    static final class C83843j<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83833h f187142a;

        static {
            Covode.recordClassIndex(97733);
        }

        C83843j(C83833h hVar) {
            this.f187142a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            RetakeVideoContext retakeVideoContext = (RetakeVideoContext) obj;
            if (retakeVideoContext != null) {
                C83833h.m144186e(this.f187142a).mo116784a(retakeVideoContext);
                if (this.f187142a.f187123h) {
                    C83833h.m144185d(this.f187142a).setText("00:00");
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.h$t */
    static final class C83853t<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83833h f187152a;

        static {
            Covode.recordClassIndex(97743);
        }

        C83853t(C83833h hVar) {
            this.f187152a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (this.f187152a.f187126k.f155817b.mo109889b() && C70733x.m124961a()) {
                C83833h.m144182a(this.f187152a).setCanTouch(bool);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83748b
    /* renamed from: b */
    public final void mo122990b(boolean z) {
        ImageView imageView = this.f187129v;
        if (imageView == null) {
            C89219l.m154710a("goNextButton");
        }
        imageView.setSelected(z);
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83748b
    /* renamed from: d */
    public final void mo122992d(int i) {
        ImageView imageView = this.f187129v;
        if (imageView == null) {
            C89219l.m154710a("goNextButton");
        }
        imageView.setVisibility(i);
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83748b
    /* renamed from: e */
    public final void mo122993e(int i) {
        View view = this.f187128u;
        if (view == null) {
            C89219l.m154710a("deleteLast");
        }
        view.setVisibility(i);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.h$d */
    static final class C83837d<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83833h f187136a;

        static {
            Covode.recordClassIndex(97727);
        }

        C83837d(C83833h hVar) {
            this.f187136a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            ViewGroup.LayoutParams layoutParams = C83833h.m144186e(this.f187136a).getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Activity activity = this.f187136a.f52549m;
            if (activity == null) {
                C89219l.m154715b();
            }
            marginLayoutParams.topMargin = C70636dh.m124833c(activity) + this.f187136a.mo36486t().getResources().getDimensionPixelSize(R.dimen.rl);
            C83833h.m144186e(this.f187136a).setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.h$f */
    static final class C83839f<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83833h f187138a;

        static {
            Covode.recordClassIndex(97729);
        }

        C83839f(C83833h hVar) {
            this.f187138a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C89378p pVar = (C89378p) obj;
            if (pVar != null) {
                C83833h.m144186e(this.f187138a).mo116785a((List) pVar.getFirst(), ((Number) pVar.getSecond()).longValue());
                this.f187138a.mo128748a(((Number) pVar.getSecond()).longValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.h$g */
    static final class C83840g<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83833h f187139a;

        static {
            Covode.recordClassIndex(97730);
        }

        C83840g(C83833h hVar) {
            this.f187139a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C89386u uVar = (C89386u) obj;
            if (uVar != null) {
                C83833h.m144186e(this.f187139a).mo116786a((List) uVar.getFirst(), ((Number) uVar.getSecond()).longValue(), (TimeSpeedModelExtension) uVar.getThird());
                this.f187139a.mo128748a(((Number) uVar.getSecond()).longValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.h$k */
    static final class C83844k<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83833h f187143a;

        static {
            Covode.recordClassIndex(97734);
        }

        C83844k(C83833h hVar) {
            this.f187143a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C89378p pVar = (C89378p) obj;
            if (pVar != null) {
                C83833h.m144186e(this.f187143a).mo116789b((List) pVar.getFirst(), ((Number) pVar.getSecond()).longValue());
                this.f187143a.mo128748a(((Number) pVar.getSecond()).longValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.h$l */
    static final class C83845l<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83833h f187144a;

        static {
            Covode.recordClassIndex(97735);
        }

        C83845l(C83833h hVar) {
            this.f187144a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C89386u uVar = (C89386u) obj;
            if (uVar != null) {
                C83833h.m144186e(this.f187144a);
                uVar.getFirst();
                ((Number) uVar.getSecond()).longValue();
                uVar.getThird();
                ProgressSegmentView.m130582b();
                this.f187144a.mo128748a(((Number) uVar.getSecond()).longValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.h$m */
    static final class C83846m<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83833h f187145a;

        static {
            Covode.recordClassIndex(97736);
        }

        C83846m(C83833h hVar) {
            this.f187145a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            Integer num = (Integer) obj;
            if (num != null && num.intValue() == 2) {
                C83833h.m144186e(this.f187145a).mo116782a();
                return;
            }
            ProgressSegmentView e = C83833h.m144186e(this.f187145a);
            if (num != null && num.intValue() == 0) {
                z = true;
            } else {
                z = false;
            }
            e.mo116787a(z);
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83748b
    /* renamed from: a */
    public final void mo122985a(float f) {
        View view = this.f187128u;
        if (view == null) {
            C89219l.m154710a("deleteLast");
        }
        view.setAlpha(f);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.h$o */
    static final class C83848o<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83833h f187147a;

        static {
            Covode.recordClassIndex(97738);
        }

        C83848o(C83833h hVar) {
            this.f187147a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                i = C71812ep.m126783a(33.0d, C63247i.f143610a) + this.f187147a.f187120e;
            } else {
                i = this.f187147a.f187120e;
            }
            ViewGroup.LayoutParams layoutParams = C83833h.m144182a(this.f187147a).getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = i;
            C83833h.m144182a(this.f187147a).setLayoutParams(layoutParams2);
            ViewGroup.LayoutParams layoutParams3 = C83833h.m144183b(this.f187147a).getLayoutParams();
            Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
            layoutParams4.bottomMargin = i;
            C83833h.m144183b(this.f187147a).setLayoutParams(layoutParams4);
            ViewGroup.LayoutParams layoutParams5 = C83833h.m144184c(this.f187147a).getLayoutParams();
            Objects.requireNonNull(layoutParams5, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) layoutParams5;
            layoutParams6.bottomMargin = i;
            C83833h.m144184c(this.f187147a).setLayoutParams(layoutParams6);
            if (this.f187147a.f187123h) {
                ViewGroup.LayoutParams layoutParams7 = C83833h.m144185d(this.f187147a).getLayoutParams();
                Objects.requireNonNull(layoutParams7, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) layoutParams7;
                layoutParams8.bottomMargin = i + C71812ep.m126783a(100.0d, C63247i.f143610a) + C71812ep.m126783a(16.0d, C63247i.f143610a);
                C83833h.m144185d(this.f187147a).setLayoutParams(layoutParams8);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.h$r */
    static final class View$OnClickListenerC83851r implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C83833h f187150a;

        static {
            Covode.recordClassIndex(97741);
        }

        View$OnClickListenerC83851r(C83833h hVar) {
            this.f187150a = hVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C83833h hVar = this.f187150a;
            C89219l.m154716b(view, "");
            if (hVar.f187126k.mo110018b()) {
                Context context = view.getContext();
                C89219l.m154716b(context, "");
                if (C67279a.m119194a(context) != null) {
                    Context context2 = view.getContext();
                    C89219l.m154716b(context2, "");
                    Activity a = C67279a.m119194a(context2);
                    if (a == null) {
                        C89219l.m154715b();
                    }
                    ((C23329a) new C23329a(a).mo38041b(view).mo38034a(EnumC23352h.TOP)).mo38023e(R.string.fsn).mo38030a(InteractFirstFrameTimeOutDurationSetting.DEFAULT).mo38012d().mo38001a();
                    return;
                }
                return;
            }
            if (hVar.f187121f != null) {
                Dialog dialog = hVar.f187121f;
                if (dialog == null) {
                    C89219l.m154715b();
                }
                if (dialog.isShowing()) {
                    return;
                }
            }
            C17197a.C17200a aVar = new C17197a.C17200a(hVar.f52549m);
            aVar.f41071b = hVar.mo36486t().getResources().getString(R.string.b7c);
            aVar.mo27192a(hVar.mo36486t().getResources().getString(R.string.b7d), (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC83835b(hVar), false).mo27196b(hVar.mo36486t().getResources().getString(R.string.b7e), (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC83836c(hVar), false);
            hVar.f187121f = aVar.mo27193a().mo27184b();
        }
    }

    /* renamed from: a */
    public final void mo128748a(long j) {
        if (this.f187123h) {
            long j2 = j - this.f187133z;
            if (1 > j2 || 999 < j2 || j >= this.f187126k.f155817b.mo109899k()) {
                this.f187133z = j;
                int i = (int) (j / 1000);
                int i2 = i % 60;
                int i3 = (i - i2) / 60;
                TextView textView = this.f187117b;
                if (textView == null) {
                    C89219l.m154710a("progressTextView");
                }
                StringBuilder sb = new StringBuilder();
                String a = C1764a.m5929a(Locale.ENGLISH, "%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i3)}, 1));
                C89219l.m154716b(a, "");
                StringBuilder append = sb.append(a).append(":");
                String a2 = C1764a.m5929a(Locale.ENGLISH, "%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1));
                C89219l.m154716b(a2, "");
                textView.setText(append.append(a2).toString());
            }
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        View c = mo36475c(R.id.d_e);
        C89219l.m154716b(c, "");
        this.f187116a = (ProgressSegmentView) c;
        if (this.f187123h) {
            View c2 = mo36475c(R.id.f1l);
            C89219l.m154716b(c2, "");
            this.f187117b = (TextView) c2;
        }
        C2560h<Boolean> hVar = this.f187112K;
        if (hVar != null) {
            hVar.mo7036a(this, new C83837d(this));
        }
        this.f187105D.mo7036a(this, new C83839f(this));
        this.f187106E.mo7036a(this, new C83840g(this));
        this.f187103B.mo7036a(this, new C83841h(this));
        this.f187104C.mo7036a(this, new C83842i(this));
        this.f187108G.mo7036a(this, new C83843j(this));
        this.f187109H.mo7036a(this, new C83844k(this));
        this.f187110I.mo7036a(this, new C83845l(this));
        this.f187107F.mo7036a(this, new C83846m(this));
        this.f187111J.mo7036a(this, new C83838e(this));
        View c3 = mo36475c(R.id.der);
        C89219l.m154716b(c3, "");
        this.f187119d = (RecordLayout) c3;
        View c4 = mo36475c(R.id.a7z);
        C89219l.m154716b(c4, "");
        this.f187122g = (FrameLayout) c4;
        View c5 = mo36475c(R.id.a80);
        C89219l.m154716b(c5, "");
        this.f187130w = (AnimationImageView) c5;
        View c6 = mo36475c(R.id.a7x);
        C89219l.m154716b(c6, "");
        this.f187131x = (FrameLayout) c6;
        View c7 = mo36475c(R.id.a7y);
        C89219l.m154716b(c7, "");
        this.f187132y = (ImageView) c7;
        if (this.f187126k.f155778aL) {
            RecordLayout recordLayout = this.f187119d;
            if (recordLayout == null) {
                C89219l.m154710a("recordLayout");
            }
            recordLayout.mo116796a();
        }
        FrameLayout frameLayout = this.f187122g;
        if (frameLayout == null) {
            C89219l.m154710a("colorSchemeLayout");
        }
        frameLayout.bringToFront();
        View c8 = mo36475c(R.id.csb);
        C89219l.m154716b(c8, "");
        this.f187118c = c8;
        RecordLayout recordLayout2 = this.f187119d;
        if (recordLayout2 == null) {
            C89219l.m154710a("recordLayout");
        }
        recordLayout2.setActivity(this.f52549m);
        ActivityC0945e a = C22228c.m41828a(this);
        AbstractC14177d dVar = this.f187102A;
        AbstractC14193m mVar = this.f187125j;
        RecordLayout recordLayout3 = this.f187119d;
        if (recordLayout3 == null) {
            C89219l.m154710a("recordLayout");
        }
        this.f187127t = new C70623cz(a, dVar, mVar, recordLayout3, new View$OnClickListenerC83847n(this));
        C2560h<Boolean> hVar2 = this.f187113L;
        if (hVar2 != null) {
            hVar2.mo7036a(this, new C83848o(this));
        }
        C2560h<ScaleGestureDetector> hVar3 = this.f187114M;
        if (hVar3 != null) {
            hVar3.mo7036a(this, new C83849p(this));
        }
        C2560h<VideoRecordGestureLayout.AbstractC14312a> hVar4 = this.f187115N;
        if (hVar4 != null) {
            hVar4.mo7036a(this, new C83850q(this));
        }
        View c9 = mo36475c(R.id.buw);
        C89219l.m154716b(c9, "");
        this.f187128u = c9;
        View c10 = mo36475c(R.id.ye);
        C89219l.m154716b(c10, "");
        this.f187129v = (ImageView) c10;
        View view = this.f187128u;
        if (view == null) {
            C89219l.m154710a("deleteLast");
        }
        view.setOnClickListener(new View$OnClickListenerC83851r(this));
        ImageView imageView = this.f187129v;
        if (imageView == null) {
            C89219l.m154710a("goNextButton");
        }
        imageView.setOnClickListener(new C83852s(this));
        this.f187102A.mo22832t().mo6997a(this, new C83853t(this));
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83748b
    /* renamed from: a */
    public final void mo122987a(Animation animation) {
        C89219l.m154721d(animation, "");
        RecordLayout recordLayout = this.f187119d;
        if (recordLayout == null) {
            C89219l.m154710a("recordLayout");
        }
        C13628n.m24519a(recordLayout);
        RecordLayout recordLayout2 = this.f187119d;
        if (recordLayout2 == null) {
            C89219l.m154710a("recordLayout");
        }
        recordLayout2.startAnimation(animation);
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83748b
    /* renamed from: a */
    public final void mo122988a(boolean z) {
        RecordLayout recordLayout = this.f187119d;
        if (recordLayout == null) {
            C89219l.m154710a("recordLayout");
        }
        recordLayout.setEnabled(z);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.h$c */
    static final class DialogInterface$OnClickListenerC83836c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C83833h f187135a;

        static {
            Covode.recordClassIndex(97726);
        }

        DialogInterface$OnClickListenerC83836c(C83833h hVar) {
            this.f187135a = hVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            AbstractC1196i lifecycle = this.f187135a.getLifecycle();
            C89219l.m154716b(lifecycle, "");
            lifecycle.mo4011a();
            AbstractC1196i.EnumC1199b bVar = AbstractC1196i.EnumC1199b.DESTROYED;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.ata, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.h$b */
    static final class DialogInterface$OnClickListenerC83835b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C83833h f187134a;

        static {
            Covode.recordClassIndex(97725);
        }

        DialogInterface$OnClickListenerC83835b(C83833h hVar) {
            this.f187134a = hVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            AbstractC1196i lifecycle = this.f187134a.getLifecycle();
            C89219l.m154716b(lifecycle, "");
            if (lifecycle.mo4011a() != AbstractC1196i.EnumC1199b.DESTROYED) {
                C84425b a = new C84425b().mo129406a("creation_id", this.f187134a.f187126k.f155830o).mo129406a("shoot_way", this.f187134a.f187126k.f155831p);
                if (this.f187134a.f187126k.f155740A != 0) {
                    a.mo129403a("draft_id", this.f187134a.f187126k.f155740A);
                }
                String str = this.f187134a.f187126k.f155741B;
                C89219l.m154716b(str, "");
                if (str.length() > 0) {
                    a.mo129406a("new_draft_id", this.f187134a.f187126k.f155741B);
                }
                if (this.f187134a.f187126k.f155817b.f155653i) {
                    a.mo129406a("action_type", "reshoot");
                }
                C39162r.m79460a("delete_clip", a.f188764a);
                this.f187134a.f187125j.mo22892c((AbstractC14193m) new C14207x("delete last fragment"));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83748b
    /* renamed from: a */
    public final void mo122986a(int i, boolean z) {
        RecordLayout recordLayout = this.f187119d;
        if (recordLayout == null) {
            C89219l.m154710a("recordLayout");
        }
        recordLayout.mo116798a(i, z);
    }

    public C83833h(AbstractC14177d dVar, C21582f fVar, AbstractC14193m mVar, ShortVideoContext shortVideoContext, C2560h<Long> hVar, C2560h<Boolean> hVar2, C2560h<C89378p<List<TimeSpeedModelExtension>, Long>> hVar3, C2560h<C89386u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> hVar4, C2560h<Integer> hVar5, C2560h<RetakeVideoContext> hVar6, C2560h<C89378p<List<TimeSpeedModelExtension>, Long>> hVar7, C2560h<C89386u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> hVar8, C2560h<Boolean> hVar9, C2560h<Boolean> hVar10, C2560h<Boolean> hVar11, C2560h<ScaleGestureDetector> hVar12, C2560h<VideoRecordGestureLayout.AbstractC14312a> hVar13) {
        boolean z;
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(shortVideoContext, "");
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(hVar2, "");
        C89219l.m154721d(hVar3, "");
        C89219l.m154721d(hVar4, "");
        C89219l.m154721d(hVar5, "");
        C89219l.m154721d(hVar6, "");
        C89219l.m154721d(hVar7, "");
        C89219l.m154721d(hVar8, "");
        C89219l.m154721d(hVar9, "");
        this.f187102A = dVar;
        this.f187124i = fVar;
        this.f187125j = mVar;
        this.f187126k = shortVideoContext;
        this.f187103B = hVar;
        this.f187104C = hVar2;
        this.f187105D = hVar3;
        this.f187106E = hVar4;
        this.f187107F = hVar5;
        this.f187108G = hVar6;
        this.f187109H = hVar7;
        this.f187110I = hVar8;
        this.f187111J = hVar9;
        this.f187112K = hVar10;
        this.f187113L = hVar11;
        this.f187114M = hVar12;
        this.f187115N = hVar13;
        if (C68109p.m120400a() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f187123h = z;
    }
}
