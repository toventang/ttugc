package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.Button */
public final class Button {
    @AbstractC27891c(mo46611a = "link")
    private final String link;
    @AbstractC27891c(mo46611a = StringSet.name)
    private final String name;
    @AbstractC27891c(mo46611a = "text")
    private final String text;
    @AbstractC27891c(mo46611a = StringSet.type)
    private final int type;

    static {
        Covode.recordClassIndex(52118);
    }

    /* renamed from: com_ss_android_ugc_aweme_ecommerce_combinepayment_ordersubmit_repository_dto_Button_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m86771xacc082c4(int i) {
        return i;
    }

    public static /* synthetic */ Button copy$default(Button button, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = button.type;
        }
        if ((i2 & 2) != 0) {
            str = button.text;
        }
        if ((i2 & 4) != 0) {
            str2 = button.link;
        }
        if ((i2 & 8) != 0) {
            str3 = button.name;
        }
        return button.copy(i, str, str2, str3);
    }

    public final int component1() {
        return this.type;
    }

    public final String component2() {
        return this.text;
    }

    public final String component3() {
        return this.link;
    }

    public final String component4() {
        return this.name;
    }

    public final Button copy(int i, String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        return new Button(i, str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Button)) {
            return false;
        }
        Button button = (Button) obj;
        return this.type == button.type && C89219l.m154714a(this.text, button.text) && C89219l.m154714a(this.link, button.link) && C89219l.m154714a(this.name, button.name);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_ecommerce_combinepayment_ordersubmit_repository_dto_Button_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m86771xacc082c4(this.type) * 31;
        String str = this.text;
        int i = 0;
        int hashCode = (com_ss_android_ugc_aweme_ecommerce_combinepayment_ordersubmit_repository_dto_Button_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.link;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.name;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "Button(type=" + this.type + ", text=" + this.text + ", link=" + this.link + ", name=" + this.name + ")";
    }

    public final String getLink() {
        return this.link;
    }

    public final String getName() {
        return this.name;
    }

    public final String getText() {
        return this.text;
    }

    public final int getType() {
        return this.type;
    }

    public Button(int i, String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.type = i;
        this.text = str;
        this.link = str2;
        this.name = str3;
    }
}
