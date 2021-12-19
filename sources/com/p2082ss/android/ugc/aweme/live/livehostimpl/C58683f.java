package com.p2082ss.android.ugc.aweme.live.livehostimpl;

import android.app.Activity;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.ttlive.C79335a;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.f */
final /* synthetic */ class C58683f implements AbstractC88433f {

    /* renamed from: a */
    private final Activity f133597a;

    /* renamed from: b */
    private final IHostAction.AbstractC11786a f133598b;

    /* renamed from: c */
    private final String f133599c;

    static {
        Covode.recordClassIndex(68985);
    }

    C58683f(Activity activity, IHostAction.AbstractC11786a aVar, String str) {
        this.f133597a = activity;
        this.f133598b = aVar;
        this.f133599c = str;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        Activity activity = this.f133597a;
        IHostAction.AbstractC11786a aVar = this.f133598b;
        String str = this.f133599c;
        C79335a aVar2 = (C79335a) obj;
        if (aVar2.f178243a.intValue() == 1) {
            C31575b.m65862d().mo57199a(activity, new C58685h(aVar, aVar2), aVar2.f178244b, str, aVar2.f178243a.intValue(), aVar2.f178247e, aVar2.f178248f.intValue());
        } else {
            aVar.mo8360a(aVar2.f178245c);
        }
    }
}
