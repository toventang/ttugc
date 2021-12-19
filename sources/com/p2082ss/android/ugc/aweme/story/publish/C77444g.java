package com.p2082ss.android.ugc.aweme.story.publish;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.story.event.ScheduleInfo;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.publish.g */
public final class C77444g {

    /* renamed from: a */
    public final ScheduleInfo f173766a;

    /* renamed from: b */
    public final C77428e f173767b;

    static {
        Covode.recordClassIndex(90477);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C77444g)) {
            return false;
        }
        C77444g gVar = (C77444g) obj;
        return C89219l.m154714a(this.f173766a, gVar.f173766a) && C89219l.m154714a(this.f173767b, gVar.f173767b);
    }

    public final int hashCode() {
        ScheduleInfo scheduleInfo = this.f173766a;
        int i = 0;
        int hashCode = (scheduleInfo != null ? scheduleInfo.hashCode() : 0) * 31;
        C77428e eVar = this.f173767b;
        if (eVar != null) {
            i = eVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "StoryPublishScheduleInfo(scheduleInfo=" + this.f173766a + ", data=" + this.f173767b + ")";
    }

    public /* synthetic */ C77444g(ScheduleInfo scheduleInfo) {
        this(scheduleInfo, new C77428e());
    }

    private C77444g(ScheduleInfo scheduleInfo, C77428e eVar) {
        C89219l.m154721d(scheduleInfo, "");
        C89219l.m154721d(eVar, "");
        this.f173766a = scheduleInfo;
        this.f173767b = eVar;
    }
}
