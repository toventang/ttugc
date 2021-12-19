package com.p2082ss.android.ugc.aweme.p2282ad.feed.mask;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38187i;
import com.p2082ss.android.ugc.aweme.commercialize.p2534ad.C37591b;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.uikit.p2617a.C38545a;
import com.p2082ss.android.ugc.aweme.commercialize.util.C38549a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.mask.p2301a.AbstractC33306b;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.mask.p2301a.AbstractC33307c;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.mask.p2302b.C33312a;
import com.p2082ss.android.ugc.aweme.p2282ad.p2290d.C33178a;
import com.p2082ss.android.ugc.aweme.p2282ad.utils.C33393c;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.feed.mask.b */
public final class C33308b implements AbstractC33320g {

    /* renamed from: e */
    public static final C33309a f79128e = new C33309a((byte) 0);

    /* renamed from: a */
    public Aweme f79129a;

    /* renamed from: b */
    public AbstractView$OnClickListenerC33314d f79130b;

    /* renamed from: c */
    public RelativeLayout f79131c;

    /* renamed from: d */
    public final LinearLayout f79132d;

    /* renamed from: f */
    private Context f79133f;

    /* renamed from: g */
    private C33313c f79134g;

    static {
        Covode.recordClassIndex(40141);
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.mask.b$a */
    public static final class C33309a {
        static {
            Covode.recordClassIndex(40142);
        }

        private C33309a() {
        }

        public /* synthetic */ C33309a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.mask.AbstractC33320g
    /* renamed from: b */
    public final boolean mo59303b() {
        if (this.f79132d.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.mask.b$b */
    static final class RunnableC33310b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C33308b f79135a;

        /* renamed from: b */
        final /* synthetic */ boolean f79136b;

        /* renamed from: c */
        final /* synthetic */ AbstractC33306b f79137c;

        static {
            Covode.recordClassIndex(40143);
        }

        RunnableC33310b(C33308b bVar, boolean z, AbstractC33306b bVar2) {
            this.f79135a = bVar;
            this.f79136b = z;
            this.f79137c = bVar2;
        }

        public final void run() {
            this.f79135a.f79132d.setVisibility(8);
            if (this.f79136b) {
                this.f79137c.mo59296a();
            }
            AbstractC81915c.m141874a(new C33312a(false, C33308b.m68287a(this.f79135a).getAid()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.mask.b$c */
    static final class RunnableC33311c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C33308b f79138a;

        /* renamed from: b */
        final /* synthetic */ AbstractC33307c f79139b;

        static {
            Covode.recordClassIndex(40144);
        }

        RunnableC33311c(C33308b bVar, AbstractC33307c cVar) {
            this.f79138a = bVar;
            this.f79139b = cVar;
        }

        public final void run() {
            RelativeLayout relativeLayout = this.f79138a.f79131c;
            if (relativeLayout == null) {
                C89219l.m154710a("widgetContainer");
            }
            relativeLayout.setVisibility(4);
            this.f79139b.mo59298a();
            this.f79138a.f79132d.setVisibility(0);
            AbstractView$OnClickListenerC33314d dVar = this.f79138a.f79130b;
            if (dVar != null) {
                C38545a.m78162a(dVar.mo59309a());
                C38545a.m78163a(dVar.mo59309a(), new C37591b((float) C34728n.m70946a(2.0d), C0643b.m2378c(dVar.f79148a, R.color.jq)), C0643b.m2378c(dVar.f79148a, R.color.j), Color.parseColor(C37699a.m76287c(dVar.f79149b.getAwemeRawAd())), 300);
            }
            this.f79138a.f79132d.animate().alpha(1.0f).setDuration(150).start();
            AbstractC81915c.m141874a(new C33312a(true, C33308b.m68287a(this.f79138a).getAid()));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.mask.AbstractC33320g
    /* renamed from: a */
    public final void mo59299a() {
        int i;
        AbstractView$OnClickListenerC33314d jVar;
        String a;
        int i2;
        AwemeRawAd awemeRawAd;
        AwemeSplashInfo splashInfo;
        this.f79132d.setVisibility(8);
        Aweme aweme = this.f79129a;
        if (aweme == null) {
            C89219l.m154710a("mAweme");
        }
        if (aweme.getAwemeRawAd() != null) {
            Aweme aweme2 = this.f79129a;
            if (aweme2 == null) {
                C89219l.m154710a("mAweme");
            }
            AwemeRawAd awemeRawAd2 = aweme2.getAwemeRawAd();
            if (awemeRawAd2 == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(awemeRawAd2, "");
            i = awemeRawAd2.getNativeCardType();
        } else {
            i = 0;
        }
        if (i == 0) {
            LinearLayout linearLayout = this.f79132d;
            C33313c cVar = this.f79134g;
            if (cVar == null) {
                C89219l.m154710a("adMaskParams");
            }
            jVar = new C33323j(linearLayout, cVar);
        } else if (i == 1) {
            LinearLayout linearLayout2 = this.f79132d;
            C33313c cVar2 = this.f79134g;
            if (cVar2 == null) {
                C89219l.m154710a("adMaskParams");
            }
            jVar = new C33317e(linearLayout2, cVar2);
        } else if (i == 2) {
            LinearLayout linearLayout3 = this.f79132d;
            C33313c cVar3 = this.f79134g;
            if (cVar3 == null) {
                C89219l.m154710a("adMaskParams");
            }
            jVar = new C33322i(linearLayout3, cVar3);
        } else if (i == 3) {
            LinearLayout linearLayout4 = this.f79132d;
            C33313c cVar4 = this.f79134g;
            if (cVar4 == null) {
                C89219l.m154710a("adMaskParams");
            }
            jVar = new C33324k(linearLayout4, cVar4);
        } else if (i != 4) {
            LinearLayout linearLayout5 = this.f79132d;
            C33313c cVar5 = this.f79134g;
            if (cVar5 == null) {
                C89219l.m154710a("adMaskParams");
            }
            jVar = new C33317e(linearLayout5, cVar5);
        } else {
            LinearLayout linearLayout6 = this.f79132d;
            C33313c cVar6 = this.f79134g;
            if (cVar6 == null) {
                C89219l.m154710a("adMaskParams");
            }
            jVar = new C33325l(linearLayout6, cVar6);
        }
        this.f79130b = jVar;
        jVar.mo59312c();
        AbstractView$OnClickListenerC33314d dVar = this.f79130b;
        if (dVar != null) {
            if (dVar.f79149b.isAd()) {
                TextView a2 = dVar.mo59309a();
                C89219l.m154716b(a2, "");
                if (C33393c.m68477a(dVar.f79149b)) {
                    Aweme aweme3 = dVar.f79149b;
                    if (aweme3 == null || (awemeRawAd = aweme3.getAwemeRawAd()) == null || (splashInfo = awemeRawAd.getSplashInfo()) == null || (a = splashInfo.getSplashButtonText()) == null) {
                        a = "";
                    }
                } else {
                    a = C38549a.m78165a(dVar.f79148a, dVar.f79149b, true);
                }
                a2.setText(a);
                float a3 = (float) C34728n.m70946a(2.0d);
                Resources resources = dVar.f79148a.getResources();
                if (C33393c.m68477a(dVar.f79149b)) {
                    i2 = R.color.bh;
                } else {
                    i2 = R.color.jq;
                }
                Drawable bVar = new C37591b(a3, resources.getColor(i2));
                Aweme aweme4 = dVar.f79149b;
                if (aweme4 != null && aweme4.isAd()) {
                    AwemeRawAd awemeRawAd3 = aweme4.getAwemeRawAd();
                    if (!TextUtils.isEmpty(awemeRawAd3.getWebUrl()) && (awemeRawAd3.getAnimationType() == 1 || awemeRawAd3.getAnimationType() == 2)) {
                        bVar = C38545a.m78161a(bVar.mutate(), C0643b.m2378c(dVar.f79148a, R.color.j));
                        C89219l.m154716b(bVar, "");
                    }
                }
                TextView a4 = dVar.mo59309a();
                C89219l.m154716b(a4, "");
                a4.setBackground(bVar);
            }
            dVar.mo59309a().setOnClickListener(dVar);
            dVar.mo59311b().setOnClickListener(dVar);
            C38545a.m78162a(dVar.mo59309a());
            C38545a.m78162a(dVar.mo59311b());
        }
    }

    public C33308b(LinearLayout linearLayout) {
        C89219l.m154721d(linearLayout, "");
        this.f79132d = linearLayout;
    }

    /* renamed from: a */
    public static final /* synthetic */ Aweme m68287a(C33308b bVar) {
        Aweme aweme = bVar.f79129a;
        if (aweme == null) {
            C89219l.m154710a("mAweme");
        }
        return aweme;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.mask.AbstractC33320g
    /* renamed from: a */
    public final void mo59300a(C33313c cVar) {
        C89219l.m154721d(cVar, "");
        this.f79133f = cVar.mo59306b();
        this.f79129a = cVar.mo59307c();
        RelativeLayout relativeLayout = cVar.f79146e;
        if (relativeLayout == null) {
            C89219l.m154710a("widgetContainer");
        }
        this.f79131c = relativeLayout;
        this.f79134g = cVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.mask.AbstractC33320g
    /* renamed from: a */
    public final boolean mo59302a(AbstractC33307c cVar) {
        C89219l.m154721d(cVar, "");
        if (this.f79130b == null) {
            return false;
        }
        Aweme aweme = this.f79129a;
        if (aweme == null) {
            C89219l.m154710a("mAweme");
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            HashMap hashMap = new HashMap();
            C89219l.m154716b(awemeRawAd, "");
            hashMap.put("background_type", String.valueOf(awemeRawAd.getNativeCardType()));
            HashMap hashMap2 = null;
            if (hashMap.size() != 0) {
                hashMap2 = new HashMap();
                hashMap2.put("ad_extra_data", new C27910f().mo46674b(hashMap));
            }
            C38187i.C38188a aVar = new C38187i.C38188a();
            aVar.f90222a = awemeRawAd;
            aVar.f90226e = hashMap2;
            aVar.f90224c = false;
            C33178a.m67998a("othershow", awemeRawAd, aVar.mo66507a());
            C18129a.m33746a("background_ad", "othershow", awemeRawAd).mo28897a("background_type", String.valueOf(awemeRawAd.getNativeCardType())).mo28902c();
        }
        this.f79132d.setAlpha(0.0f);
        RelativeLayout relativeLayout = this.f79131c;
        if (relativeLayout == null) {
            C89219l.m154710a("widgetContainer");
        }
        relativeLayout.setAlpha(1.0f);
        RelativeLayout relativeLayout2 = this.f79131c;
        if (relativeLayout2 == null) {
            C89219l.m154710a("widgetContainer");
        }
        relativeLayout2.animate().alpha(0.0f).setDuration(150).withEndAction(new RunnableC33311c(this, cVar)).start();
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.mask.AbstractC33320g
    /* renamed from: a */
    public final void mo59301a(boolean z, AbstractC33306b bVar) {
        C89219l.m154721d(bVar, "");
        if (this.f79130b != null) {
            this.f79132d.setAlpha(1.0f);
            this.f79132d.animate().alpha(0.0f).setDuration(150).withEndAction(new RunnableC33310b(this, z, bVar)).start();
            if (!bVar.mo59297b()) {
                RelativeLayout relativeLayout = this.f79131c;
                if (relativeLayout == null) {
                    C89219l.m154710a("widgetContainer");
                }
                relativeLayout.setAlpha(0.0f);
                RelativeLayout relativeLayout2 = this.f79131c;
                if (relativeLayout2 == null) {
                    C89219l.m154710a("widgetContainer");
                }
                relativeLayout2.setVisibility(0);
                RelativeLayout relativeLayout3 = this.f79131c;
                if (relativeLayout3 == null) {
                    C89219l.m154710a("widgetContainer");
                }
                relativeLayout3.animate().alpha(1.0f).setDuration(150).start();
            }
        }
    }
}
