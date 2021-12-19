package com.p2082ss.android.ugc.aweme.mediachoose;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.services.mediachoose.IVideoLegalCheckerAndToastService;
import com.p2082ss.android.ugc.aweme.shortvideo.C70637di;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C72053aa;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import dmt.p4542av.video.C88168aj;
import java.util.concurrent.TimeUnit;
import p077b.C1731i;
import p077b.C1743j;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mediachoose.b */
public final class C59156b implements IVideoLegalCheckerAndToastService {

    /* renamed from: b */
    public static final C59157a f134596b = new C59157a((byte) 0);

    /* renamed from: a */
    public final Context f134597a;

    static {
        Covode.recordClassIndex(69514);
    }

    /* renamed from: com.ss.android.ugc.aweme.mediachoose.b$a */
    public static final class C59157a {
        static {
            Covode.recordClassIndex(69515);
        }

        private C59157a() {
        }

        public /* synthetic */ C59157a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mediachoose.b$d */
    static final class C59160d extends AbstractC89220m implements AbstractC89172b<C59179f, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f134604a;

        static {
            Covode.recordClassIndex(69518);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59160d(AbstractC89171a aVar) {
            super(1);
            this.f134604a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C59179f fVar) {
            C89219l.m154721d(fVar, "");
            this.f134604a.invoke();
            return C89391z.f203057a;
        }
    }

    public C59156b(Context context) {
        C89219l.m154721d(context, "");
        this.f134597a = context;
    }

