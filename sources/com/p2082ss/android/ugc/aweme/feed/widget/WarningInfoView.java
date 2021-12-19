package com.p2082ss.android.ugc.aweme.feed.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.widget.WarningInfoView */
public class WarningInfoView extends RelativeLayout {

    /* renamed from: a */
    private LiveTextView f116725a = ((LiveTextView) findViewById(R.id.f72));

    static {
        Covode.recordClassIndex(59652);
    }

    public void setInfoText(CharSequence charSequence) {
        this.f116725a.setText(charSequence);
    }

    public WarningInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(6029);
        inflate(getContext(), R.layout.ts, this);
        MethodCollector.m26664o(6029);
    }
}
