package com.p2082ss.android.ugc.aweme.bullet.module.base.p2421a;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.web.SSWebView;
import com.bytedance.ies.bullet.service.base.C16614as;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28022o;
import com.google.gson.C28024q;
import com.google.gson.C28027t;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.p2282ad.p2285c.C33118a;
import com.p2082ss.android.ugc.aweme.utils.GsonHolder;
import com.p2082ss.android.ugc.aweme.utils.GsonProvider;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.base.a.a */
public final class C35216a implements SSWebView.AbstractC16470c {

    /* renamed from: a */
    public long f83183a;

    /* renamed from: b */
    public boolean f83184b;

    /* renamed from: c */
    public boolean f83185c;

    /* renamed from: d */
    public View.OnTouchListener f83186d;

    /* renamed from: e */
    private C35217a[] f83187e;

    /* renamed from: f */
    private boolean f83188f;

    /* renamed from: g */
    private final AbstractC89244h f83189g;

    /* renamed from: h */
    private SSWebView f83190h;

    static {
        Covode.recordClassIndex(42378);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.base.a.a$a */
    public static final class C35217a {
        @AbstractC27891c(mo46611a = "x")

        /* renamed from: a */
        public final double f83191a = Double.MIN_VALUE;
        @AbstractC27891c(mo46611a = "y")

        /* renamed from: b */
        public final double f83192b = Double.MIN_VALUE;
        @AbstractC27891c(mo46611a = "width")

        /* renamed from: c */
        public final double f83193c = Double.MAX_VALUE;
        @AbstractC27891c(mo46611a = "height")

        /* renamed from: d */
        public final double f83194d = Double.MAX_VALUE;

        static {
            Covode.recordClassIndex(42379);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C35217a)) {
                return false;
            }
            C35217a aVar = (C35217a) obj;
            return Double.compare(this.f83191a, aVar.f83191a) == 0 && Double.compare(this.f83192b, aVar.f83192b) == 0 && Double.compare(this.f83193c, aVar.f83193c) == 0 && Double.compare(this.f83194d, aVar.f83194d) == 0;
        }

        public final int hashCode() {
            return (((((m72109a(this.f83191a) * 31) + m72109a(this.f83192b)) * 31) + m72109a(this.f83193c)) * 31) + m72109a(this.f83194d);
        }

        public final String toString() {
            return "DisableInterceptRegion(x=" + this.f83191a + ", y=" + this.f83192b + ", width=" + this.f83193c + ", height=" + this.f83194d + ")";
        }

        private C35217a() {
        }

