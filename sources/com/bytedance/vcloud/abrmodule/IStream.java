package com.bytedance.vcloud.abrmodule;

import com.bytedance.covode.number.Covode;

public interface IStream {
    static {
        Covode.recordClassIndex(27598);
    }

    int getBandwidth();

    String getCodec();

    int getSegmentDuration();

    String getStreamId();
}
