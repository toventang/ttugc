package com.lynx.tasm.behavior;

import android.util.DisplayMetrics;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.base.AbstractC28459h;
import com.lynx.tasm.behavior.shadow.AbstractC28538c;
import com.lynx.tasm.behavior.shadow.C28545j;
import com.lynx.tasm.behavior.shadow.EnumC28540e;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.p2054c.C28723a;

/* renamed from: com.lynx.tasm.behavior.t */
public class C28576t extends LayoutContext {

    /* renamed from: c */
    final C28578u f67240c = new C28578u();

    /* renamed from: d */
    private AbstractC28520j f67241d;

    /* renamed from: e */
    private final AbstractC28538c f67242e;

    /* renamed from: f */
    private final C28477c f67243f;

    /* renamed from: g */
    private final PaintingContext f67244g;

    /* renamed from: h */
    private final AbstractC28459h f67245h;

    /* renamed from: i */
    private boolean f67246i;

    /* renamed from: j */
    private boolean f67247j;

    static {
        Covode.recordClassIndex(34592);
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    /* renamed from: a */
    public final DisplayMetrics mo48917a() {
        return this.f67241d.f67075p;
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.LayoutContext
    public void updateDataWithoutChange() {
        if (!this.f67247j) {
            this.f67247j = true;
            return;
        }
        AbstractC28459h hVar = this.f67245h;
        if (hVar != null) {
            hVar.mo48675c();
        }
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public void dispatchOnLayoutFinish() {
        if (this.f67246i) {
            this.f67246i = false;
            AbstractC28459h hVar = this.f67245h;
            if (hVar != null) {
                hVar.mo48673a();
                return;
            }
            return;
        }
        AbstractC28459h hVar2 = this.f67245h;
        if (hVar2 != null) {
            hVar2.mo48674b();
        }
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public void detachNativePtr() {
        SparseArray<ShadowNode> sparseArray;
        super.detachNativePtr();
        C28578u uVar = this.f67240c;
        if (!(uVar == null || (sparseArray = uVar.f67250a) == null || sparseArray.size() <= 0)) {
            for (int i = 0; i < sparseArray.size(); i++) {
                sparseArray.valueAt(i).f67140m = true;
            }
        }
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public void dispatchOnLayoutBefore(int i) {
        this.f67240c.mo49192a(i).mo49091c();
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public void scheduleLayout(final long j) {
        if (!this.f66939b) {
            this.f67242e.mo49111a(new Runnable() {
                /* class com.lynx.tasm.behavior.C28576t.RunnableC285771 */

                static {
                    Covode.recordClassIndex(34593);
                }

                public final void run() {
                    C28576t tVar = C28576t.this;
                    long j = j;
                    if (tVar.f66938a != 0) {
                        tVar.nativeTriggerLayout(tVar.f66938a, j);
                    }
                }
            });
        }
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public void setFontFaces(ReadableMap readableMap) {
        this.f67241d.f67063d = readableMap.getMap("fontfaces");
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public void destroyNodes(int[] iArr) {
        for (int i : iArr) {
            C28578u uVar = this.f67240c;
            uVar.f67250a.remove(i);
            uVar.f67250a.get(i).f67140m = true;
        }
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public void updateProps(int i, ReadableMap readableMap) {
        ShadowNode a = this.f67240c.mo49192a(i);
        if (a == null) {
            throw new RuntimeException("Trying to update non-existent view with tag ".concat(String.valueOf(i)));
        } else if (readableMap != null) {
            C28716v vVar = new C28716v(readableMap);
            if (this.f67241d.f67076q) {
                a.mo49104b(vVar);
            } else {
                a.mo49100a(vVar);
            }
        }
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public void insertNode(int i, int i2, int i3) {
        this.f67240c.mo49192a(i).mo49099a(this.f67240c.mo49192a(i2), i3);
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public void removeNode(int i, int i2, int i3) {
        this.f67240c.mo49192a(i).mo49098a(i3);
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public void moveNode(int i, int i2, int i3, int i4) {
        ShadowNode a = this.f67240c.mo49192a(i);
        ShadowNode a2 = this.f67240c.mo49192a(i2);
        a.mo49098a(i3);
        a.mo49099a(a2, i4);
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public void setTextStyleData(int i, int[] iArr, double[] dArr, String str) {
        ShadowNode a = this.f67240c.mo49192a(i);
        if (a != null) {
            a.mo49102a(iArr, dArr, str);
            return;
        }
        throw new RuntimeException("Trying to setTextStyleData non-existent view with tag ".concat(String.valueOf(i)));
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public void dispatchOnLayout(int i, int i2, int i3, int i4, int i5) {
        this.f67240c.mo49192a(i).mo49089a(i2, i3, i4, i5);
    }

    public C28576t(AbstractC28520j jVar, C28477c cVar, PaintingContext paintingContext, AbstractC28538c cVar2, AbstractC28459h hVar) {
        this.f67241d = jVar;
        this.f67243f = cVar;
        this.f67244g = paintingContext;
        this.f67242e = cVar2;
        this.f67245h = hVar;
        this.f67246i = true;
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public long measure(int i, float f, int i2, float f2, int i3) {
        long a;
        ShadowNode a2 = this.f67240c.mo49192a(i);
        if (a2 != null) {
            a2.mo49091c();
            EnumC28540e fromInt = EnumC28540e.fromInt(i2);
            EnumC28540e fromInt2 = EnumC28540e.fromInt(i3);
            if (a2.f67132f == null) {
                a = 0;
            } else {
                a = a2.f67132f.mo30603a(a2, f, fromInt, f2, fromInt2);
            }
            a2.mo26068a(this.f67244g);
            return a;
        }
        throw new RuntimeException("Trying to measure non-existent view with tag ".concat(String.valueOf(i)));
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public int createNode(int i, String str, ReadableMap readableMap, long j, ReadableArray readableArray) {
        int i2;
        C28463a a = this.f67243f.mo48988a(str);
        ShadowNode a2 = a.mo16276a();
        if (a.f66943c) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        if (a2 == null) {
            return i2 | 1;
        }
        int i3 = i2 | 4;
        a2.f67135h = i;
        a2.f67136i = str;
        a2.mo30993a(this.f67241d);
        a2.mo49101a(C28723a.m57533a(readableArray));
        this.f67240c.f67250a.put(a2.f67135h, a2);
        if (!this.f66939b) {
            a2.f67130d = j;
            a2.f67133g = new C28545j(a2);
            if (!a2.f67131e && a2.f67132f != null) {
                a2.mo49090a(a2.f67132f);
            }
        }
        if (readableMap != null) {
            a2.mo49100a(new C28716v(readableMap));
        }
        if (a2.mo30992a()) {
            return i3 | 2;
        }
        return i3;
    }
}
