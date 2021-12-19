package com.p2082ss.android.ugc.gamora.editor.progressbar;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewConfiguration;
import com.bytedance.covode.number.Covode;
import com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h;
import com.p2082ss.android.ugc.asve.C31012a;
import com.p2082ss.android.ugc.aweme.adaptation.C33398a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.property.C65335ae;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.tools.utils.p4361a.C84882b;
import com.p2082ss.android.ugc.tools.utils.p4361a.C84885c;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.progressbar.c */
public final class C82532c implements GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a {

    /* renamed from: a */
    public int f184585a;

    /* renamed from: b */
    public final AbstractC82503a f184586b;

    /* renamed from: c */
    public int f184587c;

    /* renamed from: d */
    private boolean f184588d;

    /* renamed from: e */
    private long f184589e;

    /* renamed from: f */
    private long f184590f;

    /* renamed from: g */
    private float f184591g;

    /* renamed from: h */
    private float f184592h;

    /* renamed from: i */
    private boolean f184593i;

    /* renamed from: j */
    private final int f184594j;

    /* renamed from: k */
    private final AbstractC89244h f184595k = C89250i.m154773a((AbstractC89171a) C82536c.f184607a);

    /* renamed from: l */
    private final AbstractC89244h f184596l = C89250i.m154773a((AbstractC89171a) C82538e.f184609a);

    /* renamed from: m */
    private final AbstractC89244h f184597m = C89250i.m154773a((AbstractC89171a) C82542h.f184613a);

    /* renamed from: n */
    private final AbstractC89244h f184598n = C89250i.m154773a((AbstractC89171a) C82541g.f184612a);

    /* renamed from: o */
    private final AbstractC89244h f184599o = C89250i.m154773a((AbstractC89171a) C82537d.f184608a);

    /* renamed from: p */
    private final AbstractC89244h f184600p = C89250i.m154773a((AbstractC89171a) C82533a.f184604a);

    /* renamed from: q */
    private final AbstractC89244h f184601q = C89250i.m154773a((AbstractC89171a) C82543i.f184614a);

    /* renamed from: r */
    private final AbstractC89244h f184602r = C89250i.m154773a((AbstractC89171a) new C82539f(this));

    /* renamed from: s */
    private final AbstractC89244h f184603s = C89250i.m154773a((AbstractC89171a) new C82534b(this));

    static {
        Covode.recordClassIndex(96376);
    }

    /* renamed from: c */
    private final boolean m142655c() {
        return ((Boolean) this.f184595k.getValue()).booleanValue();
    }

    /* renamed from: d */
    private final Handler m142656d() {
        return (Handler) this.f184596l.getValue();
    }

    /* renamed from: e */
    private int m142657e() {
        return ((Number) this.f184597m.getValue()).intValue();
    }

    /* renamed from: f */
    private final Runnable m142658f() {
        return (Runnable) this.f184602r.getValue();
    }

