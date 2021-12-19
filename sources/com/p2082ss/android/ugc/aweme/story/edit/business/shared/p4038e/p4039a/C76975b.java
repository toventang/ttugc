package com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4038e.p4039a;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.C21582f;
import com.p2082ss.android.ugc.aweme.infoSticker.C56723h;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.C72847c;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p2082ss.android.ugc.gamora.editor.lightening.C82306a;
import com.p2082ss.android.ugc.gamora.editor.sticker.panel.C82910c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.e.a.b */
public final class C76975b extends C82910c {

    /* renamed from: a */
    public static final C76976a f172708a = new C76976a((byte) 0);

    static {
        Covode.recordClassIndex(89971);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.e.a.b$a */
    public static final class C76976a {
        static {
            Covode.recordClassIndex(89972);
        }

        private C76976a() {
        }

        public /* synthetic */ C76976a(byte b) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76975b(C21582f fVar) {
        super(fVar);
        C89219l.m154721d(fVar, "");
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.panel.C82910c
    /* renamed from: a */
    public final boolean mo120521a(EffectCategoryResponse effectCategoryResponse) {
        C89219l.m154721d(effectCategoryResponse, "");
        return C72847c.m128629a(effectCategoryResponse.getExtra(), "info_sticker_tab_block_story");
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.panel.C82910c
    /* renamed from: a */
    public final boolean mo120520a(Effect effect) {
        C89219l.m154721d(effect, "");
        if (C82306a.m142357a()) {
            return C72847c.m128629a(effect.getExtra(), "info_sticker_block_story");
        }
        if (C72847c.m128629a(effect.getExtra(), "info_sticker_block_story") || C56723h.m102735c(effect) || C56723h.m102734b(effect)) {
            return true;
        }
        return false;
    }
}
