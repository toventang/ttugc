package com.p2082ss.android.ugc.tools.infosticker.view.internal.main;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.model.UrlModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84686f;
import com.p2082ss.android.ugc.tools.p4340c.C84402a;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.EnumC84444c;
import com.p2082ss.android.ugc.tools.view.widget.p4369c.C85037b;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.n */
public final class C84811n extends AbstractC84686f<Effect> {
    static {
        Covode.recordClassIndex(98787);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84686f
    /* renamed from: a */
    public final /* synthetic */ void mo114483a(Effect effect) {
        List<String> urlList;
        String str;
        Effect effect2 = effect;
        C89219l.m154721d(effect2, "");
        UrlModel iconUrl = effect2.getIconUrl();
        if (iconUrl != null && (urlList = iconUrl.getUrlList()) != null && (str = (String) C89070n.m154561b((List) urlList, 0)) != null) {
            C84402a.m145173a(this.f189208g.getImageView(), str);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84811n(View view, C85037b bVar, AbstractC89187q<? super Effect, ? super Integer, ? super EnumC84444c, C89391z> qVar) {
        super(view, bVar, qVar);
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(qVar, "");
    }
}
