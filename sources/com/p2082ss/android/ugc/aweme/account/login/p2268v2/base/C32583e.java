package com.p2082ss.android.ugc.aweme.account.login.p2268v2.base;

import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import p4560f.p4561a.AbstractC88973n;
import p4560f.p4561a.AbstractC88977r;
import p4560f.p4561a.AbstractC88978s;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4573e.p4576c.C88634y;
import p4560f.p4561a.p4587h.C88925a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.e */
public final class C32583e {
    static {
        Covode.recordClassIndex(39355);
    }

    /* renamed from: a */
    public static final <T> AbstractC88973n<T> m67080a(AbstractC88973n<T> nVar, AbstractC34586a aVar) {
        AbstractC88973n<T> a;
        C89219l.m154721d(nVar, "");
        C89219l.m154721d(aVar, "");
        MaybeBindLifeCycleTransformer maybeBindLifeCycleTransformer = new MaybeBindLifeCycleTransformer();
        if (aVar.af_()) {
            AbstractC1204m viewLifecycleOwner = aVar.getViewLifecycleOwner();
            C89219l.m154716b(viewLifecycleOwner, "");
            viewLifecycleOwner.getLifecycle().mo4012a(maybeBindLifeCycleTransformer);
        } else {
            aVar.getLifecycle().mo4012a(maybeBindLifeCycleTransformer);
        }
        AbstractC88977r a2 = ((AbstractC88978s) C88466b.m153697a((Object) maybeBindLifeCycleTransformer, "transformer is null")).mo17920a(nVar);
        if (a2 instanceof AbstractC88973n) {
            a = C88925a.m154169a((AbstractC88973n) a2);
        } else {
            C88466b.m153697a((Object) a2, "onSubscribe is null");
            a = C88925a.m154169a(new C88634y(a2));
        }
        C89219l.m154716b(a, "");
        return a;
    }
}
