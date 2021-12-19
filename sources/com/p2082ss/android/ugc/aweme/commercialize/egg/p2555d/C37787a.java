package com.p2082ss.android.ugc.aweme.commercialize.egg.p2555d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.commercialize.egg.C37779a;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38262z;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.ItemCommentEggData;
import com.p2082ss.android.ugc.aweme.feed.model.ItemLikeEggData;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.d.a */
public final class C37787a {

    /* renamed from: a */
    public String f89211a;

    /* renamed from: b */
    public String f89212b;

    /* renamed from: c */
    public String f89213c;

    /* renamed from: d */
    public String f89214d;

    /* renamed from: e */
    public String f89215e;

    /* renamed from: f */
    public String f89216f;

    /* renamed from: g */
    public final boolean f89217g;

    /* renamed from: h */
    public final int f89218h;

    /* renamed from: i */
    public final boolean f89219i;

    /* renamed from: j */
    public AtomicBoolean f89220j;

    /* renamed from: k */
    public C37791c f89221k;

    /* renamed from: l */
    public C37790b f89222l;

    /* renamed from: m */
    public final String f89223m;

    /* renamed from: n */
    public final String f89224n;

    /* renamed from: o */
    public String f89225o;

    /* renamed from: p */
    private final C37788a<?> f89226p;

    static {
        Covode.recordClassIndex(45234);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.d.a$a */
    public static final class C37788a<T> {

        /* renamed from: a */
        public T f89227a;

        /* renamed from: b */
        public boolean f89228b = true;

        /* renamed from: c */
        public int f89229c = 1;

        /* renamed from: d */
        public boolean f89230d = true;

        /* renamed from: e */
        public String f89231e = "";

        /* renamed from: f */
        public String f89232f = "";

        /* renamed from: g */
        public String f89233g = "";

        /* renamed from: h */
        public AwemeRawAd f89234h;

        static {
            Covode.recordClassIndex(45235);
        }

        /* renamed from: a */
        public final C37787a mo65801a() {
            return new C37787a(this, (byte) 0);
        }

        /* renamed from: a */
        public final C37788a<T> mo65800a(String str) {
            if (str == null) {
                str = "";
            }
            this.f89231e = str;
            return this;
        }

        /* renamed from: b */
        public final C37788a<T> mo65802b(String str) {
            if (str == null) {
                str = "";
            }
            this.f89232f = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.d.a$b */
    final class C37789b {
        static {
            Covode.recordClassIndex(45236);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C37789b() {
        }
    }

    private C37787a(C37788a<?> aVar) {
        List<String> urlList;
        String str;
        String str2;
        String str3;
        this.f89226p = aVar;
        this.f89214d = "";
        this.f89215e = "";
        this.f89216f = "";
        this.f89217g = aVar.f89228b;
        this.f89218h = aVar.f89229c;
        this.f89219i = aVar.f89230d;
        this.f89220j = new AtomicBoolean(false);
        this.f89223m = aVar.f89231e;
        this.f89224n = aVar.f89232f;
        this.f89225o = aVar.f89233g;
        C37789b bVar = new C37789b();
        C89219l.m154721d(aVar, "");
        T t = aVar.f89227a;
        String str4 = null;
        if (t instanceof ItemLikeEggData) {
            T t2 = t;
            C37787a aVar2 = C37787a.this;
            aVar2.f89211a = t2.getMaterialUrl();
            aVar2.f89212b = t2.getFileType();
            AwemeRawAd awemeRawAd = aVar.f89234h;
            if (awemeRawAd != null) {
                str3 = awemeRawAd.getCreativeIdStr();
                str4 = awemeRawAd.getLogExtra();
            } else {
                str3 = null;
            }
            aVar2.f89222l = new C37790b("like", str3, str4, aVar.f89231e);
        } else if (t instanceof ItemCommentEggData) {
            T t3 = t;
            C37787a aVar3 = C37787a.this;
            aVar3.f89211a = t3.getMaterialUrl();
            aVar3.f89212b = t3.getFileType();
            aVar3.f89213c = t3.getRegex();
            String eggId = t3.getEggId();
            eggId = eggId == null ? "" : eggId;
            C89219l.m154721d(eggId, "");
            aVar3.f89216f = eggId;
            String webUrl = t3.getWebUrl();
            webUrl = webUrl == null ? "" : webUrl;
            C89219l.m154721d(webUrl, "");
            aVar3.f89214d = webUrl;
            String openUrl = t3.getOpenUrl();
            openUrl = openUrl == null ? "" : openUrl;
            C89219l.m154721d(openUrl, "");
            aVar3.f89215e = openUrl;
            AwemeRawAd awemeRawAd2 = aVar.f89234h;
            if (awemeRawAd2 != null) {
                str2 = awemeRawAd2.getCreativeIdStr();
                str4 = awemeRawAd2.getLogExtra();
            } else {
                str2 = null;
            }
            aVar3.f89222l = new C37790b(UGCMonitor.EVENT_COMMENT, str2, str4, aVar.f89232f);
        } else if (t instanceof C38262z) {
            T t4 = t;
            UrlModel sourceUrl = t4.getSourceUrl();
            if (!(sourceUrl == null || (urlList = sourceUrl.getUrlList()) == null || (str = (String) C89070n.m154561b((List) urlList, 0)) == null)) {
                Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
                str4 = C89361p.m154910b((CharSequence) str).toString();
            }
            C89219l.m154721d(t4, "");
            String sourceType = t4.getSourceType();
            if ((TextUtils.equals(sourceType, C37779a.C37780a.f89202b) || TextUtils.equals(sourceType, C37779a.C37780a.f89203c) || TextUtils.equals(sourceType, C37779a.C37780a.f89204d)) && !TextUtils.isEmpty(str4)) {
                C37790b bVar2 = new C37790b("search", "-1", "", "", t4.getId());
                C37787a aVar4 = C37787a.this;
                aVar4.f89211a = str4;
                aVar4.f89212b = t4.getSourceType();
                aVar4.f89222l = bVar2;
            }
        }
    }

    public /* synthetic */ C37787a(C37788a aVar, byte b) {
        this(aVar);
    }
}
