package com.p2082ss.android.ugc.aweme.account.login.authorize;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
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
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.deviceregister.DeviceRegisterManager;
import com.p2082ss.android.ugc.aweme.account.login.twostep.C32180b;
import com.p2082ss.android.ugc.aweme.account.login.twostep.C32186e;
import com.p2082ss.android.ugc.aweme.account.login.twostep.C32258q;
import com.p2082ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80214ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.account.login.authorize.j */
public final class C31883j extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public final List<C32186e> f76182a;

    /* renamed from: b */
    public final AbstractC31889l f76183b;

    static {
        Covode.recordClassIndex(38627);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m66228a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f76182a.size() + 1;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.authorize.j$a */
    public final class C31884a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final View f76184a;

        /* renamed from: b */
        final TextView f76185b;

        /* renamed from: c */
        final View f76186c;

        /* renamed from: d */
        final /* synthetic */ C31883j f76187d;

        static {
            Covode.recordClassIndex(38628);
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.authorize.j$a$a */
        static final class View$OnClickListenerC31885a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C31884a f76188a;

            /* renamed from: b */
            final /* synthetic */ C32186e f76189b;

            static {
                Covode.recordClassIndex(38629);
            }

            View$OnClickListenerC31885a(C31884a aVar, C32186e eVar) {
                this.f76188a = aVar;
                this.f76189b = eVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                C32258q.m66624b("device_remove", this.f76188a.f76187d.f76183b.mo57811a());
                String a = this.f76188a.f76187d.f76183b.mo57811a();
                String str = "";
                C89219l.m154721d(a, str);
                C39162r.m79460a("authorized_logins_click", C32258q.m66614a().mo59983a("enter_from", a).f79943a);
                View view2 = this.f76188a.itemView;
                C89219l.m154716b(view2, str);
                C17197a.C17200a aVar = new C17197a.C17200a(view2.getContext());
                View view3 = this.f76188a.itemView;
                C89219l.m154716b(view3, str);
                Context context = view3.getContext();
                Object[] objArr = new Object[1];
                String device_name = this.f76189b.getDevice_name();
                if (device_name != null) {
                    str = device_name;
                }
                objArr[0] = str;
                aVar.f41071b = context.getString(R.string.f_g, objArr);
                aVar.mo27190a(R.string.dd, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {
                    /* class com.p2082ss.android.ugc.aweme.account.login.authorize.C31883j.C31884a.View$OnClickListenerC31885a.DialogInterface$OnClickListenerC318861 */

                    /* renamed from: a */
                    final /* synthetic */ View$OnClickListenerC31885a f76190a;

                    static {
                        Covode.recordClassIndex(38630);
                    }

                    {
                        this.f76190a = r1;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C32258q.m66625b("confirm", "device_remove", this.f76190a.f76188a.f76187d.f76183b.mo57811a());
                        if (this.f76190a.f76189b.getDevice_id() != null) {
                            this.f76190a.f76188a.f76187d.f76183b.mo57813b();
                            String valueOf = String.valueOf(this.f76190a.f76189b.getDevice_id().longValue());
                            C89219l.m154721d(valueOf, "");
                            TwoStepAuthApi.m66501a().removeAuthDevice(valueOf).mo5534a(new AbstractC1729g(this) {
                                /* class com.p2082ss.android.ugc.aweme.account.login.authorize.C31883j.C31884a.View$OnClickListenerC31885a.DialogInterface$OnClickListenerC318861.C318871 */

                                /* renamed from: a */
                                final /* synthetic */ DialogInterface$OnClickListenerC318861 f76191a;

                                static {
                                    Covode.recordClassIndex(38631);
                                }

                                {
                                    this.f76191a = r1;
                                }

                                @Override // p077b.AbstractC1729g
                                public final Object then(C1731i<C32180b> iVar) {
                                    Integer num;
                                    String str;
                                    this.f76191a.f76190a.f76188a.f76187d.f76183b.mo57815d();
                                    if (!C80214ai.m139043a(iVar)) {
                                        this.f76191a.f76190a.f76188a.f76187d.f76183b.mo57812a(null, "");
                                        C32258q.m66622a(this.f76191a.f76190a.f76188a.f76187d.f76183b.mo57811a(), false);
                                        return null;
                                    }
                                    C89219l.m154716b(iVar, "");
                                    C32180b d = iVar.mo5545d();
                                    if (!C89361p.m154872a("success", d.getMessage(), true) || d.getData() == null) {
                                        C32180b.C32181a data = d.getData();
                                        if (data != null) {
                                            num = data.getErrorCode();
                                        } else {
                                            num = null;
                                        }
                                        C32180b.C32181a data2 = d.getData();
                                        if (data2 != null) {
                                            str = data2.getErrorDescription();
                                        } else {
                                            str = null;
                                        }
                                        this.f76191a.f76190a.f76188a.f76187d.f76183b.mo57812a(num, str);
                                        C32258q.m66622a(this.f76191a.f76190a.f76188a.f76187d.f76183b.mo57811a(), false);
                                        return null;
                                    }
                                    this.f76191a.f76190a.f76188a.f76187d.f76182a.remove(this.f76191a.f76190a.f76189b);
                                    this.f76191a.f76190a.f76188a.f76187d.notifyItemRemoved(this.f76191a.f76190a.f76188a.getAdapterPosition());
                                    if (this.f76191a.f76190a.f76188a.f76187d.f76182a.isEmpty()) {
                                        this.f76191a.f76190a.f76188a.f76187d.f76183b.mo57814c();
                                    }
                                    C32258q.m66622a(this.f76191a.f76190a.f76188a.f76187d.f76183b.mo57811a(), true);
                                    return C89391z.f203057a;
                                }
                            }, C1731i.f5564c, null);
                        }
                    }
                }, false).mo27195b(R.string.g3c, (DialogInterface.OnClickListener) null, false).mo27193a().mo27185c();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31884a(C31883j jVar, View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f76187d = jVar;
            this.f76184a = view.findViewById(R.id.aiw);
            this.f76185b = (TextView) view.findViewById(R.id.ake);
            this.f76186c = view.findViewById(R.id.ehf);
        }
    }

    public C31883j(List<C32186e> list, AbstractC31889l lVar) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(lVar, "");
        this.f76182a = list;
        this.f76183b = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String str;
        C89219l.m154721d(viewHolder, "");
        if (viewHolder instanceof C31884a) {
            C31884a aVar = (C31884a) viewHolder;
            C32186e eVar = aVar.f76187d.f76182a.get(aVar.getAdapterPosition() - 1);
            TextView textView = aVar.f76185b;
            C89219l.m154716b(textView, "");
            String device_name = eVar.getDevice_name();
            if (device_name == null) {
                device_name = "";
            }
            textView.setText(device_name);
            String deviceId = DeviceRegisterManager.getDeviceId();
            Long device_id = eVar.getDevice_id();
            if (device_id != null) {
                str = String.valueOf(device_id.longValue());
            } else {
                str = null;
            }
            if (!TextUtils.equals(deviceId, str) || TextUtils.isEmpty(DeviceRegisterManager.getDeviceId())) {
                View view = aVar.f76186c;
                C89219l.m154716b(view, "");
                view.setVisibility(8);
            } else {
                View view2 = aVar.f76186c;
                C89219l.m154716b(view2, "");
                view2.setVisibility(0);
            }
            aVar.f76184a.setOnClickListener(new C31884a.View$OnClickListenerC31885a(aVar, eVar));
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m66228a(C31883j jVar, ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        boolean a;
        MethodCollector.m26663i(10657);
        C89219l.m154721d(viewGroup, "");
        if (i == 0) {
            View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.fq, viewGroup, false);
            C89219l.m154716b(a2, "");
            viewHolder = new C31888k(a2);
        } else {
            View a3 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.fr, viewGroup, false);
            C89219l.m154716b(a3, "");
            viewHolder = new C31884a(jVar, a3);
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
        MethodCollector.m26664o(10657);
        return viewHolder;
    }
}
