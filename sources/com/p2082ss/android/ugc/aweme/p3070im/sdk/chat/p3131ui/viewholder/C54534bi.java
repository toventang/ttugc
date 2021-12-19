package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder;

import android.view.View;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.SystemContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.C53701d;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.bi */
public final class C54534bi extends AbstractC54482a<SystemContent> {

    /* renamed from: a */
    private TextView f124984a;

    static {
        Covode.recordClassIndex(64245);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a
    /* renamed from: a */
    public final void mo91007a() {
        super.mo91007a();
        Object a = mo91563a(R.id.cmk);
        C89219l.m154716b(a, "");
        this.f124984a = (TextView) a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54534bi(View view, EnumC53772b bVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.im.core.d.ai, com.bytedance.im.core.d.ai, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent, int] */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a
    /* renamed from: a */
    public final /* synthetic */ void mo91008a(C19538ai aiVar, C19538ai aiVar2, SystemContent systemContent, int i) {
        SystemContent systemContent2 = systemContent;
        C89219l.m154721d(aiVar, "");
        super.mo91008a(aiVar, aiVar2, systemContent2, i);
        TextView textView = this.f124984a;
        if (textView == null) {
            C89219l.m154710a("textView");
        }
        int c = C0643b.m2378c(textView.getContext(), R.color.bx);
        TextView textView2 = this.f124984a;
        if (textView2 == null) {
            C89219l.m154710a("textView");
        }
        int c2 = C0643b.m2378c(textView2.getContext(), R.color.c9);
        TextView textView3 = this.f124984a;
        if (textView3 == null) {
            C89219l.m154710a("textView");
        }
        C53701d.m98974a(null, aiVar, systemContent2, textView3, this.f124817m, this.f124818n, c, c2, true, 0, "", null);
    }
}
