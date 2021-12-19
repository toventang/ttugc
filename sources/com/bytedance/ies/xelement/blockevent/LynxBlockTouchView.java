package com.bytedance.ies.xelement.blockevent;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.p2052ui.view.C28698a;
import com.lynx.tasm.behavior.p2052ui.view.UISimpleView;
import p4600h.p4611f.p4613b.C89219l;

public final class LynxBlockTouchView extends UISimpleView<C28698a> {
    static {
        Covode.recordClassIndex(21779);
    }

    /* renamed from: com.bytedance.ies.xelement.blockevent.LynxBlockTouchView$a */
    public static final class C19023a extends C28698a {
        static {
            Covode.recordClassIndex(21782);
        }

        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return true;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19023a(Context context) {
            super(context);
            C89219l.m154719c(context, "");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxBlockTouchView(Context context) {
        super(context);
        C89219l.m154719c(context, "");
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI
    public final /* synthetic */ View createView(Context context) {
        C89219l.m154719c(context, "");
        return new C19023a(context);
    }
}
