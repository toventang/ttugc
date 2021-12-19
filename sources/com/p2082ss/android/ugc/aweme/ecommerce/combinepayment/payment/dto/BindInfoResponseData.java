package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.BindInfoResponseData */
public final class BindInfoResponseData {
    @AbstractC27891c(mo46611a = "bind_info_list")
    private final List<BindInfoItem> bindInfoList;

    static {
        Covode.recordClassIndex(52381);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.BindInfoResponseData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BindInfoResponseData copy$default(BindInfoResponseData bindInfoResponseData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = bindInfoResponseData.bindInfoList;
        }
        return bindInfoResponseData.copy(list);
    }

    public final List<BindInfoItem> component1() {
        return this.bindInfoList;
    }

    public final BindInfoResponseData copy(List<BindInfoItem> list) {
        return new BindInfoResponseData(list);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof BindInfoResponseData) && C89219l.m154714a(this.bindInfoList, ((BindInfoResponseData) obj).bindInfoList);
        }
        return true;
    }

    public final int hashCode() {
        List<BindInfoItem> list = this.bindInfoList;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "BindInfoResponseData(bindInfoList=" + this.bindInfoList + ")";
    }

    public final List<BindInfoItem> getBindInfoList() {
        return this.bindInfoList;
    }

    public BindInfoResponseData(List<BindInfoItem> list) {
        this.bindInfoList = list;
    }
}
