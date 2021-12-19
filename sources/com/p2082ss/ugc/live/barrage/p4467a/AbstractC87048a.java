package com.p2082ss.ugc.live.barrage.p4467a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.ugc.live.barrage.a.a */
public abstract class AbstractC87048a {

    /* renamed from: f */
    static final /* synthetic */ AbstractC89286i[] f196252f = {new C89232y(C89204ab.m154669a(AbstractC87048a.class), "paint", "getPaint()Landroid/graphics/Paint;")};

    /* renamed from: a */
    private final AbstractC89244h f196253a = C89250i.m154773a((AbstractC89171a) C87055c.f196263a);

    /* renamed from: g */
    public AbstractC87054b f196254g;

    /* renamed from: h */
    public boolean f196255h;

    /* renamed from: i */
    public boolean f196256i;

    /* renamed from: j */
    public final RectF f196257j = new RectF(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: k */
    public volatile AbstractC87049a f196258k;

    /* renamed from: com.ss.ugc.live.barrage.a.a$b */
    public interface AbstractC87054b {
        static {
            Covode.recordClassIndex(102820);
        }

        /* renamed from: a */
        void mo13475a();
    }

    /* renamed from: a */
    public final Paint mo140672a() {
        return (Paint) this.f196253a.getValue();
    }

    /* renamed from: b */
    public abstract Bitmap mo140675b();

    /* renamed from: c */
    public void mo140676c() {
    }

    /* renamed from: d */
    public void mo140677d() {
    }

    /* renamed from: com.ss.ugc.live.barrage.a.a$a */
    public static abstract class AbstractC87049a {
        static {
            Covode.recordClassIndex(102815);
        }

        private AbstractC87049a() {
        }

        /* renamed from: com.ss.ugc.live.barrage.a.a$a$a */
        public static final class C87050a extends AbstractC87049a {

            /* renamed from: a */
            public static final C87050a f196259a = new C87050a();

            private C87050a() {
                super((byte) 0);
            }

            static {
                Covode.recordClassIndex(102816);
            }
        }

        /* renamed from: com.ss.ugc.live.barrage.a.a$a$b */
        public static final class C87051b extends AbstractC87049a {

            /* renamed from: a */
            public static final C87051b f196260a = new C87051b();

            private C87051b() {
                super((byte) 0);
            }

            static {
                Covode.recordClassIndex(102817);
            }
        }

        /* renamed from: com.ss.ugc.live.barrage.a.a$a$c */
        public static final class C87052c extends AbstractC87049a {

            /* renamed from: a */
            public static final C87052c f196261a = new C87052c();

            private C87052c() {
                super((byte) 0);
            }

            static {
                Covode.recordClassIndex(102818);
            }
        }

        /* renamed from: com.ss.ugc.live.barrage.a.a$a$d */
        public static final class C87053d extends AbstractC87049a {

            /* renamed from: a */
            public static final C87053d f196262a = new C87053d();

            private C87053d() {
                super((byte) 0);
            }

            static {
                Covode.recordClassIndex(102819);
            }
        }

        public /* synthetic */ AbstractC87049a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.ugc.live.barrage.a.a$c */
    static final class C87055c extends AbstractC89220m implements AbstractC89171a<Paint> {

        /* renamed from: a */
        public static final C87055c f196263a = new C87055c();

        static {
            Covode.recordClassIndex(102821);
        }

        C87055c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Paint invoke() {
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setDither(true);
            paint.setAntiAlias(true);
            return paint;
        }
    }

    static {
        Covode.recordClassIndex(102814);
    }

    /* renamed from: a */
    public final void mo140673a(AbstractC87049a aVar) {
        this.f196258k = aVar;
        m150765b(aVar);
    }

    /* renamed from: a */
    public final boolean mo140674a(MotionEvent motionEvent) {
        C89219l.m154719c(motionEvent, "");
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                return false;
            }
            AbstractC87054b bVar = this.f196254g;
            if (bVar != null) {
                bVar.mo13475a();
            }
        }
        return true;
    }

    /* renamed from: b */
    private final void m150765b(AbstractC87049a aVar) {
        if (C89219l.m154714a(aVar, AbstractC87049a.C87051b.f196260a)) {
            return;
        }
        if (C89219l.m154714a(aVar, AbstractC87049a.C87052c.f196261a)) {
            mo140676c();
        } else if (!C89219l.m154714a(aVar, AbstractC87049a.C87053d.f196262a) && C89219l.m154714a(aVar, AbstractC87049a.C87050a.f196259a)) {
            mo140677d();
        }
    }

    /* renamed from: a */
    public void mo13468a(Canvas canvas) {
        Bitmap b;
        C89219l.m154719c(canvas, "");
        if (!(!C89219l.m154714a(this.f196258k, AbstractC87049a.C87053d.f196262a)) && (b = mo140675b()) != null && !b.isRecycled()) {
            canvas.drawBitmap(mo140675b(), this.f196257j.left, this.f196257j.top, mo140672a());
        }
    }
}
