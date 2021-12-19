package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.emoji.p2904g.C46534a;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.SayHelloContent */
public final class SayHelloContent extends BaseContent {
    private SayHelloContentEmoji emojiHolder;
    @AbstractC27891c(mo46611a = "hello_text")
    public final String helloText;
    @AbstractC27891c(mo46611a = "joker_stickers")
    private List<? extends C46534a> jockerStickers;
    @AbstractC27891c(mo46611a = "nickname")
    public final String nickname;
    @AbstractC27891c(mo46611a = "stickers")
    private List<? extends C46534a> stickers;

    static {
        Covode.recordClassIndex(63455);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.emoji.g.a>, java.util.List<com.ss.android.ugc.aweme.emoji.g.a> */
    private final List<C46534a> component3() {
        return this.jockerStickers;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.emoji.g.a>, java.util.List<com.ss.android.ugc.aweme.emoji.g.a> */
    private final List<C46534a> component4() {
        return this.stickers;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.im.sdk.chat.data.model.SayHelloContent */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SayHelloContent copy$default(SayHelloContent sayHelloContent, String str, String str2, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sayHelloContent.nickname;
        }
        if ((i & 2) != 0) {
            str2 = sayHelloContent.helloText;
        }
        if ((i & 4) != 0) {
            list = sayHelloContent.jockerStickers;
        }
        if ((i & 8) != 0) {
            list2 = sayHelloContent.stickers;
        }
        return sayHelloContent.copy(str, str2, list, list2);
    }

    public final String component1() {
        return this.nickname;
    }

    public final String component2() {
        return this.helloText;
    }

    public final SayHelloContent copy(String str, String str2, List<? extends C46534a> list, List<? extends C46534a> list2) {
        return new SayHelloContent(str, str2, list, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SayHelloContent)) {
            return false;
        }
        SayHelloContent sayHelloContent = (SayHelloContent) obj;
        return C89219l.m154714a(this.nickname, sayHelloContent.nickname) && C89219l.m154714a(this.helloText, sayHelloContent.helloText) && C89219l.m154714a(this.jockerStickers, sayHelloContent.jockerStickers) && C89219l.m154714a(this.stickers, sayHelloContent.stickers);
    }

    public final int hashCode() {
        String str = this.nickname;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.helloText;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<? extends C46534a> list = this.jockerStickers;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        List<? extends C46534a> list2 = this.stickers;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode3 + i;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public final String toString() {
        return "SayHelloContent(nickname=" + this.nickname + ", helloText=" + this.helloText + ", jockerStickers=" + this.jockerStickers + ", stickers=" + this.stickers + ")";
    }

    public final void optimise() {
        getEmojiInternal();
    }

    public final boolean isNewStyle() {
        return getEmojiInternal() instanceof JockerEmoji;
    }

    public final List<C46534a> getEmojiList() {
        return getEmojiInternal().getStickers();
    }

    private final SayHelloContentEmoji getEmojiInternal() {
        boolean z;
        boolean z2;
        SayHelloContentEmoji basicEmoji;
        SayHelloContentEmoji sayHelloContentEmoji = this.emojiHolder;
        if (sayHelloContentEmoji != null) {
            return sayHelloContentEmoji;
        }
        List<? extends C46534a> list = this.stickers;
        boolean z3 = true;
        if (list == null || list.isEmpty() || list.size() < 3) {
            z = false;
        } else {
            z = true;
        }
        List<? extends C46534a> list2 = this.jockerStickers;
        if (list2 == null || list2.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z4 = !z2;
        if (z || !z4) {
            z3 = false;
        }
        if (z3) {
            this.stickers = null;
            List list3 = this.jockerStickers;
            if (list3 == null) {
                list3 = C89086z.INSTANCE;
            }
            basicEmoji = new JockerEmoji(list3);
        } else {
            this.jockerStickers = null;
            List list4 = this.stickers;
            if (list4 == null) {
                list4 = C89086z.INSTANCE;
            }
            basicEmoji = new BasicEmoji(list4);
        }
        this.emojiHolder = basicEmoji;
        return basicEmoji;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.PreloadFetcher, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public final List<UrlModel> fetchPreload() {
        if (getEmojiList().isEmpty()) {
            return null;
        }
        List<C46534a> a = C89070n.m154555a((List) getEmojiList(), C89271h.m154766a(0, Math.min(3, getEmojiList().size())));
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) a, 10));
        for (C46534a aVar : a) {
            arrayList.add(aVar.getAnimateUrl());
        }
        return arrayList;
    }

    public final void setMsgHint(String str) {
        C89219l.m154721d(str, "");
        this.msgHint = str;
    }

    public SayHelloContent(String str, String str2, List<? extends C46534a> list, List<? extends C46534a> list2) {
        this.nickname = str;
        this.helloText = str2;
        this.jockerStickers = list;
        this.stickers = list2;
    }
}
