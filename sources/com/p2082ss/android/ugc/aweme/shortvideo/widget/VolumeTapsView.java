package com.p2082ss.android.ugc.aweme.shortvideo.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.core.content.C0643b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.shortvideo.C70625d;
import com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70595d;
import com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70612k;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.view.C84916a;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.VEUtils;
import java.util.concurrent.TimeUnit;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.VolumeTapsView */
public class VolumeTapsView extends View implements GestureDetector.OnGestureListener {

    /* renamed from: a */
    private int f166987a;

    /* renamed from: b */
    private int f166988b;

    /* renamed from: c */
    private final RectF f166989c;

    /* renamed from: d */
    private final RectF f166990d;

    /* renamed from: e */
    private final Paint f166991e;

    /* renamed from: f */
    private Bitmap f166992f;

    /* renamed from: g */
    private Bitmap f166993g;

    /* renamed from: h */
    private Bitmap f166994h;

    /* renamed from: i */
    private C70595d f166995i;

    /* renamed from: j */
    private C70595d f166996j;

    /* renamed from: k */
    private C70595d f166997k;

    /* renamed from: l */
    private Bitmap f166998l;

    /* renamed from: m */
    private GestureDetector f166999m;

    /* renamed from: n */
    private int f167000n;

    /* renamed from: o */
    private int f167001o;

    /* renamed from: p */
    private int f167002p;

    /* renamed from: q */
    private int f167003q;

    /* renamed from: r */
    private AbstractC74265a f167004r;

    /* renamed from: s */
    private long f167005s;

    /* renamed from: t */
    private int f167006t;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.VolumeTapsView$a */
    public interface AbstractC74265a {
        static {
            Covode.recordClassIndex(87037);
        }

        /* renamed from: a */
        void mo88265a(int i);

        /* renamed from: a */
        void mo88266a(int i, int i2);
    }

    static {
        Covode.recordClassIndex(87036);
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }

    public int getStopPosition() {
        return this.f167003q;
    }

    public void setOnProgressChangeListener(AbstractC74265a aVar) {
        this.f167004r = aVar;
    }

    public void setPastPosition(int i) {
        this.f167000n = i;
        invalidate();
    }

    public void setProgress(int i) {
        this.f167002p = i;
        invalidate();
    }

    public void setStopPosition(int i) {
        this.f167003q = i;
        invalidate();
    }

    public void setTotalTime(long j) {
        this.f167005s = j;
        setWavForm(this.f166992f);
    }

    /* renamed from: a */
    private int m130656a(float f) {
        return ((int) (((f * 1.0f) * ((float) (this.f166988b - this.f166987a))) / ((float) getMeasuredWidth()))) + this.f166987a;
    }

    /* renamed from: b */
    private float m130662b(int i) {
        return ((((float) (i - this.f166987a)) * 1.0f) * ((float) getMeasuredWidth())) / ((float) (this.f166988b - this.f166987a));
    }

