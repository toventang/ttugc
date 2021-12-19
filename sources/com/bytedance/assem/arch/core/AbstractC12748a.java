package com.bytedance.assem.arch.core;

import android.content.Context;
import androidx.lifecycle.AbstractC1183ag;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import androidx.lifecycle.C1205n;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.assem.arch.core.a */
public abstract class AbstractC12748a implements AbstractC1183ag, AbstractC1204m {

    /* renamed from: a */
    public final String f30997a = (getClass().getSimpleName() + "---" + hashCode());

    /* renamed from: b */
    public boolean f30998b;

    /* renamed from: c */
    public volatile boolean f30999c = true;

    /* renamed from: d */
    public final C1205n f31000d = new C1205n(this);

    /* renamed from: e */
    public AssemSupervisor f31001e;

    /* renamed from: f */
    public AbstractC1204m f31002f;

    /* renamed from: g */
    private final C1182af f31003g = new C1182af();

    static {
        Covode.recordClassIndex(14572);
    }

    public void bU_() {
    }

    /* renamed from: f */
    public void mo20518f() {
    }

    /* renamed from: j */
    public void mo20525j() {
    }

    /* renamed from: l */
    public void mo20537l() {
    }

    /* renamed from: n */
    public void mo20526n() {
    }

    /* renamed from: p */
    public void mo20527p() {
    }

    @Override // androidx.lifecycle.AbstractC1204m
    public /* bridge */ /* synthetic */ AbstractC1196i getLifecycle() {
        return this.f31000d;
    }

    @Override // androidx.lifecycle.AbstractC1183ag
    public C1182af getViewModelStore() {
        return this.f31003g;
    }

    /* renamed from: q */
    public C1175ad.AbstractC1177b mo20598q() {
        return new C1175ad.C1179d();
    }

    public final void aA_() {
        mo20518f();
        this.f31000d.mo4016a(AbstractC1196i.EnumC1198a.ON_CREATE);
    }

    public final Context az_() {
        AssemSupervisor assemSupervisor = this.f31001e;
        if (assemSupervisor == null) {
            C89219l.m154710a("supervisor");
        }
        return assemSupervisor.f30983e;
    }

    public final boolean bC_() {
        return this.f31000d.mo4011a().isAtLeast(AbstractC1196i.EnumC1199b.RESUMED);
    }

    public final AssemSupervisor bD_() {
        AssemSupervisor assemSupervisor = this.f31001e;
        if (assemSupervisor == null) {
            C89219l.m154710a("supervisor");
        }
        return assemSupervisor;
    }

    public final AbstractC1204m bE_() {
        AbstractC1204m mVar = this.f31002f;
        if (mVar == null) {
            C89219l.m154710a("parent");
        }
        return mVar;
    }

    public void bV_() {
        mo20525j();
        this.f31000d.mo4016a(AbstractC1196i.EnumC1198a.ON_RESUME);
    }

    public final boolean bW_() {
        if (this.f31001e != null) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final void mo20594g() {
        bU_();
        this.f31000d.mo4016a(AbstractC1196i.EnumC1198a.ON_START);
    }

    /* renamed from: k */
    public final void mo20595k() {
        this.f31000d.mo4016a(AbstractC1196i.EnumC1198a.ON_PAUSE);
        mo20537l();
    }

    /* renamed from: m */
    public final void mo20596m() {
        this.f31000d.mo4016a(AbstractC1196i.EnumC1198a.ON_STOP);
        mo20526n();
    }

    /* renamed from: o */
    public final void mo20597o() {
        this.f31000d.mo4016a(AbstractC1196i.EnumC1198a.ON_DESTROY);
        this.f31003g.mo3997a();
        mo20527p();
    }

    /* renamed from: s */
    public final boolean mo20599s() {
        if (this.f31002f != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo20586a(AbstractC1204m mVar) {
        C89219l.m154719c(mVar, "");
        this.f31002f = mVar;
    }

    /* renamed from: a */
    public final void mo20587a(AssemSupervisor assemSupervisor) {
        C89219l.m154719c(assemSupervisor, "");
        this.f31001e = assemSupervisor;
    }
}
