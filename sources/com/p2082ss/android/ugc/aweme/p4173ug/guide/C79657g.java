package com.p2082ss.android.ugc.aweme.p4173ug.guide;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.tooltip.AbstractC17256a;
import com.bytedance.ies.dmt.p1194ui.tooltip.C17257b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.google.gson.C27910f;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.base.p2377h.C34597d;
import com.p2082ss.android.ugc.aweme.experiment.C46972gg;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.model.TextExtraStruct;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.p4173ug.guide.p4182a.C79640a;
import com.p2082ss.android.ugc.aweme.utils.C80257bo;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ug.guide.g */
public final class C79657g {

    /* renamed from: a */
    public static Long f178755a;

    /* renamed from: b */
    public static Long f178756b;

    /* renamed from: c */
    public static Handler f178757c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    static AbstractC79658a f178758d;

    /* renamed from: e */
    public static Runnable f178759e = RunnableC79659b.f178765a;

    /* renamed from: f */
    public static final C79657g f178760f = new C79657g();

    /* renamed from: g */
    private static Map<String, Long> f178761g;

    /* renamed from: h */
    private static final Type f178762h;

    /* renamed from: i */
    private static SharedPreferences f178763i;

    /* renamed from: j */
    private static List<String> f178764j;

    /* renamed from: com.ss.android.ugc.aweme.ug.guide.g$a */
    public interface AbstractC79658a {
        static {
            Covode.recordClassIndex(92874);
        }

        /* renamed from: a */
        void mo70535a();
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.guide.g$e */
    public static final class C79662e extends C27895a<Map<String, Long>> {
        static {
            Covode.recordClassIndex(92878);
        }

        C79662e() {
        }
    }

