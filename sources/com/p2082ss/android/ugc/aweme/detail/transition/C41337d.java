package com.p2082ss.android.ugc.aweme.detail.transition;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.detail.transition.d */
public final class C41337d {

    /* renamed from: b */
    public static final AbstractC89244h f96471b = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C41339b.f96474a);

    /* renamed from: c */
    public static final C41338a f96472c = new C41338a((byte) 0);

    /* renamed from: a */
    public WeakReference<Activity> f96473a;

    /* renamed from: com.ss.android.ugc.aweme.detail.transition.d$a */
    public static final class C41338a {
        static {
            Covode.recordClassIndex(49227);
        }

        /* renamed from: a */
        public static C41337d m83197a() {
            return (C41337d) C41337d.f96471b.getValue();
        }

        private C41338a() {
        }

        public /* synthetic */ C41338a(byte b) {
            this();
        }
    }

    private C41337d() {
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.transition.d$b */
    static final class C41339b extends AbstractC89220m implements AbstractC89171a<C41337d> {

        /* renamed from: a */
        public static final C41339b f96474a = new C41339b();

        static {
            Covode.recordClassIndex(49228);
        }

        C41339b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C41337d invoke() {
            return new C41337d((byte) 0);
        }
    }

    static {
        Covode.recordClassIndex(49226);
    }

    /* renamed from: a */
    public final void mo70604a() {
        Activity activity;
        WeakReference<Activity> weakReference = this.f96473a;
        if (weakReference != null && (activity = weakReference.get()) != null) {
            C89219l.m154716b(activity, "");
            if (!activity.isFinishing()) {
                activity.getWindow().clearFlags(16);
            }
        }
    }

    public /* synthetic */ C41337d(byte b) {
        this();
    }
}
