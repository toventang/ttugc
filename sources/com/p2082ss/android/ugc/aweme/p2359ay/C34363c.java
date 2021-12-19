package com.p2082ss.android.ugc.aweme.p2359ay;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20713a;
import com.bytedance.lighten.p1477a.C20758o;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20727d;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20729f;
import com.p2082ss.android.ugc.aweme.base.C34602l;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2377h.C34593a;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p2082ss.android.ugc.aweme.framework.p3008c.C51426a;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.performance.C62845i;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ay.c */
public final class C34363c {

    /* renamed from: a */
    public static final C34363c f81236a = new C34363c();

    /* renamed from: b */
    private static final Map<String, String> f81237b = new LinkedHashMap();

    /* renamed from: c */
    private static final AbstractC89244h f81238c = C89250i.m154773a((AbstractC89171a) C34365b.f81239a);

    /* renamed from: com.ss.android.ugc.aweme.ay.c$a */
    public interface AbstractC34364a {
        static {
            Covode.recordClassIndex(41308);
        }
    }

    /* renamed from: b */
    private static int m70321b() {
        return ((Number) f81238c.getValue()).intValue();
    }

    private C34363c() {
    }

    /* renamed from: a */
    private static boolean m70315a() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ay.c$b */
    static final class C34365b extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C34365b f81239a = new C34365b();

        static {
            Covode.recordClassIndex(41309);
        }

