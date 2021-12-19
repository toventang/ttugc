package com.p2082ss.android.ugc.aweme.base.arch;

import android.view.View;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20380ar;
import com.bytedance.jedi.arch.AbstractC20467g;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.base.arch.JediBaseViewHolder */
public abstract class JediBaseViewHolder<R extends AbstractC20467g, ITEM> extends JediViewHolder<R, ITEM> implements AbstractC20380ar<C34499i>, AbstractC33974au {

    /* renamed from: f */
    public C34499i f81471f = new C34499i();

    static {
        Covode.recordClassIndex(41442);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20380ar
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C34499i mo33721d() {
        return this.f81471f;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JediBaseViewHolder(View view) {
        super(view);
        C89219l.m154721d(view, "");
    }
}
