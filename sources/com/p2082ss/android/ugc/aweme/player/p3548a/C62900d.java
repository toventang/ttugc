package com.p2082ss.android.ugc.aweme.player.p3548a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.helper.C49618d;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49436i;
import com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49849am;
import com.p2082ss.android.ugc.aweme.video.AbstractC80732h;
import com.p2082ss.android.ugc.aweme.video.p4212f.AbstractC80726a;
import com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81002f;
import com.p2082ss.android.ugc.playerkit.model.C84216o;
import java.util.HashMap;
import java.util.concurrent.Callable;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.player.a.d */
public final class C62900d {

    /* renamed from: A */
    public String f142728A;

    /* renamed from: B */
    public int f142729B = -1;

    /* renamed from: C */
    public int f142730C = -1;

    /* renamed from: D */
    public int f142731D = -1;

    /* renamed from: E */
    public String f142732E;

    /* renamed from: F */
    public boolean f142733F;

    /* renamed from: G */
    public boolean f142734G;

    /* renamed from: H */
    public int f142735H;

    /* renamed from: I */
    public int f142736I;

    /* renamed from: a */
    public VideoUrlModel f142737a;

    /* renamed from: b */
    public Aweme f142738b;

    /* renamed from: c */
    public String f142739c;

    /* renamed from: d */
    public int f142740d;

    /* renamed from: e */
    public long f142741e;

    /* renamed from: f */
    public int f142742f;

    /* renamed from: g */
    public int f142743g;

    /* renamed from: h */
    public int f142744h;

    /* renamed from: i */
    public int f142745i;

    /* renamed from: j */
    public int f142746j;

    /* renamed from: k */
    public AbstractC80732h f142747k;

    /* renamed from: l */
    public AbstractC49436i f142748l;

    /* renamed from: m */
    public AbstractC49849am f142749m;

    /* renamed from: n */
    public AbstractC81002f f142750n;

    /* renamed from: o */
    public C84216o f142751o;

    /* renamed from: p */
    public int f142752p;

    /* renamed from: q */
    public Context f142753q;

    /* renamed from: r */
    public AbstractC80726a f142754r;

    /* renamed from: s */
    public C49618d f142755s;

    /* renamed from: t */
    public HashMap<String, String> f142756t;

    /* renamed from: u */
    public int f142757u = -1;

    /* renamed from: v */
    public boolean f142758v;

    /* renamed from: w */
    public int f142759w;

    /* renamed from: x */
    public boolean f142760x;

    /* renamed from: y */
    public String f142761y;

    /* renamed from: z */
    public String f142762z = "video_play_quality";

    /* renamed from: com.ss.android.ugc.aweme.player.a.d$b */
    public static class C62903b {

        /* renamed from: a */
        public boolean f142774a;

        /* renamed from: b */
        public Long f142775b;

        static {
            Covode.recordClassIndex(73738);
        }
    }

    static {
        Covode.recordClassIndex(73735);
    }

    /* renamed from: com.ss.android.ugc.aweme.player.a.d$a */
    public static class C62902a {

        /* renamed from: a */
        public final C62900d f142773a = new C62900d();

        static {
            Covode.recordClassIndex(73737);
        }

        /* renamed from: a */
        public final C62902a mo100890a(String str) {
            this.f142773a.f142739c = str;
            return this;
        }

        /* renamed from: a */
        public final C62902a mo100889a(C84216o oVar) {
            this.f142773a.f142751o = oVar;
            return this;
        }

        /* renamed from: a */
        public final C62902a mo100888a(AbstractC80726a aVar) {
            this.f142773a.f142754r = aVar;
            return this;
        }

        /* renamed from: a */
        public final C62902a mo100892a(boolean z) {
            this.f142773a.f142758v = z;
            return this;
        }

        /* renamed from: a */
        public final C62902a mo100891a(String str, String str2) {
            if (this.f142773a.f142756t == null) {
                this.f142773a.f142756t = new HashMap<>();
            }
            this.f142773a.f142756t.put(str, str2);
            return this;
        }

