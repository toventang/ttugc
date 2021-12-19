package com.p2082ss.android.ugc.aweme.sticker.panel.p3974c;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActivityC0218d;
import androidx.fragment.app.AbstractC0976n;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1215v;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.drawee.p1854e.C24229q;
import com.facebook.drawee.p1855f.C24246a;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.AbstractC75300d;
import com.p2082ss.android.ugc.aweme.sticker.p3965m.AbstractC75429h;
import com.p2082ss.android.ugc.aweme.sticker.p3965m.C75427f;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.sticker.panel.C75574j;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75618a;
import com.p2082ss.android.ugc.aweme.sticker.repository.C75723b;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.main.C76180e;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.p4014a.C76141b;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.pages.C76269e;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.pages.C76274f;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76125l;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.C76123j;
import com.p2082ss.android.ugc.aweme.sticker.widget.AVRtlViewPager;
import com.p2082ss.android.ugc.effectmanager.common.utils.NetworkUtils;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.p4336a.C84380c;
import com.p2082ss.android.ugc.tools.p4340c.C84402a;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.tools.view.style.StyleTextView;
import com.p2082ss.android.ugc.tools.view.widget.AVAutoRTLImageView;
import com.p2082ss.android.ugc.tools.view.widget.CircleImageView;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.ugc.effectplatform.model.EffectCategoryModel;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Callable;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.c.b */
public final class View$OnClickListenerC75500b implements View.OnClickListener, AbstractC75517h {

    /* renamed from: O */
    public static int f169656O;

    /* renamed from: P */
    public static String f169657P = "";

    /* renamed from: Q */
    public static final C75501a f169658Q = new C75501a((byte) 0);

    /* renamed from: A */
    SimpleDraweeView f169659A;

    /* renamed from: B */
    StyleTextView f169660B;

    /* renamed from: C */
    public boolean f169661C;

    /* renamed from: D */
    boolean f169662D;

    /* renamed from: E */
    public boolean f169663E;

    /* renamed from: F */
    public FrameLayout f169664F;

    /* renamed from: G */
    public final boolean f169665G;

    /* renamed from: H */
    public final boolean f169666H = true;

    /* renamed from: I */
    public final AbstractC89183m<String, String, AbstractC75512c> f169667I;

    /* renamed from: J */
    public final AbstractC75655o f169668J;

    /* renamed from: K */
    public final AbstractC75300d f169669K;

    /* renamed from: L */
    public final AbstractC75429h f169670L;

    /* renamed from: M */
    public final ActivityC0218d f169671M;

    /* renamed from: N */
    public final AbstractC75514e f169672N;

    /* renamed from: R */
    private final AbstractC89171a<Drawable> f169673R;

    /* renamed from: a */
    public LinearLayout f169674a;

    /* renamed from: b */
    public SimpleDraweeView f169675b;

    /* renamed from: c */
    public TextView f169676c;

    /* renamed from: d */
    public TextView f169677d;

    /* renamed from: e */
    public Context f169678e;

    /* renamed from: f */
    public final HashMap<String, AbstractC75512c> f169679f;

    /* renamed from: g */
    public Effect f169680g;

    /* renamed from: h */
    public SimpleDraweeView f169681h;

    /* renamed from: i */
    public StyleTextView f169682i;

    /* renamed from: j */
    public LinearLayout f169683j;

    /* renamed from: k */
    StyleTextView f169684k;

    /* renamed from: l */
    public AbstractC75512c f169685l;

    /* renamed from: m */
    public StyleTextView f169686m;

    /* renamed from: n */
    public CircleImageView f169687n;

    /* renamed from: o */
    StyleTextView f169688o;

    /* renamed from: p */
    public StyleTextView f169689p;

    /* renamed from: q */
    public StyleTextView f169690q;

    /* renamed from: r */
    public int f169691r;

    /* renamed from: s */
    public AVRtlViewPager f169692s;

    /* renamed from: t */
    public C76269e f169693t;

    /* renamed from: u */
    public LinearLayout f169694u;

    /* renamed from: v */
    public FrameLayout f169695v;

    /* renamed from: w */
    AVAutoRTLImageView f169696w;

    /* renamed from: x */
    AVAutoRTLImageView f169697x;

    /* renamed from: y */
    LinearLayout f169698y;

    /* renamed from: z */
    LinearLayout f169699z;

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.c.b$c */
    static final class View$OnClickListenerC75503c implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC75503c f169702a = new View$OnClickListenerC75503c();

        static {
            Covode.recordClassIndex(88425);
        }

