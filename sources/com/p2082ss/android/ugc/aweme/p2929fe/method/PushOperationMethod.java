package com.p2082ss.android.ugc.aweme.p2929fe.method;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import com.p2082ss.android.ugc.aweme.utils.C80411ew;
import com.p2082ss.android.ugc.aweme.utils.C80428fg;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.fe.method.PushOperationMethod */
public final class PushOperationMethod extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C47876a f110889b = new C47876a((byte) 0);

    /* renamed from: a */
    public String f110890a = "";

    static {
        Covode.recordClassIndex(56549);
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.PushOperationMethod$a */
    public static final class C47876a {
        static {
            Covode.recordClassIndex(56550);
        }

        private C47876a() {
        }

        public /* synthetic */ C47876a(byte b) {
            this();
        }
    }

    public PushOperationMethod(C18288a aVar) {
        super(aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.PushOperationMethod$b */
    static final class DialogInterface$OnClickListenerC47877b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PushOperationMethod f110891a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f110892b;

        /* renamed from: c */
        final /* synthetic */ BaseCommonJavaMethod.AbstractC47813a f110893c;

        /* renamed from: d */
        final /* synthetic */ Context f110894d;

        static {
            Covode.recordClassIndex(56551);
        }

        DialogInterface$OnClickListenerC47877b(PushOperationMethod pushOperationMethod, C89233z.C89238e eVar, BaseCommonJavaMethod.AbstractC47813a aVar, Context context) {
            this.f110891a = pushOperationMethod;
            this.f110892b = eVar;
            this.f110893c = aVar;
            this.f110894d = context;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            String str = this.f110891a.f110890a;
            HashMap hashMap = new HashMap();
            C80411ew.m139396a(str, hashMap);
            C39162r.m79460a("push_pre_permission_auth", hashMap);
            this.f110892b.element.put("auth_result", 2);
            this.f110893c.mo79888a((JSONObject) this.f110892b.element);
            try {
                C80428fg.m139435c(this.f110894d);
            } catch (Exception unused) {
                Context context = this.f110894d;
                Intent intent = new Intent("android.settings.SETTINGS");
                C84349a.m145093a(intent, context);
                context.startActivity(intent);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.PushOperationMethod$c */
    static final class DialogInterface$OnClickListenerC47878c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PushOperationMethod f110895a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f110896b;

        /* renamed from: c */
        final /* synthetic */ BaseCommonJavaMethod.AbstractC47813a f110897c;

        static {
            Covode.recordClassIndex(56552);
        }

        DialogInterface$OnClickListenerC47878c(PushOperationMethod pushOperationMethod, C89233z.C89238e eVar, BaseCommonJavaMethod.AbstractC47813a aVar) {
            this.f110895a = pushOperationMethod;
            this.f110896b = eVar;
            this.f110897c = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            String str = this.f110895a.f110890a;
            HashMap hashMap = new HashMap();
            C80411ew.m139396a(str, hashMap);
            C39162r.m79460a("push_pre_permission_deny", hashMap);
            this.f110896b.element.put("auth_result", 0);
            this.f110897c.mo79888a((JSONObject) this.f110896b.element);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        Context context;
        Activity activity;
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        if (this.mContextRef != null) {
            context = (Context) this.mContextRef.get();
        } else {
            context = null;
        }
        String optString = jSONObject.optString("track_info", "");
        C89219l.m154716b(optString, "");
        this.f110890a = optString;
        if (context instanceof Activity) {
            activity = (Activity) context;
        } else {
            activity = null;
        }
        if (activity == null || activity.isFinishing()) {
            aVar.mo79885a(0, null);
        } else if (!C80428fg.m139432a(activity)) {
            C17197a.C17200a aVar2 = new C17197a.C17200a(activity);
            C89233z.C89238e eVar = new C89233z.C89238e();
            eVar.element = (T) new JSONObject();
            eVar.element.put("code", 1);
            aVar2.mo27189a(R.string.foq).mo27194b(R.string.fot).mo27190a(R.string.fos, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC47877b(this, eVar, aVar, activity), false).mo27195b(R.string.f205090for, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC47878c(this, eVar, aVar), false).mo27193a().mo27184b();
            String str = this.f110890a;
            HashMap hashMap = new HashMap();
            C80411ew.m139396a(str, hashMap);
            C39162r.m79460a("push_pre_permission_show", hashMap);
        } else {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", 1);
            jSONObject2.put("auth_result", 1);
            aVar.mo79888a(jSONObject2);
        }
    }
}
