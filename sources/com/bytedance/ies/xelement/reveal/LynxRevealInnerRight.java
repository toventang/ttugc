package com.bytedance.ies.xelement.reveal;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.p2052ui.UIGroup;
import com.lynx.tasm.behavior.p2052ui.view.C28698a;
import p4600h.p4611f.p4613b.C89219l;

public final class LynxRevealInnerRight extends UIGroup<C28698a> {

    /* renamed from: a */
    public static final C19404a f45971a = new C19404a((byte) 0);

    static {
        Covode.recordClassIndex(22205);
    }

    /* renamed from: com.bytedance.ies.xelement.reveal.LynxRevealInnerRight$a */
    public static final class C19404a {
        static {
            Covode.recordClassIndex(22208);
        }

        private C19404a() {
        }

        public /* synthetic */ C19404a(byte b) {
            this();
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI
    public final /* synthetic */ View createView(Context context) {
        return new C28698a(context);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxRevealInnerRight(AbstractC28520j jVar) {
        super(jVar);
        C89219l.m154719c(jVar, "");
    }
}
