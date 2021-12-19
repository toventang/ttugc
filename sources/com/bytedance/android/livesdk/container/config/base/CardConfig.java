package com.bytedance.android.livesdk.container.config.base;

import android.net.Uri;
import com.bytedance.android.livesdk.container.config.live.LiveCardConfig;
import com.bytedance.android.livesdk.container.p503a.AbstractC8211a;
import com.bytedance.android.livesdk.container.p512i.C8252c;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

public final class CardConfig extends HybridConfig {
    private LiveCardConfig extraConfig;

    static {
        Covode.recordClassIndex(9058);
    }

    public CardConfig() {
        this(null, 1, null);
    }

    public final LiveCardConfig getExtraConfig() {
        return this.extraConfig;
    }

    public final void setExtraConfig(LiveCardConfig liveCardConfig) {
        this.extraConfig = liveCardConfig;
    }

    public CardConfig(Uri uri) {
        super(uri);
        String a;
        String queryParameter;
        String a2;
        String queryParameter2;
        if (uri != null) {
            Class<CardConfig> cls = CardConfig.class;
            while (true) {
                if (cls == null) {
                    break;
                }
                Field[] declaredFields = cls.getDeclaredFields();
                C89219l.m154716b(declaredFields, "");
                for (Field field : declaredFields) {
                    AbstractC8211a aVar = (AbstractC8211a) field.getAnnotation(AbstractC8211a.class);
                    if (!(aVar == null || (queryParameter2 = uri.getQueryParameter((a2 = aVar.mo14464a()))) == null)) {
                        C89219l.m154716b(queryParameter2, "");
                        C89219l.m154716b(field, "");
                        field.setAccessible(true);
                        Class<?> type = field.getType();
                        C89219l.m154716b(type, "");
                        field.set(this, C8252c.m16397a(uri, a2, queryParameter2, type));
                    }
                }
                cls = cls.getSuperclass();
            }
            Class<LiveCardConfig> cls2 = LiveCardConfig.class;
            LiveCardConfig newInstance = cls2.newInstance();
            do {
                Field[] declaredFields2 = cls2.getDeclaredFields();
                C89219l.m154716b(declaredFields2, "");
                for (Field field2 : declaredFields2) {
                    AbstractC8211a aVar2 = (AbstractC8211a) field2.getAnnotation(AbstractC8211a.class);
                    if (!(aVar2 == null || (queryParameter = uri.getQueryParameter((a = aVar2.mo14464a()))) == null)) {
                        C89219l.m154716b(queryParameter, "");
                        C89219l.m154716b(field2, "");
                        field2.setAccessible(true);
                        Class<?> type2 = field2.getType();
                        C89219l.m154716b(type2, "");
                        field2.set(newInstance, C8252c.m16397a(uri, a, queryParameter, type2));
                    }
                }
                cls2 = cls2.getSuperclass();
            } while (cls2 != null);
            this.extraConfig = newInstance;
        }
        setHideLoading(true);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardConfig(Uri uri, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : uri);
    }
}