    private C79657g() {
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.guide.g$b */
    static final class RunnableC79659b implements Runnable {

        /* renamed from: a */
        public static final RunnableC79659b f178765a = new RunnableC79659b();

        static {
            Covode.recordClassIndex(92875);
        }

        RunnableC79659b() {
        }

        public final void run() {
            AbstractC79658a aVar = C79657g.f178758d;
            if (aVar != null) {
                C79657g.m138465c();
                aVar.mo70535a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.guide.g$d */
    public static final class C79661d implements C17257b.AbstractC17259b {

        /* renamed from: a */
        final /* synthetic */ AbstractC88433f f178767a;

        static {
            Covode.recordClassIndex(92877);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.tooltip.C17257b.AbstractC17259b
        /* renamed from: a */
        public final void mo27360a() {
            AbstractC88433f fVar = this.f178767a;
            if (fVar != null) {
                fVar.accept(false);
            }
        }

        C79661d(AbstractC88433f fVar) {
            this.f178767a = fVar;
        }
    }

    /* renamed from: b */
    public static void m138462b() {
        Long l = f178755a;
        if (l != null) {
            f178757c.postDelayed(f178759e, l.longValue());
        }
    }

    /* renamed from: c */
    public static void m138465c() {
        f178757c.removeCallbacks(f178759e);
        f178756b = null;
        f178755a = null;
    }

    /* renamed from: a */
    public static void m138459a() {
        f178756b = Long.valueOf(System.currentTimeMillis());
        f178755a = 5000L;
        f178757c.postDelayed(f178759e, 5000);
    }

    /* renamed from: d */
    private static List<String> m138467d() {
        if (f178764j == null) {
            f178764j = C34597d.m70640g().mo61052a("stay_home_ids", String.class);
        }
        return f178764j;
    }

    static {
        Map<String, Long> map;
        Covode.recordClassIndex(92873);
        f178761g = new LinkedHashMap();
        Type type = new C79662e().type;
        f178762h = type;
        SharedPreferences a = C34822d.m71158a(C17867d.m33078a(), "sp_stay_home_guide_cache", 0);
        C89219l.m154716b(a, "");
        f178763i = a;
        try {
            Object a2 = new C27910f().mo46671a(a.getString("sp_stay_home_cache_video_id", ""), type);
            C89219l.m154716b(a2, "");
            map = (Map) a2;
        } catch (Exception unused) {
            map = new LinkedHashMap<>();
        }
        f178761g = map;
    }

    /* renamed from: a */
    public static void m138460a(AbstractC79658a aVar) {
        C89219l.m154721d(aVar, "");
        f178758d = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ug.guide.g$c */
    public static final class View$OnClickListenerC79660c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC88433f f178766a;

        static {
            Covode.recordClassIndex(92876);
        }

        View$OnClickListenerC79660c(AbstractC88433f fVar) {
            this.f178766a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC88433f fVar = this.f178766a;
            if (fVar != null) {
                fVar.accept(true);
            }
        }
    }

    /* renamed from: a */
    private static Long m138458a(String str) {
        return f178761g.get(str);
    }

    /* renamed from: b */
    private static void m138463b(String str) {
        if (!f178761g.containsKey(str)) {
            if (f178761g.size() >= 20) {
                f178761g.entrySet().remove(C89070n.m154559b((Iterable) f178761g.entrySet()));
            }
            f178761g.put(str, Long.valueOf(System.currentTimeMillis()));
            f178763i.edit().putString("sp_stay_home_cache_video_id", new C27910f().mo46675b(f178761g, f178762h)).apply();
        }
    }

    /* renamed from: c */
    public static boolean m138466c(Aweme aweme) {
        if (m138469e(aweme)) {
            return false;
        }
        if (!m138468d(aweme) || C46972gg.m90250a()) {
            return true;
        }
        if (!(aweme == null || aweme.getAid() == null)) {
            String aid = aweme.getAid();
            C89219l.m154716b(aid, "");
            Long a = m138458a(aid);
            if (a != null) {
                a.longValue();
                if (System.currentTimeMillis() - a.longValue() > 86400000) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m138468d(Aweme aweme) {
        List<TextExtraStruct> textExtra;
        List<String> d;
        String cid;
        if (!(aweme == null || (textExtra = aweme.getTextExtra()) == null || textExtra.size() <= 0 || (d = m138467d()) == null || d.size() <= 0)) {
            for (TextExtraStruct textExtraStruct : textExtra) {
                Iterator<String> it = d.iterator();
                while (true) {
                    if (it.hasNext()) {
                        String next = it.next();
                        if (!(textExtraStruct == null || (cid = textExtraStruct.getCid()) == null || !cid.equals(next))) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m138469e(com.p2082ss.android.ugc.aweme.feed.model.Aweme r3) {
        /*
        // Method dump skipped, instructions count: 109
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p4173ug.guide.C79657g.m138469e(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    /* renamed from: a */
    public static boolean m138461a(Aweme aweme) {
        if (aweme == null || TextUtils.isEmpty(aweme.getAid()) || f178761g.containsKey(aweme.getAid())) {
            return false;
        }
        int d = (int) (C80257bo.m139112d(System.currentTimeMillis()) / 86400000);
        if (f178763i.getInt("sp_modified_button_date", -1) != d) {
            f178763i.edit().putInt("sp_modified_button_date", d).apply();
            f178763i.edit().putInt("sp_modified_button_count", 0).apply();
        } else {
            f178763i.edit().putInt("sp_modified_button_count", f178763i.getInt("sp_modified_button_count", 0) + 1).apply();
        }
        if (f178763i.getInt("sp_modified_button_count", 0) < 7) {
            String aid = aweme.getAid();
            C89219l.m154716b(aid, "");
            m138463b(aid);
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m138464b(Aweme aweme) {
        int d;
        if (aweme == null || TextUtils.isEmpty(aweme.getAid()) || f178761g.containsKey(aweme.getAid()) || f178763i.getInt("sp_toast_guide_date", -1) == (d = (int) (C80257bo.m139112d(System.currentTimeMillis()) / 86400000))) {
            return false;
        }
        f178763i.edit().putInt("sp_toast_guide_date", d).apply();
        String aid = aweme.getAid();
        C89219l.m154716b(aid, "");
        m138463b(aid);
        return true;
    }

    /* renamed from: a */
    public static PopupWindow m138457a(Activity activity, View view, AbstractC88433f<Boolean> fVar) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(view, "");
        if (C79640a.C79641a.m138452a(activity)) {
            return null;
        }
        AbstractC17256a a = new C17257b(activity).mo27351a(R.string.h85).mo27354a(view).mo27357a(false).mo27359c(C0643b.m2378c(activity, R.color.l)).mo27352a(-1001L).mo27358b(8388611).mo27353a(new View$OnClickListenerC79660c(fVar)).mo27355a(new C79661d(fVar)).mo27350a();
        a.mo27341a();
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.widget.PopupWindow");
        return (PopupWindow) a;
    }
}
