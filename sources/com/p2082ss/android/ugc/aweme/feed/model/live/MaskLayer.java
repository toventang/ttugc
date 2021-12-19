package com.p2082ss.android.ugc.aweme.feed.model.live;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.live.MaskLayer */
public final class MaskLayer implements Serializable {
    @AbstractC27891c(mo46611a = "sub_title")
    private Text subTitle;
    @AbstractC27891c(mo46611a = "title")
    private Text title;

    static {
        Covode.recordClassIndex(58807);
    }

    public MaskLayer() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ MaskLayer copy$default(MaskLayer maskLayer, Text text, Text text2, int i, Object obj) {
        if ((i & 1) != 0) {
            text = maskLayer.title;
        }
        if ((i & 2) != 0) {
            text2 = maskLayer.subTitle;
        }
        return maskLayer.copy(text, text2);
    }

    public final Text component1() {
        return this.title;
    }

    public final Text component2() {
        return this.subTitle;
    }

    public final MaskLayer copy(Text text, Text text2) {
        return new MaskLayer(text, text2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MaskLayer)) {
            return false;
        }
        MaskLayer maskLayer = (MaskLayer) obj;
        return C89219l.m154714a(this.title, maskLayer.title) && C89219l.m154714a(this.subTitle, maskLayer.subTitle);
    }

    public final int hashCode() {
        Text text = this.title;
        int i = 0;
        int hashCode = (text != null ? text.hashCode() : 0) * 31;
        Text text2 = this.subTitle;
        if (text2 != null) {
            i = text2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "MaskLayer(title=" + this.title + ", subTitle=" + this.subTitle + ")";
    }

    public final Text getSubTitle() {
        return this.subTitle;
    }

    public final Text getTitle() {
        return this.title;
    }

    public final void setSubTitle(Text text) {
        this.subTitle = text;
    }

    public final void setTitle(Text text) {
        this.title = text;
    }

    public MaskLayer(Text text, Text text2) {
        this.title = text;
        this.subTitle = text2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MaskLayer(Text text, Text text2, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : text, (i & 2) != 0 ? null : text2);
    }
}
