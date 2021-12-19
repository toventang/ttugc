package com.p2082ss.android.ugc.aweme.account.login.recover;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.p1194ui.widget.AutoRTLImageView;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.account.login.EnumC32330v;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.recover.g */
public final class C32038g extends RecyclerView.AbstractC1350a<C32042d> {

    /* renamed from: c */
    public static final C32039a f76476c = new C32039a((byte) 0);

    /* renamed from: a */
    public AbstractC32040b f76477a;

    /* renamed from: b */
    public final List<C32041c> f76478b;

    /* renamed from: d */
    private final EnumC32330v[] f76479d = EnumC32330v.values();

    /* renamed from: e */
    private final Context f76480e;

    /* renamed from: f */
    private final String f76481f;

    /* renamed from: g */
    private final String f76482g;

    /* renamed from: h */
    private final Boolean f76483h;

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.g$b */
    public interface AbstractC32040b {
        static {
            Covode.recordClassIndex(38795);
        }

        /* renamed from: a */
        void mo57983a(int i, EnumC32033e eVar);
    }

    static {
        Covode.recordClassIndex(38793);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C32042d onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m66436a(this, viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.g$a */
    public static final class C32039a {
        static {
            Covode.recordClassIndex(38794);
        }

        private C32039a() {
        }

        public /* synthetic */ C32039a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.g$c */
    public static final class C32041c implements Serializable {

        /* renamed from: a */
        private String f76484a;

        /* renamed from: b */
        private int f76485b;

        /* renamed from: c */
        private String f76486c;

        /* renamed from: d */
        private EnumC32033e f76487d;

        static {
            Covode.recordClassIndex(38796);
        }

        public final EnumC32033e getAuthType() {
            return this.f76487d;
        }

        public final String getMethodInfo() {
            return this.f76486c;
        }

        public final String getMethodName() {
            return this.f76484a;
        }

        public final int getMethodType() {
            return this.f76485b;
        }

        public final void setAuthType(EnumC32033e eVar) {
            this.f76487d = eVar;
        }

        public final void setMethodInfo(String str) {
            this.f76486c = str;
        }

        public final void setMethodName(String str) {
            this.f76484a = str;
        }

        public final void setMethodType(int i) {
            this.f76485b = i;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f76478b.size() + 2;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.g$e */
    static final class View$OnClickListenerC32043e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32038g f76496a;

        /* renamed from: b */
        final /* synthetic */ int f76497b;

        static {
            Covode.recordClassIndex(38798);
        }

        View$OnClickListenerC32043e(C32038g gVar, int i) {
            this.f76496a = gVar;
            this.f76497b = i;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f76497b > 1) {
                AbstractC32040b bVar = this.f76496a.f76477a;
                if (bVar == null) {
                    C89219l.m154710a("onItemClick");
                }
                bVar.mo57983a(this.f76496a.f76478b.get(this.f76497b - 2).getMethodType(), this.f76496a.f76478b.get(this.f76497b - 2).getAuthType());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.g$d */
    public static final class C32042d extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final TuxTextView f76488a;

        /* renamed from: b */
        public final TuxTextView f76489b;

        /* renamed from: c */
        public final AvatarImageView f76490c;

        /* renamed from: d */
        public final RelativeLayout f76491d;

        /* renamed from: e */
        public final TuxTextView f76492e;

        /* renamed from: f */
        public final TuxTextView f76493f;

        /* renamed from: g */
        public final RemoteImageView f76494g;

        /* renamed from: h */
        public final AutoRTLImageView f76495h;

        static {
            Covode.recordClassIndex(38797);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32042d(View view) {
            super(view);
            C89219l.m154721d(view, "");
            View findViewById = view.findViewById(R.id.esn);
            C89219l.m154716b(findViewById, "");
            this.f76488a = (TuxTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.f6x);
            C89219l.m154716b(findViewById2, "");
            this.f76489b = (TuxTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.bix);
            C89219l.m154716b(findViewById3, "");
            this.f76490c = (AvatarImageView) findViewById3;
            View findViewById4 = view.findViewById(R.id.dlg);
            C89219l.m154716b(findViewById4, "");
            this.f76491d = (RelativeLayout) findViewById4;
            View findViewById5 = view.findViewById(R.id.ezi);
            C89219l.m154716b(findViewById5, "");
            this.f76492e = (TuxTextView) findViewById5;
            View findViewById6 = view.findViewById(R.id.ezh);
            C89219l.m154716b(findViewById6, "");
            this.f76493f = (TuxTextView) findViewById6;
            View findViewById7 = view.findViewById(R.id.bjw);
            C89219l.m154716b(findViewById7, "");
            this.f76494g = (RemoteImageView) findViewById7;
            View findViewById8 = view.findViewById(R.id.biw);
            C89219l.m154716b(findViewById8, "");
            this.f76495h = (AutoRTLImageView) findViewById8;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C32042d dVar, int i) {
        C32042d dVar2 = dVar;
        C89219l.m154721d(dVar2, "");
        if (i == 0) {
            dVar2.f76488a.setVisibility(8);
            dVar2.f76489b.setVisibility(8);
            dVar2.f76491d.setVisibility(8);
            dVar2.f76490c.setVisibility(0);
            if (!TextUtils.isEmpty(this.f76482g)) {
                C34577e.m70608b(dVar2.f76490c, this.f76482g, -1, -1);
            }
        } else if (i != 1) {
            int i2 = i - 2;
            if (i2 < this.f76478b.size() && i2 >= 0) {
                C32041c cVar = this.f76478b.get(i2);
                if (cVar != null) {
                    dVar2.f76488a.setVisibility(8);
                    dVar2.f76489b.setVisibility(8);
                    dVar2.f76491d.setVisibility(0);
                    dVar2.f76490c.setVisibility(8);
                    dVar2.f76495h.setVisibility(0);
                    int methodType = cVar.getMethodType();
                    if (methodType == 1) {
                        C34577e.m70591a(dVar2.f76494g, 2131231096);
                        dVar2.f76493f.setText(cVar.getMethodInfo());
                        dVar2.f76492e.setText(cVar.getMethodName());
                    } else if (methodType == 2) {
                        C34577e.m70591a(dVar2.f76494g, 2131231095);
                        dVar2.f76493f.setText(cVar.getMethodInfo());
                        dVar2.f76492e.setText(cVar.getMethodName());
                    } else if (methodType == 3) {
                        dVar2.f76495h.setVisibility(8);
                        EnumC32033e authType = cVar.getAuthType();
                        if (authType != null) {
                            switch (C32044h.f76498a[authType.ordinal()]) {
                                case 1:
                                    C34577e.m70591a(dVar2.f76494g, 2131231061);
                                    break;
                                case 2:
                                    C34577e.m70591a(dVar2.f76494g, 2131231066);
                                    break;
                                case 3:
                                    C34577e.m70591a(dVar2.f76494g, 2131231062);
                                    break;
                                case 4:
                                    C34577e.m70591a(dVar2.f76494g, 2131231065);
                                    break;
                                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                                    C34577e.m70591a(dVar2.f76494g, 2131231064);
                                    break;
                                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                                    C34577e.m70591a(dVar2.f76494g, 2131231063);
                                    break;
                                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                                    C34577e.m70591a(dVar2.f76494g, 2131231067);
                                    break;
                                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                                    dVar2.f76495h.setVisibility(8);
                                    C34577e.m70591a(dVar2.f76494g, 2131231142);
                                    break;
                            }
                        }
                        dVar2.f76493f.setText(cVar.getMethodInfo());
                        dVar2.f76492e.setText(cVar.getMethodName());
                        EnumC32330v[] vVarArr = this.f76479d;
                        int length = vVarArr.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 < length) {
                                String vVar = vVarArr[i3].toString();
                                Objects.requireNonNull(vVar, "null cannot be cast to non-null type java.lang.String");
                                String lowerCase = vVar.toLowerCase();
                                C89219l.m154716b(lowerCase, "");
                                String valueOf = String.valueOf(cVar.getAuthType());
                                Objects.requireNonNull(valueOf, "null cannot be cast to non-null type java.lang.String");
                                String lowerCase2 = valueOf.toLowerCase();
                                C89219l.m154716b(lowerCase2, "");
                                if (C89219l.m154714a((Object) lowerCase, (Object) lowerCase2)) {
                                    dVar2.f76495h.setVisibility(0);
                                } else {
                                    i3++;
                                }
                            }
                        }
                    }
                }
            } else {
                return;
            }
        } else {
            dVar2.f76491d.setVisibility(8);
            dVar2.f76490c.setVisibility(8);
            dVar2.f76488a.setVisibility(0);
            dVar2.f76489b.setVisibility(0);
            if (!TextUtils.isEmpty(this.f76481f)) {
                dVar2.f76488a.setText(this.f76481f);
            }
        }
        dVar2.itemView.setOnClickListener(new View$OnClickListenerC32043e(this, i));
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m66436a(C32038g gVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(10211);
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(gVar.f76480e), R.layout.hy, viewGroup, false);
        C89219l.m154716b(a2, "");
        C32042d dVar = new C32042d(a2);
        try {
            if (dVar.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(dVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) dVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(dVar.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = dVar.getClass().getName();
        MethodCollector.m26664o(10211);
        return dVar;
    }

    public C32038g(Context context, List<C32041c> list, String str, String str2, Boolean bool) {
        C89219l.m154721d(list, "");
        this.f76480e = context;
        this.f76478b = list;
        this.f76481f = str;
        this.f76482g = str2;
        this.f76483h = bool;
    }
}
