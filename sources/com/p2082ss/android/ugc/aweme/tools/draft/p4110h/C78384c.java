package com.p2082ss.android.ugc.aweme.tools.draft.p4110h;

import android.database.sqlite.SQLiteDatabase;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.C43206f;
import com.p2082ss.android.ugc.aweme.draft.C43212j;
import com.p2082ss.android.ugc.aweme.draft.C43213k;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.C43225d;
import com.p2082ss.android.ugc.aweme.draft.model.C43232f;
import com.p2082ss.android.ugc.aweme.draft.model.DraftLoadResult;
import com.p2082ss.android.ugc.aweme.draft.model.DraftSaveResult;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.port.internal.AbstractC63277e;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.utils.C80510gr;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.h.c */
public final class C78384c implements AbstractC63277e {

    /* renamed from: a */
    public static final C78385a f176124a = new C78385a((byte) 0);

    static {
        Covode.recordClassIndex(91510);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.h.c$a */
    public static final class C78385a {
        static {
            Covode.recordClassIndex(91511);
        }

        private C78385a() {
        }

        public /* synthetic */ C78385a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.AbstractC63277e
    /* renamed from: a */
    public final void mo101857a(SQLiteDatabase sQLiteDatabase) {
        C89219l.m154721d(sQLiteDatabase, "");
        C89219l.m154721d(sQLiteDatabase, "");
        sQLiteDatabase.getPath();
        long currentTimeMillis = System.currentTimeMillis();
        C78380b.m136882a().storeLong("short_creation_time", currentTimeMillis);
        C78380b.m136885a(new C78379a("db_create", 0, 0, C78380b.m136887b(), currentTimeMillis, C78380b.m136884a(currentTimeMillis, "UTC"), 6));
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.AbstractC63277e
    /* renamed from: b */
    public final void mo101863b(SQLiteDatabase sQLiteDatabase) {
        C89219l.m154721d(sQLiteDatabase, "");
        C89219l.m154721d(sQLiteDatabase, "");
        C78380b.m136886a("draft db corruption deleted, path: " + sQLiteDatabase.getPath(), false);
        long currentTimeMillis = System.currentTimeMillis();
        C78380b.m136885a(new C78379a("db_corruption_deleted", 0, 0, C78380b.m136887b(), currentTimeMillis, C78380b.m136884a(currentTimeMillis, "UTC"), 6));
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.AbstractC63277e
    /* renamed from: a */
    public final void mo101859a(DraftLoadResult draftLoadResult) {
        C89219l.m154721d(draftLoadResult, "");
        int i = !draftLoadResult.isSuc();
        C40982q.m82520a("aweme_draft_load_fail_rate", i, new C69840ar().mo110190a(C43232f.m86343a(draftLoadResult)).mo110191a());
        C43206f.m86162a("DraftLoad", draftLoadResult.toString());
        if (!draftLoadResult.isSuc()) {
            C40982q.m82520a("aweme_draft_invalid", i, new C69840ar().mo110190a(C43232f.m86343a(draftLoadResult)).mo110191a());
        }
        int errorCode = draftLoadResult.getErrorCode();
        if (errorCode == 0) {
            C80510gr.m139537b("draft_load_success");
        } else {
            C80510gr.m139535a("draft_load_error", String.valueOf(errorCode), (String) null, (String) null, 12);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.AbstractC63277e
    /* renamed from: a */
    public final void mo101860a(DraftSaveResult draftSaveResult) {
        C89219l.m154721d(draftSaveResult, "");
        C40982q.m82520a("aweme_draft_create_fail_rate", !draftSaveResult.isSuc(), new C69840ar().mo110190a(C43232f.m86344a(draftSaveResult)).mo110191a());
        C43206f.m86162a("DraftSave", draftSaveResult.toString());
        int errorCode = draftSaveResult.getErrorCode();
        if (errorCode == 0) {
            C80510gr.m139537b("draft_save_success");
        } else {
            C80510gr.m139535a("draft_save_error", String.valueOf(errorCode), (String) null, (String) null, 12);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.AbstractC63277e
    /* renamed from: a */
    public final void mo101862a(boolean z, Exception exc) {
        String str = null;
        if (z) {
            C40982q.m82520a("draft_list_load_fail_rate", 0, (JSONObject) null);
            return;
        }
        C69840ar arVar = new C69840ar();
        if (exc != null) {
            str = exc.getMessage();
        }
        C40982q.m82520a("draft_list_load_fail_rate", 1, arVar.mo110189a("exception", str).mo110191a());
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.AbstractC63277e
    /* renamed from: a */
    public final void mo101858a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C89219l.m154721d(sQLiteDatabase, "");
        C89219l.m154721d(sQLiteDatabase, "");
        sQLiteDatabase.getPath();
        long currentTimeMillis = System.currentTimeMillis();
        C78380b.m136885a(new C78379a("db_downgrade", i, i2, C78380b.m136887b(), currentTimeMillis, C78380b.m136884a(currentTimeMillis, "UTC")));
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.AbstractC63277e
    /* renamed from: b */
    public final void mo101864b(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C89219l.m154721d(sQLiteDatabase, "");
        C89219l.m154721d(sQLiteDatabase, "");
        sQLiteDatabase.getPath();
        long currentTimeMillis = System.currentTimeMillis();
        C78380b.m136885a(new C78379a("db_upgrade", i, i2, C78380b.m136887b(), currentTimeMillis, C78380b.m136884a(currentTimeMillis, "UTC")));
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.AbstractC63277e
    /* renamed from: a */
    public final void mo101856a(int i, String str, C43223c cVar) {
        String d;
        String str2 = "";
        C89219l.m154721d(str, str2);
        C89219l.m154721d(cVar, str2);
        C43213k.m86181a("[monitorDraftUpdate]: status = " + i + "  errorMsg = " + str + "  errorCode = -1 creation id = " + cVar.mo73676f());
        if (i == -1) {
            d = str2;
        } else {
            d = C43225d.m86334d(cVar);
            if (i != -1) {
                str2 = C43225d.m86335e(cVar);
            }
        }
        C40982q.m82520a("aweme_draft_update_fail_rate", i, new C69840ar().mo110189a("creative_id", cVar.mo73676f()).mo110189a("videoPath", d).mo110189a("fail_reason", str).mo110187a("code", (Integer) -1).mo110189a("copy_video_path", str2).mo110189a("creative_id", cVar.mo73676f()).mo110189a("save_draft_time", C43212j.m86180a(cVar.f100886I, "UTC")).mo110191a());
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.AbstractC63277e
    /* renamed from: a */
    public final void mo101861a(String str, int i, C43223c cVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(cVar, "");
        int hashCode = str.hashCode();
        if (hashCode != 58226776) {
            if (hashCode == 1919799316 && str.equals("user_click")) {
                if (i <= 0) {
                    C80510gr.m139535a("draft_delete_error", "-400", (String) null, (String) null, 12);
                } else {
                    C80510gr.m139537b("draft_delete_success");
                }
                C78380b.m136886a("monitor draft delete: source=" + str + ", primaryKey=" + cVar.mo73726r(), true);
            }
        } else if (str.equals("publish_auto_trigger")) {
            C78380b.m136886a("monitor draft delete: source=" + str + ", primaryKey=" + cVar.mo73726r(), true);
        }
    }
}
