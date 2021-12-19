package com.p2082ss.android.ugc.aweme.commercialize.playfun;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20758o;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20727d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.commercialize.p2571j.AbstractC38029b;
import com.p2082ss.android.ugc.aweme.commercialize.playfun.p2606a.C38283c;
import com.p2082ss.android.ugc.aweme.commercialize.playfun.p2606a.C38290g;
import com.p2082ss.android.ugc.aweme.commercialize.playfun.p2607b.C38293a;
import com.p2082ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemePlayFunModel;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2300h.C33278a;
import com.p2082ss.android.ugc.aweme.p2282ad.p2290d.C33178a;
import com.p2082ss.android.ugc.aweme.utils.C80534hh;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.AdPlayFunView */
public final class AdPlayFunView extends FrameLayout implements View.OnTouchListener {

    /* renamed from: a */
    public SmartImageView f90444a;

    /* renamed from: b */
    TextView f90445b;

    /* renamed from: c */
    public C38298e f90446c;

    /* renamed from: d */
    DataCenter f90447d;

    /* renamed from: e */
    public boolean f90448e;

    /* renamed from: f */
    public Aweme f90449f;

    /* renamed from: g */
    AwemePlayFunModel f90450g;

    /* renamed from: h */
    public boolean f90451h;

    /* renamed from: i */
    final C38270c f90452i;

    /* renamed from: j */
    private View f90453j;

    /* renamed from: k */
    private final AbstractC89244h f90454k;

    /* renamed from: l */
    private View f90455l;

    /* renamed from: m */
    private final C38269b f90456m;

    /* renamed from: n */
    private final GestureDetector f90457n;

    /* renamed from: o */
    private final View.OnLayoutChangeListener f90458o;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.AdPlayFunView$e */
    static final class C38272e implements AbstractC38029b {

        /* renamed from: a */
        public static final C38272e f90463a = new C38272e();

        static {
            Covode.recordClassIndex(45758);
        }

        C38272e() {
        }
    }

    static {
        Covode.recordClassIndex(45753);
    }

    public AdPlayFunView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: package-private */
    public final AbstractC38303i getAdDepend() {
        return (AbstractC38303i) this.f90454k.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.AdPlayFunView$a */
    static final class C38268a extends AbstractC89220m implements AbstractC89171a<AbstractC38303i> {

        /* renamed from: a */
        public static final C38268a f90459a = new C38268a();

        static {
            Covode.recordClassIndex(45754);
        }

        C38268a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC38303i invoke() {
            return CommercializeAdServiceImpl.m79243a().mo67720a(19);
        }
    }

    public final C38298e getStateContext() {
        C38298e eVar = this.f90446c;
        if (eVar == null) {
            C89219l.m154710a("stateContext");
        }
        return eVar;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        View findViewById = ((ViewGroup) parent).findViewById(R.id.p7);
        this.f90455l = findViewById;
        if (findViewById != null) {
            findViewById.addOnLayoutChangeListener(this.f90458o);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C38298e eVar = this.f90446c;
        if (eVar == null) {
            C89219l.m154710a("stateContext");
        }
        eVar.mo66889a();
        View view = this.f90455l;
        if (view != null) {
            view.removeOnLayoutChangeListener(this.f90458o);
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.fa);
        C89219l.m154716b(findViewById, "");
        this.f90444a = (SmartImageView) findViewById;
        View findViewById2 = findViewById(R.id.fb);
        C89219l.m154716b(findViewById2, "");
        this.f90445b = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.f_);
        C89219l.m154716b(findViewById3, "");
        this.f90453j = findViewById3;
        SmartImageView smartImageView = this.f90444a;
        if (smartImageView == null) {
            C89219l.m154710a("eggImageView");
        }
        smartImageView.setOnTouchListener(this);
        TextView textView = this.f90445b;
        if (textView == null) {
            C89219l.m154710a("eggTitleView");
        }
        textView.setOnTouchListener(this);
        View view = this.f90453j;
        if (view == null) {
            C89219l.m154710a("eggBackgroundView");
        }
        view.setOnTouchListener(this);
        this.f90446c = new C38298e(this);
    }

    /* renamed from: a */
    public final C38296c mo66854a() {
        int b;
        int a;
        View findViewById;
        C38296c cVar = new C38296c();
        int a2 = C13628n.m24504a(getContext());
        Context context = getContext();
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity == null || (findViewById = activity.findViewById(R.id.dm4)) == null) {
            b = C80534hh.m139609b();
        } else {
            b = C38300f.m77693a(findViewById) + findViewById.getHeight();
        }
        View view = this.f90455l;
        if (view != null) {
            a = C38300f.m77693a(view);
        } else {
            a = C38300f.m77693a(this) + getHeight();
        }
        TextView textView = this.f90445b;
        if (textView == null) {
            C89219l.m154710a("eggTitleView");
        }
        textView.measure(0, 0);
        TextView textView2 = this.f90445b;
        if (textView2 == null) {
            C89219l.m154710a("eggTitleView");
        }
        int measuredHeight = textView2.getMeasuredHeight();
        float f = (float) a2;
        cVar.f90505a = (int) (0.587f * f);
        float b2 = ((float) (a - b)) - (((float) (cVar.f90505a + measuredHeight)) + (C13628n.m24520b(getContext(), 16.0f) * 2.0f));
        if (b2 >= 0.0f) {
            cVar.f90506b = ((float) b) + (b2 / 2.0f) + C13628n.m24520b(getContext(), 16.0f);
        } else {
            cVar.f90505a += (int) b2;
            cVar.f90506b = ((float) b) + C13628n.m24520b(getContext(), 16.0f);
        }
        cVar.f90507c = (f - ((float) cVar.f90505a)) / 2.0f;
        cVar.f90508d = C13628n.m24520b(getContext(), 86.0f) / ((float) cVar.f90505a);
        return cVar;
    }

