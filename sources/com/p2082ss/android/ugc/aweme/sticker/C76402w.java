package com.p2082ss.android.ugc.aweme.sticker;

import androidx.appcompat.app.ActivityC0218d;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.presenter.C75589c;
import com.p2082ss.android.ugc.aweme.sticker.presenter.C75657q;
import com.p2082ss.android.ugc.aweme.sticker.repository.C75675a;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75704j;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75715t;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75719x;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.w */
public final class C76402w extends C75589c {

    /* renamed from: a */
    private final ActivityC0218d f171632a;

    static {
        Covode.recordClassIndex(89362);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.w$a */
    static final class C76403a extends AbstractC89220m implements AbstractC89171a<AbstractC75704j> {

        /* renamed from: a */
        public static final C76403a f171633a = new C76403a();

        static {
            Covode.recordClassIndex(89363);
        }

        C76403a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC75704j invoke() {
            return new C76111v();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.C75589c
    /* renamed from: a */
    public final AbstractC75719x mo119315a(String str, AbstractC84398d dVar, AbstractC75715t tVar, List<EffectCategoryModel> list) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(tVar, "");
        C89219l.m154721d(list, "");
        AbstractC75719x a = super.mo119315a(str, dVar, tVar, list);
        Objects.requireNonNull(a, "null cannot be cast to non-null type com.ss.android.ugc.aweme.sticker.repository.DefaultStickerRepositoryFactory");
        C75675a aVar = (C75675a) a;
        C76403a aVar2 = C76403a.f171633a;
        C89219l.m154721d(aVar2, "");
        aVar.f170099d = aVar2;
        return aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76402w(ActivityC0218d dVar, C75657q qVar, AbstractC75715t tVar, AbstractC84398d dVar2, List<EffectCategoryModel> list) {
        super(dVar, qVar, tVar, dVar2, list);
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(qVar, "");
        C89219l.m154721d(tVar, "");
        C89219l.m154721d(dVar2, "");
        C89219l.m154721d(list, "");
        this.f171632a = dVar;
    }
}
