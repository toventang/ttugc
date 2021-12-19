package com.bytedance.ies.xelement.picker.view;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.xelement.picker.p1386c.C19333a;
import com.bytedance.ies.xelement.picker.p1388e.AbstractC19341e;
import com.bytedance.ies.xelement.picker.p1390g.C19350a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.ies.xelement.picker.view.a */
public abstract class AbstractC19354a {

    /* renamed from: a */
    public ViewGroup f45810a;

    /* renamed from: b */
    public ViewGroup f45811b;

    /* renamed from: c */
    public AbstractC19341e f45812c;

    /* renamed from: d */
    public boolean f45813d;

    /* renamed from: e */
    public boolean f45814e;

    /* renamed from: f */
    protected int f45815f = 80;

    /* renamed from: g */
    public Dialog f45816g;

    /* renamed from: h */
    protected View f45817h;

    /* renamed from: i */
    protected boolean f45818i;

    /* renamed from: j */
    private Context f45819j;

    /* renamed from: k */
    private ViewGroup f45820k;

    /* renamed from: l */
    private Animation f45821l;

    /* renamed from: m */
    private Animation f45822m;

    /* renamed from: n */
    private boolean f45823n = true;

    /* renamed from: o */
    private View.OnKeyListener f45824o = new View.OnKeyListener() {
        /* class com.bytedance.ies.xelement.picker.view.AbstractC19354a.View$OnKeyListenerC193584 */

        static {
            Covode.recordClassIndex(22147);
        }

        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (i != 4 || keyEvent.getAction() != 0 || !AbstractC19354a.this.mo30853d()) {
                return false;
            }
            AbstractC19354a.this.mo30854e();
            return true;
        }
    };

    /* renamed from: p */
    private final View.OnTouchListener f45825p = new View.OnTouchListener() {
        /* class com.bytedance.ies.xelement.picker.view.AbstractC19354a.View$OnTouchListenerC193595 */

        static {
            Covode.recordClassIndex(22148);
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0) {
                return false;
            }
            AbstractC19354a.this.mo30854e();
            return false;
        }
    };

    static {
        Covode.recordClassIndex(22143);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C19333a mo30848a();

    /* renamed from: h */
    public boolean mo30857h() {
        return false;
    }

    /* renamed from: f */
    public final void mo30855f() {
        mo30848a().f45696d.post(new Runnable() {
            /* class com.bytedance.ies.xelement.picker.view.AbstractC19354a.RunnableC193573 */

            static {
                Covode.recordClassIndex(22146);
            }

            public final void run() {
                MethodCollector.m26663i(9769);
                AbstractC19354a.this.mo30848a().f45696d.removeView(AbstractC19354a.this.f45811b);
                AbstractC19354a.this.f45814e = false;
                AbstractC19354a.this.f45813d = false;
                if (AbstractC19354a.this.f45812c != null) {
                    AbstractC19354a.this.f45812c.mo30809a();
                }
                MethodCollector.m26664o(9769);
            }
        });
    }

    /* renamed from: g */
    public final void mo30856g() {
        Dialog dialog = this.f45816g;
        if (dialog != null) {
            dialog.setCancelable(mo30848a().f45716x);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo30852c() {
        this.f45822m = AnimationUtils.loadAnimation(this.f45819j, C19350a.m36103a(this.f45815f, true));
        this.f45821l = AnimationUtils.loadAnimation(this.f45819j, C19350a.m36103a(this.f45815f, false));
    }

    /* renamed from: d */
    public final boolean mo30853d() {
        if (mo30857h()) {
            return false;
        }
        if (this.f45811b.getParent() != null || this.f45814e) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void mo30854e() {
        if (mo30857h()) {
            Dialog dialog = this.f45816g;
            if (dialog != null) {
                dialog.dismiss();
            }
        } else if (!this.f45813d) {
            if (this.f45823n) {
                this.f45821l.setAnimationListener(new Animation.AnimationListener() {
                    /* class com.bytedance.ies.xelement.picker.view.AbstractC19354a.animationAnimation$AnimationListenerC193562 */

                    static {
                        Covode.recordClassIndex(22145);
                    }

                    public final void onAnimationRepeat(Animation animation) {
                    }

                    public final void onAnimationStart(Animation animation) {
                    }

                    public final void onAnimationEnd(Animation animation) {
                        AbstractC19354a.this.mo30855f();
                    }
                });
                this.f45810a.startAnimation(this.f45821l);
            } else {
                mo30855f();
            }
            this.f45813d = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo30851b() {
        ViewGroup viewGroup;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        LayoutInflater from = LayoutInflater.from(this.f45819j);
        if (mo30857h()) {
            ViewGroup viewGroup2 = (ViewGroup) C1764a.m5927a(from, R.layout.aju, null, false);
            this.f45820k = viewGroup2;
            viewGroup2.setBackgroundColor(0);
            this.f45810a = (ViewGroup) this.f45820k.findViewById(R.id.ad6);
            layoutParams.leftMargin = 30;
            layoutParams.rightMargin = 30;
            this.f45810a.setLayoutParams(layoutParams);
            if (this.f45820k != null) {
                Dialog dialog = new Dialog(this.f45819j, R.style.w6);
                this.f45816g = dialog;
                dialog.setCancelable(mo30848a().f45716x);
                this.f45816g.setContentView(this.f45820k);
                Window window = this.f45816g.getWindow();
                if (window != null) {
                    window.setWindowAnimations(R.style.zo);
                    window.setGravity(17);
                }
                this.f45816g.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    /* class com.bytedance.ies.xelement.picker.view.AbstractC19354a.DialogInterface$OnDismissListenerC193606 */

                    static {
                        Covode.recordClassIndex(22149);
                    }

                    public final void onDismiss(DialogInterface dialogInterface) {
                        if (AbstractC19354a.this.f45812c != null) {
                            AbstractC19354a.this.f45812c.mo30809a();
                        }
                    }
                });
            }
        } else {
            if (mo30848a().f45696d == null) {
                mo30848a().f45696d = (ViewGroup) ((Activity) this.f45819j).getWindow().getDecorView();
            }
            ViewGroup viewGroup3 = (ViewGroup) C1764a.m5927a(from, R.layout.aju, mo30848a().f45696d, false);
            this.f45811b = viewGroup3;
            viewGroup3.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            if (mo30848a().f45713u != -1) {
                this.f45811b.setBackgroundColor(mo30848a().f45713u);
            }
            ViewGroup viewGroup4 = (ViewGroup) this.f45811b.findViewById(R.id.ad6);
            this.f45810a = viewGroup4;
            viewGroup4.setLayoutParams(layoutParams);
        }
        if (mo30857h()) {
            viewGroup = this.f45820k;
        } else {
            viewGroup = this.f45811b;
        }
        viewGroup.setFocusable(true);
        viewGroup.setFocusableInTouchMode(true);
        viewGroup.setOnKeyListener(this.f45824o);
        this.f45812c = new AbstractC19341e() {
            /* class com.bytedance.ies.xelement.picker.view.AbstractC19354a.C193551 */

            static {
                Covode.recordClassIndex(22144);
            }

            @Override // com.bytedance.ies.xelement.picker.p1388e.AbstractC19341e
            /* renamed from: a */
            public final void mo30809a() {
                if (!AbstractC19354a.this.f45818i && AbstractC19354a.this.mo30848a().f45693a != null) {
                    AbstractC19354a.this.mo30848a().f45693a.mo30773a();
                }
            }
        };
    }

    /* renamed from: a */
    public final View mo30847a(int i) {
        return this.f45810a.findViewById(i);
    }

    public AbstractC19354a(Context context) {
        this.f45819j = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final AbstractC19354a mo30849a(boolean z) {
        ViewGroup viewGroup = this.f45811b;
        if (viewGroup != null) {
            View findViewById = viewGroup.findViewById(R.id.cy9);
            if (z) {
                findViewById.setOnTouchListener(this.f45825p);
            } else {
                findViewById.setOnTouchListener(null);
            }
        }
        return this;
    }

    /* renamed from: a */
    public final void mo30850a(View view) {
        Dialog dialog;
        if (mo30857h() && (dialog = this.f45816g) != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
            this.f45810a.setLayoutParams(layoutParams);
            Window window = dialog.getWindow();
            if (window != null) {
                window.setWindowAnimations(R.style.zp);
                window.setGravity(80);
                window.setDimAmount(0.3f);
            }
        }
        this.f45817h = view;
        if (mo30857h()) {
            Dialog dialog2 = this.f45816g;
            if (dialog2 != null) {
                dialog2.show();
                WindowManager.LayoutParams attributes = this.f45816g.getWindow().getAttributes();
                attributes.width = -1;
                this.f45816g.getWindow().setAttributes(attributes);
            }
        } else if (!mo30853d()) {
            this.f45814e = true;
            mo30848a().f45696d.addView(this.f45811b);
            if (this.f45823n) {
                this.f45810a.startAnimation(this.f45822m);
            }
            this.f45811b.requestFocus();
        }
    }
}
