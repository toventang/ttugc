package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageTitle */
public final class MessageTitle {
    private final boolean bold;
    @AbstractC27891c(mo46611a = "color_type")
    private final int colorType;
    private final String title;

    static {
        Covode.recordClassIndex(63450);
    }

    /* renamed from: com_ss_android_ugc_aweme_im_sdk_chat_data_model_MessageTitle_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m99075xf7b93b36(int i) {
        return i;
    }

    public static /* synthetic */ MessageTitle copy$default(MessageTitle messageTitle, boolean z, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = messageTitle.bold;
        }
        if ((i2 & 2) != 0) {
            str = messageTitle.title;
        }
        if ((i2 & 4) != 0) {
            i = messageTitle.colorType;
        }
        return messageTitle.copy(z, str, i);
    }

    public final boolean component1() {
        return this.bold;
    }

    public final String component2() {
        return this.title;
    }

    public final int component3() {
        return this.colorType;
    }

    public final MessageTitle copy(boolean z, String str, int i) {
        C89219l.m154721d(str, "");
        return new MessageTitle(z, str, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageTitle)) {
            return false;
        }
        MessageTitle messageTitle = (MessageTitle) obj;
        return this.bold == messageTitle.bold && C89219l.m154714a(this.title, messageTitle.title) && this.colorType == messageTitle.colorType;
    }

    public final int hashCode() {
        boolean z = this.bold;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i * 31;
        String str = this.title;
        return ((i4 + (str != null ? str.hashCode() : 0)) * 31) + m99075xf7b93b36(this.colorType);
    }

    public final String toString() {
        return "MessageTitle(bold=" + this.bold + ", title=" + this.title + ", colorType=" + this.colorType + ")";
    }

    public final boolean getBold() {
        return this.bold;
    }

    public final int getColorType() {
        return this.colorType;
    }

    public final String getTitle() {
        return this.title;
    }

    public MessageTitle(boolean z, String str, int i) {
        C89219l.m154721d(str, "");
        this.bold = z;
        this.title = str;
        this.colorType = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MessageTitle(boolean z, String str, int i, int i2, C89214g gVar) {
        this(z, str, (i2 & 4) != 0 ? 0 : i);
    }
}
