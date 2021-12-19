package com.p2082ss.android.ugc.aweme.tools.detail;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.model.p3458a.C60104a;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.sticker.model.C75445g;
import com.p2082ss.android.ugc.aweme.sticker.model.C75446h;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.tools.detail.IPropReuseService */
public interface IPropReuseService {
    static {
        Covode.recordClassIndex(91209);
    }

    /* renamed from: a */
    AbstractC39100a<Aweme, ?> mo104477a();

    /* renamed from: a */
    AbstractC41262aa mo104478a(AbstractC39100a<?, ?> aVar, C49812b bVar);

    /* renamed from: a */
    C75446h mo104479a(String str);

    /* renamed from: a */
    String mo104480a(Context context);

    /* renamed from: a */
    void mo104481a(Activity activity, ArrayList<C75445g> arrayList, Music music, String str, String str2, String str3, int i);

    /* renamed from: a */
    void mo104482a(Activity activity, ArrayList<C75445g> arrayList, String str, Music music, String str2, String str3, int i, boolean z);

    /* renamed from: a */
    void mo104483a(Context context, Aweme aweme, String str, String str2, String str3, String str4, int i);

    /* renamed from: a */
    void mo104484a(Context context, List<String> list, C60104a aVar, boolean z);

    /* renamed from: a */
    boolean mo104485a(Aweme aweme);

    /* renamed from: b */
    Class<? extends Activity> mo104486b();
}
