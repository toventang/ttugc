package com.bytedance.android.live.design.view.action;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.p017a.p018a.C0196a;
import com.bytedance.android.live.design.widget.rtl.LiveAutoRtlImageView;
import com.bytedance.android.live.design.widget.tintable.C4136e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

public class LiveActionButton extends C4136e {

    /* renamed from: a */
    LiveAutoRtlImageView f11289a;

    /* renamed from: b */
    TextView f11290b;

    /* renamed from: c */
    private C4083a f11291c;

    static {
        Covode.recordClassIndex(4627);
    }

    public LiveActionButton(Context context) {
        this(context, null);
    }

    public void setText(int i) {
        this.f11290b.setText(i);
    }

    /* renamed from: a */
    public final void mo9531a(int i) {
        mo9821b(i);
        this.f11291c.mo9536a(i);
    }

    public void setIcon(int i) {
        setIcon(C0196a.m619b(getContext(), i));
    }

    public void setText(CharSequence charSequence) {
        this.f11290b.setText(charSequence);
    }

    public void setIcon(Drawable drawable) {
        this.f11289a.setImageDrawable(drawable);
        if (drawable == null) {
            this.f11289a.setVisibility(8);
            this.f11290b.setGravity(17);
            return;
        }
        this.f11289a.setVisibility(0);
        this.f11290b.setGravity(8388611);
    }

    public LiveActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private LiveActionButton(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, (byte) 0);
        inflate(getContext(), R.layout.ajg, this);
        this.f11289a = (LiveAutoRtlImageView) findViewById(R.id.c_o);
        this.f11290b = (TextView) findViewById(R.id.c_p);
        C4083a aVar = new C4083a(this);
        this.f11291c = aVar;
        aVar.mo9537a(attributeSet, R.attr.a2y, 0);
    }
}
