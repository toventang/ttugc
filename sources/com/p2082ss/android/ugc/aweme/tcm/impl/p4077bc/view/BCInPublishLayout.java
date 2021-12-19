package com.p2082ss.android.ugc.aweme.tcm.impl.p4077bc.view;

import android.content.Context;
import android.net.Uri;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.content.C0643b;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.discover.model.BrandedContentToolSchema;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63199ax;
import com.p2082ss.android.ugc.aweme.profile.model.TagBAUser;
import com.p2082ss.android.ugc.aweme.tcm.api.p4074b.C77728a;
import com.p2082ss.android.ugc.aweme.tcm.api.p4074b.C77731c;
import com.p2082ss.android.ugc.aweme.tcm.impl.p4079d.C77759b;
import com.p2082ss.android.ugc.aweme.tcm.impl.p4080e.C77763a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.tcm.impl.bc.view.BCInPublishLayout */
public final class BCInPublishLayout extends FrameLayout implements C77728a.AbstractC77729a, C77731c.AbstractC77733b {

    /* renamed from: a */
    AbstractC63199ax.AbstractC63200a f174355a;

    /* renamed from: b */
    public boolean f174356b;

    /* renamed from: c */
    private final boolean f174357c;

    /* renamed from: d */
    private boolean f174358d;

    /* renamed from: e */
    private String f174359e;

    /* renamed from: f */
    private TagBAUser f174360f;

    /* renamed from: g */
    private TagBAUser f174361g;

    /* renamed from: h */
    private String f174362h;

    /* renamed from: i */
    private String f174363i;

    /* renamed from: j */
    private String f174364j;

    /* renamed from: k */
    private HashMap f174365k;

    static {
        Covode.recordClassIndex(90812);
    }