        /* renamed from: a */
        public final C62902a mo100879a() {
            this.f142773a.f142744h = 0;
            return this;
        }

        /* renamed from: b */
        public final C62902a mo100893b(int i) {
            this.f142773a.f142742f = i;
            return this;
        }

        /* renamed from: c */
        public final C62902a mo100896c(int i) {
            this.f142773a.f142743g = i;
            return this;
        }

        /* renamed from: d */
        public final C62902a mo100899d(int i) {
            this.f142773a.f142740d = i;
            return this;
        }

        /* renamed from: e */
        public final C62902a mo100901e(int i) {
            this.f142773a.f142745i = i;
            return this;
        }

        /* renamed from: f */
        public final C62902a mo100902f(int i) {
            this.f142773a.f142746j = i;
            return this;
        }

        /* renamed from: g */
        public final C62902a mo100903g(int i) {
            this.f142773a.f142752p = i;
            return this;
        }

        /* renamed from: h */
        public final C62902a mo100904h(int i) {
            this.f142773a.f142759w = i;
            return this;
        }

        /* renamed from: i */
        public final C62902a mo100905i(int i) {
            this.f142773a.f142729B = i;
            return this;
        }

        /* renamed from: j */
        public final C62902a mo100906j(int i) {
            this.f142773a.f142730C = i;
            return this;
        }

        /* renamed from: k */
        public final C62902a mo100907k(int i) {
            this.f142773a.f142731D = i;
            return this;
        }

        /* renamed from: l */
        public final C62902a mo100908l(int i) {
            this.f142773a.f142735H = i;
            return this;
        }

        /* renamed from: m */
        public final C62902a mo100909m(int i) {
            this.f142773a.f142736I = i;
            return this;
        }

        /* renamed from: a */
        public final C62902a mo100880a(int i) {
            this.f142773a.f142757u = i;
            return this;
        }

        /* renamed from: b */
        public final C62902a mo100894b(String str) {
            this.f142773a.f142728A = str;
            return this;
        }

        /* renamed from: c */
        public final C62902a mo100897c(String str) {
            this.f142773a.f142732E = str;
            return this;
        }

        /* renamed from: d */
        public final C62902a mo100900d(boolean z) {
            this.f142773a.f142734G = z;
            return this;
        }

        /* renamed from: a */
        public final C62902a mo100881a(long j) {
            this.f142773a.f142741e = j;
            return this;
        }

        /* renamed from: b */
        public final C62902a mo100895b(boolean z) {
            this.f142773a.f142760x = z;
            return this;
        }

        /* renamed from: c */
        public final C62902a mo100898c(boolean z) {
            this.f142773a.f142733F = z;
            return this;
        }

        /* renamed from: a */
        public final C62902a mo100882a(Context context) {
            this.f142773a.f142753q = context;
            return this;
        }

        /* renamed from: a */
        public final C62902a mo100883a(AbstractC49436i iVar) {
            this.f142773a.f142748l = iVar;
            return this;
        }

        /* renamed from: a */
        public final C62902a mo100884a(C49618d dVar) {
            this.f142773a.f142755s = dVar;
            return this;
        }

        /* renamed from: a */
        public final C62902a mo100885a(Aweme aweme) {
            this.f142773a.f142738b = aweme;
            return this;
        }

        /* renamed from: a */
        public final C62902a mo100886a(VideoUrlModel videoUrlModel) {
            this.f142773a.f142737a = videoUrlModel;
            return this;
        }

        /* renamed from: a */
        public final C62902a mo100887a(AbstractC49849am amVar) {
            this.f142773a.f142749m = amVar;
            return this;
        }
    }

