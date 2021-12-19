package com.p2082ss.android.ugc.aweme.shortvideo.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.view.q */
public final class C74158q extends LinearLayout {

    /* renamed from: a */
    private TextView f166559a;

    static {
        Covode.recordClassIndex(86917);
    }

    public C74158q(Context context) {
        this(context, (byte) 0);
    }

    public final void setTagName(String str) {
        this.f166559a.setText(str);
    }

    private C74158q(Context context, byte b) {
        this(context, (char) 0);
    }

    private C74158q(Context context, char c) {
        super(context, null, 0);
        MethodCollector.m26663i(7028);
        View inflate = LayoutInflater.from(context).inflate(R.layout.biq, this);
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f166559a = (TextView) inflate.findViewById(R.id.f5i);
        MethodCollector.m26664o(7028);
    }
}
