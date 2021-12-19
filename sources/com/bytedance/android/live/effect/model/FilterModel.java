package com.bytedance.android.live.effect.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FilterModel {
    private Effect effect;
    public C4308a filterConfig;
    private int filterType;
    private boolean isNew;
    private LocalFilterModel localFilter;
    private List<String> tags;
    private int usedType;

    /* renamed from: com.bytedance.android.live.effect.model.FilterModel$a */
    public static class C4308a {

        /* renamed from: a */
        public int f11842a = 100;

        /* renamed from: b */
        public int f11843b;

        /* renamed from: c */
        public int f11844c = 50;

        static {
            Covode.recordClassIndex(4879);
        }
    }

    static {
        Covode.recordClassIndex(4878);
    }

    public FilterModel() {
    }

    public Effect getEffect() {
        return this.effect;
    }

    public int getFilterType() {
        return this.filterType;
    }

    public LocalFilterModel getLocalFilter() {
        return this.localFilter;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public int getUsedType() {
        return this.usedType;
    }

    public boolean isNew() {
        return this.isNew;
    }

    public boolean isNone() {
        if (this.filterType == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return getFilterId().hashCode();
    }

    public String getFilterId() {
        int i = this.filterType;
        if (i == 0 || i == 1) {
            LocalFilterModel localFilterModel = this.localFilter;
            if (localFilterModel == null) {
                return null;
            }
            return localFilterModel.getId();
        } else if (i != 2) {
            return null;
        } else {
            return this.effect.getEffectId();
        }
    }

    public String getName() {
        int i = this.filterType;
        if (i == 0 || i == 1) {
            LocalFilterModel localFilterModel = this.localFilter;
            if (localFilterModel == null) {
                return null;
            }
            return localFilterModel.getName();
        } else if (i != 2) {
            return null;
        } else {
            return this.effect.getName();
        }
    }

    public String getFilterPath() {
        int i = this.filterType;
        if (i == 0 || i == 1) {
            LocalFilterModel localFilterModel = this.localFilter;
            if (localFilterModel == null) {
                return "";
            }
            return localFilterModel.getFilterFilePath();
        } else if (i == 2 && new File(this.effect.getUnzipPath(), "config.json").exists()) {
            return new File(this.effect.getUnzipPath()).getAbsolutePath();
        } else {
            return "";
        }
    }

    public void setEffect(Effect effect2) {
        this.effect = effect2;
    }

    public void setFilterType(int i) {
        this.filterType = i;
    }

    public void setLocalFilter(LocalFilterModel localFilterModel) {
        this.localFilter = localFilterModel;
    }

    public void setNew(boolean z) {
        this.isNew = z;
    }

    public void setUsedType(int i) {
        this.usedType = i;
    }

    public FilterModel(Effect effect2) {
        this.filterType = 2;
        this.effect = effect2;
    }

    public void setTags(List<String> list) {
        ArrayList arrayList = new ArrayList();
        this.tags = arrayList;
        arrayList.addAll(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FilterModel) {
            return TextUtils.equals(getFilterId(), ((FilterModel) obj).getFilterId());
        }
        return false;
    }
}
