package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.tux.icon.TuxIconView;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareAwemeContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.v */
public final class C54570v extends C54565s {

    /* renamed from: C */
    private C54526bg f125086C;

    static {
        Covode.recordClassIndex(64281);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54565s
    /* renamed from: a */
    public final void mo91007a() {
        super.mo91007a();
        this.f124814j = (TuxIconView) mo91563a(R.id.e7f);
        this.f125086C = new C54526bg(this.f124814j);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54565s
    /* renamed from: i */
    public final String mo91651i() {
        View view = this.itemView;
        C89219l.m154716b(view, "");
        String string = view.getContext().getString(R.string.h5i);
        C89219l.m154716b(string, "");
        return string;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54565s
    /* renamed from: a */
    public final void mo91564a(View.OnClickListener onClickListener) {
        C89219l.m154721d(onClickListener, "");
        super.mo91564a(onClickListener);
        this.f124814j.setOnClickListener(onClickListener);
        this.f124824t.mo92194a(this.f124814j);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54570v(View view, EnumC53772b bVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.im.core.d.ai, com.bytedance.im.core.d.ai, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent, int] */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54565s
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo91008a(C19538ai aiVar, C19538ai aiVar2, ShareAwemeContent shareAwemeContent, int i) {
        mo91008a(aiVar, aiVar2, shareAwemeContent, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54565s
    /* renamed from: a */
    public final void mo91649a(C19538ai aiVar, C19538ai aiVar2, ShareAwemeContent shareAwemeContent, int i) {
        C89219l.m154721d(aiVar, "");
        C89219l.m154721d(shareAwemeContent, "");
        super.mo91008a(aiVar, aiVar2, shareAwemeContent, i);
        C54526bg bgVar = this.f125086C;
        if (bgVar == null) {
            C89219l.m154710a("statusIcon");
        }
        bgVar.mo91621a(this.f124823s);
    }
}
