package com.p2082ss.android.ugc.aweme.shortvideo.p3840m;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.DownloadableModelSupportResourceFinder;
import com.p2082ss.android.ugc.effectmanager.IFetchResourceListener;
import com.p2082ss.android.ugc.effectmanager.knadapt.UseKNPlatform;
import com.p2082ss.ugc.effectplatform.algorithm.C86709e;
import java.io.File;
import java.net.URI;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.m.c */
public final class C71978c {

    /* renamed from: a */
    public static final C71978c f161307a = new C71978c();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.m.c$a */
    public interface AbstractC71979a {
        static {
            Covode.recordClassIndex(84529);
        }

        /* renamed from: a */
        void mo113625a();

        /* renamed from: a */
        void mo113626a(String str);
    }

    private C71978c() {
    }

    static {
        Covode.recordClassIndex(84528);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.m.c$b */
    public static final class C71980b implements IFetchResourceListener {

        /* renamed from: a */
        final /* synthetic */ String f161308a;

        /* renamed from: b */
        final /* synthetic */ AbstractC71979a f161309b;

        static {
            Covode.recordClassIndex(84530);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.IFetchResourceListener
        public final void onFailure(Exception exc) {
            C89219l.m154721d(exc, "");
            AbstractC71979a aVar = this.f161309b;
            Log.getStackTraceString(exc);
            aVar.mo113625a();
        }

        /* renamed from: a */
        private static String m127072a(String str) {
            try {
                URI create = URI.create(str);
                C89219l.m154716b(create, "");
                String path = create.getPath();
                if (!TextUtils.isEmpty(path)) {
                    if (new File(path).exists()) {
                        C89219l.m154716b(path, "");
                        return path;
                    }
                }
            } catch (Exception unused) {
            }
            return "";
        }

        @Override // com.p2082ss.android.ugc.effectmanager.IFetchResourceListener
        public final void onSuccess(long j) {
            String findResourceUri;
            try {
                if (UseKNPlatform.enableKNPlatform) {
                    findResourceUri = C86709e.C86710a.m150208a().mo139947a().findResourceUri(this.f161308a);
                } else {
                    findResourceUri = DownloadableModelSupportResourceFinder.findResourceUri(null, this.f161308a);
                }
                String a = m127072a(findResourceUri);
                if (a.length() == 0) {
                    this.f161309b.mo113625a();
                } else {
                    this.f161309b.mo113626a(a);
                }
            } catch (Exception unused) {
                this.f161309b.mo113625a();
            }
        }

        public C71980b(String str, AbstractC71979a aVar) {
            this.f161308a = str;
            this.f161309b = aVar;
        }
    }
}