        C34365b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C16048b.m29633a().mo25412a(true, "dynamic_cover_style", 0));
        }
    }

    static {
        Covode.recordClassIndex(41307);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ay.c$c */
    public static final class C34366c implements AbstractC20729f {

        /* renamed from: a */
        final /* synthetic */ boolean f81240a;

        /* renamed from: b */
        final /* synthetic */ C34602l f81241b;

        /* renamed from: c */
        final /* synthetic */ Video f81242c;

        static {
            Covode.recordClassIndex(41310);
        }

        C34366c(boolean z, C34602l lVar, Video video) {
            this.f81240a = z;
            this.f81241b = lVar;
            this.f81242c = video;
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20729f
        /* renamed from: a */
        public final void mo34151a(final int i) {
            C1731i.m5640b(new Callable(this) {
                /* class com.p2082ss.android.ugc.aweme.p2359ay.C34363c.C34366c.CallableC343671 */

                /* renamed from: a */
                final /* synthetic */ C34366c f81243a;

                static {
                    Covode.recordClassIndex(41311);
                }

                {
                    this.f81243a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public Void call() {
                    if (this.f81243a.f81240a && i >= 6 && !this.f81243a.f81241b.mo61062a() && this.f81243a.f81242c.getPlayAddr() != null) {
                        VideoUrlModel playAddr = this.f81243a.f81242c.getPlayAddr();
                        C89219l.m154716b(playAddr, "");
                        if (!TextUtils.isEmpty(playAddr.getUri())) {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("frames", i);
                                VideoUrlModel playAddr2 = this.f81243a.f81242c.getPlayAddr();
                                C89219l.m154716b(playAddr2, "");
                                jSONObject.put("vid", playAddr2.getUri());
                                jSONObject.put("url", this.f81243a.f81241b.f81655b.get(0));
                                C34611o.m70668a("aweme_animated_image_frames_error", jSONObject);
                            } catch (Throwable unused) {
                            }
                        }
                    }
                    return null;
                }
            }, C40780g.m82246c());
        }
    }

    /* renamed from: a */
    private static boolean m70316a(Context context) {
        boolean z;
        if (!C62845i.m113257a()) {
            if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132253e = m70315a();
            }
            if (!C58029j.f132253e || C51426a.m95802a(context)) {
                if (Build.VERSION.SDK_INT >= 23) {
                    z = true;
                } else {
                    z = false;
                }
                if (C34593a.m70629a("aweme_app", "use_dynamic_cover", z)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m70320a(UrlModel urlModel) {
        if (!(urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().isEmpty())) {
            for (String str : urlModel.getUrlList()) {
                if (!TextUtils.isEmpty(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.ay.c$d */
    public static final class C34368d extends AbstractC20727d {

        /* renamed from: a */
        final /* synthetic */ SmartImageView f81245a;

        /* renamed from: b */
        final /* synthetic */ AbstractC34364a f81246b;

        /* renamed from: c */
        final /* synthetic */ boolean f81247c;

        /* renamed from: d */
        final /* synthetic */ UrlModel f81248d;

        /* renamed from: e */
        final /* synthetic */ C34602l f81249e;

        /* renamed from: f */
        final /* synthetic */ Video f81250f;

        /* renamed from: g */
        final /* synthetic */ boolean f81251g;

        static {
            Covode.recordClassIndex(41312);
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
        /* renamed from: a */
        public final void mo34159a(Uri uri, View view, Throwable th) {
            String str;
            if (this.f81251g && !this.f81249e.mo61062a() && this.f81250f.getPlayAddr() != null) {
                VideoUrlModel playAddr = this.f81250f.getPlayAddr();
                C89219l.m154716b(playAddr, "");
                if (!TextUtils.isEmpty(playAddr.getUri())) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("frames", -1);
                        VideoUrlModel playAddr2 = this.f81250f.getPlayAddr();
                        C89219l.m154716b(playAddr2, "");
                        jSONObject.put("vid", playAddr2.getUri());
                        jSONObject.put("url", this.f81249e.f81655b.get(0));
                        if (th != null) {
                            str = th.getMessage();
                        } else {
                            str = null;
                        }
                        jSONObject.put("errMsg", str);
                        C34611o.m70668a("aweme_animated_image_frames_error", jSONObject);
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
        /* renamed from: a */
        public final void mo34158a(Uri uri, View view, C20758o oVar, Animatable animatable) {
            this.f81245a.setUserVisibleHint(true);
            if (this.f81247c) {
                this.f81245a.mo34197b();
            }
            UrlModel urlModel = new UrlModel();
            urlModel.setUri(this.f81248d.getUri());
            urlModel.setUrlList(this.f81249e.f81655b);
            this.f81250f.setCachedOuterCoverUrl(urlModel);
        }

        C34368d(SmartImageView smartImageView, AbstractC34364a aVar, boolean z, UrlModel urlModel, C34602l lVar, Video video, boolean z2) {
            this.f81245a = smartImageView;
            this.f81246b = aVar;
            this.f81247c = z;
            this.f81248d = urlModel;
            this.f81249e = lVar;
            this.f81250f = video;
            this.f81251g = z2;
        }
    }

    /* renamed from: a */
    private static String m70313a(String str, String str2, String str3) {
        Throwable th;
        String str4;
        String str5 = "";
        C89219l.m154721d(str, str5);
        C89219l.m154721d(str2, str5);
        try {
            Uri parse = Uri.parse(str);
            C89219l.m154716b(parse, str5);
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
            for (String str6 : queryParameterNames) {
                if (C89219l.m154714a((Object) str6, (Object) str2)) {
                    str4 = str3;
                } else {
                    str4 = parse.getQueryParameter(str6);
                }
                clearQuery.appendQueryParameter(str6, str4);
            }
            String uri = clearQuery.build().toString();
            C89219l.m154716b(uri, str5);
            try {
                C89379q.m157068constructorimpl(C89391z.f203057a);
                return uri;
            } catch (Throwable th2) {
                th = th2;
                str5 = uri;
            }
        } catch (Throwable th3) {
            th = th3;
            C89379q.m157068constructorimpl(C89382r.m154941a(th));
            return str5;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m70319a(C34363c cVar, SmartImageView smartImageView, Video video, String str, boolean z, boolean z2, int i) {
        boolean z3 = z;
        boolean z4 = z2;
        if ((i & 8) != 0) {
            z3 = true;
        }
        if ((i & 64) != 0) {
            z4 = true;
        }
        C89219l.m154721d(smartImageView, "");
        C89219l.m154721d(video, "");
        C89219l.m154721d(str, "");
        return m70318a(cVar, smartImageView, video, str, z3, (AbstractC34364a) null, z4, (Bitmap.Config) null, 256);
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m70318a(C34363c cVar, SmartImageView smartImageView, Video video, String str, boolean z, AbstractC34364a aVar, boolean z2, Bitmap.Config config, int i) {
        boolean z3 = z;
        AbstractC34364a aVar2 = aVar;
        boolean z4 = z2;
        if ((i & 8) != 0) {
            z3 = true;
        }
        if ((i & 16) != 0) {
            aVar2 = null;
        }
        if ((i & 64) != 0) {
            z4 = true;
        }
        return m70317a(smartImageView, video, str, z3, aVar2, (String) null, z4, config, false);
    }

    /* renamed from: a */
    private static void m70314a(SmartImageView smartImageView, UrlModel urlModel, Video video, boolean z, String str, String str2, AbstractC34364a aVar, boolean z2, Bitmap.Config config) {
        int i;
        if (z) {
            i = C34390r.f81300e.f48938b;
        } else {
            C20713a aVar2 = C20713a.f48937a;
            C89219l.m154716b(aVar2, "");
            i = aVar2.f48938b;
        }
        C34602l a = C34735v.m70965a(urlModel);
        C89219l.m154716b(a, "");
        if (!TextUtils.isEmpty(str2) && !a.mo61062a()) {
            List<String> list = a.f81655b;
            C89219l.m154716b(list, "");
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
            for (T t : list) {
                C89219l.m154716b(t, "");
                String a2 = m70313a(t, "l", "0");
                Map<String, String> map = f81237b;
                String str3 = map.get(a2);
                if (str3 == null || str3.length() <= 0) {
                    map.put(a2, t);
                } else {
                    a2 = map.get(a2);
                    if (a2 == null) {
                        a2 = t;
                    }
                }
                arrayList.add(C89361p.m154929e((CharSequence) t, (CharSequence) "?") ? (a2 + "&ilog=") + str2 : (a2 + "?ilog=") + str2);
            }
            a.f81655b = arrayList;
        }
        C20766v a3 = C20761r.m39060a(a);
        a3.f49092E = smartImageView;
        C20766v a4 = a3.mo34179a(str);
        if (config != null) {
            a4.f49124u = Bitmap.Config.ARGB_8888;
        }
        a4.mo34177a(i, new C34366c(z, a, video)).mo34175a().mo34181a(new C34368d(smartImageView, aVar, z2, urlModel, a, video, z));
    }

    /* renamed from: a */
    public static boolean m70317a(SmartImageView smartImageView, Video video, String str, boolean z, AbstractC34364a aVar, String str2, boolean z2, Bitmap.Config config, boolean z3) {
        C89219l.m154721d(smartImageView, "");
        C89219l.m154721d(video, "");
        C89219l.m154721d(str, "");
        if (z2 && !z3 && !m70316a(C17867d.m33078a())) {
            return false;
        }
        if ((C89219l.m154714a((Object) null, (Object) "9frames") || m70321b() == 1) && m70320a(video.getDynamicCover())) {
            UrlModel dynamicCover = video.getDynamicCover();
            C89219l.m154716b(dynamicCover, "");
            m70314a(smartImageView, dynamicCover, video, false, str, "9frames", aVar, z, config);
            return true;
        }
        if (C89219l.m154714a((Object) null, (Object) "6frames") || m70321b() == 2) {
            if (m70320a(video.getAnimatedCover())) {
                UrlModel animatedCover = video.getAnimatedCover();
                C89219l.m154716b(animatedCover, "");
                m70314a(smartImageView, animatedCover, video, true, str, "6frames", aVar, z, config);
                return true;
            } else if (m70320a(video.getDynamicCover())) {
                UrlModel dynamicCover2 = video.getDynamicCover();
                C89219l.m154716b(dynamicCover2, "");
                m70314a(smartImageView, dynamicCover2, video, false, str, "9frames_test", aVar, z, config);
                return true;
            }
        }
        if (m70321b() != 0 || !m70320a(video.getDynamicCover())) {
            return false;
        }
        UrlModel dynamicCover3 = video.getDynamicCover();
        C89219l.m154716b(dynamicCover3, "");
        m70314a(smartImageView, dynamicCover3, video, false, str, "", aVar, z, config);
        return true;
    }
}
