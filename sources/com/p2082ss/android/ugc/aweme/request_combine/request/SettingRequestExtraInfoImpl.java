package com.p2082ss.android.ugc.aweme.request_combine.request;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.requestcombine.AbstractC67177b;
import com.p2082ss.android.ugc.aweme.requestcombine.ISettingRequestExtraInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.C89391z;

/* renamed from: com.ss.android.ugc.aweme.request_combine.request.SettingRequestExtraInfoImpl */
public final class SettingRequestExtraInfoImpl implements ISettingRequestExtraInfo {

    /* renamed from: a */
    public List<AbstractC67177b> f150540a = new ArrayList();

    static {
        Covode.recordClassIndex(78729);
    }

    /* renamed from: com.ss.android.ugc.aweme.request_combine.request.SettingRequestExtraInfoImpl$a */
    static final class CallableC67127a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ Map f150541a;

        /* renamed from: b */
        final /* synthetic */ SettingRequestExtraInfoImpl f150542b;

        static {
            Covode.recordClassIndex(78730);
        }

        CallableC67127a(Map map, SettingRequestExtraInfoImpl settingRequestExtraInfoImpl) {
            this.f150541a = map;
            this.f150542b = settingRequestExtraInfoImpl;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            Iterator<T> it = this.f150542b.f150540a.iterator();
            while (it.hasNext()) {
                it.next().mo95778a(this.f150541a);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static ISettingRequestExtraInfo m118789a() {
        MethodCollector.m26663i(777);
        Object a = C81908b.m141854a(ISettingRequestExtraInfo.class, false);
        if (a != null) {
            ISettingRequestExtraInfo iSettingRequestExtraInfo = (ISettingRequestExtraInfo) a;
            MethodCollector.m26664o(777);
            return iSettingRequestExtraInfo;
        }
        if (C81908b.f183335df == null) {
            synchronized (ISettingRequestExtraInfo.class) {
                try {
                    if (C81908b.f183335df == null) {
                        C81908b.f183335df = new SettingRequestExtraInfoImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(777);
                    throw th;
                }
            }
        }
        SettingRequestExtraInfoImpl settingRequestExtraInfoImpl = (SettingRequestExtraInfoImpl) C81908b.f183335df;
        MethodCollector.m26664o(777);
        return settingRequestExtraInfoImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.requestcombine.ISettingRequestExtraInfo
    /* renamed from: a */
    public final void mo106071a(AbstractC67177b bVar) {
        if (!this.f150540a.contains(bVar)) {
            this.f150540a.add(bVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.requestcombine.ISettingRequestExtraInfo
    /* renamed from: a */
    public final void mo106072a(Map<String, String> map) {
        C1731i.m5640b(new CallableC67127a(map, this), C1731i.f5562a);
    }
}
