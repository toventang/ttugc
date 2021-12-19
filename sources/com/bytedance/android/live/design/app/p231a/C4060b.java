package com.bytedance.android.live.design.app.p231a;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.design.widget.p234a.C4121a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.design.app.a.b */
public final class C4060b implements AbstractC4059a {

    /* renamed from: a */
    private final CharSequence f11252a;

    /* renamed from: b */
    private final View.OnClickListener f11253b;

    static {
        Covode.recordClassIndex(4604);
    }

    /* renamed from: com.bytedance.android.live.design.app.a.b$a */
    public static final class C4061a {

        /* renamed from: a */
        public CharSequence f11254a;

        /* renamed from: b */
        public View.OnClickListener f11255b;

        static {
            Covode.recordClassIndex(4605);
        }

        /* renamed from: a */
        public final C4060b mo9509a() {
            return new C4060b(this, (byte) 0);
        }

        /* renamed from: a */
        public final C4061a mo9508a(Context context) {
            if (context != null) {
                this.f11254a = context.getResources().getString(R.string.e3n);
            }
            return this;
        }
    }

    private C4060b(C4061a aVar) {
        this.f11252a = aVar.f11254a;
        this.f11253b = aVar.f11255b;
    }

    @Override // com.bytedance.android.live.design.app.p231a.AbstractC4059a
    /* renamed from: a */
    public final View mo9507a(Context context) {
        MethodCollector.m26663i(9245);
        C4121a aVar = new C4121a(context);
        aVar.setText(this.f11252a);
        aVar.setOnClickListener(this.f11253b);
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        frameLayout.addView(aVar, layoutParams);
        MethodCollector.m26664o(9245);
        return frameLayout;
    }

    /* synthetic */ C4060b(C4061a aVar, byte b) {
        this(aVar);
    }
}
