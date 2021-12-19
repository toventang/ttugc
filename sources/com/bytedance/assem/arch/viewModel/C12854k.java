package com.bytedance.assem.arch.viewModel;

import android.os.Looper;
import com.bytedance.covode.number.Covode;
import kotlinx.coroutines.android.C89523c;
import p4560f.p4561a.p4567d.AbstractC88431d;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.assem.arch.viewModel.k */
public final class C12854k<R> {

    /* renamed from: a */
    public boolean f31279a;

    /* renamed from: b */
    public AbstractC88431d<R, R> f31280b = C12855a.f31287a;

    /* renamed from: c */
    public boolean f31281c = true;

    /* renamed from: d */
    public boolean f31282d;

    /* renamed from: e */
    public AbstractC89127f f31283e;

    /* renamed from: f */
    public boolean f31284f;

    /* renamed from: g */
    public boolean f31285g;

    /* renamed from: h */
    public boolean f31286h;

    static {
        Covode.recordClassIndex(14686);
    }

    public C12854k() {
        Looper mainLooper = Looper.getMainLooper();
        C89219l.m154709a((Object) mainLooper, "");
        this.f31283e = C89523c.m155452a(C12813a.m23048a(mainLooper), "fast-main");
    }

    /* renamed from: a */
    public final void mo20693a(boolean z) {
        this.f31281c = z;
        this.f31282d = true;
    }

    /* renamed from: com.bytedance.assem.arch.viewModel.k$a */
    static final class C12855a<T1, T2> implements AbstractC88431d<R, R> {

        /* renamed from: a */
        public static final C12855a f31287a = new C12855a();

        static {
            Covode.recordClassIndex(14687);
        }

        C12855a() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88431d
        /* renamed from: a */
        public final boolean mo20694a(R r, R r2) {
            return C89219l.m154714a((Object) r, (Object) r2);
        }
    }
}
