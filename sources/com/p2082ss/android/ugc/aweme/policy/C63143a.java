package com.p2082ss.android.ugc.aweme.policy;

import android.app.Activity;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.ss.android.ugc.aweme.policy.a */
public final class C63143a implements WeakHandler.IHandler {

    /* renamed from: a */
    private WeakHandler f143495a = new WeakHandler(Looper.getMainLooper(), this);

    /* renamed from: b */
    private Activity f143496b;

    static {
        Covode.recordClassIndex(74409);
    }

    /* renamed from: a */
    public final void mo101483a() {
        if (this.f143496b != null) {
            PolicyApi.f143494a.acceptPrivacyPolicy().mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b(new AbstractC88986z<BaseResponse>() {
                /* class com.p2082ss.android.ugc.aweme.policy.C63143a.C631441 */

                static {
                    Covode.recordClassIndex(74410);
                }

                @Override // p4560f.p4561a.AbstractC88986z
                public final void onComplete() {
                }

                @Override // p4560f.p4561a.AbstractC88986z
                public final void onError(Throwable th) {
                }

                @Override // p4560f.p4561a.AbstractC88986z
                public final void onSubscribe(AbstractC88412b bVar) {
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4560f.p4561a.AbstractC88986z
                public final /* synthetic */ void onNext(BaseResponse baseResponse) {
                    BaseResponse baseResponse2 = baseResponse;
                    if (baseResponse2 != null && baseResponse2.status_code == 0) {
                        C31575b.m65865g().getCurUser().setAcceptPrivatePolicy(true);
                    }
                }
            });
        }
    }

    public C63143a(Activity activity) {
        this.f143496b = activity;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        if (message.what == 2 && message.obj != null && (message.obj instanceof BaseResponse) && ((BaseResponse) message.obj).status_code == 0) {
            C31575b.m65865g().queryUser();
        }
    }
}
