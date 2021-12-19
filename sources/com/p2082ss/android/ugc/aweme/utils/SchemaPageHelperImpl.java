package com.p2082ss.android.ugc.aweme.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.app.C33722d;
import com.p2082ss.android.ugc.aweme.app.C33729e;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38767w;
import com.p2082ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.SchemaPageHelperImpl */
public final class SchemaPageHelperImpl implements SchemaPageHelper {
    static {
        Covode.recordClassIndex(93437);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper
    /* renamed from: a */
    public final String mo99361a() {
        String str = C17867d.f42595s;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: b */
    public static SchemaPageHelper m138975b() {
        MethodCollector.m26663i(7650);
        Object a = C81908b.m141854a(SchemaPageHelper.class, false);
        if (a != null) {
            SchemaPageHelper schemaPageHelper = (SchemaPageHelper) a;
            MethodCollector.m26664o(7650);
            return schemaPageHelper;
        }
        if (C81908b.f183396ez == null) {
            synchronized (SchemaPageHelper.class) {
                try {
                    if (C81908b.f183396ez == null) {
                        C81908b.f183396ez = new SchemaPageHelperImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7650);
                    throw th;
                }
            }
        }
        SchemaPageHelperImpl schemaPageHelperImpl = (SchemaPageHelperImpl) C81908b.f183396ez;
        MethodCollector.m26664o(7650);
        return schemaPageHelperImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper
    /* renamed from: a */
    public final Intent mo99360a(Context context, Uri uri) {
        return C33729e.m69049a(context, uri);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper
    /* renamed from: b */
    public final Intent mo99364b(Context context, Uri uri) {
        C89219l.m154721d(context, "");
        return C33722d.C33723a.m69042a(context, uri, false, false);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper
    /* renamed from: a */
    public final void mo99362a(Context context, String str) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        C33722d.C33723a.m69045a(context, str, "", false);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper
    /* renamed from: a */
    public final boolean mo99363a(Context context, String str, String str2, Map<String, String> map) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str2, "");
        return C38767w.m78640a(context, str, str2, true, map);
    }
}
