package com.p2082ss.android.ugc.aweme.canvas;

import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.bytedance.covode.number.Covode;
import com.bytedance.p969f.p970a.p971a.p972a.AbstractC14537a;
import com.p2082ss.android.ugc.aweme.canvas.C35391l;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45920e;
import com.p2082ss.android.ugc.tools.utils.p4361a.C84882b;
import com.p2082ss.android.ugc.tools.utils.p4361a.C84885c;
import com.p2082ss.android.vesdk.VESize;
import com.p2082ss.android.vesdk.filterparam.VEVideoTransformFilterParam;
import java.util.HashMap;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.canvas.w */
public final class C35412w extends AbstractC14537a {

    /* renamed from: a */
    boolean f83552a = true;

    /* renamed from: b */
    VESize f83553b;

    /* renamed from: c */
    public boolean f83554c;

    /* renamed from: d */
    public boolean f83555d;

    /* renamed from: e */
    public boolean f83556e;

    /* renamed from: f */
    public boolean f83557f;

    /* renamed from: g */
    public boolean f83558g;

    /* renamed from: h */
    public int f83559h;

    /* renamed from: i */
    public CanvasVideoData f83560i;

    /* renamed from: j */
    private int f83561j;

    /* renamed from: k */
    private final HashMap<Integer, PointF> f83562k = new HashMap<>();

    /* renamed from: l */
    private C89378p<Float, Float> f83563l;

    /* renamed from: m */
    private boolean f83564m;

    /* renamed from: n */
    private boolean f83565n;

    /* renamed from: o */
    private boolean f83566o;

    /* renamed from: p */
    private final C35391l f83567p;

    /* renamed from: q */
    private final AbstractC89172b<Boolean, C89391z> f83568q;

    static {
        Covode.recordClassIndex(42586);
    }

    /* renamed from: e */
    private final void m72432e() {
        this.f83554c = true;
        this.f83555d = true;
    }

