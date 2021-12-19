package com.p2082ss.android.ugc.aweme.infoSticker.customsticker.p3289a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20382b;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.C20365ac;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.C20391d;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20758o;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.EnumC20767w;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20734k;
import com.bytedance.scene.AbstractC22219j;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.infoSticker.customsticker.EditPreviewStickerViewModel;
import com.p2082ss.android.ugc.aweme.infoSticker.customsticker.api.C56713a;
import com.p2082ss.android.ugc.aweme.infoSticker.customsticker.api.CutoutData;
import com.p2082ss.android.ugc.aweme.infoSticker.customsticker.helper.C56714a;
import com.p2082ss.android.ugc.aweme.infoSticker.customsticker.helper.Coordinate;
import com.p2082ss.android.ugc.aweme.infoSticker.customsticker.helper.Location;
import com.p2082ss.android.ugc.aweme.infoSticker.customsticker.model.CustomStickerExtra;
import com.p2082ss.android.ugc.aweme.infoSticker.widget.AnimationPathView;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.p2730de.C40970e;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.setting.C68062ck;
import com.p2082ss.android.ugc.aweme.themechange.base.AVDmtImageView;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.a.b */
public final class C56679b extends AbstractC22219j implements AbstractC20382b {

    /* renamed from: X */
    public static final C56680a f129166X = new C56680a((byte) 0);

    /* renamed from: A */
    public boolean f129167A;

    /* renamed from: B */
    public float f129168B = 1.0f;

    /* renamed from: C */
    public float f129169C = 1.0f;

    /* renamed from: D */
    public int f129170D;

    /* renamed from: E */
    public int f129171E;

    /* renamed from: F */
    public int f129172F;

    /* renamed from: G */
    public int f129173G;

    /* renamed from: H */
    public boolean f129174H;

    /* renamed from: I */
    public boolean f129175I;

    /* renamed from: J */
    public boolean f129176J;

    /* renamed from: K */
    public boolean f129177K;

    /* renamed from: L */
    public boolean f129178L;

    /* renamed from: M */
    public boolean f129179M;

    /* renamed from: N */
    public int f129180N;

    /* renamed from: O */
    public ValueAnimator f129181O;

    /* renamed from: P */
    public ValueAnimator f129182P;

    /* renamed from: Q */
    public final ArrayList<ArrayList<Coordinate>> f129183Q = new ArrayList<>();

    /* renamed from: R */
    public final MediaModel f129184R;

    /* renamed from: S */
    public final Effect f129185S;

    /* renamed from: T */
    public final String f129186T;

    /* renamed from: U */
    public final String f129187U;

    /* renamed from: V */
    public final String f129188V;

    /* renamed from: W */
    public final String f129189W;

    /* renamed from: Y */
    private ImageView f129190Y;

    /* renamed from: Z */
    private View f129191Z;

    /* renamed from: a */
    public SmartImageView f129192a;

    /* renamed from: aa */
    private TextView f129193aa;

    /* renamed from: ab */
    private View f129194ab;

    /* renamed from: ac */
    private View f129195ac;

    /* renamed from: ad */
    private final C88411a f129196ad = new C88411a();

    /* renamed from: b */
    public SmartImageView f129197b;

    /* renamed from: c */
    public RelativeLayout f129198c;

    /* renamed from: d */
    AVDmtImageView f129199d;

    /* renamed from: e */
    TextView f129200e;

    /* renamed from: f */
    public AnimationPathView f129201f;

    /* renamed from: g */
    AnimationPathView f129202g;

    /* renamed from: h */
    public EditPreviewStickerViewModel f129203h;

    /* renamed from: i */
    public int f129204i;

    /* renamed from: j */
    public int f129205j;

    /* renamed from: k */
    public int f129206k;

    /* renamed from: l */
    public int f129207l;

    /* renamed from: t */
    public int f129208t;

    /* renamed from: u */
    public int f129209u;

    /* renamed from: v */
    public int f129210v;

    /* renamed from: w */
    public int f129211w;

    /* renamed from: x */
    public String f129212x;

    /* renamed from: y */
    public String f129213y;

    /* renamed from: z */
    public boolean f129214z;

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.a.b$x */
    static final class C56703x<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C56703x f129242a = new C56703x();

        static {
            Covode.recordClassIndex(66553);
        }

        C56703x() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.a.b$y */
    static final class C56704y<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C56704y f129243a = new C56704y();

        static {
            Covode.recordClassIndex(66554);
        }

        C56704y() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(66529);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.a.b$a */
    public static final class C56680a {
        static {
            Covode.recordClassIndex(66530);
        }

        private C56680a() {
        }

