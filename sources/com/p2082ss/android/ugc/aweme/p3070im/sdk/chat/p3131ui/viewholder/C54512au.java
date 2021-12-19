package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.tux.icon.TuxIconView;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55173ae;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.au */
public final class C54512au extends C54511at {

    /* renamed from: B */
    private C54526bg f124936B;

    static {
        Covode.recordClassIndex(64223);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54513av
    /* renamed from: a */
    public final void mo91007a() {
        super.mo91007a();
        this.f124814j = (TuxIconView) mo91563a(R.id.e7f);
        this.f124936B = new C54526bg(this.f124814j);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a
    /* renamed from: a */
    public final void mo91564a(View.OnClickListener onClickListener) {
        C89219l.m154721d(onClickListener, "");
        super.mo91564a(onClickListener);
        TuxIconView tuxIconView = this.f124814j;
        if (tuxIconView != null) {
            tuxIconView.setOnClickListener(onClickListener);
        }
        C55173ae.View$OnTouchListenerC55177a aVar = this.f124824t;
        if (aVar != null) {
            aVar.mo92194a(this.f124814j);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54512au(View view, EnumC53772b bVar) {
        super(view, bVar);
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54513av, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54511at
    /* renamed from: a */
    public final void mo91008a(C19538ai aiVar, C19538ai aiVar2, BaseContent baseContent, int i) {
        C89219l.m154721d(aiVar, "");
        super.mo91008a(aiVar, aiVar2, baseContent, i);
        C54526bg bgVar = this.f124936B;
        if (bgVar == null) {
            C89219l.m154710a("statusIcon");
        }
        bgVar.mo91621a(this.f124823s);
    }
}
