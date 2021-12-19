package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.IMActionTemplate */
public final class IMActionTemplate {
    @AbstractC27891c(mo46611a = "action")
    private Integer action;
    @AbstractC27891c(mo46611a = "key")
    private Integer key;
    @AbstractC27891c(mo46611a = "link")
    private String link;
    @AbstractC27891c(mo46611a = StringSet.name)
    private String name;

    static {
        Covode.recordClassIndex(63441);
    }

    public IMActionTemplate() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ IMActionTemplate copy$default(IMActionTemplate iMActionTemplate, Integer num, Integer num2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = iMActionTemplate.key;
        }
        if ((i & 2) != 0) {
            num2 = iMActionTemplate.action;
        }
        if ((i & 4) != 0) {
            str = iMActionTemplate.name;
        }
        if ((i & 8) != 0) {
            str2 = iMActionTemplate.link;
        }
        return iMActionTemplate.copy(num, num2, str, str2);
    }

    public final Integer component1() {
        return this.key;
    }

    public final Integer component2() {
        return this.action;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.link;
    }

    public final IMActionTemplate copy(Integer num, Integer num2, String str, String str2) {
        return new IMActionTemplate(num, num2, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMActionTemplate)) {
            return false;
        }
        IMActionTemplate iMActionTemplate = (IMActionTemplate) obj;
        return C89219l.m154714a(this.key, iMActionTemplate.key) && C89219l.m154714a(this.action, iMActionTemplate.action) && C89219l.m154714a(this.name, iMActionTemplate.name) && C89219l.m154714a(this.link, iMActionTemplate.link);
    }

    public final int hashCode() {
        Integer num = this.key;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.action;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str = this.name;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.link;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "IMActionTemplate(key=" + this.key + ", action=" + this.action + ", name=" + this.name + ", link=" + this.link + ")";
    }

    public final Integer getAction() {
        return this.action;
    }

    public final Integer getKey() {
        return this.key;
    }

    public final String getLink() {
        return this.link;
    }

    public final String getName() {
        return this.name;
    }

    public final void setAction(Integer num) {
        this.action = num;
    }

    public final void setKey(Integer num) {
        this.key = num;
    }

    public final void setLink(String str) {
        this.link = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public IMActionTemplate(Integer num, Integer num2, String str, String str2) {
        this.key = num;
        this.action = num2;
        this.name = str;
        this.link = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IMActionTemplate(Integer num, Integer num2, String str, String str2, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }
}
