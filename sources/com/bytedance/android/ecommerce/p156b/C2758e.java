package com.bytedance.android.ecommerce.p156b;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.android.ecommerce.p153a.p155b.C2740b;
import com.bytedance.android.ecommerce.p157c.AbstractC2769d;
import com.bytedance.android.ecommerce.p159e.C2778c;
import com.bytedance.android.ecommerce.p162h.C2799a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.EnumC18483e;
import java.util.HashMap;

/* renamed from: com.bytedance.android.ecommerce.b.e */
public class C2758e extends AbstractC2753a {

    /* renamed from: a */
    public int f8303a = 10001;

    static {
        Covode.recordClassIndex(3184);
    }

    @Override // com.bytedance.android.ecommerce.p156b.AbstractC2753a
    /* renamed from: a */
    public final String mo7339a() {
        return "pipo.getInfoByOcr";
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: c */
    public final AbstractC18400b.EnumC18401a mo7346c() {
        return AbstractC18400b.EnumC18401a.PUBLIC;
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18400b, com.bytedance.android.ecommerce.p156b.AbstractC2753a
    /* renamed from: a */
    public final void mo7340a(AbstractC18754n nVar, final AbstractC18400b.AbstractC18402b bVar, EnumC18483e eVar) {
        super.mo7340a(nVar, bVar, eVar);
        String a = C2799a.m8033a(nVar, "merchant_user_id");
        String a2 = C2799a.m8033a(nVar, "nonce");
        String a3 = C2799a.m8033a(nVar, "merchant_id");
        if (TextUtils.isEmpty(a3)) {
            C2799a.m8034a(0, 101, "merchantId is empty!", bVar);
        } else if (TextUtils.isEmpty(a)) {
            C2799a.m8034a(0, 101, "merchantUserId is empty!", bVar);
        } else if (TextUtils.isEmpty(a2)) {
            C2799a.m8034a(0, 101, "nonce is empty!", bVar);
        } else {
            C2778c.f8362a.mo7372d().f8331q = a2;
            final Handler handler = new Handler(Looper.myLooper(), new Handler.Callback() {
                /* class com.bytedance.android.ecommerce.p156b.C2758e.C27591 */

                static {
                    Covode.recordClassIndex(3185);
                }

                public final boolean handleMessage(Message message) {
                    if (message.what == C2758e.this.f8303a) {
                        try {
                            Bundle data = message.getData();
                            int i = data.getInt("code");
                            int i2 = data.getInt("detailCode");
                            String string = data.getString("msg");
                            C2740b bVar = (C2740b) message.obj;
                            if (bVar == null) {
                                i2 = 108;
                                i = 0;
                            } else if (i == 1) {
                                byte[] a = bVar.mo7323a();
                                HashMap hashMap = new HashMap();
                                hashMap.put("number_corners", a);
                                hashMap.put("number", bVar.f8198h);
                                AbstractC18400b.AbstractC18402b bVar2 = bVar;
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("code", Integer.valueOf(i));
                                hashMap2.put("detail_code", Integer.valueOf(i2));
                                hashMap2.put("message", string);
                                hashMap2.put("data", hashMap);
                                bVar2.mo13405a(hashMap2);
                                return false;
                            }
                            C2799a.m8034a(i, i2, string, bVar);
                        } catch (Throwable unused) {
                        }
                    }
                    return false;
                }
            });
            Thread.currentThread();
            C2778c.f8362a.mo7379k().mo7395a(a3, a, a2, new AbstractC2769d() {
                /* class com.bytedance.android.ecommerce.p156b.C2758e.C27602 */

                static {
                    Covode.recordClassIndex(3186);
                }

                @Override // com.bytedance.android.ecommerce.p157c.AbstractC2769d
                /* renamed from: a */
                public final void mo7348a(int i, int i2, String str, C2740b bVar) {
                    Message message = new Message();
                    message.what = C2758e.this.f8303a;
                    Bundle bundle = new Bundle();
                    bundle.putInt("code", i);
                    bundle.putInt("detailCode", i2);
                    bundle.putString("msg", str);
                    message.setData(bundle);
                    message.obj = bVar;
                    handler.sendMessage(message);
                }
            });
        }
    }
}
