package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.p3090a.p3095d.p3096a;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.emoji.p2904g.C46534a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55186ah;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.base.p3195a.AbstractC55295b;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.a.d.a.a */
public final class C53842a extends AbstractC55295b<C53843b, C46534a> {

    /* renamed from: a */
    public AbstractC89183m<? super View, ? super Integer, C89391z> f123465a;

    static {
        Covode.recordClassIndex(63502);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        C89219l.m154721d(viewGroup, "");
        return new C53843b(viewGroup);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
        Objects.requireNonNull(viewHolder, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.feature.sayhi.ui.adapter.GreetEmojiViewHolder");
        C46534a aVar = (C46534a) mo92313a(i);
        if (aVar != null) {
            C53843b bVar = (C53843b) viewHolder;
            C89219l.m154721d(aVar, "");
            C55186ah.m100891a(bVar.f123466a, aVar.getAnimateUrl(), null, true);
            bVar.f123467b = this.f123465a;
        }
    }
}
