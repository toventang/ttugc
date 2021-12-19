package com.p2082ss.android.p2092ad.splash.core.p2105j;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.p2092ad.splash.p2109f.C29661o;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ad.splash.core.j.b */
public final class C29528b extends LinearLayout {

    /* renamed from: a */
    private TextView f70345a;

    /* renamed from: b */
    private ImageView f70346b;

    static {
        Covode.recordClassIndex(35922);
    }

    public final void setText(String str) {
        this.f70345a.setText(str);
    }

    public C29528b(Context context) {
        super(context);
        MethodCollector.m26663i(12619);
        TextView textView = new TextView(context);
        this.f70345a = textView;
        textView.setTextSize(1, 15.0f);
        this.f70345a.setTextColor(-1);
        ImageView imageView = new ImageView(context);
        this.f70346b = imageView;
        imageView.setImageResource(R.drawable.bkv);
        this.f70346b.setPadding((int) C29661o.m59767a(context, 8.0f), 0, 0, 0);
        addView(this.f70345a);
        addView(this.f70346b);
        setBackgroundResource(R.drawable.bkw);
        setGravity(17);
        MethodCollector.m26664o(12619);
    }
}
