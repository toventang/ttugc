package com.p2082ss.android.ugc.aweme.p3070im.sdk.notification.p3212b;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Scroller;
import android.widget.TextView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.facebook.drawee.p1855f.C24246a;
import com.facebook.drawee.p1855f.C24250e;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.CircleImageView;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.notification.p3211a.C55670k;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.b.a */
public final class C55676a extends FrameLayout {

    /* renamed from: d */
    public static final C55677a f126999d = new C55677a((byte) 0);

    /* renamed from: a */
    final View f127000a;

    /* renamed from: b */
    public AbstractC89172b<? super Integer, C89391z> f127001b;

    /* renamed from: c */
    int f127002c;

    /* renamed from: e */
    private final CircleImageView f127003e;

    /* renamed from: f */
    private final CircleImageView f127004f;

    /* renamed from: g */
    private final CircleImageView f127005g;

    /* renamed from: h */
    private final CircleImageView f127006h;

    /* renamed from: i */
    private final TextView f127007i;

    /* renamed from: j */
    private final TextView f127008j;

    /* renamed from: k */
    private final float f127009k;

    /* renamed from: l */
    private final float f127010l;

    /* renamed from: m */
    private final float f127011m;

    /* renamed from: n */
    private boolean f127012n;

    /* renamed from: o */
    private int f127013o;

    /* renamed from: p */
    private float f127014p;

    /* renamed from: q */
    private final Scroller f127015q;

    /* renamed from: r */
    private final GestureDetector f127016r;

    /* renamed from: s */
    private int f127017s;

