package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.Content */
public final class Content {
    private final List<Template> template;
    private final String tips;

    static {
        Covode.recordClassIndex(63429);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.im.sdk.chat.data.model.Content */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Content copy$default(Content content, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = content.tips;
        }
        if ((i & 2) != 0) {
            list = content.template;
        }
        return content.copy(str, list);
    }

    public final String component1() {
        return this.tips;
    }

    public final List<Template> component2() {
        return this.template;
    }

    public final Content copy(String str, List<Template> list) {
        C89219l.m154721d(str, "");
        return new Content(str, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Content)) {
            return false;
        }
        Content content = (Content) obj;
        return C89219l.m154714a(this.tips, content.tips) && C89219l.m154714a(this.template, content.template);
    }

    public final int hashCode() {
        String str = this.tips;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<Template> list = this.template;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "Content(tips=" + this.tips + ", template=" + this.template + ")";
    }

    public final List<Template> getTemplate() {
        return this.template;
    }

    public final String getTips() {
        return this.tips;
    }

    public Content(String str, List<Template> list) {
        C89219l.m154721d(str, "");
        this.tips = str;
        this.template = list;
    }
}
