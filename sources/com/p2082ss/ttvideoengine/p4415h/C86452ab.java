package com.p2082ss.ttvideoengine.p4415h;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ttvideoengine.p4430s.C86631b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.h.ab */
public final class C86452ab {

    /* renamed from: a */
    public int f193837a = 200;

    /* renamed from: b */
    public float f193838b;

    /* renamed from: c */
    public boolean f193839c;

    /* renamed from: d */
    public int f193840d = Integer.MIN_VALUE;

    /* renamed from: e */
    C86455b f193841e = new C86455b(this, (byte) 0);

    /* renamed from: f */
    public C86476o f193842f;

    /* renamed from: g */
    private final ReentrantLock f193843g = new ReentrantLock();

    static {
        Covode.recordClassIndex(101680);
    }

    /* renamed from: a */
    public final void mo137492a() {
        if (Math.random() > ((double) this.f193838b)) {
            this.f193839c = false;
        } else {
            this.f193839c = true;
        }
    }

    /* renamed from: b */
    public final void mo137495b() {
        this.f193843g.lock();
        try {
            if (this.f193839c) {
                this.f193839c = false;
                mo137493a(1);
            }
        } finally {
            this.f193843g.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ttvideoengine.h.ab$a */
    public static class RunnableC86453a implements Runnable {

        /* renamed from: a */
        private C86452ab f193844a;

        /* renamed from: b */
        private Handler f193845b = new Handler(Looper.getMainLooper());

        /* renamed from: c */
        private C86476o f193846c;

        /* renamed from: d */
        private Context f193847d;

        /* renamed from: e */
        private C86455b f193848e;

        static {
            Covode.recordClassIndex(101681);
        }

        public final void run() {
            if (this.f193844a != null) {
                final JSONObject a = C86452ab.m149194a(this.f193848e);
                Handler handler = this.f193845b;
                if (handler == null || handler.getLooper() == null) {
                    EnumC86487t.instance.addEventV2(true, a, "videoplayer_sample");
                } else {
                    this.f193845b.post(new Runnable() {
                        /* class com.p2082ss.ttvideoengine.p4415h.C86452ab.RunnableC86453a.RunnableC864541 */

                        static {
                            Covode.recordClassIndex(101682);
                        }

                        public final void run() {
                            EnumC86487t.instance.addEventV2(true, a, "videoplayer_sample");
                        }
                    });
                }
            }
        }

        public RunnableC86453a(Context context, C86452ab abVar, C86476o oVar, C86455b bVar) {
            this.f193844a = abVar;
            this.f193846c = oVar;
            this.f193847d = context;
            this.f193848e = bVar;
        }
    }

    /* renamed from: e */
    private boolean m149195e() {
        Map map = this.f193842f.f193971aa;
        if (map == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : ((Map) map.get("fileKey")).values()) {
            if (str.equals("") || str.equals("0")) {
                return false;
            }
            arrayList.add(str);
        }
        int i = 0;
        while (i < arrayList.size()) {
            String str2 = (String) arrayList.get(i);
            i++;
            int i2 = i;
            while (true) {
                if (i2 < arrayList.size()) {
                    if (str2.equals(arrayList.get(i2))) {
                        return false;
                    }
                    i2++;
                }
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo137496c() {
        C86476o oVar = this.f193842f;
        if (oVar != null) {
            if (oVar.f193970a != null) {
                this.f193841e.f193856F.add(Integer.valueOf(this.f193842f.f193970a.mo137292c(67)));
                this.f193841e.f193854D.add(Long.valueOf(this.f193842f.f193970a.mo137290b(68)));
                Map map = this.f193842f.f193971aa;
                if (map != null) {
                    Map map2 = (Map) map.get("bitrate");
                    if (map2 != null) {
                        Integer num = (Integer) map2.get(this.f193842f.f193960Q);
                        if (num == null) {
                            this.f193841e.f193877j.add(-1);
                        } else if (num.intValue() == 0) {
                            this.f193841e.f193877j.add(-1);
                        } else {
                            this.f193841e.f193877j.add(mo137491a(num));
                        }
                    }
                    ArrayList arrayList = (ArrayList) map.get("audio_bitrate");
                    if (arrayList != null && !arrayList.isEmpty()) {
                        if (arrayList.get(0) == null) {
                            this.f193841e.f193890w.add(-1);
                        } else if (((Integer) arrayList.get(0)).intValue() == 0) {
                            this.f193841e.f193890w.add(-1);
                        } else {
                            this.f193841e.f193890w.add(mo137491a((Integer) arrayList.get(0)));
                        }
                    }
                }
            }
            this.f193841e.f193855E.add(Float.valueOf(this.f193842f.f193968Y));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo137497d() {
        if (this.f193841e.f193871d > this.f193837a || this.f193841e.f193884q > this.f193837a) {
            if (!this.f193841e.f193856F.isEmpty()) {
                this.f193841e.f193856F.remove(0);
            }
            if (!this.f193841e.f193854D.isEmpty()) {
                this.f193841e.f193854D.remove(0);
            }
            if (!this.f193841e.f193855E.isEmpty()) {
                this.f193841e.f193855E.remove(0);
            }
            if (!this.f193841e.f193872e.isEmpty()) {
                this.f193841e.f193872e.remove(0);
            }
            if (!this.f193841e.f193873f.isEmpty()) {
                this.f193841e.f193873f.remove(0);
            }
            if (!this.f193841e.f193874g.isEmpty()) {
                this.f193841e.f193874g.remove(0);
            }
            if (!this.f193841e.f193875h.isEmpty()) {
                this.f193841e.f193875h.remove(0);
            }
            if (!this.f193841e.f193876i.isEmpty()) {
                this.f193841e.f193876i.remove(0);
            }
            if (!this.f193841e.f193878k.isEmpty()) {
                this.f193841e.f193878k.remove(0);
            }
            if (!this.f193841e.f193877j.isEmpty()) {
                this.f193841e.f193877j.remove(0);
            }
            if (!this.f193841e.f193879l.isEmpty()) {
                this.f193841e.f193879l.remove(0);
            }
            if (!this.f193841e.f193880m.isEmpty()) {
                this.f193841e.f193880m.remove(0);
            }
            if (!this.f193841e.f193881n.isEmpty()) {
                this.f193841e.f193881n.remove(0);
            }
            if (!this.f193841e.f193882o.isEmpty()) {
                this.f193841e.f193882o.remove(0);
            }
            if (!this.f193841e.f193883p.isEmpty()) {
                this.f193841e.f193883p.remove(0);
            }
            C86455b bVar = this.f193841e;
            bVar.f193871d--;
            if (!this.f193841e.f193885r.isEmpty()) {
                this.f193841e.f193885r.remove(0);
            }
            if (!this.f193841e.f193886s.isEmpty()) {
                this.f193841e.f193886s.remove(0);
            }
            if (!this.f193841e.f193887t.isEmpty()) {
                this.f193841e.f193887t.remove(0);
            }
            if (!this.f193841e.f193888u.isEmpty()) {
                this.f193841e.f193888u.remove(0);
            }
            if (!this.f193841e.f193889v.isEmpty()) {
                this.f193841e.f193889v.remove(0);
            }
            if (!this.f193841e.f193890w.isEmpty()) {
                this.f193841e.f193890w.remove(0);
            }
            if (!this.f193841e.f193891x.isEmpty()) {
                this.f193841e.f193891x.remove(0);
            }
            if (!this.f193841e.f193892y.isEmpty()) {
                this.f193841e.f193892y.remove(0);
            }
            if (!this.f193841e.f193893z.isEmpty()) {
                this.f193841e.f193893z.remove(0);
            }
            if (!this.f193841e.f193851A.isEmpty()) {
                this.f193841e.f193851A.remove(0);
            }
            if (!this.f193841e.f193852B.isEmpty()) {
                this.f193841e.f193852B.remove(0);
            }
            if (!this.f193841e.f193853C.isEmpty()) {
                this.f193841e.f193853C.remove(0);
            }
            C86455b bVar2 = this.f193841e;
            bVar2.f193884q--;
        }
    }

    C86452ab(C86476o oVar) {
        this.f193842f = oVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Integer mo137491a(Integer num) {
        Map map;
        Map map2;
        C86476o oVar = this.f193842f;
        if (oVar == null || (map = oVar.f193971aa) == null || (map2 = (Map) map.get("bitrateMapTable")) == null) {
            return num;
        }
        if (map2.get(num) == null) {
            return -1;
        }
        return (Integer) map2.get(num);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ttvideoengine.h.ab$b */
    public class C86455b {

        /* renamed from: A */
        public ArrayList<Long> f193851A;

        /* renamed from: B */
        public ArrayList<Long> f193852B;

        /* renamed from: C */
        public ArrayList<String> f193853C;

        /* renamed from: D */
        public ArrayList<Long> f193854D;

        /* renamed from: E */
        public ArrayList<Float> f193855E;

        /* renamed from: F */
        public ArrayList<Integer> f193856F;

        /* renamed from: G */
        public int f193857G;

        /* renamed from: H */
        public String f193858H;

        /* renamed from: I */
        public String f193859I;

        /* renamed from: J */
        public String f193860J;

        /* renamed from: K */
        public ArrayList<Integer> f193861K;

        /* renamed from: L */
        public ArrayList<Integer> f193862L;

        /* renamed from: M */
        public JSONObject f193863M;

        /* renamed from: N */
        public String f193864N;

        /* renamed from: O */
        public int f193865O;

        /* renamed from: P */
        public int f193866P;

        /* renamed from: a */
        public long f193868a;

        /* renamed from: b */
        public int f193869b;

        /* renamed from: c */
        public int f193870c;

        /* renamed from: d */
        public int f193871d;

        /* renamed from: e */
        public ArrayList<Integer> f193872e;

        /* renamed from: f */
        public ArrayList<Float> f193873f;

        /* renamed from: g */
        public ArrayList<String> f193874g;

        /* renamed from: h */
        public ArrayList<Float> f193875h;

        /* renamed from: i */
        public ArrayList<String> f193876i;

        /* renamed from: j */
        public ArrayList<Integer> f193877j;

        /* renamed from: k */
        public ArrayList<Integer> f193878k;

        /* renamed from: l */
        public ArrayList<Float> f193879l;

        /* renamed from: m */
        public ArrayList<Long> f193880m;

        /* renamed from: n */
        public ArrayList<Long> f193881n;

        /* renamed from: o */
        public ArrayList<Long> f193882o;

        /* renamed from: p */
        public ArrayList<String> f193883p;

        /* renamed from: q */
        public int f193884q;

        /* renamed from: r */
        public ArrayList<Integer> f193885r;

        /* renamed from: s */
        public ArrayList<Float> f193886s;

        /* renamed from: t */
        public ArrayList<String> f193887t;

        /* renamed from: u */
        public ArrayList<Float> f193888u;

        /* renamed from: v */
        public ArrayList<String> f193889v;

        /* renamed from: w */
        public ArrayList<Integer> f193890w;

        /* renamed from: x */
        public ArrayList<Integer> f193891x;

        /* renamed from: y */
        public ArrayList<Float> f193892y;

        /* renamed from: z */
        public ArrayList<Long> f193893z;

        static {
            Covode.recordClassIndex(101683);
        }

        private C86455b() {
            this.f193868a = -2147483648L;
            this.f193869b = -1;
            this.f193870c = Integer.MIN_VALUE;
            this.f193872e = new ArrayList<>();
            this.f193873f = new ArrayList<>();
            this.f193874g = new ArrayList<>();
            this.f193875h = new ArrayList<>();
            this.f193876i = new ArrayList<>();
            this.f193877j = new ArrayList<>();
            this.f193878k = new ArrayList<>();
            this.f193879l = new ArrayList<>();
            this.f193880m = new ArrayList<>();
            this.f193881n = new ArrayList<>();
            this.f193882o = new ArrayList<>();
            this.f193883p = new ArrayList<>();
            this.f193884q = 0;
            this.f193885r = new ArrayList<>();
            this.f193886s = new ArrayList<>();
            this.f193887t = new ArrayList<>();
            this.f193888u = new ArrayList<>();
            this.f193889v = new ArrayList<>();
            this.f193890w = new ArrayList<>();
            this.f193891x = new ArrayList<>();
            this.f193892y = new ArrayList<>();
            this.f193893z = new ArrayList<>();
            this.f193851A = new ArrayList<>();
            this.f193852B = new ArrayList<>();
            this.f193853C = new ArrayList<>();
            this.f193854D = new ArrayList<>();
            this.f193855E = new ArrayList<>();
            this.f193856F = new ArrayList<>();
            this.f193857G = 0;
            this.f193858H = "";
            this.f193859I = "";
            this.f193860J = "";
            this.f193861K = new ArrayList<>();
            this.f193862L = new ArrayList<>();
            this.f193864N = "";
            this.f193865O = -1;
            this.f193866P = -1;
        }

        /* synthetic */ C86455b(C86452ab abVar, byte b) {
            this();
        }
    }

    /* renamed from: a */
    public static JSONObject m149194a(C86455b bVar) {
        HashMap hashMap = new HashMap();
        C86470l.m149394a(hashMap, "local_time_ms", bVar.f193868a);
        C86470l.m149393a((Map) hashMap, "is_abr", bVar.f193869b);
        C86470l.m149395a(hashMap, "vtype", bVar.f193864N);
        C86470l.m149393a((Map) hashMap, "sample_interval", bVar.f193870c);
        C86470l.m149393a((Map) hashMap, "video_sample_count", bVar.f193871d);
        C86470l.m149396a(hashMap, "video_sample_interval", bVar.f193872e);
        C86470l.m149396a(hashMap, "video_network_speed_sampling_set", bVar.f193873f);
        C86470l.m149396a(hashMap, "video_network_speed_sampling_load_types", bVar.f193874g);
        C86470l.m149396a(hashMap, "video_network_speed_predict_set", bVar.f193875h);
        C86470l.m149396a(hashMap, "video_network_speed_predict_load_types", bVar.f193876i);
        C86470l.m149396a(hashMap, "video_play_bitrate_set", bVar.f193877j);
        C86470l.m149396a(hashMap, "video_download_bitrate_set", bVar.f193878k);
        C86470l.m149396a(hashMap, "video_download_size_set", bVar.f193879l);
        C86470l.m149396a(hashMap, "video_download_costtime_set", bVar.f193880m);
        C86470l.m149396a(hashMap, "video_tcpInfo_rtt_set", bVar.f193881n);
        C86470l.m149396a(hashMap, "video_tcpInfo_lastRecvDate", bVar.f193882o);
        C86470l.m149396a(hashMap, "video_mdl_loader_type", bVar.f193883p);
        C86470l.m149393a((Map) hashMap, "audio_sample_count", bVar.f193884q);
        C86470l.m149396a(hashMap, "audio_sample_interval", bVar.f193885r);
        C86470l.m149396a(hashMap, "audio_network_speed_sampling_set", bVar.f193886s);
        C86470l.m149396a(hashMap, "audio_network_speed_sampling_load_types", bVar.f193887t);
        C86470l.m149396a(hashMap, "audio_network_speed_predict_set", bVar.f193888u);
        C86470l.m149396a(hashMap, "audio_network_speed_predict_load_types", bVar.f193889v);
        C86470l.m149396a(hashMap, "audio_play_bitrate_set", bVar.f193890w);
        C86470l.m149396a(hashMap, "audio_download_bitrate_set", bVar.f193891x);
        C86470l.m149396a(hashMap, "audio_download_size_set", bVar.f193892y);
        C86470l.m149396a(hashMap, "audio_download_costtime_set", bVar.f193893z);
        C86470l.m149396a(hashMap, "audio_tcpInfo_rtt_set", bVar.f193851A);
        C86470l.m149396a(hashMap, "audio_tcpInfo_lastRecvDate", bVar.f193852B);
        C86470l.m149396a(hashMap, "audio_mdl_loader_type", bVar.f193853C);
        C86470l.m149396a(hashMap, "buffer_len_set", bVar.f193854D);
        C86470l.m149396a(hashMap, "play_speed_set", bVar.f193855E);
        C86470l.m149396a(hashMap, "play_pos_set", bVar.f193856F);
        C86470l.m149393a((Map) hashMap, "index", bVar.f193857G);
        C86470l.m149395a(hashMap, "player_sessionid", bVar.f193858H);
        C86470l.m149395a(hashMap, "video_id", bVar.f193859I);
        C86470l.m149396a(hashMap, "video_bitrate_set", bVar.f193861K);
        C86470l.m149396a(hashMap, "audio_bitrate_set", bVar.f193862L);
        C86470l.m149393a((Map) hashMap, "is_multi_dimensions", bVar.f193865O);
        C86470l.m149393a((Map) hashMap, "is_multi_dimensions_input", bVar.f193866P);
        JSONObject jSONObject = new JSONObject(hashMap);
        try {
            jSONObject.put("bitrate_map_table", bVar.f193863M);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v30, resolved type: java.util.ArrayList<java.lang.Integer> */
    /* JADX DEBUG: Multi-variable search result rejected for r0v35, resolved type: java.util.ArrayList<java.lang.Integer> */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo137493a(int i) {
        if (!(this.f193841e.f193871d == 0 && this.f193841e.f193884q == 0 && !m149195e())) {
            this.f193841e.f193868a = System.currentTimeMillis();
            this.f193841e.f193870c = this.f193840d;
            C86476o oVar = this.f193842f;
            if (oVar != null) {
                this.f193841e.f193869b = oVar.f193984an;
                this.f193841e.f193865O = this.f193842f.f193985ao;
                this.f193841e.f193866P = this.f193842f.f193986ap;
                this.f193841e.f193858H = this.f193842f.f194003r;
                this.f193841e.f193859I = this.f193842f.f193946C;
                this.f193841e.f193860J = this.f193842f.f194007v;
                this.f193841e.f193864N = this.f193842f.f193957N;
                Map map = this.f193842f.f193971aa;
                if (map != null) {
                    if (map.get("bitrateMapTable") != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            for (Map.Entry entry : ((Map) map.get("bitrateMapTable")).entrySet()) {
                                jSONObject.put(((Integer) entry.getKey()).toString(), entry.getValue());
                            }
                            this.f193841e.f193863M = jSONObject;
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    if (map.get("video_bitrate") != null) {
                        Iterator it = ((ArrayList) map.get("video_bitrate")).iterator();
                        while (it.hasNext()) {
                            this.f193841e.f193861K.add(it.next());
                        }
                    }
                    if (map.get("audio_bitrate") != null) {
                        Iterator it2 = ((ArrayList) map.get("audio_bitrate")).iterator();
                        while (it2.hasNext()) {
                            this.f193841e.f193862L.add(it2.next());
                        }
                    }
                }
            }
            C86631b.m150044a(new RunnableC86453a(this.f193842f.f193973ac, this, this.f193842f, this.f193841e));
            C86455b bVar = new C86455b(this, (byte) 0);
            this.f193841e = bVar;
            if (i == 0) {
                bVar.f193857G = 1;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo137494a(Map<String, String> map, int i) {
        if (map != null && map.size() > 0 && i <= 1) {
            if (i == 0) {
                String str = map.get("download_size");
                String str2 = map.get("download_time");
                String str3 = map.get("rtt");
                String str4 = map.get("last_data_recv");
                String str5 = map.get("mdl_loader_type");
                if (str != null) {
                    this.f193841e.f193879l.add(Float.valueOf(Float.parseFloat(str)));
                }
                if (str2 != null) {
                    this.f193841e.f193880m.add(Long.valueOf(Long.parseLong(str2)));
                }
                if (str3 != null) {
                    this.f193841e.f193881n.add(Long.valueOf(Long.parseLong(str3)));
                }
                if (str4 != null) {
                    this.f193841e.f193882o.add(Long.valueOf(Long.parseLong(str4)));
                }
                if (str5 != null) {
                    this.f193841e.f193883p.add(str5);
                }
            } else if (i == 1) {
                String str6 = map.get("download_size");
                String str7 = map.get("download_time");
                String str8 = map.get("rtt");
                String str9 = map.get("last_data_recv");
                String str10 = map.get("mdl_loader_type");
                if (str6 != null) {
                    this.f193841e.f193892y.add(Float.valueOf(Float.parseFloat(str6)));
                }
                if (str7 != null) {
                    this.f193841e.f193893z.add(Long.valueOf(Long.parseLong(str7)));
                }
                if (str8 != null) {
                    this.f193841e.f193851A.add(Long.valueOf(Long.parseLong(str8)));
                }
                if (str9 != null) {
                    this.f193841e.f193852B.add(Long.valueOf(Long.parseLong(str9)));
                }
                if (str10 != null) {
                    this.f193841e.f193853C.add(str10);
                }
            }
        }
    }
}
