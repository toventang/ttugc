package com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70442h;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointVideoSegView */
public final class StickPointVideoSegView extends FrameLayout {

    /* renamed from: a */
    public AbstractC70442h f157535a;

    /* renamed from: b */
    private View f157536b;

    static {
        Covode.recordClassIndex(82942);
    }

    public StickPointVideoSegView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final void setStickPointVideoSegListener(AbstractC70442h hVar) {
        C89219l.m154721d(hVar, "");
        this.f157535a = hVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointVideoSegView$a */
    static final class View$OnClickListenerC70494a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ StickPointVideoSegView f157537a;

        static {
            Covode.recordClassIndex(82943);
        }

        View$OnClickListenerC70494a(StickPointVideoSegView stickPointVideoSegView) {
            this.f157537a = stickPointVideoSegView;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC70442h hVar = this.f157537a.f157535a;
            if (hVar != null) {
                hVar.mo110934a(view);
            }
        }
    }

    public final void setButtonClickable(boolean z) {
        if (this.f157536b == null) {
            C89219l.m154710a("contentView");
            return;
        }
        View view = this.f157536b;
        if (view == null) {
            C89219l.m154710a("contentView");
        }
        View findViewById = view.findViewById(R.id.ec4);
        C89219l.m154716b(findViewById, "");
        findViewById.setClickable(z);
    }

    private /* synthetic */ StickPointVideoSegView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private StickPointVideoSegView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(12857);
        View inflate = LayoutInflater.from(context).inflate(R.layout.ai9, this);
        C89219l.m154716b(inflate, "");
        this.f157536b = inflate;
        if (inflate == null) {
            C89219l.m154710a("contentView");
        }
        inflate.findViewById(R.id.ec4).setOnClickListener(new View$OnClickListenerC70494a(this));
        MethodCollector.m26664o(12857);
    }
}
