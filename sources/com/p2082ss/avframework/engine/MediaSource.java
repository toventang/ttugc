package com.p2082ss.avframework.engine;

import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.statics.StaticsReport;

/* renamed from: com.ss.avframework.engine.MediaSource */
public abstract class MediaSource extends NativeObject implements StaticsReport.StaticReportInterface {
    static {
        Covode.recordClassIndex(99972);
    }

    public abstract int status();
}
