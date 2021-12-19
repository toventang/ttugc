package com.p2082ss.android.ugc.aweme.feed.p2969u;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.app.api.p2319b.C33615a;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.feed.u.p */
public class C49981p extends AbstractC49988u {

    /* renamed from: a */
    private Aweme f115307a;

    /* renamed from: b */
    private int f115308b;

    /* renamed from: c */
    private int f115309c;

    /* renamed from: d */
    public boolean f115310d;

    /* renamed from: f */
    private Activity f115311f;

    static {
        Covode.recordClassIndex(59093);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0020  */
    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo57528c() {
        /*
        // Method dump skipped, instructions count: 110
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2969u.C49981p.mo57528c():void");
    }

    public C49981p(Activity activity) {
        this.f115311f = activity;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: a_ */
    public void mo57526a_(Exception exc) {
        Throwable a = C33615a.m68845a((Throwable) exc);
        if (a instanceof C34485a) {
            C34485a aVar = (C34485a) a;
            if (!TextUtils.isEmpty(aVar.getErrorMsg())) {
                new C23144b(this.f115311f).mo37635a(aVar.getErrorMsg()).mo37637b();
                return;
            }
        }
        super.mo57526a_(exc);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2969u.AbstractC49988u
    /* renamed from: a */
    public final void mo85027a(Aweme aweme, int i) {
        this.f115307a = aweme;
        this.f115309c = aweme.getStatus().getPrivateStatus();
        this.f115308b = i;
    }
}
