package com.p2082ss.android.ugc.aweme.commercialize.link.video;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.video.b */
public final class View$OnClickListenerC38042b extends LinearLayout implements View.OnClickListener {

    /* renamed from: a */
    public RemoteImageView f89892a;

    /* renamed from: b */
    public TextView f89893b;

    /* renamed from: c */
    public ImageView f89894c;

    /* renamed from: d */
    public AbstractC38041a f89895d;

    static {
        Covode.recordClassIndex(45507);
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C89219l.m154721d(view, "");
        AbstractC38041a aVar = this.f89895d;
        if (aVar != null) {
            aVar.mo66018b();
        }
    }

    private View$OnClickListenerC38042b(Context context) {
        super(context, null, 0);
        MethodCollector.m26663i(13827);
        C1764a.m5927a(LayoutInflater.from(context), R.layout.sp, this, true);
        setPadding(C34728n.m70946a(5.0d), getTopPaddingOffset(), C34728n.m70946a(5.0d), getBottomPaddingOffset());
        setBackgroundResource(R.drawable.b11);
        setGravity(16);
        View findViewById = findViewById(R.id.c9t);
        C89219l.m154716b(findViewById, "");
        this.f89892a = (RemoteImageView) findViewById;
        View findViewById2 = findViewById(R.id.c9s);
        C89219l.m154716b(findViewById2, "");
        this.f89893b = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.c9u);
        C89219l.m154716b(findViewById3, "");
        this.f89894c = (ImageView) findViewById3;
        setOnClickListener(this);
        MethodCollector.m26664o(13827);
    }

    public /* synthetic */ View$OnClickListenerC38042b(Context context, byte b) {
        this(context);
    }
}
