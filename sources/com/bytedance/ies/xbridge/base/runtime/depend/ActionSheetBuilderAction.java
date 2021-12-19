package com.bytedance.ies.xbridge.base.runtime.depend;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

public final class ActionSheetBuilderAction {
    private final String subtitle;
    private final String title;
    private final String type;

    static {
        Covode.recordClassIndex(21127);
    }

    public static /* synthetic */ ActionSheetBuilderAction copy$default(ActionSheetBuilderAction actionSheetBuilderAction, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = actionSheetBuilderAction.title;
        }
        if ((i & 2) != 0) {
            str2 = actionSheetBuilderAction.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = actionSheetBuilderAction.type;
        }
        return actionSheetBuilderAction.copy(str, str2, str3);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final String component3() {
        return this.type;
    }

    public final ActionSheetBuilderAction copy(String str, String str2, String str3) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str3, "");
        return new ActionSheetBuilderAction(str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionSheetBuilderAction)) {
            return false;
        }
        ActionSheetBuilderAction actionSheetBuilderAction = (ActionSheetBuilderAction) obj;
        return C89219l.m154714a(this.title, actionSheetBuilderAction.title) && C89219l.m154714a(this.subtitle, actionSheetBuilderAction.subtitle) && C89219l.m154714a(this.type, actionSheetBuilderAction.type);
    }

    public final int hashCode() {
        String str = this.title;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.subtitle;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.type;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "ActionSheetBuilderAction(title=" + this.title + ", subtitle=" + this.subtitle + ", type=" + this.type + ")";
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public ActionSheetBuilderAction(String str, String str2, String str3) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str3, "");
        this.title = str;
        this.subtitle = str2;
        this.type = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ActionSheetBuilderAction(String str, String str2, String str3, int i, C89214g gVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, str3);
    }
}
