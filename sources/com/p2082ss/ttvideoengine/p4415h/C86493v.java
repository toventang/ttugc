package com.p2082ss.ttvideoengine.p4415h;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ttvideoengine.p4430s.C86631b;
import com.p2082ss.ttvideoengine.p4430s.C86641i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.h.v */
public final class C86493v {

    /* renamed from: a */
    public C86476o f194290a;

    /* renamed from: b */
    C86495b f194291b = new C86495b((byte) 0);

    /* renamed from: c */
    public boolean f194292c;

    /* renamed from: d */
    int f194293d;

    /* renamed from: e */
    public ArrayList<String> f194294e;

    /* renamed from: f */
    public ArrayList<String> f194295f;

    static {
        Covode.recordClassIndex(101721);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ttvideoengine.h.v$b */
    public static class C86495b {

        /* renamed from: a */
        int f194300a;

        /* renamed from: b */
        long f194301b;

        /* renamed from: c */
        long f194302c;

        /* renamed from: d */
        long f194303d;

        /* renamed from: e */
        long f194304e;

        /* renamed from: f */
        long f194305f;

        /* renamed from: g */
        long f194306g;

        /* renamed from: h */
        long f194307h;

        /* renamed from: i */
        long f194308i;

        /* renamed from: j */
        String f194309j;

        static {
            Covode.recordClassIndex(101723);
        }

        private C86495b() {
            this.f194300a = Integer.MIN_VALUE;
            this.f194301b = -2147483648L;
            this.f194302c = -2147483648L;
            this.f194303d = -2147483648L;
            this.f194304e = -2147483648L;
            this.f194305f = -2147483648L;
            this.f194306g = -2147483648L;
            this.f194307h = -2147483648L;
            this.f194308i = -2147483648L;
        }

        /* synthetic */ C86495b(byte b) {
            this();
        }
    }

    /* renamed from: b */
    private void m149602b() {
        String a = m149600a(this.f194291b);
        if (!TextUtils.isEmpty(a)) {
            if (this.f194291b.f194300a == 0) {
                if (this.f194295f == null) {
                    this.f194295f = new ArrayList<>();
                }
                this.f194295f.add(a);
            } else if (this.f194291b.f194300a == 1) {
                if (this.f194294e == null) {
                    this.f194294e = new ArrayList<>();
                }
                this.f194294e.add(a);
            }
        }
    }

    /* renamed from: c */
    private void m149603c() {
        if (this.f194291b.f194308i < 1000) {
            C86641i.m150113b("VideoEventOneNoRender", "duration less than threshold, abort event");
            return;
        }
        this.f194293d++;
        this.f194290a.mo137679a();
        C86631b.m150044a(new RunnableC86494a(this, this.f194290a, this.f194291b));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ttvideoengine.h.v$a */
    public static class RunnableC86494a implements Runnable {

        /* renamed from: a */
        private final C86493v f194296a;

        /* renamed from: b */
        private final Handler f194297b = new Handler(Looper.getMainLooper());

        /* renamed from: c */
        private final C86476o f194298c;

        /* renamed from: d */
        private final C86495b f194299d;

        static {
            Covode.recordClassIndex(101722);
        }

        public final void run() {
            boolean z;
            if (this.f194296a != null) {
                C86476o oVar = this.f194298c;
                if (oVar == null || !oVar.f193989as) {
                    z = false;
                } else {
                    z = true;
                }
                C86493v vVar = this.f194296a;
                C86476o oVar2 = this.f194298c;
                C86495b bVar = this.f194299d;
                HashMap hashMap = new HashMap();
                C86470l.m149395a(hashMap, "event_type", "av_norender");
                if (oVar2 != null) {
                    C86470l.m149395a(hashMap, "player_sessionid", oVar2.f194003r);
                    C86470l.m149395a(hashMap, "sdk_version", oVar2.f193996k);
                }
                C86470l.m149395a(hashMap, "r_stage_errcs", bVar.f194309j);
                C86470l.m149394a(hashMap, "video_len_before", bVar.f194301b);
                C86470l.m149394a(hashMap, "audio_len_before", bVar.f194302c);
                C86470l.m149394a(hashMap, "vlen_dec_before", bVar.f194303d);
                C86470l.m149394a(hashMap, "alen_dec_before", bVar.f194304e);
                C86470l.m149394a(hashMap, "vlen_base_before", bVar.f194305f);
                C86470l.m149394a(hashMap, "alen_base_before", bVar.f194306g);
                C86470l.m149394a(hashMap, "cost_time", bVar.f194308i);
                C86470l.m149393a((Map) hashMap, "index", vVar.f194293d);
                C86470l.m149393a((Map) hashMap, "norender_type", bVar.f194300a);
                this.f194297b.post(new RunnableC86496w(z, new JSONObject(hashMap)));
            }
        }

        public RunnableC86494a(C86493v vVar, C86476o oVar, C86495b bVar) {
            this.f194296a = vVar;
            this.f194298c = oVar;
            this.f194299d = bVar;
        }
    }

    /* renamed from: a */
    public final void mo137708a() {
        if (this.f194292c) {
            this.f194292c = false;
            if (this.f194291b.f194307h > 0) {
                this.f194291b.f194308i = System.currentTimeMillis() - this.f194291b.f194307h;
            }
            m149602b();
            m149603c();
            this.f194291b = new C86495b((byte) 0);
        }
    }

    public C86493v(C86476o oVar) {
        this.f194290a = oVar;
    }

    /* renamed from: a */
    private static String m149600a(C86495b bVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("st", Long.valueOf(bVar.f194307h));
        hashMap.put("c", Long.valueOf(bVar.f194308i));
        try {
            return new JSONObject(hashMap).toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    static String m149601a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        String[] split = str.split(";|=");
        if (split == null || split.length == 0) {
            return null;
        }
        for (int i = 0; i < split.length - 1; i += 2) {
            try {
                hashMap.put(split[i], Integer.valueOf(Integer.parseInt(split[i + 1])));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        return new JSONObject(hashMap).toString();
    }
}
