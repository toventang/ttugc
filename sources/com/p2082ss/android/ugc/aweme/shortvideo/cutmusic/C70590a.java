package com.p2082ss.android.ugc.aweme.shortvideo.cutmusic;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.shortvideo.C70625d;
import com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70612k;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.a */
public final class C70590a extends View {

    /* renamed from: a */
    public C70595d f157954a;

    /* renamed from: b */
    float f157955b;

    /* renamed from: c */
    int f157956c;

    /* renamed from: d */
    int f157957d;

    /* renamed from: e */
    private Paint f157958e;

    /* renamed from: f */
    private int f157959f;

    /* renamed from: g */
    private int f157960g;

    /* renamed from: h */
    private C70625d f157961h;

    /* renamed from: i */
    private RectF f157962i;

    static {
        Covode.recordClassIndex(83056);
    }

    /* access modifiers changed from: protected */
    public final int getMHeight() {
        return this.f157960g;
    }

    /* access modifiers changed from: protected */
    public final Paint getMPaint() {
        return this.f157958e;
    }

    /* access modifiers changed from: protected */
    public final C70625d getMusicWaveBean() {
        return this.f157961h;
    }

    public final int getViewWidth() {
        return this.f157959f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.a$a */
    public static final class RunnableC70591a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C70590a f157963a;

        /* renamed from: b */
        final /* synthetic */ C70625d f157964b;

        static {
            Covode.recordClassIndex(83057);
        }

        RunnableC70591a(C70590a aVar, C70625d dVar) {
            this.f157963a = aVar;
            this.f157964b = dVar;
        }

        public final void run() {
            if (this.f157963a.f157954a != null) {
                this.f157963a.f157954a.mo111395a(this.f157964b.getMusicWavePointArray());
                this.f157963a.invalidate();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void setMHeight(int i) {
        this.f157960g = i;
    }

    /* access modifiers changed from: protected */
    public final void setMusicWaveBean(C70625d dVar) {
        this.f157961h = dVar;
    }

    public final void setProgressMaxWidth(int i) {
        this.f157957d = i;
    }

    public final void setViewWidth(int i) {
        this.f157959f = i;
    }

    /* access modifiers changed from: protected */
    public final void setMPaint(Paint paint) {
        C89219l.m154721d(paint, "");
        this.f157958e = paint;
    }

    public final void setAudioWaveViewData(C70625d dVar) {
        if (dVar != null) {
            this.f157961h = dVar;
            post(new RunnableC70591a(this, dVar));
        }
    }

    public final void setColor(int i) {
        this.f157958e.setColor(i);
        invalidate();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C70590a(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(5948);
        this.f157962i = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{16843173}, 0, 0);
        C89219l.m154716b(obtainStyledAttributes, "");
        int color = obtainStyledAttributes.getColor(0, -16777216);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.f157958e = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f157958e.setColor(color);
        C70595d dVar = new C70595d();
        this.f157954a = dVar;
        dVar.mo111393a(context);
        this.f157954a.f157978i = false;
        MethodCollector.m26664o(5948);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int i;
        C89219l.m154721d(canvas, "");
        canvas.save();
        this.f157954a.mo111394a(canvas);
        canvas.restore();
        canvas.save();
        int i2 = this.f157956c;
        this.f157962i.set((float) i2, 0.0f, ((float) i2) + (this.f157955b * ((float) getWidth())), (float) getHeight());
        canvas.clipRect(this.f157962i);
        C70595d dVar = this.f157954a;
        Paint paint = this.f157958e;
        C89219l.m154721d(canvas, "");
        C89219l.m154721d(paint, "");
        int length = dVar.f157977h.length;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = (int) (dVar.f157977h[i3] * ((float) dVar.f157972c));
            int i5 = (dVar.f157971b + dVar.f157970a) * i3;
            if (dVar.f157975f <= 0 || dVar.f157975f <= dVar.f157974e) {
                i = dVar.f157970a;
            } else {
                i = 0;
            }
            int i6 = i5 + i;
            int i7 = ((dVar.f157972c - i4) / 2) + dVar.f157973d;
            canvas.drawRoundRect(new RectF((float) i6, (float) i7, (float) (dVar.f157971b + i6), (float) (i4 + i7)), (float) dVar.f157976g, (float) dVar.f157976g, paint);
        }
    }

    private /* synthetic */ C70590a(Context context, byte b) {
        this(context);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C70590a(Context context, char c) {
        this(context, (byte) 0);
        C89219l.m154721d(context, "");
    }

    public final void onMeasure(int i, int i2) {
        MethodCollector.m26663i(5805);
        C70625d dVar = this.f157961h;
        if (dVar == null || !C70612k.C70614b.m124761a(dVar.getMusicWavePointArray())) {
            super.onMeasure(i, i2);
            MethodCollector.m26664o(5805);
            return;
        }
        int i3 = C70612k.f158036f.f158039a;
        C70612k kVar = C70612k.f158036f;
        if (kVar == null) {
            C89219l.m154715b();
        }
        int i4 = kVar.f158040b;
        C70625d dVar2 = this.f157961h;
        if (dVar2 == null) {
            C89219l.m154715b();
        }
        this.f157959f = ((dVar2.getMusicWavePointArray().length - 1) * (i3 + i4)) + i4;
        C70612k kVar2 = C70612k.f158036f;
        if (kVar2 == null) {
            C89219l.m154715b();
        }
        int i5 = kVar2.f158041c;
        this.f157960g = i5;
        setMeasuredDimension(this.f157959f, i5);
        this.f157954a.mo111392a(this.f157959f, this.f157960g);
        MethodCollector.m26664o(5805);
    }
}
