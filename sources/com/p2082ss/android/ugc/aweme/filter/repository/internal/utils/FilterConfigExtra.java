package com.p2082ss.android.ugc.aweme.filter.repository.internal.utils;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.utils.FilterConfigExtra */
public final class FilterConfigExtra {
    @AbstractC27891c(mo46611a = "filterconfig")
    private String filterconfig;

    static {
        Covode.recordClassIndex(59981);
    }

    public FilterConfigExtra() {
        this(null, 1, null);
    }

    public static /* synthetic */ FilterConfigExtra copy$default(FilterConfigExtra filterConfigExtra, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = filterConfigExtra.filterconfig;
        }
        return filterConfigExtra.copy(str);
    }

    public final String component1() {
        return this.filterconfig;
    }

    public final FilterConfigExtra copy(String str) {
        return new FilterConfigExtra(str);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof FilterConfigExtra) && C89219l.m154714a(this.filterconfig, ((FilterConfigExtra) obj).filterconfig);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.filterconfig;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "FilterConfigExtra(filterconfig=" + this.filterconfig + ")";
    }

    public final String getFilterconfig() {
        return this.filterconfig;
    }

    public final void setFilterconfig(String str) {
        this.filterconfig = str;
    }

    public FilterConfigExtra(String str) {
        this.filterconfig = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FilterConfigExtra(String str, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : str);
    }
}
