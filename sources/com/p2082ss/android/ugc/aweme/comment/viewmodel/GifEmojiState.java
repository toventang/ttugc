package com.p2082ss.android.ugc.aweme.comment.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.p2082ss.android.ugc.aweme.comment.model.GifEmoji;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiState */
public final class GifEmojiState implements AbstractC20368af {
    private final GifEmoji gifEmoji;

    static {
        Covode.recordClassIndex(44605);
    }

    public GifEmojiState() {
        this(null, 1, null);
    }

    public static /* synthetic */ GifEmojiState copy$default(GifEmojiState gifEmojiState, GifEmoji gifEmoji2, int i, Object obj) {
        if ((i & 1) != 0) {
            gifEmoji2 = gifEmojiState.gifEmoji;
        }
        return gifEmojiState.copy(gifEmoji2);
    }

    public final GifEmoji component1() {
        return this.gifEmoji;
    }

    public final GifEmojiState copy(GifEmoji gifEmoji2) {
        C89219l.m154721d(gifEmoji2, "");
        return new GifEmojiState(gifEmoji2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof GifEmojiState) && C89219l.m154714a(this.gifEmoji, ((GifEmojiState) obj).gifEmoji);
        }
        return true;
    }

    public final int hashCode() {
        GifEmoji gifEmoji2 = this.gifEmoji;
        if (gifEmoji2 != null) {
            return gifEmoji2.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "GifEmojiState(gifEmoji=" + this.gifEmoji + ")";
    }

    public final GifEmoji getGifEmoji() {
        return this.gifEmoji;
    }

    public GifEmojiState(GifEmoji gifEmoji2) {
        C89219l.m154721d(gifEmoji2, "");
        this.gifEmoji = gifEmoji2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GifEmojiState(GifEmoji gifEmoji2, int i, C89214g gVar) {
        this((i & 1) != 0 ? new GifEmoji() : gifEmoji2);
    }
}
