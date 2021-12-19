package com.p2082ss.android.ugc.aweme.commercialize;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38878ae;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38881ag;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38882ah;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38883ai;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.CardStruct;

/* renamed from: com.ss.android.ugc.aweme.commercialize.IAdCardService */
public interface IAdCardService {
    static {
        Covode.recordClassIndex(44994);
    }

    /* renamed from: a */
    AbstractC38881ag mo65441a();

    /* renamed from: a */
    AbstractC38883ai mo65442a(Integer num, Context context, Aweme aweme, AbstractC38878ae aeVar);

    /* renamed from: a */
    boolean mo65443a(CardStruct cardStruct);

    /* renamed from: b */
    AbstractC38882ah mo65444b();

    /* renamed from: b */
    boolean mo65445b(CardStruct cardStruct);
}
