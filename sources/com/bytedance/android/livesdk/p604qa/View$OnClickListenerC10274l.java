package com.bytedance.android.livesdk.p604qa;

import android.content.DialogInterface;
import android.view.View;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p378m.C5762c;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.android.livesdk.p604qa.C10262i;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.qa.l */
final /* synthetic */ class View$OnClickListenerC10274l implements View.OnClickListener {

    /* renamed from: a */
    private final C10262i.C10271f f24852a;

    /* renamed from: b */
    private final QuestionViewModel f24853b;

    /* renamed from: c */
    private final C10188af f24854c;

    /* renamed from: d */
    private final int f24855d;

    static {
        Covode.recordClassIndex(11840);
    }

    View$OnClickListenerC10274l(C10262i.C10271f fVar, QuestionViewModel questionViewModel, C10188af afVar, int i) {
        this.f24852a = fVar;
        this.f24853b = questionViewModel;
        this.f24854c = afVar;
        this.f24855d = i;
    }

    public final void onClick(View view) {
        C10262i.C10271f fVar = this.f24852a;
        QuestionViewModel questionViewModel = this.f24853b;
        C10188af afVar = this.f24854c;
        int i = this.f24855d;
        if (!C10262i.this.f24815j.booleanValue()) {
            return;
        }
        if (!C5762c.m12633b(C10262i.this.f24819n)) {
            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.els);
        } else if (questionViewModel.f24655j.f24672o != null) {
            if (AbstractC6804a.f17033cg.mo13066a().booleanValue()) {
                C6806c.m14603a((C6800c) AbstractC6804a.f17033cg, (Object) false);
                DialogC9148b.C9149a aVar = new DialogC9148b.C9149a(fVar.f24841b);
                aVar.f22256m = true;
                aVar.mo15243a(R.string.em0).mo15248b(R.string.em1).mo15244a(R.string.em2, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC10275m(fVar, afVar, i), false).mo15249b(R.string.emr, DialogInterface$OnClickListenerC10276n.f24859a, false).mo15247a().show();
                return;
            }
            fVar.mo17061a(afVar, i);
        } else if (AbstractC6804a.f17032cf.mo13066a().booleanValue()) {
            C6806c.m14603a((C6800c) AbstractC6804a.f17032cf, (Object) false);
            DialogC9148b.C9149a aVar2 = new DialogC9148b.C9149a(fVar.f24841b);
            aVar2.f22256m = true;
            aVar2.mo15243a(R.string.duw).mo15248b(R.string.dux).mo15244a(R.string.duy, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC10277o(fVar, afVar, i), false).mo15249b(R.string.emr, DialogInterface$OnClickListenerC10278p.f24863a, false).mo15247a().show();
        } else {
            fVar.mo17061a(afVar, i);
        }
    }
}