    public BCInPublishLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: a */
    private View m135846a() {
        if (this.f174365k == null) {
            this.f174365k = new HashMap();
        }
        View view = (View) this.f174365k.get(Integer.valueOf((int) R.id.vw));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.vw);
        this.f174365k.put(Integer.valueOf((int) R.id.vw), findViewById);
        return findViewById;
    }

    public final String getBc() {
        return this.f174362h;
    }

    @Override // com.p2082ss.android.ugc.aweme.tcm.api.p4074b.C77728a.AbstractC77729a
    public final String getBcStarAtlasContent() {
        return this.f174359e;
    }

    @Override // com.p2082ss.android.ugc.aweme.tcm.api.p4074b.C77728a.AbstractC77729a
    public final String getBcType() {
        return this.f174364j;
    }

    public final String getBrandedContentType() {
        return this.f174363i;
    }

    public final boolean getHasBrandedContentTool() {
        return this.f174357c;
    }

    public final boolean getMusicUsageOrigin() {
        return this.f174358d;
    }

    public final AbstractC63199ax.AbstractC63200a getPublishExtensionDataContainer() {
        return this.f174355a;
    }

    @Override // com.p2082ss.android.ugc.aweme.tcm.api.p4074b.C77728a.AbstractC77729a
    public final TagBAUser getShouldBeDetag() {
        return this.f174361g;
    }

    @Override // com.p2082ss.android.ugc.aweme.tcm.api.p4074b.C77728a.AbstractC77729a
    public final TagBAUser getTagBA() {
        return this.f174360f;
    }

    @Override // com.p2082ss.android.ugc.aweme.tcm.api.p4074b.C77728a.AbstractC77729a
    public final void setBcStarAtlasContent(String str) {
        this.f174359e = str;
    }

    public final void setCommerceMusic(boolean z) {
        this.f174356b = z;
    }

    public final void setMusicUsageOrigin(boolean z) {
        this.f174358d = z;
    }

    public final void setPublishExtensionDataContainer(AbstractC63199ax.AbstractC63200a aVar) {
        this.f174355a = aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.tcm.api.p4074b.C77728a.AbstractC77729a
    public final void setShouldBeDetag(TagBAUser tagBAUser) {
        this.f174361g = tagBAUser;
    }

    @Override // com.p2082ss.android.ugc.aweme.tcm.api.p4074b.C77728a.AbstractC77729a
    public final void setBcType(String str) {
        C89219l.m154721d(str, "");
        this.f174364j = str;
        setBc(getBcType());
    }

    @Override // com.p2082ss.android.ugc.aweme.tcm.api.p4074b.C77731c.AbstractC77733b
    public final void setBrandedContentType(String str) {
        C89219l.m154721d(str, "");
        this.f174363i = str;
        setBc(getBrandedContentType());
    }

    /* renamed from: com.ss.android.ugc.aweme.tcm.impl.bc.view.BCInPublishLayout$a */
    public static final class C77752a extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ BCInPublishLayout f174366a;

        /* renamed from: b */
        final /* synthetic */ String f174367b;

        static {
            Covode.recordClassIndex(90813);
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
            textPaint.setColor(C0643b.m2378c(this.f174366a.getContext(), R.color.a2));
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            SmartRouter.buildRoute(this.f174366a.getContext(), "aweme://webview/").withParam("url", Uri.parse(this.f174367b).buildUpon().appendQueryParameter("page", "policy").build().toString()).open();
        }

        C77752a(BCInPublishLayout bCInPublishLayout, String str) {
            this.f174366a = bCInPublishLayout;
            this.f174367b = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tcm.impl.bc.view.BCInPublishLayout$b */
    public static final class C77753b extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ BCInPublishLayout f174368a;

        /* renamed from: b */
        final /* synthetic */ String f174369b;

        static {
            Covode.recordClassIndex(90814);
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
            textPaint.setColor(C0643b.m2378c(this.f174368a.getContext(), R.color.a2));
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            if (!TextUtils.isEmpty(this.f174369b)) {
                SmartRouter.buildRoute(this.f174368a.getContext(), "aweme://webview/").withParam("url", Uri.parse(this.f174369b).buildUpon().appendQueryParameter("page", "policy").build().toString()).open();
            }
        }

        C77753b(BCInPublishLayout bCInPublishLayout, String str) {
            this.f174368a = bCInPublishLayout;
            this.f174369b = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tcm.impl.bc.view.BCInPublishLayout$c */
    public static final class C77754c extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ BCInPublishLayout f174370a;

        /* renamed from: b */
        final /* synthetic */ String f174371b;

        static {
            Covode.recordClassIndex(90815);
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
            textPaint.setColor(C0643b.m2378c(this.f174370a.getContext(), R.color.a2));
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            String str;
            C89219l.m154721d(view, "");
            if (this.f174370a.getMusicUsageOrigin()) {
                str = "original";
            } else {
                str = "general";
            }
            if (!TextUtils.isEmpty(this.f174371b)) {
                SmartRouter.buildRoute(this.f174370a.getContext(), "aweme://webview/").withParam("url", Uri.parse(this.f174371b).buildUpon().appendQueryParameter("page", "music").appendQueryParameter("music_type", str).build().toString()).open();
            }
        }

        C77754c(BCInPublishLayout bCInPublishLayout, String str) {
            this.f174370a = bCInPublishLayout;
            this.f174371b = str;
        }
    }

    public final void setBc(String str) {
        C89219l.m154721d(str, "");
        this.f174362h = str;
        if (TextUtils.equals(str, "1") || TextUtils.equals(this.f174362h, "2")) {
            setVisibility(0);
            TuxTextView tuxTextView = (TuxTextView) m135846a();
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setVisibility(0);
            AbstractC63199ax.AbstractC63200a aVar = this.f174355a;
            if (aVar != null) {
                aVar.mo101677a((Boolean) true);
            }
            setBrandedContent(TextUtils.equals(this.f174362h, "2"));
            return;
        }
        AbstractC63199ax.AbstractC63200a aVar2 = this.f174355a;
        if (aVar2 != null) {
            aVar2.mo101677a((Boolean) false);
        }
        AbstractC63199ax.AbstractC63200a aVar3 = this.f174355a;
        if (aVar3 != null) {
            aVar3.mo101680b(false);
        }
        if (m135846a() != null) {
            TuxTextView tuxTextView2 = (TuxTextView) m135846a();
            C89219l.m154716b(tuxTextView2, "");
            tuxTextView2.setVisibility(8);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tcm.api.p4074b.C77728a.AbstractC77729a
    public final void setTagBA(TagBAUser tagBAUser) {
        String str;
        this.f174360f = tagBAUser;
        if (getTagBA() != null) {
            TagBAUser tagBA = getTagBA();
            String str2 = null;
            if (tagBA != null) {
                str = tagBA.getHandleName();
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                TagBAUser tagBA2 = getTagBA();
                if (tagBA2 != null) {
                    str2 = tagBA2.getUid();
                }
                if (!TextUtils.isEmpty(str2)) {
                    setShouldBeDetag(getTagBA());
                    AbstractC63199ax.AbstractC63200a aVar = this.f174355a;
                    if (aVar != null) {
                        aVar.mo101678a(true, false);
                        return;
                    }
                    return;
                }
            }
        }
        AbstractC63199ax.AbstractC63200a aVar2 = this.f174355a;
        if (aVar2 != null) {
            aVar2.mo101678a(false, Boolean.valueOf(true ^ TextUtils.equals(this.f174362h, "0")));
        }
        setShouldBeDetag(getTagBA());
    }

    private final void setBrandedContent(boolean z) {
        String str;
        String string;
        SpannableString spannableString;
        String string2;
        AbstractC63199ax.AbstractC63200a aVar = this.f174355a;
        if (aVar != null) {
            aVar.mo101680b(true);
        }
        if (m135846a() != null) {
            TuxTextView tuxTextView = (TuxTextView) m135846a();
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setVisibility(0);
            Context context = getContext();
            C89219l.m154716b(context, "");
            String string3 = context.getResources().getString(R.string.a37);
            C89219l.m154716b(string3, "");
            BrandedContentToolSchema a = C77759b.m135850a();
            if (a == null || (str = a.brandedContentPolicy) == null) {
                str = "https://www.tiktok.com/falcon/forest/nebula/content_tool?hide_nav_bar=1";
            }
            if (this.f174356b) {
                if (z) {
                    Context context2 = getContext();
                    C89219l.m154716b(context2, "");
                    string2 = context2.getResources().getString(R.string.a2r, string3);
                    C89219l.m154716b(string2, "");
                } else {
                    Context context3 = getContext();
                    C89219l.m154716b(context3, "");
                    string2 = context3.getResources().getString(R.string.qw, string3);
                    C89219l.m154716b(string2, "");
                }
                spannableString = new SpannableString(string2);
                int a2 = C89361p.m154888a((CharSequence) string2, string3, 0, false, 6);
                int length = string3.length() + a2;
                spannableString.setSpan(new StyleSpan(1), a2, length, 33);
                spannableString.setSpan(new C77752a(this, str), a2, length, 33);
            } else {
                Context context4 = getContext();
                C89219l.m154716b(context4, "");
                String string4 = context4.getResources().getString(R.string.a34);
                C89219l.m154716b(string4, "");
                if (z) {
                    Context context5 = getContext();
                    C89219l.m154716b(context5, "");
                    string = context5.getResources().getString(R.string.a2s, string3, string4);
                    C89219l.m154716b(string, "");
                } else {
                    Context context6 = getContext();
                    C89219l.m154716b(context6, "");
                    string = context6.getResources().getString(R.string.qx, string3, string4);
                    C89219l.m154716b(string, "");
                }
                spannableString = new SpannableString(string);
                int a3 = C89361p.m154888a((CharSequence) string, string3, 0, false, 6);
                int length2 = string3.length() + a3;
                int a4 = C89361p.m154888a((CharSequence) string, string4, 0, false, 6);
                int length3 = string4.length() + a4;
                spannableString.setSpan(new StyleSpan(1), a3, length2, 33);
                spannableString.setSpan(new StyleSpan(1), a4, length3, 33);
                spannableString.setSpan(new C77753b(this, str), a3, length2, 33);
                spannableString.setSpan(new C77754c(this, str), a4, length3, 33);
            }
            TuxTextView tuxTextView2 = (TuxTextView) m135846a();
            C89219l.m154716b(tuxTextView2, "");
            tuxTextView2.setMovementMethod(new LinkMovementMethod());
            TuxTextView tuxTextView3 = (TuxTextView) m135846a();
            C89219l.m154716b(tuxTextView3, "");
            tuxTextView3.setText(spannableString);
        }
    }

    private /* synthetic */ BCInPublishLayout(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private BCInPublishLayout(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(12300);
        this.f174357c = C77763a.m135856a();
        C1764a.m5927a(LayoutInflater.from(context), R.layout.lq, this, true);
        C77728a.f174309a = this;
        C77731c.f174315b = this;
        this.f174362h = "0";
        this.f174363i = "0";
        this.f174364j = "0";
        MethodCollector.m26664o(12300);
    }
}
