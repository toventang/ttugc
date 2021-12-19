package com.p2082ss.android.ugc.aweme.kids.homepage.bottomview.p3354a;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.homepage.bottomview.a.c */
public final class C57627c extends AbstractC57625a {

    /* renamed from: b */
    private ImageView f131532b;

    /* renamed from: c */
    private TextView f131533c;

    /* renamed from: d */
    private final int f131534d;

    /* renamed from: e */
    private final int f131535e;

    /* renamed from: f */
    private final int f131536f;

    /* renamed from: g */
    private final int f131537g;

    static {
        Covode.recordClassIndex(67588);
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.homepage.bottomview.p3354a.AbstractC57625a
    /* renamed from: a */
    public final void mo94924a() {
    }

    public final int getDefaultDarkRes() {
        return this.f131534d;
    }

    public final int getDefaultLightRes() {
        return this.f131535e;
    }

    public final int getSelectedLightRes() {
        return this.f131537g;
    }

    public final int getSelectedRes() {
        return this.f131536f;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.homepage.bottomview.p3354a.AbstractC57625a
    /* renamed from: a */
    public final void mo94925a(boolean z) {
        if (isSelected()) {
            if (z) {
                this.f131532b.setImageDrawable(C0643b.m2369a(getContext(), this.f131537g));
                this.f131533c.setTextColor(C0643b.m2378c(getContext(), R.color.a9));
                return;
            }
            this.f131532b.setImageDrawable(C0643b.m2369a(getContext(), this.f131536f));
            this.f131533c.setTextColor(C0643b.m2378c(getContext(), R.color.bx));
        } else if (z) {
            this.f131532b.setImageDrawable(C0643b.m2369a(getContext(), this.f131534d));
            this.f131533c.setTextColor(C0643b.m2378c(getContext(), R.color.aa));
        } else {
            this.f131532b.setImageDrawable(C0643b.m2369a(getContext(), this.f131535e));
            this.f131533c.setTextColor(C0643b.m2378c(getContext(), R.color.c6));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57627c(Context context, String str, int i, int i2, int i3, int i4) {
        super(context);
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        MethodCollector.m26663i(3180);
        this.f131534d = i;
        this.f131535e = i2;
        this.f131536f = i3;
        this.f131537g = i4;
        View.inflate(context, R.layout.ad5, this);
        View findViewById = findViewById(R.id.bfh);
        C89219l.m154716b(findViewById, "");
        this.f131532b = (ImageView) findViewById;
        View findViewById2 = findViewById(R.id.bfi);
        C89219l.m154716b(findViewById2, "");
        this.f131533c = (TextView) findViewById2;
        this.f131532b.setImageDrawable(C0643b.m2369a(context, i));
        this.f131533c.setText(str);
        setBackgroundResource(R.drawable.ayo);
        MethodCollector.m26664o(3180);
    }
}
