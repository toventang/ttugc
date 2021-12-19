package com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.compat.C44998a;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.AbsFullSpanVH */
public abstract class AbsFullSpanVH<ITEM> extends JediSimpleViewHolder<ITEM> implements AbstractC33974au {
    static {
        Covode.recordClassIndex(53298);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    /* renamed from: i */
    public final void mo33831i() {
        super.mo33831i();
        mo76082a((C44955i) null);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public void cc_() {
        super.cc_();
        View view = this.itemView;
        C89219l.m154716b(view, "");
        C44998a.C44999a.m87685a(view, true);
    }

    /* renamed from: m */
    public final void mo63351m() {
        View view = this.itemView;
        C89219l.m154716b(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof StaggeredGridLayoutManager.C1385b)) {
            layoutParams = null;
        }
        StaggeredGridLayoutManager.C1385b bVar = (StaggeredGridLayoutManager.C1385b) layoutParams;
        if (bVar != null) {
            bVar.f4602b = true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbsFullSpanVH(View view) {
        super(view);
        C89219l.m154721d(view, "");
    }

    /* renamed from: a */
    public final void mo76082a(C44955i iVar) {
        this.itemView.setTag(R.id.aaq, iVar);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* renamed from: a */
    public final void mo33818a(ITEM item, int i, List<Object> list) {
        System.currentTimeMillis();
        super.mo33818a(item, i, list);
    }
}
