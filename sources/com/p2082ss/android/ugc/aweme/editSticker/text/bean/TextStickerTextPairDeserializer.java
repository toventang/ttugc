package com.p2082ss.android.ugc.aweme.editSticker.text.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28017j;
import com.google.gson.AbstractC28018k;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28022o;
import com.google.gson.C28025r;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.editSticker.C45866d;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import java.lang.reflect.Type;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextPairDeserializer */
public final class TextStickerTextPairDeserializer implements AbstractC28018k<TextStickerTextPair> {
    static {
        Covode.recordClassIndex(54630);
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextPairDeserializer$a */
    public static final class C46075a extends C27895a<List<? extends InteractTextStructWrap>> {
        static {
            Covode.recordClassIndex(54631);
        }

        C46075a() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextPairDeserializer$b */
    public static final class C46076b extends C27895a<List<? extends InteractTextStructWrap>> {
        static {
            Covode.recordClassIndex(54632);
        }

        C46076b() {
        }
    }

    /* renamed from: a */
    private static TextStickerTextPair m88933a(AbstractC28019l lVar) {
        if (lVar == null) {
            try {
                return new TextStickerTextPair();
            } catch (Exception e) {
                C73991bj.m130129a(e);
                return new TextStickerTextPair();
            }
        } else {
            C28022o j = lVar.mo46789j();
            AbstractC28019l c = j.mo46803c("a");
            if (c == null && (c = j.mo46803c("first")) == null) {
                return new TextStickerTextPair();
            }
            AbstractC28019l c2 = j.mo46803c("b");
            if (c2 == null && (c2 = j.mo46803c("second")) == null) {
                return new TextStickerTextPair();
            }
            if (c instanceof C28025r) {
                String iVar = c2.mo46790k().toString();
                C89219l.m154716b(iVar, "");
                String c3 = c.mo46689c();
                C89219l.m154716b(c3, "");
                Object a = C45866d.m88489b().mo46671a(iVar, new C46075a().type);
                C89219l.m154716b(a, "");
                return new TextStickerTextPair(c3, (List) a);
            } else if (!(c2 instanceof C28025r)) {
                return new TextStickerTextPair();
            } else {
                String iVar2 = c.mo46790k().toString();
                C89219l.m154716b(iVar2, "");
                String c4 = c2.mo46689c();
                C89219l.m154716b(c4, "");
                Object a2 = C45866d.m88489b().mo46671a(iVar2, new C46076b().type);
                C89219l.m154716b(a2, "");
                return new TextStickerTextPair(c4, (List) a2);
            }
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.AbstractC28018k
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ TextStickerTextPair mo11581a(AbstractC28019l lVar, Type type, AbstractC28017j jVar) {
        return m88933a(lVar);
    }
}
