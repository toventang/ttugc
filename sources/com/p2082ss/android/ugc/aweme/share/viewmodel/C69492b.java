package com.p2082ss.android.ugc.aweme.share.viewmodel;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.AbstractC39091d;
import com.p2082ss.android.ugc.aweme.openshare.C62723a;
import com.p2082ss.android.ugc.aweme.openshare.Share;
import com.p2082ss.android.ugc.aweme.p2231ab.C31363a;
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

/* renamed from: com.ss.android.ugc.aweme.share.viewmodel.b */
public final class C69492b {

    /* renamed from: f */
    public static final C69493a f155246f = new C69493a((byte) 0);

    /* renamed from: a */
    final String f155247a = "aweme.share";

    /* renamed from: b */
    public final C1213t<Share.Response> f155248b = new C1213t<>();

    /* renamed from: c */
    public final C1213t<AbstractC39091d> f155249c = new C1213t<>();

    /* renamed from: d */
    public final C1213t<Boolean> f155250d = new C1213t<>();

    /* renamed from: e */
    public final C62723a f155251e;

    static {
        Covode.recordClassIndex(81833);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.viewmodel.b$a */
    public static final class C69493a {
        static {
            Covode.recordClassIndex(81834);
        }

        private C69493a() {
        }

        public /* synthetic */ C69493a(byte b) {
            this();
        }
    }

    public C69492b(C62723a aVar) {
        C89219l.m154721d(aVar, "");
        this.f155251e = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.share.viewmodel.b$b */
    public static final class C69494b extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        Object f155252a;

        /* renamed from: b */
        int f155253b;

        /* renamed from: c */
        final /* synthetic */ C69492b f155254c;

        /* renamed from: d */
        final /* synthetic */ Share.Request f155255d;

        /* renamed from: e */
        final /* synthetic */ C69282l f155256e;

        /* renamed from: f */
        final /* synthetic */ Activity f155257f;

        /* renamed from: g */
        final /* synthetic */ Context f155258g;

        static {
            Covode.recordClassIndex(81835);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69494b(C69492b bVar, Share.Request request, C69282l lVar, Activity activity, Context context, AbstractC89124d dVar) {
            super(2, dVar);
            this.f155254c = bVar;
            this.f155255d = request;
            this.f155256e = lVar;
            this.f155257f = activity;
            this.f155258g = context;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C69494b(this.f155254c, this.f155255d, this.f155256e, this.f155257f, this.f155258g, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C69494b) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:100:0x02ad A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:104:0x02b9  */
        /* JADX WARNING: Removed duplicated region for block: B:110:0x008f A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x005d  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0079  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0091  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00a3  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00dc  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x0101  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x011c  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x0141  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x01ae  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x0238  */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x0256  */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x0262  */
        /* JADX WARNING: Removed duplicated region for block: B:94:0x028e  */
        /* JADX WARNING: Removed duplicated region for block: B:97:0x029a  */
        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
            // Method dump skipped, instructions count: 748
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.share.viewmodel.C69492b.C69494b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: a */
    public static Share.Response m122712a(int i, String str, Share.Request request) {
        Share.Response response = new Share.Response();
        response.errorCode = C31363a.m65572a(i);
        response.errorMsg = str;
        response.subErrorCode = i;
        response.state = request.mState;
        return response;
    }

    /* renamed from: a */
    public final void mo109738a(String str, Share.Request request, Activity activity, Context context) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(request, "");
        C89219l.m154721d(activity, "");
        C89219l.m154721d(context, "");
        AbstractC89568bz unused = C89624i.m155555a(C89517an.m155448a(C89546bf.f203267b), null, null, new C69494b(this, request, new C69282l(), activity, context, null), 3);
    }
}