        public /* synthetic */ C56680a(byte b) {
            this();
        }
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    /* renamed from: a */
    public final boolean mo93571a() {
        if (this.f129180N == 1) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20534v
    public final AbstractC1204m getLifecycleOwner() {
        return AbstractC20382b.C20383a.m38581a(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20534v getLifecycleOwnerHolder() {
        return AbstractC20382b.C20383a.m38601b(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
        return AbstractC20382b.C20383a.m38604c(this);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: n_ */
    public final void mo22713n_() {
        super.mo22713n_();
        this.f129196ad.dispose();
    }

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.a.b$b */
    public static final class C56681b implements AnimationPathView.AbstractC56730b {

        /* renamed from: a */
        final /* synthetic */ C56679b f129215a;

        static {
            Covode.recordClassIndex(66531);
        }

        @Override // com.p2082ss.android.ugc.aweme.infoSticker.widget.AnimationPathView.AbstractC56730b
        /* renamed from: a */
        public final void mo93575a() {
            if (!this.f129215a.f129179M) {
                this.f129215a.f129179M = true;
                this.f129215a.mo93573d();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56681b(C56679b bVar) {
            this.f129215a = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.a.b$t */
    public static final class C56699t implements AnimationPathView.AbstractC56730b {

        /* renamed from: a */
        final /* synthetic */ C56679b f129233a;

        /* renamed from: b */
        final /* synthetic */ File f129234b;

        /* renamed from: c */
        final /* synthetic */ Location f129235c;

        /* renamed from: d */
        final /* synthetic */ List f129236d;

        static {
            Covode.recordClassIndex(66549);
        }

        @Override // com.p2082ss.android.ugc.aweme.infoSticker.widget.AnimationPathView.AbstractC56730b
        /* renamed from: a */
        public final void mo93575a() {
            if (!this.f129233a.f129179M) {
                this.f129233a.f129179M = true;
                this.f129233a.mo93568a(this.f129234b, this.f129235c, this.f129236d);
            }
        }

        C56699t(C56679b bVar, File file, Location location, List list) {
            this.f129233a = bVar;
            this.f129234b = file;
            this.f129235c = location;
            this.f129236d = list;
        }
    }

    /* renamed from: b */
    public final boolean mo93572b() {
        if (this.f129180N == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.a.b$z */
    static final class C56705z implements AbstractC88428a {

        /* renamed from: a */
        final /* synthetic */ C56679b f129244a;

        static {
            Covode.recordClassIndex(66555);
        }

        C56705z(C56679b bVar) {
            this.f129244a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88428a
        /* renamed from: a */
        public final void mo8579a() {
            C56679b bVar = this.f129244a;
            C20766v a = C20761r.m39057a(C84896h.m145871d(bVar.f129212x));
            a.f49106c = true;
            a.f49125v = EnumC20767w.FIT_CENTER;
            SmartImageView smartImageView = bVar.f129192a;
            if (smartImageView == null) {
                C89219l.m154710a("originalView");
            }
            a.f49092E = smartImageView;
            a.mo34181a(new C56697r(bVar));
        }
    }

    /* renamed from: D */
    private final void m102670D() {
        if (this.f129182P == null) {
            ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(500L);
            this.f129182P = duration;
            if (duration == null) {
                C89219l.m154715b();
            }
            duration.setRepeatCount(0);
            duration.addUpdateListener(new C56683d(this));
        }
    }

    /* renamed from: d */
    public final void mo93573d() {
        this.f129177K = true;
        AnimationPathView animationPathView = this.f129201f;
        if (animationPathView == null) {
            C89219l.m154710a("reactView");
        }
        animationPathView.setCompleteListener(null);
        AnimationPathView animationPathView2 = this.f129201f;
        if (animationPathView2 == null) {
            C89219l.m154710a("reactView");
        }
        animationPathView2.setShowAnimation(false);
        AnimationPathView animationPathView3 = this.f129201f;
        if (animationPathView3 == null) {
            C89219l.m154710a("reactView");
        }
        animationPathView3.setVisibility(4);
        mo93574d(2131230942);
        if (this.f129182P == null) {
            m102670D();
        }
        ValueAnimator valueAnimator = this.f129182P;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            ValueAnimator valueAnimator2 = this.f129182P;
            if (valueAnimator2 != null) {
                valueAnimator2.start();
            }
            ValueAnimator valueAnimator3 = this.f129182P;
            if (valueAnimator3 != null) {
                valueAnimator3.addListener(new C56698s(this));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.a.b$u */
    static final class RunnableC56700u implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C56679b f129237a;

        static {
            Covode.recordClassIndex(66550);
        }

        RunnableC56700u(C56679b bVar) {
            this.f129237a = bVar;
        }

        public final void run() {
            SmartImageView smartImageView = this.f129237a.f129197b;
            if (smartImageView == null) {
                C89219l.m154710a("cutoutView");
            }
            smartImageView.setAlpha(1.0f);
            C56679b bVar = this.f129237a;
            AnimationPathView animationPathView = bVar.f129202g;
            if (animationPathView == null) {
                C89219l.m154710a("maskPathView");
            }
            animationPathView.setVisibility(4);
            AnimatorSet animatorSet = new AnimatorSet();
            ValueAnimator duration = ValueAnimator.ofFloat(0.4f, 0.0f).setDuration(200L);
            duration.addUpdateListener(new C56682c(bVar));
            C89219l.m154716b(duration, "");
            ValueAnimator duration2 = ValueAnimator.ofFloat(0.75f, 1.0f).setDuration(500L);
            duration2.setRepeatCount(0);
            duration2.addUpdateListener(new C56685f(bVar));
            duration2.addListener(new C56686g(bVar));
            C89219l.m154716b(duration2, "");
            animatorSet.playSequentially(duration, duration2);
            animatorSet.start();
        }
    }

    /* renamed from: C */
    public final void mo93567C() {
        String str = this.f129186T;
        String str2 = this.f129187U;
        C39162r.m79460a("click_remove_background", new C84425b().mo129406a("enter_from", "video_edit_page").mo129406a("shoot_way", str).mo129406a("content_source", str2).mo129406a("content_type", this.f129188V).mo129406a("creation_id", this.f129189W).f188764a);
        if (!this.f129214z && !mo93571a() && !this.f129177K) {
            AVDmtImageView aVDmtImageView = this.f129199d;
            if (aVDmtImageView == null) {
                C89219l.m154710a("cutoutIV");
            }
            aVDmtImageView.setAlpha(1.0f);
            TextView textView = this.f129200e;
            if (textView == null) {
                C89219l.m154710a("cutoutTv");
            }
            textView.setAlpha(1.0f);
            int i = this.f129180N;
            if (i == 3 || i == 0) {
                if (!mo93571a()) {
                    this.f129178L = false;
                    this.f129180N = 1;
                    AVDmtImageView aVDmtImageView2 = this.f129199d;
                    if (aVDmtImageView2 == null) {
                        C89219l.m154710a("cutoutIV");
                    }
                    aVDmtImageView2.setAlpha(0.4f);
                    TextView textView2 = this.f129200e;
                    if (textView2 == null) {
                        C89219l.m154710a("cutoutTv");
                    }
                    textView2.setAlpha(0.4f);
                    TextView textView3 = this.f129193aa;
                    if (textView3 == null) {
                        C89219l.m154710a("useStickerView");
                    }
                    textView3.setAlpha(0.4f);
                    TextView textView4 = this.f129193aa;
                    if (textView4 == null) {
                        C89219l.m154710a("useStickerView");
                    }
                    textView4.setEnabled(false);
                    TextView textView5 = this.f129200e;
                    if (textView5 == null) {
                        C89219l.m154710a("cutoutTv");
                    }
                    textView5.setText(R.string.axl);
                    if (this.f129181O == null) {
                        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(500L);
                        this.f129181O = duration;
                        if (duration == null) {
                            C89219l.m154715b();
                        }
                        duration.setRepeatCount(0);
                        duration.addUpdateListener(new C56684e(this));
                    }
                    ValueAnimator valueAnimator = this.f129181O;
                    if (valueAnimator != null) {
                        valueAnimator.start();
                        valueAnimator.addListener(new C56687h(this));
                    }
                }
            } else if (mo93572b()) {
                boolean z = !this.f129174H;
                this.f129174H = z;
                if (z) {
                    AVDmtImageView aVDmtImageView3 = this.f129199d;
                    if (aVDmtImageView3 == null) {
                        C89219l.m154710a("cutoutIV");
                    }
                    aVDmtImageView3.setImageResource(2131230941);
                    TextView textView6 = this.f129200e;
                    if (textView6 == null) {
                        C89219l.m154710a("cutoutTv");
                    }
                    textView6.setText(R.string.axm);
                    SmartImageView smartImageView = this.f129197b;
                    if (smartImageView == null) {
                        C89219l.m154710a("cutoutView");
                    }
                    SmartImageView smartImageView2 = this.f129192a;
                    if (smartImageView2 == null) {
                        C89219l.m154710a("originalView");
                    }
                    m102672a(smartImageView, smartImageView2);
                    return;
                }
                AVDmtImageView aVDmtImageView4 = this.f129199d;
                if (aVDmtImageView4 == null) {
                    C89219l.m154710a("cutoutIV");
                }
                aVDmtImageView4.setImageResource(2131230942);
                TextView textView7 = this.f129200e;
                if (textView7 == null) {
                    C89219l.m154710a("cutoutTv");
                }
                textView7.setText(R.string.axm);
                SmartImageView smartImageView3 = this.f129192a;
                if (smartImageView3 == null) {
                    C89219l.m154710a("originalView");
                }
                SmartImageView smartImageView4 = this.f129197b;
                if (smartImageView4 == null) {
                    C89219l.m154710a("cutoutView");
                }
                m102672a(smartImageView3, smartImageView4);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.a.b$g */
    public static final class C56686g implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C56679b f129220a;

        static {
            Covode.recordClassIndex(66536);
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        C56686g(C56679b bVar) {
            this.f129220a = bVar;
        }

        public final void onAnimationCancel(Animator animator) {
            this.f129220a.f129180N = 2;
            this.f129220a.f129176J = false;
            this.f129220a.mo93574d(2131230941);
        }

        public final void onAnimationEnd(Animator animator) {
            this.f129220a.f129180N = 2;
            this.f129220a.f129176J = false;
            this.f129220a.mo93574d(2131230941);
        }

        public final void onAnimationStart(Animator animator) {
            C56679b.m102673b(this.f129220a).setVisibility(4);
            C56679b.m102673b(this.f129220a).setAlpha(1.0f);
            C56679b.m102673b(this.f129220a).setScaleX(1.0f);
            C56679b.m102673b(this.f129220a).setScaleY(1.0f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.a.b$h */
    public static final class C56687h implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C56679b f129221a;

        static {
            Covode.recordClassIndex(66537);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        C56687h(C56679b bVar) {
            this.f129221a = bVar;
        }

        public final void onAnimationStart(Animator animator) {
            ValueAnimator valueAnimator = this.f129221a.f129181O;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
            }
        }

        public final void onAnimationEnd(Animator animator) {
            if (!this.f129221a.f129178L) {
                this.f129221a.f129179M = false;
                C56679b.m102675d(this.f129221a).setPoints(this.f129221a.f129183Q);
                C56679b.m102675d(this.f129221a).setShowAnimation(true);
                C56679b.m102675d(this.f129221a).setVisibility(0);
                EditPreviewStickerViewModel a = C56679b.m102671a(this.f129221a);
                String str = this.f129221a.f129184R.f134662b;
                C89219l.m154716b(str, "");
                Effect effect = this.f129221a.f129185S;
                C89219l.m154721d(str, "");
                if (C84902i.m145892a(str)) {
                    a.f129137a = new C88411a();
                    int[] iArr = {1280, 720};
                    if (effect != null) {
                        CustomStickerExtra customStickerExtra = (CustomStickerExtra) C63244g.m114602a().mo73261G().mo46670a(effect.getExtra(), CustomStickerExtra.class);
                        if (customStickerExtra.getUploadHeightLimit() > 0) {
                            iArr[0] = customStickerExtra.getUploadHeightLimit();
                        }
                        if (customStickerExtra.getUploadWidthLimit() > 0) {
                            iArr[1] = customStickerExtra.getUploadWidthLimit();
                        }
                    }
                    C88411a aVar = a.f129137a;
                    if (aVar == null || !aVar.isDisposed()) {
                        AbstractC88412b a2 = AbstractC88979t.m154294a(new EditPreviewStickerViewModel.C56665d(a, str, iArr)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143254a(new EditPreviewStickerViewModel.C56666e(a), new EditPreviewStickerViewModel.C56669f(a));
                        C88411a aVar2 = a.f129137a;
                        if (aVar2 != null) {
                            aVar2.mo142945a(a2);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.a.b$i */
    public static final class C56688i extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ C56679b f129222a;

        static {
            Covode.recordClassIndex(66538);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56688i(C56679b bVar) {
            this.f129222a = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:28:0x0109  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0131  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x013b  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x013f  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0141  */
        /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo77200a(android.view.View r11) {
            /*
            // Method dump skipped, instructions count: 356
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.infoSticker.customsticker.p3289a.C56679b.C56688i.mo77200a(android.view.View):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.a.b$j */
    public static final class C56689j extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ C56679b f129223a;

        static {
            Covode.recordClassIndex(66539);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56689j(C56679b bVar) {
            this.f129223a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            this.f129223a.mo93567C();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.a.b$k */
    public static final class C56690k extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ C56679b f129224a;

        static {
            Covode.recordClassIndex(66540);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56690k(C56679b bVar) {
            this.f129224a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            this.f129224a.mo93567C();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.a.b$l */
    public static final class C56691l extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ C56679b f129225a;

        static {
            Covode.recordClassIndex(66541);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56691l(C56679b bVar) {
            this.f129225a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            this.f129225a.mo93567C();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.a.b$m */
    public static final class C56692m extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ C56679b f129226a;

        static {
            Covode.recordClassIndex(66542);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56692m(C56679b bVar) {
            this.f129226a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            if (this.f129226a.mo93572b()) {
                Activity activity = this.f129226a.f52549m;
                if (activity != null) {
                    activity.onBackPressed();
                }
            } else if (!this.f129226a.f129176J) {
                if (this.f129226a.mo93571a()) {
                    C56679b.m102671a(this.f129226a).mo93565a();
                    return;
                }
                Activity activity2 = this.f129226a.f52549m;
                if (activity2 != null) {
                    activity2.onBackPressed();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.a.b$r */
    public static final class C56697r implements AbstractC20734k {

        /* renamed from: a */
        final /* synthetic */ C56679b f129231a;

        static {
            Covode.recordClassIndex(66547);
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
        /* renamed from: a */
        public final void mo34146a(Uri uri) {
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
        /* renamed from: a */
        public final void mo34147a(Uri uri, View view) {
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
        /* renamed from: a */
        public final void mo34148a(Uri uri, C20758o oVar) {
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
        /* renamed from: a */
        public final void mo34149a(Uri uri, Throwable th) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56697r(C56679b bVar) {
            this.f129231a = bVar;
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
        /* renamed from: a */
        public final void mo34159a(Uri uri, View view, Throwable th) {
            String str;
            this.f129231a.f129175I = false;
            StringBuilder sb = new StringBuilder("Load Custom Sticker Error, file path: ");
            if (uri != null) {
                str = uri.getPath();
            } else {
                str = null;
            }
            C40970e.m82485a(sb.append(str).toString());
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
        /* renamed from: a */
        public final void mo34158a(Uri uri, View view, C20758o oVar, Animatable animatable) {
            this.f129231a.f129175I = true;
            if (animatable != null || !C63244g.m114602a().mo73255A().mo93903b() || (Build.VERSION.SDK_INT <= 23 && !SettingsManager.m29616a().mo25400a("creative_support_cutout_under_M", true))) {
                this.f129231a.f129214z = true;
                C56679b bVar = this.f129231a;
                TextView textView = bVar.f129200e;
                if (textView == null) {
                    C89219l.m154710a("cutoutTv");
                }
                textView.setVisibility(4);
                AVDmtImageView aVDmtImageView = bVar.f129199d;
                if (aVDmtImageView == null) {
                    C89219l.m154710a("cutoutIV");
                }
                aVDmtImageView.setVisibility(4);
            } else {
                this.f129231a.f129214z = false;
                C56679b bVar2 = this.f129231a;
                TextView textView2 = bVar2.f129200e;
                if (textView2 == null) {
                    C89219l.m154710a("cutoutTv");
                }
                textView2.setVisibility(0);
                AVDmtImageView aVDmtImageView2 = bVar2.f129199d;
                if (aVDmtImageView2 == null) {
                    C89219l.m154710a("cutoutIV");
                }
                aVDmtImageView2.setVisibility(0);
            }
            if (!this.f129231a.f129167A && oVar != null) {
                int width = C56679b.m102673b(this.f129231a).getWidth();
                int height = C56679b.m102673b(this.f129231a).getHeight();
                float f = (float) width;
                float f2 = (float) height;
                float f3 = ((float) this.f129231a.f129204i) / ((float) this.f129231a.f129205j);
                if (f3 > f / f2) {
                    this.f129231a.f129209u = width;
                    C56679b bVar3 = this.f129231a;
                    bVar3.f129208t = (int) (((float) bVar3.f129209u) / f3);
                } else {
                    this.f129231a.f129208t = height;
                    C56679b bVar4 = this.f129231a;
                    bVar4.f129209u = (int) (((float) bVar4.f129208t) * f3);
                }
                C56679b bVar5 = this.f129231a;
                bVar5.f129168B = (((float) bVar5.f129204i) * 1.0f) / ((float) this.f129231a.f129209u);
                C56679b bVar6 = this.f129231a;
                bVar6.f129169C = (((float) bVar6.f129206k) * 1.0f) / ((float) this.f129231a.f129209u);
                C56679b bVar7 = this.f129231a;
                bVar7.f129172F = (width - bVar7.f129209u) / 2;
                C56679b bVar8 = this.f129231a;
                bVar8.f129173G = (height - bVar8.f129208t) / 2;
                C56679b bVar9 = this.f129231a;
                bVar9.f129170D = bVar9.f129172F;
                C56679b bVar10 = this.f129231a;
                bVar10.f129171E = bVar10.f129173G;
                float f4 = (f - (((float) this.f129231a.f129209u) * 0.75f)) / 2.0f;
                float f5 = (f2 - (((float) this.f129231a.f129208t) * 0.75f)) / 2.0f;
                ArrayList<Coordinate> arrayList = new ArrayList<>();
                arrayList.add(new Coordinate((((float) this.f129231a.f129209u) * 0.75f) + f4, f5));
                arrayList.add(new Coordinate((((float) this.f129231a.f129209u) * 0.75f) + f4, (((float) this.f129231a.f129208t) * 0.75f) + f5));
                arrayList.add(new Coordinate(f4, (((float) this.f129231a.f129208t) * 0.75f) + f5));
                arrayList.add(new Coordinate(f4, f5));
                this.f129231a.f129183Q.add(arrayList);
                this.f129231a.f129167A = true;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.a.b$s */
    public static final class C56698s implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C56679b f129232a;

        static {
            Covode.recordClassIndex(66548);
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56698s(C56679b bVar) {
            this.f129232a = bVar;
        }

        public final void onAnimationCancel(Animator animator) {
            this.f129232a.f129180N = 3;
            this.f129232a.f129177K = false;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f129232a.f129180N = 3;
            this.f129232a.f129177K = false;
        }

        public final void onAnimationStart(Animator animator) {
            ValueAnimator valueAnimator = this.f129232a.f129182P;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ EditPreviewStickerViewModel m102671a(C56679b bVar) {
        EditPreviewStickerViewModel editPreviewStickerViewModel = bVar.f129203h;
        if (editPreviewStickerViewModel == null) {
            C89219l.m154710a("viewModel");
        }
        return editPreviewStickerViewModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ SmartImageView m102673b(C56679b bVar) {
        SmartImageView smartImageView = bVar.f129192a;
        if (smartImageView == null) {
            C89219l.m154710a("originalView");
        }
        return smartImageView;
    }

    /* renamed from: c */
    public static final /* synthetic */ RelativeLayout m102674c(C56679b bVar) {
        RelativeLayout relativeLayout = bVar.f129198c;
        if (relativeLayout == null) {
            C89219l.m154710a("maskContainer");
        }
        return relativeLayout;
    }

    /* renamed from: d */
    public static final /* synthetic */ AnimationPathView m102675d(C56679b bVar) {
        AnimationPathView animationPathView = bVar.f129201f;
        if (animationPathView == null) {
            C89219l.m154710a("reactView");
        }
        return animationPathView;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.a.b$c */
    static final class C56682c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C56679b f129216a;

        static {
            Covode.recordClassIndex(66532);
        }

        C56682c(C56679b bVar) {
            this.f129216a = bVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            C56679b.m102673b(this.f129216a).setAlpha(((Float) animatedValue).floatValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.a.b$d */
    public static final class C56683d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C56679b f129217a;

        static {
            Covode.recordClassIndex(66533);
        }

        C56683d(C56679b bVar) {
            this.f129217a = bVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            float f = (-0.25f * floatValue) + 1.0f;
            C56679b.m102673b(this.f129217a).setScaleX(f);
            C56679b.m102673b(this.f129217a).setScaleY(f);
            C56679b.m102673b(this.f129217a).setAlpha((floatValue * -0.6f) + 1.0f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.a.b$e */
    public static final class C56684e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C56679b f129218a;

        static {
            Covode.recordClassIndex(66534);
        }

        C56684e(C56679b bVar) {
            this.f129218a = bVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            float f = (-0.25f * floatValue) + 1.0f;
            C56679b.m102673b(this.f129218a).setScaleX(f);
            C56679b.m102673b(this.f129218a).setScaleY(f);
            C56679b.m102673b(this.f129218a).setAlpha((floatValue * -0.6f) + 1.0f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.a.b$f */
    static final class C56685f implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C56679b f129219a;

        static {
            Covode.recordClassIndex(66535);
        }

        C56685f(C56679b bVar) {
            this.f129219a = bVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            C56679b.m102674c(this.f129219a).setScaleX(floatValue);
            C56679b.m102674c(this.f129219a).setScaleY(floatValue);
        }
    }

    /* renamed from: a */
    public final void mo93569a(String str) {
        C40982q.m82520a("custom_sticker_imageclip_rate", 1, (JSONObject) null);
        if (str != null) {
            new C79459a(mo36484r()).mo123052a(str).mo123053a();
        }
        mo93570a(false);
    }

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.a.b$w */
    static final class C56702w<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ C56679b f129241a;

        static {
            Covode.recordClassIndex(66552);
        }

        C56702w(C56679b bVar) {
            this.f129241a = bVar;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(AbstractC88982v<Void> vVar) {
            File a;
            MethodCollector.m26663i(11834);
            C89219l.m154721d(vVar, "");
            MediaModel mediaModel = this.f129241a.f129184R;
            C89219l.m154721d(mediaModel, "");
            String str = mediaModel.f134662b;
            C89219l.m154716b(str, "");
            int a2 = C56714a.m102716a(str);
            if (a2 != 0) {
                Bitmap a3 = C84896h.m145856a(mediaModel.f134662b, (BitmapFactory.Options) null);
                Matrix matrix = new Matrix();
                matrix.postRotate((float) a2);
                if (!(a3 == null || (a = C56714a.m102718a(Bitmap.createBitmap(a3, 0, 0, a3.getWidth(), a3.getHeight(), matrix, true))) == null)) {
                    mediaModel.f134662b = a.getAbsolutePath();
                }
            }
            C56679b bVar = this.f129241a;
            bVar.f129212x = bVar.f129184R.f134662b;
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            options.inScaled = false;
            C84896h.m145856a(bVar.f129212x, options);
            bVar.f129204i = options.outWidth;
            bVar.f129205j = options.outHeight;
            bVar.f129206k = bVar.f129204i;
            bVar.f129207l = bVar.f129205j;
            if (this.f129241a.f129205j <= 0 || this.f129241a.f129204i <= 0) {
                vVar.mo143024a(new IllegalStateException("Calculate image size error."));
                MethodCollector.m26664o(11834);
                return;
            }
            vVar.mo143023a();
            MethodCollector.m26664o(11834);
        }
    }

    /* renamed from: d */
    public final void mo93574d(int i) {
        AVDmtImageView aVDmtImageView = this.f129199d;
        if (aVDmtImageView == null) {
            C89219l.m154710a("cutoutIV");
        }
        aVDmtImageView.setAlpha(1.0f);
        AVDmtImageView aVDmtImageView2 = this.f129199d;
        if (aVDmtImageView2 == null) {
            C89219l.m154710a("cutoutIV");
        }
        aVDmtImageView2.setImageResource(i);
        TextView textView = this.f129200e;
        if (textView == null) {
            C89219l.m154710a("cutoutTv");
        }
        textView.setAlpha(1.0f);
        TextView textView2 = this.f129200e;
        if (textView2 == null) {
            C89219l.m154710a("cutoutTv");
        }
        textView2.setText(R.string.axm);
        TextView textView3 = this.f129193aa;
        if (textView3 == null) {
            C89219l.m154710a("useStickerView");
        }
        textView3.setAlpha(1.0f);
        TextView textView4 = this.f129193aa;
        if (textView4 == null) {
            C89219l.m154710a("useStickerView");
        }
        textView4.setEnabled(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo93570a(boolean z) {
        this.f129174H = false;
        if (!z) {
            StringBuilder sb = new StringBuilder("EditPreviewStickerScene#cancelCutout : ");
            AnimationPathView animationPathView = this.f129201f;
            if (animationPathView == null) {
                C89219l.m154710a("reactView");
            }
            C84911q.m145928d(sb.append(animationPathView.mo93676a()).toString());
            AnimationPathView animationPathView2 = this.f129201f;
            if (animationPathView2 == null) {
                C89219l.m154710a("reactView");
            }
            if (animationPathView2.mo93676a()) {
                AnimationPathView animationPathView3 = this.f129201f;
                if (animationPathView3 == null) {
                    C89219l.m154710a("reactView");
                }
                animationPathView3.setCompleteListener(new C56681b(this));
                return;
            }
        }
        mo93573d();
    }

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.a.b$v */
    public static final class C56701v implements AbstractC20734k {

        /* renamed from: a */
        public boolean f129238a;

        /* renamed from: b */
        final /* synthetic */ C56679b f129239b;

        /* renamed from: c */
        final /* synthetic */ List f129240c;

        static {
            Covode.recordClassIndex(66551);
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
        /* renamed from: a */
        public final void mo34146a(Uri uri) {
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
        /* renamed from: a */
        public final void mo34147a(Uri uri, View view) {
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
        /* renamed from: a */
        public final void mo34159a(Uri uri, View view, Throwable th) {
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
        /* renamed from: a */
        public final void mo34148a(Uri uri, C20758o oVar) {
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
        /* renamed from: a */
        public final void mo34149a(Uri uri, Throwable th) {
        }

        C56701v(C56679b bVar, List list) {
            this.f129239b = bVar;
            this.f129240c = list;
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
        /* renamed from: a */
        public final void mo34158a(Uri uri, View view, C20758o oVar, Animatable animatable) {
            if (!this.f129238a) {
                this.f129238a = true;
                C56679b bVar = this.f129239b;
                List<? extends List<Coordinate>> list = this.f129240c;
                if (oVar != null) {
                    bVar.f129210v = oVar.f48988a;
                    bVar.f129211w = oVar.f48989b;
                }
                RelativeLayout relativeLayout = bVar.f129198c;
                if (relativeLayout == null) {
                    C89219l.m154710a("maskContainer");
                }
                relativeLayout.setScaleX(0.75f);
                RelativeLayout relativeLayout2 = bVar.f129198c;
                if (relativeLayout2 == null) {
                    C89219l.m154710a("maskContainer");
                }
                relativeLayout2.setScaleY(0.75f);
                AnimationPathView animationPathView = bVar.f129201f;
                if (animationPathView == null) {
                    C89219l.m154710a("reactView");
                }
                animationPathView.setShowAnimation(false);
                AnimationPathView animationPathView2 = bVar.f129201f;
                if (animationPathView2 == null) {
                    C89219l.m154710a("reactView");
                }
                animationPathView2.setVisibility(4);
                AnimationPathView animationPathView3 = bVar.f129202g;
                if (animationPathView3 == null) {
                    C89219l.m154710a("maskPathView");
                }
                float f = (float) bVar.f129170D;
                float f2 = (float) bVar.f129171E;
                float f3 = bVar.f129169C;
                C89219l.m154721d(list, "");
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    for (Coordinate coordinate : it.next()) {
                        coordinate.setX((coordinate.getX() / f3) + f);
                        coordinate.setY((coordinate.getY() / f3) + f2);
                    }
                }
                animationPathView3.setPoints(list);
                AnimationPathView animationPathView4 = bVar.f129202g;
                if (animationPathView4 == null) {
                    C89219l.m154710a("maskPathView");
                }
                animationPathView4.setShowAnimation(true);
                AnimationPathView animationPathView5 = bVar.f129202g;
                if (animationPathView5 == null) {
                    C89219l.m154710a("maskPathView");
                }
                animationPathView5.postDelayed(new RunnableC56700u(bVar), 1200);
            }
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.a.b$q */
    static final class C56696q extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C20526p, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C56679b f129230a;

        static {
            Covode.recordClassIndex(66546);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56696q(C56679b bVar) {
            super(2);
            this.f129230a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C20526p pVar) {
            C89219l.m154721d(iVar, "");
            if (pVar != null) {
                this.f129230a.f129178L = true;
                this.f129230a.mo93570a(true);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private static void m102672a(SmartImageView smartImageView, SmartImageView smartImageView2) {
        smartImageView.setVisibility(0);
        smartImageView2.setVisibility(4);
    }

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.a.b$o */
    static final class C56694o extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89378p<? extends Integer, ? extends Integer>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C56679b f129228a;

        static {
            Covode.recordClassIndex(66544);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56694o(C56679b bVar) {
            super(2);
            this.f129228a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89378p<? extends Integer, ? extends Integer> pVar) {
            C89378p<? extends Integer, ? extends Integer> pVar2 = pVar;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(pVar2, "");
            this.f129228a.f129206k = ((Number) pVar2.getFirst()).intValue();
            this.f129228a.f129207l = ((Number) pVar2.getSecond()).intValue();
            C56679b bVar2 = this.f129228a;
            bVar2.f129169C = (((float) bVar2.f129206k) * 1.0f) / ((float) this.f129228a.f129209u);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.a.b$p */
    static final class C56695p extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C56713a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C56679b f129229a;

        static {
            Covode.recordClassIndex(66545);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56695p(C56679b bVar) {
            super(2);
            this.f129229a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C56713a aVar) {
            C56713a aVar2 = aVar;
            C89219l.m154721d(iVar, "");
            if (aVar2 != null) {
                C56679b bVar = this.f129229a;
                String message = aVar2.getMessage();
                if (message == null) {
                    message = this.f129229a.mo36476c_(R.string.axs);
                    C89219l.m154716b(message, "");
                }
                bVar.mo93569a(message);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.asb, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.a.b$n */
    static final class C56693n extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, CutoutData, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C56679b f129227a;

        static {
            Covode.recordClassIndex(66543);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56693n(C56679b bVar) {
            super(2);
            this.f129227a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, CutoutData cutoutData) {
            CutoutData cutoutData2 = cutoutData;
            C89219l.m154721d(iVar, "");
            if (cutoutData2 != null) {
                if (cutoutData2.checkData()) {
                    this.f129227a.f129174H = true;
                    C56679b bVar = this.f129227a;
                    Location location = cutoutData2.getLocation();
                    if (location == null) {
                        C89219l.m154715b();
                    }
                    File image = cutoutData2.getImage();
                    if (image == null) {
                        C89219l.m154715b();
                    }
                    List<List<Coordinate>> contours = cutoutData2.getContours();
                    if (!bVar.f129176J) {
                        C40982q.m82520a("custom_sticker_imageclip_rate", 0, (JSONObject) null);
                        bVar.f129176J = true;
                        StringBuilder sb = new StringBuilder("EditPreviewStickerScene#showCutOutImage : ");
                        AnimationPathView animationPathView = bVar.f129201f;
                        if (animationPathView == null) {
                            C89219l.m154710a("reactView");
                        }
                        C84911q.m145928d(sb.append(animationPathView.mo93676a()).toString());
                        AnimationPathView animationPathView2 = bVar.f129201f;
                        if (animationPathView2 == null) {
                            C89219l.m154710a("reactView");
                        }
                        if (animationPathView2.mo93676a()) {
                            AnimationPathView animationPathView3 = bVar.f129201f;
                            if (animationPathView3 == null) {
                                C89219l.m154710a("reactView");
                            }
                            animationPathView3.setCompleteListener(new C56699t(bVar, image, location, contours));
                        } else {
                            bVar.mo93568a(image, location, contours);
                        }
                    }
                } else {
                    C56679b bVar2 = this.f129227a;
                    bVar2.mo93569a(bVar2.mo36476c_(R.string.axs));
                }
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo36473a(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.mo36473a(view, bundle);
        View findViewById = view.findViewById(R.id.pf);
        C89219l.m154716b(findViewById, "");
        this.f129190Y = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.asf);
        C89219l.m154716b(findViewById2, "");
        this.f129192a = (SmartImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.asg);
        C89219l.m154716b(findViewById3, "");
        this.f129197b = (SmartImageView) findViewById3;
        View findViewById4 = view.findViewById(R.id.cii);
        C89219l.m154716b(findViewById4, "");
        this.f129198c = (RelativeLayout) findViewById4;
        View findViewById5 = view.findViewById(R.id.bhj);
        C89219l.m154716b(findViewById5, "");
        this.f129199d = (AVDmtImageView) findViewById5;
        View findViewById6 = view.findViewById(R.id.eut);
        C89219l.m154716b(findViewById6, "");
        this.f129200e = (TextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.a6i);
        C89219l.m154716b(findViewById7, "");
        this.f129191Z = findViewById7;
        View findViewById8 = view.findViewById(R.id.xx);
        C89219l.m154716b(findViewById8, "");
        this.f129193aa = (TextView) findViewById8;
        View findViewById9 = view.findViewById(R.id.jy);
        C89219l.m154716b(findViewById9, "");
        AnimationPathView animationPathView = (AnimationPathView) findViewById9;
        this.f129201f = animationPathView;
        if (animationPathView == null) {
            C89219l.m154710a("reactView");
        }
        animationPathView.setRepeatCount(-1);
        View findViewById10 = view.findViewById(R.id.cig);
        C89219l.m154716b(findViewById10, "");
        AnimationPathView animationPathView2 = (AnimationPathView) findViewById10;
        this.f129202g = animationPathView2;
        if (animationPathView2 == null) {
            C89219l.m154710a("maskPathView");
        }
        animationPathView2.setDynamicLength(true);
        AnimationPathView animationPathView3 = this.f129202g;
        if (animationPathView3 == null) {
            C89219l.m154710a("maskPathView");
        }
        animationPathView3.setRatio(0.8f);
        View findViewById11 = view.findViewById(R.id.elz);
        C89219l.m154716b(findViewById11, "");
        this.f129194ab = findViewById11;
        View findViewById12 = view.findViewById(R.id.v9);
        C89219l.m154716b(findViewById12, "");
        this.f129195ac = findViewById12;
        if (C68062ck.m120368a()) {
            ImageView imageView = this.f129190Y;
            if (imageView == null) {
                C89219l.m154710a("back");
            }
            imageView.setImageResource(2131232190);
            View view2 = this.f129194ab;
            if (view2 == null) {
                C89219l.m154710a("topShadow");
            }
            view2.setVisibility(8);
            View view3 = this.f129195ac;
            if (view3 == null) {
                C89219l.m154710a("bottomShadow");
            }
            view3.setVisibility(8);
        }
        TextView textView = this.f129193aa;
        if (textView == null) {
            C89219l.m154710a("useStickerView");
        }
        textView.setOnClickListener(new C56688i(this));
        AVDmtImageView aVDmtImageView = this.f129199d;
        if (aVDmtImageView == null) {
            C89219l.m154710a("cutoutIV");
        }
        aVDmtImageView.setOnClickListener(new C56689j(this));
        TextView textView2 = this.f129200e;
        if (textView2 == null) {
            C89219l.m154710a("cutoutTv");
        }
        textView2.setOnClickListener(new C56690k(this));
        View view4 = this.f129191Z;
        if (view4 == null) {
            C89219l.m154710a("cutoutHotZone");
        }
        view4.setOnClickListener(new C56691l(this));
        ImageView imageView2 = this.f129190Y;
        if (imageView2 == null) {
            C89219l.m154710a("back");
        }
        imageView2.setOnClickListener(new C56692m(this));
        this.f129196ad.mo142945a(AbstractC88979t.m154294a(new C56702w(this)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143255a(C56703x.f129242a, C56704y.f129243a, new C56705z(this)));
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a = C20531t.m38716a((ActivityC0945e) activity).mo33800a(EditPreviewStickerViewModel.class);
        C89219l.m154716b(a, "");
        EditPreviewStickerViewModel editPreviewStickerViewModel = (EditPreviewStickerViewModel) a;
        this.f129203h = editPreviewStickerViewModel;
        if (editPreviewStickerViewModel == null) {
            C89219l.m154710a("viewModel");
        }
        AbstractC88412b unused = selectSubscribe(editPreviewStickerViewModel, C56706c.f129245a, new C20370ah(), new C56693n(this));
        EditPreviewStickerViewModel editPreviewStickerViewModel2 = this.f129203h;
        if (editPreviewStickerViewModel2 == null) {
            C89219l.m154710a("viewModel");
        }
        AbstractC20382b.C20383a.m38603b(this, editPreviewStickerViewModel2, C56707d.f129246a, new C56694o(this));
        EditPreviewStickerViewModel editPreviewStickerViewModel3 = this.f129203h;
        if (editPreviewStickerViewModel3 == null) {
            C89219l.m154710a("viewModel");
        }
        AbstractC88412b unused2 = selectSubscribe(editPreviewStickerViewModel3, C56708e.f129247a, new C20370ah(), new C56695p(this));
        EditPreviewStickerViewModel editPreviewStickerViewModel4 = this.f129203h;
        if (editPreviewStickerViewModel4 == null) {
            C89219l.m154710a("viewModel");
        }
        AbstractC88412b unused3 = selectSubscribe(editPreviewStickerViewModel4, C56709f.f129248a, new C20370ah(), new C56696q(this));
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38583a(this, jediViewModel, ahVar, mVar);
    }

    /* renamed from: a */
    public final void mo93568a(File file, Location location, List<? extends List<Coordinate>> list) {
        AnimationPathView animationPathView = this.f129201f;
        if (animationPathView == null) {
            C89219l.m154710a("reactView");
        }
        animationPathView.setCompleteListener(null);
        this.f129213y = file.getAbsolutePath();
        float f = this.f129169C;
        C89219l.m154721d(location, "");
        Location location2 = new Location((int) (((float) location.getLeft()) / f), (int) (((float) location.getTop()) / f), (int) (((float) location.getWidth()) / f), (int) (((float) location.getHeight()) / f));
        this.f129172F += location2.getLeft();
        this.f129173G += location2.getTop();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(location2.getWidth(), location2.getHeight());
        layoutParams.addRule(9);
        layoutParams.setMargins(this.f129172F, this.f129173G, 0, 0);
        SmartImageView smartImageView = this.f129197b;
        if (smartImageView == null) {
            C89219l.m154710a("cutoutView");
        }
        smartImageView.setLayoutParams(layoutParams);
        SmartImageView smartImageView2 = this.f129197b;
        if (smartImageView2 == null) {
            C89219l.m154710a("cutoutView");
        }
        smartImageView2.setAlpha(0.0f);
        SmartImageView smartImageView3 = this.f129197b;
        if (smartImageView3 == null) {
            C89219l.m154710a("cutoutView");
        }
        smartImageView3.setVisibility(0);
        C20766v a = C20761r.m39059a(file);
        a.f49125v = EnumC20767w.FIT_CENTER;
        SmartImageView smartImageView4 = this.f129197b;
        if (smartImageView4 == null) {
            C89219l.m154710a("cutoutView");
        }
        a.f49092E = smartImageView4;
        a.mo34181a(new C56701v(this, list));
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38599a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38606d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void subscribeEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20391d<? extends A>> kVar, C20370ah<C20373ak<C20391d<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38602b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20365ac<? extends A>> kVar, C20370ah<C20373ak<C20365ac<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38605c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(qVar, "");
        return AbstractC20382b.C20383a.m38585a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super Throwable, C89391z> mVar, AbstractC89172b<? super AbstractC20477i, C89391z> bVar, AbstractC89183m<? super AbstractC20477i, ? super T, C89391z> mVar2) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        return AbstractC20382b.C20383a.m38584a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    public C56679b(MediaModel mediaModel, Effect effect, String str, String str2, String str3, String str4) {
        C89219l.m154721d(mediaModel, "");
        this.f129184R = mediaModel;
        this.f129185S = effect;
        this.f129186T = str;
        this.f129187U = str2;
        this.f129188V = str3;
        this.f129189W = str4;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super AbstractC20477i, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(rVar, "");
        return AbstractC20382b.C20383a.m38586a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
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
        return AbstractC20382b.C20383a.m38587a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
