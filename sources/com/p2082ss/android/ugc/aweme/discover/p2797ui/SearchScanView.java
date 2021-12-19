package com.p2082ss.android.ugc.aweme.discover.p2797ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.icon.TuxIconView;
import com.p2082ss.android.ugc.aweme.notification.p3528g.C62023a;
import com.p2082ss.android.ugc.aweme.qrcode.C66417l;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchScanView */
public class SearchScanView extends FrameLayout implements View.OnClickListener {

    /* renamed from: a */
    public boolean f99339a;

    /* renamed from: b */
    private TextView f99340b;

    /* renamed from: c */
    private TuxIconView f99341c;

    /* renamed from: d */
    private AbstractC42582a f99342d;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchScanView$a */
    public interface AbstractC42582a {
        static {
            Covode.recordClassIndex(50685);
        }

        /* renamed from: a */
        void mo72776a(View view);

        /* renamed from: b */
        void mo72777b(View view);
    }

    static {
        Covode.recordClassIndex(50684);
    }

    /* renamed from: a */
    public final void mo72773a() {
        if (!C66417l.C66418a.f149322a.mo105336a().booleanValue()) {
            this.f99341c.setVisibility(0);
            this.f99340b.setVisibility(8);
            this.f99339a = true;
        }
    }

    public void setOnInternalClickListener(AbstractC42582a aVar) {
        this.f99342d = aVar;
    }

    public SearchScanView(Context context) {
        this(context, null);
    }

    public void onClick(View view) {
        ClickAgent.onClick(view);
        if (this.f99342d != null) {
            int id = view.getId();
            if (id == R.id.f32) {
                this.f99342d.mo72776a(view);
            } else if (id == R.id.dp9) {
                this.f99342d.mo72777b(view);
            }
        }
    }

    public SearchScanView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private SearchScanView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(10649);
        View a = C1764a.m5927a(LayoutInflater.from(context), R.layout.awb, this, true);
        this.f99340b = (TextView) a.findViewById(R.id.f32);
        TuxIconView tuxIconView = (TuxIconView) a.findViewById(R.id.dp9);
        this.f99341c = tuxIconView;
        C62023a.m112168a(tuxIconView);
        this.f99341c.setOnClickListener(this);
        this.f99340b.setOnClickListener(this);
        MethodCollector.m26664o(10649);
    }
}
