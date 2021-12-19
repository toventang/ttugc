package com.p2082ss.android.ugc.aweme.ecommerce.review.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.review.view.c */
public final class C45211c extends FrameLayout {

    /* renamed from: a */
    final TextView f105403a;

    /* renamed from: b */
    final TextView f105404b;

    /* renamed from: c */
    public boolean f105405c;

    /* renamed from: d */
    private final View f105406d;

    static {
        Covode.recordClassIndex(53657);
    }

    public final TextView getPre() {
        return this.f105403a;
    }

    public final View getStar() {
        return this.f105406d;
    }

    public final TextView getSuf() {
        return this.f105404b;
    }

    /* renamed from: a */
    public final void mo76321a() {
        this.f105405c = false;
        setBackgroundResource(R.drawable.zf);
        this.f105403a.setTextColor(C0643b.m2378c(getContext(), R.color.bx));
        this.f105404b.setTextColor(C0643b.m2378c(getContext(), R.color.bx));
    }

    public final void setActive(boolean z) {
        this.f105405c = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C45211c(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(7606);
        C1764a.m5927a(LayoutInflater.from(context), R.layout.ql, this, true);
        setBackgroundResource(R.drawable.zf);
        this.f105403a = (TextView) findViewById(R.id.d58);
        this.f105404b = (TextView) findViewById(R.id.ebe);
        this.f105406d = findViewById(R.id.e64);
        MethodCollector.m26664o(7606);
    }

    public /* synthetic */ C45211c(Context context, byte b) {
        this(context);
    }
}
