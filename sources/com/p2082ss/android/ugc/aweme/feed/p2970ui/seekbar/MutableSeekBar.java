package com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.SeekBar;
import androidx.appcompat.widget.C0441p;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.MutableSeekBar */
public final class MutableSeekBar extends C0441p implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a */
    public static final C50425a f116422a = new C50425a((byte) 0);

    /* renamed from: b */
    private final C50426b f116423b;

    /* renamed from: c */
    private final C50427c f116424c;

    /* renamed from: d */
    private SeekBar.OnSeekBarChangeListener f116425d;

    /* renamed from: e */
    private boolean f116426e;

    /* renamed from: f */
    private boolean f116427f;

    /* renamed from: g */
    private Float f116428g;

    /* renamed from: h */
    private boolean f116429h;

    /* renamed from: i */
    private int f116430i;

    static {
        Covode.recordClassIndex(59558);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.MutableSeekBar$a */
    public static final class C50425a {
        static {
            Covode.recordClassIndex(59559);
        }

        private C50425a() {
        }

        public /* synthetic */ C50425a(byte b) {
            this();
        }
    }

    public final boolean getCanDrag() {
        return this.f116429h;
    }

    public final boolean getHasActionMove() {
        return this.f116426e;
    }

    public final Float getMDownEventRawX() {
        return this.f116428g;
    }

    public final boolean getMPauseStatus() {
        return this.f116427f;
    }

    public final int getRealWidth() {
        return this.f116430i;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.MutableSeekBar$c */
    public static final class C50427c extends Drawable {

        /* renamed from: a */
        public float f116439a = 0.5f;

        /* renamed from: b */
        public float f116440b = 1.0f;

        /* renamed from: c */
        public float f116441c;

        /* renamed from: d */
        public int f116442d = -1;

        /* renamed from: e */
        public float f116443e;

        /* renamed from: f */
        public float f116444f;

        /* renamed from: g */
        public float f116445g = -1.0f;

        /* renamed from: h */
        public int f116446h = -16777216;

        /* renamed from: i */
        private final Paint f116447i;

        static {
            Covode.recordClassIndex(59561);
        }

        public final int getOpacity() {
            return -3;
        }

        public final void setAlpha(int i) {
        }

        public final void setColorFilter(ColorFilter colorFilter) {
        }

        public final int getIntrinsicHeight() {
            return (int) (this.f116440b * this.f116441c);
        }

        public final int getIntrinsicWidth() {
            return (int) (this.f116440b * this.f116441c);
        }

        public C50427c() {
            Paint paint = new Paint();
            this.f116447i = paint;
            paint.setAntiAlias(true);
        }

        public final void draw(Canvas canvas) {
            float exactCenterX;
            C89219l.m154721d(canvas, "");
            this.f116447i.setColor(this.f116442d);
            float f = this.f116445g;
            if (f >= 0.0f) {
                this.f116447i.setShadowLayer(f, this.f116443e, this.f116444f, this.f116446h);
            }
            if (C80471gb.m139482a()) {
                exactCenterX = getBounds().exactCenterX() + this.f116439a;
            } else {
                exactCenterX = getBounds().exactCenterX() - this.f116439a;
            }
            canvas.drawCircle(exactCenterX, getBounds().exactCenterY(), this.f116441c / 2.0f, this.f116447i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.MutableSeekBar$b */
    public static final class C50426b extends Drawable {

        /* renamed from: a */
        public int f116431a = -16777216;

        /* renamed from: b */
        public int f116432b;

        /* renamed from: c */
        public int f116433c = -16777216;

        /* renamed from: d */
        public float f116434d;

        /* renamed from: e */
        float f116435e;

        /* renamed from: f */
        float f116436f;

        /* renamed from: g */
        private final Paint f116437g;

        /* renamed from: h */
        private final RectF f116438h;

        static {
            Covode.recordClassIndex(59560);
        }

        public final int getOpacity() {
            return -3;
        }

        public final void setAlpha(int i) {
        }

        public final void setColorFilter(ColorFilter colorFilter) {
        }

        public C50426b() {
            Paint paint = new Paint();
            this.f116437g = paint;
            this.f116438h = new RectF();
            paint.setAntiAlias(true);
        }

        /* access modifiers changed from: protected */
        public final boolean onLevelChange(int i) {
            boolean onLevelChange = super.onLevelChange(i);
            invalidateSelf();
            return onLevelChange;
        }

        public final void draw(Canvas canvas) {
            C89219l.m154721d(canvas, "");
            float width = (float) getBounds().width();
            float f = this.f116434d / 2.0f;
            float centerY = ((float) getBounds().centerY()) - f;
            float centerY2 = ((float) getBounds().centerY()) + f;
            this.f116437g.setColor(this.f116433c);
            this.f116438h.set(0.0f, centerY, width, centerY2);
            canvas.drawRect(this.f116438h, this.f116437g);
            if (this.f116436f > this.f116435e) {
                this.f116437g.setColor(this.f116432b);
                this.f116438h.set(this.f116435e * width, centerY, this.f116436f * width, centerY2);
                canvas.drawRoundRect(this.f116438h, f, f, this.f116437g);
            }
            this.f116437g.setColor(this.f116431a);
            this.f116438h.set(0.0f, centerY, width * this.f116435e, centerY2);
            canvas.drawRect(this.f116438h, this.f116437g);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.MutableSeekBar$d */
    static final class RunnableC50428d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MutableSeekBar f116448a;

        static {
            Covode.recordClassIndex(59562);
        }

        RunnableC50428d(MutableSeekBar mutableSeekBar) {
            this.f116448a = mutableSeekBar;
        }

        public final void run() {
            MutableSeekBar mutableSeekBar = this.f116448a;
            mutableSeekBar.onSizeChanged(mutableSeekBar.getWidth(), this.f116448a.getHeight(), 0, 0);
        }
    }

    public final void setCanDrag(boolean z) {
        this.f116429h = z;
    }

    public final void setHasActionMove(boolean z) {
        this.f116426e = z;
    }

    public final void setMDownEventRawX(Float f) {
        this.f116428g = f;
    }

    public final void setMPauseStatus(boolean z) {
        this.f116427f = z;
    }

    public final void setPauseStatus(boolean z) {
        this.f116427f = z;
    }

    public final void setRealWidth(int i) {
        this.f116430i = i;
    }

    public MutableSeekBar(Context context) {
        this(context, null);
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f116425d;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStartTrackingTouch(seekBar);
        }
    }

    public final void setCustomOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        C89219l.m154721d(onSeekBarChangeListener, "");
        this.f116425d = onSeekBarChangeListener;
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        requestLayout();
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f116425d;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStopTrackingTouch(seekBar);
        }
    }

    /* renamed from: a */
    private final float m94578a(int i) {
        float f;
        int max;
        if (Build.VERSION.SDK_INT >= 26) {
            max = getMax() - getMin();
            if (max <= 0) {
                return 0.0f;
            }
            f = ((float) (i - getMin())) * 1.0f;
        } else if (getMax() <= 0) {
            return 0.0f;
        } else {
            f = ((float) i) * 1.0f;
            max = getMax();
        }
        return f / ((float) max);
    }

    @Override // androidx.appcompat.widget.C0441p
    public final void onDraw(Canvas canvas) {
        if (this.f116430i != (getWidth() - getPaddingLeft()) - getPaddingRight()) {
            post(new RunnableC50428d(this));
        }
        float a = m94578a(getProgress());
        float a2 = m94578a(getSecondaryProgress());
        C50426b bVar = this.f116423b;
        bVar.f116435e = a;
        bVar.f116436f = a2;
        super.onDraw(canvas);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer num;
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getAction());
        } else {
            num = null;
        }
        if (num != null) {
            if (num.intValue() == 0) {
                this.f116426e = false;
                this.f116428g = Float.valueOf(motionEvent.getRawX());
                super.onTouchEvent(motionEvent);
            } else if (num.intValue() == 2) {
                Float f = this.f116428g;
                if (f != null && Math.abs(f.floatValue() - motionEvent.getRawX()) > 10.0f) {
                    this.f116426e = true;
                    super.onTouchEvent(motionEvent);
                }
            } else if (num.intValue() == 1) {
                if (this.f116426e || this.f116427f) {
                    super.onTouchEvent(motionEvent);
                } else {
                    onStartTrackingTouch(this);
                    onStopTrackingTouch(this);
                }
                this.f116426e = false;
            } else if (num.intValue() == 3) {
                super.onTouchEvent(motionEvent);
                this.f116426e = false;
            }
        }
        return true;
    }

    public MutableSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f116425d;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onProgressChanged(seekBar, i, z);
        }
    }

    private MutableSeekBar(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, R.attr.ab4);
        C50426b bVar = new C50426b();
        this.f116423b = bVar;
        C50427c cVar = new C50427c();
        this.f116424c = cVar;
        this.f116429h = true;
        super.setOnSeekBarChangeListener(this);
        setThumb(cVar);
        setProgressDrawable(bVar);
    }

    /* renamed from: a */
    public static /* synthetic */ void m94579a(MutableSeekBar mutableSeekBar, Float f, Integer num) {
        boolean z = true;
        boolean z2 = false;
        if (f != null) {
            float floatValue = f.floatValue();
            if (mutableSeekBar.f116424c.f116441c != floatValue) {
                z2 = true;
            }
            mutableSeekBar.f116424c.f116441c = floatValue;
        }
        if (num != null) {
            int intValue = num.intValue();
            if (mutableSeekBar.f116424c.f116442d == intValue) {
                z = z2;
            }
            mutableSeekBar.f116424c.f116442d = intValue;
            z2 = z;
        }
        if (z2) {
            mutableSeekBar.requestLayout();
            mutableSeekBar.invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f116430i = (i - getPaddingRight()) - getPaddingLeft();
    }

    /* renamed from: a */
    public static /* synthetic */ void m94580a(MutableSeekBar mutableSeekBar, Integer num, Integer num2, Float f, int i) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            f = null;
        }
        boolean z = false;
        boolean z2 = true;
        if (num != null) {
            int intValue = num.intValue();
            if (mutableSeekBar.f116423b.f116431a != intValue) {
                z = true;
            }
            mutableSeekBar.f116423b.f116431a = intValue;
        }
        if (num2 != null) {
            int intValue2 = num2.intValue();
            if (mutableSeekBar.f116423b.f116433c != intValue2) {
                z = true;
            }
            mutableSeekBar.f116423b.f116433c = intValue2;
        }
        if (f != null) {
            float floatValue = f.floatValue();
            if (mutableSeekBar.f116423b.f116434d == floatValue) {
                z2 = z;
            }
            mutableSeekBar.f116423b.f116434d = floatValue;
            z = z2;
        }
        if (z) {
            mutableSeekBar.requestLayout();
            mutableSeekBar.invalidate();
        }
    }
}
