package com.bytedance.ies.bullet.service.popup.p1182a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.service.popup.AbstractC16876a;
import com.bytedance.ies.bullet.service.popup.round.RoundFrameLayout;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.popup.a.f */
public final class C16912f extends FrameLayout implements AbstractC16915g, AbstractC16917i {

    /* renamed from: c */
    public static final C16913a f40204c = new C16913a((byte) 0);

    /* renamed from: a */
    public AbstractC89171a<C89391z> f40205a;

    /* renamed from: b */
    public C16910e f40206b;

    /* renamed from: d */
    private HashMap f40207d;

    static {
        Covode.recordClassIndex(19352);
    }

    /* renamed from: a */
    private View m31147a(int i) {
        if (this.f40207d == null) {
            this.f40207d = new HashMap();
        }
        View view = (View) this.f40207d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f40207d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: com.bytedance.ies.bullet.service.popup.a.f$a */
    public static final class C16913a {
        static {
            Covode.recordClassIndex(19353);
        }

        private C16913a() {
        }

        public /* synthetic */ C16913a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C16912f m31154a(Context context, View view, C16910e eVar, AbstractC89171a<C89391z> aVar) {
            C89219l.m154719c(context, "");
            C89219l.m154719c(view, "");
            C89219l.m154719c(eVar, "");
            C16912f fVar = new C16912f(context, (byte) 0);
            fVar.mo26724a(eVar);
            fVar.mo26723a(context, view);
            fVar.f40205a = aVar;
            fVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            return fVar;
        }
    }

    @Override // com.bytedance.ies.bullet.service.popup.p1182a.AbstractC16917i
    /* renamed from: c */
    public final void mo26690c() {
        setVisibility(0);
    }

    @Override // com.bytedance.ies.bullet.service.popup.p1182a.AbstractC16917i
    /* renamed from: d */
    public final void mo26691d() {
        AbstractC89171a<C89391z> aVar = this.f40205a;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.bytedance.ies.bullet.service.popup.p1182a.AbstractC16917i
    /* renamed from: e */
    public final void mo26692e() {
        setVisibility(4);
    }

    /* renamed from: a */
    public final void mo26724a(C16910e eVar) {
        C89219l.m154719c(eVar, "");
        this.f40206b = eVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.bullet.service.popup.a.f$b */
    public static final class View$OnClickListenerC16914b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C16912f f40208a;

        static {
            Covode.recordClassIndex(19354);
        }

        View$OnClickListenerC16914b(C16912f fVar) {
            this.f40208a = fVar;
        }

        public final void onClick(View view) {
            AbstractC89171a<C89391z> aVar;
            AbstractC16876a.AbstractC16878b bVar = this.f40208a.f40206b.f40203f;
            if (bVar != null && bVar.mo26672a()) {
                C16912f fVar = this.f40208a;
                if (fVar.f40205a != null && (aVar = fVar.f40205a) != null) {
                    aVar.invoke();
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C16912f(Context context) {
        super(context, null, 0);
        C89219l.m154719c(context, "");
        MethodCollector.m26663i(1918);
        this.f40206b = new C16910e();
        MethodCollector.m26664o(1918);
    }

    public /* synthetic */ C16912f(Context context, byte b) {
        this(context);
    }

    /* renamed from: a */
    public final void mo26723a(Context context, View view) {
        int i;
        MethodCollector.m26663i(1888);
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        LayoutInflater.from(applicationContext).inflate(R.layout.m9, this);
        ((FrameLayout) m31147a(R.id.acj)).setOnClickListener(new View$OnClickListenerC16914b(this));
        RoundFrameLayout roundFrameLayout = (RoundFrameLayout) m31147a(R.id.ad5);
        C89219l.m154709a((Object) roundFrameLayout, "");
        ViewGroup.LayoutParams layoutParams = roundFrameLayout.getLayoutParams();
        if (layoutParams != null) {
            int i2 = -1;
            if (this.f40206b.f40201d > 0) {
                i = this.f40206b.f40201d;
            } else {
                i = -1;
            }
            layoutParams.height = i;
            if (this.f40206b.f40200c > 0) {
                i2 = this.f40206b.f40200c;
            }
            layoutParams.width = i2;
        }
        ((RoundFrameLayout) m31147a(R.id.ad5)).setRadius(this.f40206b.f40202e);
        ((RoundFrameLayout) m31147a(R.id.ad5)).addView(view);
        mo26687a(false, 0, null);
        MethodCollector.m26664o(1888);
    }

    @Override // com.bytedance.ies.bullet.service.popup.p1182a.AbstractC16915g
    /* renamed from: a */
    public final void mo26687a(boolean z, int i, Integer num) {
        C16916h hVar;
        ViewGroup.LayoutParams layoutParams;
        int i2;
        RoundFrameLayout roundFrameLayout;
        ViewGroup.LayoutParams layoutParams2;
        C16910e eVar = this.f40206b;
        if (z) {
            hVar = eVar.f40198a;
        } else {
            hVar = eVar.f40199b;
        }
        RoundFrameLayout roundFrameLayout2 = (RoundFrameLayout) m31147a(R.id.ad5);
        C89219l.m154709a((Object) roundFrameLayout2, "");
        ViewGroup.LayoutParams layoutParams3 = roundFrameLayout2.getLayoutParams();
        if (!(layoutParams3 instanceof FrameLayout.LayoutParams)) {
            layoutParams3 = null;
        }
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
        if (layoutParams4 != null) {
            String str = hVar.f40209a;
            int hashCode = str.hashCode();
            if (hashCode != -1383228885) {
                if (hashCode != -1364013995) {
                    if (hashCode == 115029 && str.equals("top")) {
                        layoutParams4.gravity = 49;
                        layoutParams4.topMargin = hVar.f40210b;
                    }
                } else if (str.equals("center")) {
                    layoutParams4.gravity = 17;
                    layoutParams4.bottomMargin = 0;
                    layoutParams4.topMargin = 0;
                }
            } else if (str.equals("bottom")) {
                layoutParams4.gravity = 81;
                layoutParams4.bottomMargin = hVar.f40210b;
            }
        }
        if (!z) {
            RoundFrameLayout roundFrameLayout3 = (RoundFrameLayout) m31147a(R.id.ad5);
            if (!(roundFrameLayout3 == null || (layoutParams = roundFrameLayout3.getLayoutParams()) == null)) {
                if (this.f40206b.f40201d > 0) {
                    i2 = this.f40206b.f40201d;
                } else {
                    i2 = -1;
                }
                layoutParams.height = i2;
            }
        } else if (!(this.f40206b.f40201d <= 0 || num == null || (roundFrameLayout = (RoundFrameLayout) m31147a(R.id.ad5)) == null || (layoutParams2 = roundFrameLayout.getLayoutParams()) == null)) {
            layoutParams2.height = Math.min(num.intValue(), this.f40206b.f40201d);
        }
        setPadding(0, 0, 0, i);
        requestLayout();
    }
}
