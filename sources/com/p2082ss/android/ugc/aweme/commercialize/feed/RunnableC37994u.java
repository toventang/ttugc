package com.p2082ss.android.ugc.aweme.commercialize.feed;

import android.graphics.Color;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.commercialize.p2534ad.C37591b;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38620ad;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.mask.p2302b.C33312a;
import com.p2082ss.android.ugc.aweme.utils.C80595j;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.u */
public final /* synthetic */ class RunnableC37994u implements Runnable {

    /* renamed from: a */
    private final C37899g f89802a;

    static {
        Covode.recordClassIndex(45455);
    }

    RunnableC37994u(C37899g gVar) {
        this.f89802a = gVar;
    }

    public final void run() {
        String a;
        C37591b bVar;
        int parseColor;
        C37899g gVar = this.f89802a;
        gVar.f89435Y.setVisibility(4);
        gVar.mo66009H();
        C37881be.m76678a("showAdLayout", gVar.f89514o);
        gVar.f89519t.setVisibility(0);
        C80595j.m139739a(gVar.f89520u);
        TextView textView = gVar.f89520u;
        if (C37699a.m76319x(gVar.f89514o)) {
            a = C37699a.m76257ac(gVar.f89514o);
        } else if (C37699a.m76233aE(gVar.f89514o)) {
            a = C37699a.m76246aR(gVar.f89514o);
        } else {
            a = C38620ad.m78372a(gVar.f89467ae, gVar.f89514o, true);
        }
        textView.setText(a);
        if (C37699a.m76319x(gVar.f89514o)) {
            bVar = new C37591b((float) C34728n.m70946a(2.0d), C0643b.m2378c(gVar.f89467ae, R.color.bh));
        } else if (C37699a.m76233aE(gVar.f89514o)) {
            bVar = new C37591b((float) C34728n.m70946a(2.0d), Color.parseColor(C37699a.m76247aS(gVar.f89514o)));
        } else {
            bVar = new C37591b((float) C34728n.m70946a(2.0d), C0643b.m2378c(gVar.f89467ae, R.color.av));
        }
        int c = C0643b.m2378c(gVar.f89467ae, R.color.j);
        if (C37699a.m76319x(gVar.f89514o)) {
            parseColor = C0643b.m2378c(gVar.f89467ae, R.color.bh);
        } else if (C37699a.m76233aE(gVar.f89514o)) {
            parseColor = Color.parseColor(C37699a.m76247aS(gVar.f89514o));
        } else {
            parseColor = Color.parseColor(C37699a.m76265ak(gVar.f89514o));
        }
        C80595j.m139740a(gVar.f89520u, bVar, c, parseColor, 300, null);
        gVar.f89519t.animate().alpha(1.0f).setDuration(150).start();
        AbstractC81915c.m141874a(new C33312a(true, gVar.f89514o.getAid()));
    }
}
