package com.p2082ss.android.ugc.aweme.inferenceengine;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.google.gson.p2020c.C27897a;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.p2160ml.AbstractC30079f;
import com.p2082ss.android.p2160ml.C30074c;
import com.p2082ss.android.p2160ml.C30076d;
import com.p2082ss.android.p2160ml.C30082i;
import com.p2082ss.android.p2160ml.C30083j;
import com.p2082ss.android.p2160ml.C30088k;
import com.p2082ss.android.p2160ml.C30120t;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.p3452ml.api.MLDataCenterService;
import com.p2082ss.android.ugc.aweme.p3452ml.p3453a.C59978d;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.ugc.aweme.inferenceengine.InferenceEngineServiceImpl */
public class InferenceEngineServiceImpl implements IInferenceEngineService {

    /* renamed from: a */
    private static C30074c.AbstractC30075a f129025a = new C30074c.AbstractC30075a() {
        /* class com.p2082ss.android.ugc.aweme.inferenceengine.InferenceEngineServiceImpl.C565941 */

        static {
            Covode.recordClassIndex(66420);
        }

        @Override // com.p2082ss.android.p2160ml.C30074c.AbstractC30075a
        /* renamed from: a */
        public final AbstractC30079f mo53444a() {
            return new C56598a();
        }
    };

    static {
        Covode.recordClassIndex(66419);
    }

    @Override // com.p2082ss.android.ugc.aweme.inferenceengine.IInferenceEngineService
    /* renamed from: a */
    public final void mo93512a(Context context) {
        if (C56601d.f129032a) {
            System.currentTimeMillis();
        }
        C30120t.f71860a = C56601d.f129032a;
        C30074c.AbstractC30075a aVar = f129025a;
        C30074c.f71780a = true;
        C30074c.f71781b = aVar;
        if (C58016d.f132222c == null || !C58016d.f132224e) {
            C58016d.f132222c = context.getFilesDir();
        }
        String absolutePath = C58016d.f132222c.getAbsolutePath();
        C30083j.C30084a aVar2 = new C30083j.C30084a();
        aVar2.f71796a = absolutePath;
        aVar2.f71797b = C56599b.f129030a;
        aVar2.f71798c = new C30083j.AbstractC30085b() {
            /* class com.p2082ss.android.ugc.aweme.inferenceengine.InferenceEngineServiceImpl.C565963 */

            static {
                Covode.recordClassIndex(66422);
            }

            @Override // com.p2082ss.android.p2160ml.C30083j.AbstractC30085b
            /* renamed from: a */
            public final <T> T mo53450a(String str, Type type) {
                return (T) new C27910f().mo46666a(new C27897a(new StringReader(str)), type);
            }
        };
        aVar2.f71799d = C56600c.f129031a;
        aVar2.f71800e = new C30083j.AbstractC30086c() {
            /* class com.p2082ss.android.ugc.aweme.inferenceengine.InferenceEngineServiceImpl.C565952 */

            static {
                Covode.recordClassIndex(66421);
            }

            @Override // com.p2082ss.android.p2160ml.C30083j.AbstractC30086c
            /* renamed from: a */
            public final ExecutorService mo53451a() {
                return C59978d.C59979a.f136576a;
            }
        };
        aVar2.f71801f = new C56601d();
        C30083j jVar = new C30083j(aVar2);
        if (C30120t.f71860a) {
            new Throwable("not crash, only for debug!!");
        }
        C30082i a = C30082i.m60841a();
        if (!C30082i.f71785a) {
            C30082i.f71785a = true;
            a.f71787b = jVar;
        }
        C30076d.f71784a = MLDataCenterService.instance().getFeatureStaticGetter();
        C30088k.f71804a = new C30088k.AbstractC30089a() {
            /* class com.p2082ss.android.ugc.aweme.inferenceengine.InferenceEngineServiceImpl.C565974 */

            static {
                Covode.recordClassIndex(66423);
            }

            @Override // com.p2082ss.android.p2160ml.C30088k.AbstractC30089a
            /* renamed from: a */
            public final void mo53453a(String str, String str2, Throwable th) {
                if (th == null) {
                    C51423a.m95792b(str, str2);
                } else {
                    C51423a.m95792b(str, str2 + " erMsg:" + th.getMessage());
                }
            }
        };
        if (C56601d.f129032a) {
            System.currentTimeMillis();
        }
    }

    /* renamed from: a */
    static final /* synthetic */ boolean m102562a(String str, String str2, String str3) {
        try {
            return NetworkUtils.downloadFile(-1, str, str2, null, str3, null, null, null, null, null, null);
        } catch (Exception unused) {
            return false;
        }
    }
}
