package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.twitter.sdk.android.core.AbstractC87793j;
import com.twitter.sdk.android.core.C87686e;
import com.twitter.sdk.android.core.C87691i;
import com.twitter.sdk.android.core.C87794k;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.internal.C87728g;
import com.twitter.sdk.android.core.internal.C87733l;
import com.twitter.sdk.android.core.internal.C87749p;
import com.twitter.sdk.android.core.internal.p4499b.C87719a;
import com.twitter.sdk.android.core.internal.scribe.C87787v;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.twitter.sdk.android.core.internal.scribe.t */
public class C87785t {

    /* renamed from: a */
    final ConcurrentHashMap<Long, C87792z> f199393a = new ConcurrentHashMap<>(2);

    /* renamed from: b */
    private final Context f199394b;

    /* renamed from: c */
    private final ScheduledExecutorService f199395c;

    /* renamed from: d */
    private final C87786u f199396d;

    /* renamed from: e */
    private final C87787v.C87788a f199397e;

    /* renamed from: f */
    private final TwitterAuthConfig f199398f;

    /* renamed from: g */
    private final AbstractC87793j<? extends C87691i<TwitterAuthToken>> f199399g;

    /* renamed from: h */
    private final C87686e f199400h;

    /* renamed from: i */
    private final C87733l f199401i;

    static {
        Covode.recordClassIndex(103783);
    }

    /* renamed from: a */
    public final boolean mo142254a(C87787v vVar, long j) {
        AbstractC87776o bVar;
        try {
            if (!this.f199393a.containsKey(Long.valueOf(j))) {
                ConcurrentHashMap<Long, C87792z> concurrentHashMap = this.f199393a;
                Long valueOf = Long.valueOf(j);
                Context context = this.f199394b;
                Context context2 = new C87719a(this.f199394b).f199236a;
                if (C58016d.f132222c == null || !C58016d.f132224e) {
                    C58016d.f132222c = context2.getFilesDir();
                }
                File file = C58016d.f132222c;
                if (file == null) {
                    C87794k.m152811c().mo142113b();
                    file = null;
                } else if (!file.exists() && !file.mkdirs()) {
                    C87794k.m152811c().mo142114c();
                    file = null;
                }
                C87790x xVar = new C87790x(this.f199394b, this.f199397e, new C87749p(), new C87784s(context, file, j + "_se.tap", j + "_se_to_send"), this.f199396d.f199408g);
                Context context3 = this.f199394b;
                if (this.f199396d.f199402a) {
                    C87728g.m152671a(this.f199394b, "Scribe enabled");
                    bVar = new C87763d(this.f199394b, this.f199395c, xVar, this.f199396d, new ScribeFilesSender(this.f199394b, this.f199396d, j, this.f199398f, this.f199399g, this.f199400h, this.f199395c, this.f199401i));
                } else {
                    C87728g.m152671a(this.f199394b, "Scribe disabled");
                    bVar = new C87761b();
                }
                concurrentHashMap.putIfAbsent(valueOf, new C87792z(context3, bVar, xVar, this.f199395c));
            }
            this.f199393a.get(Long.valueOf(j)).mo142230a(vVar);
            return true;
        } catch (IOException unused) {
            C87728g.m152677b(this.f199394b, "Failed to scribe event");
            return false;
        }
    }

    public C87785t(Context context, ScheduledExecutorService scheduledExecutorService, C87786u uVar, C87787v.C87788a aVar, TwitterAuthConfig twitterAuthConfig, AbstractC87793j<? extends C87691i<TwitterAuthToken>> jVar, C87686e eVar, C87733l lVar) {
        this.f199394b = context;
        this.f199395c = scheduledExecutorService;
        this.f199396d = uVar;
        this.f199397e = aVar;
        this.f199398f = twitterAuthConfig;
        this.f199399g = jVar;
        this.f199400h = eVar;
        this.f199401i = lVar;
    }
}
