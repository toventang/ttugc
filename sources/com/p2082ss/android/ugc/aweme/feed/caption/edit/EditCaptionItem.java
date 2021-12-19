package com.p2082ss.android.ugc.aweme.feed.caption.edit;

import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.EditCaptionItem */
public final class EditCaptionItem {
    private final List<CaptionData> srcSubtitleItem;
    private final List<CaptionData> transSubtitleItem;

    static {
        Covode.recordClassIndex(58166);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.feed.caption.edit.EditCaptionItem */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EditCaptionItem copy$default(EditCaptionItem editCaptionItem, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = editCaptionItem.transSubtitleItem;
        }
        if ((i & 2) != 0) {
            list2 = editCaptionItem.srcSubtitleItem;
        }
        return editCaptionItem.copy(list, list2);
    }

    public final List<CaptionData> component1() {
        return this.transSubtitleItem;
    }

    public final List<CaptionData> component2() {
        return this.srcSubtitleItem;
    }

    public final EditCaptionItem copy(List<CaptionData> list, List<CaptionData> list2) {
        return new EditCaptionItem(list, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditCaptionItem)) {
            return false;
        }
        EditCaptionItem editCaptionItem = (EditCaptionItem) obj;
        return C89219l.m154714a(this.transSubtitleItem, editCaptionItem.transSubtitleItem) && C89219l.m154714a(this.srcSubtitleItem, editCaptionItem.srcSubtitleItem);
    }

    public final int hashCode() {
        List<CaptionData> list = this.transSubtitleItem;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<CaptionData> list2 = this.srcSubtitleItem;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "EditCaptionItem(transSubtitleItem=" + this.transSubtitleItem + ", srcSubtitleItem=" + this.srcSubtitleItem + ")";
    }

    public final List<CaptionData> getSrcSubtitleItem() {
        return this.srcSubtitleItem;
    }

    public final List<CaptionData> getTransSubtitleItem() {
        return this.transSubtitleItem;
    }

    public EditCaptionItem(List<CaptionData> list, List<CaptionData> list2) {
        this.transSubtitleItem = list;
        this.srcSubtitleItem = list2;
    }
}
