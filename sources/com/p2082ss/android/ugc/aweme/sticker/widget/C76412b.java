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
import com.p2082ss.android.ugc.tools.view.widget.p4369c.C85035a;
import com.p2082ss.android.ugc.tools.view.widget.p4369c.C85037b;
import java.util.HashMap;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.widget.b */
public final class C76412b {

    /* renamed from: a */
    private static final HashMap<Float, Float> f171648a = new HashMap<>();

    /* renamed from: com.ss.android.ugc.aweme.sticker.widget.b$a */
    public static final class C76413a extends AbstractC89220m implements AbstractC89172b<FrameLayout.LayoutParams, C89391z> {

        /* renamed from: a */
        public static final C76413a f171649a = new C76413a();

        static {
            Covode.recordClassIndex(89376);
        }

        C76413a() {
            super(1);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(FrameLayout.LayoutParams layoutParams) {
            C89219l.m154721d(layoutParams, "");
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.widget.b$b */
    public static final class C76414b extends AbstractC89220m implements AbstractC89172b<C85035a.C85036a, C89391z> {

        /* renamed from: a */
        public static final C76414b f171650a = new C76414b();

        static {
            Covode.recordClassIndex(89377);
        }

        C76414b() {
            super(1);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C85035a.C85036a aVar) {
            C89219l.m154721d(aVar, "");
            return C89391z.f203057a;
        }
    }

    static {
        Covode.recordClassIndex(89375);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.widget.b$c */
    public static final class C76415c extends AbstractC89220m implements AbstractC89172b<C85037b.C85038a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ Context f171651a;

        /* renamed from: b */
        final /* synthetic */ float f171652b;

        /* renamed from: c */
        final /* synthetic */ float f171653c;

        /* renamed from: d */
        final /* synthetic */ C75575k f171654d;

        /* renamed from: e */
        final /* synthetic */ AbstractC89172b f171655e;

        static {
            Covode.recordClassIndex(89378);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76415c(Context context, float f, float f2, C75575k kVar, AbstractC89172b bVar) {
            super(1);
            this.f171651a = context;
            this.f171652b = f;
            this.f171653c = f2;
            this.f171654d = kVar;
            this.f171655e = bVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C85037b.C85038a aVar) {
            C85037b.C85038a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f190276g = (int) C76412b.m133922a(this.f171651a, this.f171652b);
            aVar2.f190277h = (int) C76412b.m133922a(this.f171651a, this.f171653c);
            aVar2.f190273d = this.f171654d.f169856a;
            aVar2.f190284o = true;
            aVar2.f190279j = this.f171654d.f169870o;
            aVar2.f190283n = this.f171654d.f169871p;
            aVar2.f190280k = this.f171654d.f169872q;
            aVar2.f190281l = this.f171654d.f169873r;
            aVar2.f190287r = this.f171654d.f169857b;
            aVar2.f190302a = this.f171654d.f169866k;
            aVar2.f190303b = this.f171654d.f169867l;
            aVar2.f190274e = (int) C76412b.m133922a(this.f171651a, this.f171654d.f169858c);
            aVar2.f190286q = this.f171654d.f169859d;
            aVar2.f190285p = this.f171654d.f169874s;
            AbstractC89172b<? super C85035a.C85036a, C89391z> bVar = this.f171654d.f169869n;
            if (bVar != null) {
                bVar.invoke(aVar2);
            }
            this.f171655e.invoke(aVar2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final C89378p<FrameLayout, C85037b> m133923a(C75575k kVar, Context context) {
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(context, "");
        return m133925a(kVar, context, 0.0f, 0.0f, kVar.f169862g, kVar.f169863h, 0.0f, 0.0f, null, null, 486);
    }

    /* renamed from: a */
    public static final float m133922a(Context context, float f) {
        if (f < 0.0f) {
            return f;
        }
        HashMap<Float, Float> hashMap = f171648a;
        Float f2 = hashMap.get(Float.valueOf(f));
        if (f2 == null) {
            f2 = Float.valueOf(C84912r.m145930a(context, f));
            hashMap.put(Float.valueOf(f), Float.valueOf(f2.floatValue()));
        }
        C89219l.m154716b(f2, "");
        return f2.floatValue();
    }

    /* renamed from: a */
    private static C89378p<FrameLayout, C85037b> m133924a(C75575k kVar, Context context, float f, float f2, float f3, float f4, float f5, float f6, AbstractC89172b<? super FrameLayout.LayoutParams, C89391z> bVar, AbstractC89172b<? super C85035a.C85036a, C89391z> bVar2) {
        MethodCollector.m26663i(6247);
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(context, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
        C76415c cVar = new C76415c(context, f, f2, kVar, bVar2);
        C89219l.m154721d(context, "");
        C89219l.m154721d(cVar, "");
        C85037b.C85038a aVar = new C85037b.C85038a(context);
        cVar.invoke(aVar);
        C85037b a = aVar.mo122016b();
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
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) m133922a(context, f3), (int) m133922a(context, f4));
        layoutParams.gravity = 17;
        bVar.invoke(layoutParams);
        a.setLayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams((int) m133922a(context, f5), (int) m133922a(context, f6)));
        frameLayout.addView(a);
        C89378p<FrameLayout, C85037b> a2 = C89387v.m154943a(frameLayout, a);
        MethodCollector.m26664o(6247);
        return a2;
    }

    /* renamed from: a */
    public static /* synthetic */ C89378p m133925a(C75575k kVar, Context context, float f, float f2, float f3, float f4, float f5, float f6, AbstractC89172b bVar, AbstractC89172b bVar2, int i) {
        if ((i & 2) != 0) {
            f = kVar.f169860e;
        }
        if ((i & 4) != 0) {
            f2 = kVar.f169861f;
        }
        if ((i & 8) != 0) {
            f3 = kVar.f169862g;
        }
        if ((i & 16) != 0) {
            f4 = kVar.f169863h;
        }
        if ((i & 32) != 0) {
            f5 = kVar.f169864i;
        }
        if ((i & 64) != 0) {
            f6 = kVar.f169865j;
        }
        if ((i & 128) != 0) {
            bVar = C76413a.f171649a;
        }
        if ((i & 256) != 0) {
            bVar2 = C76414b.f171650a;
        }
        return m133924a(kVar, context, f, f2, f3, f4, f5, f6, bVar, bVar2);
    }
}
