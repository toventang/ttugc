package com.bytedance.android.livesdk.feed.banner.p525a;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.feed.AbstractC8654p;
import com.bytedance.android.livesdk.model.C9594m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.feed.banner.a.a */
public final class C8500a {

    /* renamed from: a */
    HSImageView f21021a;

    /* renamed from: b */
    TextView f21022b;

    /* renamed from: c */
    TextView f21023c;

    /* renamed from: d */
    Context f21024d;

    /* renamed from: e */
    C9594m f21025e;

    /* renamed from: f */
    String f21026f;

    /* renamed from: g */
    int f21027g;

    /* renamed from: h */
    private AbstractC8654p f21028h;

    static {
        Covode.recordClassIndex(9354);
    }

    public C8500a(View view, Context context, String str, AbstractC8654p pVar, int i) {
        this.f21021a = (HSImageView) view.findViewById(R.id.bky);
        this.f21022b = (TextView) view.findViewById(R.id.text);
        this.f21023c = (TextView) view.findViewById(R.id.c2j);
        this.f21021a.setOnClickListener(new View$OnClickListenerC8501b(this));
        this.f21024d = context;
        this.f21026f = str;
        this.f21028h = pVar;
        this.f21027g = i;
    }
}
