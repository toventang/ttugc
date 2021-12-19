package com.p2082ss.android.ugc.aweme.shortvideo.countdown;

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

/* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.f */
public final class C69949f extends AbstractC22219j implements AbstractC20527q {

    /* renamed from: y */
    public static final C69950a f156340y = new C69950a((byte) 0);

    /* renamed from: A */
    private View f156341A;

    /* renamed from: a */
    public VolumeTapsView f156342a;

    /* renamed from: b */
    public AbstractC69976k f156343b;

    /* renamed from: c */
    public AbstractC69977l f156344c;

    /* renamed from: d */
    public TextView f156345d;

    /* renamed from: e */
    public TextView f156346e;

    /* renamed from: f */
    public TextView f156347f;

    /* renamed from: g */
    public TextView f156348g;

    /* renamed from: h */
    public final CountdownViewModel f156349h;

    /* renamed from: i */
    public boolean f156350i;

    /* renamed from: j */
    public int f156351j;

    /* renamed from: k */
    public ViewGroup f156352k;

    /* renamed from: l */
    public TextView f156353l;

    /* renamed from: t */
    public RadioGroup f156354t;

    /* renamed from: u */
    public DmtRadioButton f156355u;

    /* renamed from: v */
    public DmtRadioButton f156356v;

    /* renamed from: w */
    public C51429c f156357w;

    /* renamed from: x */
    public AbstractC69951b f156358x;

    /* renamed from: z */
    private SafeHandler f156359z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.f$b */
    public interface AbstractC69951b {
        static {
            Covode.recordClassIndex(82362);
        }

        /* renamed from: a */
        void mo110403a(int i);
    }

