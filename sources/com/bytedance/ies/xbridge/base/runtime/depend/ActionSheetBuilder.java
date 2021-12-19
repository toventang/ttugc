package com.bytedance.ies.xbridge.base.runtime.depend;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

public final class ActionSheetBuilder {
    private final List<ActionSheetBuilderAction> actions;
    private final Context context;
    private final String subtitle;
    private final String title;

    static {
        Covode.recordClassIndex(21126);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.ies.xbridge.base.runtime.depend.ActionSheetBuilder */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActionSheetBuilder copy$default(ActionSheetBuilder actionSheetBuilder, Context context2, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            context2 = actionSheetBuilder.context;
        }
        if ((i & 2) != 0) {
            str = actionSheetBuilder.title;
        }
        if ((i & 4) != 0) {
            str2 = actionSheetBuilder.subtitle;
        }
        if ((i & 8) != 0) {
            list = actionSheetBuilder.actions;
        }
        return actionSheetBuilder.copy(context2, str, str2, list);
    }

    public final Context component1() {
        return this.context;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.subtitle;
    }

    public final List<ActionSheetBuilderAction> component4() {
        return this.actions;
    }

    public final ActionSheetBuilder copy(Context context2, String str, String str2, List<ActionSheetBuilderAction> list) {
        C89219l.m154719c(context2, "");
        C89219l.m154719c(list, "");
        return new ActionSheetBuilder(context2, str, str2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionSheetBuilder)) {
            return false;
        }
        ActionSheetBuilder actionSheetBuilder = (ActionSheetBuilder) obj;
        return C89219l.m154714a(this.context, actionSheetBuilder.context) && C89219l.m154714a(this.title, actionSheetBuilder.title) && C89219l.m154714a(this.subtitle, actionSheetBuilder.subtitle) && C89219l.m154714a(this.actions, actionSheetBuilder.actions);
    }

    public final int hashCode() {
        Context context2 = this.context;
        int i = 0;
        int hashCode = (context2 != null ? context2.hashCode() : 0) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.subtitle;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<ActionSheetBuilderAction> list = this.actions;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "ActionSheetBuilder(context=" + this.context + ", title=" + this.title + ", subtitle=" + this.subtitle + ", actions=" + this.actions + ")";
    }

    public final List<ActionSheetBuilderAction> getActions() {
        return this.actions;
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public ActionSheetBuilder(Context context2, String str, String str2, List<ActionSheetBuilderAction> list) {
        C89219l.m154719c(context2, "");
        C89219l.m154719c(list, "");
        this.context = context2;
        this.title = str;
        this.subtitle = str2;
        this.actions = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ActionSheetBuilder(Context context2, String str, String str2, List list, int i, C89214g gVar) {
        this(context2, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, list);
    }
}
