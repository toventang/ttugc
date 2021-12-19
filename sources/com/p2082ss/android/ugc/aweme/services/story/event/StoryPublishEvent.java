package com.p2082ss.android.ugc.aweme.services.story.event;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.story.event.StoryPublishEvent */
public final class StoryPublishEvent implements AbstractC81914b {
    private final List<ScheduleInfo> scheduleList;
    private final boolean switch2FeedTab;

    static {
        Covode.recordClassIndex(79994);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.services.story.event.StoryPublishEvent */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StoryPublishEvent copy$default(StoryPublishEvent storyPublishEvent, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = storyPublishEvent.scheduleList;
        }
        if ((i & 2) != 0) {
            z = storyPublishEvent.switch2FeedTab;
        }
        return storyPublishEvent.copy(list, z);
    }

    public final List<ScheduleInfo> component1() {
        return this.scheduleList;
    }

    public final boolean component2() {
        return this.switch2FeedTab;
    }

    public final StoryPublishEvent copy(List<ScheduleInfo> list, boolean z) {
        C89219l.m154721d(list, "");
        return new StoryPublishEvent(list, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryPublishEvent)) {
            return false;
        }
        StoryPublishEvent storyPublishEvent = (StoryPublishEvent) obj;
        return C89219l.m154714a(this.scheduleList, storyPublishEvent.scheduleList) && this.switch2FeedTab == storyPublishEvent.switch2FeedTab;
    }

    public final int hashCode() {
        List<ScheduleInfo> list = this.scheduleList;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        boolean z = this.switch2FeedTab;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    public final AbstractC81914b post() {
        return AbstractC81915c.m141874a(this);
    }

    public final AbstractC81914b postSticky() {
        return AbstractC81915c.m141875b(this);
    }

    public final String toString() {
        return "StoryPublishEvent(scheduleList=" + this.scheduleList + ", switch2FeedTab=" + this.switch2FeedTab + ")";
    }

    public final List<ScheduleInfo> getScheduleList() {
        return this.scheduleList;
    }

    public final boolean getSwitch2FeedTab() {
        return this.switch2FeedTab;
    }

    public StoryPublishEvent(List<ScheduleInfo> list, boolean z) {
        C89219l.m154721d(list, "");
        this.scheduleList = list;
        this.switch2FeedTab = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StoryPublishEvent(List list, boolean z, int i, C89214g gVar) {
        this(list, (i & 2) != 0 ? true : z);
    }
}
