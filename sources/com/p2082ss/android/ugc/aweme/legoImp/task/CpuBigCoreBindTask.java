package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.common.jato.Jato;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58084a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58149ac;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.p2433ca.C35340a;
import com.p2082ss.android.ugc.aweme.utils.C80304cm;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.CpuBigCoreBindTask */
public final class CpuBigCoreBindTask implements AbstractC58084a, AbstractC58264w {
    static {
        Covode.recordClassIndex(68441);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1048575;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58084a
    /* renamed from: d */
    public final int mo28604d() {
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

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.BACKGROUND;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58084a
    /* renamed from: e */
    public final EnumC58149ac mo28605e() {
        return EnumC58149ac.CPU;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58084a
    /* renamed from: c */
    public final String[] mo28603c() {
        return new String[]{"JatoInitTask"};
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.CpuBigCoreBindTask$a */
    static final class C58333a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C58333a f132836a = new C58333a();

        static {
            Covode.recordClassIndex(68442);
        }

        C58333a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            if (!C35340a.m72330b()) {
                Jato.preloadCpusetInfo();
            }
            return C89391z.f203057a;
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
        C80304cm.f179829a.mo123693a("CpuBigCoreBindTask", C58333a.f132836a);
    }
}
