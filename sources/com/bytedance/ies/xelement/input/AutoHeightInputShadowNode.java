package com.bytedance.ies.xelement.input;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.p1392b.C19386b;
import com.lynx.react.bridge.AbstractC28367a;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.behavior.AbstractC28525m;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.shadow.C28541f;
import com.lynx.tasm.behavior.shadow.EnumC28540e;
import com.lynx.tasm.behavior.shadow.LayoutNode;
import com.lynx.tasm.behavior.shadow.text.TextShadowNode;
import com.lynx.tasm.utils.C28930n;
import p4600h.p4611f.p4613b.C89219l;

public class AutoHeightInputShadowNode extends TextShadowNode {
    static {
        Covode.recordClassIndex(22024);
    }

    @AbstractC28525m(mo49059a = C19386b.f45895b)
    public final void setFontTextSize(AbstractC28367a aVar) {
        if (aVar == null) {
            setFontSize(C28930n.m57954a("14px", 0.0f, 0.0f));
            return;
        }
        ReadableType h = aVar.mo48559h();
        if (h != null) {
            int i = C19272a.f45546a[h.ordinal()];
            if (i == 1) {
                setFontSize((float) aVar.mo48554c());
            } else if (i == 2) {
                setFontSize(C28930n.m57954a(aVar.mo48556e(), 0.0f, 0.0f));
            }
        }
    }

    @Override // com.lynx.tasm.behavior.shadow.AbstractC28539d, com.lynx.tasm.behavior.shadow.text.TextShadowNode
    /* renamed from: a */
    public final long mo30603a(LayoutNode layoutNode, float f, EnumC28540e eVar, float f2, EnumC28540e eVar2) {
        C89219l.m154719c(layoutNode, "");
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(eVar2, "");
        LynxBaseUI a = mo49108h().mo49034a(this.f67135h);
        if (!(a instanceof LynxTextAreaView)) {
            a = null;
        }
        LynxTextAreaView lynxTextAreaView = (LynxTextAreaView) a;
        if (lynxTextAreaView == null) {
            return C28541f.m57091a();
        }
        return C28541f.m57092a(f, (float) Math.max(lynxTextAreaView.f45495o, lynxTextAreaView.f45529D));
    }
}
