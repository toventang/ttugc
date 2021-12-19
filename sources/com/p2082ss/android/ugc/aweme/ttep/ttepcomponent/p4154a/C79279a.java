package com.p2082ss.android.ugc.aweme.ttep.ttepcomponent.p4154a;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import com.C1764a;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.C2560h;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.creativex.recorder.p940b.p941a.C14207x;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.ktx.C22228c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.C71812ep;
import com.p2082ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.duet.C70733x;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.TimeSpeedModelExtension;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.ProgressSegmentView;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.RecordLayout;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d;
import com.p2082ss.android.ugc.aweme.widgetcompat.AnimationImageView;
import com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83748b;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89386u;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ttep.ttepcomponent.a.a */
public final class C79279a extends AbstractC22219j implements AbstractC83748b {

    /* renamed from: i */
    public static final C79280a f178100i = new C79280a((byte) 0);

    /* renamed from: A */
    private final C2560h<C89378p<List<TimeSpeedModelExtension>, Long>> f178101A;

    /* renamed from: B */
    private final C2560h<C89386u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> f178102B;

    /* renamed from: C */
    private final C2560h<Integer> f178103C;

    /* renamed from: D */
    private final C2560h<RetakeVideoContext> f178104D;

    /* renamed from: E */
    private final C2560h<C89378p<List<TimeSpeedModelExtension>, Long>> f178105E;

    /* renamed from: F */
    private final C2560h<C89386u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> f178106F;

    /* renamed from: G */
    private final C2560h<Boolean> f178107G;

    /* renamed from: H */
    private final C2560h<Boolean> f178108H;

    /* renamed from: I */
    private final C2560h<Boolean> f178109I;

    /* renamed from: J */
    private final C2560h<ScaleGestureDetector> f178110J;

    /* renamed from: K */
    private final C2560h<VideoRecordGestureLayout.AbstractC14312a> f178111K;

    /* renamed from: a */
    public ProgressSegmentView f178112a;

    /* renamed from: b */
    public View f178113b;

    /* renamed from: c */
    public RecordLayout f178114c;

    /* renamed from: d */
    public int f178115d = C71812ep.m126783a(40.0d, C63247i.f143610a);

    /* renamed from: e */
    Dialog f178116e;

    /* renamed from: f */
    public FrameLayout f178117f;

    /* renamed from: g */
    public final AbstractC14193m f178118g;

    /* renamed from: h */
    public final ShortVideoContext f178119h;

    /* renamed from: j */
    private C79304c f178120j;

    /* renamed from: k */
    private View f178121k;

    /* renamed from: l */
    private ImageView f178122l;

    /* renamed from: t */
    private AnimationImageView f178123t;

    /* renamed from: u */
    private FrameLayout f178124u;

    /* renamed from: v */
    private ImageView f178125v;

    /* renamed from: w */
    private final AbstractC89244h f178126w = C89250i.m154773a((AbstractC89171a) new C79302w(this));

    /* renamed from: x */
    private final AbstractC14177d f178127x;

    /* renamed from: y */
    private final C2560h<Long> f178128y;

    /* renamed from: z */
    private final C2560h<Boolean> f178129z;

