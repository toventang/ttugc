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
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import com.C1764a;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.C2549d;
import com.bytedance.als.C2560h;
import com.bytedance.als.C2563k;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.creativex.recorder.p940b.p941a.C14207x;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.ktx.C22228c;
import com.bytedance.tux.tooltip.EnumC23352h;
import com.bytedance.tux.tooltip.p1727a.p1729b.C23329a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.p2306ah.C33449c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.scene.C67279a;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p2082ss.android.ugc.aweme.shortvideo.C69844av;
import com.p2082ss.android.ugc.aweme.shortvideo.C69887bk;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.C71812ep;
import com.p2082ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.duet.C70733x;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3827b.C71427b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.TimeSpeedModelExtension;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73964ar;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.CircleProgressSegmentView;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.ProgressSegmentView;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d;
import com.p2082ss.android.ugc.aweme.widgetcompat.AnimationImageView;
import com.p2082ss.android.ugc.gamora.recorder.p4301h.C83721c;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4600h.C89378p;
import p4600h.C89386u;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.recorder.k.f */
public final class C83782f extends AbstractC22219j {

    /* renamed from: z */
    public static final C83783a f186984z = new C83783a((byte) 0);

    /* renamed from: A */
    private C69887bk f186985A;

    /* renamed from: B */
    private AnimationImageView f186986B;

    /* renamed from: C */
    private FrameLayout f186987C;

    /* renamed from: D */
    private ImageView f186988D;

    /* renamed from: E */
    private final C83721c f186989E = new C83721c();

    /* renamed from: F */
    private final AbstractC14177d f186990F;

    /* renamed from: G */
    private final C2560h<Long> f186991G;

    /* renamed from: H */
    private final C2560h<Boolean> f186992H;

    /* renamed from: I */
    private final C2560h<C89378p<List<TimeSpeedModelExtension>, Long>> f186993I;

    /* renamed from: J */
    private final C2560h<C89386u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> f186994J;

    /* renamed from: K */
    private final C2560h<Integer> f186995K;

    /* renamed from: L */
    private final C2560h<RetakeVideoContext> f186996L;

    /* renamed from: M */
    private final C2560h<C89378p<List<TimeSpeedModelExtension>, Long>> f186997M;

    /* renamed from: N */
    private final C2560h<C89386u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> f186998N;

    /* renamed from: O */
    private final C2560h<Boolean> f186999O;

    /* renamed from: P */
    private final C2560h<Boolean> f187000P;

    /* renamed from: Q */
    private final C2560h<ScaleGestureDetector> f187001Q;

    /* renamed from: R */
    private final C2560h<VideoRecordGestureLayout.AbstractC14312a> f187002R;

    /* renamed from: S */
    private final C2560h<Long> f187003S;

    /* renamed from: T */
    private final C2549d<Integer> f187004T;

    /* renamed from: a */
    public ProgressSegmentView f187005a;

    /* renamed from: b */
    public TextView f187006b;

    /* renamed from: c */
    public View f187007c;

    /* renamed from: d */
    public LighteningRecordLayout f187008d;

    /* renamed from: e */
    View f187009e;

    /* renamed from: f */
    ImageView f187010f;

    /* renamed from: g */
    public ImageView f187011g;

    /* renamed from: h */
    public int f187012h = C71812ep.m126783a(40.0d, C63247i.f143610a);

    /* renamed from: i */
    final int f187013i = C71812ep.m126783a(80.0d, C63247i.f143610a);

    /* renamed from: j */
    final int f187014j = C71812ep.m126783a(36.0d, C63247i.f143610a);

    /* renamed from: k */
    final int f187015k = C71812ep.m126783a(28.0d, C63247i.f143610a);

    /* renamed from: l */
    Dialog f187016l;

    /* renamed from: t */
    public FrameLayout f187017t;

    /* renamed from: u */
    public boolean f187018u = true;

    /* renamed from: v */
    public final AbstractC14193m f187019v;

    /* renamed from: w */
    public final ShortVideoContext f187020w;

    /* renamed from: x */
    final C2560h<Boolean> f187021x;

    /* renamed from: y */
    public final C2563k<Boolean> f187022y;

