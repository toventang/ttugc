package com.p2082ss.android.ugc.aweme.playerkit.p3555a;

import com.bytedance.covode.number.Covode;
import com.google.gson.C27919i;
import com.google.gson.C28022o;
import com.p2082ss.android.ugc.playerkit.exp.PlayerSettingService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.playerkit.a.f */
public final class C63102f {

    /* renamed from: a */
    public final C27919i f143402a;

    /* renamed from: b */
    public final C27919i f143403b;

    /* renamed from: c */
    public C28022o f143404c;

    /* renamed from: d */
    public Map<String, String> f143405d;

    /* renamed from: e */
    public final C27919i f143406e;

    /* renamed from: f */
    public final List<AbstractC63101e> f143407f;

    /* renamed from: g */
    public String f143408g;

    /* renamed from: com.ss.android.ugc.aweme.playerkit.a.f$a */
    public static class C63103a {

        /* renamed from: a */
        public C27919i f143409a;

        /* renamed from: b */
        public C27919i f143410b;

        /* renamed from: c */
        public C28022o f143411c;

        /* renamed from: d */
        public Map<String, String> f143412d;

        /* renamed from: e */
        public List<AbstractC63101e> f143413e = new ArrayList();

        static {
            Covode.recordClassIndex(73944);
        }
    }

    static {
        Covode.recordClassIndex(73943);
    }

    /* renamed from: com.ss.android.ugc.aweme.playerkit.a.f$b */
    public static class C63104b {

        /* renamed from: a */
        public C27919i f143414a;

        /* renamed from: b */
        public C27919i f143415b;

        /* renamed from: c */
        public C28022o f143416c;

        /* renamed from: d */
        public Map<String, String> f143417d;

        /* renamed from: e */
        public C27919i f143418e;

        /* renamed from: f */
        public List<AbstractC63101e> f143419f = new ArrayList();

        static {
            Covode.recordClassIndex(73945);
        }

        /* renamed from: a */
        public static boolean m114037a() {
            if (PlayerSettingService.isDebug()) {
                return true;
            }
            return false;
        }
    }

    private C63102f(C27919i iVar, C27919i iVar2, C28022o oVar, C27919i iVar3, List<AbstractC63101e> list) {
        this.f143402a = iVar;
        this.f143403b = iVar2;
        this.f143404c = oVar;
        this.f143406e = iVar3;
        this.f143407f = list;
    }

    public /* synthetic */ C63102f(C27919i iVar, C27919i iVar2, C28022o oVar, C27919i iVar3, List list, byte b) {
        this(iVar, iVar2, oVar, iVar3, list);
    }
}
