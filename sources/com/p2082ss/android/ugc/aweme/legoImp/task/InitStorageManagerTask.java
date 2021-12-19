package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1733u.AbstractC23439g;
import com.bytedance.p1733u.C23435d;
import com.bytedance.p1733u.C23437e;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitStorageManagerTask */
public final class InitStorageManagerTask implements AbstractC58264w {

    /* renamed from: c */
    private static final C58353a f132865c = new C58353a((byte) 0);

    /* renamed from: a */
    public final String f132866a = "InitStorageManagerTask";

    /* renamed from: b */
    final AbstractC89244h f132867b = C89250i.m154773a((AbstractC89171a) new C58355c(this));

    static {
        Covode.recordClassIndex(68496);
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

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitStorageManagerTask$a */
    static final class C58353a {
        static {
            Covode.recordClassIndex(68497);
        }

        private C58353a() {
        }

        public /* synthetic */ C58353a(byte b) {
            this();
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

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitStorageManagerTask$c */
    static final class C58355c extends AbstractC89220m implements AbstractC89171a<C23437e> {

        /* renamed from: a */
        final /* synthetic */ InitStorageManagerTask f132869a;

        static {
            Covode.recordClassIndex(68499);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C58355c(InitStorageManagerTask initStorageManagerTask) {
            super(0);
            this.f132869a = initStorageManagerTask;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C23437e invoke() {
            return m105935a();
        }

        /* renamed from: a */
        private static C23437e m105935a() {
            if (Build.VERSION.SDK_INT > 22) {
                return null;
            }
            try {
                C23437e eVar = new C23437e();
                eVar.f55583a = 52428800;
                eVar.f55584b = 52428800;
                eVar.f55585c = 52428800;
                return eVar;
            } catch (Throwable th) {
                th.getMessage();
                return null;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitStorageManagerTask$b */
    static final class C58354b<T> implements AbstractC23439g {

        /* renamed from: a */
        final /* synthetic */ InitStorageManagerTask f132868a;

        static {
            Covode.recordClassIndex(68498);
        }

        C58354b(InitStorageManagerTask initStorageManagerTask) {
            this.f132868a = initStorageManagerTask;
        }

        @Override // com.bytedance.p1733u.AbstractC23439g
        /* renamed from: a */
        public final /* synthetic */ Object mo38207a() {
            return this.f132868a.f132867b.getValue();
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
        C23435d.f55578a = new C58354b(this);
    }
}
