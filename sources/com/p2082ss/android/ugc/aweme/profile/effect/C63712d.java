package com.p2082ss.android.ugc.aweme.profile.effect;

import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20467g;
import com.bytedance.jedi.arch.ext.list.p1464a.C20438e;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.p2082ss.android.ugc.aweme.base.arch.AbstractC34492e;
import com.p2082ss.android.ugc.aweme.sticker.model.C75445g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.effect.d */
public final class C63712d extends AbstractC34492e<C75445g> {

    /* renamed from: d */
    public final boolean f144445d;

    static {
        Covode.recordClassIndex(75039);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.arch.AbstractC34492e
    /* renamed from: a */
    public final JediViewHolder<? extends AbstractC20467g, C75445g> mo60934a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        return new EffectProfileViewHolder(viewGroup, this.f144445d);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C63712d(AbstractC1204m mVar, boolean z) {
        super(mVar, new C63698a(), (C20438e.AbstractC20440b) null);
        C89219l.m154721d(mVar, "");
        this.f144445d = z;
    }

    public /* synthetic */ C63712d(AbstractC1204m mVar, boolean z, byte b) {
        this(mVar, z);
    }
}
