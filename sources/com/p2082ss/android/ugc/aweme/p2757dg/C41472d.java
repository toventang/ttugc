package com.p2082ss.android.ugc.aweme.p2757dg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.PopupWindow;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2373e.p2374a.AbstractC34584b;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;

/* renamed from: com.ss.android.ugc.aweme.dg.d */
public final class C41472d extends PopupWindow {

    /* renamed from: a */
    public int f96748a;

    /* renamed from: b */
    public C41469a f96749b;

    /* renamed from: c */
    public Activity f96750c;

    /* renamed from: d */
    public int f96751d;

    /* renamed from: e */
    public int f96752e;

    /* renamed from: f */
    public boolean f96753f;

    /* renamed from: g */
    public int f96754g;

    /* renamed from: h */
    public int f96755h;

    /* renamed from: i */
    public int f96756i;

    /* renamed from: j */
    public int f96757j;

    /* renamed from: k */
    public boolean f96758k = true;

    /* renamed from: l */
    public boolean f96759l;

    /* renamed from: m */
    public boolean f96760m;

    /* renamed from: n */
    public int f96761n;

    /* renamed from: o */
    public boolean f96762o;

    /* renamed from: p */
    public long f96763p = 7000;

    /* renamed from: q */
    public AnimatorSet f96764q;

    /* renamed from: r */
    public long f96765r = 800;

    /* renamed from: s */
    public long f96766s = 200;

    /* renamed from: t */
    public AbstractC34584b<Point> f96767t;

    /* renamed from: u */
    public AbstractC41477a f96768u;

    /* renamed from: v */
    private boolean f96769v;

    /* renamed from: w */
    private Runnable f96770w = new Runnable() {
        /* class com.p2082ss.android.ugc.aweme.p2757dg.C41472d.RunnableC414731 */

        static {
            Covode.recordClassIndex(49372);
        }

        public final void run() {
            C41472d dVar = C41472d.this;
            dVar.mo70744a(false, dVar.f96756i);
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.dg.d$a */
    public interface AbstractC41477a {
        static {
            Covode.recordClassIndex(49376);
        }

        /* renamed from: a */
        void mo70753a();
    }

    static {
        Covode.recordClassIndex(49371);
    }

    public final void dismiss() {
        if (!this.f96769v) {
            mo70744a(false, this.f96756i);
            getContentView().removeCallbacks(this.f96770w);
            this.f96754g = 0;
            this.f96755h = 0;
        }
    }

    /* renamed from: a */
    public final void mo70742a() {
        if (!this.f96750c.isFinishing() && isShowing()) {
            AnimatorSet animatorSet = this.f96764q;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.f96764q.cancel();
                this.f96764q = null;
            }
            try {
                super.dismiss();
            } catch (Exception e) {
                C51423a.m95788a("", e);
            }
        }
    }

    /* renamed from: b */
    public final void mo70745b() {
        int i = this.f96751d;
        if (i == 0 || this.f96752e == 0) {
            getContentView().measure(View.MeasureSpec.makeMeasureSpec(C34723i.m70928b(getContentView().getContext()), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(C34723i.m70924a(getContentView().getContext()), Integer.MIN_VALUE));
            return;
        }
        getContentView().measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f96752e, 1073741824));
    }

    public C41472d(Activity activity) {
        super(activity);
        this.f96750c = activity;
        this.f96748a = (int) ((activity.getResources().getDisplayMetrics().density * 3.0f) + 0.5f);
        setWidth(-2);
        setHeight(-2);
        setFocusable(false);
        setOutsideTouchable(false);
        setClippingEnabled(false);
        setBackgroundDrawable(new ColorDrawable(0));
        setInputMethodMode(1);
        setSoftInputMode(16);
    }

