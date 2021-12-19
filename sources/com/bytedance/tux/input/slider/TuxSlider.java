package com.bytedance.tux.input.slider;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.appcompat.widget.C0441p;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

public final class TuxSlider extends C0441p implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a */
    private final C23177a f54886a;

    /* renamed from: b */
    private final C23178b f54887b;

    /* renamed from: c */
    private SeekBar.OnSeekBarChangeListener f54888c;

    static {
        Covode.recordClassIndex(27113);
    }

    public TuxSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final void setProgress(int i) {
        super.setProgress(i);
    }

    public final void setSecondaryProgress(int i) {
        super.setSecondaryProgress(i);
    }

    public final void setProgressColor(int i) {
        this.f54886a.f54889a = i;
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.f54887b.f54904h = true;
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f54888c;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStartTrackingTouch(seekBar);
        }
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.f54887b.f54904h = false;
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f54888c;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStopTrackingTouch(seekBar);
        }
    }

    public final void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        if (C89219l.m154714a(onSeekBarChangeListener, this)) {
            super.setOnSeekBarChangeListener(onSeekBarChangeListener);
        } else {
            this.f54888c = onSeekBarChangeListener;
        }
    }

    @Override // androidx.appcompat.widget.C0441p
    public final void onDraw(Canvas canvas) {
        float a = m43692a(getProgress());
        C23177a aVar = this.f54886a;
        float a2 = m43692a(getSecondaryProgress());
        aVar.f54893e = a;
        aVar.f54894f = a2;
        super.onDraw(canvas);
    }

    /* renamed from: a */
    private final float m43692a(int i) {
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

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f54888c;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onProgressChanged(seekBar, i, z);
        }
    }

    private /* synthetic */ TuxSlider(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxSlider(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, R.attr.c5);
        C89219l.m154719c(context, "");
        C23177a aVar = new C23177a();
        this.f54886a = aVar;
        C23178b bVar = new C23178b();
        this.f54887b = bVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ao_, R.attr.aq_, R.attr.aqa, R.attr.aqm, R.attr.arc, R.attr.ard, R.attr.are, R.attr.arf, R.attr.arg, R.attr.arh, R.attr.ari}, R.attr.c5, 0);
        C89219l.m154709a((Object) obtainStyledAttributes, "");
        setProgressDrawable(aVar);
        aVar.f54891c = obtainStyledAttributes.getColor(0, -16777216);
        aVar.f54889a = obtainStyledAttributes.getColor(1, -16777216);
        aVar.f54890b = obtainStyledAttributes.getColor(3, -16777216);
        aVar.f54892d = obtainStyledAttributes.getDimension(2, 0.0f);
        setThumb(bVar);
        bVar.f54897a = obtainStyledAttributes.getFloat(5, 1.0f);
        bVar.f54898b = obtainStyledAttributes.getDimension(10, 0.0f);
        bVar.f54899c = obtainStyledAttributes.getColor(4, -1);
        bVar.f54900d = obtainStyledAttributes.getDimension(7, 0.0f);
        bVar.f54901e = obtainStyledAttributes.getDimension(8, 0.0f);
        bVar.f54902f = obtainStyledAttributes.getDimension(9, 0.0f);
        bVar.f54903g = obtainStyledAttributes.getColor(6, -16777216);
        obtainStyledAttributes.recycle();
        setOnSeekBarChangeListener(this);
        setLayerType(1, null);
    }
}
