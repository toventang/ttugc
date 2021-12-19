package com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.common.utility.C13607d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.music.model.MusicBeat;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.C65359bb;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70638dj;
import com.p2082ss.android.ugc.aweme.shortvideo.C70762ea;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C72440e;
import com.p2082ss.android.ugc.aweme.shortvideo.p3854r.C72724a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import java.util.ArrayList;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f */
public final class C70455f {

    /* renamed from: a */
    public static String f157417a;

    /* renamed from: b */
    public static String f157418b = (C70638dj.f158101d + "aiCutData.txt");

    /* renamed from: c */
    public static boolean f157419c;

    /* renamed from: d */
    public static final boolean f157420d;

    /* renamed from: e */
    public static final C70455f f157421e = new C70455f();

    private C70455f() {
    }

    /* renamed from: a */
    public static int m124265a() {
        if (f157420d) {
            return C72440e.f162414a;
        }
        return 12;
    }

    /* renamed from: c */
    public static boolean m124272c() {
        if (!f157419c || !f157420d) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m124270b() {
        if (!C65359bb.m117056a() || C63244g.m114602a().mo73255A().mo93901a()) {
            return false;
        }
        return true;
    }

    static {
        Covode.recordClassIndex(82898);
        boolean z = true;
        if (!C16048b.m29633a().mo25421a(true, "enable_music_stick_point", false) || C63244g.m114602a().mo73255A().mo93901a()) {
            z = false;
        }
        f157420d = z;
    }

    /* renamed from: b */
    public static String m124269b(C69905c cVar) {
        if (cVar == null || cVar.getStickPointMusicAlg() == null) {
            return "";
        }
        return cVar.getStickPointMusicAlg().getDefaultLocalPath();
    }

    /* renamed from: c */
    public static String m124271c(C69905c cVar) {
        if (cVar == null || TextUtils.isEmpty(cVar.getPath())) {
            return null;
        }
        return C63244g.m114602a().mo73291s().mo101751c(cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        if (r5 == null) goto L_0x0011;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m124266a(android.content.Context r5) {
        /*
            if (r5 == 0) goto L_0x0033
            android.content.res.Resources r1 = r5.getResources()
            if (r1 == 0) goto L_0x0033
            r0 = 2131829995(0x7f1124eb, float:1.9292975E38)
            java.lang.String r5 = r1.getString(r0)
            if (r5 != 0) goto L_0x0014
        L_0x0011:
            p4600h.p4611f.p4613b.C89219l.m154715b()
        L_0x0014:
            java.lang.String r4 = ""
            p4600h.p4611f.p4613b.C89219l.m154716b(r5, r4)
            r3 = 1
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r1 = 0
            int r0 = m124265a()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r1] = r0
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r3)
            java.lang.String r0 = com.C1764a.m5928a(r5, r0)
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r4)
            return r0
        L_0x0033:
            r5 = 0
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70455f.m124266a(android.content.Context):java.lang.String");
    }

    /* renamed from: a */
    private static String m124267a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder append = new StringBuilder().append(C63244g.m114602a().mo73291s().mo101750c());
        Uri parse = Uri.parse(str);
        C89219l.m154716b(parse, "");
        return append.append(C13607d.m24442b(parse.getPath())).append(".json").toString();
    }

    /* renamed from: d */
    public static String m124273d(C69905c cVar) {
        if (cVar == null) {
            return "music == null";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("music_id", cVar.getMusicId());
            if (cVar.getStickPointMusicAlg() != null) {
                jSONObject.put("AO_url", cVar.getStickPointMusicAlg().getVeBeatsUrl());
                jSONObject.put("C_url", cVar.getStickPointMusicAlg().getDownBeatsUrl());
                jSONObject.put("A1_url", cVar.getStickPointMusicAlg().getNoStrengthBeatsUrl());
                jSONObject.put("man_mode_url", cVar.getStickPointMusicAlg().getManModeBeatsUrl());
            } else {
                jSONObject.put("no_url", cVar.getId());
            }
            String jSONObject2 = jSONObject.toString();
            C89219l.m154716b(jSONObject2, "");
            return jSONObject2;
        } catch (Exception unused) {
            return "exception";
        }
    }

    /* renamed from: a */
    public static void m124268a(C69905c cVar) {
        int i;
        int i2;
        if (cVar != null) {
            C70762ea eaVar = new C70762ea();
            eaVar.setMusicId(cVar.getMusicId());
            cVar.setStickPointMusicAlg(eaVar);
            eaVar.setDefaultLocalUrl(cVar.getPath());
            eaVar.setDefaultLocalPath(m124267a(eaVar.getDefaultLocalUrl()));
            String str = cVar.extra;
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONObject optJSONObject = new JSONObject(str).optJSONObject("beats");
                    if (optJSONObject != null) {
                        eaVar.setVeBeatsUrl(optJSONObject.optString("audio_effect_onset"));
                        eaVar.setDownBeatsUrl(optJSONObject.optString("merged_beats"));
                        eaVar.setNoStrengthBeatsUrl(optJSONObject.optString("beats_tracker"));
                        eaVar.setDownBeatsPath(m124267a(eaVar.getDownBeatsUrl()));
                        eaVar.setVeBeatsPath(m124267a(eaVar.getVeBeatsUrl()));
                        eaVar.setNoStrengthBeatsPath(m124267a(eaVar.getNoStrengthBeatsUrl()));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                MusicBeat musicBeat = cVar.getMusicBeat();
                if (musicBeat != null) {
                    Integer minVideoNum = musicBeat.getMinVideoNum();
                    int i3 = 0;
                    if (minVideoNum != null) {
                        i = minVideoNum.intValue();
                    } else {
                        i = 0;
                    }
                    eaVar.setMinSeg(i);
                    Integer maxVideoNum = musicBeat.getMaxVideoNum();
                    if (maxVideoNum != null) {
                        i3 = maxVideoNum.intValue();
                    }
                    eaVar.setMaxSeg(i3);
                    Integer type = musicBeat.getType();
                    if (type != null) {
                        i2 = type.intValue();
                    } else {
                        i2 = C70762ea.BEATES_FILE_DEFAULT;
                    }
                    eaVar.setAlgType(i2);
                    eaVar.setManModeBeatsUrl(musicBeat.getManMadeBeats());
                    eaVar.setManModeBeatsPath(m124267a(eaVar.getManModeBeatsUrl()));
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo111020a(Activity activity, ArrayList<String> arrayList, long j) {
        Bundle b = mo111021b(activity, arrayList, j);
        if (b == null) {
            return false;
        }
        if (activity == null) {
            return true;
        }
        C72724a.m128203a().mo62193a(activity, b, 2, 1001);
        return true;
    }

    /* renamed from: b */
    public final Bundle mo111021b(Activity activity, ArrayList<String> arrayList, long j) {
        if (C84904k.m145909a(arrayList)) {
            return null;
        }
        int a = m124265a();
        if (arrayList == null) {
            C89219l.m154715b();
        }
        int size = a - arrayList.size();
        if (size <= 0) {
            new C79459a(activity).mo123052a(m124266a(activity)).mo123053a();
            return null;
        }
        long j2 = 3600000 - j;
        Bundle bundle = new Bundle();
        int i = 4;
        if (f157420d) {
            i = 6;
            bundle.putInt("key_photo_select_min_count", 0);
            bundle.putInt("key_photo_select_max_count", size);
        }
        bundle.putInt("key_support_flag", i);
        bundle.putBoolean("Key_enable_multi_video", true);
        bundle.putInt("key_video_select_min_count", 0);
        bundle.putInt("key_video_select_max_count", size);
        bundle.putLong("Key_max_duration", j2);
        bundle.putLong("Key_min_duration", 1000);
        bundle.putStringArrayList("key_selected_video_path", arrayList);
        return bundle;
    }
}