    /* renamed from: a */
    public final void mo70743a(View view) {
        if (!this.f96750c.isFinishing() && view != null && view.getWindowToken() != null) {
            float b = C13628n.m24520b(this.f96750c, 36.0f);
            float b2 = C13628n.m24520b(this.f96750c, 64.0f);
            float b3 = C13628n.m24520b(this.f96750c, 16.0f);
            getContentView().removeCallbacks(this.f96770w);
            if (!isShowing()) {
                int i = 2;
                int[] iArr = new int[2];
                AbstractC34584b<Point> bVar = this.f96767t;
                if (bVar != null) {
                    Point a = bVar.mo61040a();
                    iArr[0] = a.x;
                    iArr[1] = a.y;
                } else {
                    view.getLocationOnScreen(iArr);
                }
                this.f96756i = 48;
                this.f96761n = -((int) C13628n.m24520b(view.getContext(), 3.5f));
                if (((float) (iArr[1] - getContentView().getMeasuredHeight())) - b < b2) {
                    this.f96756i = 80;
                }
                if (((float) iArr[0]) - (((float) getContentView().getMeasuredWidth()) / 2.0f) < b3) {
                    this.f96754g = (int) (b3 - (((float) iArr[0]) - (((float) getContentView().getMeasuredWidth()) / 2.0f)));
                }
                if (((float) C34723i.m70928b(this.f96750c)) - (((float) iArr[0]) + (((float) getContentView().getMeasuredWidth()) / 2.0f)) < b3) {
                    this.f96754g = (int) ((((float) C34723i.m70928b(this.f96750c)) - (((float) iArr[0]) + (((float) getContentView().getMeasuredWidth()) / 2.0f))) - b3);
                }
                int i2 = this.f96756i;
                if (i2 != 3) {
                    if (i2 != 5) {
                        if (i2 == 48) {
                            i = 3;
                        } else if (i2 == 80) {
                            i = 0;
                        }
                    }
                    i = 1;
                }
                float measuredWidth = ((float) getContentView().getMeasuredWidth()) / 2.0f;
                this.f96749b.mo70729a(i, (((float) this.f96761n) + measuredWidth) - ((float) this.f96754g));
                if (this.f96753f) {
                    int i3 = Build.VERSION.SDK_INT;
                    int i4 = Build.VERSION.SDK_INT;
                    getContentView().setSystemUiVisibility(4102);
                }
                int i5 = this.f96756i;
                if (i5 == 48) {
                    showAtLocation(view, 0, (int) (((float) (iArr[0] + this.f96754g)) - measuredWidth), (int) ((((float) (iArr[1] + this.f96755h)) - b) - ((float) getContentView().getMeasuredHeight())));
                    mo70744a(true, this.f96756i);
                } else if (i5 == 80) {
                    showAtLocation(view, 0, (int) (((float) (iArr[0] + this.f96754g)) - measuredWidth), (int) (((float) (iArr[1] + this.f96755h)) + b));
                    mo70744a(true, this.f96756i);
                }
                this.f96769v = false;
                if (this.f96763p > 0) {
                    getContentView().postDelayed(this.f96770w, this.f96763p);
                    return;
                }
                return;
            }
            super.dismiss();
        }
    }

