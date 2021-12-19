package com.bytedance.p1399im.core.internal.p1427b.p1428a;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1399im.core.internal.p1431d.AbstractC19977j;
import com.bytedance.p1399im.core.internal.p1431d.C19967c;
import com.bytedance.p1399im.core.internal.p1431d.C19978k;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1404a.C19489e;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19478a;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19480c;
import com.bytedance.p1399im.core.p1407c.C19510e;
import com.bytedance.p1399im.core.p1408d.C19672u;
import com.bytedance.p1399im.core.proto.AuthType;
import com.bytedance.p1399im.core.proto.IMCMD;
import com.bytedance.p1399im.core.proto.Refer;
import com.bytedance.p1399im.core.proto.Request;
import com.bytedance.p1399im.core.proto.RequestBody;
import com.bytedance.p1399im.core.proto.SendMessageRequestBody;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* renamed from: com.bytedance.im.core.internal.b.a.w */
public abstract class AbstractC19927w<T> {

    /* renamed from: a */
    private AbstractC19479b<T> f47375a;

    /* renamed from: p */
    protected int f47376p;

    static {
        Covode.recordClassIndex(22771);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo31129a(C19978k kVar, Runnable runnable);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo31644a() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo31130a(C19978k kVar);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo31759b() {
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo31754d(C19978k kVar) {
    }

    /* renamed from: com.bytedance.im.core.internal.b.a.w$a */
    public static class C19929a {

        /* renamed from: a */
        private static C19929a f47379a;

        /* renamed from: b */
        private long f47380b;

        static {
            Covode.recordClassIndex(22773);
        }

        private C19929a() {
            if (this.f47380b == 0) {
                this.f47380b = (long) new Random().nextInt(1000000);
            }
        }

        /* renamed from: b */
        public final synchronized long mo31806b() {
            long j;
            MethodCollector.m26663i(9714);
            if (this.f47380b <= 0) {
                this.f47380b = 1;
            }
            j = this.f47380b;
            this.f47380b = 1 + j;
            MethodCollector.m26664o(9714);
            return j;
        }

        /* renamed from: a */
        public static C19929a m37534a() {
            MethodCollector.m26663i(9713);
            if (f47379a == null) {
                synchronized (C19929a.class) {
                    try {
                        if (f47379a == null) {
                            f47379a = new C19929a();
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(9713);
                        throw th;
                    }
                }
            }
            C19929a aVar = f47379a;
            MethodCollector.m26664o(9713);
            return aVar;
        }
    }

    public AbstractC19927w(int i) {
        this.f47376p = i;
    }

    /* renamed from: a */
    public final void mo31799a(C19672u uVar) {
        AbstractC19479b<T> bVar = this.f47375a;
        if (bVar != null) {
            bVar.mo27860a(uVar);
        }
    }

    /* renamed from: b */
    public final void mo31803b(C19978k kVar) {
        mo31799a(C19672u.m36756a(kVar));
    }

    /* renamed from: a */
    public final void mo31800a(T t) {
        AbstractC19479b<T> bVar = this.f47375a;
        if (bVar != null) {
            bVar.mo27861a((Object) t);
        }
    }

    /* renamed from: c */
    public final void mo31804c(final C19978k kVar) {
        SendMessageRequestBody sendMessageRequestBody;
        if (!kVar.mo31869l()) {
            if (kVar.f47485i == C19489e.AbstractC19491b.f46185b || kVar.f47485i == C19489e.AbstractC19491b.f46186c) {
                C19483d.m36365a().f46157b.mo27955a(kVar.f47485i);
            } else if (kVar.f47485i == C19489e.AbstractC19491b.f46187d && this.f47376p == IMCMD.SEND_MESSAGE.getValue() && kVar.f47481e.body != null && (sendMessageRequestBody = kVar.f47481e.body.send_message_body) != null) {
                C19930x.m37536a();
                C19930x.m37541a(sendMessageRequestBody.conversation_id);
            }
        }
        mo31129a(kVar, new Runnable() {
            /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w.RunnableC199281 */

            static {
                Covode.recordClassIndex(22772);
            }

            public final void run() {
                if (kVar.f47479c != null && kVar.mo31869l()) {
                    AbstractC19927w.this.mo31130a(kVar);
                }
            }
        });
    }

    public AbstractC19927w(int i, AbstractC19479b<T> bVar) {
        this.f47376p = i;
        if (bVar != null) {
            this.f47375a = bVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo31802a(T t, C19978k kVar) {
        AbstractC19479b<T> bVar = this.f47375a;
        if (bVar != null) {
            try {
                if (!(bVar instanceof AbstractC19480c) || kVar == null) {
                    bVar.mo27861a((Object) t);
                } else {
                    ((AbstractC19480c) bVar).mo31136a(t, C19672u.m36756a(kVar));
                }
            } catch (Exception e) {
                e.printStackTrace();
                C19510e.m36439a(e);
            }
        }
    }

    /* renamed from: a */
    public final void mo31801a(T t, long j, boolean z) {
        AbstractC19479b<T> bVar = this.f47375a;
        if (bVar == null) {
            return;
        }
        if (bVar instanceof AbstractC19478a) {
            ((AbstractC19478a) bVar).mo31135a(t, j, z);
        } else {
            bVar.mo27861a((Object) t);
        }
    }

    /* renamed from: a */
    public final long mo31798a(int i, RequestBody requestBody, AbstractC19977j jVar, Object... objArr) {
        int i2 = this.f47376p;
        Map<String, String> k = C19483d.m36365a().f46157b.mo27970k();
        if (k == null) {
            k = new HashMap<>();
        }
        if (C19483d.m36365a().mo31141b().f46197F) {
            k.put("expected_user_id", String.valueOf(C19483d.m36365a().f46157b.mo27953a()));
        }
        Request build = new Request.Builder().sequence_id(Long.valueOf(C19929a.m37534a().mo31806b())).sdk_version("5.1.3.8-rc.2.6-bugfix").token(C19483d.m36365a().f46157b.mo27963d()).refer(Refer.ANDROID).device_id(C19483d.m36365a().f46157b.mo27965f()).inbox_type(Integer.valueOf(i)).build_number("1").channel(C19483d.m36365a().mo31141b().f46266f).device_platform("android").device_type(Build.MODEL).os_version(Build.VERSION.RELEASE).version_code(String.valueOf(C19483d.m36365a().mo31141b().f46265e)).cmd(Integer.valueOf(i2)).body(requestBody).headers(k).auth_type(AuthType.fromValue(C19483d.m36365a().mo31141b().f46238ac)).build();
        C19978k kVar = new C19978k(build.sequence_id.longValue(), this);
        mo31754d(kVar);
        kVar.f47481e = build;
        kVar.f47480d = objArr;
        kVar.f47478b = mo31644a();
        kVar.f47491o = mo31759b();
        kVar.f47492p = -1;
        kVar.f47479c = jVar;
        C19967c.m37645a().mo31850a(kVar);
        return kVar.f47477a;
    }
}
