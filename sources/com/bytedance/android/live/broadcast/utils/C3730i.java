package com.bytedance.android.live.broadcast.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.utils.i */
public final class C3730i {

    /* renamed from: a */
    public static final C3731a f10328a = new C3731a((byte) 0);

    static {
        Covode.recordClassIndex(4245);
    }

    /* renamed from: com.bytedance.android.live.broadcast.utils.i$a */
    public static final class C3731a {
        static {
            Covode.recordClassIndex(4246);
        }

        private C3731a() {
        }

        public /* synthetic */ C3731a(byte b) {
            this();
        }

        /* renamed from: a */
        public static String m9243a(Context context, String str) {
            SharedPreferences a;
            String string;
            if (context == null || (a = C34822d.m71158a(context, "live_mode", 0)) == null || (string = a.getString(C89219l.m154704a(str, (Object) "live_start_live_mode"), EnumC11728i.VIDEO.name())) == null) {
                return "";
            }
            return string;
        }

        /* renamed from: a */
        public static void m9244a(Context context, String str, String str2) {
            SharedPreferences a;
            SharedPreferences.Editor edit;
            C89219l.m154721d(str, "");
            if (context != null && (a = C34822d.m71158a(context, "live_mode", 0)) != null && (edit = a.edit()) != null) {
                edit.putString(C89219l.m154704a(str2, (Object) "live_start_live_mode"), str);
                edit.apply();
            }
        }

        /* renamed from: a */
        public static void m9245a(Context context, String str, String str2, boolean z) {
            SharedPreferences a;
            SharedPreferences.Editor edit;
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            if (context != null && (a = C34822d.m71158a(context, "Congrats", 0)) != null && (edit = a.edit()) != null) {
                edit.putBoolean(str2 + str + "apply_status", z);
                edit.apply();
            }
        }
    }
}
