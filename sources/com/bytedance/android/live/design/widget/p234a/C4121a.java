package com.bytedance.android.live.design.widget.p234a;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.design.widget.a.a */
public final class C4121a extends LinearLayout {

    /* renamed from: a */
    private TextView f11522a = ((TextView) findViewById(R.id.cb5));

    static {
        Covode.recordClassIndex(4680);
    }

    public final void setText(int i) {
        this.f11522a.setText(i);
    }

    public final void setText(CharSequence charSequence) {
        this.f11522a.setText(charSequence);
    }

    public C4121a(Context context) {
        super(context);
        MethodCollector.m26663i(10929);
        inflate(getContext(), R.layout.ajl, this);
        setOrientation(0);
        setGravity(17);
        MethodCollector.m26664o(10929);
    }
}
