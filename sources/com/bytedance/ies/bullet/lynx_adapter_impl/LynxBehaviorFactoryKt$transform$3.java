package com.bytedance.ies.bullet.lynx_adapter_impl;

import android.content.Context;
import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.lynx_adapter_impl.C16536b;
import com.bytedance.ies.lynx.lynx_adapter.p1229a.AbstractC17604a;
import com.bytedance.ies.lynx.lynx_adapter.wrapper.AbstractC17606a;
import com.bytedance.ies.lynx.lynx_adapter.wrapper.AbstractC17615i;
import com.bytedance.ies.lynx.lynx_adapter.wrapper.C17607b;
import com.bytedance.ies.lynx.lynx_adapter.wrapper.C17610e;
import com.bytedance.ies.lynx.lynx_adapter.wrapper.C17614h;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.C28719c;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.LynxUI;
import com.lynx.tasm.behavior.shadow.text.C28572q;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

public final class LynxBehaviorFactoryKt$transform$3 extends LynxUI<T> {

    /* renamed from: a */
    final /* synthetic */ AbstractC17615i f39652a;

    /* renamed from: b */
    final /* synthetic */ AbstractC28520j f39653b;

    static {
        Covode.recordClassIndex(18966);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void onLayoutUpdated() {
        super.onLayoutUpdated();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void initialize() {
        super.initialize();
        if (this.f39652a != null) {
            C89219l.m154709a((Object) this.mView, "");
        }
        if (this.f39652a != null) {
            getSign();
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI
    public final T createView(Context context) {
        C89219l.m154719c(context, "");
        AbstractC17615i iVar = this.f39652a;
        if (iVar != null) {
            return (T) iVar.mo28036c();
        }
        return null;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void updateExtraData(Object obj) {
        super.updateExtraData(obj);
        if ((obj instanceof C28572q) && this.f39652a != null) {
            C28572q qVar = (C28572q) obj;
            C89219l.m154719c(qVar, "");
            new C17614h(qVar.f67233a, qVar.f67234b);
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void afterPropsUpdated(C28716v vVar) {
        AbstractC17604a a;
        Object obj;
        super.afterPropsUpdated(vVar);
        AbstractC17615i iVar = this.f39652a;
        if (iVar != null && (a = iVar.mo28034a()) != null) {
            if (vVar == null) {
                C89219l.m154707a();
            }
            ReadableMapKeySetIterator keySetIterator = vVar.f67715a.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                C89219l.m154709a((Object) nextKey, "");
                C89219l.m154719c(vVar, "");
                C89219l.m154719c(nextKey, "");
                C16536b.C16537a aVar = new C16536b.C16537a(vVar);
                C16536b.C16538b bVar = new C16536b.C16538b(vVar);
                C16536b.C16539c cVar = new C16536b.C16539c(vVar);
                C16536b.C16540d dVar = new C16536b.C16540d(vVar);
                C16536b.C16541e eVar = new C16536b.C16541e(vVar);
                C16536b.C16542f fVar = new C16536b.C16542f(vVar);
                C16536b.C16543g gVar = new C16536b.C16543g(vVar);
                if (vVar.mo49821a(nextKey)) {
                    obj = aVar.invoke(nextKey);
                    if (obj == null && (obj = bVar.invoke(nextKey)) == null && (obj = cVar.invoke(nextKey)) == null && (obj = dVar.invoke(nextKey)) == null && (obj = eVar.invoke(nextKey)) == null && (obj = fVar.invoke(nextKey)) == null) {
                        obj = gVar.invoke(nextKey);
                    }
                    new StringBuilder("StylesDiffMap.get() called with: key = [").append(nextKey).append("], value=[").append(obj).append(']');
                } else {
                    obj = null;
                }
                a.mo26246a(nextKey, obj);
            }
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI
    public final T createView(Context context, Object obj) {
        C89219l.m154719c(context, "");
        AbstractC17615i iVar = this.f39652a;
        if (iVar != null) {
            return (T) iVar.mo28037d();
        }
        return null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LynxBehaviorFactoryKt$transform$3(AbstractC17615i<T> iVar, AbstractC28520j jVar, AbstractC28520j jVar2) {
        super(jVar2);
        this.f39652a = iVar;
        this.f39653b = jVar;
        if (iVar != null) {
            C17610e eVar = ((AbstractC17606a) iVar).f42094a;
            C165321 r1 = new C17607b(this) {
                /* class com.bytedance.ies.bullet.lynx_adapter_impl.LynxBehaviorFactoryKt$transform$3.C165321 */

                /* renamed from: a */
                public final C28719c f39654a;

                /* renamed from: b */
                final /* synthetic */ LynxBehaviorFactoryKt$transform$3 f39655b;

                static {
                    Covode.recordClassIndex(18967);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f39655b = r2;
                    AbstractC28520j jVar = r2.f39653b;
                    if (jVar == null) {
                        C89219l.m154707a();
                    }
                    this.f39654a = jVar.f67064e;
                }
            };
            C89219l.m154719c(r1, "");
            eVar.f42097a = r1;
            return;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void updateLayout(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect) {
        super.updateLayout(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, rect);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void updateLayoutInfo(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect) {
        super.updateLayoutInfo(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, rect);
    }
}
