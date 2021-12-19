package com.p2082ss.android.ugc.aweme.ftc.p3036h;

import android.app.Activity;
import android.content.Context;
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
import com.bytedance.als.C2560h;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.creativex.recorder.p940b.p941a.C14207x;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.ktx.C22228c;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p2306ah.C33449c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.setting.p3721i.C68109p;
import com.p2082ss.android.ugc.aweme.shortvideo.C70623cz;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.C71812ep;
import com.p2082ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3827b.C71427b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.TimeSpeedModelExtension;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73964ar;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.ProgressSegmentView;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.RecordLayout;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d;
import com.p2082ss.android.ugc.aweme.widgetcompat.AnimationImageView;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p4600h.C89378p;
import p4600h.C89386u;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.h.d */
public final class C52592d extends AbstractC22219j {

    /* renamed from: t */
    public static final C52593a f121093t = new C52593a((byte) 0);

    /* renamed from: a */
    public ProgressSegmentView f121094a;

    /* renamed from: b */
    public TextView f121095b;

    /* renamed from: c */
    public View f121096c;

    /* renamed from: d */
    public RecordLayout f121097d;

    /* renamed from: e */
    View f121098e;

    /* renamed from: f */
    ImageView f121099f;

    /* renamed from: g */
    public int f121100g = C71812ep.m126783a(40.0d, C63247i.f143610a);

    /* renamed from: h */
    public AnimationImageView f121101h;

    /* renamed from: i */
    public FrameLayout f121102i;

    /* renamed from: j */
    public FrameLayout f121103j;

    /* renamed from: k */
    public final boolean f121104k;

    /* renamed from: l */
    public final C52591c f121105l;

    /* renamed from: u */
    private C70623cz f121106u;

    /* renamed from: v */
    private ImageView f121107v;

    /* renamed from: w */
    private long f121108w;

