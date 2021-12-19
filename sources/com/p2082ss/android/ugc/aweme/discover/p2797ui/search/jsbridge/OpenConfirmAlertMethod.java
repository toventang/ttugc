package com.p2082ss.android.ugc.aweme.discover.p2797ui.search.jsbridge;

import android.content.Context;
import androidx.core.p035f.C0674b;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.search.C42912b;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.OpenConfirmAlertMethod */
public final class OpenConfirmAlertMethod extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: a */
    private WeakReference<Context> f100062a;

    static {
        Covode.recordClassIndex(51020);
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.OpenConfirmAlertMethod$a */
    static final class C42914a extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ String f100063a;

        /* renamed from: b */
        final /* synthetic */ String f100064b;

        /* renamed from: c */
        final /* synthetic */ String f100065c;

        /* renamed from: d */
        final /* synthetic */ BaseCommonJavaMethod.AbstractC47813a f100066d;

        /* renamed from: e */
        final /* synthetic */ String f100067e;

        static {
            Covode.recordClassIndex(51021);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42914a(String str, String str2, String str3, BaseCommonJavaMethod.AbstractC47813a aVar, String str4) {
            super(1);
            this.f100063a = str;
            this.f100064b = str2;
            this.f100065c = str3;
            this.f100066d = aVar;
            this.f100067e = str4;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37417a(this.f100065c, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.discover.p2797ui.search.jsbridge.OpenConfirmAlertMethod.C42914a.C429151 */

                /* renamed from: a */
                final /* synthetic */ C42914a f100068a;

                static {
                    Covode.recordClassIndex(51022);
                }

                {
                    this.f100068a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    BaseCommonJavaMethod.AbstractC47813a aVar2 = this.f100068a.f100066d;
                    if (aVar2 != null) {
                        aVar2.mo79886a("confirm");
                    }
                    return C89391z.f203057a;
                }
            });
            bVar2.mo37419b(this.f100067e, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.discover.p2797ui.search.jsbridge.OpenConfirmAlertMethod.C42914a.C429162 */

                /* renamed from: a */
                final /* synthetic */ C42914a f100069a;

                static {
                    Covode.recordClassIndex(51023);
                }

                {
                    this.f100069a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    BaseCommonJavaMethod.AbstractC47813a aVar2 = this.f100069a.f100066d;
                    if (aVar2 != null) {
                        aVar2.mo79886a("cancel");
                    }
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenConfirmAlertMethod(WeakReference<Context> weakReference, C18288a aVar) {
        super(aVar);
        C89219l.m154721d(weakReference, "");
        C89219l.m154721d(aVar, "");
        this.f100062a = weakReference;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        Context context;
        if (jSONObject != null) {
            try {
                String optString = jSONObject.optString("title");
                String optString2 = jSONObject.optString("content");
                String optString3 = jSONObject.optString("cancelText");
                String optString4 = jSONObject.optString("confirmText");
                if (optString == null) {
                    optString = "";
                }
                if (optString2 == null) {
                    optString2 = "";
                }
                if (optString3 == null) {
                    optString3 = "";
                }
                if (optString4 == null) {
                    optString4 = "";
                }
                C89219l.m154721d(optString, "");
                C89219l.m154721d(optString2, "");
                C89219l.m154721d(optString3, "");
                C89219l.m154721d(optString4, "");
                WeakReference<Context> weakReference = this.f100062a;
                if (weakReference != null && (context = weakReference.get()) != null) {
                    C89219l.m154716b(context, "");
                    ((C23023b) C23028c.m43435a(new C23023b(context).mo37411b(optString).mo37413d(C0674b.m2427a(optString2, 0)), new C42914a(optString, optString2, optString4, aVar, optString3)).mo37482a(false)).mo37405a().mo37396b().show();
                }
            } catch (Exception e) {
                C42912b.m85668a(e, "DisableInterceptMethod");
                if (aVar != null) {
                    aVar.mo79885a(0, e.getMessage());
                }
                e.printStackTrace();
            }
        }
    }
}
