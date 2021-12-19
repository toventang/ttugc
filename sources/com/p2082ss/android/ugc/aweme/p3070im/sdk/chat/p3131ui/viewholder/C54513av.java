package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3136d.C54438a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.av */
public class C54513av extends AbstractC54482a<BaseContent> {

    /* renamed from: A */
    public View f124937A;

    /* renamed from: a */
    public RemoteImageView f124938a;

    /* renamed from: b */
    public TuxTextView f124939b;

    /* renamed from: x */
    public TuxTextView f124940x;

    /* renamed from: y */
    public TextView f124941y;

    /* renamed from: z */
    public LinearLayout f124942z;

    static {
        Covode.recordClassIndex(64224);
    }

    /* renamed from: i */
    public final RemoteImageView mo91606i() {
        RemoteImageView remoteImageView = this.f124938a;
        if (remoteImageView == null) {
            C89219l.m154710a("iconView");
        }
        return remoteImageView;
    }

    /* renamed from: j */
    public final TuxTextView mo91607j() {
        TuxTextView tuxTextView = this.f124939b;
        if (tuxTextView == null) {
            C89219l.m154710a("titleView");
        }
        return tuxTextView;
    }

    /* renamed from: k */
    public final TuxTextView mo91608k() {
        TuxTextView tuxTextView = this.f124940x;
        if (tuxTextView == null) {
            C89219l.m154710a("descView");
        }
        return tuxTextView;
    }

    /* renamed from: l */
    public final TextView mo91609l() {
        TextView textView = this.f124941y;
        if (textView == null) {
            C89219l.m154710a("tagView");
        }
        return textView;
    }

    /* renamed from: m */
    public final void mo91610m() {
        RemoteImageView remoteImageView = this.f124938a;
        if (remoteImageView == null) {
            C89219l.m154710a("iconView");
        }
        C34577e.m70591a(remoteImageView, 2131232866);
        TuxTextView tuxTextView = this.f124940x;
        if (tuxTextView == null) {
            C89219l.m154710a("descView");
        }
        tuxTextView.setVisibility(8);
        TuxTextView tuxTextView2 = this.f124939b;
        if (tuxTextView2 == null) {
            C89219l.m154710a("titleView");
        }
        tuxTextView2.setText(R.string.cn_);
        this.f124819o.mo91505a(150994945, true);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a
    /* renamed from: a */
    public void mo91007a() {
        super.mo91007a();
        View findViewById = this.itemView.findViewById(R.id.acq);
        C89219l.m154716b(findViewById, "");
        this.f124819o = C54438a.C54439a.m99780a(findViewById);
        View findViewById2 = this.itemView.findViewById(R.id.icon_iv);
        C89219l.m154716b(findViewById2, "");
        this.f124938a = (RemoteImageView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.title_tv);
        C89219l.m154716b(findViewById3, "");
        this.f124939b = (TuxTextView) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.ajs);
        C89219l.m154716b(findViewById4, "");
        this.f124940x = (TuxTextView) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.eez);
        C89219l.m154716b(findViewById5, "");
        this.f124941y = (TextView) findViewById5;
        View findViewById6 = this.itemView.findViewById(R.id.a1x);
        C89219l.m154716b(findViewById6, "");
        this.f124937A = findViewById6;
        View findViewById7 = this.itemView.findViewById(R.id.ul);
        C89219l.m154716b(findViewById7, "");
        this.f124942z = (LinearLayout) findViewById7;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54513av(View view, EnumC53772b bVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a
    /* renamed from: a */
    public void mo91008a(C19538ai aiVar, C19538ai aiVar2, BaseContent baseContent, int i) {
        C89219l.m154721d(aiVar, "");
        super.mo91008a(aiVar, aiVar2, baseContent, i);
        this.f124819o.mo91505a(150994945, false);
    }
}
