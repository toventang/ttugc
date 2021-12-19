package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.Context;
import com.bytedance.android.live.base.model.user.C2996c;
import com.bytedance.android.live.core.p215e.p217b.C3886a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.browser.p465f.C7019d;
import com.bytedance.android.livesdk.p562k.DialogC9146a;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11265g;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.u */
public final /* synthetic */ class C7220u implements AbstractC89172b {

    /* renamed from: a */
    private final C7206t f17982a;

    static {
        Covode.recordClassIndex(7966);
    }

    C7220u(C7206t tVar) {
        this.f17982a = tVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        byte[] a;
        C7206t tVar = this.f17982a;
        String str = (String) obj;
        if (tVar.f17939d == null) {
            tVar.f17939d = new DialogC9146a.C9147a(tVar.f17938c.getActivity()).mo15240a();
            tVar.f17939d.mo15238a(C3966y.m9657a((int) R.string.gs0));
            tVar.f17939d.setCancelable(false);
        }
        if (!tVar.f17939d.isShowing()) {
            tVar.f17939d.show();
        }
        File file = new File(str);
        if (!file.exists() || (a = C11265g.m19962a(file)) == null || a.length == 0) {
            return null;
        }
        AbstractC88403ab.m153602a(tVar.f17942g).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142925c(new C7222w(tVar, a)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo116431a_(new AbstractC88406ae<C5832d<C2996c>>(str, a) {
            /* class com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7206t.C72169 */

            /* renamed from: a */
            final /* synthetic */ String f17970a;

            /* renamed from: b */
            final /* synthetic */ byte[] f17971b;

            static {
                Covode.recordClassIndex(7962);
            }

            @Override // p4560f.p4561a.AbstractC88406ae
            public final void onSubscribe(AbstractC88412b bVar) {
                C7206t.this.f17937b = bVar;
            }

            @Override // p4560f.p4561a.AbstractC88406ae
            public final void onError(Throwable th) {
                Context context = C7206t.this.f17938c.getContext();
                if (context != null) {
                    C3886a.m9503a(context, th, null);
                }
                if (this.f17971b.length > 0 || C7206t.this.f17941f >= 10) {
                    C11226ao.m19882a(C3966y.m9669e(), (int) R.string.guc);
                    C7206t.this.mo13402c();
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.AbstractC88406ae
            public final /* synthetic */ void onSuccess(C5832d<C2996c> dVar) {
                C5832d<C2996c> dVar2 = dVar;
                ((C2996c) dVar2.data).f8818b = ((C2996c) dVar2.data).f8818b;
                C7206t tVar = C7206t.this;
                String str = this.f17970a;
                tVar.mo13400a();
                C7217a aVar = new C7217a();
                aVar.f17973a = ((C2996c) dVar2.data).f8817a;
                C7019d.m14971a();
                aVar.f17975c = C7019d.m14973a(str);
                tVar.finishWithResult(new C7218b(0, C3966y.m9657a((int) R.string.gk8), aVar, (byte) 0));
            }

            {
                this.f17970a = r2;
                this.f17971b = r3;
            }
        });
        return null;
    }
}
