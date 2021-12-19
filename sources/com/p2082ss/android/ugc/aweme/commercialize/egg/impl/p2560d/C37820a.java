package com.p2082ss.android.ugc.aweme.commercialize.egg.impl.p2560d;

import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.android.base.runtime.C16091a;
import com.bytedance.ies.android.base.runtime.depend.IAppLogDepend;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.commercialize.egg.p2554c.AbstractC37786a;
import com.p2082ss.android.ugc.aweme.commercialize.egg.p2555d.C37787a;
import com.p2082ss.android.ugc.aweme.commercialize.egg.p2555d.C37790b;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38176c;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38177d;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.ItemCommentEggGroup;
import com.p2082ss.android.ugc.aweme.feed.model.ItemLikeEggData;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.C89391z;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.d.a */
public final class C37820a implements AbstractC37786a {

    /* renamed from: a */
    public static final C37820a f89301a = new C37820a();

    private C37820a() {
    }

    static {
        Covode.recordClassIndex(45267);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.d.a$a */
    public static final class CallableC37821a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ boolean f89302a;

        /* renamed from: b */
        final /* synthetic */ C37787a f89303b;

        /* renamed from: c */
        final /* synthetic */ C37790b f89304c;

        /* renamed from: d */
        final /* synthetic */ String f89305d;

        static {
            Covode.recordClassIndex(45268);
        }

        CallableC37821a(boolean z, C37787a aVar, C37790b bVar, String str) {
            this.f89302a = z;
            this.f89303b = aVar;
            this.f89304c = bVar;
            this.f89305d = str;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            int i;
            try {
                if (this.f89302a) {
                    i = 0;
                } else {
                    i = 1;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("material_url", this.f89303b.f89211a);
                jSONObject.put("egg_type", this.f89304c.f89236a);
                jSONObject.put("egg_id", this.f89304c.f89240e);
                jSONObject.put("creative_id", this.f89304c.f89237b);
                jSONObject.put("log_extra", this.f89304c.f89238c);
                jSONObject.put("aweme_id", this.f89304c.f89239d);
                C12290b.m22060a(this.f89305d, i, jSONObject);
            } catch (Exception unused) {
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static boolean m76478a() {
        if (!C37822b.m76481a()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m76473a(C37787a aVar) {
        if (!m76478a() && aVar != null) {
            m76476a("preload_start", aVar.f89222l, 0, 12);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.egg.p2554c.AbstractC37786a
    /* renamed from: b */
    public final void mo65799b(List<? extends Aweme> list) {
        if (!m76478a() && list != null) {
            ArrayList<Aweme> arrayList = new ArrayList();
            for (T t : list) {
                ItemCommentEggGroup commentEggGroup = t.getCommentEggGroup();
                if (!(commentEggGroup == null || commentEggGroup.getCommentEggData() == null)) {
                    arrayList.add(t);
                }
            }
            for (Aweme aweme : arrayList) {
                C38176c a = new C38176c("egg", "data_received", -1, System.currentTimeMillis()).mo66471a(aweme.getAid());
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                C38176c b = a.mo66473b(awemeRawAd != null ? awemeRawAd.getCreativeIdStr() : null);
                AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                C38177d.f90185a.mo66478a(b.mo66474c(awemeRawAd2 != null ? awemeRawAd2.getLogExtra() : null).mo66476e(UGCMonitor.EVENT_COMMENT));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.egg.p2554c.AbstractC37786a
    /* renamed from: a */
    public final void mo65798a(List<? extends Aweme> list) {
        String fileType;
        String materialUrl;
        if (!m76478a() && list != null) {
            ArrayList<Aweme> arrayList = new ArrayList();
            for (T t : list) {
                ItemLikeEggData commerceAdLikeDigg = t.getCommerceAdLikeDigg();
                if (!(commerceAdLikeDigg == null || (fileType = commerceAdLikeDigg.getFileType()) == null || fileType.length() == 0 || (materialUrl = commerceAdLikeDigg.getMaterialUrl()) == null || materialUrl.length() == 0)) {
                    arrayList.add(t);
                }
            }
            for (Aweme aweme : arrayList) {
                C38176c a = new C38176c("egg", "data_received", -1, System.currentTimeMillis()).mo66471a(aweme.getAid());
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                String str = null;
                C38176c b = a.mo66473b(awemeRawAd != null ? awemeRawAd.getCreativeIdStr() : null);
                AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                if (awemeRawAd2 != null) {
                    str = awemeRawAd2.getLogExtra();
                }
                C38177d.f90185a.mo66478a(b.mo66474c(str).mo66476e("like"));
            }
        }
    }

    /* renamed from: a */
    public static void m76474a(C37787a aVar, boolean z, String str) {
        if (!m76478a() && aVar != null) {
            m76477a("show_result", aVar.f89222l, !z ? 1 : 0, str);
            m76475a("aweme_ad_egg_show_error_rate", aVar, z);
        }
    }

    /* renamed from: a */
    public static void m76475a(String str, C37787a aVar, boolean z) {
        ExecutorService executorService;
        C37790b bVar = aVar.f89222l;
        if (bVar != null) {
            CallableC37821a aVar2 = new CallableC37821a(z, aVar, bVar, str);
            IAppLogDepend iAppLogDepend = C16091a.f38741a;
            if (iAppLogDepend != null) {
                executorService = iAppLogDepend.getLogThreadPool();
            } else {
                executorService = null;
            }
            C1731i.m5640b(aVar2, executorService);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m76476a(String str, C37790b bVar, int i, int i2) {
        if ((i2 & 4) != 0) {
            i = -1;
        }
        m76477a(str, bVar, i, (String) null);
    }

    /* renamed from: a */
    private static void m76477a(String str, C37790b bVar, int i, String str2) {
        if (bVar != null) {
            C38177d.f90185a.mo66478a(new C38176c("egg", str, i, System.currentTimeMillis()).mo66471a(bVar.f89239d).mo66473b(bVar.f89237b).mo66474c(bVar.f89238c).mo66476e(bVar.f89236a).mo66477f(bVar.f89240e).mo66475d(str2));
        }
    }
}
