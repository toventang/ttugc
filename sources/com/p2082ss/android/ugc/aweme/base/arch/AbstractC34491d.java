package com.p2082ss.android.ugc.aweme.base.arch;

import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20467g;
import com.bytedance.jedi.ext.adapter.C20654i;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.p1467b.C20633f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.base.arch.d */
public abstract class AbstractC34491d<VH extends JediViewHolder<? extends AbstractC20467g, ?>> extends AbstractC34497h<VH, C20654i<VH>> {

    /* renamed from: a */
    public final C20654i<VH> f81477a;

    static {
        Covode.recordClassIndex(41449);
    }

    @Override // com.bytedance.jedi.ext.adapter.p1467b.AbstractC20628c
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C20633f mo33883b() {
        return this.f81477a;
    }

    public AbstractC34491d(AbstractC1204m mVar) {
        C89219l.m154721d(mVar, "");
        C20654i<VH> iVar = new C20654i<>(mVar);
        mo60935a(iVar);
        this.f81477a = iVar;
    }
}
