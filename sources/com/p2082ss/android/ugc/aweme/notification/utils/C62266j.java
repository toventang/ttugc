package com.p2082ss.android.ugc.aweme.notification.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.commercialize.log.LogHelperImpl;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.notification.p3528g.C62023a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.utils.j */
public final class C62266j {

    /* renamed from: a */
    static final int f141321a = C34728n.m70946a(10.0d);

    /* renamed from: b */
    public static final C62266j f141322b = new C62266j();

    private C62266j() {
    }

    static {
        Covode.recordClassIndex(73040);
    }

    /* renamed from: a */
    public static void m112646a(View view) {
        C89219l.m154721d(view, "");
        view.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC62267a(view));
    }

    /* renamed from: a */
    public static String m112643a(User user) {
        C89219l.m154721d(user, "");
        if (!C58071d.m104909c()) {
            String a = C62269l.m112651a(user);
            C89219l.m154716b(a, "");
            return a;
        } else if (!TextUtils.isEmpty(user.getRemarkName())) {
            String remarkName = user.getRemarkName();
            C89219l.m154716b(remarkName, "");
            return remarkName;
        } else {
            String nickname = user.getNickname();
            C89219l.m154716b(nickname, "");
            return nickname;
        }
    }

    /* renamed from: b */
    public static void m112647b(View view) {
        C89219l.m154721d(view, "");
        if (Build.VERSION.SDK_INT < 21) {
            C62023a.m112168a(view);
            view.setBackgroundColor(view.getResources().getColor(R.color.l));
            return;
        }
        view.setBackground(view.getResources().getDrawable(R.drawable.n9));
    }

    /* renamed from: a */
    public static void m112644a(Context context) {
        C89219l.m154721d(context, "");
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            C89219l.m154721d(activity, "");
            Intent intent = activity.getIntent();
            if (intent != null && intent.getBooleanExtra("from_notification", false)) {
                String a = m112642a(intent, "rule_id");
                if (a == null) {
                    a = "";
                }
                C89219l.m154716b(a, "");
                if (!TextUtils.isEmpty(a)) {
                    LogHelperImpl.m77303a().mo66432a("video_play_from_push", a);
                }
            }
        }
    }

    /* renamed from: a */
    public static String m112642a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m112645a(Context context, String str, int i) {
        Intent intent;
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        if ((context instanceof Activity) && (intent = ((Activity) context).getIntent()) != null && intent.getBooleanExtra("from_notification", false)) {
            String a = m112642a(intent, "rule_id");
            if (!TextUtils.isEmpty(a)) {
                C39162r.m79460a("enter_personal_detail_backup_from_push", new C33744d().mo59983a("action_type", "click").mo59983a("account_type", str).mo59983a("client_order", String.valueOf(i)).mo59983a("rule_id", a).f79943a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.utils.j$a */
    static final class View$OnLayoutChangeListenerC62267a implements View.OnLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ View f141323a;

        static {
            Covode.recordClassIndex(73041);
        }

        View$OnLayoutChangeListenerC62267a(View view) {
            this.f141323a = view;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (i2 > C62266j.f141321a) {
                this.f141323a.setTop(C62266j.f141321a);
            }
        }
    }
}
