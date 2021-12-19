package com.p2082ss.ttvideoengine.p4426p.p4427a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ttvideoengine.C86313ai;
import com.p2082ss.ttvideoengine.p4426p.AbstractC86608b;
import com.p2082ss.ttvideoengine.p4426p.C86599a;
import com.p2082ss.ttvideoengine.p4426p.C86610c;
import com.p2082ss.ttvideoengine.p4426p.p4427a.C86601a;
import com.p2082ss.ttvideoengine.p4430s.C86633c;
import com.p2082ss.ttvideoengine.p4430s.C86641i;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.ttvideoengine.p.a.b */
public final class C86606b {

    /* renamed from: a */
    public AbstractC86608b f195139a;

    /* renamed from: b */
    public int f195140b = -1;

    /* renamed from: c */
    public C86601a.C86605c f195141c;

    /* renamed from: d */
    private final List<C86601a.EnumC86604b> f195142d = new ArrayList();

    static {
        Covode.recordClassIndex(101834);
    }

    /* renamed from: a */
    private static boolean m150003a(int i) {
        return i == 1 || i == 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ttvideoengine.p.a.b$1 */
    public static /* synthetic */ class C866071 {

        /* renamed from: a */
        static final /* synthetic */ int[] f195143a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        static {
            /*
                r0 = 101835(0x18dcb, float:1.42701E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.ttvideoengine.p.b$a[] r0 = com.p2082ss.ttvideoengine.p4426p.AbstractC86608b.EnumC86609a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.p2082ss.ttvideoengine.p4426p.p4427a.C86606b.C866071.f195143a = r2
                com.ss.ttvideoengine.p.b$a r0 = com.p2082ss.ttvideoengine.p4426p.AbstractC86608b.EnumC86609a.DIRECT_URL_SOURCE     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.p2082ss.ttvideoengine.p4426p.p4427a.C86606b.C866071.f195143a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.ttvideoengine.p.b$a r0 = com.p2082ss.ttvideoengine.p4426p.AbstractC86608b.EnumC86609a.VID_PLAY_AUTH_TOKEN_SOURCE     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttvideoengine.p4426p.p4427a.C86606b.C866071.<clinit>():void");
        }
    }

    /* renamed from: a */
    public final boolean mo137870a(C86313ai aiVar, C86633c cVar) {
        if (cVar == null || cVar.f195251a != -499981) {
            return false;
        }
        AbstractC86608b bVar = this.f195139a;
        C86601a.C86605c cVar2 = this.f195141c;
        int i = this.f195140b;
        if (bVar == null || cVar2 == null || !m150003a(i)) {
            return false;
        }
        C86601a.EnumC86604b bVar2 = cVar2.f195135a;
        if (bVar2 != null && !this.f195142d.contains(bVar2)) {
            this.f195142d.add(bVar2);
        }
        C86601a.C86605c a = C86601a.m149999a(bVar, this.f195142d);
        if (a == null) {
            if (C86641i.m150114b()) {
                C86641i.m150117e("CodecStrategyAdapter", "resolveFallback return null! " + bVar + "  " + i + " " + this.f195142d + " " + C86601a.C86603a.m150001a());
            }
            return false;
        }
        if (C86641i.m150111a()) {
            C86641i.m150113b("CodecStrategyAdapter", "resolveFallback " + a + " " + C86601a.C86603a.m150001a());
        }
        m150002a(aiVar, bVar, a);
        aiVar.mo137251k();
        return true;
    }

    /* renamed from: a */
    private void m150002a(C86313ai aiVar, AbstractC86608b bVar, C86601a.C86605c cVar) {
        int i;
        this.f195141c = cVar;
        C86601a.EnumC86604b bVar2 = cVar.f195135a;
        if (bVar2.decoder == 1) {
            i = 1;
        } else {
            i = 0;
        }
        boolean equals = TextUtils.equals(bVar2.encodeType, "bytevc1");
        boolean equals2 = TextUtils.equals(bVar2.encodeType, "bytevc2");
        AbstractC86608b.EnumC86609a a = bVar.mo137865a();
        int i2 = C866071.f195143a[a.ordinal()];
        if (i2 == 1) {
            C86599a.C86600a aVar = cVar.f195138d;
            aiVar.mo137198b(aVar.f195127c);
            aiVar.mo137199b(aVar.f195125a, aVar.f195126b);
            aiVar.mo137230f(7, i);
        } else if (i2 == 2) {
            aiVar.mo137219d(bVar.mo137866b());
            aiVar.mo137249j(((C86610c) bVar).f195146b);
            aiVar.mo137230f(7, i);
            aiVar.mo137230f(6, equals ? 1 : 0);
            aiVar.mo137230f(432, equals2 ? 1 : 0);
        } else {
            throw new IllegalArgumentException("unsupported source type! ".concat(String.valueOf(a)));
        }
        aiVar.mo137230f(670, 0);
    }
}
