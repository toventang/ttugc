package com.p2082ss.android.ugc.aweme.filter.p2981a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.ugc.asve.editor.C31068c;
import com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2738a.AbstractC41086b;
import com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2739b.AbstractC41088b;
import com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2739b.C41091e;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.tools.draft.p4102c.C78226c;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89624i;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.a.a */
public final class C50640a extends AbsDownloadListener {

    /* renamed from: d */
    public static final C50641a f116970d = new C50641a((byte) 0);

    /* renamed from: a */
    public long f116971a;

    /* renamed from: b */
    public final AbstractC41088b<Effect, C89391z> f116972b;

    /* renamed from: c */
    public final AbstractC41086b<Effect, C89391z> f116973c;

    /* renamed from: e */
    private final AbstractC89516am f116974e = C78226c.m136712a();

    static {
        Covode.recordClassIndex(59802);
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
    public final void onProgress(DownloadInfo downloadInfo) {
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.a.a$a */
    public static final class C50641a {
        static {
            Covode.recordClassIndex(59803);
        }

        private C50641a() {
        }

        public /* synthetic */ C50641a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
    public final void onStart(DownloadInfo downloadInfo) {
        super.onStart(downloadInfo);
        this.f116971a = System.currentTimeMillis();
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        AbstractC89568bz unused = C89624i.m155555a(this.f116974e, C31068c.f74429a, null, new C50642b(this, null), 2);
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.a.a$b */
    static final class C50642b extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f116975a;

        /* renamed from: b */
        final /* synthetic */ C50640a f116976b;

        static {
            Covode.recordClassIndex(59804);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C50642b(C50640a aVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f116976b = aVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C50642b(this.f116976b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C50642b) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            Object obj2 = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f116975a;
            if (i == 0) {
                C89382r.m154942a(obj);
                this.f116975a = 1;
                Object a = C89624i.m155554a(C89546bf.f203267b, new C78226c.C78228b(this.f116976b.f116972b.f96050h, null), this);
                if (a != EnumC89098a.COROUTINE_SUSPENDED) {
                    a = C89391z.f203057a;
                }
                if (a == obj2) {
                    return obj2;
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f116976b.f116972b.mo70302a(3);
            this.f116976b.f116972b.f96047e = null;
            this.f116976b.f116973c.mo70289b(this.f116976b.f116972b);
            C40982q.m82520a("aweme_tool_draft_amazing_infosticker_update_download_error", 0, new C69840ar().mo110189a("duration", String.valueOf(System.currentTimeMillis() - this.f116976b.f116971a)).mo110191a());
            return C89391z.f203057a;
        }
    }

    public C50640a(AbstractC41088b<Effect, C89391z> bVar, AbstractC41086b<Effect, C89391z> bVar2) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
        this.f116972b = bVar;
        this.f116973c = bVar2;
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        String str;
        int i;
        this.f116972b.mo70302a(4);
        AbstractC41088b<Effect, C89391z> bVar = this.f116972b;
        if (baseException != null) {
            str = baseException.getMessage();
        } else {
            str = null;
        }
        bVar.f96048f = new C41091e(-1, str, baseException);
        this.f116973c.mo70294c(this.f116972b);
        C69840ar arVar = new C69840ar();
        String b = C73991bj.m130130b(baseException);
        C89219l.m154716b(b, "");
        C69840ar a = arVar.mo110189a("errorDesc", b);
        if (baseException != null) {
            i = baseException.getErrorCode();
        } else {
            i = 0;
        }
        C40982q.m82520a("aweme_tool_draft_amazing_infosticker_update_download_error", 1, a.mo110187a("errorCode", Integer.valueOf(i)).mo110191a());
    }
}
