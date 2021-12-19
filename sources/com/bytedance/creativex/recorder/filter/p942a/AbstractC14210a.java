package com.bytedance.creativex.recorder.filter.p942a;

import androidx.lifecycle.LiveData;
import com.bytedance.als.AbstractC2547b;
import com.bytedance.als.C2559g;
import com.bytedance.als.C2560h;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import java.util.List;

/* renamed from: com.bytedance.creativex.recorder.filter.a.a */
public interface AbstractC14210a extends AbstractC2547b {

    /* renamed from: com.bytedance.creativex.recorder.filter.a.a$a */
    public static final class C14211a {
        static {
            Covode.recordClassIndex(16280);
        }
    }

    static {
        Covode.recordClassIndex(16279);
    }

    void addFilterSource(C14215e eVar);

    void clearFilterChosen();

    C2560h<FilterBean> getCurSelectedFilter();

    LiveData<C14215e> getCurrentFilterSource();

    LiveData<List<C14215e>> getFilterSources();

    C2559g<C14218h> getFilterSwitchEvent();

    C2559g<C14219i> getFilterUpdateEvent();

    boolean isFilterDisable(String str);

    void removeFilterSource(String str);

    void setFilterChosen(FilterBean filterBean, String str, boolean z, boolean z2, boolean z3);

    void setFilterDisable(boolean z, String str);

    void setFilterFromStore(boolean z);

    void setFilterIntensity(FilterBean filterBean, float f);

    void setFilterProgress(FilterBean filterBean, int i);

    void setFilterScroll(FilterBean filterBean, FilterBean filterBean2, float f);

    void useFilterSource(String str);
}
