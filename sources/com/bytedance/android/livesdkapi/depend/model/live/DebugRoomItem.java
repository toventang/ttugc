package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

public final class DebugRoomItem implements Serializable {
    @AbstractC27891c(mo46611a = "tab_content")
    private String tabContent;
    @AbstractC27891c(mo46611a = "tab_title")
    private String tabTitle;

    static {
        Covode.recordClassIndex(13364);
    }

    public DebugRoomItem() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ DebugRoomItem copy$default(DebugRoomItem debugRoomItem, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = debugRoomItem.tabTitle;
        }
        if ((i & 2) != 0) {
            str2 = debugRoomItem.tabContent;
        }
        return debugRoomItem.copy(str, str2);
    }

    public final String component1() {
        return this.tabTitle;
    }

    public final String component2() {
        return this.tabContent;
    }

    public final DebugRoomItem copy(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return new DebugRoomItem(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebugRoomItem)) {
            return false;
        }
        DebugRoomItem debugRoomItem = (DebugRoomItem) obj;
        return C89219l.m154714a(this.tabTitle, debugRoomItem.tabTitle) && C89219l.m154714a(this.tabContent, debugRoomItem.tabContent);
    }

    public final int hashCode() {
        String str = this.tabTitle;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.tabContent;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "DebugRoomItem(tabTitle=" + this.tabTitle + ", tabContent=" + this.tabContent + ")";
    }

    public final String getTabContent() {
        return this.tabContent;
    }

    public final String getTabTitle() {
        return this.tabTitle;
    }

    public final void setTabContent(String str) {
        C89219l.m154721d(str, "");
        this.tabContent = str;
    }

    public final void setTabTitle(String str) {
        C89219l.m154721d(str, "");
        this.tabTitle = str;
    }

    public DebugRoomItem(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.tabTitle = str;
        this.tabContent = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DebugRoomItem(String str, String str2, int i, C89214g gVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
