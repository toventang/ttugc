package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.common.jato.AbstractC13554c;
import com.bytedance.common.jato.Jato;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.SettingsRequestServiceImpl;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.List;
import java.util.concurrent.ExecutorService;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.JatoInitTask */
public final class JatoInitTask implements AbstractC58264w {

    /* renamed from: a */
    public static ExecutorService f132871a;

    /* renamed from: b */
    public static final C58358a f132872b = new C58358a((byte) 0);

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

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.JatoInitTask$a */
    public static final class C58358a {
        static {
            Covode.recordClassIndex(68509);
        }

        private C58358a() {
        }

        public /* synthetic */ C58358a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.JatoInitTask$b */
    public static final class C58359b implements AbstractC13554c {
        static {
            Covode.recordClassIndex(68510);
        }

        @Override // com.bytedance.common.jato.AbstractC13554c
        /* renamed from: a */
        public final void mo21785a(String str) {
        }

        @Override // com.bytedance.common.jato.AbstractC13554c
        /* renamed from: a */
        public final void mo21786a(String str, Throwable th) {
        }

        C58359b() {
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.MAIN;
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

    static {
        Covode.recordClassIndex(68508);
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
        a.f95505c = 1;
        ExecutorService a2 = C40780g.m82242a(a.mo70028a());
        C89219l.m154716b(a2, "");
        f132871a = a2;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        if (context != null) {
            int d = SettingsRequestServiceImpl.m65417i().mo57286d();
            Jato.init(context, false, new C58359b(), C40780g.m82241a());
            if (d == 0) {
                Jato.initScheduler(4867);
            } else if (d == 1) {
                Jato.initScheduler(771);
            }
            Jato.requestBlockGc(3000);
        }
    }
}
