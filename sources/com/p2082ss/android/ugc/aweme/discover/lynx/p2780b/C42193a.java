package com.p2082ss.android.ugc.aweme.discover.lynx.p2780b;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.C12290b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.lynx.AbstractC16370a;
import com.bytedance.ies.bullet.kit.lynx.AbstractC16387b;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h;
import com.bytedance.ies.bullet.p1184ui.common.BulletContainerView;
import com.kakao.usermgmt.StringSet;
import com.lynx.tasm.EnumC28856r;
import com.lynx.tasm.TemplateData;
import com.p2082ss.android.ugc.aweme.bullet.p2417e.C35143a;
import com.p2082ss.android.ugc.aweme.bullet.p2417e.C35145b;
import com.p2082ss.android.ugc.aweme.bullet.p2417e.C35146c;
import com.p2082ss.android.ugc.aweme.bullet.utils.C35301c;
import com.p2082ss.android.ugc.aweme.discover.lynx.C42184a;
import com.p2082ss.android.ugc.aweme.discover.lynx.delegate.C42246j;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2782d.C42213c;
import com.p2082ss.android.ugc.aweme.discover.lynx.spark.C42264a;
import com.p2082ss.android.ugc.aweme.discover.lynx.spark.C42291e;
import com.p2082ss.android.ugc.aweme.discover.lynx.spark.p2785b.C42274a;
import com.p2082ss.android.ugc.aweme.discover.lynx.spark.p2785b.C42276c;
import com.p2082ss.android.ugc.aweme.discover.lynx.spark.p2785b.C42280d;
import com.p2082ss.android.ugc.aweme.discover.lynx.spark.p2785b.C42281e;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41506an;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41544p;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.discover.lynx.b.a */
public final class C42193a {

    /* renamed from: a */
    public static final Map<Integer, AbstractC16370a> f98350a = new LinkedHashMap();

    /* renamed from: b */
    public static final C42193a f98351b = new C42193a();

    private C42193a() {
    }

    /* renamed from: a */
    public static void m84452a() {
        f98350a.clear();
    }

