package com.p2082ss.android.ugc.aweme;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bd */
public final class C34789bd {

    /* renamed from: a */
    static final LinkedList<WeakReference<Activity>> f82119a = new LinkedList<>();

    /* renamed from: b */
    public static final C34789bd f82120b = new C34789bd();

    private C34789bd() {
    }

    static {
        Covode.recordClassIndex(41785);
    }

    /* renamed from: a */
    static void m71024a(Activity activity) {
        C89070n.m154537a((List) f82119a, (AbstractC89172b) new C34790a(activity));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bd$a */
    public static final class C34790a extends AbstractC89220m implements AbstractC89172b<WeakReference<Activity>, Boolean> {

        /* renamed from: a */
        final /* synthetic */ Activity f82121a;

        static {
            Covode.recordClassIndex(41786);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34790a(Activity activity) {
            super(1);
            this.f82121a = activity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(WeakReference<Activity> weakReference) {
            boolean z;
            WeakReference<Activity> weakReference2 = weakReference;
            C89219l.m154721d(weakReference2, "");
            Activity activity = weakReference2.get();
            if (activity == null || C89219l.m154714a(activity, this.f82121a)) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: a */
    public static final int m71023a(Context context) {
        Object obj;
        if (!(context instanceof Activity)) {
            return 1;
        }
        WeakReference weakReference = (WeakReference) C89070n.m154583g((List) f82119a);
        if (weakReference != null) {
            obj = weakReference.get();
        } else {
            obj = null;
        }
        if (!C89219l.m154714a(obj, context)) {
            return 2;
        }
        return 3;
    }
}
