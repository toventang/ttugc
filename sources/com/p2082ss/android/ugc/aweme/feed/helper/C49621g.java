package com.p2082ss.android.ugc.aweme.feed.helper;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48234cd;
import com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell;
import com.p2082ss.android.ugc.aweme.feed.api.ExposeShareMsgApi;
import com.p2082ss.android.ugc.aweme.feed.assem.p2938a.C48345a;
import com.p2082ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationVM;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49533w;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.ExposeSharer;
import com.p2082ss.android.ugc.aweme.feed.model.ExposeSharerData;
import com.p2082ss.android.ugc.aweme.notice.repo.p3515a.C61615a;
import com.p2082ss.android.ugc.aweme.notice.repo.p3515a.C61616b;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.helper.g */
public final class C49621g {

    /* renamed from: g */
    public static final C49622a f114176g = new C49622a((byte) 0);

    /* renamed from: a */
    public boolean f114177a;

    /* renamed from: b */
    public ExposeSharerData f114178b;

    /* renamed from: c */
    public AbstractC88412b f114179c;

    /* renamed from: d */
    public boolean f114180d;

    /* renamed from: e */
    public String f114181e;

    /* renamed from: f */
    public AbstractC49623b f114182f;

    /* renamed from: com.ss.android.ugc.aweme.feed.helper.g$b */
    public interface AbstractC49623b {
        static {
            Covode.recordClassIndex(58470);
        }

        /* renamed from: a */
        void mo70544a();
    }

    static {
        Covode.recordClassIndex(58468);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.helper.g$a */
    public static final class C49622a {
        static {
            Covode.recordClassIndex(58469);
        }

        private C49622a() {
        }

        public /* synthetic */ C49622a(byte b) {
            this();
        }

        /* renamed from: a */
        public static boolean m93070a(Activity activity) {
            if (activity == null || activity.getIntent() == null) {
                return false;
            }
            return activity.getIntent().getBooleanExtra("share_expose_sharer", false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.helper.g$c */
    public static final class C49624c implements AbstractC88986z<ExposeSharerData> {

        /* renamed from: a */
        final /* synthetic */ C49621g f114183a;

        /* renamed from: b */
        final /* synthetic */ String f114184b;

        /* renamed from: c */
        final /* synthetic */ String f114185c;

        /* renamed from: d */
        final /* synthetic */ String f114186d;

        /* renamed from: e */
        final /* synthetic */ String f114187e;

        static {
            Covode.recordClassIndex(58471);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            this.f114183a.f114177a = false;
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
            this.f114183a.f114177a = false;
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
            this.f114183a.f114179c = bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(ExposeSharerData exposeSharerData) {
            AbstractC49623b bVar;
            ExposeSharerData exposeSharerData2 = exposeSharerData;
            String str = "";
            C89219l.m154721d(exposeSharerData2, str);
            if (exposeSharerData2.status_code == 0) {
                String str2 = this.f114184b;
                if (str2 != null) {
                    String str3 = this.f114185c;
                    if (str3 == null) {
                        str3 = str;
                    }
                    String str4 = this.f114186d;
                    if (str4 != null) {
                        str = str4;
                    }
                    C61616b.m111630b(str2, new C61615a(null, str, str3, 1));
                }
                exposeSharerData2.aid = this.f114187e;
                this.f114183a.f114178b = exposeSharerData2;
                if (this.f114183a.f114182f != null && !this.f114183a.f114180d && exposeSharerData2.exposeSharer != null && (bVar = this.f114183a.f114182f) != null) {
                    if (exposeSharerData2.exposeSharer == null) {
                        C89219l.m154715b();
                    }
                    bVar.mo70544a();
                }
            }
        }

        C49624c(C49621g gVar, String str, String str2, String str3, String str4) {
            this.f114183a = gVar;
            this.f114184b = str;
            this.f114185c = str2;
            this.f114186d = str3;
            this.f114187e = str4;
        }
    }

    /* renamed from: a */
    public final boolean mo81416a(AbstractC48149ai aiVar) {
        if (aiVar == null || aiVar.mo80206b() == null || !mo81418b(aiVar.mo80206b())) {
            return false;
        }
        mo81417a(aiVar.mo80206b());
        m93064b(aiVar);
        return true;
    }

    /* renamed from: b */
    public final boolean mo81418b(Aweme aweme) {
        if (aweme == null || !TextUtils.equals(aweme.getAid(), this.f114181e)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static void m93064b(AbstractC48149ai aiVar) {
        AbstractC48149ai aiVar2;
        VideoExposeSharerInformationVM b;
        if (aiVar instanceof AbstractC48234cd) {
            ((AbstractC48234cd) aiVar).mo80202aw().mo60191a("show_expose_sharer_info_view", (Object) true);
            if (!(aiVar instanceof VideoBaseCell)) {
                aiVar2 = null;
            } else {
                aiVar2 = aiVar;
            }
            VideoBaseCell videoBaseCell = (VideoBaseCell) aiVar2;
            if (videoBaseCell != null && videoBaseCell.mo80077K() && C49533w.m92773b() && (b = C48345a.m91806b(aiVar)) != null) {
                b.mo80813j();
            }
        }
    }

    /* renamed from: a */
    public final boolean mo81417a(Aweme aweme) {
        ExposeSharer exposeSharer;
        if (!mo81418b(aweme) || this.f114178b == null) {
            return false;
        }
        if (aweme == null) {
            C89219l.m154715b();
        }
        ExposeSharerData exposeSharerData = this.f114178b;
        if (exposeSharerData != null) {
            exposeSharer = exposeSharerData.exposeSharer;
        } else {
            exposeSharer = null;
        }
        aweme.setExposeSharer(exposeSharer);
        this.f114180d = true;
        return true;
    }

    /* renamed from: a */
    private static String m93063a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0071, code lost:
        if (r14 == null) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0075, code lost:
        if (r14 != null) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0079, code lost:
        if (r14 != null) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007d, code lost:
        if (r14 != null) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0081, code lost:
        if (r14 != null) goto L_0x002d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo81414a(java.lang.String r13, android.app.Activity r14) {
        /*
        // Method dump skipped, instructions count: 134
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.helper.C49621g.mo81414a(java.lang.String, android.app.Activity):void");
    }

    /* renamed from: a */
    public final void mo81415a(String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7) {
        if (z && !this.f114177a && !TextUtils.isEmpty(str) && !TextUtils.equals(this.f114181e, str)) {
            this.f114181e = str;
            this.f114177a = true;
            this.f114180d = false;
            ExposeShareMsgApi.m91767a(str2, str3, str4, str5, str, str6, str7).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b(new C49624c(this, str4, str, str2, str));
        }
    }
}