        View$OnClickListenerC75503c() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C89219l.m154721d(view, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.c.b$a */
    public static final class C75501a {
        static {
            Covode.recordClassIndex(88423);
        }

        private C75501a() {
        }

        public /* synthetic */ C75501a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.p3974c.AbstractC75517h
    /* renamed from: a */
    public final EnumC75518i mo119168a() {
        return EnumC75518i.DesignerInfoHandlerPriority;
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void destory() {
        LinearLayout linearLayout = this.f169694u;
        if (linearLayout == null) {
            C89219l.m154715b();
        }
        linearLayout.setVisibility(8);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.c.b$g */
    static final class CallableC75507g<V> implements Callable<AbstractC75512c> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC75500b f169707a;

        /* renamed from: b */
        final /* synthetic */ Effect f169708b;

        static {
            Covode.recordClassIndex(88429);
        }

        CallableC75507g(View$OnClickListenerC75500b bVar, Effect effect) {
            this.f169707a = bVar;
            this.f169708b = effect;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ AbstractC75512c call() {
            return this.f169707a.f169667I.invoke(this.f169708b.getDesignerId(), this.f169708b.getDesignerEncryptedId());
        }
    }

    static {
        Covode.recordClassIndex(88422);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.p3974c.AbstractC75517h
    /* renamed from: b */
    public final void mo119171b() {
        this.f169680g = null;
        LinearLayout linearLayout = this.f169674a;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.f169683j;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }

    /* renamed from: c */
    public final void mo119173c() {
        mo119172a(false);
        if (this.f169671M.getSupportFragmentManager().mo3564e() > 0) {
            this.f169671M.getSupportFragmentManager().mo3562c();
        }
        this.f169663E = false;
        this.f169672N.mo119204c();
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.c.b$f */
    static final class RunnableC75506f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC75500b f169705a;

        /* renamed from: b */
        final /* synthetic */ Context f169706b;

        static {
            Covode.recordClassIndex(88428);
        }

        RunnableC75506f(View$OnClickListenerC75500b bVar, Context context) {
            this.f169705a = bVar;
            this.f169706b = context;
        }

        public final void run() {
            int i;
            int i2;
            ViewGroup.LayoutParams layoutParams;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE);
            TextView textView = this.f169705a.f169677d;
            if (textView != null) {
                textView.measure(makeMeasureSpec, makeMeasureSpec2);
            }
            SimpleDraweeView simpleDraweeView = this.f169705a.f169675b;
            if (simpleDraweeView == null || (layoutParams = simpleDraweeView.getLayoutParams()) == null) {
                i = -1;
            } else {
                i = layoutParams.width;
            }
            TextView textView2 = this.f169705a.f169677d;
            if (textView2 != null) {
                i2 = textView2.getMeasuredWidth();
            } else {
                i2 = -1;
            }
            if (i != -1 && i2 != -1) {
                int b = (int) (((float) ((C70636dh.m124831b(this.f169706b) - i) - i2)) - C84912r.m145930a(this.f169706b, 106.0f));
                TextView textView3 = this.f169705a.f169676c;
                if (textView3 != null) {
                    textView3.setMaxWidth(b);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.c.b$d */
    static final class View$OnClickListenerC75504d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC75500b f169703a;

        static {
            Covode.recordClassIndex(88426);
        }

        View$OnClickListenerC75504d(View$OnClickListenerC75500b bVar) {
            this.f169703a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f169703a.mo119173c();
        }
    }

    /* renamed from: a */
    private static Context m132443a(ActivityC0218d dVar) {
        Context applicationContext = dVar.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.c.b$i */
    static final class View$OnClickListenerC75509i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC75500b f169712a;

        /* renamed from: b */
        final /* synthetic */ String f169713b;

        /* renamed from: c */
        final /* synthetic */ String f169714c;

        /* renamed from: d */
        final /* synthetic */ boolean f169715d;

        static {
            Covode.recordClassIndex(88431);
        }

        View$OnClickListenerC75509i(View$OnClickListenerC75500b bVar, String str, String str2, boolean z) {
            this.f169712a = bVar;
            this.f169713b = str;
            this.f169714c = str2;
            this.f169715d = z;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            int i = 1;
            if (this.f169712a.f169691r == 0) {
                this.f169712a.f169672N.mo119201a(true);
            } else {
                this.f169712a.f169672N.mo119201a(false);
                i = 0;
            }
            this.f169712a.f169672N.mo119199a(this.f169713b, this.f169714c, i, new AbstractC89172b<Integer, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.sticker.panel.p3974c.View$OnClickListenerC75500b.View$OnClickListenerC75509i.C755101 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC75509i f169716a;

                static {
                    Covode.recordClassIndex(88432);
                }

                {
                    this.f169716a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(Integer num) {
                    int intValue = num.intValue();
                    if (intValue == 0) {
                        if (this.f169716a.f169715d) {
                            StyleTextView styleTextView = this.f169716a.f169712a.f169690q;
                            if (styleTextView == null) {
                                C89219l.m154715b();
                            }
                            Locale locale = Locale.getDefault();
                            Context context = this.f169716a.f169712a.f169678e;
                            if (context == null) {
                                C89219l.m154715b();
                            }
                            String string = context.getString(R.string.bxw);
                            C89219l.m154716b(string, "");
                            String a = C1764a.m5929a(locale, string, Arrays.copyOf(new Object[0], 0));
                            C89219l.m154716b(a, "");
                            styleTextView.setText(a);
                        } else {
                            StyleTextView styleTextView2 = this.f169716a.f169712a.f169690q;
                            if (styleTextView2 == null) {
                                C89219l.m154715b();
                            }
                            Locale locale2 = Locale.getDefault();
                            Context context2 = this.f169716a.f169712a.f169678e;
                            if (context2 == null) {
                                C89219l.m154715b();
                            }
                            String string2 = context2.getString(R.string.bxs);
                            C89219l.m154716b(string2, "");
                            String a2 = C1764a.m5929a(locale2, string2, Arrays.copyOf(new Object[0], 0));
                            C89219l.m154716b(a2, "");
                            styleTextView2.setText(a2);
                        }
                        this.f169716a.f169712a.f169691r = 0;
                        StyleTextView styleTextView3 = this.f169716a.f169712a.f169690q;
                        if (styleTextView3 == null) {
                            C89219l.m154715b();
                        }
                        styleTextView3.setBackgroundResource(R.drawable.b6_);
                    } else if (intValue == 1) {
                        StyleTextView styleTextView4 = this.f169716a.f169712a.f169690q;
                        if (styleTextView4 == null) {
                            C89219l.m154715b();
                        }
                        Locale locale3 = Locale.getDefault();
                        Context context3 = this.f169716a.f169712a.f169678e;
                        if (context3 == null) {
                            C89219l.m154715b();
                        }
                        String string3 = context3.getString(R.string.bzd);
                        C89219l.m154716b(string3, "");
                        String a3 = C1764a.m5929a(locale3, string3, Arrays.copyOf(new Object[0], 0));
                        C89219l.m154716b(a3, "");
                        styleTextView4.setText(a3);
                        StyleTextView styleTextView5 = this.f169716a.f169712a.f169690q;
                        if (styleTextView5 == null) {
                            C89219l.m154715b();
                        }
                        styleTextView5.setBackgroundResource(R.drawable.b6a);
                        this.f169716a.f169712a.f169691r = 1;
                    } else if (intValue == 2) {
                        StyleTextView styleTextView6 = this.f169716a.f169712a.f169690q;
                        if (styleTextView6 == null) {
                            C89219l.m154715b();
                        }
                        Locale locale4 = Locale.getDefault();
                        Context context4 = this.f169716a.f169712a.f169678e;
                        if (context4 == null) {
                            C89219l.m154715b();
                        }
                        String string4 = context4.getString(R.string.c15);
                        C89219l.m154716b(string4, "");
                        String a4 = C1764a.m5929a(locale4, string4, Arrays.copyOf(new Object[0], 0));
                        C89219l.m154716b(a4, "");
                        styleTextView6.setText(a4);
                        StyleTextView styleTextView7 = this.f169716a.f169712a.f169690q;
                        if (styleTextView7 == null) {
                            C89219l.m154715b();
                        }
                        styleTextView7.setBackgroundResource(R.drawable.b6a);
                        this.f169716a.f169712a.f169691r = 1;
                    } else if (intValue == 4) {
                        StyleTextView styleTextView8 = this.f169716a.f169712a.f169690q;
                        if (styleTextView8 == null) {
                            C89219l.m154715b();
                        }
                        Locale locale5 = Locale.getDefault();
                        Context context5 = this.f169716a.f169712a.f169678e;
                        if (context5 == null) {
                            C89219l.m154715b();
                        }
                        String string5 = context5.getString(R.string.byz);
                        C89219l.m154716b(string5, "");
                        String a5 = C1764a.m5929a(locale5, string5, Arrays.copyOf(new Object[0], 0));
                        C89219l.m154716b(a5, "");
                        styleTextView8.setText(a5);
                        StyleTextView styleTextView9 = this.f169716a.f169712a.f169690q;
                        if (styleTextView9 == null) {
                            C89219l.m154715b();
                        }
                        styleTextView9.setBackgroundResource(R.drawable.b6a);
                        this.f169716a.f169712a.f169691r = 1;
                    }
                    StyleTextView styleTextView10 = this.f169716a.f169712a.f169689p;
                    if (styleTextView10 == null) {
                        C89219l.m154715b();
                    }
                    styleTextView10.postDelayed(new Runnable(this) {
                        /* class com.p2082ss.android.ugc.aweme.sticker.panel.p3974c.View$OnClickListenerC75500b.View$OnClickListenerC75509i.C755101.RunnableC755111 */

                        /* renamed from: a */
                        final /* synthetic */ C755101 f169717a;

                        static {
                            Covode.recordClassIndex(88433);
                        }

                        {
                            this.f169717a = r1;
                        }

                        public final void run() {
                            StyleTextView styleTextView = this.f169717a.f169716a.f169712a.f169689p;
                            if (styleTextView == null) {
                                C89219l.m154715b();
                            }
                            Locale locale = Locale.getDefault();
                            Context context = this.f169717a.f169716a.f169712a.f169678e;
                            if (context == null) {
                                C89219l.m154715b();
                            }
                            String string = context.getString(R.string.d6u);
                            C89219l.m154716b(string, "");
                            String a = C1764a.m5929a(locale, string, Arrays.copyOf(new Object[]{Integer.valueOf(this.f169717a.f169716a.f169712a.f169672N.mo119197a(this.f169717a.f169716a.f169713b, this.f169717a.f169716a.f169714c))}, 1));
                            C89219l.m154716b(a, "");
                            styleTextView.setText(a);
                        }
                    }, 1000);
                    return C89391z.f203057a;
                }
            });
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.p3974c.AbstractC75517h
    /* renamed from: a */
    public final boolean mo119170a(C75618a aVar) {
        C89219l.m154721d(aVar, "");
        Effect effect = aVar.f170022a;
        if (C75466g.m132351c(effect)) {
            this.f169680g = effect;
            C1731i.m5635a((Callable) new CallableC75507g(this, effect)).mo5533a(new C75508h(this, effect, null), C1731i.f5564c);
            return true;
        }
        mo119171b();
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.c.b$b */
    public static final class C75502b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC75500b f169700a;

        /* renamed from: b */
        final /* synthetic */ boolean f169701b;

        static {
            Covode.recordClassIndex(88424);
        }

        public final void onAnimationEnd(Animator animator) {
            MethodCollector.m26663i(5635);
            super.onAnimationEnd(animator);
            if (this.f169701b) {
                LinearLayout linearLayout = this.f169700a.f169694u;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                FrameLayout frameLayout = this.f169700a.f169695v;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
                FrameLayout frameLayout2 = this.f169700a.f169664F;
                if (frameLayout2 != null) {
                    frameLayout2.removeView(this.f169700a.f169692s);
                    MethodCollector.m26664o(5635);
                    return;
                }
                MethodCollector.m26664o(5635);
                return;
            }
            LinearLayout linearLayout2 = this.f169700a.f169694u;
            if (linearLayout2 == null) {
                C89219l.m154715b();
            }
            linearLayout2.setVisibility(8);
            FrameLayout frameLayout3 = this.f169700a.f169695v;
            if (frameLayout3 == null) {
                C89219l.m154715b();
            }
            frameLayout3.setVisibility(0);
            FrameLayout frameLayout4 = this.f169700a.f169664F;
            if (frameLayout4 != null) {
                frameLayout4.addView(this.f169700a.f169692s);
                MethodCollector.m26664o(5635);
                return;
            }
            MethodCollector.m26664o(5635);
        }

        C75502b(View$OnClickListenerC75500b bVar, boolean z) {
            this.f169700a = bVar;
            this.f169701b = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.c.b$e */
    static final class View$OnClickListenerC75505e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC75500b f169704a;

        static {
            Covode.recordClassIndex(88427);
        }

        View$OnClickListenerC75505e(View$OnClickListenerC75500b bVar) {
            this.f169704a = bVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            if (C89219l.m154714a((Object) this.f169704a.f169668J.mo119292d(), (Object) "sticker_category:search")) {
                this.f169704a.f169672N.mo119206e();
            }
            if (!NetworkUtils.isNetworkAvailable(this.f169704a.f169671M)) {
                this.f169704a.f169661C = false;
                this.f169704a.f169672N.mo119205d();
            } else if (this.f169704a.f169672N.mo119202a() && !this.f169704a.f169663E) {
                this.f169704a.f169672N.mo119203b();
                this.f169704a.mo119172a(true);
                if (this.f169704a.f169693t != null) {
                    AbstractC0976n a = this.f169704a.f169671M.getSupportFragmentManager().mo3552a();
                    C76269e eVar = this.f169704a.f169693t;
                    Objects.requireNonNull(eVar, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
                    a.mo3455a(eVar).mo3467b();
                }
                this.f169704a.f169663E = true;
                View$OnClickListenerC75500b bVar = this.f169704a;
                AbstractC76125l.C76127b bVar2 = new AbstractC76125l.C76127b(this.f169704a.f169668J, this.f169704a.f169669K, this.f169704a.f169670L, C75427f.f169511a, C76180e.f171138a, new C75574j(0, 0, null, 0, 0, 0, false, 0, false, null, null, false, false, false, 131071).f169851m);
                AbstractC76125l.C76126a aVar = new AbstractC76125l.C76126a(C76123j.m133522a(new C76141b(this.f169704a.f169668J, this.f169704a.f169670L)), null, null, 126);
                RecyclerView.RecycledViewPool recycledViewPool = new RecyclerView.RecycledViewPool();
                AbstractC75514e eVar2 = this.f169704a.f169672N;
                Effect effect = this.f169704a.f169680g;
                if (effect == null) {
                    C89219l.m154715b();
                }
                C89219l.m154721d(bVar2, "");
                C89219l.m154721d(aVar, "");
                C89219l.m154721d(eVar2, "");
                C89219l.m154721d(effect, "");
                C76269e eVar3 = new C76269e();
                eVar3.mo119990a(bVar2, aVar, recycledViewPool, eVar2, effect);
                bVar.f169693t = eVar3;
                AbstractC0976n a2 = this.f169704a.f169671M.getSupportFragmentManager().mo3552a();
                C76269e eVar4 = this.f169704a.f169693t;
                if (eVar4 == null) {
                    C89219l.m154715b();
                }
                a2.mo3453a(R.id.cxv, eVar4).mo3467b();
                if (C89070n.m154561b((List) C75723b.m132877a(this.f169704a.f169668J.mo119291c().mo119464j()), 0) != null) {
                    Object b = C89070n.m154561b((List) C75723b.m132877a(this.f169704a.f169668J.mo119291c().mo119464j()), 0);
                    if (b == null) {
                        C89219l.m154715b();
                    }
                    str = ((EffectCategoryModel) b).getName();
                } else {
                    str = "";
                }
                AbstractC75514e eVar5 = this.f169704a.f169672N;
                Effect effect2 = this.f169704a.f169680g;
                if (effect2 == null) {
                    C89219l.m154715b();
                }
                String effectId = effect2.getEffectId();
                AbstractC75512c cVar = this.f169704a.f169685l;
                if (cVar == null) {
                    C89219l.m154715b();
                }
                String c = cVar.mo119186c();
                C89219l.m154716b(c, "");
                AVRtlViewPager aVRtlViewPager = this.f169704a.f169692s;
                if (aVRtlViewPager == null) {
                    C89219l.m154715b();
                }
                eVar5.mo119200a(effectId, str, c, aVRtlViewPager.getCurrentItem());
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.p3974c.AbstractC75517h
    /* renamed from: a */
    public final void mo119169a(View view) {
        C89219l.m154721d(view, "");
        Context context = view.getContext();
        this.f169678e = context;
        if (context != null) {
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.c6v);
            this.f169683j = linearLayout;
            if (this.f169666H) {
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                this.f169659A = (SimpleDraweeView) view.findViewById(R.id.e90);
                this.f169660B = (StyleTextView) view.findViewById(R.id.e96);
                this.f169681h = (SimpleDraweeView) view.findViewById(R.id.crz);
                this.f169682i = (StyleTextView) view.findViewById(R.id.cs0);
                this.f169699z = (LinearLayout) view.findViewById(R.id.cry);
                this.f169684k = (StyleTextView) view.findViewById(R.id.cxf);
                this.f169686m = (StyleTextView) view.findViewById(R.id.cxi);
                this.f169687n = (CircleImageView) view.findViewById(R.id.bm0);
                this.f169688o = (StyleTextView) view.findViewById(R.id.cxh);
                this.f169689p = (StyleTextView) view.findViewById(R.id.cxd);
                this.f169694u = (LinearLayout) view.findViewById(R.id.cxg);
                this.f169690q = (StyleTextView) view.findViewById(R.id.b6f);
                this.f169692s = (AVRtlViewPager) view.findViewById(R.id.fgr);
                this.f169664F = (FrameLayout) view.findViewById(R.id.c7l);
                this.f169695v = (FrameLayout) view.findViewById(R.id.c77);
                this.f169697x = (AVAutoRTLImageView) view.findViewById(R.id.blz);
                this.f169696w = (AVAutoRTLImageView) view.findViewById(R.id.bco);
                this.f169698y = (LinearLayout) view.findViewById(R.id.cxs);
            } else {
                this.f169681h = (SimpleDraweeView) view.findViewById(R.id.e90);
                this.f169682i = (StyleTextView) view.findViewById(R.id.e96);
            }
            LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.c6i);
            if (linearLayout2 != null) {
                C84380c.m145132a(linearLayout2);
                this.f169674a = linearLayout2;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) linearLayout2.findViewById(R.id.c6k);
                C89219l.m154716b(simpleDraweeView, "");
                Drawable invoke = this.f169673R.invoke();
                if (invoke != null) {
                    ((C24246a) simpleDraweeView.getHierarchy()).mo39957a(invoke, C24229q.AbstractC24231b.f57458h);
                }
                this.f169675b = simpleDraweeView;
                this.f169676c = (TextView) linearLayout2.findViewById(R.id.c6l);
                this.f169677d = (TextView) linearLayout2.findViewById(R.id.c6j);
                linearLayout2.setOnClickListener(this);
                linearLayout2.post(new RunnableC75506f(this, context));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.c.b$h */
    static final class C75508h<TTaskResult, TContinuationResult> implements AbstractC1729g<AbstractC75512c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC75500b f169709a;

        /* renamed from: b */
        final /* synthetic */ Effect f169710b;

        /* renamed from: c */
        final /* synthetic */ AbstractC75515f f169711c = null;

        static {
            Covode.recordClassIndex(88430);
        }

        C75508h(View$OnClickListenerC75500b bVar, Effect effect, AbstractC75515f fVar) {
            this.f169709a = bVar;
            this.f169710b = effect;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
        @Override // p077b.AbstractC1729g
        public final /* synthetic */ C89391z then(C1731i<AbstractC75512c> iVar) {
            AbstractC75512c cVar;
            String a;
            C89219l.m154721d(iVar, "");
            if (iVar.mo5539b() || iVar.mo5544c()) {
                cVar = this.f169709a.f169679f.get(this.f169710b.getDesignerId());
            } else {
                cVar = iVar.mo5545d();
            }
            this.f169709a.f169685l = cVar;
            if (cVar == null) {
                C89219l.m154715b();
            }
            String c = cVar.mo119186c();
            C89219l.m154716b(c, "");
            C89219l.m154721d(c, "");
            View$OnClickListenerC75500b.f169657P = c;
            View$OnClickListenerC75500b bVar = this.f169709a;
            SimpleDraweeView simpleDraweeView = bVar.f169659A;
            if (simpleDraweeView == null) {
                C89219l.m154715b();
            }
            simpleDraweeView.setVisibility(8);
            StyleTextView styleTextView = bVar.f169660B;
            if (styleTextView == null) {
                C89219l.m154715b();
            }
            styleTextView.setVisibility(8);
            SimpleDraweeView simpleDraweeView2 = bVar.f169681h;
            if (simpleDraweeView2 == null) {
                C89219l.m154715b();
            }
            simpleDraweeView2.setVisibility(0);
            StyleTextView styleTextView2 = bVar.f169682i;
            if (styleTextView2 == null) {
                C89219l.m154715b();
            }
            styleTextView2.setVisibility(0);
            LinearLayout linearLayout = bVar.f169699z;
            if (linearLayout == null) {
                C89219l.m154715b();
            }
            linearLayout.setVisibility(0);
            boolean z = true;
            if (bVar.f169672N.mo119202a()) {
                AbstractC75512c cVar2 = bVar.f169685l;
                if (cVar2 == null) {
                    C89219l.m154715b();
                }
                if (!cVar2.mo119193j()) {
                    AbstractC75512c cVar3 = bVar.f169685l;
                    if (cVar3 == null) {
                        C89219l.m154715b();
                    }
                    if (!cVar3.mo119192i()) {
                        AVAutoRTLImageView aVAutoRTLImageView = bVar.f169696w;
                        if (aVAutoRTLImageView == null) {
                            C89219l.m154715b();
                        }
                        aVAutoRTLImageView.setVisibility(0);
                        bVar.f169661C = true;
                    }
                }
            }
            AbstractC75512c cVar4 = bVar.f169685l;
            if (cVar4 == null) {
                C89219l.m154715b();
            }
            String k = cVar4.mo119194k();
            AbstractC75512c cVar5 = bVar.f169685l;
            if (cVar5 == null) {
                C89219l.m154715b();
            }
            if (C89219l.m154714a((Object) k, (Object) cVar5.mo119186c())) {
                StyleTextView styleTextView3 = bVar.f169690q;
                if (styleTextView3 == null) {
                    C89219l.m154715b();
                }
                styleTextView3.setVisibility(8);
            }
            AbstractC75512c cVar6 = bVar.f169685l;
            if (cVar6 == null) {
                C89219l.m154715b();
            }
            if (cVar6.mo119190g() == 1) {
                AbstractC75512c cVar7 = bVar.f169685l;
                if (cVar7 == null) {
                    C89219l.m154715b();
                }
                if (cVar7.mo119189f() == 1) {
                    StyleTextView styleTextView4 = bVar.f169690q;
                    if (styleTextView4 == null) {
                        C89219l.m154715b();
                    }
                    Locale locale = Locale.getDefault();
                    Context context = bVar.f169678e;
                    if (context == null) {
                        C89219l.m154715b();
                    }
                    String string = context.getString(R.string.c15);
                    C89219l.m154716b(string, "");
                    String a2 = C1764a.m5929a(locale, string, Arrays.copyOf(new Object[0], 0));
                    C89219l.m154716b(a2, "");
                    styleTextView4.setText(a2);
                    StyleTextView styleTextView5 = bVar.f169690q;
                    if (styleTextView5 == null) {
                        C89219l.m154715b();
                    }
                    styleTextView5.setBackgroundResource(R.drawable.b6a);
                    bVar.f169691r = 1;
                    bVar.f169662D = true;
                } else {
                    AbstractC75512c cVar8 = bVar.f169685l;
                    if (cVar8 == null) {
                        C89219l.m154715b();
                    }
                    if (cVar8.mo119189f() == 0) {
                        StyleTextView styleTextView6 = bVar.f169690q;
                        if (styleTextView6 == null) {
                            C89219l.m154715b();
                        }
                        Locale locale2 = Locale.getDefault();
                        Context context2 = bVar.f169678e;
                        if (context2 == null) {
                            C89219l.m154715b();
                        }
                        String string2 = context2.getString(R.string.bxw);
                        C89219l.m154716b(string2, "");
                        String a3 = C1764a.m5929a(locale2, string2, Arrays.copyOf(new Object[0], 0));
                        C89219l.m154716b(a3, "");
                        styleTextView6.setText(a3);
                        StyleTextView styleTextView7 = bVar.f169690q;
                        if (styleTextView7 == null) {
                            C89219l.m154715b();
                        }
                        styleTextView7.setBackgroundResource(R.drawable.b6_);
                        bVar.f169691r = 0;
                        bVar.f169662D = false;
                    }
                }
            } else {
                AbstractC75512c cVar9 = bVar.f169685l;
                if (cVar9 == null) {
                    C89219l.m154715b();
                }
                if (cVar9.mo119189f() == 1) {
                    StyleTextView styleTextView8 = bVar.f169690q;
                    if (styleTextView8 == null) {
                        C89219l.m154715b();
                    }
                    Locale locale3 = Locale.getDefault();
                    Context context3 = bVar.f169678e;
                    if (context3 == null) {
                        C89219l.m154715b();
                    }
                    String string3 = context3.getString(R.string.bzd);
                    C89219l.m154716b(string3, "");
                    String a4 = C1764a.m5929a(locale3, string3, Arrays.copyOf(new Object[0], 0));
                    C89219l.m154716b(a4, "");
                    styleTextView8.setText(a4);
                    StyleTextView styleTextView9 = bVar.f169690q;
                    if (styleTextView9 == null) {
                        C89219l.m154715b();
                    }
                    styleTextView9.setBackgroundResource(R.drawable.b6a);
                    bVar.f169691r = 1;
                    bVar.f169662D = true;
                } else {
                    AbstractC75512c cVar10 = bVar.f169685l;
                    if (cVar10 == null) {
                        C89219l.m154715b();
                    }
                    if (cVar10.mo119189f() == 0) {
                        StyleTextView styleTextView10 = bVar.f169690q;
                        if (styleTextView10 == null) {
                            C89219l.m154715b();
                        }
                        Locale locale4 = Locale.getDefault();
                        Context context4 = bVar.f169678e;
                        if (context4 == null) {
                            C89219l.m154715b();
                        }
                        String string4 = context4.getString(R.string.bxs);
                        C89219l.m154716b(string4, "");
                        String a5 = C1764a.m5929a(locale4, string4, Arrays.copyOf(new Object[0], 0));
                        C89219l.m154716b(a5, "");
                        styleTextView10.setText(a5);
                        StyleTextView styleTextView11 = bVar.f169690q;
                        if (styleTextView11 == null) {
                            C89219l.m154715b();
                        }
                        styleTextView11.setBackgroundResource(R.drawable.b6_);
                        bVar.f169691r = 0;
                        bVar.f169662D = false;
                    }
                }
            }
            StyleTextView styleTextView12 = bVar.f169684k;
            if (styleTextView12 == null) {
                C89219l.m154715b();
            }
            Locale locale5 = Locale.getDefault();
            Context context5 = bVar.f169678e;
            if (context5 == null) {
                C89219l.m154715b();
            }
            String string5 = context5.getString(R.string.b1e);
            C89219l.m154716b(string5, "");
            Object[] objArr = new Object[1];
            AbstractC75512c cVar11 = bVar.f169685l;
            if (cVar11 == null) {
                C89219l.m154715b();
            }
            objArr[0] = cVar11.mo119188e();
            String a6 = C1764a.m5929a(locale5, string5, Arrays.copyOf(objArr, 1));
            C89219l.m154716b(a6, "");
            styleTextView12.setText(a6);
            StyleTextView styleTextView13 = bVar.f169684k;
            if (styleTextView13 == null) {
                C89219l.m154715b();
            }
            styleTextView13.setVisibility(0);
            StyleTextView styleTextView14 = bVar.f169688o;
            if (styleTextView14 == null) {
                C89219l.m154715b();
            }
            AbstractC75512c cVar12 = bVar.f169685l;
            if (cVar12 == null) {
                C89219l.m154715b();
            }
            styleTextView14.setText(cVar12.mo119188e());
            StyleTextView styleTextView15 = bVar.f169689p;
            if (styleTextView15 == null) {
                C89219l.m154715b();
            }
            Locale locale6 = Locale.getDefault();
            Context context6 = bVar.f169678e;
            if (context6 == null) {
                C89219l.m154715b();
            }
            String string6 = context6.getString(R.string.d6u);
            C89219l.m154716b(string6, "");
            Object[] objArr2 = new Object[1];
            AbstractC75512c cVar13 = bVar.f169685l;
            if (cVar13 == null) {
                C89219l.m154715b();
            }
            objArr2[0] = Integer.valueOf(cVar13.mo119191h());
            String a7 = C1764a.m5929a(locale6, string6, Arrays.copyOf(objArr2, 1));
            C89219l.m154716b(a7, "");
            styleTextView15.setText(a7);
            View$OnClickListenerC75500b bVar2 = this.f169709a;
            LinearLayout linearLayout2 = bVar2.f169694u;
            if (linearLayout2 == null) {
                C89219l.m154715b();
            }
            linearLayout2.setOnClickListener(View$OnClickListenerC75503c.f169702a);
            AVAutoRTLImageView aVAutoRTLImageView2 = bVar2.f169697x;
            if (aVAutoRTLImageView2 == null) {
                C89219l.m154715b();
            }
            aVAutoRTLImageView2.setOnClickListener(new View$OnClickListenerC75504d(bVar2));
            LinearLayout linearLayout3 = bVar2.f169698y;
            if (linearLayout3 == null) {
                C89219l.m154715b();
            }
            linearLayout3.setOnClickListener(new View$OnClickListenerC75505e(bVar2));
            AbstractC75515f fVar = this.f169711c;
            if (fVar == null || fVar.mo119207a()) {
                if (C89219l.m154714a(this.f169710b, this.f169709a.f169680g)) {
                    TextView textView = this.f169709a.f169676c;
                    if (textView == null) {
                        C89219l.m154715b();
                    }
                    textView.setText(cVar.mo119188e());
                    StyleTextView styleTextView16 = this.f169709a.f169686m;
                    if (styleTextView16 == null) {
                        C89219l.m154715b();
                    }
                    Locale locale7 = Locale.getDefault();
                    Context context7 = this.f169709a.f169678e;
                    if (context7 == null) {
                        C89219l.m154715b();
                    }
                    String string7 = context7.getString(R.string.b1h);
                    C89219l.m154716b(string7, "");
                    String a8 = C1764a.m5929a(locale7, string7, Arrays.copyOf(new Object[]{cVar.mo119188e()}, 1));
                    C89219l.m154716b(a8, "");
                    styleTextView16.setText(a8);
                    C84402a.m145168a(this.f169709a.f169687n, cVar.mo119187d());
                    View$OnClickListenerC75500b bVar3 = this.f169709a;
                    String designerId = this.f169710b.getDesignerId();
                    String designerEncryptedId = this.f169710b.getDesignerEncryptedId();
                    if (cVar.mo119190g() != 1) {
                        z = false;
                    }
                    C89219l.m154721d(designerId, "");
                    C89219l.m154721d(designerEncryptedId, "");
                    StyleTextView styleTextView17 = bVar3.f169690q;
                    if (styleTextView17 == null) {
                        C89219l.m154715b();
                    }
                    styleTextView17.setOnClickListener(new View$OnClickListenerC75509i(bVar3, designerId, designerEncryptedId, z));
                    if (this.f169709a.f169666H) {
                        LinearLayout linearLayout4 = this.f169709a.f169683j;
                        if (linearLayout4 == null) {
                            C89219l.m154715b();
                        }
                        linearLayout4.setVisibility(0);
                    }
                    SimpleDraweeView simpleDraweeView3 = this.f169709a.f169681h;
                    if (simpleDraweeView3 != null) {
                        C84402a.m145173a(simpleDraweeView3, (String) C89070n.m154583g((List) this.f169710b.getIconUrl().getUrlList()));
                    }
                    if (this.f169709a.f169682i != null) {
                        StyleTextView styleTextView18 = this.f169709a.f169682i;
                        if (styleTextView18 == null) {
                            C89219l.m154715b();
                        }
                        styleTextView18.setText(this.f169710b.getName());
                    }
                    if (this.f169709a.f169666H) {
                        SimpleDraweeView simpleDraweeView4 = this.f169709a.f169675b;
                        if (simpleDraweeView4 != null) {
                            simpleDraweeView4.setVisibility(8);
                        }
                    } else {
                        SimpleDraweeView simpleDraweeView5 = this.f169709a.f169675b;
                        if (simpleDraweeView5 != null) {
                            simpleDraweeView5.setVisibility(0);
                        }
                        C84402a.m145168a(this.f169709a.f169675b, cVar.mo119187d());
                    }
                    if (this.f169709a.f169665G) {
                        TextView textView2 = this.f169709a.f169676c;
                        if (textView2 == null) {
                            C89219l.m154715b();
                        }
                        if (!TextUtils.isEmpty(cVar.mo119184a())) {
                            a = cVar.mo119184a();
                        } else if (cVar.mo119185b() == null) {
                            a = "";
                        } else {
                            a = cVar.mo119185b();
                        }
                        C89219l.m154716b(a, "");
                        textView2.setText(a);
                    }
                }
                this.f169709a.f169679f.put(this.f169710b.getDesignerId(), cVar);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo119172a(boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float a;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        FrameLayout frameLayout = this.f169695v;
        Objects.requireNonNull(frameLayout, "null cannot be cast to non-null type android.view.View");
        float[] fArr = new float[2];
        float f11 = 0.0f;
        if (z) {
            f = 0.0f;
        } else {
            Context a2 = m132443a(this.f169671M);
            C89219l.m154716b(a2, "");
            f = -C76274f.m133713a(a2);
        }
        fArr[0] = f;
        if (z) {
            Context a3 = m132443a(this.f169671M);
            C89219l.m154716b(a3, "");
            f2 = -C76274f.m133713a(a3);
        } else {
            f2 = 0.0f;
        }
        fArr[1] = f2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(frameLayout, "translationX", fArr);
        AVRtlViewPager aVRtlViewPager = this.f169692s;
        Objects.requireNonNull(aVRtlViewPager, "null cannot be cast to non-null type android.view.View");
        float[] fArr2 = new float[2];
        if (z) {
            f3 = 0.0f;
        } else {
            Context a4 = m132443a(this.f169671M);
            C89219l.m154716b(a4, "");
            f3 = -C76274f.m133713a(a4);
        }
        fArr2[0] = f3;
        if (z) {
            Context a5 = m132443a(this.f169671M);
            C89219l.m154716b(a5, "");
            f4 = -C76274f.m133713a(a5);
        } else {
            f4 = 0.0f;
        }
        fArr2[1] = f4;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(aVRtlViewPager, "translationX", fArr2);
        LinearLayout linearLayout = this.f169694u;
        Objects.requireNonNull(linearLayout, "null cannot be cast to non-null type android.view.View");
        float[] fArr3 = new float[2];
        if (z) {
            Context a6 = m132443a(this.f169671M);
            C89219l.m154716b(a6, "");
            f5 = C76274f.m133713a(a6);
        } else {
            f5 = 0.0f;
        }
        fArr3[0] = f5;
        if (z) {
            a = 0.0f;
        } else {
            ActivityC0218d dVar = this.f169671M;
            if (dVar == null) {
                C89219l.m154715b();
            }
            Context a7 = m132443a(dVar);
            C89219l.m154716b(a7, "");
            a = C76274f.m133713a(a7);
        }
        fArr3[1] = a;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(linearLayout, "translationX", fArr3);
        AVRtlViewPager aVRtlViewPager2 = this.f169692s;
        Objects.requireNonNull(aVRtlViewPager2, "null cannot be cast to non-null type android.view.View");
        float[] fArr4 = new float[2];
        if (z) {
            f6 = 1.0f;
        } else {
            f6 = 0.0f;
        }
        fArr4[0] = f6;
        if (z) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        fArr4[1] = f7;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(aVRtlViewPager2, "alpha", fArr4);
        FrameLayout frameLayout2 = this.f169695v;
        Objects.requireNonNull(frameLayout2, "null cannot be cast to non-null type android.view.View");
        float[] fArr5 = new float[2];
        if (z) {
            f8 = 1.0f;
        } else {
            f8 = 0.0f;
        }
        fArr5[0] = f8;
        if (z) {
            f9 = 0.0f;
        } else {
            f9 = 1.0f;
        }
        fArr5[1] = f9;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(frameLayout2, "alpha", fArr5);
        LinearLayout linearLayout2 = this.f169694u;
        Objects.requireNonNull(linearLayout2, "null cannot be cast to non-null type android.view.View");
        float[] fArr6 = new float[2];
        if (z) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        fArr6[0] = f10;
        if (z) {
            f11 = 1.0f;
        }
        fArr6[1] = f11;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(linearLayout2, "alpha", fArr6);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6);
        animatorSet.addListener(new C75502b(this, z));
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.setDuration(300L);
        animatorSet.start();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.m<? super java.lang.String, ? super java.lang.String, ? extends com.ss.android.ugc.aweme.sticker.panel.c.c> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.a<? extends android.graphics.drawable.Drawable> */
    /* JADX WARN: Multi-variable type inference failed */
    public View$OnClickListenerC75500b(boolean z, AbstractC89183m<? super String, ? super String, ? extends AbstractC75512c> mVar, AbstractC89171a<? extends Drawable> aVar, AbstractC75655o oVar, AbstractC75300d dVar, AbstractC75429h hVar, ActivityC0218d dVar2, AbstractC75514e eVar) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(dVar2, "");
        C89219l.m154721d(eVar, "");
        this.f169665G = z;
        this.f169667I = mVar;
        this.f169673R = aVar;
        this.f169668J = oVar;
        this.f169669K = dVar;
        this.f169670L = hVar;
        this.f169671M = dVar2;
        this.f169672N = eVar;
        this.f169679f = new HashMap<>();
    }
}
