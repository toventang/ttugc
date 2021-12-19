package com.p2082ss.android.ugc.aweme.p2685cp.p2687b.p2688a;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.xelement.defaultimpl.player.engine.p1369a.p1370a.C19064a;
import com.bytedance.ies.xelement.p1364b.AbstractC18997c;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.cp.b.a.a */
public final class C40245a implements AbstractC18997c, ActivityStack.AbstractC80170b {

    /* renamed from: a */
    private final AbstractC89244h f94456a = C89250i.m154773a((AbstractC89171a) C40246a.f94457a);

    static {
        Covode.recordClassIndex(48046);
    }

    /* renamed from: c */
    private final C19064a<AbstractC18997c.AbstractC18998a> m81389c() {
        return (C19064a) this.f94456a.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.a.a$a */
    static final class C40246a extends AbstractC89220m implements AbstractC89171a<C19064a<AbstractC18997c.AbstractC18998a>> {

        /* renamed from: a */
        public static final C40246a f94457a = new C40246a();

        static {
            Covode.recordClassIndex(48047);
        }

        C40246a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C19064a<AbstractC18997c.AbstractC18998a> invoke() {
            return new C19064a();
        }
    }

    @Override // com.bytedance.ies.xelement.p1364b.AbstractC18997c
    public final boolean bq_() {
        return ActivityStack.isAppBackGround();
    }

    public C40245a() {
        ActivityStack.addAppBackGroundListener(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.utils.ActivityStack.AbstractC80170b
    /* renamed from: a */
    public final void mo69456a() {
        m81389c().mo30411a(C40247b.f94458a);
    }

    @Override // com.p2082ss.android.ugc.aweme.utils.ActivityStack.AbstractC80170b
    /* renamed from: b */
    public final void mo69457b() {
        m81389c().mo30411a(C40248c.f94459a);
    }

    @Override // com.bytedance.ies.xelement.p1364b.AbstractC18997c
    public final void br_() {
        Context a = C17867d.m33078a();
        Object a2 = C40249b.m81394a(a, "activity");
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.app.ActivityManager");
        ActivityManager activityManager = (ActivityManager) a2;
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity != null) {
            activityManager.moveTaskToFront(topActivity.getTaskId(), 0);
            return;
        }
        Intent launchIntentForPackage = a.getPackageManager().getLaunchIntentForPackage(a.getPackageName());
        if (launchIntentForPackage != null) {
            C84349a.m145093a(launchIntentForPackage, a);
            a.startActivity(launchIntentForPackage);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.a.a$c */
    static final class C40248c extends AbstractC89220m implements AbstractC89172b<AbstractC18997c.AbstractC18998a, C89391z> {

        /* renamed from: a */
        public static final C40248c f94459a = new C40248c();

        static {
            Covode.recordClassIndex(48049);
        }

        C40248c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC18997c.AbstractC18998a aVar) {
            C89219l.m154721d(aVar, "");
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.a.a$b */
    static final class C40247b extends AbstractC89220m implements AbstractC89172b<AbstractC18997c.AbstractC18998a, C89391z> {

        /* renamed from: a */
        public static final C40247b f94458a = new C40247b();

        static {
            Covode.recordClassIndex(48048);
        }

        C40247b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC18997c.AbstractC18998a aVar) {
            AbstractC18997c.AbstractC18998a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.mo29904c();
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.xelement.p1364b.AbstractC18997c
    /* renamed from: a */
    public final void mo30151a(AbstractC18997c.AbstractC18998a aVar) {
        C89219l.m154721d(aVar, "");
        m81389c().mo30412a(aVar);
    }

    @Override // com.bytedance.ies.xelement.p1364b.AbstractC18997c
    /* renamed from: b */
    public final void mo30152b(AbstractC18997c.AbstractC18998a aVar) {
        C89219l.m154721d(aVar, "");
        m81389c().mo30413b(aVar);
    }
}
