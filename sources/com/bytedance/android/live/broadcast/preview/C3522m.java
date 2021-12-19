package com.bytedance.android.live.broadcast.preview;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.android.live.broadcast.C3010ab;
import com.bytedance.android.live.broadcast.C3184c;
import com.bytedance.android.live.broadcast.C3218d;
import com.bytedance.android.live.broadcast.model.C3260f;
import com.bytedance.android.live.broadcast.p188b.C3076d;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6956d;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6963e;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveIsEeaRegionSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveReplayFaqSetting;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.android.live.broadcast.preview.m */
public final class C3522m {

    /* renamed from: a */
    public boolean f9812a;

    /* renamed from: b */
    C3076d f9813b;

    /* renamed from: c */
    public boolean f9814c;

    /* renamed from: d */
    boolean f9815d;

    /* renamed from: e */
    public final Context f9816e;

    /* renamed from: f */
    public final View f9817f;

    /* renamed from: g */
    final DataChannel f9818g;

    static {
        Covode.recordClassIndex(4006);
    }

    /* renamed from: a */
    public final void mo8808a() {
        if (this.f9814c) {
            C11279p.m20006a(this.f9817f);
        }
        this.f9812a = true;
    }

    /* renamed from: b */
    public final void mo8809b() {
        if (this.f9814c) {
            C11279p.m20017b(this.f9817f);
        }
        this.f9812a = false;
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.m$b */
    public static final class C3525b extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ C3522m f9821a;

        /* renamed from: b */
        final /* synthetic */ String f9822b;

        /* renamed from: c */
        final /* synthetic */ String f9823c;

        static {
            Covode.recordClassIndex(4009);
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            String value = LiveReplayFaqSetting.INSTANCE.getValue();
            if (C13627m.m24498a(value)) {
                if (((IHostApp) C6193a.m13435a(IHostApp.class)).isInMusicallyRegion()) {
                    value = "https://webcast-va.tiktokv.com/falcon/webcast_mt/page/faq/index.html";
                } else {
                    value = "https://webcast.tiktokv.com/falcon/webcast_mt/page/faq/index.html";
                }
                C89219l.m154716b(value, "");
            }
            AbstractC6956d webViewManager = ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).webViewManager();
            Context context = this.f9821a.f9816e;
            AbstractC6956d.C6957a b = AbstractC6963e.m14872b(value);
            b.f17379c = true;
            webViewManager.mo13248a(context, b);
            C6501b.C6502a.m13948a("livesdk_faq_enter_click").mo12651a("event_page", "livetake_page").mo12655b();
        }

