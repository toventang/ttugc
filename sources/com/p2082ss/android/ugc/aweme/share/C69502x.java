package com.p2082ss.android.ugc.aweme.share;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.openshare.C62723a;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.C80313cs;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.share.x */
public final class C69502x {

    /* renamed from: c */
    public static final C69503a f155273c = new C69503a((byte) 0);

    /* renamed from: a */
    public final C62723a f155274a;

    /* renamed from: b */
    final Context f155275b;

    static {
        Covode.recordClassIndex(81843);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.x$a */
    public static final class C69503a {
        static {
            Covode.recordClassIndex(81844);
        }

        private C69503a() {
        }

        public /* synthetic */ C69503a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    static boolean m122717a(String str) {
        if (!C80313cs.m139231a(str)) {
            return false;
        }
        int[] photoInfo = AVExternalServiceImpl.m113114a().abilityService().infoService().photoInfo(str);
        int i = photoInfo[0];
        int i2 = photoInfo[1];
        if (i * i2 != 0) {
            float f = (float) i2;
            float f2 = (float) i;
            if (f > f2 * 2.4f || f2 > f * 2.4f) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C69502x(C62723a aVar, Context context) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(context, "");
        this.f155274a = aVar;
        this.f155275b = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.share.x$b */
    public static final class C69504b extends AbstractC89220m implements AbstractC89183m<String, Long, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC69359p f155276a;

        static {
            Covode.recordClassIndex(81845);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69504b(AbstractC69359p pVar) {
            super(2);
            this.f155276a = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(String str, Long l) {
            l.longValue();
            C89219l.m154721d(str, "");
            this.f155276a.mo109594a(true);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.share.x$d */
    public static final class C69506d extends AbstractC89220m implements AbstractC89183m<String, Long, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C69502x f155278a;

        /* renamed from: b */
        final /* synthetic */ AbstractC69359p f155279b;

        /* renamed from: c */
        final /* synthetic */ int f155280c;

        static {
            Covode.recordClassIndex(81847);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69506d(C69502x xVar, AbstractC69359p pVar, int i) {
            super(2);
            this.f155278a = xVar;
            this.f155279b = pVar;
            this.f155280c = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(String str, Long l) {
            l.longValue();
            C89219l.m154721d(str, "");
            AbstractC69359p pVar = this.f155279b;
            boolean z = true;
            if (this.f155280c != this.f155278a.f155274a.f142192b.size() - 1) {
                z = false;
            }
            pVar.mo109594a(z);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.share.x$c */
    public static final class C69505c extends AbstractC89220m implements AbstractC89188r<String, Long, Integer, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC69359p f155277a;

        static {
            Covode.recordClassIndex(81846);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69505c(AbstractC69359p pVar) {
            super(4);
            this.f155277a = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89188r
        /* renamed from: a */
        public final /* synthetic */ C89391z mo8774a(String str, Long l, Integer num, String str2) {
            l.longValue();
            int intValue = num.intValue();
            String str3 = str2;
            C89219l.m154721d(str, "");
            C89219l.m154721d(str3, "");
            this.f155277a.mo109593a(intValue, str3);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.share.x$e */
    public static final class C69507e extends AbstractC89220m implements AbstractC89188r<String, Long, Integer, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89234a f155281a;

        /* renamed from: b */
        final /* synthetic */ AbstractC69359p f155282b;

        static {
            Covode.recordClassIndex(81848);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69507e(C89233z.C89234a aVar, AbstractC69359p pVar) {
            super(4);
            this.f155281a = aVar;
            this.f155282b = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89188r
        /* renamed from: a */
        public final /* synthetic */ C89391z mo8774a(String str, Long l, Integer num, String str2) {
            l.longValue();
            int intValue = num.intValue();
            String str3 = str2;
            C89219l.m154721d(str, "");
            C89219l.m154721d(str3, "");
            this.f155281a.element = true;
            this.f155282b.mo109593a(intValue, str3);
            return C89391z.f203057a;
        }
    }
}
