package com.p2082ss.android.ugc.aweme;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup;
import com.p2082ss.android.ugc.aweme.money.growth.C60180e;
import com.p2082ss.android.ugc.aweme.money.growth.DialogC60170c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.dk */
final /* synthetic */ class RunnableC43045dk implements Runnable {

    /* renamed from: a */
    private final Context f100356a;

    static {
        Covode.recordClassIndex(51195);
    }

    RunnableC43045dk(Context context) {
        this.f100356a = context;
    }

    public final void run() {
        Context context = this.f100356a;
        C89219l.m154721d(context, "");
        if (DialogC60170c.f137158c) {
            DialogC60170c.f137158c = false;
            return;
        }
        UgChannelPopup f = C60180e.f137181g.mo97861f();
        if (f == null) {
            return;
        }
        if (!C89219l.m154714a(Looper.getMainLooper(), Looper.myLooper())) {
            new Handler(Looper.getMainLooper()).post(new DialogC60170c.C60175a.RunnableC60176a(context, f));
        } else {
            DialogC60170c.C60175a.m109665a(context, f);
        }
    }
}
