package com.p2082ss.android.ugc.aweme.web.jsbridge;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.detail.p2750i.AbstractC41240m;
import com.p2082ss.android.ugc.aweme.detail.p2750i.C41235i;
import com.p2082ss.android.ugc.aweme.detail.p2750i.C41237j;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import com.p2082ss.android.ugc.aweme.qrcode.view.ProgressDialogC66468a;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.OpenLongVideoMethod */
public final class OpenLongVideoMethod extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: a */
    public static final C81562a f182380a = new C81562a((byte) 0);

    /* renamed from: b */
    private ProgressDialogC66468a f182381b;

    /* renamed from: d */
    private String f182382d;

    static {
        Covode.recordClassIndex(94953);
    }

    private OpenLongVideoMethod(byte b) {
        this();
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.OpenLongVideoMethod$a */
    public static final class C81562a {
        static {
            Covode.recordClassIndex(94954);
        }

        private C81562a() {
        }

        public /* synthetic */ C81562a(byte b) {
            this();
        }
    }

    private /* synthetic */ OpenLongVideoMethod() {
        this((C18288a) null);
    }

    /* renamed from: c */
    public final void mo79916c() {
        ProgressDialogC66468a aVar;
        Activity activity = (Activity) this.mContextRef.get();
        if (activity != null && !activity.isFinishing() && (aVar = this.f182381b) != null && aVar.isShowing()) {
            try {
                ProgressDialogC66468a aVar2 = this.f182381b;
                if (aVar2 != null) {
                    aVar2.dismiss();
                }
            } catch (Throwable unused) {
            }
        }
    }

    public OpenLongVideoMethod(C18288a aVar) {
        super(aVar);
        this.f182382d = "";
    }

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.OpenLongVideoMethod$b */
    public static final class C81563b implements AbstractC41240m {

        /* renamed from: a */
        final /* synthetic */ OpenLongVideoMethod f182383a;

        /* renamed from: b */
        final /* synthetic */ C41237j f182384b;

        static {
            Covode.recordClassIndex(94955);
        }

        @Override // com.p2082ss.android.ugc.aweme.detail.p2750i.AbstractC41240m
        /* renamed from: a */
        public final void mo61907a(Aweme aweme) {
            C89219l.m154721d(aweme, "");
            this.f182383a.mo79916c();
            this.f182384b.mo67840h();
            this.f182384b.ck_();
        }

        @Override // com.p2082ss.android.ugc.aweme.detail.p2750i.AbstractC41240m
        /* renamed from: b_ */
        public final void mo61908b_(Exception exc) {
            C89219l.m154721d(exc, "");
            this.f182383a.mo79916c();
            this.f182384b.mo67840h();
            this.f182384b.ck_();
        }

        C81563b(OpenLongVideoMethod openLongVideoMethod, C41237j jVar) {
            this.f182383a = openLongVideoMethod;
            this.f182384b = jVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final BaseCommonJavaMethod attach(WeakReference<Context> weakReference) {
        C89219l.m154721d(weakReference, "");
        Context context = weakReference.get();
        if (context instanceof AbstractC1204m) {
            ((AbstractC1204m) context).getLifecycle().mo4012a(this);
        }
        BaseCommonJavaMethod attach = super.attach(weakReference);
        C89219l.m154716b(attach, "");
        return attach;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        if (jSONObject != null) {
            String str = null;
            if (jSONObject.has("aweme_id")) {
                this.f182382d = jSONObject.optString("react_id");
                String optString = jSONObject.optString("aweme_id");
                jSONObject.optDouble("current_time");
                jSONObject.optString("enter_from");
                Context actContext = getActContext();
                if (actContext != null) {
                    C89219l.m154716b(optString, "");
                    Resources resources = actContext.getResources();
                    if (resources != null) {
                        str = resources.getString(R.string.cxn);
                    }
                    ProgressDialogC66468a a = ProgressDialogC66468a.m118220a(actContext, str);
                    this.f182381b = a;
                    if (a != null) {
                        a.setIndeterminate(false);
                    }
                    C41237j jVar = new C41237j();
                    jVar.mo67839a_(new C81563b(this, jVar));
                    jVar.mo67838a(new C41235i());
                    jVar.mo57616a(optString);
                }
            }
        }
        if (aVar != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", 1);
            aVar.mo79888a(jSONObject2);
        }
    }
}
