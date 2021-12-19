package com.lynx.tasm.behavior.shadow.text;

import android.graphics.Typeface;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.AbstractC28525m;
import com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode;
import com.lynx.tasm.behavior.shadow.text.TextShadowNode;
import com.lynx.tasm.p2055d.C28754c;
import java.util.List;

public class InlineTextShadowNode extends BaseTextShadowNode {

    /* renamed from: a */
    private int f67170a;

    static {
        Covode.recordClassIndex(34556);
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    /* renamed from: a */
    public final boolean mo30992a() {
        return true;
    }

    @AbstractC28525m(mo49059a = "background-color", mo49063e = 0)
    public void setBackgroundColor(int i) {
        this.f67170a = i;
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode
    /* renamed from: a */
    public final void mo49125a(int i, int i2, List<BaseTextShadowNode.C28548b> list) {
        super.mo49125a(i, i2, list);
        list.add(new BaseTextShadowNode.C28548b(i, i2, new BackgroundColorSpan(this.f67170a)));
        list.add(new BaseTextShadowNode.C28548b(i, i2, new C28556f(this.f67135h, this.f67141n)));
        if (this.f67170a != 0) {
            list.add(new BaseTextShadowNode.C28548b(i, i2, new BackgroundColorSpan(this.f67170a)));
        }
        if (this.f67161o.f67204n != 1.0E21f) {
            list.add(new BaseTextShadowNode.C28548b(i, i2, new AbsoluteSizeSpan(Math.round(this.f67161o.f67204n))));
        }
        if (!TextUtils.isEmpty(this.f67161o.f67207q)) {
            String str = this.f67161o.f67207q;
            int a = this.f67161o.mo49178a();
            Typeface a2 = C28573r.m57141a(mo49108h(), str, a);
            if (a2 == null) {
                C28754c.C28765a.f67843a.mo49873a(mo49108h(), str, a, new TextShadowNode.C28550a(this));
                a2 = Typeface.defaultFromStyle(this.f67161o.mo49178a());
            }
            list.add(new BaseTextShadowNode.C28548b(i, i2, new C28557g(a2)));
        }
    }
}
