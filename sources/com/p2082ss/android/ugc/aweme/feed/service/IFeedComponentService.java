package com.p2082ss.android.ugc.aweme.feed.service;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.p1890o.AbstractC24641d;
import com.p2082ss.android.ugc.aweme.feed.AbstractC49420e;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48153am;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2949i.AbstractC49691s;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49748e;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.service.IFeedComponentService */
public interface IFeedComponentService {
    static {
        Covode.recordClassIndex(59019);
    }

    /* renamed from: a */
    AbstractC24641d mo84949a(float f);

    /* renamed from: a */
    AbstractC48153am mo84950a();

    /* renamed from: a */
    AbstractC49420e mo84951a(String str, int i, AbstractC49691s<C49672ag> sVar, AbstractC49748e eVar);

    /* renamed from: a */
    Boolean mo84952a(Activity activity);

    /* renamed from: a */
    <T> T mo84953a(Class<T> cls);

    /* renamed from: a */
    boolean mo84954a(Aweme aweme);

    /* renamed from: b */
    List<AnchorCommonStruct> mo84955b(Aweme aweme);
}
