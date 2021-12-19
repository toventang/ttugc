package com.p2082ss.android.ugc.aweme.commercialize.profile;

import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.p1478a.C20714a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartAvatarImageView;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.profile.AdNewFakeUserProfileHeaderWidget */
public final class AdNewFakeUserProfileHeaderWidget extends AbsAdProfileWidget implements AbstractC33974au {

    /* renamed from: k */
    public static final C38375a f90678k = new C38375a((byte) 0);

    /* renamed from: j */
    final AbstractC89244h f90679j = C89250i.m154773a((AbstractC89171a) new C38382g(this));

    /* renamed from: l */
    private final AbstractC89244h f90680l = C89250i.m154773a((AbstractC89171a) new C38379d(this));

    /* renamed from: m */
    private final AbstractC89244h f90681m = C89250i.m154773a((AbstractC89171a) new C38381f(this));

    /* renamed from: n */
    private final AbstractC89244h f90682n = C89250i.m154773a((AbstractC89171a) new C38380e(this));

    static {
        Covode.recordClassIndex(45876);
    }

    /* renamed from: f */
    public final TextView mo66973f() {
        return (TextView) this.f90682n.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.AdNewFakeUserProfileHeaderWidget$a */
    public static final class C38375a {
        static {
            Covode.recordClassIndex(45877);
        }

        private C38375a() {
        }

        public /* synthetic */ C38375a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C20714a m77792a(User user) {
            UrlModel avatarLarger;
            if (user == null) {
                return null;
            }
            if (user.getAvatarMedium() != null) {
                avatarLarger = user.getAvatarMedium();
            } else if (user.getAvatarThumb() != null) {
                avatarLarger = user.getAvatarThumb();
            } else {
                if (user.getAvatarLarger() != null) {
                    avatarLarger = user.getAvatarLarger();
                }
                return null;
            }
            if (avatarLarger != null) {
                return new C20714a(avatarLarger.getUrlList());
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.AdNewFakeUserProfileHeaderWidget$d */
    static final class C38379d extends AbstractC89220m implements AbstractC89171a<SmartAvatarImageView> {

        /* renamed from: a */
        final /* synthetic */ AdNewFakeUserProfileHeaderWidget f90688a;

        static {
            Covode.recordClassIndex(45881);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38379d(AdNewFakeUserProfileHeaderWidget adNewFakeUserProfileHeaderWidget) {
            super(0);
            this.f90688a = adNewFakeUserProfileHeaderWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SmartAvatarImageView invoke() {
            return this.f90688a.mo66948a(R.id.d7j);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.AdNewFakeUserProfileHeaderWidget$e */
    static final class C38380e extends AbstractC89220m implements AbstractC89171a<TextView> {

        /* renamed from: a */
        final /* synthetic */ AdNewFakeUserProfileHeaderWidget f90689a;

        static {
            Covode.recordClassIndex(45882);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38380e(AdNewFakeUserProfileHeaderWidget adNewFakeUserProfileHeaderWidget) {
            super(0);
            this.f90689a = adNewFakeUserProfileHeaderWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextView invoke() {
            return this.f90689a.mo66948a(R.id.d7n);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.AdNewFakeUserProfileHeaderWidget$f */
    static final class C38381f extends AbstractC89220m implements AbstractC89171a<TextView> {

        /* renamed from: a */
        final /* synthetic */ AdNewFakeUserProfileHeaderWidget f90690a;

        static {
            Covode.recordClassIndex(45883);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38381f(AdNewFakeUserProfileHeaderWidget adNewFakeUserProfileHeaderWidget) {
            super(0);
            this.f90690a = adNewFakeUserProfileHeaderWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextView invoke() {
            return this.f90690a.mo66948a(R.id.d9e);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.AdNewFakeUserProfileHeaderWidget$g */
    static final class C38382g extends AbstractC89220m implements AbstractC89171a<LinearLayout> {

        /* renamed from: a */
        final /* synthetic */ AdNewFakeUserProfileHeaderWidget f90691a;

        static {
            Covode.recordClassIndex(45884);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38382g(AdNewFakeUserProfileHeaderWidget adNewFakeUserProfileHeaderWidget) {
            super(0);
            this.f90691a = adNewFakeUserProfileHeaderWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LinearLayout invoke() {
            return this.f90691a.mo66948a(R.id.ceh);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.AdNewFakeUserProfileHeaderWidget$b */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC38376b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ AdNewFakeUserProfileHeaderWidget f90683a;

        static {
            Covode.recordClassIndex(45878);
        }

        public final void onGlobalLayout() {
            ViewTreeObserver viewTreeObserver;
            TextView f = this.f90683a.mo66973f();
            if (!(f == null || (viewTreeObserver = f.getViewTreeObserver()) == null)) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
            AdNewFakeUserProfileHeaderWidget adNewFakeUserProfileHeaderWidget = this.f90683a;
            LinearLayout linearLayout = (LinearLayout) adNewFakeUserProfileHeaderWidget.f90679j.getValue();
            if (linearLayout != null) {
                linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC38377c(adNewFakeUserProfileHeaderWidget, linearLayout));
                TextView f2 = adNewFakeUserProfileHeaderWidget.mo66973f();
                if (f2 == null || f2.getLineCount() <= 3) {
                    linearLayout.setVisibility(8);
                } else {
                    linearLayout.setVisibility(0);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ViewTreeObserver$OnGlobalLayoutListenerC38376b(AdNewFakeUserProfileHeaderWidget adNewFakeUserProfileHeaderWidget) {
            this.f90683a = adNewFakeUserProfileHeaderWidget;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.AdNewFakeUserProfileHeaderWidget$c */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC38377c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ AdNewFakeUserProfileHeaderWidget f90684a;

        /* renamed from: b */
        final /* synthetic */ LinearLayout f90685b;

        static {
            Covode.recordClassIndex(45879);
        }

        public final void onGlobalLayout() {
            String desc;
            this.f90685b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            TextView f = this.f90684a.mo66973f();
            if (f != null) {
                String str = null;
                if (this.f90685b.getVisibility() == 0) {
                    int width = f.getWidth();
                    int width2 = this.f90685b.getWidth();
                    this.f90685b.setOnClickListener(new View$OnClickListenerC38378a(f, this));
                    TextPaint paint = f.getPaint();
                    int lineStart = f.getLayout().getLineStart(2);
                    int lineEnd = f.getLayout().getLineEnd(2);
                    while (((float) width) - paint.measureText(f.getText().subSequence(lineStart, lineEnd).toString()) < paint.measureText("...") + ((float) width2)) {
                        lineEnd--;
                    }
                    Aweme aweme = ((AbsAdProfileWidget) this.f90684a).f90607a;
                    if (!(aweme == null || (desc = aweme.getDesc()) == null)) {
                        Objects.requireNonNull(desc, "null cannot be cast to non-null type java.lang.String");
                        str = desc.substring(0, lineEnd);
                        C89219l.m154716b(str, "");
                    }
                    f.setText(C89219l.m154704a(str, (Object) "..."));
                    return;
                }
                this.f90685b.setOnClickListener(null);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.AdNewFakeUserProfileHeaderWidget$c$a */
        static final class View$OnClickListenerC38378a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ TextView f90686a;

            /* renamed from: b */
            final /* synthetic */ ViewTreeObserver$OnGlobalLayoutListenerC38377c f90687b;

            static {
                Covode.recordClassIndex(45880);
            }

            View$OnClickListenerC38378a(TextView textView, ViewTreeObserver$OnGlobalLayoutListenerC38377c cVar) {
                this.f90686a = textView;
                this.f90687b = cVar;
            }

            public final void onClick(View view) {
                String str;
                ClickAgent.onClick(view);
                this.f90686a.setGravity(17);
                TextView textView = this.f90686a;
                Aweme aweme = ((AbsAdProfileWidget) this.f90687b.f90684a).f90607a;
                if (aweme != null) {
                    str = aweme.getDesc();
                } else {
                    str = null;
                }
                textView.setText(str);
                C89219l.m154716b(view, "");
                view.setVisibility(8);
            }
        }

        ViewTreeObserver$OnGlobalLayoutListenerC38377c(AdNewFakeUserProfileHeaderWidget adNewFakeUserProfileHeaderWidget, LinearLayout linearLayout) {
            this.f90684a = adNewFakeUserProfileHeaderWidget;
            this.f90685b = linearLayout;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    /* renamed from: a */
    public final void mo66950a(C38426i iVar) {
        User user;
        String str;
        User author;
        User author2;
        ViewTreeObserver viewTreeObserver;
        String str2;
        User author3;
        C89219l.m154721d(iVar, "");
        super.mo66950a(iVar);
        TextView textView = (TextView) this.f90681m.getValue();
        String str3 = null;
        if (textView != null) {
            Aweme aweme = ((AbsAdProfileWidget) this).f90607a;
            if (aweme == null || (author3 = aweme.getAuthor()) == null) {
                str2 = null;
            } else {
                str2 = author3.getNickname();
            }
            textView.setText(str2);
        }
        Aweme aweme2 = ((AbsAdProfileWidget) this).f90607a;
        if (aweme2 != null) {
            user = aweme2.getAuthor();
        } else {
            user = null;
        }
        C20714a a = C38375a.m77792a(user);
        if (a != null) {
            C20766v a2 = C20761r.m39058a(a);
            a2.f49092E = (SmartAvatarImageView) this.f90680l.getValue();
            a2.mo34186c();
        }
        TextView f = mo66973f();
        if (!(f == null || (viewTreeObserver = f.getViewTreeObserver()) == null)) {
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC38376b(this));
        }
        Aweme aweme3 = ((AbsAdProfileWidget) this).f90607a;
        if (aweme3 == null || (author2 = aweme3.getAuthor()) == null) {
            str = null;
        } else {
            str = author2.getAdAuthorDesc();
        }
        if (!TextUtils.isEmpty(str)) {
            TextView f2 = mo66973f();
            if (f2 != null) {
                Aweme aweme4 = ((AbsAdProfileWidget) this).f90607a;
                if (!(aweme4 == null || (author = aweme4.getAuthor()) == null)) {
                    str3 = author.getAdAuthorDesc();
                }
                f2.setText(str3);
                return;
            }
            return;
        }
        TextView f3 = mo66973f();
        if (f3 != null) {
            Aweme aweme5 = ((AbsAdProfileWidget) this).f90607a;
            if (aweme5 != null) {
                str3 = aweme5.getDesc();
            }
            f3.setText(str3);
        }
    }
}
