package com.p2082ss.android.ugc.aweme.sticker.p3959g;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27252o;
import com.p2082ss.android.ugc.aweme.sticker.p3959g.AbstractC75374c;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75705k;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.aweme.sticker.g.h */
public final class C75381h implements AbstractC75374c.AbstractC75375a {

    /* renamed from: a */
    private final C27252o f169422a = C27252o.m54253a();

    /* renamed from: b */
    private final int f169423b;

    /* renamed from: c */
    private final AbstractC75374c.AbstractC75375a f169424c;

    /* renamed from: d */
    private final AbstractC75705k f169425d;

    static {
        Covode.recordClassIndex(88300);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3959g.AbstractC75374c.AbstractC75375a
    /* renamed from: c */
    public final void mo118621c(Effect effect) {
        AbstractC75374c.AbstractC75375a aVar = this.f169424c;
        if (aVar != null) {
            aVar.mo118621c(effect);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3959g.AbstractC75374c.AbstractC75375a
    /* renamed from: b */
    public final void mo118620b(Effect effect) {
        long a = this.f169422a.mo45339a(TimeUnit.MILLISECONDS);
        AbstractC75374c.AbstractC75375a aVar = this.f169424c;
        if ((aVar instanceof AbstractC75380g) && this.f169423b == 1) {
            ((AbstractC75380g) aVar).mo118617a(effect);
        } else if (aVar != null) {
            aVar.mo118620b(effect);
        }
        AbstractC75705k kVar = this.f169425d;
        if (kVar != null) {
            kVar.mo118900a(effect, a, this.f169423b);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3959g.AbstractC75374c.AbstractC75375a
    /* renamed from: a */
    public final void mo118618a(Effect effect, int i) {
        AbstractC75374c.AbstractC75375a aVar = this.f169424c;
        if (aVar != null) {
            aVar.mo118618a(effect, i);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3959g.AbstractC75374c.AbstractC75375a
    /* renamed from: a */
    public final void mo118619a(Effect effect, ExceptionResult exceptionResult) {
        Integer num;
        long a = this.f169422a.mo45339a(TimeUnit.MILLISECONDS);
        AbstractC75374c.AbstractC75375a aVar = this.f169424c;
        if (aVar != null) {
            aVar.mo118619a(effect, exceptionResult);
        }
        AbstractC75705k kVar = this.f169425d;
        if (kVar != null) {
            int i = this.f169423b;
            if (exceptionResult != null) {
                exceptionResult.getException();
                num = Integer.valueOf(exceptionResult.getErrorCode());
            } else {
                num = null;
            }
            kVar.mo118901a(effect, a, i, num);
        }
    }

    public C75381h(int i, AbstractC75374c.AbstractC75375a aVar, AbstractC75705k kVar) {
        this.f169423b = i;
        this.f169424c = aVar;
        this.f169425d = kVar;
    }
}
