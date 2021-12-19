package com.p2082ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.recorder.C31117a;
import com.p2082ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.effectmanager.DownloadableModelSupportResourceFinder;
import com.p2082ss.android.ugc.effectmanager.IFetchResourceListener;
import com.p2082ss.android.ugc.effectmanager.knadapt.UseKNPlatform;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.ugc.effectplatform.algorithm.AlgorithmModelResourceFinder;
import com.p2082ss.ugc.effectplatform.algorithm.C86709e;
import java.net.URI;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.m */
public final class C71971m {

    /* renamed from: a */
    public static final C71971m f161287a = new C71971m();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.m$a */
    public interface AbstractC71972a {
        static {
            Covode.recordClassIndex(84522);
        }

        /* renamed from: a */
        void mo113623a(Exception exc);

        /* renamed from: a */
        void mo113624a(String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.m$b */
    public interface AbstractC71973b {
        static {
            Covode.recordClassIndex(84523);
        }

        /* renamed from: a */
        void mo111517a(boolean z);

        /* renamed from: a */
        void mo111518a(boolean z, int i, Exception exc);
    }

    private C71971m() {
    }

    static {
        Covode.recordClassIndex(84521);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.m$c */
    public static final class C71974c implements IFetchResourceListener {

        /* renamed from: a */
        final /* synthetic */ String f161288a;

        /* renamed from: b */
        final /* synthetic */ AbstractC71972a f161289b;

        static {
            Covode.recordClassIndex(84524);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.IFetchResourceListener
        public final void onFailure(Exception exc) {
            C89219l.m154721d(exc, "");
            AbstractC71972a aVar = this.f161289b;
            if (aVar != null) {
                aVar.mo113623a(exc);
            }
        }

        @Override // com.p2082ss.android.ugc.effectmanager.IFetchResourceListener
        public final void onSuccess(long j) {
            String findResourceUri;
            if (!UseKNPlatform.enableKNPlatform || !C86709e.C86710a.m150209b()) {
                findResourceUri = DownloadableModelSupportResourceFinder.findResourceUri(null, this.f161288a);
            } else {
                AlgorithmModelResourceFinder a = C86709e.C86710a.m150208a().mo139947a();
                String str = this.f161288a;
                C89219l.m154716b(str, "");
                findResourceUri = a.realFindResourceUri(0, null, str);
            }
            if (TextUtils.isEmpty(findResourceUri)) {
                AbstractC71972a aVar = this.f161289b;
                if (aVar != null) {
                    aVar.mo113624a("");
                    return;
                }
                return;
            }
            URI create = URI.create(findResourceUri);
            C89219l.m154716b(create, "");
            String path = create.getPath();
            AbstractC71972a aVar2 = this.f161289b;
            if (aVar2 != null) {
                C89219l.m154716b(path, "");
                aVar2.mo113624a(path);
            }
        }

        public C71974c(String str, AbstractC71972a aVar) {
            this.f161288a = str;
            this.f161289b = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.m$d */
    public static final class C71975d implements AbstractC71972a {

        /* renamed from: a */
        final /* synthetic */ ASCameraView f161290a;

        /* renamed from: b */
        final /* synthetic */ AbstractC71973b f161291b;

        static {
            Covode.recordClassIndex(84525);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.C71971m.AbstractC71972a
        /* renamed from: a */
        public final void mo113623a(Exception exc) {
            C89219l.m154721d(exc, "");
            C84911q.m145926b("aec model download fail:" + Log.getStackTraceString(exc));
            AbstractC71973b bVar = this.f161291b;
            if (bVar != null) {
                bVar.mo111518a(false, -1, exc);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.C71971m.AbstractC71972a
        /* renamed from: a */
        public final void mo113624a(String str) {
            boolean z;
            C89219l.m154721d(str, "");
            C84911q.m145921a("aec model download success");
            boolean z2 = false;
            if (C80720e.m139927b(str)) {
                ASCameraView aSCameraView = this.f161290a;
                C89219l.m154721d(str, "");
                if (aSCameraView.f74875d != null) {
                    C31117a aVar = aSCameraView.f74875d;
                    if (aVar == null) {
                        C89219l.m154710a("recorder");
                    }
                    z = aVar.mo56548f().mo56607a(true, str);
                } else {
                    z = false;
                }
                AbstractC71973b bVar = this.f161291b;
                if (bVar != null) {
                    bVar.mo111518a(true, 0, null);
                }
                z2 = z;
            } else {
                AbstractC71973b bVar2 = this.f161291b;
                if (bVar2 != null) {
                    bVar2.mo111518a(false, -1, null);
                }
            }
            C84911q.m145921a("aec model download success status:".concat(String.valueOf(z2)));
            AbstractC71973b bVar3 = this.f161291b;
            if (bVar3 != null) {
                bVar3.mo111517a(z2);
            }
        }

        public C71975d(ASCameraView aSCameraView, AbstractC71973b bVar) {
            this.f161290a = aSCameraView;
            this.f161291b = bVar;
        }
    }
}
