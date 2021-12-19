package com.p2082ss.android.ugc.gamora.editor.filter.core.p4280a;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.covode.number.Covode;
import com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h;
import com.p2082ss.android.ugc.asve.C31012a;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50709q;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.p2987a.C50691c;
import com.p2082ss.android.ugc.tools.utils.p4361a.C84882b;
import com.p2082ss.android.ugc.tools.utils.p4361a.C84885c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.filter.core.a.b */
public final class C82207b implements GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a {

    /* renamed from: a */
    public float f183913a;

    /* renamed from: b */
    public boolean f183914b;

    /* renamed from: c */
    public boolean f183915c;

    /* renamed from: d */
    private final int f183916d;

    /* renamed from: e */
    private boolean f183917e;

    /* renamed from: f */
    private final C82201a f183918f;

    /* renamed from: g */
    private final View f183919g;

    static {
        Covode.recordClassIndex(96037);
    }

    @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a
    /* renamed from: a */
    public final boolean mo23389a() {
        return false;
    }

    @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a
    /* renamed from: a */
    public final boolean mo23390a(float f) {
        return false;
    }

    @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a
    /* renamed from: a */
    public final boolean mo23391a(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        return false;
    }

    @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a
    /* renamed from: a */
    public final boolean mo23393a(ScaleGestureDetector scaleGestureDetector) {
        C89219l.m154721d(scaleGestureDetector, "");
        return false;
    }

    @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a
    /* renamed from: a */
    public final boolean mo23394a(C84882b bVar) {
        C89219l.m154721d(bVar, "");
        return false;
    }

    @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a
    /* renamed from: a */
    public final boolean mo23396a(C84885c cVar) {
        C89219l.m154721d(cVar, "");
        return false;
    }

    @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a
    /* renamed from: b */
    public final void mo23397b(C84882b bVar) {
        C89219l.m154721d(bVar, "");
    }

    @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a
    /* renamed from: b */
    public final boolean mo23398b() {
        return false;
    }

    @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a
    /* renamed from: b */
    public final boolean mo23399b(float f) {
        return false;
    }

    @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a
    /* renamed from: b */
    public final boolean mo23400b(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        return false;
    }

    @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a
    /* renamed from: b */
    public final boolean mo23402b(ScaleGestureDetector scaleGestureDetector) {
        C89219l.m154721d(scaleGestureDetector, "");
        return false;
    }

    @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a
    /* renamed from: c */
    public final boolean mo23403c(float f) {
        return false;
    }

    @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a
    /* renamed from: c */
    public final boolean mo23404c(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        return false;
    }

    @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a
    /* renamed from: d */
    public final boolean mo23405d(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        return false;
    }

    @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a
    /* renamed from: f */
    public final boolean mo23406f(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        return false;
    }

    @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a
    /* renamed from: e */
    public final void mo23381e(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        if (!this.f183917e) {
            this.f183915c = false;
        } else {
            this.f183915c = true;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            this.f183917e = false;
        }
    }

    public C82207b(C82201a aVar, View view) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(view, "");
        this.f183918f = aVar;
        this.f183919g = view;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(C31012a.m63726b());
        C89219l.m154716b(viewConfiguration, "");
        this.f183916d = viewConfiguration.getScaledPagingTouchSlop();
    }

    @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a
    /* renamed from: a */
    public final boolean mo23395a(C84882b bVar, float f, float f2) {
        C89219l.m154721d(bVar, "");
        this.f183917e = true;
        return false;
    }

    @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a
    /* renamed from: b */
    public final boolean mo23401b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C89219l.m154721d(motionEvent, "");
        C89219l.m154721d(motionEvent2, "");
        int abs = (int) Math.abs(motionEvent.getX() - motionEvent2.getX());
        int abs2 = (int) Math.abs(motionEvent.getY() - motionEvent2.getY());
        if (abs <= this.f183916d || abs <= abs2 || this.f183914b) {
            return false;
        }
        float width = this.f183913a + (f / ((float) this.f183919g.getWidth()));
        this.f183913a = width;
        float min = Math.min(width, 1.0f);
        this.f183913a = min;
        float max = Math.max(min, -1.0f);
        this.f183913a = max;
        C82201a aVar = this.f183918f;
        if (!aVar.f183902e) {
            return false;
        }
        aVar.mo127393a(max);
        return true;
    }

    @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a
    /* renamed from: a */
    public final boolean mo23392a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        ValueAnimator ofFloat;
        float abs;
        float abs2;
        C89219l.m154721d(motionEvent, "");
        C89219l.m154721d(motionEvent2, "");
        boolean z = false;
        if (this.f183915c) {
            this.f183915c = false;
            if (!this.f183914b) {
                if (Math.abs(motionEvent.getX() - motionEvent2.getX()) > Math.abs(motionEvent.getY() - motionEvent2.getY())) {
                    C82201a aVar = this.f183918f;
                    float f3 = this.f183913a;
                    if (aVar.f183902e) {
                        int width = aVar.f183905h.mo23382a().getWidth();
                        AbstractC50709q f4 = aVar.f183907j.mo86071f();
                        if (Math.signum(f3) == Math.signum(f)) {
                            aVar.f183901d = aVar.f183900c;
                            ofFloat = ValueAnimator.ofFloat(f3, 0.0f);
                            C89219l.m154716b(ofFloat, "");
                            abs = (float) ((long) (((float) width) * Math.abs(f3)));
                            abs2 = Math.abs(f);
                        } else {
                            if (f >= 1.0E-5f) {
                                aVar.f183901d = C50691c.m94986a(f4, Math.max(0, aVar.mo127392a(f4) - 1));
                                ofFloat = ValueAnimator.ofFloat(f3, -1.0f);
                                C89219l.m154716b(ofFloat, "");
                            } else {
                                aVar.f183901d = C50691c.m94986a(f4, Math.min(C50691c.m94988a(f4).size() - 1, aVar.mo127392a(f4) + 1));
                                ofFloat = ValueAnimator.ofFloat(f3, 1.0f);
                                C89219l.m154716b(ofFloat, "");
                            }
                            abs = (float) ((long) (((float) width) * (1.0f - Math.abs(f3))));
                            abs2 = Math.abs(f);
                        }
                        long min = Math.min((long) (abs / ((abs2 / 1000.0f) / 2.0f)), 400L);
                        ofFloat.setInterpolator(new DecelerateInterpolator());
                        ofFloat.setDuration(min);
                        ofFloat.addUpdateListener(aVar.f183904g);
                        ofFloat.addListener(aVar.f183903f);
                        ofFloat.start();
                        z = true;
                    }
                }
                this.f183913a = 0.0f;
            }
        }
        return z;
    }
}
