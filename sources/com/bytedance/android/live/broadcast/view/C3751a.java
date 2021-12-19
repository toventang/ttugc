package com.bytedance.android.live.broadcast.view;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.design.widget.rtl.LiveAutoRtlImageView;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.view.a */
public final class C3751a extends LinearLayout {

    /* renamed from: a */
    private HashMap f10366a;

    static {
        Covode.recordClassIndex(4268);
    }

    /* renamed from: a */
    private View m9255a(int i) {
        if (this.f10366a == null) {
            this.f10366a = new HashMap();
        }
        View view = (View) this.f10366a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f10366a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void setArrowVisibility(int i) {
        LiveAutoRtlImageView liveAutoRtlImageView = (LiveAutoRtlImageView) m9255a(R.id.ks);
        C89219l.m154716b(liveAutoRtlImageView, "");
        liveAutoRtlImageView.setVisibility(i);
    }

    public final void setNotifyText(CharSequence charSequence) {
        C89219l.m154721d(charSequence, "");
        LiveTextView liveTextView = (LiveTextView) m9255a(R.id.cvk);
        C89219l.m154716b(liveTextView, "");
        liveTextView.setText(charSequence);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C3751a(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(7730);
        C11279p.m20000a((ViewGroup) this, (int) R.layout.bcl, true);
        LiveTextView liveTextView = (LiveTextView) m9255a(R.id.cvk);
        liveTextView.setMovementMethod(LinkMovementMethod.getInstance());
        liveTextView.setHighlightColor(0);
        MethodCollector.m26664o(7730);
    }

    public /* synthetic */ C3751a(Context context, byte b) {
        this(context);
    }
}
