package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.core.p037h.C0792v;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.DoubleColorBallAnimationView;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.widget.k */
public final class C11430k extends LinearLayout {

    /* renamed from: a */
    private DoubleColorBallAnimationView f27400a = ((DoubleColorBallAnimationView) findViewById(R.id.jz));

    /* renamed from: b */
    private TextView f27401b = ((TextView) findViewById(R.id.egy));

    static {
        Covode.recordClassIndex(13086);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            this.f27400a.mo27419a();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f27400a.mo27420b();
    }

    public final void setMessage(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.f27401b.setText(getContext().getString(R.string.gow));
        } else {
            this.f27401b.setText(charSequence);
        }
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            this.f27400a.mo27419a();
        } else if (this.f27400a.f41306a) {
            this.f27400a.mo27420b();
        }
    }

    public C11430k(Context context) {
        super(context);
        MethodCollector.m26663i(10465);
        inflate(getContext(), R.layout.bba, this);
        setOrientation(1);
        C0792v.m2746a(this, C0643b.m2369a(getContext(), (int) R.drawable.bvf));
        int b = (int) C13628n.m24520b(getContext(), 16.0f);
        setPadding(b, b, b, b);
        MethodCollector.m26664o(10465);
    }
}
