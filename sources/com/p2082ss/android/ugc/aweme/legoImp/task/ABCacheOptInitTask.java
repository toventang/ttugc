package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.C16076g;
import com.bytedance.ies.abmock.datacenter.C16065e;
import com.bytedance.ies.abmock.p1115a.AbstractC16045a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.player.C62890a;
import com.p2082ss.android.ugc.aweme.utils.C80181a;
import com.p2082ss.android.ugc.aweme.utils.C80286c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.ABCacheOptInitTask */
public final class ABCacheOptInitTask implements AbstractC58264w {

    /* renamed from: a */
    public static final C58301a f132789a = new C58301a((byte) 0);

    static {
        Covode.recordClassIndex(68383);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1;
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

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.ABCacheOptInitTask$a */
    public static final class C58301a {
        static {
            Covode.recordClassIndex(68384);
        }

        private C58301a() {
        }

        public /* synthetic */ C58301a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.BACKGROUND;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        System.currentTimeMillis();
        C16065e.m29769a().f38698e = C16048b.m29633a().mo25421a(true, "ab_lib_empty_call_opt", false);
        boolean a = C16048b.m29633a().mo25421a(true, "ab_call_opt", false);
        C80286c.f179804a = a;
        if (a) {
            try {
                C62890a.f142627a = C80286c.f179804a;
                AbstractC16045a aVar = C80181a.f179632a;
                C89219l.m154719c(aVar, "");
                C16076g.f38722f.add(aVar);
            } catch (Throwable unused) {
                C80286c.f179804a = false;
                C62890a.f142627a = false;
            }
        }
    }
}
