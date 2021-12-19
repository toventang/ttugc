package com.bytedance.ies.dmt.p1194ui.tooltip;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.bytedance.ies.dmt.ui.tooltip.d */
public final class C17262d {

    /* renamed from: i */
    public static final C17263a f41258i = new C17263a((byte) 0);

    /* renamed from: a */
    public int f41259a;

    /* renamed from: b */
    public int f41260b;

    /* renamed from: c */
    public final C17264b f41261c = new C17264b();

    /* renamed from: d */
    public final int f41262d;

    /* renamed from: e */
    public int f41263e;

    /* renamed from: f */
    public final Context f41264f;

    /* renamed from: g */
    public final View f41265g;

    /* renamed from: h */
    public final boolean f41266h;

    /* renamed from: j */
    private int f41267j;

    /* renamed from: k */
    private int f41268k;

    /* renamed from: l */
    private C17261c f41269l;

    /* renamed from: com.bytedance.ies.dmt.ui.tooltip.d$b */
    public static final class C17264b {

        /* renamed from: a */
        public int f41270a;

        /* renamed from: b */
        public int f41271b;

        /* renamed from: c */
        public int f41272c;

        /* renamed from: d */
        public int f41273d;

        static {
            Covode.recordClassIndex(19732);
        }
    }

    static {
        Covode.recordClassIndex(19730);
    }

    /* renamed from: com.bytedance.ies.dmt.ui.tooltip.d$a */
    public static final class C17263a {
        static {
            Covode.recordClassIndex(19731);
        }

        private C17263a() {
        }

        public /* synthetic */ C17263a(byte b) {
            this();
        }
    }

    /* renamed from: b */
    private final int m31873b() {
        return C13628n.m24521b(this.f41264f) + C13628n.m24525e(this.f41264f);
    }

    /* renamed from: a */
    private final int m31869a() {
        if (this.f41266h) {
            return this.f41263e + C13628n.m24525e(this.f41264f);
        }
        return this.f41263e;
    }

    /* renamed from: a */
    public final boolean mo27364a(C17264b bVar) {
        C89219l.m154721d(bVar, "");
        this.f41265g.measure(0, 0);
        this.f41259a = this.f41265g.getMeasuredWidth();
        this.f41260b = this.f41265g.getMeasuredHeight();
        if (this.f41269l.f41236e == null) {
            return m31872a(this.f41269l.f41238g, bVar, 0, 0, this.f41269l.f41250s, this.f41269l.f41251t);
        }
        View view = this.f41269l.f41236e;
        if (view == null) {
            C89219l.m154715b();
        }
        int width = view.getWidth();
        View view2 = this.f41269l.f41236e;
        if (view2 == null) {
            C89219l.m154715b();
        }
        int height = view2.getHeight();
        int[] iArr = new int[2];
        View view3 = this.f41269l.f41236e;
        if (view3 == null) {
            C89219l.m154715b();
        }
        view3.getLocationInWindow(iArr);
        return m31872a(this.f41269l.f41238g, bVar, width, height, iArr[0], iArr[1]);
    }

