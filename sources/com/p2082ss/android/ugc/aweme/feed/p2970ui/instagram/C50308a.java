package com.p2082ss.android.ugc.aweme.feed.p2970ui.instagram;

import android.app.Activity;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.keva.Keva;
import com.p2082ss.android.sdk.p2174a.C30223b;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.tools.utils.C84892d;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.instagram.a */
public final class C50308a {

    /* renamed from: g */
    public static boolean f116164g;

    /* renamed from: h */
    public static final C50309a f116165h = new C50309a((byte) 0);

    /* renamed from: a */
    public final C50314c f116166a;

    /* renamed from: b */
    public final Keva f116167b;

    /* renamed from: c */
    public final C50313b f116168c;

    /* renamed from: d */
    public final Activity f116169d;

    /* renamed from: e */
    public final String f116170e;

    /* renamed from: f */
    public final String f116171f;

    /* renamed from: i */
    private C17197a f116172i;

    /* renamed from: j */
    private final String f116173j;

    static {
        Covode.recordClassIndex(59436);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.instagram.a$a */
    public static final class C50309a {
        static {
            Covode.recordClassIndex(59437);
        }

        private C50309a() {
        }

        /* renamed from: a */
        public static C50315d m94414a() {
            C50314c a;
            List<String> list = C50317f.m94416a().f116188a;
            if (C84892d.m145850a(list)) {
                return null;
            }
            if (list == null) {
                C89219l.m154715b();
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String str = list.get(i);
                Locale locale = Locale.ENGLISH;
                C89219l.m154716b(locale, "");
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = str.toLowerCase(locale);
                C89219l.m154716b(lowerCase, "");
                if (C30223b.f72086a.mo53668a(lowerCase) && (a = C50317f.m94416a().mo85490a(lowerCase)) != null) {
                    return new C50315d(lowerCase, a);
                }
            }
            return null;
        }

        public /* synthetic */ C50309a(byte b) {
            this();
        }
    }

    /* renamed from: b */
    public final void mo85484b() {
        C17197a aVar = this.f116172i;
        if (aVar != null) {
            aVar.mo27186d();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0075, code lost:
        if (r5.getBoolean(r1.append(r0.getCurUserId()).toString(), false) == false) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0077, code lost:
        r1 = new com.bytedance.ies.dmt.p1194ui.dialog.C17197a.C17200a(r9.f116169d);
        r1.f41059E = true;
        r0 = r9.f116166a.f116182b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0084, code lost:
        if (r0 != null) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0086, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0087, code lost:
        r1.f41070a = r0;
        r0 = r9.f116166a.f116183c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008d, code lost:
        if (r0 != null) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008f, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0090, code lost:
        r1.f41071b = r0;
        r1.f41067M = false;
        r0 = r9.f116166a.f116184d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0098, code lost:
        if (r0 != null) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009a, code lost:
        r2 = r1.mo27192a(r2, (android.content.DialogInterface.OnClickListener) new com.p2082ss.android.ugc.aweme.feed.p2970ui.instagram.C50308a.DialogInterface$OnClickListenerC50312d(r9), true);
        r2.f41060F = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ad, code lost:
        if (android.text.TextUtils.isEmpty(r9.f116166a.f116185e) != false) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00af, code lost:
        r2.mo27196b(r9.f116166a.f116185e, (android.content.DialogInterface.OnClickListener) new com.p2082ss.android.ugc.aweme.feed.p2970ui.instagram.C50308a.DialogInterface$OnClickListenerC50311c(r9), true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00bb, code lost:
        r0 = r2.mo27193a();
        r9.f116172i = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c1, code lost:
        if (r0 != null) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c3, code lost:
        p4600h.p4611f.p4613b.C89219l.m154715b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c6, code lost:
        r0.mo27185c();
        r2 = new com.p2082ss.android.ugc.aweme.app.p2328f.C33744d().mo59983a("enter_from", "homepage_hot").mo59983a("enter_method", "feed_popup");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e6, code lost:
        if (android.text.TextUtils.isEmpty(r9.f116166a.f116185e) == false) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e8, code lost:
        r1 = "single_button";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ea, code lost:
        com.p2082ss.android.ugc.aweme.common.C39162r.m79460a("bind_notify", r2.mo59983a("ui", r1).mo59983a("platform", r9.f116173j).f79943a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ff, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0100, code lost:
        r1 = "double_button";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0103, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0046, code lost:
        if (r6.getLong(r1.append(r0.getCurUserId()).toString(), 0) < java.lang.System.currentTimeMillis()) goto L_0x0077;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo85483a() {
        /*
        // Method dump skipped, instructions count: 261
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2970ui.instagram.C50308a.mo85483a():boolean");
    }

    /* renamed from: a */
    public static String m94410a(String str) {
        StringBuilder append = new StringBuilder().append(str);
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        return append.append(g.getCurUserId()).toString();
    }

    /* renamed from: a */
    public final void mo85482a(boolean z) {
        String str;
        if (z) {
            mo85484b();
        } else {
            C31575b.m65863e().bindMobileOrEmailAndSetPwd(this.f116169d, this.f116170e, this.f116171f, null, new C50310b(this));
            C33744d a = new C33744d().mo59983a("enter_from", "homepage_hot").mo59983a("enter_method", "feed_popup");
            if (TextUtils.isEmpty(this.f116166a.f116185e)) {
                str = "single_button";
            } else {
                str = "double_button";
            }
            C39162r.m79460a("bind_notify_confirm", a.mo59983a("ui", str).mo59983a("platform", this.f116173j).f79943a);
        }
        this.f116167b.storeLong(m94410a(this.f116168c.f116178b), System.currentTimeMillis() + 86400000);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.ui.instagram.a$c */
    public static final class DialogInterface$OnClickListenerC50311c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C50308a f116175a;

        static {
            Covode.recordClassIndex(59439);
        }

        DialogInterface$OnClickListenerC50311c(C50308a aVar) {
            this.f116175a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f116175a.mo85482a(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.ui.instagram.a$d */
    public static final class DialogInterface$OnClickListenerC50312d implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C50308a f116176a;

        static {
            Covode.recordClassIndex(59440);
        }

        DialogInterface$OnClickListenerC50312d(C50308a aVar) {
            this.f116176a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f116176a.mo85482a(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.ui.instagram.a$b */
    public static final class C50310b implements IAccountService.AbstractC31277g {

        /* renamed from: a */
        final /* synthetic */ C50308a f116174a;

        static {
            Covode.recordClassIndex(59438);
        }

        C50310b(C50308a aVar) {
            this.f116174a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
        public final void onResult(int i, int i2, Object obj) {
            Integer num = this.f116174a.f116166a.f116181a;
            if (num != null && 2 == num.intValue()) {
                if (i2 == 1) {
                    this.f116174a.f116167b.storeBoolean(C50308a.m94410a(this.f116174a.f116168c.f116179c), true);
                } else {
                    return;
                }
            }
            this.f116174a.mo85484b();
        }
    }

    public C50308a(C50315d dVar, C50313b bVar, Activity activity, String str, String str2) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f116168c = bVar;
        this.f116169d = activity;
        this.f116170e = str;
        this.f116171f = str2;
        this.f116166a = dVar.f116187b;
        this.f116173j = dVar.f116186a;
        this.f116167b = Keva.getRepo(bVar.f116177a);
    }
}
