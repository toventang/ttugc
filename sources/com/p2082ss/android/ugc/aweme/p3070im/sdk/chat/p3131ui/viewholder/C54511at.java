package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareSearchContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3172c.C55070h;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3172c.C55071i;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55226r;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55231t;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3184b.C55192b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3185c.C55198a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.at */
public class C54511at extends C54513av {
    static {
        Covode.recordClassIndex(64222);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a
    public final void bK_() {
        View view = this.itemView;
        C89219l.m154716b(view, "");
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        float dimensionPixelSize = (float) context.getResources().getDimensionPixelSize(R.dimen.li);
        if (C55226r.m100992a()) {
            C55192b.m100905a(mo91606i(), new float[]{dimensionPixelSize, 0.0f, 0.0f, dimensionPixelSize});
            return;
        }
        C55192b.m100905a(mo91606i(), new float[]{0.0f, dimensionPixelSize, dimensionPixelSize, 0.0f});
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54511at(View view, EnumC53772b bVar) {
        super(view, bVar);
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54513av
    /* renamed from: a */
    public void mo91008a(C19538ai aiVar, C19538ai aiVar2, BaseContent baseContent, int i) {
        C89219l.m154721d(aiVar, "");
        super.mo91008a(aiVar, aiVar2, baseContent, i);
        Objects.requireNonNull(baseContent, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareSearchContent");
        ShareSearchContent shareSearchContent = (ShareSearchContent) baseContent;
        this.f124819o.mo91505a(50331648, 47);
        this.f124819o.mo91505a(50331649, Boolean.valueOf(C55231t.m101002b(aiVar, shareSearchContent)));
        this.f124819o.mo91505a(50331650, this.f124817m);
        this.f124819o.mo91505a(50331651, Long.valueOf(aiVar.getMsgId()));
        if ((C55071i.m100717a(shareSearchContent.getImage(), C55071i.m100718a())) || (C55071i.m100717a(shareSearchContent.getUrl(), C55071i.m100718a())) || C55070h.m100710a(shareSearchContent.getSchema())) {
            mo91610m();
            return;
        }
        mo91607j().setText(shareSearchContent.getTitle());
        mo91608k().setVisibility(0);
        if (shareSearchContent.getDesc() == null || TextUtils.isEmpty(shareSearchContent.getDesc())) {
            mo91608k().setVisibility(8);
        } else {
            mo91608k().setText(shareSearchContent.getDesc());
            mo91608k().setVisibility(0);
        }
        mo91609l().setText(R.string.cin);
        if (!TextUtils.isEmpty(shareSearchContent.getImage())) {
            C55198a.m100935a(mo91606i(), shareSearchContent.getImage());
        } else {
            C34577e.m70591a(mo91606i(), 2131232866);
        }
    }
}
