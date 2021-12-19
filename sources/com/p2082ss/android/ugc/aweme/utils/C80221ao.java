package com.p2082ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.bytedance.tux.tooltip.EnumC23352h;
import com.bytedance.tux.tooltip.p1727a.p1729b.C23329a;
import com.p2082ss.android.ugc.aweme.setting.C68025bk;
import com.p2082ss.android.ugc.aweme.setting.C68065d;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.ao */
public final class C80221ao {

    /* renamed from: a */
    public static final C80221ao f179699a = new C80221ao();

    private C80221ao() {
    }

    static {
        Covode.recordClassIndex(93489);
    }

    /* renamed from: a */
    public static boolean m139049a(boolean z) {
        String str;
        if (C68025bk.m120327a()) {
            return false;
        }
        Keva repo = Keva.getRepo("repo_cur_video_page_i18n");
        if (z) {
            str = "multi_video_drag_showed";
        } else {
            str = "single_video_drag_showed";
        }
        if (!repo.getBoolean(str, false)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m139048a(Activity activity, View view, boolean z) {
        String str;
        C89219l.m154721d(activity, "");
        C89219l.m154721d(view, "");
        if (z) {
            str = "multi_video_drag_showed";
        } else {
            str = "single_video_drag_showed";
        }
        Keva.getRepo("repo_cur_video_page_i18n").storeBoolean(str, true);
        C23329a aVar = new C23329a(activity);
        String string = activity.getString(R.string.czr, new Object[]{Long.valueOf(C68065d.m120371a() / 60000)});
        C89219l.m154716b(string, "");
        aVar.mo38022a(string).mo38030a(5000L).mo38041b(view).mo38034a(EnumC23352h.TOP).mo38012d().mo38001a();
    }
}
