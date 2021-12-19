package com.p2082ss.android.ugc.aweme.setting.p3732ui.p3735c;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ActivityC0945e;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.profile.settings.C63876c;
import com.p2082ss.android.ugc.aweme.setting.p3716d.C68067b;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80542hp;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.c.a */
public final class View$OnClickListenerC68572a extends ConstraintLayout implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    /* renamed from: j */
    public static final C68573a f153423j = new C68573a((byte) 0);

    /* renamed from: g */
    public C23226a f153424g;

    /* renamed from: h */
    Integer f153425h;

    /* renamed from: i */
    public AbstractC68575b f153426i;

    /* renamed from: k */
    private Integer f153427k;

    /* renamed from: l */
    private TextView f153428l;

    /* renamed from: m */
    private TextView f153429m;

    /* renamed from: n */
    private TextView f153430n;

    /* renamed from: o */
    private RadioButton f153431o;

    /* renamed from: p */
    private RadioButton f153432p;

    /* renamed from: q */
    private RadioButton f153433q;

    /* renamed from: r */
    private View f153434r;

    /* renamed from: s */
    private View f153435s;

    /* renamed from: t */
    private View f153436t;

    /* renamed from: u */
    private View f153437u;

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.c.a$b */
    public interface AbstractC68575b {
        static {
            Covode.recordClassIndex(80828);
        }

        /* renamed from: a */
        void mo108946a(int i);
    }

    static {
        Covode.recordClassIndex(80825);
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.c.a$a */
    public static final class C68573a {
        static {
            Covode.recordClassIndex(80826);
        }

        private C68573a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.setting.ui.c.a$a$a */
        public static final class RunnableC68574a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ ActivityC0945e f153438a;

            /* renamed from: b */
            final /* synthetic */ C23226a f153439b;

            static {
                Covode.recordClassIndex(80827);
            }

            public RunnableC68574a(ActivityC0945e eVar, C23226a aVar) {
                this.f153438a = eVar;
                this.f153439b = aVar;
            }

            public final void run() {
                if (!this.f153438a.isFinishing()) {
                    this.f153438a.getSupportFragmentManager().mo3552a().mo3456a(this.f153439b, "AccountChangedSheet").mo3473c();
                }
            }
        }

        public /* synthetic */ C68573a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        double f = (double) (C34723i.m70933f(getContext()) - C34723i.m70927b());
        Double.isNaN(f);
        double c = (double) C34723i.m70929c();
        Double.isNaN(c);
        double d = (f * 0.9d) - c;
        if (d > 0.0d) {
            View view = this.f153437u;
            if (view == null) {
                C89219l.m154710a("contentView");
            }
            view.getLayoutParams().height = (int) d;
            requestLayout();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.c.a$c */
    static final class C68576c extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC68572a f153440a;

        /* renamed from: b */
        final /* synthetic */ String f153441b;

        static {
            Covode.recordClassIndex(80829);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68576c(View$OnClickListenerC68572a aVar, String str) {
            super(1);
            this.f153440a = aVar;
            this.f153441b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37417a(this.f153441b, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.setting.p3732ui.p3735c.View$OnClickListenerC68572a.C68576c.C685771 */

                /* renamed from: a */
                final /* synthetic */ C68576c f153442a;

                static {
                    Covode.recordClassIndex(80830);
                }

                {
                    this.f153442a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    Integer num;
                    C89219l.m154721d(aVar, "");
                    View$OnClickListenerC68572a aVar2 = this.f153442a.f153440a;
                    Integer num2 = aVar2.f153425h;
                    if (num2 != null && num2.intValue() == 0) {
                        C31575b.m65867i().switchProAccount(0, null, null, 0, new C68578d(aVar2));
                        C23226a aVar3 = aVar2.f153424g;
                        if (aVar3 != null) {
                            aVar3.dismiss();
                        }
                    } else {
                        Integer num3 = aVar2.f153425h;
                        int i = 2;
                        if (num3 == null || num3.intValue() != 3) {
                            Integer num4 = aVar2.f153425h;
                            if (num4 != null && num4.intValue() == 2) {
                                i = 1;
                            }
                        }
                        SmartRouter.buildRoute(aVar2.getContext(), C63876c.m115573a(i, "settings")).open();
                    }
                    AbstractC68575b bVar = aVar2.f153426i;
                    if (!(bVar == null || (num = aVar2.f153425h) == null)) {
                        bVar.mo108946a(num.intValue());
                    }
                    return C89391z.f203057a;
                }
            });
            bVar2.mo37418b(R.string.a8y, (AbstractC89172b<? super C23024a, C89391z>) null);
            bVar2.f54513b = true;
            return C89391z.f203057a;
        }
    }

    public final void setAccountType(int i) {
        if (this.f153427k == null) {
            this.f153427k = Integer.valueOf(i);
        }
        Integer num = this.f153425h;
        if (num == null || num.intValue() != i) {
            if (i == 2) {
                TextView textView = this.f153428l;
                if (textView == null) {
                    C89219l.m154710a("accountTypeTv");
                }
                textView.setText(R.string.epf);
                TextView textView2 = this.f153429m;
                if (textView2 == null) {
                    C89219l.m154710a("accountHintDetail");
                }
                textView2.setText(R.string.epe);
            } else if (i == 3) {
                TextView textView3 = this.f153428l;
                if (textView3 == null) {
                    C89219l.m154710a("accountTypeTv");
                }
                textView3.setText(R.string.ep0);
                TextView textView4 = this.f153429m;
                if (textView4 == null) {
                    C89219l.m154710a("accountHintDetail");
                }
                textView4.setText(R.string.eoz);
            }
            m120981b(i);
            this.f153425h = Integer.valueOf(i);
        }
    }

    public View$OnClickListenerC68572a(Context context) {
        super(context);
        C1764a.m5927a(LayoutInflater.from(context), R.layout.aye, this, true);
        findViewById(R.id.bu5).setOnClickListener(this);
        View findViewById = findViewById(R.id.dnb);
        C89219l.m154716b(findViewById, "");
        this.f153437u = findViewById;
        View findViewById2 = findViewById(R.id.erx);
        C89219l.m154716b(findViewById2, "");
        this.f153428l = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.erw);
        C89219l.m154716b(findViewById3, "");
        this.f153429m = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.xc);
        C89219l.m154716b(findViewById4, "");
        TextView textView = (TextView) findViewById4;
        this.f153430n = textView;
        if (textView == null) {
            C89219l.m154710a("btnConfirm");
        }
        textView.setOnClickListener(this);
        View findViewById5 = findViewById(R.id.agb);
        C89219l.m154716b(findViewById5, "");
        this.f153431o = (RadioButton) findViewById5;
        View findViewById6 = findViewById(R.id.zx);
        C89219l.m154716b(findViewById6, "");
        this.f153432p = (RadioButton) findViewById6;
        View findViewById7 = findViewById(R.id.d10);
        C89219l.m154716b(findViewById7, "");
        this.f153433q = (RadioButton) findViewById7;
        View findViewById8 = findViewById(R.id.a5t);
        C89219l.m154716b(findViewById8, "");
        this.f153434r = findViewById8;
        View findViewById9 = findViewById(R.id.a5q);
        C89219l.m154716b(findViewById9, "");
        this.f153435s = findViewById9;
        View findViewById10 = findViewById(R.id.a61);
        C89219l.m154716b(findViewById10, "");
        this.f153436t = findViewById10;
        View view = this.f153434r;
        if (view == null) {
            C89219l.m154710a("creatorLayout");
        }
        view.setOnClickListener(this);
        View view2 = this.f153435s;
        if (view2 == null) {
            C89219l.m154710a("businessLayout");
        }
        view2.setOnClickListener(this);
        View view3 = this.f153436t;
        if (view3 == null) {
            C89219l.m154710a("personalLayout");
        }
        view3.setOnClickListener(this);
        ((RadioButton) findViewById(R.id.agb)).setOnCheckedChangeListener(this);
        ((RadioButton) findViewById(R.id.zx)).setOnCheckedChangeListener(this);
        ((RadioButton) findViewById(R.id.d10)).setOnCheckedChangeListener(this);
        Keva repo = Keva.getRepo("keva_repo_qa");
        StringBuilder sb = new StringBuilder("keva_key_red_dot");
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        repo.storeBoolean(sb.append(g.getCurUserId()).toString(), false);
        C80542hp.C80543a.m139628k();
    }

    /* renamed from: b */
    private final void m120981b(int i) {
        Integer num = this.f153425h;
        if (num == null || i != num.intValue()) {
            this.f153425h = Integer.valueOf(i);
            if (i == 0) {
                RadioButton radioButton = this.f153431o;
                if (radioButton == null) {
                    C89219l.m154710a("creatorAccountRadioButton");
                }
                radioButton.setChecked(false);
                RadioButton radioButton2 = this.f153432p;
                if (radioButton2 == null) {
                    C89219l.m154710a("businessAccountRadioButton");
                }
                radioButton2.setChecked(false);
                RadioButton radioButton3 = this.f153433q;
                if (radioButton3 == null) {
                    C89219l.m154710a("personalAccountRadioButton");
                }
                radioButton3.setChecked(true);
                Resources resources = getResources();
                if (resources != null) {
                    Integer num2 = this.f153427k;
                    if (num2 != null && num2.intValue() == i) {
                        TextView textView = this.f153430n;
                        if (textView == null) {
                            C89219l.m154710a("btnConfirm");
                        }
                        textView.setText(resources.getString(R.string.ep9));
                        return;
                    }
                    TextView textView2 = this.f153430n;
                    if (textView2 == null) {
                        C89219l.m154710a("btnConfirm");
                    }
                    textView2.setText(resources.getString(R.string.epd));
                }
            } else if (i == 2) {
                RadioButton radioButton4 = this.f153431o;
                if (radioButton4 == null) {
                    C89219l.m154710a("creatorAccountRadioButton");
                }
                radioButton4.setChecked(true);
                RadioButton radioButton5 = this.f153432p;
                if (radioButton5 == null) {
                    C89219l.m154710a("businessAccountRadioButton");
                }
                radioButton5.setChecked(false);
                RadioButton radioButton6 = this.f153433q;
                if (radioButton6 == null) {
                    C89219l.m154710a("personalAccountRadioButton");
                }
                radioButton6.setChecked(false);
                Resources resources2 = getResources();
                if (resources2 != null) {
                    Integer num3 = this.f153427k;
                    if (num3 != null && num3.intValue() == i) {
                        TextView textView3 = this.f153430n;
                        if (textView3 == null) {
                            C89219l.m154710a("btnConfirm");
                        }
                        textView3.setText(resources2.getString(R.string.ep9));
                        return;
                    }
                    TextView textView4 = this.f153430n;
                    if (textView4 == null) {
                        C89219l.m154710a("btnConfirm");
                    }
                    textView4.setText(resources2.getString(R.string.epc));
                }
            } else if (i == 3) {
                RadioButton radioButton7 = this.f153431o;
                if (radioButton7 == null) {
                    C89219l.m154710a("creatorAccountRadioButton");
                }
                radioButton7.setChecked(false);
                RadioButton radioButton8 = this.f153432p;
                if (radioButton8 == null) {
                    C89219l.m154710a("businessAccountRadioButton");
                }
                radioButton8.setChecked(true);
                RadioButton radioButton9 = this.f153433q;
                if (radioButton9 == null) {
                    C89219l.m154710a("personalAccountRadioButton");
                }
                radioButton9.setChecked(false);
                Resources resources3 = getResources();
                if (resources3 != null) {
                    Integer num4 = this.f153427k;
                    if (num4 != null && num4.intValue() == i) {
                        TextView textView5 = this.f153430n;
                        if (textView5 == null) {
                            C89219l.m154710a("btnConfirm");
                        }
                        textView5.setText(resources3.getString(R.string.ep9));
                        return;
                    }
                    TextView textView6 = this.f153430n;
                    if (textView6 == null) {
                        C89219l.m154710a("btnConfirm");
                    }
                    textView6.setText(resources3.getString(R.string.epb));
                }
            }
        }
    }

    public final void onClick(View view) {
        String string;
        String string2;
        String string3;
        ClickAgent.onClick(view);
        if (view != null) {
            int id = view.getId();
            if (id == R.id.bu5) {
                C23226a aVar = this.f153424g;
                if (aVar != null) {
                    aVar.dismiss();
                }
            } else if (id == R.id.erx) {
            } else {
                if (id == R.id.a5t) {
                    m120981b(2);
                } else if (id == R.id.a5q) {
                    m120981b(3);
                } else if (id == R.id.a61) {
                    m120981b(0);
                } else if (id != R.id.xc) {
                } else {
                    if (C89219l.m154714a(this.f153427k, this.f153425h)) {
                        C23226a aVar2 = this.f153424g;
                        if (aVar2 != null) {
                            aVar2.dismiss();
                            return;
                        }
                        return;
                    }
                    Integer num = this.f153425h;
                    if (num != null) {
                        if (num.intValue() == 2) {
                            string = getResources().getString(R.string.epc);
                            C89219l.m154716b(string, "");
                            string2 = getResources().getString(R.string.a1w);
                            C89219l.m154716b(string2, "");
                            string3 = getResources().getString(R.string.g91);
                            C89219l.m154716b(string3, "");
                        } else if (num.intValue() == 3) {
                            string = getResources().getString(R.string.epb);
                            C89219l.m154716b(string, "");
                            string2 = getResources().getString(R.string.a7p);
                            C89219l.m154716b(string2, "");
                            string3 = getResources().getString(R.string.g91);
                            C89219l.m154716b(string3, "");
                        }
                        Context context = getContext();
                        C89219l.m154716b(context, "");
                        C23023b a = C23028c.m43435a(new C23023b(context).mo37411b(string).mo37413d(string2), new C68576c(this, string3));
                        a.f54502a = false;
                        ((C23023b) a.mo37482a(false)).mo37405a().mo37396b().show();
                    }
                    string = getResources().getString(R.string.epd);
                    C89219l.m154716b(string, "");
                    string2 = getResources().getString(R.string.b6j);
                    C89219l.m154716b(string2, "");
                    string3 = getResources().getString(R.string.g94);
                    C89219l.m154716b(string3, "");
                    Context context2 = getContext();
                    C89219l.m154716b(context2, "");
                    C23023b a2 = C23028c.m43435a(new C23023b(context2).mo37411b(string).mo37413d(string2), new C68576c(this, string3));
                    a2.f54502a = false;
                    ((C23023b) a2.mo37482a(false)).mo37405a().mo37396b().show();
                }
            }
        }
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z && compoundButton != null) {
            int id = compoundButton.getId();
            if (id == R.id.agb) {
                m120981b(2);
            } else if (id == R.id.zx) {
                m120981b(3);
            } else if (id == R.id.d10) {
                m120981b(0);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.c.a$d */
    static final class C68578d implements IAccountService.AbstractC31277g {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC68572a f153443a;

        static {
            Covode.recordClassIndex(80831);
        }

        C68578d(View$OnClickListenerC68572a aVar) {
            this.f153443a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
        public final void onResult(int i, int i2, Object obj) {
            if (i == 14 && i2 == 1) {
                C31575b.m65865g().queryUser();
                new C79459a(this.f153443a.getContext()).mo123050a(R.string.g9c).mo123053a();
                AbstractC81915c.m141874a(new C68067b());
                return;
            }
            new C79459a(this.f153443a.getContext()).mo123050a(R.string.dcr).mo123053a();
        }
    }
}
