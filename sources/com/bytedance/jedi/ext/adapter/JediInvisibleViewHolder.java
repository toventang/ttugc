package com.bytedance.jedi.ext.adapter;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import p4600h.p4611f.p4613b.C89219l;

final class JediInvisibleViewHolder extends JediSimpleViewHolder<Object> implements AbstractC33974au {
    static {
        Covode.recordClassIndex(24080);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* renamed from: a */
    public final void mo33817a(Object obj) {
        C89219l.m154719c(obj, "");
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JediInvisibleViewHolder(ViewGroup viewGroup) {
        super(new View(viewGroup.getContext()));
        C89219l.m154719c(viewGroup, "");
        MethodCollector.m26663i(8604);
        MethodCollector.m26664o(8604);
    }
}
