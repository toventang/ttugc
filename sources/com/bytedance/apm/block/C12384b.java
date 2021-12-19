package com.bytedance.apm.block;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.apm.AbstractC12446e;
import com.bytedance.apm.C12397c;
import com.bytedance.apm.block.p766a.C12364f;
import com.bytedance.apm.config.C12424e;
import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.collector.AbstractC21470a;
import com.bytedance.services.apm.api.AbstractC22711d;

/* renamed from: com.bytedance.apm.block.b */
public final class C12384b extends AbstractC12350a implements AbstractC12446e, AbstractC22711d {

    /* renamed from: b */
    public boolean f29867b;

    /* renamed from: c */
    public C12392i f29868c = C12392i.m22262a();

    /* renamed from: d */
    private boolean f29869d;

    static {
        Covode.recordClassIndex(14190);
    }

    @Override // com.bytedance.services.apm.api.AbstractC22711d
    /* renamed from: a */
    public final void mo20108a(Activity activity, Bundle bundle) {
    }

    @Override // com.bytedance.services.apm.api.AbstractC22711d
    /* renamed from: c */
    public final void mo20109c(Activity activity) {
    }

    @Override // com.bytedance.services.apm.api.AbstractC22711d
    /* renamed from: l_ */
    public final void mo20110l_() {
    }

    /* renamed from: a */
    public final void mo20163a() {
        if (this.f29867b && !this.f29869d) {
            this.f29869d = true;
            if (C12397c.m22288e()) {
                new String[]{"BlockDetector start: "};
            }
        }
    }

    @Override // com.bytedance.services.apm.api.AbstractC22711d
    /* renamed from: b */
    public final void mo20035b(Activity activity) {
        mo20163a();
    }

    @Override // com.bytedance.services.apm.api.AbstractC22711d
    /* renamed from: a */
    public final void mo20033a(Activity activity) {
        if (this.f29869d) {
            this.f29869d = false;
            this.f29868c.mo20172a(false);
            if (C12397c.m22288e()) {
                new String[]{"BlockDetector stop: "};
            }
        }
    }

    @Override // com.bytedance.apm.AbstractC12446e
    /* renamed from: a */
    public final void mo20164a(C12424e eVar) {
        boolean z;
        if (eVar != null) {
            long j = eVar.f30155l;
            long j2 = eVar.f30151h;
            boolean z2 = eVar.f30148e;
            boolean z3 = eVar.f30147d;
            this.f29868c.f29917o = z2;
            this.f29868c.mo20169a(j);
            C12392i iVar = this.f29868c;
            if (j2 < iVar.f29907c) {
                j2 = 5000;
            }
            iVar.f29908d = j2;
            iVar.mo20173c();
            this.f29868c.f29910h = z3;
            C12392i iVar2 = this.f29868c;
            boolean z4 = false;
            if (C12397c.f29946p || eVar.f30157n) {
                z = true;
            } else {
                z = false;
            }
            iVar2.f29918p = z;
            C12392i iVar3 = this.f29868c;
            if (C12397c.f29946p || eVar.f30150g) {
                z4 = true;
            }
            iVar3.f29919q = z4;
        }
    }

    @Override // com.bytedance.apm.block.AbstractC12350a
    /* renamed from: a */
    public final void mo20106a(String str) {
        super.mo20106a(str);
        if (this.f29869d) {
            C12392i iVar = this.f29868c;
            try {
                if (iVar.f29905a.mo20397a()) {
                    if (C12392i.f29902f && iVar.f29909g) {
                        iVar.f29914l.f29877h = AbstractC21470a.f50893b;
                        if (iVar.f29914l.f29877h - iVar.f29914l.f29876g > iVar.f29907c) {
                            iVar.f29914l.f29880k = true;
                            iVar.f29914l.f29873d = false;
                            iVar.f29914l.f29872c = iVar.f29916n;
                            iVar.mo20170a(iVar.f29914l.mo20165a());
                        }
                    }
                    if (iVar.f29915m != null && C12364f.f29788r.f29790b.mo20118a()) {
                        iVar.f29915m.f29874e = true;
                    }
                    if (iVar.f29914l == null) {
                        iVar.f29914l = new C12385c(AbstractC21470a.f50893b, str);
                    } else {
                        iVar.f29914l.mo20166a(AbstractC21470a.f50893b, str);
                    }
                    if (iVar.f29910h && iVar.f29918p) {
                        iVar.f29905a.mo20399a(iVar.f29921s, iVar.f29907c);
                        if (iVar.f29906b && iVar.f29919q) {
                            iVar.f29905a.mo20399a(iVar.f29922t, iVar.f29908d);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.apm.block.AbstractC12350a
    /* renamed from: a */
    public final void mo20105a(long j, long j2, long j3, long j4, boolean z) {
        super.mo20105a(j, j2, j3, j4, z);
        if (this.f29869d) {
            this.f29868c.mo20172a(z);
        }
    }
}
