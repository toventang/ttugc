package com.p2082ss.android.ugc.aweme.setting;

import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.C27910f;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.base.api.AbstractC34479a;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import com.p2082ss.android.ugc.aweme.setting.model.C68188p;
import com.p2082ss.android.ugc.aweme.share.C68863ah;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.setting.ch */
public class C68056ch implements WeakHandler.IHandler {

    /* renamed from: d */
    private static C68056ch f152442d;

    /* renamed from: a */
    protected ShareSettingApi f152443a = ((ShareSettingApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(C29736b.f70924e).create(ShareSettingApi.class));

    /* renamed from: b */
    protected WeakHandler f152444b = new WeakHandler(Looper.getMainLooper(), this);

    /* renamed from: c */
    public C68188p f152445c;

    static {
        Covode.recordClassIndex(80252);
    }

    /* renamed from: b */
    public final void mo108675b() {
        C34608n.m70658a().mo61083a(this.f152444b, new Callable() {
            /* class com.p2082ss.android.ugc.aweme.setting.C68056ch.CallableC680571 */

            static {
                Covode.recordClassIndex(80253);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                try {
                    return C68056ch.this.f152443a.queryRawSetting().get();
                } catch (ExecutionException e) {
                    throw AbstractC34479a.getCompatibleException(e);
                }
            }
        }, 0);
    }

    /* renamed from: c */
    public final C1731i<Boolean> mo108676c() {
        return C1731i.m5640b(new Callable<Boolean>() {
            /* class com.p2082ss.android.ugc.aweme.setting.C68056ch.CallableC680582 */

            static {
                Covode.recordClassIndex(80254);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public Boolean call() {
                String string = C68060ci.f152450a.getString("share_setting_key", "");
                if (TextUtils.isEmpty(string)) {
                    return false;
                }
                try {
                    C68188p pVar = (C68188p) new C27910f().mo46670a(string, C68188p.class);
                    AbstractC68023bi a = C68863ah.f154028b.mo109355a();
                    a.mo108646a(pVar.f152672a);
                    a.mo108647b(pVar.f152674c);
                    a.mo108648c(pVar.f152675d);
                    a.mo108649d(pVar.f152676e);
                    C68056ch.this.f152445c = pVar;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return true;
            }
        }, C1731i.f5562a);
    }

    protected C68056ch() {
        mo108676c();
    }

    /* renamed from: a */
    public static C68056ch m120361a() {
        MethodCollector.m26663i(9930);
        if (f152442d == null) {
            synchronized (C68056ch.class) {
                try {
                    if (f152442d == null) {
                        f152442d = new C68056ch();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9930);
                    throw th;
                }
            }
        }
        C68056ch chVar = f152442d;
        MethodCollector.m26664o(9930);
        return chVar;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        mo108674a(message.obj);
    }

    /* renamed from: a */
    private void m120362a(final C68188p pVar) {
        if (pVar != null) {
            C13603b.m24435a((Collection) pVar.f152672a);
            C29339a.m58752a(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.setting.C68056ch.RunnableC680593 */

                static {
                    Covode.recordClassIndex(80255);
                }

                public final void run() {
                    String b = new C27910f().mo46674b(pVar);
                    C68060ci.f152450a.edit().putString("share_setting_key", b).commit();
                    C68060ci.f152450a.edit().putBoolean("key_has_setting", !TextUtils.isEmpty(b)).commit();
                    C68056ch.this.mo108676c();
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo108674a(Object obj) {
        if (obj instanceof Exception) {
            Exception exc = (Exception) obj;
            exc.printStackTrace();
            mo108676c();
            exc.getMessage();
        } else if (obj instanceof C68188p) {
            m120362a((C68188p) obj);
        }
    }
}
