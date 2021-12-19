package leakcanary.internal;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import leakcanary.C89792a;
import leakcanary.C89802g;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: leakcanary.internal.o */
public final class C89860o implements AbstractC89172b<Activity, C89391z> {

    /* renamed from: a */
    public final C89802g f203754a;

    /* renamed from: b */
    public final AbstractC89171a<C89792a.C89793a> f203755b;

    /* renamed from: c */
    private final C89861a f203756c = new C89861a(this);

    static {
        Covode.recordClassIndex(105957);
    }

    /* renamed from: leakcanary.internal.o$a */
    public static final class C89861a extends AbstractC0952i.AbstractC0954b {

        /* renamed from: a */
        final /* synthetic */ C89860o f203757a;

        static {
            Covode.recordClassIndex(105958);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C89861a(C89860o oVar) {
            this.f203757a = oVar;
        }

        @Override // androidx.fragment.app.AbstractC0952i.AbstractC0954b
        public final void onFragmentDestroyed(AbstractC0952i iVar, Fragment fragment) {
            C89219l.m154719c(iVar, "");
            C89219l.m154719c(fragment, "");
            if (this.f203757a.f203755b.invoke().f203628c) {
                this.f203757a.f203754a.mo144366a(fragment);
            }
        }

        @Override // androidx.fragment.app.AbstractC0952i.AbstractC0954b
        public final void onFragmentCreated(AbstractC0952i iVar, Fragment fragment, Bundle bundle) {
            C89219l.m154719c(iVar, "");
            C89219l.m154719c(fragment, "");
            if (this.f203757a.f203755b.invoke().f203628c) {
                this.f203757a.f203754a.mo144369b(fragment);
            }
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final /* synthetic */ C89391z invoke(Activity activity) {
        Activity activity2 = activity;
        C89219l.m154719c(activity2, "");
        if (activity2 instanceof ActivityC0945e) {
            ((ActivityC0945e) activity2).getSupportFragmentManager().mo3555a((AbstractC0952i.AbstractC0954b) this.f203756c, true);
        }
        return C89391z.f203057a;
    }

    public C89860o(C89802g gVar, AbstractC89171a<C89792a.C89793a> aVar) {
        C89219l.m154719c(gVar, "");
        C89219l.m154719c(aVar, "");
        this.f203754a = gVar;
        this.f203755b = aVar;
    }
}
