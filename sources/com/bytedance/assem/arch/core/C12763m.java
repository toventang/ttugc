package com.bytedance.assem.arch.core;

import android.view.View;
import com.bytedance.assem.arch.p795b.AbstractC12695v;
import com.bytedance.covode.number.Covode;
import com.bytedance.tiktok.proxy.AbstractC22876d;
import com.kakao.usermgmt.StringSet;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.bytedance.assem.arch.core.m */
public final class C12763m implements AbstractC12761k {

    /* renamed from: a */
    public AbstractC89277c<? extends AbstractC12695v<? extends AbstractC22876d>> f31031a;

    /* renamed from: b */
    public AbstractC12695v<? extends AbstractC22876d> f31032b;

    /* renamed from: c */
    public EnumC12758h f31033c = EnumC12758h.IMMEDIATE;

    /* renamed from: d */
    public int f31034d;

    /* renamed from: e */
    public int f31035e;

    /* renamed from: f */
    public View f31036f;

    /* renamed from: g */
    public EnumC12762l f31037g = EnumC12762l.SYNC;

    /* renamed from: h */
    private List<C12765o> f31038h = new ArrayList();

    static {
        Covode.recordClassIndex(14587);
    }

    /* renamed from: b */
    public final AbstractC12695v<? extends AbstractC22876d> mo20601a() {
        boolean z;
        AbstractC12695v<? extends AbstractC22876d> vVar = this.f31032b;
        if (vVar == null) {
            AbstractC89277c<? extends AbstractC12695v<? extends AbstractC22876d>> cVar = this.f31031a;
            if (cVar == null) {
                C89219l.m154710a(StringSet.type);
            }
            vVar = (AbstractC12695v) C89170a.m154665a(cVar).newInstance();
        }
        vVar.f30905o = this.f31034d;
        vVar.f30906p = this.f31035e;
        EnumC12762l lVar = this.f31037g;
        C89219l.m154719c(lVar, "");
        vVar.f30907q = lVar;
        View view = this.f31036f;
        if (view != null) {
            vVar.mo20507a(view);
        }
        if (this.f31033c == EnumC12758h.IMMEDIATE) {
            z = true;
        } else {
            z = false;
        }
        vVar.f30999c = z;
        return vVar;
    }
}
