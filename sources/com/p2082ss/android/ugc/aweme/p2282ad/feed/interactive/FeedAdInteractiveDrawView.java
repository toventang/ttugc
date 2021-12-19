package com.p2082ss.android.ugc.aweme.p2282ad.feed.interactive;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.aweme.ad.feed.interactive.FeedAdInteractiveDrawView */
public final class FeedAdInteractiveDrawView extends C33298c {

    /* renamed from: a */
    public static final C33291a f79065a = new C33291a((byte) 0);

    /* renamed from: b */
    private final Paint f79066b;

    /* renamed from: c */
    private final Path f79067c;

    /* renamed from: d */
    private final PathMeasure f79068d;

    /* renamed from: e */
    private float f79069e;

    /* renamed from: f */
    private float f79070f;

    /* renamed from: g */
    private float f79071g;

    /* renamed from: h */
    private boolean f79072h;

    /* renamed from: i */
    private boolean f79073i;

    static {
        Covode.recordClassIndex(40120);
    }

    public FeedAdInteractiveDrawView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.interactive.FeedAdInteractiveDrawView$a */
    public static final class C33291a {
        static {
            Covode.recordClassIndex(40121);
        }

        private C33291a() {
        }

        public /* synthetic */ C33291a(byte b) {
            this();
        }
    }

    /* renamed from: b */
    private final void m68241b() {
        this.f79072h = false;
        this.f79073i = false;
        this.f79067c.reset();
    }

    private final float getPathLength() {
        this.f79068d.setPath(this.f79067c, false);
        return this.f79068d.getLength();
    }

    /* renamed from: a */
    private final boolean m68240a() {
        if (!C89271h.m154767a(getCoreAreaXRange(), this.f79070f) || !C89271h.m154767a(getCoreAreaYRange(), this.f79071g)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        if (canvas != null) {
            canvas.drawColor(0);
            canvas.drawPath(this.f79067c, this.f79066b);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00cc, code lost:
        if (r6 <= 150.0d) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00de, code lost:
        if (r6 <= 330.0d) goto L_0x008b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
        // Method dump skipped, instructions count: 327
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p2282ad.feed.interactive.FeedAdInteractiveDrawView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private /* synthetic */ FeedAdInteractiveDrawView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FeedAdInteractiveDrawView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        Paint paint = new Paint();
        this.f79066b = paint;
        this.f79067c = new Path();
        this.f79068d = new PathMeasure();
        paint.setColor(-1);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth((float) C34728n.m70946a(4.0d));
    }
}
