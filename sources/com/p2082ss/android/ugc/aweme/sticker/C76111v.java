package com.p2082ss.android.ugc.aweme.sticker;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.C72847c;
import com.p2082ss.android.ugc.aweme.sticker.repository.internals.p3994f.C75854a;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.v */
public final class C76111v extends C75854a {
    static {
        Covode.recordClassIndex(89059);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75704j, com.p2082ss.android.ugc.aweme.sticker.repository.internals.p3994f.C75854a
    /* renamed from: a */
    public final void mo119432a(List<EffectCategoryModel> list) {
        C89219l.m154721d(list, "");
        C89070n.m154537a((List) list, (AbstractC89172b) C76112a.f171001a);
        super.mo119432a(list);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.v$a */
    static final class C76112a extends AbstractC89220m implements AbstractC89172b<EffectCategoryModel, Boolean> {

        /* renamed from: a */
        public static final C76112a f171001a = new C76112a();

        static {
            Covode.recordClassIndex(89060);
        }

        C76112a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(EffectCategoryModel effectCategoryModel) {
            EffectCategoryModel effectCategoryModel2 = effectCategoryModel;
            C89219l.m154721d(effectCategoryModel2, "");
            return Boolean.valueOf(C72847c.m128629a(effectCategoryModel2.getExtra(), "prop_tab_block_story"));
        }
    }
}
