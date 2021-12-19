package com.bytedance.android.livesdk.container.config.base;

import android.net.Uri;
import com.bytedance.android.livesdk.container.p503a.AbstractC8211a;
import com.bytedance.android.livesdk.container.p512i.C8252c;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

public final class ViewConfig extends HybridConfig {
    static {
        Covode.recordClassIndex(9062);
    }

    public ViewConfig() {
        this(null, 1, null);
    }

    public ViewConfig(Uri uri) {
        super(uri);
        String a;
        String queryParameter;
        if (uri != null) {
            Class<ViewConfig> cls = ViewConfig.class;
            do {
                Field[] declaredFields = cls.getDeclaredFields();
                C89219l.m154716b(declaredFields, "");
                for (Field field : declaredFields) {
                    AbstractC8211a aVar = (AbstractC8211a) field.getAnnotation(AbstractC8211a.class);
                    if (!(aVar == null || (queryParameter = uri.getQueryParameter((a = aVar.mo14464a()))) == null)) {
                        C89219l.m154716b(queryParameter, "");
                        C89219l.m154716b(field, "");
                        field.setAccessible(true);
                        Class<?> type = field.getType();
                        C89219l.m154716b(type, "");
                        field.set(this, C8252c.m16397a(uri, a, queryParameter, type));
                    }
                }
                cls = cls.getSuperclass();
            } while (cls != null);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ViewConfig(Uri uri, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : uri);
    }
}
