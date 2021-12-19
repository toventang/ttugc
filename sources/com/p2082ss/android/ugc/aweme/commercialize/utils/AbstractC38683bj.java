package com.p2082ss.android.ugc.aweme.commercialize.utils;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34466a;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34472g;
import com.p2082ss.android.ugc.aweme.commercialize.AbstractC37841f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bj */
public abstract class AbstractC38683bj implements AbstractC34466a, AbstractC37841f {

    /* renamed from: c */
    public final Activity f91389c;

    static {
        Covode.recordClassIndex(46224);
    }

    /* renamed from: a */
    private final void m78495a() {
        Activity activity = this.f91389c;
        if (activity instanceof AbstractC34472g) {
            ((AbstractC34472g) activity).registerActivityOnKeyDownListener(this);
        }
    }

    /* renamed from: b */
    private final void m78496b() {
        Activity activity = this.f91389c;
        if (activity instanceof AbstractC34472g) {
            ((AbstractC34472g) activity).unRegisterActivityOnKeyDownListener(this);
        }
    }

    public AbstractC38683bj(Activity activity) {
        C89219l.m154721d(activity, "");
        this.f91389c = activity;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.AbstractC37841f
    /* renamed from: a */
    public final void mo59237a(boolean z) {
        if (z) {
            m78495a();
        } else {
            m78496b();
        }
    }
}
