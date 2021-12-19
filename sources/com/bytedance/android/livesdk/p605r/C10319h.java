package com.bytedance.android.livesdk.p605r;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.p605r.C10328j;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.r.h */
public final class C10319h extends AbstractC10312b {

    /* renamed from: a */
    public C10318g f24929a;

    /* renamed from: b */
    public C10328j.C10329a f24930b;

    /* renamed from: c */
    public ValueAnimator f24931c;

    /* renamed from: d */
    public ValueAnimator f24932d;

    /* renamed from: e */
    public float f24933e;

    /* renamed from: f */
    public float f24934f;

    /* renamed from: g */
    public float f24935g;

    /* renamed from: h */
    public float f24936h;

    /* renamed from: i */
    public boolean f24937i;

    /* renamed from: j */
    public int f24938j;

    /* renamed from: k */
    public boolean f24939k;

    /* renamed from: l */
    public int f24940l;

    /* renamed from: m */
    public int f24941m;

    /* renamed from: n */
    public boolean f24942n = true;

    /* renamed from: o */
    private C10314d f24943o;

    /* renamed from: p */
    private TimeInterpolator f24944p;

    /* renamed from: q */
    private boolean f24945q = true;

    static {
        Covode.recordClassIndex(11885);
    }

    private C10319h() {
    }

    @Override // com.bytedance.android.livesdk.p605r.AbstractC10312b
    /* renamed from: a */
    public final void mo17082a() {
        C10328j.m18797a(this.f24930b.f24980r);
        this.f24929a.mo17097f();
        this.f24939k = false;
    }

    /* renamed from: e */
    public final View mo17101e() {
        this.f24938j = ViewConfiguration.get(this.f24930b.f24963a).getScaledTouchSlop();
        return this.f24930b.f24964b;
    }

    /* renamed from: f */
    private void m18789f() {
        if (this.f24930b.f24985w == null) {
            if (this.f24944p == null) {
                this.f24944p = new DecelerateInterpolator();
            }
            this.f24930b.f24985w = this.f24944p;
        }
        this.f24932d.setInterpolator(this.f24930b.f24985w);
        this.f24932d.addListener(new AnimatorListenerAdapter() {
            /* class com.bytedance.android.livesdk.p605r.C10319h.C103267 */

            static {
                Covode.recordClassIndex(11892);
            }

            public final void onAnimationEnd(Animator animator) {
                C10319h.this.f24932d.removeAllUpdateListeners();
                C10319h.this.f24932d.removeAllListeners();
                C10319h.this.f24932d = null;
            }
        });
        this.f24932d.setDuration(this.f24930b.f24984v).start();
    }

