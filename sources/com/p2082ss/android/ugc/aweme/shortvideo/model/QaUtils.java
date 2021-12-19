package com.p2082ss.android.ugc.aweme.shortvideo.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.data.QaStruct;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.QaUtils */
public final class QaUtils {
    public static final QaUtils INSTANCE = new QaUtils();

    private QaUtils() {
    }

    static {
        Covode.recordClassIndex(84608);
    }

    public static final boolean isDataValid(QaStruct qaStruct) {
        if (qaStruct != null && !TextUtils.isEmpty(qaStruct.getQuestionContent())) {
            return true;
        }
        return false;
    }
}
