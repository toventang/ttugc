package com.p2082ss.android.ugc.aweme.search.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.search.C67446h;
import com.p2082ss.android.ugc.aweme.search.p3691g.C67437b;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.search.model.d */
public class C67678d implements Serializable, Cloneable {

    /* renamed from: a */
    private String f151643a = "";

    /* renamed from: b */
    private boolean f151644b;

    /* renamed from: c */
    private String f151645c;

    /* renamed from: d */
    private String f151646d;

    /* renamed from: e */
    private String f151647e;

    /* renamed from: f */
    private C67674b f151648f = C67446h.f151111a.mo106216e();

    /* renamed from: g */
    private int f151649g;

    /* renamed from: h */
    private String f151650h;

    /* renamed from: i */
    private String f151651i;

    /* renamed from: j */
    private String f151652j;

    /* renamed from: k */
    private int f151653k = 1;

    /* renamed from: l */
    private C67437b f151654l;

    /* renamed from: m */
    private String f151655m;

    /* renamed from: n */
    private String f151656n;

    /* renamed from: o */
    private String f151657o;

    /* renamed from: p */
    private String f151658p;

    /* renamed from: q */
    private String f151659q;

    /* renamed from: r */
    private String f151660r;

    /* renamed from: s */
    private String f151661s;

    /* renamed from: t */
    private boolean f151662t;

    /* renamed from: u */
    private String f151663u;

    /* renamed from: v */
    private String f151664v;

    /* renamed from: w */
    private C67680f f151665w;

    static {
        Covode.recordClassIndex(79323);
    }

    public String getEnterMethod() {
        return this.f151645c;
    }

    public String getEventKeyword() {
        return this.f151663u;
    }

    public C67437b getFilterOption() {
        return this.f151654l;
    }

    public String getFromSearchSubtag() {
        return this.f151646d;
    }

    public String getGuideSearchBaseWord() {
        return this.f151657o;
    }

    public int getIndex() {
        return this.f151649g;
    }

    public boolean getIsFilterFromSchema() {
        return this.f151662t;
    }

    public String getIsRichSug() {
        return this.f151652j;
    }

    public String getKeyword() {
        return this.f151655m;
    }

    public int getNeedCorrect() {
        return this.f151653k;
    }

    public String getPreSearchId() {
        return this.f151647e;
    }

    public String getRealSearchWord() {
        return this.f151656n;
    }

    public C67674b getSearchEnterParam() {
        return this.f151648f;
    }

    public String getSearchFrom() {
        return this.f151643a;
    }

    public String getSugType() {
        return this.f151650h;
    }

    public String getSugUserId() {
        return this.f151651i;
    }

    public String getSwitchTab() {
        return this.f151661s;
    }

    public C67680f getTimeParam() {
        return this.f151665w;
    }

    public String getTrendingEventId() {
        return this.f151658p;
    }

    public String getUtmSource() {
        return this.f151664v;
    }

    public String getWordType() {
        return this.f151659q;
    }

    public boolean isOpenNewSearchContainer() {
        return this.f151644b;
    }

    public String getLastSearchId() {
        String str = this.f151660r;
        this.f151660r = null;
        return str;
    }

    public int getId() {
        int i;
        int i2 = this.f151649g * 31;
        String str = this.f151655m;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    public boolean isGuideSearch() {
        String str = this.f151643a;
        if (str == "guide_search" || str == "guide_search_cancel") {
            return true;
        }
        return false;
    }

    public String getSearchEnterFromPage() {
        C67674b bVar = this.f151648f;
        if (bVar == null || TextUtils.isEmpty(bVar.getEnterSearchFrom())) {
            return "";
        }
        return this.f151648f.getEnterSearchFrom();
    }

    public C67678d copy() {
        try {
            return (C67678d) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            C67678d dVar = new C67678d();
            dVar.f151655m = this.f151655m;
            dVar.f151649g = this.f151649g;
            dVar.f151645c = this.f151645c;
            dVar.f151654l = this.f151654l;
            dVar.f151657o = this.f151657o;
            dVar.f151644b = this.f151644b;
            dVar.f151643a = this.f151643a;
            dVar.f151656n = this.f151656n;
            dVar.f151653k = this.f151653k;
            dVar.f151660r = this.f151660r;
            return dVar;
        }
    }

    public C67678d setEnterMethod(String str) {
        this.f151645c = str;
        return this;
    }

    public C67678d setEventKeyword(String str) {
        this.f151663u = str;
        return this;
    }

    public C67678d setFilterOption(C67437b bVar) {
        this.f151654l = bVar;
        return this;
    }

    public C67678d setFromSearchSubtag(String str) {
        this.f151646d = str;
        return this;
    }

    public C67678d setGuideSearchBaseWord(String str) {
        this.f151657o = str;
        return this;
    }

    public C67678d setIndex(int i) {
        this.f151649g = i;
        return this;
    }

    public C67678d setIsFilterFromSchema(boolean z) {
        this.f151662t = z;
        return this;
    }

    public C67678d setIsRichSug(String str) {
        this.f151652j = str;
        return this;
    }

    public C67678d setKeyword(String str) {
        this.f151655m = str;
        return this;
    }

    public C67678d setLastSearchId(String str) {
        this.f151660r = str;
        return this;
    }

    public C67678d setNeedCorrect(int i) {
        this.f151653k = i;
        return this;
    }

    public C67678d setOpenNewSearchContainer(boolean z) {
        this.f151644b = z;
        return this;
    }

    public C67678d setPreSearchId(String str) {
        this.f151647e = str;
        return this;
    }

    public C67678d setRealSearchWord(String str) {
        this.f151656n = str;
        return this;
    }

    public C67678d setSearchEnterParam(C67674b bVar) {
        this.f151648f = bVar;
        return this;
    }

    public C67678d setSearchFrom(String str) {
        this.f151643a = str;
        return this;
    }

    public C67678d setSugType(String str) {
        this.f151650h = str;
        return this;
    }

    public C67678d setSugUserId(String str) {
        this.f151651i = str;
        return this;
    }

    public C67678d setSwitchTab(String str) {
        this.f151661s = str;
        return this;
    }

    public C67678d setTimeParam(C67680f fVar) {
        this.f151665w = fVar;
        return this;
    }

    public C67678d setTrendingEventId(String str) {
        this.f151658p = str;
        return this;
    }

    public C67678d setUtmSource(String str) {
        this.f151664v = str;
        return this;
    }

    public C67678d setWordType(String str) {
        this.f151659q = str;
        return this;
    }
}
