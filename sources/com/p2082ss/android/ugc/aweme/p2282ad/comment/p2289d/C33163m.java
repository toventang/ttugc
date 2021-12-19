package com.p2082ss.android.ugc.aweme.p2282ad.comment.p2289d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.PopupWindow;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.p2373e.p2374a.AbstractC34584b;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p2757dg.C41469a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.ad.comment.d.m */
public final class C33163m extends PopupWindow {

    /* renamed from: a */
    public static int f78788a;

    /* renamed from: b */
    public C41469a f78789b;

    /* renamed from: c */
    public int f78790c;

    /* renamed from: d */
    public int f78791d;

    /* renamed from: e */
    public boolean f78792e;

    /* renamed from: f */
    public int f78793f;

    /* renamed from: g */
    public int f78794g;

    /* renamed from: h */
    public int f78795h;

    /* renamed from: i */
    public int f78796i;

    /* renamed from: j */
    public int f78797j;

    /* renamed from: k */
    public boolean f78798k;

    /* renamed from: l */
    public boolean f78799l;

    /* renamed from: m */
    public long f78800m;

    /* renamed from: n */
    public AnimatorSet f78801n;

    /* renamed from: o */
    public long f78802o;

    /* renamed from: p */
    public long f78803p;

    /* renamed from: q */
    public AbstractC34584b<Point> f78804q;

    /* renamed from: r */
    private Activity f78805r;

    /* renamed from: s */
    private TuxTextView f78806s;

    /* renamed from: t */
    private boolean f78807t;

    /* renamed from: u */
    private boolean f78808u;

    /* renamed from: v */
    private Runnable f78809v;

    static {
        Covode.recordClassIndex(39981);
    }

    /* renamed from: a */
    public final void mo59038a() {
        if (!this.f78807t) {
            this.f78789b.setVisibility(8);
            mo59041b();
            getContentView().removeCallbacks(this.f78809v);
            this.f78793f = 0;
            this.f78794g = 0;
        }
    }

    public final void dismiss() {
        if (!this.f78807t) {
            mo59040a(false, this.f78795h);
            getContentView().removeCallbacks(this.f78809v);
            this.f78793f = 0;
            this.f78794g = 0;
        }
    }

