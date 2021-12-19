package com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2840vh;

import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.EnumC20767w;
import com.bytedance.lighten.p1477a.p1478a.C20714a;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.C44456c;
import com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.repository.dto.Icon;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.vh.ShipFromBarHolder */
public final class ShipFromBarHolder extends JediSimpleViewHolder<C44456c> implements AbstractC33974au {
    static {
        Covode.recordClassIndex(52801);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ShipFromBarHolder(android.view.ViewGroup r5) {
        /*
            r4 = this;
            java.lang.String r3 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r5, r3)
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r1 = 2131558959(0x7f0d022f, float:1.8743249E38)
            r0 = 0
            android.view.View r0 = com.C1764a.m5927a(r2, r1, r5, r0)
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r3)
            r4.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2840vh.ShipFromBarHolder.<init>(android.view.ViewGroup):void");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* renamed from: a */
    public final /* synthetic */ void mo33817a(C44456c cVar) {
        Image icon;
        C20714a thumbFirstImageUrlModel;
        C44456c cVar2 = cVar;
        C89219l.m154721d(cVar2, "");
        Icon icon2 = cVar2.f103646a;
        if (!(icon2 == null || (icon = icon2.getIcon()) == null || (thumbFirstImageUrlModel = icon.toThumbFirstImageUrlModel()) == null)) {
            C20766v a = C20761r.m39058a(thumbFirstImageUrlModel);
            a.f49115l = R.drawable.z0;
            a.f49125v = EnumC20767w.FIT_XY;
            View view = this.itemView;
            C89219l.m154716b(view, "");
            a.f49093F = (ImageView) view.findViewById(R.id.bh1);
            a.mo34186c();
        }
        View view2 = this.itemView;
        C89219l.m154716b(view2, "");
        TuxTextView tuxTextView = (TuxTextView) view2.findViewById(R.id.title);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(cVar2.f103647b);
        View view3 = this.itemView;
        C89219l.m154716b(view3, "");
        TuxTextView tuxTextView2 = (TuxTextView) view3.findViewById(R.id.text);
        C89219l.m154716b(tuxTextView2, "");
        tuxTextView2.setText(cVar2.f103648c);
    }
}