    static {
        Covode.recordClassIndex(82360);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.f$a */
    public static final class C69950a {
        static {
            Covode.recordClassIndex(82361);
        }

        private C69950a() {
        }

        public /* synthetic */ C69950a(byte b) {
            this();
        }

        /* renamed from: a */
        public static String m123552a(float f) {
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
        C51429c cVar = this.f156357w;
        if (cVar != null) {
            cVar.mo86856c();
        }
    }

    /* renamed from: a */
    public final String mo110399a() {
        if (this.f156351j == 3) {
            return "3s";
        }
        return "10s";
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: n_ */
    public final void mo22713n_() {
        super.mo22713n_();
        AbstractC69976k kVar = this.f156343b;
        if (kVar != null) {
            kVar.mo110416a();
        }
        AbstractC69977l lVar = this.f156344c;
        if (lVar != null) {
            lVar.mo110419a();
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: w */
    public final void mo36490w() {
        super.mo36490w();
        ViewGroup viewGroup = this.f156352k;
        if (viewGroup == null) {
            C89219l.m154710a("countDownTitleView");
        }
        viewGroup.post(new RunnableC69952c(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.f$m */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC69967m implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ C69949f f156379a;

        /* renamed from: b */
        final /* synthetic */ View f156380b;

        /* renamed from: c */
        final /* synthetic */ View f156381c;

        static {
            Covode.recordClassIndex(82378);
        }

        public final void onGlobalLayout() {
            C69949f fVar = this.f156379a;
            fVar.withState(fVar.f156349h, new C69968a(this));
            View view = this.f156381c;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", (float) view.getMeasuredHeight(), 0.0f);
            ofFloat.setInterpolator(new animationInterpolatorC52819a());
            ofFloat.setDuration(490L);
            ofFloat.start();
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.f$m$a */
        static final class C69968a extends AbstractC89220m implements AbstractC89172b<CountdownState, C89391z> {

            /* renamed from: a */
            final /* synthetic */ ViewTreeObserver$OnGlobalLayoutListenerC69967m f156382a;

            static {
                Covode.recordClassIndex(82379);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C69968a(ViewTreeObserver$OnGlobalLayoutListenerC69967m mVar) {
                super(1);
                this.f156382a = mVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(CountdownState countdownState) {
                CountdownState countdownState2 = countdownState;
                C89219l.m154721d(countdownState2, "");
                this.f156382a.f156379a.mo110400a((long) C69949f.m123537a(this.f156382a.f156379a).getStopPosition(), countdownState2.getStartTime(), countdownState2.getMaxDuration());
                this.f156382a.f156380b.getViewTreeObserver().removeOnGlobalLayoutListener(this.f156382a);
                AbstractC69976k kVar = this.f156382a.f156379a.f156343b;
                if (kVar == null) {
                    return null;
                }
                kVar.mo110418a(countdownState2.getMusicPath(), (int) (countdownState2.getStartTime() + countdownState2.getSdkRecordTime()), (int) (countdownState2.getStartTime() + countdownState2.getMaxDuration()));
                return C89391z.f203057a;
            }
        }

        ViewTreeObserver$OnGlobalLayoutListenerC69967m(C69949f fVar, View view, View view2) {
            this.f156379a = fVar;
            this.f156380b = view;
            this.f156381c = view2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.f$n */
    public static final class RunnableC69969n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C69949f f156383a;

        /* renamed from: b */
        final /* synthetic */ int f156384b;

        static {
            Covode.recordClassIndex(82380);
        }

        RunnableC69969n(C69949f fVar, int i) {
            this.f156383a = fVar;
            this.f156384b = i;
        }

        public final /* synthetic */ void run() {
            if (this.f156383a.f156357w == null) {
                Activity activity = this.f156383a.f52549m;
                if (activity != null) {
                    C89219l.m154716b(activity, "");
                    this.f156383a.f156357w = new C51429c(activity);
                } else {
                    return;
                }
            }
            C51429c cVar = this.f156383a.f156357w;
            if (cVar != null) {
                C69949f fVar = this.f156383a;
                Object[] objArr = new Object[1];
                int i = 3;
                if (this.f156384b != 3) {
                    i = 10;
                }
                objArr[0] = Integer.valueOf(i);
                cVar.mo86853a(fVar.mo36472a(R.string.auj, objArr));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.f$c */
    static final class RunnableC69952c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C69949f f156360a;

        static {
            Covode.recordClassIndex(82363);
        }

        RunnableC69952c(C69949f fVar) {
            this.f156360a = fVar;
        }

        public final void run() {
            if (((float) C69949f.m123540d(this.f156360a).getMeasuredWidth()) < ((float) (C69949f.m123541e(this.f156360a).getMeasuredWidth() + C69949f.m123542f(this.f156360a).getMeasuredWidth())) + C13628n.m24520b(this.f156360a.f52549m, 8.0f)) {
                C69949f fVar = this.f156360a;
                DmtRadioButton dmtRadioButton = fVar.f156355u;
                if (dmtRadioButton == null) {
                    C89219l.m154710a("countDownShortView");
                }
                fVar.mo110401a(dmtRadioButton);
                C69949f fVar2 = this.f156360a;
                DmtRadioButton dmtRadioButton2 = fVar2.f156356v;
                if (dmtRadioButton2 == null) {
                    C89219l.m154710a("countDownLongView");
                }
                fVar2.mo110401a(dmtRadioButton2);
            }
            C69949f fVar3 = this.f156360a;
            ViewGroup viewGroup = fVar3.f156352k;
            if (viewGroup == null) {
                C89219l.m154710a("countDownTitleView");
            }
            viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC69959h(fVar3));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.f$h */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC69959h implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ C69949f f156368a;

        static {
            Covode.recordClassIndex(82370);
        }

        public final void onGlobalLayout() {
            if (C69949f.m123540d(this.f156368a).getMeasuredWidth() < C69949f.m123541e(this.f156368a).getMeasuredWidth() + C69949f.m123542f(this.f156368a).getMeasuredWidth()) {
                int[] iArr = new int[2];
                C69949f.m123541e(this.f156368a).getLocationOnScreen(iArr);
                int i = iArr[0];
                int[] iArr2 = new int[2];
                C69949f.m123542f(this.f156368a).getLocationOnScreen(iArr2);
                float b = ((float) (iArr2[0] - i)) - C13628n.m24520b(this.f156368a.f52549m, 16.0f);
                ViewGroup.LayoutParams layoutParams = C69949f.m123541e(this.f156368a).getLayoutParams();
                layoutParams.width = (int) b;
                C69949f.m123541e(this.f156368a).setLayoutParams(layoutParams);
            }
            C69949f.m123540d(this.f156368a).getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ViewTreeObserver$OnGlobalLayoutListenerC69959h(C69949f fVar) {
            this.f156368a = fVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.f$o */
    public static final class RunnableC69970o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C69949f f156385a;

        /* renamed from: b */
        final /* synthetic */ long f156386b;

        /* renamed from: c */
        final /* synthetic */ long f156387c;

        /* renamed from: d */
        final /* synthetic */ long f156388d;

        static {
            Covode.recordClassIndex(82381);
        }

        RunnableC69970o(C69949f fVar, long j, long j2, long j3) {
            this.f156385a = fVar;
            this.f156386b = j;
            this.f156387c = j2;
            this.f156388d = j3;
        }

        public final void run() {
            C69949f fVar = this.f156385a;
            long j = this.f156386b;
            long j2 = this.f156387c;
            long j3 = this.f156388d;
            float f = ((float) (j - j2)) * 1.0f;
            VolumeTapsView volumeTapsView = fVar.f156342a;
            if (volumeTapsView == null) {
                C89219l.m154710a("volumeTapsView");
            }
            float max = Math.max(0.0f, (f * ((float) volumeTapsView.getMeasuredWidth())) / ((float) j3));
            C69949f.m123539c(this.f156385a).setText(C69950a.m123552a(((float) (this.f156386b - this.f156387c)) / 1000.0f) + 's');
            C69949f.m123539c(this.f156385a).setTranslationX((max / ((float) C69949f.m123537a(this.f156385a).getMeasuredWidth())) * ((float) (C69949f.m123537a(this.f156385a).getMeasuredWidth() - C69949f.m123539c(this.f156385a).getMeasuredWidth())));
            C69949f.m123538b(this.f156385a).setAlpha(this.f156385a.mo110398a(max));
            TextView textView = this.f156385a.f156345d;
            if (textView == null) {
                C89219l.m154710a("startTextView");
            }
            C69949f fVar2 = this.f156385a;
            textView.setAlpha(fVar2.mo110398a(((float) C69949f.m123537a(fVar2).getMeasuredWidth()) - max));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.f$d */
    static final class C69953d extends AbstractC89220m implements AbstractC89172b<CountdownState, CountdownState> {

        /* renamed from: a */
        public static final C69953d f156361a = new C69953d();

        static {
            Covode.recordClassIndex(82364);
        }

        C69953d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CountdownState invoke(CountdownState countdownState) {
            C89219l.m154721d(countdownState, "");
            return countdownState;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.f$k */
    public static final class C69963k implements VolumeTapsView.AbstractC74265a {

        /* renamed from: a */
        final /* synthetic */ C69949f f156372a;

        static {
            Covode.recordClassIndex(82374);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C69963k(C69949f fVar) {
            this.f156372a = fVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.VolumeTapsView.AbstractC74265a
        /* renamed from: a */
        public final void mo88265a(int i) {
            C69949f fVar = this.f156372a;
            fVar.withState(fVar.f156349h, new C69964a(this, i));
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.f$k$a */
        static final class C69964a extends AbstractC89220m implements AbstractC89172b<CountdownState, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C69963k f156373a;

            /* renamed from: b */
            final /* synthetic */ int f156374b;

            static {
                Covode.recordClassIndex(82375);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C69964a(C69963k kVar, int i) {
                super(1);
                this.f156373a = kVar;
                this.f156374b = i;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(CountdownState countdownState) {
                CountdownState countdownState2 = countdownState;
                C89219l.m154721d(countdownState2, "");
                this.f156373a.f156372a.mo110400a((long) this.f156374b, countdownState2.getStartTime(), countdownState2.getMaxDuration());
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.f$k$b */
        static final class C69965b extends AbstractC89220m implements AbstractC89172b<CountdownState, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C69963k f156375a;

            /* renamed from: b */
            final /* synthetic */ int f156376b;

            /* renamed from: c */
            final /* synthetic */ int f156377c;

            static {
                Covode.recordClassIndex(82376);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C69965b(C69963k kVar, int i, int i2) {
                super(1);
                this.f156375a = kVar;
                this.f156376b = i;
                this.f156377c = i2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(CountdownState countdownState) {
                CountdownState countdownState2 = countdownState;
                C89219l.m154721d(countdownState2, "");
                AbstractC69976k kVar = this.f156375a.f156372a.f156343b;
                if (kVar != null) {
                    kVar.mo110418a(countdownState2.getMusicPath(), this.f156376b, this.f156377c);
                }
                this.f156375a.f156372a.mo110400a((long) this.f156377c, countdownState2.getStartTime(), countdownState2.getMaxDuration());
                return C89391z.f203057a;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.VolumeTapsView.AbstractC74265a
        /* renamed from: a */
        public final void mo88266a(int i, int i2) {
            C69949f fVar = this.f156372a;
            fVar.withState(fVar.f156349h, new C69965b(this, i, i2));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.f$g */
    static final class View$OnClickListenerC69958g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C69949f f156367a;

        static {
            Covode.recordClassIndex(82369);
        }

        View$OnClickListenerC69958g(C69949f fVar) {
            this.f156367a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC69977l lVar = this.f156367a.f156344c;
            if (lVar != null) {
                lVar.mo110420b();
            }
        }
    }

    public C69949f(CountdownState countdownState) {
        C89219l.m154721d(countdownState, "");
        this.f156349h = new CountdownViewModel(countdownState);
    }

    /* renamed from: a */
    public static final /* synthetic */ VolumeTapsView m123537a(C69949f fVar) {
        VolumeTapsView volumeTapsView = fVar.f156342a;
        if (volumeTapsView == null) {
            C89219l.m154710a("volumeTapsView");
        }
        return volumeTapsView;
    }

    /* renamed from: b */
    public static final /* synthetic */ TextView m123538b(C69949f fVar) {
        TextView textView = fVar.f156346e;
        if (textView == null) {
            C89219l.m154710a("endTextView");
        }
        return textView;
    }

    /* renamed from: c */
    public static final /* synthetic */ TextView m123539c(C69949f fVar) {
        TextView textView = fVar.f156347f;
        if (textView == null) {
            C89219l.m154710a("anchorTextView");
        }
        return textView;
    }

    /* renamed from: d */
    public static final /* synthetic */ ViewGroup m123540d(C69949f fVar) {
        ViewGroup viewGroup = fVar.f156352k;
        if (viewGroup == null) {
            C89219l.m154710a("countDownTitleView");
        }
        return viewGroup;
    }

    /* renamed from: e */
    public static final /* synthetic */ TextView m123541e(C69949f fVar) {
        TextView textView = fVar.f156353l;
        if (textView == null) {
            C89219l.m154710a("countDownTitleTextView");
        }
        return textView;
    }

    /* renamed from: f */
    public static final /* synthetic */ RadioGroup m123542f(C69949f fVar) {
        RadioGroup radioGroup = fVar.f156354t;
        if (radioGroup == null) {
            C89219l.m154710a("countDownSwitchView");
        }
        return radioGroup;
    }

    /* renamed from: a */
    public final float mo110398a(float f) {
        VolumeTapsView volumeTapsView = this.f156342a;
        if (volumeTapsView == null) {
            C89219l.m154710a("volumeTapsView");
        }
        float measuredWidth = ((float) volumeTapsView.getMeasuredWidth()) - f;
        TextView textView = this.f156346e;
        if (textView == null) {
            C89219l.m154710a("endTextView");
        }
        return Math.min(1.0f, (measuredWidth - ((float) textView.getMeasuredWidth())) / 100.0f);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.f$f */
    static final class View$OnClickListenerC69955f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C69949f f156363a;

        static {
            Covode.recordClassIndex(82366);
        }

        View$OnClickListenerC69955f(C69949f fVar) {
            this.f156363a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Activity activity = this.f156363a.f52549m;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            AbstractC1174ac a = C1181ae.m3881a((ActivityC0945e) activity, (C1175ad.AbstractC1177b) null).mo3983a(ShortVideoContextViewModel.class);
            C89219l.m154716b(a, "");
            ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a).f155842a;
            C84425b a2 = new C84425b().mo129406a("creation_id", shortVideoContext.f155830o).mo129406a("shoot_way", shortVideoContext.f155831p).mo129406a("countdown_type", this.f156363a.mo110399a());
            if (shortVideoContext.f155740A != 0) {
                a2.mo129403a("draft_id", shortVideoContext.f155740A);
            }
            String str = shortVideoContext.f155741B;
            C89219l.m154716b(str, "");
            if (str.length() > 0) {
                a2.mo129406a("new_draft_id", shortVideoContext.f155741B);
            }
            C39162r.m79460a("count_down_start", a2.f188764a);
            if (this.f156363a.f156343b != null) {
                C69949f fVar = this.f156363a;
                fVar.withState(fVar.f156349h, new AbstractC89172b<CountdownState, Boolean>(this) {
                    /* class com.p2082ss.android.ugc.aweme.shortvideo.countdown.C69949f.View$OnClickListenerC69955f.C699561 */

                    /* renamed from: a */
                    final /* synthetic */ View$OnClickListenerC69955f f156364a;

                    static {
                        Covode.recordClassIndex(82367);
                    }

                    {
                        this.f156364a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ Boolean invoke(CountdownState countdownState) {
                        final CountdownState countdownState2 = countdownState;
                        C89219l.m154721d(countdownState2, "");
                        TextView textView = this.f156364a.f156363a.f156348g;
                        if (textView == null) {
                            C89219l.m154710a("record");
                        }
                        return Boolean.valueOf(textView.post(new Runnable(this) {
                            /* class com.p2082ss.android.ugc.aweme.shortvideo.countdown.C69949f.View$OnClickListenerC69955f.C699561.RunnableC699571 */

                            /* renamed from: a */
                            final /* synthetic */ C699561 f156365a;

                            static {
                                Covode.recordClassIndex(82368);
                            }

                            {
                                this.f156365a = r1;
                            }

                            public final void run() {
                                AbstractC69976k kVar = this.f156365a.f156364a.f156363a.f156343b;
                                if (kVar != null) {
                                    kVar.mo110417a(C69949f.m123537a(this.f156365a.f156364a.f156363a).getStopPosition() - ((int) countdownState2.getStartTime()), this.f156365a.f156364a.f156363a.f156351j);
                                }
                                this.f156365a.f156364a.f156363a.f156350i = true;
                                C69949f fVar = this.f156365a.f156364a.f156363a;
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
    public final void mo110401a(DmtRadioButton dmtRadioButton) {
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
    public final void mo110402d(int i) {
        Activity activity = this.f52549m;
        if (activity != null) {
            C89219l.m154716b(activity, "");
            this.f156351j = i;
            Activity activity2 = this.f52549m;
            Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            AbstractC1174ac a = C1181ae.m3881a((ActivityC0945e) activity2, (C1175ad.AbstractC1177b) null).mo3983a(ShortVideoContextViewModel.class);
            C89219l.m154716b(a, "");
            ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a).f155842a;
            C39162r.m79460a("select_countdown_type", new C84425b().mo129406a("enter_from", "video_shoot_page").mo129406a("shoot_way", shortVideoContext.f155831p).mo129406a("creation_id", shortVideoContext.f155830o).mo129406a("content_type", "video").mo129406a("to_status", mo110399a()).f188764a);
            SafeHandler safeHandler = this.f156359z;
            if (safeHandler == null) {
                C89219l.m154710a("safeHandler");
            }
            safeHandler.post(new RunnableC69969n(this, i));
            ((IVideoRecordPreferences) new C14401a().mo23215a(activity, IVideoRecordPreferences.class)).setCountDownMode(i);
            AbstractC69951b bVar = this.f156358x;
            if (bVar != null) {
                bVar.mo110403a(i);
            }
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20527q.C20528a.m38714a(vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.f$j */
    static final class C69961j extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, UrlModel, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C69949f f156370a;

        static {
            Covode.recordClassIndex(82372);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69961j(C69949f fVar) {
            super(2);
            this.f156370a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, UrlModel urlModel) {
            C89219l.m154721d(iVar, "");
            C84402a.m145177a(urlModel, new C84402a.AbstractC84406b(this) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.countdown.C69949f.C69961j.C699621 */

                /* renamed from: a */
                final /* synthetic */ C69961j f156371a;

                static {
                    Covode.recordClassIndex(82373);
                }

                @Override // com.p2082ss.android.ugc.tools.p4340c.C84402a.AbstractC84406b
                /* renamed from: a */
                public final void mo88264a(Exception exc) {
                    C89219l.m154721d(exc, "");
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f156371a = r1;
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
                            C69949f.m123537a(this.f156371a.f156370a).setWavForm(bitmap);
                        } finally {
                            C24117a.m45712c(d);
                        }
                    }
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.f$e */
    static final class C69954e implements RadioGroup.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C69949f f156362a;

        static {
            Covode.recordClassIndex(82365);
        }

        C69954e(C69949f fVar) {
            this.f156362a = fVar;
        }

        public final void onCheckedChanged(RadioGroup radioGroup, int i) {
            if (i == R.id.dep) {
                if (this.f156362a.f156351j != 3) {
                    this.f156362a.mo110402d(3);
                }
            } else if (i == R.id.deo && this.f156362a.f156351j != 10) {
                this.f156362a.mo110402d(10);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.f$i */
    static final class C69960i extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, CountdownState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C69949f f156369a;

        static {
            Covode.recordClassIndex(82371);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69960i(C69949f fVar) {
            super(2);
            this.f156369a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, CountdownState countdownState) {
            CountdownState countdownState2 = countdownState;
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(countdownState2, "");
            C69949f.m123537a(this.f156369a).mo116858a((int) countdownState2.getStartTime(), (int) (countdownState2.getStartTime() + countdownState2.getMaxDuration()));
            C69949f.m123537a(this.f156369a).mo116859a(countdownState2.getWaveInfo(), C63238c.f143581h.mo101542b(countdownState2.getMusicPath()));
            C69949f.m123537a(this.f156369a).setTotalTime(countdownState2.getTotalTime());
            C69949f.m123537a(this.f156369a).setPastPosition((int) (Math.max(0L, countdownState2.getSdkRecordTime()) + countdownState2.getStartTime()));
            C69949f.m123537a(this.f156369a).setStopPosition((int) (Math.max(0L, countdownState2.getMaxDuration()) + countdownState2.getStartTime()));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.f$l */
    static final class C69966l extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Long, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C69949f f156378a;

        static {
            Covode.recordClassIndex(82377);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69966l(C69949f fVar) {
            super(2);
            this.f156378a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Long l) {
            long longValue = l.longValue();
            C89219l.m154721d(iVar, "");
            C69949f.m123538b(this.f156378a).setText(new StringBuilder().append(longValue / 1000).append('s').toString());
            C69949f.m123539c(this.f156378a).setText(C69950a.m123552a(((float) longValue) / 1000.0f) + 's');
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        this.f156359z = new SafeHandler(this);
        this.f156349h.mo33686a_(C69953d.f156361a);
        View a = C1764a.m5927a(layoutInflater, R.layout.a1j, viewGroup, false);
        C89219l.m154716b(a, "");
        a.setMinimumWidth(100000);
        View findViewById = a.findViewById(R.id.fh3);
        C89219l.m154716b(findViewById, "");
        this.f156342a = (VolumeTapsView) findViewById;
        View findViewById2 = a.findViewById(R.id.egr);
        C89219l.m154716b(findViewById2, "");
        this.f156345d = (TextView) findViewById2;
        View findViewById3 = a.findViewById(R.id.eg9);
        C89219l.m154716b(findViewById3, "");
        this.f156346e = (TextView) findViewById3;
        View findViewById4 = a.findViewById(R.id.egk);
        C89219l.m154716b(findViewById4, "");
        this.f156347f = (TextView) findViewById4;
        View findViewById5 = a.findViewById(R.id.e6q);
        C89219l.m154716b(findViewById5, "");
        this.f156348g = (TextView) findViewById5;
        View findViewById6 = a.findViewById(R.id.ejc);
        C89219l.m154716b(findViewById6, "");
        this.f156352k = (ViewGroup) findViewById6;
        View findViewById7 = a.findViewById(R.id.eg2);
        C89219l.m154716b(findViewById7, "");
        this.f156353l = (TextView) findViewById7;
        View findViewById8 = a.findViewById(R.id.aev);
        C89219l.m154716b(findViewById8, "");
        this.f156341A = findViewById8;
        View findViewById9 = a.findViewById(R.id.djw);
        C89219l.m154716b(findViewById9, "");
        this.f156354t = (RadioGroup) findViewById9;
        View findViewById10 = a.findViewById(R.id.dep);
        C89219l.m154716b(findViewById10, "");
        this.f156355u = (DmtRadioButton) findViewById10;
        View findViewById11 = a.findViewById(R.id.deo);
        C89219l.m154716b(findViewById11, "");
        this.f156356v = (DmtRadioButton) findViewById11;
        DmtRadioButton dmtRadioButton = this.f156355u;
        if (dmtRadioButton == null) {
            C89219l.m154710a("countDownShortView");
        }
        TextPaint paint = dmtRadioButton.getPaint();
        C89219l.m154716b(paint, "");
        paint.setFakeBoldText(true);
        DmtRadioButton dmtRadioButton2 = this.f156356v;
        if (dmtRadioButton2 == null) {
            C89219l.m154710a("countDownLongView");
        }
        TextPaint paint2 = dmtRadioButton2.getPaint();
        C89219l.m154716b(paint2, "");
        paint2.setFakeBoldText(true);
        if (C78099c.m136517a(this.f52549m)) {
            DmtRadioButton dmtRadioButton3 = this.f156355u;
            if (dmtRadioButton3 == null) {
                C89219l.m154710a("countDownShortView");
            }
            dmtRadioButton3.setBackgroundResource(R.drawable.eq);
            DmtRadioButton dmtRadioButton4 = this.f156356v;
            if (dmtRadioButton4 == null) {
                C89219l.m154710a("countDownLongView");
            }
            dmtRadioButton4.setBackgroundResource(R.drawable.en);
        }
        RadioGroup radioGroup = this.f156354t;
        if (radioGroup == null) {
            C89219l.m154710a("countDownSwitchView");
        }
        radioGroup.setOnCheckedChangeListener(new C69954e(this));
        C14401a aVar = new C14401a();
        Activity t = mo36486t();
        C89219l.m154716b(t, "");
        int countDownMode = ((IVideoRecordPreferences) aVar.mo23215a(t, IVideoRecordPreferences.class)).getCountDownMode(3);
        this.f156351j = countDownMode;
        if (countDownMode == 3) {
            DmtRadioButton dmtRadioButton5 = this.f156355u;
            if (dmtRadioButton5 == null) {
                C89219l.m154710a("countDownShortView");
            }
            dmtRadioButton5.setChecked(true);
        } else {
            DmtRadioButton dmtRadioButton6 = this.f156356v;
            if (dmtRadioButton6 == null) {
                C89219l.m154710a("countDownLongView");
            }
            dmtRadioButton6.setChecked(true);
        }
        TextView textView = this.f156348g;
        if (textView == null) {
            C89219l.m154710a("record");
        }
        textView.setOnClickListener(new View$OnClickListenerC69955f(this));
        a.findViewById(R.id.aew).setOnClickListener(new View$OnClickListenerC69958g(this));
        View view = this.f156341A;
        if (view == null) {
            C89219l.m154710a("countdownPanel");
        }
        AbstractC88412b unused = subscribe(this.f156349h, new C20370ah(), new C69960i(this));
        AbstractC88412b unused2 = selectSubscribe(this.f156349h, C69971g.f156389a, new C20370ah(), new C69961j(this));
        VolumeTapsView volumeTapsView = this.f156342a;
        if (volumeTapsView == null) {
            C89219l.m154710a("volumeTapsView");
        }
        volumeTapsView.setOnProgressChangeListener(new C69963k(this));
        TextView textView2 = this.f156345d;
        if (textView2 == null) {
            C89219l.m154710a("startTextView");
        }
        textView2.setText("0s");
        AbstractC88412b unused3 = selectSubscribe(this.f156349h, C69972h.f156390a, new C20370ah(), new C69966l(this));
        a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC69967m(this, a, view));
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
    public final void mo110400a(long j, long j2, long j3) {
        SafeHandler safeHandler = this.f156359z;
        if (safeHandler == null) {
            C89219l.m154710a("safeHandler");
        }
        safeHandler.post(new RunnableC69970o(this, j, j2, j3));
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
