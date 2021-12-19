package com.lynx.tasm.behavior.shadow.text;

import android.text.SpannableStringBuilder;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.AbstractC28525m;
import com.lynx.tasm.behavior.PaintingContext;
import com.lynx.tasm.behavior.shadow.AbstractC28539d;
import com.lynx.tasm.behavior.shadow.C28541f;
import com.lynx.tasm.behavior.shadow.C28542g;
import com.lynx.tasm.behavior.shadow.EnumC28540e;
import com.lynx.tasm.behavior.shadow.LayoutNode;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode;
import com.lynx.tasm.behavior.shadow.text.C28566n;
import com.lynx.tasm.behavior.shadow.text.C28568o;
import com.lynx.tasm.behavior.shadow.text.C28573r;
import com.lynx.tasm.behavior.utils.C28715e;
import com.lynx.tasm.p2055d.C28754c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class TextShadowNode extends BaseTextShadowNode implements AbstractC28539d {

    /* renamed from: a */
    private boolean f67174a;

    /* renamed from: r */
    public C28566n f67175r;

    /* renamed from: s */
    public CharSequence f67176s;

    static {
        Covode.recordClassIndex(34564);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.behavior.shadow.text.TextShadowNode$a */
    public static class C28550a implements C28573r.AbstractC28575b {

        /* renamed from: a */
        private WeakReference<ShadowNode> f67177a;

        static {
            Covode.recordClassIndex(34566);
        }

        @Override // com.lynx.tasm.behavior.shadow.text.C28573r.AbstractC28575b
        /* renamed from: a */
        public final void mo49157a() {
            ShadowNode shadowNode = this.f67177a.get();
            if (shadowNode != null) {
                shadowNode.mo49092d();
            }
        }

        C28550a(ShadowNode shadowNode) {
            this.f67177a = new WeakReference<>(shadowNode);
        }
    }

    public TextShadowNode() {
        if (!mo30992a()) {
            mo49090a(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo30994b() {
        if (mo49106f() != 1 || !(mo49103b(0) instanceof RawTextShadowNode) || !C28542g.m57093a(this.f67161o.f67201k)) {
            return false;
        }
        return true;
    }

    @Override // com.lynx.tasm.behavior.shadow.LayoutNode
    /* renamed from: c */
    public final void mo49091c() {
        if (!mo30992a()) {
            this.f67175r = null;
            if (mo30994b()) {
                RawTextShadowNode rawTextShadowNode = (RawTextShadowNode) mo49103b(0);
                String str = rawTextShadowNode.f67171a;
                if (rawTextShadowNode.f67172b) {
                    this.f67176s = C28715e.m57502a(str);
                } else {
                    this.f67176s = C28715e.m57503b(str);
                }
                if (this.f67176s != null) {
                    ArrayList<BaseTextShadowNode.C28548b> arrayList = new ArrayList();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append(this.f67176s);
                    mo49125a(0, this.f67176s.length(), arrayList);
                    for (BaseTextShadowNode.C28548b bVar : arrayList) {
                        bVar.mo49146a(spannableStringBuilder);
                    }
                    this.f67176s = spannableStringBuilder;
                    return;
                }
                return;
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            ArrayList arrayList2 = new ArrayList();
            mo30991a(spannableStringBuilder2, arrayList2);
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                arrayList2.get(size).mo49146a(spannableStringBuilder2);
            }
            this.f67176s = spannableStringBuilder2;
        }
    }

    @AbstractC28525m(mo49059a = "tail-color-convert")
    public void setEnableTailColorConvert(boolean z) {
        this.f67174a = z;
        mo49092d();
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    /* renamed from: a */
    public void mo26068a(PaintingContext paintingContext) {
        super.mo26068a(paintingContext);
        if (this.f67175r != null) {
            C28572q qVar = new C28572q(this.f67175r.f67214a, this.f67161o.f67205o);
            paintingContext.f66940a.mo48996a(this.f67135h, qVar);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode
    /* renamed from: a */
    public final void mo49125a(int i, int i2, List<BaseTextShadowNode.C28548b> list) {
        super.mo49125a(i, i2, list);
        if (this.f67161o.f67193c == null) {
            list.add(new BaseTextShadowNode.C28548b(i, i2, new C28558h(-16777216)));
        }
    }

    @Override // com.lynx.tasm.behavior.shadow.LayoutNode
    /* renamed from: a */
    public final void mo49089a(int i, int i2, int i3, int i4) {
        super.mo49089a(i, i2, i3, i4);
        if (this.f67175r == null) {
            mo30603a(this, (float) i3, EnumC28540e.EXACTLY, (float) i4, EnumC28540e.EXACTLY);
        }
    }

    @Override // com.lynx.tasm.behavior.shadow.AbstractC28539d
    /* renamed from: a */
    public long mo30603a(LayoutNode layoutNode, float f, EnumC28540e eVar, float f2, EnumC28540e eVar2) {
        int i;
        this.f67175r = null;
        if (eVar != EnumC28540e.UNDEFINED && eVar2 != EnumC28540e.UNDEFINED && f == 0.0f && f2 == 0.0f) {
            return C28541f.m57092a(0.0f, 0.0f);
        }
        CharSequence charSequence = this.f67176s;
        if (charSequence == null) {
            return C28541f.m57092a(0.0f, 0.0f);
        }
        C28561k kVar = this.f67161o;
        C28561k kVar2 = new C28561k();
        kVar2.f67191a = kVar.f67191a;
        kVar2.f67192b = kVar.f67192b;
        kVar2.f67193c = kVar.f67193c;
        kVar2.f67194d = kVar.f67194d;
        kVar2.f67196f = kVar.f67196f;
        kVar2.f67197g = kVar.f67197g;
        kVar2.f67198h = kVar.f67198h;
        kVar2.f67199i = kVar.f67199i;
        kVar2.f67200j = kVar.f67200j;
        kVar2.f67201k = kVar.f67201k;
        kVar2.f67202l = kVar.f67202l;
        kVar2.f67203m = kVar.f67203m;
        kVar2.f67204n = kVar.f67204n;
        kVar2.f67205o = kVar.f67205o;
        kVar2.f67206p = kVar.f67206p;
        kVar2.f67207q = kVar.f67207q;
        kVar2.f67208r = kVar.f67208r;
        kVar2.f67209s = kVar.f67209s;
        kVar2.f67195e = kVar.f67195e;
        C28570p pVar = new C28570p(charSequence, kVar2, eVar, eVar2, f, f2, this.f67163q, this.f67174a);
        try {
            this.f67175r = C28568o.C28569a.f67223a.mo49185a(mo49108h(), pVar);
        } catch (C28566n.C28567a unused) {
            C28754c.C28765a.f67843a.mo49873a(mo49108h(), kVar2.f67207q, kVar2.f67198h, new C28550a(this));
            pVar.f67224a.f67232b.f67207q = null;
            try {
                this.f67175r = C28568o.C28569a.f67223a.mo49185a(mo49108h(), pVar);
            } catch (C28566n.C28567a e) {
                throw new RuntimeException(e);
            }
        }
        C28566n nVar = this.f67175r;
        int i2 = nVar.f67215b.f67224a.f67232b.f67191a;
        if (i2 == -1 || i2 > nVar.f67214a.getLineCount()) {
            i = nVar.f67214a.getHeight();
        } else {
            i = nVar.f67214a.getLineBottom(i2 - 1);
        }
        return C28541f.m57092a((float) this.f67175r.f67214a.getWidth(), (float) i);
    }
}
