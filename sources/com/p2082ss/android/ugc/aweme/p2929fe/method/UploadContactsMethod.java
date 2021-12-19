package com.p2082ss.android.ugc.aweme.p2929fe.method;

import android.app.Activity;
import android.os.Looper;
import android.os.Message;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.sdk.webview.C30246d;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.AbstractC51735f;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import com.p2082ss.android.ugc.aweme.user.p4197d.C80058a;
import com.p2082ss.android.ugc.aweme.utils.C80241be;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.fe.method.UploadContactsMethod */
public final class UploadContactsMethod extends BaseCommonJavaMethod implements WeakHandler.IHandler, AbstractC33974au {

    /* renamed from: b */
    public static final C47906a f110953b = new C47906a((byte) 0);

    /* renamed from: a */
    public final WeakHandler f110954a;

    /* renamed from: d */
    private BaseCommonJavaMethod.AbstractC47813a f110955d;

    static {
        Covode.recordClassIndex(56601);
    }

    private UploadContactsMethod(byte b) {
        this();
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.UploadContactsMethod$a */
    public static final class C47906a {
        static {
            Covode.recordClassIndex(56602);
        }

        private C47906a() {
        }

        public /* synthetic */ C47906a(byte b) {
            this();
        }
    }

    private /* synthetic */ UploadContactsMethod() {
        this((C18288a) null);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.UploadContactsMethod$b */
    public static final class C47907b implements AbstractC51735f {

        /* renamed from: a */
        final /* synthetic */ UploadContactsMethod f110956a;

        /* renamed from: b */
        final /* synthetic */ BaseCommonJavaMethod.AbstractC47813a f110957b;

        static {
            Covode.recordClassIndex(56603);
        }

        @Override // com.p2082ss.android.ugc.aweme.friends.p3022ui.AbstractC51735f
        /* renamed from: a */
        public final void mo79931a() {
            C80058a.m138795a();
            C80058a.m138796a(this.f110956a.f110954a);
        }

        @Override // com.p2082ss.android.ugc.aweme.friends.p3022ui.AbstractC51735f
        /* renamed from: b */
        public final void mo79932b() {
            BaseCommonJavaMethod.AbstractC47813a aVar = this.f110957b;
            if (aVar != null) {
                aVar.mo79885a(0, "");
            }
        }

        C47907b(UploadContactsMethod uploadContactsMethod, BaseCommonJavaMethod.AbstractC47813a aVar) {
            this.f110956a = uploadContactsMethod;
            this.f110957b = aVar;
        }
    }

    public UploadContactsMethod(C18288a aVar) {
        super(aVar);
        this.f110954a = new WeakHandler(Looper.getMainLooper(), this);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        Integer valueOf;
        BaseCommonJavaMethod.AbstractC47813a aVar;
        if (message != null && (valueOf = Integer.valueOf(message.what)) != null && valueOf.intValue() == 115 && (aVar = this.f110955d) != null) {
            aVar.mo79887a("", 1, "");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        this.f110955d = aVar;
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (g.isLogin()) {
            Activity b = C30246d.m61215b(this.mContextRef);
            if (C80241be.m139079a(C17867d.m33078a())) {
                C80058a.m138795a();
                C80058a.m138796a(this.f110954a);
            } else if (b != null) {
                C80241be.m139078a(b, new C47907b(this, aVar));
            } else if (aVar != null) {
                aVar.mo79885a(0, "");
            }
        } else if (aVar != null) {
            aVar.mo79885a(0, "");
        }
    }
}
