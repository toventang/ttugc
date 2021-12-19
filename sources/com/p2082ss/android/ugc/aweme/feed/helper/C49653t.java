package com.p2082ss.android.ugc.aweme.feed.helper;

import android.text.TextUtils;
import androidx.p025c.C0490e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.deviceregister.DeviceRegisterManager;
import com.p2082ss.android.ugc.aweme.app.p2322c.C33721c;
import com.p2082ss.android.ugc.aweme.experiment.C46796cm;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import java.util.ArrayList;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.helper.t */
public final class C49653t {

    /* renamed from: a */
    public static final C49653t f114288a = new C49653t();

    /* renamed from: b */
    private static C0490e<String, C49648o> f114289b = new C0490e<>(C16048b.m29633a().mo25412a(true, "real_time_report_max_nums", 10));

    /* renamed from: c */
    private static final AbstractC89244h f114290c = C89250i.m154773a((AbstractC89171a) C49655b.f114292a);

    private C49653t() {
    }

    /* renamed from: a */
    public static final boolean m93097a() {
        if (C16048b.m29633a().mo25412a(false, "real_time_report_of_new_user", 0) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.helper.t$b */
    static final class C49655b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C49655b f114292a = new C49655b();

        static {
            Covode.recordClassIndex(58502);
        }

        C49655b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            String deviceId = DeviceRegisterManager.getDeviceId();
            boolean z = true;
            if (!TextUtils.isEmpty(deviceId) && !TextUtils.equals(deviceId, "0") && C16048b.m29633a().mo25412a(false, "real_time_report_of_new_user", 0) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(58500);
    }

    /* renamed from: c */
    private static boolean m93099c() {
        if (C46796cm.f109016a) {
            return ((Boolean) f114290c.getValue()).booleanValue();
        }
        String deviceId = DeviceRegisterManager.getDeviceId();
        if (TextUtils.isEmpty(deviceId) || TextUtils.equals(deviceId, "0") || C16048b.m29633a().mo25412a(false, "real_time_report_of_new_user", 0) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final String m93098b() {
        C89378p a;
        if (f114289b.mo2095b() == 0) {
            return null;
        }
        Map<String, C49648o> c = f114289b.mo2098c();
        C89219l.m154716b(c, "");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, C49648o> entry : c.entrySet()) {
            int a2 = C33721c.m69041a(entry.getValue().f114278e);
            if (!(a2 == -1 || (a = C89387v.m154943a(Integer.valueOf(a2), entry.getValue())) == null)) {
                arrayList.add(a);
            }
        }
        return C89070n.m154551a(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C49654a.f114291a, 30);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.helper.t$a */
    public static final class C49654a extends AbstractC89220m implements AbstractC89172b<C89378p<? extends Integer, ? extends C49648o>, CharSequence> {

        /* renamed from: a */
        public static final C49654a f114291a = new C49654a();

        static {
            Covode.recordClassIndex(58501);
        }

        C49654a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CharSequence invoke(C89378p<? extends Integer, ? extends C49648o> pVar) {
            return m93100a(pVar);
        }

        /* renamed from: a */
        private static CharSequence m93100a(C89378p<Integer, C49648o> pVar) {
            C89219l.m154721d(pVar, "");
            try {
                C49648o second = pVar.getSecond();
                return second.f114275b + '|' + second.f114276c + '|' + ((int) (second.f114277d / 1000)) + '|' + pVar.getFirst().intValue() + '|' + second.f114274a;
            } catch (Exception e) {
                C51423a.m95786a(e);
                return "";
            }
        }
    }

    /* renamed from: a */
    public static final void m93096a(C49648o oVar) {
        C89219l.m154721d(oVar, "");
        if (m93099c()) {
            f114289b.mo2092a(oVar.f114275b + oVar.f114276c, oVar);
        }
    }
}
