package com.p2082ss.android.ugc.aweme.push;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23029d;
import com.bytedance.tux.dialog.p1716e.C23051b;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38647aq;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.push.C65697d;
import com.p2082ss.android.ugc.aweme.push.C65722f;
import com.p2082ss.android.ugc.aweme.setting.p3713a.C67968a;
import com.p2082ss.android.ugc.trill.R;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.push.CustomActionPushReceiver */
public final class CustomActionPushReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final String f148008a = "message_type";

    /* renamed from: b */
    public static final String f148009b = "message_obj";

    /* renamed from: c */
    public static final String f148010c = "message_from";

    /* renamed from: d */
    public static final String f148011d = "message_extra";

    /* renamed from: e */
    public static final String f148012e = "in_app_push_type";

    /* renamed from: f */
    public static final String f148013f = "in_app_push_form";

    /* renamed from: g */
    public static final String f148014g = "in_app_push";

    /* renamed from: h */
    public static final String f148015h = "live";

    /* renamed from: i */
    public static final C65688a f148016i = new C65688a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.push.CustomActionPushReceiver$a */
    public static final class C65688a {
        static {
            Covode.recordClassIndex(77180);
        }

        private C65688a() {
        }

        public /* synthetic */ C65688a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(77179);
    }

    /* renamed from: com.ss.android.ugc.aweme.push.CustomActionPushReceiver$b */
    static final class C65689b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ JSONObject f148017a;

        /* renamed from: b */
        final /* synthetic */ Intent f148018b;

        static {
            Covode.recordClassIndex(77181);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65689b(JSONObject jSONObject, Intent intent) {
            super(0);
            this.f148017a = jSONObject;
            this.f148018b = intent;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            String optString;
            String string;
            this.f148018b.putExtra("track_info", this.f148017a.optString("track_info", ""));
            if (!C89219l.m154714a((Object) "popup", (Object) this.f148017a.optString(CustomActionPushReceiver.f148013f)) || !C89219l.m154714a((Object) "author", (Object) this.f148017a.optString(CustomActionPushReceiver.f148012e)) || TextUtils.isEmpty(this.f148017a.optString("event"))) {
                C65697d a = C65697d.C65698a.m117593a();
                Intent intent = this.f148018b;
                C89219l.m154721d(intent, "");
                if (C67968a.m120299a()) {
                    String a2 = C65697d.m117588a(intent, "message_title");
                    String a3 = C65697d.m117588a(intent, "message_text");
                    String a4 = C65697d.m117588a(intent, "message_image_url");
                    String a5 = C65697d.m117588a(intent, "message_open_url");
                    String a6 = C65697d.m117588a(intent, "track_info");
                    a.f148030c = C65697d.m117588a(intent, "message_in_app_push_type");
                    if (!TextUtils.isEmpty(a2) && !TextUtils.isEmpty(a3) && !TextUtils.isEmpty(a4) && !TextUtils.isEmpty(a5)) {
                        a.mo104852a(true, a2, a3, a4, a5, a6, null);
                    }
                }
            } else {
                this.f148018b.putExtra("event", this.f148017a.optString("event"));
                C65697d a7 = C65697d.C65698a.m117593a();
                Intent intent2 = this.f148018b;
                C89219l.m154721d(intent2, "");
                String a8 = C65697d.m117588a(intent2, "event");
                String a9 = C65697d.m117588a(intent2, "track_info");
                if (a9 == null) {
                    a9 = "";
                }
                String a10 = C65697d.m117588a(intent2, "message_open_url");
                if (!TextUtils.isEmpty(a8) && !TextUtils.isEmpty(a10)) {
                    JSONObject jSONObject = null;
                    try {
                        jSONObject = new JSONObject(a8);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    Activity j = C17873f.m33102j();
                    if (j != null) {
                        if (jSONObject != null) {
                            String optString2 = jSONObject.optString(StringSet.name);
                            if (!(optString2 == null || (optString = jSONObject.optString("id")) == null)) {
                                int optInt = jSONObject.optInt("start_time_minute", 0);
                                int optInt2 = jSONObject.optInt("viewers", 0);
                                boolean optBoolean = jSONObject.optBoolean("is_paid_event", false);
                                String str = "live_take_popup_in_room";
                                if (!optBoolean || !C65697d.m117589a(j)) {
                                    Activity j2 = C17873f.m33102j();
                                    if (j2 != null) {
                                        String string2 = j2.getResources().getString(R.string.bpq);
                                        C89219l.m154716b(string2, "");
                                        ILiveOuterService s = LiveOuterService.m107269s();
                                        C89219l.m154716b(s, "");
                                        Object a11 = s.mo95837k().mo95878a("live_event_no_penalty", false);
                                        C89219l.m154716b(a11, "");
                                        if (((Boolean) a11).booleanValue()) {
                                            if (optInt2 >= 100) {
                                                string = j2.getResources().getQuantityString(R.plurals.g7, optInt2, optString2, Integer.valueOf(optInt2));
                                            } else {
                                                string = j2.getResources().getString(R.string.edr, optString2);
                                            }
                                        } else if (C65697d.m117589a(j2)) {
                                            string = j2.getResources().getString(R.string.bpu, optString2, Integer.valueOf(optInt));
                                        } else {
                                            string = j2.getResources().getString(R.string.bpt, optString2, Integer.valueOf(optInt));
                                        }
                                        C89219l.m154716b(string, "");
                                        C23029d dVar = new C23029d(j2);
                                        String string3 = j2.getResources().getString(R.string.bpr);
                                        C89219l.m154716b(string3, "");
                                        dVar.mo37424a(string3, new C65697d.C65701d(a7, j2, optString, a9, optBoolean, a10));
                                        String string4 = j2.getResources().getString(R.string.bps);
                                        C89219l.m154716b(string4, "");
                                        dVar.mo37426b(string4, new C65697d.C65702e(a7, a9, j2, optBoolean));
                                        if (!C65697d.m117589a(j2)) {
                                            str = "live_take_popup_out_room";
                                        }
                                        C65722f.C65723a.m117659a(a9, "show", str, optBoolean);
                                        C23023b a12 = C23051b.m43468a(new C23023b(j2), R.drawable.ahl).mo37411b(string2).mo37413d(string).mo37407a(dVar);
                                        a12.f54502a = false;
                                        ((C23023b) a12.mo37482a(false)).mo37405a().mo37396b().show();
                                    }
                                } else {
                                    String string5 = j.getResources().getString(R.string.bq2);
                                    C89219l.m154716b(string5, "");
                                    String string6 = j.getResources().getString(R.string.bq1, optString2, Integer.valueOf(optInt));
                                    C89219l.m154716b(string6, "");
                                    C23029d dVar2 = new C23029d(j);
                                    String string7 = j.getResources().getString(R.string.bpz);
                                    C89219l.m154716b(string7, "");
                                    dVar2.mo37424a(string7, new C65697d.C65707i(a9));
                                    String string8 = j.getResources().getString(R.string.bq0);
                                    C89219l.m154716b(string8, "");
                                    dVar2.mo37426b(string8, new C65697d.C65708j(a7, a9, j));
                                    if (!C65697d.m117589a(j)) {
                                        str = "live_take_popup_out_room";
                                    }
                                    C65722f.C65723a.m117659a(a9, "show", str, true);
                                    C23023b a13 = C23051b.m43468a(new C23023b(j), R.drawable.ahl).mo37411b(string5).mo37413d(string6).mo37407a(dVar2);
                                    a13.f54502a = false;
                                    ((C23023b) a13.mo37482a(false)).mo37405a().mo37396b().show();
                                }
                            }
                        }
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private static String m117582a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            String a = m117582a(intent, f148011d);
            if (!TextUtils.isEmpty(a)) {
                try {
                    JSONObject jSONObject = new JSONObject(a);
                    String optString = jSONObject.optString(f148014g, null);
                    if (optString != null && TextUtils.equals(f148015h, optString)) {
                        C38647aq.m78409a(new C65689b(jSONObject, intent));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