    /* renamed from: d */
    private final boolean m72431d() {
        if (this.f83561j < 2 || !this.f83552a) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo62318c() {
        this.f83554c = false;
        this.f83562k.clear();
        this.f83566o = false;
    }

    @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
    /* renamed from: b */
    public final void mo23397b(C84882b bVar) {
        super.mo23397b(bVar);
        this.f83565n = false;
    }

    @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
    /* renamed from: a */
    public final boolean mo23396a(C84885c cVar) {
        if (!m72431d() || !this.f83557f) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
    /* renamed from: b */
    public final boolean mo23399b(float f) {
        if (!m72431d() || !this.f83557f) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
    /* renamed from: c */
    public final boolean mo23403c(float f) {
        if (!m72431d() || !this.f83556e) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
    /* renamed from: b */
    public final boolean mo23402b(ScaleGestureDetector scaleGestureDetector) {
        if (!m72431d() || !this.f83556e) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
    /* renamed from: a */
    public final boolean mo23390a(float f) {
        float degrees = (float) Math.toDegrees((double) f);
        if (!m72431d() || !this.f83557f) {
            return false;
        }
        if (Math.abs(degrees) < 10.0f && degrees != 0.0f) {
            m72432e();
            C35391l lVar = this.f83567p;
            float f2 = -degrees;
            if (lVar.mo62309a()) {
                AbstractC45920e eVar = lVar.f83498a;
                if (eVar != null && 4 == eVar.mo77313a(lVar.mo62311c(), true)) {
                    f2 = eVar.mo77312a(f2);
                }
                C35391l.C35392a b = lVar.mo62310b();
                b.f83505a += f2;
                C35390k kVar = lVar.f83499b;
                int i = (int) b.f83505a;
                if (kVar.mo62307a()) {
                    int i2 = i % 360;
                    if (i2 < 0) {
                        i2 += 360;
                    }
                    kVar.mo62308b().degree = i2;
                    kVar.f83496d.setValue(kVar.mo62308b());
                }
            }
        }
        return true;
    }

    @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
    /* renamed from: a */
    public final boolean mo23393a(ScaleGestureDetector scaleGestureDetector) {
        if (scaleGestureDetector == null) {
            return false;
        }
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        if (!m72431d() || !this.f83556e) {
            return false;
        }
        if (scaleFactor == 1.0f) {
            return true;
        }
        m72432e();
        C35391l lVar = this.f83567p;
        if (!lVar.mo62309a()) {
            return true;
        }
        C35391l.C35392a b = lVar.mo62310b();
        b.f83506b = Math.min(Math.max(b.f83506b * scaleFactor, lVar.f83501d), lVar.f83502e);
        C35390k kVar = lVar.f83499b;
        float f = b.f83506b;
        if (!kVar.mo62307a()) {
            return true;
        }
        kVar.mo62308b().scaleFactor = f;
        kVar.f83496d.setValue(kVar.mo62308b());
        return true;
    }

    @Override // com.bytedance.p969f.p970a.p971a.p972a.AbstractC14537a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
    /* renamed from: e */
    public final void mo23381e(MotionEvent motionEvent) {
        if (motionEvent != null) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked == 5) {
                                this.f83561j++;
                                this.f83562k.put(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())), new PointF(motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex())));
                                return;
                            } else if (actionMasked == 6) {
                                this.f83561j--;
                                return;
                            } else {
                                return;
                            }
                        }
                    } else if (this.f83554c) {
                        int pointerCount = motionEvent.getPointerCount();
                        for (int i = 0; i < pointerCount; i++) {
                            PointF pointF = this.f83562k.get(Integer.valueOf(motionEvent.getPointerId(i)));
                            if (pointF != null) {
                                if (Math.sqrt(Math.pow((double) (pointF.x - motionEvent.getX(i)), 2.0d) + Math.pow((double) (pointF.y - motionEvent.getY(i)), 2.0d)) > 5.0d) {
                                    if (!this.f83566o) {
                                        this.f83568q.invoke(false);
                                        this.f83566o = true;
                                        C89219l.m154721d("hide panel", "");
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                        return;
                    } else {
                        return;
                    }
                }
                this.f83561j = 0;
                C89219l.m154721d("reset", "");
                if (this.f83554c) {
                    AbstractC45920e eVar = this.f83567p.f83498a;
                    if (eVar != null) {
                        eVar.mo77320b();
                    }
                    this.f83568q.invoke(true);
                }
                mo62318c();
                return;
            }
            this.f83561j = 1;
            this.f83562k.put(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())), new PointF(motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex())));
        }
    }

    @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
    /* renamed from: a */
    public final boolean mo23394a(C84882b bVar) {
        PointF pointF;
        boolean z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        if (bVar != null) {
            PointF pointF2 = bVar.f189709i;
            if (this.f83561j >= this.f83559h && this.f83552a && this.f83558g && this.f83564m) {
                if (this.f83554c || pointF2.x >= 1.0f || pointF2.y >= 1.0f) {
                    m72432e();
                    C35391l lVar = this.f83567p;
                    float f = pointF2.x;
                    float f2 = pointF2.y;
                    if (lVar.mo62309a()) {
                        AbstractC45920e eVar = lVar.f83498a;
                        if (eVar == null || 3 != eVar.mo77313a(lVar.mo62311c(), false)) {
                            pointF = new PointF(f, f2);
                        } else {
                            PointF[] c = lVar.mo62311c();
                            for (PointF pointF3 : c) {
                                pointF3.x += f;
                                pointF3.y += f2;
                            }
                            pointF = eVar.mo77316a(c, f, f2);
                        }
                        lVar.mo62310b().f83508d.offset(pointF.x, pointF.y);
                        C35390k kVar = lVar.f83499b;
                        float f3 = pointF.x;
                        float f4 = pointF.y;
                        if (kVar.mo62307a()) {
                            VEVideoTransformFilterParam b = kVar.mo62308b();
                            float f5 = b.transX;
                            VESize vESize = kVar.f83494b;
                            if (vESize == null) {
                                C89219l.m154710a("veSize");
                            }
                            b.transX = f5 + (f3 / ((float) vESize.width));
                            VEVideoTransformFilterParam b2 = kVar.mo62308b();
                            float f6 = b2.transY;
                            VESize vESize2 = kVar.f83494b;
                            if (vESize2 == null) {
                                C89219l.m154710a("veSize");
                            }
                            b2.transY = f6 + (f4 / ((float) vESize2.height));
                            kVar.f83496d.setValue(kVar.mo62308b());
                        }
                    }
                }
                z = true;
            }
        }
        this.f83565n = z;
        return z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.b<? super java.lang.Boolean, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C35412w(C35391l lVar, AbstractC89172b<? super Boolean, C89391z> bVar) {
        C89219l.m154721d(lVar, "");
        C89219l.m154721d(bVar, "");
        this.f83567p = lVar;
        this.f83568q = bVar;
        Float valueOf = Float.valueOf(0.0f);
        this.f83563l = C89387v.m154943a(valueOf, valueOf);
        this.f83556e = true;
        this.f83558g = true;
        this.f83559h = 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ec, code lost:
        if (r13 <= r3) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x010e, code lost:
        if (r0 == null) goto L_0x0110;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0131  */
    @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo23395a(com.p2082ss.android.ugc.tools.utils.p4361a.C84882b r16, float r17, float r18) {
        /*
        // Method dump skipped, instructions count: 325
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.canvas.C35412w.mo23395a(com.ss.android.ugc.tools.utils.a.b, float, float):boolean");
    }

    @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
    /* renamed from: b */
    public final boolean mo23401b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f83565n) {
            return true;
        }
        return super.mo23401b(motionEvent, motionEvent2, f, f2);
    }
}
