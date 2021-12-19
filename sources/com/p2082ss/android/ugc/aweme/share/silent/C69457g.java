package com.p2082ss.android.ugc.aweme.share.silent;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.share.silent.g */
public final class C69457g extends AbstractC69426a {
    static {
        Covode.recordClassIndex(81795);
    }

    @Override // com.p2082ss.android.ugc.aweme.share.silent.AbstractC69426a
    public final int getLayoutResId() {
        return R.layout.ayv;
    }

    @Override // com.p2082ss.android.ugc.aweme.share.silent.AbstractC69426a
    /* renamed from: a */
    public final void mo109674a() {
        mo109676a(32, 20);
        mo109681b();
        setSyncIconSize((int) C13628n.m24520b(getContext(), 32.0f));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69457g(Context context) {
        super(context);
        C89219l.m154721d(context, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.share.silent.AbstractC69426a
    /* renamed from: a */
    public final void mo109677a(View view) {
        C89219l.m154721d(view, "");
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        C23163i.m43668b(view, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 12.0f, system.getDisplayMetrics()))), null, 0, null, false, 26);
    }
}
