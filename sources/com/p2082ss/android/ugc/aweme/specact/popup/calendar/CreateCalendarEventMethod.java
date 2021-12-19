package com.p2082ss.android.ugc.aweme.specact.popup.calendar;

import android.app.Activity;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.popup.calendar.CreateCalendarEventMethod */
public final class CreateCalendarEventMethod extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: a */
    public static final C75188a f169058a = new C75188a((byte) 0);

    static {
        Covode.recordClassIndex(88065);
    }

    private CreateCalendarEventMethod(byte b) {
        this();
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.popup.calendar.CreateCalendarEventMethod$a */
    public static final class C75188a {
        static {
            Covode.recordClassIndex(88066);
        }

        private C75188a() {
        }

        public /* synthetic */ C75188a(byte b) {
            this();
        }
    }

    private /* synthetic */ CreateCalendarEventMethod() {
        this((C18288a) null);
    }

    public CreateCalendarEventMethod(C18288a aVar) {
        super(aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.popup.calendar.CreateCalendarEventMethod$b */
    static final class C75189b extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ BaseCommonJavaMethod.AbstractC47813a f169059a;

        static {
            Covode.recordClassIndex(88067);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75189b(BaseCommonJavaMethod.AbstractC47813a aVar) {
            super(1);
            this.f169059a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            int intValue = num.intValue();
            BaseCommonJavaMethod.AbstractC47813a aVar = this.f169059a;
            if (aVar != null) {
                aVar.mo79887a("", intValue, "");
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        if (jSONObject != null) {
            Activity j = C17873f.m33102j();
            if (j != null) {
                C75194b bVar = (C75194b) C80342dg.m139301a(jSONObject.toString(), C75194b.class);
                C89219l.m154716b(bVar, "");
                C75190a.m131924a(j, bVar, true, new C75189b(aVar));
            }
        } else if (aVar != null) {
            aVar.mo79885a(-1, "Parameter invalid");
        }
    }
}
