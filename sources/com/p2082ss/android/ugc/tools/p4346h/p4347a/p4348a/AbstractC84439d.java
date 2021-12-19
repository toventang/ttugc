package com.p2082ss.android.ugc.tools.p4346h.p4347a.p4348a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84451j;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84456m;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.C84435a;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.C84443b;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.C84457n;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.h.a.a.d */
public interface AbstractC84439d<CATEGORY, DOWNLOAD_EVENT> {
    static {
        Covode.recordClassIndex(98404);
    }

    /* renamed from: a */
    AbstractC84451j<Effect, CategoryEffectModel> mo129420a(C84443b bVar);

    /* renamed from: a */
    AbstractC88979t<List<AbstractC84456m>> mo129421a();

    /* renamed from: a */
    AbstractC88979t<DOWNLOAD_EVENT> mo129422a(Effect effect, boolean z);

    /* renamed from: a */
    AbstractC88979t<C84435a<CATEGORY, Effect>> mo129423a(C84457n nVar);

    /* renamed from: a */
    CATEGORY mo129424a(Effect effect);

    /* renamed from: a */
    CATEGORY mo129425a(String str);

    /* renamed from: com.ss.android.ugc.tools.h.a.a.d$a */
    public static final class C84440a {
        static {
            Covode.recordClassIndex(98405);
        }

        /* renamed from: a */
        public static <CATEGORY, DOWNLOAD_EVENT> CATEGORY m145262a(AbstractC84439d<CATEGORY, DOWNLOAD_EVENT> dVar, Effect effect) {
            C89219l.m154721d(effect, "");
            return dVar.mo129425a(effect.getEffectId());
        }
    }
}
