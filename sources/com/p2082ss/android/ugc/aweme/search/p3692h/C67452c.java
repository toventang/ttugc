package com.p2082ss.android.ugc.aweme.search.p3692h;

import android.os.HandlerThread;
import android.os.Looper;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.search.p3692h.HandlerC67447a;
import java.lang.ref.WeakReference;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.h.c */
public final class C67452c implements AbstractC1214u<Integer> {

    /* renamed from: a */
    public final ActivityC0945e f151123a;

    static {
        Covode.recordClassIndex(79089);
    }

    public C67452c(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        this.f151123a = eVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(Integer num) {
        HandlerC67447a aVar;
        Integer num2 = num;
        if (num2 != null) {
            if (num2.intValue() == 1) {
                ActivityC0945e eVar = this.f151123a;
                C89219l.m154721d(eVar, "");
                HandlerC67447a aVar2 = C67451b.f151121a;
                if (aVar2 == null) {
                    HandlerThread handlerThread = new HandlerThread("feed-search-icon");
                    handlerThread.start();
                    Looper looper = handlerThread.getLooper();
                    C89219l.m154716b(looper, "");
                    aVar2 = new HandlerC67447a(looper);
                    C67451b.f151121a = aVar2;
                }
                C89219l.m154721d(eVar, "");
                if (!aVar2.hasMessages(1)) {
                    aVar2.f151114a = new WeakReference<>(eVar);
                    aVar2.f151115b = C17873f.m33100h().mo143289d(new HandlerC67447a.C67449b(aVar2));
                    aVar2.mo106411a(aVar2.mo106410a());
                }
            } else if (num2.intValue() == 2 && (aVar = C67451b.f151121a) != null) {
                aVar.mo106412b();
            }
        }
    }
}