    /* renamed from: a */
    private final void m31870a(int i, C17264b bVar) {
        if (i == 48 || i == 80) {
            int i2 = this.f41267j;
            float f = ((float) bVar.f41272c) - (((float) i2) / 2.0f);
            int i3 = this.f41263e;
            int i4 = this.f41262d;
            if (f < ((float) (i3 + i4))) {
                f = ((float) i3) + ((float) i4);
            } else if (((float) i2) + f + ((float) i4) > ((float) (C13628n.m24504a(this.f41264f) - this.f41263e))) {
                f = ((float) ((C13628n.m24504a(this.f41264f) - this.f41263e) - this.f41267j)) - ((float) this.f41262d);
            }
            int i5 = bVar.f41270a;
            int i6 = this.f41262d;
            if (f < ((float) (i5 + i6))) {
                bVar.f41270a = C89241a.m154730a(f) - this.f41262d;
            } else if (((float) this.f41267j) + f + ((float) i6) > ((float) (bVar.f41270a + this.f41259a))) {
                bVar.f41270a = ((C89241a.m154730a(f) + this.f41267j) + this.f41262d) - this.f41259a;
            }
            bVar.f41272c = C89241a.m154730a((((float) this.f41267j) / 2.0f) + f);
            float f2 = (f - ((float) bVar.f41270a)) - ((float) this.f41262d);
            if (i == 48) {
                RelativeLayout relativeLayout = (RelativeLayout) this.f41265g.findViewById(R.id.ku);
                C89219l.m154716b(relativeLayout, "");
                relativeLayout.setX(f2);
                return;
            }
            RelativeLayout relativeLayout2 = (RelativeLayout) this.f41265g.findViewById(R.id.l9);
            C89219l.m154716b(relativeLayout2, "");
            relativeLayout2.setX(f2);
        } else if (i == 8388611 || i == 8388613) {
            float f3 = ((float) bVar.f41273d) - (((float) this.f41267j) / 2.0f);
            int a = m31869a();
            int i7 = this.f41262d;
            if (f3 < ((float) (a + i7))) {
                f3 = ((float) m31869a()) + ((float) this.f41262d);
            } else if (((float) this.f41267j) + f3 + ((float) i7) > ((float) (m31873b() - this.f41263e))) {
                f3 = ((float) ((m31873b() - this.f41263e) - this.f41267j)) - ((float) this.f41262d);
            }
            int i8 = bVar.f41271b;
            int i9 = this.f41262d;
            if (f3 < ((float) (i8 + i9))) {
                bVar.f41271b = ((int) f3) - i9;
            } else {
                float f4 = ((float) this.f41267j) + f3 + ((float) i9);
                int i10 = bVar.f41271b;
                int i11 = this.f41260b;
                if (f4 > ((float) (i10 + i11))) {
                    bVar.f41271b = ((((int) f3) + this.f41267j) + this.f41262d) - i11;
                }
            }
            bVar.f41273d = C89241a.m154730a((((float) this.f41267j) / 2.0f) + f3);
            float f5 = (f3 - ((float) bVar.f41271b)) - ((float) this.f41262d);
            if (i == 8388611) {
                RelativeLayout relativeLayout3 = (RelativeLayout) this.f41265g.findViewById(R.id.kx);
                C89219l.m154716b(relativeLayout3, "");
                relativeLayout3.setY(f5);
                return;
            }
            RelativeLayout relativeLayout4 = (RelativeLayout) this.f41265g.findViewById(R.id.l6);
            C89219l.m154716b(relativeLayout4, "");
            relativeLayout4.setY(f5);
        }
    }