    static {
        Covode.recordClassIndex(65459);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.b.a$a */
    public static final class C55677a {
        static {
            Covode.recordClassIndex(65460);
        }

        private C55677a() {
        }

        public /* synthetic */ C55677a(byte b) {
            this();
        }
    }

    public final void computeScroll() {
        super.computeScroll();
        if (this.f127015q.computeScrollOffset()) {
            scrollTo(this.f127015q.getCurrX(), this.f127015q.getCurrY());
            invalidate();
        }
    }

    /* renamed from: a */
    public final void mo92562a() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f127000a, "translationY", (-C13628n.m24520b(getContext(), 80.0f)) - ((float) this.f127002c), 0.0f);
        C89219l.m154716b(ofFloat, "");
        ofFloat.setDuration(300L);
        ofFloat.start();
    }

    public final void setActionListener(AbstractC89172b<? super Integer, C89391z> bVar) {
        this.f127001b = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.b.a$c */
    public static final class C55679c extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a */
        final /* synthetic */ C55676a f127020a;

        static {
            Covode.recordClassIndex(65462);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55679c(C55676a aVar) {
            this.f127020a = aVar;
        }

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            AbstractC89172b<? super Integer, C89391z> bVar = this.f127020a.f127001b;
            if (bVar == null) {
                return true;
            }
            bVar.invoke(0);
            return true;
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (motionEvent == null || motionEvent2 == null) {
                return super.onFling(motionEvent, motionEvent2, f, f2);
            }
            float x = motionEvent.getX() - motionEvent2.getX();
            if (motionEvent.getY() > motionEvent2.getY()) {
                float y = motionEvent.getY() - motionEvent2.getY();
                if (x == 0.0f) {
                    x = 1.0f;
                }
                if (y / Math.abs(x) > 0.65f) {
                    AbstractC89172b<? super Integer, C89391z> bVar = this.f127020a.f127001b;
                    if (bVar == null) {
                        return true;
                    }
                    bVar.invoke(3);
                    return true;
                }
            }
            return super.onFling(motionEvent, motionEvent2, f, f2);
        }
    }

    /* renamed from: b */
    private final void m101435b(int i) {
        View view = this.f127000a;
        C89219l.m154716b(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, i);
        }
        layoutParams.height = i;
        View view2 = this.f127000a;
        C89219l.m154716b(view2, "");
        view2.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.b.a$b */
    public static final class C55678b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ float f127018a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f127019b;

        static {
            Covode.recordClassIndex(65461);
        }

        C55678b(float f, AbstractC89171a aVar) {
            this.f127018a = f;
            this.f127019b = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            AbstractC89171a aVar;
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            if (((Float) animatedValue).floatValue() == this.f127018a && (aVar = this.f127019b) != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: a */
    private final void m101434a(int i) {
        this.f127017s = i;
        if (i != 0) {
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                            break;
                        default:
                            return;
                    }
                } else {
                    m101435b((int) this.f127011m);
                    return;
                }
            }
            m101435b((int) this.f127010l);
            return;
        }
        m101435b((int) this.f127010l);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C55676a(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(5382);
        View inflate = View.inflate(context, R.layout.a8o, this);
        this.f127000a = inflate;
        this.f127003e = (CircleImageView) inflate.findViewById(R.id.on);
        this.f127004f = (CircleImageView) inflate.findViewById(R.id.lx);
        this.f127005g = (CircleImageView) inflate.findViewById(R.id.lz);
        this.f127006h = (CircleImageView) inflate.findViewById(R.id.ly);
        this.f127007i = (TextView) inflate.findViewById(R.id.cpq);
        this.f127008j = (TextView) inflate.findViewById(R.id.ajt);
        this.f127009k = C13628n.m24520b(context, 25.0f);
        this.f127010l = C13628n.m24520b(context, 80.0f);
        this.f127011m = C13628n.m24520b(context, 160.0f);
        this.f127013o = -1;
        this.f127002c = C13628n.m24525e(context);
        this.f127015q = new Scroller(context);
        this.f127016r = new GestureDetector(context, new C55679c(this));
        MethodCollector.m26664o(5382);
    }

    /* renamed from: a */
    public final void mo92563a(C55670k kVar) {
        if (kVar != null) {
            CircleImageView circleImageView = this.f127003e;
            C89219l.m154716b(circleImageView, "");
            C24246a aVar = (C24246a) circleImageView.getHierarchy();
            C89219l.m154716b(aVar, "");
            C24250e eVar = new C24250e();
            eVar.f57500b = true;
            aVar.mo39959a(eVar);
            if (kVar.f126970a == 0 || kVar.f126970a == 3 || kVar.f126970a == 2 || kVar.f126970a == 6) {
                if (kVar.f126974e != null) {
                    C34577e.m70592a(this.f127003e, kVar.f126974e);
                } else {
                    C34577e.m70608b(this.f127003e, kVar.f126975f, -1, -1);
                }
            } else if (kVar.f126970a == 1) {
                if (kVar.f126974e != null) {
                    C34577e.m70592a(this.f127003e, kVar.f126974e);
                } else {
                    CircleImageView circleImageView2 = this.f127004f;
                    C89219l.m154716b(circleImageView2, "");
                    circleImageView2.setVisibility(0);
                    CircleImageView circleImageView3 = this.f127005g;
                    C89219l.m154716b(circleImageView3, "");
                    circleImageView3.setVisibility(0);
                    CircleImageView circleImageView4 = this.f127006h;
                    C89219l.m154716b(circleImageView4, "");
                    circleImageView4.setVisibility(0);
                    C34577e.m70592a(this.f127004f, kVar.f126976g);
                    C34577e.m70592a(this.f127006h, kVar.f126977h);
                }
            } else if (kVar.f126970a == 5) {
                C34577e.m70591a(this.f127003e, 2131232829);
            } else if (kVar.f126970a == 8) {
                C34577e.m70608b(this.f127003e, kVar.f126975f, -1, -1);
            } else if (kVar.f126970a == 9) {
                C34577e.m70608b(this.f127003e, kVar.f126975f, -1, -1);
            }
            TextView textView = this.f127007i;
            C89219l.m154716b(textView, "");
            textView.setText(kVar.f126978i);
            TextView textView2 = this.f127008j;
            C89219l.m154716b(textView2, "");
            textView2.setText(kVar.f126980k);
            if (kVar.f126970a == 0) {
                m101434a(this.f127017s);
            } else {
                m101434a(kVar.f126970a);
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && !this.f127016r.onTouchEvent(motionEvent) && this.f127017s == 0) {
            int action = motionEvent.getAction();
            int i = 0;
            if (action != 1) {
                if (action == 2) {
                    int i2 = this.f127013o;
                    if (i2 == -1 || motionEvent.findPointerIndex(i2) < 0) {
                        return false;
                    }
                    if (Math.min(motionEvent.getRawY() - this.f127014p, this.f127009k) > this.f127009k / 4.0f && !this.f127012n) {
                        m101435b((int) this.f127011m);
                        scrollBy(0, -((int) this.f127009k));
                        this.f127012n = true;
                    }
                } else if (action != 3) {
                    if (action == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.f127013o) {
                            if (actionIndex == 0) {
                                i = 1;
                            }
                            this.f127013o = motionEvent.getPointerId(i);
                        }
                    }
                }
            }
            if (motionEvent.findPointerIndex(this.f127013o) < 0) {
                return false;
            }
            if (this.f127012n) {
                this.f127012n = false;
                int i3 = -getScrollY();
                this.f127015q.startScroll(0, i3, 0, -i3, 300);
                invalidate();
                this.f127013o = -1;
                m101434a(2);
                AbstractC89172b<? super Integer, C89391z> bVar = this.f127001b;
                if (bVar != null) {
                    bVar.invoke(4);
                }
            }
            this.f127013o = -1;
        }
        return true;
    }

    public /* synthetic */ C55676a(Context context, byte b) {
        this(context);
    }
}
