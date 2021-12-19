package com.p2082ss.android.ugc.aweme.app.launch;

import android.net.Uri;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.C33717c;
import com.p2082ss.android.ugc.aweme.launcher.service.mob.IMobLaunchApi;
import com.p2082ss.android.ugc.aweme.legoImp.task.AssemInitTask;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.app.launch.MobLaunchImpl */
public final class MobLaunchImpl implements IMobLaunchApi {
    static {
        Covode.recordClassIndex(40702);
    }

    @Override // com.p2082ss.android.ugc.aweme.launcher.service.mob.IMobLaunchApi
    /* renamed from: a */
    public final void mo60041a(boolean z) {
        C33717c.f79879a = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.launcher.service.mob.IMobLaunchApi
    /* renamed from: a */
    public final void mo60039a(String str) {
        T t;
        if (str != null) {
            try {
                CopyOnWriteArraySet<AssemInitTask.C58313b> copyOnWriteArraySet = AssemInitTask.f132802b;
                Iterator<T> it = copyOnWriteArraySet.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (C89219l.m154714a((Object) t.f132810a, (Object) str)) {
                        break;
                    }
                }
                C89379q.m157068constructorimpl(Boolean.valueOf(copyOnWriteArraySet.remove(t)));
            } catch (Throwable th) {
                C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.launcher.service.mob.IMobLaunchApi
    /* renamed from: b */
    public final void mo60042b(String str) {
        if (str != null) {
            try {
                if (AssemInitTask.f132802b.size() <= 50) {
                    AssemInitTask.f132802b.add(new AssemInitTask.C58313b(str));
                    ((Handler) AssemInitTask.f132804d.getValue()).postDelayed(new AssemInitTask.C58314c.RunnableC58315a(str), 500);
                }
                C89379q.m157068constructorimpl(C89391z.f203057a);
            } catch (Throwable th) {
                C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.launcher.service.mob.IMobLaunchApi
    /* renamed from: a */
    public final void mo60040a(String str, Uri uri, boolean z) {
        C33717c.C33718a.m69039a(str, uri);
    }
}
