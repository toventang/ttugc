package com.bytedance.helios.sdk.anchor;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.p1087a.C15297a;
import com.bytedance.helios.api.p1087a.C15298b;
import com.bytedance.helios.api.p1088b.C15318n;
import com.bytedance.helios.sdk.anchor.p1093a.C15361a;
import com.bytedance.helios.sdk.p1097d.AbstractC15419r;
import com.bytedance.helios.sdk.utils.C15484f;
import com.bytedance.helios.sdk.utils.HandlerThreadC15486g;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public final class AnchorManagerImpl extends C15298b implements AbstractC15419r {
    public final AbstractC15369b mAnchorTask;

    static {
        Covode.recordClassIndex(17606);
    }

    /* renamed from: com_bytedance_helios_sdk_anchor_AnchorManagerImpl_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m28250x41253976(String str, String str2) {
        return 0;
    }

    @Override // com.bytedance.helios.api.p1087a.C15298b
    public final String getAnchorTaskName() {
        return this.mAnchorTask.mo25107a();
    }

    /* renamed from: com.bytedance.helios.sdk.anchor.AnchorManagerImpl$a */
    static final class RunnableC15355a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C15360a f37452a;

        /* renamed from: b */
        final /* synthetic */ AnchorManagerImpl f37453b;

        static {
            Covode.recordClassIndex(17607);
        }

        RunnableC15355a(C15360a aVar, AnchorManagerImpl anchorManagerImpl) {
            this.f37452a = aVar;
            this.f37453b = anchorManagerImpl;
        }

        public final void run() {
            this.f37453b.mAnchorTask.mo25109a(this.f37452a, (Integer) 8);
        }
    }

    /* renamed from: com.bytedance.helios.sdk.anchor.AnchorManagerImpl$b */
    static final class RunnableC15356b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C15360a f37454a;

        /* renamed from: b */
        final /* synthetic */ AnchorManagerImpl f37455b;

        static {
            Covode.recordClassIndex(17608);
        }

        RunnableC15356b(C15360a aVar, AnchorManagerImpl anchorManagerImpl) {
            this.f37454a = aVar;
            this.f37455b = anchorManagerImpl;
        }

        public final void run() {
            this.f37455b.mAnchorTask.mo25108a(this.f37454a, 9);
        }
    }

    /* renamed from: com.bytedance.helios.sdk.anchor.AnchorManagerImpl$d */
    static final class RunnableC15358d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AnchorManagerImpl f37457a;

        /* renamed from: b */
        final /* synthetic */ C15360a f37458b;

        /* renamed from: c */
        final /* synthetic */ int f37459c;

        static {
            Covode.recordClassIndex(17610);
        }

        RunnableC15358d(AnchorManagerImpl anchorManagerImpl, C15360a aVar, int i) {
            this.f37457a = anchorManagerImpl;
            this.f37458b = aVar;
            this.f37459c = i;
        }

        public final void run() {
            this.f37457a.mAnchorTask.mo25108a(this.f37458b, this.f37459c);
        }
    }

    /* renamed from: com.bytedance.helios.sdk.anchor.AnchorManagerImpl$e */
    static final class RunnableC15359e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AnchorManagerImpl f37460a;

        /* renamed from: b */
        final /* synthetic */ C15360a f37461b;

        static {
            Covode.recordClassIndex(17611);
        }

        RunnableC15359e(AnchorManagerImpl anchorManagerImpl, C15360a aVar) {
            this.f37460a = anchorManagerImpl;
            this.f37461b = aVar;
        }

        public final void run() {
            this.f37460a.mAnchorTask.mo25109a(this.f37461b, (Integer) null);
        }
    }

    private AnchorManagerImpl() {
        AbstractC15369b a = C15361a.m28251a(this);
        C89219l.m154709a((Object) a, "");
        this.mAnchorTask = a;
    }

    /* renamed from: com.bytedance.helios.sdk.anchor.AnchorManagerImpl$c */
    static final class C15357c extends AbstractC89220m implements AbstractC89172b<C15318n, String> {

        /* renamed from: a */
        public static final C15357c f37456a = new C15357c();

        static {
            Covode.recordClassIndex(17609);
        }

        C15357c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(C15318n nVar) {
            C15318n nVar2 = nVar;
            C89219l.m154719c(nVar2, "");
            return "(eventId=" + nVar2.f37356b + " startedTime=" + nVar2.f37366l + ')';
        }
    }

    @Override // com.bytedance.helios.api.p1087a.C15298b
    public final void stopCheck(Activity activity) {
        m28250x41253976("AnchorManager", "stopCheck: ".concat(String.valueOf(activity)));
        HandlerThreadC15486g.m28499b().post(new RunnableC15359e(this, new C15360a(activity)));
    }

    @Override // com.bytedance.helios.api.p1087a.C15298b
    public final void startCheck(Activity activity, int i) {
        m28250x41253976("AnchorManager", "startCheck: " + activity + '/' + C15297a.m28206a(i));
        HandlerThreadC15486g.m28499b().post(new RunnableC15358d(this, new C15360a(activity), i));
    }

    @Override // com.bytedance.helios.sdk.p1097d.AbstractC15419r
    public final void onWindowViewAction(int i, List<C15318n> list) {
        C89219l.m154719c(list, "");
        if (!(!C89219l.m154714a((Object) this.mAnchorTask.mo25107a(), (Object) "AnchorTaskPlanA"))) {
            C15484f.m28491a("Helios-Log-Detection-Task", "onWindowViewAction eventId=" + i + " privacyEvents=" + C89070n.m154551a(list, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C15357c.f37456a, 31), (String) null, 12);
            switch (i) {
                case 102800:
                    for (T t : list) {
                        HandlerThreadC15486g.m28499b().post(new RunnableC15355a(new C15360a(t.f37364j, t.f37365k, (List) t.f37368n.get("floating_view_activities")), this));
                    }
                    return;
                case 102801:
                    for (T t2 : list) {
                        HandlerThreadC15486g.m28499b().post(new RunnableC15356b(new C15360a(t2.f37364j, t2.f37365k, (List) t2.f37368n.get("floating_view_activities")), this));
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
