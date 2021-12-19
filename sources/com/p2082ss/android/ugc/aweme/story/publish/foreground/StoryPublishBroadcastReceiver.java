package com.p2082ss.android.ugc.aweme.story.publish.foreground;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.story.event.ScheduleInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72623d;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72685x;
import com.p2082ss.android.ugc.aweme.story.publish.foreground.StoryPublishNotificationService;
import com.p2082ss.android.ugc.aweme.story.publish.p4060a.C77390a;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.publish.foreground.StoryPublishBroadcastReceiver */
public final class StoryPublishBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final C77440a f173751a = new C77440a((byte) 0);

    static {
        Covode.recordClassIndex(90471);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.publish.foreground.StoryPublishBroadcastReceiver$a */
    public static final class C77440a {
        static {
            Covode.recordClassIndex(90472);
        }

        private C77440a() {
        }

        public /* synthetic */ C77440a(byte b) {
            this();
        }
    }

    public final void onReceive(Context context, Intent intent) {
        int i;
        C89219l.m154721d(context, "");
        C89219l.m154721d(intent, "");
        StoryPublishNotificationService.C77441a.m135395a();
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("extra_retry_task_list");
        StringBuilder sb = new StringBuilder("StoryPublishBroadcastReceiver:onReceive,taskSize:");
        if (parcelableArrayListExtra != null) {
            i = parcelableArrayListExtra.size();
        } else {
            i = 0;
        }
        C84911q.m145921a(sb.append(i).toString());
        if (parcelableArrayListExtra != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : parcelableArrayListExtra) {
                AbstractC72685x b = C77390a.m135328b(((ScheduleInfo) obj).getScheduleId());
                if ((b instanceof AbstractC72685x.C72686a) && (((AbstractC72685x.C72686a) b).f162960a instanceof AbstractC72623d.C72625b)) {
                    arrayList.add(obj);
                }
            }
            ArrayList<ScheduleInfo> arrayList2 = arrayList;
            if ((!arrayList2.isEmpty()) && arrayList2 != null) {
                C77443a aVar = new C77443a(arrayList2);
                for (ScheduleInfo scheduleInfo : arrayList2) {
                    String scheduleId = scheduleInfo.getScheduleId();
                    C84911q.m145921a("StoryPublishBroadcastReceiver,auto retry task:".concat(String.valueOf(scheduleId)));
                    C77390a.m135327a(scheduleId);
                    C77390a.m135325a(aVar, scheduleId, false);
                }
            }
        }
    }
}
