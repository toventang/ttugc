package com.p2082ss.android.ugc.aweme.account.login.rememberaccount;

import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.router.SmartRouter;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.account.login.C31975q;
import com.p2082ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartAvatarImageView;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2634f.C39110a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.rememberaccount.c */
public final class C32065c extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {

    /* renamed from: c */
    public static final C32069b f76535c = new C32069b((byte) 0);

    /* renamed from: a */
    public final List<BaseLoginMethod> f76536a;

    /* renamed from: b */
    public final AbstractC32077e f76537b;

    static {
        Covode.recordClassIndex(38822);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m66461a(this, viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.rememberaccount.c$b */
    public static final class C32069b {
        static {
            Covode.recordClassIndex(38826);
        }

        private C32069b() {
        }

        public /* synthetic */ C32069b(byte b) {
            this();
        }

        /* renamed from: a */
        public static String m66462a(long j) {
            Calendar instance = Calendar.getInstance();
            C89219l.m154716b(instance, "");
            long timeInMillis = instance.getTimeInMillis() - j;
            if (timeInMillis <= 0) {
                return "";
            }
            if (timeInMillis < 86400000) {
                return "0d";
            }
            if (timeInMillis < 604800000) {
                return new StringBuilder().append(timeInMillis / 86400000).append('d').toString();
            }
            return new StringBuilder().append(timeInMillis / 604800000).append('w').toString();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f76536a.size() + 1 + 1;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.rememberaccount.c$c */
    public final class C32070c extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final SmartAvatarImageView f76542a;

        /* renamed from: b */
        public final TextView f76543b;

        /* renamed from: c */
        public final TextView f76544c;

        /* renamed from: d */
        public final View f76545d;

        /* renamed from: e */
        public final View f76546e;

        /* renamed from: f */
        final /* synthetic */ C32065c f76547f;

        static {
            Covode.recordClassIndex(38827);
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.rememberaccount.c$c$b */
        static final class View$OnClickListenerC32075b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C32070c f76555a;

            /* renamed from: b */
            final /* synthetic */ BaseLoginMethod f76556b;

            static {
                Covode.recordClassIndex(38832);
            }

            View$OnClickListenerC32075b(C32070c cVar, BaseLoginMethod baseLoginMethod) {
                this.f76555a = cVar;
                this.f76556b = baseLoginMethod;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f76555a.f76547f.f76537b.mo58027a(this.f76556b, this.f76555a.getAdapterPosition());
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.rememberaccount.c$c$a */
        static final class View$OnClickListenerC32071a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C32070c f76548a;

            /* renamed from: b */
            final /* synthetic */ BaseLoginMethod f76549b;

            /* renamed from: c */
            final /* synthetic */ long f76550c;

            static {
                Covode.recordClassIndex(38828);
            }

            View$OnClickListenerC32071a(C32070c cVar, BaseLoginMethod baseLoginMethod, long j) {
                this.f76548a = cVar;
                this.f76549b = baseLoginMethod;
                this.f76550c = j;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                final Map<String, String> map = new C33744d().mo59983a("user_id", this.f76549b.getUid()).mo59983a("last_active", C32069b.m66462a(this.f76550c)).mo59983a("platform", C32052a.m66445a(this.f76549b)).mo59980a("user_cnt", this.f76548a.f76547f.f76536a.size()).f79943a;
                C39162r.m79460a("login_notify_click_edit", map);
                C39110a aVar = new C39110a(this.f76548a.f76546e.getContext());
                String string = this.f76548a.f76546e.getContext().getString(R.string.f_);
                C89219l.m154716b(string, "");
                aVar.mo67871a(new String[]{string}, new DialogInterface.OnClickListener(this) {
                    /* class com.p2082ss.android.ugc.aweme.account.login.rememberaccount.C32065c.C32070c.View$OnClickListenerC32071a.DialogInterface$OnClickListenerC320721 */

                    /* renamed from: a */
                    final /* synthetic */ View$OnClickListenerC32071a f76551a;

                    static {
                        Covode.recordClassIndex(38829);
                    }

                    {
                        this.f76551a = r1;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C39162r.m79460a("login_notify_remove_account", map);
                        C17197a.C17200a aVar = new C17197a.C17200a(this.f76551a.f76548a.f76546e.getContext());
                        aVar.mo27189a(R.string.fd);
                        aVar.f41067M = false;
                        aVar.mo27194b(R.string.fa).mo27195b(R.string.fb, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC320731.f76553a, false).mo27190a(R.string.fc, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {
                            /* class com.p2082ss.android.ugc.aweme.account.login.rememberaccount.C32065c.C32070c.View$OnClickListenerC32071a.DialogInterface$OnClickListenerC320721.DialogInterface$OnClickListenerC320742 */

                            /* renamed from: a */
                            final /* synthetic */ DialogInterface$OnClickListenerC320721 f76554a;

                            static {
                                Covode.recordClassIndex(38831);
                            }

                            {
                                this.f76554a = r1;
                            }

                            public final void onClick(DialogInterface dialogInterface, int i) {
                                if (this.f76554a.f76551a.f76548a.getAdapterPosition() >= 0) {
                                    this.f76554a.f76551a.f76548a.f76547f.f76536a.remove(this.f76554a.f76551a.f76549b);
                                    C31975q.m66346a(this.f76554a.f76551a.f76549b.getUid());
                                    this.f76554a.f76551a.f76548a.f76547f.notifyItemRemoved(this.f76554a.f76551a.f76548a.getAdapterPosition());
                                    C39162r.m79460a("login_notify_remove_account_confirm", map);
                                }
                            }
                        }, false).mo27193a().mo27185c();
                    }
                });
                aVar.f92306a.mo458b();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32070c(C32065c cVar, View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f76547f = cVar;
            this.f76546e = view;
            this.f76542a = (SmartAvatarImageView) view.findViewById(R.id.nz);
            this.f76543b = (TextView) view.findViewById(R.id.csk);
            this.f76544c = (TextView) view.findViewById(R.id.ei8);
            this.f76545d = view.findViewById(R.id.aiw);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        if (i == 0) {
            return C32076d.f76557a;
        }
        if (i == this.f76536a.size() + 1) {
            return C32076d.f76559c;
        }
        return C32076d.f76558b;
    }

    public C32065c(List<BaseLoginMethod> list, AbstractC32077e eVar) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(eVar, "");
        this.f76536a = list;
        this.f76537b = eVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.rememberaccount.c$a */
    public final class C32066a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final View f76538a;

        /* renamed from: b */
        final /* synthetic */ C32065c f76539b;

        static {
            Covode.recordClassIndex(38823);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32066a(C32065c cVar, View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f76539b = cVar;
            this.f76538a = view;
            View findViewById = view.findViewById(R.id.gl);
            C89219l.m154716b(findViewById, "");
            findViewById.setVisibility(0);
            view.findViewById(R.id.gl).setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.account.login.rememberaccount.C32065c.C32066a.View$OnClickListenerC320671 */

                /* renamed from: a */
                final /* synthetic */ C32066a f76540a;

                static {
                    Covode.recordClassIndex(38824);
                }

                {
                    this.f76540a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    this.f76540a.f76539b.f76537b.mo58026a();
                }
            });
            view.findViewById(R.id.a1f).setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.account.login.rememberaccount.C32065c.C32066a.View$OnClickListenerC320682 */

                /* renamed from: a */
                final /* synthetic */ C32066a f76541a;

                static {
                    Covode.recordClassIndex(38825);
                }

                {
                    this.f76541a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    SmartRouter.buildRoute(this.f76541a.f76538a.getContext(), "aweme://account_recover").withParam("feedback_id", "4678").withParam("from_type", "").withParam("group", "0").withParam("enter_from", "quick_login").withAnimation(R.anim.dq, R.anim.a1).open();
                }
            });
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x012a  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r21, int r22) {
        /*
        // Method dump skipped, instructions count: 456
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.account.login.rememberaccount.C32065c.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m66461a(C32065c cVar, ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        boolean a;
        MethodCollector.m26663i(10274);
        C89219l.m154721d(viewGroup, "");
        if (i == C32076d.f76557a) {
            View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.h5, viewGroup, false);
            C89219l.m154716b(a2, "");
            viewHolder = new C32078f(a2);
        } else if (i == C32076d.f76559c) {
            View a3 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.fo, viewGroup, false);
            C89219l.m154716b(a3, "");
            viewHolder = new C32066a(cVar, a3);
        } else {
            View a4 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.gl, viewGroup, false);
            C89219l.m154716b(a4, "");
            viewHolder = new C32070c(cVar, a4);
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(viewHolder.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(viewHolder.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = viewHolder.getClass().getName();
        MethodCollector.m26664o(10274);
        return viewHolder;
    }
}
