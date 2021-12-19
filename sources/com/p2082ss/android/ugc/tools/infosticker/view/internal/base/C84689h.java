package com.p2082ss.android.ugc.tools.infosticker.view.internal.base;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.tools.view.widget.p4369c.C85037b;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.base.h */
public final class C84689h {
    static {
        Covode.recordClassIndex(98656);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.base.h$a */
    public static final class C84690a extends AbstractC89220m implements AbstractC89172b<Float, Integer> {

        /* renamed from: a */
        final /* synthetic */ int f189212a;

        /* renamed from: b */
        final /* synthetic */ int f189213b;

        /* renamed from: c */
        final /* synthetic */ Context f189214c;

        /* renamed from: d */
        final /* synthetic */ Float f189215d;

        /* renamed from: e */
        final /* synthetic */ Float f189216e;

        /* renamed from: f */
        final /* synthetic */ Float f189217f;

        /* renamed from: g */
        final /* synthetic */ Float f189218g;

        /* renamed from: h */
        final /* synthetic */ C85037b f189219h;

        static {
            Covode.recordClassIndex(98657);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84690a(int i, int i2, Context context, Float f, Float f2, Float f3, Float f4, C85037b bVar) {
            super(1);
            this.f189212a = i;
            this.f189213b = i2;
            this.f189214c = context;
            this.f189215d = f;
            this.f189216e = f2;
            this.f189217f = f3;
            this.f189218g = f4;
            this.f189219h = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Integer invoke(Float f) {
            int i;
            Float f2 = f;
            if (f2 != null) {
                f2.floatValue();
                i = (int) C84912r.m145930a(this.f189214c, f2.floatValue());
            } else {
                i = 0;
            }
            return Integer.valueOf(i);
        }
    }

    /* renamed from: a */
    public static final C89378p<FrameLayout, C85037b> m145531a(Context context) {
        C89219l.m154721d(context, "");
        Float valueOf = Float.valueOf(8.0f);
        Float valueOf2 = Float.valueOf(16.0f);
        return m145532a(context, 93.0f, 93.0f, (int) C84912r.m145930a(context, 125.0f), (int) C84912r.m145930a(context, 109.0f), valueOf2, valueOf, valueOf2, valueOf);
    }

    /* renamed from: b */
    public static final C89378p<FrameLayout, C85037b> m145533b(Context context) {
        C89219l.m154721d(context, "");
        Float valueOf = Float.valueOf(3.0f);
        return m145532a(context, 80.0f, 80.0f, (int) C84912r.m145930a(context, 86.0f), (int) C84912r.m145930a(context, 86.0f), valueOf, valueOf, valueOf, valueOf);
    }

    /* renamed from: a */
    public static final C89378p<FrameLayout, C85037b> m145532a(Context context, float f, float f2, int i, int i2, Float f3, Float f4, Float f5, Float f6) {
        MethodCollector.m26663i(12103);
        C89219l.m154721d(context, "");
        C85037b.C85038a aVar = new C85037b.C85038a(context);
        aVar.f190276g = (int) C84912r.m145930a(context, f);
        aVar.f190277h = (int) C84912r.m145930a(context, f2);
        aVar.f190279j = false;
        aVar.f190284o = false;
        aVar.f190278i = 2131232951;
        C85037b a = aVar.mo122016b();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        a.setLayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(i, i2));
        C84690a aVar2 = new C84690a(i, i2, context, f3, f4, f5, f6, a);
        frameLayout.setPadding(((Number) aVar2.invoke(f3)).intValue(), ((Number) aVar2.invoke(f4)).intValue(), ((Number) aVar2.invoke(f5)).intValue(), ((Number) aVar2.invoke(f6)).intValue());
        frameLayout.addView(a);
        C89378p<FrameLayout, C85037b> a2 = C89387v.m154943a(frameLayout, a);
        MethodCollector.m26664o(12103);
        return a2;
    }
}
