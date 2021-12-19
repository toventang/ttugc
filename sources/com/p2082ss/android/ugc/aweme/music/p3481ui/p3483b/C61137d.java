package com.p2082ss.android.ugc.aweme.music.p3481ui.p3483b;

import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.apm.C12290b;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.ttsetting.AbstractC18168b;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.music.model.ThirdMusicCoverItem;
import com.p2082ss.android.ugc.aweme.music.p3476k.C60822a;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.ui.b.d */
public final class C61137d {

    /* renamed from: a */
    static ThirdMusicCoverItem f138819a;

    /* renamed from: b */
    static ThirdMusicCoverItem f138820b;

    /* renamed from: c */
    public static final C61137d f138821c = new C61137d();

    private C61137d() {
    }

    static {
        Covode.recordClassIndex(71742);
    }

    /* renamed from: a */
    public static ThirdMusicCoverItem m110754a() {
        if (f138820b == null) {
            String a = C60822a.C60823a.m110418a("third_music_icon_info", "", "music_sp");
            if (!TextUtils.isEmpty(a)) {
                try {
                    f138820b = (ThirdMusicCoverItem) new C27910f().mo46670a(a, ThirdMusicCoverItem.class);
                } catch (Throwable unused) {
                    m110756a(a);
                }
            }
        }
        return f138820b;
    }

    /* renamed from: a */
    public static void m110756a(String str) {
        C12290b.m22064a("third_music_json_parse_error", new C33743c().mo59976a("message", str).mo59977a());
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.b.d$a */
    public static final class C61138a implements AbstractC18168b {
        static {
            Covode.recordClassIndex(71743);
        }

        @Override // com.bytedance.ies.ugc.aweme.ttsetting.AbstractC18168b
        /* renamed from: a */
        public final void mo28951a(Throwable th) {
            C89219l.m154721d(th, "");
        }

        @Override // com.bytedance.ies.ugc.aweme.ttsetting.AbstractC18168b
        /* renamed from: a */
        public final void mo28952a(JSONObject jSONObject) {
            JSONObject jSONObject2;
            JSONObject jSONObject3 = null;
            if (jSONObject != null) {
                jSONObject2 = jSONObject.optJSONObject("aweme_third_party_music_cover");
                jSONObject3 = jSONObject.optJSONObject("aweme_third_party_music_icon");
            } else {
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                try {
                    C61137d.f138819a = (ThirdMusicCoverItem) new C27910f().mo46670a(jSONObject2.toString(), ThirdMusicCoverItem.class);
                    C60822a.C60823a.m110419a("third_music_cover_info", (Object) jSONObject2.toString(), "music_sp");
                } catch (Throwable unused) {
                    String jSONObject4 = jSONObject2.toString();
                    C89219l.m154716b(jSONObject4, "");
                    C61137d.m110756a(jSONObject4);
                }
            }
            if (jSONObject3 != null) {
                try {
                    C61137d.f138820b = (ThirdMusicCoverItem) new C27910f().mo46670a(jSONObject3.toString(), ThirdMusicCoverItem.class);
                    C60822a.C60823a.m110419a("third_music_icon_info", (Object) jSONObject3.toString(), "music_sp");
                } catch (Throwable unused2) {
                    String jSONObject5 = jSONObject3.toString();
                    C89219l.m154716b(jSONObject5, "");
                    C61137d.m110756a(jSONObject5);
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m110757a(List<ExternalMusicInfo> list) {
        ExternalMusicInfo externalMusicInfo;
        if (C13603b.m24435a((Collection) list)) {
            return false;
        }
        String str = null;
        if (!(list == null || (externalMusicInfo = list.get(0)) == null)) {
            str = externalMusicInfo.getPartnerName();
        }
        return TextUtils.equals(str, "awa");
    }

    /* renamed from: a */
    public static void m110755a(TextView textView, Music music) {
        List<ExternalMusicInfo> list;
        int i;
        int i2;
        if (music != null) {
            list = music.getExternalMusicInfos();
        } else {
            list = null;
        }
        if (m110757a(list)) {
            i = 2131233960;
        } else {
            i = 0;
        }
        if (textView != null) {
            if (i > 0) {
                i2 = C34728n.m70946a(5.0d);
            } else {
                i2 = 0;
            }
            textView.setCompoundDrawablePadding(i2);
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, i, 0);
        }
    }
}
