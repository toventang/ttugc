package com.bytedance.als.dsl;

import android.app.Activity;
import android.content.Context;
import androidx.appcompat.app.ActivityC0218d;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1181ae;
import com.bytedance.als.AbstractC2547b;
import com.bytedance.als.AbstractC2557e;
import com.bytedance.als.AbstractC2562j;
import com.bytedance.als.C2548c;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.C21597n;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.C22267s;
import com.bytedance.scene.group.AbstractC22186b;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.als.dsl.g */
public final class C2556g {
    static {
        Covode.recordClassIndex(2941);
    }

    /* renamed from: a */
    public static final <T extends AbstractC2562j<A> & AbstractC21566a, A extends AbstractC2547b> Context m7467a(T t) {
        C89219l.m154721d(t, "");
        return (Context) t.getDiContainer().mo35248a(Context.class, "applicationContext");
    }

    /* renamed from: b */
    public static final <T extends AbstractC2562j<A> & AbstractC21566a, A extends AbstractC2547b> Activity m7473b(T t) {
        C89219l.m154721d(t, "");
        return (Activity) t.getDiContainer().mo35248a(Activity.class, (String) null);
    }

    /* renamed from: c */
    public static final <T extends AbstractC2562j<A> & AbstractC21566a, A extends AbstractC2547b> Context m7474c(T t) {
        C89219l.m154721d(t, "");
        return (Context) t.getDiContainer().mo35248a(Context.class, (String) null);
    }

    /* renamed from: a */
    public static final OCAdapterViewModel m7468a(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        AbstractC1174ac a = C1181ae.m3880a(eVar).mo3983a(AlsVMContainer.class);
        C89219l.m154716b(a, "");
        AlsVMContainer alsVMContainer = (AlsVMContainer) a;
        alsVMContainer.mo7020a(eVar);
        if (alsVMContainer.f7714c == null) {
            alsVMContainer.f7714c = new OCAdapterViewModel(null, alsVMContainer.f7712a);
        }
        OCAdapterViewModel oCAdapterViewModel = alsVMContainer.f7714c;
        if (oCAdapterViewModel == null) {
            C89219l.m154715b();
        }
        return oCAdapterViewModel;
    }

    /* renamed from: a */
    public static final OCAdapterViewModel m7469a(AbstractC2557e<?> eVar) {
        C89219l.m154721d(eVar, "");
        AbstractC1174ac a = C2548c.m7451a(eVar).mo3983a(AlsVMContainer.class);
        C89219l.m154716b(a, "");
        AlsVMContainer alsVMContainer = (AlsVMContainer) a;
        if (alsVMContainer.f7714c == null) {
            alsVMContainer.f7714c = new OCAdapterViewModel(eVar.f7723b, alsVMContainer.f7712a);
        }
        OCAdapterViewModel oCAdapterViewModel = alsVMContainer.f7714c;
        if (oCAdapterViewModel == null) {
            C89219l.m154715b();
        }
        return oCAdapterViewModel;
    }

    /* renamed from: a */
    public static final OCAdapterViewModel m7470a(AbstractC22219j jVar) {
        C21582f fVar;
        C89219l.m154721d(jVar, "");
        AbstractC1174ac a = C22267s.m41933a(jVar).mo3983a(AlsVMContainer.class);
        C89219l.m154716b(a, "");
        AlsVMContainer alsVMContainer = (AlsVMContainer) a;
        if (alsVMContainer.f7714c == null) {
            if (jVar.f52551o == null || !(jVar.f52551o instanceof AbstractC22186b)) {
                Activity t = jVar.mo36486t();
                Objects.requireNonNull(t, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                ActivityC0218d dVar = (ActivityC0218d) t;
                C89219l.m154721d(dVar, "");
                AbstractC1174ac a2 = C1181ae.m3880a((ActivityC0945e) dVar).mo3983a(AlsVMContainer.class);
                C89219l.m154716b(a2, "");
                if (((AlsVMContainer) a2).f7713b != null) {
                    fVar = C2552c.m7463b(dVar);
                } else {
                    fVar = null;
                }
            } else {
                AbstractC22219j jVar2 = jVar.f52551o;
                Objects.requireNonNull(jVar2, "null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
                fVar = C2552c.m7464b((AbstractC22186b) jVar2);
            }
            alsVMContainer.f7714c = new OCAdapterViewModel(fVar, alsVMContainer.f7712a);
        }
        OCAdapterViewModel oCAdapterViewModel = alsVMContainer.f7714c;
        if (oCAdapterViewModel == null) {
            C89219l.m154715b();
        }
        return oCAdapterViewModel;
    }

    /* renamed from: a */
    public static final C21582f m7471a(ActivityC0218d dVar, AbstractC89172b<? super C21597n, C89391z> bVar) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(bVar, "");
        OCAdapterViewModel a = m7468a(dVar);
        C21597n nVar = a.f7716a;
        C21597n.C21601b a2 = nVar.mo35261a(ActivityC0218d.class, (String) null, dVar);
        C89219l.m154709a((Object) a2, "");
        a2.mo35263a(ActivityC0945e.class).mo35263a(Activity.class);
        C89219l.m154709a((Object) nVar.mo35261a(Context.class, (String) null, dVar), "");
        Context applicationContext = dVar.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        C89219l.m154716b(applicationContext, "");
        C89219l.m154709a((Object) nVar.mo35261a(Context.class, "applicationContext", applicationContext), "");
        bVar.invoke(nVar);
        a.mo7022a();
        return a.mo7023b();
    }

    /* renamed from: a */
    public static final C21582f m7472a(AbstractC22186b bVar, AbstractC89172b<? super C21597n, C89391z> bVar2) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
        OCAdapterViewModel a = m7470a(bVar);
        C21597n nVar = a.f7716a;
        C89219l.m154709a((Object) nVar.mo35261a(AbstractC22186b.class, (String) null, bVar), "");
        bVar2.invoke(nVar);
        a.mo7022a();
        C21582f b = a.mo7023b();
        if (b == null) {
            C89219l.m154715b();
        }
        return b;
    }
}
