package com.p2082ss.android.ugc.aweme.discover.lynx.delegate;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.account.util.C33039i;
import com.p2082ss.android.ugc.aweme.bullet.bridge.framework.OpenShortVideoMethod;
import com.p2082ss.android.ugc.aweme.discover.api.SearchContinuousLoadingApi;
import com.p2082ss.android.ugc.aweme.discover.helper.C42058x;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2779a.AbstractC42191c;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2779a.C42186b;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42345d;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.search.C42909a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.lynx.delegate.h */
public final class C42237h extends AbstractC42218b implements OpenShortVideoMethod.AbstractC35081b, AbstractC42191c, C42909a.AbstractC42911b {

    /* renamed from: c */
    public static int f98409c = 10;

    /* renamed from: d */
    public static final C42238a f98410d = new C42238a((byte) 0);

    /* renamed from: a */
    public List<String> f98411a = new ArrayList();

    /* renamed from: e */
    private final AbstractC89244h f98412e;

    /* renamed from: f */
    private String f98413f;

    /* renamed from: d */
    private final C42058x m84527d() {
        return (C42058x) this.f98412e.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.delegate.h$a */
    public static final class C42238a {
        static {
            Covode.recordClassIndex(50180);
        }

        private C42238a() {
        }

        public /* synthetic */ C42238a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.delegate.h$b */
    static final class C42239b extends AbstractC89220m implements AbstractC89171a<C42058x> {

        /* renamed from: a */
        final /* synthetic */ C42237h f98414a;

        /* renamed from: b */
        final /* synthetic */ C42186b f98415b;

        static {
            Covode.recordClassIndex(50181);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42239b(C42237h hVar, C42186b bVar) {
            super(0);
            this.f98414a = hVar;
            this.f98415b = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C42058x invoke() {
            return C42058x.C42059a.m84178a(new C42058x.AbstractC42060b(this) {
                /* class com.p2082ss.android.ugc.aweme.discover.lynx.delegate.C42237h.C42239b.C422401 */

                /* renamed from: a */
                final /* synthetic */ C42239b f98416a;

                static {
                    Covode.recordClassIndex(50182);
                }

                @Override // com.p2082ss.android.ugc.aweme.discover.helper.C42058x.AbstractC42060b
                public final List<Aweme> aS_() {
                    return null;
                }

                @Override // com.p2082ss.android.ugc.aweme.discover.helper.C42058x.AbstractC42060b
                public final List<Aweme> aT_() {
                    return null;
                }

                @Override // com.p2082ss.android.ugc.aweme.discover.helper.C42058x.AbstractC42060b
                public final int aU_() {
                    return C42237h.f98409c;
                }

                @Override // com.p2082ss.android.ugc.aweme.discover.helper.C42058x.AbstractC42060b
                public final Object aR_() {
                    C42345d dVar = this.f98416a.f98415b.f98326h;
                    if (dVar != null) {
                        return dVar.getKey();
                    }
                    return null;
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f98416a = r1;
                }

                @Override // com.p2082ss.android.ugc.aweme.discover.helper.C42058x.AbstractC42060b
                /* renamed from: a */
                public final boolean mo70987a(Aweme aweme) {
                    C89219l.m154721d(aweme, "");
                    if (this.f98416a.f98414a.f98411a.isEmpty()) {
                        return true;
                    }
                    Iterator<T> it = this.f98416a.f98414a.f98411a.iterator();
                    while (it.hasNext()) {
                        if (TextUtils.equals(aweme.getAid(), it.next())) {
                            return true;
                        }
                    }
                    return false;
                }
            });
        }
    }

    static {
        Covode.recordClassIndex(50179);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.lynx.p2779a.AbstractC42191c
    /* renamed from: a */
    public final void mo71389a(C16248b bVar) {
        C89219l.m154721d(bVar, "");
        bVar.mo25831b(OpenShortVideoMethod.AbstractC35081b.class, this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42237h(C42186b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
        bVar.mo71385a().mo71391a(this);
        this.f98412e = C89250i.m154773a((AbstractC89171a) new C42239b(this, bVar));
    }

    /* renamed from: b */
    private final void m84526b(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("item_ids");
        int length = optJSONArray.length();
        this.f98411a.clear();
        for (int i = 0; i < length; i++) {
            List<String> list = this.f98411a;
            String optString = optJSONArray.optString(i);
            C89219l.m154716b(optString, "");
            list.add(optString);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.framework.OpenShortVideoMethod.AbstractC35081b
    /* renamed from: a */
    public final boolean mo61911a(JSONObject jSONObject) {
        String str;
        C89219l.m154721d(jSONObject, "");
        JSONObject optJSONObject = jSONObject.optJSONObject("search_extra");
        if (optJSONObject != null) {
            str = optJSONObject.optString("video_from");
        } else {
            str = null;
        }
        if (C89219l.m154714a((Object) str, (Object) "from_search_continuous_loading_card")) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.delegate.h$c */
    static final class C42241c extends AbstractC89220m implements AbstractC89183m<Aweme, List<Aweme>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ JSONObject f98417a;

        /* renamed from: b */
        final /* synthetic */ C42237h f98418b;

        /* renamed from: c */
        final /* synthetic */ Aweme f98419c;

        /* renamed from: d */
        final /* synthetic */ String f98420d;

        static {
            Covode.recordClassIndex(50183);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42241c(JSONObject jSONObject, C42237h hVar, Aweme aweme, String str) {
            super(2);
            this.f98417a = jSONObject;
            this.f98418b = hVar;
            this.f98419c = aweme;
            this.f98420d = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Aweme aweme, List<Aweme> list) {
            C89219l.m154721d(aweme, "");
            if (list != null) {
                this.f98417a.put("new_aweme_list", C33039i.m67673a().mo46674b(list));
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.framework.OpenShortVideoMethod.AbstractC35081b
    /* renamed from: a */
    public final boolean mo61912a(JSONObject jSONObject, Bundle bundle) {
        Integer num;
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(bundle, "");
        ActivityC0945e eVar = this.f98388b.f98319a;
        C89219l.m154721d(this, "");
        if (eVar != null) {
            C42909a.m85664b().put(Integer.valueOf(eVar.hashCode()), new WeakReference<>(this));
        }
        this.f98413f = jSONObject.optString("current_item_id");
        m84526b(jSONObject);
        f98409c = bundle.getInt("item_size", 10);
        JSONObject optJSONObject = jSONObject.optJSONObject("search_extra");
        String str = null;
        if (optJSONObject != null) {
            num = Integer.valueOf(optJSONObject.optInt(StringSet.type));
        } else {
            num = null;
        }
        if (num != null) {
            if (num.intValue() == 2) {
                bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 65456);
            } else if (num.intValue() == 4) {
                bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 65458);
            }
        }
        C42058x d = m84527d();
        if (optJSONObject != null) {
            str = optJSONObject.optString("video_from");
        }
        if (!C89219l.m154714a((Object) str, (Object) "from_search_continuous_loading_card") || d == null) {
            return false;
        }
        Context context = this.f98388b.f98336r.getContext();
        C89219l.m154716b(context, "");
        SearchContinuousLoadingApi.C41847b bVar = new SearchContinuousLoadingApi.C41847b();
        JSONObject optJSONObject2 = jSONObject.optJSONObject("search_extra");
        if (optJSONObject2 != null) {
            bVar.f97616a = optJSONObject2.optString("keyword");
            bVar.f97617b = optJSONObject2.optInt(StringSet.type);
            bVar.f97618c = optJSONObject2.optString("id");
        }
        d.mo71224a(context, bundle, bVar);
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.search.C42909a.AbstractC42911b
    /* renamed from: a */
    public final void mo71436a(Aweme aweme, String str, String str2) {
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (!TextUtils.equals(aweme.getAid(), this.f98413f)) {
            C42186b bVar = this.f98388b;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scroll_aweme_id", aweme.getAid());
            jSONObject.put("cid", aweme.getChallengeId());
            C42058x d = m84527d();
            if (d != null && C89219l.m154714a((Object) str2, (Object) "from_search_continuous_loading_card")) {
                C49672ag agVar = new C49672ag(21);
                agVar.f114319e = str2;
                d.mo71225a(agVar, aweme, new C42241c(jSONObject, this, aweme, str2));
            }
            bVar.mo71386a("updateVideoCloseState", jSONObject);
        }
        C42909a.m85663a(this);
    }
}
