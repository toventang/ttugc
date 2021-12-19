package com.bytedance.android.live.broadcast.bgbroadcast.p189a.p190a;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.live.broadcast.widget.ControlButton;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.a.a */
public final class C3092a extends LinearLayout {

    /* renamed from: a */
    ControlButton f8979a;

    /* renamed from: b */
    AbstractC3093a f8980b;

    /* renamed from: c */
    public View f8981c = findViewById(R.id.acm);

    /* renamed from: d */
    private ControlButton f8982d;

    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.a.a$a */
    public interface AbstractC3093a {
        static {
            Covode.recordClassIndex(3574);
        }

        /* renamed from: a */
        void mo8399a();

        /* renamed from: a */
        void mo8400a(boolean z);
    }

    static {
        Covode.recordClassIndex(3573);
    }

    private int getLayoutId() {
        return R.layout.bec;
    }

    public final int getIconWidth() {
        return C3966y.m9653a(36.0f);
    }

    /* renamed from: a */
    public final boolean mo8395a() {
        if (this.f8981c.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void setOnViewClickListener(AbstractC3093a aVar) {
        this.f8980b = aVar;
    }

    public final void setMsgBtnActive(boolean z) {
        this.f8979a.setChecked(z);
    }

    public C3092a(Context context) {
        super(context);
        MethodCollector.m26663i(7109);
        inflate(getContext(), getLayoutId(), this);
        ControlButton controlButton = (ControlButton) findViewById(R.id.ya);
        this.f8979a = controlButton;
        controlButton.mo9064a(2131234527, 2131234528, R.string.ei0, R.string.ei0, true);
        this.f8979a.setDescVisibility(0);
        ControlButton controlButton2 = (ControlButton) findViewById(R.id.yq);
        this.f8982d = controlButton2;
        controlButton2.mo9064a(2131234575, 2131234575, R.string.ehz, R.string.ehz, false);
        this.f8982d.setDescVisibility(0);
        this.f8979a.setOnViewClickListener(new C3094b(this));
        this.f8982d.setOnViewClickListener(new C3095c(this));
        MethodCollector.m26664o(7109);
    }
}
