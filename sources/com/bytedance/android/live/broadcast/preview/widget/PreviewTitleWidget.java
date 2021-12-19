package com.bytedance.android.live.broadcast.preview.widget;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.View;
import androidx.core.graphics.drawable.C0705a;
import androidx.core.p035f.C0680f;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.broadcast.C3011ac;
import com.bytedance.android.live.broadcast.C3012ad;
import com.bytedance.android.live.broadcast.C3802x;
import com.bytedance.android.live.broadcast.model.C3272o;
import com.bytedance.android.live.broadcast.utils.C3723e;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.C4031a;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.uikit.p411c.C6229a;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6956d;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6963e;
import com.bytedance.android.livesdk.livesetting.other.LiveEventDetailSetting;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p561j.C9094df;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11278o;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.depend.model.live.C11729j;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.p700m.C11831d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

public final class PreviewTitleWidget extends LiveWidget implements AbstractC33974au {

    /* renamed from: d */
    public static final C3639a f10052d = new C3639a((byte) 0);

    /* renamed from: a */
    public LiveEditText f10053a;

    /* renamed from: b */
    public final TextWatcher f10054b = new C3640b(this);

    /* renamed from: c */
    final Long f10055c;

    /* renamed from: e */
    private final AbstractC89244h f10056e = C11831d.m20835a(new C3641c(this));

    static {
        Covode.recordClassIndex(4149);
    }

