package com.bytedance.helios.api.config;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

public final class ResourceCheckModel {
    public static final C15328a Companion = new C15328a((byte) 0);
    @AbstractC27891c(mo46611a = "check_lifecycle")
    private final List<String> checkLifeCycle;
    @AbstractC27891c(mo46611a = "check_page")
    private final String checkPage;
    @AbstractC27891c(mo46611a = "check_time_delay")
    private final long checkTimeDelay;
    @AbstractC27891c(mo46611a = "check_type")
    private final int checkType;
    @AbstractC27891c(mo46611a = "max_check_times")
    private final int maxCheckTimes;
    @AbstractC27891c(mo46611a = "resources")
    private final List<String> resources;
    @AbstractC27891c(mo46611a = "stop_check_lifecycle")
    private final List<String> stopCheckLifeCycle;

    static {
        Covode.recordClassIndex(17568);
    }

    public ResourceCheckModel() {
        this(null, 0, null, null, null, 0, 0, 127, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.helios.api.config.ResourceCheckModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ResourceCheckModel copy$default(ResourceCheckModel resourceCheckModel, String str, int i, List list, List list2, List list3, long j, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = resourceCheckModel.checkPage;
        }
        if ((i3 & 2) != 0) {
            i = resourceCheckModel.checkType;
        }
        if ((i3 & 4) != 0) {
            list = resourceCheckModel.checkLifeCycle;
        }
        if ((i3 & 8) != 0) {
            list2 = resourceCheckModel.stopCheckLifeCycle;
        }
        if ((i3 & 16) != 0) {
            list3 = resourceCheckModel.resources;
        }
        if ((i3 & 32) != 0) {
            j = resourceCheckModel.checkTimeDelay;
        }
        if ((i3 & 64) != 0) {
            i2 = resourceCheckModel.maxCheckTimes;
        }
        return resourceCheckModel.copy(str, i, list, list2, list3, j, i2);
    }

    public final String component1() {
        return this.checkPage;
    }

    public final int component2() {
        return this.checkType;
    }

    public final List<String> component3() {
        return this.checkLifeCycle;
    }

    public final List<String> component4() {
        return this.stopCheckLifeCycle;
    }

    public final List<String> component5() {
        return this.resources;
    }

    public final long component6() {
        return this.checkTimeDelay;
    }

    public final int component7() {
        return this.maxCheckTimes;
    }

    public final ResourceCheckModel copy(String str, int i, List<String> list, List<String> list2, List<String> list3, long j, int i2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(list, "");
        C89219l.m154719c(list2, "");
        C89219l.m154719c(list3, "");
        return new ResourceCheckModel(str, i, list, list2, list3, j, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResourceCheckModel)) {
            return false;
        }
        ResourceCheckModel resourceCheckModel = (ResourceCheckModel) obj;
        return C89219l.m154714a(this.checkPage, resourceCheckModel.checkPage) && this.checkType == resourceCheckModel.checkType && C89219l.m154714a(this.checkLifeCycle, resourceCheckModel.checkLifeCycle) && C89219l.m154714a(this.stopCheckLifeCycle, resourceCheckModel.stopCheckLifeCycle) && C89219l.m154714a(this.resources, resourceCheckModel.resources) && this.checkTimeDelay == resourceCheckModel.checkTimeDelay && this.maxCheckTimes == resourceCheckModel.maxCheckTimes;
    }

    public final int hashCode() {
        String str = this.checkPage;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.checkType) * 31;
        List<String> list = this.checkLifeCycle;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.stopCheckLifeCycle;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<String> list3 = this.resources;
        if (list3 != null) {
            i = list3.hashCode();
        }
        long j = this.checkTimeDelay;
        return ((((hashCode3 + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.maxCheckTimes;
    }

    public final String toString() {
        return "ResourceCheckModel(checkPage=" + this.checkPage + ", checkType=" + this.checkType + ", checkLifeCycle=" + this.checkLifeCycle + ", stopCheckLifeCycle=" + this.stopCheckLifeCycle + ", resources=" + this.resources + ", checkTimeDelay=" + this.checkTimeDelay + ", maxCheckTimes=" + this.maxCheckTimes + ")";
    }

    /* renamed from: com.bytedance.helios.api.config.ResourceCheckModel$a */
    public static final class C15328a {
        static {
            Covode.recordClassIndex(17569);
        }

        private C15328a() {
        }

        public /* synthetic */ C15328a(byte b) {
            this();
        }
    }

    public final List<String> getCheckLifeCycle() {
        return this.checkLifeCycle;
    }

    public final String getCheckPage() {
        return this.checkPage;
    }

    public final long getCheckTimeDelay() {
        return this.checkTimeDelay;
    }

    public final int getCheckType() {
        return this.checkType;
    }

    public final int getMaxCheckTimes() {
        return this.maxCheckTimes;
    }

    public final List<String> getResources() {
        return this.resources;
    }

    public final List<String> getStopCheckLifeCycle() {
        return this.stopCheckLifeCycle;
    }

    public ResourceCheckModel(String str, int i, List<String> list, List<String> list2, List<String> list3, long j, int i2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(list, "");
        C89219l.m154719c(list2, "");
        C89219l.m154719c(list3, "");
        this.checkPage = str;
        this.checkType = i;
        this.checkLifeCycle = list;
        this.stopCheckLifeCycle = list2;
        this.resources = list3;
        this.checkTimeDelay = j;
        this.maxCheckTimes = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ResourceCheckModel(String str, int i, List list, List list2, List list3, long j, int i2, int i3, C89214g gVar) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? C89086z.INSTANCE : list, (i3 & 8) != 0 ? C89086z.INSTANCE : list2, (i3 & 16) != 0 ? C89086z.INSTANCE : list3, (i3 & 32) != 0 ? 3000 : j, (i3 & 64) != 0 ? 4 : i2);
    }
}
