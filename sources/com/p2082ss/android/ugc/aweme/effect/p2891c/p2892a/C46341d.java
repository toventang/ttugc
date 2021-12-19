package com.p2082ss.android.ugc.aweme.effect.p2891c.p2892a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.effect.EffectPointModel;
import dmt.p4542av.video.C88300w;
import java.util.List;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.effect.c.a.d */
public final class C46341d extends AbstractC46338a {

    /* renamed from: a */
    private final AbstractC89171a<AbstractC31071f> f108019a;

    /* renamed from: b */
    private final AbstractC89171a<List<EffectPointModel>> f108020b;

    /* renamed from: c */
    private final AbstractC89172b<Integer, Integer> f108021c;

    /* renamed from: d */
    private final AbstractC89172b<Integer, Integer> f108022d;

    static {
        Covode.recordClassIndex(54918);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.effect.p2891c.p2892a.AbstractC46338a
    /* renamed from: a */
    public final boolean mo78834a() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.effect.p2891c.p2892a.AbstractC46338a
    /* renamed from: a */
    public final void mo78833a(C88300w wVar) {
        List<EffectPointModel> invoke = this.f108020b.invoke();
        AbstractC89171a<AbstractC31071f> aVar = this.f108019a;
        AbstractC89172b<Integer, Integer> bVar = this.f108021c;
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(bVar, "");
        if (!(wVar == null || invoke == null)) {
            for (EffectPointModel effectPointModel : invoke) {
                if (C88300w.m153452a(wVar)) {
                    int G = aVar.invoke().mo56246G();
                    effectPointModel.setStartPoint(G - effectPointModel.getEndPoint());
                    effectPointModel.setEndPoint(G - effectPointModel.getStartPoint());
                } else if (C88300w.m153455b(wVar) || C88300w.m153456c(wVar)) {
                    int intValue = bVar.invoke(Integer.valueOf(effectPointModel.getStartPoint())).intValue();
                    int intValue2 = bVar.invoke(Integer.valueOf(effectPointModel.getEndPoint())).intValue();
                    effectPointModel.setStartPoint(intValue);
                    effectPointModel.setEndPoint(intValue2);
                } else if (!C88300w.m153457d(wVar)) {
                    throw new UnsupportedOperationException("remove time effect: " + wVar + " is not supported yet.");
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.effect.p2891c.p2892a.AbstractC46338a
    /* renamed from: b */
    public final void mo78836b(C88300w wVar) {
        List<EffectPointModel> invoke = this.f108020b.invoke();
        AbstractC89171a<AbstractC31071f> aVar = this.f108019a;
        AbstractC89172b<Integer, Integer> bVar = this.f108022d;
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(bVar, "");
        if (!(wVar == null || invoke == null)) {
            for (EffectPointModel effectPointModel : invoke) {
                if (C88300w.m153452a(wVar)) {
                    int G = aVar.invoke().mo56246G();
                    effectPointModel.setStartPoint(G - effectPointModel.getEndPoint());
                    effectPointModel.setEndPoint(G - effectPointModel.getStartPoint());
                } else if (C88300w.m153455b(wVar) || C88300w.m153456c(wVar)) {
                    int intValue = bVar.invoke(Integer.valueOf(effectPointModel.getStartPoint())).intValue();
                    int intValue2 = bVar.invoke(Integer.valueOf(effectPointModel.getEndPoint())).intValue();
                    effectPointModel.setStartPoint(intValue);
                    effectPointModel.setEndPoint(intValue2);
                } else if (!C88300w.m153457d(wVar)) {
                    throw new UnsupportedOperationException("apply time effect: " + wVar + " is not supported yet.");
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.asve.editor.f> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.a<? extends java.util.List<? extends com.ss.android.ugc.aweme.effect.EffectPointModel>> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.b<? super java.lang.Integer, java.lang.Integer> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.b<? super java.lang.Integer, java.lang.Integer> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46341d(AbstractC89171a<? extends AbstractC31071f> aVar, AbstractC89171a<? extends List<? extends EffectPointModel>> aVar2, AbstractC89172b<? super Integer, Integer> bVar, AbstractC89172b<? super Integer, Integer> bVar2) {
        super(aVar);
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
        this.f108019a = aVar;
        this.f108020b = aVar2;
        this.f108021c = bVar;
        this.f108022d = bVar2;
    }
}
