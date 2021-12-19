package com.p2082ss.android.ugc.aweme.p3452ml.data;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3452ml.data.C60038e;
import com.p2082ss.android.ugc.aweme.p3452ml.data.C60041f;
import com.p2082ss.android.ugc.aweme.p3452ml.data.C60045g;
import com.p2082ss.android.ugc.aweme.p3452ml.p3453a.C59975a;
import com.p2082ss.android.ugc.aweme.p3452ml.p3453a.C59981e;
import com.p2082ss.android.ugc.aweme.p3452ml.p3455b.C60015b;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import p4600h.p4601a.C89047am;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ml.data.b */
public final class C60030b {

    /* renamed from: a */
    static final Set<String> f136740a = C89047am.m154438a((Object[]) new String[]{"click_comment_button", "video_play_finish", "like", "enter_personal_detail", "enter_music_detail", "follow", "click_more_button", "post_comment", "dislike", "video_pause", "favourite_video", "enter_tag_detail", "livesdk_room_enter_success", "livesdk_live_duration", "poi_click"});

    /* renamed from: b */
    static boolean f136741b = C59975a.f136570a;

    /* renamed from: c */
    static boolean f136742c;

    /* renamed from: d */
    static final HashSet<String> f136743d = new HashSet<>();

    /* renamed from: e */
    public static final C60030b f136744e = new C60030b();

    private C60030b() {
    }

