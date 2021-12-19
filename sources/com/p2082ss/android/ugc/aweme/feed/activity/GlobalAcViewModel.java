package com.p2082ss.android.ugc.aweme.feed.activity;

import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.activity.C33069b;
import com.p2082ss.android.ugc.aweme.money.growth.AbstractC60168a;
import com.p2082ss.android.ugc.aweme.pendant.AbstractC62771e;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.activity.GlobalAcViewModel */
public final class GlobalAcViewModel extends AbstractC1174ac implements AbstractC90252i, AbstractC90253j {

    /* renamed from: g */
    public static final C48029a f111258g = new C48029a((byte) 0);

    /* renamed from: a */
    public WeakReference<AbstractC1204m> f111259a;

    /* renamed from: b */
    public WeakReference<ViewGroup> f111260b;

    /* renamed from: c */
    public WeakReference<ActivityC0945e> f111261c;

    /* renamed from: d */
    public final C1213t<Boolean> f111262d = new C1213t<>();

    /* renamed from: e */
    public AbstractC62771e f111263e;

    /* renamed from: f */
    public final GlobalAcViewModel$mainActivityLifecycleObserver$1 f111264f;

    /* renamed from: h */
    private final AbstractC60168a f111265h;

    static {
        Covode.recordClassIndex(56756);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(362, new RunnableC90250g(GlobalAcViewModel.class, "onLiveSkyShowEvent", C33069b.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.activity.GlobalAcViewModel$a */
    public static final class C48029a {
        static {
            Covode.recordClassIndex(56757);
        }

        private C48029a() {
        }

        public /* synthetic */ C48029a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.activity.GlobalAcViewModel$c */
    public static final class RunnableC48031c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ GlobalAcViewModel f111267a;

        static {
            Covode.recordClassIndex(56759);
        }

        public RunnableC48031c(GlobalAcViewModel globalAcViewModel) {
            this.f111267a = globalAcViewModel;
        }

        public final void run() {
            this.f111267a.mo80060a();
        }
    }

    public GlobalAcViewModel() {
        EventBus.m156966a(EventBus.m156962a(), this);
        this.f111265h = new C48032d(this);
        this.f111264f = new GlobalAcViewModel$mainActivityLifecycleObserver$1(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        if (r3 == null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
        if (r1 == null) goto L_0x0041;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80060a() {
        /*
        // Method dump skipped, instructions count: 127
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.activity.GlobalAcViewModel.mo80060a():void");
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.activity.GlobalAcViewModel$b */
    public static final class C48030b implements AbstractC1214u<Boolean> {

        /* renamed from: a */
        final /* synthetic */ GlobalAcViewModel f111266a;

        static {
            Covode.recordClassIndex(56758);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C48030b(GlobalAcViewModel globalAcViewModel) {
            this.f111266a = globalAcViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Boolean bool) {
            Boolean bool2 = bool;
            if (bool2 != null && this.f111266a.f111263e != null) {
                bool2.booleanValue();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.activity.GlobalAcViewModel$d */
    public static final class C48032d implements AbstractC60168a {

        /* renamed from: a */
        final /* synthetic */ GlobalAcViewModel f111268a;

        static {
            Covode.recordClassIndex(56760);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C48032d(GlobalAcViewModel globalAcViewModel) {
            this.f111268a = globalAcViewModel;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
            if (r3 == null) goto L_0x002d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
            if (r1 == null) goto L_0x0043;
         */
        @Override // com.p2082ss.android.ugc.aweme.money.growth.AbstractC60168a
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo37130a(com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r7) {
            /*
            // Method dump skipped, instructions count: 104
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.activity.GlobalAcViewModel.C48032d.mo37130a(com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting):void");
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onLiveSkyShowEvent(C33069b bVar) {
        C89219l.m154721d(bVar, "");
        AbstractC62771e eVar = this.f111263e;
        if (eVar != null) {
            eVar.mo100748a(bVar.f78626a);
        }
    }

    /* renamed from: a */
    public static final GlobalAcViewModel m91042a(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        AbstractC1174ac a = C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(GlobalAcViewModel.class);
        C89219l.m154716b(a, "");
        return (GlobalAcViewModel) a;
    }
}
