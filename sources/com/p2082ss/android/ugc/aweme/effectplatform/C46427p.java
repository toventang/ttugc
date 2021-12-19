package com.p2082ss.android.ugc.aweme.effectplatform;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.out.AVServiceImpl;
import com.p2082ss.android.ugc.aweme.services.IFoundationAVService;
import com.p2082ss.android.ugc.aweme.services.IInternalAVService;
import com.p2082ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.p2082ss.android.ugc.effectmanager.algorithm.FetchResourcesListener;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.p */
public final class C46427p implements AbstractC46416g {

    /* renamed from: a */
    public static final C46428a f108185a = new C46428a((byte) 0);

    /* renamed from: b */
    private List<String> f108186b = new ArrayList();

    static {
        Covode.recordClassIndex(55008);
    }

    /* renamed from: com.ss.android.ugc.aweme.effectplatform.p$a */
    public static final class C46428a {
        static {
            Covode.recordClassIndex(55009);
        }

        private C46428a() {
        }

        public /* synthetic */ C46428a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effectplatform.p$c */
    public static final class C46430c implements FetchResourcesListener {

        /* renamed from: a */
        final /* synthetic */ FetchResourcesListener f108188a;

        static {
            Covode.recordClassIndex(55011);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.algorithm.FetchResourcesListener
        public final void onSuccess() {
            FetchResourcesListener fetchResourcesListener = this.f108188a;
            if (fetchResourcesListener != null) {
                fetchResourcesListener.onSuccess();
            }
            C84911q.m145922a("lens_hdr", "download success");
        }

        C46430c(FetchResourcesListener fetchResourcesListener) {
            this.f108188a = fetchResourcesListener;
        }

        @Override // com.p2082ss.android.ugc.effectmanager.algorithm.FetchResourcesListener
        public final void onFailed(Exception exc) {
            C84911q.m145922a("lens_hdr", "download failed: ".concat(String.valueOf(exc)));
            FetchResourcesListener fetchResourcesListener = this.f108188a;
            if (fetchResourcesListener != null) {
                fetchResourcesListener.onFailed(exc);
            }
            if (exc != null) {
                exc.printStackTrace();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effectplatform.p$b */
    public static final class C46429b implements IFoundationAVService.IFetchResourcesListener {

        /* renamed from: a */
        final /* synthetic */ IFoundationAVService.IFetchResourcesListener f108187a;

        static {
            Covode.recordClassIndex(55010);
        }

        C46429b(IFoundationAVService.IFetchResourcesListener iFetchResourcesListener) {
            this.f108187a = iFetchResourcesListener;
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
        public final void onFailed(Exception exc) {
            C89219l.m154721d(exc, "");
            IFoundationAVService.IFetchResourcesListener iFetchResourcesListener = this.f108187a;
            if (iFetchResourcesListener != null) {
                iFetchResourcesListener.onFailed(exc);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
        public final void onSuccess(String[] strArr) {
            C89219l.m154721d(strArr, "");
            IFoundationAVService.IFetchResourcesListener iFetchResourcesListener = this.f108187a;
            if (iFetchResourcesListener != null) {
                iFetchResourcesListener.onSuccess(strArr);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46416g
    /* renamed from: a */
    public final void mo78946a(IFoundationAVService.IFetchResourcesListener iFetchResourcesListener) {
        if (!this.f108186b.isEmpty()) {
            IInternalAVService a = AVServiceImpl.m113116a();
            Object[] array = this.f108186b.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            a.fetchResourcesNeededByRequirements((String[]) array, new C46429b(iFetchResourcesListener));
            return;
        }
        iFetchResourcesListener.onSuccess(new String[0]);
    }

    @Override // com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46416g
    /* renamed from: a */
    public final void mo78947a(String[] strArr, FetchResourcesListener fetchResourcesListener) {
        C89219l.m154721d(strArr, "");
        if (strArr.length != 0) {
            DownloadableModelSupport.getInstance().fetchResourcesWithModelNames(0, strArr, new C46430c(fetchResourcesListener));
        } else if (fetchResourcesListener != null) {
            fetchResourcesListener.onSuccess();
        }
    }
}
