package com.p2082ss.android.ugc.aweme.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import android.util.TypedValue;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.lancet.C58030k;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.views.p */
public final class C81460p extends RemoteImageView {

    /* renamed from: a */
    public static final float f182110a;

    /* renamed from: b */
    public static final C81461a f182111b = new C81461a((byte) 0);

    /* renamed from: c */
    private final AbstractC89244h f182112c;

    /* renamed from: d */
    private final AbstractC89244h f182113d;

    /* renamed from: e */
    private final boolean f182114e;

    /* renamed from: f */
    private final Float f182115f;

    private final Path getCirclePath() {
        return (Path) this.f182112c.getValue();
    }

    private final Path getCutoutCirclePath() {
        return (Path) this.f182113d.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.views.p$a */
    public static final class C81461a {
        static {
            Covode.recordClassIndex(94833);
        }

        private C81461a() {
        }

        public /* synthetic */ C81461a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.p$b */
    static final class C81462b extends AbstractC89220m implements AbstractC89171a<Path> {

        /* renamed from: a */
        public static final C81462b f182116a = new C81462b();

        static {
            Covode.recordClassIndex(94834);
        }

        C81462b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Path invoke() {
            return new Path();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.p$c */
    static final class C81463c extends AbstractC89220m implements AbstractC89171a<Path> {

        /* renamed from: a */
        public static final C81463c f182117a = new C81463c();

        static {
            Covode.recordClassIndex(94835);
        }

        C81463c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Path invoke() {
            return new Path();
        }
    }

    @Override // com.facebook.drawee.view.C24262c
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C58030k.m104850a(this);
    }

    static {
        Covode.recordClassIndex(94832);
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        f182110a = TypedValue.applyDimension(1, 1.0f, system.getDisplayMetrics());
    }

    @Override // com.facebook.drawee.view.C24262c
    public final void onDraw(Canvas canvas) {
        if (canvas != null) {
            canvas.clipPath(getCirclePath());
        }
        if (this.f182114e && canvas != null) {
            canvas.clipPath(getCutoutCirclePath(), Region.Op.DIFFERENCE);
        }
        super.onDraw(canvas);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C81460p(Context context, Float f) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        boolean z = false;
        this.f182115f = f;
        this.f182112c = C89250i.m154773a((AbstractC89171a) C81462b.f182116a);
        this.f182113d = C89250i.m154773a((AbstractC89171a) C81463c.f182117a);
        this.f182114e = f != null ? true : z;
    }

    @Override // com.facebook.drawee.view.C24262c
    public final void onMeasure(int i, int i2) {
        float measuredWidth;
        super.onMeasure(i, i2);
        int i3 = 1;
        if (C0792v.m2768e(this) == 1) {
            i3 = -1;
        }
        float measuredWidth2 = ((float) getMeasuredWidth()) * 0.5f;
        float f = (float) i3;
        Float f2 = this.f182115f;
        if (f2 != null) {
            measuredWidth = f2.floatValue();
        } else {
            measuredWidth = 0.7f * ((float) getMeasuredWidth());
        }
        getCirclePath().reset();
        getCirclePath().addCircle(measuredWidth2, measuredWidth2, measuredWidth2, Path.Direction.CW);
        getCutoutCirclePath().reset();
        getCutoutCirclePath().addCircle((f * measuredWidth) + measuredWidth2, measuredWidth2, f182110a + measuredWidth2, Path.Direction.CW);
    }

    public /* synthetic */ C81460p(Context context, Float f, byte b) {
        this(context, f);
    }
}
