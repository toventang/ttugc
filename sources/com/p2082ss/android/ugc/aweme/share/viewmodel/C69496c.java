package com.p2082ss.android.ugc.aweme.share.viewmodel;

import android.app.Activity;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.AbstractC39091d;
import com.p2082ss.android.ugc.aweme.openshare.C62723a;
import com.p2082ss.android.ugc.aweme.share.C68959i;
import com.p2082ss.android.ugc.aweme.share.C69282l;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89624i;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.viewmodel.c */
public final class C69496c {

    /* renamed from: d */
    public static final C69497a f155263d = new C69497a((byte) 0);

    /* renamed from: a */
    public final C1213t<AbstractC39091d> f155264a = new C1213t<>();

    /* renamed from: b */
    public final C1213t<C68959i> f155265b = new C1213t<>();

    /* renamed from: c */
    public final C62723a f155266c;

    static {
        Covode.recordClassIndex(81837);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.viewmodel.c$a */
    public static final class C69497a {
        static {
            Covode.recordClassIndex(81838);
        }

        private C69497a() {
        }

        public /* synthetic */ C69497a(byte b) {
            this();
        }
    }

    public C69496c(C62723a aVar) {
        C89219l.m154721d(aVar, "");
        this.f155266c = aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.share.viewmodel.c$b */
    static final class C69498b extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f155267a;

        /* renamed from: b */
        final /* synthetic */ C69496c f155268b;

        /* renamed from: c */
        final /* synthetic */ C69282l f155269c;

        /* renamed from: d */
        final /* synthetic */ Activity f155270d;

        static {
            Covode.recordClassIndex(81839);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69498b(C69496c cVar, C69282l lVar, Activity activity, AbstractC89124d dVar) {
            super(2, dVar);
            this.f155268b = cVar;
            this.f155269c = lVar;
            this.f155270d = activity;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C69498b(this.f155268b, this.f155269c, this.f155270d, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C69498b) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x006e  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0089  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x009d  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00b8  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x013b  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x01b6  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x01d3  */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x01ea A[RETURN] */
        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
            // Method dump skipped, instructions count: 499
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.share.viewmodel.C69496c.C69498b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: a */
    public final void mo109739a(String str, Activity activity) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(activity, "");
        AbstractC89568bz unused = C89624i.m155555a(C89517an.m155448a(C89546bf.f203267b), null, null, new C69498b(this, new C69282l(), activity, null), 3);
    }
}
