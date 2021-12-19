package com.p2082ss.android.ugc.aweme.sticker.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.sticker.panel.C75575k;
import com.p2082ss.android.ugc.tools.C84370a;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.tools.view.style.C84981g;
import com.p2082ss.android.ugc.tools.view.widget.C85059n;
import com.p2082ss.android.ugc.tools.view.widget.p4369c.C85035a;
import java.util.HashMap;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.widget.c */
public final class C76416c {

    /* renamed from: a */
    private static final HashMap<Float, Float> f171656a = new HashMap<>();

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.widget.c$a */
    public static final class C76417a extends AbstractC89220m implements AbstractC89172b<FrameLayout.LayoutParams, C89391z> {

        /* renamed from: a */
        public static final C76417a f171657a = new C76417a();

        static {
            Covode.recordClassIndex(89380);
        }

        C76417a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(FrameLayout.LayoutParams layoutParams) {
            C89219l.m154721d(layoutParams, "");
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.widget.c$b */
    public static final class C76418b extends AbstractC89220m implements AbstractC89172b<C85035a.C85036a, C89391z> {

        /* renamed from: a */
        public static final C76418b f171658a = new C76418b();

        static {
            Covode.recordClassIndex(89381);
        }

        C76418b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C85035a.C85036a aVar) {
            C89219l.m154721d(aVar, "");
            return C89391z.f203057a;
        }
    }

    static {
        Covode.recordClassIndex(89379);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.widget.c$c */
    public static final class C76419c extends AbstractC89220m implements AbstractC89172b<C85059n.C85060a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ Context f171659a;

        /* renamed from: b */
        final /* synthetic */ float f171660b;

        /* renamed from: c */
        final /* synthetic */ float f171661c;

        /* renamed from: d */
        final /* synthetic */ C75575k f171662d;

        /* renamed from: e */
        final /* synthetic */ AbstractC89172b f171663e;

        static {
            Covode.recordClassIndex(89382);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76419c(Context context, float f, float f2, C75575k kVar, AbstractC89172b bVar) {
            super(1);
            this.f171659a = context;
            this.f171660b = f;
            this.f171661c = f2;
            this.f171662d = kVar;
            this.f171663e = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C85059n.C85060a aVar) {
            C85059n.C85060a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f190276g = (int) C76416c.m133926a(this.f171659a, this.f171660b);
            aVar2.f190277h = (int) C76416c.m133926a(this.f171659a, this.f171661c);
            aVar2.f190273d = this.f171662d.f169856a;
            aVar2.f190284o = true;
            aVar2.f190279j = this.f171662d.f169870o;
            aVar2.f190283n = this.f171662d.f169871p;
            aVar2.f190280k = this.f171662d.f169872q;
            aVar2.f190281l = this.f171662d.f169873r;
            aVar2.f190287r = this.f171662d.f169857b;
            aVar2.f190344a = this.f171662d.f169866k;
            aVar2.f190345b = this.f171662d.f169867l;
            aVar2.f190274e = (int) C76416c.m133926a(this.f171659a, this.f171662d.f169858c);
            aVar2.f190286q = this.f171662d.f169859d;
            aVar2.f190285p = this.f171662d.f169874s;
            AbstractC89172b<? super C85035a.C85036a, C89391z> bVar = this.f171662d.f169869n;
            if (bVar != null) {
                bVar.invoke(aVar2);
            }
            this.f171663e.invoke(aVar2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final C89378p<FrameLayout, C85059n> m133927a(C75575k kVar, Context context) {
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(context, "");
        return m133928a(kVar, context, kVar.f169862g, kVar.f169863h);
    }

    /* renamed from: a */
    public static final float m133926a(Context context, float f) {
        if (f < 0.0f) {
            return f;
        }
        HashMap<Float, Float> hashMap = f171656a;
        Float f2 = hashMap.get(Float.valueOf(f));
        if (f2 == null) {
            f2 = Float.valueOf(C84912r.m145930a(context, f));
            hashMap.put(Float.valueOf(f), Float.valueOf(f2.floatValue()));
        }
        C89219l.m154716b(f2, "");
        return f2.floatValue();
    }

    /* renamed from: a */
    private static /* synthetic */ C89378p m133928a(C75575k kVar, Context context, float f, float f2) {
        MethodCollector.m26663i(7093);
        float f3 = kVar.f169860e;
        float f4 = kVar.f169861f;
        float f5 = kVar.f169864i;
        float f6 = kVar.f169865j;
        C76417a aVar = C76417a.f171657a;
        C76418b bVar = C76418b.f171658a;
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(bVar, "");
        C76419c cVar = new C76419c(context, f3, f4, kVar, bVar);
        C89219l.m154721d(context, "");
        C89219l.m154721d(cVar, "");
        C85059n.C85060a aVar2 = new C85059n.C85060a(context);
        cVar.invoke(aVar2);
        C85059n a = aVar2.mo122016b();
        if (C84370a.f188623l.f188630f) {
            TextView textView = a.getTextView();
            if (textView != null) {
                textView.setTextSize(12.0f);
            }
            TextView textView2 = a.getTextView();
            if (textView2 != null) {
                C84981g.m146055a(textView2);
            }
        } else {
            TextView textView3 = a.getTextView();
            if (textView3 != null) {
                textView3.setTextSize(11.0f);
            }
            TextView textView4 = a.getTextView();
            if (textView4 != null) {
                textView4.setTypeface(Typeface.defaultFromStyle(0));
            }
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) m133926a(context, f), (int) m133926a(context, f2));
        layoutParams.gravity = 8388611;
        layoutParams.leftMargin = (int) C84912r.m145930a(context, 17.0f);
        layoutParams.rightMargin = (int) C84912r.m145930a(context, 17.0f);
        layoutParams.topMargin = (int) C84912r.m145930a(context, 9.0f);
        aVar.invoke(layoutParams);
        a.setLayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams((int) m133926a(context, f5), (int) m133926a(context, f6)));
        frameLayout.addView(a);
        C89378p a2 = C89387v.m154943a(frameLayout, a);
        MethodCollector.m26664o(7093);
        return a2;
    }
}
