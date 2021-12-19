package leakcanary.internal;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import leakcanary.C89792a;
import leakcanary.C89802g;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: leakcanary.internal.b */
public final class C89822b implements AbstractC89172b<Activity, C89391z> {

    /* renamed from: a */
    public final C89802g f203679a;

    /* renamed from: b */
    public final AbstractC89171a<C89792a.C89793a> f203680b;

    /* renamed from: c */
    private final FragmentManager$FragmentLifecycleCallbacksC89823a f203681c = new FragmentManager$FragmentLifecycleCallbacksC89823a(this);

    static {
        Covode.recordClassIndex(105919);
    }

    /* renamed from: leakcanary.internal.b$a */
    public static final class FragmentManager$FragmentLifecycleCallbacksC89823a extends FragmentManager.FragmentLifecycleCallbacks {

        /* renamed from: a */
        final /* synthetic */ C89822b f203682a;

        static {
            Covode.recordClassIndex(105920);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        FragmentManager$FragmentLifecycleCallbacksC89823a(C89822b bVar) {
            this.f203682a = bVar;
        }

        public final void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
            C89219l.m154719c(fragmentManager, "");
            C89219l.m154719c(fragment, "");
            if (this.f203682a.f203680b.invoke().f203628c) {
                this.f203682a.f203679a.mo144366a(fragment);
            }
        }

        public final void onFragmentCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
            if (this.f203682a.f203680b.invoke().f203628c && fragment != null) {
                this.f203682a.f203679a.mo144369b(fragment);
            }
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final /* synthetic */ C89391z invoke(Activity activity) {
        Activity activity2 = activity;
        C89219l.m154719c(activity2, "");
        activity2.getFragmentManager().registerFragmentLifecycleCallbacks(this.f203681c, true);
        return C89391z.f203057a;
    }

    public C89822b(C89802g gVar, AbstractC89171a<C89792a.C89793a> aVar) {
        C89219l.m154719c(gVar, "");
        C89219l.m154719c(aVar, "");
        this.f203679a = gVar;
        this.f203680b = aVar;
    }
}
