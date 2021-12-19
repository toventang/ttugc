package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.IMFromMessageTips */
public final class IMFromMessageTips {
    @AbstractC27891c(mo46611a = "template")
    private List<IMActionTemplate> template;
    @AbstractC27891c(mo46611a = "tips")
    private String tips;

    static {
        Covode.recordClassIndex(63442);
    }

    public IMFromMessageTips() {
        this(null, null, 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.im.sdk.chat.data.model.IMFromMessageTips */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IMFromMessageTips copy$default(IMFromMessageTips iMFromMessageTips, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = iMFromMessageTips.tips;
        }
        if ((i & 2) != 0) {
            list = iMFromMessageTips.template;
        }
        return iMFromMessageTips.copy(str, list);
    }

    public final String component1() {
        return this.tips;
    }

    public final List<IMActionTemplate> component2() {
        return this.template;
    }

    public final IMFromMessageTips copy(String str, List<IMActionTemplate> list) {
        return new IMFromMessageTips(str, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMFromMessageTips)) {
            return false;
        }
        IMFromMessageTips iMFromMessageTips = (IMFromMessageTips) obj;
        return C89219l.m154714a(this.tips, iMFromMessageTips.tips) && C89219l.m154714a(this.template, iMFromMessageTips.template);
    }

    public final int hashCode() {
        String str = this.tips;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<IMActionTemplate> list = this.template;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "IMFromMessageTips(tips=" + this.tips + ", template=" + this.template + ")";
    }

    public final List<IMActionTemplate> getTemplate() {
        return this.template;
    }

    public final String getTips() {
        return this.tips;
    }

    public final void setTemplate(List<IMActionTemplate> list) {
        this.template = list;
    }

    public final void setTips(String str) {
        this.tips = str;
    }

    public IMFromMessageTips(String str, List<IMActionTemplate> list) {
        this.tips = str;
        this.template = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IMFromMessageTips(String str, List list, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }
}