    static {
        Covode.recordClassIndex(97672);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.f$a */
    public static final class C83783a {
        static {
            Covode.recordClassIndex(97673);
        }

        private C83783a() {
        }

        public /* synthetic */ C83783a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.f$z */
    static final class RunnableC83808z implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C83782f f187047a;

        static {
            Covode.recordClassIndex(97698);
        }

        RunnableC83808z(C83782f fVar) {
            this.f187047a = fVar;
        }

        public final void run() {
            C83782f.m144148c(this.f187047a).setVisibility(0);
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: w */
    public final void mo36490w() {
        super.mo36490w();
        LighteningRecordLayout lighteningRecordLayout = this.f187008d;
        if (lighteningRecordLayout == null) {
            C89219l.m154710a("recordLayout");
        }
        lighteningRecordLayout.mo116754e();
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.f$y */
    public static final class C83807y implements C69887bk.AbstractC69889a {

        /* renamed from: a */
        final /* synthetic */ C83782f f187046a;

        static {
            Covode.recordClassIndex(97697);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.C69887bk.AbstractC69889a
        /* renamed from: a */
        public final void mo110234a() {
            C83782f.m144150e(this.f187046a).setVisibility(8);
            C83782f.m144149d(this.f187046a).setVisibility(8);
            this.f187046a.f187018u = false;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.C69887bk.AbstractC69889a
        /* renamed from: b */
        public final void mo110235b() {
            ImageView imageView = this.f187046a.f187011g;
            if (imageView == null) {
                C89219l.m154710a("recordButtonIcon");
            }
            imageView.setVisibility(8);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C83807y(C83782f fVar) {
            this.f187046a = fVar;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: y */
    public final void mo36492y() {
        super.mo36492y();
        Dialog dialog = this.f187016l;
        if (dialog != null && dialog.isShowing()) {
            Dialog dialog2 = this.f187016l;
            if (dialog2 == null) {
                C89219l.m154715b();
            }
            dialog2.dismiss();
        }
    }

    /* renamed from: a */
    public final void mo128732a() {
        LighteningRecordLayout lighteningRecordLayout = this.f187008d;
        if (lighteningRecordLayout == null) {
            C89219l.m154710a("recordLayout");
        }
        lighteningRecordLayout.mo116755f();
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.f$q */
    public static final class C83799q implements LighteningRecordLayout.AbstractC74253b {

        /* renamed from: a */
        final /* synthetic */ C83782f f187038a;

        static {
            Covode.recordClassIndex(97689);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C83799q(C83782f fVar) {
            this.f187038a = fVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.AbstractC74253b
        /* renamed from: a */
        public final void mo116778a(float f) {
            ProgressSegmentView e = C83782f.m144150e(this.f187038a);
            if (!(e instanceof CircleProgressSegmentView)) {
                e = null;
            }
            CircleProgressSegmentView circleProgressSegmentView = (CircleProgressSegmentView) e;
            if (circleProgressSegmentView != null) {
                circleProgressSegmentView.setCircleRadius(f);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.f$v */
    public static final class C83804v extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ C83782f f187043a;

        static {
            Covode.recordClassIndex(97694);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C83804v(C83782f fVar) {
            this.f187043a = fVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            C89219l.m154721d(view, "");
            C83782f fVar = this.f187043a;
            if (!fVar.f187020w.f155817b.f155653i || fVar.f187020w.f155817b.mo109896h() >= fVar.f187020w.f155817b.mo109899k()) {
                if (fVar.f187020w.f155817b.f155653i) {
                    C71427b.m126146b(fVar.f187020w.f155817b.mo109891d().size());
                }
                fVar.f187019v.mo22871a().mo116640a();
                fVar.f187019v.mo22885a("click go next");
                C84425b a = new C84425b().mo129406a("scene", "go_edit").mo129406a("shoot_way", fVar.f187020w.f155831p).mo129406a("creation_id", fVar.f187020w.f155830o).mo129406a("enter_from", fVar.f187020w.f155837v);
                C73964ar arVar = C73964ar.f166038a;
                C89219l.m154716b(arVar, "");
                C84425b a2 = a.mo129404a("dalvikPss", arVar.f166040c);
                C73964ar arVar2 = C73964ar.f166038a;
                C89219l.m154716b(arVar2, "");
                C84425b a3 = a2.mo129404a("nativePss", arVar2.f166041d);
                C73964ar arVar3 = C73964ar.f166038a;
                C89219l.m154716b(arVar3, "");
                C84425b a4 = a3.mo129404a("otherPss", arVar3.f166043f);
                C73964ar arVar4 = C73964ar.f166038a;
                C89219l.m154716b(arVar4, "");
                C39162r.m79460a("av_memory_log", a4.mo129404a("totalPss", arVar4.f166042e).f188764a);
                C33449c.m68557a();
                return;
            }
            new C79459a(fVar.f52549m).mo123050a(R.string.bjf).mo123053a();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.f$l */
    static final class C83794l<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83782f f187033a;

        static {
            Covode.recordClassIndex(97684);
        }

        C83794l(C83782f fVar) {
            this.f187033a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            RetakeVideoContext retakeVideoContext = (RetakeVideoContext) obj;
            if (retakeVideoContext != null) {
                C83782f.m144150e(this.f187033a).mo116784a(retakeVideoContext);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.f$p */
    static final class View$OnClickListenerC83798p implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C83782f f187037a;

        static {
            Covode.recordClassIndex(97688);
        }

        View$OnClickListenerC83798p(C83782f fVar) {
            this.f187037a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f187037a.f187019v.mo22915v();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.f$s */
    static final class C83801s<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83782f f187040a;

        static {
            Covode.recordClassIndex(97691);
        }

        C83801s(C83782f fVar) {
            this.f187040a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            ScaleGestureDetector scaleGestureDetector = (ScaleGestureDetector) obj;
            if (scaleGestureDetector != null) {
                C83782f.m144146a(this.f187040a).setScaleGestureDetector(scaleGestureDetector);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.f$t */
    static final class C83802t<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83782f f187041a;

        static {
            Covode.recordClassIndex(97692);
        }

        C83802t(C83782f fVar) {
            this.f187041a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            VideoRecordGestureLayout.AbstractC14312a aVar = (VideoRecordGestureLayout.AbstractC14312a) obj;
            if (aVar != null) {
                C83782f.m144146a(this.f187041a).setOnGestureListener(aVar);
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ LighteningRecordLayout m144146a(C83782f fVar) {
        LighteningRecordLayout lighteningRecordLayout = fVar.f187008d;
        if (lighteningRecordLayout == null) {
            C89219l.m154710a("recordLayout");
        }
        return lighteningRecordLayout;
    }

    /* renamed from: b */
    public static final /* synthetic */ View m144147b(C83782f fVar) {
        View view = fVar.f187007c;
        if (view == null) {
            C89219l.m154710a("nextGroupContainer");
        }
        return view;
    }

    /* renamed from: c */
    public static final /* synthetic */ FrameLayout m144148c(C83782f fVar) {
        FrameLayout frameLayout = fVar.f187017t;
        if (frameLayout == null) {
            C89219l.m154710a("colorSchemeLayout");
        }
        return frameLayout;
    }

    /* renamed from: d */
    public static final /* synthetic */ TextView m144149d(C83782f fVar) {
        TextView textView = fVar.f187006b;
        if (textView == null) {
            C89219l.m154710a("progressTextView");
        }
        return textView;
    }

    /* renamed from: e */
    public static final /* synthetic */ ProgressSegmentView m144150e(C83782f fVar) {
        ProgressSegmentView progressSegmentView = fVar.f187005a;
        if (progressSegmentView == null) {
            C89219l.m154710a("progressSegmentView");
        }
        return progressSegmentView;
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.f$f */
    static final class C83788f<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83782f f187027a;

        static {
            Covode.recordClassIndex(97678);
        }

        C83788f(C83782f fVar) {
            this.f187027a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Long l = (Long) obj;
            C83782f fVar = this.f187027a;
            C89219l.m154716b(l, "");
            fVar.mo128734a(l.longValue());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.f$j */
    static final class C83792j<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83782f f187031a;

        static {
            Covode.recordClassIndex(97682);
        }

        C83792j(C83782f fVar) {
            this.f187031a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Long l = (Long) obj;
            ProgressSegmentView e = C83782f.m144150e(this.f187031a);
            C89219l.m154716b(l, "");
            e.setMaxDuration(l.longValue());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.f$k */
    static final class C83793k<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83782f f187032a;

        static {
            Covode.recordClassIndex(97683);
        }

        C83793k(C83782f fVar) {
            this.f187032a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            ProgressSegmentView e = C83782f.m144150e(this.f187032a);
            C89219l.m154716b(bool, "");
            e.setNeedDrawAnchor(bool.booleanValue());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.f$n */
    static final class C83796n<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83782f f187035a;

        static {
            Covode.recordClassIndex(97686);
        }

        C83796n(C83782f fVar) {
            this.f187035a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C89386u uVar = (C89386u) obj;
            if (uVar != null) {
                C83782f.m144150e(this.f187035a);
                uVar.getFirst();
                ((Number) uVar.getSecond()).longValue();
                uVar.getThird();
                ProgressSegmentView.m130582b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.f$w */
    static final class C83805w<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83782f f187044a;

        static {
            Covode.recordClassIndex(97695);
        }

        C83805w(C83782f fVar) {
            this.f187044a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (this.f187044a.f187020w.f155817b.mo109889b() && C70733x.m124961a()) {
                C83782f.m144146a(this.f187044a).setCanTouch(bool);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.f$x */
    static final class C83806x<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83782f f187045a;

        static {
            Covode.recordClassIndex(97696);
        }

        C83806x(C83782f fVar) {
            this.f187045a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C83782f.m144149d(this.f187045a).setTranslationY((float) ((Integer) obj).intValue());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.f$d */
    static final class C83786d<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83782f f187025a;

        static {
            Covode.recordClassIndex(97676);
        }

        C83786d(C83782f fVar) {
            this.f187025a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            ViewGroup.LayoutParams layoutParams = C83782f.m144150e(this.f187025a).getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Activity activity = this.f187025a.f52549m;
            if (activity == null) {
                C89219l.m154715b();
            }
            marginLayoutParams.topMargin = C70636dh.m124833c(activity) + this.f187025a.mo36486t().getResources().getDimensionPixelSize(R.dimen.rl);
            C83782f.m144150e(this.f187025a).setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.f$g */
    static final class C83789g<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83782f f187028a;

        static {
            Covode.recordClassIndex(97679);
        }

        C83789g(C83782f fVar) {
            this.f187028a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C83782f.m144146a(this.f187028a).setVisibility(0);
            C83782f.m144146a(this.f187028a).mo116752d();
            C83782f.m144146a(this.f187028a).setEnabled(true);
            C83782f.m144150e(this.f187028a).setVisibility(0);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.f$h */
    static final class C83790h<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83782f f187029a;

        static {
            Covode.recordClassIndex(97680);
        }

        C83790h(C83782f fVar) {
            this.f187029a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C89378p pVar = (C89378p) obj;
            if (pVar != null) {
                C83782f.m144150e(this.f187029a).mo116785a((List) pVar.getFirst(), ((Number) pVar.getSecond()).longValue());
                C83782f.m144146a(this.f187029a).setRecordingTime(((Number) pVar.getSecond()).longValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.f$i */
    static final class C83791i<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83782f f187030a;

        static {
            Covode.recordClassIndex(97681);
        }

        C83791i(C83782f fVar) {
            this.f187030a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C89386u uVar = (C89386u) obj;
            if (uVar != null) {
                C83782f.m144150e(this.f187030a).mo116786a((List) uVar.getFirst(), ((Number) uVar.getSecond()).longValue(), (TimeSpeedModelExtension) uVar.getThird());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.f$m */
    static final class C83795m<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83782f f187034a;

        static {
            Covode.recordClassIndex(97685);
        }

        C83795m(C83782f fVar) {
            this.f187034a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C89378p pVar = (C89378p) obj;
            if (pVar != null) {
                C83782f.m144150e(this.f187034a).mo116789b((List) pVar.getFirst(), ((Number) pVar.getSecond()).longValue());
                C83782f.m144146a(this.f187034a).setRecordingTime(((Number) pVar.getSecond()).longValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.f$o */
    static final class C83797o<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83782f f187036a;

        static {
            Covode.recordClassIndex(97687);
        }

        C83797o(C83782f fVar) {
            this.f187036a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            Integer num = (Integer) obj;
            if (num != null && num.intValue() == 2) {
                C83782f.m144150e(this.f187036a).mo116782a();
                return;
            }
            ProgressSegmentView e = C83782f.m144150e(this.f187036a);
            if (num != null && num.intValue() == 0) {
                z = true;
            } else {
                z = false;
            }
            e.mo116787a(z);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.f$e */
    static final class C83787e<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83782f f187026a;

        static {
            Covode.recordClassIndex(97677);
        }

        C83787e(C83782f fVar) {
            this.f187026a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            TimeSpeedModelExtension timeSpeedModelExtension;
            Boolean bool = (Boolean) obj;
            ProgressSegmentView e = C83782f.m144150e(this.f187026a);
            C89219l.m154716b(bool, "");
            int i2 = 0;
            if (bool.booleanValue()) {
                i = 0;
            } else {
                i = 8;
            }
            e.setVisibility(i);
            if (bool.booleanValue()) {
                if (this.f187026a.f187020w.mo110022c() && (timeSpeedModelExtension = this.f187026a.f187020w.f155743D.f155847b) != null) {
                    i2 = timeSpeedModelExtension.getDuration();
                }
                C83782f fVar = this.f187026a;
                fVar.mo128734a(fVar.f187020w.f155817b.mo109896h() + ((long) i2));
                return;
            }
            C83782f.m144149d(this.f187026a).setVisibility(8);
            if (!C89219l.m154714a((Object) this.f187026a.f187022y.mo6996a(), (Object) false)) {
                this.f187026a.f187022y.mo6999a((Boolean) false);
            }
        }
    }

    /* renamed from: a */
    public final void mo128733a(float f) {
        View view = this.f187009e;
        if (view == null) {
            C89219l.m154710a("deleteLast");
        }
        view.setAlpha(f);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.f$u */
    static final class View$OnClickListenerC83803u implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C83782f f187042a;

        static {
            Covode.recordClassIndex(97693);
        }

        View$OnClickListenerC83803u(C83782f fVar) {
            this.f187042a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C83782f fVar = this.f187042a;
            C89219l.m154716b(view, "");
            if (fVar.f187020w.mo110018b()) {
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
            if (fVar.f187016l != null) {
                Dialog dialog = fVar.f187016l;
                if (dialog == null) {
                    C89219l.m154715b();
                }
                if (dialog.isShowing()) {
                    return;
                }
            }
            C17197a.C17200a aVar = new C17197a.C17200a(fVar.f52549m);
            aVar.f41071b = fVar.mo36486t().getResources().getString(R.string.b7c);
            aVar.mo27192a(fVar.mo36486t().getResources().getString(R.string.b7d), (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC83784b(fVar), false).mo27196b(fVar.mo36486t().getResources().getString(R.string.b7e), (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC83785c(fVar), false);
            fVar.f187016l = aVar.mo27193a().mo27184b();
        }
    }

    /* renamed from: a */
    public final void mo128734a(long j) {
        if (j <= 0) {
            TextView textView = this.f187006b;
            if (textView == null) {
                C89219l.m154710a("progressTextView");
            }
            textView.setVisibility(8);
            if (!C89219l.m154714a((Object) this.f187022y.mo6996a(), (Object) false)) {
                this.f187022y.mo6999a((Boolean) false);
            }
            LighteningRecordLayout lighteningRecordLayout = this.f187008d;
            if (lighteningRecordLayout == null) {
                C89219l.m154710a("recordLayout");
            }
            lighteningRecordLayout.setShouldDrawBorder(true);
            return;
        }
        int i = (int) (j / 1000);
        int i2 = i % 60;
        int i3 = (i - i2) / 60;
        if (this.f187018u) {
            TextView textView2 = this.f187006b;
            if (textView2 == null) {
                C89219l.m154710a("progressTextView");
            }
            textView2.setVisibility(0);
            if (!C89219l.m154714a((Object) this.f187022y.mo6996a(), (Object) true)) {
                this.f187022y.mo6999a((Boolean) true);
            }
        }
        TextView textView3 = this.f187006b;
        if (textView3 == null) {
            C89219l.m154710a("progressTextView");
        }
        StringBuilder sb = new StringBuilder();
        String a = C1764a.m5928a("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i3)}, 1));
        C89219l.m154716b(a, "");
        StringBuilder append = sb.append(a).append(":");
        String a2 = C1764a.m5928a("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1));
        C89219l.m154716b(a2, "");
        textView3.setText(append.append(a2).toString());
        LighteningRecordLayout lighteningRecordLayout2 = this.f187008d;
        if (lighteningRecordLayout2 == null) {
            C89219l.m154710a("recordLayout");
        }
        lighteningRecordLayout2.setShouldDrawBorder(false);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.f$r */
    static final class C83800r<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83782f f187039a;

        static {
            Covode.recordClassIndex(97690);
        }

        C83800r(C83782f fVar) {
            this.f187039a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            T t;
            int a;
            int i2;
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                i = C71812ep.m126783a(33.0d, C63247i.f143610a) + this.f187039a.f187012h;
            } else {
                i = this.f187039a.f187012h;
            }
            ViewGroup.LayoutParams layoutParams = C83782f.m144146a(this.f187039a).getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = i;
            C83782f.m144146a(this.f187039a).setLayoutParams(layoutParams2);
            ViewGroup.LayoutParams layoutParams3 = C83782f.m144147b(this.f187039a).getLayoutParams();
            Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
            layoutParams4.bottomMargin = i;
            C83782f.m144147b(this.f187039a).setLayoutParams(layoutParams4);
            ViewGroup.LayoutParams layoutParams5 = C83782f.m144148c(this.f187039a).getLayoutParams();
            Objects.requireNonNull(layoutParams5, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) layoutParams5;
            layoutParams6.bottomMargin = i;
            C83782f.m144148c(this.f187039a).setLayoutParams(layoutParams6);
            C83782f fVar = this.f187039a;
            C2560h<Boolean> hVar = fVar.f187021x;
            if (hVar != null) {
                t = hVar.f7727a.getValue();
            } else {
                t = null;
            }
            if (C89219l.m154714a((Object) t, (Object) true)) {
                a = C71812ep.m126783a(33.0d, C63247i.f143610a) + C71812ep.m126783a(10.0d, C63247i.f143610a);
                i2 = fVar.f187012h;
            } else {
                a = C71812ep.m126783a(10.0d, C63247i.f143610a);
                i2 = fVar.f187012h;
            }
            int i3 = a + i2;
            ProgressSegmentView progressSegmentView = fVar.f187005a;
            if (progressSegmentView == null) {
                C89219l.m154710a("progressSegmentView");
            }
            ViewGroup.LayoutParams layoutParams7 = progressSegmentView.getLayoutParams();
            Objects.requireNonNull(layoutParams7, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) layoutParams7;
            if (!(i3 == layoutParams8.bottomMargin && layoutParams8.leftMargin == 0)) {
                layoutParams8.bottomMargin = i3;
                layoutParams8.leftMargin = 0;
                ProgressSegmentView progressSegmentView2 = fVar.f187005a;
                if (progressSegmentView2 == null) {
                    C89219l.m154710a("progressSegmentView");
                }
                progressSegmentView2.setLayoutParams(layoutParams8);
            }
            TextView textView = fVar.f187006b;
            if (textView == null) {
                C89219l.m154710a("progressTextView");
            }
            ViewGroup.LayoutParams layoutParams9 = textView.getLayoutParams();
            Objects.requireNonNull(layoutParams9, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) layoutParams9;
            int i4 = fVar.f187013i + i3 + fVar.f187015k;
            if (i4 != layoutParams10.bottomMargin) {
                layoutParams10.bottomMargin = i4;
                TextView textView2 = fVar.f187006b;
                if (textView2 == null) {
                    C89219l.m154710a("progressTextView");
                }
                textView2.setLayoutParams(layoutParams10);
            }
            ImageView imageView = fVar.f187011g;
            if (imageView == null) {
                C89219l.m154710a("recordButtonIcon");
            }
            ViewGroup.LayoutParams layoutParams11 = imageView.getLayoutParams();
            Objects.requireNonNull(layoutParams11, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) layoutParams11;
            int i5 = i3 + ((fVar.f187013i - fVar.f187014j) / 2);
            if (i5 != layoutParams12.bottomMargin) {
                layoutParams12.bottomMargin = i5;
                ImageView imageView2 = fVar.f187011g;
                if (imageView2 == null) {
                    C89219l.m154710a("recordButtonIcon");
                }
                imageView2.setLayoutParams(layoutParams12);
            }
        }
    }

    /* renamed from: a */
    public final void mo128735a(boolean z) {
        int i;
        ImageView imageView = this.f187011g;
        if (imageView == null) {
            C89219l.m154710a("recordButtonIcon");
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        AVChallenge aVChallenge;
        super.mo22704a(bundle);
        View c = mo36475c(R.id.a5g);
        C89219l.m154716b(c, "");
        this.f187005a = (ProgressSegmentView) c;
        View c2 = mo36475c(R.id.f1l);
        C89219l.m154716b(c2, "");
        this.f187006b = (TextView) c2;
        View c3 = mo36475c(R.id.der);
        C89219l.m154716b(c3, "");
        this.f187008d = (LighteningRecordLayout) c3;
        View c4 = mo36475c(R.id.dfx);
        C89219l.m154716b(c4, "");
        this.f187011g = (ImageView) c4;
        C2560h<Boolean> hVar = this.f187000P;
        if (hVar != null) {
            hVar.mo7036a(this, new C83786d(this));
        }
        this.f186993I.mo7036a(this, new C83790h(this));
        this.f186994J.mo7036a(this, new C83791i(this));
        this.f186991G.mo7036a(this, new C83792j(this));
        this.f186992H.mo7036a(this, new C83793k(this));
        this.f186996L.mo7036a(this, new C83794l(this));
        this.f186997M.mo7036a(this, new C83795m(this));
        this.f186998N.mo7036a(this, new C83796n(this));
        this.f186995K.mo7036a(this, new C83797o(this));
        this.f186999O.mo7036a(this, new C83787e(this));
        this.f187003S.mo7036a(this, new C83788f(this));
        this.f187019v.mo22904k().mo6997a(this, new C83789g(this));
        View c5 = mo36475c(R.id.a7z);
        C89219l.m154716b(c5, "");
        this.f187017t = (FrameLayout) c5;
        View c6 = mo36475c(R.id.a80);
        C89219l.m154716b(c6, "");
        this.f186986B = (AnimationImageView) c6;
        View c7 = mo36475c(R.id.a7x);
        C89219l.m154716b(c7, "");
        this.f186987C = (FrameLayout) c7;
        View c8 = mo36475c(R.id.a7y);
        C89219l.m154716b(c8, "");
        this.f186988D = (ImageView) c8;
        LighteningRecordLayout lighteningRecordLayout = this.f187008d;
        if (lighteningRecordLayout == null) {
            C89219l.m154710a("recordLayout");
        }
        FrameLayout frameLayout = this.f186987C;
        if (frameLayout == null) {
            C89219l.m154710a("colorSchemeBackground");
        }
        lighteningRecordLayout.setColorSchemeBackground(frameLayout);
        LighteningRecordLayout lighteningRecordLayout2 = this.f187008d;
        if (lighteningRecordLayout2 == null) {
            C89219l.m154710a("recordLayout");
        }
        ImageView imageView = this.f186988D;
        if (imageView == null) {
            C89219l.m154710a("colorSchemeIcon");
        }
        lighteningRecordLayout2.setColorSchemeIcon(imageView);
        if (this.f187020w.f155778aL) {
            LighteningRecordLayout lighteningRecordLayout3 = this.f187008d;
            if (lighteningRecordLayout3 == null) {
                C89219l.m154710a("recordLayout");
            }
            lighteningRecordLayout3.mo116747a();
        }
        FrameLayout frameLayout2 = this.f187017t;
        if (frameLayout2 == null) {
            C89219l.m154710a("colorSchemeLayout");
        }
        frameLayout2.bringToFront();
        View c9 = mo36475c(R.id.csb);
        C89219l.m154716b(c9, "");
        this.f187007c = c9;
        LighteningRecordLayout lighteningRecordLayout4 = this.f187008d;
        if (lighteningRecordLayout4 == null) {
            C89219l.m154710a("recordLayout");
        }
        lighteningRecordLayout4.setActivity(this.f52549m);
        ActivityC0945e a = C22228c.m41828a(this);
        AbstractC14177d dVar = this.f186990F;
        AbstractC14193m mVar = this.f187019v;
        LighteningRecordLayout lighteningRecordLayout5 = this.f187008d;
        if (lighteningRecordLayout5 == null) {
            C89219l.m154710a("recordLayout");
        }
        this.f186985A = new C69887bk(a, dVar, mVar, lighteningRecordLayout5, this.f187020w, new View$OnClickListenerC83798p(this));
        C2560h<Boolean> hVar2 = this.f187021x;
        if (hVar2 != null) {
            hVar2.mo7036a(this, new C83800r(this));
        }
        C2560h<ScaleGestureDetector> hVar3 = this.f187001Q;
        if (hVar3 != null) {
            hVar3.mo7036a(this, new C83801s(this));
        }
        C2560h<VideoRecordGestureLayout.AbstractC14312a> hVar4 = this.f187002R;
        if (hVar4 != null) {
            hVar4.mo7036a(this, new C83802t(this));
        }
        View c10 = mo36475c(R.id.buw);
        C89219l.m154716b(c10, "");
        this.f187009e = c10;
        View c11 = mo36475c(R.id.ye);
        C89219l.m154716b(c11, "");
        this.f187010f = (ImageView) c11;
        View view = this.f187009e;
        if (view == null) {
            C89219l.m154710a("deleteLast");
        }
        view.setOnClickListener(new View$OnClickListenerC83803u(this));
        ImageView imageView2 = this.f187010f;
        if (imageView2 == null) {
            C89219l.m154710a("goNextButton");
        }
        imageView2.setOnClickListener(new C83804v(this));
        this.f186990F.mo22832t().mo6997a(this, new C83805w(this));
        this.f187004T.mo7036a(this, new C83806x(this));
        C69887bk bkVar = this.f186985A;
        if (bkVar != null) {
            bkVar.f156160b = new C83807y(this);
        }
        LighteningRecordLayout lighteningRecordLayout6 = this.f187008d;
        if (lighteningRecordLayout6 == null) {
            C89219l.m154710a("recordLayout");
        }
        lighteningRecordLayout6.setRecordLayoutUIChangedListener(new C83799q(this));
        if (this.f187020w.mo110022c() || this.f187020w.f155817b.f155653i || (this.f187020w.mo110040p() && this.f187020w.f155763X != 15 && this.f187020w.f155763X != 2 && this.f187020w.f155817b.mo109896h() > 0)) {
            LighteningRecordLayout lighteningRecordLayout7 = this.f187008d;
            if (lighteningRecordLayout7 == null) {
                C89219l.m154710a("recordLayout");
            }
            lighteningRecordLayout7.mo116756g();
        }
        if (!this.f187020w.mo110039o() && !this.f187020w.f155817b.mo109889b() && !this.f187020w.f155817b.mo109890c() && !this.f187020w.mo110022c() && !this.f187020w.mo110033i()) {
            C69905c cVar = C70005cr.m123611a().f156482a;
            if (cVar == null || (aVChallenge = cVar.challenge) == null || !aVChallenge.isCommerce) {
                List<AVChallenge> a2 = C69844av.m123416a(this.f187020w.f155817b.mo109898j(), this.f187020w.f155752M);
                if (!a2.isEmpty()) {
                    Iterator<T> it = a2.iterator();
                    while (it.hasNext()) {
                        if (it.next().isCommerce) {
                            return;
                        }
                    }
                }
                if (C63253l.f143623a.mo73330z().mo93813a(this.f187020w.f155794ad.f155707c) == null && !C89219l.m154714a((Object) this.f187020w.f155831p, (Object) "tcm_upload")) {
                    IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
                    C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
                    if (!createIAVServiceProxybyMonsterPlugin.getStoryService().mo93868b()) {
                        IAVServiceProxy createIAVServiceProxybyMonsterPlugin2 = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
                        C89219l.m154716b(createIAVServiceProxybyMonsterPlugin2, "");
                        if (createIAVServiceProxybyMonsterPlugin2.getStoryService().mo93868b() || this.f186989E.f186869a.getBoolean("has_shown_story_lightening_guide", false) || C89070n.m154522b("click_intro", "click_fullscreen_intro", "click_story_label").contains(this.f187020w.f155838w)) {
                            return;
                        }
                    }
                    IAVServiceProxy createIAVServiceProxybyMonsterPlugin3 = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
                    C89219l.m154716b(createIAVServiceProxybyMonsterPlugin3, "");
                    createIAVServiceProxybyMonsterPlugin3.getStoryService().mo93865a(C22228c.m41828a(this));
                    this.f186989E.f186869a.storeBoolean("has_shown_story_lightening_guide", true);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.f$c */
    static final class DialogInterface$OnClickListenerC83785c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C83782f f187024a;

        static {
            Covode.recordClassIndex(97675);
        }

        DialogInterface$OnClickListenerC83785c(C83782f fVar) {
            this.f187024a = fVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            AbstractC1196i lifecycle = this.f187024a.getLifecycle();
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
        View a = C1764a.m5927a(layoutInflater, R.layout.at2, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.f$b */
    static final class DialogInterface$OnClickListenerC83784b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C83782f f187023a;

        static {
            Covode.recordClassIndex(97674);
        }

        DialogInterface$OnClickListenerC83784b(C83782f fVar) {
            this.f187023a = fVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            AbstractC1196i lifecycle = this.f187023a.getLifecycle();
            C89219l.m154716b(lifecycle, "");
            if (lifecycle.mo4011a() != AbstractC1196i.EnumC1199b.DESTROYED) {
                C84425b a = new C84425b().mo129406a("creation_id", this.f187023a.f187020w.f155830o).mo129406a("shoot_way", this.f187023a.f187020w.f155831p);
                if (this.f187023a.f187020w.f155740A != 0) {
                    a.mo129403a("draft_id", this.f187023a.f187020w.f155740A);
                }
                String str = this.f187023a.f187020w.f155741B;
                C89219l.m154716b(str, "");
                if (str.length() > 0) {
                    a.mo129406a("new_draft_id", this.f187023a.f187020w.f155741B);
                }
                if (this.f187023a.f187020w.f155817b.f155653i) {
                    a.mo129406a("action_type", "reshoot");
                }
                C39162r.m79460a("delete_clip", a.f188764a);
                this.f187023a.f187019v.mo22892c((AbstractC14193m) new C14207x("delete last fragment"));
            }
        }
    }

    public C83782f(AbstractC14177d dVar, AbstractC14193m mVar, ShortVideoContext shortVideoContext, C2560h<Long> hVar, C2560h<Boolean> hVar2, C2560h<C89378p<List<TimeSpeedModelExtension>, Long>> hVar3, C2560h<C89386u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> hVar4, C2560h<Integer> hVar5, C2560h<RetakeVideoContext> hVar6, C2560h<C89378p<List<TimeSpeedModelExtension>, Long>> hVar7, C2560h<C89386u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> hVar8, C2560h<Boolean> hVar9, C2560h<Boolean> hVar10, C2560h<Boolean> hVar11, C2560h<ScaleGestureDetector> hVar12, C2560h<VideoRecordGestureLayout.AbstractC14312a> hVar13, C2560h<Long> hVar14, C2563k<Boolean> kVar, C2549d<Integer> dVar2) {
        C89219l.m154721d(dVar, "");
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
        C89219l.m154721d(hVar14, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(dVar2, "");
        this.f186990F = dVar;
        this.f187019v = mVar;
        this.f187020w = shortVideoContext;
        this.f186991G = hVar;
        this.f186992H = hVar2;
        this.f186993I = hVar3;
        this.f186994J = hVar4;
        this.f186995K = hVar5;
        this.f186996L = hVar6;
        this.f186997M = hVar7;
        this.f186998N = hVar8;
        this.f186999O = hVar9;
        this.f187000P = hVar10;
        this.f187021x = hVar11;
        this.f187001Q = hVar12;
        this.f187002R = hVar13;
        this.f187003S = hVar14;
        this.f187022y = kVar;
        this.f187004T = dVar2;
    }
}
