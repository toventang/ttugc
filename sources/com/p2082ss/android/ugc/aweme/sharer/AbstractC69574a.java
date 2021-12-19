package com.p2082ss.android.ugc.aweme.sharer;

import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import p4600h.C89376n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sharer.a */
public abstract class AbstractC69574a implements AbstractC69581b {
    static {
        Covode.recordClassIndex(81920);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: c */
    public boolean mo109555c() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: d */
    public float mo109558d() {
        return 0.34f;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: b */
    public boolean mo109557b(Context context) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(context, "");
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public void mo109556a(RemoteImageView remoteImageView, boolean z) {
        C89219l.m154721d(remoteImageView, "");
        AbstractC69581b.C69582a.m122806a(this, remoteImageView);
    }

    /* renamed from: a */
    public boolean mo109796a(Context context, Intent intent) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(intent, "");
        if (context.getPackageManager().resolveActivity(intent, 0) == null) {
            return false;
        }
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public boolean mo61913a(AbstractC69645h hVar, Context context) {
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(context, "");
        if (hVar instanceof C69650k) {
            return mo109554a((C69650k) hVar, context);
        }
        if (hVar instanceof C69652m) {
            return mo109551a((C69652m) hVar, context);
        }
        if (hVar instanceof C69651l) {
            return mo109550a((C69651l) hVar, context);
        }
        if (hVar instanceof C69653n) {
            return mo109552a((C69653n) hVar, context);
        }
        throw new C89376n();
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public boolean mo109554a(C69650k kVar, Context context) {
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(context, "");
        return mo109551a((C69652m) kVar, context);
    }
}