    /* renamed from: a */
    public final void mo70744a(final boolean z, final int i) {
        final C41469a aVar = this.f96749b;
        if (!z) {
            this.f96769v = true;
        }
        AnimatorSet animatorSet = this.f96764q;
        if (animatorSet == null) {
            this.f96764q = new AnimatorSet();
        } else {
            animatorSet.removeAllListeners();
            this.f96764q.cancel();
        }
        aVar.post(new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.p2757dg.C41472d.RunnableC414753 */

            static {
                Covode.recordClassIndex(49374);
            }

            public final void run() {
                boolean z;
                float f;
                float f2;
                float f3;
                long j;
                if (C41472d.this.f96764q != null) {
                    C41472d dVar = C41472d.this;
                    if (!dVar.f96762o || !C80471gb.m139483a(dVar.f96750c)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        C41472d dVar2 = C41472d.this;
                        int i = i;
                        View view = aVar;
                        Point point = new Point(0, 0);
                        if (i == 3) {
                            point.x = (int) view.getX();
                            point.y = (int) (view.getY() + dVar2.f96749b.getBubbleOffset());
                        } else if (i == 5) {
                            point.x = (int) (view.getX() + ((float) view.getMeasuredWidth()));
                            point.y = (int) (view.getY() + dVar2.f96749b.getBubbleOffset());
                        } else if (i == 48) {
                            point.x = (int) (view.getX() + dVar2.f96749b.getBubbleOffset());
                            point.y = (int) (view.getY() + ((float) view.getMeasuredHeight()));
                        } else if (i == 80) {
                            point.x = (int) (view.getX() + dVar2.f96749b.getBubbleOffset());
                            point.y = (int) view.getY();
                        }
                        view.setPivotY((float) point.y);
                        view.setPivotX((float) point.x);
                    } else {
                        C41472d dVar3 = C41472d.this;
                        int i2 = i;
                        View view2 = aVar;
                        Point point2 = new Point(0, 0);
                        if (i2 == 3) {
                            point2.x = (int) (view2.getX() + ((float) view2.getMeasuredWidth()));
                            point2.y = (int) (view2.getY() + dVar3.f96749b.getBubbleOffset());
                        } else if (i2 == 5) {
                            point2.x = (int) view2.getX();
                            point2.y = (int) (view2.getY() + dVar3.f96749b.getBubbleOffset());
                        } else if (i2 == 48) {
                            point2.x = (int) (view2.getX() + dVar3.f96749b.getBubbleOffset());
                            point2.y = (int) (view2.getY() + ((float) view2.getMeasuredHeight()));
                        } else if (i2 == 80) {
                            point2.x = (int) (view2.getX() + dVar3.f96749b.getBubbleOffset());
                            point2.y = (int) view2.getY();
                        }
                        view2.setPivotY((float) point2.y);
                        view2.setPivotX((float) point2.x);
                    }
                    View view3 = aVar;
                    float[] fArr = new float[2];
                    boolean z2 = z;
                    float f4 = 0.0f;
                    if (z2) {
                        f = 0.0f;
                    } else {
                        f = 1.0f;
                    }
                    fArr[0] = f;
                    if (z2) {
                        f2 = 1.0f;
                    } else {
                        f2 = 0.0f;
                    }
                    fArr[1] = f2;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view3, "scaleX", fArr);
                    View view4 = aVar;
                    float[] fArr2 = new float[2];
                    boolean z3 = z;
                    if (z3) {
                        f3 = 0.0f;
                    } else {
                        f3 = 1.0f;
                    }
                    fArr2[0] = f3;
                    if (z3) {
                        f4 = 1.0f;
                    }
                    fArr2[1] = f4;
                    C41472d.this.f96764q.play(ofFloat).with(ObjectAnimator.ofFloat(view4, "scaleY", fArr2));
                    AnimatorSet animatorSet = C41472d.this.f96764q;
                    if (z) {
                        j = C41472d.this.f96765r;
                    } else {
                        j = C41472d.this.f96766s;
                    }
                    animatorSet.setDuration(j);
                    if (C41472d.this.f96760m) {
                        C41472d.this.f96764q.setInterpolator(new OvershootInterpolator(1.0f));
                    }
                    C41472d.this.f96764q.addListener(new AnimatorListenerAdapter() {
                        /* class com.p2082ss.android.ugc.aweme.p2757dg.C41472d.RunnableC414753.C414761 */

                        static {
                            Covode.recordClassIndex(49375);
                        }

                        public final void onAnimationEnd(Animator animator) {
                            if (!z) {
                                aVar.setVisibility(8);
                                C41472d.this.mo70742a();
                            }
                        }

                        public final void onAnimationStart(Animator animator) {
                            super.onAnimationStart(animator);
                            if (z) {
                                aVar.setVisibility(0);
                            }
                        }
                    });
                    C41472d.this.f96764q.start();
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
