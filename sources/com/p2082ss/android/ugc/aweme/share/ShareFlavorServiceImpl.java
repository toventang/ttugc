package com.p2082ss.android.ugc.aweme.share;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.ShareFlavorServiceImpl */
public final class ShareFlavorServiceImpl implements ShareFlavorService {

    /* renamed from: b */
    public static int f153923b = 500;

    /* renamed from: c */
    public static final C68826a f153924c = new C68826a((byte) 0);

    @Override // com.p2082ss.android.ugc.aweme.share.ShareFlavorService
    /* renamed from: a */
    public final String mo109369a() {
        return "copy_link";
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareFlavorService
    /* renamed from: a */
    public final String mo109370a(String str, SharePackage sharePackage) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(sharePackage, "");
        return str;
    }

    /* renamed from: com.ss.android.ugc.aweme.share.ShareFlavorServiceImpl$a */
    public static final class C68826a {
        static {
            Covode.recordClassIndex(81120);
        }

        private C68826a() {
        }

        public /* synthetic */ C68826a(byte b) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0037, code lost:
            if (r2 != null) goto L_0x0039;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.lang.String m121376a(java.lang.String r5) {
            /*
            // Method dump skipped, instructions count: 118
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.share.ShareFlavorServiceImpl.C68826a.m121376a(java.lang.String):java.lang.String");
        }
    }

    static {
        Covode.recordClassIndex(81119);
    }

    /* renamed from: b */
    public static ShareFlavorService m121372b() {
        MethodCollector.m26663i(6254);
        Object a = C81908b.m141854a(ShareFlavorService.class, false);
        if (a != null) {
            ShareFlavorService shareFlavorService = (ShareFlavorService) a;
            MethodCollector.m26664o(6254);
            return shareFlavorService;
        }
        if (C81908b.f183323dT == null) {
            synchronized (ShareFlavorService.class) {
                try {
                    if (C81908b.f183323dT == null) {
                        C81908b.f183323dT = new ShareFlavorServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6254);
                    throw th;
                }
            }
        }
        ShareFlavorServiceImpl shareFlavorServiceImpl = (ShareFlavorServiceImpl) C81908b.f183323dT;
        MethodCollector.m26664o(6254);
        return shareFlavorServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareFlavorService
    /* renamed from: a */
    public final void mo109371a(String str, long j, C33743c cVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(cVar, "");
        if (j < 1500) {
            String a = C68826a.m121376a(str);
            if (!TextUtils.isEmpty(a)) {
                cVar.mo59976a("errorFileContent", a);
            } else {
                cVar.mo59976a("errorFileContent", "file is null");
            }
        }
    }
}
