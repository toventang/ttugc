package com.p2082ss.android.ugc.aweme.video.simkit.p4219a.p4223b.p4224a;

import android.content.Context;
import com.bytedance.common.utility.C13624l;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.video.simkit.a.b.a.c */
final /* synthetic */ class CallableC80988c implements Callable {

    /* renamed from: a */
    private final C80986b f181025a;

    static {
        Covode.recordClassIndex(94298);
    }

    CallableC80988c(C80986b bVar) {
        this.f181025a = bVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C80986b bVar = this.f181025a;
        Context a = C17867d.m33078a();
        if (C58029j.f132251c == C13624l.EnumC13625a.UNKNOWN || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132251c = C13624l.m24488d(a);
        }
        bVar.f181023a = C58029j.f132251c;
        return null;
    }
}
