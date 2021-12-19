package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.data.model.PureDataSharePackage;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.TextContent */
public final class TextContent extends BaseContent {
    public static final Companion Companion = new Companion(null);
    private final boolean isDefault;
    @AbstractC27891c(mo46611a = "text")
    private final String text;

    static {
        Covode.recordClassIndex(63485);
    }

    public TextContent() {
        this(null, false, 3, null);
    }

    public static /* synthetic */ TextContent copy$default(TextContent textContent, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = textContent.text;
        }
        if ((i & 2) != 0) {
            z = textContent.isDefault;
        }
        return textContent.copy(str, z);
    }

    public static final TextContent obtain(TextContent textContent) {
        return Companion.obtain(textContent);
    }

    public static final TextContent obtain(String str) {
        return Companion.obtain(str);
    }

    public final String component1() {
        return this.text;
    }

    public final boolean component2() {
        return this.isDefault;
    }

    public final TextContent copy(String str, boolean z) {
        return new TextContent(str, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextContent)) {
            return false;
        }
        TextContent textContent = (TextContent) obj;
        return C89219l.m154714a(this.text, textContent.text) && this.isDefault == textContent.isDefault;
    }

    public final int hashCode() {
        String str = this.text;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.isDefault;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public final String toString() {
        return "TextContent(text=" + this.text + ", isDefault=" + this.isDefault + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.TextContent$Companion */
    public static final class Companion {
        static {
            Covode.recordClassIndex(63486);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }

        public final TextContent obtain(String str) {
            TextContent textContent = new TextContent(str, false, 2, null);
            textContent.setType(700);
            return textContent;
        }

        public final TextContent obtain(TextContent textContent) {
            C89219l.m154721d(textContent, "");
            TextContent textContent2 = new TextContent(textContent.getText(), false, 2, null);
            textContent2.type = 700;
            textContent2.prevId = textContent.prevId;
            textContent2.rootId = textContent.rootId;
            return textContent2;
        }
    }

    public final String getText() {
        return this.text;
    }

    public final boolean isDefault() {
        return this.isDefault;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public final SharePackage generateSharePackage() {
        SharePackage a = PureDataSharePackage.C55965a.m101845a("text");
        a.f155492i.putString("share_text", this.text);
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public final String getMsgHint() {
        String str = this.text;
        if (str != null) {
            return str;
        }
        String msgHint = super.getMsgHint();
        C89219l.m154716b(msgHint, "");
        return msgHint;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public final boolean isValid() {
        String str = this.text;
        if (str == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    public TextContent(String str, boolean z) {
        this.text = str;
        this.isDefault = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextContent(String str, boolean z, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z);
    }
}
