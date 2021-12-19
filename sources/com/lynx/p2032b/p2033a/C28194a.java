package com.lynx.p2032b.p2033a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.ScrollView;
import android.widget.Scroller;
import android.widget.TextView;
import androidx.core.p037h.AbstractC0784n;
import androidx.core.p037h.C0783m;
import androidx.core.p037h.C0787q;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.lynx.p2032b.p2033a.p2034a.AbstractC28212a;
import com.lynx.p2032b.p2033a.p2034a.AbstractC28213b;
import com.lynx.p2032b.p2033a.p2034a.AbstractC28214c;
import com.lynx.p2032b.p2033a.p2034a.AbstractC28215d;
import com.lynx.p2032b.p2033a.p2034a.AbstractC28216e;
import com.lynx.p2032b.p2033a.p2034a.AbstractC28217f;
import com.lynx.p2032b.p2033a.p2034a.AbstractC28218g;
import com.lynx.p2032b.p2033a.p2034a.AbstractC28219h;
import com.lynx.p2032b.p2033a.p2034a.AbstractC28220i;
import com.lynx.p2032b.p2033a.p2034a.AbstractC28221j;
import com.lynx.p2032b.p2033a.p2035b.C28222a;
import com.lynx.p2032b.p2033a.p2035b.C28224c;
import com.lynx.p2032b.p2033a.p2035b.EnumC28223b;
import com.lynx.p2032b.p2033a.p2036c.C28225a;
import com.lynx.p2032b.p2033a.p2037d.C28226a;
import com.lynx.p2032b.p2033a.p2038e.C28229a;
import com.lynx.p2032b.p2033a.p2040g.AbstractC28235b;
import com.lynx.p2032b.p2033a.p2040g.AbstractC28236c;
import com.lynx.p2032b.p2033a.p2040g.AbstractC28237d;
import com.lynx.p2032b.p2033a.p2041h.animationInterpolatorC28243b;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.lynx.b.a.a */
public final class C28194a extends ViewGroup implements AbstractC0784n, AbstractC28220i {

    /* renamed from: aI */
    protected static AbstractC28212a f65991aI;

    /* renamed from: aJ */
    protected static AbstractC28213b f65992aJ;

    /* renamed from: aK */
    protected static AbstractC28214c f65993aK;

    /* renamed from: aL */
    protected static ViewGroup.MarginLayoutParams f65994aL = new ViewGroup.MarginLayoutParams(-1, -1);

    /* renamed from: A */
    protected boolean f65995A;

    /* renamed from: B */
    protected boolean f65996B;

    /* renamed from: C */
    protected boolean f65997C;

    /* renamed from: D */
    protected boolean f65998D;

    /* renamed from: E */
    protected boolean f65999E;

    /* renamed from: F */
    protected boolean f66000F;

    /* renamed from: G */
    protected boolean f66001G;

    /* renamed from: H */
    protected boolean f66002H;

    /* renamed from: I */
    protected boolean f66003I;

    /* renamed from: J */
    protected boolean f66004J;

    /* renamed from: K */
    protected boolean f66005K;

    /* renamed from: L */
    protected boolean f66006L;

    /* renamed from: M */
    protected boolean f66007M;

    /* renamed from: N */
    protected boolean f66008N;

    /* renamed from: O */
    protected boolean f66009O;

    /* renamed from: P */
    protected boolean f66010P;

    /* renamed from: Q */
    protected boolean f66011Q;

    /* renamed from: R */
    protected boolean f66012R;

    /* renamed from: S */
    protected boolean f66013S;

    /* renamed from: T */
    protected boolean f66014T;

    /* renamed from: U */
    protected boolean f66015U;

    /* renamed from: V */
    protected boolean f66016V;

    /* renamed from: W */
    protected boolean f66017W;

    /* renamed from: a */
    protected int f66018a;

    /* renamed from: aA */
    protected EnumC28223b f66019aA;

    /* renamed from: aB */
    protected long f66020aB;

    /* renamed from: aC */
    protected int f66021aC;

    /* renamed from: aD */
    protected int f66022aD;

    /* renamed from: aE */
    protected boolean f66023aE;

    /* renamed from: aF */
    protected boolean f66024aF;

    /* renamed from: aG */
    protected boolean f66025aG;

    /* renamed from: aH */
    protected boolean f66026aH;

    /* renamed from: aM */
    protected boolean f66027aM;

    /* renamed from: aN */
    protected MotionEvent f66028aN;

    /* renamed from: aO */
    protected Runnable f66029aO;

    /* renamed from: aP */
    protected ValueAnimator f66030aP;

    /* renamed from: aa */
    protected AbstractC28237d f66031aa;

    /* renamed from: ab */
    protected AbstractC28235b f66032ab;

    /* renamed from: ac */
    protected AbstractC28236c f66033ac;

    /* renamed from: ad */
    protected AbstractC28221j f66034ad;

    /* renamed from: ae */
    protected int f66035ae;

    /* renamed from: af */
    protected boolean f66036af;

    /* renamed from: ag */
    protected int[] f66037ag;

    /* renamed from: ah */
    protected C0783m f66038ah;

    /* renamed from: ai */
    protected C0787q f66039ai;

    /* renamed from: aj */
    protected int f66040aj;

    /* renamed from: ak */
    protected C28222a f66041ak;

    /* renamed from: al */
    protected int f66042al;

    /* renamed from: am */
    protected C28222a f66043am;

    /* renamed from: an */
    protected int f66044an;

    /* renamed from: ao */
    protected int f66045ao;

    /* renamed from: ap */
    protected float f66046ap;

    /* renamed from: aq */
    protected float f66047aq;

    /* renamed from: ar */
    protected float f66048ar;

    /* renamed from: as */
    protected float f66049as;

    /* renamed from: at */
    protected AbstractC28218g f66050at;

    /* renamed from: au */
    protected AbstractC28218g f66051au;

    /* renamed from: av */
    protected AbstractC28215d f66052av;

    /* renamed from: aw */
    protected Paint f66053aw;

    /* renamed from: ax */
    protected Handler f66054ax;

    /* renamed from: ay */
    protected AbstractC28219h f66055ay;

    /* renamed from: az */
    protected EnumC28223b f66056az;

    /* renamed from: b */
    protected int f66057b;

    /* renamed from: c */
    protected int f66058c;

    /* renamed from: d */
    protected int f66059d;

    /* renamed from: e */
    protected int f66060e;

    /* renamed from: f */
    protected int f66061f;

    /* renamed from: g */
    protected int f66062g;

    /* renamed from: h */
    protected float f66063h;

    /* renamed from: i */
    protected float f66064i;

    /* renamed from: j */
    protected float f66065j;

    /* renamed from: k */
    protected float f66066k;

    /* renamed from: l */
    protected float f66067l;

    /* renamed from: m */
    protected char f66068m;

    /* renamed from: n */
    protected boolean f66069n;

    /* renamed from: o */
    protected boolean f66070o;

    /* renamed from: p */
    protected int f66071p;

    /* renamed from: q */
    protected int f66072q;

    /* renamed from: r */
    protected int f66073r;

    /* renamed from: s */
    protected int f66074s;

    /* renamed from: t */
    protected int f66075t;

    /* renamed from: u */
    protected int f66076u;

    /* renamed from: v */
    protected int f66077v;

    /* renamed from: w */
    protected Scroller f66078w;

    /* renamed from: x */
    protected VelocityTracker f66079x;

    /* renamed from: y */
    protected Interpolator f66080y;

    /* renamed from: z */
    protected int[] f66081z;

    @Override // com.lynx.p2032b.p2033a.p2034a.AbstractC28220i
    public final ViewGroup getLayout() {
        return this;
    }

    /* renamed from: com.lynx.b.a.a$d */
    public class C28211d implements AbstractC28219h {
        static {
            Covode.recordClassIndex(34157);
        }

        @Override // com.lynx.p2032b.p2033a.p2034a.AbstractC28219h
        /* renamed from: a */
        public final AbstractC28220i mo48283a() {
            return C28194a.this;
        }

        @Override // com.lynx.p2032b.p2033a.p2034a.AbstractC28219h
        /* renamed from: b */
        public final AbstractC28219h mo48284b() {
            if (C28194a.this.f66056az == EnumC28223b.TwoLevel) {
                C28194a.this.f66055ay.mo48282a(EnumC28223b.TwoLevelFinish);
                if (C28194a.this.f66057b == 0) {
                    mo48280a(0, false);
                    C28194a.this.mo48232a(EnumC28223b.None);
                } else {
                    mo48279a(0).setDuration((long) C28194a.this.f66060e);
                }
            }
            return this;
        }

        public C28211d() {
        }

        @Override // com.lynx.p2032b.p2033a.p2034a.AbstractC28219h
        /* renamed from: a */
        public final ValueAnimator mo48279a(int i) {
            C28194a aVar = C28194a.this;
            return aVar.mo48223a(i, 0, aVar.f66080y, C28194a.this.f66061f);
        }

