package com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2590d;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2594g.C38110a;
import com.p2082ss.android.ugc.aweme.commercialize.live.p2576b.C38054a;
import com.p2082ss.android.ugc.aweme.commercialize.live.p2595c.C38113a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.live.business.links.d.b */
public final class C38090b extends AbstractC38089a {
    static {
        Covode.recordClassIndex(45557);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2590d.AbstractC38089a
    /* renamed from: b */
    public final void mo66355b(Context context) {
        C89219l.m154721d(context, "");
        if (context instanceof ActivityC0945e) {
            C38110a.C38111a.m77220a(((ActivityC0945e) context).getSupportFragmentManager());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2590d.AbstractC38089a
    /* renamed from: a */
    public final void mo66354a(Context context) {
        C89219l.m154721d(context, "");
        if (context instanceof ActivityC0945e) {
            String a = C38054a.m77134a().f89923b.mo66342a();
            Bundle bundle = this.f89998a;
            if (bundle != null) {
                a = C38113a.m77223a(a, bundle);
            }
            C38110a.C38111a.m77221a(((ActivityC0945e) context).getSupportFragmentManager(), a);
        }
    }
}
