package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.app.Activity;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.lifecycle.AbstractC1214u;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.C16041a;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.commercialize.C38000g;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.experiment.C46759bu;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.C49559p;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.RunnableC49561r;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50539g;
import com.p2082ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.mix.MixHelperService;
import com.p2082ss.android.ugc.trill.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.bq */
public final class C50142bq extends AbstractC49544a {

    /* renamed from: a */
    public ViewGroup f115734a;

    /* renamed from: b */
    public boolean f115735b = false;

    /* renamed from: c */
    private boolean f115736c = false;

    static {
        Covode.recordClassIndex(59268);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo80928a() {
    }

    /* renamed from: b */
    public static SimpleDateFormat m94094b() {
        boolean z;
        try {
            z = C52912c.f121688a.f121689b.getAntiAddictionToastEnable24hourTime().booleanValue();
        } catch (C16041a unused) {
            z = false;
        }
        if (z) {
            return new SimpleDateFormat("HH:mm", Locale.ENGLISH);
        }
        return new SimpleDateFormat("hh:mm aa", Locale.ENGLISH);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo81273a(VideoItemParams videoItemParams) {
        super.mo81273a(videoItemParams);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final boolean mo80933a(C33942b bVar) {
        return C50539g.m94742a(bVar, new C50149bs(this));
    }

    public C50142bq(View view) {
        super(view, ((Boolean) C46759bu.f108955a.getValue()).booleanValue());
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo80929a(View view) {
        this.f113961T = C1870c.m6045a((Activity) this.f113959R, (int) R.layout.rr);
        ViewGroup viewGroup = (ViewGroup) this.f113961T.findViewById(R.id.h7);
        this.f115734a = viewGroup;
        viewGroup.setOnClickListener(View$OnClickListenerC50148br.f115745a);
    }

    /* renamed from: c */
    public final boolean mo85281c(Map<String, Object> map) {
        map.get("event_type_state");
        map.get("aweme_state");
        if (FeedParamProvider.C49809a.m93270a(this.f113959R).isHotSpot()) {
            return false;
        }
        MixHelperService.m109027a();
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo80931a(DataCenter dataCenter) {
        dataCenter.mo60189a("on_page_selected", (AbstractC1214u<C33942b>) this.f113951J).mo60189a("on_render_ready", (AbstractC1214u<C33942b>) this.f113951J).mo60189a("already_hide_mix_enter", (AbstractC1214u<C33942b>) this.f113951J);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: c */
    public final void mo80938c(C33942b bVar) {
        if (bVar != null && !this.f115736c) {
            String str = bVar.f80277a;
            str.hashCode();
            if (!str.equals("already_hide_mix_enter")) {
                if (str.equals("on_render_ready")) {
                    if (!this.f115735b) {
                        final HashMap hashMap = new HashMap();
                        hashMap.put("aweme_state", this.f113953L);
                        hashMap.put("event_type_state", this.f113954M);
                        C49559p.f113984a.mo81305a(new RunnableC49561r(false, new Runnable() {
                            /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.C50142bq.RunnableC501473 */

                            static {
                                Covode.recordClassIndex(59273);
                            }

                            public final void run() {
                                if (C34729o.m70957a(C50142bq.this.f115734a)) {
                                    C50142bq.this.mo85281c(hashMap);
                                    C50142bq bqVar = C50142bq.this;
                                    Map map = hashMap;
                                    if (C34729o.m70957a(bqVar.f115734a)) {
                                        Handler handler = new Handler();
                                        handler.postDelayed(new Runnable() {
                                            /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.C50142bq.RunnableC501431 */

                                            static {
                                                Covode.recordClassIndex(59269);
                                            }

                                            public final void run() {
                                                if (C50142bq.this.f115734a != null) {
                                                    TextView textView = (TextView) C50142bq.this.f115734a.findViewById(R.id.es3);
                                                    String charSequence = textView.getText().toString();
                                                    if (!TextUtils.isEmpty(charSequence)) {
                                                        textView.setText(C1764a.m5928a(C50142bq.this.f113959R.getResources().getString(R.string.rb), new Object[]{C50142bq.m94094b().format(new Date(System.currentTimeMillis())), charSequence}));
                                                        C38000g.m77053d().mo67203a(C50142bq.this.f115734a, 0, 360, true);
                                                        C49559p.f113984a.mo81305a(new RunnableC49561r(C50142bq.this.f113950I, new Runnable() {
                                                            /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.C50142bq.RunnableC501431.RunnableC501441 */

                                                            static {
                                                                Covode.recordClassIndex(59270);
                                                            }

                                                            public final void run() {
                                                                if (C34729o.m70957a(C50142bq.this.f115734a)) {
                                                                    C50142bq.this.f115735b = true;
                                                                }
                                                            }
                                                        }));
                                                        C39223a.m79588b().mo68595c();
                                                    }
                                                }
                                            }
                                        }, 100);
                                        handler.postDelayed(new Runnable(handler, map) {
                                            /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.C50142bq.RunnableC501452 */

                                            /* renamed from: a */
                                            final /* synthetic */ Handler f115739a;

                                            /* renamed from: b */
                                            final /* synthetic */ Map f115740b;

                                            static {
                                                Covode.recordClassIndex(59271);
                                            }

                                            public final void run() {
                                                if (C50142bq.this.f115734a != null) {
                                                    C38000g.m77053d().mo67203a(C50142bq.this.f115734a, -C50142bq.this.f115734a.getHeight(), 360, false);
                                                    this.f115739a.postDelayed(new Runnable() {
                                                        /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.C50142bq.RunnableC501452.RunnableC501461 */

                                                        static {
                                                            Covode.recordClassIndex(59272);
                                                        }

                                                        public final void run() {
                                                            C50142bq.this.mo85281c(RunnableC501452.this.f115740b);
                                                        }
                                                    }, 360);
                                                }
                                            }

                                            {
                                                this.f115739a = r2;
                                                this.f115740b = r3;
                                            }
                                        }, 7000);
                                    }
                                }
                            }
                        }));
                    }
                } else {
                    return;
                }
            }
            if (!this.f115735b && !FeedParamProvider.m93269a(this.f113959R).isHotSpot()) {
                MixHelperService.m109027a();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: b */
    public final void mo80935b(C33942b bVar) {
        MethodCollector.m26663i(4666);
        if (!this.f113952K) {
            this.f113952K = true;
            if (this.f113960S instanceof FrameLayout) {
                ((FrameLayout) this.f113960S).addView(this.f113961T);
            }
        }
        if (bVar == null) {
            MethodCollector.m26664o(4666);
            return;
        }
        HashMap hashMap = (HashMap) bVar.mo60212a();
        if (hashMap != null) {
            TextView textView = (TextView) this.f115734a.findViewById(R.id.es3);
            ImageView imageView = (ImageView) this.f115734a.findViewById(R.id.bsd);
            if (((Boolean) hashMap.get("check_pri_state")).booleanValue()) {
                String str = (String) hashMap.get("hint_minite_state");
                if (((Boolean) hashMap.get("check_mt_reieve_state")).booleanValue()) {
                    this.f115734a.setVisibility(0);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f115734a.getLayoutParams();
                    marginLayoutParams.height = (int) C13628n.m24520b(this.f113959R, 32.0f);
                    marginLayoutParams.bottomMargin = 0;
                    this.f115734a.setLayoutParams(marginLayoutParams);
                    textView.setText(C39223a.m79588b().mo68597e());
                    textView.setTextColor(C0643b.m2378c(this.f113959R, R.color.l));
                    imageView.setImageResource(2131231753);
                    MethodCollector.m26664o(4666);
                    return;
                } else if (!TextUtils.isEmpty(str)) {
                    this.f115734a.setVisibility(0);
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f115734a.getLayoutParams();
                    marginLayoutParams2.height = (int) C13628n.m24520b(this.f113959R, 48.0f);
                    marginLayoutParams2.bottomMargin = (int) C13628n.m24520b(this.f113959R, -48.0f);
                    this.f115734a.setLayoutParams(marginLayoutParams2);
                    textView.setTextColor(C0643b.m2378c(this.f113959R, R.color.ac));
                    textView.setText(str);
                    imageView.setImageResource(2131231759);
                    MethodCollector.m26664o(4666);
                    return;
                }
            }
            this.f115734a.setVisibility(8);
            textView.setText("");
        }
        MethodCollector.m26664o(4666);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a6  */
    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b mo81280e(com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b r9) {
        /*
        // Method dump skipped, instructions count: 236
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2970ui.C50142bq.mo81280e(com.ss.android.ugc.aweme.arch.widgets.base.b):com.ss.android.ugc.aweme.arch.widgets.base.b");
    }
}
