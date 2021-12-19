package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3144b;

import android.view.View;
import android.widget.TextView;
import com.airbnb.epoxy.AbstractC1973t;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55233v;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.j */
public abstract class AbstractC54715j extends AbstractC1973t<C54716a> {

    /* renamed from: h */
    public int f125407h;

    /* renamed from: i */
    public View.OnClickListener f125408i;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.j$a */
    public static final class C54716a extends AbstractC54694c {

        /* renamed from: a */
        static final /* synthetic */ AbstractC89286i[] f125409a = {new C89232y(C54716a.class, "titleView", "getTitleView()Landroid/widget/TextView;", 0)};

        /* renamed from: b */
        final AbstractC89248d f125410b = m100198a((int) R.id.bke);

        static {
            Covode.recordClassIndex(64431);
        }
    }

    static {
        Covode.recordClassIndex(64430);
    }

    @Override // com.airbnb.epoxy.AbstractC1956s
    /* renamed from: b */
    public final int mo5792b() {
        return R.layout.a82;
    }

    /* renamed from: a */
    public void mo5794b(C54716a aVar) {
        C89219l.m154721d(aVar, "");
        aVar.mo91720a().setOnClickListener(null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo5788a(C54716a aVar) {
        C89219l.m154721d(aVar, "");
        ((TextView) aVar.f125410b.mo23374a(aVar, C54716a.f125409a[0])).setText(this.f125407h);
        aVar.mo91720a().setOnClickListener(this.f125408i);
        C55233v.m101004a(aVar.mo91720a());
    }
}
