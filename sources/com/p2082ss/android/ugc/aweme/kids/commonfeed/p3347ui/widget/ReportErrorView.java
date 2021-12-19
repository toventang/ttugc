package com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.ReportErrorView */
public class ReportErrorView extends LinearLayout {
    static {
        Covode.recordClassIndex(67461);
    }

    public ReportErrorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private ReportErrorView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    private ReportErrorView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0, 0);
        MethodCollector.m26663i(7059);
        LayoutInflater.from(context).inflate(R.layout.ad1, this);
        MethodCollector.m26664o(7059);
    }
}
