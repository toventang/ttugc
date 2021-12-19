package com.p2082ss.android.ugc.aweme.specact.popup.calendar;

import android.app.Activity;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.popup.calendar.CheckCalendarExistMethod */
public final class CheckCalendarExistMethod extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: a */
    public static final C75187a f169057a = new C75187a((byte) 0);

    static {
        Covode.recordClassIndex(88063);
    }

    private CheckCalendarExistMethod(byte b) {
        this();
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.popup.calendar.CheckCalendarExistMethod$a */
    public static final class C75187a {
        static {
            Covode.recordClassIndex(88064);
        }

        private C75187a() {
        }

        public /* synthetic */ C75187a(byte b) {
            this();
        }
    }

    private /* synthetic */ CheckCalendarExistMethod() {
        this((C18288a) null);
    }

    public CheckCalendarExistMethod(C18288a aVar) {
        super(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        String optString;
        Activity j = C17873f.m33102j();
        if (j != null) {
            if (jSONObject == null) {
                optString = "";
            } else {
                optString = jSONObject.optString("identifier");
                C89219l.m154716b(optString, "");
            }
            int i = 1;
            if (optString.length() != 0) {
                if (!C75190a.m131925a(j, optString)) {
                    i = 2;
                }
                if (aVar != null) {
                    aVar.mo79887a("", i, "");
                }
            } else if (aVar != null) {
                aVar.mo79885a(-1, "Parameter invalid");
            }
        }
    }
}
