package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.emoji.p2904g.C46534a;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.JockerEmoji */
final class JockerEmoji extends SayHelloContentEmoji {
    private final List<C46534a> stickers;

    static {
        Covode.recordClassIndex(63447);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.im.sdk.chat.data.model.JockerEmoji */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JockerEmoji copy$default(JockerEmoji jockerEmoji, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = jockerEmoji.getStickers();
        }
        return jockerEmoji.copy(list);
    }

    public final List<C46534a> component1() {
        return getStickers();
    }

    public final JockerEmoji copy(List<? extends C46534a> list) {
        C89219l.m154721d(list, "");
        return new JockerEmoji(list);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof JockerEmoji) && C89219l.m154714a(getStickers(), ((JockerEmoji) obj).getStickers());
        }
        return true;
    }

    public final int hashCode() {
        List<C46534a> stickers2 = getStickers();
        if (stickers2 != null) {
            return stickers2.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "JockerEmoji(stickers=" + getStickers() + ")";
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.SayHelloContentEmoji
    public final List<C46534a> getStickers() {
        return this.stickers;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.emoji.g.a> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JockerEmoji(List<? extends C46534a> list) {
        super(null);
        C89219l.m154721d(list, "");
        this.stickers = list;
    }
}