        /* renamed from: a */
        private static int m72109a(double d) {
            long doubleToLongBits = Double.doubleToLongBits(d);
            return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.base.a.a$b */
    static final class C35218b extends AbstractC89220m implements AbstractC89171a<GestureDetector> {

        /* renamed from: a */
        final /* synthetic */ C35216a f83195a;

        static {
            Covode.recordClassIndex(42380);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35218b(C35216a aVar) {
            super(0);
            this.f83195a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ GestureDetector invoke() {
            GestureDetector gestureDetector = new GestureDetector(C17867d.m33078a(), new GestureDetector.SimpleOnGestureListener(this) {
                /* class com.p2082ss.android.ugc.aweme.bullet.module.base.p2421a.C35216a.C35218b.C352191 */

                /* renamed from: a */
                final /* synthetic */ C35218b f83196a;

                static {
                    Covode.recordClassIndex(42381);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f83196a = r1;
                }

                public final boolean onSingleTapUp(MotionEvent motionEvent) {
                    this.f83196a.f83195a.f83183a = System.currentTimeMillis();
                    return super.onSingleTapUp(motionEvent);
                }
            });
            gestureDetector.setIsLongpressEnabled(true);
            return gestureDetector;
        }
    }

    @Override // com.bytedance.ies.bullet.kit.web.SSWebView.AbstractC16470c
    /* renamed from: a */
    public final boolean mo26166a() {
        if (System.currentTimeMillis() - this.f83183a < ((long) this.f83190h.getTimeInterval())) {
            return true;
        }
        return false;
    }

    private C35216a(SSWebView sSWebView) {
        C89219l.m154721d(sSWebView, "");
        this.f83190h = sSWebView;
        this.f83184b = true;
        this.f83185c = false;
        this.f83186d = null;
        this.f83189g = C89250i.m154773a((AbstractC89171a) new C35218b(this));
    }

    @Override // com.bytedance.ies.bullet.kit.web.SSWebView.AbstractC16470c
    /* renamed from: a */
    public final boolean mo26168a(boolean z) {
        if (!this.f83185c) {
            throw new C16614as("An operation is not implemented");
        } else if (!this.f83184b || !z) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    public final void mo62106a(C33118a aVar) {
        String str;
        C89219l.m154721d(aVar, "");
        AbstractC28019l a = C28024q.m56139a(aVar.f78706b.toString());
        C89219l.m154716b(a, "");
        C28022o j = a.mo46789j();
        AbstractC28019l c = j.mo46803c("eventName");
        C35217a[] aVarArr = null;
        if (c != null) {
            str = c.mo46689c();
        } else {
            str = null;
        }
        if (C89219l.m154714a((Object) str, (Object) "disableIntercept")) {
            AbstractC28019l c2 = j.mo46803c("data");
            if (c2 != null) {
                try {
                    GsonProvider c3 = GsonHolder.m138943c();
                    C89219l.m154716b(c3, "");
                    aVarArr = (C35217a[]) c3.mo123620b().mo46667a(c2, C35217a[].class);
                } catch (C28027t unused) {
                }
            }
            this.f83187e = aVarArr;
        }
    }

    @Override // com.bytedance.ies.bullet.kit.web.SSWebView.AbstractC16470c
    /* renamed from: a */
    public final boolean mo26167a(MotionEvent motionEvent) {
        boolean z;
        C89219l.m154721d(motionEvent, "");
        if (motionEvent.getActionMasked() == 0) {
            this.f83188f = false;
            int[] iArr = new int[2];
            this.f83190h.getLocationInWindow(iArr);
            int b = C34728n.m70948b((double) (motionEvent.getRawX() - ((float) iArr[0])));
            int b2 = C34728n.m70948b((double) (motionEvent.getRawY() - ((float) iArr[1])));
            C35217a[] aVarArr = this.f83187e;
            if (aVarArr != null) {
                int length = aVarArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    C35217a aVar = aVarArr[i];
                    double d = (double) b;
                    if (d >= aVar.f83191a && d <= aVar.f83191a + aVar.f83193c) {
                        double d2 = (double) b2;
                        if (d2 >= aVar.f83192b && d2 <= aVar.f83192b + aVar.f83194d) {
                            z = true;
                            break;
                        }
                    }
                    i++;
                }
                this.f83188f = z;
            }
            z = false;
            this.f83188f = z;
        }
        if (this.f83188f) {
            this.f83190h.requestDisallowInterceptTouchEvent(true);
        }
        if (this.f83190h.f39512a) {
            ((GestureDetector) this.f83189g.getValue()).onTouchEvent(motionEvent);
            View.OnTouchListener onTouchListener = this.f83186d;
            if (onTouchListener != null) {
                onTouchListener.onTouch(this.f83190h, motionEvent);
            }
        }
        if (!this.f83185c) {
            return SSWebView.AbstractC16470c.C16471a.m30567a(motionEvent);
        }
        if (this.f83184b) {
            this.f83190h.requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getAction() == 2) {
            return true;
        }
        return SSWebView.AbstractC16470c.C16471a.m30567a(motionEvent);
    }

    public /* synthetic */ C35216a(SSWebView sSWebView, byte b) {
        this(sSWebView);
    }
}
