package com.bytedance.sdk.bridge;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sdk.bridge.p1693a.C22687a;
import com.bytedance.sdk.bridge.p1694b.C22694a;
import com.bytedance.sdk.bridge.p1694b.C22698c;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

public final class BridgeLifeCycleObserver implements AbstractC33974au {

    /* renamed from: a */
    private final Object f53590a;

    /* renamed from: b */
    private final AbstractC1196i f53591b;

    static {
        Covode.recordClassIndex(26504);
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_ANY)
    public final void onAny() {
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_START)
    public final void onStart() {
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        onAny();
        if (aVar == AbstractC1196i.EnumC1198a.ON_START) {
            onStart();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onResume();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
            onPause();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_STOP) {
            onStop();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestory$bridge_release();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_STOP)
    public final void onStop() {
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public final void onPause() {
        Object obj = this.f53590a;
        AbstractC1196i iVar = this.f53591b;
        C89219l.m154719c(obj, "");
        C22704g.m42795a(C22703f.f53635a, " disableBridgeMethods " + obj.getClass().getSimpleName());
        C22705h a = C22687a.m42781a(obj.getClass());
        if (a != null) {
            for (C22701d dVar : a.mo36990a()) {
                C89219l.m154709a((Object) dVar, "");
                String str = dVar.f53626b;
                C22694a a2 = C22703f.m42794a(C22703f.f53636b.get(str), iVar);
                if (a2 != null) {
                    a2.f53609c = false;
                }
                C22704g.m42795a(C22703f.f53635a, " disable  " + str + '\n');
            }
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public final void onResume() {
        Object obj = this.f53590a;
        AbstractC1196i iVar = this.f53591b;
        C89219l.m154719c(obj, "");
        C22704g.m42795a(C22703f.f53635a, " enableBridgeMethods " + obj.getClass().getSimpleName());
        C22705h a = C22687a.m42781a(obj.getClass());
        if (a != null) {
            for (C22701d dVar : a.mo36990a()) {
                C89219l.m154709a((Object) dVar, "");
                String str = dVar.f53626b;
                C22694a a2 = C22703f.m42794a(C22703f.f53636b.get(str), iVar);
                if (a2 != null) {
                    a2.f53609c = true;
                }
                C22704g.m42795a(C22703f.f53635a, " enable  " + str + '\n');
            }
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestory$bridge_release() {
        MethodCollector.m26663i(4122);
        Object obj = this.f53590a;
        AbstractC1196i iVar = this.f53591b;
        C89219l.m154719c(obj, "");
        C89219l.m154719c(iVar, "");
        C22705h a = C22687a.m42781a(obj.getClass());
        if (a != null) {
            for (C22701d dVar : a.mo36990a()) {
                C89219l.m154709a((Object) dVar, "");
                String str = dVar.f53626b;
                List<C22694a> list = C22703f.f53636b.get(str);
                C22694a a2 = C22703f.m42794a(list, iVar);
                if (!(list == null || a2 == null)) {
                    list.remove(a2);
                    C22704g.m42795a(C22703f.f53635a, "unregister  " + iVar + " -- " + str);
                }
            }
        }
        synchronized (C22703f.f53637c) {
            try {
                Iterator<C22698c> it = C22703f.f53637c.iterator();
                C89219l.m154709a((Object) it, "");
                while (it.hasNext()) {
                    C22698c next = it.next();
                    if (C89219l.m154714a(obj, next.f53617a)) {
                        C22703f.f53637c.remove(next);
                    }
                }
            } finally {
                MethodCollector.m26664o(4122);
            }
        }
    }
}
