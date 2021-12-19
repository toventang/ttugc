package com.p2082ss.android.ugc.aweme.shortvideo.model;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStructHelper */
public final class AVTextExtraStructHelper {
    public static final AVTextExtraStructHelper INSTANCE = new AVTextExtraStructHelper();

    private AVTextExtraStructHelper() {
    }

    static {
        Covode.recordClassIndex(84541);
    }

    public static final AVTextExtraStruct createCommentStruct(int i, int i2, String str) {
        AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
        aVTextExtraStruct.type = 0;
        aVTextExtraStruct.subType = 2;
        aVTextExtraStruct.start = i;
        aVTextExtraStruct.end = i2;
        aVTextExtraStruct.userId = str;
        return aVTextExtraStruct;
    }

    public static final AVTextExtraStruct createQuestionStruct(int i, int i2, String str) {
        AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
        aVTextExtraStruct.type = 0;
        aVTextExtraStruct.subType = 3;
        aVTextExtraStruct.start = i;
        aVTextExtraStruct.end = i2;
        aVTextExtraStruct.userId = str;
        return aVTextExtraStruct;
    }

    public static final AVTextExtraStruct createAtStruct(int i, int i2, String str, String str2) {
        C89219l.m154721d(str, "");
        AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
        aVTextExtraStruct.atUserType = "";
        aVTextExtraStruct.type = 0;
        aVTextExtraStruct.start = i;
        aVTextExtraStruct.end = i2;
        aVTextExtraStruct.userId = str;
        if (str2 == null) {
            str2 = "";
        }
        aVTextExtraStruct.mSecUid = str2;
        return aVTextExtraStruct;
    }

    public static final AVTextExtraStruct createDuetStruct(int i, int i2, String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
        aVTextExtraStruct.atUserType = "";
        aVTextExtraStruct.type = 0;
        aVTextExtraStruct.subType = 1;
        aVTextExtraStruct.start = i;
        aVTextExtraStruct.end = i2;
        aVTextExtraStruct.userId = str;
        aVTextExtraStruct.awemeId = str2;
        return aVTextExtraStruct;
    }

    public static final AVTextExtraStruct createQaStickerStruct(int i, int i2, String str, int i3) {
        AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
        aVTextExtraStruct.type = 0;
        aVTextExtraStruct.subType = i3;
        aVTextExtraStruct.start = i;
        aVTextExtraStruct.end = i2;
        aVTextExtraStruct.userId = str;
        return aVTextExtraStruct;
    }
}
