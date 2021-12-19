package com.p2082ss.avframework.livestreamv2.utils;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ss.avframework.livestreamv2.utils.TimerTaskUtils */
public class TimerTaskUtils {
    private static Map<String, Timer> mapTasks = new HashMap();

    static {
        Covode.recordClassIndex(100627);
    }

    public static void removeTask(String str) {
        Timer timer = mapTasks.get(str);
        if (timer != null) {
            timer.cancel();
            mapTasks.remove(str);
        }
    }

    public static void addTask(final Runnable runnable, int i, String str) {
        removeTask(str);
        Timer timer = new Timer();
        long j = (long) i;
        timer.schedule(new TimerTask() {
            /* class com.p2082ss.avframework.livestreamv2.utils.TimerTaskUtils.C860201 */

            static {
                Covode.recordClassIndex(100628);
            }

            public final void run() {
                runnable.run();
            }
        }, j, j);
        mapTasks.put(str, timer);
    }
}