        C3525b(C3522m mVar, String str, String str2) {
            this.f9821a = mVar;
            this.f9822b = str;
            this.f9823c = str2;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.m$a */
    static final class C3524a extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C3522m f9820a;

        static {
            Covode.recordClassIndex(4008);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3524a(C3522m mVar) {
            super(1);
            this.f9820a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C6805b<Boolean> bVar = AbstractC6804a.f16968bQ;
            C89219l.m154716b(bVar, "");
            C6806c.m14603a(bVar, Boolean.valueOf(booleanValue));
            this.f9820a.f9817f.setVisibility(8);
            this.f9820a.f9814c = false;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.m$c */
    static final class View$OnClickListenerC3526c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C3522m f9824a;

        static {
            Covode.recordClassIndex(4010);
        }

        View$OnClickListenerC3526c(C3522m mVar) {
            this.f9824a = mVar;
        }

        public final void onClick(View view) {
            ActivityC0945e a;
            AbstractC0952i supportFragmentManager;
            C3076d dVar;
            C3522m mVar = this.f9824a;
            if (LiveIsEeaRegionSetting.INSTANCE.getValue()) {
                C3524a aVar = new C3524a(mVar);
                C89219l.m154721d(aVar, "");
                if (C3076d.f8936c == null) {
                    C3076d.f8936c = new C3076d((byte) 0);
                }
                C3076d dVar2 = C3076d.f8936c;
                if (dVar2 != null) {
                    dVar2.f8938a = aVar;
                }
                mVar.f9813b = C3076d.f8936c;
                Context context = mVar.f9816e;
                if (context != null && (a = C11279p.m20001a(context)) != null && (supportFragmentManager = a.getSupportFragmentManager()) != null && (dVar = mVar.f9813b) != null) {
                    String str = C3076d.f8935b;
                    C89219l.m154716b(str, "");
                    dVar.show(supportFragmentManager, str);
                    return;
                }
                return;
            }
            mVar.f9817f.setVisibility(8);
            mVar.f9814c = false;
        }
    }

    public C3522m(Context context, View view, DataChannel dataChannel) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(dataChannel, "");
        this.f9816e = context;
        this.f9817f = view;
        this.f9818g = dataChannel;
        dataChannel.mo28310a(C3184c.class, (AbstractC89172b) new AbstractC89172b<C3260f, C89391z>(this) {
            /* class com.bytedance.android.live.broadcast.preview.C3522m.C35231 */

            /* renamed from: a */
            final /* synthetic */ C3522m f9819a;

            static {
                Covode.recordClassIndex(4007);
            }

            {
                this.f9819a = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C3260f fVar) {
                String a;
                C3260f fVar2 = fVar;
                C89219l.m154721d(fVar2, "");
                C3522m mVar = this.f9819a;
                if (fVar2 != null && fVar2.f9330e == 1 && mVar.f9818g.mo28318b(C3010ab.class) == null && !mVar.f9812a) {
                    mVar.f9818g.mo28315b(C3218d.class, (Object) true);
                    mVar.f9815d = true;
                    if (!mVar.f9814c) {
                        C6805b<Boolean> bVar = AbstractC6804a.f16968bQ;
                        C89219l.m154716b(bVar, "");
                        Boolean a2 = bVar.mo13066a();
                        C89219l.m154716b(a2, "");
                        if (a2.booleanValue()) {
                            mVar.f9817f.setVisibility(0);
                            ((ImageView) mVar.f9817f.findViewById(R.id.cvg)).setOnClickListener(new View$OnClickListenerC3526c(mVar));
                            String str = C3966y.m9657a((int) R.string.e4z) + ">";
                            String a3 = C3966y.m9657a((int) R.string.ek8);
                            if (LiveIsEeaRegionSetting.INSTANCE.getValue()) {
                                a = C3966y.m9657a((int) R.string.ej4);
                            } else {
                                a = C3966y.m9660a((int) R.string.ej3, a3);
                            }
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a + ' ' + str);
                            spannableStringBuilder.setSpan(new C3525b(mVar, a, a3), a.length() + 1, spannableStringBuilder.length(), 33);
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(-1), a.length(), spannableStringBuilder.length(), 33);
                            if (!LiveIsEeaRegionSetting.INSTANCE.getValue()) {
                                C89219l.m154716b(a, "");
                                C89219l.m154716b(a3, "");
                                int a4 = C89361p.m154888a((CharSequence) a, a3, 0, false, 6);
                                spannableStringBuilder.setSpan(new ForegroundColorSpan(-1), a4, a3.length() + a4, 33);
                            }
                            TextView textView = (TextView) mVar.f9817f.findViewById(R.id.cvk);
                            textView.setText(spannableStringBuilder);
                            textView.setLinksClickable(true);
                            textView.setMovementMethod(LinkMovementMethod.getInstance());
                            if (!LiveIsEeaRegionSetting.INSTANCE.getValue()) {
                                C6805b<Boolean> bVar2 = AbstractC6804a.f16968bQ;
                                C89219l.m154716b(bVar2, "");
                                C6806c.m14603a((C6800c) bVar2, (Object) false);
                            }
                            mVar.f9814c = true;
                            C3868c.m9491a("ttlive_live_replay_faq_show_all", 0, new HashMap());
                        }
                    }
                }
                return C89391z.f203057a;
            }
        });
    }
}
