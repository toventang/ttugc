package com.p2082ss.android.ugc.aweme.ecommerce.address.candinput.p2821a;

import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.C43368d;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.C43377m;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.address.candinput.a.c */
public final class C43352c extends AbstractView$OnClickListenerC43350a {

    /* renamed from: b */
    private TextView f101183b;

    static {
        Covode.recordClassIndex(51572);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43352c(View view) {
        super(view);
        C89219l.m154721d(view, "");
        View findViewById = this.itemView.findViewById(R.id.et_);
        C89219l.m154716b(findViewById, "");
        this.f101183b = (TextView) findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.address.candinput.p2821a.AbstractView$OnClickListenerC43350a
    /* renamed from: a */
    public final void mo73869a(C43368d dVar, int i) {
        List<C43377m> list;
        List<C43377m> list2;
        C43377m mVar;
        String str = null;
        if (dVar != null && (list = dVar.f101221b) != null && !list.isEmpty()) {
            TextView textView = this.f101183b;
            if (!(dVar == null || (list2 = dVar.f101221b) == null || (mVar = list2.get(0)) == null)) {
                str = mVar.f101237a;
            }
            textView.setText(str);
        }
    }
}