    /* renamed from: a */
    public final void mo100876a() {
        C84216o oVar;
        Aweme aweme;
        VideoUrlModel videoUrlModel;
        Context context = this.f142753q;
        if (context != null && (oVar = this.f142751o) != null && (aweme = this.f142738b) != null && (videoUrlModel = this.f142737a) != null) {
            m113295a(context, aweme, this.f142752p, this.f142748l, this.f142739c, oVar, videoUrlModel, this.f142747k, this.f142750n);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        if (Float.MIN_VALUE != r8) goto L_0x002d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo100877a(org.json.JSONObject r11) {
        /*
        // Method dump skipped, instructions count: 185
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.player.p3548a.C62900d.mo100877a(org.json.JSONObject):void");
    }

    /* renamed from: a */
    private void m113295a(final Context context, final Aweme aweme, final int i, final AbstractC49436i iVar, final String str, final C84216o oVar, final VideoUrlModel videoUrlModel, final AbstractC80732h hVar, final AbstractC81002f fVar) {
        C1731i.m5640b(new Callable<Object>() {
            /* class com.p2082ss.android.ugc.aweme.player.p3548a.C62900d.CallableC629011 */

            static {
                Covode.recordClassIndex(73736);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:127:0x041c, code lost:
                if (com.p2082ss.android.ugc.aweme.player.C62956e.f142894c.f142801c == 1) goto L_0x041e;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:135:0x043c, code lost:
                if (com.p2082ss.android.ugc.aweme.player.C62933c.f142849g != false) goto L_0x043e;
             */
            /* JADX WARNING: Removed duplicated region for block: B:130:0x0422 A[Catch:{ Exception -> 0x064d }] */
            /* JADX WARNING: Removed duplicated region for block: B:131:0x0424 A[Catch:{ Exception -> 0x064d }] */
            /* JADX WARNING: Removed duplicated region for block: B:134:0x0439 A[Catch:{ Exception -> 0x064d }] */
            /* JADX WARNING: Removed duplicated region for block: B:139:0x044e A[Catch:{ Exception -> 0x064d }] */
            /* JADX WARNING: Removed duplicated region for block: B:143:0x0476 A[Catch:{ Exception -> 0x064d }] */
            /* JADX WARNING: Removed duplicated region for block: B:153:0x0499 A[Catch:{ Exception -> 0x064d }, LOOP:1: B:151:0x0493->B:153:0x0499, LOOP_END] */
            /* JADX WARNING: Removed duplicated region for block: B:158:0x04cf  */
            /* JADX WARNING: Removed duplicated region for block: B:159:0x04dd  */
            /* JADX WARNING: Removed duplicated region for block: B:162:0x04f6  */
            /* JADX WARNING: Removed duplicated region for block: B:165:0x0524  */
            /* JADX WARNING: Removed duplicated region for block: B:170:0x0541 A[Catch:{ Exception -> 0x0647 }] */
            /* JADX WARNING: Removed duplicated region for block: B:173:0x0552 A[Catch:{ Exception -> 0x0647 }] */
            /* JADX WARNING: Removed duplicated region for block: B:176:0x0563 A[Catch:{ Exception -> 0x0647 }] */
            /* JADX WARNING: Removed duplicated region for block: B:179:0x0574 A[Catch:{ Exception -> 0x0647 }] */
            /* JADX WARNING: Removed duplicated region for block: B:185:0x059b A[Catch:{ Exception -> 0x0647 }] */
            /* JADX WARNING: Removed duplicated region for block: B:188:0x05df A[Catch:{ Exception -> 0x0647 }] */
            /* JADX WARNING: Removed duplicated region for block: B:190:0x05ec A[Catch:{ Exception -> 0x0647 }] */
            /* JADX WARNING: Removed duplicated region for block: B:198:0x0616 A[Catch:{ Exception -> 0x0647 }] */
            /* JADX WARNING: Removed duplicated region for block: B:203:0x0631 A[Catch:{ Exception -> 0x0647 }] */
            /* JADX WARNING: Removed duplicated region for block: B:207:0x063f A[Catch:{ Exception -> 0x0647 }] */
            /* JADX WARNING: Removed duplicated region for block: B:221:0x0689 A[Catch:{ JSONException -> 0x06a4 }] */
            @Override // java.util.concurrent.Callable
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object call() {
                /*
                // Method dump skipped, instructions count: 1709
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.player.p3548a.C62900d.CallableC629011.call():java.lang.Object");
            }
        }, C39162r.m79452a());
    }
}
