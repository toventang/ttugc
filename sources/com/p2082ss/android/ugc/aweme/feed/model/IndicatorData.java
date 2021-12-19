package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.IndicatorData */
public final class IndicatorData implements Serializable {
    @AbstractC27891c(mo46611a = "box_url")
    private final AwemeUrl boxUrl;
    @AbstractC27891c(mo46611a = "conversion_area")
    private final NewButtonInfo conversionArea;
    @AbstractC27891c(mo46611a = "indicator_icon")
    private final UrlModel indicatorIcon;
    @AbstractC27891c(mo46611a = "indicator_start_box")
    private final BoxData indicatorStartBox;

    static {
        Covode.recordClassIndex(58709);
    }

    public IndicatorData() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ IndicatorData copy$default(IndicatorData indicatorData, UrlModel urlModel, BoxData boxData, AwemeUrl awemeUrl, NewButtonInfo newButtonInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            urlModel = indicatorData.indicatorIcon;
        }
        if ((i & 2) != 0) {
            boxData = indicatorData.indicatorStartBox;
        }
        if ((i & 4) != 0) {
            awemeUrl = indicatorData.boxUrl;
        }
        if ((i & 8) != 0) {
            newButtonInfo = indicatorData.conversionArea;
        }
        return indicatorData.copy(urlModel, boxData, awemeUrl, newButtonInfo);
    }

    public final UrlModel component1() {
        return this.indicatorIcon;
    }

    public final BoxData component2() {
        return this.indicatorStartBox;
    }

    public final AwemeUrl component3() {
        return this.boxUrl;
    }

    public final NewButtonInfo component4() {
        return this.conversionArea;
    }

    public final IndicatorData copy(UrlModel urlModel, BoxData boxData, AwemeUrl awemeUrl, NewButtonInfo newButtonInfo) {
        return new IndicatorData(urlModel, boxData, awemeUrl, newButtonInfo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicatorData)) {
            return false;
        }
        IndicatorData indicatorData = (IndicatorData) obj;
        return C89219l.m154714a(this.indicatorIcon, indicatorData.indicatorIcon) && C89219l.m154714a(this.indicatorStartBox, indicatorData.indicatorStartBox) && C89219l.m154714a(this.boxUrl, indicatorData.boxUrl) && C89219l.m154714a(this.conversionArea, indicatorData.conversionArea);
    }

    public final int hashCode() {
        UrlModel urlModel = this.indicatorIcon;
        int i = 0;
        int hashCode = (urlModel != null ? urlModel.hashCode() : 0) * 31;
        BoxData boxData = this.indicatorStartBox;
        int hashCode2 = (hashCode + (boxData != null ? boxData.hashCode() : 0)) * 31;
        AwemeUrl awemeUrl = this.boxUrl;
        int hashCode3 = (hashCode2 + (awemeUrl != null ? awemeUrl.hashCode() : 0)) * 31;
        NewButtonInfo newButtonInfo = this.conversionArea;
        if (newButtonInfo != null) {
            i = newButtonInfo.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "IndicatorData(indicatorIcon=" + this.indicatorIcon + ", indicatorStartBox=" + this.indicatorStartBox + ", boxUrl=" + this.boxUrl + ", conversionArea=" + this.conversionArea + ")";
    }

    public final AwemeUrl getBoxUrl() {
        return this.boxUrl;
    }

    public final NewButtonInfo getConversionArea() {
        return this.conversionArea;
    }

    public final UrlModel getIndicatorIcon() {
        return this.indicatorIcon;
    }

    public final BoxData getIndicatorStartBox() {
        return this.indicatorStartBox;
    }

    public IndicatorData(UrlModel urlModel, BoxData boxData, AwemeUrl awemeUrl, NewButtonInfo newButtonInfo) {
        this.indicatorIcon = urlModel;
        this.indicatorStartBox = boxData;
        this.boxUrl = awemeUrl;
        this.conversionArea = newButtonInfo;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IndicatorData(UrlModel urlModel, BoxData boxData, AwemeUrl awemeUrl, NewButtonInfo newButtonInfo, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : urlModel, (i & 2) != 0 ? null : boxData, (i & 4) != 0 ? null : awemeUrl, (i & 8) != 0 ? null : newButtonInfo);
    }
}
