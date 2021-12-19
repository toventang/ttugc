package com.p2082ss.android.ugc.aweme.choosemusic.p2463c;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.choosemusic.utils.C35936b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.c.ai */
public final class C35776ai {
    static {
        Covode.recordClassIndex(43015);
    }

    /* renamed from: a */
    private static String m73004a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Fragment m73003a(Intent intent, int i) {
        String str;
        boolean z;
        if (intent == null) {
            return null;
        }
        String a = m73004a(intent, "cid");
        String a2 = m73004a(intent, StringSet.name);
        String a3 = m73004a(intent, "is_hot");
        boolean booleanExtra = intent.getBooleanExtra("music_category_is_hot", false);
        if (!TextUtils.isEmpty(a3)) {
            try {
                booleanExtra = Boolean.valueOf(a3).booleanValue();
            } catch (Exception unused) {
            }
        }
        if (TextUtils.isEmpty(a)) {
            str = m73004a(intent, "music_class_id");
        } else {
            str = a;
        }
        if (TextUtils.isEmpty(a2)) {
            a2 = m73004a(intent, "music_class_name");
        }
        int intExtra = intent.getIntExtra("music_class_level", 0);
        String a4 = m73004a(intent, "music_class_enter_method");
        int intExtra2 = intent.getIntExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
        String a5 = m73004a(intent, "musicType");
        if (!TextUtils.isEmpty(a5)) {
            try {
                intExtra2 = Integer.valueOf(a5).intValue();
            } catch (Exception unused2) {
                intExtra2 = 2;
            }
        }
        if (intent.hasExtra("enter_method")) {
            a4 = m73004a(intent, "enter_method");
        } else if (!TextUtils.isEmpty(a)) {
            a4 = "click_banner";
        }
        if (intent.hasExtra("previous_page")) {
            C35936b.f84812a = m73004a(intent, "previous_page");
        }
        String a6 = m73004a(intent, "track_id");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (intExtra == 1) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(a2, "");
            C89219l.m154721d("change_music_page_detail", "");
            C89219l.m154721d(a4, "");
            C35782am amVar = new C35782am();
            Bundle bundle = new Bundle();
            bundle.putString("music_class_id", str);
            bundle.putString("music_class_name", a2);
            bundle.putString("music_class_enter_from", "change_music_page_detail");
            bundle.putBoolean("music_class_is_hot", booleanExtra);
            bundle.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", intExtra2);
            bundle.putString("music_class_enter_method", a4);
            bundle.putInt("music_class_level", intExtra);
            bundle.putInt("sound_page_scene", i);
            amVar.setArguments(bundle);
            return amVar;
        }
        if (TextUtils.isEmpty(intent.getScheme()) || intent.getBooleanExtra("is_from_self", false)) {
            z = false;
        } else {
            z = true;
        }
        return C35771af.m72985a(str, a2, "change_music_page_detail", intExtra2, booleanExtra, a4, intExtra, null, i, a6, z);
    }
}
