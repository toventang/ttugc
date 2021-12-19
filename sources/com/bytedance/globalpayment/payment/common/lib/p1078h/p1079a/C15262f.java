package com.bytedance.globalpayment.payment.common.lib.p1078h.p1079a;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.AbstractC13621j;
import com.bytedance.common.utility.C13585b;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15236b;
import com.bytedance.globalpayment.payment.common.lib.p1072b.C15240a;
import com.bytedance.globalpayment.payment.common.lib.p1074d.EnumC15247a;
import com.bytedance.globalpayment.payment.common.lib.p1078h.C15253a;
import com.bytedance.globalpayment.payment.common.lib.p1078h.p1080b.AbstractC15274f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.globalpayment.payment.common.lib.h.a.f */
public final class C15262f implements AbstractC15274f {
    static {
        Covode.recordClassIndex(17462);
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.p1078h.p1080b.AbstractC15274f
    /* renamed from: a */
    public final String mo24727a() {
        String str = C15253a.m28071a().mo24709i().mo24714c().f37180l;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        C15240a c = C15253a.m28071a().mo24709i().mo24714c();
        if (c.f37177i) {
            boolean z = c.f37176h;
            return "";
        } else if (c.f37174f == EnumC15247a.SG) {
            if (c.f37176h) {
                return "";
            }
            return "https://f-p.sgsnssdk.com";
        } else if (c.f37174f != EnumC15247a.VA || c.f37176h) {
            return "";
        } else {
            return "https://f-p-va.isnssdk.com";
        }
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.p1078h.p1080b.AbstractC15274f
    /* renamed from: a */
    public final void mo24728a(final String str, final AbstractC15236b bVar) {
        C15253a.m28071a().mo24703c().mo24721b().execute(new Runnable() {
            /* class com.bytedance.globalpayment.payment.common.lib.p1078h.p1079a.C15262f.RunnableC152631 */

            static {
                Covode.recordClassIndex(17463);
            }

            public final void run() {
                try {
                    bVar.mo24354a(AbstractC13621j.f33100a.mo21870a(str, C15253a.m28071a().mo24709i().mo24714c().f37183o));
                } catch (Throwable th) {
                    int i = -100;
                    if (th instanceof C13585b) {
                        i = th.getResponseCode();
                    }
                    bVar.mo24353a(new AbsResult().withErrorCode(1).withDetailCode(i).withMessage(th.getMessage()));
                }
            }
        });
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.p1078h.p1080b.AbstractC15274f
    /* renamed from: a */
    public final void mo24729a(final String str, final Map<String, String> map, final AbstractC15236b bVar) {
        C15253a.m28071a().mo24703c().mo24721b().execute(new Runnable() {
            /* class com.bytedance.globalpayment.payment.common.lib.p1078h.p1079a.C15262f.RunnableC152642 */

            static {
                Covode.recordClassIndex(17464);
            }

            public final void run() {
                ArrayList arrayList = new ArrayList();
                Map map = map;
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        arrayList.add(new Pair(entry.getKey(), entry.getValue()));
                    }
                }
                try {
                    bVar.mo24354a(AbstractC13621j.f33100a.mo21869a(str, arrayList, C15253a.m28071a().mo24709i().mo24714c().f37183o));
                } catch (Throwable th) {
                    int i = -100;
                    if (th instanceof C13585b) {
                        i = th.getResponseCode();
                    }
                    bVar.mo24353a(new AbsResult().withErrorCode(1).withDetailCode(i).withMessage(th.getMessage()));
                }
            }
        });
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.p1078h.p1080b.AbstractC15274f
    /* renamed from: a */
    public final void mo24730a(final String str, final byte[] bArr, final Map<String, String> map, final AbstractC13621j.C13622a aVar, final AbstractC15236b bVar) {
        C15253a.m28071a().mo24703c().mo24721b().execute(new Runnable() {
            /* class com.bytedance.globalpayment.payment.common.lib.p1078h.p1079a.C15262f.RunnableC152653 */

            static {
                Covode.recordClassIndex(17465);
            }

            public final void run() {
                try {
                    HashMap hashMap = new HashMap();
                    Map map = map;
                    if (map != null) {
                        hashMap.putAll(map);
                    }
                    C15240a c = C15253a.m28071a().mo24709i().mo24714c();
                    if (c.f37183o != null) {
                        hashMap.putAll(c.f37183o);
                    }
                    bVar.mo24354a(AbstractC13621j.f33100a.mo21871a(str, bArr, hashMap));
                } catch (Throwable th) {
                    int i = -100;
                    if (th instanceof C13585b) {
                        i = th.getResponseCode();
                    }
                    bVar.mo24353a(new AbsResult().withErrorCode(1).withDetailCode(i).withMessage(th.getMessage()));
                }
            }
        });
    }
}
