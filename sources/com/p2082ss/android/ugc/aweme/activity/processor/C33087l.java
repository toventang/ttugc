package com.p2082ss.android.ugc.aweme.activity.processor;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.AbstractC17350d;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.p2082ss.android.ugc.aweme.base.p2364a.C34469d;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.activity.processor.l */
public final class C33087l extends AbstractC17350d {

    /* renamed from: d */
    private volatile boolean f78650d;

    static {
        Covode.recordClassIndex(39899);
    }

    @Override // com.bytedance.ies.foundation.activity.AbstractC17315b, com.bytedance.ies.foundation.base.AbstractC17368c
    /* renamed from: a */
    public final void mo27646a() {
        ActivityC17312a aVar;
        super.mo27646a();
        WeakReference<ActivityC17312a> weakReference = this.f41643a;
        if (weakReference != null && (aVar = weakReference.get()) != null) {
            C34469d.m70450a(aVar, m67796c(), false);
        }
    }

    /* renamed from: c */
    private final int m67796c() {
        Intent intent;
        T t;
        Integer valueOf;
        ActivityC17312a aVar;
        WeakReference<ActivityC17312a> weakReference = this.f41643a;
        if (weakReference == null || (aVar = weakReference.get()) == null) {
            intent = null;
        } else {
            intent = aVar.getIntent();
        }
        Iterator<T> it = mo27704b().mo27699b().iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t instanceof C33071aa) {
                break;
            }
        }
        if (!(t instanceof C33071aa)) {
            t = null;
        }
        T t2 = t;
        if (t2 != null) {
            valueOf = Integer.valueOf(t2.f78631a);
        } else {
            if (intent != null) {
                valueOf = Integer.valueOf(intent.getIntExtra("activity_translation_type", -1));
            }
            return -1;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return -1;
    }

    @Override // com.bytedance.ies.foundation.activity.AbstractC17315b, com.bytedance.ies.foundation.base.AbstractC17368c
    /* renamed from: f */
    public final void mo27665f(ActivityC17312a aVar) {
        ActivityC17312a aVar2;
        C89219l.m154721d(aVar, "");
        super.mo27665f(aVar);
        if (!this.f78650d) {
            WeakReference<ActivityC17312a> weakReference = this.f41643a;
            if (!(weakReference == null || (aVar2 = weakReference.get()) == null)) {
                C34469d.m70450a(aVar2, m67796c(), true);
            }
            this.f78650d = true;
        }
    }
}