    static {
        Covode.recordClassIndex(61988);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.h.d$a */
    public static final class C52593a {
        static {
            Covode.recordClassIndex(61989);
        }

        private C52593a() {
        }

        public /* synthetic */ C52593a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.h.d$r */
    static final class RunnableC52612r implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C52592d f121127a;

        static {
            Covode.recordClassIndex(62008);
        }

        RunnableC52612r(C52592d dVar) {
            this.f121127a = dVar;
        }

        public final void run() {
            C52592d.m97505c(this.f121127a).setVisibility(0);
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: w */
    public final void mo36490w() {
        super.mo36490w();
        RecordLayout recordLayout = this.f121097d;
        if (recordLayout == null) {
            C89219l.m154710a("recordLayout");
        }
        recordLayout.mo116802d();
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.h.d$q */
    public static final class C52611q extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ C52592d f121126a;

        static {
            Covode.recordClassIndex(62007);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52611q(C52592d dVar) {
            this.f121126a = dVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            C89219l.m154721d(view, "");
            C52592d dVar = this.f121126a;
            if (!dVar.f121105l.mo88337b().f155817b.f155653i || dVar.f121105l.mo88337b().f155817b.mo109896h() >= dVar.f121105l.mo88337b().f155817b.mo109899k()) {
                if (dVar.f121105l.mo88337b().f155817b.f155653i) {
                    C71427b.m126146b(dVar.f121105l.mo88337b().f155817b.mo109891d().size());
                }
                dVar.f121105l.mo88336a().mo22871a().mo116640a();
                dVar.f121105l.mo88336a().mo22885a("ftc click go next");
                C84425b a = new C84425b().mo129406a("scene", "go_edit").mo129406a("shoot_way", dVar.f121105l.mo88337b().f155831p).mo129406a("creation_id", dVar.f121105l.mo88337b().f155830o).mo129406a("enter_from", dVar.f121105l.mo88337b().f155837v);
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
            new C79459a(dVar.f52549m).mo123050a(R.string.bjf).mo123053a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.h.d$l */
    static final class View$OnClickListenerC52606l implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C52592d f121121a;

        static {
            Covode.recordClassIndex(62002);
        }

        View$OnClickListenerC52606l(C52592d dVar) {
            this.f121121a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f121121a.f121105l.mo88336a().mo22915v();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.h.d$n */
    static final class C52608n<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52592d f121123a;

        static {
            Covode.recordClassIndex(62004);
        }

        C52608n(C52592d dVar) {
            this.f121123a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            ScaleGestureDetector scaleGestureDetector = (ScaleGestureDetector) obj;
            if (scaleGestureDetector != null) {
                C52592d.m97503a(this.f121123a).setScaleGestureDetector(scaleGestureDetector);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.h.d$o */
    static final class C52609o<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52592d f121124a;

        static {
            Covode.recordClassIndex(62005);
        }

        C52609o(C52592d dVar) {
            this.f121124a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            VideoRecordGestureLayout.AbstractC14312a aVar = (VideoRecordGestureLayout.AbstractC14312a) obj;
            if (aVar != null) {
                C52592d.m97503a(this.f121124a).setOnGestureListener(aVar);
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ RecordLayout m97503a(C52592d dVar) {
        RecordLayout recordLayout = dVar.f121097d;
        if (recordLayout == null) {
            C89219l.m154710a("recordLayout");
        }
        return recordLayout;
    }

    /* renamed from: b */
    public static final /* synthetic */ View m97504b(C52592d dVar) {
        View view = dVar.f121096c;
        if (view == null) {
            C89219l.m154710a("nextGroupContainer");
        }
        return view;
    }

    /* renamed from: c */
    public static final /* synthetic */ FrameLayout m97505c(C52592d dVar) {
        FrameLayout frameLayout = dVar.f121102i;
        if (frameLayout == null) {
            C89219l.m154710a("colorSchemeLayout");
        }
        return frameLayout;
    }

    /* renamed from: d */
    public static final /* synthetic */ TextView m97506d(C52592d dVar) {
        TextView textView = dVar.f121095b;
        if (textView == null) {
            C89219l.m154710a("progressTextView");
        }
        return textView;
    }

    /* renamed from: e */
    public static final /* synthetic */ ProgressSegmentView m97507e(C52592d dVar) {
        ProgressSegmentView progressSegmentView = dVar.f121094a;
        if (progressSegmentView == null) {
            C89219l.m154710a("progressSegmentView");
        }
        return progressSegmentView;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.h.d$f */
    static final class C52600f<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52592d f121115a;

        static {
            Covode.recordClassIndex(61996);
        }

        C52600f(C52592d dVar) {
            this.f121115a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Long l = (Long) obj;
            ProgressSegmentView e = C52592d.m97507e(this.f121115a);
            C89219l.m154716b(l, "");
            e.setMaxDuration(l.longValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.h.d$g */
    static final class C52601g<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52592d f121116a;

        static {
            Covode.recordClassIndex(61997);
        }

        C52601g(C52592d dVar) {
            this.f121116a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            RetakeVideoContext retakeVideoContext = (RetakeVideoContext) obj;
            if (retakeVideoContext != null) {
                C52592d.m97507e(this.f121116a).mo116784a(retakeVideoContext);
                if (this.f121116a.f121104k) {
                    C52592d.m97506d(this.f121116a).setText("00:00");
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.h.d$k */
    static final class C52605k<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52592d f121120a;

        static {
            Covode.recordClassIndex(62001);
        }

        C52605k(C52592d dVar) {
            this.f121120a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Boolean bool = (Boolean) obj;
            ProgressSegmentView e = C52592d.m97507e(this.f121120a);
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                i = 0;
            } else {
                i = 8;
            }
            e.setVisibility(i);
        }
    }

    public C52592d(C52591c cVar) {
        boolean z;
        C89219l.m154721d(cVar, "");
        this.f121105l = cVar;
        if (C68109p.m120400a() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f121104k = z;
    }

    /* renamed from: d */
    public final void mo88339d(int i) {
        TextView textView = this.f121095b;
        if (textView == null) {
            C89219l.m154710a("progressTextView");
        }
        textView.setVisibility(i);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.h.d$c */
    static final class C52597c<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52592d f121112a;

        static {
            Covode.recordClassIndex(61993);
        }

        C52597c(C52592d dVar) {
            this.f121112a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            ViewGroup.LayoutParams layoutParams = C52592d.m97507e(this.f121112a).getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Activity activity = this.f121112a.f52549m;
            if (activity == null) {
                C89219l.m154715b();
            }
            marginLayoutParams.topMargin = C70636dh.m124833c(activity) + this.f121112a.mo36486t().getResources().getDimensionPixelSize(R.dimen.rl);
            C52592d.m97507e(this.f121112a).setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.h.d$d */
    static final class C52598d<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52592d f121113a;

        static {
            Covode.recordClassIndex(61994);
        }

        C52598d(C52592d dVar) {
            this.f121113a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C89378p pVar = (C89378p) obj;
            if (pVar != null) {
                C52592d.m97507e(this.f121113a).mo116785a((List) pVar.getFirst(), ((Number) pVar.getSecond()).longValue());
                this.f121113a.mo88338a(((Number) pVar.getSecond()).longValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.h.d$e */
    static final class C52599e<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52592d f121114a;

        static {
            Covode.recordClassIndex(61995);
        }

        C52599e(C52592d dVar) {
            this.f121114a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C89386u uVar = (C89386u) obj;
            if (uVar != null) {
                C52592d.m97507e(this.f121114a).mo116786a((List) uVar.getFirst(), ((Number) uVar.getSecond()).longValue(), (TimeSpeedModelExtension) uVar.getThird());
                this.f121114a.mo88338a(((Number) uVar.getSecond()).longValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.h.d$h */
    static final class C52602h<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52592d f121117a;

        static {
            Covode.recordClassIndex(61998);
        }

        C52602h(C52592d dVar) {
            this.f121117a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C89378p pVar = (C89378p) obj;
            if (pVar != null) {
                C52592d.m97507e(this.f121117a).mo116789b((List) pVar.getFirst(), ((Number) pVar.getSecond()).longValue());
                this.f121117a.mo88338a(((Number) pVar.getSecond()).longValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.h.d$i */
    static final class C52603i<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52592d f121118a;

        static {
            Covode.recordClassIndex(61999);
        }

        C52603i(C52592d dVar) {
            this.f121118a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C89386u uVar = (C89386u) obj;
            if (uVar != null) {
                C52592d.m97507e(this.f121118a);
                uVar.getFirst();
                ((Number) uVar.getSecond()).longValue();
                uVar.getThird();
                ProgressSegmentView.m130582b();
                this.f121118a.mo88338a(((Number) uVar.getSecond()).longValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.h.d$j */
    static final class C52604j<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52592d f121119a;

        static {
            Covode.recordClassIndex(62000);
        }

        C52604j(C52592d dVar) {
            this.f121119a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            Integer num = (Integer) obj;
            if (num != null && num.intValue() == 2) {
                C52592d.m97507e(this.f121119a).mo116782a();
                return;
            }
            ProgressSegmentView e = C52592d.m97507e(this.f121119a);
            if (num != null && num.intValue() == 0) {
                z = true;
            } else {
                z = false;
            }
            e.mo116787a(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.h.d$b */
    static final class C52594b extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C52592d f121109a;

        static {
            Covode.recordClassIndex(61990);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52594b(C52592d dVar) {
            super(1);
            this.f121109a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            String string = this.f121109a.mo36486t().getResources().getString(R.string.ct1);
            C89219l.m154716b(string, "");
            bVar2.mo37419b(string, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.ftc.p3036h.C52592d.C52594b.C525951 */

                /* renamed from: a */
                final /* synthetic */ C52594b f121110a;

                static {
                    Covode.recordClassIndex(61991);
                }

                {
                    this.f121110a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    AbstractC1196i lifecycle = this.f121110a.f121109a.getLifecycle();
                    C89219l.m154716b(lifecycle, "");
                    lifecycle.mo4011a();
                    return C89391z.f203057a;
                }
            });
            String string2 = this.f121109a.mo36486t().getResources().getString(R.string.ct0);
            C89219l.m154716b(string2, "");
            bVar2.mo37421c(string2, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.ftc.p3036h.C52592d.C52594b.C525962 */

                /* renamed from: a */
                final /* synthetic */ C52594b f121111a;

                static {
                    Covode.recordClassIndex(61992);
                }

                {
                    this.f121111a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    AbstractC1196i lifecycle = this.f121111a.f121109a.getLifecycle();
                    C89219l.m154716b(lifecycle, "");
                    if (lifecycle.mo4011a() != AbstractC1196i.EnumC1199b.DESTROYED) {
                        C84425b a = new C84425b().mo129406a("creation_id", this.f121111a.f121109a.f121105l.mo88337b().f155830o).mo129406a("shoot_way", this.f121111a.f121109a.f121105l.mo88337b().f155831p).mo129403a("draft_id", this.f121111a.f121109a.f121105l.mo88337b().f155740A);
                        if (this.f121111a.f121109a.f121105l.mo88337b().f155817b.f155653i) {
                            a.mo129406a("action_type", "reshoot");
                        }
                        C39162r.m79460a("delete_clip", a.f188764a);
                        this.f121111a.f121109a.f121105l.mo88336a().mo22892c((AbstractC14193m) new C14207x("delete last fragment"));
                    }
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.h.d$p */
    static final class View$OnClickListenerC52610p implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C52592d f121125a;

        static {
            Covode.recordClassIndex(62006);
        }

        View$OnClickListenerC52610p(C52592d dVar) {
            this.f121125a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C52592d dVar = this.f121125a;
            C89219l.m154716b(view, "");
            Context r = dVar.mo36484r();
            if (r == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(r, "");
            C23028c.m43435a(new C23023b(r).mo37413d(dVar.mo36486t().getResources().getString(R.string.b7c)), new C52594b(dVar)).mo37405a().mo37396b().show();
        }
    }

    /* renamed from: a */
    public final void mo88338a(long j) {
        if (this.f121104k) {
            long j2 = j - this.f121108w;
            if (1 > j2 || 999 < j2 || j >= this.f121105l.mo88337b().f155817b.mo109899k()) {
                this.f121108w = j;
                int i = (int) (j / 1000);
                int i2 = i % 60;
                int i3 = (i - i2) / 60;
                TextView textView = this.f121095b;
                if (textView == null) {
                    C89219l.m154710a("progressTextView");
                }
                StringBuilder sb = new StringBuilder();
                String a = C1764a.m5928a("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i3)}, 1));
                C89219l.m154716b(a, "");
                StringBuilder append = sb.append(a).append(":");
                String a2 = C1764a.m5928a("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1));
                C89219l.m154716b(a2, "");
                textView.setText(append.append(a2).toString());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.h.d$m */
    static final class C52607m<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52592d f121122a;

        static {
            Covode.recordClassIndex(62003);
        }

        C52607m(C52592d dVar) {
            this.f121122a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                i = C71812ep.m126783a(33.0d, C63247i.f143610a) + this.f121122a.f121100g;
            } else {
                i = this.f121122a.f121100g;
            }
            ViewGroup.LayoutParams layoutParams = C52592d.m97503a(this.f121122a).getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = i;
            C52592d.m97503a(this.f121122a).setLayoutParams(layoutParams2);
            ViewGroup.LayoutParams layoutParams3 = C52592d.m97504b(this.f121122a).getLayoutParams();
            Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
            layoutParams4.bottomMargin = i;
            C52592d.m97504b(this.f121122a).setLayoutParams(layoutParams4);
            ViewGroup.LayoutParams layoutParams5 = C52592d.m97505c(this.f121122a).getLayoutParams();
            Objects.requireNonNull(layoutParams5, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) layoutParams5;
            layoutParams6.bottomMargin = i;
            C52592d.m97505c(this.f121122a).setLayoutParams(layoutParams6);
            if (this.f121122a.f121104k) {
                ViewGroup.LayoutParams layoutParams7 = C52592d.m97506d(this.f121122a).getLayoutParams();
                Objects.requireNonNull(layoutParams7, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) layoutParams7;
                layoutParams8.bottomMargin = i + C71812ep.m126783a(100.0d, C63247i.f143610a) + C71812ep.m126783a(16.0d, C63247i.f143610a);
                C52592d.m97506d(this.f121122a).setLayoutParams(layoutParams8);
            }
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        View c = mo36475c(R.id.d_e);
        C89219l.m154716b(c, "");
        this.f121094a = (ProgressSegmentView) c;
        if (this.f121104k) {
            View c2 = mo36475c(R.id.f1l);
            C89219l.m154716b(c2, "");
            this.f121095b = (TextView) c2;
        }
        C2560h<Boolean> hVar = this.f121105l.f121089l;
        if (hVar != null) {
            hVar.mo7036a(this, new C52597c(this));
        }
        C2560h<C89378p<List<TimeSpeedModelExtension>, Long>> hVar2 = this.f121105l.f121082e;
        if (hVar2 == null) {
            C89219l.m154710a("progressClipAnchors");
        }
        hVar2.mo7036a(this, new C52598d(this));
        C2560h<C89386u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> hVar3 = this.f121105l.f121083f;
        if (hVar3 == null) {
            C89219l.m154710a("progressClipWithStitch");
        }
        hVar3.mo7036a(this, new C52599e(this));
        C2560h<Long> hVar4 = this.f121105l.f121081d;
        if (hVar4 == null) {
            C89219l.m154710a("progressMaxDuration");
        }
        hVar4.mo7036a(this, new C52600f(this));
        C2560h<RetakeVideoContext> hVar5 = this.f121105l.f121085h;
        if (hVar5 == null) {
            C89219l.m154710a("retakeVideoContext");
        }
        hVar5.mo7036a(this, new C52601g(this));
        C2560h<C89378p<List<TimeSpeedModelExtension>, Long>> hVar6 = this.f121105l.f121086i;
        if (hVar6 == null) {
            C89219l.m154710a("retakeProgressClipAnchors");
        }
        hVar6.mo7036a(this, new C52602h(this));
        C2560h<C89386u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> hVar7 = this.f121105l.f121087j;
        if (hVar7 == null) {
            C89219l.m154710a("retakeProgressClipWithStitch");
        }
        hVar7.mo7036a(this, new C52603i(this));
        C2560h<Integer> hVar8 = this.f121105l.f121084g;
        if (hVar8 == null) {
            C89219l.m154710a("retakeState");
        }
        hVar8.mo7036a(this, new C52604j(this));
        C2560h<Boolean> hVar9 = this.f121105l.f121088k;
        if (hVar9 == null) {
            C89219l.m154710a("progressSegmentVisible");
        }
        hVar9.mo7036a(this, new C52605k(this));
        View c3 = mo36475c(R.id.der);
        C89219l.m154716b(c3, "");
        this.f121097d = (RecordLayout) c3;
        View c4 = mo36475c(R.id.a7z);
        C89219l.m154716b(c4, "");
        this.f121102i = (FrameLayout) c4;
        View c5 = mo36475c(R.id.a80);
        C89219l.m154716b(c5, "");
        this.f121101h = (AnimationImageView) c5;
        View c6 = mo36475c(R.id.a7x);
        C89219l.m154716b(c6, "");
        this.f121103j = (FrameLayout) c6;
        View c7 = mo36475c(R.id.a7y);
        C89219l.m154716b(c7, "");
        this.f121107v = (ImageView) c7;
        if (this.f121105l.mo88337b().f155778aL) {
            RecordLayout recordLayout = this.f121097d;
            if (recordLayout == null) {
                C89219l.m154710a("recordLayout");
            }
            recordLayout.mo116796a();
        }
        FrameLayout frameLayout = this.f121102i;
        if (frameLayout == null) {
            C89219l.m154710a("colorSchemeLayout");
        }
        frameLayout.bringToFront();
        View c8 = mo36475c(R.id.csb);
        C89219l.m154716b(c8, "");
        this.f121096c = c8;
        RecordLayout recordLayout2 = this.f121097d;
        if (recordLayout2 == null) {
            C89219l.m154710a("recordLayout");
        }
        recordLayout2.setActivity(this.f52549m);
        ActivityC0945e a = C22228c.m41828a(this);
        AbstractC14177d dVar = this.f121105l.f121078a;
        if (dVar == null) {
            C89219l.m154710a("cameraApiComponent");
        }
        AbstractC14193m a2 = this.f121105l.mo88336a();
        RecordLayout recordLayout3 = this.f121097d;
        if (recordLayout3 == null) {
            C89219l.m154710a("recordLayout");
        }
        this.f121106u = new C70623cz(a, dVar, a2, recordLayout3, new View$OnClickListenerC52606l(this));
        C2560h<Boolean> hVar10 = this.f121105l.f121090m;
        if (hVar10 != null) {
            hVar10.mo7036a(this, new C52607m(this));
        }
        C2560h<ScaleGestureDetector> hVar11 = this.f121105l.f121091n;
        if (hVar11 != null) {
            hVar11.mo7036a(this, new C52608n(this));
        }
        C2560h<VideoRecordGestureLayout.AbstractC14312a> hVar12 = this.f121105l.f121092o;
        if (hVar12 != null) {
            hVar12.mo7036a(this, new C52609o(this));
        }
        View c9 = mo36475c(R.id.buw);
        C89219l.m154716b(c9, "");
        this.f121098e = c9;
        View c10 = mo36475c(R.id.ye);
        C89219l.m154716b(c10, "");
        this.f121099f = (ImageView) c10;
        View view = this.f121098e;
        if (view == null) {
            C89219l.m154710a("deleteLast");
        }
        view.setOnClickListener(new View$OnClickListenerC52610p(this));
        ImageView imageView = this.f121099f;
        if (imageView == null) {
            C89219l.m154710a("goNextButton");
        }
        imageView.setOnClickListener(new C52611q(this));
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.a31, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }
}
