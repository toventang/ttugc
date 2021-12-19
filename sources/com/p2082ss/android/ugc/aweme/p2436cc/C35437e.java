package com.p2082ss.android.ugc.aweme.p2436cc;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34712a;
import com.p2082ss.android.ugc.aweme.p2436cc.p2437a.AbstractC35424a;
import com.p2082ss.android.ugc.aweme.p2436cc.p2437a.AbstractC35425b;
import com.p2082ss.android.ugc.aweme.utils.p4203d.C80328b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.cc.e */
public final class C35437e implements AbstractC35424a {

    /* renamed from: a */
    public AbstractC35425b f83607a;

    static {
        Covode.recordClassIndex(42613);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2436cc.p2437a.AbstractC35424a
    /* renamed from: a */
    public final void mo62328a(AbstractC35425b bVar) {
        this.f83607a = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.cc.e$a */
    public static final class C35438a implements C34712a.AbstractC34713a {

        /* renamed from: a */
        final /* synthetic */ C35437e f83608a;

        static {
            Covode.recordClassIndex(42614);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C35438a(C35437e eVar) {
            this.f83608a = eVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.base.utils.C34712a.AbstractC34713a
        /* renamed from: a */
        public final void mo61391a(Activity activity, boolean z) {
            C89219l.m154721d(activity, "");
            AbstractC35425b bVar = this.f83608a.f83607a;
            if (bVar != null) {
                bVar.mo62330a(activity, z);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cc.e$b */
    public static final class C35439b extends C80328b {

        /* renamed from: a */
        final /* synthetic */ C35437e f83609a;

        static {
            Covode.recordClassIndex(42615);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C35439b(C35437e eVar) {
            this.f83609a = eVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.p4203d.C80328b
        public final void onActivityDestroyed(Activity activity) {
            C89219l.m154721d(activity, "");
            super.onActivityDestroyed(activity);
            AbstractC35425b bVar = this.f83609a.f83607a;
            if (bVar != null) {
                bVar.mo62331b(activity);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.p4203d.C80328b
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            C89219l.m154721d(activity, "");
            super.onActivityCreated(activity, bundle);
            AbstractC35425b bVar = this.f83609a.f83607a;
            if (bVar != null) {
                bVar.mo62329a(activity);
            }
        }
    }
}
