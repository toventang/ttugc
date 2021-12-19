package com.p2082ss.android.ugc.aweme.tools.mvtemplate;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task.AbstractC73799a;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.PanelInfoModel;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.e */
final /* synthetic */ class C78946e implements AbstractC73799a {

    /* renamed from: a */
    private final C78917b f177440a;

    static {
        Covode.recordClassIndex(92095);
    }

    C78946e(C78917b bVar) {
        this.f177440a = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task.AbstractC73799a
    /* renamed from: b */
    public final boolean mo88344b() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task.AbstractC73799a
    /* renamed from: a */
    public final void mo88343a() {
        C78917b bVar = this.f177440a;
        bVar.f177391c.mo78908a("mv", true, "all", 0, 0, (IFetchPanelInfoListener) new IFetchPanelInfoListener() {
            /* class com.p2082ss.android.ugc.aweme.tools.mvtemplate.C78917b.C789181 */

            static {
                Covode.recordClassIndex(92067);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final /* synthetic */ void onSuccess(PanelInfoModel panelInfoModel) {
                C78917b.m137706a(true, 0, (Exception) null);
            }

            @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener
            public final void onFail(ExceptionResult exceptionResult) {
                if (exceptionResult == null) {
                    C78917b.m137706a(false, 1, (Exception) null);
                } else {
                    C78917b.m137706a(false, exceptionResult.getErrorCode(), exceptionResult.getException());
                }
            }
        });
    }
}
