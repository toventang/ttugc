package com.p2082ss.android.ugc.aweme.livewallpaper.p3416d;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.AbstractC58894c;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.C58901f;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.C58908j;
import java.util.Iterator;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.d.c */
public final class C58882c {

    /* renamed from: a */
    public static final C58882c f134047a = new C58882c();

    /* renamed from: b */
    private static final AbstractC89244h f134048b = C89250i.m154773a((AbstractC89171a) C58883a.f134049a);

    /* renamed from: c */
    private static Keva m108185c() {
        return (Keva) f134048b.getValue();
    }

    private C58882c() {
    }

    /* renamed from: com.ss.android.ugc.aweme.livewallpaper.d.c$a */
    static final class C58883a extends AbstractC89220m implements AbstractC89171a<Keva> {

        /* renamed from: a */
        public static final C58883a f134049a = new C58883a();

        static {
            Covode.recordClassIndex(69199);
        }

        C58883a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("keva_repo_wallpaper_ab_info");
        }
    }

    static {
        Covode.recordClassIndex(69198);
    }

    /* renamed from: b */
    public static String m108184b() {
        try {
            JSONObject jSONObject = new JSONObject();
            AbstractC58875a[] a = C58878b.m108177a();
            for (AbstractC58875a aVar : a) {
                String a2 = aVar.mo96309a();
                String b = aVar.mo96310b();
                jSONObject.put(a2, b);
                m108185c().storeString(a2, b);
            }
            String jSONObject2 = jSONObject.toString();
            C89219l.m154716b(jSONObject2, "");
            return jSONObject2;
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static void m108183a() {
        MethodCollector.m26663i(7678);
        if (!C58901f.m108237d()) {
            MethodCollector.m26664o(7678);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            AbstractC58875a[] a = C58878b.m108177a();
            for (AbstractC58875a aVar : a) {
                String string = m108185c().getString(aVar.mo96309a(), "");
                String b = aVar.mo96310b();
                if (!C89219l.m154714a((Object) string, (Object) b)) {
                    jSONObject.put(aVar.mo96309a(), b);
                }
            }
            if (!jSONObject.keys().hasNext()) {
                MethodCollector.m26664o(7678);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("ab_info", jSONObject.toString());
            C17867d.m33078a().getContentResolver().call(AbstractC58894c.f134068c, "update_ab_info", "", bundle);
            Iterator<String> keys = jSONObject.keys();
            C89219l.m154716b(keys, "");
            while (keys.hasNext()) {
                String next = keys.next();
                m108185c().storeString(next, jSONObject.getString(next));
            }
            MethodCollector.m26664o(7678);
        } catch (Throwable unused) {
            MethodCollector.m26664o(7678);
        }
    }

    /* renamed from: a */
    public static LiveWallPaperBean m108181a(String str) {
        LiveWallPaperBean buildEmptyBean = LiveWallPaperBean.buildEmptyBean();
        if (str != null) {
            try {
                if (str.length() != 0) {
                    JSONObject jSONObject = new JSONObject(str);
                    buildEmptyBean.setVideoPath(jSONObject.optString(C58908j.f134094a, ""));
                    buildEmptyBean.setWidth(jSONObject.optInt(C58908j.f134095b, 0));
                    buildEmptyBean.setHeight(jSONObject.optInt(C58908j.f134096c, 0));
                    buildEmptyBean.setVolume((float) jSONObject.optDouble(C58908j.f134097d, 0.0d));
                    buildEmptyBean.setShouldMute(jSONObject.optBoolean(C58908j.f134098e, true));
                    buildEmptyBean.setSource(jSONObject.optString(C58908j.f134099f, ""));
                }
            } catch (Throwable unused) {
            }
        }
        C89219l.m154716b(buildEmptyBean, "");
        return buildEmptyBean;
    }

    /* renamed from: a */
    public static String m108182a(LiveWallPaperBean liveWallPaperBean) {
        if (liveWallPaperBean == null) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C58908j.f134095b, liveWallPaperBean.getWidth());
        jSONObject.put(C58908j.f134096c, liveWallPaperBean.getHeight());
        jSONObject.put(C58908j.f134097d, Float.valueOf(liveWallPaperBean.getVolume()));
        jSONObject.put(C58908j.f134098e, liveWallPaperBean.isShouldMute());
        jSONObject.put(C58908j.f134099f, liveWallPaperBean.getSource());
        if (!C58901f.m108237d()) {
            jSONObject.put("path", liveWallPaperBean.getVideoPath());
        }
        String jSONObject2 = jSONObject.toString();
        C89219l.m154716b(jSONObject2, "");
        return jSONObject2;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.ComponentName m108180a(android.content.Context r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.livewallpaper.p3416d.C58882c.m108180a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }
}
