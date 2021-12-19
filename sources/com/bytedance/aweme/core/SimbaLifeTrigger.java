package com.bytedance.aweme.core;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.aweme.p799a.AbstractC12893a;
import com.bytedance.aweme.p800b.p801a.EnumC12898a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.p4611f.p4613b.C89219l;

public final class SimbaLifeTrigger implements AbstractC33974au {

    /* renamed from: a */
    public final List<Long> f31393a = new ArrayList();

    static {
        Covode.recordClassIndex(14732);
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_CREATE)
    public final void onCreate() {
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public final void onPause() {
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public final void onResume() {
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_START)
    public final void onStart() {
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_CREATE) {
            onCreate();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_START) {
            onStart();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onResume();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
            onPause();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_STOP) {
            onStop();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_STOP)
    public final void onStop() {
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        Collection<ArrayList<AbstractC12893a>> values;
        MethodCollector.m26663i(1008);
        List<Long> list = this.f31393a;
        C89219l.m154719c(list, "");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ConcurrentHashMap<EnumC12898a, ArrayList<AbstractC12893a>> concurrentHashMap = C12899a.f31398e.get(Long.valueOf(it.next().longValue()));
            if (!(concurrentHashMap == null || (values = concurrentHashMap.values()) == null)) {
                for (T<AbstractC12893a> t : values) {
                    C89219l.m154709a((Object) t, "");
                    synchronized (t) {
                        try {
                            ArrayList arrayList = new ArrayList();
                            for (AbstractC12893a aVar : t) {
                                if (aVar.mo20720a() == EnumC12898a.ATFIRST) {
                                    C12899a.f31399f.remove(aVar);
                                }
                                arrayList.add(aVar);
                            }
                            t.removeAll(arrayList);
                        } catch (Throwable th) {
                            MethodCollector.m26664o(1008);
                            throw th;
                        }
                    }
                }
            }
        }
        MethodCollector.m26664o(1008);
    }
}