    static {
        Covode.recordClassIndex(92469);
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83748b
    /* renamed from: a */
    public final String mo122984a() {
        return "TTEPRecordControlProgressScene";
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83748b
    /* renamed from: a */
    public final void mo122988a(boolean z) {
    }

    /* renamed from: d */
    public final String mo122991d() {
        return (String) this.f178126w.getValue();
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83748b
    /* renamed from: f */
    public final void mo122994f(int i) {
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ttepcomponent.a.a$a */
    public static final class C79280a {
        static {
            Covode.recordClassIndex(92470);
        }

        private C79280a() {
        }

        public /* synthetic */ C79280a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83748b
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ AbstractC22219j mo122989b() {
        return this;
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ttepcomponent.a.a$v */
    static final class RunnableC79301v implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C79279a f178150a;

        static {
            Covode.recordClassIndex(92491);
        }

        RunnableC79301v(C79279a aVar) {
            this.f178150a = aVar;
        }

        public final void run() {
            C79279a.m138074c(this.f178150a).setVisibility(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ttepcomponent.a.a$w */
    static final class C79302w extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C79279a f178151a;

        static {
            Covode.recordClassIndex(92492);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79302w(C79279a aVar) {
            super(0);
            this.f178151a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String c_ = this.f178151a.mo36476c_(R.string.q);
            C89219l.m154716b(c_, "");
            return c_;
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83748b
    /* renamed from: C */
    public final void mo122979C() {
        RecordLayout recordLayout = this.f178114c;
        if (recordLayout == null) {
            C89219l.m154710a("recordLayout");
        }
        recordLayout.mo116797a(1);
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83748b
    /* renamed from: D */
    public final void mo122980D() {
        RecordLayout recordLayout = this.f178114c;
        if (recordLayout == null) {
            C89219l.m154710a("recordLayout");
        }
        recordLayout.mo116801c();
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83748b
    /* renamed from: F */
    public final void mo122982F() {
        RecordLayout recordLayout = this.f178114c;
        if (recordLayout == null) {
            C89219l.m154710a("recordLayout");
        }
        recordLayout.mo116799b();
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83748b
    /* renamed from: G */
    public final void mo122983G() {
        RecordLayout recordLayout = this.f178114c;
        if (recordLayout == null) {
            C89219l.m154710a("recordLayout");
        }
        recordLayout.f166943y = true;
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: w */
    public final void mo36490w() {
        super.mo36490w();
        RecordLayout recordLayout = this.f178114c;
        if (recordLayout == null) {
            C89219l.m154710a("recordLayout");
        }
        recordLayout.mo116802d();
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ttepcomponent.a.a$n */
    static final class C79293n extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C79279a f178142a;

        static {
            Covode.recordClassIndex(92483);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79293n(C79279a aVar) {
            super(0);
            this.f178142a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            new C79459a(C22228c.m41828a(this.f178142a)).mo123052a(this.f178142a.mo122991d()).mo123053a();
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83748b
    /* renamed from: E */
    public final void mo122981E() {
        if (this.f178117f != null) {
            FrameLayout frameLayout = this.f178117f;
            if (frameLayout == null) {
                C89219l.m154710a("colorSchemeLayout");
            }
            frameLayout.post(new RunnableC79301v(this));
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: y */
    public final void mo36492y() {
        super.mo36492y();
        Dialog dialog = this.f178116e;
        if (dialog != null && dialog.isShowing()) {
            Dialog dialog2 = this.f178116e;
            if (dialog2 == null) {
                C89219l.m154715b();
            }
            dialog2.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ttepcomponent.a.a$t */
    public static final class C79299t extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ C79279a f178148a;

        static {
            Covode.recordClassIndex(92489);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C79299t(C79279a aVar) {
            this.f178148a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            C89219l.m154721d(view, "");
            new C79459a(C22228c.m41828a(this.f178148a)).mo123052a(this.f178148a.mo122991d()).mo123053a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ttepcomponent.a.a$e */
    static final class C79284e<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C79279a f178133a;

        static {
            Covode.recordClassIndex(92474);
        }

        C79284e(C79279a aVar) {
            this.f178133a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C79279a.m138075d(this.f178133a).setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ttepcomponent.a.a$j */
    static final class C79289j<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C79279a f178138a;

        static {
            Covode.recordClassIndex(92479);
        }

        C79289j(C79279a aVar) {
            this.f178138a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            RetakeVideoContext retakeVideoContext = (RetakeVideoContext) obj;
            if (retakeVideoContext != null) {
                C79279a.m138075d(this.f178138a).mo116784a(retakeVideoContext);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ttepcomponent.a.a$o */
    static final class View$OnClickListenerC79294o implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C79279a f178143a;

        static {
            Covode.recordClassIndex(92484);
        }

        View$OnClickListenerC79294o(C79279a aVar) {
            this.f178143a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC14193m mVar = this.f178143a.f178118g;
            if (mVar != null) {
                mVar.mo22915v();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ttepcomponent.a.a$q */
    static final class C79296q<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C79279a f178145a;

        static {
            Covode.recordClassIndex(92486);
        }

        C79296q(C79279a aVar) {
            this.f178145a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            ScaleGestureDetector scaleGestureDetector = (ScaleGestureDetector) obj;
            if (scaleGestureDetector != null) {
                C79279a.m138072a(this.f178145a).setScaleGestureDetector(scaleGestureDetector);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ttepcomponent.a.a$r */
    static final class C79297r<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C79279a f178146a;

        static {
            Covode.recordClassIndex(92487);
        }

        C79297r(C79279a aVar) {
            this.f178146a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            VideoRecordGestureLayout.AbstractC14312a aVar = (VideoRecordGestureLayout.AbstractC14312a) obj;
            if (aVar != null) {
                C79279a.m138072a(this.f178146a).setOnGestureListener(aVar);
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ RecordLayout m138072a(C79279a aVar) {
        RecordLayout recordLayout = aVar.f178114c;
        if (recordLayout == null) {
            C89219l.m154710a("recordLayout");
        }
        return recordLayout;
    }

    /* renamed from: b */
    public static final /* synthetic */ View m138073b(C79279a aVar) {
        View view = aVar.f178113b;
        if (view == null) {
            C89219l.m154710a("nextGroupContainer");
        }
        return view;
    }

    /* renamed from: c */
    public static final /* synthetic */ FrameLayout m138074c(C79279a aVar) {
        FrameLayout frameLayout = aVar.f178117f;
        if (frameLayout == null) {
            C89219l.m154710a("colorSchemeLayout");
        }
        return frameLayout;
    }

    /* renamed from: d */
    public static final /* synthetic */ ProgressSegmentView m138075d(C79279a aVar) {
        ProgressSegmentView progressSegmentView = aVar.f178112a;
        if (progressSegmentView == null) {
            C89219l.m154710a("progressSegmentView");
        }
        return progressSegmentView;
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83748b
    /* renamed from: e */
    public final void mo122993e(int i) {
        View view = this.f178121k;
        if (view == null) {
            C89219l.m154710a("deleteLast");
        }
        view.setVisibility(i);
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ttepcomponent.a.a$f */
    static final class C79285f<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C79279a f178134a;

        static {
            Covode.recordClassIndex(92475);
        }

        C79285f(C79279a aVar) {
            this.f178134a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C89378p pVar = (C89378p) obj;
            if (pVar != null) {
                C79279a.m138075d(this.f178134a).mo116785a((List) pVar.getFirst(), ((Number) pVar.getSecond()).longValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ttepcomponent.a.a$h */
    static final class C79287h<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C79279a f178136a;

        static {
            Covode.recordClassIndex(92477);
        }

        C79287h(C79279a aVar) {
            this.f178136a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Long l = (Long) obj;
            ProgressSegmentView d = C79279a.m138075d(this.f178136a);
            C89219l.m154716b(l, "");
            d.setMaxDuration(l.longValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ttepcomponent.a.a$i */
    static final class C79288i<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C79279a f178137a;

        static {
            Covode.recordClassIndex(92478);
        }

        C79288i(C79279a aVar) {
            this.f178137a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            ProgressSegmentView d = C79279a.m138075d(this.f178137a);
            C89219l.m154716b(bool, "");
            d.setNeedDrawAnchor(bool.booleanValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ttepcomponent.a.a$k */
    static final class C79290k<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C79279a f178139a;

        static {
            Covode.recordClassIndex(92480);
        }

        C79290k(C79279a aVar) {
            this.f178139a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C89378p pVar = (C89378p) obj;
            if (pVar != null) {
                C79279a.m138075d(this.f178139a).mo116789b((List) pVar.getFirst(), ((Number) pVar.getSecond()).longValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ttepcomponent.a.a$l */
    static final class C79291l<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C79279a f178140a;

        static {
            Covode.recordClassIndex(92481);
        }

        C79291l(C79279a aVar) {
            this.f178140a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C89386u uVar = (C89386u) obj;
            if (uVar != null) {
                C79279a.m138075d(this.f178140a);
                uVar.getFirst();
                ((Number) uVar.getSecond()).longValue();
                uVar.getThird();
                ProgressSegmentView.m130582b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ttepcomponent.a.a$u */
    static final class C79300u<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C79279a f178149a;

        static {
            Covode.recordClassIndex(92490);
        }

        C79300u(C79279a aVar) {
            this.f178149a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (this.f178149a.f178119h.f155817b.mo109889b() && C70733x.m124961a()) {
                C79279a.m138072a(this.f178149a).setCanTouch(bool);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83748b
    /* renamed from: a */
    public final void mo122985a(float f) {
        View view = this.f178121k;
        if (view == null) {
            C89219l.m154710a("deleteLast");
        }
        view.setAlpha(f);
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83748b
    /* renamed from: b */
    public final void mo122990b(boolean z) {
        ImageView imageView = this.f178122l;
        if (imageView == null) {
            C89219l.m154710a("goNextButton");
        }
        imageView.setSelected(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ttepcomponent.a.a$d */
    static final class C79283d<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C79279a f178132a;

        static {
            Covode.recordClassIndex(92473);
        }

        C79283d(C79279a aVar) {
            this.f178132a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            ViewGroup.LayoutParams layoutParams = C79279a.m138075d(this.f178132a).getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Activity activity = this.f178132a.f52549m;
            if (activity == null) {
                C89219l.m154715b();
            }
            marginLayoutParams.topMargin = C70636dh.m124833c(activity) + this.f178132a.mo36486t().getResources().getDimensionPixelSize(R.dimen.rl);
            C79279a.m138075d(this.f178132a).setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ttepcomponent.a.a$g */
    static final class C79286g<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C79279a f178135a;

        static {
            Covode.recordClassIndex(92476);
        }

        C79286g(C79279a aVar) {
            this.f178135a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C89386u uVar = (C89386u) obj;
            if (uVar != null) {
                C79279a.m138075d(this.f178135a).mo116786a((List) uVar.getFirst(), ((Number) uVar.getSecond()).longValue(), (TimeSpeedModelExtension) uVar.getThird());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ttepcomponent.a.a$m */
    static final class C79292m<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C79279a f178141a;

        static {
            Covode.recordClassIndex(92482);
        }

        C79292m(C79279a aVar) {
            this.f178141a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            Integer num = (Integer) obj;
            if (num != null && num.intValue() == 2) {
                C79279a.m138075d(this.f178141a).mo116782a();
                return;
            }
            ProgressSegmentView d = C79279a.m138075d(this.f178141a);
            if (num != null && num.intValue() == 0) {
                z = true;
            } else {
                z = false;
            }
            d.mo116787a(z);
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83748b
    /* renamed from: d */
    public final void mo122992d(int i) {
        ImageView imageView = this.f178122l;
        if (imageView == null) {
            C89219l.m154710a("goNextButton");
        }
        imageView.setVisibility(i);
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ttepcomponent.a.a$p */
    static final class C79295p<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C79279a f178144a;

        static {
            Covode.recordClassIndex(92485);
        }

        C79295p(C79279a aVar) {
            this.f178144a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                i = C71812ep.m126783a(33.0d, C63247i.f143610a) + this.f178144a.f178115d;
            } else {
                i = this.f178144a.f178115d;
            }
            ViewGroup.LayoutParams layoutParams = C79279a.m138072a(this.f178144a).getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = i;
            C79279a.m138072a(this.f178144a).setLayoutParams(layoutParams2);
            ViewGroup.LayoutParams layoutParams3 = C79279a.m138073b(this.f178144a).getLayoutParams();
            Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
            layoutParams4.bottomMargin = i;
            C79279a.m138073b(this.f178144a).setLayoutParams(layoutParams4);
            ViewGroup.LayoutParams layoutParams5 = C79279a.m138074c(this.f178144a).getLayoutParams();
            Objects.requireNonNull(layoutParams5, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) layoutParams5;
            layoutParams6.bottomMargin = i;
            C79279a.m138074c(this.f178144a).setLayoutParams(layoutParams6);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ttepcomponent.a.a$s */
    static final class View$OnClickListenerC79298s implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C79279a f178147a;

        static {
            Covode.recordClassIndex(92488);
        }

        View$OnClickListenerC79298s(C79279a aVar) {
            this.f178147a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C79279a aVar = this.f178147a;
            C89219l.m154716b(view, "");
            if (aVar.f178116e != null) {
                Dialog dialog = aVar.f178116e;
                if (dialog == null) {
                    C89219l.m154715b();
                }
                if (dialog.isShowing()) {
                    return;
                }
            }
            C17197a.C17200a aVar2 = new C17197a.C17200a(aVar.f52549m);
            aVar2.f41071b = aVar.mo36486t().getResources().getString(R.string.b7c);
            aVar2.mo27192a(aVar.mo36486t().getResources().getString(R.string.b7d), (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC79281b(aVar), false).mo27196b(aVar.mo36486t().getResources().getString(R.string.b7e), (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC79282c(aVar), false);
            aVar.f178116e = aVar2.mo27193a().mo27184b();
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83748b
    /* renamed from: a */
    public final void mo122987a(Animation animation) {
        C89219l.m154721d(animation, "");
        RecordLayout recordLayout = this.f178114c;
        if (recordLayout == null) {
            C89219l.m154710a("recordLayout");
        }
        C13628n.m24519a(recordLayout);
        RecordLayout recordLayout2 = this.f178114c;
        if (recordLayout2 == null) {
            C89219l.m154710a("recordLayout");
        }
        recordLayout2.startAnimation(animation);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        View c = mo36475c(R.id.d_e);
        C89219l.m154716b(c, "");
        this.f178112a = (ProgressSegmentView) c;
        C2560h<Boolean> hVar = this.f178108H;
        if (hVar != null) {
            hVar.mo7036a(this, new C79283d(this));
        }
        this.f178101A.mo7036a(this, new C79285f(this));
        this.f178102B.mo7036a(this, new C79286g(this));
        this.f178128y.mo7036a(this, new C79287h(this));
        this.f178129z.mo7036a(this, new C79288i(this));
        this.f178104D.mo7036a(this, new C79289j(this));
        this.f178105E.mo7036a(this, new C79290k(this));
        this.f178106F.mo7036a(this, new C79291l(this));
        this.f178103C.mo7036a(this, new C79292m(this));
        this.f178107G.mo7036a(this, new C79284e(this));
        View c2 = mo36475c(R.id.der);
        C89219l.m154716b(c2, "");
        RecordLayout recordLayout = (RecordLayout) c2;
        this.f178114c = recordLayout;
        if (recordLayout == null) {
            C89219l.m154710a("recordLayout");
        }
        recordLayout.setEnabled(false);
        View c3 = mo36475c(R.id.a7z);
        C89219l.m154716b(c3, "");
        this.f178117f = (FrameLayout) c3;
        View c4 = mo36475c(R.id.a80);
        C89219l.m154716b(c4, "");
        this.f178123t = (AnimationImageView) c4;
        View c5 = mo36475c(R.id.a7x);
        C89219l.m154716b(c5, "");
        this.f178124u = (FrameLayout) c5;
        View c6 = mo36475c(R.id.a7y);
        C89219l.m154716b(c6, "");
        this.f178125v = (ImageView) c6;
        if (this.f178119h.f155778aL) {
            RecordLayout recordLayout2 = this.f178114c;
            if (recordLayout2 == null) {
                C89219l.m154710a("recordLayout");
            }
            recordLayout2.mo116796a();
        }
        FrameLayout frameLayout = this.f178117f;
        if (frameLayout == null) {
            C89219l.m154710a("colorSchemeLayout");
        }
        frameLayout.bringToFront();
        View c7 = mo36475c(R.id.csb);
        C89219l.m154716b(c7, "");
        this.f178113b = c7;
        RecordLayout recordLayout3 = this.f178114c;
        if (recordLayout3 == null) {
            C89219l.m154710a("recordLayout");
        }
        recordLayout3.setActivity(this.f52549m);
        ActivityC0945e a = C22228c.m41828a(this);
        AbstractC14177d dVar = this.f178127x;
        AbstractC14193m mVar = this.f178118g;
        RecordLayout recordLayout4 = this.f178114c;
        if (recordLayout4 == null) {
            C89219l.m154710a("recordLayout");
        }
        this.f178120j = new C79304c(a, dVar, mVar, recordLayout4, new C79293n(this), new View$OnClickListenerC79294o(this));
        C2560h<Boolean> hVar2 = this.f178109I;
        if (hVar2 != null) {
            hVar2.mo7036a(this, new C79295p(this));
        }
        C2560h<ScaleGestureDetector> hVar3 = this.f178110J;
        if (hVar3 != null) {
            hVar3.mo7036a(this, new C79296q(this));
        }
        C2560h<VideoRecordGestureLayout.AbstractC14312a> hVar4 = this.f178111K;
        if (hVar4 != null) {
            hVar4.mo7036a(this, new C79297r(this));
        }
        View c8 = mo36475c(R.id.buw);
        C89219l.m154716b(c8, "");
        this.f178121k = c8;
        View c9 = mo36475c(R.id.ye);
        C89219l.m154716b(c9, "");
        this.f178122l = (ImageView) c9;
        View view = this.f178121k;
        if (view == null) {
            C89219l.m154710a("deleteLast");
        }
        view.setOnClickListener(new View$OnClickListenerC79298s(this));
        ImageView imageView = this.f178122l;
        if (imageView == null) {
            C89219l.m154710a("goNextButton");
        }
        imageView.setOnClickListener(new C79299t(this));
        this.f178127x.mo22832t().mo6997a(this, new C79300u(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ttepcomponent.a.a$c */
    static final class DialogInterface$OnClickListenerC79282c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C79279a f178131a;

        static {
            Covode.recordClassIndex(92472);
        }

        DialogInterface$OnClickListenerC79282c(C79279a aVar) {
            this.f178131a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            AbstractC1196i lifecycle = this.f178131a.getLifecycle();
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
        View findViewById = a.findViewById(R.id.d_e);
        C89219l.m154716b(findViewById, "");
        ((ProgressSegmentView) findViewById).setVisibility(8);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ttepcomponent.a.a$b */
    static final class DialogInterface$OnClickListenerC79281b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C79279a f178130a;

        static {
            Covode.recordClassIndex(92471);
        }

        DialogInterface$OnClickListenerC79281b(C79279a aVar) {
            this.f178130a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            AbstractC1196i lifecycle = this.f178130a.getLifecycle();
            C89219l.m154716b(lifecycle, "");
            if (lifecycle.mo4011a() != AbstractC1196i.EnumC1199b.DESTROYED) {
                C84425b a = new C84425b().mo129406a("creation_id", this.f178130a.f178119h.f155830o).mo129406a("shoot_way", this.f178130a.f178119h.f155831p);
                if (this.f178130a.f178119h.f155740A != 0) {
                    a.mo129403a("draft_id", this.f178130a.f178119h.f155740A);
                }
                String str = this.f178130a.f178119h.f155741B;
                C89219l.m154716b(str, "");
                if (str.length() > 0) {
                    a.mo129406a("new_draft_id", this.f178130a.f178119h.f155741B);
                }
                if (this.f178130a.f178119h.f155817b.f155653i) {
                    a.mo129406a("action_type", "reshoot");
                }
                C39162r.m79460a("delete_clip", a.f188764a);
                AbstractC14193m mVar = this.f178130a.f178118g;
                if (mVar != null) {
                    mVar.mo22892c((AbstractC14193m) new C14207x("delete last fragment"));
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83748b
    /* renamed from: a */
    public final void mo122986a(int i, boolean z) {
        RecordLayout recordLayout = this.f178114c;
        if (recordLayout == null) {
            C89219l.m154710a("recordLayout");
        }
        recordLayout.mo116798a(i, z);
    }

    public C79279a(AbstractC14177d dVar, AbstractC14193m mVar, ShortVideoContext shortVideoContext, C2560h<Long> hVar, C2560h<Boolean> hVar2, C2560h<C89378p<List<TimeSpeedModelExtension>, Long>> hVar3, C2560h<C89386u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> hVar4, C2560h<Integer> hVar5, C2560h<RetakeVideoContext> hVar6, C2560h<C89378p<List<TimeSpeedModelExtension>, Long>> hVar7, C2560h<C89386u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> hVar8, C2560h<Boolean> hVar9, C2560h<Boolean> hVar10, C2560h<Boolean> hVar11, C2560h<ScaleGestureDetector> hVar12, C2560h<VideoRecordGestureLayout.AbstractC14312a> hVar13) {
        C89219l.m154721d(dVar, "");
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
        this.f178127x = dVar;
        this.f178118g = mVar;
        this.f178119h = shortVideoContext;
        this.f178128y = hVar;
        this.f178129z = hVar2;
        this.f178101A = hVar3;
        this.f178102B = hVar4;
        this.f178103C = hVar5;
        this.f178104D = hVar6;
        this.f178105E = hVar7;
        this.f178106F = hVar8;
        this.f178107G = hVar9;
        this.f178108H = hVar10;
        this.f178109I = hVar11;
        this.f178110J = hVar12;
        this.f178111K = hVar13;
    }
}
