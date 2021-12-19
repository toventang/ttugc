package com.bytedance.android.livesdk.browser.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.C1764a;
import com.bytedance.android.live.core.widget.HSAnimImageView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.facebook.drawee.p1845a.p1846a.C24185e;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.browser.view.a */
public final class C7243a extends FrameLayout {

    /* renamed from: a */
    private HSImageView f18026a;

    /* renamed from: b */
    private HSImageView f18027b;

    static {
        Covode.recordClassIndex(7991);
    }

    public C7243a(Context context) {
        super(context);
        MethodCollector.m26663i(9019);
        View a = C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.beo, this, true);
        this.f18026a = (HSImageView) a.findViewById(R.id.jv);
        this.f18027b = (HSImageView) a.findViewById(R.id.jw);
        C24185e a2 = C24182c.m45843b().mo39797a(HSAnimImageView.m9804a("tiktok_live_basic_resource", "ttlive_ic_loading_center.webp"));
        a2.f57306j = true;
        this.f18026a.setController(a2.mo39827e());
        C24185e a3 = C24182c.m45843b().mo39797a(HSAnimImageView.m9804a("tiktok_live_basic_resource", "ttlive_ic_loading_point.webp"));
        a3.f57306j = true;
        this.f18027b.setController(a3.mo39827e());
        MethodCollector.m26664o(9019);
    }
}