    /* renamed from: d */
    public final void mo17100d() {
        if (!this.f24945q && this.f24939k) {
            mo17101e().setVisibility(4);
            this.f24939k = false;
            if (this.f24930b.f24982t != null) {
                this.f24930b.f24982t.mo8457b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo17098b() {
        if (this.f24930b.f24979q == null) {
            if (this.f24944p == null) {
                this.f24944p = new DecelerateInterpolator();
            }
            this.f24930b.f24979q = this.f24944p;
        }
        this.f24931c.setInterpolator(this.f24930b.f24979q);
        this.f24931c.addListener(new AnimatorListenerAdapter() {
            /* class com.bytedance.android.livesdk.p605r.C10319h.C103256 */

            static {
                Covode.recordClassIndex(11891);
            }

            public final void onAnimationEnd(Animator animator) {
                C10319h.this.f24931c.removeAllUpdateListeners();
                C10319h.this.f24931c.removeAllListeners();
                C10319h.this.f24931c = null;
                if (C10319h.this.f24930b.f24982t != null) {
                    C10319h.this.f24930b.f24982t.mo8459d();
                }
            }
        });
        this.f24931c.setDuration(this.f24930b.f24978p).start();
        if (this.f24930b.f24982t != null) {
            this.f24930b.f24982t.mo8458c();
        }
    }

    /* renamed from: c */
    public final void mo17099c() {
        int i;
        if (this.f24945q) {
            this.f24929a.mo17096e();
            this.f24945q = false;
            this.f24939k = true;
        } else if (!this.f24939k) {
            mo17101e().setVisibility(0);
            this.f24939k = true;
        } else {
            return;
        }
        if (this.f24930b.f24982t != null) {
            this.f24930b.f24982t.mo8455a();
        }
        if (this.f24930b.f24984v > 0) {
            if ((this.f24929a.f24927g * 2) + this.f24930b.f24966d > C3966y.m9664c()) {
                i = C3966y.m9664c();
            } else {
                i = -this.f24930b.f24966d;
            }
            ValueAnimator ofInt = ObjectAnimator.ofInt(i, this.f24929a.f24927g);
            this.f24932d = ofInt;
            ofInt.addUpdateListener(new C10327i(this));
            m18789f();
        }
    }

    C10319h(C10328j.C10329a aVar) {
        this.f24930b = aVar;
        this.f24929a = new C10318g(aVar.f24963a);
        mo17101e().setOnTouchListener(new View.OnTouchListener() {
            /* class com.bytedance.android.livesdk.p605r.C10319h.View$OnTouchListenerC103212 */

            /* renamed from: a */
            float f24947a;

            /* renamed from: b */
            float f24948b;

            /* renamed from: c */
            float f24949c;

            /* renamed from: d */
            float f24950d;

            /* renamed from: e */
            int f24951e;

            /* renamed from: f */
            int f24952f;

            /* renamed from: g */
            Point f24953g = new Point();

            static {
                Covode.recordClassIndex(11887);
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean z;
                int i;
                int action = motionEvent.getAction();
                if (action == 0) {
                    C10319h.this.f24933e = motionEvent.getRawX();
                    C10319h.this.f24934f = motionEvent.getRawY();
                    this.f24947a = motionEvent.getRawX();
                    this.f24948b = motionEvent.getRawY();
                    C10319h hVar = C10319h.this;
                    if (hVar.f24931c != null && hVar.f24931c.isRunning()) {
                        hVar.f24931c.cancel();
                    }
                    WindowManager windowManager = C10319h.this.f24929a.f24925e;
                    if (windowManager != null) {
                        windowManager.getDefaultDisplay().getSize(this.f24953g);
                        C10319h.this.f24940l = this.f24953g.x;
                        C10319h.this.f24941m = this.f24953g.y;
                    } else {
                        C10319h hVar2 = C10319h.this;
                        hVar2.f24941m = C13628n.m24521b(hVar2.f24930b.f24963a);
                        C10319h hVar3 = C10319h.this;
                        hVar3.f24940l = C13628n.m24504a(hVar3.f24930b.f24963a);
                    }
                    C10319h.this.f24942n = true;
                } else if (action == 1) {
                    C10319h.this.f24935g = motionEvent.getRawX();
                    C10319h.this.f24936h = motionEvent.getRawY();
                    C10319h hVar4 = C10319h.this;
                    if (Math.abs(hVar4.f24935g - C10319h.this.f24933e) > ((float) C10319h.this.f24938j) || Math.abs(C10319h.this.f24936h - C10319h.this.f24934f) > ((float) C10319h.this.f24938j)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    hVar4.f24937i = z;
                    C10319h hVar5 = C10319h.this;
                    int i2 = hVar5.f24930b.f24973k;
                    if (i2 != 3) {
                        if (i2 == 4) {
                            hVar5.f24931c = ObjectAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofInt("x", hVar5.f24929a.f24927g, hVar5.f24930b.f24969g), PropertyValuesHolder.ofInt("y", hVar5.f24929a.f24928h, hVar5.f24930b.f24970h));
                            hVar5.f24931c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                /* class com.bytedance.android.livesdk.p605r.C10319h.C103223 */

                                static {
                                    Covode.recordClassIndex(11888);
                                }

                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    int intValue = ((Integer) valueAnimator.getAnimatedValue("x")).intValue();
                                    int intValue2 = ((Integer) valueAnimator.getAnimatedValue("y")).intValue();
                                    C10319h.this.f24929a.mo17079a(intValue, intValue2);
                                    if (C10319h.this.f24930b.f24982t != null) {
                                        C10319h.this.f24930b.f24982t.mo8456a(intValue, intValue2);
                                    }
                                }
                            });
                            hVar5.mo17098b();
                        }
                    } else if (hVar5.f24937i) {
                        int i3 = hVar5.f24929a.f24927g;
                        if ((i3 * 2) + view.getWidth() > C13628n.m24504a(hVar5.f24930b.f24963a)) {
                            i = (C13628n.m24504a(hVar5.f24930b.f24963a) - view.getWidth()) - hVar5.f24930b.f24975m;
                        } else {
                            i = hVar5.f24930b.f24974l;
                        }
                        int i4 = hVar5.f24929a.f24928h;
                        int i5 = hVar5.f24929a.f24928h;
                        if (i5 < hVar5.f24930b.f24976n) {
                            i5 = hVar5.f24930b.f24976n;
                        } else if (i5 > C3966y.m9662b() - hVar5.f24930b.f24977o) {
                            i5 = C3966y.m9662b() - hVar5.f24930b.f24977o;
                        }
                        if ((hVar5.f24930b.f24977o == 0 && hVar5.f24930b.f24976n == 0) || i4 == i5) {
                            hVar5.f24931c = ObjectAnimator.ofInt(i3, i);
                            hVar5.f24931c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                /* class com.bytedance.android.livesdk.p605r.C10319h.C103245 */

                                static {
                                    Covode.recordClassIndex(11890);
                                }

                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                    C10319h.this.f24929a.mo17078a(intValue);
                                    if (C10319h.this.f24930b.f24982t != null) {
                                        C10319h.this.f24930b.f24982t.mo8456a(intValue, C10319h.this.f24929a.f24928h);
                                    }
                                }
                            });
                        } else {
                            hVar5.f24931c = ObjectAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofInt("x", i3, i), PropertyValuesHolder.ofInt("y", i4, i5));
                            hVar5.f24931c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                /* class com.bytedance.android.livesdk.p605r.C10319h.C103234 */

                                static {
                                    Covode.recordClassIndex(11889);
                                }

                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    int intValue = ((Integer) valueAnimator.getAnimatedValue("x")).intValue();
                                    int intValue2 = ((Integer) valueAnimator.getAnimatedValue("y")).intValue();
                                    C10319h.this.f24929a.mo17079a(intValue, intValue2);
                                    if (C10319h.this.f24930b.f24982t != null) {
                                        C10319h.this.f24930b.f24982t.mo8456a(intValue, intValue2);
                                    }
                                }
                            });
                        }
                        hVar5.mo17098b();
                    }
                    if (!hVar5.f24937i && hVar5.f24930b.f24982t != null) {
                        hVar5.f24930b.f24982t.mo8460e();
                    }
                    if (hVar5.f24937i && hVar5.f24930b.f24982t != null) {
                        hVar5.f24930b.f24982t.mo8459d();
                    }
                } else if (action == 2) {
                    this.f24949c = motionEvent.getRawX() - this.f24947a;
                    this.f24950d = motionEvent.getRawY() - this.f24948b;
                    if (Math.abs(this.f24949c) > 0.0f || Math.abs(this.f24950d) > 0.0f) {
                        this.f24951e = (int) (((float) C10319h.this.f24929a.f24927g) + this.f24949c);
                        this.f24952f = (int) (((float) C10319h.this.f24929a.f24928h) + this.f24950d);
                        if (C10319h.this.f24930b.f24983u) {
                            if (this.f24951e < C10319h.this.f24930b.f24974l) {
                                this.f24951e = C10319h.this.f24930b.f24974l;
                            }
                            if (this.f24951e > (C10319h.this.f24940l - view.getWidth()) - C10319h.this.f24930b.f24975m) {
                                this.f24951e = (C10319h.this.f24940l - C10319h.this.f24930b.f24975m) - view.getWidth();
                            }
                            if (this.f24952f < C10319h.this.f24930b.f24976n) {
                                this.f24952f = C10319h.this.f24930b.f24976n;
                            }
                            if (this.f24952f > (C10319h.this.f24941m - view.getHeight()) - C10319h.this.f24930b.f24977o) {
                                this.f24952f = (C10319h.this.f24941m - C10319h.this.f24930b.f24977o) - view.getHeight();
                            }
                        }
                        if (C10319h.this.f24930b.f24973k != 5) {
                            C10319h.this.f24929a.mo17079a(this.f24951e, this.f24952f);
                            if (C10319h.this.f24930b.f24982t != null) {
                                if (C10319h.this.f24942n) {
                                    C10319h.this.f24930b.f24982t.mo8458c();
                                    C10319h.this.f24942n = false;
                                }
                                C10319h.this.f24930b.f24982t.mo8456a(this.f24951e, this.f24952f);
                            }
                        }
                    }
                    this.f24947a = motionEvent.getRawX();
                    this.f24948b = motionEvent.getRawY();
                }
                return C10319h.this.f24937i;
            }
        });
        this.f24929a.mo17094b(aVar.f24966d, aVar.f24967e);
        this.f24929a.mo17093a(aVar.f24968f, aVar.f24969g, aVar.f24970h);
        this.f24929a.f24926f = aVar.f24964b;
        this.f24943o = new C10314d(this.f24930b.f24963a, this.f24930b.f24971i, this.f24930b.f24972j, new AbstractC10316e() {
            /* class com.bytedance.android.livesdk.p605r.C10319h.C103201 */

            static {
                Covode.recordClassIndex(11886);
            }

            @Override // com.bytedance.android.livesdk.p605r.AbstractC10316e
            /* renamed from: a */
            public final void mo17092a() {
                if (!C10319h.this.f24930b.f24981s) {
                    C10319h.this.mo17100d();
                }
            }
        });
    }
}
