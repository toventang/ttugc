package com.lynx.tasm.behavior.shadow;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.tasm.base.C28454c;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.AbstractC28525m;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.PaintingContext;
import com.lynx.tasm.behavior.utils.PropsUpdater;
import com.lynx.tasm.p2054c.C28723a;
import java.util.ArrayList;
import java.util.Map;

public class ShadowNode extends LayoutNode {

    /* renamed from: a */
    private ArrayList<ShadowNode> f67134a;

    /* renamed from: h */
    public int f67135h;

    /* renamed from: i */
    public String f67136i;

    /* renamed from: j */
    public ShadowNode f67137j;

    /* renamed from: k */
    protected AbstractC28520j f67138k;

    /* renamed from: l */
    public C28544i f67139l;

    /* renamed from: m */
    public boolean f67140m;

    /* renamed from: n */
    protected Map<String, C28723a> f67141n;

    static {
        Covode.recordClassIndex(34533);
    }

    /* renamed from: a */
    public void mo26068a(PaintingContext paintingContext) {
    }

    /* renamed from: a */
    public void mo49102a(int[] iArr, double[] dArr, String str) {
    }

    /* renamed from: a */
    public boolean mo30992a() {
        return false;
    }

    /* renamed from: g */
    public void mo49107g() {
    }

    public String toString() {
        return this.f67136i;
    }

    /* renamed from: e */
    public final String mo49105e() {
        return (String) C28454c.m56881a(this.f67136i);
    }

    /* renamed from: f */
    public final int mo49106f() {
        ArrayList<ShadowNode> arrayList = this.f67134a;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* renamed from: h */
    public final AbstractC28520j mo49108h() {
        return (AbstractC28520j) C28454c.m56881a(this.f67138k);
    }

    @Override // com.lynx.tasm.behavior.shadow.LayoutNode
    /* renamed from: d */
    public final void mo49092d() {
        ShadowNode shadowNode = this;
        while (!shadowNode.f67140m) {
            if (!shadowNode.mo30992a()) {
                super.mo49092d();
                return;
            } else if (shadowNode.mo30992a()) {
                do {
                    shadowNode = shadowNode.f67137j;
                    if (shadowNode == null) {
                        return;
                    }
                } while (shadowNode.mo30992a());
            }
        }
    }

    /* renamed from: a */
    public void mo30993a(AbstractC28520j jVar) {
        this.f67138k = jVar;
    }

    /* renamed from: b */
    public void mo49104b(C28716v vVar) {
        PropsUpdater.m57478a(this, vVar);
        mo49107g();
    }

    /* renamed from: a */
    public final void mo49100a(C28716v vVar) {
        PropsUpdater.m57478a(this, vVar);
        mo49107g();
    }

    /* renamed from: a */
    public final ShadowNode mo49098a(int i) {
        ArrayList<ShadowNode> arrayList = this.f67134a;
        if (arrayList != null) {
            ShadowNode remove = arrayList.remove(i);
            remove.f67137j = null;
            return remove;
        }
        throw new ArrayIndexOutOfBoundsException("Index " + i + " out of bounds: node has no children");
    }

    /* renamed from: b */
    public final ShadowNode mo49103b(int i) {
        ArrayList<ShadowNode> arrayList = this.f67134a;
        if (arrayList != null) {
            return arrayList.get(i);
        }
        throw new ArrayIndexOutOfBoundsException("Index " + i + " out of bounds: node has no children");
    }

    @AbstractC28525m(mo49059a = "vertical-align")
    public void setVerticalAlign(ReadableArray readableArray) {
        if (this.f67139l == null) {
            this.f67139l = new C28544i();
        }
        if (readableArray == null || readableArray.size() < 2) {
            this.f67139l.f67151a = 0;
            this.f67139l.f67152b = 0.0f;
            return;
        }
        this.f67139l.f67151a = readableArray.getInt(0);
        this.f67139l.f67152b = (float) readableArray.getDouble(1);
    }

    /* renamed from: a */
    public void mo49101a(Map<String, C28723a> map) {
        this.f67141n = map;
    }

    /* renamed from: a */
    public void mo49099a(ShadowNode shadowNode, int i) {
        if (shadowNode.f67137j == null) {
            if (this.f67134a == null) {
                this.f67134a = new ArrayList<>(4);
            }
            this.f67134a.add(i, shadowNode);
            shadowNode.f67137j = this;
            return;
        }
        throw new RuntimeException("Tried to add child that already has a parent! Remove it from its parent first.");
    }
}
