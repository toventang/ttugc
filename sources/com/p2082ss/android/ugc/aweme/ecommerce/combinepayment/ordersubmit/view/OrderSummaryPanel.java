package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view;

import android.content.Context;
import android.graphics.Outline;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.content.C0643b;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.p1478a.C20714a;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.bytedance.tux.navigation.p1723a.C23194g;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2830b.C43749j;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.OrderSubmitInfoView;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45563h;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.OrderSummaryPanel */
public final class OrderSummaryPanel extends FrameLayout {

    /* renamed from: g */
    public static final C43877a f102255g = new C43877a((byte) 0);

    /* renamed from: a */
    public View f102256a;

    /* renamed from: b */
    public View f102257b;

    /* renamed from: c */
    public AbstractC89171a<C89391z> f102258c;

    /* renamed from: d */
    public final Animation f102259d;

    /* renamed from: e */
    public final Animation f102260e;

    /* renamed from: f */
    public Animation f102261f;

    /* renamed from: h */
    private SparseArray f102262h;

    static {
        Covode.recordClassIndex(52153);
    }

    public OrderSummaryPanel(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: a */
    private View m86779a(int i) {
        if (this.f102262h == null) {
            this.f102262h = new SparseArray();
        }
        View view = (View) this.f102262h.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f102262h.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.OrderSummaryPanel$a */
    public static final class C43877a {
        static {
            Covode.recordClassIndex(52159);
        }

        private C43877a() {
        }

        public /* synthetic */ C43877a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        View view;
        ViewParent viewParent;
        View view2;
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        View view3 = null;
        if (!(parent instanceof View)) {
            parent = null;
        }
        View view4 = (View) parent;
        if (view4 != null) {
            view = view4.findViewById(R.id.cxa);
        } else {
            view = null;
        }
        this.f102256a = view;
        ViewParent parent2 = getParent();
        if (parent2 != null) {
            viewParent = parent2.getParent();
        } else {
            viewParent = null;
        }
        if (!(viewParent instanceof View)) {
            viewParent = null;
        }
        View view5 = (View) viewParent;
        if (view5 != null) {
            view2 = view5.findViewById(R.id.eiw);
        } else {
            view2 = null;
        }
        if ((view2 instanceof View) && view2 != null) {
            view3 = view2.findViewById(R.id.cxb);
        }
        this.f102257b = view3;
    }

    public final void setCloseAction(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        this.f102258c = aVar;
    }

    /* renamed from: a */
    private final int m86778a(Integer num) {
        if (num != null) {
            if (num.intValue() == 1) {
                return C0643b.m2378c(getContext(), R.color.bx);
            }
            if (num.intValue() == 2) {
                return C0643b.m2378c(getContext(), R.color.bh);
            }
        }
        return C0643b.m2378c(getContext(), R.color.c4);
    }

    public final void setBillSummaryData(C43749j jVar) {
        String str;
        MethodCollector.m26663i(8488);
        C89219l.m154721d(jVar, "");
        LinearLayout linearLayout = (LinearLayout) m86779a(R.id.ebl);
        C89219l.m154716b(linearLayout, "");
        if (linearLayout.getChildCount() > 0) {
            ((LinearLayout) m86779a(R.id.ebl)).removeAllViews();
        }
        for (T t : jVar.f102008a) {
            Context context = getContext();
            C89219l.m154716b(context, "");
            OrderSubmitInfoView orderSubmitInfoView = new OrderSubmitInfoView(context, (AttributeSet) null, 6);
            orderSubmitInfoView.setTitleText(t.f102001a);
            orderSubmitInfoView.setDescText(t.f102002b);
            orderSubmitInfoView.mo74781a(false);
            orderSubmitInfoView.setTitleFont(41);
            orderSubmitInfoView.setTitleColor(m86778a(t.f102006f));
            orderSubmitInfoView.setDescFont(41);
            orderSubmitInfoView.setDescColor(m86778a(t.f102003c));
            C20714a aVar = t.f102005e;
            if (!(aVar == null || (str = t.f102004d) == null)) {
                C89219l.m154721d(aVar, "");
                C89219l.m154721d(str, "");
                SmartImageView smartImageView = (SmartImageView) orderSubmitInfoView.mo74779a(R.id.bh1);
                C89219l.m154716b(smartImageView, "");
                smartImageView.setVisibility(0);
                C20766v a = C20761r.m39058a(aVar);
                a.f49092E = (SmartImageView) orderSubmitInfoView.mo74779a(R.id.bh1);
                a.mo34186c();
                SmartImageView smartImageView2 = (SmartImageView) orderSubmitInfoView.mo74779a(R.id.bh1);
                C89219l.m154716b(smartImageView2, "");
                smartImageView2.setOnClickListener(new OrderSubmitInfoView.C43871a(orderSubmitInfoView, str));
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = (int) C13628n.m24520b(getContext(), 15.0f);
            ((LinearLayout) m86779a(R.id.ebl)).addView(orderSubmitInfoView, layoutParams);
        }
        MethodCollector.m26664o(8488);
    }

    private /* synthetic */ OrderSummaryPanel(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private OrderSummaryPanel(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(8490);
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.au);
        this.f102259d = loadAnimation;
        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.at);
        this.f102260e = loadAnimation2;
        this.f102261f = AnimationUtils.loadAnimation(context, R.anim.as);
        C1764a.m5927a(LayoutInflater.from(context), R.layout.rl, this, true);
        TuxNavBar.C23179a aVar = new TuxNavBar.C23179a();
        C23194g gVar = new C23194g();
        String string = context.getString(R.string.fua);
        C89219l.m154716b(string, "");
        TuxNavBar.C23179a a = aVar.mo37731a(gVar.mo37753a(string));
        C23187b a2 = new C23187b().mo37738a(R.raw.icon_x_mark_small);
        a2.f54930b = true;
        ((TuxNavBar) m86779a(R.id.cx9)).setNavActions(a.mo37733b(a2.mo37741a((AbstractC89171a<C89391z>) new AbstractC89171a<C89391z>(this) {
            /* class com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.OrderSummaryPanel.C438721 */

            /* renamed from: a */
            final /* synthetic */ OrderSummaryPanel f102263a;

            static {
                Covode.recordClassIndex(52154);
            }

            {
                this.f102263a = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                AbstractC89171a<C89391z> aVar = this.f102263a.f102258c;
                if (aVar == null) {
                    C89219l.m154710a("onClose");
                }
                aVar.invoke();
                return C89391z.f203057a;
            }
        })));
        ((TuxNavBar) m86779a(R.id.cx9)).mo37727a(true);
        loadAnimation.setAnimationListener(new Animation.AnimationListener(this) {
            /* class com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.OrderSummaryPanel.animationAnimation$AnimationListenerC438732 */

            /* renamed from: a */
            final /* synthetic */ OrderSummaryPanel f102264a;

            static {
                Covode.recordClassIndex(52155);
            }

            public final void onAnimationEnd(Animation animation) {
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f102264a = r1;
            }

            public final void onAnimationStart(Animation animation) {
                ViewPropertyAnimator animate;
                ViewPropertyAnimator duration;
                ViewPropertyAnimator animate2;
                ViewPropertyAnimator duration2;
                this.f102264a.setVisibility(0);
                this.f102264a.setClickable(true);
                View view = this.f102264a.f102256a;
                if (view != null) {
                    view.setVisibility(0);
                }
                View view2 = this.f102264a.f102257b;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                View view3 = this.f102264a.f102256a;
                if (!(view3 == null || (animate2 = view3.animate()) == null || (duration2 = animate2.setDuration(300)) == null)) {
                    duration2.alpha(1.0f);
                }
                View view4 = this.f102264a.f102257b;
                if (view4 != null && (animate = view4.animate()) != null && (duration = animate.setDuration(300)) != null) {
                    duration.alpha(1.0f);
                }
            }
        });
        loadAnimation2.setAnimationListener(new Animation.AnimationListener(this) {
            /* class com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.OrderSummaryPanel.animationAnimation$AnimationListenerC438743 */

            /* renamed from: a */
            final /* synthetic */ OrderSummaryPanel f102265a;

            static {
                Covode.recordClassIndex(52156);
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f102265a = r1;
            }

            public final void onAnimationEnd(Animation animation) {
                this.f102265a.setVisibility(8);
                this.f102265a.setClickable(false);
                View view = this.f102265a.f102256a;
                if (view != null) {
                    view.setVisibility(8);
                }
                View view2 = this.f102265a.f102257b;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            }

            public final void onAnimationStart(Animation animation) {
                ViewPropertyAnimator animate;
                ViewPropertyAnimator duration;
                ViewPropertyAnimator animate2;
                ViewPropertyAnimator duration2;
                View view = this.f102265a.f102256a;
                if (!(view == null || (animate2 = view.animate()) == null || (duration2 = animate2.setDuration(300)) == null)) {
                    duration2.alpha(0.0f);
                }
                View view2 = this.f102265a.f102257b;
                if (view2 != null && (animate = view2.animate()) != null && (duration = animate.setDuration(300)) != null) {
                    duration.alpha(0.0f);
                }
            }
        });
        setOnClickListener(View$OnClickListenerC438754.f102266a);
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new ViewOutlineProvider() {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.OrderSummaryPanel.C438765 */

                static {
                    Covode.recordClassIndex(52158);
                }

                public final void getOutline(View view, Outline outline) {
                    if (view != null && outline != null) {
                        outline.setRoundRect(0, 0, view.getWidth(), (int) (((float) view.getHeight()) + C45563h.f106108d), C45563h.f106108d);
                    }
                }
            });
            setClipToOutline(true);
        }
        MethodCollector.m26664o(8490);
    }
}
