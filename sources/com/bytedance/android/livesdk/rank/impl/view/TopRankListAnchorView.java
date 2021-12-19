package com.bytedance.android.livesdk.rank.impl.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

public class TopRankListAnchorView extends RelativeLayout {

    /* renamed from: a */
    private ImageView f25549a = ((ImageView) findViewById(R.id.els));

    /* renamed from: b */
    private TextView f25550b = ((TextView) findViewById(R.id.elu));

    /* renamed from: c */
    private ImageView f25551c = ((ImageView) findViewById(R.id.em7));

    /* renamed from: d */
    private TextView f25552d = ((TextView) findViewById(R.id.em_));

    /* renamed from: e */
    private TextView f25553e = ((TextView) findViewById(R.id.elr));

    /* renamed from: f */
    private View f25554f = findViewById(R.id.ely);

    static {
        Covode.recordClassIndex(12170);
    }

    public TopRankListAnchorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(2538);
        inflate(getContext(), R.layout.bfe, this);
        MethodCollector.m26664o(2538);
    }
}
