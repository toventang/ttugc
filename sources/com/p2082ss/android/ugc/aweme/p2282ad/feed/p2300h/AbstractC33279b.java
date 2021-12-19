package com.p2082ss.android.ugc.aweme.p2282ad.feed.p2300h;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34466a;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34472g;
import com.p2082ss.android.ugc.aweme.commercialize.AbstractC37841f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.feed.h.b */
public abstract class AbstractC33279b implements AbstractC34466a, AbstractC37841f {

    /* renamed from: c */
    public final Activity f79047c;

    static {
        Covode.recordClassIndex(40105);
    }

    /* renamed from: a */
    private final void m68229a() {
        Activity activity = this.f79047c;
        if (activity instanceof AbstractC34472g) {
            ((AbstractC34472g) activity).registerActivityOnKeyDownListener(this);
        }
    }

    /* renamed from: b */
    private final void m68230b() {
        Activity activity = this.f79047c;
        if (activity instanceof AbstractC34472g) {
            ((AbstractC34472g) activity).unRegisterActivityOnKeyDownListener(this);
        }
    }

    public AbstractC33279b(Activity activity) {
        C89219l.m154721d(activity, "");
        this.f79047c = activity;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.AbstractC37841f
    /* renamed from: a */
    public final void mo59237a(boolean z) {
        if (z) {
            m68229a();
        } else {
            m68230b();
        }
    }
}
