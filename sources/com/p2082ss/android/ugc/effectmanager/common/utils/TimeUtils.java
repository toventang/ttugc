package com.p2082ss.android.ugc.effectmanager.common.utils;

import com.bytedance.covode.number.Covode;
import java.text.SimpleDateFormat;
import java.util.Date;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.common.utils.TimeUtils */
public final class TimeUtils {
    public static final TimeUtils INSTANCE = new TimeUtils();

    private TimeUtils() {
    }

    static {
        Covode.recordClassIndex(95527);
    }

    public final String currentTime() {
        String format = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss.SSS").format(new Date());
        C89219l.m154709a((Object) format, "");
        return format;
    }
}
