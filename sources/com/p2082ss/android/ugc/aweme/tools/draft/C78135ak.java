package com.p2082ss.android.ugc.aweme.tools.draft;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.cukaie.closet.C14401a;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.draft.C43205e;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.experiment.C46787cd;
import com.p2082ss.android.ugc.aweme.p2690cr.p2697d.p2698a.C40340a;
import com.p2082ss.android.ugc.aweme.p2730de.C40970e;
import com.p2082ss.android.ugc.aweme.port.internal.IVideoRecordPreferences;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.services.draft.IDraftService;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C70621cx;
import com.p2082ss.android.ugc.aweme.shortvideo.C70622cy;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70974bn;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3827b.C71429d;
import com.p2082ss.android.ugc.aweme.shortvideo.p3793af.C69823b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3854r.C72724a;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.C73917r;
import com.p2082ss.android.ugc.aweme.tools.draft.p4104e.C78245a;
import com.p2082ss.android.ugc.aweme.tools.draft.p4104e.C78247b;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80285bz;
import com.p2082ss.android.ugc.gamora.recorder.p4306m.C83891d;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.io.Serializable;
import java.security.SecureRandom;
import java.util.concurrent.atomic.AtomicInteger;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.ak */
public final class C78135ak {

    /* renamed from: a */
    private static AtomicInteger f175469a = new AtomicInteger(0);

    static {
        Covode.recordClassIndex(91250);
    }

