package com.twitter.sdk.android.core.internal;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.twitter.sdk.android.core.AbstractC87688f;
import com.twitter.sdk.android.core.C87794k;
import com.twitter.sdk.android.core.internal.p4499b.AbstractC87720b;
import com.twitter.sdk.android.core.internal.p4499b.C87721c;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;

/* renamed from: com.twitter.sdk.android.core.internal.l */
public final class C87733l {

    /* renamed from: f */
    private static final Pattern f199256f = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: g */
    private static final String f199257g = Pattern.quote("/");

    /* renamed from: a */
    public final boolean f199258a;

    /* renamed from: b */
    public final String f199259b;

    /* renamed from: c */
    C87724c f199260c;

    /* renamed from: d */
    C87718b f199261d;

    /* renamed from: e */
    boolean f199262e;

    /* renamed from: h */
    private final ReentrantLock f199263h;

    /* renamed from: i */
    private final AbstractC87720b f199264i;

    static {
        Covode.recordClassIndex(103722);
    }

    /* renamed from: a */
    public final String mo142178a() {
        if (!this.f199258a) {
            return "";
        }
        String string = this.f199264i.mo142166a().getString("installation_uuid", null);
        if (string == null) {
            return m152684c();
        }
        return string;
    }

    /* renamed from: c */
    private String m152684c() {
        this.f199263h.lock();
        try {
            String str = null;
            String string = this.f199264i.mo142166a().getString("installation_uuid", null);
            if (string == null) {
                String uuid = UUID.randomUUID().toString();
                if (uuid != null) {
                    str = f199256f.matcher(uuid).replaceAll("").toLowerCase(Locale.US);
                }
                AbstractC87720b bVar = this.f199264i;
                bVar.mo142167a(bVar.mo142168b().putString("installation_uuid", str));
                string = str;
            }
            return string;
        } finally {
            this.f199263h.unlock();
        }
    }

    /* renamed from: b */
    public final synchronized C87718b mo142179b() {
        C87718b bVar;
        MethodCollector.m26663i(5381);
        if (!this.f199262e) {
            C87724c cVar = this.f199260c;
            C87718b bVar2 = new C87718b(cVar.f199241a.mo142166a().getString("advertising_id", ""), cVar.f199241a.mo142166a().getBoolean("limit_ad_tracking_enabled", false));
            if (C87724c.m152660b(bVar2)) {
                C87794k.m152811c().mo142113b();
                new Thread(new RunnableC87725d(cVar, bVar2)).start();
            } else {
                bVar2 = cVar.mo142171a();
                cVar.mo142172a(bVar2);
            }
            this.f199261d = bVar2;
            this.f199262e = true;
        }
        bVar = this.f199261d;
        MethodCollector.m26664o(5381);
        return bVar;
    }

    public C87733l(Context context) {
        this(context, new C87721c(context, "com.twitter.sdk.android.AdvertisingPreferences"));
    }

    private C87733l(Context context, AbstractC87720b bVar) {
        this(context, bVar, new C87724c(context, bVar));
    }

    private C87733l(Context context, AbstractC87720b bVar, C87724c cVar) {
        this.f199263h = new ReentrantLock();
        if (context != null) {
            this.f199259b = context.getPackageName();
            this.f199260c = cVar;
            this.f199264i = bVar;
            boolean a = C87728g.m152675a(context, "com.twitter.sdk.android.COLLECT_IDENTIFIERS_ENABLED", true);
            this.f199258a = a;
            if (!a) {
                AbstractC87688f c = C87794k.m152811c();
                context.getPackageName();
                c.mo142113b();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("appContext must not be null");
    }
}
