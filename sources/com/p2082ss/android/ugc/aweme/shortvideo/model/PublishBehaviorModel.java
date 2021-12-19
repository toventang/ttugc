package com.p2082ss.android.ugc.aweme.shortvideo.model;

import com.bytedance.covode.number.Covode;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.PublishBehaviorModel */
public final class PublishBehaviorModel {
    public final String code;
    public int idIndex = -1;
    public final String info;
    public final String publishId;
    public final String stage;
    public final long timeStamp;
    public final BehaviorType type;

    static {
        Covode.recordClassIndex(84605);
    }

    public final String getSimpleTime() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-HHmmss", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC+0"));
        String format = simpleDateFormat.format(new Date(this.timeStamp));
        C89219l.m154716b(format, "");
        return format;
    }

    public PublishBehaviorModel(long j, String str, BehaviorType behaviorType, String str2, String str3, String str4) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(behaviorType, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        this.timeStamp = j;
        this.publishId = str;
        this.type = behaviorType;
        this.stage = str2;
        this.code = str3;
        this.info = str4;
    }
}
