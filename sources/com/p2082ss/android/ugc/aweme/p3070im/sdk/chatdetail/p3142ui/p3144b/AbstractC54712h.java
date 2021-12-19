package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3144b;

import android.widget.TextView;
import com.airbnb.epoxy.AbstractC1973t;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.h */
public abstract class AbstractC54712h extends AbstractC1973t<C54713a> {

    /* renamed from: h */
    public String f125400h;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.h$a */
    public static final class C54713a extends AbstractC54694c {

        /* renamed from: a */
        static final /* synthetic */ AbstractC89286i[] f125401a = {new C89232y(C54713a.class, "textView", "getTextView()Landroid/widget/TextView;", 0)};

        /* renamed from: b */
        final AbstractC89248d f125402b = m100198a((int) R.id.bkc);

        static {
            Covode.recordClassIndex(64428);
        }
    }

    static {
        Covode.recordClassIndex(64427);
    }

    @Override // com.airbnb.epoxy.AbstractC1956s
    /* renamed from: b */
    public final int mo5792b() {
        return R.layout.a83;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo5788a(C54713a aVar) {
        C89219l.m154721d(aVar, "");
        ((TextView) aVar.f125402b.mo23374a(aVar, C54713a.f125401a[0])).setText(this.f125400h);
    }
}
