package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.tux.icon.TuxIconView;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.CommentContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.h */
public final class C54546h extends C54547i {

    /* renamed from: y */
    private C54526bg f125019y;

    static {
        Covode.recordClassIndex(64257);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54547i
    /* renamed from: a */
    public final void mo91007a() {
        super.mo91007a();
        this.f124814j = (TuxIconView) mo91563a(R.id.e7f);
        this.f125019y = new C54526bg(this.f124814j);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54547i
    /* renamed from: a */
    public final void mo91564a(View.OnClickListener onClickListener) {
        super.mo91564a(onClickListener);
        this.f124814j.setOnClickListener(onClickListener);
        this.f124824t.mo92194a(this.f124814j);
    }

    public C54546h(View view, EnumC53772b bVar) {
        super(view, bVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.im.core.d.ai, com.bytedance.im.core.d.ai, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent, int] */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54547i
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo91008a(C19538ai aiVar, C19538ai aiVar2, CommentContent commentContent, int i) {
        mo91008a(aiVar, aiVar2, commentContent, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54547i
    /* renamed from: a */
    public final void mo91636a(C19538ai aiVar, C19538ai aiVar2, CommentContent commentContent, int i) {
        super.mo91008a(aiVar, aiVar2, commentContent, i);
        this.f125019y.mo91621a(this.f124823s);
    }
}