    /* renamed from: a */
    private static void m136629a(ProgressDialog progressDialog) {
        if (progressDialog != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
    }

    /* renamed from: a */
    private static String m136628a(C43223c cVar) {
        if (cVar == null) {
            return "";
        }
        if (cVar.f100900W.f100781aN) {
            return "slideshow";
        }
        if (cVar.mo73701k()) {
            return "mv";
        }
        return "video";
    }

    /* renamed from: b */
    private static void m136632b(C43223c cVar) {
        IVideoRecordPreferences iVideoRecordPreferences = (IVideoRecordPreferences) new C14401a((byte) 0).mo23215a(C63247i.f143610a, IVideoRecordPreferences.class);
        if (!TextUtils.isEmpty(iVideoRecordPreferences.getUploadRecoverPath("")) && iVideoRecordPreferences.getUploadRecoverPath("").equals(cVar.mo73726r())) {
            iVideoRecordPreferences.setUploadRecoverPath("");
            C63253l.f143623a.mo73314j().mo93935a(false);
        }
    }

    /* renamed from: a */
    public static Intent m136626a(VideoPublishEditModel videoPublishEditModel, int i, long j, C43223c cVar) {
        Intent a = C78179az.m136668a(videoPublishEditModel, i);
        a.putExtra("shoot_way", videoPublishEditModel.mShootWay);
        a.putExtra("translation_type", 3);
        a.putExtra("args", (Serializable) videoPublishEditModel);
        C40970e.m82485a("GoPublishActivity from draft");
        a.putExtra("fromDraft", 1);
        a.putExtra("draft_to_edit_from", i);
        a.putExtra("edit_publish_session_end_together", true);
        a.putExtra("draft_to_edit_start_time", j);
        a.putExtra("draft_modify_time", cVar.f100886I);
        C40340a aVar = new C40340a();
        aVar.mo69486a(cVar);
        a.putExtra("draft_file_size", aVar.mo69485a());
        a.putExtra("auto_selected_anchor", videoPublishEditModel.autoAttachedAnchor);
        a.putExtra("open_platform_extra", videoPublishEditModel.openPlatformExtra);
        a.putExtra("open_platform_client_key", videoPublishEditModel.openPlatformClientKey);
        return a;
    }

    /* renamed from: a */
    public static void m136630a(ActivityC0945e eVar, C43223c cVar, int i, long j, IDraftService.DraftListener draftListener) {
        String str;
        if (cVar != null) {
            if (!C63244g.m114602a().mo73287o().mo104784d()) {
                C70005cr.m123611a();
                if (!C70005cr.m123613a(eVar)) {
                    return;
                }
            }
            if (cVar.mo73705l() || cVar.mo73709m()) {
                C23023b bVar = new C23023b(eVar);
                C23025b bVar2 = new C23025b(eVar);
                bVar2.mo37416a(R.string.g2t, new C78136al(cVar));
                bVar2.mo37418b(R.string.g2u, (AbstractC89172b<? super C23024a, C89391z>) null);
                if (cVar.mo73705l()) {
                    str = eVar.getString(R.string.g2v);
                } else if (cVar.mo73709m()) {
                    str = eVar.getString(R.string.fyg);
                } else {
                    str = "";
                }
                ((C23023b) bVar.mo37479a(R.string.g2w)).mo37413d(str).mo37407a(bVar2).mo37405a().mo37396b().show();
            } else if (!C43205e.m86158a(cVar, true).isSuc()) {
                new C79459a(eVar).mo123050a(R.string.cna).mo123053a();
            } else {
                if (cVar.mo73713n()) {
                    C71429d.m126159b();
                }
                ProgressDialog a = C78245a.m136731a(eVar, C78137am.f175471a);
                C69905c cVar2 = cVar.f100906f;
                if (cVar2 == null || cVar.f100900W.f100860i == 1) {
                    m136631a(cVar, a, eVar, i, j, true);
                } else {
                    C40970e.m82485a("editDraft() musicModel path = [" + C63238c.f143575b.mo46674b(cVar2) + "]");
                    if (!((cVar.f100897T == null && cVar.mo73681g() == null) || cVar.f100908h == null)) {
                        File file = new File(cVar.f100908h);
                        boolean exists = file.exists();
                        C40970e.m82485a("editDraft() duet music path = [" + cVar.f100908h + "], isMusicExist: " + exists);
                        if ((exists && file.length() > 0) || C69823b.m123386a(eVar, Uri.parse(cVar.f100908h))) {
                            m136631a(cVar, a, eVar, i, j, true);
                            return;
                        }
                    }
                    C78178ay.m136667a(eVar, cVar, new C78138an(cVar, draftListener, a, eVar, i, j), C78139ao.f175478a).mo122037a();
                }
                C40970e.m82485a("editDraft() called with: view = [" + cVar + "]");
            }
        }
    }

    /* renamed from: a */
    private static void m136631a(C43223c cVar, ProgressDialog progressDialog, ActivityC0945e eVar, int i, long j, boolean z) {
        String str;
        cVar.mo73730s(new SecureRandom().nextInt(Integer.MAX_VALUE));
        m136629a(progressDialog);
        m136632b(cVar);
        if (TextUtils.isEmpty(cVar.f100900W.f100857f)) {
            cVar.mo73716o(C78247b.m136733a());
            C1731i.m5640b(new CallableC78140ap(cVar), C1731i.f5562a);
        }
        C84425b a = new C84425b().mo129406a("creation_id", cVar.mo73676f()).mo129406a("shoot_way", cVar.f100900W.f100855d).mo129403a("draft_list_order", cVar.f100912l + 1).mo129405a("since_first_save_time", Double.valueOf(C78176aw.m136660a(cVar.f100887J)));
        if (cVar.f100900W.f100856e != 0) {
            a.mo129403a("draft_id", cVar.f100900W.f100856e);
        }
        if (!TextUtils.isEmpty(cVar.f100900W.f100857f)) {
            a.mo129406a("new_draft_id", cVar.f100900W.f100857f);
        }
        C73917r.m130010b(cVar.mo73676f());
        C84425b a2 = a.mo129406a("content_type", m136628a(cVar));
        if (cVar.mo73701k() || cVar.f100900W.f100820b == 1 || cVar.f100900W.f100820b == 0) {
            str = "upload";
        } else {
            str = "shoot";
        }
        a2.mo129406a("content_source", str);
        if (cVar.f100906f != null) {
            a.mo129404a("music_id", cVar.f100906f.f156195id);
        }
        C39162r.m79460a("edit_draft", a.mo129403a("is_available_sound", z ? 1 : 0).f188764a);
        new C70974bn("AwemeDraftViewHolder");
        VideoPublishEditModel a3 = C70974bn.m125289a(cVar);
        a3.mDraftToEditFrom = i;
        boolean a4 = C63244g.m114602a().mo73255A().mo93901a();
        if (C46787cd.m90133a() && !C83891d.m144283a(a3)) {
            a3.isShoutout();
        }
        if (!C46787cd.m90133a() || C83891d.m144283a(a3) || a3.isShoutout() || a4) {
            Intent intent = new Intent();
            intent.putExtra("shoot_way", "edit_draft");
            intent.putExtra("translation_type", 3);
            intent.putExtra("args", (Serializable) a3);
            C40970e.m82485a("GoPublishActivity from draft");
            intent.putExtra("fromDraft", 1);
            intent.putExtra("draft_to_edit_from", i);
            intent.putExtra("edit_publish_session_end_together", true);
            intent.putExtra("draft_to_edit_start_time", j);
            intent.putExtra("draft_modify_time", cVar.f100886I);
            C40340a aVar = new C40340a();
            aVar.mo69486a(cVar);
            intent.putExtra("draft_file_size", aVar.mo69485a());
            C70622cy.m124766a(new C70621cx("edit_draft", cVar.mo73676f(), "fromDraft"));
            C72724a.m128203a().mo62200b((Context) eVar, intent);
            C84911q.m145928d("DraftEditHelper after openVideoPublishPage");
        } else {
            Intent a5 = m136626a(a3, i, j, cVar);
            C70622cy.m124766a(new C70621cx("edit_draft", cVar.mo73676f(), "fromDraft"));
            C78179az.m136669a(a3, eVar, new C78141aq(eVar, a5));
        }
        C70005cr.m123611a().mo70083a(cVar.f100906f);
    }

    /* renamed from: a */
    static final /* synthetic */ C89391z m136627a(C43223c cVar, IDraftService.DraftListener draftListener, ProgressDialog progressDialog, ActivityC0945e eVar, int i, long j, Boolean bool) {
        if (!bool.booleanValue()) {
            boolean isPgc = cVar.f100906f.isPgc();
            cVar.f100906f = null;
            cVar.f100908h = null;
            cVar.f100914n = 0;
            cVar.f100911k = 50;
            cVar.mo73725q(true);
            cVar.f100904d = 2;
            C63238c.f143565C.mo73275c().mo101842a(cVar);
            draftListener.onDraftUpdate(cVar);
            C39162r.m79460a("delete_draft_unavailable_sound", new C84425b().mo129406a("enter_from", "enter_personal_homepage").mo129406a("creation_id", cVar.mo73676f()).mo129406a("user_id", C63238c.f143594u.mo93906e().mo58660c()).mo129403a("delete_cause", isPgc ? 1 : 0).f188764a);
            C80285bz.m139184a(cVar);
        }
        m136631a(cVar, progressDialog, eVar, i, j, bool.booleanValue());
        return null;
    }
}
