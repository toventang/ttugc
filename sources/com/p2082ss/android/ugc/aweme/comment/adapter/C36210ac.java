package com.p2082ss.android.ugc.aweme.comment.adapter;

import androidx.recyclerview.widget.C1445j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.comment.model.GifEmoji;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.ac */
public final class C36210ac extends C1445j.AbstractC1451e<GifEmoji> {
    static {
        Covode.recordClassIndex(43476);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // androidx.recyclerview.widget.C1445j.AbstractC1451e
    /* renamed from: b */
    public final /* synthetic */ boolean mo4954b(GifEmoji gifEmoji, GifEmoji gifEmoji2) {
        C89219l.m154721d(gifEmoji, "");
        C89219l.m154721d(gifEmoji2, "");
        return C89219l.m154714a(gifEmoji, gifEmoji2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // androidx.recyclerview.widget.C1445j.AbstractC1451e
    /* renamed from: a */
    public final /* synthetic */ boolean mo4953a(GifEmoji gifEmoji, GifEmoji gifEmoji2) {
        GifEmoji gifEmoji3 = gifEmoji;
        GifEmoji gifEmoji4 = gifEmoji2;
        C89219l.m154721d(gifEmoji3, "");
        C89219l.m154721d(gifEmoji4, "");
        return C89219l.m154714a((Object) gifEmoji3.getId(), (Object) gifEmoji4.getId());
    }
}
