package com.p2082ss.android.ugc.aweme.favorites.model;

import android.content.Context;
import android.content.res.Resources;
import androidx.lifecycle.AbstractC1174ac;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService;
import com.p2082ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.aweme.favorites.api.UserFavoritesApi;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.favorites.model.ChallengeCollectedViewModel */
public final class ChallengeCollectedViewModel extends AbstractC1174ac {

    /* renamed from: a */
    public int f110271a;

    /* renamed from: b */
    public final List<Challenge> f110272b = new ArrayList();

    /* renamed from: c */
    public C47471b f110273c;

    static {
        Covode.recordClassIndex(56081);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.favorites.model.ChallengeCollectedViewModel$a */
    public static final class CallableC47468a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ ChallengeCollectedViewModel f110274a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f110275b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89187q f110276c;

        static {
            Covode.recordClassIndex(56082);
        }

        CallableC47468a(ChallengeCollectedViewModel challengeCollectedViewModel, AbstractC89171a aVar, AbstractC89187q qVar) {
            this.f110274a = challengeCollectedViewModel;
            this.f110275b = aVar;
            this.f110276c = qVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            int i;
            int i2 = this.f110274a.f110271a;
            if (this.f110274a.f110271a == 0) {
                i = 12;
            } else {
                i = 10;
            }
            C47471b a = UserFavoritesApi.m90366a(i2, i);
            if (a == null) {
                AbstractC89171a aVar = this.f110275b;
                if (aVar != null) {
                    return aVar.invoke();
                }
                return null;
            }
            this.f110274a.f110273c = a;
            this.f110274a.f110271a = a.f110281b;
            if (a.f110280a != null) {
                List<Challenge> list = this.f110274a.f110272b;
                List<Challenge> list2 = a.f110280a;
                C89219l.m154716b(list2, "");
                List<Challenge> list3 = this.f110274a.f110272b;
                C89219l.m154721d(list2, "");
                C89219l.m154721d(list3, "");
                ArrayList arrayList = new ArrayList();
                for (Challenge challenge : list2) {
                    arrayList.add(challenge);
                    for (Challenge challenge2 : list3) {
                        if (C89219l.m154714a((Object) challenge.getCid(), (Object) challenge2.getCid())) {
                            arrayList.remove(challenge);
                        }
                    }
                }
                list.addAll(arrayList);
            }
            AbstractC89187q qVar = this.f110276c;
            if (qVar == null) {
                return null;
            }
            Integer valueOf = Integer.valueOf(this.f110274a.f110271a);
            boolean z = true;
            if (a.f110282c != 1) {
                z = false;
            }
            return qVar.invoke(valueOf, Boolean.valueOf(z), this.f110274a.f110272b);
        }
    }

    /* renamed from: a */
    public final Challenge mo79737a(String str) {
        C89219l.m154721d(str, "");
        for (T t : this.f110272b) {
            if (C89219l.m154714a((Object) t.getCid(), (Object) str)) {
                return t;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final Map<String, Object> mo79738a(Context context) {
        String str;
        String str2;
        List<String> urlList;
        List<String> urlList2;
        C89219l.m154721d(context, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C47471b bVar = this.f110273c;
        linkedHashMap.put("hasMore", bVar != null ? Integer.valueOf(bVar.f110282c) : false);
        linkedHashMap.put("loadingMore", false);
        linkedHashMap.put("cursor", Integer.valueOf(this.f110271a));
        ArrayList arrayList = new ArrayList();
        for (Challenge challenge : this.f110272b) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            UrlModel coverItem = challenge.getCoverItem();
            if (coverItem == null || (urlList2 = coverItem.getUrlList()) == null || (str = urlList2.get(0)) == null) {
                str = "";
            }
            linkedHashMap2.put("coverItem", str);
            linkedHashMap2.put("iscommerce", Boolean.valueOf(challenge.isCommerce()));
            UrlModel a = CommerceChallengeServiceImpl.m75741e().mo65376a(context.getResources().getString(R.string.fo5, challenge.getChallengeName()), challenge.isCommerce(), true);
            if (a == null || (urlList = a.getUrlList()) == null || (str2 = urlList.get(0)) == null) {
                str2 = "";
            }
            linkedHashMap2.put("emojiIcon", str2);
            linkedHashMap2.put("usercount", Integer.valueOf(challenge.getUserCount()));
            String challengeName = challenge.getChallengeName();
            C89219l.m154716b(challengeName, "");
            linkedHashMap2.put("hashtagName", challengeName);
            linkedHashMap2.put("viewcount", Long.valueOf(challenge.getViewCount()));
            String cid = challenge.getCid();
            C89219l.m154716b(cid, "");
            linkedHashMap2.put("cid", cid);
            arrayList.add(linkedHashMap2);
        }
        linkedHashMap.put("hashTagList", arrayList);
        return linkedHashMap;
    }

    /* renamed from: a */
    public final void mo79739a(AbstractC89187q<? super Integer, ? super Boolean, ? super List<? extends Challenge>, C89391z> qVar, AbstractC89171a<C89391z> aVar) {
        C1731i.m5640b(new CallableC47468a(this, aVar, qVar), C1731i.f5562a);
    }

    /* renamed from: b */
    public final void mo79740b(AbstractC89187q<? super Integer, ? super Boolean, ? super List<? extends Challenge>, C89391z> qVar, AbstractC89171a<C89391z> aVar) {
        this.f110271a = 0;
        this.f110272b.clear();
        mo79739a(qVar, aVar);
    }

    /* renamed from: a */
    public static JSONArray m90517a(List<? extends Challenge> list, Context context) {
        String str;
        String str2;
        String str3;
        List<String> urlList;
        Resources resources;
        List<String> urlList2;
        C89219l.m154721d(list, "");
        JSONArray jSONArray = new JSONArray();
        for (T t : list) {
            JSONObject jSONObject = new JSONObject();
            UrlModel coverItem = t.getCoverItem();
            if (coverItem == null || (urlList2 = coverItem.getUrlList()) == null || (str = urlList2.get(0)) == null) {
                str = "";
            }
            jSONObject.put("coverItem", str);
            jSONObject.put("iscommerce", t.isCommerce());
            ICommerceChallengeService e = CommerceChallengeServiceImpl.m75741e();
            if (context == null || (resources = context.getResources()) == null) {
                str2 = null;
            } else {
                str2 = resources.getString(R.string.fo5, t.getChallengeName());
            }
            UrlModel a = e.mo65376a(str2, t.isCommerce(), true);
            if (a == null || (urlList = a.getUrlList()) == null || (str3 = urlList.get(0)) == null) {
                str3 = "";
            }
            jSONObject.put("emojiIcon", str3);
            jSONObject.put("hashtagName", t.getChallengeName());
            jSONObject.put("usercount", t.getUserCount());
            jSONObject.put("viewcount", t.getViewCount());
            jSONObject.put("cid", t.getCid());
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }
}
