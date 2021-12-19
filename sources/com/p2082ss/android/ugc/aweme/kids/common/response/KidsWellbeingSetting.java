package com.p2082ss.android.ugc.aweme.kids.common.response;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.common.response.KidsWellbeingSetting */
public final class KidsWellbeingSetting {
    @AbstractC27891c(mo46611a = "bed_time_reminder")
    private final C57357b bedTimeReminder;
    @AbstractC27891c(mo46611a = "day_time_end")
    private final String dayTimeEnd;
    @AbstractC27891c(mo46611a = "day_time_start")
    private final String dayTimeStart;
    @AbstractC27891c(mo46611a = "video_playtime_reminders")
    private final List<KidsVideoPlaytimeReminder> playtimeReminder;

    static {
        Covode.recordClassIndex(67271);
    }

    public KidsWellbeingSetting() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.kids.common.response.KidsWellbeingSetting */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KidsWellbeingSetting copy$default(KidsWellbeingSetting kidsWellbeingSetting, String str, String str2, List list, C57357b bVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kidsWellbeingSetting.dayTimeStart;
        }
        if ((i & 2) != 0) {
            str2 = kidsWellbeingSetting.dayTimeEnd;
        }
        if ((i & 4) != 0) {
            list = kidsWellbeingSetting.playtimeReminder;
        }
        if ((i & 8) != 0) {
            bVar = kidsWellbeingSetting.bedTimeReminder;
        }
        return kidsWellbeingSetting.copy(str, str2, list, bVar);
    }

    public final String component1() {
        return this.dayTimeStart;
    }

    public final String component2() {
        return this.dayTimeEnd;
    }

    public final List<KidsVideoPlaytimeReminder> component3() {
        return this.playtimeReminder;
    }

    public final C57357b component4() {
        return this.bedTimeReminder;
    }

    public final KidsWellbeingSetting copy(String str, String str2, List<KidsVideoPlaytimeReminder> list, C57357b bVar) {
        return new KidsWellbeingSetting(str, str2, list, bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KidsWellbeingSetting)) {
            return false;
        }
        KidsWellbeingSetting kidsWellbeingSetting = (KidsWellbeingSetting) obj;
        return C89219l.m154714a(this.dayTimeStart, kidsWellbeingSetting.dayTimeStart) && C89219l.m154714a(this.dayTimeEnd, kidsWellbeingSetting.dayTimeEnd) && C89219l.m154714a(this.playtimeReminder, kidsWellbeingSetting.playtimeReminder) && C89219l.m154714a(this.bedTimeReminder, kidsWellbeingSetting.bedTimeReminder);
    }

    public final int hashCode() {
        String str = this.dayTimeStart;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.dayTimeEnd;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<KidsVideoPlaytimeReminder> list = this.playtimeReminder;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        C57357b bVar = this.bedTimeReminder;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "KidsWellbeingSetting(dayTimeStart=" + this.dayTimeStart + ", dayTimeEnd=" + this.dayTimeEnd + ", playtimeReminder=" + this.playtimeReminder + ", bedTimeReminder=" + this.bedTimeReminder + ")";
    }

    public final C57357b getBedTimeReminder() {
        return this.bedTimeReminder;
    }

    public final String getDayTimeEnd() {
        return this.dayTimeEnd;
    }

    public final String getDayTimeStart() {
        return this.dayTimeStart;
    }

    public final List<KidsVideoPlaytimeReminder> getPlaytimeReminder() {
        return this.playtimeReminder;
    }

    public KidsWellbeingSetting(String str, String str2, List<KidsVideoPlaytimeReminder> list, C57357b bVar) {
        this.dayTimeStart = str;
        this.dayTimeEnd = str2;
        this.playtimeReminder = list;
        this.bedTimeReminder = bVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ KidsWellbeingSetting(String str, String str2, List list, C57357b bVar, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : bVar);
    }
}
