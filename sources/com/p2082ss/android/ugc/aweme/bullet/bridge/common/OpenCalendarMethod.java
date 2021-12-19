package com.p2082ss.android.ugc.aweme.bullet.bridge.common;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.C4139e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.base.p2364a.C34470e;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.liveevent.C58793c;
import com.p2082ss.android.ugc.aweme.liveevent.C58803e;
import com.p2082ss.android.ugc.aweme.liveevent.EnumC58802d;
import org.json.JSONObject;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.OpenCalendarMethod */
public final class OpenCalendarMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: c */
    public static final C35034a f82643c = new C35034a((byte) 0);

    /* renamed from: b */
    public C58793c f82644b;

    /* renamed from: d */
    private final String f82645d = "calendarOperation";

    static {
        Covode.recordClassIndex(42134);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.OpenCalendarMethod$a */
    public static final class C35034a {
        static {
            Covode.recordClassIndex(42135);
        }

        private C35034a() {
        }

        public /* synthetic */ C35034a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82645d;
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.OpenCalendarMethod$c */
    static final class C35036c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ BaseBridgeMethod.AbstractC34965a f82647a;

        static {
            Covode.recordClassIndex(42137);
        }

        C35036c(BaseBridgeMethod.AbstractC34965a aVar) {
            this.f82647a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f82647a.mo61871a(0, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.OpenCalendarMethod$e */
    static final class C35038e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ BaseBridgeMethod.AbstractC34965a f82649a;

        static {
            Covode.recordClassIndex(42139);
        }

        C35038e(BaseBridgeMethod.AbstractC34965a aVar) {
            this.f82649a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f82649a.mo61871a(0, null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenCalendarMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.OpenCalendarMethod$b */
    static final class C35035b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ BaseBridgeMethod.AbstractC34965a f82646a;

        static {
            Covode.recordClassIndex(42136);
        }

        C35035b(BaseBridgeMethod.AbstractC34965a aVar) {
            this.f82646a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 1);
            jSONObject.put("add_result", ((EnumC58802d) obj).getValue());
            this.f82646a.mo61874a(jSONObject);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.OpenCalendarMethod$d */
    static final class C35037d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ BaseBridgeMethod.AbstractC34965a f82648a;

        static {
            Covode.recordClassIndex(42138);
        }

        C35037d(BaseBridgeMethod.AbstractC34965a aVar) {
            this.f82648a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            int i;
            Boolean bool = (Boolean) obj;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 1);
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                i = 3;
            } else {
                i = 2;
            }
            jSONObject.put("status", i);
            this.f82648a.mo61874a(jSONObject);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        if (this.f82644b == null) {
            Activity a = C34470e.m70451a((Context) this.f38923a.mo25832c(Context.class));
            if (a != null) {
                this.f82644b = new C58793c(a);
            } else {
                return;
            }
        }
        C58803e eVar = (C58803e) C4139e.C4140a.f11575b.mo46670a(jSONObject.toString(), C58803e.class);
        String str = eVar.f133832a;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 96417) {
                if (hashCode == 102230 && str.equals("get")) {
                    C58793c cVar = this.f82644b;
                    if (cVar == null) {
                        C89219l.m154710a("calendarManager");
                    }
                    C89219l.m154716b(cVar.mo96177a().mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new C35037d(aVar), new C35038e(aVar)), "");
                    return;
                }
            } else if (str.equals("add")) {
                C58793c cVar2 = this.f82644b;
                if (cVar2 == null) {
                    C89219l.m154710a("calendarManager");
                }
                C89219l.m154716b(eVar, "");
                C89219l.m154716b(cVar2.mo96178b(eVar).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new C35035b(aVar), new C35036c(aVar)), "");
                return;
            }
        }
        aVar.mo61871a(0, null);
    }
}