    /* renamed from: b */
    public final void mo66856b() {
        C38298e eVar = this.f90446c;
        if (eVar == null) {
            C89219l.m154710a("stateContext");
        }
        if (!C89219l.m154714a((Object) eVar.f90512b, (Object) "IdleState") && !C89219l.m154714a((Object) eVar.f90512b, (Object) "WidgetShowState") && !C89219l.m154714a((Object) eVar.f90512b, (Object) "FinishState")) {
            AbstractC38297d dVar = eVar.f90523m.get(eVar.f90512b);
            if (dVar != null) {
                dVar.mo66873e();
            }
            eVar.f90512b = "WidgetShowState";
            PointF c = eVar.mo66895c();
            eVar.f90515e.setPivotX(((float) eVar.f90511a.f90505a) / 2.0f);
            eVar.f90515e.setPivotY(((float) eVar.f90511a.f90505a) / 2.0f);
            eVar.f90515e.setTranslationX(c.x);
            eVar.f90515e.setTranslationY(c.y);
            eVar.f90515e.setScaleX(eVar.f90511a.f90508d);
            eVar.f90515e.setScaleY(eVar.f90511a.f90508d);
            eVar.f90515e.setRotation(0.0f);
            eVar.f90516f.setAlpha(0.0f);
            eVar.f90514d.setAlpha(0.0f);
            AbstractC38297d dVar2 = eVar.f90523m.get(eVar.f90512b);
            if (dVar2 != null) {
                dVar2.mo66869a();
            }
        }
    }

