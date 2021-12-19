package com.p2082ss.android.ugc.aweme.external;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import androidx.appcompat.app.DialogInterfaceC0216c;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.AbstractC43215m;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.C43225d;
import com.p2082ss.android.ugc.aweme.draft.model.DraftDBSaveResult;
import com.p2082ss.android.ugc.aweme.external.p2916b.C47132d;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.IExternalService;
import com.p2082ss.android.ugc.aweme.services.draft.IDraftService;
import com.p2082ss.android.ugc.aweme.services.effect.IEffectService;
import com.p2082ss.android.ugc.aweme.services.external.IAVDraftService;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.RecordConfig;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C71815es;
import com.p2082ss.android.ugc.aweme.shoutouts.C74418d;
import com.p2082ss.android.ugc.aweme.tools.C77807b;
import com.p2082ss.android.ugc.aweme.tools.draft.C78133ai;
import com.p2082ss.android.ugc.aweme.tools.draft.ftc.pages.C78305h;
import com.p2082ss.android.ugc.aweme.tools.draft.p4110h.C78380b;
import com.p2082ss.android.ugc.aweme.tools.draft.p4112j.C78397c;
import com.p2082ss.android.ugc.tools.view.widget.C85056k;
import dmt.p4542av.video.p4546c.C88243b;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.external.b */
public final class C47107b implements IAVDraftService {
    static {
        Covode.recordClassIndex(55711);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.IAVDraftService
    public final void saveDraftForLocalFile(String str, Intent intent, IDraftService.DraftSaveListener draftSaveListener) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(intent, "");
        C89219l.m154721d(draftSaveListener, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.IAVDraftService
    public final ExecutorService executor() {
        return C77807b.f174559a;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.IAVDraftService
    public final String getDBCreationTime() {
        return C78380b.m136884a(C78380b.m136882a().getLong("short_creation_time", -1), "UTC");
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.IAVDraftService
    public final String getDBEventAsJSON() {
        String string = C78380b.m136882a().getString("db_event", "Unknown");
        C89219l.m154716b(string, "");
        return string;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.IAVDraftService
    public final String getReadableDBPath() {
        C78133ai a = C78133ai.m136600a();
        C89219l.m154716b(a, "");
        String path = a.f175466a.getPath();
        C89219l.m154716b(path, "");
        return path;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.IAVDraftService
    public final List<Integer> queryUserDraftCounts(boolean z) {
        List<Integer> a = C78133ai.m136600a().mo122068a(z);
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.IAVDraftService
    public final void registerListener(IDraftService.DraftListener draftListener) {
        C89219l.m154721d(draftListener, "");
        C78397c.m136927a().registerDraftListener(draftListener);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.IAVDraftService
    public final void unregisterListener(IDraftService.DraftListener draftListener) {
        C89219l.m154721d(draftListener, "");
        C78397c.m136927a().unregisterDraftListener(draftListener);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.IAVDraftService
    public final int queryDraftListCount(boolean z) {
        if (z) {
            return C78133ai.m136600a().mo122071b();
        }
        return C78133ai.m136600a().mo122075d();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.IAVDraftService
    public final DraftDBSaveResult saveDraft(C43223c cVar) {
        C89219l.m154721d(cVar, "");
        DraftDBSaveResult a = C78133ai.m136600a().mo122064a(cVar);
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.IAVDraftService
    public final Fragment showDetailDraft(C43223c cVar) {
        C89219l.m154721d(cVar, "");
        C63238c.m114590a(C71815es.m126788a());
        new C78305h();
        C89219l.m154721d(cVar, "");
        C78305h.f175883h = cVar;
        return new C78305h();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.IAVDraftService
    public final List<C43223c> draftList(boolean z) {
        List<String> list;
        C70005cr a = C70005cr.m123611a();
        C89219l.m154716b(a, "");
        String e = a.mo110455e();
        C89219l.m154716b(e, "");
        boolean d = C63244g.m114602a().mo73287o().mo104784d();
        if (d) {
            list = C63244g.m114602a().mo73287o().mo104787g();
        } else {
            list = C89086z.INSTANCE;
        }
        List<C43223c> a2 = C78133ai.m136600a().mo122065a(new C47108a(z, d, list, e));
        C89219l.m154716b(a2, "");
        return a2;
    }

    /* renamed from: com.ss.android.ugc.aweme.external.b$a */
    public static final class C47108a implements AbstractC43215m {

        /* renamed from: a */
        final /* synthetic */ boolean f109693a;

        /* renamed from: b */
        final /* synthetic */ boolean f109694b;

        /* renamed from: c */
        final /* synthetic */ List f109695c;

        /* renamed from: d */
        final /* synthetic */ String f109696d;

        static {
            Covode.recordClassIndex(55712);
        }

        @Override // com.p2082ss.android.ugc.aweme.draft.AbstractC43215m
        /* renamed from: a */
        public final boolean mo69505a(C43223c cVar) {
            C89219l.m154721d(cVar, "");
            if (cVar.f100900W.f100829bb == 50) {
                return false;
            }
            if (cVar.f100900W.f100788aU != null && !C89361p.m154872a(cVar.f100900W.f100788aU.getShoutOutsMode(), C74418d.MODE_POST, false)) {
                return false;
            }
            if (this.f109693a) {
                return true;
            }
            if (this.f109694b) {
                if (!this.f109695c.contains(cVar.mo73726r())) {
                    return true;
                }
                return false;
            } else if (!TextUtils.equals(cVar.mo73726r(), this.f109696d)) {
                return true;
            } else {
                return false;
            }
        }

        C47108a(boolean z, boolean z2, List list, String str) {
            this.f109693a = z;
            this.f109694b = z2;
            this.f109695c = list;
            this.f109696d = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.b$b */
    static final class DialogInterface$OnClickListenerC47109b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogInterface.OnClickListener f109697a;

        static {
            Covode.recordClassIndex(55713);
        }

        DialogInterface$OnClickListenerC47109b(DialogInterface.OnClickListener onClickListener) {
            this.f109697a = onClickListener;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f109697a.onClick(dialogInterface, i);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.IAVDraftService
    public final void deleteDraft(int i, C43223c cVar) {
        C89219l.m154721d(cVar, "");
        C78397c.m136927a().delete(cVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.IAVDraftService
    public final void loadAwemeDraftThumbCover(C43223c cVar, IEffectService.OnVideoCoverCallback onVideoCoverCallback) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(onVideoCoverCallback, "");
        C43225d.m86328a(cVar, onVideoCoverCallback);
    }

    /* renamed from: com.ss.android.ugc.aweme.external.b$c */
    static final class DialogInterface$OnClickListenerC47110c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogInterface.OnClickListener f109698a;

        /* renamed from: b */
        final /* synthetic */ Activity f109699b;

        static {
            Covode.recordClassIndex(55714);
        }

        DialogInterface$OnClickListenerC47110c(DialogInterface.OnClickListener onClickListener, Activity activity) {
            this.f109698a = onClickListener;
            this.f109699b = activity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f109698a.onClick(dialogInterface, i);
            AVExternalServiceImpl.m113114a().asyncService("AVDraftServiceImpl", new IExternalService.ServiceLoadCallback(this) {
                /* class com.p2082ss.android.ugc.aweme.external.C47107b.DialogInterface$OnClickListenerC47110c.C471111 */

                /* renamed from: a */
                final /* synthetic */ DialogInterface$OnClickListenerC47110c f109700a;

                static {
                    Covode.recordClassIndex(55715);
                }

                @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onDismiss() {
                    IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                }

                @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onFailed() {
                    IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                }

                @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onOK() {
                    IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f109700a = r1;
                }

                @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onLoad(AsyncAVService asyncAVService, long j) {
                    C89219l.m154721d(asyncAVService, "");
                    C88243b.C88244a aVar = C88243b.f200282d;
                    Application application = C63238c.f143574a;
                    C89219l.m154716b(application, "");
                    aVar.mo142775a(application).mo142774b();
                    RecordConfig.Builder builder = new RecordConfig.Builder();
                    builder.shootWay("restore_crash").restoreType(2).creationId(UUID.randomUUID().toString()).decompressTime(j);
                    new C47132d().startRecord(this.f109700a.f109699b, builder.build());
                }
            });
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.IAVDraftService
    public final C43223c queryDraft(int i, String str) {
        C89219l.m154721d(str, "");
        if (i != 1) {
            return null;
        }
        return C78133ai.m136600a().mo122076e(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.IAVDraftService
    public final Dialog restoreDialog(Activity activity, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(onClickListener, "");
        C89219l.m154721d(onClickListener2, "");
        DialogInterfaceC0216c a = C85056k.m146251a(activity, new DialogInterface$OnClickListenerC47109b(onClickListener), new DialogInterface$OnClickListenerC47110c(onClickListener2, activity));
        C89219l.m154716b(a, "");
        return a;
    }
}
