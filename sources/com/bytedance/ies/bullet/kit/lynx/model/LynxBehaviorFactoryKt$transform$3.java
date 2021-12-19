package com.bytedance.ies.bullet.kit.lynx.model;

import android.content.Context;
import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.lynx.api.AbstractC16377a;
import com.bytedance.ies.bullet.kit.lynx.api.AbstractC16384h;
import com.bytedance.ies.bullet.kit.lynx.api.AbstractC16386i;
import com.bytedance.ies.bullet.kit.lynx.api.C16378b;
import com.bytedance.ies.bullet.kit.lynx.api.C16381e;
import com.bytedance.ies.bullet.kit.lynx.api.C16383g;
import com.bytedance.ies.bullet.kit.lynx.model.C16434b;
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
    final /* synthetic */ AbstractC16386i f39485a;

    /* renamed from: b */
    final /* synthetic */ AbstractC28520j f39486b;

    static {
        Covode.recordClassIndex(18736);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void onLayoutUpdated() {
        super.onLayoutUpdated();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void initialize() {
        super.initialize();
        if (this.f39485a != null) {
            C89219l.m154709a((Object) this.mView, "");
        }
        if (this.f39485a != null) {
            getSign();
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI
    public final T createView(Context context) {
        C89219l.m154719c(context, "");
        AbstractC16386i iVar = this.f39485a;
        if (iVar != null) {
            return (T) iVar.mo26016c();
        }
        return null;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void updateExtraData(Object obj) {
        super.updateExtraData(obj);
        if ((obj instanceof C28572q) && this.f39485a != null) {
            C28572q qVar = (C28572q) obj;
            C89219l.m154719c(qVar, "");
            new C16383g(qVar.f67233a, qVar.f67234b);
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void afterPropsUpdated(C28716v vVar) {
        AbstractC16384h a;
        Object obj;
        super.afterPropsUpdated(vVar);
        AbstractC16386i iVar = this.f39485a;
        if (iVar != null && (a = iVar.mo26014a()) != null) {
            if (vVar == null) {
                C89219l.m154707a();
            }
            ReadableMapKeySetIterator keySetIterator = vVar.f67715a.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                C89219l.m154709a((Object) nextKey, "");
                C89219l.m154719c(vVar, "");
                C89219l.m154719c(nextKey, "");
                C16434b.C16435a aVar = new C16434b.C16435a(vVar);
                C16434b.C16436b bVar = new C16434b.C16436b(vVar);
                C16434b.C16437c cVar = new C16434b.C16437c(vVar);
                C16434b.C16438d dVar = new C16434b.C16438d(vVar);
                C16434b.C16439e eVar = new C16434b.C16439e(vVar);
                C16434b.C16440f fVar = new C16434b.C16440f(vVar);
                C16434b.C16441g gVar = new C16434b.C16441g(vVar);
                if (vVar.mo49821a(nextKey)) {
                    obj = aVar.invoke(nextKey);
                    if (obj == null && (obj = bVar.invoke(nextKey)) == null && (obj = cVar.invoke(nextKey)) == null && (obj = dVar.invoke(nextKey)) == null && (obj = eVar.invoke(nextKey)) == null && (obj = fVar.invoke(nextKey)) == null) {
                        obj = gVar.invoke(nextKey);
                    }
                    new StringBuilder("StylesDiffMap.get() called with: key = [").append(nextKey).append("], value=[").append(obj).append(']');
                } else {
                    obj = null;
                }
                a.mo26013a(nextKey, obj);
            }
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI
    public final T createView(Context context, Object obj) {
        C89219l.m154719c(context, "");
        AbstractC16386i iVar = this.f39485a;
        if (iVar != null) {
            return (T) iVar.mo26017d();
        }
        return null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LynxBehaviorFactoryKt$transform$3(AbstractC16386i<T> iVar, AbstractC28520j jVar, AbstractC28520j jVar2) {
        super(jVar2);
        this.f39485a = iVar;
        this.f39486b = jVar;
        if (iVar != null) {
            C16381e eVar = ((AbstractC16377a) iVar).f39370a;
            C164301 r1 = new C16378b(this) {
                /* class com.bytedance.ies.bullet.kit.lynx.model.LynxBehaviorFactoryKt$transform$3.C164301 */

                /* renamed from: a */
                public final C28719c f39487a;

                /* renamed from: b */
                final /* synthetic */ LynxBehaviorFactoryKt$transform$3 f39488b;

                static {
                    Covode.recordClassIndex(18737);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f39488b = r2;
                    AbstractC28520j jVar = r2.f39486b;
                    if (jVar == null) {
                        C89219l.m154707a();
                    }
                    this.f39487a = jVar.f67064e;
                }
            };
            C89219l.m154719c(r1, "");
            eVar.f39373a = r1;
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
