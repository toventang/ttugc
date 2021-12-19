package com.p2082ss.android.ugc.aweme.ftc.countdown;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.cukaie.closet.C14401a;
import com.bytedance.ies.dmt.p1194ui.widget.DmtRadioButton;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20527q;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.group.AbstractC22186b;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.p1885j.AbstractC24453b;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.facebook.p1844d.AbstractC24157c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.framework.p3009d.C51429c;
import com.p2082ss.android.ugc.aweme.p3043g.animationInterpolatorC52819a;
import com.p2082ss.android.ugc.aweme.port.internal.IVideoRecordPreferences;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.VolumeTapsView;
import com.p2082ss.android.ugc.aweme.tools.C78099c;
import com.p2082ss.android.ugc.tools.p4340c.C84402a;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.trill.R;
import java.text.DecimalFormat;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.ftc.countdown.f */
public final class C52465f extends AbstractC22219j implements AbstractC20527q {

    /* renamed from: y */
    public static final C52466a f120831y = new C52466a((byte) 0);

    /* renamed from: A */
    private View f120832A;

    /* renamed from: a */
    public VolumeTapsView f120833a;

    /* renamed from: b */
    public AbstractC52498m f120834b;

    /* renamed from: c */
    public AbstractC52499n f120835c;

    /* renamed from: d */
    public TextView f120836d;

    /* renamed from: e */
    public TextView f120837e;

    /* renamed from: f */
    public TextView f120838f;

    /* renamed from: g */
    public TextView f120839g;

    /* renamed from: h */
    public final FTCCountdownViewModel f120840h;

    /* renamed from: i */
    public boolean f120841i;

    /* renamed from: j */
    public int f120842j;

    /* renamed from: k */
    public ViewGroup f120843k;

    /* renamed from: l */
    public TextView f120844l;

    /* renamed from: t */
    public RadioGroup f120845t;

    /* renamed from: u */
    public DmtRadioButton f120846u;

    /* renamed from: v */
    public DmtRadioButton f120847v;

    /* renamed from: w */
    public C51429c f120848w;

    /* renamed from: x */
    AbstractC52467b f120849x;

    /* renamed from: z */
    private SafeHandler f120850z;

    /* renamed from: com.ss.android.ugc.aweme.ftc.countdown.f$b */
    public interface AbstractC52467b {
        static {
            Covode.recordClassIndex(61863);
        }

        /* renamed from: a */
        void mo88257a(int i);
    }

