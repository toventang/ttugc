package com.p2082ss.android.ugc.aweme.comment.p2497k;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1453f.AbstractC20179a;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.comment.api.GifEmojiApi;
import com.p2082ss.android.ugc.aweme.comment.model.GifEmoji;
import com.p2082ss.android.ugc.aweme.comment.model.GifEmojiResponse;
import com.p2082ss.android.ugc.aweme.comment.model.StickerBean;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.k.b */
final class C36525b extends AbstractC20179a<C36530d, List<? extends GifEmoji>, C36530d, GifEmojiResponse> {
    static {
        Covode.recordClassIndex(43828);
    }

    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20181b
    /* renamed from: b */
    public final /* synthetic */ Object mo33483b(Object obj) {
        C89219l.m154721d(obj, "");
        return obj;
    }

    /* Return type fixed from 'f.a.t' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20179a
    /* renamed from: a */
    public final /* synthetic */ AbstractC88979t<GifEmojiResponse> mo33481a(C36530d dVar) {
        C36530d dVar2 = dVar;
        C89219l.m154721d(dVar2, "");
        AbstractC88979t<GifEmojiResponse> b = ((GifEmojiApi) GifEmojiApi.C36262a.f85693a.getValue()).searchGifEmoji(dVar2.f86487a, dVar2.f86488b, UGCMonitor.EVENT_COMMENT, dVar2.f86489c).mo143278b(C88925a.m154180b(C88946a.f201991c));
        C89219l.m154716b(b, "");
        return b;
    }

    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20181b
    /* renamed from: a */
    public final /* synthetic */ Object mo33482a(Object obj, Object obj2) {
        List<GifEmoji> stickerList;
        GifEmojiResponse gifEmojiResponse = (GifEmojiResponse) obj2;
        C89219l.m154721d(obj, "");
        C89219l.m154721d(gifEmojiResponse, "");
        StickerBean stickers = gifEmojiResponse.getStickers();
        if (stickers == null || (stickerList = stickers.getStickerList()) == null) {
            return C89086z.INSTANCE;
        }
        return stickerList;
    }
}
