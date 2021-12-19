package com.bytedance.ies.xelement;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.p1368a.C19058a;
import com.bytedance.ies.xelement.defaultimpl.player.impl.C19196a;
import com.bytedance.ies.xelement.p1364b.AbstractC19000e;
import com.bytedance.ies.xelement.p1364b.AbstractC19006i;
import com.lynx.tasm.behavior.AbstractC28520j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xelement.l */
public final class C19292l {

    /* renamed from: a */
    public static boolean f45590a;

    /* renamed from: b */
    public static AbstractC19000e.AbstractC19002b f45591b;

    /* renamed from: c */
    public static AbstractC19006i.AbstractC19007a f45592c = new C19058a.C19059a();

    /* renamed from: d */
    public static final C19292l f45593d = new C19292l();

    /* renamed from: e */
    private static final C19293a f45594e;

    /* renamed from: com.bytedance.ies.xelement.l$a */
    public static final class C19293a implements AbstractC19000e.AbstractC19002b {
        static {
            Covode.recordClassIndex(22072);
        }

        C19293a() {
        }

        @Override // com.bytedance.ies.xelement.p1364b.AbstractC19000e.AbstractC19002b
        /* renamed from: a */
        public final AbstractC19000e mo30180a(Context context, AbstractC28520j jVar, int i) {
            C89219l.m154719c(context, "");
            C89219l.m154719c(jVar, "");
            return new C19196a(context, jVar, i);
        }
    }

    private C19292l() {
    }

    static {
        Covode.recordClassIndex(22071);
        C19293a aVar = new C19293a();
        f45594e = aVar;
        f45591b = aVar;
    }
}
