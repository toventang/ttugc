package com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.OptionDescItemLayout */
public final class OptionDescItemLayout extends RelativeLayout {

    /* renamed from: a */
    public ImageView f116333a = ((ImageView) findViewById(R.id.bsj));

    /* renamed from: b */
    private TextView f116334b = ((TextView) findViewById(R.id.ajd));

    /* renamed from: c */
    private ImageView f116335c = ((ImageView) findViewById(R.id.bh1));

    static {
        Covode.recordClassIndex(59520);
    }

    /* renamed from: a */
    public final void mo85557a(C50397e eVar) {
        C89219l.m154721d(eVar, "");
        ImageView imageView = this.f116335c;
        if (imageView != null) {
            imageView.setImageResource(eVar.f116354a);
        }
        TextView textView = this.f116334b;
        if (textView != null) {
            Context context = getContext();
            C89219l.m154716b(context, "");
            textView.setText(context.getResources().getText(eVar.f116355b));
        }
    }

    public OptionDescItemLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(4173);
        View.inflate(getContext(), R.layout.sd, this);
        int b = (int) C13628n.m24520b(getContext(), 16.0f);
        int b2 = (int) C13628n.m24520b(getContext(), 14.0f);
        setPadding(b, b2, b, b2);
        setGravity(16);
        MethodCollector.m26664o(4173);
    }
}
