package com.bytedance.ies.xbridge.base.runtime.depend;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

public final class ToastBuilder {
    private final Context context;
    private final Integer duration;
    private final String message;
    private final String type;

    static {
        Covode.recordClassIndex(21156);
    }

    public static /* synthetic */ ToastBuilder copy$default(ToastBuilder toastBuilder, Context context2, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            context2 = toastBuilder.context;
        }
        if ((i & 2) != 0) {
            str = toastBuilder.message;
        }
        if ((i & 4) != 0) {
            str2 = toastBuilder.type;
        }
        if ((i & 8) != 0) {
            num = toastBuilder.duration;
        }
        return toastBuilder.copy(context2, str, str2, num);
    }

    public final Context component1() {
        return this.context;
    }

    public final String component2() {
        return this.message;
    }

    public final String component3() {
        return this.type;
    }

    public final Integer component4() {
        return this.duration;
    }

    public final ToastBuilder copy(Context context2, String str, String str2, Integer num) {
        C89219l.m154719c(context2, "");
        return new ToastBuilder(context2, str, str2, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ToastBuilder)) {
            return false;
        }
        ToastBuilder toastBuilder = (ToastBuilder) obj;
        return C89219l.m154714a(this.context, toastBuilder.context) && C89219l.m154714a(this.message, toastBuilder.message) && C89219l.m154714a(this.type, toastBuilder.type) && C89219l.m154714a(this.duration, toastBuilder.duration);
    }

    public final int hashCode() {
        Context context2 = this.context;
        int i = 0;
        int hashCode = (context2 != null ? context2.hashCode() : 0) * 31;
        String str = this.message;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.type;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.duration;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "ToastBuilder(context=" + this.context + ", message=" + this.message + ", type=" + this.type + ", duration=" + this.duration + ")";
    }

    public final Context getContext() {
        return this.context;
    }

    public final Integer getDuration() {
        return this.duration;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getType() {
        return this.type;
    }

    public ToastBuilder(Context context2, String str, String str2, Integer num) {
        C89219l.m154719c(context2, "");
        this.context = context2;
        this.message = str;
        this.type = str2;
        this.duration = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ToastBuilder(Context context2, String str, String str2, Integer num, int i, C89214g gVar) {
        this(context2, (i & 2) != 0 ? null : str, (i & 4) != 0 ? "success" : str2, (i & 8) != 0 ? null : num);
    }
}
