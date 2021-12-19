package com.p2082ss.android.ugc.aweme.discover.lynx;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.C15531c;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.C15593c;
import com.bytedance.ies.bullet.p1184ui.common.BulletActivityWrapper;
import com.bytedance.ies.bullet.p1184ui.common.BulletContainerView;
import com.p2082ss.android.ugc.aweme.bullet.impl.BulletService;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.lynx.a */
public final class C42184a {

    /* renamed from: a */
    public static final C42184a f98317a = new C42184a();

    private C42184a() {
    }

    static {
        Covode.recordClassIndex(50123);
    }

    /* renamed from: b */
    public static C15593c m84438b(Context context) {
        C89219l.m154721d(context, "");
        if (!(context instanceof Activity)) {
            context = ActivityStack.getTopActivity();
            C89219l.m154716b(context, "");
        }
        return C15531c.C15532a.m28665a(context, new SparkContext()).mo25317b();
    }

    /* renamed from: a */
    public static BulletContainerView m84437a(Context context) {
        C89219l.m154721d(context, "");
        BulletContainerView bulletContainerView = new BulletContainerView(context, null, 6, (byte) 0);
        bulletContainerView.mo25820a(BulletService.m71938f().mo61850a());
        if ((context instanceof Activity) && (context instanceof AbstractC1204m)) {
            BulletActivityWrapper bulletActivityWrapper = new BulletActivityWrapper((Activity) context);
            bulletActivityWrapper.mo26823a((AbstractC1204m) context);
            bulletContainerView.setActivityWrapper(bulletActivityWrapper);
        }
        return bulletContainerView;
    }
}
