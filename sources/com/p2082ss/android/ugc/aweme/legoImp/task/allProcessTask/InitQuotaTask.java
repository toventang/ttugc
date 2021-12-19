package com.p2082ss.android.ugc.aweme.legoImp.task.allProcessTask;

import android.content.Context;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.C14581a;
import com.bytedance.frameworks.baselib.network.http.cronet.C14642a;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient;
import com.bytedance.frameworks.baselib.network.http.cronet.p986b.C14659h;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.logger.C58949c;
import com.p2082ss.android.ugc.p4315i.C84120a;
import com.p2082ss.android.ugc.p4315i.p4316a.AbstractC84121a;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.allProcessTask.InitQuotaTask */
public final class InitQuotaTask implements AbstractC58264w {
    static {
        Covode.recordClassIndex(68673);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1048575;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58265x.m105221a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "task_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.MAIN;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        C58949c.f134189c = 0;
        C84120a a = C84120a.m144656a();
        C58426a aVar = new C58426a();
        if (a.f187727b.get()) {
            a.f187726a = aVar;
            a.f187727b.compareAndSet(true, false);
        }
        C84120a.m144656a().mo128938a(C58949c.f134189c);
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.allProcessTask.InitQuotaTask$a */
    public static final class C58426a implements AbstractC84121a {
        static {
            Covode.recordClassIndex(68674);
        }

        @Override // com.p2082ss.android.ugc.p4315i.p4316a.AbstractC84121a
        /* renamed from: a */
        public final void mo95786a(int i) {
            C14642a.EnumC14643a aVar;
            int i2;
            if (i == 0) {
                aVar = C14642a.EnumC14643a.ColdStart;
            } else if (i == 1) {
                aVar = C14642a.EnumC14643a.WarmStart;
            } else if (i != 2) {
                aVar = C14642a.EnumC14643a.NormalStart;
            } else {
                aVar = C14642a.EnumC14643a.HotStart;
            }
            try {
                C14642a.f35463a = aVar;
                int value = aVar.getValue();
                C14581a.f35252c.set(System.currentTimeMillis() / 1000);
                if (value == 0) {
                    C14581a.f35250a = C14581a.EnumC14583a.ColdStart;
                } else if (value == 1) {
                    C14581a.f35250a = C14581a.EnumC14583a.HotStart;
                } else if (value != 2) {
                    C14581a.f35250a = C14581a.EnumC14583a.NormalStart;
                } else {
                    C14581a.f35250a = C14581a.EnumC14583a.WarmStart;
                }
                ICronetClient iCronetClient = C14659h.f35584c;
                if (iCronetClient != null && (i2 = aVar.f35467a) >= 0 && i2 <= 2) {
                    Reflect.m24529on(iCronetClient).call("setAppStartUpState", new Class[]{Integer.TYPE}, Integer.valueOf(i2)).get();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
