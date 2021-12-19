package com.p2082ss.android.ugc.aweme.p2390bi;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bi.b */
public final class C34841b implements AbstractC88438k<C17873f.C17874a> {

    /* renamed from: a */
    public static final C34841b f82295a = new C34841b();

    private C34841b() {
    }

    static {
        Covode.recordClassIndex(41849);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // p4560f.p4561a.p4567d.AbstractC88438k
    /* renamed from: a */
    public final /* synthetic */ boolean mo7718a(C17873f.C17874a aVar) {
        C17873f.C17874a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        if (aVar2.f42643a == null) {
            return false;
        }
        Activity activity = aVar2.f42643a;
        if (activity == null) {
            C89219l.m154715b();
        }
        if (C89219l.m154714a((Object) activity.getClass().getName(), (Object) "com.ss.android.ugc.aweme.main.MainActivity")) {
            return true;
        }
        return false;
    }
}
