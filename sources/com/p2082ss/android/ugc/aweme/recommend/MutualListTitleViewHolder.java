package com.p2082ss.android.ugc.aweme.recommend;

import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.following.p3002a.C51107f;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.recommend.MutualListTitleViewHolder */
public final class MutualListTitleViewHolder extends JediSimpleViewHolder<C51107f> implements AbstractC33974au {

    /* renamed from: f */
    private final TextView f149710f;

    static {
        Covode.recordClassIndex(78143);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* renamed from: a */
    public final /* synthetic */ void mo33817a(C51107f fVar) {
        C51107f fVar2 = fVar;
        C89219l.m154721d(fVar2, "");
        this.f149710f.setText(fVar2.f117932b);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MutualListTitleViewHolder(View view) {
        super(view);
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.f66);
        C89219l.m154716b(findViewById, "");
        this.f149710f = (TextView) findViewById;
    }
}
