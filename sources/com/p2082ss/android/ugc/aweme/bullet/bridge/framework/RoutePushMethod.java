package com.p2082ss.android.ugc.aweme.bullet.bridge.framework;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.p1184ui.common.AbstractC17045g;
import com.bytedance.ies.bullet.p1184ui.common.C17022c;
import com.bytedance.ies.bullet.service.base.C16614as;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.C34322e;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89269g;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.RoutePushMethod */
public final class RoutePushMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: c */
    public static final C89269g f82789c = C89271h.m154766a(50000, 60000);

    /* renamed from: d */
    public static final C35086a f82790d = new C35086a((byte) 0);

    /* renamed from: b */
    public final Map<Integer, BaseBridgeMethod.AbstractC34965a> f82791b = new LinkedHashMap();

    /* renamed from: e */
    private final String f82792e = "routePush";

    /* renamed from: f */
    private int f82793f = f82789c.f202927a;

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.RoutePushMethod$a */
    public static final class C35086a {
        static {
            Covode.recordClassIndex(42220);
        }

        private C35086a() {
        }

        public /* synthetic */ C35086a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82792e;
    }

    static {
        Covode.recordClassIndex(42219);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.RoutePushMethod$b */
    public static final class C35087b extends C17022c {

        /* renamed from: a */
        final /* synthetic */ AbstractC17045g f82794a;

        /* renamed from: b */
        final /* synthetic */ String f82795b;

        /* renamed from: c */
        final /* synthetic */ RoutePushMethod f82796c;

        /* renamed from: d */
        final /* synthetic */ BaseBridgeMethod.AbstractC34965a f82797d;

        static {
            Covode.recordClassIndex(42221);
        }

        /* renamed from: a */
        private static Bundle m71735a(Intent intent) {
            try {
                return intent.getExtras();
            } catch (Exception unused) {
                return null;
            }
        }

        C35087b(AbstractC17045g gVar, String str, RoutePushMethod routePushMethod, BaseBridgeMethod.AbstractC34965a aVar) {
            this.f82794a = gVar;
            this.f82795b = str;
            this.f82796c = routePushMethod;
            this.f82797d = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public Void mo26817a(Activity activity, int i, int i2, Intent intent) {
            Bundle a;
            String string;
            C89219l.m154721d(activity, "");
            if (i2 == 50000) {
                BaseBridgeMethod.AbstractC34965a remove = this.f82796c.f82791b.remove(Integer.valueOf(i));
                if (remove != null) {
                    JSONObject jSONObject = new JSONObject();
                    if (!(intent == null || (a = m71735a(intent)) == null || (string = a.getString("serialized_data")) == null)) {
                        try {
                            JSONObject optJSONObject = new JSONObject(string).optJSONObject("data");
                            if (optJSONObject != null) {
                                C34322e.m70198a(jSONObject, optJSONObject);
                            }
                        } catch (JSONException unused) {
                        }
                    }
                    remove.mo61873a(jSONObject, 1, "push callback succeed");
                }
            } else {
                BaseBridgeMethod.AbstractC34965a remove2 = this.f82796c.f82791b.remove(Integer.valueOf(i));
                if (remove2 != null) {
                    remove2.mo61871a(-1, "resultCode = ".concat(String.valueOf(i2)));
                }
            }
            this.f82794a.mo26827b(this);
            throw new C16614as("An operation is not implemented");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RoutePushMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        AbstractC17045g f;
        Activity a;
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        String optString = jSONObject.optString("schema");
        if (optString == null || !(!TextUtils.isEmpty(optString)) || (f = mo26894f()) == null) {
            aVar.mo61871a(-1, "params not valid");
            return;
        }
        f.mo26824a(new C35087b(f, optString, this, aVar));
        AbstractC17045g f2 = mo26894f();
        if (!(f2 == null || (a = f2.mo26816a()) == null)) {
            if (C36125t.m73597a(C36125t.m73591a(), a, optString, this.f82793f)) {
                this.f82791b.put(Integer.valueOf(this.f82793f), aVar);
                int i = this.f82793f + 1;
                this.f82793f = i;
                C89269g gVar = f82789c;
                if (i > gVar.f202928b) {
                    this.f82793f = gVar.f202927a;
                    return;
                }
                return;
            }
        }
        aVar.mo61871a(-1, "router not supported");
    }
}
