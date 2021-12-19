package com.p2082ss.android.ugc.aweme.shortvideo.p3792ae;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.AbstractC27235f;
import com.google.p1998c.p2001c.C27404ap;
import com.p2082ss.android.ugc.aweme.model.TextExtraStruct;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ae.f */
public final class C69805f implements AbstractC27235f<AVTextExtraStruct, TextExtraStruct> {
    static {
        Covode.recordClassIndex(82211);
    }

    /* renamed from: a */
    public static ArrayList<TextExtraStruct> m123335a(List<AVTextExtraStruct> list) {
        if (list == null) {
            return null;
        }
        return C27404ap.m54807a((Iterable) C27404ap.m54811a(list, new C69805f()));
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.p1998c.p1999a.AbstractC27235f
    /* renamed from: a */
    public final /* synthetic */ TextExtraStruct mo45319a(AVTextExtraStruct aVTextExtraStruct) {
        AVTextExtraStruct aVTextExtraStruct2 = aVTextExtraStruct;
        TextExtraStruct textExtraStruct = new TextExtraStruct();
        textExtraStruct.setCid(aVTextExtraStruct2.getCid());
        textExtraStruct.setHashTagName(aVTextExtraStruct2.getHashTagName());
        textExtraStruct.setUserId(aVTextExtraStruct2.getUserId());
        textExtraStruct.setAtUserType(aVTextExtraStruct2.getAtUserType());
        textExtraStruct.setType(aVTextExtraStruct2.getType());
        textExtraStruct.setStart(aVTextExtraStruct2.getStart());
        textExtraStruct.setEnd(aVTextExtraStruct2.getEnd());
        textExtraStruct.setAwemeId(aVTextExtraStruct2.getAwemeId());
        textExtraStruct.setSubType(aVTextExtraStruct2.getSubType());
        textExtraStruct.setSecUid(aVTextExtraStruct2.getmSecUid());
        if (aVTextExtraStruct2.getStart() < 0 || aVTextExtraStruct2.getEnd() < 0) {
            C84911q.m145921a("TextExtraStruct#getStart && TextExtraStruct#getEnd must be >= 0, actual: " + aVTextExtraStruct2.toString());
        }
        return textExtraStruct;
    }
}