    /* renamed from: b */
    private static String m108666b(String str) {
        try {
            return C84896h.m145872e(str).extractMetadata(12);
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.mediachoose.b$b */
    public static final class C59158b extends AbstractC89220m implements AbstractC89172b<C59179f, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C1743j f134598a;

        static {
            Covode.recordClassIndex(69516);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59158b(C1743j jVar) {
            super(1);
            this.f134598a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C59179f fVar) {
            C89219l.m154721d(fVar, "");
            this.f134598a.mo5555a((Object) true);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.mediachoose.b$f */
    public static final class C59162f extends AbstractC89220m implements AbstractC89172b<C59179f, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C59156b f134609a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89188r f134610b;

        /* renamed from: c */
        final /* synthetic */ int f134611c;

        /* renamed from: d */
        final /* synthetic */ int f134612d;

        /* renamed from: e */
        final /* synthetic */ AbstractC89183m f134613e;

        /* renamed from: f */
        final /* synthetic */ boolean f134614f;

        static {
            Covode.recordClassIndex(69520);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59162f(C59156b bVar, AbstractC89188r rVar, int i, int i2, AbstractC89183m mVar, boolean z) {
            super(1);
            this.f134609a = bVar;
            this.f134610b = rVar;
            this.f134611c = i;
            this.f134612d = i2;
            this.f134613e = mVar;
            this.f134614f = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C59179f fVar) {
            C59179f fVar2 = fVar;
            C89219l.m154721d(fVar2, "");
            this.f134613e.invoke(fVar2.f134656b, Long.valueOf(fVar2.f134657c));
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.mediachoose.b$c */
    public static final class C59159c extends AbstractC89220m implements AbstractC89172b<C59179f, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C59156b f134599a;

        /* renamed from: b */
        final /* synthetic */ boolean f134600b;

        /* renamed from: c */
        final /* synthetic */ int f134601c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89172b f134602d;

        /* renamed from: e */
        final /* synthetic */ C1743j f134603e;

        static {
            Covode.recordClassIndex(69517);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59159c(C59156b bVar, boolean z, int i, AbstractC89172b bVar2, C1743j jVar) {
            super(1);
            this.f134599a = bVar;
            this.f134600b = z;
            this.f134601c = i;
            this.f134602d = bVar2;
            this.f134603e = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C59179f fVar) {
            C59179f fVar2 = fVar;
            C89219l.m154721d(fVar2, "");
            if (this.f134600b) {
                C72053aa.m127203a(this.f134599a.f134597a, fVar2.f134659e, this.f134601c);
            }
            AbstractC89172b bVar = this.f134602d;
            if (bVar != null) {
                bVar.invoke(Integer.valueOf(fVar2.f134659e));
            }
            this.f134603e.mo5555a((Object) false);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mediachoose.b$e */
    static final class C59161e extends AbstractC89220m implements AbstractC89172b<C59179f, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C59156b f134605a;

        /* renamed from: b */
        final /* synthetic */ boolean f134606b;

        /* renamed from: c */
        final /* synthetic */ int f134607c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89172b f134608d = null;

        static {
            Covode.recordClassIndex(69519);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59161e(C59156b bVar, boolean z, int i) {
            super(1);
            this.f134605a = bVar;
            this.f134606b = z;
            this.f134607c = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C59179f fVar) {
            C59179f fVar2 = fVar;
            C89219l.m154721d(fVar2, "");
            if (this.f134606b) {
                C72053aa.m127203a(this.f134605a.f134597a, fVar2.f134659e, this.f134607c);
            }
            AbstractC89172b bVar = this.f134608d;
            if (bVar != null) {
                bVar.invoke(Integer.valueOf(fVar2.f134659e));
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.mediachoose.b$g */
    public static final class C59163g extends AbstractC89220m implements AbstractC89172b<C59179f, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C59156b f134615a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89188r f134616b;

        /* renamed from: c */
        final /* synthetic */ int f134617c;

        /* renamed from: d */
        final /* synthetic */ int f134618d;

        /* renamed from: e */
        final /* synthetic */ AbstractC89183m f134619e;

        /* renamed from: f */
        final /* synthetic */ boolean f134620f;

        static {
            Covode.recordClassIndex(69521);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59163g(C59156b bVar, AbstractC89188r rVar, int i, int i2, AbstractC89183m mVar, boolean z) {
            super(1);
            this.f134615a = bVar;
            this.f134616b = rVar;
            this.f134617c = i;
            this.f134618d = i2;
            this.f134619e = mVar;
            this.f134620f = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C59179f fVar) {
            C59179f fVar2 = fVar;
            C89219l.m154721d(fVar2, "");
            if (this.f134620f) {
                C72053aa.m127203a(this.f134615a.f134597a, fVar2.f134659e, this.f134617c);
            }
            this.f134616b.mo8774a(fVar2.f134656b, Long.valueOf(fVar2.f134657c), Integer.valueOf(fVar2.f134659e), fVar2.f134660f);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private static MediaModel m108663a(String str) {
        int[] a = C88168aj.m153237a(str);
        if (a == null) {
            return null;
        }
        MediaModel mediaModel = new MediaModel(-1);
        mediaModel.f134662b = str;
        mediaModel.f134672l = a[0];
        mediaModel.f134673m = a[1];
        mediaModel.f134668h = (long) a[3];
        mediaModel.f134670j = m108666b(str);
        return mediaModel;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.mediachoose.IVideoLegalCheckerAndToastService
    public final boolean isVideoLengthOrTypeSupportedAndShowErrToast(String str, boolean z) {
        C89219l.m154721d(str, "");
        return isVideoLengthOrTypeSupportedAndShowErrToast(str, z, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.mediachoose.IVideoLegalCheckerAndToastService
    public final boolean isVideoLengthOrTypeSupportedAndShowErrToast(String str, boolean z, AbstractC89172b<? super Integer, C89391z> bVar) {
        C89219l.m154721d(str, "");
        MediaModel a = m108663a(str);
        if (a != null) {
            return m108664a(this, a, z, 0, 0, bVar, 12);
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.mediachoose.IVideoLegalCheckerAndToastService
    public final void isVideoLengthOrTypeSupportedAndShowErrToast(String str, boolean z, int i, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(aVar, "");
        MediaModel a = m108663a(str);
        if (a != null) {
            int a2 = (int) C70637di.m124840a();
            if (i <= 0) {
                i = 600000;
            }
            new C59164c(this.f134597a).mo96649a(a, (long) a2, (long) i, new C59160d(aVar), new C59161e(this, z, a2));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.mediachoose.IVideoLegalCheckerAndToastService
    public final boolean isVideoLengthOrTypeSupportedAndShowErrToast(String str, boolean z, int i, int i2, AbstractC89172b<? super Integer, C89391z> bVar) {
        C89219l.m154721d(str, "");
        MediaModel a = m108663a(str);
        if (a != null) {
            return m108664a(this, a, z, i, 0, bVar, 8);
        }
        return false;
    }

    /* renamed from: a */
    private final boolean m108665a(MediaModel mediaModel, boolean z, int i, long j, AbstractC89172b<? super Integer, C89391z> bVar) {
        int i2 = i;
        C1743j jVar = new C1743j();
        int a = (int) C70637di.m124840a();
        if (i2 <= 0) {
            i2 = 600000;
        }
        new C59164c(this.f134597a).mo96649a(mediaModel, (long) a, (long) i2, new C59158b(jVar), new C59159c(this, z, a, bVar, jVar));
        try {
            jVar.f5610a.mo5536a(j, TimeUnit.MILLISECONDS);
            C1731i<TResult> iVar = jVar.f5610a;
            C89219l.m154716b(iVar, "");
            TResult d = iVar.mo5545d();
            if (d != null) {
                return d.booleanValue();
            }
            return false;
        } catch (InterruptedException unused) {
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.mediachoose.IVideoLegalCheckerAndToastService
    public final void isVideoLengthOrTypeSupportedAndShowErrToast(String str, boolean z, int i, int i2, AbstractC89183m<? super String, ? super Long, C89391z> mVar, AbstractC89188r<? super String, ? super Long, ? super Integer, ? super String, C89391z> rVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(rVar, "");
        MediaModel a = m108663a(str);
        if (a == null) {
            rVar.mo8774a("", 0L, -9, "path is null");
        } else {
            new C59164c(this.f134597a).mo96649a(a, (long) i2, (long) i, new C59162f(this, rVar, i2, i, mVar, z), new C59163g(this, rVar, i2, i, mVar, z));
        }
    }

    /* renamed from: a */
    private static /* synthetic */ boolean m108664a(C59156b bVar, MediaModel mediaModel, boolean z, int i, long j, AbstractC89172b bVar2, int i2) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        if ((i2 & 8) != 0) {
            j = 1000;
        }
        return bVar.m108665a(mediaModel, z, i, j, bVar2);
    }
}
