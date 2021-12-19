package com.p2082ss.android.ugc.aweme.commercialize.playfun;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20728e;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38176c;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38177d;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38229ao;
import com.p2082ss.android.ugc.aweme.commercialize.playfun.p2607b.C38293a;
import com.p2082ss.android.ugc.aweme.commercialize.widget.C39039a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemePlayFunModel;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2300h.C33278a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.AdPlayFunWidget */
public final class AdPlayFunWidget extends AbsAdPlayFunWidget implements AbstractC33974au {

    /* renamed from: a */
    private AdPlayFunView f90464a;

    static {
        Covode.recordClassIndex(45759);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.playfun.AbsAdPlayFunWidget, com.p2082ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget, com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.playfun.AbsAdPlayFunWidget
    /* renamed from: f */
    public final void mo66853f() {
        AdPlayFunView adPlayFunView = this.f90464a;
        if (adPlayFunView != null) {
            adPlayFunView.mo66856b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget
    /* renamed from: a */
    public final void mo59238a() {
        super.mo59238a();
        DataCenter dataCenter = this.f80273e;
        if (dataCenter != null) {
            dataCenter.mo60189a("ad_feed_on_page_selected", (AbstractC1214u<C33942b>) this);
            dataCenter.mo60189a("ad_feed_on_page_unselected", (AbstractC1214u<C33942b>) this);
            dataCenter.mo60189a("ad_video_on_render_ready", (AbstractC1214u<C33942b>) this);
            dataCenter.mo60189a("ad_video_on_resume_play", (AbstractC1214u<C33942b>) this);
            dataCenter.mo60189a("ad_video_on_pause_play", (AbstractC1214u<C33942b>) this);
            dataCenter.mo60189a("ad_feed_bind_texture_size", (AbstractC1214u<C33942b>) this);
            dataCenter.mo60189a("on_ad_pop_up_web_page_show", (AbstractC1214u<C33942b>) this);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.playfun.AbsAdPlayFunWidget
    /* renamed from: e */
    public final void mo66852e() {
        AdPlayFunView adPlayFunView = this.f90464a;
        if (adPlayFunView != null) {
            AwemePlayFunModel awemePlayFunModel = adPlayFunView.f90450g;
            if (awemePlayFunModel != null) {
                String tips = awemePlayFunModel.getTips();
                if (tips != null) {
                    TextView textView = adPlayFunView.f90445b;
                    if (textView == null) {
                        C89219l.m154710a("eggTitleView");
                    }
                    textView.setText(tips);
                }
                UrlModel imageInfo = awemePlayFunModel.getImageInfo();
                if (imageInfo != null) {
                    C20766v a = C20761r.m39060a(C34735v.m70965a(imageInfo)).mo34179a("AdPlayFunView");
                    SmartImageView smartImageView = adPlayFunView.f90444a;
                    if (smartImageView == null) {
                        C89219l.m154710a("eggImageView");
                    }
                    a.f49092E = smartImageView;
                    a.mo34181a(adPlayFunView.f90452i);
                }
            }
            adPlayFunView.setVisibility(0);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u, com.p2082ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget
    public final /* synthetic */ void onChanged(C33942b bVar) {
        onChanged(bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.AdPlayFunWidget$a */
    public static final class C38273a extends AbstractC20728e {

        /* renamed from: a */
        final /* synthetic */ AdPlayFunWidget f90465a;

        /* renamed from: b */
        final /* synthetic */ ActivityC0945e f90466b;

        static {
            Covode.recordClassIndex(45760);
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
        /* renamed from: a */
        public final void mo34165a(Bitmap bitmap) {
            C38293a.m77669a(this.f90465a.f92081o, true, (String) null);
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
        /* renamed from: a */
        public final void mo34166a(Throwable th) {
            String str;
            Aweme aweme = this.f90465a.f92081o;
            if (th != null) {
                str = th.getMessage();
            } else {
                str = null;
            }
            C38293a.m77669a(aweme, false, str);
        }

        C38273a(AdPlayFunWidget adPlayFunWidget, ActivityC0945e eVar) {
            this.f90465a = adPlayFunWidget;
            this.f90466b = eVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.playfun.AbsAdPlayFunWidget
    /* renamed from: a */
    public final void mo66851a(boolean z) {
        float f;
        AdPlayFunView adPlayFunView = this.f90464a;
        if (adPlayFunView != null) {
            if (z) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            adPlayFunView.setAlpha(f);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget
    /* renamed from: a */
    public final void mo59240a(C39039a aVar) {
        ActivityC0945e activity;
        AwemeRawAd awemeRawAd;
        MethodCollector.m26663i(6437);
        C89219l.m154721d(aVar, "");
        super.mo59240a(aVar);
        Aweme aweme = this.f92081o;
        if (!C33278a.m68228d(this.f92081o)) {
            AdPlayFunView adPlayFunView = this.f90464a;
            if (adPlayFunView != null) {
                adPlayFunView.setVisibility(8);
                adPlayFunView.mo66855a((Aweme) null);
                MethodCollector.m26664o(6437);
                return;
            }
            MethodCollector.m26664o(6437);
            return;
        }
        if (this.f90464a == null) {
            View view = this.f80272d;
            if (view != null) {
                View inflate = ((ViewStub) view).inflate();
                if (inflate != null) {
                    this.f90464a = (AdPlayFunView) inflate;
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.playfun.AdPlayFunView");
                    MethodCollector.m26664o(6437);
                    throw nullPointerException;
                }
            } else {
                NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.view.ViewStub");
                MethodCollector.m26664o(6437);
                throw nullPointerException2;
            }
        }
        AdPlayFunView adPlayFunView2 = this.f90464a;
        if (adPlayFunView2 != null) {
            if (aweme == null) {
                C89219l.m154715b();
            }
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (awemeRawAd2 == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(awemeRawAd2, "");
            UrlModel imageInfo = awemeRawAd2.getPlayFunModel().getImageInfo();
            Fragment fragment = this.f92082p;
            if (!(fragment == null || (activity = fragment.getActivity()) == null)) {
                C89219l.m154716b(activity, "");
                if (imageInfo != null) {
                    Aweme aweme2 = this.f92081o;
                    if (!(C38293a.m77672a() || aweme2 == null || (awemeRawAd = aweme2.getAwemeRawAd()) == null)) {
                        C38177d.f90185a.mo66478a(new C38176c("playfun", "preload_start", -1, System.currentTimeMillis()).mo66471a(aweme2.getAid()).mo66473b(awemeRawAd.getCreativeIdStr()).mo66474c(awemeRawAd.getLogExtra()));
                    }
                    C20766v a = C20761r.m39060a(C34735v.m70965a(imageInfo));
                    a.f49105b = activity;
                    a.mo34182a(new C38273a(this, activity));
                }
            }
            adPlayFunView2.mo66855a(aweme);
            DataCenter dataCenter = this.f80273e;
            adPlayFunView2.f90447d = dataCenter;
            C38298e eVar = adPlayFunView2.f90446c;
            if (eVar == null) {
                C89219l.m154710a("stateContext");
            }
            eVar.f90518h = dataCenter;
            adPlayFunView2.setVisibility(8);
            MethodCollector.m26664o(6437);
            return;
        }
        MethodCollector.m26664o(6437);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget
    /* renamed from: a */
    public final void mo59239a(C33942b bVar) {
        String str;
        AdPlayFunView adPlayFunView;
        AdPlayFunView adPlayFunView2;
        AdPlayFunView adPlayFunView3;
        AdPlayFunView adPlayFunView4;
        AdPlayFunView adPlayFunView5;
        AdPlayFunView adPlayFunView6;
        super.onChanged(bVar);
        if (bVar != null && (str = bVar.f80277a) != null) {
            switch (str.hashCode()) {
                case -2057127075:
                    if (str.equals("ad_video_on_pause_play") && C33278a.m68228d(this.f92081o) && (adPlayFunView = this.f90464a) != null) {
                        adPlayFunView.f90451h = true;
                        C38298e eVar = adPlayFunView.f90446c;
                        if (eVar == null) {
                            C89219l.m154710a("stateContext");
                        }
                        AbstractC38297d dVar = eVar.f90523m.get(eVar.f90512b);
                        if (dVar != null) {
                            dVar.mo66871b();
                            return;
                        }
                        return;
                    }
                    return;
                case -1929582278:
                    if (str.equals("ad_video_on_render_ready") && C33278a.m68228d(this.f92081o) && (adPlayFunView2 = this.f90464a) != null) {
                        adPlayFunView2.f90451h = false;
                        return;
                    }
                    return;
                case -1540531799:
                    if (str.equals("ad_feed_on_page_unselected")) {
                        AdPlayFunView adPlayFunView7 = this.f90464a;
                        if (adPlayFunView7 != null) {
                            adPlayFunView7.f90448e = false;
                            C38298e eVar2 = adPlayFunView7.f90446c;
                            if (eVar2 == null) {
                                C89219l.m154710a("stateContext");
                            }
                            eVar2.mo66889a();
                            SmartImageView smartImageView = adPlayFunView7.f90444a;
                            if (smartImageView == null) {
                                C89219l.m154710a("eggImageView");
                            }
                            smartImageView.setImageDisplayListener(null);
                        }
                        AdPlayFunView adPlayFunView8 = this.f90464a;
                        if (adPlayFunView8 != null) {
                            adPlayFunView8.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    return;
                case -1304146782:
                    if (str.equals("ad_feed_bind_texture_size") && (adPlayFunView3 = this.f90464a) != null) {
                        Object a = bVar.mo60212a();
                        C89219l.m154716b(a, "");
                        C38229ao aoVar = (C38229ao) a;
                        C89219l.m154721d(aoVar, "");
                        C38298e eVar3 = adPlayFunView3.f90446c;
                        if (eVar3 == null) {
                            C89219l.m154710a("stateContext");
                        }
                        C89219l.m154721d(aoVar, "");
                        eVar3.f90521k = aoVar;
                        return;
                    }
                    return;
                case -1132409520:
                    if (str.equals("ad_feed_on_page_selected") && (adPlayFunView4 = this.f90464a) != null) {
                        adPlayFunView4.f90448e = true;
                        return;
                    }
                    return;
                case -480868024:
                    if (str.equals("on_ad_pop_up_web_page_show") && (adPlayFunView5 = this.f90464a) != null) {
                        adPlayFunView5.mo66856b();
                        return;
                    }
                    return;
                case 2040441990:
                    if (str.equals("ad_video_on_resume_play") && C33278a.m68228d(this.f92081o) && (adPlayFunView6 = this.f90464a) != null) {
                        adPlayFunView6.f90451h = false;
                        C38298e eVar4 = adPlayFunView6.f90446c;
                        if (eVar4 == null) {
                            C89219l.m154710a("stateContext");
                        }
                        AbstractC38297d dVar2 = eVar4.f90523m.get(eVar4.f90512b);
                        if (dVar2 != null) {
                            dVar2.mo66872c();
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
