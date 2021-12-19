package com.bytedance.hox;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.hox.AbstractC15499c;
import com.bytedance.hox.p1106a.AbstractC15495b;
import com.bytedance.hox.p1106a.AbstractC15496c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

public abstract class HoxFragmentNode extends AbstractC15501d implements AbstractC15499c {

    /* renamed from: a */
    public Fragment f37764a;

    /* renamed from: b */
    private boolean f37765b;

    static {
        Covode.recordClassIndex(17751);
    }

    @Override // com.bytedance.hox.AbstractC15499c
    /* renamed from: X_ */
    public final List<AbstractC15495b> mo25221X_() {
        return this.f37775i;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.hox.AbstractC15501d
    /* renamed from: a */
    public final void mo25222a(AbstractC15496c cVar) {
        Fragment fragment;
        AbstractC1196i lifecycle;
        C89219l.m154719c(cVar, "");
        super.mo25222a(cVar);
        if (!this.f37765b && (fragment = this.f37764a) != null && (lifecycle = fragment.getLifecycle()) != null) {
            lifecycle.mo4012a(this);
            this.f37765b = true;
        }
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        C89219l.m154719c(mVar, "");
        C89219l.m154719c(aVar, "");
        AbstractC15499c.C15500a.m28549a(this, mVar, aVar);
    }
}
