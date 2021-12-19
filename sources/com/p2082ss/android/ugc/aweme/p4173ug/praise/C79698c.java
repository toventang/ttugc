package com.p2082ss.android.ugc.aweme.p4173ug.praise;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p2082ss.android.ugc.aweme.local_test.LocalTestApi;
import com.p2082ss.android.ugc.aweme.p4173ug.praise.C79684b;
import com.p2082ss.android.ugc.aweme.service.AbstractC67850d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ug.praise.c */
public final class C79698c {

    /* renamed from: i */
    public static AbstractC67850d f178816i;

    /* renamed from: j */
    public static final C79699a f178817j = new C79699a((byte) 0);

    /* renamed from: a */
    public long f178818a;

    /* renamed from: b */
    public boolean f178819b;

    /* renamed from: c */
    public boolean f178820c;

    /* renamed from: d */
    public String f178821d = "";

    /* renamed from: e */
    public long f178822e;

    /* renamed from: f */
    public boolean f178823f;

    /* renamed from: g */
    public long f178824g;

    /* renamed from: h */
    public long f178825h;

    /* renamed from: k */
    private final Keva f178826k;

    /* renamed from: l */
    private final String f178827l;

    static {
        Covode.recordClassIndex(92915);
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.praise.c$a */
    public static final class C79699a {
        static {
            Covode.recordClassIndex(92916);
        }

        private C79699a() {
        }

        public /* synthetic */ C79699a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m138519a(String str) {
            C89219l.m154721d(str, "");
            if (C79698c.f178816i == null) {
                Object service = ServiceManager.get().getService(LocalTestApi.class);
                C89219l.m154716b(service, "");
                C79698c.f178816i = ((LocalTestApi) service).getSpecActDebugService();
            }
            AbstractC67850d dVar = C79698c.f178816i;
            if (dVar != null) {
                dVar.mo106976a("Praise", str);
            }
        }
    }

    /* renamed from: a */
    public final void mo123231a(long j) {
        this.f178818a = j;
        this.f178826k.storeLong(this.f178827l + "key_last_dialog_show_time", j);
    }

    /* renamed from: b */
    public final void mo123234b(long j) {
        if (this.f178822e == 0) {
            this.f178822e = j;
            this.f178826k.storeLong("key_app_first_open_time", j);
        }
    }

    /* renamed from: c */
    public final void mo123236c(long j) {
        this.f178824g = j;
        this.f178826k.storeLong(this.f178827l + "key_last_try_show_time", j);
    }

    /* renamed from: a */
    public final void mo123232a(String str) {
        C89219l.m154721d(str, "");
        this.f178821d = str;
        this.f178826k.storeString(this.f178827l + "key_last_show_version", str);
    }

    /* renamed from: b */
    public final void mo123235b(boolean z) {
        this.f178820c = z;
        this.f178826k.storeBoolean(this.f178827l + "key_is_clicked_submit", z);
    }

    /* renamed from: a */
    public final void mo123233a(boolean z) {
        this.f178819b = z;
        this.f178826k.storeBoolean(this.f178827l + "key_is_clicked_feedback", z);
    }

    public C79698c(C79684b.EnumC79686b bVar) {
        C89219l.m154721d(bVar, "");
        Keva repo = Keva.getRepo("praise_keva");
        C89219l.m154716b(repo, "");
        this.f178826k = repo;
        String bVar2 = bVar.toString();
        this.f178827l = bVar2;
        mo123234b(repo.getLong("key_app_first_open_time", 0));
        mo123231a(repo.getLong(bVar2 + "key_last_dialog_show_time", 0));
        mo123233a(repo.getBoolean(bVar2 + "key_is_clicked_feedback", false));
        mo123235b(repo.getBoolean(bVar2 + "key_is_clicked_submit", false));
        String string = repo.getString(bVar2 + "key_last_show_version", "");
        C89219l.m154716b(string, "");
        mo123232a(string);
        mo123236c(repo.getLong(bVar2 + "key_last_try_show_time", 0));
        long j = repo.getLong(bVar2 + "key_last_2_try_show_time", 0);
        this.f178825h = j;
        repo.storeLong(bVar2 + "key_last_2_try_show_time", j);
        boolean z = repo.getBoolean("key_debug_open", false);
        this.f178823f = z;
        repo.storeBoolean("key_debug_open", z);
    }
}