    /* renamed from: a */
    public final ImageSpan mo8926a() {
        return (ImageSpan) this.f10056e.getValue();
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bgn;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewTitleWidget$a */
    public static final class C3639a {
        static {
            Covode.recordClassIndex(4150);
        }

        private C3639a() {
        }

        public /* synthetic */ C3639a(byte b) {
            this();
        }
    }

    /* renamed from: b */
    public static boolean m9087b() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        View view = getView();
        if (!(view instanceof LiveEditText)) {
            view = null;
        }
        LiveEditText liveEditText = (LiveEditText) view;
        if (liveEditText != null) {
            this.f10053a = liveEditText;
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.mo28309a((AbstractC1204m) this, C3011ac.class, (AbstractC89172b) new C3642d(this));
            }
            DataChannel dataChannel2 = this.dataChannel;
            if (dataChannel2 != null) {
                dataChannel2.mo28313b((AbstractC1204m) this, C9094df.class, (AbstractC89172b) new C3643e(this));
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewTitleWidget$c */
    static final class C3641c extends AbstractC89220m implements AbstractC89171a<ImageSpan> {

        /* renamed from: a */
        final /* synthetic */ PreviewTitleWidget f10058a;

        static {
            Covode.recordClassIndex(4152);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3641c(PreviewTitleWidget previewTitleWidget) {
            super(0);
            this.f10058a = previewTitleWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ImageSpan invoke() {
            int i;
            int i2;
            PreviewTitleWidget previewTitleWidget = this.f10058a;
            boolean a = C6229a.m13521a(previewTitleWidget.context);
            DataChannel dataChannel = previewTitleWidget.dataChannel;
            C89219l.m154716b(dataChannel, "");
            boolean a2 = C3723e.m9234a(dataChannel);
            if (a2) {
                i = 2131234360;
            } else {
                i = 2131234892;
            }
            Drawable c = C3966y.m9665c(i);
            BitmapDrawable bitmapDrawable = null;
            if (c == null) {
                return null;
            }
            if (a2) {
                if (a) {
                    C0705a.m2503b(c, 1);
                    C0705a.m2500a(c, true);
                }
                c.setBounds(0, 0, C3966y.m9653a(12.0f), C3966y.m9653a(13.0f));
            } else {
                c.setBounds(0, 0, C3966y.m9653a(20.0f), C3966y.m9653a(16.0f));
            }
            if (c instanceof BitmapDrawable) {
                bitmapDrawable = c;
            }
            BitmapDrawable bitmapDrawable2 = bitmapDrawable;
            if (bitmapDrawable2 != null) {
                if (a) {
                    i2 = 3;
                } else {
                    i2 = 5;
                }
                bitmapDrawable2.setGravity(i2);
            }
            return new ImageSpan(c, 1);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewTitleWidget$b */
    public static final class C3640b implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ PreviewTitleWidget f10057a;

        static {
            Covode.recordClassIndex(4151);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C89219l.m154721d(charSequence, "");
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C89219l.m154721d(charSequence, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C3640b(PreviewTitleWidget previewTitleWidget) {
            this.f10057a = previewTitleWidget;
        }

        public final void afterTextChanged(Editable editable) {
            String str;
            C89219l.m154721d(editable, "");
            PreviewTitleWidget previewTitleWidget = this.f10057a;
            LiveEditText liveEditText = previewTitleWidget.f10053a;
            if (liveEditText == null) {
                C89219l.m154710a("mTitleView");
            }
            Editable text = liveEditText.getText();
            if (text == null || (str = text.toString()) == null) {
                str = "";
            }
            if (TextUtils.getTrimmedLength(str) > 32) {
                LiveEditText liveEditText2 = previewTitleWidget.f10053a;
                if (liveEditText2 == null) {
                    C89219l.m154710a("mTitleView");
                }
                liveEditText2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(str.length())});
                String a = C3966y.m9660a((int) R.string.gll, 32);
                C89219l.m154716b(a, "");
                C11279p.m20010a(a);
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                String substring = str.substring(0, 32);
                C89219l.m154716b(substring, "");
                previewTitleWidget.mo8927a(substring);
                LiveEditText liveEditText3 = previewTitleWidget.f10053a;
                if (liveEditText3 == null) {
                    C89219l.m154710a("mTitleView");
                }
                liveEditText3.setSelection(substring.length());
            } else {
                LiveEditText liveEditText4 = previewTitleWidget.f10053a;
                if (liveEditText4 == null) {
                    C89219l.m154710a("mTitleView");
                }
                liveEditText4.setFilters(new InputFilter[0]);
            }
            DataChannel dataChannel = this.f10057a.dataChannel;
            if (dataChannel != null) {
                dataChannel.mo28315b(C3012ad.class, C89361p.m154913b(String.valueOf(PreviewTitleWidget.m9086a(this.f10057a).getText()), (CharSequence) " "));
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ LiveEditText m9086a(PreviewTitleWidget previewTitleWidget) {
        LiveEditText liveEditText = previewTitleWidget.f10053a;
        if (liveEditText == null) {
            C89219l.m154710a("mTitleView");
        }
        return liveEditText;
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewTitleWidget$d */
    static final class C3642d extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PreviewTitleWidget f10059a;

        static {
            Covode.recordClassIndex(4153);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3642d(PreviewTitleWidget previewTitleWidget) {
            super(1);
            this.f10059a = previewTitleWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            C89219l.m154721d(zVar, "");
            PreviewTitleWidget previewTitleWidget = this.f10059a;
            if (previewTitleWidget.f10053a != null) {
                Context context = previewTitleWidget.context;
                LiveEditText liveEditText = previewTitleWidget.f10053a;
                if (liveEditText == null) {
                    C89219l.m154710a("mTitleView");
                }
                C11278o.m19996b(context, liveEditText);
            }
            return C89391z.f203057a;
        }
    }

    public PreviewTitleWidget(Long l) {
        this.f10055c = l;
    }

    /* renamed from: a */
    public final void mo8927a(String str) {
        if (str != null && str.length() != 0) {
            LiveEditText liveEditText = this.f10053a;
            if (liveEditText == null) {
                C89219l.m154710a("mTitleView");
            }
            if (liveEditText.isFocused()) {
                LiveEditText liveEditText2 = this.f10053a;
                if (liveEditText2 == null) {
                    C89219l.m154710a("mTitleView");
                }
                if (!TextUtils.isEmpty(String.valueOf(liveEditText2.getText()))) {
                    LiveEditText liveEditText3 = this.f10053a;
                    if (liveEditText3 == null) {
                        C89219l.m154710a("mTitleView");
                    }
                    liveEditText3.setText(str);
                    return;
                }
            }
            SpannableString spannableString = new SpannableString(str + ' ');
            spannableString.setSpan(mo8926a(), str.length(), str.length() + 1, 17);
            LiveEditText liveEditText4 = this.f10053a;
            if (liveEditText4 == null) {
                C89219l.m154710a("mTitleView");
            }
            liveEditText4.setText(spannableString);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewTitleWidget$e */
    static final class C3643e extends AbstractC89220m implements AbstractC89172b<C3272o, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PreviewTitleWidget f10060a;

        static {
            Covode.recordClassIndex(4154);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3643e(PreviewTitleWidget previewTitleWidget) {
            super(1);
            this.f10060a = previewTitleWidget;
        }

        /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewTitleWidget$e$a */
        static final class View$OnClickListenerC3644a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C3643e f10061a;

            /* renamed from: b */
            final /* synthetic */ C3272o f10062b;

            static {
                Covode.recordClassIndex(4155);
            }

            View$OnClickListenerC3644a(C3643e eVar, C3272o oVar) {
                this.f10061a = eVar;
                this.f10062b = oVar;
            }

            public final void onClick(View view) {
                long j;
                AbstractC6956d webViewManager;
                C4031a a;
                ActivityC0945e a2;
                PreviewTitleWidget previewTitleWidget = this.f10061a.f10060a;
                long j2 = this.f10062b.f9381p.f9339a;
                if (previewTitleWidget.context != null) {
                    if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
                        C58029j.f132253e = PreviewTitleWidget.m9087b();
                    }
                    if (!C58029j.f132253e) {
                        C11226ao.m19882a(C3966y.m9669e(), (int) R.string.edd);
                        return;
                    }
                    String value = LiveEventDetailSetting.INSTANCE.getValue();
                    if (value != null && value.length() > 0) {
                        Integer num = null;
                        if (1 != 0) {
                            Uri.Builder buildUpon = Uri.parse(value).buildUpon();
                            double b = (double) C3966y.m9662b();
                            Double.isNaN(b);
                            Uri.Builder appendQueryParameter = buildUpon.appendQueryParameter("height", String.valueOf(b * 0.7d)).appendQueryParameter("event_id", String.valueOf(j2));
                            Long l = previewTitleWidget.f10055c;
                            if (l != null) {
                                j = l.longValue();
                            } else {
                                j = 0;
                            }
                            Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("user_id", String.valueOf(j));
                            IHostContext iHostContext = (IHostContext) C6193a.m13435a(IHostContext.class);
                            if (iHostContext != null) {
                                num = Integer.valueOf(iHostContext.appId());
                            }
                            AbstractC6956d.C6958b a3 = AbstractC6963e.m14871a(appendQueryParameter2.appendQueryParameter("aid", String.valueOf(num)).appendQueryParameter("live_event_enter_from", "live_preview_page").build().toString()).mo13259a(8, 8, 0, 0);
                            a3.f17407k = -1;
                            a3.f17415s = true;
                            a3.f17416t = true;
                            double b2 = (double) C3966y.m9662b();
                            Double.isNaN(b2);
                            a3.f17399c = (int) C3966y.m9668e((int) (b2 * 0.7d));
                            a3.f17398b = (int) C3966y.m9668e(C3966y.m9664c());
                            a3.f17406j = 80;
                            AbstractC2928f fVar = (AbstractC2928f) C6193a.m13435a(AbstractC2928f.class);
                            if (fVar != null && (webViewManager = fVar.webViewManager()) != null && (a = webViewManager.mo13245a(a3)) != null && (a2 = C11279p.m20001a(previewTitleWidget.context)) != null) {
                                C4031a.m9839a(a2, a);
                            }
                        }
                    }
                }
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C3272o oVar) {
            boolean z;
            Context context;
            C3272o oVar2 = oVar;
            C89219l.m154721d(oVar2, "");
            LiveEditText a = PreviewTitleWidget.m9086a(this.f10060a);
            C89219l.m154721d(oVar2, "");
            String str = oVar2.f9381p.f9340b;
            C89219l.m154716b(str, "");
            if (str.length() <= 0 || oVar2.f9381p.f9339a <= 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                a.setClickable(false);
                a.setFocusable(false);
                a.setFocusableInTouchMode(false);
                String str2 = oVar2.f9381p.f9340b;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                View view = this.f10060a.getView();
                if (view != null) {
                    context = view.getContext();
                } else {
                    context = null;
                }
                if (C6229a.m13521a(context)) {
                    if (C0680f.f2738d.mo2717a(str2, str2.length())) {
                        spannableStringBuilder.append((CharSequence) str2).append((char) 8202).append((CharSequence) " ").append((char) 8204);
                        spannableStringBuilder.setSpan(this.f10060a.mo8926a(), str2.length() + 1, str2.length() + 2, 17);
                    } else {
                        spannableStringBuilder.append((char) 8202).append((CharSequence) " ").append((char) 8204).append((CharSequence) str2);
                        spannableStringBuilder.setSpan(this.f10060a.mo8926a(), 1, 2, 17);
                    }
                } else if (C0680f.f2737c.mo2717a(str2, str2.length())) {
                    spannableStringBuilder.append((char) 8202).append((CharSequence) " ").append((char) 8204).append((CharSequence) str2);
                    spannableStringBuilder.setSpan(this.f10060a.mo8926a(), 1, 2, 17);
                } else {
                    spannableStringBuilder.append((CharSequence) str2).append((char) 8202).append((CharSequence) " ").append((char) 8204);
                    spannableStringBuilder.setSpan(this.f10060a.mo8926a(), str2.length() + 1, str2.length() + 2, 17);
                }
                a.setText(spannableStringBuilder);
                a.setOnClickListener(new View$OnClickListenerC3644a(this, oVar2));
                DataChannel dataChannel = this.f10060a.dataChannel;
                if (dataChannel != null) {
                    C89219l.m154716b(str2, "");
                    dataChannel.mo28315b(C3012ad.class, str2);
                }
            } else {
                int i = Build.VERSION.SDK_INT;
                a.setTextDirection(2);
                a.addTextChangedListener(this.f10060a.f10054b);
                a.setOnFocusChangeListener(new View$OnFocusChangeListenerC3645b(a, this, oVar2));
                PreviewTitleWidget previewTitleWidget = this.f10060a;
                LiveEditText liveEditText = previewTitleWidget.f10053a;
                if (liveEditText == null) {
                    C89219l.m154710a("mTitleView");
                }
                liveEditText.setHint(R.string.dto);
                LiveEditText liveEditText2 = previewTitleWidget.f10053a;
                if (liveEditText2 == null) {
                    C89219l.m154710a("mTitleView");
                }
                CharSequence hint = liveEditText2.getHint();
                if (hint != null) {
                    SpannableString spannableString = new SpannableString(new StringBuilder().append(hint).append(' ').toString());
                    spannableString.setSpan(previewTitleWidget.mo8926a(), hint.length(), hint.length() + 1, 17);
                    LiveEditText liveEditText3 = previewTitleWidget.f10053a;
                    if (liveEditText3 == null) {
                        C89219l.m154710a("mTitleView");
                    }
                    liveEditText3.setHint(spannableString);
                }
                this.f10060a.mo8927a(oVar2.f9369d);
            }
            return C89391z.f203057a;
        }

        /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewTitleWidget$e$b */
        static final class View$OnFocusChangeListenerC3645b implements View.OnFocusChangeListener {

            /* renamed from: a */
            final /* synthetic */ LiveEditText f10063a;

            /* renamed from: b */
            final /* synthetic */ C3643e f10064b;

            /* renamed from: c */
            final /* synthetic */ C3272o f10065c;

            static {
                Covode.recordClassIndex(4156);
            }

            View$OnFocusChangeListenerC3645b(LiveEditText liveEditText, C3643e eVar, C3272o oVar) {
                this.f10063a = liveEditText;
                this.f10064b = eVar;
                this.f10065c = oVar;
            }

            public final void onFocusChange(View view, boolean z) {
                EnumC11728i iVar;
                String obj;
                if (z) {
                    PreviewTitleWidget previewTitleWidget = this.f10064b.f10060a;
                    C6501b a = C6501b.C6502a.m13948a("livesdk_title_click").mo12643a(previewTitleWidget.dataChannel);
                    DataChannel dataChannel = previewTitleWidget.dataChannel;
                    if (dataChannel == null || (iVar = (EnumC11728i) dataChannel.mo28318b(C3802x.class)) == null) {
                        iVar = EnumC11728i.VIDEO;
                    }
                    a.mo12651a("live_type", C11729j.m20684a(iVar)).mo12655b();
                    PreviewTitleWidget previewTitleWidget2 = this.f10064b.f10060a;
                    LiveEditText liveEditText = previewTitleWidget2.f10053a;
                    if (liveEditText == null) {
                        C89219l.m154710a("mTitleView");
                    }
                    Editable text = liveEditText.getText();
                    if (text != null && (obj = text.toString()) != null && obj.length() > 0) {
                        LiveEditText liveEditText2 = previewTitleWidget2.f10053a;
                        if (liveEditText2 == null) {
                            C89219l.m154710a("mTitleView");
                        }
                        Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                        String substring = obj.substring(0, obj.length() - 1);
                        C89219l.m154716b(substring, "");
                        liveEditText2.setText(substring);
                        return;
                    }
                    return;
                }
                this.f10064b.f10060a.mo8927a(String.valueOf(this.f10063a.getText()));
            }
        }
    }
}
