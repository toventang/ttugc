package com.p2082ss.android.ugc.aweme.sharer;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sharer.b */
public interface AbstractC69581b {
    static {
        Covode.recordClassIndex(81927);
    }

    /* renamed from: a */
    Drawable mo109547a(Context context);

    /* renamed from: a */
    String mo109548a();

    /* renamed from: a */
    void mo109556a(RemoteImageView remoteImageView, boolean z);

    /* renamed from: a */
    boolean mo109549a(Context context, AbstractC69645h hVar);

    /* renamed from: a */
    boolean mo61913a(AbstractC69645h hVar, Context context);

    /* renamed from: a */
    boolean mo109554a(C69650k kVar, Context context);

    /* renamed from: a */
    boolean mo109550a(C69651l lVar, Context context);

    /* renamed from: a */
    boolean mo109551a(C69652m mVar, Context context);

    /* renamed from: a */
    boolean mo109552a(C69653n nVar, Context context);

    /* renamed from: b */
    String mo109553b();

    /* renamed from: b */
    boolean mo109557b(Context context);

    /* renamed from: c */
    boolean mo109555c();

    /* renamed from: d */
    float mo109558d();

    /* renamed from: com.ss.android.ugc.aweme.sharer.b$a */
    public static final class C69582a {
        static {
            Covode.recordClassIndex(81928);
        }

        /* renamed from: a */
        public static void m122806a(AbstractC69581b bVar, RemoteImageView remoteImageView) {
            C89219l.m154721d(remoteImageView, "");
            remoteImageView.setImageDrawable(bVar.mo109547a(remoteImageView.getContext()));
        }
    }
}
