package com.bytedance.android.livesdk.chatroom.p477a.p478a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.barrage.p4467a.AbstractC87048a;
import com.p2082ss.ugc.live.barrage.p4467a.C87056b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.a.a.a */
public final class C7266a extends C87056b {

    /* renamed from: e */
    public static final C7267a f18074e = new C7267a((byte) 0);

    /* renamed from: a */
    public int f18075a = 204;

    /* renamed from: b */
    public float f18076b = 1.0f;

    /* renamed from: c */
    public float f18077c;

    /* renamed from: d */
    public double f18078d;

    /* renamed from: l */
    private final AbstractC89244h f18079l = C89250i.m154773a((AbstractC89171a) C7268b.f18080a);

    static {
        Covode.recordClassIndex(8017);
    }

    /* renamed from: e */
    private final Matrix m15181e() {
        return (Matrix) this.f18079l.getValue();
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.a.a.a$a */
    public static final class C7267a {
        static {
            Covode.recordClassIndex(8018);
        }

        private C7267a() {
        }

        public /* synthetic */ C7267a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.a.a.a$b */
    static final class C7268b extends AbstractC89220m implements AbstractC89171a<Matrix> {

        /* renamed from: a */
        public static final C7268b f18080a = new C7268b();

        static {
            Covode.recordClassIndex(8019);
        }

        C7268b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Matrix invoke() {
            return new Matrix();
        }
    }

    @Override // com.p2082ss.ugc.live.barrage.p4467a.AbstractC87048a
    /* renamed from: a */
    public final void mo13468a(Canvas canvas) {
        Bitmap b;
        C89219l.m154721d(canvas, "");
        mo140672a().setAlpha(this.f18075a);
        RectF rectF = this.f196257j;
        float width = rectF.width();
        float height = rectF.height();
        float f = width / 2.0f;
        float f2 = height / 2.0f;
        m15181e().setRotate(this.f18077c, f, f2);
        Matrix e = m15181e();
        float f3 = this.f18076b;
        e.postScale(f3, f3);
        m15181e().postTranslate((rectF.left + ((width * 0.5f) * (1.0f - this.f18076b))) - f, (rectF.top + ((height * 0.5f) * (1.0f - this.f18076b))) - f2);
        Matrix e2 = m15181e();
        C89219l.m154719c(canvas, "");
        C89219l.m154719c(e2, "");
        if (!(!C89219l.m154714a(this.f196258k, AbstractC87048a.AbstractC87049a.C87053d.f196262a)) && (b = mo140675b()) != null && !b.isRecycled()) {
            canvas.drawBitmap(mo140675b(), e2, mo140672a());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7266a(Bitmap bitmap, double d) {
        super(bitmap);
        C89219l.m154721d(bitmap, "");
        this.f18078d = d;
    }
}
