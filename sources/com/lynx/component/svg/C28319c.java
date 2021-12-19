package com.lynx.component.svg;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.C28463a;
import com.lynx.tasm.behavior.p2052ui.LynxUI;

/* renamed from: com.lynx.component.svg.c */
public final class C28319c {
    static {
        Covode.recordClassIndex(34277);
    }

    /* renamed from: a */
    public static C28463a m56633a() {
        return new C28463a("svg") {
            /* class com.lynx.component.svg.C28319c.C283201 */

            static {
                Covode.recordClassIndex(34278);
            }

            @Override // com.lynx.tasm.behavior.C28463a
            /* renamed from: a */
            public final LynxUI mo16275a(AbstractC28520j jVar) {
                return new UISvg(jVar);
            }
        };
    }
}
