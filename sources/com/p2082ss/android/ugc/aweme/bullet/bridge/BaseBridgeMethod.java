package com.p2082ss.android.ugc.aweme.bullet.bridge;

import android.app.Activity;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.AbstractC16239d;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.p1184ui.common.AbstractC17045g;
import com.bytedance.ies.bullet.p1184ui.common.p1185a.AbstractC17015a;
import com.bytedance.ies.bullet.p1184ui.common.p1187c.AbstractC17026c;
import com.bytedance.ies.bullet.service.base.AbstractC16654o;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.EnumC16723b;
import com.bytedance.ies.web.p1285a.C18288a;
import com.bytedance.ies.web.p1285a.C18297h;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod */
public abstract class BaseBridgeMethod extends AbstractC17015a implements AbstractC33974au {

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod$a */
    public interface AbstractC34965a {
        static {
            Covode.recordClassIndex(41997);
        }

        /* renamed from: a */
        void mo61871a(int i, String str);

        /* renamed from: a */
        void mo61872a(Object obj);

        /* renamed from: a */
        void mo61873a(Object obj, int i, String str);

        /* renamed from: a */
        void mo61874a(JSONObject jSONObject);
    }

    static {
        Covode.recordClassIndex(41996);
    }

    /* renamed from: a */
    public void mo61866a(JSONObject jSONObject, AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod$c */
    public static final class C34967c implements AbstractC16191p {

        /* renamed from: a */
        public final JSONObject f82476a;

        /* renamed from: b */
        final /* synthetic */ String f82477b;

        /* renamed from: c */
        final /* synthetic */ JSONObject f82478c;

        /* renamed from: d */
        private final String f82479d;

        static {
            Covode.recordClassIndex(41999);
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
        /* renamed from: a */
        public final String mo25699a() {
            return this.f82479d;
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Object mo25700b() {
            return this.f82476a;
        }

        C34967c(String str, JSONObject jSONObject) {
            this.f82477b = str;
            this.f82478c = jSONObject;
            this.f82479d = str;
            this.f82476a = jSONObject;
        }
    }

    /* renamed from: h */
    public final AbstractC16208i mo61867h() {
        return (AbstractC16208i) this.f38923a.mo25832c(AbstractC16208i.class);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final EnumC16723b mo61868i() {
        EnumC16723b b;
        AbstractC16208i h = mo61867h();
        if (h == null || (b = h.mo25769b()) == null) {
            return EnumC16723b.RN;
        }
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final C18288a mo61869j() {
        return (C18288a) this.f38923a.mo25832c(C18288a.class);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final AbstractC16654o mo61870k() {
        return (AbstractC16654o) this.f38923a.mo25832c(AbstractC16654o.class);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod$b */
    public static final class C34966b implements AbstractC34965a {

        /* renamed from: a */
        final /* synthetic */ AbstractC16183k.AbstractC16185b f82475a;

        static {
            Covode.recordClassIndex(41998);
        }

        C34966b(AbstractC16183k.AbstractC16185b bVar) {
            this.f82475a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.AbstractC34965a
        /* renamed from: a */
        public final void mo61872a(Object obj) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", 1);
                jSONObject.put("data", obj);
                this.f82475a.mo25704a(jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.AbstractC34965a
        /* renamed from: a */
        public final void mo61874a(JSONObject jSONObject) {
            if (jSONObject != null) {
                try {
                    this.f82475a.mo25704a(jSONObject);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.AbstractC34965a
        /* renamed from: a */
        public final void mo61871a(int i, String str) {
            AbstractC16183k.AbstractC16185b bVar = this.f82475a;
            if (str == null) {
                str = "";
            }
            bVar.mo25702a(i, str);
        }

        @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.AbstractC34965a
        /* renamed from: a */
        public final void mo61873a(Object obj, int i, String str) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", i);
                jSONObject.put("msg", str);
                jSONObject.put("data", obj);
                this.f82475a.mo25704a(jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseBridgeMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Activity mo61864a(String str) {
        AbstractC16239d dVar;
        AbstractC16208i a;
        AbstractC17045g z;
        if (!(str == null || (dVar = (AbstractC16239d) this.f38923a.mo25832c(AbstractC16239d.class)) == null || (a = dVar.mo25683a(str)) == null)) {
            if (!(a instanceof AbstractC17026c)) {
                a = null;
            }
            AbstractC17026c cVar = (AbstractC17026c) a;
            if (!(cVar == null || (z = cVar.mo26902z()) == null)) {
                return z.mo26816a();
            }
        }
        return null;
    }

    /* renamed from: a */
    protected static C18297h m71423a(JSONObject jSONObject) {
        C89219l.m154721d(jSONObject, "");
        C18297h hVar = new C18297h();
        hVar.f43671d = jSONObject;
        JSONObject optJSONObject = jSONObject.optJSONObject("jsMsg");
        if (optJSONObject != null) {
            hVar.f43668a = optJSONObject.optString(StringSet.type);
            hVar.f43670c = optJSONObject.optString("func");
            hVar.f43669b = optJSONObject.optString("callback_id");
            hVar.f43672e = optJSONObject.optInt("version");
            hVar.f43676i = optJSONObject.optBoolean("needCallback");
            hVar.f43675h = optJSONObject.optString("permissionGroup");
        }
        return hVar;
    }

    /* renamed from: a */
    public final void mo61865a(String str, JSONObject jSONObject) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(jSONObject, "");
        AbstractC16208i h = mo61867h();
        if (h != null) {
            h.onEvent(new C34967c(str, jSONObject));
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k
    /* renamed from: a */
    public void mo25748a(JSONObject jSONObject, AbstractC16183k.AbstractC16185b bVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(bVar, "");
        mo61866a(jSONObject, new C34966b(bVar));
    }
}