        @Override // com.lynx.p2032b.p2033a.p2034a.AbstractC28219h
        /* renamed from: a */
        public final AbstractC28219h mo48282a(EnumC28223b bVar) {
            switch (C281962.f66084a[bVar.ordinal()]) {
                case 1:
                    if (C28194a.this.f66056az != EnumC28223b.None && C28194a.this.f66057b == 0) {
                        C28194a.this.mo48232a(EnumC28223b.None);
                        return null;
                    } else if (C28194a.this.f66057b == 0) {
                        return null;
                    } else {
                        mo48279a(0);
                        return null;
                    }
                case 2:
                    if (!C28194a.this.f66056az.isOpening) {
                        C28194a aVar = C28194a.this;
                        if (aVar.mo48233a(aVar.f65995A)) {
                            C28194a.this.mo48232a(EnumC28223b.PullDownToRefresh);
                            return null;
                        }
                    }
                    C28194a.this.setViceState(EnumC28223b.PullDownToRefresh);
                    return null;
                case 3:
                    C28194a aVar2 = C28194a.this;
                    if (!aVar2.mo48233a(aVar2.f65996B) || C28194a.this.f66056az.isOpening || C28194a.this.f66056az.isFinishing || (C28194a.this.f66013S && C28194a.this.f66001G && C28194a.this.f66014T)) {
                        C28194a.this.setViceState(EnumC28223b.PullUpToLoad);
                        return null;
                    }
                    C28194a.this.mo48232a(EnumC28223b.PullUpToLoad);
                    return null;
                case 4:
                    if (!C28194a.this.f66056az.isOpening) {
                        C28194a aVar3 = C28194a.this;
                        if (aVar3.mo48233a(aVar3.f65995A)) {
                            C28194a.this.mo48232a(EnumC28223b.PullDownCanceled);
                            mo48282a(EnumC28223b.None);
                            return null;
                        }
                    }
                    C28194a.this.setViceState(EnumC28223b.PullDownCanceled);
                    return null;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    C28194a aVar4 = C28194a.this;
                    if (!aVar4.mo48233a(aVar4.f65996B) || C28194a.this.f66056az.isOpening || (C28194a.this.f66013S && C28194a.this.f66001G && C28194a.this.f66014T)) {
                        C28194a.this.setViceState(EnumC28223b.PullUpCanceled);
                        return null;
                    }
                    C28194a.this.mo48232a(EnumC28223b.PullUpCanceled);
                    mo48282a(EnumC28223b.None);
                    return null;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    if (!C28194a.this.f66056az.isOpening) {
                        C28194a aVar5 = C28194a.this;
                        if (aVar5.mo48233a(aVar5.f65995A)) {
                            C28194a.this.mo48232a(EnumC28223b.ReleaseToRefresh);
                            return null;
                        }
                    }
                    C28194a.this.setViceState(EnumC28223b.ReleaseToRefresh);
                    return null;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    C28194a aVar6 = C28194a.this;
                    if (!aVar6.mo48233a(aVar6.f65996B) || C28194a.this.f66056az.isOpening || C28194a.this.f66056az.isFinishing || (C28194a.this.f66013S && C28194a.this.f66001G && C28194a.this.f66014T)) {
                        C28194a.this.setViceState(EnumC28223b.ReleaseToLoad);
                        return null;
                    }
                    C28194a.this.mo48232a(EnumC28223b.ReleaseToLoad);
                    return null;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    if (!C28194a.this.f66056az.isOpening) {
                        C28194a aVar7 = C28194a.this;
                        if (aVar7.mo48233a(aVar7.f65995A)) {
                            C28194a.this.mo48232a(EnumC28223b.ReleaseToTwoLevel);
                            return null;
                        }
                    }
                    C28194a.this.setViceState(EnumC28223b.ReleaseToTwoLevel);
                    return null;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    if (!C28194a.this.f66056az.isOpening) {
                        C28194a aVar8 = C28194a.this;
                        if (aVar8.mo48233a(aVar8.f65995A)) {
                            C28194a.this.mo48232a(EnumC28223b.RefreshReleased);
                            return null;
                        }
                    }
                    C28194a.this.setViceState(EnumC28223b.RefreshReleased);
                    return null;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    if (!C28194a.this.f66056az.isOpening) {
                        C28194a aVar9 = C28194a.this;
                        if (aVar9.mo48233a(aVar9.f65996B)) {
                            C28194a.this.mo48232a(EnumC28223b.LoadReleased);
                            return null;
                        }
                    }
                    C28194a.this.setViceState(EnumC28223b.LoadReleased);
                    return null;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    C28194a.this.setStateRefreshing(true);
                    return null;
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                    C28194a.this.setStateLoading(true);
                    return null;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                    if (C28194a.this.f66056az != EnumC28223b.Refreshing) {
                        return null;
                    }
                    C28194a.this.mo48232a(EnumC28223b.RefreshFinish);
                    return null;
                case ABRConfig.ABR_SELECT_SCENE:
                    if (C28194a.this.f66056az != EnumC28223b.Loading) {
                        return null;
                    }
                    C28194a.this.mo48232a(EnumC28223b.LoadFinish);
                    return null;
                case 15:
                    C28194a.this.mo48232a(EnumC28223b.TwoLevelReleased);
                    return null;
                case 16:
                    C28194a.this.mo48232a(EnumC28223b.TwoLevelFinish);
                    return null;
                case 17:
                    C28194a.this.mo48232a(EnumC28223b.TwoLevel);
                    return null;
                default:
                    return null;
            }
        }

