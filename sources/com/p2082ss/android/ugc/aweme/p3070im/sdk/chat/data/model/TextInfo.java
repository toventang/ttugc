package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.TextInfo */
public final class TextInfo {
    private final List<NamedValue> infos;
    private final MessageTitle title;

    static {
        Covode.recordClassIndex(63487);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.im.sdk.chat.data.model.TextInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TextInfo copy$default(TextInfo textInfo, MessageTitle messageTitle, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            messageTitle = textInfo.title;
        }
        if ((i & 2) != 0) {
            list = textInfo.infos;
        }
        return textInfo.copy(messageTitle, list);
    }

    public final MessageTitle component1() {
        return this.title;
    }

    public final List<NamedValue> component2() {
        return this.infos;
    }

    public final TextInfo copy(MessageTitle messageTitle, List<NamedValue> list) {
        C89219l.m154721d(messageTitle, "");
        C89219l.m154721d(list, "");
        return new TextInfo(messageTitle, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextInfo)) {
            return false;
        }
        TextInfo textInfo = (TextInfo) obj;
        return C89219l.m154714a(this.title, textInfo.title) && C89219l.m154714a(this.infos, textInfo.infos);
    }

    public final int hashCode() {
        MessageTitle messageTitle = this.title;
        int i = 0;
        int hashCode = (messageTitle != null ? messageTitle.hashCode() : 0) * 31;
        List<NamedValue> list = this.infos;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "TextInfo(title=" + this.title + ", infos=" + this.infos + ")";
    }

    public final List<NamedValue> getInfos() {
        return this.infos;
    }

    public final MessageTitle getTitle() {
        return this.title;
    }

    public TextInfo(MessageTitle messageTitle, List<NamedValue> list) {
        C89219l.m154721d(messageTitle, "");
        C89219l.m154721d(list, "");
        this.title = messageTitle;
        this.infos = list;
    }
}
