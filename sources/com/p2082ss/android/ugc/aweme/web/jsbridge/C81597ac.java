package com.p2082ss.android.ugc.aweme.web.jsbridge;

import android.os.Build;
import android.widget.Toast;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18337f;
import com.bytedance.ies.web.jsbridge2.C18338g;
import com.bytedance.ies.web.jsbridge2.EnumC18323ah;
import com.p2082ss.android.ugc.aweme.utils.C80567ic;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.ac */
public final class C81597ac extends AbstractC18337f<JSONObject, JSONObject> {

    /* renamed from: a */
    public static final C81598a f182480a = new C81598a((byte) 0);

    static {
        Covode.recordClassIndex(94994);
    }

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.ac$a */
    public static final class C81598a {
        static {
            Covode.recordClassIndex(94995);
        }

        private C81598a() {
        }

        public /* synthetic */ C81598a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18332c
    public final EnumC18323ah getPermissionGroup() {
        return EnumC18323ah.SECURE;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18337f
    public final /* synthetic */ JSONObject invoke(JSONObject jSONObject, C18338g gVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(gVar, "");
        Toast makeText = Toast.makeText(gVar.f43859a, "jsb test secure method success:\n" + gVar.f43860b, 0);
        if (Build.VERSION.SDK_INT == 25) {
            C80567ic.m139657a(makeText);
        }
        makeText.show();
        return null;
    }
}
