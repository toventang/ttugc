package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.tux.icon.TuxIconView;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareCompilationContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ab */
public final class C54487ab extends C54488ac {

    /* renamed from: a */
    private C54526bg f124835a;

    static {
        Covode.recordClassIndex(64198);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54488ac
    /* renamed from: a */
    public final void mo91007a() {
        super.mo91007a();
        this.f124814j = (TuxIconView) mo91563a(R.id.e7f);
        this.f124835a = new C54526bg(this.f124814j);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54488ac
    /* renamed from: a */
    public final void mo91564a(View.OnClickListener onClickListener) {
        C89219l.m154721d(onClickListener, "");
        super.mo91564a(onClickListener);
        this.f124814j.setOnClickListener(onClickListener);
        this.f124824t.mo92194a(this.f124814j);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54487ab(View view, EnumC53772b bVar) {
        super(view, bVar);
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.im.core.d.ai, com.bytedance.im.core.d.ai, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent, int] */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54488ac
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo91008a(C19538ai aiVar, C19538ai aiVar2, ShareCompilationContent shareCompilationContent, int i) {
        mo91008a(aiVar, aiVar2, shareCompilationContent, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54488ac
    /* renamed from: a */
    public final void mo91587a(C19538ai aiVar, C19538ai aiVar2, ShareCompilationContent shareCompilationContent, int i) {
        C89219l.m154721d(aiVar, "");
        super.mo91008a(aiVar, aiVar2, shareCompilationContent, i);
        C54526bg bgVar = this.f124835a;
        if (bgVar == null) {
            C89219l.m154710a("statusIcon");
        }
        bgVar.mo91621a(this.f124823s);
    }
}