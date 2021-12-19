package com.lynx.tasm.behavior.shadow.text;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.AbstractC28525m;
import com.lynx.tasm.behavior.p2052ui.text.AbstractC28676a;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode;
import com.lynx.tasm.p2054c.C28723a;
import com.lynx.tasm.p2054c.C28725c;
import java.util.List;
import java.util.Map;

public abstract class AbsInlineImageShadowNode extends ShadowNode {

    /* renamed from: a */
    private boolean f67156a;

    /* renamed from: b */
    private boolean f67157b;

    static {
        Covode.recordClassIndex(34548);
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    /* renamed from: a */
    public final boolean mo30992a() {
        return true;
    }

    /* renamed from: b */
    public abstract AbstractC28676a mo49118b();

    @AbstractC28525m(mo49059a = "mode")
    public abstract void setMode(String str);

    @AbstractC28525m(mo49059a = "src")
    public abstract void setSource(String str);

    /* renamed from: a */
    public final void mo49117a(String str) {
        if (this.f67157b) {
            C28725c cVar = new C28725c(this.f67135h, "error");
            cVar.mo49838a("errMsg", str);
            mo49108h().f67064e.mo49834a(cVar);
        }
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    /* renamed from: a */
    public final void mo49101a(Map<String, C28723a> map) {
        super.mo49101a(map);
        if (map != null) {
            this.f67156a = map.containsKey("load");
            this.f67157b = map.containsKey("error");
        }
    }

    /* renamed from: a */
    public final void mo49115a(int i, int i2) {
        if (this.f67156a) {
            C28725c cVar = new C28725c(this.f67135h, "load");
            cVar.mo49838a("height", Integer.valueOf(i2));
            cVar.mo49838a("width", Integer.valueOf(i));
            mo49108h().f67064e.mo49834a(cVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo49116a(int i, int i2, List<BaseTextShadowNode.C28548b> list) {
        list.add(new BaseTextShadowNode.C28548b(i, i2, mo49118b()));
        list.add(new BaseTextShadowNode.C28548b(i, i2, new C28556f(this.f67135h, this.f67141n)));
    }
}
