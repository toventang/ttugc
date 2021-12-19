package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.tux.icon.TuxIconView;
import com.facebook.drawee.p1851c.AbstractC24203d;
import com.facebook.imagepipeline.p1890o.AbstractC24641d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareUserContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3185c.C55198a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.bd */
public final class C54523bd extends C54522bc {

    /* renamed from: b */
    private C54526bg f124969b;

    static {
        Covode.recordClassIndex(64234);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54522bc
    /* renamed from: a */
    public final void mo91007a() {
        super.mo91007a();
        this.f124814j = (TuxIconView) mo91563a(R.id.e7f);
        this.f124969b = new C54526bg(this.f124814j);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54522bc
    /* renamed from: a */
    public final void mo91564a(View.OnClickListener onClickListener) {
        C89219l.m154721d(onClickListener, "");
        super.mo91564a(onClickListener);
        this.f124814j.setOnClickListener(onClickListener);
        this.f124824t.mo92194a(this.f124814j);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54522bc
    /* renamed from: a */
    public final void mo91618a(ShareUserContent shareUserContent) {
        C89219l.m154721d(shareUserContent, "");
        C55198a.m100933a(mo91619i(), shareUserContent.getAvatar(), (AbstractC24641d) null, 0, 0, (AbstractC24203d) null, 60);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54523bd(View view, EnumC53772b bVar) {
        super(view, bVar);
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.im.core.d.ai, com.bytedance.im.core.d.ai, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent, int] */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54522bc
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo91008a(C19538ai aiVar, C19538ai aiVar2, ShareUserContent shareUserContent, int i) {
        mo91008a(aiVar, aiVar2, shareUserContent, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54522bc
    /* renamed from: a */
    public final void mo91617a(C19538ai aiVar, C19538ai aiVar2, ShareUserContent shareUserContent, int i) {
        C89219l.m154721d(aiVar, "");
        C89219l.m154721d(shareUserContent, "");
        super.mo91008a(aiVar, aiVar2, shareUserContent, i);
        C54526bg bgVar = this.f124969b;
        if (bgVar == null) {
            C89219l.m154715b();
        }
        bgVar.mo91621a(this.f124823s);
    }
}