    static {
        Covode.recordClassIndex(61861);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.countdown.f$a */
    public static final class C52466a {
        static {
            Covode.recordClassIndex(61862);
        }

        private C52466a() {
        }

        public /* synthetic */ C52466a(byte b) {
            this();
        }

        /* renamed from: a */
        public static String m97385a(float f) {
            String format = new DecimalFormat("0.0").format(Float.valueOf(f));
            C89219l.m154716b(format, "");
            return format;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20534v
    public final AbstractC1204m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20534v getLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
        return this;
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: y */
    public final void mo36492y() {
        super.mo36492y();
        C51429c cVar = this.f120848w;
        if (cVar != null) {
            cVar.mo86856c();
        }
    }

    /* renamed from: a */
    public final String mo88253a() {
        if (this.f120842j == 3) {
            return "3s";
        }
        return "10s";
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: n_ */
    public final void mo22713n_() {
        super.mo22713n_();
        AbstractC52498m mVar = this.f120834b;
        if (mVar != null) {
            mVar.mo88275a();
        }
        AbstractC52499n nVar = this.f120835c;
        if (nVar != null) {
            nVar.mo88273a();
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: w */
    public final void mo36490w() {
        super.mo36490w();
        ViewGroup viewGroup = this.f120843k;
        if (viewGroup == null) {
            C89219l.m154710a("countDownTitleView");
        }
        viewGroup.post(new RunnableC52468c(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.countdown.f$l */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC52482l implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ C52465f f120869a;

        /* renamed from: b */
        final /* synthetic */ View f120870b;

        /* renamed from: c */
        final /* synthetic */ View f120871c;

        static {
            Covode.recordClassIndex(61878);
        }

        public final void onGlobalLayout() {
            C52465f fVar = this.f120869a;
            fVar.withState(fVar.f120840h, new C52483a(this));
            View view = this.f120871c;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", (float) view.getMeasuredHeight(), 0.0f);
            ofFloat.setInterpolator(new animationInterpolatorC52819a());
            ofFloat.setDuration(490L);
            ofFloat.start();
        }

        /* renamed from: com.ss.android.ugc.aweme.ftc.countdown.f$l$a */
        static final class C52483a extends AbstractC89220m implements AbstractC89172b<FTCCountdownState, C89391z> {

            /* renamed from: a */
            final /* synthetic */ ViewTreeObserver$OnGlobalLayoutListenerC52482l f120872a;

            static {
                Covode.recordClassIndex(61879);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C52483a(ViewTreeObserver$OnGlobalLayoutListenerC52482l lVar) {
                super(1);
                this.f120872a = lVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(FTCCountdownState fTCCountdownState) {
                FTCCountdownState fTCCountdownState2 = fTCCountdownState;
                C89219l.m154721d(fTCCountdownState2, "");
                this.f120872a.f120869a.mo88254a((long) C52465f.m97373a(this.f120872a.f120869a).getStopPosition(), fTCCountdownState2.getStartTime(), fTCCountdownState2.getMaxDuration());
                this.f120872a.f120870b.getViewTreeObserver().removeOnGlobalLayoutListener(this.f120872a);
                AbstractC52498m mVar = this.f120872a.f120869a.f120834b;
                if (mVar == null) {
                    return null;
                }
                mVar.mo88277a(fTCCountdownState2.getMusicPath(), (int) (fTCCountdownState2.getStartTime() + fTCCountdownState2.getSdkRecordTime()), (int) (fTCCountdownState2.getStartTime() + fTCCountdownState2.getMaxDuration()));
                return C89391z.f203057a;
            }
        }

        ViewTreeObserver$OnGlobalLayoutListenerC52482l(C52465f fVar, View view, View view2) {
            this.f120869a = fVar;
            this.f120870b = view;
            this.f120871c = view2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ftc.countdown.f$m */
    public static final class RunnableC52484m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C52465f f120873a;

        /* renamed from: b */
        final /* synthetic */ int f120874b;

        static {
            Covode.recordClassIndex(61880);
        }

        RunnableC52484m(C52465f fVar, int i) {
            this.f120873a = fVar;
            this.f120874b = i;
        }

        public final /* synthetic */ void run() {
            if (this.f120873a.f120848w == null) {
                Activity activity = this.f120873a.f52549m;
                if (activity != null) {
                    C89219l.m154716b(activity, "");
                    this.f120873a.f120848w = new C51429c(activity);
                } else {
                    return;
                }
            }
            C51429c cVar = this.f120873a.f120848w;
            if (cVar != null) {
                C52465f fVar = this.f120873a;
                Object[] objArr = new Object[1];
                int i = 3;
                if (this.f120874b != 3) {
                    i = 10;
                }
                objArr[0] = Integer.valueOf(i);
                cVar.mo86853a(fVar.mo36472a(R.string.auj, objArr));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.countdown.f$c */
    static final class RunnableC52468c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C52465f f120851a;

        static {
            Covode.recordClassIndex(61864);
        }

        RunnableC52468c(C52465f fVar) {
            this.f120851a = fVar;
        }

        public final void run() {
            ViewGroup viewGroup = this.f120851a.f120843k;
            if (viewGroup == null) {
                C89219l.m154710a("countDownTitleView");
            }
            int measuredWidth = viewGroup.getMeasuredWidth();
            TextView textView = this.f120851a.f120844l;
            if (textView == null) {
                C89219l.m154710a("countDownTitleTextView");
            }
            int measuredWidth2 = textView.getMeasuredWidth();
            RadioGroup radioGroup = this.f120851a.f120845t;
            if (radioGroup == null) {
                C89219l.m154710a("countDownSwitchView");
            }
            if (((float) measuredWidth) < ((float) (measuredWidth2 + radioGroup.getMeasuredWidth())) + C13628n.m24520b(this.f120851a.f52549m, 8.0f)) {
                C52465f fVar = this.f120851a;
                DmtRadioButton dmtRadioButton = fVar.f120846u;
                if (dmtRadioButton == null) {
                    C89219l.m154710a("countDownShortView");
                }
                fVar.mo88255a(dmtRadioButton);
                C52465f fVar2 = this.f120851a;
                DmtRadioButton dmtRadioButton2 = fVar2.f120847v;
                if (dmtRadioButton2 == null) {
                    C89219l.m154710a("countDownLongView");
                }
                fVar2.mo88255a(dmtRadioButton2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ftc.countdown.f$n */
    public static final class RunnableC52485n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C52465f f120875a;

        /* renamed from: b */
        final /* synthetic */ long f120876b;

        /* renamed from: c */
        final /* synthetic */ long f120877c;

        /* renamed from: d */
        final /* synthetic */ long f120878d;

        static {
            Covode.recordClassIndex(61881);
        }

        RunnableC52485n(C52465f fVar, long j, long j2, long j3) {
            this.f120875a = fVar;
            this.f120876b = j;
            this.f120877c = j2;
            this.f120878d = j3;
        }

        public final void run() {
            C52465f fVar = this.f120875a;
            long j = this.f120876b;
            long j2 = this.f120877c;
            long j3 = this.f120878d;
            float f = ((float) (j - j2)) * 1.0f;
            VolumeTapsView volumeTapsView = fVar.f120833a;
            if (volumeTapsView == null) {
                C89219l.m154710a("volumeTapsView");
            }
            float max = Math.max(0.0f, (f * ((float) volumeTapsView.getMeasuredWidth())) / ((float) j3));
            C52465f.m97375c(this.f120875a).setText(C52466a.m97385a(((float) (this.f120876b - this.f120877c)) / 1000.0f) + 's');
            C52465f.m97375c(this.f120875a).setTranslationX((max / ((float) C52465f.m97373a(this.f120875a).getMeasuredWidth())) * ((float) (C52465f.m97373a(this.f120875a).getMeasuredWidth() - C52465f.m97375c(this.f120875a).getMeasuredWidth())));
            C52465f.m97374b(this.f120875a).setAlpha(this.f120875a.mo88252a(max));
            TextView textView = this.f120875a.f120836d;
            if (textView == null) {
                C89219l.m154710a("startTextView");
            }
            C52465f fVar2 = this.f120875a;
            textView.setAlpha(fVar2.mo88252a(((float) C52465f.m97373a(fVar2).getMeasuredWidth()) - max));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.countdown.f$d */
    static final class C52469d extends AbstractC89220m implements AbstractC89172b<FTCCountdownState, FTCCountdownState> {

        /* renamed from: a */
        public static final C52469d f120852a = new C52469d();

        static {
            Covode.recordClassIndex(61865);
        }

        C52469d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FTCCountdownState invoke(FTCCountdownState fTCCountdownState) {
            C89219l.m154721d(fTCCountdownState, "");
            return fTCCountdownState;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.countdown.f$j */
    public static final class C52478j implements VolumeTapsView.AbstractC74265a {

        /* renamed from: a */
        final /* synthetic */ C52465f f120862a;

        static {
            Covode.recordClassIndex(61874);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52478j(C52465f fVar) {
            this.f120862a = fVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.VolumeTapsView.AbstractC74265a
        /* renamed from: a */
        public final void mo88265a(int i) {
            C52465f fVar = this.f120862a;
            fVar.withState(fVar.f120840h, new C52479a(this, i));
        }

        /* renamed from: com.ss.android.ugc.aweme.ftc.countdown.f$j$a */
        static final class C52479a extends AbstractC89220m implements AbstractC89172b<FTCCountdownState, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C52478j f120863a;

            /* renamed from: b */
            final /* synthetic */ int f120864b;

            static {
                Covode.recordClassIndex(61875);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C52479a(C52478j jVar, int i) {
                super(1);
                this.f120863a = jVar;
                this.f120864b = i;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(FTCCountdownState fTCCountdownState) {
                FTCCountdownState fTCCountdownState2 = fTCCountdownState;
                C89219l.m154721d(fTCCountdownState2, "");
                this.f120863a.f120862a.mo88254a((long) this.f120864b, fTCCountdownState2.getStartTime(), fTCCountdownState2.getMaxDuration());
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ftc.countdown.f$j$b */
        static final class C52480b extends AbstractC89220m implements AbstractC89172b<FTCCountdownState, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C52478j f120865a;

            /* renamed from: b */
            final /* synthetic */ int f120866b;

            /* renamed from: c */
            final /* synthetic */ int f120867c;

            static {
                Covode.recordClassIndex(61876);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C52480b(C52478j jVar, int i, int i2) {
                super(1);
                this.f120865a = jVar;
                this.f120866b = i;
                this.f120867c = i2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(FTCCountdownState fTCCountdownState) {
                FTCCountdownState fTCCountdownState2 = fTCCountdownState;
                C89219l.m154721d(fTCCountdownState2, "");
                AbstractC52498m mVar = this.f120865a.f120862a.f120834b;
                if (mVar != null) {
                    mVar.mo88277a(fTCCountdownState2.getMusicPath(), this.f120866b, this.f120867c);
                }
                this.f120865a.f120862a.mo88254a((long) this.f120867c, fTCCountdownState2.getStartTime(), fTCCountdownState2.getMaxDuration());
                return C89391z.f203057a;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.VolumeTapsView.AbstractC74265a
        /* renamed from: a */
        public final void mo88266a(int i, int i2) {
            C52465f fVar = this.f120862a;
            fVar.withState(fVar.f120840h, new C52480b(this, i, i2));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.countdown.f$g */
    static final class View$OnClickListenerC52474g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C52465f f120858a;

        static {
            Covode.recordClassIndex(61870);
        }

        View$OnClickListenerC52474g(C52465f fVar) {
            this.f120858a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC52499n nVar = this.f120858a.f120835c;
            if (nVar != null) {
                nVar.mo88274b();
            }
        }
    }

    public C52465f(FTCCountdownState fTCCountdownState) {
        C89219l.m154721d(fTCCountdownState, "");
        this.f120840h = new FTCCountdownViewModel(fTCCountdownState);
    }

    /* renamed from: a */
    public static final /* synthetic */ VolumeTapsView m97373a(C52465f fVar) {
        VolumeTapsView volumeTapsView = fVar.f120833a;
        if (volumeTapsView == null) {
            C89219l.m154710a("volumeTapsView");
        }
        return volumeTapsView;
    }

    /* renamed from: b */
    public static final /* synthetic */ TextView m97374b(C52465f fVar) {
        TextView textView = fVar.f120837e;
        if (textView == null) {
            C89219l.m154710a("endTextView");
        }
        return textView;
    }

    /* renamed from: c */
    public static final /* synthetic */ TextView m97375c(C52465f fVar) {
        TextView textView = fVar.f120838f;
        if (textView == null) {
            C89219l.m154710a("anchorTextView");
        }
        return textView;
    }

    /* renamed from: a */
    public final float mo88252a(float f) {
        VolumeTapsView volumeTapsView = this.f120833a;
        if (volumeTapsView == null) {
            C89219l.m154710a("volumeTapsView");
        }
        float measuredWidth = ((float) volumeTapsView.getMeasuredWidth()) - f;
        TextView textView = this.f120837e;
        if (textView == null) {
            C89219l.m154710a("endTextView");
        }
        return Math.min(1.0f, (measuredWidth - ((float) textView.getMeasuredWidth())) / 100.0f);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.countdown.f$f */
    static final class View$OnClickListenerC52471f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C52465f f120854a;

        static {
            Covode.recordClassIndex(61867);
        }

        View$OnClickListenerC52471f(C52465f fVar) {
            this.f120854a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Activity activity = this.f120854a.f52549m;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            AbstractC1174ac a = C1181ae.m3881a((ActivityC0945e) activity, (C1175ad.AbstractC1177b) null).mo3983a(ShortVideoContextViewModel.class);
            C89219l.m154716b(a, "");
            ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a).f155842a;
            C39162r.m79460a("count_down_start", new C84425b().mo129406a("creation_id", shortVideoContext.f155830o).mo129406a("shoot_way", shortVideoContext.f155831p).mo129403a("draft_id", shortVideoContext.f155740A).mo129406a("countdown_type", this.f120854a.mo88253a()).f188764a);
            if (this.f120854a.f120834b != null) {
                C52465f fVar = this.f120854a;
                fVar.withState(fVar.f120840h, new AbstractC89172b<FTCCountdownState, Boolean>(this) {
                    /* class com.p2082ss.android.ugc.aweme.ftc.countdown.C52465f.View$OnClickListenerC52471f.C524721 */

                    /* renamed from: a */
                    final /* synthetic */ View$OnClickListenerC52471f f120855a;

                    static {
                        Covode.recordClassIndex(61868);
                    }

                    {
                        this.f120855a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ Boolean invoke(FTCCountdownState fTCCountdownState) {
                        final FTCCountdownState fTCCountdownState2 = fTCCountdownState;
                        C89219l.m154721d(fTCCountdownState2, "");
                        TextView textView = this.f120855a.f120854a.f120839g;
                        if (textView == null) {
                            C89219l.m154710a("record");
                        }
                        return Boolean.valueOf(textView.post(new Runnable(this) {
                            /* class com.p2082ss.android.ugc.aweme.ftc.countdown.C52465f.View$OnClickListenerC52471f.C524721.RunnableC524731 */

                            /* renamed from: a */
                            final /* synthetic */ C524721 f120856a;

                            static {
                                Covode.recordClassIndex(61869);
                            }

                            {
                                this.f120856a = r1;
                            }

                            public final void run() {
                                AbstractC52498m mVar = this.f120856a.f120855a.f120854a.f120834b;
                                if (mVar != null) {
                                    mVar.mo88276a(C52465f.m97373a(this.f120856a.f120855a.f120854a).getStopPosition() - ((int) fTCCountdownState2.getStartTime()), this.f120856a.f120855a.f120854a.f120842j);
                                }
                                this.f120856a.f120855a.f120854a.f120841i = true;
                                C52465f fVar = this.f120856a.f120855a.f120854a;
                                AbstractC22219j jVar = fVar.f52551o;
                                if (!(jVar instanceof AbstractC22186b)) {
                                    jVar = null;
                                }
                                AbstractC22186b bVar = (AbstractC22186b) jVar;
                                if (bVar != null) {
                                    bVar.mo36400c(fVar);
                                }
                            }
                        }));
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public final void mo88255a(DmtRadioButton dmtRadioButton) {
        ViewGroup.LayoutParams layoutParams = dmtRadioButton.getLayoutParams();
        if (!(layoutParams instanceof RadioGroup.LayoutParams)) {
            layoutParams = null;
        }
        RadioGroup.LayoutParams layoutParams2 = (RadioGroup.LayoutParams) layoutParams;
        if (layoutParams2 != null) {
            layoutParams2.width = (int) C13628n.m24520b(this.f52549m, 32.0f);
            dmtRadioButton.setLayoutParams(layoutParams2);
        }
    }

    /* renamed from: d */
    public final void mo88256d(int i) {
        Activity activity = this.f52549m;
        if (activity != null) {
            C89219l.m154716b(activity, "");
            this.f120842j = i;
            Activity activity2 = this.f52549m;
            Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            AbstractC1174ac a = C1181ae.m3881a((ActivityC0945e) activity2, (C1175ad.AbstractC1177b) null).mo3983a(ShortVideoContextViewModel.class);
            C89219l.m154716b(a, "");
            ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a).f155842a;
            C39162r.m79460a("select_countdown_type", new C84425b().mo129406a("enter_from", "video_shoot_page").mo129406a("shoot_way", shortVideoContext.f155831p).mo129406a("creation_id", shortVideoContext.f155830o).mo129406a("content_type", "video").mo129406a("to_status", mo88253a()).f188764a);
            SafeHandler safeHandler = this.f120850z;
            if (safeHandler == null) {
                C89219l.m154710a("safeHandler");
            }
            safeHandler.post(new RunnableC52484m(this, i));
            ((IVideoRecordPreferences) new C14401a().mo23215a(activity, IVideoRecordPreferences.class)).setCountDownMode(i);
            AbstractC52467b bVar = this.f120849x;
            if (bVar != null) {
                bVar.mo88257a(i);
            }
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20527q.C20528a.m38714a(vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.countdown.f$i */
    static final class C52476i extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, UrlModel, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C52465f f120860a;

        static {
            Covode.recordClassIndex(61872);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52476i(C52465f fVar) {
            super(2);
            this.f120860a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, UrlModel urlModel) {
            C89219l.m154721d(iVar, "");
            C84402a.m145177a(urlModel, new C84402a.AbstractC84406b(this) {
                /* class com.p2082ss.android.ugc.aweme.ftc.countdown.C52465f.C52476i.C524771 */

                /* renamed from: a */
                final /* synthetic */ C52476i f120861a;

                static {
                    Covode.recordClassIndex(61873);
                }

                @Override // com.p2082ss.android.ugc.tools.p4340c.C84402a.AbstractC84406b
                /* renamed from: a */
                public final void mo88264a(Exception exc) {
                    C89219l.m154721d(exc, "");
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f120861a = r1;
                }

                @Override // com.p2082ss.android.ugc.tools.p4340c.C84402a.AbstractC84406b
                /* renamed from: a */
                public final void mo88263a(AbstractC24157c<C24117a<AbstractC24454c>> cVar) {
                    C89219l.m154721d(cVar, "");
                    if (cVar.mo39745b()) {
                        C24117a<AbstractC24454c> d = cVar.mo39747d();
                        Bitmap bitmap = null;
                        if (d != null && (d.mo39695a() instanceof AbstractC24453b)) {
                            AbstractC24454c a = d.mo39695a();
                            Objects.requireNonNull(a, "null cannot be cast to non-null type com.facebook.imagepipeline.image.CloseableBitmap");
                            bitmap = ((AbstractC24453b) a).mo40296d();
                        }
                        try {
                            C52465f.m97373a(this.f120861a.f120860a).setWavForm(bitmap);
                        } finally {
                            C24117a.m45712c(d);
                        }
                    }
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.countdown.f$e */
    static final class C52470e implements RadioGroup.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C52465f f120853a;

        static {
            Covode.recordClassIndex(61866);
        }

        C52470e(C52465f fVar) {
            this.f120853a = fVar;
        }

        public final void onCheckedChanged(RadioGroup radioGroup, int i) {
            if (i == R.id.dep) {
                if (this.f120853a.f120842j != 3) {
                    this.f120853a.mo88256d(3);
                }
            } else if (i == R.id.deo && this.f120853a.f120842j != 10) {
                this.f120853a.mo88256d(10);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.countdown.f$h */
    static final class C52475h extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, FTCCountdownState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C52465f f120859a;

        static {
            Covode.recordClassIndex(61871);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52475h(C52465f fVar) {
            super(2);
            this.f120859a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, FTCCountdownState fTCCountdownState) {
            FTCCountdownState fTCCountdownState2 = fTCCountdownState;
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(fTCCountdownState2, "");
            C52465f.m97373a(this.f120859a).mo116858a((int) fTCCountdownState2.getStartTime(), (int) (fTCCountdownState2.getStartTime() + fTCCountdownState2.getMaxDuration()));
            C52465f.m97373a(this.f120859a).mo116859a(fTCCountdownState2.getWaveInfo(), C63238c.f143581h.mo101542b(fTCCountdownState2.getMusicPath()));
            C52465f.m97373a(this.f120859a).setTotalTime(fTCCountdownState2.getTotalTime());
            C52465f.m97373a(this.f120859a).setPastPosition((int) (Math.max(0L, fTCCountdownState2.getSdkRecordTime()) + fTCCountdownState2.getStartTime()));
            C52465f.m97373a(this.f120859a).setStopPosition((int) (Math.max(0L, fTCCountdownState2.getMaxDuration()) + fTCCountdownState2.getStartTime()));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.countdown.f$k */
    static final class C52481k extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Long, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C52465f f120868a;

        static {
            Covode.recordClassIndex(61877);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52481k(C52465f fVar) {
            super(2);
            this.f120868a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Long l) {
            long longValue = l.longValue();
            C89219l.m154721d(iVar, "");
            C52465f.m97374b(this.f120868a).setText(new StringBuilder().append(longValue / 1000).append('s').toString());
            C52465f.m97375c(this.f120868a).setText(C52466a.m97385a(((float) longValue) / 1000.0f) + 's');
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        this.f120850z = new SafeHandler(this);
        this.f120840h.mo33686a_(C52469d.f120852a);
        View a = C1764a.m5927a(layoutInflater, R.layout.a2x, viewGroup, false);
        C89219l.m154716b(a, "");
        a.setMinimumWidth(100000);
        View findViewById = a.findViewById(R.id.fh3);
        C89219l.m154716b(findViewById, "");
        this.f120833a = (VolumeTapsView) findViewById;
        View findViewById2 = a.findViewById(R.id.egr);
        C89219l.m154716b(findViewById2, "");
        this.f120836d = (TextView) findViewById2;
        View findViewById3 = a.findViewById(R.id.eg9);
        C89219l.m154716b(findViewById3, "");
        this.f120837e = (TextView) findViewById3;
        View findViewById4 = a.findViewById(R.id.egk);
        C89219l.m154716b(findViewById4, "");
        this.f120838f = (TextView) findViewById4;
        View findViewById5 = a.findViewById(R.id.e6q);
        C89219l.m154716b(findViewById5, "");
        this.f120839g = (TextView) findViewById5;
        View findViewById6 = a.findViewById(R.id.ejc);
        C89219l.m154716b(findViewById6, "");
        this.f120843k = (ViewGroup) findViewById6;
        View findViewById7 = a.findViewById(R.id.eg2);
        C89219l.m154716b(findViewById7, "");
        this.f120844l = (TextView) findViewById7;
        View findViewById8 = a.findViewById(R.id.aev);
        C89219l.m154716b(findViewById8, "");
        this.f120832A = findViewById8;
        View findViewById9 = a.findViewById(R.id.djw);
        C89219l.m154716b(findViewById9, "");
        this.f120845t = (RadioGroup) findViewById9;
        View findViewById10 = a.findViewById(R.id.dep);
        C89219l.m154716b(findViewById10, "");
        this.f120846u = (DmtRadioButton) findViewById10;
        View findViewById11 = a.findViewById(R.id.deo);
        C89219l.m154716b(findViewById11, "");
        this.f120847v = (DmtRadioButton) findViewById11;
        DmtRadioButton dmtRadioButton = this.f120846u;
        if (dmtRadioButton == null) {
            C89219l.m154710a("countDownShortView");
        }
        TextPaint paint = dmtRadioButton.getPaint();
        C89219l.m154716b(paint, "");
        paint.setFakeBoldText(true);
        DmtRadioButton dmtRadioButton2 = this.f120847v;
        if (dmtRadioButton2 == null) {
            C89219l.m154710a("countDownLongView");
        }
        TextPaint paint2 = dmtRadioButton2.getPaint();
        C89219l.m154716b(paint2, "");
        paint2.setFakeBoldText(true);
        Activity activity = this.f52549m;
        if (activity != null && C78099c.m136517a(activity)) {
            DmtRadioButton dmtRadioButton3 = this.f120846u;
            if (dmtRadioButton3 == null) {
                C89219l.m154710a("countDownShortView");
            }
            dmtRadioButton3.setBackgroundResource(R.drawable.eq);
            DmtRadioButton dmtRadioButton4 = this.f120847v;
            if (dmtRadioButton4 == null) {
                C89219l.m154710a("countDownLongView");
            }
            dmtRadioButton4.setBackgroundResource(R.drawable.en);
        }
        RadioGroup radioGroup = this.f120845t;
        if (radioGroup == null) {
            C89219l.m154710a("countDownSwitchView");
        }
        radioGroup.setOnCheckedChangeListener(new C52470e(this));
        C14401a aVar = new C14401a();
        Activity t = mo36486t();
        C89219l.m154716b(t, "");
        int countDownMode = ((IVideoRecordPreferences) aVar.mo23215a(t, IVideoRecordPreferences.class)).getCountDownMode(3);
        this.f120842j = countDownMode;
        if (countDownMode == 3) {
            DmtRadioButton dmtRadioButton5 = this.f120846u;
            if (dmtRadioButton5 == null) {
                C89219l.m154710a("countDownShortView");
            }
            dmtRadioButton5.setChecked(true);
        } else {
            DmtRadioButton dmtRadioButton6 = this.f120847v;
            if (dmtRadioButton6 == null) {
                C89219l.m154710a("countDownLongView");
            }
            dmtRadioButton6.setChecked(true);
        }
        TextView textView = this.f120839g;
        if (textView == null) {
            C89219l.m154710a("record");
        }
        textView.setOnClickListener(new View$OnClickListenerC52471f(this));
        a.findViewById(R.id.aew).setOnClickListener(new View$OnClickListenerC52474g(this));
        View view = this.f120832A;
        if (view == null) {
            C89219l.m154710a("countdownPanel");
        }
        AbstractC88412b unused = subscribe(this.f120840h, new C20370ah(), new C52475h(this));
        AbstractC88412b unused2 = selectSubscribe(this.f120840h, C52486g.f120879a, new C20370ah(), new C52476i(this));
        VolumeTapsView volumeTapsView = this.f120833a;
        if (volumeTapsView == null) {
            C89219l.m154710a("volumeTapsView");
        }
        volumeTapsView.setOnProgressChangeListener(new C52478j(this));
        TextView textView2 = this.f120836d;
        if (textView2 == null) {
            C89219l.m154710a("startTextView");
        }
        textView2.setText("0s");
        AbstractC88412b unused3 = selectSubscribe(this.f120840h, C52487h.f120880a, new C20370ah(), new C52481k(this));
        a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC52482l(this, a, view));
        return a;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38708a(this, jediViewModel, ahVar, mVar);
    }

    /* renamed from: a */
    public final void mo88254a(long j, long j2, long j3) {
        SafeHandler safeHandler = this.f120850z;
        if (safeHandler == null) {
            C89219l.m154710a("safeHandler");
        }
        safeHandler.post(new RunnableC52485n(this, j, j2, j3));
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38709a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(qVar, "");
        return AbstractC20527q.C20528a.m38711a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super Throwable, C89391z> mVar, AbstractC89172b<? super AbstractC20477i, C89391z> bVar, AbstractC89183m<? super AbstractC20477i, ? super T, C89391z> mVar2) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        return AbstractC20527q.C20528a.m38710a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super AbstractC20477i, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(rVar, "");
        return AbstractC20527q.C20528a.m38712a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C, D> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C20370ah<C20376an<A, B, C, D>> ahVar, AbstractC89189s<? super AbstractC20477i, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(sVar, "");
        return AbstractC20527q.C20528a.m38713a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