    static {
        Covode.recordClassIndex(70495);
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.data.b$a */
    static final class RunnableC60031a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f136745a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f136746b;

        static {
            Covode.recordClassIndex(70496);
        }

        RunnableC60031a(String str, JSONObject jSONObject) {
            this.f136745a = str;
            this.f136746b = jSONObject;
        }

        public final void run() {
            String a;
            AtomicInteger atomicInteger;
            String a2;
            AtomicInteger atomicInteger2;
            String a3;
            C60015b a4;
            AtomicInteger atomicInteger3;
            String a5;
            AtomicInteger atomicInteger4;
            String a6;
            AtomicInteger atomicInteger5;
            String a7;
            AtomicInteger atomicInteger6;
            String a8;
            AtomicInteger atomicInteger7;
            String a9;
            AtomicInteger atomicInteger8;
            String a10;
            AtomicInteger atomicInteger9;
            String a11;
            C60015b a12;
            AtomicInteger atomicInteger10;
            String a13;
            AtomicInteger atomicInteger11;
            String a14;
            C60015b a15;
            AtomicInteger atomicInteger12;
            try {
                String str = this.f136745a;
                JSONObject jSONObject = this.f136746b;
                switch (str.hashCode()) {
                    case -1642623552:
                        if (str.equals("post_comment")) {
                            C60045g.C60047b.f136797a.f136777d++;
                            break;
                        }
                        break;
                    case -1330248535:
                        if (str.equals("click_comment_button") && (a = C60030b.m109522a(jSONObject)) != null) {
                            C60015b a16 = C60041f.C60043b.f136769a.mo97489a(a);
                            if (!(a16 == null || (atomicInteger = a16.f136676b) == null)) {
                                atomicInteger.getAndIncrement();
                            }
                            C60045g.C60047b.f136797a.f136780g++;
                            break;
                        }
                    case -1284480695:
                        if (str.equals("livesdk_room_enter_success")) {
                            C60045g.C60047b.f136797a.f136781h++;
                            break;
                        }
                        break;
                    case -1268958287:
                        if (str.equals("follow") && (a2 = C60030b.m109522a(jSONObject)) != null) {
                            C60015b a17 = C60041f.C60043b.f136769a.mo97489a(a2);
                            if (!(a17 == null || (atomicInteger2 = a17.f136679e) == null)) {
                                atomicInteger2.getAndIncrement();
                            }
                            C60045g.C60047b.f136797a.f136785l++;
                            break;
                        }
                    case -1213756323:
                        if (!(!str.equals("enter_tag_detail") || (a3 = C60030b.m109522a(jSONObject)) == null || (a4 = C60041f.C60043b.f136769a.mo97489a(a3)) == null || (atomicInteger3 = a4.f136686l) == null)) {
                            atomicInteger3.getAndIncrement();
                            break;
                        }
                    case -1115849514:
                        if (str.equals("livesdk_live_duration")) {
                            C60045g.C60047b.f136797a.f136782i += C59981e.m109500a(jSONObject);
                            break;
                        }
                        break;
                    case -1115125979:
                        if (str.equals("click_more_button") && (a5 = C60030b.m109522a(jSONObject)) != null) {
                            C60015b a18 = C60041f.C60043b.f136769a.mo97489a(a5);
                            if (!(a18 == null || (atomicInteger4 = a18.f136681g) == null)) {
                                atomicInteger4.getAndIncrement();
                            }
                            C60045g.C60047b.f136797a.f136789p++;
                            break;
                        }
                    case -795864119:
                        if (str.equals("enter_personal_detail") && (a6 = C60030b.m109522a(jSONObject)) != null) {
                            C60015b a19 = C60041f.C60043b.f136769a.mo97489a(a6);
                            if (!(a19 == null || (atomicInteger5 = a19.f136678d) == null)) {
                                atomicInteger5.getAndIncrement();
                            }
                            C60045g.C60047b.f136797a.f136778e++;
                            break;
                        }
                    case -405326491:
                        if (str.equals("favourite_video") && (a7 = C60030b.m109522a(jSONObject)) != null) {
                            C60015b a20 = C60041f.C60043b.f136769a.mo97489a(a7);
                            if (!(a20 == null || (atomicInteger6 = a20.f136685k) == null)) {
                                atomicInteger6.getAndIncrement();
                            }
                            C60045g.C60047b.f136797a.f136786m++;
                            break;
                        }
                    case -17674694:
                        if (str.equals("video_play_finish") && (a8 = C60030b.m109522a(jSONObject)) != null) {
                            C60015b a21 = C60041f.C60043b.f136769a.mo97489a(a8);
                            if (!(a21 == null || (atomicInteger7 = a21.f136677c) == null)) {
                                atomicInteger7.getAndIncrement();
                            }
                            C60045g.C60047b.f136797a.f136784k++;
                            break;
                        }
                    case 3321751:
                        if (str.equals("like") && (a9 = C60030b.m109522a(jSONObject)) != null) {
                            C60015b a22 = C60041f.C60043b.f136769a.mo97489a(a9);
                            if (!(a22 == null || (atomicInteger8 = a22.f136675a) == null)) {
                                atomicInteger8.getAndIncrement();
                            }
                            C60045g.C60047b.f136797a.f136783j++;
                            break;
                        }
                    case 1120107347:
                        if (str.equals("poi_click") && (a10 = C60030b.m109522a(jSONObject)) != null) {
                            C60015b a23 = C60041f.C60043b.f136769a.mo97489a(a10);
                            if (!(a23 == null || (atomicInteger9 = a23.f136687m) == null)) {
                                atomicInteger9.getAndIncrement();
                            }
                            C60045g.C60047b.f136797a.f136787n++;
                            break;
                        }
                    case 1382290738:
                        if (!(!str.equals("video_pause") || (a11 = C60030b.m109522a(jSONObject)) == null || (a12 = C60041f.C60043b.f136769a.mo97489a(a11)) == null || (atomicInteger10 = a12.f136684j) == null)) {
                            atomicInteger10.getAndIncrement();
                            break;
                        }
                    case 1438590386:
                        if (str.equals("enter_music_detail") && (a13 = C60030b.m109522a(jSONObject)) != null) {
                            C60015b a24 = C60041f.C60043b.f136769a.mo97489a(a13);
                            if (!(a24 == null || (atomicInteger11 = a24.f136680f) == null)) {
                                atomicInteger11.getAndIncrement();
                            }
                            C60045g.C60047b.f136797a.f136788o++;
                            break;
                        }
                    case 1671642405:
                        if (!(!str.equals("dislike") || (a14 = C60030b.m109522a(jSONObject)) == null || (a15 = C60041f.C60043b.f136769a.mo97489a(a14)) == null || (atomicInteger12 = a15.f136683i) == null)) {
                            atomicInteger12.getAndIncrement();
                            break;
                        }
                }
                C60038e eVar = C60038e.C60040b.f136760a;
                String str2 = this.f136745a;
                C89219l.m154721d(str2, "");
                if (eVar.f136739a && C60038e.f136757e.contains(str2)) {
                    if (!eVar.f136759c.containsKey(str2)) {
                        eVar.f136759c.put(str2, new AtomicInteger(1));
                        return;
                    }
                    AtomicInteger atomicInteger13 = eVar.f136759c.get(str2);
                    if (atomicInteger13 != null) {
                        atomicInteger13.incrementAndGet();
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    static String m109522a(JSONObject jSONObject) {
        Object opt;
        if (!(jSONObject == null || (opt = jSONObject.opt("group_id")) == null)) {
            String obj = opt.toString();
            if (obj.length() > 0) {
                return obj;
            }
        }
        return null;
    }
}
