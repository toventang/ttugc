package com.p2082ss.android.ugc.aweme.feed.cache;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.p2132c.C29819a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.video.C80662ac;
import com.p2082ss.android.ugc.aweme.video.preload.AbstractC80921k;
import com.p2082ss.android.ugc.aweme.video.preload.C80860b;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84241i;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.cache.i */
public final class C49326i {

    /* renamed from: a */
    static volatile Aweme f113365a;

    /* renamed from: b */
    static volatile int f113366b;

    /* renamed from: c */
    static volatile C49330d f113367c = new C49330d();

    /* renamed from: d */
    public static final C49326i f113368d = new C49326i();

    /* renamed from: com.ss.android.ugc.aweme.feed.cache.i$d */
    public static final class C49330d implements AbstractC80921k {
        static {
            Covode.recordClassIndex(58131);
        }

        C49330d() {
        }

        @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80921k
        /* renamed from: a */
        public final void mo80918a(C84241i iVar) {
            String str;
            Aweme aweme = C49326i.f113365a;
            if (aweme != null) {
                String aid = aweme.getAid();
                if (iVar != null) {
                    str = iVar.getSourceId();
                } else {
                    str = null;
                }
                if (!C89219l.m154714a((Object) aid, (Object) str)) {
                    return;
                }
                if (C49326i.f113366b >= 5) {
                    C49326i.f113365a = null;
                    C49326i.f113366b = 0;
                    C1731i.m5640b(CallableC49329c.f113371a, C1731i.f5562a);
                    return;
                }
                Aweme aweme2 = C49326i.f113365a;
                if (aweme2 != null) {
                    C49326i.f113366b++;
                    C80662ac.m139882a(aweme2, Integer.MAX_VALUE);
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80921k
        /* renamed from: a */
        public final void mo80919a(List<C84241i> list) {
            Aweme aweme;
            Aweme aweme2 = C49326i.f113365a;
            if (aweme2 != null) {
                ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (C89219l.m154714a((Object) aweme2.getAid(), (Object) it.next().getSourceId()) && (aweme = C49326i.f113365a) != null) {
                        C80662ac.m139882a(aweme, Integer.MAX_VALUE);
                    }
                    arrayList.add(C89391z.f203057a);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ad, code lost:
            if (r7 != false) goto L_0x00af;
         */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0094 A[SYNTHETIC, Splitter:B:27:0x0094] */
        @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80921k
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo80917a(android.util.Pair<com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84241i, java.lang.String> r11) {
            /*
            // Method dump skipped, instructions count: 221
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.cache.C49326i.C49330d.mo80917a(android.util.Pair):void");
        }
    }

    private C49326i() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.cache.i$a */
    public static final class CallableC49327a<V> implements Callable {

        /* renamed from: a */
        public static final CallableC49327a f113369a = new CallableC49327a();

        static {
            Covode.recordClassIndex(58128);
        }

        CallableC49327a() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_success", 1);
                C29819a.m60077a("cache_video_request", jSONObject);
            } catch (Exception unused) {
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.cache.i$b */
    static final class CallableC49328b<V> implements Callable {

        /* renamed from: a */
        public static final CallableC49328b f113370a = new CallableC49328b();

        static {
            Covode.recordClassIndex(58129);
        }

        CallableC49328b() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_success", 1);
                C29819a.m60077a("cache_video_request_response", jSONObject);
            } catch (Exception unused) {
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.cache.i$c */
    static final class CallableC49329c<V> implements Callable {

        /* renamed from: a */
        public static final CallableC49329c f113371a = new CallableC49329c();

        static {
            Covode.recordClassIndex(58130);
        }

        CallableC49329c() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_success", 0);
                jSONObject.put("errorCode", 1024);
                C29819a.m60077a("cache_video_request_response", jSONObject);
            } catch (Exception unused) {
            }
            return C89391z.f203057a;
        }
    }

    static {
        Covode.recordClassIndex(58127);
    }

    /* renamed from: a */
    public static boolean m92417a(String str) {
        if (str == null) {
            return false;
        }
        String a = C80860b.m140276a(str);
        if (!new File(a + ".mdl").exists() || !new File(a + ".mdlnodeconf").exists()) {
            return false;
        }
        return true;
    }
}
