package com.p2082ss.android.ugc.aweme.shortvideo.sticker.question;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C72890c;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72921b;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3870f.AbstractC72927a;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a;
import com.p2082ss.android.ugc.aweme.sticker.C75391j;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.question.b */
public final class C73090b extends AbstractC72927a {
    static {
        Covode.recordClassIndex(85797);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3870f.AbstractC72927a
    /* renamed from: a */
    public final List<NormalTrackTimeStamp> mo115231a(long j, InteractStickerStruct interactStickerStruct) {
        C89219l.m154721d(interactStickerStruct, "");
        return C72890c.m128723b(j, interactStickerStruct);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3870f.AbstractC72927a
    /* renamed from: a */
    public final void mo115232a(float f, float f2, AbstractC72921b bVar) {
        C89219l.m154721d(bVar, "");
        if (C16048b.m29633a().mo25421a(true, "one_click_question_sticker_go_to_qa_page", false)) {
            AbstractC72946a aVar = this.f163646d;
            Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.question.FeedQaStickerView");
            if (!((C73085a) aVar).mo115507c()) {
                new C79459a(this.f163645c).mo123050a(R.string.f46).mo123053a();
                return;
            }
            AbstractC72946a aVar2 = this.f163646d;
            Objects.requireNonNull(aVar2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.question.FeedQaStickerView");
            ((C73085a) aVar2).mo115508g();
            return;
        }
        AbstractC72946a aVar3 = this.f163646d;
        Objects.requireNonNull(aVar3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.question.FeedQaStickerView");
        bVar.mo115309a(aVar3.mo115355a(f, f2));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73090b(Context context, C73085a aVar, InteractStickerStruct interactStickerStruct, C75391j jVar) {
        super(context, aVar, interactStickerStruct, jVar);
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(interactStickerStruct, "");
    }
}
