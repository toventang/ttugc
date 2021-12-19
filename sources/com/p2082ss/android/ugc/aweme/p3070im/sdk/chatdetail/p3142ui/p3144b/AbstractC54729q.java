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

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.q */
public abstract class AbstractC54729q extends AbstractC1973t<C54730a> {

    /* renamed from: h */
    public int f125450h;

    /* renamed from: i */
    public int f125451i;

    /* renamed from: j */
    public View.OnClickListener f125452j;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.q$a */
    public static final class C54730a extends AbstractC54694c {

        /* renamed from: a */
        static final /* synthetic */ AbstractC89286i[] f125453a = {new C89232y(C54730a.class, "titleView", "getTitleView()Landroid/widget/TextView;", 0), new C89232y(C54730a.class, "subTitleView", "getSubTitleView()Landroid/widget/TextView;", 0)};

        /* renamed from: b */
        final AbstractC89248d f125454b = m100198a((int) R.id.bkh);

        /* renamed from: c */
        private final AbstractC89248d f125455c = m100198a((int) R.id.bkg);

        static {
            Covode.recordClassIndex(64445);
        }

        /* renamed from: b */
        public final TextView mo91770b() {
            return (TextView) this.f125455c.mo23374a(this, f125453a[1]);
        }
    }

    static {
        Covode.recordClassIndex(64444);
    }

    @Override // com.airbnb.epoxy.AbstractC1956s
    /* renamed from: b */
    public final int mo5792b() {
        return R.layout.a85;
    }

    /* renamed from: a */
    public void mo5794b(C54730a aVar) {
        C89219l.m154721d(aVar, "");
        aVar.mo91720a().setOnClickListener(null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo5788a(C54730a aVar) {
        C89219l.m154721d(aVar, "");
        ((TextView) aVar.f125454b.mo23374a(aVar, C54730a.f125453a[0])).setText(this.f125450h);
        if (this.f125451i == 0) {
            aVar.mo91770b().setVisibility(8);
        } else {
            aVar.mo91770b().setVisibility(0);
            aVar.mo91770b().setText(this.f125451i);
        }
        aVar.mo91720a().setOnClickListener(this.f125452j);
        C55233v.m101004a(aVar.mo91720a());
    }
}
