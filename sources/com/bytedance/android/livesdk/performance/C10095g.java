package com.bytedance.android.livesdk.performance;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.performance.LiveFluencyEnterDurationSetting;
import com.bytedance.android.livesdkapi.p700m.C11831d;
import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.performance.g */
public final class C10095g {

    /* renamed from: a */
    public static final long f24527a = LiveFluencyEnterDurationSetting.INSTANCE.getValue();

    /* renamed from: b */
    public static final Map<String, AbstractC89244h<C10085b>> f24528b;

    /* renamed from: c */
    public static String f24529c = "";

    /* renamed from: d */
    public static boolean f24530d;

    /* renamed from: e */
    public static final C10095g f24531e = new C10095g();

    /* renamed from: f */
    private static final AbstractC89244h f24532f = C11831d.m20835a(C10121a.f24559a);

    /* renamed from: g */
    private static final Map<String, AbstractC89244h<RunnableC10134p>> f24533g;

    /* renamed from: a */
    public static Handler m18632a() {
        return (Handler) f24532f.getValue();
    }

    private C10095g() {
    }

    /* renamed from: com.bytedance.android.livesdk.performance.g$a */
    static final class C10121a extends AbstractC89220m implements AbstractC89171a<Handler> {

        /* renamed from: a */
        public static final C10121a f24559a = new C10121a();

        static {
            Covode.recordClassIndex(11684);
        }

        C10121a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* renamed from: com.bytedance.android.livesdk.performance.g$c */
    public static final class RunnableC10123c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C10085b f24561a;

        static {
            Covode.recordClassIndex(11686);
        }

        public RunnableC10123c(C10085b bVar) {
            this.f24561a = bVar;
        }

        public final void run() {
            this.f24561a.mo16951b();
            C10095g.f24529c = "preview_period";
            C10095g.m18639g();
        }
    }

    /* renamed from: c */
    public static void m18635c() {
        m18640h();
        f24529c = "audience_link_period";
        m18639g();
    }

    /* renamed from: e */
    public static void m18637e() {
        m18640h();
        f24529c = "pk_period";
        m18639g();
    }

    /* renamed from: f */
    public static void m18638f() {
        m18640h();
        f24529c = "broadcast_link_period";
        m18639g();
    }

    /* renamed from: com.bytedance.android.livesdk.performance.g$b */
    public static final class RunnableC10122b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C10085b f24560a;

        static {
            Covode.recordClassIndex(11685);
        }

        public RunnableC10122b(C10085b bVar) {
            this.f24560a = bVar;
        }

