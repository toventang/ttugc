package com.p2082ss.android.ugc.aweme.p4173ug.p4176b;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.legoImp.task.C58420ae;
import com.p2082ss.android.ugc.aweme.p4173ug.p4174a.C79561b;
import com.p2082ss.android.ugc.aweme.p4173ug.p4177c.C79591a;
import com.p2082ss.android.ugc.aweme.share.ShareServiceImpl;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ug.b.b */
public final class C79584b {

    /* renamed from: a */
    public static boolean f178579a;

    /* renamed from: b */
    public static final IMSAdaptionService f178580b = MSAdaptionService.m97895c();

    /* renamed from: c */
    public static final C79584b f178581c = new C79584b();

    private C79584b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.b.b$a */
    public static final class RunnableC79585a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ActivityC17312a f178582a;

        static {
            Covode.recordClassIndex(92793);
        }

        public RunnableC79585a(ActivityC17312a aVar) {
            this.f178582a = aVar;
        }

        public final void run() {
            C79591a.m138345a(this.f178582a);
            ShareServiceImpl.m121448d().mo109418c().mo109465a();
            C79584b.f178580b.mo89370a((ActivityC0945e) this.f178582a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.b.b$c */
    public static final class RunnableC79587c implements Runnable {

        /* renamed from: a */
        public static final RunnableC79587c f178584a = new RunnableC79587c();

        static {
            Covode.recordClassIndex(92795);
        }

        RunnableC79587c() {
        }

        public final void run() {
            if (!C79584b.f178579a) {
                try {
                    C79584b.f178579a = true;
                    C1731i.m5640b(C79561b.CallableC79562a.f178540a, C1731i.f5562a);
                } catch (Exception e) {
                    C51423a.m95790a((Throwable) e);
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(92792);
    }

    /* renamed from: a */
    public static Bundle m138335a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.b.b$b */
    public static final class C79586b<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        public static final C79586b f178583a = new C79586b();

        static {
            Covode.recordClassIndex(92794);
        }

        C79586b() {
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            AbstractC58264w f = C58420ae.m106838f();
            C89219l.m154716b(f, "");
            C58221f.m105147a(f);
            return null;
        }
    }
}
