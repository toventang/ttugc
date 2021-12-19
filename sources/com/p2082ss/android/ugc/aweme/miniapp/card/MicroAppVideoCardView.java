package com.p2082ss.android.ugc.aweme.miniapp.card;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AnimatedImageView;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.miniapp.card.MicroAppVideoCardView */
public class MicroAppVideoCardView extends ConstraintLayout {

    /* renamed from: g */
    public boolean f135488g;

    /* renamed from: h */
    AbstractC59270a f135489h;

    /* renamed from: i */
    private View f135490i;

    /* renamed from: j */
    private AnimatedImageView f135491j;

    /* renamed from: k */
    private TextView f135492k;

    /* renamed from: l */
    private TextView f135493l;

    /* renamed from: m */
    private TextView f135494m;

    /* renamed from: n */
    private ImageView f135495n;

    /* renamed from: com.ss.android.ugc.aweme.miniapp.card.MicroAppVideoCardView$a */
    interface AbstractC59270a {
        static {
            Covode.recordClassIndex(69640);
        }
    }

    static {
        Covode.recordClassIndex(69639);
    }

    public void setOnClickCloseListener(AbstractC59270a aVar) {
        this.f135489h = aVar;
    }

    public MicroAppVideoCardView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo96860a(boolean z) {
        this.f135488g = z;
        setVisibility(8);
    }

    public MicroAppVideoCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private MicroAppVideoCardView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(4632);
        View inflate = LayoutInflater.from(context).inflate(R.layout.t9, this);
        this.f135490i = inflate;
        this.f135491j = (AnimatedImageView) inflate.findViewById(R.id.cka);
        this.f135495n = (ImageView) this.f135490i.findViewById(R.id.ck9);
        this.f135493l = (TextView) this.f135490i.findViewById(R.id.ck_);
        this.f135492k = (TextView) this.f135490i.findViewById(R.id.ckb);
        this.f135494m = (TextView) this.f135490i.findViewById(R.id.ck8);
        MethodCollector.m26664o(4632);
    }
}