    /* renamed from: a */
    public final void mo27363a(C17264b bVar, boolean z) {
        AnimatorSet animatorSet;
        C89219l.m154721d(bVar, "");
        if (this.f41269l.f41246o) {
            if (this.f41269l.f41231C != null) {
                AbstractC89183m<? super View, ? super Boolean, AnimatorSet> mVar = this.f41269l.f41231C;
                if (mVar == null) {
                    C89219l.m154715b();
                }
                animatorSet = mVar.invoke(this.f41265g, Boolean.valueOf(z));
            } else {
                float f = 1.0f;
                float f2 = 0.0f;
                if (z) {
                    f = 0.0f;
                    f2 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f41265g, "scaleX", f, f2);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f41265g, "scaleY", f, f2);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f41265g, "alpha", f, f2);
                animatorSet = new AnimatorSet();
                animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3);
                if (z) {
                    animatorSet.setInterpolator(this.f41269l.f41248q);
                } else {
                    animatorSet.setInterpolator(this.f41269l.f41249r);
                }
            }
            animatorSet.setDuration(this.f41269l.f41245n);
            this.f41265g.setPivotX((float) (bVar.f41272c - bVar.f41270a));
            this.f41265g.setPivotY((float) (bVar.f41273d - bVar.f41271b));
            animatorSet.start();
        }
    }

    /* renamed from: a */
    private final boolean m31871a(int i, C17264b bVar, int i2) {
        if (i2 == 0) {
            if (i == 48 || i == 80) {
                if (bVar.f41271b < m31869a()) {
                    bVar.f41271b = m31869a();
                    return false;
                } else if (bVar.f41271b + this.f41260b <= m31873b() - this.f41263e) {
                    return true;
                } else {
                    bVar.f41271b = (m31873b() - this.f41263e) - this.f41260b;
                    return false;
                }
            } else if (i == 8388611 || i == 8388613) {
                if (bVar.f41271b < m31869a()) {
                    bVar.f41271b = m31869a();
                } else if (bVar.f41271b + this.f41260b > m31873b() - this.f41263e) {
                    bVar.f41271b = (m31873b() - this.f41260b) - this.f41263e;
                }
            }
        } else if (i == 48 || i == 80) {
            int i3 = bVar.f41270a;
            int i4 = this.f41263e;
            if (i3 < i4) {
                bVar.f41270a = i4;
            } else if (bVar.f41270a + this.f41259a > C13628n.m24504a(this.f41264f) - this.f41263e) {
                bVar.f41270a = (C13628n.m24504a(this.f41264f) - this.f41259a) - this.f41263e;
            }
        } else if (i == 8388611 || i == 8388613) {
            int i5 = bVar.f41270a;
            int i6 = this.f41263e;
            if (i5 < i6) {
                bVar.f41270a = i6;
                return false;
            } else if (bVar.f41270a + this.f41259a <= C13628n.m24504a(this.f41264f) - this.f41263e) {
                return true;
            } else {
                bVar.f41270a = (C13628n.m24504a(this.f41264f) - this.f41259a) - this.f41263e;
                return false;
            }
        }
        return true;
    }

    public C17262d(Context context, C17261c cVar, View view, boolean z) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(view, "");
        this.f41264f = context;
        this.f41265g = view;
        this.f41266h = z;
        this.f41267j = C89241a.m154730a(C13628n.m24520b(context, 36.0f));
        this.f41268k = C89241a.m154730a(C13628n.m24520b(context, 1.0f));
        int a = C89241a.m154730a(C13628n.m24520b(context, 4.0f));
        this.f41262d = a;
        this.f41263e = a;
        this.f41269l = cVar;
    }

    /* renamed from: a */
    private final boolean m31872a(int i, C17264b bVar, int i2, int i3, int i4, int i5) {
        if (i == 48) {
            int i6 = ((i4 + i4) + i2) / 2;
            bVar.f41270a = (i6 - (this.f41259a / 2)) + this.f41269l.f41239h;
            bVar.f41271b = ((i5 - this.f41260b) + this.f41269l.f41240i) - this.f41268k;
            m31871a(i, bVar, 1);
            bVar.f41272c = i6 + this.f41269l.f41241j;
            bVar.f41273d = (i5 + this.f41269l.f41240i) - this.f41268k;
            m31870a(i, bVar);
            return m31871a(i, bVar, 0);
        } else if (i == 80) {
            int i7 = ((i4 + i4) + i2) / 2;
            bVar.f41270a = (i7 - (this.f41259a / 2)) + this.f41269l.f41239h;
            int i8 = i5 + i3;
            bVar.f41271b = this.f41269l.f41240i + i8 + this.f41268k;
            m31871a(i, bVar, 1);
            bVar.f41272c = i7 + this.f41269l.f41241j;
            bVar.f41273d = i8 + this.f41269l.f41240i + this.f41268k;
            m31870a(i, bVar);
            return m31871a(this.f41269l.f41238g, bVar, 0);
        } else if (i == 8388611) {
            bVar.f41270a = ((i4 - this.f41259a) + this.f41269l.f41239h) - this.f41268k;
            int i9 = ((i5 + i5) + i3) / 2;
            bVar.f41271b = (i9 - (this.f41260b / 2)) + this.f41269l.f41240i;
            m31871a(i, bVar, 0);
            bVar.f41272c = (i4 + this.f41269l.f41239h) - this.f41268k;
            bVar.f41273d = i9 + this.f41269l.f41241j;
            m31870a(i, bVar);
            return m31871a(i, bVar, 1);
        } else if (i != 8388613) {
            return false;
        } else {
            bVar.f41270a = i4 + i2 + this.f41269l.f41239h + this.f41268k;
            int i10 = ((i5 + i5) + i3) / 2;
            bVar.f41271b = (i10 - (this.f41260b / 2)) + this.f41269l.f41240i;
            m31871a(i, bVar, 0);
            bVar.f41272c = bVar.f41270a + this.f41269l.f41239h;
            bVar.f41273d = i10 + this.f41269l.f41241j;
            m31870a(i, bVar);
            return m31871a(i, bVar, 1);
        }
    }
}
