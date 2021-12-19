package com.p2082ss.android.ugc.tools.p4341d.p4342a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.d.a.c */
public final class C84412c {

    /* renamed from: a */
    static final C84410b f188733a = new C84410b();

    /* renamed from: b */
    static final List<Runnable> f188734b = new ArrayList();

    /* renamed from: c */
    public static final ExecutorService f188735c = C40780g.m82241a();

    /* renamed from: d */
    static CountDownLatch f188736d = new CountDownLatch(1);

    /* renamed from: e */
    public static final C84412c f188737e = new C84412c();

    /* renamed from: f */
    private static final Map<String, Bundle> f188738f = new ConcurrentHashMap();

    /* renamed from: g */
    private static final Map<Context, String> f188739g = new WeakHashMap();

    /* renamed from: h */
    private static final Map<Context, String> f188740h = new WeakHashMap();

    /* renamed from: i */
    private static final Map<Context, Boolean> f188741i = new WeakHashMap();

    private C84412c() {
    }

    /* renamed from: com.ss.android.ugc.tools.d.a.c$a */
    public static final class RunnableC84413a implements Runnable {

        /* renamed from: a */
        public static final RunnableC84413a f188742a = new RunnableC84413a();

        static {
            Covode.recordClassIndex(98378);
        }

        RunnableC84413a() {
        }

        public final void run() {
            Keva repo = Keva.getRepo("bundle_survive_count_repo");
            C89219l.m154716b(repo, "");
            Map<String, ?> all = repo.getAll();
            C89219l.m154716b(all, "");
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                Object value = entry.getValue();
                Objects.requireNonNull(value, "null cannot be cast to non-null type kotlin.Int");
                repo.storeInt(entry.getKey(), ((Integer) value).intValue() + 1);
            }
            C84410b.m145197a();
        }
    }

    /* renamed from: com.ss.android.ugc.tools.d.a.c$b */
    public static final class RunnableC84414b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f188743a;

        /* renamed from: b */
        final /* synthetic */ byte[] f188744b;

        static {
            Covode.recordClassIndex(98379);
        }

        public final void run() {
            String str = this.f188743a;
            byte[] bArr = this.f188744b;
            C89219l.m154721d(str, "");
            C89219l.m154721d(bArr, "");
            Keva.getRepo("large_transaction_repo").storeBytesJustDisk(str, bArr);
            Keva.getRepo("bundle_survive_count_repo").storeInt(str, 1);
            C84911q.m145928d("Large Transaction write disk uuid: " + this.f188743a);
            C84412c.f188734b.remove(this);
            if (C84412c.f188734b.isEmpty()) {
                C84412c.f188736d.countDown();
            }
        }

        RunnableC84414b(String str, byte[] bArr) {
            this.f188743a = str;
            this.f188744b = bArr;
        }
    }

    static {
        Covode.recordClassIndex(98377);
    }

    /* renamed from: b */
    private static Bundle m145206b(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m145200a(Context context) {
        C89219l.m154721d(context, "");
        if (!f188741i.containsKey(context)) {
            Map<Context, String> map = f188739g;
            if (map.containsKey(context)) {
                String str = map.get(context);
                Map<String, Bundle> map2 = f188738f;
                Objects.requireNonNull(map2, "null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
                C89206ad.m154686h(map2).remove(str);
                C84911q.m145928d("Large Transaction, remove memory cache uuid: ".concat(String.valueOf(str)));
            }
        }
    }

    /* renamed from: a */
    public static void m145204a(Intent intent) {
        int a;
        Bundle b = m145206b(intent);
        if (b != null && (a = C84409a.m145194a(b)) >= 512000) {
            C84911q.m145928d("Large Transaction, extra size too large: " + a + ", intent: " + intent);
            Bundle b2 = m145206b(intent);
            if (b2 != null) {
                String uuid = UUID.randomUUID().toString();
                C89219l.m154716b(uuid, "");
                C84911q.m145928d("Large Transaction uuid: ".concat(String.valueOf(uuid)));
                Map<String, Bundle> map = f188738f;
                C89219l.m154716b(b2, "");
                map.put(uuid, b2);
                Bundle bundle = new Bundle();
                bundle.putString("activity_bundle_uuid", uuid);
                intent.replaceExtras(bundle);
            }
        }
    }

    /* renamed from: b */
    private static void m145207b(Context context, Intent intent) {
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }

    /* renamed from: a */
    public static void m145201a(Context context, Intent intent) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(intent, "");
        m145204a(intent);
        m145207b(context, intent);
    }

    /* renamed from: a */
    public static void m145203a(Context context, Bundle bundle) {
        Bundle bundle2;
        C89219l.m154721d(context, "");
        String str = f188739g.get(context);
        if (!(str == null || str.length() == 0 || (bundle2 = f188738f.get(str)) == null)) {
            C84911q.m145928d("Large Transaction, store uuid: ".concat(String.valueOf(str)));
            m145205a(str, bundle2);
        }
        if (bundle != null && C84409a.m145194a(bundle) >= 512000) {
            String uuid = UUID.randomUUID().toString();
            C89219l.m154716b(uuid, "");
            Bundle bundle3 = new Bundle(bundle);
            f188738f.put(uuid, bundle3);
            f188740h.put(context, uuid);
            bundle.clear();
            bundle.putString("save_state_bundle_uuid", uuid);
            C84911q.m145928d("Large Transaction, store state uuid: ".concat(String.valueOf(uuid)));
            m145205a(uuid, bundle3);
        }
        f188741i.put(context, true);
    }

    /* renamed from: a */
    private static void m145205a(String str, Bundle bundle) {
        byte[] b = C84409a.m145196b(bundle);
        if (b.length != 0) {
            RunnableC84414b bVar = new RunnableC84414b(str, b);
            if (f188736d.getCount() == 0) {
                f188736d = new CountDownLatch(1);
            }
            f188734b.add(bVar);
            f188735c.execute(bVar);
            if (C17873f.f42636l) {
                try {
                    f188736d.await(InteractFirstFrameTimeOutDurationSetting.DEFAULT, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m145199a(Activity activity, Intent intent, int i) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(intent, "");
        m145204a(intent);
        activity.startActivityForResult(intent, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a2, code lost:
        if (r0 != null) goto L_0x00a4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m145202a(android.content.Context r5, android.content.Intent r6, android.os.Bundle r7) {
        /*
        // Method dump skipped, instructions count: 177
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.tools.p4341d.p4342a.C84412c.m145202a(android.content.Context, android.content.Intent, android.os.Bundle):void");
    }
}
