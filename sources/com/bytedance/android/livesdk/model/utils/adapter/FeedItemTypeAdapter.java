package com.bytedance.android.livesdk.model.utils.adapter;

import com.bytedance.android.live.C4139e;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28017j;
import com.google.gson.AbstractC28018k;
import com.google.gson.AbstractC28019l;
import com.google.gson.AbstractC28026s;
import com.google.gson.C28022o;
import com.google.gson.C28023p;
import java.lang.reflect.Type;

public class FeedItemTypeAdapter implements AbstractC28018k<FeedItem>, AbstractC28026s<FeedItem> {
    static {
        Covode.recordClassIndex(11457);
    }

    /* renamed from: a */
    private static FeedItem m18217a(AbstractC28019l lVar) {
        try {
            FeedItem feedItem = (FeedItem) C4139e.C4140a.f11576c.mo46667a(lVar, FeedItem.class);
            feedItem.init();
            return feedItem;
        } catch (Exception unused) {
            throw new C28023p("error type");
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.gson.AbstractC28026s
    /* renamed from: a */
    public final /* synthetic */ AbstractC28019l mo16610a(FeedItem feedItem) {
        FeedItem feedItem2 = feedItem;
        C28022o j = C4139e.C4140a.f11576c.mo46661a(feedItem2).mo46789j();
        j.mo46797a("data", C4139e.C4140a.f11576c.mo46662a(feedItem2.getRoom(), Room.class));
        return j;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.AbstractC28018k
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ FeedItem mo11581a(AbstractC28019l lVar, Type type, AbstractC28017j jVar) {
        return m18217a(lVar);
    }
}
