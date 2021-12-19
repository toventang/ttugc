package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.reply.feature.p3118a.p3120b.p3122b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.C17438g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.CommentContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.TextContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.reply.feature.p3118a.p3120b.p3121a.DialogC54286a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56255h;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.a.b.b.a */
public final /* synthetic */ class C54292a implements DialogC54286a.AbstractC54290a {

    /* renamed from: a */
    private final C56255h f124367a;

    /* renamed from: b */
    private final Context f124368b;

    static {
        Covode.recordClassIndex(63986);
    }

    public C54292a(C56255h hVar, Context context) {
        this.f124367a = hVar;
        this.f124368b = context;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.reply.feature.p3118a.p3120b.p3121a.DialogC54286a.AbstractC54290a
    /* renamed from: a */
    public final void mo91377a(String str) {
        C56255h hVar = this.f124367a;
        Context context = this.f124368b;
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(CommentContent.obtain(hVar));
        arrayList.add(TextContent.obtain(str));
        C17438g.C17439a.m32347a().mo27815a(hVar.f128308h.getUid()).mo27816a(arrayList).mo27818a();
        new C79459a(context).mo123050a(R.string.ch9).mo123053a();
    }
}