        @Override // com.lynx.p2032b.p2033a.p2034a.AbstractC28219h
        /* renamed from: a */
        public final AbstractC28219h mo48281a(AbstractC28218g gVar, int i) {
            if (C28194a.this.f66053aw == null && i != 0) {
                C28194a.this.f66053aw = new Paint();
            }
            if (gVar.equals(C28194a.this.f66050at)) {
                C28194a.this.f66021aC = i;
            } else if (gVar.equals(C28194a.this.f66051au)) {
                C28194a.this.f66022aD = i;
            }
            return this;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:104:0x01e8, code lost:
            if (r2 >= 0) goto L_0x0298;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:161:0x0378, code lost:
            if (r8 != false) goto L_0x00a1;
         */
        /* JADX WARNING: Removed duplicated region for block: B:159:0x0373  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00a0  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00e0  */
        @Override // com.lynx.p2032b.p2033a.p2034a.AbstractC28219h
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.lynx.p2032b.p2033a.p2034a.AbstractC28219h mo48280a(int r23, boolean r24) {
            /*
            // Method dump skipped, instructions count: 978
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lynx.p2032b.p2033a.C28194a.C28211d.mo48280a(int, boolean):com.lynx.b.a.a.h");
        }
    }

    public final EnumC28223b getState() {
        return this.f66056az;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo48232a(EnumC28223b bVar) {
        EnumC28223b bVar2 = this.f66056az;
        if (bVar2 != bVar) {
            this.f66056az = bVar;
            this.f66019aA = bVar;
            AbstractC28218g gVar = this.f66050at;
            AbstractC28218g gVar2 = this.f66051au;
            AbstractC28236c cVar = this.f66033ac;
            if (gVar != null) {
                gVar.mo30705a(this, bVar2, bVar);
            }
            if (gVar2 != null) {
                gVar2.mo30705a(this, bVar2, bVar);
            }
            if (cVar != null) {
                cVar.mo30705a(this, bVar2, bVar);
            }
            if (bVar == EnumC28223b.LoadFinish) {
                this.f66026aH = false;
            }
        } else if (this.f66019aA != bVar2) {
            this.f66019aA = bVar2;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo48234a(boolean z, AbstractC28218g gVar) {
        return z || this.f66006L || gVar == null || gVar.getSpinnerStyle() == C28224c.f66144c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo48233a(boolean z) {
        return z && !this.f66006L;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo48231a(float f) {
        float f2 = f;
        if (this.f66036af && !this.f66009O && f2 < 0.0f && !this.f66052av.mo48296d()) {
            f2 = 0.0f;
        }
        if (this.f66056az == EnumC28223b.TwoLevel && f2 > 0.0f) {
            this.f66055ay.mo48280a(Math.min((int) f2, getMeasuredHeight()), true);
        } else if (this.f66056az == EnumC28223b.Refreshing && f2 >= 0.0f) {
            int i = this.f66040aj;
            if (f2 < ((float) i)) {
                this.f66055ay.mo48280a((int) f2, true);
            } else {
                double d = (double) ((this.f66046ap - 1.0f) * ((float) i));
                int max = Math.max((this.f66062g * 4) / 3, getHeight());
                int i2 = this.f66040aj;
                double d2 = (double) (max - i2);
                double max2 = (double) Math.max(0.0f, (f2 - ((float) i2)) * this.f66067l);
                Double.isNaN(max2);
                double d3 = -max2;
                if (d2 == 0.0d) {
                    d2 = 1.0d;
                }
                Double.isNaN(d);
                this.f66055ay.mo48280a(((int) Math.min(d * (1.0d - Math.pow(100.0d, d3 / d2)), max2)) + this.f66040aj, true);
            }
        } else if (f2 < 0.0f && (this.f66056az == EnumC28223b.Loading || ((this.f66001G && this.f66013S && this.f66014T && mo48233a(this.f65996B)) || (this.f66005K && !this.f66013S && mo48233a(this.f65996B))))) {
            int i3 = this.f66042al;
            if (f2 > ((float) (-i3))) {
                this.f66055ay.mo48280a((int) f2, true);
            } else {
                double d4 = (double) ((this.f66047aq - 1.0f) * ((float) i3));
                int max3 = Math.max((this.f66062g * 4) / 3, getHeight());
                int i4 = this.f66042al;
                double d5 = (double) (max3 - i4);
                double d6 = (double) (-Math.min(0.0f, (((float) i4) + f2) * this.f66067l));
                Double.isNaN(d6);
                double d7 = -d6;
                if (d5 == 0.0d) {
                    d5 = 1.0d;
                }
                Double.isNaN(d4);
                this.f66055ay.mo48280a(((int) (-Math.min(d4 * (1.0d - Math.pow(100.0d, d7 / d5)), d6))) - this.f66042al, true);
            }
        } else if (f2 >= 0.0f) {
            double d8 = (double) (this.f66046ap * ((float) this.f66040aj));
            double max4 = (double) Math.max(this.f66062g / 2, getHeight());
            double max5 = (double) Math.max(0.0f, this.f66067l * f2);
            Double.isNaN(max5);
            double d9 = -max5;
            if (max4 == 0.0d) {
                max4 = 1.0d;
            }
            Double.isNaN(d8);
            this.f66055ay.mo48280a((int) Math.min(d8 * (1.0d - Math.pow(100.0d, d9 / max4)), max5), true);
        } else {
            double d10 = (double) (this.f66047aq * ((float) this.f66042al));
            double max6 = (double) Math.max(this.f66062g / 2, getHeight());
            double d11 = (double) (-Math.min(0.0f, this.f66067l * f2));
            Double.isNaN(d11);
            double d12 = -d11;
            if (max6 == 0.0d) {
                max6 = 1.0d;
            }
            Double.isNaN(d10);
            this.f66055ay.mo48280a((int) (-Math.min(d10 * (1.0d - Math.pow(100.0d, d12 / max6)), d11)), true);
        }
        if (this.f66005K && !this.f66013S && mo48233a(this.f65996B) && f2 < 0.0f && this.f66056az != EnumC28223b.Refreshing && this.f66056az != EnumC28223b.Loading && this.f66056az != EnumC28223b.LoadFinish) {
            if (this.f66012R) {
                this.f66029aO = null;
                this.f66055ay.mo48279a(-this.f66042al);
            }
            setStateDirectLoading(false);
            this.f66054ax.postDelayed(new Runnable() {
                /* class com.lynx.p2032b.p2033a.C28194a.RunnableC282006 */

                static {
                    Covode.recordClassIndex(34146);
                }

                public final void run() {
                    if (C28194a.this.f66032ab != null) {
                        C28194a.this.f66032ab.mo29963a_(C28194a.this);
                    } else if (C28194a.this.f66033ac == null) {
                        C28194a.this.mo48244e();
                    }
                    AbstractC28236c cVar = C28194a.this.f66033ac;
                    if (cVar != null) {
                        cVar.mo29963a_(C28194a.this);
                    }
                }
            }, (long) this.f66061f);
        }
    }

    /* renamed from: a */
    public final AbstractC28220i mo48230a(AbstractC28237d dVar) {
        this.f66031aa = dVar;
        return this;
    }

    /* renamed from: a */
    public final AbstractC28220i mo48228a(AbstractC28235b bVar) {
        this.f66032ab = bVar;
        this.f65996B = this.f65996B || !this.f66015U;
        return this;
    }

    public final int getNestedScrollAxes() {
        return this.f66039ai.mo2913a();
    }

    static {
        Covode.recordClassIndex(34140);
    }

    @Override // com.lynx.p2032b.p2033a.p2034a.AbstractC28220i
    /* renamed from: a */
    public final AbstractC28220i mo48224a() {
        setNestedScrollingEnabled(false);
        return this;
    }

    /* renamed from: d */
    public final AbstractC28220i mo48240d() {
        return m56297a(3000, Boolean.FALSE);
    }

    /* renamed from: e */
    public final AbstractC28220i mo48244e() {
        return m56298a(LiveNetAdaptiveHurryTimeSetting.DEFAULT, false);
    }

    public final AbstractC28216e getRefreshFooter() {
        AbstractC28218g gVar = this.f66051au;
        if (gVar instanceof AbstractC28216e) {
            return (AbstractC28216e) gVar;
        }
        return null;
    }

    public final AbstractC28217f getRefreshHeader() {
        AbstractC28218g gVar = this.f66050at;
        if (gVar instanceof AbstractC28217f) {
            return (AbstractC28217f) gVar;
        }
        return null;
    }

    /* renamed from: b */
    public final AbstractC28220i mo48235b() {
        return m56297a(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.f66020aB))), 300) << 16, Boolean.FALSE);
    }

    /* renamed from: c */
    public final AbstractC28220i mo48237c() {
        return m56298a(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.f66020aB))), 300) << 16, false);
    }

    /* renamed from: f */
    public final AbstractC28220i mo48245f() {
        return m56298a(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.f66020aB))), 300) << 16, true);
    }

    /* renamed from: g */
    public final boolean mo48246g() {
        if (this.f66056az != EnumC28223b.None || !mo48233a(this.f65995A)) {
            return false;
        }
        RunnableC282059 r1 = new Runnable() {
            /* class com.lynx.p2032b.p2033a.C28194a.RunnableC282059 */

            /* renamed from: a */
            final /* synthetic */ float f66103a = 1.0f;

            /* renamed from: b */
            final /* synthetic */ int f66104b = 300;

            /* renamed from: c */
            final /* synthetic */ boolean f66105c = false;

            static {
                Covode.recordClassIndex(34151);
            }

            public final void run() {
                if (C28194a.this.f66019aA == EnumC28223b.Refreshing) {
                    if (C28194a.this.f66030aP != null) {
                        C28194a.this.f66030aP.cancel();
                    }
                    C28194a aVar = C28194a.this;
                    aVar.f66065j = ((float) aVar.getMeasuredWidth()) / 2.0f;
                    C28194a.this.f66055ay.mo48282a(EnumC28223b.PullDownToRefresh);
                    C28194a aVar2 = C28194a.this;
                    aVar2.f66030aP = ValueAnimator.ofInt(aVar2.f66057b, (int) (((float) C28194a.this.f66040aj) * this.f66103a));
                    C28194a.this.f66030aP.setDuration((long) this.f66104b);
                    C28194a.this.f66030aP.setInterpolator(new animationInterpolatorC28243b(animationInterpolatorC28243b.f66201a));
                    C28194a.this.f66030aP.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        /* class com.lynx.p2032b.p2033a.C28194a.RunnableC282059.C282061 */

                        static {
                            Covode.recordClassIndex(34152);
                        }

                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            if (C28194a.this.f66030aP != null) {
                                C28194a.this.f66055ay.mo48280a(((Integer) valueAnimator.getAnimatedValue()).intValue(), true);
                            }
                        }
                    });
                    C28194a.this.f66030aP.addListener(new AnimatorListenerAdapter() {
                        /* class com.lynx.p2032b.p2033a.C28194a.RunnableC282059.C282072 */

                        static {
                            Covode.recordClassIndex(34153);
                        }

                        public final void onAnimationEnd(Animator animator) {
                            if (C28194a.this.f66030aP != null) {
                                C28194a.this.f66030aP = null;
                                if (C28194a.this.f66056az != EnumC28223b.ReleaseToRefresh) {
                                    C28194a.this.f66055ay.mo48282a(EnumC28223b.ReleaseToRefresh);
                                }
                                C28194a.this.setStateRefreshing(!RunnableC282059.this.f66105c);
                            }
                        }
                    });
                    C28194a.this.f66030aP.start();
                }
            }
        };
        setViceState(EnumC28223b.Refreshing);
        r1.run();
        return true;
    }

    public final boolean isNestedScrollingEnabled() {
        if (!this.f66010P) {
            return false;
        }
        if (this.f66004J || this.f65995A || this.f65996B) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f66025aG = false;
        this.f66055ay.mo48280a(0, true);
        mo48232a(EnumC28223b.None);
        Handler handler = this.f66054ax;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f66015U = true;
        this.f66029aO = null;
        ValueAnimator valueAnimator = this.f66030aP;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f66030aP.removeAllUpdateListeners();
            this.f66030aP.cancel();
            this.f66030aP = null;
        }
        this.f66026aH = false;
    }

    /* renamed from: com.lynx.b.a.a$2 */
    static /* synthetic */ class C281962 {

        /* renamed from: a */
        static final /* synthetic */ int[] f66084a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0066 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0072 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x007e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x008a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0096 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x00a2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00ae */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00ba */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
            // Method dump skipped, instructions count: 211
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lynx.p2032b.p2033a.C28194a.C281962.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.lynx.b.a.a$b */
    public class RunnableC28209b implements Runnable {

        /* renamed from: a */
        int f66116a;

        /* renamed from: b */
        int f66117b = 10;

        /* renamed from: c */
        float f66118c;

        /* renamed from: d */
        float f66119d = 0.98f;

        /* renamed from: e */
        long f66120e;

        /* renamed from: f */
        long f66121f = AnimationUtils.currentAnimationTimeMillis();

        static {
            Covode.recordClassIndex(34155);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
            if (r1.mo48233a(r1.f65996B) != false) goto L_0x0034;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
            if (r1.mo48233a(r1.f65996B) != false) goto L_0x0058;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0061, code lost:
            if (r10.f66122g.f66057b >= (-r10.f66122g.f66042al)) goto L_0x0063;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0073, code lost:
            if (r10.f66122g.f66057b > r10.f66122g.f66040aj) goto L_0x0075;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Runnable mo48277a() {
            /*
            // Method dump skipped, instructions count: 232
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lynx.p2032b.p2033a.C28194a.RunnableC28209b.mo48277a():java.lang.Runnable");
        }

        public final void run() {
            if (C28194a.this.f66029aO == this && !C28194a.this.f66056az.isFinishing) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                long j = currentAnimationTimeMillis - this.f66121f;
                double d = (double) this.f66118c;
                double pow = Math.pow((double) this.f66119d, (double) (((float) (currentAnimationTimeMillis - this.f66120e)) / (1000.0f / ((float) this.f66117b))));
                Double.isNaN(d);
                float f = (float) (d * pow);
                this.f66118c = f;
                float f2 = f * ((((float) j) * 1.0f) / 1000.0f);
                if (Math.abs(f2) > 1.0f) {
                    this.f66121f = currentAnimationTimeMillis;
                    this.f66116a = (int) (((float) this.f66116a) + f2);
                    if (C28194a.this.f66057b * this.f66116a > 0) {
                        C28194a.this.f66055ay.mo48280a(this.f66116a, true);
                        C28194a.this.f66054ax.postDelayed(this, (long) this.f66117b);
                        return;
                    }
                    C28194a.this.f66029aO = null;
                    C28194a.this.f66055ay.mo48280a(0, true);
                    View b = C28194a.this.f66052av.mo48294b();
                    int i = (int) (-this.f66118c);
                    if (b instanceof ScrollView) {
                        ((ScrollView) b).fling(i);
                    } else if (b instanceof AbsListView) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            ((AbsListView) b).fling(i);
                        }
                    } else if (b instanceof WebView) {
                        ((WebView) b).flingScroll(0, i);
                    } else if (b instanceof NestedScrollView) {
                        ((NestedScrollView) b).mo2951b(i);
                    } else if (b instanceof RecyclerView) {
                        ((RecyclerView) b).mo4420b(0, i);
                    }
                    if (C28194a.this.f66026aH && f2 > 0.0f) {
                        C28194a.this.f66026aH = false;
                        return;
                    }
                    return;
                }
                C28194a.this.f66029aO = null;
            }
        }

        RunnableC28209b(float f) {
            this.f66118c = f;
            this.f66116a = C28194a.this.f66057b;
        }
    }

    /* renamed from: h */
    private void m56309h() {
        if (this.f66056az == EnumC28223b.TwoLevel) {
            if (this.f66077v > -1000 && this.f66057b > getMeasuredHeight() / 2) {
                ValueAnimator a = this.f66055ay.mo48279a(getMeasuredHeight());
                if (a != null) {
                    a.setDuration((long) this.f66060e);
                }
            } else if (this.f66069n) {
                this.f66055ay.mo48284b();
            }
        } else if (this.f66056az == EnumC28223b.Loading || (this.f66001G && this.f66013S && this.f66014T && this.f66057b < 0 && mo48233a(this.f65996B))) {
            int i = this.f66057b;
            int i2 = this.f66042al;
            if (i < (-i2)) {
                this.f66055ay.mo48279a(-i2);
            } else if (i > 0) {
                this.f66055ay.mo48279a(0);
            }
        } else if (this.f66056az == EnumC28223b.Refreshing) {
            int i3 = this.f66057b;
            int i4 = this.f66040aj;
            if (i3 > i4) {
                this.f66055ay.mo48279a(i4);
            } else if (i3 < 0) {
                this.f66055ay.mo48279a(0);
            }
        } else if (this.f66056az == EnumC28223b.PullDownToRefresh) {
            this.f66055ay.mo48282a(EnumC28223b.PullDownCanceled);
        } else if (this.f66056az == EnumC28223b.PullUpToLoad) {
            this.f66055ay.mo48282a(EnumC28223b.PullUpCanceled);
        } else if (this.f66056az == EnumC28223b.ReleaseToRefresh) {
            this.f66055ay.mo48282a(EnumC28223b.Refreshing);
        } else if (this.f66056az == EnumC28223b.ReleaseToLoad) {
            this.f66055ay.mo48282a(EnumC28223b.Loading);
        } else if (this.f66056az == EnumC28223b.ReleaseToTwoLevel) {
            this.f66055ay.mo48282a(EnumC28223b.TwoLevelReleased);
        } else if (this.f66056az == EnumC28223b.RefreshReleased) {
            if (this.f66030aP == null) {
                this.f66055ay.mo48279a(this.f66040aj);
            }
        } else if (this.f66056az == EnumC28223b.LoadReleased) {
            if (this.f66030aP == null) {
                this.f66055ay.mo48279a(-this.f66042al);
            }
        } else if (this.f66057b != 0) {
            this.f66055ay.mo48279a(0);
        }
    }

    public final void computeScroll() {
        float currVelocity;
        this.f66078w.getCurrY();
        if (this.f66078w.computeScrollOffset()) {
            int finalY = this.f66078w.getFinalY();
            if (finalY >= 0 ? finalY <= 0 || ((!this.f65996B && !this.f66004J) || !this.f66052av.mo48296d()) : (!this.f65995A && !this.f66004J) || !this.f66052av.mo48295c()) {
                this.f66027aM = true;
                invalidate();
                return;
            }
            if (this.f66027aM) {
                int i = Build.VERSION.SDK_INT;
                if (finalY > 0) {
                    currVelocity = -this.f66078w.getCurrVelocity();
                } else {
                    currVelocity = this.f66078w.getCurrVelocity();
                }
                if (this.f66030aP == null) {
                    if (currVelocity > 0.0f && (this.f66056az == EnumC28223b.Refreshing || this.f66056az == EnumC28223b.TwoLevel)) {
                        this.f66029aO = new RunnableC28208a(currVelocity, this.f66040aj);
                    } else if (currVelocity < 0.0f && (this.f66056az == EnumC28223b.Loading || ((this.f66001G && this.f66013S && this.f66014T && mo48233a(this.f65996B)) || (this.f66005K && !this.f66013S && mo48233a(this.f65996B) && this.f66056az != EnumC28223b.Refreshing)))) {
                        this.f66029aO = new RunnableC28208a(currVelocity, -this.f66042al);
                    } else if (this.f66057b == 0 && this.f66003I) {
                        this.f66029aO = new RunnableC28208a(currVelocity, 0);
                    }
                }
            }
            this.f66078w.forceFinished(true);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFinishInflate() {
        /*
        // Method dump skipped, instructions count: 163
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.p2032b.p2033a.C28194a.onFinishInflate():void");
    }

    /* renamed from: com.lynx.b.a.a$a */
    protected class RunnableC28208a implements Runnable {

        /* renamed from: a */
        int f66109a;

        /* renamed from: b */
        int f66110b = 10;

        /* renamed from: c */
        int f66111c;

        /* renamed from: d */
        long f66112d;

        /* renamed from: e */
        float f66113e;

        /* renamed from: f */
        float f66114f;

        static {
            Covode.recordClassIndex(34154);
        }

        public final void run() {
            if (C28194a.this.f66029aO == this && !C28194a.this.f66056az.isFinishing) {
                if (Math.abs(C28194a.this.f66057b) < Math.abs(this.f66111c)) {
                    double d = (double) this.f66114f;
                    int i = this.f66109a + 1;
                    this.f66109a = i;
                    double pow = Math.pow(0.949999988079071d, (double) (i * 2));
                    Double.isNaN(d);
                    this.f66114f = (float) (d * pow);
                } else if (this.f66111c != 0) {
                    double d2 = (double) this.f66114f;
                    int i2 = this.f66109a + 1;
                    this.f66109a = i2;
                    double pow2 = Math.pow(0.44999998807907104d, (double) (i2 * 2));
                    Double.isNaN(d2);
                    this.f66114f = (float) (d2 * pow2);
                } else {
                    double d3 = (double) this.f66114f;
                    int i3 = this.f66109a + 1;
                    this.f66109a = i3;
                    double pow3 = Math.pow(0.8500000238418579d, (double) (i3 * 2));
                    Double.isNaN(d3);
                    this.f66114f = (float) (d3 * pow3);
                }
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float f = this.f66114f * ((((float) (currentAnimationTimeMillis - this.f66112d)) * 1.0f) / 1000.0f);
                if (Math.abs(f) >= 1.0f) {
                    this.f66112d = currentAnimationTimeMillis;
                    float f2 = this.f66113e + f;
                    this.f66113e = f2;
                    C28194a.this.mo48231a(f2);
                    C28194a.this.f66054ax.postDelayed(this, (long) this.f66110b);
                    return;
                }
                if (C28194a.this.f66019aA.isDragging && C28194a.this.f66019aA.isHeader) {
                    C28194a.this.f66055ay.mo48282a(EnumC28223b.PullDownCanceled);
                } else if (C28194a.this.f66019aA.isDragging && C28194a.this.f66019aA.isFooter) {
                    C28194a.this.f66055ay.mo48282a(EnumC28223b.PullUpCanceled);
                }
                C28194a.this.f66029aO = null;
                if (Math.abs(C28194a.this.f66057b) >= Math.abs(this.f66111c)) {
                    int min = Math.min(Math.max((int) (((float) Math.abs(C28194a.this.f66057b - this.f66111c)) / animationInterpolatorC28243b.f66203c), 30), 100) * 10;
                    C28194a aVar = C28194a.this;
                    aVar.mo48223a(this.f66111c, 0, aVar.f66080y, min);
                }
            }
        }

        RunnableC28208a(float f, int i) {
            this.f66114f = f;
            this.f66111c = i;
            this.f66112d = AnimationUtils.currentAnimationTimeMillis();
            C28194a.this.f66054ax.postDelayed(this, (long) this.f66110b);
            if (f > 0.0f) {
                C28194a.this.f66055ay.mo48282a(EnumC28223b.PullDownToRefresh);
            } else {
                C28194a.this.f66055ay.mo48282a(EnumC28223b.PullUpToLoad);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        AbstractC28218g gVar;
        MethodCollector.m26663i(4586);
        super.onAttachedToWindow();
        boolean z = true;
        this.f66025aG = true;
        if (!isInEditMode()) {
            if (this.f66050at == null) {
                AbstractC28213b bVar = f65992aJ;
                if (bVar != null) {
                    getContext();
                    m56302b(bVar.mo48286a());
                } else {
                    m56302b(new C28226a(getContext()));
                }
            }
            if (this.f66051au == null) {
                AbstractC28212a aVar = f65991aI;
                if (aVar != null) {
                    getContext();
                    m56301b(aVar.mo48285a());
                } else {
                    z = this.f65996B;
                    m56301b(new C28225a(getContext()));
                    this.f65996B = z;
                }
            } else {
                if (!this.f65996B && this.f66015U) {
                    z = false;
                }
                this.f65996B = z;
            }
            if (this.f66052av == null) {
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    AbstractC28218g gVar2 = this.f66050at;
                    if ((gVar2 == null || childAt != gVar2.getView()) && ((gVar = this.f66051au) == null || childAt != gVar.getView())) {
                        this.f66052av = new C28229a(childAt);
                    }
                }
            }
            if (this.f66052av == null) {
                int a = animationInterpolatorC28243b.m56416a(20.0f);
                TextView textView = new TextView(getContext());
                textView.setTextColor(-39424);
                textView.setGravity(17);
                textView.setTextSize(20.0f);
                textView.setText(R.string.g0t);
                super.addView(textView, 0, new C28210c(-1));
                C28229a aVar2 = new C28229a(textView);
                this.f66052av = aVar2;
                aVar2.mo48288a().setPadding(a, a, a, a);
            }
            View findViewById = findViewById(this.f66071p);
            View findViewById2 = findViewById(this.f66072q);
            this.f66052av.mo48292a(this.f66034ad);
            this.f66052av.mo48293a(this.f66009O);
            this.f66052av.mo48291a(this.f66055ay, findViewById, findViewById2);
            if (this.f66057b != 0) {
                mo48232a(EnumC28223b.None);
                AbstractC28215d dVar = this.f66052av;
                this.f66057b = 0;
                dVar.mo48289a(0, this.f66073r, this.f66074s);
            }
        }
        int[] iArr = this.f66081z;
        if (iArr != null) {
            AbstractC28218g gVar3 = this.f66050at;
            if (gVar3 != null) {
                gVar3.setPrimaryColors(iArr);
            }
            AbstractC28218g gVar4 = this.f66051au;
            if (gVar4 != null) {
                gVar4.setPrimaryColors(this.f66081z);
            }
        }
        AbstractC28215d dVar2 = this.f66052av;
        if (dVar2 != null) {
            super.bringChildToFront(dVar2.mo48288a());
        }
        AbstractC28218g gVar5 = this.f66050at;
        if (gVar5 != null && gVar5.getSpinnerStyle().f66149h) {
            super.bringChildToFront(this.f66050at.getView());
        }
        AbstractC28218g gVar6 = this.f66051au;
        if (gVar6 != null && gVar6.getSpinnerStyle().f66149h) {
            super.bringChildToFront(this.f66051au.getView());
        }
        MethodCollector.m26664o(4586);
    }

    public static void setDefaultRefreshFooterCreator(AbstractC28212a aVar) {
        f65991aI = aVar;
    }

    public static void setDefaultRefreshHeaderCreator(AbstractC28213b bVar) {
        f65992aJ = bVar;
    }

    public static void setDefaultRefreshInitializer(AbstractC28214c cVar) {
        f65993aK = cVar;
    }

    /* renamed from: a */
    public final AbstractC28220i mo48229a(AbstractC28236c cVar) {
        this.f66033ac = cVar;
        return this;
    }

    /* renamed from: c */
    public final AbstractC28220i mo48238c(boolean z) {
        this.f65995A = z;
        return this;
    }

    /* renamed from: com.lynx.b.a.a$c */
    public static class C28210c extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f66123a;

        /* renamed from: b */
        public C28224c f66124b;

        static {
            Covode.recordClassIndex(34156);
        }

        public C28210c(int i) {
            super(-1, i);
        }

        public C28210c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a1n, R.attr.a1o});
            this.f66123a = obtainStyledAttributes.getColor(0, this.f66123a);
            if (obtainStyledAttributes.hasValue(1)) {
                this.f66124b = C28224c.f66147f[obtainStyledAttributes.getInt(1, C28224c.f66142a.f66148g)];
            }
            obtainStyledAttributes.recycle();
        }
    }

    public C28194a(Context context) {
        this(context, (byte) 0);
    }

    public final void setNestedScrollingEnabled(boolean z) {
        this.f66010P = z;
        this.f66038ah.mo2902a(z);
    }

    /* renamed from: b */
    public final AbstractC28220i mo48236b(boolean z) {
        this.f66015U = true;
        this.f65996B = z;
        return this;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C28210c(getContext(), attributeSet);
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public final void onStopNestedScroll(View view) {
        this.f66039ai.mo2914a(0);
        this.f66036af = false;
        this.f66035ae = 0;
        m56309h();
        this.f66038ah.mo2910b(0);
    }

    /* access modifiers changed from: protected */
    public final void setViceState(EnumC28223b bVar) {
        if (this.f66056az.isDragging && this.f66056az.isHeader != bVar.isHeader) {
            mo48232a(EnumC28223b.None);
        }
        if (this.f66019aA != bVar) {
            this.f66019aA = bVar;
        }
    }

    /* access modifiers changed from: protected */
    public final void setStateLoading(final boolean z) {
        C281951 r5 = new AnimatorListenerAdapter() {
            /* class com.lynx.p2032b.p2033a.C28194a.C281951 */

            static {
                Covode.recordClassIndex(34141);
            }

            public final void onAnimationEnd(Animator animator) {
                C28194a.this.setStateDirectLoading(z);
            }
        };
        mo48232a(EnumC28223b.LoadReleased);
        ValueAnimator a = this.f66055ay.mo48279a(-this.f66042al);
        if (a != null) {
            a.addListener(r5);
        }
        AbstractC28218g gVar = this.f66051au;
        if (gVar != null) {
            int i = this.f66042al;
            gVar.mo30704a(this, i, (int) (this.f66047aq * ((float) i)));
        }
        if (a == null) {
            r5.onAnimationEnd(null);
        }
    }

    /* access modifiers changed from: protected */
    public final void setStateRefreshing(final boolean z) {
        C281973 r5 = new AnimatorListenerAdapter() {
            /* class com.lynx.p2032b.p2033a.C28194a.C281973 */

            static {
                Covode.recordClassIndex(34143);
            }

            public final void onAnimationEnd(Animator animator) {
                C28194a.this.f66020aB = System.currentTimeMillis();
                C28194a.this.mo48232a(EnumC28223b.Refreshing);
                if (C28194a.this.f66031aa != null) {
                    if (z) {
                        C28194a.this.f66031aa.mo29962a(C28194a.this);
                    }
                } else if (C28194a.this.f66033ac == null) {
                    C28194a.this.mo48240d();
                }
                if (C28194a.this.f66050at != null) {
                    AbstractC28218g gVar = C28194a.this.f66050at;
                    C28194a aVar = C28194a.this;
                    gVar.mo30709b(aVar, aVar.f66040aj, (int) (C28194a.this.f66046ap * ((float) C28194a.this.f66040aj)));
                }
                if (C28194a.this.f66033ac != null && (C28194a.this.f66050at instanceof AbstractC28217f) && z) {
                    C28194a.this.f66033ac.mo29962a(C28194a.this);
                }
            }
        };
        mo48232a(EnumC28223b.RefreshReleased);
        ValueAnimator a = this.f66055ay.mo48279a(this.f66040aj);
        if (a != null) {
            a.addListener(r5);
        }
        AbstractC28218g gVar = this.f66050at;
        if (gVar != null) {
            int i = this.f66040aj;
            gVar.mo30704a(this, i, (int) (this.f66046ap * ((float) i)));
        }
        AbstractC28236c cVar = this.f66033ac;
        if (cVar != null && (this.f66050at instanceof AbstractC28217f)) {
            cVar.mo29964a();
        }
        if (a == null) {
            r5.onAnimationEnd(null);
        }
    }

    /* renamed from: a */
    private boolean m56299a(int i) {
        if (i == 0) {
            if (this.f66030aP != null) {
                if (this.f66056az.isFinishing || this.f66056az == EnumC28223b.TwoLevelReleased) {
                    return true;
                }
                if (this.f66056az == EnumC28223b.PullDownCanceled) {
                    this.f66055ay.mo48282a(EnumC28223b.PullDownToRefresh);
                } else if (this.f66056az == EnumC28223b.PullUpCanceled) {
                    this.f66055ay.mo48282a(EnumC28223b.PullUpToLoad);
                }
                this.f66030aP.cancel();
                this.f66030aP = null;
            }
            this.f66029aO = null;
        }
        if (this.f66030aP != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private AbstractC28220i m56301b(AbstractC28216e eVar) {
        boolean z;
        AbstractC28218g gVar;
        MethodCollector.m26663i(13);
        AbstractC28218g gVar2 = this.f66051au;
        if (gVar2 != null) {
            super.removeView(gVar2.getView());
        }
        this.f66051au = eVar;
        this.f66026aH = false;
        this.f66022aD = 0;
        this.f66014T = false;
        this.f66024aF = false;
        this.f66043am = this.f66043am.mo48299a();
        if (!this.f66015U || this.f65996B) {
            z = true;
        } else {
            z = false;
        }
        this.f65996B = z;
        if (this.f66051au.getSpinnerStyle().f66149h) {
            super.addView(this.f66051au.getView(), getChildCount(), new C28210c(-2));
        } else {
            super.addView(this.f66051au.getView(), 0, new C28210c(-2));
        }
        int[] iArr = this.f66081z;
        if (!(iArr == null || (gVar = this.f66051au) == null)) {
            gVar.setPrimaryColors(iArr);
        }
        MethodCollector.m26664o(13);
        return this;
    }

    /* access modifiers changed from: protected */
    public final void setStateDirectLoading(boolean z) {
        if (this.f66056az != EnumC28223b.Loading) {
            this.f66020aB = System.currentTimeMillis();
            this.f66026aH = true;
            mo48232a(EnumC28223b.Loading);
            AbstractC28235b bVar = this.f66032ab;
            if (bVar != null) {
                if (z) {
                    bVar.mo29963a_(this);
                }
            } else if (this.f66033ac == null) {
                mo48244e();
            }
            AbstractC28218g gVar = this.f66051au;
            if (gVar != null) {
                int i = this.f66042al;
                gVar.mo30709b(this, i, (int) (this.f66047aq * ((float) i)));
            }
            AbstractC28236c cVar = this.f66033ac;
            if (cVar != null && (this.f66051au instanceof AbstractC28216e) && z) {
                cVar.mo29963a_(this);
            }
        }
    }

    /* renamed from: b */
    private AbstractC28220i m56302b(AbstractC28217f fVar) {
        AbstractC28218g gVar;
        MethodCollector.m26663i(6);
        AbstractC28218g gVar2 = this.f66050at;
        if (gVar2 != null) {
            super.removeView(gVar2.getView());
        }
        this.f66050at = fVar;
        this.f66021aC = 0;
        this.f66023aE = false;
        this.f66041ak = this.f66041ak.mo48299a();
        if (this.f66050at.getSpinnerStyle().f66149h) {
            super.addView(this.f66050at.getView(), getChildCount(), new C28210c(-2));
        } else {
            super.addView(this.f66050at.getView(), 0, new C28210c(-2));
        }
        int[] iArr = this.f66081z;
        if (!(iArr == null || (gVar = this.f66050at) == null)) {
            gVar.setPrimaryColors(iArr);
        }
        MethodCollector.m26664o(6);
        return this;
    }

    /* renamed from: d */
    public final AbstractC28220i mo48241d(boolean z) {
        if (this.f66056az == EnumC28223b.Refreshing && z) {
            m56297a(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.f66020aB))), 300) << 16, Boolean.TRUE);
        } else if (this.f66056az == EnumC28223b.Loading && z) {
            mo48245f();
        } else if (this.f66013S != z) {
            this.f66013S = z;
            AbstractC28218g gVar = this.f66051au;
            if (gVar instanceof AbstractC28216e) {
                if (((AbstractC28216e) gVar).mo30708a(z)) {
                    this.f66014T = true;
                    if (this.f66013S && this.f66001G && this.f66057b > 0 && this.f66051au.getSpinnerStyle() == C28224c.f66142a && mo48233a(this.f65996B) && mo48234a(this.f65995A, this.f66050at)) {
                        this.f66051au.getView().setTranslationY((float) this.f66057b);
                    }
                } else {
                    this.f66014T = false;
                    new RuntimeException("Footer:" + this.f66051au + " NoMoreData is not supported");
                }
            }
        }
        return this;
    }

    /* renamed from: b */
    private boolean m56303b(float f) {
        if (f == 0.0f) {
            f = (float) this.f66077v;
        }
        if (Build.VERSION.SDK_INT > 27 && this.f66052av != null) {
            getScaleY();
            View a = this.f66052av.mo48288a();
            if (getScaleY() == -1.0f && a.getScaleY() == -1.0f) {
                f = -f;
            }
        }
        if (Math.abs(f) > ((float) this.f66075t)) {
            if (((float) this.f66057b) * f < 0.0f) {
                if (this.f66056az == EnumC28223b.Refreshing || this.f66056az == EnumC28223b.Loading || (this.f66057b < 0 && this.f66013S)) {
                    this.f66029aO = new RunnableC28209b(f).mo48277a();
                    return true;
                } else if (this.f66056az.isReleaseToOpening) {
                    return true;
                }
            }
            if ((f < 0.0f && ((this.f66003I && (this.f65996B || this.f66004J)) || ((this.f66056az == EnumC28223b.Loading && this.f66057b >= 0) || (this.f66005K && mo48233a(this.f65996B))))) || (f > 0.0f && ((this.f66003I && this.f65995A) || this.f66004J || (this.f66056az == EnumC28223b.Refreshing && this.f66057b <= 0)))) {
                this.f66027aM = false;
                this.f66078w.fling(0, 0, 0, (int) (-f), 0, 0, -2147483647, Integer.MAX_VALUE);
                this.f66078w.computeScrollOffset();
                invalidate();
            }
        }
        return false;
    }

    /* renamed from: a */
    public final AbstractC28220i mo48225a(View view) {
        MethodCollector.m26663i(30);
        AbstractC28215d dVar = this.f66052av;
        if (dVar != null) {
            super.removeView(dVar.mo48288a());
        }
        super.addView(view, getChildCount(), new C28210c(-1));
        this.f66052av = new C28229a(view);
        if (this.f66025aG) {
            View findViewById = findViewById(this.f66071p);
            View findViewById2 = findViewById(this.f66072q);
            this.f66052av.mo48292a(this.f66034ad);
            this.f66052av.mo48293a(this.f66009O);
            this.f66052av.mo48291a(this.f66055ay, findViewById, findViewById2);
        }
        AbstractC28218g gVar = this.f66050at;
        if (gVar != null && gVar.getSpinnerStyle().f66149h) {
            super.bringChildToFront(this.f66050at.getView());
        }
        AbstractC28218g gVar2 = this.f66051au;
        if (gVar2 != null && gVar2.getSpinnerStyle().f66149h) {
            super.bringChildToFront(this.f66051au.getView());
        }
        MethodCollector.m26664o(30);
        return this;
    }

    /* renamed from: a */
    public final AbstractC28220i mo48226a(AbstractC28216e eVar) {
        return m56301b(eVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0112, code lost:
        if (r15 != 3) goto L_0x0114;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r21) {
        /*
        // Method dump skipped, instructions count: 869
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.p2032b.p2033a.C28194a.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    public final AbstractC28220i mo48227a(AbstractC28217f fVar) {
        return m56302b(fVar);
    }

    /* renamed from: a */
    private AbstractC28220i m56297a(int i, Boolean bool) {
        int i2 = (i << 16) >> 16;
        RunnableC282017 r3 = new Runnable(i >> 16, bool, true) {
            /* class com.lynx.p2032b.p2033a.C28194a.RunnableC282017 */

            /* renamed from: a */
            int f66090a;

            /* renamed from: b */
            final /* synthetic */ int f66091b;

            /* renamed from: c */
            final /* synthetic */ Boolean f66092c;

            /* renamed from: d */
            final /* synthetic */ boolean f66093d = true;

            static {
                Covode.recordClassIndex(34147);
            }

            public final void run() {
                ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
                if (this.f66090a == 0) {
                    if (C28194a.this.f66056az == EnumC28223b.None && C28194a.this.f66019aA == EnumC28223b.Refreshing) {
                        C28194a.this.f66019aA = EnumC28223b.None;
                    } else if (C28194a.this.f66030aP != null && C28194a.this.f66056az.isHeader && (C28194a.this.f66056az.isDragging || C28194a.this.f66056az == EnumC28223b.RefreshReleased)) {
                        ValueAnimator valueAnimator = C28194a.this.f66030aP;
                        C28194a.this.f66030aP = null;
                        valueAnimator.cancel();
                        C28194a.this.f66055ay.mo48282a(EnumC28223b.None);
                    } else if (!(C28194a.this.f66056az != EnumC28223b.Refreshing || C28194a.this.f66050at == null || C28194a.this.f66052av == null)) {
                        this.f66090a++;
                        C28194a.this.f66054ax.postDelayed(this, (long) this.f66091b);
                        C28194a.this.mo48232a(EnumC28223b.RefreshFinish);
                        if (this.f66092c == Boolean.FALSE) {
                            C28194a.this.mo48241d(false);
                        }
                    }
                    if (this.f66092c == Boolean.TRUE) {
                        C28194a.this.mo48241d(true);
                        return;
                    }
                    return;
                }
                int a = C28194a.this.f66050at.mo30701a(C28194a.this, this.f66093d);
                if (a < Integer.MAX_VALUE) {
                    if (C28194a.this.f66069n || C28194a.this.f66036af) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (C28194a.this.f66069n) {
                            C28194a aVar = C28194a.this;
                            aVar.f66064i = aVar.f66066k;
                            C28194a.this.f66059d = 0;
                            C28194a.this.f66069n = false;
                            C28194a aVar2 = C28194a.this;
                            C28194a.super.dispatchTouchEvent(MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 0, aVar2.f66065j, (C28194a.this.f66066k + ((float) C28194a.this.f66057b)) - ((float) (C28194a.this.f66018a * 2)), 0));
                            C28194a aVar3 = C28194a.this;
                            C28194a.super.dispatchTouchEvent(MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 2, aVar3.f66065j, C28194a.this.f66066k + ((float) C28194a.this.f66057b), 0));
                        }
                        if (C28194a.this.f66036af) {
                            C28194a.this.f66035ae = 0;
                            C28194a aVar4 = C28194a.this;
                            C28194a.super.dispatchTouchEvent(MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 1, aVar4.f66065j, C28194a.this.f66066k, 0));
                            C28194a.this.f66036af = false;
                            C28194a.this.f66059d = 0;
                        }
                    }
                    if (C28194a.this.f66057b > 0) {
                        C28194a aVar5 = C28194a.this;
                        ValueAnimator a2 = aVar5.mo48223a(0, a, aVar5.f66080y, C28194a.this.f66061f);
                        if (C28194a.this.f66008N) {
                            animatorUpdateListener = C28194a.this.f66052av.mo48287a(C28194a.this.f66057b);
                        }
                        if (a2 != null && animatorUpdateListener != null) {
                            a2.addUpdateListener(animatorUpdateListener);
                        }
                    } else if (C28194a.this.f66057b < 0) {
                        C28194a aVar6 = C28194a.this;
                        aVar6.mo48223a(0, a, aVar6.f66080y, C28194a.this.f66061f);
                    } else {
                        C28194a.this.f66055ay.mo48280a(0, false);
                        C28194a.this.f66055ay.mo48282a(EnumC28223b.None);
                    }
                }
            }

            {
                this.f66091b = r3;
                this.f66092c = r4;
            }
        };
        if (i2 > 0) {
            this.f66054ax.postDelayed(r3, (long) i2);
        } else {
            r3.run();
        }
        return this;
    }

    /* renamed from: a */
    private AbstractC28220i m56298a(int i, boolean z) {
        int i2 = (i << 16) >> 16;
        RunnableC282028 r3 = new Runnable(i >> 16, z, true) {
            /* class com.lynx.p2032b.p2033a.C28194a.RunnableC282028 */

            /* renamed from: a */
            int f66095a;

            /* renamed from: b */
            final /* synthetic */ int f66096b;

            /* renamed from: c */
            final /* synthetic */ boolean f66097c;

            /* renamed from: d */
            final /* synthetic */ boolean f66098d = true;

            static {
                Covode.recordClassIndex(34148);
            }

            public final void run() {
                int i;
                long j;
                int i2;
                boolean z = true;
                if (this.f66095a == 0) {
                    if (C28194a.this.f66056az == EnumC28223b.None && C28194a.this.f66019aA == EnumC28223b.Loading) {
                        C28194a.this.f66019aA = EnumC28223b.None;
                    } else if (C28194a.this.f66030aP != null && ((C28194a.this.f66056az.isDragging || C28194a.this.f66056az == EnumC28223b.LoadReleased) && C28194a.this.f66056az.isFooter)) {
                        ValueAnimator valueAnimator = C28194a.this.f66030aP;
                        C28194a.this.f66030aP = null;
                        valueAnimator.cancel();
                        C28194a.this.f66055ay.mo48282a(EnumC28223b.None);
                    } else if (!(C28194a.this.f66056az != EnumC28223b.Loading || C28194a.this.f66051au == null || C28194a.this.f66052av == null)) {
                        this.f66095a++;
                        C28194a.this.f66054ax.postDelayed(this, (long) this.f66096b);
                        C28194a.this.mo48232a(EnumC28223b.LoadFinish);
                        return;
                    }
                    if (this.f66097c) {
                        C28194a.this.mo48241d(true);
                        return;
                    }
                    return;
                }
                int a = C28194a.this.f66051au.mo30701a(C28194a.this, this.f66098d);
                if (a < Integer.MAX_VALUE) {
                    if (!this.f66097c || !C28194a.this.f66001G || C28194a.this.f66057b >= 0 || !C28194a.this.f66052av.mo48296d()) {
                        z = false;
                    }
                    int i3 = C28194a.this.f66057b;
                    if (z) {
                        i = Math.max(C28194a.this.f66057b, -C28194a.this.f66042al);
                    } else {
                        i = 0;
                    }
                    final int i4 = i3 - i;
                    if (C28194a.this.f66069n || C28194a.this.f66036af) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (C28194a.this.f66069n) {
                            C28194a aVar = C28194a.this;
                            aVar.f66064i = aVar.f66066k;
                            C28194a aVar2 = C28194a.this;
                            aVar2.f66059d = aVar2.f66057b - i4;
                            C28194a.this.f66069n = false;
                            if (C28194a.this.f66000F) {
                                i2 = i4;
                            } else {
                                i2 = 0;
                            }
                            C28194a aVar3 = C28194a.this;
                            float f = (float) i2;
                            C28194a.super.dispatchTouchEvent(MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 0, aVar3.f66065j, C28194a.this.f66066k + f + ((float) (C28194a.this.f66018a * 2)), 0));
                            C28194a aVar4 = C28194a.this;
                            C28194a.super.dispatchTouchEvent(MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 2, aVar4.f66065j, C28194a.this.f66066k + f, 0));
                        }
                        if (C28194a.this.f66036af) {
                            C28194a.this.f66035ae = 0;
                            C28194a aVar5 = C28194a.this;
                            C28194a.super.dispatchTouchEvent(MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 1, aVar5.f66065j, C28194a.this.f66066k, 0));
                            C28194a.this.f66036af = false;
                            C28194a.this.f66059d = 0;
                        }
                    }
                    Handler handler = C28194a.this.f66054ax;
                    RunnableC282031 r3 = new Runnable() {
                        /* class com.lynx.p2032b.p2033a.C28194a.RunnableC282028.RunnableC282031 */

                        static {
                            Covode.recordClassIndex(34149);
                        }

                        /* JADX WARNING: Removed duplicated region for block: B:28:0x00b8  */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final void run() {
                            /*
                            // Method dump skipped, instructions count: 200
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.lynx.p2032b.p2033a.C28194a.RunnableC282028.RunnableC282031.run():void");
                        }
                    };
                    if (C28194a.this.f66057b < 0) {
                        j = (long) a;
                    } else {
                        j = 0;
                    }
                    handler.postDelayed(r3, j);
                }
            }

            {
                this.f66096b = r3;
                this.f66097c = r4;
            }
        };
        if (i2 > 0) {
            this.f66054ax.postDelayed(r3, (long) i2);
        } else {
            r3.run();
        }
        return this;
    }

    private C28194a(Context context, byte b) {
        super(context, null);
        boolean z;
        boolean z2;
        boolean z3;
        C28222a aVar;
        C28222a aVar2;
        MethodCollector.m26663i(4459);
        this.f66060e = 300;
        this.f66061f = 300;
        this.f66067l = 0.5f;
        this.f66068m = 'n';
        this.f66071p = -1;
        this.f66072q = -1;
        this.f66073r = -1;
        this.f66074s = -1;
        this.f65995A = true;
        this.f65997C = true;
        this.f65998D = true;
        this.f65999E = true;
        this.f66000F = true;
        this.f66002H = true;
        this.f66003I = true;
        this.f66005K = true;
        this.f66007M = true;
        this.f66008N = true;
        this.f66009O = true;
        this.f66010P = true;
        this.f66037ag = new int[2];
        this.f66038ah = new C0783m(this);
        this.f66039ai = new C0787q();
        this.f66041ak = C28222a.f66126a;
        this.f66043am = C28222a.f66126a;
        this.f66046ap = 2.5f;
        this.f66047aq = 2.5f;
        this.f66048ar = 1.0f;
        this.f66049as = 1.0f;
        this.f66055ay = new C28211d();
        this.f66056az = EnumC28223b.None;
        this.f66019aA = EnumC28223b.None;
        this.f66020aB = 0;
        this.f66021aC = 0;
        this.f66022aD = 0;
        this.f66026aH = false;
        this.f66027aM = false;
        this.f66028aN = null;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f66054ax = new Handler();
        this.f66078w = new Scroller(context);
        this.f66079x = VelocityTracker.obtain();
        this.f66062g = context.getResources().getDisplayMetrics().heightPixels;
        this.f66080y = new animationInterpolatorC28243b(animationInterpolatorC28243b.f66201a);
        this.f66018a = viewConfiguration.getScaledTouchSlop();
        this.f66075t = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f66076u = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f66042al = animationInterpolatorC28243b.m56416a(60.0f);
        this.f66040aj = animationInterpolatorC28243b.m56416a(100.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, new int[]{16842986, 16842987, R.attr.ad4, R.attr.ad7, R.attr.ad8, R.attr.ad9, R.attr.adf, R.attr.adg, R.attr.adh, R.attr.adi, R.attr.adj, R.attr.adk, R.attr.adl, R.attr.ado, R.attr.adp, R.attr.adq, R.attr.adr, R.attr.ads, R.attr.adt, R.attr.adv, R.attr.adw, R.attr.adx, R.attr.ady, R.attr.ae1, R.attr.ae2, R.attr.ae5, R.attr.ae6, R.attr.ae7, R.attr.ae8, R.attr.ae9, R.attr.ae_, R.attr.aea, R.attr.aeb, R.attr.aec, R.attr.aed, R.attr.aeg, R.attr.aeh});
        if (!obtainStyledAttributes.hasValue(1)) {
            super.setClipToPadding(false);
        }
        if (!obtainStyledAttributes.hasValue(0)) {
            super.setClipChildren(false);
        }
        this.f66067l = obtainStyledAttributes.getFloat(5, this.f66067l);
        this.f66046ap = obtainStyledAttributes.getFloat(32, this.f66046ap);
        this.f66047aq = obtainStyledAttributes.getFloat(27, this.f66047aq);
        this.f66048ar = obtainStyledAttributes.getFloat(34, this.f66048ar);
        this.f66049as = obtainStyledAttributes.getFloat(29, this.f66049as);
        this.f65995A = obtainStyledAttributes.getBoolean(20, this.f65995A);
        this.f66061f = obtainStyledAttributes.getInt(36, this.f66061f);
        this.f65996B = obtainStyledAttributes.getBoolean(13, this.f65996B);
        this.f66040aj = obtainStyledAttributes.getDimensionPixelOffset(30, this.f66040aj);
        this.f66042al = obtainStyledAttributes.getDimensionPixelOffset(25, this.f66042al);
        this.f66044an = obtainStyledAttributes.getDimensionPixelOffset(31, this.f66044an);
        this.f66045ao = obtainStyledAttributes.getDimensionPixelOffset(26, this.f66045ao);
        this.f66011Q = obtainStyledAttributes.getBoolean(4, this.f66011Q);
        this.f66012R = obtainStyledAttributes.getBoolean(3, this.f66012R);
        this.f65999E = obtainStyledAttributes.getBoolean(12, this.f65999E);
        this.f66000F = obtainStyledAttributes.getBoolean(11, this.f66000F);
        this.f66002H = obtainStyledAttributes.getBoolean(18, this.f66002H);
        this.f66005K = obtainStyledAttributes.getBoolean(6, this.f66005K);
        this.f66003I = obtainStyledAttributes.getBoolean(16, this.f66003I);
        this.f66006L = obtainStyledAttributes.getBoolean(19, this.f66006L);
        this.f66007M = obtainStyledAttributes.getBoolean(21, this.f66007M);
        this.f66008N = obtainStyledAttributes.getBoolean(22, this.f66008N);
        this.f66009O = obtainStyledAttributes.getBoolean(14, this.f66009O);
        boolean z4 = obtainStyledAttributes.getBoolean(9, this.f66001G);
        this.f66001G = z4;
        this.f66001G = obtainStyledAttributes.getBoolean(10, z4);
        this.f65997C = obtainStyledAttributes.getBoolean(8, this.f65997C);
        this.f65998D = obtainStyledAttributes.getBoolean(7, this.f65998D);
        this.f66004J = obtainStyledAttributes.getBoolean(17, this.f66004J);
        this.f66071p = obtainStyledAttributes.getResourceId(24, this.f66071p);
        this.f66072q = obtainStyledAttributes.getResourceId(23, this.f66072q);
        this.f66073r = obtainStyledAttributes.getResourceId(33, this.f66073r);
        this.f66074s = obtainStyledAttributes.getResourceId(28, this.f66074s);
        boolean z5 = obtainStyledAttributes.getBoolean(15, this.f66010P);
        this.f66010P = z5;
        this.f66038ah.mo2902a(z5);
        if (this.f66015U || obtainStyledAttributes.hasValue(13)) {
            z = true;
        } else {
            z = false;
        }
        this.f66015U = z;
        if (this.f66016V || obtainStyledAttributes.hasValue(12)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f66016V = z2;
        if (this.f66017W || obtainStyledAttributes.hasValue(11)) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f66017W = z3;
        if (obtainStyledAttributes.hasValue(30)) {
            aVar = C28222a.f66132g;
        } else {
            aVar = this.f66041ak;
        }
        this.f66041ak = aVar;
        if (obtainStyledAttributes.hasValue(25)) {
            aVar2 = C28222a.f66132g;
        } else {
            aVar2 = this.f66043am;
        }
        this.f66043am = aVar2;
        int color = obtainStyledAttributes.getColor(2, 0);
        int color2 = obtainStyledAttributes.getColor(35, 0);
        if (color2 != 0) {
            if (color != 0) {
                this.f66081z = new int[]{color2, color};
            } else {
                this.f66081z = new int[]{color2};
            }
        } else if (color != 0) {
            this.f66081z = new int[]{0, color};
        }
        if (this.f66006L && !this.f66015U && !this.f65996B) {
            this.f65996B = true;
        }
        obtainStyledAttributes.recycle();
        MethodCollector.m26664o(4459);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0156  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r17, int r18) {
        /*
        // Method dump skipped, instructions count: 788
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.p2032b.p2033a.C28194a.onMeasure(int, int):void");
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public final boolean onNestedPreFling(View view, float f, float f2) {
        if ((!this.f66026aH || f2 <= 0.0f) && !m56303b(-f2) && !this.f66038ah.mo2903a(f, f2)) {
            return false;
        }
        return true;
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.f66039ai.mo2915a(i, 0);
        this.f66038ah.mo2906a(i & 2, 0);
        this.f66035ae = this.f66057b;
        this.f66036af = true;
        m56299a(0);
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if (!isEnabled() || !isNestedScrollingEnabled() || (i & 2) == 0 || (!this.f66004J && !this.f65995A && !this.f65996B)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        View view2;
        Paint paint;
        Paint paint2;
        AbstractC28215d dVar = this.f66052av;
        if (dVar != null) {
            view2 = dVar.mo48288a();
        } else {
            view2 = null;
        }
        AbstractC28218g gVar = this.f66050at;
        if (gVar != null && gVar.getView() == view) {
            if (!mo48233a(this.f65995A) || (!this.f66002H && isInEditMode())) {
                return true;
            }
            if (view2 != null) {
                int max = Math.max(view2.getTop() + view2.getPaddingTop() + this.f66057b, view.getTop());
                int i = this.f66021aC;
                if (!(i == 0 || (paint2 = this.f66053aw) == null)) {
                    paint2.setColor(i);
                    if (this.f66050at.getSpinnerStyle().f66150i) {
                        max = view.getBottom();
                    } else if (this.f66050at.getSpinnerStyle() == C28224c.f66142a) {
                        max = view.getBottom() + this.f66057b;
                    }
                    canvas.drawRect(0.0f, (float) view.getTop(), (float) getWidth(), (float) max, this.f66053aw);
                }
                if (this.f65997C && this.f66050at.getSpinnerStyle() == C28224c.f66144c) {
                    canvas.save();
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), max);
                    boolean drawChild = super.drawChild(canvas, view, j);
                    canvas.restore();
                    return drawChild;
                }
            }
        }
        AbstractC28218g gVar2 = this.f66051au;
        if (gVar2 != null && gVar2.getView() == view) {
            if (!mo48233a(this.f65996B) || (!this.f66002H && isInEditMode())) {
                return true;
            }
            if (view2 != null) {
                int min = Math.min((view2.getBottom() - view2.getPaddingBottom()) + this.f66057b, view.getBottom());
                int i2 = this.f66022aD;
                if (!(i2 == 0 || (paint = this.f66053aw) == null)) {
                    paint.setColor(i2);
                    if (this.f66051au.getSpinnerStyle().f66150i) {
                        min = view.getTop();
                    } else if (this.f66051au.getSpinnerStyle() == C28224c.f66142a) {
                        min = view.getTop() + this.f66057b;
                    }
                    canvas.drawRect(0.0f, (float) min, (float) getWidth(), (float) view.getBottom(), this.f66053aw);
                }
                if (this.f65998D && this.f66051au.getSpinnerStyle() == C28224c.f66144c) {
                    canvas.save();
                    canvas.clipRect(view.getLeft(), min, view.getRight(), view.getBottom());
                    boolean drawChild2 = super.drawChild(canvas, view, j);
                    canvas.restore();
                    return drawChild2;
                }
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return this.f66038ah.mo2904a(f, f2, z);
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        int i3 = this.f66035ae;
        int i4 = 0;
        if (i2 * i3 > 0) {
            if (Math.abs(i2) > Math.abs(this.f66035ae)) {
                int i5 = this.f66035ae;
                this.f66035ae = 0;
                i4 = i5;
            } else {
                this.f66035ae -= i2;
                i4 = i2;
            }
            mo48231a((float) this.f66035ae);
        } else if (i2 > 0 && this.f66026aH) {
            int i6 = i3 - i2;
            this.f66035ae = i6;
            mo48231a((float) i6);
            i4 = i2;
        }
        this.f66038ah.mo2908a(i, i2 - i4, iArr, null);
        iArr[1] = iArr[1] + i4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ValueAnimator mo48223a(int i, int i2, Interpolator interpolator, int i3) {
        if (this.f66057b == i) {
            return null;
        }
        ValueAnimator valueAnimator = this.f66030aP;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f66029aO = null;
        ValueAnimator ofInt = ValueAnimator.ofInt(this.f66057b, i);
        this.f66030aP = ofInt;
        ofInt.setDuration((long) i3);
        this.f66030aP.setInterpolator(interpolator);
        this.f66030aP.addListener(new AnimatorListenerAdapter() {
            /* class com.lynx.p2032b.p2033a.C28194a.C281984 */

            static {
                Covode.recordClassIndex(34144);
            }

            public final void onAnimationEnd(Animator animator) {
                C28194a.this.f66030aP = null;
                if (C28194a.this.f66057b == 0 && C28194a.this.f66056az != EnumC28223b.None && !C28194a.this.f66056az.isOpening && !C28194a.this.f66056az.isDragging) {
                    C28194a.this.mo48232a(EnumC28223b.None);
                } else if (C28194a.this.f66056az != C28194a.this.f66019aA) {
                    C28194a aVar = C28194a.this;
                    aVar.setViceState(aVar.f66056az);
                }
            }
        });
        this.f66030aP.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.lynx.p2032b.p2033a.C28194a.C281995 */

            static {
                Covode.recordClassIndex(34145);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C28194a.this.f66055ay.mo48280a(((Integer) valueAnimator.getAnimatedValue()).intValue(), false);
            }
        });
        this.f66030aP.setStartDelay((long) i2);
        this.f66030aP.start();
        return this.f66030aP;
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        EnumC28223b bVar;
        AbstractC28221j jVar;
        AbstractC28221j jVar2;
        boolean a = this.f66038ah.mo2907a(i, i2, i3, i4, this.f66037ag);
        int i5 = i4 + this.f66037ag[1];
        if (i5 >= 0 ? !(i5 <= 0 || ((!this.f65996B && !this.f66004J) || (this.f66035ae == 0 && (jVar = this.f66034ad) != null && !jVar.mo48298b(this.f66052av.mo48288a())))) : !((!this.f65995A && !this.f66004J) || (this.f66035ae == 0 && (jVar2 = this.f66034ad) != null && !jVar2.mo48297a(this.f66052av.mo48288a())))) {
            if (this.f66019aA == EnumC28223b.None || this.f66019aA.isOpening) {
                AbstractC28219h hVar = this.f66055ay;
                if (i5 > 0) {
                    bVar = EnumC28223b.PullUpToLoad;
                } else {
                    bVar = EnumC28223b.PullDownToRefresh;
                }
                hVar.mo48282a(bVar);
                if (!a) {
                    ViewParent parent = getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).requestDisallowInterceptTouchEvent(true);
                    }
                }
            }
            int i6 = this.f66035ae - i5;
            this.f66035ae = i6;
            mo48231a((float) i6);
        }
        if (this.f66026aH && i2 < 0) {
            this.f66026aH = false;
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i5;
        int i6;
        int i7;
        boolean z2;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        boolean z3;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        int childCount = super.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = super.getChildAt(i8);
            if (!(childAt.getVisibility() == 8 || childAt.getTag(R.string.g0s) == childAt)) {
                AbstractC28215d dVar = this.f66052av;
                boolean z4 = true;
                if (dVar != null && dVar.mo48288a() == childAt) {
                    if (!isInEditMode() || !this.f66002H || !mo48233a(this.f65995A) || this.f66050at == null) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    View a = this.f66052av.mo48288a();
                    ViewGroup.LayoutParams layoutParams = a.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams;
                    } else {
                        marginLayoutParams3 = f65994aL;
                    }
                    int i9 = marginLayoutParams3.leftMargin + paddingLeft;
                    int i10 = marginLayoutParams3.topMargin + paddingTop;
                    int measuredWidth = a.getMeasuredWidth() + i9;
                    int measuredHeight = a.getMeasuredHeight() + i10;
                    if (z3 && mo48234a(this.f65999E, this.f66050at)) {
                        int i11 = this.f66040aj;
                        i10 += i11;
                        measuredHeight += i11;
                    }
                    a.layout(i9, i10, measuredWidth, measuredHeight);
                }
                AbstractC28218g gVar = this.f66050at;
                if (gVar != null && gVar.getView() == childAt) {
                    if (!isInEditMode() || !this.f66002H || !mo48233a(this.f65995A)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    View view = this.f66050at.getView();
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    } else {
                        marginLayoutParams2 = f65994aL;
                    }
                    int i12 = marginLayoutParams2.leftMargin;
                    int i13 = marginLayoutParams2.topMargin + this.f66044an;
                    int measuredWidth2 = view.getMeasuredWidth() + i12;
                    int measuredHeight2 = view.getMeasuredHeight() + i13;
                    if (!z2 && this.f66050at.getSpinnerStyle() == C28224c.f66142a) {
                        int i14 = this.f66040aj;
                        i13 -= i14;
                        measuredHeight2 -= i14;
                    }
                    view.layout(i12, i13, measuredWidth2, measuredHeight2);
                }
                AbstractC28218g gVar2 = this.f66051au;
                if (gVar2 != null && gVar2.getView() == childAt) {
                    if (!isInEditMode() || !this.f66002H || !mo48233a(this.f65996B)) {
                        z4 = false;
                    }
                    View view2 = this.f66051au.getView();
                    ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                    if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
                    } else {
                        marginLayoutParams = f65994aL;
                    }
                    C28224c spinnerStyle = this.f66051au.getSpinnerStyle();
                    int i15 = marginLayoutParams.leftMargin;
                    int measuredHeight3 = (marginLayoutParams.topMargin + getMeasuredHeight()) - this.f66045ao;
                    if (this.f66013S && this.f66014T && this.f66001G && this.f66052av != null && this.f66051au.getSpinnerStyle() == C28224c.f66142a && mo48233a(this.f65996B)) {
                        View a2 = this.f66052av.mo48288a();
                        ViewGroup.LayoutParams layoutParams4 = a2.getLayoutParams();
                        if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                            i7 = ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin;
                        } else {
                            i7 = 0;
                        }
                        measuredHeight3 = a2.getMeasuredHeight() + paddingTop + paddingTop + i7;
                    }
                    if (spinnerStyle == C28224c.f66146e) {
                        measuredHeight3 = marginLayoutParams.topMargin - this.f66045ao;
                    } else {
                        if (z4 || spinnerStyle == C28224c.f66145d || spinnerStyle == C28224c.f66144c) {
                            i5 = this.f66042al;
                        } else if (spinnerStyle.f66150i && this.f66057b < 0) {
                            if (mo48233a(this.f65996B)) {
                                i6 = -this.f66057b;
                            } else {
                                i6 = 0;
                            }
                            i5 = Math.max(i6, 0);
                        }
                        measuredHeight3 -= i5;
                    }
                    view2.layout(i15, measuredHeight3, view2.getMeasuredWidth() + i15, view2.getMeasuredHeight() + measuredHeight3);
                }
            }
        }
    }
}