    /* renamed from: g */
    private final Runnable m142659g() {
        return (Runnable) this.f184603s.getValue();
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
        return true;
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
    public final boolean mo23395a(C84882b bVar, float f, float f2) {
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

    /* renamed from: com.ss.android.ugc.gamora.editor.progressbar.c$b */
    static final class C82534b extends AbstractC89220m implements AbstractC89171a<Runnable> {

        /* renamed from: a */
        final /* synthetic */ C82532c f184605a;

        static {
            Covode.recordClassIndex(96378);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82534b(C82532c cVar) {
            super(0);
            this.f184605a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Runnable invoke() {
            return new Runnable(this) {
                /* class com.p2082ss.android.ugc.gamora.editor.progressbar.C82532c.C82534b.RunnableC825351 */

                /* renamed from: a */
                final /* synthetic */ C82534b f184606a;

                static {
                    Covode.recordClassIndex(96379);
                }

                {
                    this.f184606a = r1;
                }

                public final void run() {
                    this.f184606a.f184605a.f184586b.mo127586a(-1);
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.progressbar.c$f */
    static final class C82539f extends AbstractC89220m implements AbstractC89171a<Runnable> {

        /* renamed from: a */
        final /* synthetic */ C82532c f184610a;

        static {
            Covode.recordClassIndex(96383);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82539f(C82532c cVar) {
            super(0);
            this.f184610a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Runnable invoke() {
            return new Runnable(this) {
                /* class com.p2082ss.android.ugc.gamora.editor.progressbar.C82532c.C82539f.RunnableC825401 */

                /* renamed from: a */
                final /* synthetic */ C82539f f184611a;

                static {
                    Covode.recordClassIndex(96384);
                }

                {
                    this.f184611a = r1;
                }

                public final void run() {
                    this.f184611a.f184610a.f184586b.mo127586a(this.f184611a.f184610a.f184585a);
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.progressbar.c$a */
    static final class C82533a extends AbstractC89220m implements AbstractC89171a<Float> {

        /* renamed from: a */
        public static final C82533a f184604a = new C82533a();

        static {
            Covode.recordClassIndex(96377);
        }

        C82533a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Float invoke() {
            return Float.valueOf(C84912r.m145929a(70.0f));
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.progressbar.c$c */
    static final class C82536c extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C82536c f184607a = new C82536c();

        static {
            Covode.recordClassIndex(96380);
        }

        C82536c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(C65335ae.m117018c());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.progressbar.c$d */
    static final class C82537d extends AbstractC89220m implements AbstractC89171a<Float> {

        /* renamed from: a */
        public static final C82537d f184608a = new C82537d();

        static {
            Covode.recordClassIndex(96381);
        }

        C82537d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Float invoke() {
            return Float.valueOf(C84912r.m145929a(50.0f));
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.progressbar.c$e */
    static final class C82538e extends AbstractC89220m implements AbstractC89171a<Handler> {

        /* renamed from: a */
        public static final C82538e f184609a = new C82538e();

        static {
            Covode.recordClassIndex(96382);
        }

        C82538e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.progressbar.c$g */
    static final class C82541g extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C82541g f184612a = new C82541g();

        static {
            Covode.recordClassIndex(96385);
        }

        C82541g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C84912r.m145933b(C63247i.f143610a));
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.progressbar.c$h */
    static final class C82542h extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C82542h f184613a = new C82542h();

        static {
            Covode.recordClassIndex(96386);
        }

        C82542h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C84912r.m145931a(C63247i.f143610a));
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.progressbar.c$i */
    static final class C82543i extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C82543i f184614a = new C82543i();

        static {
            Covode.recordClassIndex(96387);
        }

        C82543i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C33398a.m68487c());
        }
    }

    @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a
    /* renamed from: c */
    public final boolean mo23404c(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        if (this.f184590f - this.f184589e >= 150) {
            return true;
        }
        this.f184586b.mo127592e();
        return true;
    }

    @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a
    /* renamed from: e */
    public final void mo23381e(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        int i = 1;
        if (action == 0) {
            this.f184589e = System.currentTimeMillis();
            this.f184591g = x;
            this.f184592h = y;
            this.f184593i = false;
            this.f184588d = false;
            if (m142655c()) {
                if (motionEvent.getX() >= ((float) (m142657e() / 2))) {
                    i = 0;
                }
                this.f184585a = i;
                m142656d().postDelayed(m142658f(), 300);
            }
        } else if (action == 1) {
            this.f184590f = System.currentTimeMillis();
            if (m142655c()) {
                m142656d().removeCallbacks(m142658f());
                if (this.f184590f - this.f184589e > 150 && !this.f184588d) {
                    m142656d().post(m142659g());
                }
            }
            if (C82544d.m142680b() && this.f184593i) {
                this.f184586b.mo127590b(3, 0);
            }
        } else if (action != 2 || !m142655c()) {
        } else {
            if (Math.abs(x - this.f184591g) > 50.0f || Math.abs(y - this.f184592h) > 50.0f) {
                m142656d().removeCallbacks(m142658f());
                m142656d().post(m142659g());
                this.f184588d = true;
            }
        }
    }

    public C82532c(AbstractC82503a aVar, int i) {
        C89219l.m154721d(aVar, "");
        this.f184586b = aVar;
        this.f184587c = i;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(C31012a.m63726b());
        C89219l.m154716b(viewConfiguration, "");
        this.f184594j = viewConfiguration.getScaledPagingTouchSlop();
    }

    @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a
    /* renamed from: a */
    public final boolean mo23392a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C89219l.m154721d(motionEvent, "");
        C89219l.m154721d(motionEvent2, "");
        if (!C82544d.m142680b()) {
            return false;
        }
        return this.f184593i;
    }

    @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a
    /* renamed from: b */
    public final boolean mo23401b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int i;
        float f3;
        float floatValue;
        float x;
        C89219l.m154721d(motionEvent, "");
        C89219l.m154721d(motionEvent2, "");
        if (!C82544d.m142680b()) {
            return false;
        }
        if (this.f184593i) {
            if (C80471gb.m139482a()) {
                x = 100.0f - ((motionEvent2.getX() * 100.0f) / ((float) m142657e()));
            } else {
                x = (motionEvent2.getX() * 100.0f) / ((float) m142657e());
            }
            this.f184586b.mo127590b(2, (int) x);
            return true;
        }
        int x2 = (int) motionEvent.getX();
        int x3 = (int) motionEvent2.getX();
        int y = (int) motionEvent2.getY();
        if (this.f184587c < 0) {
            this.f184587c = ((Number) this.f184598n.getValue()).intValue() - ((Number) this.f184601q.getValue()).intValue();
        }
        int i2 = this.f184587c;
        if (C65335ae.m117019d()) {
            f3 = (float) i2;
            floatValue = ((Number) this.f184599o.getValue()).floatValue();
        } else if (C65335ae.m117020e()) {
            f3 = (float) i2;
            floatValue = ((Number) this.f184600p.getValue()).floatValue();
        } else {
            i = i2;
            if (i < i2 || y > i2 || y < i || Math.abs(x2 - x3) < this.f184594j) {
                return false;
            }
            this.f184586b.mo127590b(1, 0);
            this.f184593i = true;
            return true;
        }
        i = (int) (f3 - floatValue);
        if (i < i2) {
        }
        return false;
    }
}
