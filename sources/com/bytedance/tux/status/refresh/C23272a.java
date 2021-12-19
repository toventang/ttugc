package com.bytedance.tux.status.refresh;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.p1722h.C23160g;
import com.bytedance.tux.status.loading.TuxDualBallView;
import com.bytedance.tux.widget.spring.p1732b.AbstractC23424a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.bytedance.tux.status.refresh.a */
public final class C23272a extends FrameLayout implements AbstractC23424a {

    /* renamed from: a */
    private boolean f55173a;

    /* renamed from: b */
    private final TuxDualBallView f55174b;

    /* renamed from: c */
    private float f55175c;

    /* renamed from: d */
    private int f55176d;

    /* renamed from: e */
    private final AbstractC89244h f55177e;

    static {
        Covode.recordClassIndex(27222);
    }

    private final C23160g getVibrationHelper() {
        return (C23160g) this.f55177e.getValue();
    }

    /* renamed from: com.bytedance.tux.status.refresh.a$a */
    static final class C23273a extends AbstractC89220m implements AbstractC89171a<C23160g> {

        /* renamed from: a */
        final /* synthetic */ Context f55178a;

        static {
            Covode.recordClassIndex(27223);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23273a(Context context) {
            super(0);
            this.f55178a = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C23160g invoke() {
            return new C23160g(this.f55178a);
        }
    }

    @Override // com.bytedance.tux.widget.spring.p1732b.AbstractC23424a
    public final int getActualHeight() {
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        return C89241a.m154730a(TypedValue.applyDimension(1, 44.0f, system.getDisplayMetrics()));
    }

    @Override // com.bytedance.tux.widget.spring.p1732b.AbstractC23424a
    /* renamed from: a */
    public final void mo37904a(boolean z) {
        this.f55173a = z;
        if (z) {
            this.f55174b.mo37884b();
        } else {
            this.f55174b.mo37885c();
        }
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        this.f55174b.setVisibility(i);
    }

    @Override // com.bytedance.tux.widget.spring.p1732b.AbstractC23424a
    /* renamed from: b */
    public final void mo37905b(boolean z) {
        if (z) {
            setVisibility(4);
            this.f55174b.mo37885c();
            return;
        }
        setVisibility(0);
        if (this.f55173a) {
            this.f55174b.mo37884b();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C23272a(Context context) {
        super(context, null, 0);
        C89219l.m154719c(context, "");
        MethodCollector.m26663i(7864);
        TuxDualBallView tuxDualBallView = new TuxDualBallView(context, (AttributeSet) null, 6);
        this.f55174b = tuxDualBallView;
        this.f55177e = C89250i.m154773a((AbstractC89171a) new C23273a(context));
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        int a = C89241a.m154730a(TypedValue.applyDimension(1, 36.0f, system.getDisplayMetrics()));
        Resources system2 = Resources.getSystem();
        C89219l.m154709a((Object) system2, "");
        addView(tuxDualBallView, new FrameLayout.LayoutParams(a, C89241a.m154730a(TypedValue.applyDimension(1, 36.0f, system2.getDisplayMetrics())), 17));
        MethodCollector.m26664o(7864);
    }

    public /* synthetic */ C23272a(Context context, byte b) {
        this(context);
    }

    @Override // com.bytedance.tux.widget.spring.p1732b.AbstractC23424a
    /* renamed from: a */
    public final void mo37903a(int i, boolean z) {
        boolean z2;
        if (!this.f55173a) {
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            float applyDimension = ((float) i) / TypedValue.applyDimension(1, 44.0f, system.getDisplayMetrics());
            this.f55175c = applyDimension;
            int i2 = (int) applyDimension;
            TuxDualBallView tuxDualBallView = this.f55174b;
            float abs = Math.abs(applyDimension - ((float) i2));
            if ((i2 & 1) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!tuxDualBallView.f55143c) {
                tuxDualBallView.mo37883a();
            }
            tuxDualBallView.f55141a = abs;
            tuxDualBallView.f55144d = false;
            tuxDualBallView.f55142b = false;
            tuxDualBallView.f55145e = z2;
            tuxDualBallView.postInvalidate();
            int min = Math.min(i, this.f55176d);
            int max = Math.max(i, this.f55176d);
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            int i3 = -C89241a.m154730a(TypedValue.applyDimension(1, 44.0f, system2.getDisplayMetrics()));
            if (min <= i3 && max >= i3 && !z) {
                if (Build.VERSION.SDK_INT >= 29) {
                    getVibrationHelper().mo37653b();
                } else {
                    Context context = getContext();
                    C89219l.m154709a((Object) context, "");
                    new C23160g(context).mo37652a();
                }
            }
        }
        this.f55176d = i;
    }
}
