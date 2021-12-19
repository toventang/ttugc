package com.p2082ss.android.ugc.aweme.search.p3691g;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.search.g.b */
public final class C67437b implements Serializable {

    /* renamed from: a */
    private int f151081a;

    /* renamed from: b */
    private C67442g f151082b;

    /* renamed from: c */
    private int f151083c;

    /* renamed from: d */
    private C67442g f151084d;

    /* renamed from: e */
    private boolean f151085e = true;

    /* renamed from: f */
    private boolean f151086f;

    /* renamed from: g */
    private List<C67443h> f151087g;

    static {
        Covode.recordClassIndex(79073);
    }

    public final List<C67443h> getActivitySwitchOption() {
        return this.f151087g;
    }

    public final int getFilterBy() {
        return this.f151083c;
    }

    public final C67442g getFilterByStruct() {
        return this.f151084d;
    }

    public final int getSortType() {
        return this.f151081a;
    }

    public final C67442g getSortTypeStruct() {
        return this.f151082b;
    }

    public final boolean isDefaultOption() {
        return this.f151085e;
    }

    public final boolean isFromSchema() {
        return this.f151086f;
    }

    public final LinkedHashMap<String, Integer> activityToFieldMap() {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        List<C67443h> list = this.f151087g;
        if (list != null) {
            for (T t : list) {
                String requestKey = t.getRequestKey();
                if (requestKey == null) {
                    requestKey = "";
                }
                linkedHashMap.put(requestKey, Integer.valueOf(t.isSelected() ? 1 : 0));
            }
        }
        return linkedHashMap;
    }

    public final void setActivitySwitchOption(List<C67443h> list) {
        this.f151087g = list;
    }

    public final void setDefaultOption(boolean z) {
        this.f151085e = z;
    }

    public final void setFilterBy(int i) {
        this.f151083c = i;
    }

    public final void setFilterByStruct(C67442g gVar) {
        this.f151084d = gVar;
    }

    public final void setFromSchema(boolean z) {
        this.f151086f = z;
    }

    public final void setSortType(int i) {
        this.f151081a = i;
    }

    public final void setSortTypeStruct(C67442g gVar) {
        this.f151082b = gVar;
    }
}
