package com.p2082ss.android.ugc.aweme.bullet.bridge.framework;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.app.C33722d;
import com.p2082ss.android.ugc.aweme.bullet.C34963b;
import com.p2082ss.android.ugc.aweme.bullet.api.IBulletService;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.p2929fe.method.C47962l;
import com.p2082ss.android.ugc.aweme.utils.C80396el;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.OpenSchemaMethod */
public final class OpenSchemaMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C35078a f82770b = new C35078a((byte) 0);

    /* renamed from: c */
    private final String f82771c = "openSchema";

    /* renamed from: d */
    private AbstractC16183k.EnumC16184a f82772d = AbstractC16183k.EnumC16184a.PROTECT;

    static {
        Covode.recordClassIndex(42206);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.OpenSchemaMethod$a */
    public static final class C35078a {
        static {
            Covode.recordClassIndex(42207);
        }

        private C35078a() {
        }

        public /* synthetic */ C35078a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q, com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e
    /* renamed from: b */
    public final AbstractC16183k.EnumC16184a mo25723b() {
        return this.f82772d;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82771c;
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.OpenSchemaMethod$b */
    static final class RunnableC35079b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ OpenSchemaMethod f82773a;

        /* renamed from: b */
        final /* synthetic */ String f82774b;

        /* renamed from: c */
        final /* synthetic */ String f82775c;

        /* renamed from: d */
        final /* synthetic */ BaseBridgeMethod.AbstractC34965a f82776d;

        static {
            Covode.recordClassIndex(42208);
        }

        RunnableC35079b(OpenSchemaMethod openSchemaMethod, String str, String str2, BaseBridgeMethod.AbstractC34965a aVar) {
            this.f82773a = openSchemaMethod;
            this.f82774b = str;
            this.f82775c = str2;
            this.f82776d = aVar;
        }

        public final void run() {
            String str;
            IBulletService a = C34963b.m71411a();
            String str2 = this.f82774b;
            if (str2 == null) {
                str2 = "";
            }
            Activity a2 = a.mo61848a(str2);
            Context e = this.f82773a.mo26893e();
            if ((e instanceof Activity) && a2 == null) {
                a2 = (Activity) e;
            }
            if (TextUtils.isEmpty(this.f82775c) || a2 == null) {
                this.f82776d.mo61871a(-1, "schema is not legal");
                return;
            }
            String str3 = this.f82775c;
            if (str3 != null && C89361p.m154874b(str3, "aweme://live/", false)) {
                Uri parse = Uri.parse(this.f82775c);
                String queryParameter = parse.getQueryParameter("room_id");
                String queryParameter2 = parse.getQueryParameter("user_id");
                if (!TextUtils.isEmpty(queryParameter) || !TextUtils.isEmpty(queryParameter2)) {
                    C33722d.C33723a.m69045a((Context) a2, C89361p.m154869a(this.f82775c, "aweme:", "sslocal:", false), (String) null, false);
                    this.f82776d.mo61872a((Object) new JSONObject());
                    return;
                }
                this.f82776d.mo61871a(-1, "");
            } else if (C80396el.m139368a(this.f82775c)) {
                ILiveOuterService s = LiveOuterService.m107269s();
                C89219l.m154716b(s, "");
                if (s.mo95830d().mo95861f(this.f82775c)) {
                    this.f82776d.mo61872a((Object) new JSONObject());
                } else {
                    this.f82776d.mo61871a(-1, "");
                }
            } else if (C47962l.m90953a(this.f82775c)) {
                this.f82776d.mo61872a((Object) new JSONObject());
            } else {
                if (!OpenSchemaMethod.m71710a(a2, this.f82775c)) {
                    String str4 = this.f82775c;
                    if (str4 != null) {
                        str = C89361p.m154868a(str4, "aweme", "sslocal");
                    } else {
                        str = null;
                    }
                    if (!C33722d.C33723a.m69045a((Context) a2, str, (String) null, false)) {
                        this.f82776d.mo61871a(-1, "");
                        return;
                    }
                }
                this.f82776d.mo61872a((Object) new JSONObject());
            }
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e
    /* renamed from: a */
    public final void mo25722a(AbstractC16183k.EnumC16184a aVar) {
        C89219l.m154721d(aVar, "");
        this.f82772d = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenSchemaMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    /* renamed from: b */
    private final void m71711b(String str) {
        String str2;
        Context e = mo26893e();
        if (!(e instanceof Activity)) {
            m71710a((Context) null, str);
        } else if (!C47962l.m90956c(str) && !m71710a(e, str)) {
            if (str != null) {
                str2 = C89361p.m154869a(str, "aweme", "sslocal", false);
            } else {
                str2 = null;
            }
            C33722d.C33723a.m69045a(e, str2, (String) null, false);
        }
    }

    /* renamed from: a */
    public static boolean m71710a(Context context, String str) {
        if (context instanceof Activity) {
            return C36125t.m73596a(C36125t.m73591a(), (Activity) context, str);
        }
        return C36125t.m73598a(C36125t.m73591a(), str);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        String optString = jSONObject.optString("reactId");
        String optString2 = jSONObject.optString("schema");
        int i = C35103b.f82838a[mo61868i().ordinal()];
        if (i == 1) {
            m71711b(optString2);
        } else if (i == 2) {
            m71711b(optString2);
            aVar.mo61872a((Object) new JSONObject());
        } else if (i == 3) {
            new Handler(Looper.getMainLooper()).post(new RunnableC35079b(this, optString, optString2, aVar));
        }
    }
}
