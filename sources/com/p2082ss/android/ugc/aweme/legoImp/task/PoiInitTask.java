package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.C58254p;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.poi_api.service.C63134c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.PoiInitTask */
public final class PoiInitTask implements AbstractC58264w {
    static {
        Covode.recordClassIndex(68563);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1048575;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58265x.m105221a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "task_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.BOOT_FINISH;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.PoiInitTask$a */
    static final class RunnableC58379a implements Runnable {

        /* renamed from: a */
        public static final RunnableC58379a f132929a = new RunnableC58379a();

        static {
            Covode.recordClassIndex(68564);
        }

        RunnableC58379a() {
        }

        public final void run() {
            C63134c.m114157a().mo101465g();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        if (C63134c.m114157a().mo101463e()) {
            try {
                C58254p.m105190a().post(RunnableC58379a.f132929a);
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                C63134c.m114157a().mo101460c();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        C63134c.m114157a().mo101464f();
        C63134c.m114159a("POI_INIT_TASK");
        C63134c.m114157a().mo101454a("POI_INIT_TASK");
    }
}
