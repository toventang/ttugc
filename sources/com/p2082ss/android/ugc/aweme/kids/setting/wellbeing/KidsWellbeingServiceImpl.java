package com.p2082ss.android.ugc.aweme.kids.setting.wellbeing;

import android.content.IntentFilter;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.kids.common.response.KidsVideoPlaytimeReminder;
import com.p2082ss.android.ugc.aweme.kids.common.response.KidsWellbeingSetting;
import com.p2082ss.android.ugc.aweme.kids.experiment.abmock.p3351a.C57618d;
import com.p2082ss.android.ugc.aweme.kids.setting.api.IKidsWellbeingService;
import com.p2082ss.android.ugc.aweme.kids.setting.wellbeing.C57989a;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.wellbeing.KidsWellbeingServiceImpl */
public final class KidsWellbeingServiceImpl implements IKidsWellbeingService {

    /* renamed from: a */
    private final AbstractC89244h f132166a = C89250i.m154773a((AbstractC89171a) C57988a.f132167a);

    static {
        Covode.recordClassIndex(68014);
    }

    /* renamed from: d */
    private final C57993b m104801d() {
        return (C57993b) this.f132166a.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.wellbeing.KidsWellbeingServiceImpl$a */
    static final class C57988a extends AbstractC89220m implements AbstractC89171a<C57993b> {

        /* renamed from: a */
        public static final C57988a f132167a = new C57988a();

        static {
            Covode.recordClassIndex(68015);
        }

        C57988a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C57993b invoke() {
            if (C57618d.C57619a.m104342a() != 0) {
                return new C57993b();
            }
            return null;
        }
    }

    /* renamed from: c */
    public static IKidsWellbeingService m104800c() {
        MethodCollector.m26663i(12614);
        Object a = C81908b.m141854a(IKidsWellbeingService.class, false);
        if (a != null) {
            IKidsWellbeingService iKidsWellbeingService = (IKidsWellbeingService) a;
            MethodCollector.m26664o(12614);
            return iKidsWellbeingService;
        }
        if (C81908b.f183220bW == null) {
            synchronized (IKidsWellbeingService.class) {
                try {
                    if (C81908b.f183220bW == null) {
                        C81908b.f183220bW = new KidsWellbeingServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12614);
                    throw th;
                }
            }
        }
        KidsWellbeingServiceImpl kidsWellbeingServiceImpl = (KidsWellbeingServiceImpl) C81908b.f183220bW;
        MethodCollector.m26664o(12614);
        return kidsWellbeingServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.setting.api.IKidsWellbeingService
    /* renamed from: b */
    public final void mo95133b() {
        C57993b d = m104801d();
        if (d != null && d.f132175c) {
            d.f132175c = false;
            C57998c a = d.mo95316a();
            Long l = a.f132186b;
            if (l != null) {
                a.f132185a += (System.currentTimeMillis() - l.longValue()) / 1000;
                C57989a.C57990a.m104806a(a.f132185a);
            }
            a.f132186b = null;
            d.f132174b.unregisterReceiver(d.f132176d);
            d.mo95318b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.setting.api.IKidsWellbeingService
    /* renamed from: a */
    public final void mo95131a() {
        List<KidsVideoPlaytimeReminder> playtimeReminder;
        C57993b d = m104801d();
        if (d != null && !d.f132175c) {
            d.f132175c = true;
            C57998c a = d.mo95316a();
            a.f132186b = Long.valueOf(System.currentTimeMillis());
            if (a.f132188d.compareAndSet(false, true)) {
                SimpleDateFormat simpleDateFormat = a.f132187c;
                Calendar instance = Calendar.getInstance();
                C89219l.m154716b(instance, "");
                String format = simpleDateFormat.format(instance.getTime());
                C89219l.m154716b(format, "");
                C57989a.C57990a.m104807a(format);
            }
            C57993b.m104808a(d.f132174b, d.f132176d, new IntentFilter("android.intent.action.TIME_TICK"));
            KidsWellbeingSetting kidsWellbeingSetting = d.f132173a;
            if (kidsWellbeingSetting != null && (playtimeReminder = kidsWellbeingSetting.getPlaytimeReminder()) != null) {
                d.mo95317a(playtimeReminder);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.setting.api.IKidsWellbeingService
    /* renamed from: a */
    public final void mo95132a(KidsWellbeingSetting kidsWellbeingSetting) {
        C57993b d;
        if (kidsWellbeingSetting != null && (d = m104801d()) != null) {
            C89219l.m154721d(kidsWellbeingSetting, "");
            if (!(!C89219l.m154714a(d.f132173a, kidsWellbeingSetting))) {
                C57998c a = d.mo95316a();
                String string = C57989a.C57990a.m104805a().getString("last_update_date", "");
                C89219l.m154716b(string, "");
                SimpleDateFormat simpleDateFormat = a.f132187c;
                Calendar instance = Calendar.getInstance();
                C89219l.m154716b(instance, "");
                String format = simpleDateFormat.format(instance.getTime());
                if (C89219l.m154714a((Object) string, (Object) format)) {
                    a.f132185a = 0;
                    return;
                }
                C89219l.m154716b(format, "");
                C57989a.C57990a.m104807a(format);
                C57989a.C57990a.m104806a(0);
                a.f132185a = 0;
            }
            d.f132173a = kidsWellbeingSetting;
            if (d.f132175c) {
                d.mo95318b();
                List<KidsVideoPlaytimeReminder> playtimeReminder = kidsWellbeingSetting.getPlaytimeReminder();
                if (playtimeReminder != null) {
                    d.mo95317a(playtimeReminder);
                }
            }
        }
    }
}
