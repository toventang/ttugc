package com.p2082ss.android.ugc.aweme.shortvideo.p3792ae;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.AbstractC27235f;
import com.p2082ss.android.ugc.aweme.model.TextExtraStruct;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ae.g */
public final class C69806g implements AbstractC27235f<TextExtraStruct, AVTextExtraStruct> {
    static {
        Covode.recordClassIndex(82212);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.p1998c.p1999a.AbstractC27235f
    /* renamed from: a */
    public final /* synthetic */ AVTextExtraStruct mo45319a(TextExtraStruct textExtraStruct) {
        TextExtraStruct textExtraStruct2 = textExtraStruct;
        AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
        aVTextExtraStruct.setStarAtlasTag(textExtraStruct2.isStarAtlasTag());
        aVTextExtraStruct.setCid(textExtraStruct2.getCid());
        aVTextExtraStruct.setHashTagName(textExtraStruct2.getHashTagName());
        aVTextExtraStruct.setUserId(textExtraStruct2.getUserId());
        aVTextExtraStruct.setAtUserType(textExtraStruct2.getAtUserType());
        aVTextExtraStruct.setType(textExtraStruct2.getType());
        aVTextExtraStruct.setStart(textExtraStruct2.getStart());
        aVTextExtraStruct.setEnd(textExtraStruct2.getEnd());
        aVTextExtraStruct.setAwemeId(textExtraStruct2.getAwemeId());
        aVTextExtraStruct.setSubType(textExtraStruct2.getSubtype());
        aVTextExtraStruct.setmSecUid(textExtraStruct2.getSecUid());
        return aVTextExtraStruct;
    }
}
