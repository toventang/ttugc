package com.p2082ss.android.ugc.aweme.activity.processor;

import android.content.Context;
import android.media.AudioManager;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.AbstractC17350d;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.p2082ss.android.ugc.aweme.base.utils.C34712a;
import com.p2082ss.android.ugc.aweme.utils.C80628t;
import java.util.Iterator;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.activity.processor.a */
public final class C33070a extends AbstractC17350d {

    /* renamed from: d */
    private C80628t f78630d;

    static {
        Covode.recordClassIndex(39882);
    }

    /* renamed from: c */
    private final boolean m67765c() {
        T t;
        T t2;
        Iterator<T> it = mo27704b().mo27699b().iterator();
        while (true) {
            t = null;
            if (!it.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it.next();
            if (t2 instanceof C33098s) {
                break;
            }
        }
        if (t2 instanceof C33098s) {
            t = t2;
        }
        T t3 = t;
        if (t3 != null) {
            return t3.f78665a;
        }
        return false;
    }

    /* renamed from: b */
    private final C80628t m67764b(Context context) {
        if (this.f78630d == null) {
            this.f78630d = new C80628t(context);
        }
        return this.f78630d;
    }

    @Override // com.bytedance.ies.foundation.activity.AbstractC17315b, com.bytedance.ies.foundation.base.AbstractC17368c
    /* renamed from: e */
    public final void mo27664e(ActivityC17312a aVar) {
        C80628t b;
        C89219l.m154721d(aVar, "");
        super.mo27664e(aVar);
        if (!m67765c() && (b = m67764b((Context) aVar)) != null) {
            try {
                if (b.f180279a == null) {
                    b.f180279a = (AudioManager) C80628t.m139796a(C80628t.m139795a(aVar), DataType.AUDIO);
                }
                if (!(b.f180279a == null || b.f180280b == null)) {
                    b.f180279a.abandonAudioFocus(b.f180280b);
                }
                b.f180279a = null;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.bytedance.ies.foundation.activity.AbstractC17315b, com.bytedance.ies.foundation.base.AbstractC17368c
    /* renamed from: f */
    public final void mo27665f(ActivityC17312a aVar) {
        C80628t b;
        C89219l.m154721d(aVar, "");
        super.mo27665f(aVar);
        if (!m67765c() && (b = m67764b((Context) aVar)) != null) {
            try {
                if (b.f180279a == null) {
                    b.f180279a = (AudioManager) C80628t.m139796a(C80628t.m139795a(aVar), DataType.AUDIO);
                }
                if (b.f180279a != null && b.f180280b != null) {
                    b.f180279a.requestAudioFocus(b.f180280b, 3, 2);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.bytedance.ies.foundation.activity.AbstractC17315b, com.bytedance.ies.foundation.base.AbstractC17368c
    /* renamed from: a */
    public final void mo27654a(ActivityC17312a aVar, boolean z) {
        C89219l.m154721d(aVar, "");
        super.mo27654a(aVar, z);
        C89219l.m154721d(aVar, "");
        Iterator<T> it = C34712a.m70900a().iterator();
        while (it.hasNext()) {
            it.next().mo61391a(aVar, z);
        }
    }
}