    /* renamed from: b */
    public final void mo59041b() {
        AnimatorSet animatorSet = this.f78801n;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f78801n.cancel();
            this.f78801n = null;
        }
        if (!this.f78805r.isFinishing() && isShowing()) {
            try {
                super.dismiss();
            } catch (Exception e) {
                C51423a.m95788a("", e);
            }
        }
    }

    /* renamed from: a */
    public final void mo59039a(View view) {
        C41469a aVar = new C41469a(this.f78805r);
        this.f78789b = aVar;
        aVar.setBackgroundColor(0);
        this.f78789b.addView(view);
        this.f78789b.setGravity(17);
        this.f78789b.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        this.f78789b.setVisibility(8);
        int i = this.f78797j;
        if (i != 0) {
            this.f78789b.setBgColor(i);
        }
        this.f78789b.setNeedPath(this.f78808u);
        this.f78789b.setNeedPressFade(this.f78798k);
        this.f78789b.setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.p2282ad.comment.p2289d.C33163m.View$OnClickListenerC331652 */

            static {
                Covode.recordClassIndex(39983);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                C33163m.this.dismiss();
            }
        });
        setContentView(this.f78789b);
    }

    private C33163m(Activity activity) {
        super(activity);
        this.f78808u = true;
        this.f78800m = 7000;
        this.f78809v = new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.p2282ad.comment.p2289d.C33163m.RunnableC331641 */

            static {
                Covode.recordClassIndex(39982);
            }

            public final void run() {
                C33163m mVar = C33163m.this;
                mVar.mo59040a(false, mVar.f78795h);
            }
        };
        this.f78802o = 800;
        this.f78803p = 200;
        this.f78805r = activity;
        f78788a = (int) ((activity.getResources().getDisplayMetrics().density * 3.0f) + 0.5f);
        setWidth(-2);
        setHeight(-2);
        setFocusable(false);
        setOutsideTouchable(false);
        setClippingEnabled(false);
        setBackgroundDrawable(new ColorDrawable(0));
        setInputMethodMode(1);
        setSoftInputMode(16);
        TuxTextView tuxTextView = new TuxTextView(this.f78805r);
        this.f78806s = tuxTextView;
        tuxTextView.setTextColor(C0643b.m2378c(this.f78805r, R.color.bx));
        this.f78806s.setTuxFont(61);
        this.f78806s.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.f78806s.setMaxLines(2);
        this.f78806s.setGravity(17);
        mo59039a(this.f78806s);
        this.f78792e = true;
        getContentView().measure(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    /* renamed from: b */
    public final void mo59042b(View view) {
        if (!this.f78805r.isFinishing() && view != null && view.getWindowToken() != null) {
            getContentView().removeCallbacks(this.f78809v);
            this.f78795h = 80;
            if (!isShowing()) {
                int i = this.f78790c;
                if (i == 0 || this.f78791d == 0) {
                    getContentView().measure(Integer.MIN_VALUE, Integer.MIN_VALUE);
                } else {
                    getContentView().measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f78791d, 1073741824));
                }
                this.f78789b.mo70729a(0, ((float) (getContentView().getMeasuredWidth() / 2)) + ((float) this.f78796i));
                int[] iArr = new int[2];
                AbstractC34584b<Point> bVar = this.f78804q;
                if (bVar != null) {
                    Point a = bVar.mo61040a();
                    iArr[0] = a.x;
                    iArr[1] = a.y;
                } else {
                    view.getLocationOnScreen(iArr);
                }
                if (this.f78792e) {
                    int i2 = Build.VERSION.SDK_INT;
                    int i3 = Build.VERSION.SDK_INT;
                    getContentView().setSystemUiVisibility(4102);
                }
                showAsDropDown(view, this.f78793f + ((view.getMeasuredWidth() - getContentView().getMeasuredWidth()) / 2), f78788a + this.f78794g);
                mo59040a(true, 80);
                this.f78807t = false;
                if (this.f78800m > 0) {
                    getContentView().postDelayed(this.f78809v, this.f78800m);
                    return;
                }
                return;
            }
            super.dismiss();
        }
    }

    public C33163m(Activity activity, byte b) {
        this(activity);
    }

    /* renamed from: a */
    public final void mo59040a(final boolean z, final int i) {
        final C41469a aVar = this.f78789b;
        if (!z) {
            this.f78807t = true;
        }
        AnimatorSet animatorSet = this.f78801n;
        if (animatorSet == null) {
            this.f78801n = new AnimatorSet();
        } else {
            animatorSet.removeAllListeners();
            this.f78801n.cancel();
        }
        aVar.post(new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.p2282ad.comment.p2289d.C33163m.RunnableC331663 */

            static {
                Covode.recordClassIndex(39984);
            }

            public final void run() {
                int i;
                float f;
                int i2;
                float f2;
                float f3;
                float f4;
                float f5;
                float f6;
                long j;
                if (C33163m.this.f78801n != null) {
                    int i3 = i;
                    if (i3 != 3) {
                        if (i3 == 5) {
                            i = (int) aVar.getX();
                            f2 = aVar.getY();
                            f3 = C33163m.this.f78789b.getBubbleOffset();
                        } else if (i3 == 48) {
                            i = (int) (aVar.getX() + C33163m.this.f78789b.getBubbleOffset());
                            f2 = aVar.getY();
                            f3 = (float) aVar.getMeasuredHeight();
                        } else if (i3 != 80) {
                            i = 0;
                            i2 = 0;
                        } else {
                            i = (int) (aVar.getX() + C33163m.this.f78789b.getBubbleOffset());
                            f = aVar.getY();
                            i2 = (int) f;
                        }
                        f = f2 + f3;
                        i2 = (int) f;
                    } else {
                        i = (int) (aVar.getX() + ((float) aVar.getMeasuredWidth()));
                        f2 = aVar.getY();
                        f3 = C33163m.this.f78789b.getBubbleOffset();
                        f = f2 + f3;
                        i2 = (int) f;
                    }
                    aVar.setPivotY((float) i2);
                    aVar.setPivotX((float) i);
                    View view = aVar;
                    float[] fArr = new float[2];
                    boolean z = z;
                    float f7 = 0.0f;
                    if (z) {
                        f4 = 0.0f;
                    } else {
                        f4 = 1.0f;
                    }
                    fArr[0] = f4;
                    if (z) {
                        f5 = 1.0f;
                    } else {
                        f5 = 0.0f;
                    }
                    fArr[1] = f5;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", fArr);
                    View view2 = aVar;
                    float[] fArr2 = new float[2];
                    boolean z2 = z;
                    if (z2) {
                        f6 = 0.0f;
                    } else {
                        f6 = 1.0f;
                    }
                    fArr2[0] = f6;
                    if (z2) {
                        f7 = 1.0f;
                    }
                    fArr2[1] = f7;
                    C33163m.this.f78801n.play(ofFloat).with(ObjectAnimator.ofFloat(view2, "scaleY", fArr2));
                    AnimatorSet animatorSet = C33163m.this.f78801n;
                    if (z) {
                        j = C33163m.this.f78802o;
                    } else {
                        j = C33163m.this.f78803p;
                    }
                    animatorSet.setDuration(j);
                    if (C33163m.this.f78799l) {
                        C33163m.this.f78801n.setInterpolator(new OvershootInterpolator(1.0f));
                    }
                    C33163m.this.f78801n.addListener(new AnimatorListenerAdapter() {
                        /* class com.p2082ss.android.ugc.aweme.p2282ad.comment.p2289d.C33163m.RunnableC331663.C331671 */

                        static {
                            Covode.recordClassIndex(39985);
                        }

                        public final void onAnimationEnd(Animator animator) {
                            if (!z) {
                                aVar.setVisibility(8);
                                C33163m.this.mo59041b();
                            }
                        }

                        public final void onAnimationStart(Animator animator) {
                            super.onAnimationStart(animator);
                            if (z) {
                                aVar.setVisibility(0);
                            }
                        }
                    });
                    C33163m.this.f78801n.start();
                }
            }
        });
    }

    public final void showAtLocation(View view, int i, int i2, int i3) {
        try {
            super.showAtLocation(view, i, i2, i3);
        } catch (Exception e) {
            C51423a.m95788a("", e);
        }
    }
}
