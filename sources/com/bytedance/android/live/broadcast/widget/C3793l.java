package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.broadcast.widget.l */
public final class C3793l extends ConstraintLayout {

    /* renamed from: g */
    ImageView f10523g;

    /* renamed from: h */
    TextView f10524h;

    /* renamed from: i */
    View f10525i;

    /* renamed from: j */
    TextView f10526j;

    /* renamed from: k */
    ImageView f10527k;

    static {
        Covode.recordClassIndex(4319);
    }

    private int getLayoutId() {
        return R.layout.bdl;
    }

    public final View getRootView() {
        return this;
    }

    public final ImageView getAlertImageView() {
        return this.f10527k;
    }

    public final TextView getAlertText() {
        return this.f10526j;
    }

    public final ImageView getIconView() {
        return this.f10523g;
    }

    public final View getRedDotView() {
        return this.f10525i;
    }

    public final TextView getTextView() {
        return this.f10524h;
    }

    /* renamed from: b */
    public final void mo9139b() {
        this.f10525i.setVisibility(8);
        this.f10527k.setVisibility(8);
        this.f10526j.setVisibility(8);
    }

    public C3793l(Context context) {
        this(context, (byte) 0);
    }

    public final void setIconMarginTop(int i) {
        ImageView imageView = this.f10523g;
        if (imageView != null && (imageView.getLayoutParams() instanceof ConstraintLayout.C0547a)) {
            ConstraintLayout.C0547a aVar = (ConstraintLayout.C0547a) this.f10523g.getLayoutParams();
            aVar.topMargin = i;
            this.f10523g.setLayoutParams(aVar);
        }
    }

    private C3793l(Context context, byte b) {
        this(context, (char) 0);
    }

    private C3793l(Context context, char c) {
        super(context, null, 0);
        inflate(getContext(), getLayoutId(), this);
        this.f10523g = (ImageView) findViewById(R.id.ekf);
        this.f10524h = (TextView) findViewById(R.id.eke);
        this.f10526j = (TextView) findViewById(R.id.ek_);
        this.f10527k = (ImageView) findViewById(R.id.ek9);
        this.f10525i = findViewById(R.id.ekc);
    }
}
