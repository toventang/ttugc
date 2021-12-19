package com.bytedance.ies.xelement.text.text;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.p2052ui.text.AndroidText;
import com.lynx.tasm.behavior.p2052ui.text.UIText;
import p4600h.p4611f.p4613b.C89219l;

public final class LynxTextUI extends UIText {
    static {
        Covode.recordClassIndex(22243);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxTextUI(AbstractC28520j jVar) {
        super(jVar);
        C89219l.m154719c(jVar, "");
    }

    @Override // com.lynx.tasm.behavior.p2052ui.text.UIText
    /* renamed from: a */
    public final AndroidText createView(Context context) {
        C89219l.m154719c(context, "");
        return new AndroidText(context);
    }
}
