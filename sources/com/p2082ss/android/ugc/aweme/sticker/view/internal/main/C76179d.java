package com.p2082ss.android.ugc.aweme.sticker.view.internal.main;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76147c;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76124k;
import com.p2082ss.android.ugc.tools.view.style.StyleTabLayout;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.main.d */
public final class C76179d implements AbstractC76124k {
    static {
        Covode.recordClassIndex(89129);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76124k
    /* renamed from: a */
    public final AbstractC76147c mo119865a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View findViewById = viewGroup.findViewById(R.id.blm);
        C89219l.m154716b(findViewById, "");
        return new C76187h(findViewById);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76124k
    /* renamed from: b */
    public final StyleTabLayout mo119866b(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View findViewById = viewGroup.findViewById(R.id.eec);
        C89219l.m154716b(findViewById, "");
        return (StyleTabLayout) findViewById;
    }
}
