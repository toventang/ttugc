package com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.AudioTrackView */
public final class AudioTrackView extends View {

    /* renamed from: a */
    public final Rect f157566a;

    /* renamed from: b */
    private long f157567b;

    /* renamed from: c */
    private final Paint f157568c;

    /* renamed from: d */
    private final Rect f157569d;

    /* renamed from: e */
    private final Rect f157570e;

    /* renamed from: f */
    private final AbstractC89244h f157571f;

    /* renamed from: g */
    private int f157572g;

    static {
        Covode.recordClassIndex(82955);
    }

    public AudioTrackView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final Bitmap getSrcBitmap() {
        return (Bitmap) this.f157571f.getValue();
    }

    public final long getDuraion() {
        return this.f157567b;
    }

    public final float getEndPosition() {
        return (float) this.f157570e.right;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f157570e.width() > 0 && !getSrcBitmap().isRecycled()) {
            getSrcBitmap().recycle();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.AudioTrackView$a */
    static final class C70506a extends AbstractC89220m implements AbstractC89171a<Bitmap> {

        /* renamed from: a */
        final /* synthetic */ AudioTrackView f157573a;

        static {
            Covode.recordClassIndex(82956);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70506a(AudioTrackView audioTrackView) {
            super(0);
            this.f157573a = audioTrackView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Bitmap invoke() {
            MethodCollector.m26663i(14181);
            Bitmap decodeResource = BitmapFactory.decodeResource(this.f157573a.getResources(), 2131230998);
            Rect rect = this.f157573a.f157566a;
            C89219l.m154716b(decodeResource, "");
            rect.right = decodeResource.getWidth();
            this.f157573a.f157566a.bottom = decodeResource.getHeight();
            MethodCollector.m26664o(14181);
            return decodeResource;
        }
    }

    public final void setDuraion(long j) {
        this.f157567b = j;
    }

    /* renamed from: a */
    public final void mo111088a(float f) {
        this.f157572g = (int) f;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        MethodCollector.m26663i(12057);
        super.onDraw(canvas);
        if (this.f157570e.width() <= 0) {
            MethodCollector.m26664o(12057);
            return;
        }
        this.f157569d.right = (getMeasuredHeight() * getSrcBitmap().getWidth()) / getSrcBitmap().getHeight();
        this.f157569d.bottom = getMeasuredHeight();
        this.f157570e.bottom = getMeasuredHeight();
        if (canvas != null) {
            canvas.save();
            canvas.translate((float) this.f157572g, 0.0f);
            canvas.clipRect(this.f157570e);
            canvas.drawBitmap(getSrcBitmap(), this.f157566a, this.f157569d, this.f157568c);
            canvas.restore();
            MethodCollector.m26664o(12057);
            return;
        }
        MethodCollector.m26664o(12057);
    }

    private /* synthetic */ AudioTrackView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AudioTrackView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(12186);
        this.f157568c = new Paint();
        this.f157569d = new Rect();
        this.f157570e = new Rect(0, 0, 0, 0);
        this.f157566a = new Rect(0, 0, 0, 0);
        this.f157571f = C89250i.m154773a((AbstractC89171a) new C70506a(this));
        MethodCollector.m26664o(12186);
    }

    /* renamed from: a */
    public final void mo111089a(float f, float f2, long j) {
        if (getMeasuredWidth() > 0) {
            this.f157567b = j;
            if (C84912r.m145932a(this)) {
                this.f157570e.right = getMeasuredWidth();
                this.f157570e.left = (int) (((float) getMeasuredWidth()) - f2);
            } else {
                this.f157570e.left = 0;
                this.f157570e.right = (int) f2;
            }
            mo111088a(f);
        }
    }
}
