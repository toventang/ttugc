package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3144b;

import android.view.View;
import android.widget.TextView;
import com.airbnb.epoxy.AbstractC1973t;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.o */
public abstract class AbstractC54726o extends AbstractC1973t<C54727a> {

    /* renamed from: h */
    public String f125442h;

    /* renamed from: i */
    public View.OnClickListener f125443i;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.o$a */
    public static final class C54727a extends AbstractC54694c {

        /* renamed from: a */
        static final /* synthetic */ AbstractC89286i[] f125444a = {new C89232y(C54727a.class, "moreText", "getMoreText()Landroid/widget/TextView;", 0)};

        /* renamed from: b */
        final AbstractC89248d f125445b = m100198a((int) R.id.bkf);

        static {
            Covode.recordClassIndex(64442);
        }
    }

    static {
        Covode.recordClassIndex(64441);
    }

    @Override // com.airbnb.epoxy.AbstractC1956s
    /* renamed from: b */
    public final int mo5792b() {
        return R.layout.a84;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo5788a(C54727a aVar) {
        C89219l.m154721d(aVar, "");
        ((TextView) aVar.f125445b.mo23374a(aVar, C54727a.f125444a[0])).setText(this.f125442h);
        aVar.mo91720a().setOnClickListener(this.f125443i);
    }
}