        public final void run() {
            this.f24560a.mo16951b();
            if (C10095g.f24529c.length() == 0) {
                C10095g.f24529c = "broadcast_period";
                C10095g.m18639g();
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.performance.g$d */
    static final class RunnableC10124d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C10085b f24562a;

        static {
            Covode.recordClassIndex(11687);
        }

        RunnableC10124d(C10085b bVar) {
            this.f24562a = bVar;
        }

        public final void run() {
            this.f24562a.mo16951b();
            if (C10095g.f24529c.length() == 0) {
                C10095g.f24529c = "watch_period";
                C10095g.m18639g();
            }
        }
    }

    /* renamed from: d */
    public static void m18636d() {
        String str;
        m18640h();
        if (f24530d) {
            str = "broadcast_period";
        } else {
            str = "watch_period";
        }
        f24529c = str;
        m18639g();
    }

    /* renamed from: b */
    public static void m18634b() {
        C10085b value;
        f24530d = false;
        AbstractC89244h<C10085b> hVar = f24528b.get("watch_enter");
        if (hVar != null && (value = hVar.getValue()) != null) {
            value.f24497c = false;
            value.mo16948a();
            m18632a().postDelayed(new RunnableC10124d(value), f24527a);
        }
    }

    /* renamed from: g */
    public static void m18639g() {
        RunnableC10134p value;
        C10085b value2;
        AbstractC89244h<C10085b> hVar = f24528b.get(f24529c);
        if (!(hVar == null || (value2 = hVar.getValue()) == null)) {
            value2.f24497c = f24530d;
        }
        AbstractC89244h<RunnableC10134p> hVar2 = f24533g.get(f24529c);
        if (hVar2 != null && (value = hVar2.getValue()) != null) {
            m18632a().removeCallbacks(value);
            m18632a().post(value);
        }
    }

    /* renamed from: h */
    public static void m18640h() {
        C10085b value;
        RunnableC10134p value2;
        AbstractC89244h<RunnableC10134p> hVar = f24533g.get(f24529c);
        if (!(hVar == null || (value2 = hVar.getValue()) == null)) {
            m18632a().removeCallbacks(value2);
        }
        AbstractC89244h<C10085b> hVar2 = f24528b.get(f24529c);
        if (hVar2 != null && (value = hVar2.getValue()) != null) {
            value.mo16951b();
        }
    }

    /* renamed from: i */
    public static void m18641i() {
        m18632a().removeCallbacksAndMessages(null);
        for (Map.Entry<String, AbstractC89244h<C10085b>> entry : f24528b.entrySet()) {
            if (entry.getValue().isInitialized() && entry.getValue().getValue().f24498d) {
                entry.getValue().getValue().mo16951b();
            }
        }
        f24529c = "";
    }

    static {
        Covode.recordClassIndex(11658);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f24528b = linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        f24533g = linkedHashMap2;
        linkedHashMap.put("watch_enter", C11831d.m20835a(C100961.f24534a));
        linkedHashMap.put("watch_slide", C11831d.m20835a(C1009912.f24537a));
        linkedHashMap.put("watch_period", C11831d.m20835a(C1010619.f24544a));
        linkedHashMap.put("broadcast_enter", C11831d.m20835a(C1010820.f24546a));
        linkedHashMap.put("broadcast_period", C11831d.m20835a(C1010921.f24547a));
        linkedHashMap.put("preview_enter", C11831d.m20835a(C1011022.f24548a));
        linkedHashMap.put("preview_period", C11831d.m20835a(C1011123.f24549a));
        linkedHashMap.put("broadcast_link_period", C11831d.m20835a(C1011224.f24550a));
        linkedHashMap.put("audience_link_period", C11831d.m20835a(C1011325.f24551a));
        linkedHashMap.put("pk_period", C11831d.m20835a(C101072.f24545a));
        linkedHashMap.put("gift_play", C11831d.m20835a(C101143.f24552a));
        linkedHashMap.put("panel_gift_slide", C11831d.m20835a(C101154.f24553a));
        linkedHashMap.put("panel_hourly_rank_slide", C11831d.m20835a(C101165.f24554a));
        linkedHashMap.put("panel_broadcast_link_slide", C11831d.m20835a(C101176.f24555a));
        linkedHashMap.put("panel_public_screen_slide", C11831d.m20835a(C101187.f24556a));
        linkedHashMap.put("panel_beauty_slide", C11831d.m20835a(C101198.f24557a));
        linkedHashMap.put("panel_filter_slide", C11831d.m20835a(C101209.f24558a));
        linkedHashMap.put("panel_sticker_slide", C11831d.m20835a(C1009710.f24535a));
        linkedHashMap2.put("watch_period", C11831d.m20835a(C1009811.f24536a));
        linkedHashMap2.put("broadcast_period", C11831d.m20835a(C1010013.f24538a));
        linkedHashMap2.put("preview_period", C11831d.m20835a(C1010114.f24539a));
        linkedHashMap2.put("broadcast_link_period", C11831d.m20835a(C1010215.f24540a));
        linkedHashMap2.put("audience_link_period", C11831d.m20835a(C1010316.f24541a));
        linkedHashMap2.put("pk_period", C11831d.m20835a(C1010417.f24542a));
        linkedHashMap2.put("broadcast_period", C11831d.m20835a(C1010518.f24543a));
    }

    /* renamed from: a */
    public static void m18633a(RecyclerView recyclerView) {
        C10085b bVar;
        C89219l.m154721d(recyclerView, "");
        AbstractC89244h<C10085b> hVar = f24528b.get("panel_gift_slide");
        if (hVar != null) {
            bVar = hVar.getValue();
        } else {
            bVar = null;
        }
        recyclerView.mo4405a(new C10088c(bVar));
    }
}
