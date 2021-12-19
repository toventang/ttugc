package com.p2082ss.android.ugc.aweme.ecommerce.address.candinput.p2821a;

import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.C43368d;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.C43377m;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.compat.C44998a;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.address.candinput.a.d */
public final class C43353d extends AbstractView$OnClickListenerC43350a {

    /* renamed from: b */
    private TextView f101184b;

    /* renamed from: c */
    private TextView f101185c;

    static {
        Covode.recordClassIndex(51573);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43353d(View view) {
        super(view);
        C89219l.m154721d(view, "");
        View findViewById = this.itemView.findViewById(R.id.eta);
        C89219l.m154716b(findViewById, "");
        this.f101184b = (TextView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.etb);
        C89219l.m154716b(findViewById2, "");
        this.f101185c = (TextView) findViewById2;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.address.candinput.p2821a.AbstractView$OnClickListenerC43350a
    /* renamed from: a */
    public final void mo73869a(C43368d dVar, int i) {
        int i2;
        String str;
        List<C43377m> list;
        C43377m mVar;
        List<C43377m> list2;
        C43377m mVar2;
        List<C43377m> list3;
        boolean z = false;
        if (dVar == null || (list3 = dVar.f101221b) == null) {
            i2 = 0;
        } else {
            i2 = list3.size();
        }
        if (i2 > 1) {
            TextView textView = this.f101184b;
            String str2 = null;
            if (dVar == null || (list2 = dVar.f101221b) == null || (mVar2 = list2.get(0)) == null) {
                str = null;
            } else {
                str = mVar2.f101237a;
            }
            textView.setText(str);
            TextView textView2 = this.f101185c;
            if (!(dVar == null || (list = dVar.f101221b) == null || (mVar = list.get(1)) == null)) {
                str2 = mVar.f101237a;
            }
            textView2.setText(str2);
        }
        View view = this.itemView;
        C89219l.m154716b(view, "");
        if (getLayoutPosition() != i - 1) {
            z = true;
        }
        C44998a.C44999a.m87685a(view, z);
    }
}