    public final void setPaused(boolean z) {
        this.f90451h = z;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.AdPlayFunView$b */
    public static final class C38269b extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a */
        final /* synthetic */ AdPlayFunView f90460a;

        static {
            Covode.recordClassIndex(45755);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38269b(AdPlayFunView adPlayFunView) {
            this.f90460a = adPlayFunView;
        }

        public final boolean onDown(MotionEvent motionEvent) {
            return this.f90460a.getStateContext().mo66894b();
        }

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            AwemeRawAd awemeRawAd;
            AbstractC38303i adDepend;
            AwemeRawAd awemeRawAd2;
            AdPlayFunView adPlayFunView = this.f90460a;
            Aweme aweme = adPlayFunView.f90449f;
            if (!(aweme == null || aweme.getAwemeRawAd() == null)) {
                C38298e eVar = adPlayFunView.f90446c;
                if (eVar == null) {
                    C89219l.m154710a("stateContext");
                }
                AwemeRawAd awemeRawAd3 = null;
                if (C89219l.m154714a((Object) eVar.f90522l, (Object) "popupmask")) {
                    C38298e eVar2 = adPlayFunView.f90446c;
                    if (eVar2 == null) {
                        C89219l.m154710a("stateContext");
                    }
                    AbstractC38297d dVar = eVar2.f90523m.get(eVar2.f90512b);
                    if (dVar != null) {
                        dVar.mo66877d();
                    }
                    Aweme aweme2 = adPlayFunView.f90449f;
                    if (aweme2 != null) {
                        awemeRawAd2 = aweme2.getAwemeRawAd();
                    } else {
                        awemeRawAd2 = null;
                    }
                    C38298e eVar3 = adPlayFunView.f90446c;
                    if (eVar3 == null) {
                        C89219l.m154710a("stateContext");
                    }
                    C33178a.m67997a(awemeRawAd2, "otherclick", eVar3.f90522l, null);
                } else {
                    C38298e eVar4 = adPlayFunView.f90446c;
                    if (eVar4 == null) {
                        C89219l.m154710a("stateContext");
                    }
                    if (C89219l.m154714a((Object) eVar4.f90512b, (Object) "EggShowState")) {
                        long currentTimeMillis = System.currentTimeMillis();
                        Aweme aweme3 = adPlayFunView.f90449f;
                        if (aweme3 != null) {
                            awemeRawAd3 = aweme3.getAwemeRawAd();
                        }
                        C38298e eVar5 = adPlayFunView.f90446c;
                        if (eVar5 == null) {
                            C89219l.m154710a("stateContext");
                        }
                        String str = eVar5.f90522l;
                        C38298e eVar6 = adPlayFunView.f90446c;
                        if (eVar6 == null) {
                            C89219l.m154710a("stateContext");
                        }
                        C33178a.m67997a(awemeRawAd3, "click", str, Long.valueOf(currentTimeMillis - eVar6.f90520j));
                    } else {
                        Aweme aweme4 = adPlayFunView.f90449f;
                        if (aweme4 != null) {
                            awemeRawAd = aweme4.getAwemeRawAd();
                        } else {
                            awemeRawAd = null;
                        }
                        C38298e eVar7 = adPlayFunView.f90446c;
                        if (eVar7 == null) {
                            C89219l.m154710a("stateContext");
                        }
                        C33178a.m67997a(awemeRawAd, "click", eVar7.f90522l, null);
                    }
                    Aweme aweme5 = adPlayFunView.f90449f;
                    if (!(aweme5 == null || (adDepend = adPlayFunView.getAdDepend()) == null)) {
                        Context context = adPlayFunView.getContext();
                        C89219l.m154716b(context, "");
                        adDepend.mo65689a(context, aweme5, C38272e.f90463a);
                    }
                }
            }
            return this.f90460a.getStateContext().mo66894b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.AdPlayFunView$c */
    public static final class C38270c extends AbstractC20727d {

        /* renamed from: a */
        final /* synthetic */ AdPlayFunView f90461a;

        static {
            Covode.recordClassIndex(45756);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38270c(AdPlayFunView adPlayFunView) {
            this.f90461a = adPlayFunView;
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
        /* renamed from: a */
        public final void mo34159a(Uri uri, View view, Throwable th) {
            AwemeRawAd awemeRawAd;
            if (view != null) {
                this.f90461a.setVisibility(8);
                if (this.f90461a.f90449f != null) {
                    Aweme aweme = this.f90461a.f90449f;
                    if (aweme != null) {
                        awemeRawAd = aweme.getAwemeRawAd();
                    } else {
                        awemeRawAd = null;
                    }
                    C18129a.m33746a("draw_ad", "othershow_fail", awemeRawAd).mo28900b("refer", "popupbadge").mo28901b();
                    C38293a.m77673b(this.f90461a.f90449f, false, "display");
                }
            }
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
        /* renamed from: a */
        public final void mo34158a(Uri uri, View view, C20758o oVar, Animatable animatable) {
            if (view != null) {
                if (C33278a.m68228d(this.f90461a.f90449f) && this.f90461a.f90448e) {
                    C38298e stateContext = this.f90461a.getStateContext();
                    C38296c a = this.f90461a.mo66854a();
                    C89219l.m154721d(a, "");
                    stateContext.f90511a = a;
                    ViewGroup.LayoutParams layoutParams = AdPlayFunView.m77623a(this.f90461a).getLayoutParams();
                    layoutParams.width = this.f90461a.getStateContext().f90511a.f90505a;
                    layoutParams.height = layoutParams.width;
                    AdPlayFunView.m77623a(this.f90461a).setLayoutParams(layoutParams);
                    C38298e stateContext2 = this.f90461a.getStateContext();
                    stateContext2.f90512b = "IdleState";
                    AbstractC38297d dVar = stateContext2.f90523m.get(stateContext2.f90512b);
                    if (dVar != null) {
                        dVar.mo66869a();
                    }
                }
                C38293a.m77673b(this.f90461a.f90449f, true, "display");
            }
        }
    }

    public final void setStateContext(C38298e eVar) {
        C89219l.m154721d(eVar, "");
        this.f90446c = eVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ SmartImageView m77623a(AdPlayFunView adPlayFunView) {
        SmartImageView smartImageView = adPlayFunView.f90444a;
        if (smartImageView == null) {
            C89219l.m154710a("eggImageView");
        }
        return smartImageView;
    }

    /* renamed from: a */
    public final void mo66855a(Aweme aweme) {
        AwemePlayFunModel awemePlayFunModel;
        AwemeRawAd awemeRawAd;
        this.f90449f = aweme;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
            awemePlayFunModel = null;
        } else {
            awemePlayFunModel = awemeRawAd.getPlayFunModel();
        }
        this.f90450g = awemePlayFunModel;
        C38298e eVar = this.f90446c;
        if (eVar == null) {
            C89219l.m154710a("stateContext");
        }
        eVar.f90513c = this.f90450g;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        String str;
        View view2 = this.f90453j;
        if (view2 == null) {
            C89219l.m154710a("eggBackgroundView");
        }
        if (C89219l.m154714a(view, view2)) {
            C38298e eVar = this.f90446c;
            if (eVar == null) {
                C89219l.m154710a("stateContext");
            }
            eVar.mo66891a("popupmask");
        } else {
            SmartImageView smartImageView = this.f90444a;
            if (smartImageView == null) {
                C89219l.m154710a("eggImageView");
            }
            if (C89219l.m154714a(view, smartImageView)) {
                C38298e eVar2 = this.f90446c;
                if (eVar2 == null) {
                    C89219l.m154710a("stateContext");
                }
                C38298e eVar3 = this.f90446c;
                if (eVar3 == null) {
                    C89219l.m154710a("stateContext");
                }
                if (C89219l.m154714a((Object) eVar3.f90512b, (Object) "EggShowState")) {
                    str = "popupbadge";
                } else {
                    str = "badge";
                }
                eVar2.mo66891a(str);
            } else {
                TextView textView = this.f90445b;
                if (textView == null) {
                    C89219l.m154710a("eggTitleView");
                }
                if (C89219l.m154714a(view, textView)) {
                    C38298e eVar4 = this.f90446c;
                    if (eVar4 == null) {
                        C89219l.m154710a("stateContext");
                    }
                    eVar4.mo66891a("popupbadgetext");
                }
            }
        }
        return this.f90457n.onTouchEvent(motionEvent);
    }

    private /* synthetic */ AdPlayFunView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AdPlayFunView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(6667);
        this.f90454k = C89250i.m154773a((AbstractC89171a) C38268a.f90459a);
        C38269b bVar = new C38269b(this);
        this.f90456m = bVar;
        this.f90457n = new GestureDetector(context, bVar);
        this.f90458o = new View$OnLayoutChangeListenerC38271d(this);
        this.f90452i = new C38270c(this);
        MethodCollector.m26664o(6667);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.AdPlayFunView$d */
    static final class View$OnLayoutChangeListenerC38271d implements View.OnLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ AdPlayFunView f90462a;

        static {
            Covode.recordClassIndex(45757);
        }

        View$OnLayoutChangeListenerC38271d(AdPlayFunView adPlayFunView) {
            this.f90462a = adPlayFunView;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C38298e stateContext = this.f90462a.getStateContext();
            C38290g gVar = null;
            if (C89219l.m154714a((Object) stateContext.f90512b, (Object) "WidgetShowState")) {
                AbstractC38297d dVar = stateContext.f90523m.get("WidgetShowState");
                if (dVar instanceof C38290g) {
                    gVar = dVar;
                }
                C38290g gVar2 = gVar;
                if (gVar2 != null && gVar2.f90510b.f90519i) {
                    gVar2.f90481c = C38274a.m77637a(gVar2.f90510b.f90515e, gVar2.f90510b.mo66895c().y);
                    Animator animator = gVar2.f90481c;
                    if (animator != null) {
                        animator.start();
                    }
                }
            } else if (C89219l.m154714a((Object) stateContext.f90512b, (Object) "EggShowState")) {
                AbstractC38297d dVar2 = stateContext.f90523m.get("EggShowState");
                if (dVar2 instanceof C38283c) {
                    gVar = dVar2;
                }
                C38283c cVar = gVar;
                if (cVar != null) {
                    cVar.mo66879h();
                }
            }
        }
    }
}
