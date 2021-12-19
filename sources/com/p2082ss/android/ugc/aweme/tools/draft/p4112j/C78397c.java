package com.p2082ss.android.ugc.aweme.tools.draft.p4112j;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.draft.AbstractC43215m;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.DraftDBSaveResult;
import com.p2082ss.android.ugc.aweme.p2477ci.C36081b;
import com.p2082ss.android.ugc.aweme.p2690cr.p2697d.C40346b;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.services.draft.IDraftService;
import com.p2082ss.android.ugc.aweme.services.story.IStoryDraftService;
import com.p2082ss.android.ugc.aweme.shortvideo.C70638dj;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3827b.C71429d;
import com.p2082ss.android.ugc.aweme.story.draft.StoryDraftServiceImpl;
import com.p2082ss.android.ugc.aweme.tools.C77807b;
import com.p2082ss.android.ugc.aweme.tools.draft.C78133ai;
import com.p2082ss.android.ugc.aweme.tools.draft.DraftBoxActivity;
import com.p2082ss.android.ugc.aweme.tools.draft.p4113k.C78399a;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.j.c */
public final class C78397c implements IDraftService {

    /* renamed from: a */
    private static IDraftService f176139a;

    /* renamed from: b */
    private List<IDraftService.DraftListener> f176140b = new ArrayList();

    static {
        Covode.recordClassIndex(91523);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.draft.IDraftService
    public final ExecutorService getDraftExecutor() {
        return C77807b.f174559a;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.draft.IDraftService
    public final List<C43223c> queryList() {
        return C78133ai.m136600a().mo122065a((AbstractC43215m) null);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.draft.IDraftService
    public final int queryMyDraftCount() {
        return C78133ai.m136600a().mo122071b();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.draft.IDraftService
    public final void notifyDraftClean() {
        for (IDraftService.DraftListener draftListener : this.f176140b) {
            draftListener.onDraftClean();
        }
    }

    /* renamed from: a */
    public static IDraftService m136927a() {
        MethodCollector.m26663i(7573);
        if (f176139a == null) {
            synchronized (C78133ai.class) {
                try {
                    if (f176139a == null) {
                        f176139a = new C78397c();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7573);
                    throw th;
                }
            }
        }
        IDraftService iDraftService = f176139a;
        MethodCollector.m26664o(7573);
        return iDraftService;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.draft.IDraftService
    public final void unregisterDraftListener(IDraftService.DraftListener draftListener) {
        this.f176140b.remove(draftListener);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.draft.IDraftService
    public final String calculateDraftDir(C43223c cVar) {
        if (cVar == null) {
            return null;
        }
        return C40346b.m81525a(cVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.draft.IDraftService
    public final C43223c queryDraft(String str) {
        return C78133ai.m136600a().mo122076e(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.draft.IDraftService
    public final C43223c queryDraftWithUserId(String str) {
        return C78133ai.m136600a().mo122077f(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.draft.IDraftService
    public final void registerDraftListener(IDraftService.DraftListener draftListener) {
        if (!this.f176140b.contains(draftListener)) {
            this.f176140b.add(draftListener);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.draft.IDraftService
    public final DraftDBSaveResult save(C43223c cVar) {
        return C78133ai.m136600a().mo122064a(cVar);
    }

    /* renamed from: a */
    private static void m136928a(List<C43223c> list) {
        IStoryDraftService a = StoryDraftServiceImpl.m134289a();
        if (a != null) {
            List<C43223c> queryDraftList = a.queryDraftList();
            if (!queryDraftList.isEmpty()) {
                list.addAll(queryDraftList);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.draft.IDraftService
    public final void enterDraftBox(Activity activity) {
        C63244g.m114602a().mo73290r().mo86005c().mo86020a();
        DraftBoxActivity.m136565a(activity);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.draft.IDraftService
    public final void notifyDraftDelete(C43223c cVar) {
        List<IDraftService.DraftListener> list = this.f176140b;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f176140b.get(size).onDraftDelete(cVar);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.draft.IDraftService
    public final void notifyDraftUpdate(C43223c cVar) {
        for (IDraftService.DraftListener draftListener : this.f176140b) {
            draftListener.onDraftUpdate(cVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.draft.IDraftService
    public final List<C43223c> queryAllDraftList(boolean z) {
        List<C43223c> c = C78133ai.m136600a().mo122074c();
        if (!z) {
            return c;
        }
        ArrayList arrayList = new ArrayList();
        if (!c.isEmpty()) {
            arrayList.addAll(c);
        }
        m136928a(arrayList);
        return arrayList;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.draft.IDraftService
    public final int queryMyDraftCount(AbstractC43215m mVar) {
        C78133ai a = C78133ai.m136600a();
        if (mVar == null) {
            return a.mo122071b();
        }
        return a.mo122065a(mVar).size();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.draft.IDraftService
    public final void delete(C43223c cVar) {
        C78133ai.m136600a().mo122072b(cVar);
        C63253l.f143623a.mo73308d().mo101651a().mo101657a(cVar);
        C89219l.m154721d(cVar, "");
        C1731i.m5640b(new C78399a.CallableC78400a(cVar), C1731i.f5562a);
        C1731i.m5640b(C36081b.CallableC36082a.f85248a, C1731i.f5562a);
        if (cVar != null && cVar.mo73713n()) {
            C1731i.m5640b(new C71429d.CallableC71430a(cVar), C1731i.f5562a);
        }
        if (cVar.mo73675e()) {
            C84902i.m145899c(C70638dj.f158103f + "duet/" + cVar.mo73676f());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.draft.IDraftService
    public final void enterDraftBoxWithArgs(Activity activity, Bundle bundle) {
        C63244g.m114602a().mo73290r().mo86005c().mo86020a();
        DraftBoxActivity.m136567a(activity, bundle);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.draft.IDraftService
    public final void notifyDraftCheckedChanged(C43223c cVar, boolean z) {
        for (IDraftService.DraftListener draftListener : this.f176140b) {
            draftListener.onDraftCheckedChanged(cVar, z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.draft.IDraftService
    public final List<C43223c> queryListWithFilter(boolean z, AbstractC43215m mVar) {
        List<C43223c> a = C78133ai.m136600a().mo122065a(mVar);
        if (!z) {
            return a;
        }
        ArrayList arrayList = new ArrayList();
        if (!a.isEmpty()) {
            arrayList.addAll(a);
        }
        m136928a(arrayList);
        return arrayList;
    }
}