    static {
        Covode.recordClassIndex(50132);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.b.a$a */
    public static final class C42194a extends AbstractC89220m implements AbstractC89172b<Uri, C35146c> {

        /* renamed from: a */
        final /* synthetic */ C35146c f98352a;

        static {
            Covode.recordClassIndex(50133);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42194a(C35146c cVar) {
            super(1);
            this.f98352a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C35146c invoke(Uri uri) {
            C89219l.m154721d(uri, "");
            return this.f98352a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.b.a$b */
    public static final class C42195b extends AbstractC16370a.AbstractC16371a {

        /* renamed from: a */
        final /* synthetic */ C35146c f98353a;

        /* renamed from: b */
        final /* synthetic */ String f98354b;

        /* renamed from: c */
        final /* synthetic */ BulletContainerView f98355c;

        static {
            Covode.recordClassIndex(50134);
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.lynx.b.a$b$a */
        static final class C42196a extends AbstractC89220m implements AbstractC89172b<Uri, C35146c> {

            /* renamed from: a */
            final /* synthetic */ C42195b f98356a;

            static {
                Covode.recordClassIndex(50135);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C42196a(C42195b bVar) {
                super(1);
                this.f98356a = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C35146c invoke(Uri uri) {
                C89219l.m154721d(uri, "");
                return this.f98356a.f98353a;
            }
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.AbstractC16370a, com.bytedance.ies.bullet.kit.lynx.AbstractC16370a.AbstractC16371a
        /* renamed from: b */
        public final void mo25958b(AbstractC16387b bVar) {
            C89219l.m154721d(bVar, "");
            super.mo25958b(bVar);
            this.f98353a.hashCode();
            bVar.mo25772e();
            C42213c.C42214a.m84501a(this.f98354b, 3);
            this.f98355c.setTag(EnumC42198c.SUCCEED);
            if (!C42274a.m84627a()) {
                C35145b.m71914a(this.f98354b, new C42196a(this));
            }
            AbstractC16370a remove = C42193a.f98350a.remove(Integer.valueOf(this.f98353a.hashCode()));
            if (remove != null) {
                remove.mo25958b(bVar);
            }
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.AbstractC16370a, com.bytedance.ies.bullet.kit.lynx.AbstractC16370a.AbstractC16371a
        /* renamed from: a */
        public final void mo25956a(AbstractC16387b bVar, String str) {
            C89219l.m154721d(bVar, "");
            super.mo25956a(bVar, str);
            if (C42274a.m84627a()) {
                this.f98355c.setTag(EnumC42198c.FAILED);
                Uri parse = Uri.parse(this.f98354b);
                if (parse != null) {
                    C35145b.m71913a(parse);
                }
            }
            AbstractC16370a remove = C42193a.f98350a.remove(Integer.valueOf(this.f98353a.hashCode()));
            if (remove != null) {
                remove.mo25956a(bVar, str);
            }
        }

        C42195b(C35146c cVar, String str, BulletContainerView bulletContainerView) {
            this.f98353a = cVar;
            this.f98354b = str;
            this.f98355c = bulletContainerView;
        }
    }

    /* renamed from: b */
    public static boolean m84456b(String str) {
        C89219l.m154721d(str, "");
        if (C42264a.m84607a(str)) {
            return true;
        }
        if (!m84457c(str) || !C42291e.m84654a()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private static boolean m84457c(String str) {
        C89219l.m154721d(str, "");
        return C89361p.m154908a((CharSequence) C42246j.C42247a.m84556a(str), (CharSequence) "user", false);
    }

    /* renamed from: a */
    public static Bundle m84451a(Context context) {
        C89219l.m154721d(context, "");
        Bundle bundle = new Bundle();
        bundle.putInt("preset_width", View.MeasureSpec.makeMeasureSpec(C13628n.m24504a(context), 1073741824));
        bundle.putInt("preset_height", View.MeasureSpec.makeMeasureSpec(0, 0));
        bundle.putBoolean("preset_safe_point", true);
        bundle.putInt("thread_strategy", EnumC28856r.PART_ON_LAYOUT.mo49985id());
        return bundle;
    }

    /* renamed from: a */
    public static boolean m84455a(String str) {
        C89219l.m154721d(str, "");
        if (m84456b(str)) {
            C89219l.m154721d(str, "");
            String a = C42246j.C42247a.m84556a(str);
            if (C42276c.m84629a().containsKey(a) || C42276c.m84632b().containsKey(a)) {
                return true;
            }
            return false;
        }
        Uri parse = Uri.parse(str);
        C89219l.m154716b(parse, "");
        C89219l.m154721d(parse, "");
        C35143a aVar = C35145b.f82934a;
        C89219l.m154721d(parse, "");
        for (C35143a.C35144a aVar2 : aVar.f82931a) {
            if (C89219l.m154714a(aVar2.f82932a, parse)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static void m84454a(JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator<String> keys = jSONObject2.keys();
        C89219l.m154716b(keys, "");
        while (keys.hasNext()) {
            String next = keys.next();
            jSONObject.put(next, jSONObject2.opt(next));
        }
    }

    /* renamed from: a */
    public final void mo71392a(Context context, String str, String str2) {
        Bundle bundle;
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        if (TextUtils.isEmpty(str) || !C41506an.m83451a()) {
            return;
        }
        if (!m84457c(str) || !m84455a(str)) {
            if (m84456b(str)) {
                C42276c.f98492b.mo71471a(context, str, str2);
                return;
            }
            m84453a("preload", str, null, null);
            if (C41544p.m83482a()) {
                bundle = m84451a(context);
            } else {
                bundle = null;
            }
            BulletContainerView a = C42184a.m84437a(context);
            a.setTag(EnumC42198c.LOADING);
            C16248b bVar = new C16248b();
            bVar.mo25831b(String.class, str2);
            bVar.mo25831b(TemplateData.class, null);
            C35146c cVar = new C35146c(a, bVar);
            if (C42274a.m84627a()) {
                C35145b.m71914a(str, new C42194a(cVar));
            }
            C42195b bVar2 = new C42195b(cVar, str, a);
            Uri a2 = C35301c.m72246a(str);
            C16248b bVar3 = new C16248b();
            if (str2 != null) {
                TemplateData a3 = TemplateData.m56771a(str2);
                a3.mo48812a("isPreload", true);
                bVar3.mo25831b(TemplateData.class, a3);
            }
            bVar3.mo25831b(AbstractC16370a.class, bVar2);
            a.mo26837a(a2, bundle, bVar3, (AbstractC17046h.AbstractC17048b) null);
        } else if (C42280d.m84636a()) {
            C42281e.m84637a(str, str2);
        }
    }

    /* renamed from: a */
    public static void m84453a(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(StringSet.type, str);
        jSONObject3.put("schema", str2);
        if (jSONObject != null) {
            m84454a(jSONObject3, jSONObject);
        }
        C12290b.m22066a("search_bullet_preload_report", jSONObject3, jSONObject2, (JSONObject) null);
    }
}
