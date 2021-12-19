package com.p2082ss.android.ugc.aweme.p2929fe.method;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.C4139e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.base.p2364a.C34470e;
import com.p2082ss.android.ugc.aweme.liveevent.C58793c;
import com.p2082ss.android.ugc.aweme.liveevent.C58803e;
import com.p2082ss.android.ugc.aweme.liveevent.EnumC58802d;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.fe.method.OpenCalendarMethod */
public final class OpenCalendarMethod extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C47860a f110864b = new C47860a((byte) 0);

    /* renamed from: a */
    public C58793c f110865a;

    static {
        Covode.recordClassIndex(56524);
    }

    private OpenCalendarMethod(byte b) {
        this();
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.OpenCalendarMethod$a */
    public static final class C47860a {
        static {
            Covode.recordClassIndex(56525);
        }

        private C47860a() {
        }

        public /* synthetic */ C47860a(byte b) {
            this();
        }
    }

    private /* synthetic */ OpenCalendarMethod() {
        this((C18288a) null);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.OpenCalendarMethod$c */
    static final class C47862c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ BaseCommonJavaMethod.AbstractC47813a f110867a;

        static {
            Covode.recordClassIndex(56527);
        }

        C47862c(BaseCommonJavaMethod.AbstractC47813a aVar) {
            this.f110867a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            BaseCommonJavaMethod.AbstractC47813a aVar = this.f110867a;
            if (aVar != null) {
                aVar.mo79885a(0, null);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.OpenCalendarMethod$e */
    static final class C47864e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ BaseCommonJavaMethod.AbstractC47813a f110869a;

        static {
            Covode.recordClassIndex(56529);
        }

        C47864e(BaseCommonJavaMethod.AbstractC47813a aVar) {
            this.f110869a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            BaseCommonJavaMethod.AbstractC47813a aVar = this.f110869a;
            if (aVar != null) {
                aVar.mo79885a(0, null);
            }
        }
    }

    public OpenCalendarMethod(C18288a aVar) {
        super(aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.OpenCalendarMethod$b */
    static final class C47861b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ BaseCommonJavaMethod.AbstractC47813a f110866a;

        static {
            Covode.recordClassIndex(56526);
        }

        C47861b(BaseCommonJavaMethod.AbstractC47813a aVar) {
            this.f110866a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 1);
            jSONObject.put("add_result", ((EnumC58802d) obj).getValue());
            BaseCommonJavaMethod.AbstractC47813a aVar = this.f110866a;
            if (aVar != null) {
                aVar.mo79888a(jSONObject);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.OpenCalendarMethod$d */
    static final class C47863d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ BaseCommonJavaMethod.AbstractC47813a f110868a;

        static {
            Covode.recordClassIndex(56528);
        }

        C47863d(BaseCommonJavaMethod.AbstractC47813a aVar) {
            this.f110868a = aVar;
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
            BaseCommonJavaMethod.AbstractC47813a aVar = this.f110868a;
            if (aVar != null) {
                aVar.mo79888a(jSONObject);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        if (this.f110865a == null) {
            Activity a = C34470e.m70451a((Context) this.mContextRef.get());
            if (a != null) {
                this.f110865a = new C58793c(a);
            } else {
                return;
            }
        }
        C58803e eVar = (C58803e) C4139e.C4140a.f11575b.mo46670a(String.valueOf(jSONObject), C58803e.class);
        String str = eVar.f133832a;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 96417) {
                if (hashCode == 102230 && str.equals("get")) {
                    C58793c cVar = this.f110865a;
                    if (cVar == null) {
                        C89219l.m154710a("calendarManager");
                    }
                    cVar.mo96177a().mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new C47863d(aVar), new C47864e(aVar));
                    return;
                }
            } else if (str.equals("add")) {
                C58793c cVar2 = this.f110865a;
                if (cVar2 == null) {
                    C89219l.m154710a("calendarManager");
                }
                C89219l.m154716b(eVar, "");
                cVar2.mo96178b(eVar).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new C47861b(aVar), new C47862c(aVar));
                return;
            }
        }
        if (aVar != null) {
            aVar.mo79885a(0, null);
        }
    }
}
