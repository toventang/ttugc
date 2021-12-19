package com.p2082ss.android.ugc.aweme.effect.p2891c.p2892a;

import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.editor.preview.IAudioEffectParam;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import dmt.p4542av.video.C88300w;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.effect.c.a.c */
public final class C46340c extends AbstractC46338a {

    /* renamed from: a */
    private final AbstractC89171a<C1213t<IAudioEffectParam>> f108018a;

    static {
        Covode.recordClassIndex(54917);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.effect.p2891c.p2892a.AbstractC46338a
    /* renamed from: a */
    public final boolean mo78834a() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.effect.p2891c.p2892a.AbstractC46338a
    /* renamed from: a */
    public final void mo78833a(C88300w wVar) {
        IAudioEffectParam value;
        C1213t<IAudioEffectParam> invoke = this.f108018a.invoke();
        if (invoke != null && (value = invoke.getValue()) != null) {
            C89219l.m154716b(value, "");
            int seqIn = value.getSeqIn();
            int seqOut = value.getSeqOut();
            int a = mo78832a(wVar, seqIn);
            int a2 = mo78832a(wVar, seqOut);
            value.setSeqIn(a);
            value.setSeqOut(a2);
            invoke.setValue(value);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.effect.p2891c.p2892a.AbstractC46338a
    /* renamed from: b */
    public final void mo78836b(C88300w wVar) {
        IAudioEffectParam value;
        C1213t<IAudioEffectParam> invoke = this.f108018a.invoke();
        if (invoke != null && (value = invoke.getValue()) != null) {
            C89219l.m154716b(value, "");
            int seqIn = value.getSeqIn();
            int seqOut = value.getSeqOut();
            int b = mo78835b(wVar, seqIn);
            int b2 = mo78835b(wVar, seqOut);
            value.setSeqIn(b);
            value.setSeqOut(b2);
            invoke.setValue(value);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.a<? extends androidx.lifecycle.t<com.bytedance.creativex.editor.preview.IAudioEffectParam>> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46340c(AbstractC89171a<? extends AbstractC31071f> aVar, AbstractC89171a<? extends C1213t<IAudioEffectParam>> aVar2) {
        super(aVar);
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        this.f108018a = aVar2;
    }
}