    public boolean onDown(MotionEvent motionEvent) {
        this.f167003q = m130656a(Math.min(Math.max(m130662b(this.f167000n), motionEvent.getX()), (float) getMeasuredWidth()));
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        invalidate();
        AbstractC74265a aVar = this.f167004r;
        if (aVar != null) {
            aVar.mo88265a(this.f167003q);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.m26663i(9036);
        super.onDraw(canvas);
        if (C70612k.C70614b.m124761a(this.f166997k.f157977h)) {
            m130660a(canvas, false);
            MethodCollector.m26664o(9036);
            return;
        }
        m130660a(canvas, true);
        MethodCollector.m26664o(9036);
    }

    public void setWavForm(Bitmap bitmap) {
        Context context = getContext();
        C89219l.m154721d(context, "");
        this.f166992f = m130657a(bitmap, C0643b.m2378c(context, R.color.bz));
        C89219l.m154721d(context, "");
        this.f166993g = m130657a(bitmap, C0643b.m2378c(context, R.color.ib));
        C89219l.m154721d(context, "");
        this.f166994h = m130657a(bitmap, C0643b.m2378c(context, R.color.c5));
        invalidate();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = this.f166999m.onTouchEvent(motionEvent);
        if (motionEvent.getAction() != 1) {
            return onTouchEvent;
        }
        int a = m130656a(Math.min(Math.max(m130662b(this.f167000n), motionEvent.getX()), (float) getMeasuredWidth()));
        this.f167003q = a;
        int max = Math.max(this.f167000n, a - ((int) TimeUnit.SECONDS.toMillis(3)));
        this.f167001o = max;
        this.f167002p = max;
        invalidate();
        AbstractC74265a aVar = this.f167004r;
        if (aVar != null) {
            aVar.mo88266a(this.f167001o, this.f167003q);
        }
        return onTouchEvent | true;
    }

    /* renamed from: a */
    private void m130659a(int i) {
        this.f167000n += i;
        this.f167003q += i;
        this.f167001o += i;
        this.f167002p += i;
    }

    /* renamed from: a */
    private void m130661a(C70625d dVar) {
        if (dVar != null && C70612k.C70614b.m124761a(dVar.getMusicWavePointArray())) {
            int b = (int) C13628n.m24520b(getContext(), 4.0f);
            C70612k.m124749b(dVar);
            this.f166995i.f157973d = b;
            this.f166996j.f157973d = b;
            this.f166997k.f157973d = b;
            this.f166995i.f157970a = C70612k.f158036f.f158042d;
            this.f166996j.f157970a = C70612k.f158036f.f158042d;
            this.f166997k.f157970a = C70612k.f158036f.f158042d;
            this.f166995i.mo111395a(dVar.getMusicWavePointArray());
            this.f166996j.mo111395a(dVar.getMusicWavePointArray());
            this.f166997k.mo111395a(dVar.getMusicWavePointArray());
        }
    }

    public VolumeTapsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: a */
    private static Bitmap m130657a(Bitmap bitmap, int i) {
        MethodCollector.m26663i(9040);
        Paint paint = new Paint();
        paint.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(bitmap, 0.0f, 0.0f, paint);
        MethodCollector.m26664o(9040);
        return createBitmap;
    }

    public void onMeasure(int i, int i2) {
        MethodCollector.m26663i(8888);
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.f166995i.mo111392a(size, size2);
        this.f166996j.mo111392a(size, size2);
        this.f166997k.mo111392a(size, size2);
        MethodCollector.m26664o(8888);
    }

    /* renamed from: a */
    private static C70625d m130658a(Context context, int i) {
        C70625d dVar = new C70625d();
        int b = C70612k.f158036f.mo111419b(context);
        float[] fArr = new float[b];
        if (i > 0) {
            for (int i2 = 0; i2 < b; i2++) {
                fArr[i2] = (float) Math.random();
            }
        }
        dVar.setMusicWavePointArray(fArr);
        return dVar;
    }

    /* renamed from: a */
    private void m130660a(Canvas canvas, boolean z) {
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        RectF rectF = this.f166989c;
        float b = m130662b(this.f167000n);
        m130662b(this.f167001o);
        float b2 = m130662b(this.f167002p);
        float b3 = m130662b(this.f167003q);
        rectF.left = 0.0f;
        rectF.right = b;
        rectF.top = 0.0f;
        float f = (float) measuredHeight;
        rectF.bottom = f;
        canvas.drawRect(rectF, this.f166991e);
        int i = this.f166987a;
        int i2 = this.f166988b;
        float f2 = (float) measuredWidth;
        float f3 = ((((float) i) * -1.0f) / ((float) (i2 - i))) * f2;
        float f4 = (((float) this.f167005s) * 1.0f) / ((float) (i2 - i));
        this.f166990d.top = 0.1f * f;
        this.f166990d.right = f4 * f2;
        this.f166990d.bottom = 0.9f * f;
        if (z) {
            rectF.left = 0.0f;
        } else {
            rectF.left = b2;
        }
        rectF.right = f2;
        canvas.save();
        canvas.clipRect(rectF);
        if (z) {
            canvas.translate(f3, 0.0f);
            canvas.drawBitmap(this.f166994h, (Rect) null, this.f166990d, (Paint) null);
        } else {
            this.f166997k.mo111394a(canvas);
        }
        canvas.restore();
        rectF.top = 0.0f;
        rectF.bottom = f;
        rectF.left = 0.0f;
        rectF.right = b;
        canvas.save();
        canvas.clipRect(rectF);
        if (z) {
            canvas.translate(f3, 0.0f);
            canvas.drawBitmap(this.f166992f, (Rect) null, this.f166990d, (Paint) null);
        } else {
            this.f166995i.mo111394a(canvas);
        }
        canvas.restore();
        rectF.left = b;
        rectF.right = b2;
        canvas.save();
        canvas.clipRect(rectF);
        if (z) {
            canvas.translate(f3, 0.0f);
            canvas.drawBitmap(this.f166993g, (Rect) null, this.f166990d, (Paint) null);
        } else {
            this.f166996j.mo111394a(canvas);
        }
        canvas.restore();
        Bitmap bitmap = this.f166998l;
        canvas.drawBitmap(bitmap, b3 - ((float) (bitmap.getWidth() / 2)), (float) ((measuredHeight / 2) - (this.f166998l.getHeight() / 2)), (Paint) null);
    }

    /* renamed from: a */
    public final void mo116858a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("start: ".concat(String.valueOf(i)));
        } else if (i2 >= i) {
            m130659a(i - this.f166987a);
            this.f166987a = i;
            this.f166988b = i2;
            invalidate();
        } else {
            throw new IllegalArgumentException("start: " + i + "; end: " + i2);
        }
    }

    /* renamed from: a */
    public final void mo116859a(C70625d dVar, int i) {
        int i2 = 0;
        if (dVar == null || !C70612k.C70614b.m124761a(dVar.getMusicWavePointArray())) {
            m130661a(m130658a(getContext(), i));
            i2 = 1;
        } else {
            int i3 = this.f166987a;
            C70612k.m124746a(dVar, i3, this.f166988b - i3, i);
            int b = C70612k.f158036f.mo111419b(getContext());
            if (b < dVar.getMusicWavePointArray().length) {
                m130661a(C70612k.m124743a(VEUtils.getResampleMusicWaveData(dVar.getMusicWavePointArray(), 0, b)));
            }
        }
        C80322d.m139251a("tool_performance_show_music_wave", new C84425b().mo129406a("scene", "VolumeTapsView").mo129403a("status", i2 ^ 1).f188764a);
    }

    private VolumeTapsView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(8747);
        this.f166989c = new RectF();
        this.f166990d = new RectF();
        Paint paint = new Paint();
        this.f166991e = paint;
        this.f166999m = new GestureDetector(context, this);
        this.f166998l = BitmapFactory.decodeResource(getResources(), 2131232403);
        setWavForm(BitmapFactory.decodeResource(getResources(), 2131231368));
        this.f166996j = new C70595d(context);
        this.f166995i = new C70595d(context);
        this.f166997k = new C70595d(context);
        this.f166996j.mo111391a(Color.parseColor("#FF20E5DC"));
        this.f166997k.mo111391a(-1);
        this.f166995i.mo111391a(Color.parseColor("#52FFFFFF"));
        int parseColor = Color.parseColor("#22FFFFFF");
        this.f167006t = parseColor;
        paint.setColor(parseColor);
        setBackground(C84916a.m145947a(0, Color.parseColor("#22FFFFFF"), 0, (int) C13628n.m24520b(context, 2.0f)));
        MethodCollector.m26664o(8747);
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f167003q = m130656a(Math.min(Math.max(m130662b(this.f167000n), motionEvent2.getX()), (float) getMeasuredWidth()));
        invalidate();
        AbstractC74265a aVar = this.f167004r;
        if (aVar == null) {
            return true;
        }
        aVar.mo88265a(this.f167003q);
        return true;
    }
}
