package com.p2082ss.android.ugc.aweme.ecommerce.semipdp.p2857vh;

import android.text.TextPaint;
import android.view.View;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.compat.C44998a;
import com.p2082ss.android.ugc.aweme.ecommerce.semipdp.p2856b.C45341a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.vh.SemiPdpInfoVH */
public final class SemiPdpInfoVH extends JediSimpleViewHolder<C45341a> implements AbstractC33974au {

    /* renamed from: f */
    public final View f105723f;

    static {
        Covode.recordClassIndex(53832);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void cc_() {
        super.cc_();
        C44998a.C44999a.m87685a(this.f105723f, true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SemiPdpInfoVH(View view) {
        super(view);
        C89219l.m154721d(view, "");
        this.f105723f = view;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* renamed from: a */
    public final /* synthetic */ void mo33817a(C45341a aVar) {
        C45341a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        View view = this.f105723f;
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.df0);
        C89219l.m154716b(tuxTextView, "");
        m87938a(tuxTextView, aVar2.f105670a);
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.cxt);
        C89219l.m154716b(tuxTextView2, "");
        m87938a(tuxTextView2, aVar2.f105671b);
        TuxTextView tuxTextView3 = (TuxTextView) view.findViewById(R.id.ajt);
        C89219l.m154716b(tuxTextView3, "");
        m87938a(tuxTextView3, aVar2.f105672c);
        TuxTextView tuxTextView4 = (TuxTextView) view.findViewById(R.id.e4e);
        C89219l.m154716b(tuxTextView4, "");
        m87938a(tuxTextView4, aVar2.f105673d);
        TuxTextView tuxTextView5 = (TuxTextView) view.findViewById(R.id.cxt);
        C89219l.m154716b(tuxTextView5, "");
        TextPaint paint = tuxTextView5.getPaint();
        C89219l.m154716b(paint, "");
        paint.setFlags(16);
        TuxTextView tuxTextView6 = (TuxTextView) view.findViewById(R.id.cxt);
        C89219l.m154716b(tuxTextView6, "");
        TextPaint paint2 = tuxTextView6.getPaint();
        C89219l.m154716b(paint2, "");
        paint2.setAntiAlias(true);
    }

    /* renamed from: a */
    private static void m87938a(TuxTextView tuxTextView, String str) {
        int i = 0;
        if (str == null || str.length() == 0) {
            i = 8;
        }
        tuxTextView.setVisibility(i);
        tuxTextView.setText(str);
    }
}
