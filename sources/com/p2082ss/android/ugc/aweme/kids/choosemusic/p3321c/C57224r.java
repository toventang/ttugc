package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3321c;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.c.r */
public final class C57224r {
    static {
        Covode.recordClassIndex(67129);
    }

    /* renamed from: a */
    public static Fragment m103768a(Intent intent) {
        String str;
        if (intent == null) {
            return null;
        }
        String a = m103769a(intent, "cid");
        String a2 = m103769a(intent, StringSet.name);
        String a3 = m103769a(intent, "is_hot");
        boolean booleanExtra = intent.getBooleanExtra("music_category_is_hot", false);
        if (!TextUtils.isEmpty(a3)) {
            try {
                booleanExtra = Boolean.valueOf(a3).booleanValue();
            } catch (Exception unused) {
            }
        }
        if (TextUtils.isEmpty(a)) {
            str = m103769a(intent, "music_class_id");
        } else {
            str = a;
        }
        if (TextUtils.isEmpty(a2)) {
            a2 = m103769a(intent, "music_class_name");
        }
        int intExtra = intent.getIntExtra("music_class_level", 0);
        String a4 = m103769a(intent, "music_class_enter_method");
        int intExtra2 = intent.getIntExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
        String a5 = m103769a(intent, "musicType");
        if (!TextUtils.isEmpty(a5)) {
            try {
                intExtra2 = Integer.valueOf(a5).intValue();
            } catch (Exception unused2) {
                intExtra2 = 2;
            }
        }
        if (!TextUtils.isEmpty(a)) {
            a4 = "click_banner";
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (intExtra != 1) {
            return C57221p.m103754a(str, a2, "change_music_page_detail", intExtra2, booleanExtra, a4, intExtra, null);
        }
        C89219l.m154721d(str, "");
        C89219l.m154721d(a2, "");
        C89219l.m154721d("change_music_page_detail", "");
        C89219l.m154721d(a4, "");
        C57228u uVar = new C57228u();
        Bundle bundle = new Bundle();
        bundle.putString("music_class_id", str);
        bundle.putString("music_class_name", a2);
        bundle.putString("music_class_enter_from", "change_music_page_detail");
        bundle.putBoolean("music_class_is_hot", booleanExtra);
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", intExtra2);
        bundle.putString("music_class_enter_method", a4);
        bundle.putInt("music_class_level", intExtra);
        uVar.setArguments(bundle);
        return uVar;
    }

    /* renamed from: a */
    private static String m103769a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
