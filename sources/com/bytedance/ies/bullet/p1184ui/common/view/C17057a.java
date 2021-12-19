package com.bytedance.ies.bullet.p1184ui.common.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.p032a.C0637f;
import androidx.core.graphics.drawable.C0705a;
import androidx.p063m.p064a.p065a.C1261i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1184ui.common.AbstractC17051k;
import com.bytedance.ies.bullet.service.p1172f.p1173a.C16721b;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.C16746t;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.EnumC16733k;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.ui.common.view.a */
public final class C17057a implements AbstractC17051k.AbstractC17053b {

    /* renamed from: e */
    public static final C17058a f40601e = new C17058a((byte) 0);

    /* renamed from: a */
    public AbstractC17051k.AbstractC17052a f40602a;

    /* renamed from: b */
    public boolean f40603b;

    /* renamed from: c */
    public Context f40604c;

    /* renamed from: d */
    public AbstractC17059b f40605d;

    /* renamed from: f */
    private C16721b f40606f;

    /* renamed from: com.bytedance.ies.bullet.ui.common.view.a$b */
    public interface AbstractC17059b {
        static {
            Covode.recordClassIndex(19509);
        }
    }

    static {
        Covode.recordClassIndex(19507);
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.view.a$a */
    public static final class C17058a {
        static {
            Covode.recordClassIndex(19508);
        }

        private C17058a() {
        }

        public /* synthetic */ C17058a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.view.a$c */
    static final class View$OnClickListenerC17060c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C17057a f40607a;

        /* renamed from: b */
        final /* synthetic */ C16721b f40608b;

        static {
            Covode.recordClassIndex(19510);
        }

        View$OnClickListenerC17060c(C17057a aVar, C16721b bVar) {
            this.f40607a = aVar;
            this.f40608b = bVar;
        }

        public final void onClick(View view) {
            if (this.f40607a.f40605d != null) {
                C89219l.m154709a((Object) view, "");
            }
        }
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.view.a$d */
    static final class View$OnClickListenerC17061d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C17057a f40609a;

        static {
            Covode.recordClassIndex(19511);
        }

        View$OnClickListenerC17061d(C17057a aVar) {
            this.f40609a = aVar;
        }

        public final void onClick(View view) {
            if (this.f40609a.f40605d != null) {
                C89219l.m154709a((Object) view, "");
            }
        }
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.view.a$e */
    static final class View$OnClickListenerC17062e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C17057a f40610a;

        static {
            Covode.recordClassIndex(19512);
        }

        View$OnClickListenerC17062e(C17057a aVar) {
            this.f40610a = aVar;
        }

        public final void onClick(View view) {
            if (this.f40610a.f40605d != null) {
                C89219l.m154709a((Object) view, "");
            }
        }
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17051k.AbstractC17053b
    /* renamed from: a */
    public final void mo26928a(View.OnClickListener onClickListener) {
        C89219l.m154719c(onClickListener, "");
        AbstractC17051k.AbstractC17052a aVar = this.f40602a;
        if (aVar == null) {
            C89219l.m154710a("bulletTitleBar");
        }
        ImageView backView = aVar.getBackView();
        if (backView != null) {
            backView.setOnClickListener(onClickListener);
        }
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17051k.AbstractC17053b
    /* renamed from: b */
    public final void mo26930b(View.OnClickListener onClickListener) {
        C89219l.m154719c(onClickListener, "");
        AbstractC17051k.AbstractC17052a aVar = this.f40602a;
        if (aVar == null) {
            C89219l.m154710a("bulletTitleBar");
        }
        ImageView closeAllView = aVar.getCloseAllView();
        if (closeAllView != null) {
            closeAllView.setOnClickListener(onClickListener);
        }
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17051k.AbstractC17053b
    /* renamed from: a */
    public final void mo26929a(CharSequence charSequence) {
        C89219l.m154719c(charSequence, "");
        AbstractC17051k.AbstractC17052a aVar = this.f40602a;
        if (aVar == null) {
            C89219l.m154710a("bulletTitleBar");
        }
        aVar.setDefaultTitle(charSequence);
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17051k.AbstractC17053b
    /* renamed from: a */
    public final View mo26927a(Context context, Uri uri, C16721b bVar) {
        boolean z;
        C1261i iVar;
        boolean z2;
        C89219l.m154719c(context, "");
        C89219l.m154719c(uri, "");
        if (this.f40603b) {
            AbstractC17051k.AbstractC17052a aVar = this.f40602a;
            if (aVar == null) {
                C89219l.m154710a("bulletTitleBar");
            }
            return aVar.getTitleBarRoot();
        }
        this.f40603b = true;
        this.f40606f = bVar;
        this.f40604c = context;
        this.f40602a = new C17065d(context);
        if (bVar != null) {
            C16746t b = bVar.f39928d.mo26550b();
            Drawable drawable = null;
            if (b != null) {
                if (b.f39989a != -2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    b = null;
                }
                if (b != null) {
                    AbstractC17051k.AbstractC17052a aVar2 = this.f40602a;
                    if (aVar2 == null) {
                        C89219l.m154710a("bulletTitleBar");
                    }
                    aVar2.setTitleBarBackgroundColor(b.f39989a);
                }
            }
            AbstractC17051k.AbstractC17052a aVar3 = this.f40602a;
            if (aVar3 == null) {
                C89219l.m154710a("bulletTitleBar");
            }
            TextView titleView = aVar3.getTitleView();
            if (titleView != null) {
                String b2 = bVar.f39931g.mo26550b();
                if (b2 == null) {
                    b2 = "";
                }
                titleView.setText(b2);
            }
            C16746t b3 = bVar.f39932h.mo26550b();
            if (b3 != null) {
                if (b3.f39989a != -2) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    b3 = null;
                }
                if (b3 != null) {
                    AbstractC17051k.AbstractC17052a aVar4 = this.f40602a;
                    if (aVar4 == null) {
                        C89219l.m154710a("bulletTitleBar");
                    }
                    TextView titleView2 = aVar4.getTitleView();
                    if (titleView2 != null) {
                        titleView2.setTextColor(b3.f39989a);
                    }
                    AbstractC17051k.AbstractC17052a aVar5 = this.f40602a;
                    if (aVar5 == null) {
                        C89219l.m154710a("bulletTitleBar");
                    }
                    ImageView backView = aVar5.getBackView();
                    if (backView != null) {
                        if (Build.VERSION.SDK_INT >= 24) {
                            try {
                                Context context2 = this.f40604c;
                                if (context2 == null) {
                                    C89219l.m154710a("context");
                                }
                                Resources resources = context2.getResources();
                                Context context3 = this.f40604c;
                                if (context3 == null) {
                                    C89219l.m154710a("context");
                                }
                                C1261i a = C1261i.m4015a(resources, R.drawable.ajd, context3.getTheme());
                                if (a != null) {
                                    a.setTint(b3.f39989a);
                                    iVar = a;
                                } else {
                                    iVar = null;
                                }
                            } catch (Resources.NotFoundException unused) {
                                Context context4 = this.f40604c;
                                if (context4 == null) {
                                    C89219l.m154710a("context");
                                }
                                Resources resources2 = context4.getResources();
                                Context context5 = this.f40604c;
                                if (context5 == null) {
                                    C89219l.m154710a("context");
                                }
                                Drawable a2 = C0637f.m2348a(resources2, 2131232462, context5.getTheme());
                                if (a2 != null) {
                                    C0705a.m2494a(a2, b3.f39989a);
                                    iVar = a2;
                                }
                            }
                        } else {
                            Context context6 = this.f40604c;
                            if (context6 == null) {
                                C89219l.m154710a("context");
                            }
                            Resources resources3 = context6.getResources();
                            Context context7 = this.f40604c;
                            if (context7 == null) {
                                C89219l.m154710a("context");
                            }
                            Drawable a3 = C0637f.m2348a(resources3, 2131232462, context7.getTheme());
                            if (a3 != null) {
                                C0705a.m2494a(a3, b3.f39989a);
                                iVar = a3;
                            }
                            backView.setImageDrawable(drawable);
                        }
                        drawable = iVar;
                        backView.setImageDrawable(drawable);
                    }
                }
            }
            if (C89219l.m154714a((Object) bVar.f39943s.mo26550b(), (Object) true)) {
                AbstractC17051k.AbstractC17052a aVar6 = this.f40602a;
                if (aVar6 == null) {
                    C89219l.m154710a("bulletTitleBar");
                }
                ImageView closeAllView = aVar6.getCloseAllView();
                if (closeAllView != null) {
                    closeAllView.setVisibility(0);
                }
            }
            C89219l.m154719c(bVar, "");
            EnumC16733k b4 = bVar.f39933i.mo26550b();
            int i = 8;
            if (b4 != null) {
                int i2 = C17063b.f40611a[b4.ordinal()];
                if (i2 == 1) {
                    AbstractC17051k.AbstractC17052a aVar7 = this.f40602a;
                    if (aVar7 == null) {
                        C89219l.m154710a("bulletTitleBar");
                    }
                    ImageView shareView = aVar7.getShareView();
                    if (shareView != null) {
                        shareView.setVisibility(8);
                    }
                    AbstractC17051k.AbstractC17052a aVar8 = this.f40602a;
                    if (aVar8 == null) {
                        C89219l.m154710a("bulletTitleBar");
                    }
                    ImageView reportView = aVar8.getReportView();
                    if (reportView != null) {
                        reportView.setVisibility(8);
                    }
                } else if (i2 == 2) {
                    AbstractC17051k.AbstractC17052a aVar9 = this.f40602a;
                    if (aVar9 == null) {
                        C89219l.m154710a("bulletTitleBar");
                    }
                    ImageView shareView2 = aVar9.getShareView();
                    if (shareView2 != null) {
                        shareView2.setVisibility(8);
                    }
                    AbstractC17051k.AbstractC17052a aVar10 = this.f40602a;
                    if (aVar10 == null) {
                        C89219l.m154710a("bulletTitleBar");
                    }
                    ImageView reportView2 = aVar10.getReportView();
                    if (reportView2 != null) {
                        reportView2.setVisibility(0);
                    }
                    AbstractC17051k.AbstractC17052a aVar11 = this.f40602a;
                    if (aVar11 == null) {
                        C89219l.m154710a("bulletTitleBar");
                    }
                    ImageView reportView3 = aVar11.getReportView();
                    if (reportView3 != null) {
                        reportView3.setOnClickListener(new View$OnClickListenerC17061d(this));
                    }
                } else if (i2 == 3) {
                    AbstractC17051k.AbstractC17052a aVar12 = this.f40602a;
                    if (aVar12 == null) {
                        C89219l.m154710a("bulletTitleBar");
                    }
                    ImageView reportView4 = aVar12.getReportView();
                    if (reportView4 != null) {
                        reportView4.setVisibility(8);
                    }
                    AbstractC17051k.AbstractC17052a aVar13 = this.f40602a;
                    if (aVar13 == null) {
                        C89219l.m154710a("bulletTitleBar");
                    }
                    ImageView shareView3 = aVar13.getShareView();
                    if (shareView3 != null) {
                        shareView3.setVisibility(0);
                    }
                    AbstractC17051k.AbstractC17052a aVar14 = this.f40602a;
                    if (aVar14 == null) {
                        C89219l.m154710a("bulletTitleBar");
                    }
                    ImageView shareView4 = aVar14.getShareView();
                    if (shareView4 != null) {
                        shareView4.setOnClickListener(new View$OnClickListenerC17062e(this));
                    }
                }
            }
            AbstractC17051k.AbstractC17052a aVar15 = this.f40602a;
            if (aVar15 == null) {
                C89219l.m154710a("bulletTitleBar");
            }
            ImageView moreButtonView = aVar15.getMoreButtonView();
            if (moreButtonView != null) {
                if (C89219l.m154714a(bVar.f39934j.mo26550b(), (Object) true)) {
                    i = 0;
                }
                moreButtonView.setVisibility(i);
                moreButtonView.setOnClickListener(new View$OnClickListenerC17060c(this, bVar));
            }
            Integer num = (Integer) bVar.f39946v.mo26550b();
            if (num != null && num.intValue() == 1) {
                AbstractC17051k.AbstractC17052a aVar16 = this.f40602a;
                if (aVar16 == null) {
                    C89219l.m154710a("bulletTitleBar");
                }
                aVar16.setTitleBarBackgroundColor(0);
                AbstractC17051k.AbstractC17052a aVar17 = this.f40602a;
                if (aVar17 == null) {
                    C89219l.m154710a("bulletTitleBar");
                }
                TextView titleView3 = aVar17.getTitleView();
                if (titleView3 != null) {
                    titleView3.setVisibility(0);
                }
            }
        }
        AbstractC17051k.AbstractC17052a aVar18 = this.f40602a;
        if (aVar18 == null) {
            C89219l.m154710a("bulletTitleBar");
        }
        return aVar18.getTitleBarRoot();
    }
}
