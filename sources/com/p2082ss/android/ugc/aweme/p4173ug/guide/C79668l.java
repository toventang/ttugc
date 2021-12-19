package com.p2082ss.android.ugc.aweme.p4173ug.guide;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.p2082ss.android.ugc.aweme.feed.guide.C49594i;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a;
import com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49849am;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50085av;
import com.p2082ss.android.ugc.aweme.main.C59038ax;
import com.p2082ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.p2082ss.android.ugc.aweme.p4173ug.guide.C79665j;
import com.p2082ss.android.ugc.aweme.share.ShareDependService;
import com.p2082ss.android.ugc.aweme.share.viewmodel.C69488a;
import com.p2082ss.android.ugc.aweme.utils.C80429fh;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ug.guide.l */
public final class C79668l {

    /* renamed from: a */
    public final AbstractC49849am f178772a;

    /* renamed from: b */
    public final C69488a f178773b;

    /* renamed from: c */
    private final Handler f178774c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private final Runnable f178775d = new RunnableC79669a(this);

    static {
        Covode.recordClassIndex(92884);
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.guide.l$b */
    public static final class C79670b implements C69488a.AbstractC69490b {

        /* renamed from: a */
        final /* synthetic */ C79668l f178777a;

        static {
            Covode.recordClassIndex(92886);
        }

        @Override // com.p2082ss.android.ugc.aweme.share.viewmodel.C69488a.AbstractC69490b
        /* renamed from: a */
        public final void mo87085a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.share.viewmodel.C69488a.AbstractC69490b
        /* renamed from: b */
        public final void mo87086b() {
            this.f178777a.mo123212a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C79670b(C79668l lVar) {
            this.f178777a = lVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.guide.l$c */
    public static final class C79671c implements C69488a.AbstractC69490b {

        /* renamed from: a */
        final /* synthetic */ C79668l f178778a;

        static {
            Covode.recordClassIndex(92887);
        }

        @Override // com.p2082ss.android.ugc.aweme.share.viewmodel.C69488a.AbstractC69490b
        /* renamed from: a */
        public final void mo87085a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.share.viewmodel.C69488a.AbstractC69490b
        /* renamed from: b */
        public final void mo87086b() {
            this.f178778a.mo123212a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C79671c(C79668l lVar) {
            this.f178778a = lVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.guide.l$d */
    public static final class C79672d implements C69488a.AbstractC69490b {

        /* renamed from: a */
        final /* synthetic */ C79668l f178779a;

        static {
            Covode.recordClassIndex(92888);
        }

        @Override // com.p2082ss.android.ugc.aweme.share.viewmodel.C69488a.AbstractC69490b
        /* renamed from: a */
        public final void mo87085a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.share.viewmodel.C69488a.AbstractC69490b
        /* renamed from: b */
        public final void mo87086b() {
            this.f178779a.mo123212a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C79672d(C79668l lVar) {
            this.f178779a = lVar;
        }
    }

    /* renamed from: c */
    public final void mo123215c() {
        this.f178774c.removeCallbacks(this.f178775d);
    }

    /* renamed from: e */
    private static boolean m138475e() {
        Aweme f = m138476f();
        if (f == null || f.isAd()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void mo123216d() {
        if (mo123214b()) {
            this.f178772a.mo81100aB();
        }
    }

    /* renamed from: f */
    private static Aweme m138476f() {
        Activity j = C17873f.m33102j();
        if (!(j instanceof ActivityC0945e)) {
            j = null;
        }
        ActivityC0945e eVar = (ActivityC0945e) j;
        if (eVar == null) {
            return null;
        }
        return AwemeChangeCallBack.m108593a(eVar);
    }

    /* renamed from: a */
    public final void mo123212a() {
        if (mo123214b() && !C49594i.m93009b()) {
            this.f178772a.mo81100aB();
            C49594i.m93008a().edit().putBoolean("hasShowedSwipeUpGuideAfterVideoPlay", true).apply();
        }
    }

    /* renamed from: g */
    private final boolean m138477g() {
        boolean z;
        AbstractC49849am amVar = this.f178772a;
        if (amVar instanceof AbstractC49815a) {
            z = ((AbstractC49815a) amVar).mo84727bB();
        } else {
            z = false;
        }
        if (!z) {
            int aF = this.f178772a.mo81111aF() - 1;
            VerticalViewPager aR = this.f178772a.mo84710aR();
            C89219l.m154716b(aR, "");
            if (aF != aR.getCurrentItem()) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private final boolean m138478h() {
        if (this.f178773b.mo109737a("share_panel") || this.f178773b.mo109737a("comment_panel") || this.f178773b.mo109737a("login_panel")) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo123214b() {
        if (this.f178773b.mo109737a("swipe_up_guide") || !m138478h() || m138475e() || C59038ax.f134410a || !C49594i.m93011d() || !m138477g() || !ShareDependService.C68822a.m121324a().mo109348b()) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.guide.l$a */
    static final class RunnableC79669a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C79668l f178776a;

        static {
            Covode.recordClassIndex(92885);
        }

        RunnableC79669a(C79668l lVar) {
            this.f178776a = lVar;
        }

        public final void run() {
            if (this.f178776a.mo123214b() && this.f178776a.f178772a.aG_() != null) {
                boolean z = !C80429fh.m139443a(this.f178776a.f178772a.aG_(), false, false);
                if (this.f178776a.f178772a instanceof AbstractC50085av) {
                    VerticalViewPager aR = this.f178776a.f178772a.mo84710aR();
                    C89219l.m154716b(aR, "");
                    if (aR.getCurrentItem() != 0) {
                        return;
                    }
                }
                if (z) {
                    this.f178776a.f178772a.mo81100aB();
                    C49594i.m93008a().edit().putBoolean("hasShowedSwipeUpGuideAfterVideoPlay", true).apply();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo123213a(long j) {
        if (!C79665j.C79666a.m138473a() || !C49594i.m93009b()) {
            this.f178774c.postDelayed(this.f178775d, j);
        }
    }

    public C79668l(AbstractC49849am amVar, C69488a aVar) {
        C89219l.m154721d(amVar, "");
        C89219l.m154721d(aVar, "");
        this.f178772a = amVar;
        this.f178773b = aVar;
    }
}
