package com.p2082ss.android.ugc.aweme.services.external.p3712ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.data.QaStruct;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.services.external.ui.QaStructConfig */
public final class QaStructConfig implements Serializable {
    private QaStruct qaStruct;

    static {
        Covode.recordClassIndex(79875);
    }

    public final QaStruct getQaStruct() {
        return this.qaStruct;
    }

    public final void setQaStruct(QaStruct qaStruct2) {
        this.qaStruct = qaStruct2;
    }
}
