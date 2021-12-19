package com.p2082ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.AdCardServiceImpl;
import com.p2082ss.android.ugc.aweme.commercialize.IAdCardService;
import com.p2082ss.android.ugc.aweme.feed.model.CardStruct;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.c */
public final class C38734c {

    /* renamed from: a */
    public static final C38734c f91473a = new C38734c();

    private C38734c() {
    }

    static {
        Covode.recordClassIndex(46275);
    }

    /* renamed from: a */
    public static final boolean m78558a(CardStruct cardStruct) {
        IAdCardService c;
        if (cardStruct == null || (c = AdCardServiceImpl.m75807c()) == null) {
            return false;
        }
        return c.mo65445b(cardStruct);
    }
}
