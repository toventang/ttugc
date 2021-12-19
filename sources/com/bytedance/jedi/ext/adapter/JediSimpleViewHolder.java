package com.bytedance.jedi.ext.adapter;

import android.view.View;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20380ar;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

public abstract class JediSimpleViewHolder<ITEM> extends JediViewHolder<JediSimpleViewHolder<ITEM>, ITEM> implements AbstractC20380ar<C1175ad.AbstractC1177b>, AbstractC33974au {

    /* renamed from: f */
    private final C1175ad.AbstractC1177b f48642f = C20652g.f48834a;

    static {
        Covode.recordClassIndex(24081);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo33817a(ITEM item);

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20380ar
    /* renamed from: d */
    public final C1175ad.AbstractC1177b mo33721d() {
        return this.f48642f;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JediSimpleViewHolder(View view) {
        super(view);
        C89219l.m154719c(view, "");
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    /* renamed from: a */
    public final void mo33819a(List<Object> list) {
        mo33818a(aQ_(), this.f48794i, list);
    }

    /* renamed from: a */
    public void mo33818a(ITEM item, int i, List<Object> list) {
        mo33817a((Object) item);
    }
}
