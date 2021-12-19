package com.bytedance.assem.arch.core;

import android.view.View;
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.bytedance.assem.arch.core.q */
public final class C12767q implements AbstractC12761k {

    /* renamed from: a */
    public AbstractC89277c<? extends AbstractC12769a> f31049a;

    /* renamed from: b */
    public AbstractC12769a f31050b;

    /* renamed from: c */
    List<C12765o> f31051c = new ArrayList();

    /* renamed from: d */
    public int f31052d;

    /* renamed from: e */
    public View f31053e;

    /* renamed from: f */
    private EnumC12758h f31054f = EnumC12758h.IMMEDIATE;

    static {
        Covode.recordClassIndex(14591);
    }

    /* renamed from: b */
    public final AbstractC12769a mo20601a() {
        boolean z;
        AbstractC12769a aVar = this.f31050b;
        if (aVar == null) {
            AbstractC89277c<? extends AbstractC12769a> cVar = this.f31049a;
            if (cVar == null) {
                C89219l.m154710a(StringSet.type);
            }
            aVar = (AbstractC12769a) C89170a.m154665a(cVar).newInstance();
        }
        aVar.f31061i = this.f31052d;
        View view = this.f31053e;
        if (view != null) {
            aVar.mo20629a(view);
        }
        if (this.f31054f == EnumC12758h.IMMEDIATE) {
            z = true;
        } else {
            z = false;
        }
        aVar.f30999c = z;
        return aVar;
    }

    /* renamed from: a */
    public final void mo20632a(AbstractC89277c<? extends AbstractC12769a> cVar) {
        C89219l.m154719c(cVar, "");
        this.f31049a = cVar;
    }
}
