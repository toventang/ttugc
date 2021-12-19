package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.TextContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.r */
public final class C54564r extends AbstractC54482a<TextContent> {

    /* renamed from: a */
    private final Context f125059a;

    /* renamed from: b */
    private final TextView f125060b;

    /* renamed from: x */
    private final TextView f125061x;

    static {
        Covode.recordClassIndex(64275);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a
    /* renamed from: a */
    public final void mo91564a(View.OnClickListener onClickListener) {
        super.mo91564a(onClickListener);
        this.f125061x.setOnClickListener(onClickListener);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54564r(View view, EnumC53772b bVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
        this.f125059a = view.getContext();
        View findViewById = view.findViewById(R.id.dav);
        C89219l.m154716b(findViewById, "");
        this.f125060b = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.cwo);
        C89219l.m154716b(findViewById2, "");
        this.f125061x = (TextView) findViewById2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.im.core.d.ai, com.bytedance.im.core.d.ai, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent, int] */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a
    /* renamed from: a */
    public final /* synthetic */ void mo91008a(C19538ai aiVar, C19538ai aiVar2, TextContent textContent, int i) {
        C89219l.m154721d(aiVar, "");
        super.mo91008a(aiVar, aiVar2, textContent, i);
        this.f125060b.setText("");
        TextView textView = this.f125061x;
        Context context = this.f125059a;
        C89219l.m154716b(context, "");
        textView.setText(context.getResources().getText(R.string.sd));
        this.f125061x.setTag(50331648, 41);
        this.f125061x.setTag(67108864, this.f124823s);
    }
}
