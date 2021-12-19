package com.p2082ss.android.ugc.aweme.base.component;

import android.os.Build;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1192f;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.activity.C33067a;
import com.p2082ss.android.ugc.aweme.analysis.AbstractC33501c;
import com.p2082ss.android.ugc.aweme.component.music.MusicService;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.port.internal.MainActivityCallback;
import com.p2082ss.android.ugc.aweme.share.p3745c.AbstractC68903b;
import com.p2082ss.android.ugc.aweme.shortvideo.C69831ai;
import com.p2082ss.android.ugc.aweme.shortvideo.CreateAwemeResponse;
import com.p2082ss.android.ugc.aweme.shortvideo.p3837j.C71900f;
import com.p2082ss.android.ugc.aweme.utils.C80567ic;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.base.component.EventActivityComponent */
public class EventActivityComponent implements AbstractC1192f, AbstractC90252i, AbstractC90253j {

    /* renamed from: c */
    static DialogC34558i f81546c;

    /* renamed from: e */
    private static boolean f81547e;

    /* renamed from: a */
    AbstractC68903b f81548a;

    /* renamed from: b */
    ActivityC0945e f81549b;

    /* renamed from: d */
    private WeakReference<AbstractC33501c> f81550d;

    static {
        Covode.recordClassIndex(41498);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(47, new RunnableC90250g(EventActivityComponent.class, "onNotificationRetry", C34544g.class, ThreadMode.POSTING, 0, true));
        hashMap.put(48, new RunnableC90250g(EventActivityComponent.class, "onPublishStatus", C71900f.class, ThreadMode.POSTING, -1, true));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.base.component.EventActivityComponent$1 */
    static /* synthetic */ class C345371 {

        /* renamed from: a */
        static final /* synthetic */ int[] f81551a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        static {
            /*
                r0 = 41499(0xa21b, float:5.8152E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                androidx.lifecycle.i$a[] r0 = androidx.lifecycle.AbstractC1196i.EnumC1198a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.p2082ss.android.ugc.aweme.base.component.EventActivityComponent.C345371.f81551a = r2
                androidx.lifecycle.i$a r0 = androidx.lifecycle.AbstractC1196i.EnumC1198a.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.p2082ss.android.ugc.aweme.base.component.EventActivityComponent.C345371.f81551a     // Catch:{ NoSuchFieldError -> 0x0023 }
                androidx.lifecycle.i$a r0 = androidx.lifecycle.AbstractC1196i.EnumC1198a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.p2082ss.android.ugc.aweme.base.component.EventActivityComponent.C345371.f81551a     // Catch:{ NoSuchFieldError -> 0x002e }
                androidx.lifecycle.i$a r0 = androidx.lifecycle.AbstractC1196i.EnumC1198a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.p2082ss.android.ugc.aweme.base.component.EventActivityComponent.C345371.f81551a     // Catch:{ NoSuchFieldError -> 0x0039 }
                androidx.lifecycle.i$a r0 = androidx.lifecycle.AbstractC1196i.EnumC1198a.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.base.component.EventActivityComponent.C345371.<clinit>():void");
        }
    }

    public EventActivityComponent(ActivityC0945e eVar) {
        this.f81549b = eVar;
    }

    @AbstractC90264r(mo145423b = true)
    public void onNotificationRetry(C34544g gVar) {
        this.f81549b.getClass().getSimpleName();
        if (MainActivityCallback.m114719a(this.f81549b)) {
            new MainActivityCallback(this.f81549b, gVar.f81560a, true);
            EventBus.m156962a().mo145399f(gVar);
        }
    }

    @AbstractC90264r(mo145423b = true, mo145424c = -1)
    public void onPublishStatus(C71900f fVar) {
        ActivityC0945e eVar = this.f81549b;
        eVar.getClass().getSimpleName();
        if (C33067a.m67725a(eVar)) {
            f81547e = false;
            if (fVar.f161088b == 12) {
                if (eVar == C17873f.m33102j()) {
                    new C23144b(this.f81549b).mo37640e(R.string.bxp).mo37637b();
                }
                C51423a.m95790a((Throwable) new Exception(fVar.toString()));
            } else if (fVar.f161088b == 9) {
                if (eVar == C17873f.m33102j() && fVar.f161098l) {
                    String str = fVar.f161091e;
                    if (TextUtils.isEmpty(str)) {
                        str = eVar.getResources().getString(R.string.ey9);
                    }
                    Toast makeText = Toast.makeText(this.f81549b, str, 1);
                    if (Build.VERSION.SDK_INT == 25) {
                        C80567ic.m139657a(makeText);
                    }
                    makeText.show();
                }
                C51423a.m95790a((Throwable) new Exception(fVar.toString()));
            } else if (fVar.f161088b == 10 && !fVar.f161097k) {
                RunnableC34540c cVar = new RunnableC34540c(this, fVar, eVar);
                C69831ai aiVar = fVar.f161094h;
                if (!(aiVar instanceof CreateAwemeResponse) || ((CreateAwemeResponse) aiVar).couponInfo == null) {
                    cVar.run();
                } else {
                    MusicService.m81198m().mo69321j();
                }
            }
            AVExternalServiceImpl.m113114a().publishService().setPublishStatus(fVar.f161088b);
        }
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        AbstractC68903b bVar;
        int i = C345371.f81551a[aVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                EventBus.m156966a(EventBus.m156962a(), this);
            } else if (i == 3) {
                EventBus.m156962a().mo145395b(this);
            } else if (i == 4 && (bVar = this.f81548a) != null) {
                bVar.mo85245d();
            }
        } else if (this.f81549b instanceof AbstractC33501c) {
            this.f81550d = new WeakReference<>(this.f81549b);
        }
    }
}
